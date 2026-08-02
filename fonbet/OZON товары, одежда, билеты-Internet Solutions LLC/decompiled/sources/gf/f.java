package gf;

import C.o0;
import bf.AbstractC5657a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;
import sf.F;
import sf.G;

/* loaded from: classes6.dex */
public final class f implements Closeable {

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private static final s f64328C;

    /* renamed from: A, reason: collision with root package name */
    @NotNull
    private final d f64329A;

    /* renamed from: B, reason: collision with root package name */
    private final LinkedHashSet f64330B;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f64331a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final c f64332b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f64333c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f64334d;

    /* renamed from: e, reason: collision with root package name */
    private int f64335e;

    /* renamed from: f, reason: collision with root package name */
    private int f64336f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f64337g;

    /* renamed from: h, reason: collision with root package name */
    private final bf.e f64338h;

    /* renamed from: i, reason: collision with root package name */
    private final bf.c f64339i;

    /* renamed from: j, reason: collision with root package name */
    private final bf.c f64340j;

    /* renamed from: k, reason: collision with root package name */
    private final bf.c f64341k;

    /* renamed from: l, reason: collision with root package name */
    private final r f64342l;

    /* renamed from: m, reason: collision with root package name */
    private long f64343m;

    /* renamed from: n, reason: collision with root package name */
    private long f64344n;

    /* renamed from: o, reason: collision with root package name */
    private long f64345o;

    /* renamed from: p, reason: collision with root package name */
    private long f64346p;

    /* renamed from: q, reason: collision with root package name */
    private long f64347q;

    /* renamed from: r, reason: collision with root package name */
    private long f64348r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final s f64349s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private s f64350t;

    /* renamed from: u, reason: collision with root package name */
    private long f64351u;

    /* renamed from: v, reason: collision with root package name */
    private long f64352v;

    /* renamed from: w, reason: collision with root package name */
    private long f64353w;

    /* renamed from: x, reason: collision with root package name */
    private long f64354x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final Socket f64355y;

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private final o f64356z;

