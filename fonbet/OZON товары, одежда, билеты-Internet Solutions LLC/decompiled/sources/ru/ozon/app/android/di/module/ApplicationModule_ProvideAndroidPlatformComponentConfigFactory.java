package ru.ozon.app.android.di.module;

import Jb.e;
import Jb.j;
import ru.ozon.android.hardwareinfo.DeviceType;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentConfig;
import ru.ozon.app.android.platform.flavor.FlavorType;

/* loaded from: classes6.dex */
public final class ApplicationModule_ProvideAndroidPlatformComponentConfigFactory implements e<AndroidPlatformComponentConfig> {
    public static AndroidPlatformComponentConfig provideAndroidPlatformComponentConfig(ApplicationModule applicationModule, boolean z11, DeviceType deviceType, FlavorType flavorType) {
        AndroidPlatformComponentConfig provideAndroidPlatformComponentConfig = applicationModule.provideAndroidPlatformComponentConfig(z11, deviceType, flavorType);
        j.d(provideAndroidPlatformComponentConfig);
        return provideAndroidPlatformComponentConfig;
    }
}
