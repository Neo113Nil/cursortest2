package io.radar.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.media3.exoplayer.offline.DownloadService;
import io.radar.sdk.Radar;
import io.radar.sdk.RadarApiClient;
import io.radar.sdk.RadarTrackingOptions;
import io.radar.sdk.model.RadarConfig;
import io.radar.sdk.model.RadarSdkConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RadarActivityLifecycleCallbacks.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lio/radar/sdk/RadarActivityLifecycleCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "fraud", "", "(Z)V", "count", "", "isFirstOnResume", "touchViewAdded", "onActivityCreated", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "updatePermissionsDenied", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "RadarActivityLifecycle";
    private static boolean foreground;
    private int count;
    private final boolean fraud;
    private boolean isFirstOnResume;
    private boolean touchViewAdded;

    public RadarActivityLifecycleCallbacks() {
        this(false, 1, null);
    }

    public RadarActivityLifecycleCallbacks(boolean z) {
        this.fraud = z;
        this.isFirstOnResume = true;
    }

    public /* synthetic */ RadarActivityLifecycleCallbacks(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    /* compiled from: RadarActivityLifecycleCallbacks.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/radar/sdk/RadarActivityLifecycleCallbacks$Companion;", "", "()V", "TAG", "", "<set-?>", "", DownloadService.KEY_FOREGROUND, "getForeground", "()Z", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean getForeground() {
            return RadarActivityLifecycleCallbacks.foreground;
        }
    }

    private final void updatePermissionsDenied(Activity activity) {
        try {
            if (ContextCompat.checkSelfPermission(activity.getApplicationContext(), "android.permission.ACCESS_FINE_LOCATION") == -1 && ActivityCompat.shouldShowRequestPermissionRationale(activity, "android.permission.ACCESS_FINE_LOCATION")) {
                RadarSettings radarSettings = RadarSettings.INSTANCE;
                Context applicationContext = activity.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                radarSettings.setPermissionsDenied$sdk_release(applicationContext, true);
            }
            if (ContextCompat.checkSelfPermission(activity.getApplicationContext(), "android.permission.ACCESS_COARSE_LOCATION") == -1 && ActivityCompat.shouldShowRequestPermissionRationale(activity, "android.permission.ACCESS_COARSE_LOCATION")) {
                RadarSettings radarSettings2 = RadarSettings.INSTANCE;
                Context applicationContext2 = activity.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                radarSettings2.setPermissionsDenied$sdk_release(applicationContext2, true);
            }
        } catch (Exception e) {
            Log.e(TAG, e.getMessage(), e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Unit unit = null;
        if (this.count == 0 && !this.isFirstOnResume) {
            try {
                RadarSettings radarSettings = RadarSettings.INSTANCE;
                Context applicationContext = activity.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                if (radarSettings.updateSessionId$sdk_release(applicationContext)) {
                    Radar.INSTANCE.getApiClient$sdk_release().getConfig$sdk_release("resume", false, new RadarApiClient.RadarGetConfigApiCallback() { // from class: io.radar.sdk.RadarActivityLifecycleCallbacks$onActivityResumed$1
                        @Override // io.radar.sdk.RadarApiClient.RadarGetConfigApiCallback
                        public void onComplete(Radar.RadarStatus status, RadarConfig config) {
                            Intrinsics.checkNotNullParameter(status, "status");
                            if (config == null) {
                                return;
                            }
                            if (status == Radar.RadarStatus.SUCCESS) {
                                Radar.INSTANCE.getLocationManager$sdk_release().updateTrackingFromMeta$sdk_release(config.getMeta());
                                RadarSettings radarSettings2 = RadarSettings.INSTANCE;
                                Context applicationContext2 = activity.getApplicationContext();
                                Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                                radarSettings2.setSdkConfiguration(applicationContext2, config.getMeta().getSdkConfiguration());
                            }
                            RadarSettings radarSettings3 = RadarSettings.INSTANCE;
                            Context applicationContext3 = activity.getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(applicationContext3, "getApplicationContext(...)");
                            RadarSdkConfiguration sdkConfiguration = radarSettings3.getSdkConfiguration(applicationContext3);
                            if (sdkConfiguration.getTrackOnceOnAppOpen() || sdkConfiguration.getStartTrackingOnInitialize()) {
                                Radar.trackOnce$default(null, 1, null);
                                if (sdkConfiguration.getStartTrackingOnInitialize()) {
                                    RadarSettings radarSettings4 = RadarSettings.INSTANCE;
                                    Context applicationContext4 = activity.getApplicationContext();
                                    Intrinsics.checkNotNullExpressionValue(applicationContext4, "getApplicationContext(...)");
                                    if (radarSettings4.getTracking$sdk_release(applicationContext4)) {
                                        return;
                                    }
                                    Radar.startTracking(Radar.getTrackingOptions());
                                }
                            }
                        }
                    });
                } else {
                    RadarSettings radarSettings2 = RadarSettings.INSTANCE;
                    Context applicationContext2 = activity.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                    RadarSdkConfiguration sdkConfiguration = radarSettings2.getSdkConfiguration(applicationContext2);
                    if (sdkConfiguration.getTrackOnceOnAppOpen() || sdkConfiguration.getStartTrackingOnInitialize()) {
                        Radar.trackOnce$default(null, 1, null);
                        if (sdkConfiguration.getStartTrackingOnInitialize()) {
                            RadarSettings radarSettings3 = RadarSettings.INSTANCE;
                            Context applicationContext3 = activity.getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(applicationContext3, "getApplicationContext(...)");
                            if (!radarSettings3.getTracking$sdk_release(applicationContext3)) {
                                Radar.startTracking(Radar.getTrackingOptions());
                            }
                        }
                    }
                }
            } catch (Exception e) {
                Log.e(TAG, e.getMessage(), e);
            }
        }
        int i = this.count + 1;
        this.count = i;
        this.isFirstOnResume = false;
        foreground = i > 0;
        Intent intent = activity.getIntent();
        if (intent != null) {
            Radar.logOpenedAppConversion(intent);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            Radar.INSTANCE.logOpenedAppConversion$sdk_release();
        }
        updatePermissionsDenied(activity);
        if (!this.fraud || this.touchViewAdded) {
            return;
        }
        final Context applicationContext4 = activity.getApplicationContext();
        activity.addContentView(new View(applicationContext4) { // from class: io.radar.sdk.RadarActivityLifecycleCallbacks$onActivityResumed$touchView$1
            @Override // android.view.View
            public boolean dispatchTouchEvent(MotionEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                try {
                    InputDevice device = InputDevice.getDevice(event.getDeviceId());
                    if (event.getToolType(0) == 0 || (device != null && device.isVirtual())) {
                        RadarSettings radarSettings4 = RadarSettings.INSTANCE;
                        Context applicationContext5 = activity.getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext5, "getApplicationContext(...)");
                        radarSettings4.setSharing$sdk_release(applicationContext5, true);
                    }
                } catch (Exception e2) {
                    Log.e("RadarActivityLifecycle", e2.getMessage(), e2);
                }
                return super.dispatchTouchEvent(event);
            }
        }, new ViewGroup.LayoutParams(-1, -1));
        this.touchViewAdded = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int max = Math.max(this.count - 1, 0);
        this.count = max;
        foreground = max > 0;
        updatePermissionsDenied(activity);
        Radar.logResigningActive();
        Radar.INSTANCE.dismissInAppMessage$sdk_release();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        updatePermissionsDenied(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        updatePermissionsDenied(activity);
        Radar.logBackgrounding();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        updatePermissionsDenied(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
        updatePermissionsDenied(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        updatePermissionsDenied(activity);
    }
}
