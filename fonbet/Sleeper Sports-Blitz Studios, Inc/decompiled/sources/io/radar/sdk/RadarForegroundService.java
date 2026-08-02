package io.radar.sdk;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import androidx.activity.ComponentDialog$$ExternalSyntheticApiModelOutline0;
import androidx.media3.common.util.Util$$ExternalSyntheticApiModelOutline0;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import expo.modules.filesystem.FileSystemPath$$ExternalSyntheticApiModelOutline0;
import expo.modules.notifications.service.NotificationsService;
import io.radar.sdk.Radar;
import io.radar.sdk.RadarTrackingOptions;
import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RadarForegroundService.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\"\u0010\u000f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0012\u0010\u0012\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lio/radar/sdk/RadarForegroundService;", "Landroid/app/Service;", "()V", SentryEvent.JsonKeys.LOGGER, "Lio/radar/sdk/RadarLogger;", "buildDefaultNotification", "", "extras", "Landroid/os/Bundle;", "id", "", "onBind", "Landroid/os/IBinder;", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "onStartCommand", "flags", "startId", "startForegroundService", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarForegroundService extends Service {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int NOTIFICATION_ID = 20160525;
    private static boolean started;
    private RadarLogger logger;

    /* compiled from: RadarForegroundService.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/radar/sdk/RadarForegroundService$Companion;", "", "()V", "NOTIFICATION_ID", "", "started", "", "getStarted$sdk_release", "()Z", "setStarted$sdk_release", "(Z)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean getStarted$sdk_release() {
            return RadarForegroundService.started;
        }

        public final void setStarted$sdk_release(boolean z) {
            RadarForegroundService.started = z;
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        RadarLogger radarLogger = null;
        if (!Radar.INSTANCE.getInitialized$sdk_release()) {
            Radar.initialize$default(getApplicationContext(), null, 2, null);
        }
        if (this.logger == null) {
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            this.logger = new RadarLogger(applicationContext);
        }
        if (intent != null) {
            if (Intrinsics.areEqual(intent.getAction(), "start")) {
                try {
                    startForegroundService(intent.getExtras());
                } catch (Exception e) {
                    RadarLogger radarLogger2 = this.logger;
                    if (radarLogger2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(SentryEvent.JsonKeys.LOGGER);
                    } else {
                        radarLogger = radarLogger2;
                    }
                    radarLogger.e("Error starting foreground service", Radar.RadarLogType.SDK_EXCEPTION, e);
                }
            } else if (Intrinsics.areEqual(intent.getAction(), "stop")) {
                try {
                    stopForeground(1);
                    stopSelf();
                } catch (Exception e2) {
                    RadarLogger radarLogger3 = this.logger;
                    if (radarLogger3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(SentryEvent.JsonKeys.LOGGER);
                    } else {
                        radarLogger = radarLogger3;
                    }
                    radarLogger.e("Error stopping foreground service", Radar.RadarLogType.SDK_EXCEPTION, e2);
                }
            }
        }
        return 1;
    }

    private final void startForegroundService(Bundle extras) {
        Object systemService = getSystemService(NotificationsService.NOTIFICATION_KEY);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).deleteNotificationChannel("RadarSDK");
        int i = extras != null ? extras.getInt("id") : 0;
        if (i == 0) {
            i = 20160525;
        }
        Notification customForegroundNotification$sdk_release = RadarNotificationHelper.INSTANCE.getCustomForegroundNotification$sdk_release();
        if (customForegroundNotification$sdk_release != null) {
            if (Build.VERSION.SDK_INT >= 34) {
                startForeground(i, customForegroundNotification$sdk_release, 8);
                return;
            } else {
                startForeground(i, customForegroundNotification$sdk_release);
                return;
            }
        }
        buildDefaultNotification(extras, i);
    }

    private final void buildDefaultNotification(Bundle extras, int id) {
        String str;
        String valueOf;
        String str2;
        String str3;
        String string;
        Intent intent;
        int i = extras != null ? extras.getInt("importance", 3) : 3;
        RadarLogger radarLogger = null;
        String string2 = extras != null ? extras.getString("title") : null;
        if (extras == null || (str = extras.getString("text")) == null) {
            str = "Location tracking started";
        }
        int i2 = extras != null ? extras.getInt("icon") : 0;
        if (extras == null || (valueOf = extras.getString("iconString")) == null) {
            valueOf = String.valueOf(getApplicationInfo().icon);
        }
        Intrinsics.checkNotNull(valueOf);
        if (extras == null || (str2 = extras.getString("iconColor")) == null) {
            str2 = "";
        }
        if (i2 == 0) {
            try {
                i2 = getResources().getIdentifier(valueOf, "drawable", getApplicationContext().getPackageName());
                if (i2 == 0) {
                    i2 = getApplicationInfo().icon;
                }
            } catch (Exception unused) {
                i2 = getApplicationInfo().icon;
            }
        }
        if (extras == null || (str3 = extras.getString(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_CHANNEL_NAME)) == null) {
            str3 = "Location Services";
        }
        Util$$ExternalSyntheticApiModelOutline0.m$3();
        NotificationChannel m = ComponentDialog$$ExternalSyntheticApiModelOutline0.m("RadarSDK", str3, i);
        Object systemService = getSystemService(NotificationsService.NOTIFICATION_KEY);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannel(m);
        FileSystemPath$$ExternalSyntheticApiModelOutline0.m$2();
        Notification.Builder smallIcon = FileSystemPath$$ExternalSyntheticApiModelOutline0.m(getApplicationContext(), "RadarSDK").setContentText(str).setOngoing(true).setSmallIcon(i2);
        Intrinsics.checkNotNullExpressionValue(smallIcon, "setSmallIcon(...)");
        String str4 = string2;
        if (str4 != null && str4.length() != 0) {
            smallIcon = smallIcon.setContentTitle(str4);
            Intrinsics.checkNotNullExpressionValue(smallIcon, "setContentTitle(...)");
        }
        if (str2.length() > 0) {
            smallIcon.setColor(Color.parseColor(str2));
        }
        if (extras != null) {
            try {
                string = extras.getString("deepLink");
            } catch (Exception e) {
                RadarLogger radarLogger2 = this.logger;
                if (radarLogger2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(SentryEvent.JsonKeys.LOGGER);
                } else {
                    radarLogger = radarLogger2;
                }
                radarLogger.e("Error setting foreground service content intent", Radar.RadarLogType.SDK_EXCEPTION, e);
            }
        } else {
            string = null;
        }
        if (string == null) {
            Intent launchIntentForPackage = getApplicationContext().getPackageManager().getLaunchIntentForPackage(getApplicationContext().getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent(getApplicationContext(), Class.forName(extras != null ? extras.getString(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY) : null));
            }
            intent = launchIntentForPackage;
        } else {
            Uri parse = Uri.parse(string);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
            intent = new Intent("android.intent.action.VIEW", parse);
            intent.addCategory("android.intent.category.BROWSABLE");
        }
        intent.setFlags(268468224);
        Notification.Builder contentIntent = smallIcon.setContentIntent(PendingIntent.getActivity(this, 0, intent, 67108864));
        Intrinsics.checkNotNullExpressionValue(contentIntent, "setContentIntent(...)");
        smallIcon = contentIntent;
        Notification build = smallIcon.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        if (Build.VERSION.SDK_INT >= 34) {
            startForeground(id, build, 8);
        } else {
            startForeground(id, build);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        throw new UnsupportedOperationException();
    }
}
