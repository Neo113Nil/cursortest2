package com.ironsource.environment.thread;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.C2530le;
import com.ironsource.C2556n4;
import com.ironsource.R9;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class IronSourceThreadManager {
    private static boolean a;
    public static final IronSourceThreadManager INSTANCE = new IronSourceThreadManager();
    private static final Lazy b = LazyKt.lazy(g.a);
    private static final Lazy c = LazyKt.lazy(c.a);
    private static final Lazy d = LazyKt.lazy(f.a);
    private static final Lazy e = LazyKt.lazy(d.a);
    private static final Lazy f = LazyKt.lazy(a.a);
    private static final Lazy g = LazyKt.lazy(e.a);
    private static final Lazy h = LazyKt.lazy(b.a);

    static final class a extends Lambda implements Function0<R9> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R9 invoke() {
            R9 r9 = new R9("adapterBackground");
            r9.start();
            r9.a();
            return r9;
        }
    }

    static final class b extends Lambda implements Function0<C2530le> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2530le invoke() {
            return new C2530le(0, null, null, 7, null);
        }
    }

    static final class c extends Lambda implements Function0<Handler> {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            R9 r9 = new R9("IronSourceInitiatorHandler");
            r9.start();
            r9.a();
            return new Handler(r9.getLooper());
        }
    }

    static final class d extends Lambda implements Function0<R9> {
        public static final d a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R9 invoke() {
            R9 r9 = new R9("mediationBackground");
            r9.start();
            r9.a();
            return r9;
        }
    }

    static final class e extends Lambda implements Function0<R9> {
        public static final e a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R9 invoke() {
            R9 r9 = new R9("publisher-callbacks");
            r9.start();
            r9.a();
            return r9;
        }
    }

    static final class f extends Lambda implements Function0<R9> {
        public static final f a = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R9 invoke() {
            R9 r9 = new R9("managersThread");
            r9.start();
            r9.a();
            return r9;
        }
    }

    static final class g extends Lambda implements Function0<Handler> {
        public static final g a = new g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    private IronSourceThreadManager() {
    }

    private final R9 a() {
        return (R9) f.getValue();
    }

    private final C2530le b() {
        return (C2530le) h.getValue();
    }

    private final R9 c() {
        return (R9) e.getValue();
    }

    private final R9 d() {
        return (R9) g.getValue();
    }

    private final Handler e() {
        return (Handler) b.getValue();
    }

    public static /* synthetic */ void postAdapterBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postAdapterBackgroundTask(runnable, j);
    }

    public static /* synthetic */ void postMediationBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postMediationBackgroundTask(runnable, j);
    }

    public static /* synthetic */ void postOnUiThreadTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postOnUiThreadTask(runnable, j);
    }

    public static /* synthetic */ void postPublisherCallback$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postPublisherCallback(runnable, j);
    }

    public final void executeTasks(boolean z, boolean z2, List<? extends Runnable> tasks) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        if (!z) {
            Iterator<? extends Runnable> it = tasks.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            return;
        }
        if (!z2) {
            Iterator<? extends Runnable> it2 = tasks.iterator();
            while (it2.hasNext()) {
                postMediationBackgroundTask$default(INSTANCE, it2.next(), 0L, 2, null);
            }
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(tasks.size());
        for (final Runnable runnable : tasks) {
            postMediationBackgroundTask$default(INSTANCE, new Runnable() { // from class: com.ironsource.environment.thread.IronSourceThreadManager$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    IronSourceThreadManager.a(runnable, countDownLatch);
                }
            }, 0L, 2, null);
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e2) {
            C2556n4.d().a(e2);
        }
    }

    public final Handler getInitHandler() {
        return (Handler) c.getValue();
    }

    public final R9 getSharedManagersThread() {
        return (R9) d.getValue();
    }

    public final ThreadPoolExecutor getThreadPoolExecutor() {
        return new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), Runtime.getRuntime().availableProcessors(), Long.MAX_VALUE, TimeUnit.NANOSECONDS, new LinkedBlockingQueue());
    }

    public final boolean getUseSharedExecutorService() {
        return a;
    }

    public final void postAdapterBackgroundTask(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postAdapterBackgroundTask$default(this, action, 0L, 2, null);
    }

    public final void postMediationBackgroundTask(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postMediationBackgroundTask$default(this, action, 0L, 2, null);
    }

    public final void postOnUiThreadTask(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postOnUiThreadTask$default(this, action, 0L, 2, null);
    }

    public final void postPublisherCallback(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postPublisherCallback$default(this, action, 0L, 2, null);
    }

    public final void removeAdapterBackgroundTask(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (a(action)) {
            b().remove(action);
        } else {
            a().b(action);
        }
    }

    public final void removeMediationBackgroundTask(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (a(action)) {
            b().remove(action);
        } else {
            c().b(action);
        }
    }

    public final void removeUiThreadTask(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        e().removeCallbacks(action);
    }

    public final void setUseSharedExecutorService(boolean z) {
        a = z;
    }

    private final boolean a(Runnable runnable) {
        return a && b().getQueue().contains(runnable);
    }

    public final void postAdapterBackgroundTask(Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (a) {
            b().schedule(action, j, TimeUnit.MILLISECONDS);
        } else {
            a().a(action, j);
        }
    }

    public final void postMediationBackgroundTask(Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (a) {
            b().schedule(action, j, TimeUnit.MILLISECONDS);
        } else {
            c().a(action, j);
        }
    }

    public final void postOnUiThreadTask(Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        e().postDelayed(action, j);
    }

    public final void postPublisherCallback(Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        d().a(action, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Runnable it, final CountDownLatch latch) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(latch, "$latch");
        it.run();
        new Runnable() { // from class: com.ironsource.environment.thread.IronSourceThreadManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                IronSourceThreadManager.a(latch);
            }
        }.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CountDownLatch latch) {
        Intrinsics.checkNotNullParameter(latch, "$latch");
        latch.countDown();
    }
}
