package yZ;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.ActivityC5043j;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ActivityC5043j f106395a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final EZ.h f106396b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Handler f106397c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final JD.a f106398d;

    private static final class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ActivityC5043j f106399a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final EZ.h f106400b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final EZ.g f106401c;

        public a(@NotNull EZ.g navigator, @NotNull EZ.h navigatorHolder, @NotNull ActivityC5043j activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(navigatorHolder, "navigatorHolder");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            this.f106399a = activity;
            this.f106400b = navigatorHolder;
            this.f106401c = navigator;
            navigatorHolder.b(navigator);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@NotNull Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (this.f106399a == activity) {
                this.f106400b.b(this.f106401c);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            ActivityC5043j activityC5043j = this.f106399a;
            if (activityC5043j == activity) {
                this.f106400b.h(this.f106401c);
                activityC5043j.getApplication().unregisterActivityLifecycleCallbacks(this);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (this.f106399a == activity) {
                this.f106400b.h(this.f106401c);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (this.f106399a == activity) {
                this.f106400b.b(this.f106401c);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (this.f106399a == activity) {
                this.f106400b.b(this.f106401c);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (this.f106399a == activity) {
                this.f106400b.h(this.f106401c);
            }
        }
    }

    public e(@NotNull EZ.g navigator, @NotNull EZ.h navigatorHolder, @NotNull ActivityC5043j activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(navigatorHolder, "navigatorHolder");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f106395a = activity;
        this.f106396b = navigatorHolder;
        a aVar = new a(navigator, navigatorHolder, activity);
        this.f106397c = new Handler(Looper.getMainLooper());
        this.f106398d = new JD.a(this, 3);
        activity.getApplication().registerActivityLifecycleCallbacks(aVar);
    }

    public static void a(e eVar) {
        if (eVar.f106395a.getLifecycle().b().a(AbstractC5434v.b.RESUMED)) {
            eVar.f106396b.i();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f106397c.removeCallbacks(this.f106398d);
        this.f106395a.getLifecycle().e(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f106397c.removeCallbacks(this.f106398d);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f106397c.post(this.f106398d);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f106397c.removeCallbacks(this.f106398d);
    }
}
