package expo.modules.logbox;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import com.facebook.react.ReactApplication;
import expo.modules.core.interfaces.ReactActivityLifecycleListener;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExpoLogBoxPackage.kt */
@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"expo/modules/logbox/ExpoLogBoxPackage$createReactActivityLifecycleListeners$1", "Lexpo/modules/core/interfaces/ReactActivityLifecycleListener;", "onCreate", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "expo-log-box_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ExpoLogBoxPackage$createReactActivityLifecycleListeners$1 implements ReactActivityLifecycleListener {
    ExpoLogBoxPackage$createReactActivityLifecycleListeners$1() {
    }

    @Override // expo.modules.core.interfaces.ReactActivityLifecycleListener
    public void onCreate(Activity activity, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        ComponentCallbacks2 application = activity.getApplication();
        Intrinsics.checkNotNull(application, "null cannot be cast to non-null type com.facebook.react.ReactApplication");
        ExpoLogBoxReflectionUtilsKt.injectExpoLogBoxDevSupportManager(((ReactApplication) application).getReactHost());
    }
}
