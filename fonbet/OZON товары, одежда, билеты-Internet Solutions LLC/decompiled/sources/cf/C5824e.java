package cf;

import Sc.C4001c;
import We.A;
import We.C4859a;
import We.C4867i;
import We.C4876s;
import We.E;
import We.G;
import We.InterfaceC4865g;
import We.InterfaceC4866h;
import We.L;
import We.v;
import af.C5011a;
import ef.C6351a;
import ef.C6352b;
import ef.C6357g;
import ef.C6359i;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9677c;

/* renamed from: cf.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5824e implements InterfaceC4865g {

    /* renamed from: a, reason: collision with root package name */
    private final l f57098a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final v f57099b;

    /* renamed from: c, reason: collision with root package name */
    private final c f57100c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f57101d;

    /* renamed from: e, reason: collision with root package name */
    private Object f57102e;

    /* renamed from: f, reason: collision with root package name */
    private C5823d f57103f;

    /* renamed from: g, reason: collision with root package name */
    private j f57104g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f57105h;

    /* renamed from: i, reason: collision with root package name */
    private C5822c f57106i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f57107j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f57108k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f57109l;

    /* renamed from: m, reason: collision with root package name */
    private volatile boolean f57110m;

    /* renamed from: n, reason: collision with root package name */
    private volatile C5822c f57111n;

    /* renamed from: o, reason: collision with root package name */
    private volatile j f57112o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final E f57113p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final G f57114q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f57115r;

    /* renamed from: cf.e$a */
    public final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private volatile AtomicInteger f57116a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC4866h f57117b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C5824e f57118c;

        public a(@NotNull C5824e c5824e, InterfaceC4866h responseCallback) {
            Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
            this.f57118c = c5824e;
            this.f57117b = responseCallback;
            this.f57116a = new AtomicInteger(0);
        }

        public final void a(@NotNull ThreadPoolExecutor executorService) {
            Intrinsics.checkNotNullParameter(executorService, "executorService");
            C5824e c5824e = this.f57118c;
            c5824e.g().getClass();
            byte[] bArr = Ye.b.f34900a;
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e11) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e11);
                    c5824e.p(interruptedIOException);
                    this.f57117b.onFailure(c5824e, interruptedIOException);
                    c5824e.g().n().d(this);
                }
            } catch (Throwable th2) {
                c5824e.g().n().d(this);
                throw th2;
            }
        }

        @NotNull
        public final C5824e b() {
            return this.f57118c;
        }

        @NotNull
        public final AtomicInteger c() {
            return this.f57116a;
        }

        @NotNull
        public final String d() {
            return this.f57118c.l().j().h();
        }

        public final void e(@NotNull a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            this.f57116a = other.f57116a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C4876s n11;
            p002if.j jVar;
            InterfaceC4866h interfaceC4866h = this.f57117b;
            StringBuilder sb2 = new StringBuilder("OkHttp ");
            C5824e c5824e = this.f57118c;
            sb2.append(c5824e.q());
            String sb3 = sb2.toString();
            Thread currentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(currentThread, "currentThread");
            String name = currentThread.getName();
            currentThread.setName(sb3);
            try {
                c5824e.f57100c.r();
                boolean z11 = false;
                try {
                    try {
                        try {
                            interfaceC4866h.onResponse(c5824e, c5824e.m());
                            n11 = c5824e.g().n();
                        } catch (IOException e11) {
                            e = e11;
                            z11 = true;
                            if (z11) {
                                p002if.j.f66400c.getClass();
                                jVar = p002if.j.f66398a;
                                String str = "Callback failure for " + C5824e.b(c5824e);
                                jVar.getClass();
                                p002if.j.j(4, str, e);
                            } else {
                                interfaceC4866h.onFailure(c5824e, e);
                            }
                            n11 = c5824e.g().n();
                            n11.d(this);
                        } catch (Throwable th2) {
                            th = th2;
                            z11 = true;
                            c5824e.cancel();
                            if (!z11) {
                                IOException iOException = new IOException("canceled due to " + th);
                                C4001c.a(iOException, th);
                                interfaceC4866h.onFailure(c5824e, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        c5824e.g().n().d(this);
                        throw th3;
                    }
                } catch (IOException e12) {
                    e = e12;
                } catch (Throwable th4) {
                    th = th4;
                }
                n11.d(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* renamed from: cf.e$b */
    public static final class b extends WeakReference<C5824e> {

        /* renamed from: a, reason: collision with root package name */
        private final Object f57119a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull C5824e referent, Object obj) {
            super(referent);
            Intrinsics.checkNotNullParameter(referent, "referent");
            this.f57119a = obj;
        }

        public final Object a() {
            return this.f57119a;
        }
    }

    /* renamed from: cf.e$c */
    public static final class c extends C9677c {
        c() {
        }

        @Override // sf.C9677c
        protected final void u() {
            C5824e.this.cancel();
        }
    }

    public C5824e(@NotNull E client, @NotNull G originalRequest, boolean z11) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f57113p = client;
        this.f57114q = originalRequest;
        this.f57115r = z11;
        this.f57098a = client.k().b();
        this.f57099b = client.p().create(this);
        c cVar = new c();
        cVar.g(client.g(), TimeUnit.MILLISECONDS);
        Unit unit = Unit.f71690a;
        this.f57100c = cVar;
        this.f57101d = new AtomicBoolean();
        this.f57109l = true;
    }

    public static final String b(C5824e c5824e) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c5824e.f57110m ? "canceled " : "");
        sb2.append(c5824e.f57115r ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(c5824e.q());
        return sb2.toString();
    }

    private final <E extends IOException> E d(E e11) {
        E e12;
        Socket r11;
        byte[] bArr = Ye.b.f34900a;
        j jVar = this.f57104g;
        if (jVar != null) {
            synchronized (jVar) {
                r11 = r();
            }
            if (this.f57104g == null) {
                if (r11 != null) {
                    Ye.b.f(r11);
                }
                this.f57099b.connectionReleased(this, jVar);
            } else if (r11 != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.f57105h && this.f57100c.s()) {
            e12 = new InterruptedIOException("timeout");
            if (e11 != null) {
                e12.initCause(e11);
            }
        } else {
            e12 = e11;
        }
        if (e11 == null) {
            this.f57099b.callEnd(this);
            return e12;
        }
        v vVar = this.f57099b;
        Intrinsics.f(e12);
        vVar.callFailed(this, e12);
        return e12;
    }

    @Override // We.InterfaceC4865g
    public final void E0(@NotNull InterfaceC4866h responseCallback) {
        p002if.j jVar;
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        if (!this.f57101d.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        p002if.j.f66400c.getClass();
        jVar = p002if.j.f66398a;
        this.f57102e = jVar.h();
        this.f57099b.callStart(this);
        this.f57113p.n().a(new a(this, responseCallback));
    }

    public final void c(@NotNull j connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        byte[] bArr = Ye.b.f34900a;
        if (this.f57104g != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f57104g = connection;
        connection.k().add(new b(this, this.f57102e));
    }

    @Override // We.InterfaceC4865g
    public final void cancel() {
        if (this.f57110m) {
            return;
        }
        this.f57110m = true;
        C5822c c5822c = this.f57111n;
        if (c5822c != null) {
            c5822c.b();
        }
        j jVar = this.f57112o;
        if (jVar != null) {
            jVar.e();
        }
        this.f57099b.canceled(this);
    }

    public final Object clone() {
        return new C5824e(this.f57113p, this.f57114q, this.f57115r);
    }

    public final void e(@NotNull G request, boolean z11) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        C4867i c4867i;
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f57106i != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            if (this.f57108k) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.f57107j) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.f71690a;
        }
        if (z11) {
            l lVar = this.f57098a;
            A j11 = request.j();
            boolean i11 = j11.i();
            E e11 = this.f57113p;
            if (i11) {
                sSLSocketFactory = e11.G();
                hostnameVerifier = e11.t();
                c4867i = e11.i();
            } else {
                sSLSocketFactory = null;
                hostnameVerifier = null;
                c4867i = null;
            }
            this.f57103f = new C5823d(lVar, new C4859a(j11.h(), j11.n(), e11.o(), e11.F(), sSLSocketFactory, hostnameVerifier, c4867i, e11.B(), e11.A(), e11.z(), e11.l(), e11.C()), this, this.f57099b);
        }
    }

    @Override // We.InterfaceC4865g
    @NotNull
    public final L execute() {
        p002if.j jVar;
        E e11 = this.f57113p;
        if (!this.f57101d.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f57100c.r();
        p002if.j.f66400c.getClass();
        jVar = p002if.j.f66398a;
        this.f57102e = jVar.h();
        this.f57099b.callStart(this);
        try {
            e11.n().b(this);
            return m();
        } finally {
            e11.n().e(this);
        }
    }

    public final void f(boolean z11) {
        C5822c c5822c;
        synchronized (this) {
            if (!this.f57109l) {
                throw new IllegalStateException("released");
            }
            Unit unit = Unit.f71690a;
        }
        if (z11 && (c5822c = this.f57111n) != null) {
            c5822c.d();
        }
        this.f57106i = null;
    }

    @NotNull
    public final E g() {
        return this.f57113p;
    }

    public final j h() {
        return this.f57104g;
    }

    @NotNull
    public final v i() {
        return this.f57099b;
    }

    @Override // We.InterfaceC4865g
    public final boolean isCanceled() {
        return this.f57110m;
    }

    public final boolean j() {
        return this.f57115r;
    }

    public final C5822c k() {
        return this.f57106i;
    }

    @NotNull
    public final G l() {
        return this.f57114q;
    }

    @NotNull
    public final L m() throws IOException {
        ArrayList arrayList = new ArrayList();
        C7714v.p(this.f57113p.u(), arrayList);
        arrayList.add(new C6359i(this.f57113p));
        arrayList.add(new C6351a(this.f57113p.m()));
        arrayList.add(new C5011a(this.f57113p.f()));
        arrayList.add(C5820a.f57066a);
        if (!this.f57115r) {
            C7714v.p(this.f57113p.w(), arrayList);
        }
        arrayList.add(new C6352b(this.f57115r));
        try {
            try {
                L proceed = new C6357g(this, arrayList, 0, null, this.f57114q, this.f57113p.j(), this.f57113p.D(), this.f57113p.H()).proceed(this.f57114q);
                if (this.f57110m) {
                    Ye.b.e(proceed);
                    throw new IOException("Canceled");
                }
                p(null);
                return proceed;
            } catch (IOException e11) {
                IOException p11 = p(e11);
                if (p11 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                }
                throw p11;
            }
        } catch (Throwable th2) {
            if (0 == 0) {
                p(null);
            }
            throw th2;
        }
    }

    @NotNull
    public final C5822c n(@NotNull C6357g chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        synchronized (this) {
            if (!this.f57109l) {
                throw new IllegalStateException("released");
            }
            if (this.f57108k) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.f57107j) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.f71690a;
        }
        C5823d c5823d = this.f57103f;
        Intrinsics.f(c5823d);
        C5822c c5822c = new C5822c(this, this.f57099b, c5823d, c5823d.a(this.f57113p, chain));
        this.f57106i = c5822c;
        this.f57111n = c5822c;
        synchronized (this) {
            this.f57107j = true;
            this.f57108k = true;
        }
        if (this.f57110m) {
            throw new IOException("Canceled");
        }
        return c5822c;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:42:0x0012, B:10:0x0021, B:12:0x0025, B:13:0x0027, B:15:0x002c, B:19:0x0035, B:21:0x0039, B:25:0x0042, B:7:0x001b), top: B:41:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:42:0x0012, B:10:0x0021, B:12:0x0025, B:13:0x0027, B:15:0x002c, B:19:0x0035, B:21:0x0039, B:25:0x0042, B:7:0x001b), top: B:41:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <E extends IOException> E o(@NotNull C5822c exchange, boolean z11, boolean z12, E e11) {
        boolean z13;
        boolean z14;
        boolean z15;
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        if (Intrinsics.d(exchange, this.f57111n)) {
            synchronized (this) {
                z13 = false;
                if (z11) {
                    try {
                        if (!this.f57107j) {
                        }
                        if (z11) {
                            this.f57107j = false;
                        }
                        if (z12) {
                            this.f57108k = false;
                        }
                        z15 = this.f57107j;
                        boolean z16 = z15 && !this.f57108k;
                        if (!z15 && !this.f57108k && !this.f57109l) {
                            z13 = true;
                        }
                        z14 = z13;
                        z13 = z16;
                        Unit unit = Unit.f71690a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (!z12 || !this.f57108k) {
                    z14 = false;
                    Unit unit2 = Unit.f71690a;
                }
                if (z11) {
                }
                if (z12) {
                }
                z15 = this.f57107j;
                if (z15) {
                }
                if (!z15) {
                    z13 = true;
                }
                z14 = z13;
                z13 = z16;
                Unit unit22 = Unit.f71690a;
            }
            if (z13) {
                this.f57111n = null;
                j jVar = this.f57104g;
                if (jVar != null) {
                    jVar.p();
                }
            }
            if (z14) {
                return (E) d(e11);
            }
        }
        return e11;
    }

    public final IOException p(IOException iOException) {
        boolean z11;
        synchronized (this) {
            try {
                z11 = false;
                if (this.f57109l) {
                    this.f57109l = false;
                    if (!this.f57107j && !this.f57108k) {
                        z11 = true;
                    }
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11 ? d(iOException) : iOException;
    }

    @NotNull
    public final String q() {
        return this.f57114q.j().s();
    }

    public final Socket r() {
        j jVar = this.f57104g;
        Intrinsics.f(jVar);
        byte[] bArr = Ye.b.f34900a;
        ArrayList k11 = jVar.k();
        Iterator it = k11.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (Intrinsics.d((C5824e) ((Reference) it.next()).get(), this)) {
                break;
            }
            i11++;
        }
        if (i11 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        k11.remove(i11);
        this.f57104g = null;
        if (k11.isEmpty()) {
            jVar.y(System.nanoTime());
            if (this.f57098a.c(jVar)) {
                return jVar.A();
            }
        }
        return null;
    }

    @Override // We.InterfaceC4865g
    @NotNull
    public final G request() {
        return this.f57114q;
    }

    public final boolean s() {
        C5823d c5823d = this.f57103f;
        Intrinsics.f(c5823d);
        return c5823d.d();
    }

    public final void t(j jVar) {
        this.f57112o = jVar;
    }

    @Override // We.InterfaceC4865g
    public final c timeout() {
        return this.f57100c;
    }

    public final void u() {
        if (this.f57105h) {
            throw new IllegalStateException("Check failed.");
        }
        this.f57105h = true;
        this.f57100c.s();
    }
}
