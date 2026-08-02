package com.ironsource.environment.thread;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.C4339gg;
import com.ironsource.C4426le;
import com.ironsource.C4452n4;
import com.ironsource.Ef;
import com.ironsource.Ff;
import com.ironsource.Hf;
import com.ironsource.Kb;
import com.ironsource.S9;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.jvm.internal.Lambda;
import kotlin.time.DurationUnit;
import xsna.bpn0;
import xsna.d7n;
import xsna.eoo;
import xsna.fq;
import xsna.gzs;
import xsna.v20;
import xsna.zno;

/* loaded from: classes13.dex */
public final class IronSourceThreadManager {
    public static final IronSourceThreadManager INSTANCE;
    private static boolean a;
    private static final Lazy b;
    private static final Lazy c;
    private static final AtomicReference<Ff> d;
    private static final Lazy e;
    private static final Lazy f;
    private static final Lazy g;
    private static final Lazy h;
    private static final Lazy i;
    private static final Lazy j;

    public static final class a extends Lambda implements gzs<S9> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S9 invoke() {
            S9 s9 = new S9("adapterBackground");
            s9.start();
            s9.a();
            return s9;
        }
    }

    public static final class b extends Lambda implements gzs<C4426le> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4426le invoke() {
            return new C4426le(0, null, 3, 0 == true ? 1 : 0);
        }
    }

    public static final class c extends Lambda implements gzs<Handler> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            S9 s9 = new S9("IronSourceInitiatorHandler");
            s9.start();
            s9.a();
            return new Handler(s9.getLooper());
        }
    }

    public static final class e extends Lambda implements gzs<com.ironsource.environment.thread.a> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.environment.thread.a invoke() {
            return com.ironsource.environment.thread.a.c.a("LevelPlayThread");
        }
    }

    public static final class f extends Lambda implements gzs<S9> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S9 invoke() {
            S9 s9 = new S9("mediationBackground");
            s9.start();
            s9.a();
            return s9;
        }
    }

    public static final class g extends Lambda implements gzs<S9> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S9 invoke() {
            S9 s9 = new S9("publisher-callbacks");
            s9.start();
            s9.a();
            return s9;
        }
    }

    public static final class h extends Lambda implements gzs<S9> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S9 invoke() {
            S9 s9 = new S9("managersThread");
            s9.start();
            s9.a();
            return s9;
        }
    }

    public static final class i extends Lambda implements gzs<Handler> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    static {
        IronSourceThreadManager ironSourceThreadManager = new IronSourceThreadManager();
        INSTANCE = ironSourceThreadManager;
        b = new bpn0(i.a);
        c = new bpn0(e.a);
        d = new AtomicReference<>(ironSourceThreadManager.f());
        e = new bpn0(c.a);
        f = new bpn0(h.a);
        g = new bpn0(f.a);
        h = new bpn0(a.a);
        i = new bpn0(g.a);
        j = new bpn0(b.a);
    }

    private IronSourceThreadManager() {
    }

    private final S9 a() {
        return (S9) h.getValue();
    }

    private final S9 d() {
        return (S9) i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler e() {
        return (Handler) b.getValue();
    }

    private final Ef f() {
        return new Ef(new d(), new fq(16));
    }

    public static /* synthetic */ void postAdapterBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        ironSourceThreadManager.postAdapterBackgroundTask(runnable, j2);
    }

    public static /* synthetic */ void postMediationBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        ironSourceThreadManager.postMediationBackgroundTask(runnable, j2);
    }

    public static /* synthetic */ Ff.a postOnUiThreadTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        return ironSourceThreadManager.postOnUiThreadTask(runnable, j2);
    }

    public static /* synthetic */ void postPublisherCallback$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        ironSourceThreadManager.postPublisherCallback(runnable, j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void changeToUISchedulerIfNeeded() {
        if (Kb.u.d().h().z()) {
            d.set(new Ef(null, C4339gg.a(e()), 1, 0 == true ? 1 : 0));
        }
    }

    public final void executeTasks(boolean z, boolean z2, List<? extends Runnable> list) {
        if (!z) {
            Iterator<? extends Runnable> it = list.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            return;
        }
        if (!z2) {
            Iterator<? extends Runnable> it2 = list.iterator();
            while (it2.hasNext()) {
                postMediationBackgroundTask$default(INSTANCE, it2.next(), 0L, 2, null);
            }
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(list.size());
        Iterator<? extends Runnable> it3 = list.iterator();
        while (it3.hasNext()) {
            postMediationBackgroundTask$default(INSTANCE, new d7n(3, it3.next(), countDownLatch), 0L, 2, null);
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e2) {
            C4452n4.d().a(e2);
        }
    }

    public final Handler getInitHandler() {
        return (Handler) e.getValue();
    }

    public final com.ironsource.environment.thread.a getLevelPlayThread() {
        return (com.ironsource.environment.thread.a) c.getValue();
    }

    public final S9 getSharedManagersThread() {
        return (S9) f.getValue();
    }

    public final ThreadPoolExecutor getThreadPoolExecutor() {
        return new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), Runtime.getRuntime().availableProcessors(), Long.MAX_VALUE, TimeUnit.NANOSECONDS, new LinkedBlockingQueue());
    }

    public final boolean getUseSharedExecutorService() {
        return a;
    }

    public final void postAdapterBackgroundTask(Runnable runnable) {
        postAdapterBackgroundTask$default(this, runnable, 0L, 2, null);
    }

    public final void postMediationBackgroundTask(Runnable runnable) {
        postMediationBackgroundTask$default(this, runnable, 0L, 2, null);
    }

    public final Ff.a postOnUiThreadTask(Runnable runnable) {
        return postOnUiThreadTask$default(this, runnable, 0L, 2, null);
    }

    public final void postPublisherCallback(Runnable runnable) {
        postPublisherCallback$default(this, runnable, 0L, 2, null);
    }

    public final void removeAdapterBackgroundTask(Runnable runnable) {
        if (a(runnable)) {
            b().remove(runnable);
        } else {
            a().b(runnable);
        }
    }

    public final void removeMediationBackgroundTask(Runnable runnable) {
        if (a(runnable)) {
            b().remove(runnable);
        } else {
            c().b(runnable);
        }
    }

    public final void setUseSharedExecutorService(boolean z) {
        a = z;
    }

    public static final class d implements Hf {
        @Override // com.ironsource.Hf
        public Hf.a a(long j, Runnable runnable) {
            IronSourceThreadManager.INSTANCE.e().postDelayed(runnable, j);
            return new v20(runnable, 26);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Runnable runnable) {
            IronSourceThreadManager.INSTANCE.e().removeCallbacks(runnable);
        }
    }

    private final boolean a(Runnable runnable) {
        return a && b().getQueue().contains(runnable);
    }

    private final C4426le b() {
        return (C4426le) j.getValue();
    }

    private final S9 c() {
        return (S9) g.getValue();
    }

    public final void postAdapterBackgroundTask(Runnable runnable, long j2) {
        if (a) {
            b().schedule(runnable, j2, TimeUnit.MILLISECONDS);
        } else {
            a().a(runnable, j2);
        }
    }

    public final void postMediationBackgroundTask(Runnable runnable, long j2) {
        if (a) {
            b().schedule(runnable, j2, TimeUnit.MILLISECONDS);
        } else {
            c().a(runnable, j2);
        }
    }

    public final Ff.a postOnUiThreadTask(Runnable runnable, long j2) {
        Ff ff = d.get();
        zno.a aVar = zno.c;
        return ff.a(runnable, eoo.f(j2, DurationUnit.MILLISECONDS));
    }

    public final void postPublisherCallback(Runnable runnable, long j2) {
        d().a(runnable, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Runnable runnable, CountDownLatch countDownLatch) {
        runnable.run();
        a(countDownLatch);
    }

    private static final void a(CountDownLatch countDownLatch) {
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(gzs gzsVar) {
        gzsVar.invoke();
    }
}
