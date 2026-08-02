package ru.ozon.app.android.di.module;

import Fb0.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.hardwareinfo.DeviceType;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentConfig;
import ru.ozon.app.android.platform.flavor.FlavorType;
import ru.ozon.app.android.push.di.PushComponentConfig;
import ru.ozon.app.android.storage.di.StorageComponentConfig;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J?\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/di/module/ApplicationModule;", "", "<init>", "()V", "Lru/ozon/app/android/storage/di/StorageComponentConfig;", "provideStorageComponentConfig", "()Lru/ozon/app/android/storage/di/StorageComponentConfig;", "", "pushNotificationsAppName", "pushNotificationsAppBuildType", "", "notificationIcon", "LFb0/e;", "appDomain", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/push/di/PushComponentConfig;", "providePushComponentConfig", "(Ljava/lang/String;Ljava/lang/String;ILFb0/e;Lru/ozon/app/android/utils/AppType;)Lru/ozon/app/android/push/di/PushComponentConfig;", "", "isDebug", "Lru/ozon/android/hardwareinfo/DeviceType;", "deviceType", "Lru/ozon/app/android/platform/flavor/FlavorType;", "flavorType", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;", "provideAndroidPlatformComponentConfig", "(ZLru/ozon/android/hardwareinfo/DeviceType;Lru/ozon/app/android/platform/flavor/FlavorType;)Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ApplicationModule {
    @NotNull
    public final AndroidPlatformComponentConfig provideAndroidPlatformComponentConfig(boolean isDebug, @NotNull DeviceType deviceType, @NotNull FlavorType flavorType) {
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(flavorType, "flavorType");
        return new AndroidPlatformComponentConfig(isDebug, deviceType, flavorType);
    }

    @NotNull
    public final PushComponentConfig providePushComponentConfig(@NotNull String pushNotificationsAppName, @NotNull String pushNotificationsAppBuildType, int notificationIcon, @NotNull e appDomain, @NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(pushNotificationsAppName, "pushNotificationsAppName");
        Intrinsics.checkNotNullParameter(pushNotificationsAppBuildType, "pushNotificationsAppBuildType");
        Intrinsics.checkNotNullParameter(appDomain, "appDomain");
        Intrinsics.checkNotNullParameter(appType, "appType");
        return new PushComponentConfig(pushNotificationsAppName, pushNotificationsAppBuildType, notificationIcon, appDomain, appType);
    }

    @NotNull
    public final StorageComponentConfig provideStorageComponentConfig() {
        return new StorageComponentConfig(2698, "19.28.0", "19.28.0", "668c22aa");
    }
}
