package io.radar.sdk;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import androidx.activity.ComponentDialog$$ExternalSyntheticApiModelOutline0;
import androidx.core.app.NotificationCompat;
import androidx.media3.common.util.Util$$ExternalSyntheticApiModelOutline0;
import expo.modules.notifications.service.NotificationsService;
import io.radar.sdk.model.RadarBeacon;
import io.radar.sdk.model.RadarEvent;
import io.radar.sdk.model.RadarGeofence;
import io.radar.sdk.model.RadarTrip;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: RadarNotificationHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lio/radar/sdk/RadarNotificationHelper;", "", "()V", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarNotificationHelper {
    private static final String CHANNEL_NAME = "Location";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int NOTIFICATION_ID = 20160525;
    public static final String RADAR_CAMPAIGN_ID = "radar_campaign_id";
    public static final String RADAR_CAMPAIGN_METADATA = "radar_campaign_metadata";
    private static volatile Notification customForegroundNotification;

    /* compiled from: RadarNotificationHelper.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0002\b\fJ\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\nJ%\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lio/radar/sdk/RadarNotificationHelper$Companion;", "", "()V", "CHANNEL_NAME", "", "NOTIFICATION_ID", "", "RADAR_CAMPAIGN_ID", "RADAR_CAMPAIGN_METADATA", "customForegroundNotification", "Landroid/app/Notification;", "getCustomForegroundNotification", "getCustomForegroundNotification$sdk_release", "setCustomForegroundNotification", "", NotificationsService.NOTIFICATION_KEY, "showNotifications", "context", "Landroid/content/Context;", "events", "", "Lio/radar/sdk/model/RadarEvent;", "showNotifications$sdk_release", "(Landroid/content/Context;[Lio/radar/sdk/model/RadarEvent;)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void setCustomForegroundNotification(Notification notification) {
            RadarNotificationHelper.customForegroundNotification = notification;
        }

        public final Notification getCustomForegroundNotification$sdk_release() {
            return RadarNotificationHelper.customForegroundNotification;
        }

        /* JADX WARN: Removed duplicated region for block: B:84:0x02a5  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x02ae  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x02b8 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void showNotifications$sdk_release(Context context, RadarEvent[] events) {
            String valueOf;
            int i;
            JSONObject metadata;
            String optString;
            JSONObject metadata2;
            JSONObject metadata3;
            JSONObject metadata4;
            JSONObject metadata5;
            String str;
            String str2;
            String eventColor;
            JSONObject metadata6;
            String eventColor2;
            RadarEvent[] events2 = events;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(events2, "events");
            if (Build.VERSION.SDK_INT < 26) {
                return;
            }
            int i2 = 0;
            for (int length = events2.length; i2 < length; length = i) {
                RadarEvent radarEvent = events2[i2];
                JSONObject metadata7 = radarEvent.getMetadata();
                String optString2 = metadata7 != null ? metadata7.optString("radar:notificationText") : null;
                JSONObject metadata8 = radarEvent.getMetadata();
                String optString3 = metadata8 != null ? metadata8.optString("radar:campaignType") : null;
                String str3 = radarEvent.get_id();
                Object systemService = context.getSystemService(NotificationsService.NOTIFICATION_KEY);
                NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
                Util$$ExternalSyntheticApiModelOutline0.m$3();
                NotificationChannel m = ComponentDialog$$ExternalSyntheticApiModelOutline0.m("Location", "Location", 4);
                m.enableVibration(true);
                if (notificationManager != null) {
                    notificationManager.createNotificationChannel(m);
                }
                RadarNotificationOptions notificationOptions$sdk_release = RadarSettings.INSTANCE.getNotificationOptions$sdk_release(context);
                if (notificationOptions$sdk_release == null || (valueOf = notificationOptions$sdk_release.getEventIcon()) == null) {
                    valueOf = String.valueOf(context.getApplicationContext().getApplicationInfo().icon);
                }
                int identifier = context.getApplicationContext().getResources().getIdentifier(valueOf, "drawable", context.getApplicationContext().getPackageName());
                String str4 = "";
                if (optString2 != null && Intrinsics.areEqual(optString3, "eventBased")) {
                    JSONObject metadata9 = radarEvent.getMetadata();
                    String optString4 = metadata9 != null ? metadata9.optString("radar:notificationTitle") : null;
                    JSONObject metadata10 = radarEvent.getMetadata();
                    String optString5 = metadata10 != null ? metadata10.optString("radar:notificationSubTitle") : null;
                    JSONObject metadata11 = radarEvent.getMetadata();
                    String optString6 = metadata11 != null ? metadata11.optString("radar:campaignId") : null;
                    JSONObject metadata12 = radarEvent.getMetadata();
                    String optString7 = metadata12 != null ? metadata12.optString("radar:notificationURL") : null;
                    JSONObject metadata13 = radarEvent.getMetadata();
                    String str5 = optString7;
                    String optString8 = metadata13 != null ? metadata13.optString("radar:campaignMetadata") : null;
                    i = length;
                    RadarLogger.d$default(Radar.INSTANCE.getLogger$sdk_release(), "creating campaign notification with metadata  = " + radarEvent.getMetadata(), null, null, 6, null);
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                    if (launchIntentForPackage != null) {
                        launchIntentForPackage.setFlags(335544320);
                        launchIntentForPackage.putExtra(RadarNotificationHelper.RADAR_CAMPAIGN_ID, optString6);
                        launchIntentForPackage.putExtra(RadarNotificationHelper.RADAR_CAMPAIGN_METADATA, optString8);
                        if (str5 != null) {
                            Uri parse = Uri.parse(str5);
                            Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
                            launchIntentForPackage.setData(parse);
                            launchIntentForPackage.setAction("android.intent.action.VIEW");
                        }
                    } else {
                        launchIntentForPackage = null;
                    }
                    String str6 = optString4;
                    String str7 = optString5;
                    String str8 = optString2;
                    NotificationCompat.Builder contentIntent = new NotificationCompat.Builder(context, "Location").setSmallIcon(identifier).setAutoCancel(true).setContentTitle(str6).setSubText(str7).setContentText(str8).setStyle(new NotificationCompat.BigTextStyle().bigText(str8).setBigContentTitle(str6).setSummaryText(str7)).setPriority(0).setContentIntent(PendingIntent.getActivity(context, 0, launchIntentForPackage, 67108864));
                    Intrinsics.checkNotNullExpressionValue(contentIntent, "setContentIntent(...)");
                    if (notificationOptions$sdk_release != null && (eventColor2 = notificationOptions$sdk_release.getEventColor()) != null) {
                        str4 = eventColor2;
                    }
                    if (str4.length() > 0) {
                        contentIntent.setColor(Color.parseColor(str4));
                    }
                    if (notificationManager != null) {
                        notificationManager.notify(str3, 20160525, contentIntent.build());
                    }
                } else {
                    i = length;
                    if (radarEvent.getType() == RadarEvent.RadarEventType.USER_ENTERED_GEOFENCE) {
                        RadarGeofence geofence = radarEvent.getGeofence();
                        if (geofence != null && (metadata6 = geofence.getMetadata()) != null) {
                            optString = metadata6.optString("radar:entryNotificationText");
                            str = optString;
                        }
                        str = null;
                    } else if (radarEvent.getType() == RadarEvent.RadarEventType.USER_EXITED_GEOFENCE) {
                        RadarGeofence geofence2 = radarEvent.getGeofence();
                        if (geofence2 != null && (metadata5 = geofence2.getMetadata()) != null) {
                            optString = metadata5.optString("radar:exitNotificationText");
                            str = optString;
                        }
                        str = null;
                    } else if (radarEvent.getType() == RadarEvent.RadarEventType.USER_ENTERED_BEACON) {
                        RadarBeacon beacon = radarEvent.getBeacon();
                        if (beacon != null && (metadata4 = beacon.getMetadata()) != null) {
                            optString = metadata4.optString("radar:entryNotificationText");
                            str = optString;
                        }
                        str = null;
                    } else if (radarEvent.getType() == RadarEvent.RadarEventType.USER_EXITED_BEACON) {
                        RadarBeacon beacon2 = radarEvent.getBeacon();
                        if (beacon2 != null && (metadata3 = beacon2.getMetadata()) != null) {
                            optString = metadata3.optString("radar:exitNotificationText");
                            str = optString;
                        }
                        str = null;
                    } else if (radarEvent.getType() == RadarEvent.RadarEventType.USER_APPROACHING_TRIP_DESTINATION) {
                        RadarTrip trip = radarEvent.getTrip();
                        if (trip != null && (metadata2 = trip.getMetadata()) != null) {
                            optString = metadata2.optString("radar:approachingNotificationText");
                            str = optString;
                        }
                        str = null;
                    } else {
                        if (radarEvent.getType() == RadarEvent.RadarEventType.USER_ARRIVED_AT_TRIP_DESTINATION) {
                            RadarTrip trip2 = radarEvent.getTrip();
                            if (trip2 != null && (metadata = trip2.getMetadata()) != null) {
                                optString = metadata.optString("radar:arrivalNotificationText");
                                str = optString;
                            }
                            str = null;
                        }
                        str2 = optString2;
                        if (str2 != null && str2.length() != 0) {
                            NotificationCompat.Builder priority = new NotificationCompat.Builder(context, "Location").setSmallIcon(identifier).setAutoCancel(true).setContentText(str2).setStyle(new NotificationCompat.BigTextStyle().bigText(str2)).setPriority(0);
                            Intrinsics.checkNotNullExpressionValue(priority, "setPriority(...)");
                            if (notificationOptions$sdk_release != null && (eventColor = notificationOptions$sdk_release.getEventColor()) != null) {
                                str4 = eventColor;
                            }
                            if (str4.length() > 0) {
                                priority.setColor(Color.parseColor(str4));
                            }
                            if (notificationManager == null) {
                                notificationManager.notify(str3, 20160525, priority.build());
                            }
                            i2++;
                            events2 = events;
                        }
                    }
                    optString2 = str;
                    str2 = optString2;
                    if (str2 != null) {
                        NotificationCompat.Builder priority2 = new NotificationCompat.Builder(context, "Location").setSmallIcon(identifier).setAutoCancel(true).setContentText(str2).setStyle(new NotificationCompat.BigTextStyle().bigText(str2)).setPriority(0);
                        Intrinsics.checkNotNullExpressionValue(priority2, "setPriority(...)");
                        if (notificationOptions$sdk_release != null) {
                            str4 = eventColor;
                        }
                        if (str4.length() > 0) {
                        }
                        if (notificationManager == null) {
                        }
                        i2++;
                        events2 = events;
                    }
                }
                i2++;
                events2 = events;
            }
        }
    }
}
