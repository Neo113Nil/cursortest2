package ru.ozon.app.android.platform.di;

import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.platform.bundle.state.ManualSaveRestoreStateDelegate;
import ru.ozon.app.android.platform.bundle.state.ManualStateBundleActivityCallback;
import ru.ozon.app.android.platform.image.ImageResizer;
import ru.ozon.app.android.platform.lifecycle.activity.ActivityLifeCycleHolder;
import ru.ozon.app.android.platform.notifications.EnableNotificationsSuggestingHandler;
import ru.ozon.app.android.platform.orientation.ScreenOrientationDelegate;
import ru.ozon.app.android.platform.theme.DarkThemeManager;
import ru.ozon.app.android.platform.viewutils.RecycledViewPoolViewNullifier;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/platform/di/AndroidPlatformComponentApi;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/platform/theme/DarkThemeManager;", "getDarkThemeManager", "()Lru/ozon/app/android/platform/theme/DarkThemeManager;", "Lru/ozon/app/android/platform/orientation/ScreenOrientationDelegate;", "getScreenOrientationDelegate", "()Lru/ozon/app/android/platform/orientation/ScreenOrientationDelegate;", "Lru/ozon/app/android/platform/image/ImageResizer;", "getImageResizer", "()Lru/ozon/app/android/platform/image/ImageResizer;", "Lru/ozon/app/android/platform/viewutils/RecycledViewPoolViewNullifier;", "recyclerViewPoolNullifier", "()Lru/ozon/app/android/platform/viewutils/RecycledViewPoolViewNullifier;", "Lru/ozon/app/android/platform/lifecycle/activity/ActivityLifeCycleHolder;", "getActivityLifeCycleHolder", "()Lru/ozon/app/android/platform/lifecycle/activity/ActivityLifeCycleHolder;", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;", "getAndroidPlatformComponentConfig", "()Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;", "Lru/ozon/app/android/platform/notifications/EnableNotificationsSuggestingHandler;", "getEnableNotificationsSuggestingHandler", "()Lru/ozon/app/android/platform/notifications/EnableNotificationsSuggestingHandler;", "Lru/ozon/app/android/platform/bundle/state/ManualSaveRestoreStateDelegate;", "getManualSavedStateDelegate", "()Lru/ozon/app/android/platform/bundle/state/ManualSaveRestoreStateDelegate;", "Lru/ozon/app/android/platform/bundle/state/ManualStateBundleActivityCallback;", "getManualStateBundleActivityCallback", "()Lru/ozon/app/android/platform/bundle/state/ManualStateBundleActivityCallback;", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "android-platform_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface AndroidPlatformComponentApi extends InterfaceC6958a {
    @NotNull
    ActivityLifeCycleHolder getActivityLifeCycleHolder();

    @NotNull
    AndroidPlatformComponentConfig getAndroidPlatformComponentConfig();

    @NotNull
    AppType getAppType();

    @NotNull
    DarkThemeManager getDarkThemeManager();

    @NotNull
    EnableNotificationsSuggestingHandler getEnableNotificationsSuggestingHandler();

    @NotNull
    ImageResizer getImageResizer();

    @NotNull
    ManualSaveRestoreStateDelegate getManualSavedStateDelegate();

    @NotNull
    ManualStateBundleActivityCallback getManualStateBundleActivityCallback();

    @NotNull
    ScreenOrientationDelegate getScreenOrientationDelegate();

    @NotNull
    RecycledViewPoolViewNullifier recyclerViewPoolNullifier();
}
