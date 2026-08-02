package com.zoontek.rnbootsplash;

import android.app.Activity;
import io.radar.sdk.RadarTrackingOptions;
import io.sentry.Session;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RNBootSplash.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lcom/zoontek/rnbootsplash/RNBootSplash;", "", "<init>", "()V", Session.JsonKeys.INIT, "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, "Landroid/app/Activity;", "themeResId", "", "react-native-bootsplash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RNBootSplash {
    public static final RNBootSplash INSTANCE = new RNBootSplash();

    private RNBootSplash() {
    }

    @JvmStatic
    public static final void init(Activity activity, int themeResId) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        RNBootSplashModuleImpl.INSTANCE.init$react_native_bootsplash_release(activity, themeResId);
    }
}
