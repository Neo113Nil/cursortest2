package org.chromium.net.impl;

import Ra.g;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import gm0.C6752a;
import internal.org.jni_zero.CalledByNative;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.C;
import org.chromium.net.RequestContextConfigOptions;
import org.chromium.net.httpflags.c;
import org.chromium.net.impl.E;
import org.chromium.net.impl.I;

/* loaded from: classes6.dex */
public final class CronetUrlRequestContext extends D {

    /* renamed from: q, reason: collision with root package name */
    private static final HashSet<String> f78780q = new HashSet<>();

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f78781r = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Object f78782a;

    /* renamed from: b, reason: collision with root package name */
    private final ConditionVariable f78783b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicInteger f78784c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f78785d;

    /* renamed from: e, reason: collision with root package name */
    private long f78786e;

    /* renamed from: f, reason: collision with root package name */
    private Thread f78787f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f78788g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f78789h;

    /* renamed from: i, reason: collision with root package name */
    private final org.chromium.base.k<e0> f78790i;

    /* renamed from: j, reason: collision with root package name */
    private final org.chromium.base.k<f0> f78791j;

    /* renamed from: k, reason: collision with root package name */
    private final HashMap f78792k;

    /* renamed from: l, reason: collision with root package name */
    private final ConditionVariable f78793l;

    /* renamed from: m, reason: collision with root package name */
    private long f78794m;

    /* renamed from: n, reason: collision with root package name */
    private final long f78795n;

    /* renamed from: o, reason: collision with root package name */
    private final I f78796o;

    /* renamed from: p, reason: collision with root package name */
    private final I.d f78797p;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final I f78798a;

        /* renamed from: b, reason: collision with root package name */
        private final long f78799b;

        /* renamed from: c, reason: collision with root package name */
        private final I.c f78800c;

        public a(I i11, long j11, long j12, I.d dVar) {
            I.c cVar = new I.c();
            cVar.f78835b = -1;
            cVar.f78836c = -1;
            this.f78800c = cVar;
            this.f78798a = i11;
            cVar.f78834a = j11;
            cVar.f78838e = dVar;
            cVar.f78837d = ImplVersion.getCronetVersion();
            this.f78799b = j12;
        }

        public final void a() {
            int uptimeMillis = (int) (SystemClock.uptimeMillis() - this.f78799b);
            synchronized (this.f78800c) {
                I.c cVar = this.f78800c;
                cVar.f78836c = uptimeMillis;
                if (cVar.f78835b >= 0 && uptimeMillis >= 0) {
                    this.f78798a.d(cVar);
                }
            }
        }

