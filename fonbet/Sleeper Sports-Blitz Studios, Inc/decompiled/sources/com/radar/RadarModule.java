package com.radar;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.core.app.ActivityCompat;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import io.radar.sdk.Radar;
import io.radar.sdk.RadarInAppMessageReceiver;
import io.radar.sdk.RadarReceiver;
import io.radar.sdk.RadarTrackingOptions;
import io.radar.sdk.RadarVerifiedReceiver;
import io.radar.sdk.model.RadarEvent;
import io.radar.sdk.model.RadarInAppMessage;
import io.radar.sdk.model.RadarUser;
import io.radar.sdk.model.RadarVerifiedLocationToken;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: RadarModule.kt */
@ReactModule(name = "RNRadar")
@Metadata(d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b5*\u0003\b\u000b\u000e\b\u0007\u0018\u0000 p2\u00020\u00012\u00020\u0002:\u0001pB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0015H\u0016J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0015H\u0016J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0015H\u0016J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0010\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0010\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0010\u0010,\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010-\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u0015H\u0016J\u0010\u00100\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0010\u00101\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u001aH\u0016J\u0018\u00103\u001a\u00020\u00172\u0006\u00104\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0010\u00105\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0013H\u0016J+\u00106\u001a\u00020\u001a2\u0006\u00107\u001a\u0002082\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00150:2\u0006\u0010;\u001a\u00020<H\u0016¢\u0006\u0002\u0010=J\u001a\u0010>\u001a\u00020\u00172\b\u0010?\u001a\u0004\u0018\u00010&2\u0006\u0010 \u001a\u00020\u0013H\u0016J\u001a\u0010@\u001a\u00020\u00172\b\u0010A\u001a\u0004\u0018\u00010\u00152\u0006\u0010 \u001a\u00020\u0013H\u0016J\u001a\u0010B\u001a\u00020\u00172\b\u0010C\u001a\u0004\u0018\u00010&2\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0010\u0010D\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0013H\u0016J\b\u0010E\u001a\u00020\u0017H\u0016J\b\u0010F\u001a\u00020\u0017H\u0016J\b\u0010G\u001a\u00020\u0017H\u0016J\b\u0010H\u001a\u00020\u0017H\u0016J\u0010\u0010I\u001a\u00020\u00172\u0006\u0010J\u001a\u00020&H\u0016J\u0012\u0010K\u001a\u00020\u00172\b\u0010J\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010L\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0010\u0010M\u001a\u00020\u00172\u0006\u0010J\u001a\u00020&H\u0016J\b\u0010N\u001a\u00020\u0017H\u0016J\b\u0010O\u001a\u00020\u0017H\u0016J\u0010\u0010P\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0010\u0010Q\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0010\u0010R\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0010\u0010S\u001a\u00020\u00172\u0006\u0010J\u001a\u00020&H\u0016J\u0010\u0010T\u001a\u00020\u00172\u0006\u0010J\u001a\u00020&H\u0016J\u0010\u0010U\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0018\u0010V\u001a\u00020\u00172\u0006\u0010J\u001a\u00020&2\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0010\u0010W\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0010\u0010X\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0018\u0010Y\u001a\u00020\u00172\u0006\u0010J\u001a\u00020&2\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0018\u0010Z\u001a\u00020\u00172\u0006\u0010[\u001a\u00020\u00152\u0006\u0010\\\u001a\u00020\u0015H\u0016J\u0010\u0010]\u001a\u00020\u00172\u0006\u0010[\u001a\u00020\u0015H\u0016J\u001a\u0010^\u001a\u00020\u00172\b\u0010_\u001a\u0004\u0018\u00010&2\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0018\u0010`\u001a\u00020\u00172\u0006\u0010J\u001a\u00020&2\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0018\u0010a\u001a\u00020\u00172\u0006\u0010J\u001a\u00020&2\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0018\u0010b\u001a\u00020\u00172\u0006\u0010J\u001a\u00020&2\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0018\u0010c\u001a\u00020\u00172\u0006\u0010J\u001a\u00020&2\u0006\u0010 \u001a\u00020\u0013H\u0016J\u001a\u0010d\u001a\u00020\u00172\b\u0010J\u001a\u0004\u0018\u00010&2\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0010\u0010e\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0018\u0010f\u001a\u00020\u00172\u0006\u0010g\u001a\u00020&2\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0018\u0010h\u001a\u00020\u00172\u0006\u0010J\u001a\u00020&2\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0018\u0010i\u001a\u00020\u00172\u0006\u0010J\u001a\u00020&2\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0018\u0010j\u001a\u00020\u00172\u0006\u0010J\u001a\u00020&2\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0010\u0010k\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0010\u0010l\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0010\u0010m\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0010\u0010n\u001a\u00020\u00172\u0006\u0010o\u001a\u00020&H\u0016R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006q"}, d2 = {"Lcom/radar/RadarModule;", "Lcom/radar/NativeRadarSpec;", "Lcom/facebook/react/modules/core/PermissionListener;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "radarReceiver", "com/radar/RadarModule$radarReceiver$1", "Lcom/radar/RadarModule$radarReceiver$1;", "radarInAppMessageReceiver", "com/radar/RadarModule$radarInAppMessageReceiver$1", "Lcom/radar/RadarModule$radarInAppMessageReceiver$1;", "radarVerifiedReceiver", "com/radar/RadarModule$radarVerifiedReceiver$1", "Lcom/radar/RadarModule$radarVerifiedReceiver$1;", "radarModuleImpl", "Lcom/radar/RadarModuleImpl;", "mPermissionsRequestPromise", "Lcom/facebook/react/bridge/Promise;", "getName", "", "initialize", "", "publishableKey", "fraud", "", "setLogLevel", "level", "setUserId", "userId", "getUserId", BaseJavaModule.METHOD_TYPE_PROMISE, "setDescription", "description", "getDescription", "setMetadata", "metadata", "Lcom/facebook/react/bridge/ReadableMap;", "getMetadata", "setTags", "tags", "Lcom/facebook/react/bridge/ReadableArray;", "getTags", "addTags", "removeTags", "setProduct", "product", "getProduct", "setAnonymousTrackingEnabled", "enabled", "requestPermissions", AppStateModule.APP_STATE_BACKGROUND, "getPermissionsStatus", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)Z", "trackOnce", "trackOnceOptions", "getLocation", RadarTrackingOptions.KEY_DESIRED_ACCURACY, "trackVerified", "trackVerifiedOptions", "getVerifiedLocationToken", "clearVerifiedLocationToken", "startTrackingEfficient", "startTrackingResponsive", "startTrackingContinuous", "startTrackingCustom", "options", "startTrackingVerified", "isTrackingVerified", "mockTracking", "stopTracking", "stopTrackingVerified", "getTrackingOptions", "isUsingRemoteTrackingOptions", "isTracking", "setForegroundServiceOptions", "setNotificationOptions", "getTripOptions", "startTrip", "completeTrip", "cancelTrip", "updateTrip", "acceptEvent", "eventId", "verifiedPlaceId", "rejectEvent", "getContext", FirebaseAnalytics.Param.LOCATION, "searchPlaces", "searchGeofences", "autocomplete", "geocode", "reverseGeocode", "ipGeocode", "validateAddress", "address", "getDistance", "getMatrix", "logConversion", "nativeSdkVersion", "getHost", "getPublishableKey", "showInAppMessage", "inAppMessage", "Companion", "react-native-radar_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RadarModule extends NativeRadarSpec implements PermissionListener {
    public static final String NAME = "RNRadar";
    private static final int PERMISSIONS_REQUEST_CODE = 1;
    private static final String TAG = "RadarModule";
    private Promise mPermissionsRequestPromise;
    private final RadarModule$radarInAppMessageReceiver$1 radarInAppMessageReceiver;
    private final RadarModuleImpl radarModuleImpl;
    private final RadarModule$radarReceiver$1 radarReceiver;
    private final RadarModule$radarVerifiedReceiver$1 radarVerifiedReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.radar.RadarModule$radarReceiver$1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.radar.RadarModule$radarInAppMessageReceiver$1] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.radar.RadarModule$radarVerifiedReceiver$1] */
    public RadarModule(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.radarReceiver = new RadarReceiver() { // from class: com.radar.RadarModule$radarReceiver$1
            @Override // io.radar.sdk.RadarReceiver
            public void onEventsReceived(Context context, RadarEvent[] events, RadarUser user) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(events, "events");
                WritableMap createMap = Arguments.createMap();
                WritableArray createArray = Arguments.createArray();
                for (RadarEvent radarEvent : events) {
                    createArray.pushMap(RadarUtils.mapForJson(radarEvent.toJson()));
                }
                createMap.putArray("events", createArray);
                if (user != null) {
                    createMap.putMap("user", RadarUtils.mapForJson(user.toJson()));
                }
                RadarModule.this.emitEventsEmitter(createMap);
            }

            @Override // io.radar.sdk.RadarReceiver
            public void onLocationUpdated(Context context, Location location, RadarUser user) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(location, "location");
                Intrinsics.checkNotNullParameter(user, "user");
                WritableMap createMap = Arguments.createMap();
                createMap.putString(FirebaseAnalytics.Param.LOCATION, Radar.jsonForLocation(location).toString());
                createMap.putString("user", user.toJson().toString());
                RadarModule.this.emitLocationEmitter(createMap);
            }

            @Override // io.radar.sdk.RadarReceiver
            public void onClientLocationUpdated(Context context, Location location, boolean stopped, Radar.RadarLocationSource source) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(location, "location");
                Intrinsics.checkNotNullParameter(source, "source");
                WritableMap createMap = Arguments.createMap();
                createMap.putString(FirebaseAnalytics.Param.LOCATION, Radar.jsonForLocation(location).toString());
                createMap.putBoolean("stopped", stopped);
                createMap.putString("source", source.toString());
                RadarModule.this.emitClientLocationEmitter(createMap);
            }

            @Override // io.radar.sdk.RadarReceiver
            public void onError(Context context, Radar.RadarStatus status) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(status, "status");
                WritableMap createMap = Arguments.createMap();
                createMap.putString("status", status.toString());
                RadarModule.this.emitErrorEmitter(createMap);
            }

            @Override // io.radar.sdk.RadarReceiver
            public void onLog(Context context, String message) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(message, "message");
                WritableMap createMap = Arguments.createMap();
                createMap.putString("message", message);
                RadarModule.this.emitLogEmitter(createMap);
            }
        };
        this.radarInAppMessageReceiver = new RadarInAppMessageReceiver() { // from class: com.radar.RadarModule$radarInAppMessageReceiver$1
            @Override // io.radar.sdk.RadarInAppMessageReceiver
            public void createInAppMessageView(Context context, RadarInAppMessage radarInAppMessage, Function0<Unit> function0, Function0<Unit> function02, Function1<? super View, Unit> function1) {
                RadarInAppMessageReceiver.DefaultImpls.createInAppMessageView(this, context, radarInAppMessage, function0, function02, function1);
            }

            @Override // io.radar.sdk.RadarInAppMessageReceiver
            public void onNewInAppMessage(RadarInAppMessage message) {
                Intrinsics.checkNotNullParameter(message, "message");
                try {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putMap("inAppMessage", RadarUtils.mapForJson(new JSONObject(message.toJson())));
                    RadarModule.this.emitNewInAppMessageEmitter(createMap);
                } catch (Exception e) {
                    Log.e("RadarModule", "Exception", e);
                }
            }

            @Override // io.radar.sdk.RadarInAppMessageReceiver
            public void onInAppMessageDismissed(RadarInAppMessage message) {
                Intrinsics.checkNotNullParameter(message, "message");
                try {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putMap("inAppMessage", RadarUtils.mapForJson(new JSONObject(message.toJson())));
                    RadarModule.this.emitInAppMessageDismissedEmitter(createMap);
                } catch (Exception e) {
                    Log.e("RadarModule", "Exception", e);
                }
            }

            @Override // io.radar.sdk.RadarInAppMessageReceiver
            public void onInAppMessageButtonClicked(RadarInAppMessage message) {
                Intrinsics.checkNotNullParameter(message, "message");
                try {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putMap("inAppMessage", RadarUtils.mapForJson(new JSONObject(message.toJson())));
                    RadarModule.this.emitInAppMessageClickedEmitter(createMap);
                } catch (Exception e) {
                    Log.e("RadarModule", "Exception", e);
                }
            }
        };
        this.radarVerifiedReceiver = new RadarVerifiedReceiver() { // from class: com.radar.RadarModule$radarVerifiedReceiver$1
            @Override // io.radar.sdk.RadarVerifiedReceiver
            public void onTokenUpdated(Context context, RadarVerifiedLocationToken token) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(token, "token");
                WritableMap createMap = Arguments.createMap();
                createMap.putString(AnalyticsConstantsKt.KEY_TOKEN, token.toJson().toString());
                RadarModule.this.emitTokenEmitter(createMap);
            }
        };
        this.radarModuleImpl = new RadarModuleImpl();
    }

    @Override // com.radar.NativeRadarSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNRadar";
    }

    @Override // com.radar.NativeRadarSpec
    public void initialize(String publishableKey, boolean fraud) {
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        SharedPreferences.Editor edit = getReactApplicationContext().getSharedPreferences("RadarSDK", 0).edit();
        edit.putString("x_platform_sdk_type", "ReactNative");
        edit.putString("x_platform_sdk_version", "4.0.0");
        edit.apply();
        Radar.initialize(getReactApplicationContext(), publishableKey, this.radarReceiver, Radar.RadarLocationServicesProvider.GOOGLE, fraud, null, this.radarInAppMessageReceiver, getCurrentActivity());
        if (fraud) {
            Radar.setVerifiedReceiver(this.radarVerifiedReceiver);
        }
    }

    @Override // com.radar.NativeRadarSpec
    public void setLogLevel(String level) {
        Intrinsics.checkNotNullParameter(level, "level");
        this.radarModuleImpl.setLogLevel(level);
    }

    @Override // com.radar.NativeRadarSpec
    public void setUserId(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.radarModuleImpl.setUserId(userId);
    }

    @Override // com.radar.NativeRadarSpec
    public void getUserId(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.radarModuleImpl.getUserId(promise);
    }

    @Override // com.radar.NativeRadarSpec
    public void setDescription(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.radarModuleImpl.setDescription(description);
    }

    @Override // com.radar.NativeRadarSpec
    public void getDescription(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.radarModuleImpl.getDescription(promise);
    }

    @Override // com.radar.NativeRadarSpec
    public void setMetadata(ReadableMap metadata) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.radarModuleImpl.setMetadata(metadata);
    }

    @Override // com.radar.NativeRadarSpec
    public void getMetadata(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.radarModuleImpl.getMetadata(promise);
    }

    @Override // com.radar.NativeRadarSpec
    public void setTags(ReadableArray tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.radarModuleImpl.setTags(tags);
    }

    @Override // com.radar.NativeRadarSpec
    public void getTags(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.radarModuleImpl.getTags(promise);
    }

    @Override // com.radar.NativeRadarSpec
    public void addTags(ReadableArray tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.radarModuleImpl.addTags(tags);
    }

    @Override // com.radar.NativeRadarSpec
    public void removeTags(ReadableArray tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.radarModuleImpl.removeTags(tags);
    }

    @Override // com.radar.NativeRadarSpec
    public void setProduct(String product) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.radarModuleImpl.setProduct(product);
    }

    @Override // com.radar.NativeRadarSpec
    public void getProduct(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.radarModuleImpl.getProduct(promise);
    }

    @Override // com.radar.NativeRadarSpec
    public void setAnonymousTrackingEnabled(boolean enabled) {
        this.radarModuleImpl.setAnonymousTrackingEnabled(enabled);
    }

    @Override // com.radar.NativeRadarSpec
    public void requestPermissions(boolean background, Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.mPermissionsRequestPromise = promise;
        ComponentCallbacks2 currentActivity = getCurrentActivity();
        PermissionAwareActivity permissionAwareActivity = currentActivity instanceof PermissionAwareActivity ? (PermissionAwareActivity) currentActivity : null;
        if (permissionAwareActivity != null) {
            if (background && Build.VERSION.SDK_INT >= 29) {
                permissionAwareActivity.requestPermissions(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, 1, this);
            } else {
                permissionAwareActivity.requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 1, this);
            }
        }
    }

    @Override // com.radar.NativeRadarSpec
    public void getPermissionsStatus(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.resolve("UNKNOWN");
            return;
        }
        Activity activity = currentActivity;
        boolean z = false;
        boolean z2 = ActivityCompat.checkSelfPermission(activity, "android.permission.ACCESS_FINE_LOCATION") == 0 || ActivityCompat.checkSelfPermission(activity, "android.permission.ACCESS_COARSE_LOCATION") == 0;
        boolean shouldShowRequestPermissionRationale = ActivityCompat.shouldShowRequestPermissionRationale(currentActivity, "android.permission.ACCESS_FINE_LOCATION");
        if (Build.VERSION.SDK_INT < 29) {
            z = z2;
        } else if (ActivityCompat.checkSelfPermission(activity, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
            z = true;
        }
        if (z) {
            promise.resolve("GRANTED_BACKGROUND");
            return;
        }
        if (z2) {
            promise.resolve("GRANTED_FOREGROUND");
        } else if (shouldShowRequestPermissionRationale) {
            promise.resolve(ConstantsKt.DENIED);
        } else {
            promise.resolve("NOT_DETERMINED");
        }
    }

    @Override // com.facebook.react.modules.core.PermissionListener
    public boolean onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Promise promise;
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (requestCode != 1 || (promise = this.mPermissionsRequestPromise) == null) {
            return false;
        }
        this.mPermissionsRequestPromise = null;
        Intrinsics.checkNotNull(promise);
        getPermissionsStatus(promise);
        return true;
    }

    @Override // com.radar.NativeRadarSpec
    public void trackOnce(ReadableMap trackOnceOptions, Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.radarModuleImpl.trackOnce(trackOnceOptions, promise);
    }

    @Override // com.radar.NativeRadarSpec
    public void getLocation(String desiredAccuracy, Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.radarModuleImpl.getLocation(desiredAccuracy, promise);
    }

    @Override // com.radar.NativeRadarSpec
    public void trackVerified(ReadableMap trackVerifiedOptions, Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.radarModuleImpl.trackVerified(trackVerifiedOptions, promise);
    }

    @Override // com.radar.NativeRadarSpec
    public void getVerifiedLocationToken(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.radarModuleImpl.getVerifiedLocationToken(promise);
    }

    @Override // com.radar.NativeRadarSpec
    public void clearVerifiedLocationToken() {
        this.radarModuleImpl.clearVerifiedLocationToken();
    }

    @Override // com.radar.NativeRadarSpec
    public void startTrackingEfficient() {
        this.radarModuleImpl.startTrackingEfficient();
    }

    @Override // com.radar.NativeRadarSpec
    public void startTrackingResponsive() {
        this.radarModuleImpl.startTrackingResponsive();
    }

    @Override // com.radar.NativeRadarSpec
    public void startTrackingContinuous() {
        this.radarModuleImpl.startTrackingContinuous();
    }

    @Override // com.radar.NativeRadarSpec
    public void startTrackingCustom(ReadableMap options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.radarModuleImpl.startTrackingCustom(options);
    }

    @Override // com.radar.NativeRadarSpec
    public void startTrackingVerified(ReadableMap options) {
        this.radarModuleImpl.startTrackingVerified(options);
    }

    @Override // com.radar.NativeRadarSpec
    public void isTrackingVerified(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.radarModuleImpl.isTrackingVerified(promise);
    }

    @Override // com.radar.NativeRadarSpec
    public void mockTracking(ReadableMap options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.radarModuleImpl.mockTracking(options);
    }

    @Override // com.radar.NativeRadarSpec
    public void stopTracking() {
        this.radarModuleImpl.stopTracking();
    }

    @Override // com.radar.NativeRadarSpec
    public void stopTrackingVerified() {
        this.radarModuleImpl.stopTrackingVerified();
    }

    @Override // com.radar.NativeRadarSpec
    public void getTrackingOptions(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.radarModuleImpl.getTrackingOptions(promise);
    }

    @Override // com.radar.NativeRadarSpec
    public void isUsingRemoteTrackingOptions(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.radarModuleImpl.isUsingRemoteTrackingOptions(promise);
    }

    @Override // com.radar.NativeRadarSpec
    public void isTracking(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.radarModuleImpl.isTracking(promise);
    }

    @Override // com.radar.NativeRadarSpec
    public void setForegroundServiceOptions(ReadableMap options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.radarModuleImpl.setForegroundServiceOptions(options);
    }

    @Override // com.radar.NativeRadarSpec
    public void setNotificationOptions(ReadableMap options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.radarModuleImpl.setNotificationOptions(options);
    }

    @Override // com.radar.NativeRadarSpec
    public void getTripOptions(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.radarModuleImpl.getTripOptions(promise);
    }

    @Override // com.radar.NativeRadarSpec
    public void startTrip(ReadableMap options, Promise promise) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.radarModuleImpl.startTrip(options, promise);
    }

    @Override // com.radar.NativeRadarSpec
    public void completeTrip(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.radarModuleImpl.completeTrip(promise);
    }

    @Override // com.radar.NativeRadarSpec
    public void cancelTrip(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.radarModuleImpl.cancelTrip(promise);
    }

    @Override // com.radar.NativeRadarSpec
    public void updateTrip(ReadableMap options, Promise promise) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.radarModuleImpl.updateTrip(options, promise);
    }

    @Override // com.radar.NativeRadarSpec
    public void acceptEvent(String eventId, String verifiedPlaceId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(verifiedPlaceId, "verifiedPlaceId");
        this.radarModuleImpl.acceptEvent(eventId, verifiedPlaceId);
    }

    @Override // com.radar.NativeRadarSpec
    public void rejectEvent(String eventId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        this.radarModuleImpl.rejectEvent(eventId);
    }

    @Override // com.radar.NativeRadarSpec
    public void getContext(ReadableMap location, Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.radarModuleImpl.getContext(location, promise);
    }

    @Override // com.radar.NativeRadarSpec
    public void searchPlaces(ReadableMap options, Promise promise) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.radarModuleImpl.searchPlaces(options, promise);
    }

    @Override // com.radar.NativeRadarSpec
    public void searchGeofences(ReadableMap options, Promise promise) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.radarModuleImpl.searchGeofences(options, promise);
    }

    @Override // com.radar.NativeRadarSpec
    public void autocomplete(ReadableMap options, Promise promise) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.radarModuleImpl.autocomplete(options, promise);
    }

    @Override // com.radar.NativeRadarSpec
    public void geocode(ReadableMap options, Promise promise) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.radarModuleImpl.geocode(options, promise);
    }

    @Override // com.radar.NativeRadarSpec
    public void reverseGeocode(ReadableMap options, Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.radarModuleImpl.reverseGeocode(options, promise);
    }

    @Override // com.radar.NativeRadarSpec
    public void ipGeocode(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.radarModuleImpl.ipGeocode(promise);
    }

    @Override // com.radar.NativeRadarSpec
    public void validateAddress(ReadableMap address, Promise promise) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.radarModuleImpl.validateAddress(address, promise);
    }

    @Override // com.radar.NativeRadarSpec
    public void getDistance(ReadableMap options, Promise promise) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.radarModuleImpl.getDistance(options, promise);
    }

    @Override // com.radar.NativeRadarSpec
    public void getMatrix(ReadableMap options, Promise promise) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.radarModuleImpl.getMatrix(options, promise);
    }

    @Override // com.radar.NativeRadarSpec
    public void logConversion(ReadableMap options, Promise promise) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.radarModuleImpl.logConversion(options, promise);
    }

    @Override // com.radar.NativeRadarSpec
    public void nativeSdkVersion(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.radarModuleImpl.nativeSdkVersion(promise);
    }

    @Override // com.radar.NativeRadarSpec
    public void getHost(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.radarModuleImpl.getHost(promise);
    }

    @Override // com.radar.NativeRadarSpec
    public void getPublishableKey(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.radarModuleImpl.getPublishableKey(promise);
    }

    @Override // com.radar.NativeRadarSpec
    public void showInAppMessage(ReadableMap inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        this.radarModuleImpl.showInAppMessage(inAppMessage);
    }
}
