package com.sleeperbot.modules;

import android.R;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URL;
import java.net.URLConnection;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotificationManager.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0007*\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J\u001c\u0010\u0014\u001a\u00020\u0015*\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/sleeperbot/modules/NotificationManager;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "displayNotification", "", "params", "Lcom/facebook/react/bridge/ReadableMap;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getInitialNotification", "parsePriority", "", "value", "getOptionalString", SDKConstants.PARAM_KEY, "optBoolean", "", "default", "Companion", "app_fullRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NotificationManager extends ReactContextBaseJavaModule {
    public static final String NOTIFICATION_DATA_KEY = "sleeper_notification_data";
    private static final String TAP_TIMESTAMP_KEY = "_tap_timestamp";
    private static long lastConsumedTimestamp;
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationManager(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SleeperNotifications";
    }

    @ReactMethod
    public final void displayNotification(ReadableMap params, Promise promise) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            String string = params.getString("title");
            String str = "";
            if (string == null) {
                string = "";
            }
            String string2 = params.getString("body");
            if (string2 == null) {
                string2 = "";
            }
            String string3 = params.getString("channelId");
            if (string3 == null) {
                string3 = "";
            }
            String string4 = params.getString("smallIcon");
            if (string4 != null) {
                str = string4;
            }
            ReadableMap map = (!params.hasKey("data") || params.isNull("data")) ? null : params.getMap("data");
            Bundle bundle = map != null ? Arguments.toBundle(map) : new Bundle();
            if (bundle != null) {
                bundle.putLong(TAP_TIMESTAMP_KEY, System.currentTimeMillis());
            }
            Intent launchIntentForPackage = this.reactContext.getPackageManager().getLaunchIntentForPackage(this.reactContext.getPackageName());
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setFlags(805306368);
                launchIntentForPackage.putExtra(NOTIFICATION_DATA_KEY, bundle);
            } else {
                launchIntentForPackage = null;
            }
            int hashCode = UUID.randomUUID().hashCode();
            PendingIntent activity = launchIntentForPackage != null ? PendingIntent.getActivity(this.reactContext, hashCode, launchIntentForPackage, 201326592) : null;
            Integer valueOf = Integer.valueOf(this.reactContext.getResources().getIdentifier(str, "drawable", this.reactContext.getPackageName()));
            Integer num = valueOf.intValue() != 0 ? valueOf : null;
            NotificationCompat.Builder smallIcon = new NotificationCompat.Builder(this.reactContext, string3).setContentTitle(string).setContentText(string2).setSmallIcon(num != null ? num.intValue() : R.drawable.ic_dialog_info);
            Intrinsics.checkNotNullExpressionValue(smallIcon, "setSmallIcon(...)");
            if (activity != null) {
                smallIcon.setContentIntent(activity);
            }
            if (optBoolean(params, "autoCancel", true)) {
                smallIcon.setAutoCancel(true);
            }
            if (optBoolean(params, "showTimestamp", false)) {
                smallIcon.setShowWhen(true);
                smallIcon.setWhen(System.currentTimeMillis());
            }
            String optionalString = getOptionalString(params, "priority");
            if (optionalString != null) {
                smallIcon.setPriority(parsePriority(optionalString));
            }
            String optionalString2 = getOptionalString(params, "category");
            if (optionalString2 != null) {
                smallIcon.setCategory(optionalString2);
            }
            String optionalString3 = getOptionalString(params, "subtitle");
            if (optionalString3 != null) {
                smallIcon.setSubText(optionalString3);
            }
            String optionalString4 = getOptionalString(params, "bigText");
            if (optionalString4 != null) {
                smallIcon.setStyle(new NotificationCompat.BigTextStyle().bigText(optionalString4));
            }
            String optionalString5 = getOptionalString(params, "groupId");
            if (optionalString5 != null) {
                smallIcon.setGroup(optionalString5);
            }
            String optionalString6 = getOptionalString(params, "largeIconUrl");
            if (optionalString6 != null) {
                try {
                    URLConnection openConnection = new URL(optionalString6).openConnection();
                    openConnection.setConnectTimeout(5000);
                    openConnection.setReadTimeout(5000);
                    Bitmap decodeStream = BitmapFactory.decodeStream(openConnection.getInputStream());
                    if (decodeStream != null) {
                        smallIcon.setLargeIcon(decodeStream);
                    }
                } catch (Exception unused) {
                    Unit unit = Unit.INSTANCE;
                }
            }
            String optionalString7 = getOptionalString(params, "tag");
            if (params.hasKey("id")) {
                String string5 = params.getString("id");
                hashCode = string5 != null ? string5.hashCode() : 0;
            }
            NotificationManagerCompat.from(this.reactContext).notify(optionalString7, hashCode, smallIcon.build());
            promise.resolve(String.valueOf(hashCode));
        } catch (Exception e) {
            promise.reject("DISPLAY_ERROR", e.getMessage(), e);
        }
    }

    @ReactMethod
    public final void getInitialNotification(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.resolve(null);
            return;
        }
        Intent intent = currentActivity.getIntent();
        if (intent == null) {
            promise.resolve(null);
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra(NOTIFICATION_DATA_KEY);
        if (bundleExtra == null) {
            promise.resolve(null);
            return;
        }
        long j = bundleExtra.getLong(TAP_TIMESTAMP_KEY, 0L);
        if (j <= lastConsumedTimestamp) {
            promise.resolve(null);
            return;
        }
        lastConsumedTimestamp = j;
        bundleExtra.remove(TAP_TIMESTAMP_KEY);
        WritableMap createMap = Arguments.createMap();
        createMap.putMap("data", Arguments.fromBundle(bundleExtra));
        promise.resolve(createMap);
    }

    private final int parsePriority(String value) {
        switch (value.hashCode()) {
            case 107348:
                return !value.equals(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.LOW_STR) ? 0 : -1;
            case 107876:
                return !value.equals("max") ? 0 : 2;
            case 108114:
                return !value.equals("min") ? 0 : -2;
            case 3202466:
                return !value.equals(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.HIGH_STR) ? 0 : 1;
            default:
                return 0;
        }
    }

    private final String getOptionalString(ReadableMap readableMap, String str) {
        if (!readableMap.hasKey(str) || readableMap.isNull(str)) {
            return null;
        }
        return readableMap.getString(str);
    }

    private final boolean optBoolean(ReadableMap readableMap, String str, boolean z) {
        return readableMap.hasKey(str) ? readableMap.getBoolean(str) : z;
    }
}
