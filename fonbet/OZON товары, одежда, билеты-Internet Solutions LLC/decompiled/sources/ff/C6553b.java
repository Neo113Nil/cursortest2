package ff;

import E0.C2942q;
import I0.C3173b;
import We.A;
import We.E;
import We.InterfaceC4875q;
import We.L;
import We.z;
import cf.j;
import ef.C6355e;
import ef.C6360j;
import ef.InterfaceC6354d;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;
import sf.F;
import sf.G;
import sf.K;
import sf.M;
import sf.N;
import sf.r;

/* renamed from: ff.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C6553b implements InterfaceC6354d {

    /* renamed from: a, reason: collision with root package name */
    private int f63370a;

    /* renamed from: b, reason: collision with root package name */
    private final C6552a f63371b;

    /* renamed from: c, reason: collision with root package name */
    private z f63372c;

    /* renamed from: d, reason: collision with root package name */
    private final E f63373d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final j f63374e;

    /* renamed from: f, reason: collision with root package name */
    private final G f63375f;

    /* renamed from: g, reason: collision with root package name */
    private final F f63376g;

    /* renamed from: ff.b$a */
    private abstract class a implements M {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final r f63377a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f63378b;

        public a() {
            this.f63377a = new r(((G) C6553b.this.f63375f).f98666a.timeout());
        }

        protected final boolean c() {
            return this.f63378b;
        }

        public final void d() {
            C6553b c6553b = C6553b.this;
            if (c6553b.f63370a == 6) {
                return;
            }
            if (c6553b.f63370a == 5) {
                C6553b.i(c6553b, this.f63377a);
                c6553b.f63370a = 6;
            } else {
                throw new IllegalStateException("state: " + c6553b.f63370a);
            }
        }

        protected final void j() {
            this.f63378b = true;
        }

        @Override // sf.M
        public long read(@NotNull C9681g sink, long j11) {
            C6553b c6553b = C6553b.this;
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                return ((G) c6553b.f63375f).read(sink, j11);
            } catch (IOException e11) {
                c6553b.a().w();
                d();
                throw e11;
            }
        }

        @Override // sf.M
        @NotNull
        public final N timeout() {
            return this.f63377a;
        }
    }

    /* renamed from: ff.b$b, reason: collision with other inner class name */
    private final class C1019b implements K {

        /* renamed from: a, reason: collision with root package name */
        private final r f63380a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f63381b;

        public C1019b() {
            this.f63380a = new r(((F) C6553b.this.f63376g).f98662a.timeout());
        }

        @Override // sf.K, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.f63381b) {
                return;
            }
            this.f63381b = true;
            ((F) C6553b.this.f63376g).h1("0\r\n\r\n");
            C6553b.i(C6553b.this, this.f63380a);
            C6553b.this.f63370a = 3;
        }

        @Override // sf.K, java.io.Flushable
        public final synchronized void flush() {
            if (this.f63381b) {
                return;
            }
            ((F) C6553b.this.f63376g).flush();
        }

        @Override // sf.K
        @NotNull
        public final N timeout() {
            return this.f63380a;
        }

        @Override // sf.K
        public final void z0(@NotNull C9681g source, long j11) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f63381b) {
                throw new IllegalStateException("closed");
            }
            if (j11 == 0) {
                return;
            }
            C6553b c6553b = C6553b.this;
            F f7 = (F) c6553b.f63376g;
            if (f7.f98664c) {
                throw new IllegalStateException("closed");
            }
            f7.f98663b.o0(j11);
            f7.c();
            ((F) c6553b.f63376g).h1("\r\n");
            ((F) c6553b.f63376g).z0(source, j11);
            ((F) c6553b.f63376g).h1("\r\n");
        }
    }

    /* renamed from: ff.b$c */
    private final class c extends a {

        /* renamed from: d, reason: collision with root package name */
        private long f63383d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f63384e;

        /* renamed from: f, reason: collision with root package name */
        private final A f63385f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C6553b f63386g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull C6553b c6553b, A url) {
            super();
            Intrinsics.checkNotNullParameter(url, "url");
            this.f63386g = c6553b;
            this.f63385f = url;
            this.f63383d = -1L;
            this.f63384e = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (c()) {
                return;
            }
            if (this.f63384e) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (!Ye.b.j(this)) {
                    this.f63386g.a().w();
                    d();
                }
            }
            j();
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x00bb, code lost:
        
            if (r10.f63384e == false) goto L34;
         */
        @Override // ff.C6553b.a, sf.M
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final long read(@NotNull C9681g sink, long j11) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j11 < 0) {
                throw new IllegalArgumentException(C3173b.b(j11, "byteCount < 0: ").toString());
            }
            if (c()) {
                throw new IllegalStateException("closed");
            }
            if (this.f63384e) {
                long j12 = this.f63383d;
                C6553b c6553b = this.f63386g;
                if (j12 == 0 || j12 == -1) {
                    if (j12 != -1) {
                        ((G) c6553b.f63375f).s(Long.MAX_VALUE);
                    }
                    try {
                        this.f63383d = ((G) c6553b.f63375f).k();
                        String obj = h.z0(((G) c6553b.f63375f).s(Long.MAX_VALUE)).toString();
                        if (this.f63383d < 0 || (obj.length() > 0 && !h.e0(obj, ";", false))) {
                            throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f63383d + obj + '\"');
                        }
                        if (this.f63383d == 0) {
                            this.f63384e = false;
                            C6552a c6552a = c6553b.f63371b;
                            c6552a.getClass();
                            z.a aVar = new z.a();
                            while (true) {
                                String a11 = c6552a.a();
                                if (a11.length() == 0) {
                                    break;
                                }
                                aVar.b(a11);
                            }
                            c6553b.f63372c = aVar.e();
                            E e11 = c6553b.f63373d;
                            Intrinsics.f(e11);
                            InterfaceC4875q m11 = e11.m();
                            z zVar = c6553b.f63372c;
                            Intrinsics.f(zVar);
                            C6355e.e(m11, this.f63385f, zVar);
                            d();
                        }
                    } catch (NumberFormatException e12) {
                        throw new ProtocolException(e12.getMessage());
                    }
                }
                long read = super.read(sink, Math.min(j11, this.f63383d));
                if (read != -1) {
                    this.f63383d -= read;
                    return read;
                }
                c6553b.a().w();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                d();
                throw protocolException;
            }
            return -1L;
        }
    }

    /* renamed from: ff.b$d */
    private final class d extends a {

        /* renamed from: d, reason: collision with root package name */
        private long f63387d;

        public d(long j11) {
            super();
            this.f63387d = j11;
            if (j11 == 0) {
                d();
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (c()) {
                return;
            }
            if (this.f63387d != 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (!Ye.b.j(this)) {
                    C6553b.this.a().w();
                    d();
                }
            }
            j();
        }

        @Override // ff.C6553b.a, sf.M
        public final long read(@NotNull C9681g sink, long j11) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j11 < 0) {
                throw new IllegalArgumentException(C3173b.b(j11, "byteCount < 0: ").toString());
            }
            if (c()) {
                throw new IllegalStateException("closed");
            }
            long j12 = this.f63387d;
            if (j12 == 0) {
                return -1L;
            }
            long read = super.read(sink, Math.min(j12, j11));
            if (read == -1) {
                C6553b.this.a().w();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                d();
                throw protocolException;
            }
            long j13 = this.f63387d - read;
            this.f63387d = j13;
            if (j13 == 0) {
                d();
            }
            return read;
        }
    }

    /* renamed from: ff.b$e */
    private final class e implements K {

        /* renamed from: a, reason: collision with root package name */
        private final r f63389a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f63390b;

        public e() {
            this.f63389a = new r(((F) C6553b.this.f63376g).f98662a.timeout());
        }

        @Override // sf.K, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f63390b) {
                return;
            }
            this.f63390b = true;
            C6553b c6553b = C6553b.this;
            C6553b.i(c6553b, this.f63389a);
            c6553b.f63370a = 3;
        }

        @Override // sf.K, java.io.Flushable
        public final void flush() {
            if (this.f63390b) {
                return;
            }
            ((F) C6553b.this.f63376g).flush();
        }

        @Override // sf.K
        @NotNull
        public final N timeout() {
            return this.f63389a;
        }

        @Override // sf.K
        public final void z0(@NotNull C9681g source, long j11) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f63390b) {
                throw new IllegalStateException("closed");
            }
            long size = source.size();
            byte[] bArr = Ye.b.f34900a;
            if (j11 < 0 || 0 > size || size < j11) {
                throw new ArrayIndexOutOfBoundsException();
            }
            ((F) C6553b.this.f63376g).z0(source, j11);
        }
    }

    /* renamed from: ff.b$f */
    private final class f extends a {

        /* renamed from: d, reason: collision with root package name */
        private boolean f63392d;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (c()) {
                return;
            }
            if (!this.f63392d) {
                d();
            }
            j();
        }

        @Override // ff.C6553b.a, sf.M
        public final long read(@NotNull C9681g sink, long j11) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j11 < 0) {
                throw new IllegalArgumentException(C3173b.b(j11, "byteCount < 0: ").toString());
            }
            if (c()) {
                throw new IllegalStateException("closed");
            }
            if (this.f63392d) {
                return -1L;
            }
            long read = super.read(sink, j11);
            if (read != -1) {
                return read;
            }
            this.f63392d = true;
            d();
            return -1L;
        }
    }

    public C6553b(E e11, @NotNull j connection, @NotNull G source, @NotNull F sink) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f63373d = e11;
        this.f63374e = connection;
        this.f63375f = source;
        this.f63376g = sink;
        this.f63371b = new C6552a(source);
    }

    public static final void i(C6553b c6553b, r rVar) {
        c6553b.getClass();
        N i11 = rVar.i();
        rVar.j(N.f98683d);
        i11.a();
        i11.b();
    }

    private final M r(long j11) {
        if (this.f63370a == 4) {
            this.f63370a = 5;
            return new d(j11);
        }
        throw new IllegalStateException(("state: " + this.f63370a).toString());
    }

    @Override // ef.InterfaceC6354d
    @NotNull
    public final j a() {
        return this.f63374e;
    }

    @Override // ef.InterfaceC6354d
    @NotNull
    public final K b(@NotNull We.G request, long j11) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request.a() != null && request.a().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(request.d("Transfer-Encoding"))) {
            if (this.f63370a == 1) {
                this.f63370a = 2;
                return new C1019b();
            }
            throw new IllegalStateException(("state: " + this.f63370a).toString());
        }
        if (j11 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f63370a == 1) {
            this.f63370a = 2;
            return new e();
        }
        throw new IllegalStateException(("state: " + this.f63370a).toString());
    }

    @Override // ef.InterfaceC6354d
    @NotNull
    public final M c(@NotNull L response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!C6355e.b(response)) {
            return r(0L);
        }
        if ("chunked".equalsIgnoreCase(L.q(response, "Transfer-Encoding"))) {
            A j11 = response.L().j();
            if (this.f63370a == 4) {
                this.f63370a = 5;
                return new c(this, j11);
            }
            throw new IllegalStateException(("state: " + this.f63370a).toString());
        }
        long m11 = Ye.b.m(response);
        if (m11 != -1) {
            return r(m11);
        }
        if (this.f63370a == 4) {
            this.f63370a = 5;
            this.f63374e.w();
            return new f();
        }
        throw new IllegalStateException(("state: " + this.f63370a).toString());
    }

    @Override // ef.InterfaceC6354d
    public final void cancel() {
        this.f63374e.e();
    }

    @Override // ef.InterfaceC6354d
    public final void d() {
        this.f63376g.flush();
    }

    @Override // ef.InterfaceC6354d
    public final void e() {
        this.f63376g.flush();
    }

    @Override // ef.InterfaceC6354d
    public final void f(@NotNull We.G request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Proxy.Type proxyType = this.f63374e.x().b().type();
        Intrinsics.checkNotNullExpressionValue(proxyType, "connection.route().proxy.type()");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.h());
        sb2.append(' ');
        if (request.g() || proxyType != Proxy.Type.HTTP) {
            A url = request.j();
            Intrinsics.checkNotNullParameter(url, "url");
            String c11 = url.c();
            String e11 = url.e();
            if (e11 != null) {
                c11 = c11 + '?' + e11;
            }
            sb2.append(c11);
        } else {
            sb2.append(request.j());
        }
        t(request.e(), C2942q.c(sb2, " HTTP/1.1", "StringBuilder().apply(builderAction).toString()"));
    }

    @Override // ef.InterfaceC6354d
    public final long g(@NotNull L response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!C6355e.b(response)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(L.q(response, "Transfer-Encoding"))) {
            return -1L;
        }
        return Ye.b.m(response);
    }

    @Override // ef.InterfaceC6354d
    public final L.a h(boolean z11) {
        C6552a c6552a = this.f63371b;
        int i11 = this.f63370a;
        if (i11 != 1 && i11 != 3) {
            throw new IllegalStateException(("state: " + this.f63370a).toString());
        }
        try {
            C6360j a11 = C6360j.a.a(c6552a.a());
            int i12 = a11.f62237b;
            L.a aVar = new L.a();
            aVar.o(a11.f62236a);
            aVar.f(i12);
            aVar.l(a11.f62238c);
            z.a aVar2 = new z.a();
            while (true) {
                String a12 = c6552a.a();
                if (a12.length() == 0) {
                    break;
                }
                aVar2.b(a12);
            }
            aVar.j(aVar2.e());
            if (z11 && i12 == 100) {
                return null;
            }
            if (i12 == 100) {
                this.f63370a = 3;
                return aVar;
            }
            this.f63370a = 4;
            return aVar;
        } catch (EOFException e11) {
            throw new IOException(Nk.a.b("unexpected end of stream on ", this.f63374e.x().a().l().s()), e11);
        }
    }

    public final void s(@NotNull L response) {
        Intrinsics.checkNotNullParameter(response, "response");
        long m11 = Ye.b.m(response);
        if (m11 == -1) {
            return;
        }
        M r11 = r(m11);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Ye.b.x(r11, Integer.MAX_VALUE);
        ((d) r11).close();
    }

    public final void t(@NotNull z headers, @NotNull String requestLine) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        if (this.f63370a != 0) {
            throw new IllegalStateException(("state: " + this.f63370a).toString());
        }
        F f7 = this.f63376g;
        f7.h1(requestLine);
        f7.h1("\r\n");
        int size = headers.size();
        for (int i11 = 0; i11 < size; i11++) {
            f7.h1(headers.e(i11));
            f7.h1(": ");
            f7.h1(headers.k(i11));
            f7.h1("\r\n");
        }
        f7.h1("\r\n");
        this.f63370a = 1;
    }
}