        public final void b() {
            int uptimeMillis = (int) (SystemClock.uptimeMillis() - this.f78799b);
            synchronized (this.f78800c) {
                I.c cVar = this.f78800c;
                cVar.f78835b = uptimeMillis;
                if (uptimeMillis >= 0 && cVar.f78836c >= 0) {
                    this.f78798a.d(cVar);
                }
            }
        }
    }

    public CronetUrlRequestContext(U u11, long j11) {
        Object obj = new Object();
        this.f78782a = obj;
        this.f78783b = new ConditionVariable(false);
        this.f78784c = new AtomicInteger(0);
        this.f78785d = new AtomicInteger(0);
        this.f78788g = new Object();
        this.f78789h = new Object();
        this.f78790i = new org.chromium.base.k<>();
        this.f78791j = new org.chromium.base.k<>();
        this.f78792k = new HashMap();
        this.f78793l = new ConditionVariable();
        this.f78794m = -1L;
        vf.c.c("CronetUrlRequestContext#CronetUrlRequestContext");
        this.f78797p = u11.t();
        boolean b11 = CronetLibraryLoader.b(u11.s(), u11, false);
        if (u11.z() == 1) {
            String I11 = u11.I();
            HashSet<String> hashSet = f78780q;
            synchronized (hashSet) {
                try {
                    if (!hashSet.add(I11)) {
                        throw new IllegalStateException("Disk cache storage path already in use");
                    }
                } finally {
                }
            }
        }
        synchronized (obj) {
            vf.c.c("CronetUrlRequestContext#CronetUrlRequestContext creating adapter");
            new S();
            long M135Cu0D = internal.J.N.M135Cu0D(g(u11));
            this.f78786e = M135Cu0D;
            if (M135Cu0D == 0) {
                throw new NullPointerException("Context Adapter creation failed.");
            }
        }
        I a11 = J.a(u11.s(), u11.t());
        this.f78796o = a11;
        long a12 = a11.a();
        this.f78795n = a12;
        I.a J11 = u11.J();
        try {
            a11.c(a12, J11, f(), u11.t());
        } catch (RuntimeException e11) {
            Log.i(org.chromium.base.j.c("CronetUrlRequestContext"), "Error while trying to log CronetEngine creation: ", e11);
        }
        a aVar = b11 ? new a(this.f78796o, J11.a(), j11, u11.t()) : null;
        CronetLibraryLoader.c(new P(this, aVar));
        if (aVar != null) {
            aVar.b();
        }
    }

    private static I.f f() {
        return new I.f(("Cronet/" + ImplVersion.getCronetVersionWithLastChange()).split("/")[1].split("@")[0]);
    }

    public static long g(U u11) {
        new S();
        c.b bVar = C6752a.a(org.chromium.base.e.b()).b().get("Cronet_override_network_thread_priority");
        c.b bVar2 = C6752a.a(org.chromium.base.e.b()).b().get("Cronet_always_enable_brotli");
        RequestContextConfigOptions.Builder networkThreadPriority = RequestContextConfigOptions.newBuilder().setQuicEnabled(u11.D()).setHttp2Enabled(u11.x()).setBrotliEnabled((bVar2 != null ? bVar2.c() : false) || u11.l()).setDisableCache(u11.m()).setHttpCacheMode(u11.z()).setHttpCacheMaxSize(u11.y()).setMockCertVerifier(0L).setEnableNetworkQualityEstimator(false).setBypassPublicKeyPinningForLocalTrustAnchors(u11.B()).setNetworkThreadPriority(bVar != null ? (int) bVar.f() : 0);
        if (u11.w() != null) {
            networkThreadPriority.setUserAgent(u11.w());
        }
        if (u11.I() != null) {
            networkThreadPriority.setStoragePath(u11.I());
        }
        if (u11.u() != null) {
            networkThreadPriority.setQuicDefaultUserAgentId(u11.u());
        }
        if (u11.r() != null) {
            networkThreadPriority.setExperimentalOptions(u11.r());
        }
        long MB3ntV7V = internal.J.N.MB3ntV7V(networkThreadPriority.build().toByteArray());
        if (MB3ntV7V == 0) {
            throw new IllegalArgumentException("Experimental options parsing failed.");
        }
        for (E.c cVar : u11.E()) {
            new S();
            internal.J.N.MyRIv1Ij(MB3ntV7V, cVar.f78816a, cVar.f78817b, cVar.f78818c);
        }
        Iterator it = u11.C().iterator();
        if (!it.hasNext()) {
            return MB3ntV7V;
        }
        E.b bVar3 = (E.b) it.next();
        new S();
        bVar3.getClass();
        throw null;
    }

    @CalledByNative
    private void initNetworkThread() {
        this.f78787f = Thread.currentThread();
        this.f78783b.open();
    }

    @CalledByNative
    private void onEffectiveConnectionTypeChanged(int i11) {
        synchronized (this.f78788g) {
        }
    }

    @CalledByNative
    private void onRTTOrThroughputEstimatesComputed(int i11, int i12, int i13) {
        synchronized (this.f78788g) {
        }
    }

    @CalledByNative
    private void onRttObservation(int i11, long j11, int i12) {
        synchronized (this.f78788g) {
            try {
                Iterator<e0> it = this.f78790i.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    e0.a();
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @CalledByNative
    private void onThroughputObservation(int i11, long j11, int i12) {
        synchronized (this.f78788g) {
            try {
                Iterator<f0> it = this.f78791j.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    f0.a();
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.chromium.net.i
    public final C.a a(String str, C.b bVar, Va.a aVar) {
        return new b0(str, bVar, aVar, this);
    }

    @Override // org.chromium.net.impl.D
    public final org.chromium.net.k c(String str, C.b bVar, Va.a aVar, int i11, boolean z11, g.d dVar, long j11, String str2, ArrayList arrayList, org.chromium.net.A a11, Va.a aVar2, @NonNull String str3) {
        CronetUrlRequest cronetUrlRequest;
        long j12 = j11 == -1 ? this.f78794m : j11;
        synchronized (this.f78782a) {
            try {
                if (this.f78786e == 0) {
                    throw new IllegalStateException("Engine is shut down.");
                }
                cronetUrlRequest = new CronetUrlRequest(this, str, i11, bVar, aVar, z11, dVar, j12, str2, arrayList, a11, aVar2, str3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cronetUrlRequest;
    }

    final I h() {
        return this.f78796o;
    }

    final I.d i() {
        return this.f78797p;
    }

    final long j() {
        return this.f78795n;
    }

    public final long k() {
        long j11;
        synchronized (this.f78782a) {
            try {
                j11 = this.f78786e;
                if (j11 == 0) {
                    throw new IllegalStateException("Engine is shut down.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j11;
    }

    public final boolean l(Thread thread) {
        return thread == this.f78787f;
    }

    final void m() {
        this.f78784c.decrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n() {
        this.f78785d.decrementAndGet();
    }

    final void o() {
        this.f78785d.incrementAndGet();
        this.f78784c.incrementAndGet();
    }

    final void p(a0 a0Var, final Z z11, g0 g0Var) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f78789h) {
            arrayList.addAll(this.f78792k.values());
        }
        if (g0Var != null) {
            arrayList.add(g0Var);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g0 g0Var2 = (g0) it.next();
            final Q q11 = new Q(g0Var2, a0Var);
            Executor a11 = g0Var2.a();
            vf.c.c("CronetUrlRequestContext#postObservationTaskToExecutor reportRequestFinished");
            z11.b();
            try {
                a11.execute(new Runnable() { // from class: org.chromium.net.impl.O
                    @Override // java.lang.Runnable
                    public final void run() {
                        Runnable runnable = q11;
                        Z z12 = z11;
                        int i11 = CronetUrlRequestContext.f78781r;
                        vf.c.c("CronetUrlRequestContext#postObservationTaskToExecutor reportRequestFinished running callback");
                        try {
                            try {
                                ((Q) runnable).run();
                                if (z12 != null) {
                                    z12.a();
                                }
                            } catch (Exception e11) {
                                org.chromium.base.j.b("CronetUrlRequestContext", "Exception thrown from observation task", e11);
                                if (z12 != null) {
                                    z12.a();
                                }
                            }
                        } catch (Throwable th2) {
                            if (z12 != null) {
                                z12.a();
                            }
                            throw th2;
                        }
                    }
                });
            } catch (RejectedExecutionException e11) {
                z11.a();
                org.chromium.base.j.b("CronetUrlRequestContext", "Exception posting task to executor", e11);
            }
        }
    }

    @CalledByNative
    public final void stopNetLogCompleted() {
        this.f78793l.open();
    }
}
