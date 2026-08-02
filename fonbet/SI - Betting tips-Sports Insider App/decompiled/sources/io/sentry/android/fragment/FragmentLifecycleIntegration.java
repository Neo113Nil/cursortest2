package io.sentry.android.fragment;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.k1;
import androidx.fragment.app.p0;
import androidx.fragment.app.q0;
import androidx.fragment.app.w0;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.q1;
import io.sentry.y3;
import io.sentry.z4;
import java.io.Closeable;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rh.g;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\rB!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/sentry/android/fragment/FragmentLifecycleIntegration;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Lio/sentry/q1;", "Ljava/io/Closeable;", "Landroid/app/Application;", "application", "", "Lio/sentry/android/fragment/b;", "filterFragmentLifecycleBreadcrumbs", "", "enableAutoFragmentLifecycleTracing", "<init>", "(Landroid/app/Application;Ljava/util/Set;Z)V", "(Landroid/app/Application;)V", "enableFragmentLifecycleBreadcrumbs", "(Landroid/app/Application;ZZ)V", "sentry-android-fragment_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFragmentLifecycleIntegration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentLifecycleIntegration.kt\nio/sentry/android/fragment/FragmentLifecycleIntegration\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
/* loaded from: classes.dex */
public final class FragmentLifecycleIntegration implements Application.ActivityLifecycleCallbacks, q1, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Application f15905a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f15906b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15907c;

    /* renamed from: d, reason: collision with root package name */
    public y3 f15908d;

    /* renamed from: e, reason: collision with root package name */
    public b6 f15909e;

    static {
        z4.d().b("maven:io.sentry:sentry-android-fragment", "8.30.0");
    }

    public FragmentLifecycleIntegration(@NotNull Application application, @NotNull Set<? extends b> filterFragmentLifecycleBreadcrumbs, boolean z5) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(filterFragmentLifecycleBreadcrumbs, "filterFragmentLifecycleBreadcrumbs");
        this.f15905a = application;
        this.f15906b = filterFragmentLifecycleBreadcrumbs;
        this.f15907c = z5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15905a.unregisterActivityLifecycleCallbacks(this);
        b6 b6Var = this.f15909e;
        if (b6Var != null) {
            if (b6Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("options");
                b6Var = null;
            }
            b6Var.getLogger().h(b5.DEBUG, "FragmentLifecycleIntegration removed.", new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        k1 r5;
        Intrinsics.checkNotNullParameter(activity, "activity");
        y3 y3Var = null;
        p0 p0Var = activity instanceof p0 ? (p0) activity : null;
        if (p0Var == null || (r5 = p0Var.r()) == null) {
            return;
        }
        y3 y3Var2 = this.f15908d;
        if (y3Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scopes");
        } else {
            y3Var = y3Var2;
        }
        d cb2 = new d(y3Var, this.f15906b, this.f15907c);
        q0 q0Var = r5.f1976o;
        q0Var.getClass();
        Intrinsics.checkNotNullParameter(cb2, "cb");
        ((CopyOnWriteArrayList) q0Var.f2048b).add(new w0(cb2));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // io.sentry.q1
    public final void y(b6 options) {
        y3 scopes = y3.f17255a;
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f15908d = scopes;
        this.f15909e = options;
        this.f15905a.registerActivityLifecycleCallbacks(this);
        options.getLogger().h(b5.DEBUG, "FragmentLifecycleIntegration installed.", new Object[0]);
        g.a("FragmentLifecycle");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FragmentLifecycleIntegration(@NotNull Application application) {
        this(application, (Set<? extends b>) r0, false);
        Set set;
        Intrinsics.checkNotNullParameter(application, "application");
        b.Companion.getClass();
        set = b.states;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FragmentLifecycleIntegration(@NotNull Application application, boolean z5, boolean z7) {
        this(application, (Set<? extends b>) (r0 == null ? g0.f19206a : r0), z7);
        Set set;
        Intrinsics.checkNotNullParameter(application, "application");
        b.Companion.getClass();
        set = b.states;
        set = z5 ? set : null;
    }
}
