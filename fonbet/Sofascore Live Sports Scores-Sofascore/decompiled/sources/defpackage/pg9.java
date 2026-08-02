package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pg9 implements Closeable {
    public final lof a;
    public final ng9 b;
    public final ag9 c;

    public pg9(lof lofVar) {
        this.a = lofVar;
        ng9 ng9Var = new ng9(lofVar);
        this.b = ng9Var;
        this.c = new ag9(ng9Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(nod nodVar) {
        boolean z;
        ch9 ch9Var;
        up5 up5Var;
        boolean z2;
        qwd qwdVar;
        try {
            this.a.o(9L);
            int c = sg9.c(this.a);
            if (c < 0 || c > 16384) {
                sg9.a("FRAME_SIZE_ERROR: %s", Integer.valueOf(c));
                throw null;
            }
            byte readByte = (byte) (this.a.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            byte readByte2 = (byte) (this.a.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            int readInt = this.a.readInt() & Integer.MAX_VALUE;
            Logger logger = sg9.a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(og9.a(true, readInt, c, readByte, readByte2));
            }
            switch (readByte) {
                case 0:
                    f(nodVar, c, readByte2, readInt);
                    return true;
                case 1:
                    h(nodVar, c, readByte2, readInt);
                    return true;
                case 2:
                    if (c != 5) {
                        sg9.a("TYPE_PRIORITY length: %d != 5", Integer.valueOf(c));
                        throw null;
                    }
                    if (readInt == 0) {
                        sg9.a("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                    lof lofVar = this.a;
                    lofVar.readInt();
                    lofVar.readByte();
                    return true;
                case 3:
                    j(nodVar, c, readInt);
                    return true;
                case 4:
                    k(nodVar, c, readByte2, readInt);
                    return true;
                case 5:
                    i(nodVar, c, readByte2, readInt);
                    return true;
                case 6:
                    z = true;
                    if (c != 8) {
                        sg9.a("TYPE_PING length != 8: %s", Integer.valueOf(c));
                        throw null;
                    }
                    if (readInt != 0) {
                        sg9.a("TYPE_PING streamId != 0", new Object[0]);
                        throw null;
                    }
                    int readInt2 = this.a.readInt();
                    int readInt3 = this.a.readInt();
                    r2 = (readByte2 & 1) != 0 ? 1 : 0;
                    long j = (readInt2 << 32) | (readInt3 & 4294967295L);
                    ((by9) nodVar.c).q(1, j);
                    Object obj = ((ood) nodVar.e).k;
                    if (r2 == 0) {
                        synchronized (obj) {
                            ((ood) nodVar.e).i.g(readInt2, readInt3, true);
                        }
                    } else {
                        synchronized (obj) {
                            try {
                                ood oodVar = (ood) nodVar.e;
                                ch9Var = oodVar.x;
                                if (ch9Var != null) {
                                    long j2 = ch9Var.a;
                                    if (j2 == j) {
                                        oodVar.x = null;
                                    } else {
                                        Logger logger2 = ood.Q;
                                        Level level = Level.WARNING;
                                        Locale locale = Locale.US;
                                        logger2.log(level, "Received unexpected ping ack. Expecting " + j2 + ", got " + j);
                                    }
                                } else {
                                    ood.Q.warning("Received unexpected ping ack. No ping outstanding");
                                }
                                ch9Var = null;
                            } finally {
                            }
                        }
                        if (ch9Var != null) {
                            synchronized (ch9Var) {
                                try {
                                    if (!ch9Var.d) {
                                        ch9Var.d = true;
                                        long a = ch9Var.b.a();
                                        ch9Var.f = a;
                                        LinkedHashMap linkedHashMap = ch9Var.c;
                                        ch9Var.c = null;
                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                            try {
                                                ((Executor) entry.getValue()).execute(new bh9((nia) entry.getKey(), a));
                                            } catch (Throwable th) {
                                                ch9.g.log(Level.SEVERE, "Failed to execute PingCallback", th);
                                            }
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                    }
                    return z;
                case 7:
                    lof lofVar2 = this.a;
                    if (c < 8) {
                        sg9.a("TYPE_GOAWAY length < 8: %s", Integer.valueOf(c));
                        throw null;
                    }
                    if (readInt != 0) {
                        sg9.a("TYPE_GOAWAY streamId != 0", new Object[0]);
                        throw null;
                    }
                    int readInt4 = lofVar2.readInt();
                    int readInt5 = lofVar2.readInt();
                    int i = c - 8;
                    up5[] values = up5.values();
                    int length = values.length;
                    while (true) {
                        if (r2 < length) {
                            up5Var = values[r2];
                            if (up5Var.a != readInt5) {
                                r2++;
                            }
                        } else {
                            up5Var = null;
                        }
                    }
                    if (up5Var == null) {
                        sg9.a("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt5));
                        throw null;
                    }
                    gc2 gc2Var = gc2.d;
                    if (i > 0) {
                        gc2Var = lofVar2.l0(i);
                    }
                    ood oodVar2 = (ood) nodVar.e;
                    ((by9) nodVar.c).p(1, readInt4, up5Var, gc2Var);
                    if (up5Var == up5.ENHANCE_YOUR_CALM) {
                        String w = gc2Var.w();
                        ood.Q.log(Level.WARNING, nodVar + ": Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: " + w);
                        if ("too_many_pings".equals(w)) {
                            oodVar2.J.run();
                        }
                    }
                    long j3 = up5Var.a;
                    m49[] m49VarArr = m49.d;
                    m49 m49Var = (j3 >= ((long) m49VarArr.length) || j3 < 0) ? null : m49VarArr[(int) j3];
                    xei b = (m49Var == null ? xei.d(m49.c.b.a.a).h("Unrecognized HTTP/2 error code: " + j3) : m49Var.b).b("Received Goaway");
                    if (gc2Var.h() > 0) {
                        b = b.b(gc2Var.w());
                    }
                    Map map = ood.P;
                    oodVar2.q(readInt4, null, b);
                    return true;
                case 8:
                    if (c != 4) {
                        sg9.a("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(c));
                        throw null;
                    }
                    long readInt6 = this.a.readInt() & 2147483647L;
                    if (readInt6 == 0) {
                        sg9.a("windowSizeIncrement was 0", new Object[0]);
                        throw null;
                    }
                    ((by9) nodVar.c).u(1, readInt, readInt6);
                    ood oodVar3 = (ood) nodVar.e;
                    if (readInt6 == 0) {
                        if (readInt != 0) {
                            oodVar3.g(readInt, xei.l.h("Received 0 flow control window increment."), zx2.a, false, up5.PROTOCOL_ERROR, null);
                            return true;
                        }
                        up5 up5Var2 = up5.PROTOCOL_ERROR;
                        oodVar3.q(0, up5Var2, ood.u(up5Var2).b("Received 0 flow control window increment."));
                        return true;
                    }
                    z = true;
                    synchronized (oodVar3.k) {
                        ood oodVar4 = (ood) nodVar.e;
                        try {
                            if (readInt == 0) {
                                oodVar4.j.b(null, (int) readInt6);
                                return true;
                            }
                            lod lodVar = (lod) oodVar4.n.get(Integer.valueOf(readInt));
                            ood oodVar5 = (ood) nodVar.e;
                            if (lodVar != null) {
                                axn axnVar = oodVar5.j;
                                kod kodVar = lodVar.l;
                                synchronized (kodVar.v) {
                                    qwdVar = kodVar.I;
                                }
                                axnVar.b(qwdVar, (int) readInt6);
                            } else if (!oodVar5.k(readInt)) {
                                z2 = true;
                                if (z2) {
                                    ood oodVar6 = (ood) nodVar.e;
                                    up5 up5Var3 = up5.PROTOCOL_ERROR;
                                    oodVar6.q(0, up5Var3, ood.u(up5Var3).b(ljg.j(readInt, "Received window_update for unknown stream: ")));
                                    return true;
                                }
                                return z;
                            }
                            z2 = false;
                            if (z2) {
                            }
                            return z;
                        } finally {
                        }
                    }
                default:
                    this.a.skip(c);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public final void f(nod nodVar, int i, byte b, int i2) {
        lod lodVar;
        boolean z = (b & 1) != 0;
        if ((b & 32) != 0) {
            sg9.a("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        short readByte = (b & 8) != 0 ? (short) (this.a.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) : (short) 0;
        int b2 = sg9.b(i, b, readByte);
        lof lofVar = this.a;
        ((by9) nodVar.c).m(1, i2, lofVar.b, b2, z);
        ood oodVar = (ood) nodVar.e;
        synchronized (oodVar.k) {
            lodVar = (lod) oodVar.n.get(Integer.valueOf(i2));
        }
        if (lodVar == null) {
            boolean k = ((ood) nodVar.e).k(i2);
            ood oodVar2 = (ood) nodVar.e;
            if (!k) {
                up5 up5Var = up5.PROTOCOL_ERROR;
                oodVar2.q(0, up5Var, ood.u(up5Var).b(ljg.j(i2, "Received data for unknown stream: ")));
                this.a.skip(readByte);
            } else {
                synchronized (oodVar2.k) {
                    ((ood) nodVar.e).i.h(i2, up5.STREAM_CLOSED);
                }
                lofVar.skip(b2);
            }
        } else {
            long j = b2;
            lofVar.o(j);
            x52 x52Var = new x52();
            x52Var.W(lofVar.b, j);
            dti dtiVar = lodVar.l.H;
            jde.a.getClass();
            synchronized (((ood) nodVar.e).k) {
                lodVar.l.j(i - b2, x52Var, z);
            }
        }
        ood oodVar3 = (ood) nodVar.e;
        int i3 = oodVar3.s + i;
        oodVar3.s = i3;
        if (i3 >= oodVar3.f * 0.5f) {
            synchronized (oodVar3.k) {
                ((ood) nodVar.e).i.i(0, r11.s);
            }
            ((ood) nodVar.e).s = 0;
        }
        this.a.skip(readByte);
    }

    public final ArrayList g(int i, short s, byte b, int i2) {
        ng9 ng9Var = this.b;
        ng9Var.e = i;
        ng9Var.b = i;
        ng9Var.f = s;
        ng9Var.c = b;
        ng9Var.d = i2;
        ag9 ag9Var = this.c;
        lof lofVar = ag9Var.b;
        ArrayList arrayList = ag9Var.a;
        while (!lofVar.w()) {
            byte readByte = lofVar.readByte();
            int i3 = readByte & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i3 == 128) {
                is8.e("index == 0");
                return null;
            }
            if ((readByte & 128) == 128) {
                int e = ag9Var.e(i3, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                int i4 = e - 1;
                if (i4 >= 0) {
                    x79[] x79VarArr = dg9.b;
                    if (i4 <= x79VarArr.length - 1) {
                        arrayList.add(x79VarArr[i4]);
                    }
                }
                int length = ag9Var.f + 1 + (i4 - dg9.b.length);
                if (length >= 0) {
                    x79[] x79VarArr2 = ag9Var.e;
                    if (length <= x79VarArr2.length - 1) {
                        arrayList.add(x79VarArr2[length]);
                    }
                }
                is8.e(ljg.j(e, "Header index too large "));
                return null;
            }
            if (i3 == 64) {
                gc2 d = ag9Var.d();
                dg9.a(d);
                ag9Var.c(new x79(d, ag9Var.d()));
            } else if ((readByte & 64) == 64) {
                ag9Var.c(new x79(ag9Var.b(ag9Var.e(i3, 63) - 1), ag9Var.d()));
            } else if ((readByte & 32) == 32) {
                int e2 = ag9Var.e(i3, 31);
                ag9Var.d = e2;
                if (e2 < 0 || e2 > ag9Var.c) {
                    ilg.l(ag9Var.d, "Invalid dynamic table size update ");
                    return null;
                }
                int i5 = ag9Var.h;
                if (e2 < i5) {
                    if (e2 == 0) {
                        Arrays.fill(ag9Var.e, (Object) null);
                        ag9Var.f = ag9Var.e.length - 1;
                        ag9Var.g = 0;
                        ag9Var.h = 0;
                    } else {
                        ag9Var.a(i5 - e2);
                    }
                }
            } else if (i3 == 16 || i3 == 0) {
                gc2 d2 = ag9Var.d();
                dg9.a(d2);
                arrayList.add(new x79(d2, ag9Var.d()));
            } else {
                arrayList.add(new x79(ag9Var.b(ag9Var.e(i3, 15) - 1), ag9Var.d()));
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        return arrayList2;
    }

    public final void h(nod nodVar, int i, byte b, int i2) {
        xei xeiVar = null;
        if (i2 == 0) {
            sg9.a("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }
        boolean z = true;
        boolean z2 = (b & 1) != 0;
        short readByte = (b & 8) != 0 ? (short) (this.a.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) : (short) 0;
        if ((b & 32) != 0) {
            lof lofVar = this.a;
            lofVar.readInt();
            lofVar.readByte();
            i -= 5;
        }
        ArrayList g = g(sg9.b(i, b, readByte), readByte, b, i2);
        by9 by9Var = (by9) nodVar.c;
        if (by9Var.l()) {
            ((Logger) by9Var.a).log(Level.FINE, "INBOUND HEADERS: streamId=" + i2 + " headers=" + g + " endStream=" + z2);
        }
        if (((ood) nodVar.e).K != Integer.MAX_VALUE) {
            long j = 0;
            for (int i3 = 0; i3 < g.size(); i3++) {
                x79 x79Var = (x79) g.get(i3);
                j += x79Var.b.h() + x79Var.a.h() + 32;
            }
            int min = (int) Math.min(j, 2147483647L);
            int i4 = ((ood) nodVar.e).K;
            if (min > i4) {
                xei xeiVar2 = xei.j;
                Locale locale = Locale.US;
                StringBuilder q = mz1.q(i4, "Response ", z2 ? "trailer" : "header", " metadata larger than ", ": ");
                q.append(min);
                xeiVar = xeiVar2.h(q.toString());
            }
        }
        synchronized (((ood) nodVar.e).k) {
            try {
                lod lodVar = (lod) ((ood) nodVar.e).n.get(Integer.valueOf(i2));
                if (lodVar == null) {
                    if (((ood) nodVar.e).k(i2)) {
                        ((ood) nodVar.e).i.h(i2, up5.STREAM_CLOSED);
                    }
                } else if (xeiVar == null) {
                    dti dtiVar = lodVar.l.H;
                    jde.a.getClass();
                    lodVar.l.k(g, z2);
                } else {
                    if (!z2) {
                        ((ood) nodVar.e).i.h(i2, up5.CANCEL);
                    }
                    lodVar.l.m(xeiVar, false, new qic());
                }
                z = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            ood oodVar = (ood) nodVar.e;
            up5 up5Var = up5.PROTOCOL_ERROR;
            oodVar.q(0, up5Var, ood.u(up5Var).b(ljg.j(i2, "Received header for unknown stream: ")));
        }
    }

    public final void i(nod nodVar, int i, byte b, int i2) {
        if (i2 == 0) {
            sg9.a("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
        short readByte = (b & 8) != 0 ? (short) (this.a.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) : (short) 0;
        int readInt = this.a.readInt() & Integer.MAX_VALUE;
        ArrayList g = g(sg9.b(i - 4, b, readByte), readByte, b, i2);
        by9 by9Var = (by9) nodVar.c;
        if (by9Var.l()) {
            ((Logger) by9Var.a).log(Level.FINE, "INBOUND PUSH_PROMISE: streamId=" + i2 + " promisedStreamId=" + readInt + " headers=" + g);
        }
        synchronized (((ood) nodVar.e).k) {
            ((ood) nodVar.e).i.h(i2, up5.PROTOCOL_ERROR);
        }
    }

    public final void j(nod nodVar, int i, int i2) {
        up5 up5Var;
        if (i != 4) {
            sg9.a("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            throw null;
        }
        if (i2 == 0) {
            sg9.a("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
        int readInt = this.a.readInt();
        up5[] values = up5.values();
        int length = values.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                up5Var = null;
                break;
            }
            up5Var = values[i3];
            if (up5Var.a == readInt) {
                break;
            } else {
                i3++;
            }
        }
        if (up5Var == null) {
            sg9.a("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            throw null;
        }
        ((by9) nodVar.c).r(1, i2, up5Var);
        xei b = ood.u(up5Var).b("Rst Stream");
        vei veiVar = b.a;
        boolean z = veiVar == vei.CANCELLED || veiVar == vei.DEADLINE_EXCEEDED;
        synchronized (((ood) nodVar.e).k) {
            try {
                lod lodVar = (lod) ((ood) nodVar.e).n.get(Integer.valueOf(i2));
                if (lodVar != null) {
                    dti dtiVar = lodVar.l.H;
                    jde.a.getClass();
                    ((ood) nodVar.e).g(i2, b, up5Var == up5.REFUSED_STREAM ? zx2.b : zx2.a, z, null, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(17:43|44|(1:46)(1:100)|(1:48)|49|(1:51)(1:99)|(2:53|(4:55|(1:57)|58|(10:60|61|(2:63|(1:65)(2:66|67))|68|(1:70)|71|72|(1:74)|75|76))(1:97))|98|61|(0)|68|(0)|71|72|(0)|75|76) */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0141, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0142, code lost:
    
        r3.a.m(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d7 A[Catch: all -> 0x008f, TryCatch #1 {all -> 0x008f, blocks: (B:44:0x0079, B:48:0x0084, B:49:0x0092, B:53:0x009b, B:55:0x00a7, B:57:0x00b9, B:61:0x00d2, B:63:0x00d7, B:65:0x00ef, B:66:0x010f, B:67:0x011b, B:68:0x011c, B:70:0x012a, B:72:0x013b, B:74:0x0149, B:75:0x0152, B:76:0x0159, B:96:0x0142, B:97:0x00c5), top: B:43:0x0079, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012a A[Catch: all -> 0x008f, TRY_LEAVE, TryCatch #1 {all -> 0x008f, blocks: (B:44:0x0079, B:48:0x0084, B:49:0x0092, B:53:0x009b, B:55:0x00a7, B:57:0x00b9, B:61:0x00d2, B:63:0x00d7, B:65:0x00ef, B:66:0x010f, B:67:0x011b, B:68:0x011c, B:70:0x012a, B:72:0x013b, B:74:0x0149, B:75:0x0152, B:76:0x0159, B:96:0x0142, B:97:0x00c5), top: B:43:0x0079, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0149 A[Catch: all -> 0x008f, TryCatch #1 {all -> 0x008f, blocks: (B:44:0x0079, B:48:0x0084, B:49:0x0092, B:53:0x009b, B:55:0x00a7, B:57:0x00b9, B:61:0x00d2, B:63:0x00d7, B:65:0x00ef, B:66:0x010f, B:67:0x011b, B:68:0x011c, B:70:0x012a, B:72:0x013b, B:74:0x0149, B:75:0x0152, B:76:0x0159, B:96:0x0142, B:97:0x00c5), top: B:43:0x0079, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(nod nodVar, int i, byte b, int i2) {
        boolean z;
        by9 by9Var;
        int readInt;
        int i3 = 0;
        if (i2 != 0) {
            sg9.a("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        }
        if ((b & 1) != 0) {
            if (i == 0) {
                return;
            }
            sg9.a("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            throw null;
        }
        if (i % 6 != 0) {
            sg9.a("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            throw null;
        }
        e7a e7aVar = new e7a(3, false);
        int i4 = 0;
        while (true) {
            short s = 4;
            if (i4 >= i) {
                ((by9) nodVar.c).t(1, e7aVar);
                synchronized (((ood) nodVar.e).k) {
                    try {
                        int i5 = e7aVar.b;
                        if ((i5 & 16) != 0) {
                            ((ood) nodVar.e).C = e7aVar.a[4];
                        }
                        if ((i5 & 128) != 0) {
                            int i6 = e7aVar.a[7];
                            axn axnVar = ((ood) nodVar.e).j;
                            if (i6 >= 0) {
                                int i7 = i6 - axnVar.a;
                                axnVar.a = i6;
                                for (qwd qwdVar : ((ood) axnVar.b).h()) {
                                    qwdVar.a(i7);
                                }
                                if (i7 > 0) {
                                    z = true;
                                    if (nodVar.b) {
                                        ood oodVar = (ood) nodVar.e;
                                        yih yihVar = oodVar.h;
                                        sm0 sm0Var = oodVar.u;
                                        Iterator it = ((t8a) yihVar.d).j.iterator();
                                        if (it.hasNext()) {
                                            it.next().getClass();
                                            throw new ClassCastException();
                                        }
                                        oodVar.u = sm0Var;
                                        yih yihVar2 = ((ood) nodVar.e).h;
                                        t8a t8aVar = (t8a) yihVar2.d;
                                        t8aVar.i.D(2, "READY");
                                        t8aVar.k.execute(new r8a(yihVar2, i3));
                                        nodVar.b = false;
                                    }
                                    zd6 zd6Var = ((ood) nodVar.e).i;
                                    by9Var = zd6Var.c;
                                    if (by9Var.l()) {
                                        ((Logger) by9Var.a).log(Level.FINE, "OUTBOUND".concat(" SETTINGS: ack=true"));
                                    }
                                    zd6Var.b.e(e7aVar);
                                    if (z) {
                                        ((ood) nodVar.e).j.c();
                                    }
                                    ((ood) nodVar.e).r();
                                }
                            } else {
                                axnVar.getClass();
                                a70.p(ljg.j(i6, "Invalid initial window size: "));
                            }
                        }
                        z = false;
                        if (nodVar.b) {
                        }
                        zd6 zd6Var2 = ((ood) nodVar.e).i;
                        by9Var = zd6Var2.c;
                        if (by9Var.l()) {
                        }
                        zd6Var2.b.e(e7aVar);
                        if (z) {
                        }
                        ((ood) nodVar.e).r();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i8 = e7aVar.b;
                if (((i8 & 2) != 0 ? e7aVar.a[1] : -1) >= 0) {
                    ag9 ag9Var = this.c;
                    int i9 = (i8 & 2) != 0 ? e7aVar.a[1] : -1;
                    ag9Var.c = i9;
                    ag9Var.d = i9;
                    int i10 = ag9Var.h;
                    if (i9 < i10) {
                        if (i9 != 0) {
                            ag9Var.a(i10 - i9);
                            return;
                        }
                        Arrays.fill(ag9Var.e, (Object) null);
                        ag9Var.f = ag9Var.e.length - 1;
                        ag9Var.g = 0;
                        ag9Var.h = 0;
                        return;
                    }
                    return;
                }
                return;
            }
            short readShort = this.a.readShort();
            readInt = this.a.readInt();
            switch (readShort) {
                case 1:
                case 6:
                    s = readShort;
                    e7aVar.j(s, readInt);
                    i4 += 6;
                case 2:
                    if (readInt != 0 && readInt != 1) {
                        sg9.a("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        throw null;
                    }
                    s = readShort;
                    e7aVar.j(s, readInt);
                    i4 += 6;
                case 3:
                    e7aVar.j(s, readInt);
                    i4 += 6;
                case 4:
                    if (readInt < 0) {
                        sg9.a("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        throw null;
                    }
                    s = 7;
                    e7aVar.j(s, readInt);
                    i4 += 6;
                case 5:
                    if (readInt < 16384 || readInt > 16777215) {
                    }
                    s = readShort;
                    e7aVar.j(s, readInt);
                    i4 += 6;
                    break;
                default:
                    i4 += 6;
            }
        }
        sg9.a("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
        throw null;
    }
}
