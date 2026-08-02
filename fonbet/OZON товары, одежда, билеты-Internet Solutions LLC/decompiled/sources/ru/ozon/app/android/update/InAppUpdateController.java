package ru.ozon.app.android.update;

import android.app.Activity;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.lifecycle.ActivityLifecycleCallbacksAdapter;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH&J\n\u0010\f\u001a\u0004\u0018\u00010\u0007H&¨\u0006\r"}, d2 = {"Lru/ozon/app/android/update/InAppUpdateController;", "Lru/ozon/app/android/utils/lifecycle/ActivityLifecycleCallbacksAdapter;", "startUpdate", "", "activity", "Landroid/app/Activity;", "info", "Lru/ozon/app/android/update/InAppUpdateInfo;", "handleResult", "requestCode", "", "resultCode", "getUpdateState", "in-app-update_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface InAppUpdateController extends ActivityLifecycleCallbacksAdapter {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onActivityDestroyed(@NotNull InAppUpdateController inAppUpdateController, @NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            ActivityLifecycleCallbacksAdapter.DefaultImpls.onActivityDestroyed(inAppUpdateController, activity);
        }

        public static void onActivityPaused(@NotNull InAppUpdateController inAppUpdateController, @NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            ActivityLifecycleCallbacksAdapter.DefaultImpls.onActivityPaused(inAppUpdateController, activity);
        }

        public static void onActivityResumed(@NotNull InAppUpdateController inAppUpdateController, @NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            ActivityLifecycleCallbacksAdapter.DefaultImpls.onActivityResumed(inAppUpdateController, activity);
        }

        public static void onActivitySaveInstanceState(@NotNull InAppUpdateController inAppUpdateController, @NotNull Activity activity, @NotNull Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
            ActivityLifecycleCallbacksAdapter.DefaultImpls.onActivitySaveInstanceState(inAppUpdateController, activity, outState);
        }

        public static void onActivityStarted(@NotNull InAppUpdateController inAppUpdateController, @NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            ActivityLifecycleCallbacksAdapter.DefaultImpls.onActivityStarted(inAppUpdateController, activity);
        }

        public static void onActivityStopped(@NotNull InAppUpdateController inAppUpdateController, @NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            ActivityLifecycleCallbacksAdapter.DefaultImpls.onActivityStopped(inAppUpdateController, activity);
        }
    }

    InAppUpdateInfo getUpdateState();

    void handleResult(int requestCode, int resultCode);

    void startUpdate(@NotNull Activity activity, @NotNull InAppUpdateInfo info);
}
