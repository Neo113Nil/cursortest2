package ru.ozon.app.android.utils.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/app/android/utils/lifecycle/ActivityLifecycleCallbacksAdapter;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ActivityLifecycleCallbacksAdapter extends Application.ActivityLifecycleCallbacks {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onActivityCreated(@NotNull ActivityLifecycleCallbacksAdapter activityLifecycleCallbacksAdapter, @NotNull Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        public static void onActivityDestroyed(@NotNull ActivityLifecycleCallbacksAdapter activityLifecycleCallbacksAdapter, @NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        public static void onActivityPaused(@NotNull ActivityLifecycleCallbacksAdapter activityLifecycleCallbacksAdapter, @NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        public static void onActivityResumed(@NotNull ActivityLifecycleCallbacksAdapter activityLifecycleCallbacksAdapter, @NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        public static void onActivitySaveInstanceState(@NotNull ActivityLifecycleCallbacksAdapter activityLifecycleCallbacksAdapter, @NotNull Activity activity, @NotNull Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        public static void onActivityStarted(@NotNull ActivityLifecycleCallbacksAdapter activityLifecycleCallbacksAdapter, @NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        public static void onActivityStopped(@NotNull ActivityLifecycleCallbacksAdapter activityLifecycleCallbacksAdapter, @NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }
}
