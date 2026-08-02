package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class eh9 implements Closeable {
    public static final Logger d;
    public final lof a;
    public final dh9 b;
    public final zf9 c;

    static {
        Logger logger = Logger.getLogger(rg9.class.getName());
        logger.getClass();
        d = logger;
    }

    public eh9(lof lofVar) {
        this.a = lofVar;
        dh9 dh9Var = new dh9(lofVar);
        this.b = dh9Var;
        this.c = new zf9(dh9Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x023e, code lost:
    
        defpackage.is8.e(defpackage.ljg.j(r6, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0247, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(boolean z, pi piVar) {
        int n;
        Object[] array;
        int i = 0;
        try {
            this.a.o(9L);
            n = wol.n(this.a);
        } catch (EOFException unused) {
        }
        if (n > 16384) {
            is8.e(ljg.j(n, "FRAME_SIZE_ERROR: "));
            return false;
        }
        int readByte = this.a.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        byte readByte2 = this.a.readByte();
        int i2 = readByte2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int readInt = this.a.readInt();
        int i3 = Integer.MAX_VALUE & readInt;
        if (readByte != 8) {
            Logger logger = d;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(rg9.b(i3, n, readByte, i2, true));
            }
        }
        if (z && readByte != 4) {
            pvd.q(rg9.a(readByte), "Expected a SETTINGS frame but was ");
            return false;
        }
        tp5 tp5Var = null;
        switch (readByte) {
            case 0:
                f(piVar, n, i2, i3);
                return true;
            case 1:
                h(piVar, n, i2, i3);
                return true;
            case 2:
                if (n != 5) {
                    is8.e(lnb.k(n, "TYPE_PRIORITY length: ", " != 5"));
                    return false;
                }
                if (i3 == 0) {
                    is8.e("TYPE_PRIORITY streamId == 0");
                    return false;
                }
                lof lofVar = this.a;
                lofVar.readInt();
                lofVar.readByte();
                return true;
            case 3:
                if (n != 4) {
                    is8.e(lnb.k(n, "TYPE_RST_STREAM length: ", " != 4"));
                    return false;
                }
                if (i3 == 0) {
                    is8.e("TYPE_RST_STREAM streamId == 0");
                    return false;
                }
                int readInt2 = this.a.readInt();
                tp5.b.getClass();
                tp5[] values = tp5.values();
                int length = values.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        tp5 tp5Var2 = values[i4];
                        if (tp5Var2.a == readInt2) {
                            tp5Var = tp5Var2;
                        } else {
                            i4++;
                        }
                    }
                }
                if (tp5Var == null) {
                    is8.e(ljg.j(readInt2, "TYPE_RST_STREAM unexpected error code: "));
                    return false;
                }
                zg9 zg9Var = (zg9) piVar.c;
                if (i3 != 0 && (readInt & 1) == 0) {
                    bui.c(zg9Var.i, zg9Var.c + '[' + i3 + "] onReset", new bk7(zg9Var, i3, tp5Var));
                    return true;
                }
                ih9 g = zg9Var.g(i3);
                if (g != null) {
                    synchronized (g) {
                        try {
                            if (g.f() == null) {
                                g.l = tp5Var;
                                g.notifyAll();
                            }
                            Unit unit = Unit.a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                }
                return true;
            case 4:
                lof lofVar2 = this.a;
                if (i3 != 0) {
                    is8.e("TYPE_SETTINGS streamId != 0");
                    return false;
                }
                if ((readByte2 & 1) != 0) {
                    if (n != 0) {
                        is8.e("FRAME_SIZE_ERROR ack frame should be empty!");
                        return false;
                    }
                    return true;
                }
                if (n % 6 != 0) {
                    is8.e(ljg.j(n, "TYPE_SETTINGS length % 6 != 0: "));
                    return false;
                }
                aah aahVar = new aah();
                a i5 = llf.i(6, llf.j(0, n));
                int i6 = i5.a;
                int i7 = i5.b;
                int i8 = i5.c;
                if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                    while (true) {
                        short readShort = lofVar2.readShort();
                        byte[] bArr = wol.a;
                        int i9 = readShort & 65535;
                        int readInt3 = lofVar2.readInt();
                        if (i9 != 2) {
                            if (i9 != 4) {
                                if (i9 == 5 && (readInt3 < 16384 || readInt3 > 16777215)) {
                                }
                            } else if (readInt3 < 0) {
                                is8.e("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                return false;
                            }
                        } else if (readInt3 != 0 && readInt3 != 1) {
                            is8.e("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            return false;
                        }
                        aahVar.b(i9, readInt3);
                        if (i6 != i7) {
                            i6 += i8;
                        }
                    }
                }
                zg9 zg9Var2 = (zg9) piVar.c;
                bui.c(zg9Var2.h, mz1.o(new StringBuilder(), zg9Var2.c, " applyAndAckSettings"), new ij8(12, piVar, aahVar));
                return true;
            case 5:
                i(piVar, n, i2, i3);
                return true;
            case 6:
                if (n != 8) {
                    is8.e(ljg.j(n, "TYPE_PING length != 8: "));
                    return false;
                }
                if (i3 != 0) {
                    is8.e("TYPE_PING streamId != 0");
                    return false;
                }
                int readInt4 = this.a.readInt();
                int readInt5 = this.a.readInt();
                boolean z2 = (readByte2 & 1) != 0;
                zg9 zg9Var3 = (zg9) piVar.c;
                if (!z2) {
                    bui.c(zg9Var3.h, mz1.o(new StringBuilder(), ((zg9) piVar.c).c, " ping"), new yg9((zg9) piVar.c, readInt4, readInt5, i));
                    return true;
                }
                synchronized (zg9Var3) {
                    try {
                        if (readInt4 == 1) {
                            zg9Var3.m++;
                        } else if (readInt4 != 2) {
                            if (readInt4 == 3) {
                                zg9Var3.notifyAll();
                            }
                            Unit unit2 = Unit.a;
                        } else {
                            zg9Var3.o++;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return true;
            case 7:
                if (n < 8) {
                    is8.e(ljg.j(n, "TYPE_GOAWAY length < 8: "));
                    return false;
                }
                if (i3 != 0) {
                    is8.e("TYPE_GOAWAY streamId != 0");
                    return false;
                }
                int readInt6 = this.a.readInt();
                int readInt7 = this.a.readInt();
                int i10 = n - 8;
                tp5.b.getClass();
                tp5[] values2 = tp5.values();
                int length2 = values2.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length2) {
                        tp5 tp5Var3 = values2[i11];
                        if (tp5Var3.a == readInt7) {
                            tp5Var = tp5Var3;
                        } else {
                            i11++;
                        }
                    }
                }
                if (tp5Var == null) {
                    is8.e(ljg.j(readInt7, "TYPE_GOAWAY unexpected error code: "));
                    return false;
                }
                gc2 gc2Var = gc2.d;
                if (i10 > 0) {
                    gc2Var = this.a.l0(i10);
                }
                gc2Var.getClass();
                gc2Var.h();
                zg9 zg9Var4 = (zg9) piVar.c;
                synchronized (zg9Var4) {
                    array = zg9Var4.b.values().toArray(new ih9[0]);
                    zg9Var4.f = true;
                    Unit unit3 = Unit.a;
                }
                ih9[] ih9VarArr = (ih9[]) array;
                int length3 = ih9VarArr.length;
                while (i < length3) {
                    ih9 ih9Var = ih9VarArr[i];
                    if (ih9Var.a > readInt6 && ih9Var.g()) {
                        tp5 tp5Var4 = tp5.REFUSED_STREAM;
                        synchronized (ih9Var) {
                            try {
                                if (ih9Var.f() == null) {
                                    ih9Var.l = tp5Var4;
                                    ih9Var.notifyAll();
                                }
                                Unit unit4 = Unit.a;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                        ((zg9) piVar.c).g(ih9Var.a);
                    }
                    i++;
                }
                return true;
            case 8:
                try {
                    if (n != 4) {
                        throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + n);
                    }
                    long readInt8 = this.a.readInt() & 2147483647L;
                    if (readInt8 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    Logger logger2 = d;
                    if (logger2.isLoggable(Level.FINE)) {
                        logger2.fine(rg9.c(i3, n, readInt8, true));
                    }
                    zg9 zg9Var5 = (zg9) piVar.c;
                    if (i3 == 0) {
                        synchronized (zg9Var5) {
                            zg9Var5.v += readInt8;
                            zg9Var5.notifyAll();
                            Unit unit5 = Unit.a;
                        }
                        return true;
                    }
                    ih9 f = zg9Var5.f(i3);
                    if (f != null) {
                        synchronized (f) {
                            f.e += readInt8;
                            if (readInt8 > 0) {
                                f.notifyAll();
                            }
                            Unit unit6 = Unit.a;
                        }
                        return true;
                    }
                    return true;
                } catch (Exception e) {
                    d.fine(rg9.b(i3, n, 8, i2, true));
                    throw e;
                }
            default:
                this.a.skip(n);
                return true;
        }
    }

    public final void f(pi piVar, int i, int i2, int i3) {
        boolean z;
        int i4;
        boolean z2;
        boolean z3;
        if (i3 == 0) {
            is8.e("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        boolean z4 = true;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = true;
            z4 = false;
        }
        if ((i2 & 32) != 0) {
            is8.e("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i2 & 8) != 0) {
            byte readByte = this.a.readByte();
            byte[] bArr = wol.a;
            i4 = readByte & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        } else {
            i4 = 0;
        }
        int x = zm2.x(i, i2, i4);
        lof lofVar = this.a;
        zg9 zg9Var = (zg9) piVar.c;
        if ((i3 == 0 || (i3 & 1) != 0) ? false : z) {
            x52 x52Var = new x52();
            long j = x;
            lofVar.o(j);
            lofVar.read(x52Var, j);
            bui.c(zg9Var.i, zg9Var.c + '[' + i3 + "] onData", new ug9(zg9Var, i3, x52Var, x, z4));
        } else {
            ih9 f = zg9Var.f(i3);
            if (f == null) {
                ((zg9) piVar.c).k(i3, tp5.PROTOCOL_ERROR);
                long j2 = x;
                ((zg9) piVar.c).i(j2);
                lofVar.skip(j2);
            } else {
                TimeZone timeZone = yol.a;
                gh9 gh9Var = f.h;
                long j3 = x;
                gh9Var.getClass();
                long j4 = j3;
                while (true) {
                    ih9 ih9Var = gh9Var.f;
                    if (j4 <= 0) {
                        TimeZone timeZone2 = yol.a;
                        ih9Var.b.i(j3);
                        gh9Var.f.b.q.getClass();
                        break;
                    }
                    synchronized (ih9Var) {
                        z2 = gh9Var.b;
                        z3 = gh9Var.d.b + j4 > gh9Var.a;
                        Unit unit = Unit.a;
                    }
                    if (z3) {
                        lofVar.skip(j4);
                        gh9Var.f.e(tp5.FLOW_CONTROL_ERROR);
                        break;
                    }
                    if (z2) {
                        lofVar.skip(j4);
                        break;
                    }
                    long read = lofVar.read(gh9Var.c, j4);
                    if (read == -1) {
                        a70.q();
                        return;
                    }
                    j4 -= read;
                    ih9 ih9Var2 = gh9Var.f;
                    synchronized (ih9Var2) {
                        try {
                            if (gh9Var.e) {
                                gh9Var.c.k();
                            } else {
                                x52 x52Var2 = gh9Var.d;
                                boolean z5 = x52Var2.b == 0;
                                x52Var2.M0(gh9Var.c);
                                if (z5) {
                                    ih9Var2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (z4) {
                    f.j(q89.b, true);
                }
            }
        }
        this.a.skip(i4);
    }

    public final List g(int i, int i2, int i3, int i4) {
        dh9 dh9Var = this.b;
        dh9Var.d = i;
        dh9Var.e = i2;
        dh9Var.b = i3;
        dh9Var.c = i4;
        zf9 zf9Var = this.c;
        lof lofVar = zf9Var.d;
        while (!lofVar.w()) {
            byte readByte = lofVar.readByte();
            byte[] bArr = wol.a;
            int i5 = readByte & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i5 == 128) {
                is8.e("index == 0");
                return null;
            }
            if ((readByte & 128) == 128) {
                int f = zf9Var.f(i5, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                int i6 = f - 1;
                if (i6 >= 0) {
                    v79[] v79VarArr = cg9.a;
                    if (i6 <= v79VarArr.length - 1) {
                        zf9Var.a(v79VarArr[i6]);
                    }
                }
                int length = zf9Var.f + 1 + (i6 - cg9.a.length);
                if (length >= 0) {
                    v79[] v79VarArr2 = zf9Var.e;
                    if (length < v79VarArr2.length) {
                        v79 v79Var = v79VarArr2[length];
                        v79Var.getClass();
                        zf9Var.a(v79Var);
                    }
                }
                is8.e(ljg.j(f, "Header index too large "));
                return null;
            }
            if (i5 == 64) {
                v79[] v79VarArr3 = cg9.a;
                gc2 e = zf9Var.e();
                cg9.a(e);
                zf9Var.d(new v79(e, zf9Var.e()));
            } else if ((readByte & 64) == 64) {
                zf9Var.d(new v79(zf9Var.c(zf9Var.f(i5, 63) - 1), zf9Var.e()));
            } else if ((readByte & 32) == 32) {
                int f2 = zf9Var.f(i5, 31);
                zf9Var.a = f2;
                if (f2 < 0 || f2 > 4096) {
                    ilg.l(zf9Var.a, "Invalid dynamic table size update ");
                    return null;
                }
                int i7 = zf9Var.h;
                if (f2 < i7) {
                    if (f2 == 0) {
                        v79[] v79VarArr4 = zf9Var.e;
                        mh0.m(0, v79VarArr4.length, null, v79VarArr4);
                        zf9Var.f = zf9Var.e.length - 1;
                        zf9Var.g = 0;
                        zf9Var.h = 0;
                    } else {
                        zf9Var.b(i7 - f2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                v79[] v79VarArr5 = cg9.a;
                gc2 e2 = zf9Var.e();
                cg9.a(e2);
                zf9Var.a(new v79(e2, zf9Var.e()));
            } else {
                zf9Var.a(new v79(zf9Var.c(zf9Var.f(i5, 15) - 1), zf9Var.e()));
            }
        }
        ArrayList arrayList = zf9Var.b;
        List S0 = CollectionsKt.S0(arrayList);
        arrayList.clear();
        zf9Var.c = 0L;
        return S0;
    }

    public final void h(pi piVar, int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            is8.e("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        boolean z2 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte readByte = this.a.readByte();
            byte[] bArr = wol.a;
            i4 = readByte & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            lof lofVar = this.a;
            lofVar.readInt();
            lofVar.readByte();
            byte[] bArr2 = wol.a;
            i -= 5;
        }
        List g = g(zm2.x(i, i2, i4), i4, i2, i3);
        g.getClass();
        zg9 zg9Var = (zg9) piVar.c;
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            bui.c(zg9Var.i, zg9Var.c + '[' + i3 + "] onHeaders", new vg9(zg9Var, i3, g, z2));
            return;
        }
        synchronized (zg9Var) {
            ih9 f = zg9Var.f(i3);
            if (f != null) {
                Unit unit = Unit.a;
                f.j(yol.h(g), z2);
                return;
            }
            if (zg9Var.f) {
                return;
            }
            if (i3 <= zg9Var.d) {
                return;
            }
            if (i3 % 2 == zg9Var.e % 2) {
                return;
            }
            ih9 ih9Var = new ih9(i3, zg9Var, false, z2, yol.h(g));
            zg9Var.d = i3;
            zg9Var.b.put(Integer.valueOf(i3), ih9Var);
            bui.c(zg9Var.g.d(), zg9Var.c + '[' + i3 + "] onStream", new ij8(11, zg9Var, ih9Var));
        }
    }

    public final void i(pi piVar, int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            is8.e("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        if ((i2 & 8) != 0) {
            byte readByte = this.a.readByte();
            byte[] bArr = wol.a;
            i4 = readByte & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        } else {
            i4 = 0;
        }
        int readInt = this.a.readInt() & Integer.MAX_VALUE;
        List g = g(zm2.x(i - 4, i2, i4), i4, i2, i3);
        g.getClass();
        zg9 zg9Var = (zg9) piVar.c;
        synchronized (zg9Var) {
            if (zg9Var.z.contains(Integer.valueOf(readInt))) {
                zg9Var.k(readInt, tp5.PROTOCOL_ERROR);
                return;
            }
            zg9Var.z.add(Integer.valueOf(readInt));
            bui.c(zg9Var.i, zg9Var.c + '[' + readInt + "] onRequest", new vg9(zg9Var, readInt, g));
        }
    }
}