    /* loaded from: classes10.dex */
    public static final class a extends AbstractC5657a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f64357e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f64358f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, f fVar, long j11) {
            super(str, true);
            this.f64357e = fVar;
            this.f64358f = j11;
        }

        @Override // bf.AbstractC5657a
        public final long f() {
            boolean z11;
            synchronized (this.f64357e) {
                if (this.f64357e.f64344n < this.f64357e.f64343m) {
                    z11 = true;
                } else {
                    this.f64357e.f64343m++;
                    z11 = false;
                }
            }
            if (z11) {
                f.c(this.f64357e, null);
                return -1L;
            }
            this.f64357e.m1(1, 0, false);
            return this.f64358f;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public Socket f64359a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public String f64360b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public G f64361c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        public F f64362d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private c f64363e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private r f64364f;

        /* renamed from: g, reason: collision with root package name */
        private int f64365g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f64366h;

        /* renamed from: i, reason: collision with root package name */
        @NotNull
        private final bf.e f64367i;

        public b(boolean z11, @NotNull bf.e taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            this.f64366h = z11;
            this.f64367i = taskRunner;
            this.f64363e = c.f64368a;
            this.f64364f = r.f64459a;
        }

        public final boolean a() {
            return this.f64366h;
        }

        @NotNull
        public final c b() {
            return this.f64363e;
        }

        public final int c() {
            return this.f64365g;
        }

        @NotNull
        public final r d() {
            return this.f64364f;
        }

        @NotNull
        public final bf.e e() {
            return this.f64367i;
        }

        @NotNull
        public final void f(@NotNull c listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f64363e = listener;
        }

        @NotNull
        public final void g(int i11) {
            this.f64365g = i11;
        }

        @NotNull
        public final void h(@NotNull Socket socket, @NotNull String peerName, @NotNull G source, @NotNull F sink) throws IOException {
            String b11;
            Intrinsics.checkNotNullParameter(socket, "socket");
            Intrinsics.checkNotNullParameter(peerName, "peerName");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            this.f64359a = socket;
            if (this.f64366h) {
                b11 = Ye.b.f34906g + ' ' + peerName;
            } else {
                b11 = Nk.a.b("MockWebServer ", peerName);
            }
            this.f64360b = b11;
            this.f64361c = source;
            this.f64362d = sink;
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f64368a = new a();

        public static final class a extends c {
            @Override // gf.f.c
            public final void c(@NotNull n stream) throws IOException {
                Intrinsics.checkNotNullParameter(stream, "stream");
                stream.d(EnumC6726b.REFUSED_STREAM, null);
            }
        }

        public void b(@NotNull f connection, @NotNull s settings) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(settings, "settings");
        }

        public abstract void c(@NotNull n nVar) throws IOException;
    }

    public final class d implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final m f64369a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f64370b;

        public d(@NotNull f fVar, m reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            this.f64370b = fVar;
            this.f64369a = reader;
        }

        public final void a(int i11, @NotNull List headerBlock, boolean z11) {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            this.f64370b.getClass();
            if (i11 != 0 && (i11 & 1) == 0) {
                this.f64370b.H0(i11, headerBlock, z11);
                return;
            }
            synchronized (this.f64370b) {
                n d02 = this.f64370b.d0(i11);
                if (d02 != null) {
                    Unit unit = Unit.f71690a;
                    d02.z(Ye.b.z(headerBlock), z11);
                    return;
                }
                if (this.f64370b.f64337g) {
                    return;
                }
                if (i11 <= this.f64370b.R()) {
                    return;
                }
                if (i11 % 2 == this.f64370b.X() % 2) {
                    return;
                }
                n nVar = new n(i11, this.f64370b, false, z11, Ye.b.z(headerBlock));
                this.f64370b.V0(i11);
                this.f64370b.l0().put(Integer.valueOf(i11), nVar);
                this.f64370b.f64338h.h().j(new gf.h(this.f64370b.Q() + '[' + i11 + "] onStream", nVar, this, headerBlock), 0L);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            EnumC6726b enumC6726b;
            f fVar = this.f64370b;
            m mVar = this.f64369a;
            EnumC6726b enumC6726b2 = EnumC6726b.INTERNAL_ERROR;
            IOException e11 = null;
            try {
                mVar.j(this);
                while (mVar.d(false, this)) {
                }
                enumC6726b = EnumC6726b.NO_ERROR;
                try {
                    try {
                        fVar.L(enumC6726b, EnumC6726b.CANCEL, null);
                    } catch (IOException e12) {
                        e11 = e12;
                        EnumC6726b enumC6726b3 = EnumC6726b.PROTOCOL_ERROR;
                        fVar.L(enumC6726b3, enumC6726b3, e11);
                        Ye.b.e(mVar);
                        return Unit.f71690a;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fVar.L(enumC6726b, enumC6726b2, e11);
                    Ye.b.e(mVar);
                    throw th;
                }
            } catch (IOException e13) {
                e11 = e13;
                enumC6726b = enumC6726b2;
            } catch (Throwable th3) {
                th = th3;
                enumC6726b = enumC6726b2;
                fVar.L(enumC6726b, enumC6726b2, e11);
                Ye.b.e(mVar);
                throw th;
            }
            Ye.b.e(mVar);
            return Unit.f71690a;
        }
    }

    /* loaded from: classes10.dex */
    public static final class e extends AbstractC5657a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f64371e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f64372f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f64373g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, f fVar, int i11, List list, boolean z11) {
            super(str, true);
            this.f64371e = fVar;
            this.f64372f = i11;
            this.f64373g = list;
        }

        @Override // bf.AbstractC5657a
        public final long f() {
            r rVar = this.f64371e.f64342l;
            List responseHeaders = this.f64373g;
            ((q) rVar).getClass();
            Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
            try {
                this.f64371e.s0().r(this.f64372f, EnumC6726b.CANCEL);
                synchronized (this.f64371e) {
                    this.f64371e.f64330B.remove(Integer.valueOf(this.f64372f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* renamed from: gf.f$f, reason: collision with other inner class name */
    /* loaded from: classes10.dex */
    public static final class C1041f extends AbstractC5657a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f64374e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f64375f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f64376g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1041f(String str, f fVar, int i11, List list) {
            super(str, true);
            this.f64374e = fVar;
            this.f64375f = i11;
            this.f64376g = list;
        }

        @Override // bf.AbstractC5657a
        public final long f() {
            r rVar = this.f64374e.f64342l;
            List requestHeaders = this.f64376g;
            ((q) rVar).getClass();
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            try {
                this.f64374e.s0().r(this.f64375f, EnumC6726b.CANCEL);
                synchronized (this.f64374e) {
                    this.f64374e.f64330B.remove(Integer.valueOf(this.f64375f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* loaded from: classes10.dex */
    public static final class g extends AbstractC5657a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f64377e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f64378f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ EnumC6726b f64379g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, f fVar, int i11, EnumC6726b enumC6726b) {
            super(str, true);
            this.f64377e = fVar;
            this.f64378f = i11;
            this.f64379g = enumC6726b;
        }

        @Override // bf.AbstractC5657a
        public final long f() {
            r rVar = this.f64377e.f64342l;
            EnumC6726b errorCode = this.f64379g;
            ((q) rVar).getClass();
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            synchronized (this.f64377e) {
                this.f64377e.f64330B.remove(Integer.valueOf(this.f64378f));
                Unit unit = Unit.f71690a;
            }
            return -1L;
        }
    }

    /* loaded from: classes10.dex */
    public static final class h extends AbstractC5657a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f64380e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, f fVar) {
            super(str, true);
            this.f64380e = fVar;
        }

        @Override // bf.AbstractC5657a
        public final long f() {
            this.f64380e.m1(2, 0, false);
            return -1L;
        }
    }

    public static final class i extends AbstractC5657a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f64381e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f64382f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ EnumC6726b f64383g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, f fVar, int i11, EnumC6726b enumC6726b) {
            super(str, true);
            this.f64381e = fVar;
            this.f64382f = i11;
            this.f64383g = enumC6726b;
        }

        @Override // bf.AbstractC5657a
        public final long f() {
            f fVar = this.f64381e;
            try {
                fVar.n1(this.f64382f, this.f64383g);
                return -1L;
            } catch (IOException e11) {
                f.c(fVar, e11);
                return -1L;
            }
        }
    }

    /* loaded from: classes10.dex */
    public static final class j extends AbstractC5657a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f64384e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f64385f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f64386g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, f fVar, int i11, long j11) {
            super(str, true);
            this.f64384e = fVar;
            this.f64385f = i11;
            this.f64386g = j11;
        }

        @Override // bf.AbstractC5657a
        public final long f() {
            f fVar = this.f64384e;
            try {
                fVar.s0().t(this.f64385f, this.f64386g);
                return -1L;
            } catch (IOException e11) {
                f.c(fVar, e11);
                return -1L;
            }
        }
    }

    static {
        s sVar = new s();
        sVar.h(7, 65535);
        sVar.h(5, 16384);
        f64328C = sVar;
    }

    public f(@NotNull b builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean a11 = builder.a();
        this.f64331a = a11;
        this.f64332b = builder.b();
        this.f64333c = new LinkedHashMap();
        String str = builder.f64360b;
        if (str == null) {
            Intrinsics.n("connectionName");
            throw null;
        }
        this.f64334d = str;
        this.f64336f = builder.a() ? 3 : 2;
        bf.e e11 = builder.e();
        this.f64338h = e11;
        bf.c h11 = e11.h();
        this.f64339i = h11;
        this.f64340j = e11.h();
        this.f64341k = e11.h();
        this.f64342l = builder.d();
        s sVar = new s();
        if (builder.a()) {
            sVar.h(7, 16777216);
        }
        Unit unit = Unit.f71690a;
        this.f64349s = sVar;
        this.f64350t = f64328C;
        this.f64354x = r3.c();
        Socket socket = builder.f64359a;
        if (socket == null) {
            Intrinsics.n("socket");
            throw null;
        }
        this.f64355y = socket;
        F f7 = builder.f64362d;
        if (f7 == null) {
            Intrinsics.n("sink");
            throw null;
        }
        this.f64356z = new o(f7, a11);
        G g10 = builder.f64361c;
        if (g10 == null) {
            Intrinsics.n("source");
            throw null;
        }
        this.f64329A = new d(this, new m(g10, a11));
        this.f64330B = new LinkedHashSet();
        if (builder.c() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.c());
            h11.j(new a(str.concat(" ping"), this, nanos), nanos);
        }
    }

    public static final void c(f fVar, IOException iOException) {
        EnumC6726b enumC6726b = EnumC6726b.PROTOCOL_ERROR;
        fVar.L(enumC6726b, enumC6726b, iOException);
    }

    public static void d1(f fVar, bf.e taskRunner, int i11) throws IOException {
        if ((i11 & 2) != 0) {
            taskRunner = bf.e.f55976h;
        }
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        o oVar = fVar.f64356z;
        oVar.d();
        s sVar = fVar.f64349s;
        oVar.s(sVar);
        if (sVar.c() != 65535) {
            oVar.t(0, r0 - 65535);
        }
        taskRunner.h().j(new bf.d(fVar.f64329A, fVar.f64334d), 0L);
    }

    @NotNull
    public final n D0(@NotNull ArrayList requestHeaders, boolean z11) throws IOException {
        Throwable th2;
        boolean z12 = true;
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        boolean z13 = !z11;
        synchronized (this.f64356z) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.f64336f > 1073741823) {
                                try {
                                    c1(EnumC6726b.REFUSED_STREAM);
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    throw th2;
                                }
                            }
                            try {
                                if (this.f64337g) {
                                    throw new C6725a();
                                }
                                int i11 = this.f64336f;
                                this.f64336f = i11 + 2;
                                n nVar = new n(i11, this, z13, false, null);
                                if (z11 && this.f64353w < this.f64354x && nVar.t() < nVar.s()) {
                                    z12 = false;
                                }
                                if (nVar.w()) {
                                    this.f64333c.put(Integer.valueOf(i11), nVar);
                                }
                                Unit unit = Unit.f71690a;
                                this.f64356z.o(i11, requestHeaders, z13);
                                if (z12) {
                                    this.f64356z.flush();
                                }
                                return nVar;
                            } catch (Throwable th4) {
                                th = th4;
                                th2 = th;
                                throw th2;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                throw th;
            }
        }
    }

    public final void E0(int i11, @NotNull G source, int i12, boolean z11) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        C9681g c9681g = new C9681g();
        long j11 = i12;
        source.r1(j11);
        source.read(c9681g, j11);
        this.f64340j.j(new k(this.f64334d + '[' + i11 + "] onData", this, i11, c9681g, i12, z11), 0L);
    }

    public final void H0(int i11, @NotNull List<C6727c> requestHeaders, boolean z11) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        this.f64340j.j(new e(this.f64334d + '[' + i11 + "] onHeaders", this, i11, requestHeaders, z11), 0L);
    }

    public final void K0(int i11, @NotNull List<C6727c> requestHeaders) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.f64330B.contains(Integer.valueOf(i11))) {
                q1(i11, EnumC6726b.PROTOCOL_ERROR);
                return;
            }
            this.f64330B.add(Integer.valueOf(i11));
            this.f64340j.j(new C1041f(this.f64334d + '[' + i11 + "] onRequest", this, i11, requestHeaders), 0L);
        }
    }

    public final void L(@NotNull EnumC6726b connectionCode, @NotNull EnumC6726b streamCode, IOException iOException) {
        int i11;
        n[] nVarArr;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        byte[] bArr = Ye.b.f34900a;
        try {
            c1(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f64333c.isEmpty()) {
                    nVarArr = null;
                } else {
                    Object[] array = this.f64333c.values().toArray(new n[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    nVarArr = (n[]) array;
                    this.f64333c.clear();
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                try {
                    nVar.d(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f64356z.close();
        } catch (IOException unused3) {
        }
        try {
            this.f64355y.close();
        } catch (IOException unused4) {
        }
        this.f64339i.o();
        this.f64340j.o();
        this.f64341k.o();
    }

    public final void L0(int i11, @NotNull EnumC6726b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f64340j.j(new g(this.f64334d + '[' + i11 + "] onReset", this, i11, errorCode), 0L);
    }

    public final synchronized n M0(int i11) {
        n nVar;
        nVar = (n) this.f64333c.remove(Integer.valueOf(i11));
        notifyAll();
        return nVar;
    }

    public final boolean O() {
        return this.f64331a;
    }

    @NotNull
    public final String Q() {
        return this.f64334d;
    }

    public final int R() {
        return this.f64335e;
    }

    public final void T0() {
        synchronized (this) {
            long j11 = this.f64346p;
            long j12 = this.f64345o;
            if (j11 < j12) {
                return;
            }
            this.f64345o = j12 + 1;
            this.f64348r = System.nanoTime() + 1000000000;
            Unit unit = Unit.f71690a;
            this.f64339i.j(new h(o0.c(new StringBuilder(), this.f64334d, " ping"), this), 0L);
        }
    }

    public final void V0(int i11) {
        this.f64335e = i11;
    }

    @NotNull
    public final c W() {
        return this.f64332b;
    }

    public final void W0(@NotNull s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<set-?>");
        this.f64350t = sVar;
    }

    public final int X() {
        return this.f64336f;
    }

    @NotNull
    public final s Z() {
        return this.f64349s;
    }

    public final void a1(@NotNull s settings) throws IOException {
        Intrinsics.checkNotNullParameter(settings, "settings");
        synchronized (this.f64356z) {
            synchronized (this) {
                if (this.f64337g) {
                    throw new C6725a();
                }
                this.f64349s.g(settings);
                Unit unit = Unit.f71690a;
            }
            this.f64356z.s(settings);
        }
    }

    @NotNull
    public final s b0() {
        return this.f64350t;
    }

    public final void c1(@NotNull EnumC6726b statusCode) throws IOException {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.f64356z) {
            synchronized (this) {
                if (this.f64337g) {
                    return;
                }
                this.f64337g = true;
                int i11 = this.f64335e;
                Unit unit = Unit.f71690a;
                this.f64356z.m(i11, statusCode, Ye.b.f34900a);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        L(EnumC6726b.NO_ERROR, EnumC6726b.CANCEL, null);
    }

    public final synchronized n d0(int i11) {
        return (n) this.f64333c.get(Integer.valueOf(i11));
    }

    public final void flush() throws IOException {
        this.f64356z.flush();
    }

    public final synchronized void j1(long j11) {
        long j12 = this.f64351u + j11;
        this.f64351u = j12;
        long j13 = j12 - this.f64352v;
        if (j13 >= this.f64349s.c() / 2) {
            t1(0, j13);
            this.f64352v += j13;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f64356z.p());
        r6 = r2;
        r8.f64353w += r6;
        r4 = kotlin.Unit.f71690a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k1(int i11, boolean z11, C9681g c9681g, long j11) throws IOException {
        int min;
        long j12;
        if (j11 == 0) {
            this.f64356z.j(z11, i11, c9681g, 0);
            return;
        }
        while (j11 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j13 = this.f64353w;
                            long j14 = this.f64354x;
                            if (j13 < j14) {
                                break;
                            } else {
                                if (!this.f64333c.containsKey(Integer.valueOf(i11))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            j11 -= j12;
            this.f64356z.j(z11 && j11 == 0, i11, c9681g, min);
        }
    }

    @NotNull
    public final LinkedHashMap l0() {
        return this.f64333c;
    }

    public final void l1(int i11, @NotNull List alternating, boolean z11) throws IOException {
        Intrinsics.checkNotNullParameter(alternating, "alternating");
        this.f64356z.o(i11, alternating, z11);
    }

    public final void m1(int i11, int i12, boolean z11) {
        try {
            this.f64356z.q(i11, i12, z11);
        } catch (IOException e11) {
            EnumC6726b enumC6726b = EnumC6726b.PROTOCOL_ERROR;
            L(enumC6726b, enumC6726b, e11);
        }
    }

    public final void n1(int i11, @NotNull EnumC6726b statusCode) throws IOException {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        this.f64356z.r(i11, statusCode);
    }

    public final long o0() {
        return this.f64354x;
    }

    public final void q1(int i11, @NotNull EnumC6726b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f64339i.j(new i(this.f64334d + '[' + i11 + "] writeSynReset", this, i11, errorCode), 0L);
    }

    public final long r0() {
        return this.f64353w;
    }

    @NotNull
    public final o s0() {
        return this.f64356z;
    }

    public final void t1(int i11, long j11) {
        this.f64339i.j(new j(this.f64334d + '[' + i11 + "] windowUpdate", this, i11, j11), 0L);
    }

    public final synchronized boolean u0(long j11) {
        if (this.f64337g) {
            return false;
        }
        if (this.f64346p < this.f64345o) {
            if (j11 >= this.f64348r) {
                return false;
            }
        }
        return true;
    }
}
