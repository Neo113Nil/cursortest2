package nh;

import androidx.appcompat.app.t0;
import androidx.appcompat.widget.c1;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class u implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f21018d;

    /* renamed from: a, reason: collision with root package name */
    public final BufferedSource f21019a;

    /* renamed from: b, reason: collision with root package name */
    public final t f21020b;

    /* renamed from: c, reason: collision with root package name */
    public final e f21021c;

    static {
        Logger logger = Logger.getLogger(h.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(...)");
        f21018d = logger;
    }

    public u(BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f21019a = source;
        t tVar = new t(source);
        this.f21020b = tVar;
        this.f21021c = new e(tVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x015c, code lost:
    
        throw new java.io.IOException(androidx.appcompat.widget.c1.i(r7, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(boolean z5, p handler) {
        b errorCode;
        Intrinsics.checkNotNullParameter(handler, "handler");
        int i5 = 0;
        try {
            this.f21019a.require(9L);
            int l6 = hh.e.l(this.f21019a);
            if (l6 > 16384) {
                throw new IOException(c1.i(l6, "FRAME_SIZE_ERROR: "));
            }
            int readByte = this.f21019a.readByte() & 255;
            byte readByte2 = this.f21019a.readByte();
            int i10 = readByte2 & 255;
            int readInt = this.f21019a.readInt();
            int i11 = Integer.MAX_VALUE & readInt;
            int i12 = 1;
            if (readByte != 8) {
                Logger logger = f21018d;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(h.b(i11, l6, readByte, i10, true));
                }
            }
            if (z5 && readByte != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + h.a(readByte));
            }
            switch (readByte) {
                case 0:
                    k(handler, l6, i10, i11);
                    return true;
                case 1:
                    t(handler, l6, i10, i11);
                    return true;
                case 2:
                    if (l6 != 5) {
                        throw new IOException(d9.e.f(l6, "TYPE_PRIORITY length: ", " != 5"));
                    }
                    if (i11 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    BufferedSource bufferedSource = this.f21019a;
                    bufferedSource.readInt();
                    bufferedSource.readByte();
                    return true;
                case 3:
                    if (l6 != 4) {
                        throw new IOException(d9.e.f(l6, "TYPE_RST_STREAM length: ", " != 4"));
                    }
                    if (i11 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int readInt2 = this.f21019a.readInt();
                    b.f20915b.getClass();
                    b[] values = b.values();
                    int length = values.length;
                    while (true) {
                        if (i5 < length) {
                            errorCode = values[i5];
                            if (errorCode.f20923a != readInt2) {
                                i5++;
                            }
                        } else {
                            errorCode = null;
                        }
                    }
                    if (errorCode == null) {
                        throw new IOException(c1.i(readInt2, "TYPE_RST_STREAM unexpected error code: "));
                    }
                    Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                    q qVar = handler.f20979b;
                    if (i11 == 0 || (readInt & 1) != 0) {
                        y r5 = qVar.r(i11);
                        if (r5 != null) {
                            r5.j(errorCode);
                        }
                        return true;
                    }
                    Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                    jh.c.c(qVar.f20989i, qVar.f20983c + '[' + i11 + "] onReset", new j(qVar, i11, errorCode, i12));
                    return true;
                case 4:
                    BufferedSource bufferedSource2 = this.f21019a;
                    if (i11 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((readByte2 & 1) != 0) {
                        if (l6 != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        return true;
                    }
                    if (l6 % 6 != 0) {
                        throw new IOException(c1.i(l6, "TYPE_SETTINGS length % 6 != 0: "));
                    }
                    c0 settings = new c0();
                    kotlin.ranges.a c2 = zf.j.c(zf.j.d(0, l6), 6);
                    int i13 = c2.f19234a;
                    int i14 = c2.f19235b;
                    int i15 = c2.f19236c;
                    if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                        while (true) {
                            short readShort = bufferedSource2.readShort();
                            byte[] bArr = hh.e.f10821a;
                            int i16 = readShort & 65535;
                            int readInt3 = bufferedSource2.readInt();
                            if (i16 != 2) {
                                if (i16 != 4) {
                                    if (i16 == 5 && (readInt3 < 16384 || readInt3 > 16777215)) {
                                    }
                                } else if (readInt3 < 0) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                }
                            } else if (readInt3 != 0 && readInt3 != 1) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            }
                            settings.c(i16, readInt3);
                            if (i13 != i14) {
                                i13 += i15;
                            }
                        }
                    }
                    Intrinsics.checkNotNullParameter(settings, "settings");
                    q qVar2 = handler.f20979b;
                    jh.c.c(qVar2.f20988h, d9.e.l(new StringBuilder(), qVar2.f20983c, " applyAndAckSettings"), new a2.l(11, handler, settings));
                    return true;
                case 5:
                    y(handler, l6, i10, i11);
                    return true;
                case 6:
                    w(handler, l6, i10, i11);
                    return true;
                case 7:
                    n(handler, l6, i11);
                    return true;
                case 8:
                    try {
                        if (l6 != 4) {
                            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + l6);
                        }
                        long readInt4 = 2147483647L & this.f21019a.readInt();
                        if (readInt4 == 0) {
                            throw new IOException("windowSizeIncrement was 0");
                        }
                        Logger logger2 = f21018d;
                        if (logger2.isLoggable(Level.FINE)) {
                            logger2.fine(h.c(readInt4, i11, l6, true));
                        }
                        if (i11 == 0) {
                            q qVar3 = handler.f20979b;
                            synchronized (qVar3) {
                                qVar3.f20999u += readInt4;
                                Intrinsics.checkNotNull(qVar3, "null cannot be cast to non-null type java.lang.Object");
                                qVar3.notifyAll();
                                Unit unit = Unit.f19194a;
                            }
                            return true;
                        }
                        y k6 = handler.f20979b.k(i11);
                        if (k6 != null) {
                            synchronized (k6) {
                                k6.f21037e += readInt4;
                                if (readInt4 > 0) {
                                    Intrinsics.checkNotNull(k6, "null cannot be cast to non-null type java.lang.Object");
                                    k6.notifyAll();
                                }
                                Unit unit2 = Unit.f19194a;
                            }
                            return true;
                        }
                        return true;
                    } catch (Exception e7) {
                        f21018d.fine(h.b(i11, l6, 8, i10, true));
                        throw e7;
                    }
                default:
                    this.f21019a.skip(l6);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f21019a.close();
    }

    public final void k(p pVar, int i5, int i10, final int i11) {
        int i12;
        boolean z5;
        boolean z7;
        if (i11 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        final boolean z10 = (i10 & 1) != 0;
        if ((i10 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i10 & 8) != 0) {
            byte readByte = this.f21019a.readByte();
            byte[] bArr = hh.e.f10821a;
            i12 = readByte & 255;
        } else {
            i12 = 0;
        }
        final int a7 = s.a(i5, i10, i12);
        BufferedSource source = this.f21019a;
        Intrinsics.checkNotNullParameter(source, "source");
        final q qVar = pVar.f20979b;
        if (i11 == 0 || (i11 & 1) != 0) {
            y k6 = qVar.k(i11);
            if (k6 == null) {
                pVar.f20979b.z(i11, b.f20917d);
                long j = a7;
                pVar.f20979b.w(j);
                source.skip(j);
            } else {
                Intrinsics.checkNotNullParameter(source, "source");
                TimeZone timeZone = hh.g.f10825a;
                w wVar = k6.f21040h;
                long j6 = a7;
                wVar.getClass();
                Intrinsics.checkNotNullParameter(source, "source");
                long j10 = j6;
                while (true) {
                    if (j10 <= 0) {
                        y yVar = wVar.f21031f;
                        TimeZone timeZone2 = hh.g.f10825a;
                        yVar.f21034b.w(j6);
                        y yVar2 = wVar.f21031f;
                        c cVar = yVar2.f21034b.f20995p;
                        t0 windowCounter = yVar2.f21035c;
                        wVar.f21029d.size();
                        cVar.getClass();
                        Intrinsics.checkNotNullParameter(windowCounter, "windowCounter");
                        break;
                    }
                    synchronized (wVar.f21031f) {
                        z5 = wVar.f21027b;
                        z7 = j10 + wVar.f21029d.size() > wVar.f21026a;
                        Unit unit = Unit.f19194a;
                    }
                    if (z7) {
                        source.skip(j10);
                        wVar.f21031f.e(b.f20919f);
                        break;
                    }
                    if (z5) {
                        source.skip(j10);
                        break;
                    }
                    long read = source.read(wVar.f21028c, j10);
                    if (read == -1) {
                        throw new EOFException();
                    }
                    j10 -= read;
                    y yVar3 = wVar.f21031f;
                    synchronized (yVar3) {
                        try {
                            if (wVar.f21030e) {
                                wVar.f21028c.clear();
                            } else {
                                boolean z11 = wVar.f21029d.size() == 0;
                                wVar.f21029d.writeAll(wVar.f21028c);
                                if (z11) {
                                    Intrinsics.checkNotNull(yVar3, "null cannot be cast to non-null type java.lang.Object");
                                    yVar3.notifyAll();
                                }
                            }
                        } finally {
                        }
                    }
                }
                if (z10) {
                    k6.i(Headers.EMPTY, true);
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(source, "source");
            final Buffer buffer = new Buffer();
            long j11 = a7;
            source.require(j11);
            source.read(buffer, j11);
            jh.c.c(qVar.f20989i, qVar.f20983c + '[' + i11 + "] onData", new Function0(i11, buffer, a7, z10) { // from class: nh.k

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f20967b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Buffer f20968c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f20969d;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    q qVar2 = q.this;
                    int i13 = this.f20967b;
                    Buffer source2 = this.f20968c;
                    int i14 = this.f20969d;
                    try {
                        qVar2.f20990k.getClass();
                        Intrinsics.checkNotNullParameter(source2, "source");
                        source2.skip(i14);
                        qVar2.f21001w.y(i13, b.f20921h);
                        synchronized (qVar2) {
                            qVar2.f21003y.remove(Integer.valueOf(i13));
                            Unit unit2 = Unit.f19194a;
                        }
                    } catch (IOException unused) {
                    }
                    return Unit.f19194a;
                }
            });
        }
        this.f21019a.skip(i12);
    }

    public final void n(p pVar, int i5, int i10) {
        b errorCode;
        Object[] array;
        if (i5 < 8) {
            throw new IOException(c1.i(i5, "TYPE_GOAWAY length < 8: "));
        }
        if (i10 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int readInt = this.f21019a.readInt();
        int readInt2 = this.f21019a.readInt();
        int i11 = i5 - 8;
        b.f20915b.getClass();
        b[] values = b.values();
        int length = values.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                errorCode = null;
                break;
            }
            errorCode = values[i12];
            if (errorCode.f20923a == readInt2) {
                break;
            } else {
                i12++;
            }
        }
        if (errorCode == null) {
            throw new IOException(c1.i(readInt2, "TYPE_GOAWAY unexpected error code: "));
        }
        ByteString debugData = ByteString.EMPTY;
        if (i11 > 0) {
            debugData = this.f21019a.readByteString(i11);
        }
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(debugData, "debugData");
        debugData.size();
        q qVar = pVar.f20979b;
        synchronized (qVar) {
            array = qVar.f20982b.values().toArray(new y[0]);
            qVar.f20986f = true;
            Unit unit = Unit.f19194a;
        }
        for (y yVar : (y[]) array) {
            if (yVar.f21033a > readInt && yVar.g()) {
                yVar.j(b.f20920g);
                pVar.f20979b.r(yVar.f21033a);
            }
        }
    }

    public final List r(int i5, int i10, int i11, int i12) {
        t tVar = this.f21020b;
        tVar.f21016e = i5;
        tVar.f21013b = i5;
        tVar.f21017f = i10;
        tVar.f21014c = i11;
        tVar.f21015d = i12;
        e eVar = this.f21021c;
        BufferedSource bufferedSource = eVar.f20940c;
        ArrayList arrayList = eVar.f20939b;
        while (!bufferedSource.exhausted()) {
            byte readByte = bufferedSource.readByte();
            byte[] bArr = hh.e.f10821a;
            int i13 = readByte & 255;
            if (i13 == 128) {
                throw new IOException("index == 0");
            }
            if ((readByte & ByteCompanionObject.MIN_VALUE) == 128) {
                int e7 = eVar.e(i13, 127);
                int i14 = e7 - 1;
                if (i14 >= 0) {
                    d[] dVarArr = g.f20953a;
                    if (i14 <= dVarArr.length - 1) {
                        arrayList.add(dVarArr[i14]);
                    }
                }
                int length = eVar.f20942e + 1 + (i14 - g.f20953a.length);
                if (length >= 0) {
                    d[] dVarArr2 = eVar.f20941d;
                    if (length < dVarArr2.length) {
                        d dVar = dVarArr2[length];
                        Intrinsics.checkNotNull(dVar);
                        arrayList.add(dVar);
                    }
                }
                throw new IOException(c1.i(e7, "Header index too large "));
            }
            if (i13 == 64) {
                d[] dVarArr3 = g.f20953a;
                ByteString d10 = eVar.d();
                g.a(d10);
                eVar.c(new d(d10, eVar.d()));
            } else if ((readByte & 64) == 64) {
                eVar.c(new d(eVar.b(eVar.e(i13, 63) - 1), eVar.d()));
            } else if ((readByte & 32) == 32) {
                int e9 = eVar.e(i13, 31);
                eVar.f20938a = e9;
                if (e9 < 0 || e9 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + eVar.f20938a);
                }
                int i15 = eVar.f20944g;
                if (e9 < i15) {
                    if (e9 == 0) {
                        kotlin.collections.o.k(r7, null, 0, eVar.f20941d.length);
                        eVar.f20942e = eVar.f20941d.length - 1;
                        eVar.f20943f = 0;
                        eVar.f20944g = 0;
                    } else {
                        eVar.a(i15 - e9);
                    }
                }
            } else if (i13 == 16 || i13 == 0) {
                d[] dVarArr4 = g.f20953a;
                ByteString d11 = eVar.d();
                g.a(d11);
                arrayList.add(new d(d11, eVar.d()));
            } else {
                arrayList.add(new d(eVar.b(eVar.e(i13, 15) - 1), eVar.d()));
            }
        }
        List W = CollectionsKt.W(arrayList);
        arrayList.clear();
        return W;
    }

    public final void t(p pVar, int i5, int i10, int i11) {
        if (i11 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i12 = 0;
        boolean z5 = (i10 & 1) != 0;
        if ((i10 & 8) != 0) {
            byte readByte = this.f21019a.readByte();
            byte[] bArr = hh.e.f10821a;
            i12 = readByte & 255;
        }
        if ((i10 & 32) != 0) {
            BufferedSource bufferedSource = this.f21019a;
            bufferedSource.readInt();
            bufferedSource.readByte();
            byte[] bArr2 = hh.e.f10821a;
            i5 -= 5;
        }
        List requestHeaders = r(s.a(i5, i10, i12), i12, i10, i11);
        Intrinsics.checkNotNullParameter(requestHeaders, "headerBlock");
        q qVar = pVar.f20979b;
        if (i11 != 0 && (i11 & 1) == 0) {
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            jh.c.c(qVar.f20989i, qVar.f20983c + '[' + i11 + "] onHeaders", new l(qVar, i11, requestHeaders, z5));
            return;
        }
        synchronized (qVar) {
            y k6 = qVar.k(i11);
            if (k6 != null) {
                Unit unit = Unit.f19194a;
                k6.i(hh.g.h(requestHeaders), z5);
                return;
            }
            if (qVar.f20986f) {
                return;
            }
            if (i11 <= qVar.f20984d) {
                return;
            }
            if (i11 % 2 == qVar.f20985e % 2) {
                return;
            }
            y yVar = new y(i11, qVar, false, z5, hh.g.h(requestHeaders));
            qVar.f20984d = i11;
            qVar.f20982b.put(Integer.valueOf(i11), yVar);
            jh.c.c(qVar.f20987g.d(), qVar.f20983c + '[' + i11 + "] onStream", new a2.l(10, qVar, yVar));
        }
    }

    public final void w(p pVar, int i5, int i10, int i11) {
        if (i5 != 8) {
            throw new IOException(c1.i(i5, "TYPE_PING length != 8: "));
        }
        if (i11 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        final int readInt = this.f21019a.readInt();
        final int readInt2 = this.f21019a.readInt();
        if (!((i10 & 1) != 0)) {
            jh.c cVar = pVar.f20979b.f20988h;
            String l6 = d9.e.l(new StringBuilder(), pVar.f20979b.f20983c, " ping");
            final q qVar = pVar.f20979b;
            jh.c.c(cVar, l6, new Function0() { // from class: nh.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    q qVar2 = q.this;
                    try {
                        qVar2.f21001w.w(readInt, readInt2, true);
                    } catch (IOException e7) {
                        b bVar = b.f20917d;
                        qVar2.c(bVar, bVar, e7);
                    }
                    return Unit.f19194a;
                }
            });
            return;
        }
        q qVar2 = pVar.f20979b;
        synchronized (qVar2) {
            try {
                if (readInt == 1) {
                    qVar2.f20991l++;
                } else if (readInt != 2) {
                    if (readInt == 3) {
                        Intrinsics.checkNotNull(qVar2, "null cannot be cast to non-null type java.lang.Object");
                        qVar2.notifyAll();
                    }
                    Unit unit = Unit.f19194a;
                } else {
                    qVar2.f20993n++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void y(p pVar, int i5, int i10, int i11) {
        int i12;
        if (i11 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i10 & 8) != 0) {
            byte readByte = this.f21019a.readByte();
            byte[] bArr = hh.e.f10821a;
            i12 = readByte & 255;
        } else {
            i12 = 0;
        }
        int readInt = this.f21019a.readInt() & Integer.MAX_VALUE;
        List requestHeaders = r(s.a(i5 - 4, i10, i12), i12, i10, i11);
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        q qVar = pVar.f20979b;
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (qVar) {
            if (qVar.f21003y.contains(Integer.valueOf(readInt))) {
                qVar.z(readInt, b.f20917d);
                return;
            }
            qVar.f21003y.add(Integer.valueOf(readInt));
            jh.c.c(qVar.f20989i, qVar.f20983c + '[' + readInt + "] onRequest", new l(qVar, readInt, requestHeaders));
        }
    }
}
