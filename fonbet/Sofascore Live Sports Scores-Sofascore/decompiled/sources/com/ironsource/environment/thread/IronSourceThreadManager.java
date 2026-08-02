package com.ironsource.environment.thread;

import android.os.Handler;
import com.ironsource.C4149je;
import com.ironsource.C4157k4;
import com.ironsource.Cf;
import com.ironsource.Df;
import com.ironsource.R9;
import defpackage.be5;
import defpackage.joa;
import defpackage.wd5;
import defpackage.wkn;
import defpackage.xd5;
import defpackage.xka;
import defpackage.ypa;
import defpackage.yq5;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class IronSourceThreadManager {
    private static boolean a;

    @NotNull
    public static final IronSourceThreadManager INSTANCE = new IronSourceThreadManager();

    @NotNull
    private static final joa b = ypa.b(d.a);

    @NotNull
    private static final joa c = ypa.b(g.a);

    @NotNull
    private static final joa d = ypa.b(c.a);

    @NotNull
    private static final joa e = ypa.b(h.a);

    @NotNull
    private static final joa f = ypa.b(e.a);

    @NotNull
    private static final joa g = ypa.b(a.a);

    @NotNull
    private static final joa h = ypa.b(f.a);

    @NotNull
    private static final joa i = ypa.b(b.a);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a extends xka implements Function0<R9> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R9 invoke() {
            R9 r9 = new R9("adapterBackground");
            r9.start();
            r9.a();
            return r9;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b extends xka implements Function0<C4149je> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4149je invoke() {
            return new C4149je(0, null, 3, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class c extends xka implements Function0<Handler> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            R9 r9 = new R9("IronSourceInitiatorHandler");
            r9.start();
            r9.a();
            return new Handler(r9.getLooper());
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class d extends xka implements Function0<com.ironsource.environment.thread.b> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.environment.thread.b invoke() {
            return com.ironsource.environment.thread.b.c.a("LevelPlayThread");
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class e extends xka implements Function0<R9> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R9 invoke() {
            R9 r9 = new R9("mediationBackground");
            r9.start();
            r9.a();
            return r9;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class f extends xka implements Function0<R9> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R9 invoke() {
            R9 r9 = new R9("publisher-callbacks");
            r9.start();
            r9.a();
            return r9;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class g extends xka implements Function0<Cf> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Cf invoke() {
            return new Cf(null, null, null, 7, null);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class h extends xka implements Function0<R9> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R9 invoke() {
            R9 r9 = new R9("managersThread");
            r9.start();
            r9.a();
            return r9;
        }
    }

    private IronSourceThreadManager() {
    }

    private final boolean a(Runnable runnable) {
        return a && b().getQueue().contains(runnable);
    }

    private final C4149je b() {
        return (C4149je) i.getValue();
    }

    private final R9 c() {
        return (R9) f.getValue();
    }

    private final R9 d() {
        return (R9) h.getValue();
    }

    private final Cf e() {
        return (Cf) c.getValue();
    }

    public static /* synthetic */ void postAdapterBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postAdapterBackgroundTask(runnable, j);
    }

    public static /* synthetic */ void postMediationBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postMediationBackgroundTask(runnable, j);
    }

    public static /* synthetic */ Df.a postOnUiThreadTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        return ironSourceThreadManager.postOnUiThreadTask(runnable, j);
    }

    public static /* synthetic */ void postPublisherCallback$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postPublisherCallback(runnable, j);
    }

    public final void executeTasks(boolean z, boolean z2, @NotNull List<? extends Runnable> list) {
        list.getClass();
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
            postMediationBackgroundTask$default(INSTANCE, new yq5(15, it3.next(), countDownLatch), 0L, 2, null);
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e2) {
            C4157k4.d().a(e2);
        }
    }

    @NotNull
    public final Handler getInitHandler() {
        return (Handler) d.getValue();
    }

    @NotNull
    public final com.ironsource.environment.thread.b getLevelPlayThread() {
        return (com.ironsource.environment.thread.b) b.getValue();
    }

    @NotNull
    public final R9 getSharedManagersThread() {
        return (R9) e.getValue();
    }

    @NotNull
    public final ThreadPoolExecutor getThreadPoolExecutor() {
        return new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), Runtime.getRuntime().availableProcessors(), Long.MAX_VALUE, TimeUnit.NANOSECONDS, new LinkedBlockingQueue());
    }

    public final boolean getUseSharedExecutorService() {
        return a;
    }

    public final void postAdapterBackgroundTask(@NotNull Runnable runnable, long j) {
        runnable.getClass();
        if (a) {
            b().schedule(runnable, j, TimeUnit.MILLISECONDS);
        } else {
            a().a(runnable, j);
        }
    }

    public final void postMediationBackgroundTask(@NotNull Runnable runnable, long j) {
        runnable.getClass();
        if (a) {
            b().schedule(runnable, j, TimeUnit.MILLISECONDS);
        } else {
            c().a(runnable, j);
        }
    }

    @NotNull
    public final Df.a postOnUiThreadTask(@NotNull Runnable runnable, long j) {
        runnable.getClass();
        Cf e2 = e();
        wd5 wd5Var = xd5.b;
        return e2.a(runnable, wkn.S(j, be5.MILLISECONDS));
    }

    public final void postPublisherCallback(@NotNull Runnable runnable) {
        runnable.getClass();
        postPublisherCallback$default(this, runnable, 0L, 2, null);
    }

    public final void removeAdapterBackgroundTask(@NotNull Runnable runnable) {
        runnable.getClass();
        if (a(runnable)) {
            b().remove(runnable);
        } else {
            a().b(runnable);
        }
    }

    public final void removeMediationBackgroundTask(@NotNull Runnable runnable) {
        runnable.getClass();
        if (a(runnable)) {
            b().remove(runnable);
        } else {
            c().b(runnable);
        }
    }

    public final void setUseSharedExecutorService(boolean z) {
        a = z;
    }

    public final void postPublisherCallback(@NotNull Runnable runnable, long j) {
        runnable.getClass();
        d().a(runnable, j);
    }

    @NotNull
    public final Df.a postOnUiThreadTask(@NotNull Runnable runnable) {
        runnable.getClass();
        return postOnUiThreadTask$default(this, runnable, 0L, 2, null);
    }

    private final R9 a() {
        return (R9) g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Runnable runnable, CountDownLatch countDownLatch) {
        runnable.getClass();
        countDownLatch.getClass();
        runnable.run();
        a(countDownLatch);
    }

    private static final void a(CountDownLatch countDownLatch) {
        countDownLatch.getClass();
        countDownLatch.countDown();
    }

    public final void postAdapterBackgroundTask(@NotNull Runnable runnable) {
        runnable.getClass();
        postAdapterBackgroundTask$default(this, runnable, 0L, 2, null);
    }

    public final void postMediationBackgroundTask(@NotNull Runnable runnable) {
        runnable.getClass();
        postMediationBackgroundTask$default(this, runnable, 0L, 2, null);
    }
}
