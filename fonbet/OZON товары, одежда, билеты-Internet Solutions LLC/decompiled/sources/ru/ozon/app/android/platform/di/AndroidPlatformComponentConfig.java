package ru.ozon.app.android.platform.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.hardwareinfo.DeviceType;
import ru.ozon.app.android.platform.flavor.FlavorType;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;", "", "isDebug", "", "deviceType", "Lru/ozon/android/hardwareinfo/DeviceType;", "flavorType", "Lru/ozon/app/android/platform/flavor/FlavorType;", "<init>", "(ZLru/ozon/android/hardwareinfo/DeviceType;Lru/ozon/app/android/platform/flavor/FlavorType;)V", "()Z", "getDeviceType", "()Lru/ozon/android/hardwareinfo/DeviceType;", "getFlavorType", "()Lru/ozon/app/android/platform/flavor/FlavorType;", "android-platform_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidPlatformComponentConfig {

    @NotNull
    private final DeviceType deviceType;

    @NotNull
    private final FlavorType flavorType;
    private final boolean isDebug;

    public AndroidPlatformComponentConfig(boolean z11, @NotNull DeviceType deviceType, @NotNull FlavorType flavorType) {
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(flavorType, "flavorType");
        this.isDebug = z11;
        this.deviceType = deviceType;
        this.flavorType = flavorType;
    }

    @NotNull
    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final FlavorType getFlavorType() {
        return this.flavorType;
    }

    /* renamed from: isDebug, reason: from getter */
    public final boolean getIsDebug() {
        return this.isDebug;
    }
}
