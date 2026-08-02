package io.radar.sdk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.util.Log;
import com.braze.managers.x$$ExternalSyntheticApiModelOutline0;
import com.nimbusds.jose.jwk.JWKParameterNames;
import io.radar.sdk.Radar;
import io.radar.sdk.RadarTrackingOptions;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RadarLogger.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fJ&\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0006\u0010\u000e\u001a\u00020\u000fJ&\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0006\u0010\u0011\u001a\u00020\u0006J\b\u0010\u0012\u001a\u00020\u0006H\u0007J\u0006\u0010\u0013\u001a\u00020\u0006J&\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lio/radar/sdk/RadarLogger;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "d", "", "message", "", "type", "Lio/radar/sdk/Radar$RadarLogType;", "throwable", "", JWKParameterNames.RSA_EXPONENT, "getBatteryLevel", "", "i", "logBackgrounding", "logPastTermination", "logResigningActive", "w", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarLogger {
    private static final String TAG = "RadarLogger";
    private final Context context;

    public RadarLogger(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public static /* synthetic */ void d$default(RadarLogger radarLogger, String str, Radar.RadarLogType radarLogType, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            radarLogType = null;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        radarLogger.d(str, radarLogType, th);
    }

    public final void d(String message, Radar.RadarLogType type, Throwable throwable) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (RadarSettings.INSTANCE.getLogLevel$sdk_release(this.context).compareTo(Radar.RadarLogLevel.DEBUG) >= 0) {
            Log.d(TAG, message, throwable);
            Radar.sendLog$sdk_release$default(Radar.INSTANCE, Radar.RadarLogLevel.DEBUG, message, type, null, 8, null);
        }
    }

    public static /* synthetic */ void i$default(RadarLogger radarLogger, String str, Radar.RadarLogType radarLogType, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            radarLogType = null;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        radarLogger.i(str, radarLogType, th);
    }

    public final void i(String message, Radar.RadarLogType type, Throwable throwable) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (RadarSettings.INSTANCE.getLogLevel$sdk_release(this.context).compareTo(Radar.RadarLogLevel.INFO) >= 0) {
            Log.i(TAG, message, throwable);
            Radar.sendLog$sdk_release$default(Radar.INSTANCE, Radar.RadarLogLevel.INFO, message, type, null, 8, null);
        }
    }

    public static /* synthetic */ void w$default(RadarLogger radarLogger, String str, Radar.RadarLogType radarLogType, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            radarLogType = null;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        radarLogger.w(str, radarLogType, th);
    }

    public final void w(String message, Radar.RadarLogType type, Throwable throwable) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (RadarSettings.INSTANCE.getLogLevel$sdk_release(this.context).compareTo(Radar.RadarLogLevel.WARNING) >= 0) {
            Log.w(TAG, message, throwable);
            Radar.sendLog$sdk_release$default(Radar.INSTANCE, Radar.RadarLogLevel.WARNING, message, type, null, 8, null);
        }
    }

    public static /* synthetic */ void e$default(RadarLogger radarLogger, String str, Radar.RadarLogType radarLogType, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            radarLogType = null;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        radarLogger.e(str, radarLogType, th);
    }

    public final void e(String message, Radar.RadarLogType type, Throwable throwable) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (RadarSettings.INSTANCE.getLogLevel$sdk_release(this.context).compareTo(Radar.RadarLogLevel.ERROR) >= 0) {
            Log.e(TAG, message, throwable);
            Radar.sendLog$sdk_release$default(Radar.INSTANCE, Radar.RadarLogLevel.ERROR, message, type, null, 8, null);
        }
    }

    public final void logPastTermination() {
        List historicalProcessExitReasons;
        long timestamp;
        String description;
        long timestamp2;
        long timestamp3;
        if (RadarSettings.INSTANCE.getLogLevel$sdk_release(this.context) != Radar.RadarLogLevel.DEBUG) {
            return;
        }
        Object systemService = this.context.getSystemService(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager activityManager = (ActivityManager) systemService;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            List<ActivityManager.RunningAppProcessInfo> list = runningAppProcesses;
            if ((list instanceof Collection) && list.isEmpty()) {
                return;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
                if (runningAppProcessInfo.importance == 100 && Intrinsics.areEqual(runningAppProcessInfo.processName, this.context.getPackageName())) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
                    SharedPreferences sharedPreferences = this.context.getSharedPreferences("RadarSDK", 0);
                    long j = sharedPreferences.getLong("last_timestamp", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    Intrinsics.checkNotNull(sharedPreferences);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    Intrinsics.checkNotNullExpressionValue(editor, "editor");
                    editor.putLong("last_timestamp", currentTimeMillis);
                    editor.apply();
                    float batteryLevel = getBatteryLevel();
                    historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(null, 0, 10);
                    Intrinsics.checkNotNullExpressionValue(historicalProcessExitReasons, "getHistoricalProcessExitReasons(...)");
                    if (historicalProcessExitReasons.isEmpty()) {
                        return;
                    }
                    Iterator it = historicalProcessExitReasons.iterator();
                    while (it.hasNext()) {
                        ApplicationExitInfo m = x$$ExternalSyntheticApiModelOutline0.m(it.next());
                        timestamp = m.getTimestamp();
                        if (timestamp > j) {
                            Radar radar = Radar.INSTANCE;
                            Radar.RadarLogLevel radarLogLevel = Radar.RadarLogLevel.DEBUG;
                            StringBuilder sb = new StringBuilder("App terminating | with reason: ");
                            description = m.getDescription();
                            sb.append(description);
                            sb.append(" | at ");
                            timestamp2 = m.getTimestamp();
                            sb.append(simpleDateFormat.format(new Date(timestamp2)));
                            sb.append(" | with ");
                            sb.append(batteryLevel * 100);
                            sb.append("% battery");
                            String sb2 = sb.toString();
                            timestamp3 = m.getTimestamp();
                            radar.sendLog$sdk_release(radarLogLevel, sb2, null, new Date(timestamp3));
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    public final float getBatteryLevel() {
        Intent registerReceiver = this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        return (registerReceiver != null ? registerReceiver.getIntExtra("level", -1) : -1) / (registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : -1);
    }

    public final void logBackgrounding() {
        float batteryLevel = getBatteryLevel();
        d$default(this, "App entering background | at " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date()) + " | with " + (batteryLevel * 100) + "% battery", null, null, 6, null);
    }

    public final void logResigningActive() {
        float batteryLevel = getBatteryLevel();
        d$default(this, "App resigning active | at " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date()) + " | with " + (batteryLevel * 100) + "% battery", null, null, 6, null);
    }
}
