package ru.ozon.app.android.platform.orientation;

import Lm0.a;
import android.app.Activity;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.hardwareinfo.DeviceType;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentConfig;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/platform/orientation/ScreenOrientationDelegateImpl;", "Lru/ozon/app/android/platform/orientation/ScreenOrientationDelegate;", "config", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "<init>", "(Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "requestOrientation", "", "activity", "Landroid/app/Activity;", "requestTabletOrientation", "requestOrientationSafely", "orientationFlag", "", "android-platform_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ScreenOrientationDelegateImpl implements ScreenOrientationDelegate {

    @NotNull
    private final AndroidPlatformComponentConfig config;

    @NotNull
    private final FeatureChecker featureChecker;

    public ScreenOrientationDelegateImpl(@NotNull AndroidPlatformComponentConfig config, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.config = config;
        this.featureChecker = featureChecker;
    }

    private final void requestOrientationSafely(Activity activity, int orientationFlag) {
        if (Build.VERSION.SDK_INT != 26) {
            activity.setRequestedOrientation(orientationFlag);
            return;
        }
        try {
            activity.setRequestedOrientation(orientationFlag);
        } catch (Exception e11) {
            a.f17149a.e(e11);
        }
    }

    @Override // ru.ozon.app.android.platform.orientation.ScreenOrientationDelegate
    public void requestOrientation(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        requestOrientationSafely(activity, this.config.getDeviceType() == DeviceType.MOBILE ? 1 : 13);
    }

    @Override // ru.ozon.app.android.platform.orientation.ScreenOrientationDelegate
    public void requestTabletOrientation(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.config.getDeviceType() == DeviceType.MOBILE) {
            return;
        }
        requestOrientationSafely(activity, activity.getResources().getConfiguration().orientation == 2 ? 11 : 12);
    }
}
