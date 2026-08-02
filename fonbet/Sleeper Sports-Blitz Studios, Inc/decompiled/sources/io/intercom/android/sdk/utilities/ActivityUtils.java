package io.intercom.android.sdk.utilities;

import android.app.Activity;
import io.intercom.android.sdk.Intercom;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ActivityUtils.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002R\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u001e\u0010\b\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/utilities/ActivityUtils;", "", "<init>", "()V", "PACKAGE_NAME", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "INTERCOM_PACKAGES", "", "[Ljava/lang/String;", "isHostActivity", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, "Landroid/app/Activity;", "isInHostAppPackage", "activityName", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ActivityUtils {
    public static final int $stable;
    public static final ActivityUtils INSTANCE = new ActivityUtils();
    private static final String[] INTERCOM_PACKAGES;
    private static final String PACKAGE_NAME;

    private ActivityUtils() {
    }

    static {
        String name = Intercom.class.getPackage().getName();
        PACKAGE_NAME = name;
        INTERCOM_PACKAGES = new String[]{name};
        $stable = 8;
    }

    @JvmStatic
    public static final boolean isHostActivity(Activity activity) {
        if (activity == null) {
            return false;
        }
        ActivityUtils activityUtils = INSTANCE;
        String name = activity.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return activityUtils.isInHostAppPackage(name);
    }

    private final boolean isInHostAppPackage(String activityName) {
        for (String str : INTERCOM_PACKAGES) {
            Intrinsics.checkNotNull(str);
            if (StringsKt.startsWith$default(activityName, str, false, 2, (Object) null)) {
                return false;
            }
        }
        return true;
    }
}
