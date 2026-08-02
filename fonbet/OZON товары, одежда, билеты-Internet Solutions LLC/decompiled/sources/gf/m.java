package gf;

import B0.A0;
import T7.E;
import gf.C6728d;
import gf.EnumC6726b;
import gf.f;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;
import sf.C9684j;
import sf.G;
import sf.M;
import sf.N;

/* loaded from: classes6.dex */
public final class m implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final Logger f64409e;

    /* renamed from: a, reason: collision with root package name */
    private final b f64410a;

    /* renamed from: b, reason: collision with root package name */
    private final C6728d.a f64411b;

    /* renamed from: c, reason: collision with root package name */
    private final G f64412c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f64413d;

    public static final class a {
        public static int a(int i11, int i12, int i13) throws IOException {
            if ((i12 & 8) != 0) {
                i11--;
            }
            if (i13 <= i11) {
                return i11 - i13;
            }
            throw new IOException(A0.a(i13, i11, "PROTOCOL_ERROR padding ", " > remaining length "));
        }
    }

    public static final class b implements M {

        /* renamed from: a, reason: collision with root package name */
        private int f64414a;

        /* renamed from: b, reason: collision with root package name */
        private int f64415b;

        /* renamed from: c, reason: collision with root package name */
        private int f64416c;

        /* renamed from: d, reason: collision with root package name */
        private int f64417d;

        /* renamed from: e, reason: collision with root package name */
        private int f64418e;

        /* renamed from: f, reason: collision with root package name */
        private final G f64419f;

        public b(@NotNull G source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f64419f = source;
        }

        public final int c() {
            return this.f64417d;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        public final void d(int i11) {
            this.f64415b = i11;
        }

        public final void j(int i11) {
            this.f64417d = i11;
        }

        public final void k(int i11) {
            this.f64414a = i11;
        }

        public final void m(int i11) {
            this.f64418e = i11;
        }

        public final void o(int i11) {
            this.f64416c = i11;
        }

        @Override // sf.M
        public final long read(@NotNull C9681g sink, long j11) throws IOException {
            int i11;
            int m11;
            Intrinsics.checkNotNullParameter(sink, "sink");
            do {
                int i12 = this.f64417d;
                G g10 = this.f64419f;
                if (i12 == 0) {
                    g10.skip(this.f64418e);
                    this.f64418e = 0;
                    if ((this.f64415b & 4) == 0) {
                        i11 = this.f64416c;
                        int v11 = Ye.b.v(g10);
                        this.f64417d = v11;
                        this.f64414a = v11;
                        int readByte = g10.readByte() & 255;
                        this.f64415b = g10.readByte() & 255;
                        if (m.f64409e.isLoggable(Level.FINE)) {
                            Logger logger = m.f64409e;
                            e eVar = e.f64327e;
                            int i13 = this.f64416c;
                            int i14 = this.f64414a;
                            int i15 = this.f64415b;
                            eVar.getClass();
                            logger.fine(e.b(i13, i14, readByte, i15, true));
                        }
                        m11 = g10.m() & Integer.MAX_VALUE;
                        this.f64416c = m11;
                        if (readByte != 9) {
                            throw new IOException(readByte + " != TYPE_CONTINUATION");
                        }
                    }
                } else {
                    long read = g10.read(sink, Math.min(j11, i12));
                    if (read != -1) {
                        this.f64417d -= (int) read;
                        return read;
                    }
                }
                return -1L;
            } while (m11 == i11);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }

        @Override // sf.M
        @NotNull
        public final N timeout() {
            return this.f64419f.f98666a.timeout();
        }
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "Logger.getLogger(Http2::class.java.name)");
        f64409e = logger;
    }

    public m(@NotNull G source, boolean z11) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f64412c = source;
        this.f64413d = z11;
        b bVar = new b(source);
        this.f64410a = bVar;
        this.f64411b = new C6728d.a(bVar);
    }

    private final List<C6727c> k(int i11, int i12, int i13, int i14) throws IOException {
        b bVar = this.f64410a;
        bVar.j(i11);
        bVar.k(bVar.c());
        bVar.m(i12);
        bVar.d(i13);
        bVar.o(i14);
        C6728d.a aVar = this.f64411b;
        aVar.f();
        return aVar.b();
    }

    private final void m(f.d dVar, int i11) throws IOException {
        G g10 = this.f64412c;
        g10.m();
        g10.readByte();
        byte[] bArr = Ye.b.f34900a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f64412c.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x0293, code lost:
    
        throw new java.io.IOException(Ej.b.a(r12, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(boolean z11, @NotNull f.d handler) throws IOException {
        bf.c cVar;
        bf.c cVar2;
        long j11;
        long j12;
        n[] nVarArr;
        G source = this.f64412c;
        Intrinsics.checkNotNullParameter(handler, "handler");
        try {
            source.r1(9L);
            int v11 = Ye.b.v(source);
            if (v11 > 16384) {
                throw new IOException(Ej.b.a(v11, "FRAME_SIZE_ERROR: "));
            }
            int readByte = source.readByte() & 255;
            byte readByte2 = source.readByte();
            int i11 = readByte2 & 255;
            int m11 = source.m();
            int i12 = m11 & Integer.MAX_VALUE;
            Level level = Level.FINE;
            Logger logger = f64409e;
            if (logger.isLoggable(level)) {
                e.f64327e.getClass();
                logger.fine(e.b(i12, v11, readByte, i11, true));
            }
            if (z11 && readByte != 4) {
                StringBuilder sb2 = new StringBuilder("Expected a SETTINGS frame but was ");
                e.f64327e.getClass();
                sb2.append(e.a(readByte));
                throw new IOException(sb2.toString());
            }
            switch (readByte) {
                case 0:
                    if (i12 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                    }
                    boolean z12 = (readByte2 & 1) != 0;
                    if ((readByte2 & 32) != 0) {
                        throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                    }
                    r9 = (readByte2 & 8) != 0 ? source.readByte() & 255 : 0;
                    int a11 = a.a(v11, i11, r9);
                    Intrinsics.checkNotNullParameter(source, "source");
                    f fVar = handler.f64370b;
                    fVar.getClass();
                    if (i12 == 0 || (m11 & 1) != 0) {
                        n d02 = fVar.d0(i12);
                        if (d02 == null) {
                            fVar.q1(i12, EnumC6726b.PROTOCOL_ERROR);
                            long j13 = a11;
                            fVar.j1(j13);
                            source.skip(j13);
                        } else {
                            d02.y(source, a11);
                            if (z12) {
                                d02.z(Ye.b.f34901b, true);
                            }
                        }
                    } else {
                        fVar.E0(i12, source, a11, z12);
                    }
                    source.skip(r9);
                    return true;
                case 1:
                    if (i12 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                    }
                    boolean z13 = (readByte2 & 1) != 0;
                    r9 = (readByte2 & 8) != 0 ? source.readByte() & 255 : 0;
                    if ((readByte2 & 32) != 0) {
                        m(handler, i12);
                        v11 -= 5;
                    }
                    handler.a(i12, k(a.a(v11, i11, r9), r9, i11, i12), z13);
                    return true;
                case 2:
                    if (v11 != 5) {
                        throw new IOException(E.a(v11, "TYPE_PRIORITY length: ", " != 5"));
                    }
                    if (i12 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    m(handler, i12);
                    return true;
                case 3:
                    if (v11 != 4) {
                        throw new IOException(E.a(v11, "TYPE_RST_STREAM length: ", " != 4"));
                    }
                    if (i12 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int m12 = source.m();
                    EnumC6726b.Companion.getClass();
                    EnumC6726b errorCode = EnumC6726b.a.a(m12);
                    if (errorCode == null) {
                        throw new IOException(Ej.b.a(m12, "TYPE_RST_STREAM unexpected error code: "));
                    }
                    Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                    f fVar2 = handler.f64370b;
                    fVar2.getClass();
                    if (i12 != 0 && (m11 & 1) == 0) {
                        fVar2.L0(i12, errorCode);
                        return true;
                    }
                    n M02 = fVar2.M0(i12);
                    if (M02 != null) {
                        M02.A(errorCode);
                    }
                    return true;
                case 4:
                    if (i12 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((readByte2 & 1) != 0) {
                        if (v11 != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        return true;
                    }
                    if (v11 % 6 != 0) {
                        throw new IOException(Ej.b.a(v11, "TYPE_SETTINGS length % 6 != 0: "));
                    }
                    s settings = new s();
                    kotlin.ranges.e m13 = kotlin.ranges.h.m(kotlin.ranges.h.o(0, v11), 6);
                    int f71842a = m13.getF71842a();
                    int f71843b = m13.getF71843b();
                    int f71844c = m13.getF71844c();
                    if (f71844c < 0 ? f71842a >= f71843b : f71842a <= f71843b) {
                        while (true) {
                            short readShort = source.readShort();
                            byte[] bArr = Ye.b.f34900a;
                            int i13 = readShort & 65535;
                            int m14 = source.m();
                            if (i13 != 2) {
                                if (i13 == 3) {
                                    i13 = 4;
                                } else if (i13 != 4) {
                                    if (i13 == 5 && (m14 < 16384 || m14 > 16777215)) {
                                    }
                                } else {
                                    if (m14 < 0) {
                                        throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    }
                                    i13 = 7;
                                }
                            } else if (m14 != 0 && m14 != 1) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            }
                            settings.h(i13, m14);
                            if (f71842a != f71843b) {
                                f71842a += f71844c;
                            }
                        }
                    }
                    Intrinsics.checkNotNullParameter(settings, "settings");
                    f fVar3 = handler.f64370b;
                    cVar = fVar3.f64339i;
                    cVar.j(new j(fVar3.Q() + " applyAndAckSettings", handler, settings), 0L);
                    return true;
                case 5:
                    if (i12 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                    }
                    r9 = (readByte2 & 8) != 0 ? source.readByte() & 255 : 0;
                    int m15 = source.m() & Integer.MAX_VALUE;
                    List<C6727c> requestHeaders = k(a.a(v11 - 4, i11, r9), r9, i11, i12);
                    Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                    handler.f64370b.K0(m15, requestHeaders);
                    return true;
                case 6:
                    if (v11 != 8) {
                        throw new IOException(Ej.b.a(v11, "TYPE_PING length != 8: "));
                    }
                    if (i12 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    int m16 = source.m();
                    int m17 = source.m();
                    if ((readByte2 & 1) == 0) {
                        cVar2 = handler.f64370b.f64339i;
                        cVar2.j(new i(handler.f64370b.Q() + " ping", handler, m16, m17), 0L);
                        return true;
                    }
                    synchronized (handler.f64370b) {
                        try {
                            if (m16 == 1) {
                                handler.f64370b.f64344n++;
                            } else if (m16 != 2) {
                                if (m16 == 3) {
                                    f fVar4 = handler.f64370b;
                                    j12 = fVar4.f64347q;
                                    fVar4.f64347q = j12 + 1;
                                    f fVar5 = handler.f64370b;
                                    if (fVar5 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                    }
                                    fVar5.notifyAll();
                                }
                                Unit unit = Unit.f71690a;
                            } else {
                                f fVar6 = handler.f64370b;
                                j11 = fVar6.f64346p;
                                fVar6.f64346p = j11 + 1;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return true;
                case 7:
                    if (v11 < 8) {
                        throw new IOException(Ej.b.a(v11, "TYPE_GOAWAY length < 8: "));
                    }
                    if (i12 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int m18 = source.m();
                    int m19 = source.m();
                    int i14 = v11 - 8;
                    EnumC6726b.Companion.getClass();
                    EnumC6726b errorCode2 = EnumC6726b.a.a(m19);
                    if (errorCode2 == null) {
                        throw new IOException(Ej.b.a(m19, "TYPE_GOAWAY unexpected error code: "));
                    }
                    C9684j debugData = C9684j.f98719d;
                    if (i14 > 0) {
                        debugData = source.d(i14);
                    }
                    Intrinsics.checkNotNullParameter(errorCode2, "errorCode");
                    Intrinsics.checkNotNullParameter(debugData, "debugData");
                    debugData.g();
                    synchronized (handler.f64370b) {
                        Object[] array = handler.f64370b.l0().values().toArray(new n[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                        nVarArr = (n[]) array;
                        handler.f64370b.f64337g = true;
                        Unit unit2 = Unit.f71690a;
                    }
                    int length = nVarArr.length;
                    while (r9 < length) {
                        n nVar = nVarArr[r9];
                        if (nVar.k() > m18 && nVar.v()) {
                            nVar.A(EnumC6726b.REFUSED_STREAM);
                            handler.f64370b.M0(nVar.k());
                        }
                        r9++;
                    }
                    return true;
                case 8:
                    if (v11 != 4) {
                        throw new IOException(Ej.b.a(v11, "TYPE_WINDOW_UPDATE length !=4: "));
                    }
                    long m21 = source.m() & 2147483647L;
                    if (m21 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i12 != 0) {
                        n d03 = handler.f64370b.d0(i12);
                        if (d03 != null) {
                            synchronized (d03) {
                                d03.a(m21);
                                Unit unit3 = Unit.f71690a;
                            }
                            return true;
                        }
                        return true;
                    }
                    synchronized (handler.f64370b) {
                        f fVar7 = handler.f64370b;
                        fVar7.f64354x = fVar7.o0() + m21;
                        f fVar8 = handler.f64370b;
                        if (fVar8 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                        }
                        fVar8.notifyAll();
                        Unit unit4 = Unit.f71690a;
                    }
                    return true;
                default:
                    source.skip(v11);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void j(@NotNull f.d handler) throws IOException {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (this.f64413d) {
            if (!d(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        C9684j c9684j = e.f64323a;
        C9684j d11 = this.f64412c.d(c9684j.g());
        Level level = Level.FINE;
        Logger logger = f64409e;
        if (logger.isLoggable(level)) {
            logger.fine(Ye.b.k("<< CONNECTION " + d11.h(), new Object[0]));
        }
        if (!c9684j.equals(d11)) {
            throw new IOException("Expected a connection header but was ".concat(d11.H()));
        }
    }
}
