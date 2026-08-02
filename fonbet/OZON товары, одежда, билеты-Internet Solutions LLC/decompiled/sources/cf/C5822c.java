package cf;

import C.C2702w;
import We.G;
import We.L;
import We.v;
import ef.C6358h;
import ef.InterfaceC6354d;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;
import sf.K;
import sf.M;
import sf.q;
import sf.z;

/* renamed from: cf.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5822c {

    /* renamed from: a, reason: collision with root package name */
    private boolean f57071a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final j f57072b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C5824e f57073c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final v f57074d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C5823d f57075e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC6354d f57076f;

    /* renamed from: cf.c$a */
    private final class a extends sf.p {

        /* renamed from: b, reason: collision with root package name */
        private boolean f57077b;

        /* renamed from: c, reason: collision with root package name */
        private long f57078c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f57079d;

        /* renamed from: e, reason: collision with root package name */
        private final long f57080e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C5822c f57081f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull C5822c c5822c, K delegate, long j11) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f57081f = c5822c;
            this.f57080e = j11;
        }

        private final <E extends IOException> E c(E e11) {
            if (this.f57077b) {
                return e11;
            }
            this.f57077b = true;
            return (E) this.f57081f.a(this.f57078c, false, true, e11);
        }

        @Override // sf.p, sf.K, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f57079d) {
                return;
            }
            this.f57079d = true;
            long j11 = this.f57080e;
            if (j11 != -1 && this.f57078c != j11) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                c(null);
            } catch (IOException e11) {
                throw c(e11);
            }
        }

        @Override // sf.p, sf.K, java.io.Flushable
        public final void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e11) {
                throw c(e11);
            }
        }

        @Override // sf.p, sf.K
        public final void z0(@NotNull C9681g source, long j11) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f57079d) {
                throw new IllegalStateException("closed");
            }
            long j12 = this.f57080e;
            if (j12 != -1 && this.f57078c + j11 > j12) {
                StringBuilder d11 = C2702w.d(j12, "expected ", " bytes but received ");
                d11.append(this.f57078c + j11);
                throw new ProtocolException(d11.toString());
            }
            try {
                super.z0(source, j11);
                this.f57078c += j11;
            } catch (IOException e11) {
                throw c(e11);
            }
        }
    }

    /* renamed from: cf.c$b */
    public final class b extends q {

        /* renamed from: a, reason: collision with root package name */
        private long f57082a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f57083b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f57084c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f57085d;

        /* renamed from: e, reason: collision with root package name */
        private final long f57086e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C5822c f57087f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull C5822c c5822c, M delegate, long j11) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f57087f = c5822c;
            this.f57086e = j11;
            this.f57083b = true;
            if (j11 == 0) {
                c(null);
            }
        }

        public final <E extends IOException> E c(E e11) {
            if (this.f57084c) {
                return e11;
            }
            this.f57084c = true;
            if (e11 == null && this.f57083b) {
                this.f57083b = false;
                C5822c c5822c = this.f57087f;
                c5822c.i().responseBodyStart(c5822c.g());
            }
            return (E) this.f57087f.a(this.f57082a, true, false, e11);
        }

        @Override // sf.q, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f57085d) {
                return;
            }
            this.f57085d = true;
            try {
                super.close();
                c(null);
            } catch (IOException e11) {
                throw c(e11);
            }
        }

        @Override // sf.q, sf.M
        public final long read(@NotNull C9681g sink, long j11) throws IOException {
            C5822c c5822c = this.f57087f;
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.f57085d) {
                throw new IllegalStateException("closed");
            }
            try {
                long read = delegate().read(sink, j11);
                if (this.f57083b) {
                    this.f57083b = false;
                    c5822c.i().responseBodyStart(c5822c.g());
                }
                if (read == -1) {
                    c(null);
                    return -1L;
                }
                long j12 = this.f57082a + read;
                long j13 = this.f57086e;
                if (j13 == -1 || j12 <= j13) {
                    this.f57082a = j12;
                    if (j12 == j13) {
                        c(null);
                    }
                    return read;
                }
                throw new ProtocolException("expected " + j13 + " bytes but received " + j12);
            } catch (IOException e11) {
                throw c(e11);
            }
        }
    }

    public C5822c(@NotNull C5824e call, @NotNull v eventListener, @NotNull C5823d finder, @NotNull InterfaceC6354d codec) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.f57073c = call;
        this.f57074d = eventListener;
        this.f57075e = finder;
        this.f57076f = codec;
        this.f57072b = codec.a();
    }

    private final void t(IOException iOException) {
        this.f57075e.f(iOException);
        this.f57076f.a().C(this.f57073c, iOException);
    }

    public final <E extends IOException> E a(long j11, boolean z11, boolean z12, E e11) {
        if (e11 != null) {
            t(e11);
        }
        v vVar = this.f57074d;
        C5824e c5824e = this.f57073c;
        if (z12) {
            if (e11 != null) {
                vVar.requestFailed(c5824e, e11);
            } else {
                vVar.requestBodyEnd(c5824e, j11);
            }
        }
        if (z11) {
            if (e11 != null) {
                vVar.responseFailed(c5824e, e11);
            } else {
                vVar.responseBodyEnd(c5824e, j11);
            }
        }
        return (E) c5824e.o(this, z12, z11, e11);
    }

    public final void b() {
        this.f57076f.cancel();
    }

    @NotNull
    public final K c(@NotNull G request, boolean z11) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f57071a = z11;
        We.K a11 = request.a();
        Intrinsics.f(a11);
        long contentLength = a11.contentLength();
        this.f57074d.requestBodyStart(this.f57073c);
        return new a(this, this.f57076f.b(request, contentLength), contentLength);
    }

    public final void d() {
        this.f57076f.cancel();
        this.f57073c.o(this, true, true, null);
    }

    public final void e() throws IOException {
        try {
            this.f57076f.e();
        } catch (IOException e11) {
            this.f57074d.requestFailed(this.f57073c, e11);
            t(e11);
            throw e11;
        }
    }

    public final void f() throws IOException {
        try {
            this.f57076f.d();
        } catch (IOException e11) {
            this.f57074d.requestFailed(this.f57073c, e11);
            t(e11);
            throw e11;
        }
    }

    @NotNull
    public final C5824e g() {
        return this.f57073c;
    }

    @NotNull
    public final j h() {
        return this.f57072b;
    }

    @NotNull
    public final v i() {
        return this.f57074d;
    }

    @NotNull
    public final C5823d j() {
        return this.f57075e;
    }

    public final boolean k() {
        return !Intrinsics.d(this.f57075e.c().l().h(), this.f57072b.x().a().l().h());
    }

    public final boolean l() {
        return this.f57071a;
    }

    @NotNull
    public final i m() throws SocketException {
        this.f57073c.u();
        return this.f57076f.a().u(this);
    }

    public final void n() {
        this.f57076f.a().w();
    }

    public final void o() {
        this.f57073c.o(this, true, false, null);
    }

    @NotNull
    public final C6358h p(@NotNull L response) throws IOException {
        InterfaceC6354d interfaceC6354d = this.f57076f;
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            String q11 = L.q(response, "Content-Type");
            long g10 = interfaceC6354d.g(response);
            return new C6358h(q11, g10, z.d(new b(this, interfaceC6354d.c(response), g10)));
        } catch (IOException e11) {
            this.f57074d.responseFailed(this.f57073c, e11);
            t(e11);
            throw e11;
        }
    }

    public final L.a q(boolean z11) throws IOException {
        try {
            L.a h11 = this.f57076f.h(z11);
            if (h11 == null) {
                return h11;
            }
            h11.k(this);
            return h11;
        } catch (IOException e11) {
            this.f57074d.responseFailed(this.f57073c, e11);
            t(e11);
            throw e11;
        }
    }

    public final void r(@NotNull L response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.f57074d.responseHeadersEnd(this.f57073c, response);
    }

    public final void s() {
        this.f57074d.responseHeadersStart(this.f57073c);
    }

    public final void u(@NotNull G request) throws IOException {
        C5824e c5824e = this.f57073c;
        v vVar = this.f57074d;
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            vVar.requestHeadersStart(c5824e);
            this.f57076f.f(request);
            vVar.requestHeadersEnd(c5824e, request);
        } catch (IOException e11) {
            vVar.requestFailed(c5824e, e11);
            t(e11);
            throw e11;
        }
    }
}
