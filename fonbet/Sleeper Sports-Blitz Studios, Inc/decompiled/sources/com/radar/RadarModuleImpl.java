package com.radar;

import android.location.Location;
import android.util.Log;
import com.braze.models.BrazeGeofence;
import com.braze.ui.actions.brazeactions.steps.ContainerStep;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.Radar;
import io.radar.sdk.RadarNotificationOptions;
import io.radar.sdk.RadarTrackingOptions;
import io.radar.sdk.RadarTripOptions;
import io.radar.sdk.model.RadarAddress;
import io.radar.sdk.model.RadarContext;
import io.radar.sdk.model.RadarEvent;
import io.radar.sdk.model.RadarGeofence;
import io.radar.sdk.model.RadarInAppMessage;
import io.radar.sdk.model.RadarPlace;
import io.radar.sdk.model.RadarRouteMatrix;
import io.radar.sdk.model.RadarRoutes;
import io.radar.sdk.model.RadarTrip;
import io.radar.sdk.model.RadarUser;
import io.radar.sdk.model.RadarVerifiedLocationToken;
import io.sentry.clientreport.DiscardedEvent;
import java.util.EnumSet;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class RadarModuleImpl {
    private static final String TAG = "RNRadarModule";
    private boolean fraud = false;

    public String getName() {
        return "RNRadar";
    }

    public void setLogLevel(String str) {
        Radar.RadarLogLevel radarLogLevel = Radar.RadarLogLevel.NONE;
        if (str != null) {
            if (str.equals("error") || str.equals("ERROR")) {
                radarLogLevel = Radar.RadarLogLevel.ERROR;
            } else if (str.equals("warning") || str.equals("WARNING")) {
                radarLogLevel = Radar.RadarLogLevel.WARNING;
            } else if (str.equals("info") || str.equals("INFO")) {
                radarLogLevel = Radar.RadarLogLevel.INFO;
            } else if (str.equals("debug") || str.equals("DEBUG")) {
                radarLogLevel = Radar.RadarLogLevel.DEBUG;
            }
        }
        Radar.setLogLevel(radarLogLevel);
    }

    public void setUserId(String str) {
        Radar.setUserId(str);
    }

    public void getUserId(Promise promise) {
        if (promise == null) {
            return;
        }
        promise.resolve(Radar.getUserId());
    }

    public void setDescription(String str) {
        Radar.setDescription(str);
    }

    public void getDescription(Promise promise) {
        if (promise == null) {
            return;
        }
        promise.resolve(Radar.getDescription());
    }

    public void nativeSdkVersion(Promise promise) {
        if (promise == null) {
            return;
        }
        String sdkVersion = Radar.sdkVersion();
        if (sdkVersion != null) {
            promise.resolve(sdkVersion);
        } else {
            promise.reject(Radar.RadarStatus.ERROR_BAD_REQUEST.toString(), Radar.RadarStatus.ERROR_BAD_REQUEST.toString());
        }
    }

    public void setMetadata(ReadableMap readableMap) throws JSONException {
        Radar.setMetadata(RadarUtils.jsonForMap(readableMap));
    }

    public void getMetadata(Promise promise) throws JSONException {
        if (promise == null) {
            return;
        }
        promise.resolve(RadarUtils.mapForJson(Radar.getMetadata()));
    }

    public void setTags(ReadableArray readableArray) throws JSONException {
        Radar.setTags(RadarUtils.stringArrayForArray(readableArray));
    }

    public void getTags(Promise promise) throws JSONException {
        if (promise == null) {
            return;
        }
        promise.resolve(RadarUtils.arrayForStringArray(Radar.getTags()));
    }

    public void addTags(ReadableArray readableArray) throws JSONException {
        Radar.addTags(RadarUtils.stringArrayForArray(readableArray));
    }

    public void removeTags(ReadableArray readableArray) throws JSONException {
        Radar.removeTags(RadarUtils.stringArrayForArray(readableArray));
    }

    public void setProduct(String str) {
        Radar.setProduct(str);
    }

    public void getProduct(Promise promise) throws JSONException {
        if (promise == null) {
            return;
        }
        promise.resolve(Radar.getProduct());
    }

    public void setAnonymousTrackingEnabled(boolean z) {
        Radar.setAnonymousTrackingEnabled(z);
    }

    public void getHost(Promise promise) {
        if (promise == null) {
            return;
        }
        promise.resolve(Radar.getHost());
    }

    public void getPublishableKey(Promise promise) {
        if (promise == null) {
            return;
        }
        promise.resolve(Radar.getPublishableKey());
    }

    public void getLocation(String str, final Promise promise) {
        RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy radarTrackingOptionsDesiredAccuracy = RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.MEDIUM;
        String lowerCase = str != null ? str.toLowerCase() : "medium";
        if (lowerCase.equals(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.LOW_STR)) {
            radarTrackingOptionsDesiredAccuracy = RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.LOW;
        } else if (lowerCase.equals("medium")) {
            radarTrackingOptionsDesiredAccuracy = RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.MEDIUM;
        } else if (lowerCase.equals(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.HIGH_STR)) {
            radarTrackingOptionsDesiredAccuracy = RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.HIGH;
        } else {
            promise.reject(Radar.RadarStatus.ERROR_BAD_REQUEST.toString(), Radar.RadarStatus.ERROR_BAD_REQUEST.toString());
        }
        Radar.getLocation(radarTrackingOptionsDesiredAccuracy, new Radar.RadarLocationCallback() { // from class: com.radar.RadarModuleImpl.1
            @Override // io.radar.sdk.Radar.RadarLocationCallback
            public void onComplete(Radar.RadarStatus radarStatus, Location location, boolean z) {
                if (promise == null) {
                    return;
                }
                if (radarStatus == Radar.RadarStatus.SUCCESS) {
                    try {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putString("status", radarStatus.toString());
                        if (location != null) {
                            createMap.putMap(FirebaseAnalytics.Param.LOCATION, RadarUtils.mapForJson(Radar.jsonForLocation(location)));
                        }
                        createMap.putBoolean("stopped", z);
                        promise.resolve(createMap);
                        return;
                    } catch (JSONException e) {
                        Log.e(RadarModuleImpl.TAG, "JSONException", e);
                        promise.reject(Radar.RadarStatus.ERROR_SERVER.toString(), Radar.RadarStatus.ERROR_SERVER.toString());
                        return;
                    }
                }
                promise.reject(radarStatus.toString(), radarStatus.toString());
            }
        });
    }

    public void trackOnce(ReadableMap readableMap, final Promise promise) {
        RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy radarTrackingOptionsDesiredAccuracy = RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.MEDIUM;
        Location location = null;
        boolean z = false;
        if (readableMap != null) {
            if (readableMap.hasKey(FirebaseAnalytics.Param.LOCATION)) {
                ReadableMap map = readableMap.getMap(FirebaseAnalytics.Param.LOCATION);
                Location location2 = new Location(TAG);
                double d = map.getDouble("latitude");
                double d2 = map.getDouble("longitude");
                float f = (float) map.getDouble("accuracy");
                location2.setLatitude(d);
                location2.setLongitude(d2);
                location2.setAccuracy(f);
                location = location2;
            }
            if (readableMap.hasKey(RadarTrackingOptions.KEY_DESIRED_ACCURACY)) {
                String lowerCase = readableMap.getString(RadarTrackingOptions.KEY_DESIRED_ACCURACY).toLowerCase();
                if (lowerCase.equals("none")) {
                    radarTrackingOptionsDesiredAccuracy = RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.NONE;
                } else if (lowerCase.equals(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.LOW_STR)) {
                    radarTrackingOptionsDesiredAccuracy = RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.LOW;
                } else if (lowerCase.equals("medium")) {
                    radarTrackingOptionsDesiredAccuracy = RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.MEDIUM;
                } else if (lowerCase.equals(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.HIGH_STR)) {
                    radarTrackingOptionsDesiredAccuracy = RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.HIGH;
                }
            }
            if (readableMap.hasKey(RadarTrackingOptions.KEY_BEACONS)) {
                z = readableMap.getBoolean(RadarTrackingOptions.KEY_BEACONS);
            }
        }
        Radar.RadarTrackCallback radarTrackCallback = new Radar.RadarTrackCallback() { // from class: com.radar.RadarModuleImpl.2
            @Override // io.radar.sdk.Radar.RadarTrackCallback
            public void onComplete(Radar.RadarStatus radarStatus, Location location3, RadarEvent[] radarEventArr, RadarUser radarUser) {
                if (promise == null) {
                    return;
                }
                try {
                    if (radarStatus == Radar.RadarStatus.SUCCESS) {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putString("status", radarStatus.toString());
                        if (location3 != null) {
                            createMap.putMap(FirebaseAnalytics.Param.LOCATION, RadarUtils.mapForJson(Radar.jsonForLocation(location3)));
                        }
                        if (radarEventArr != null) {
                            createMap.putArray("events", RadarUtils.arrayForJson(RadarEvent.toJson(radarEventArr)));
                        }
                        if (radarUser != null) {
                            createMap.putMap("user", RadarUtils.mapForJson(radarUser.toJson()));
                        }
                        promise.resolve(createMap);
                        return;
                    }
                    promise.reject(radarStatus.toString(), radarStatus.toString());
                } catch (JSONException e) {
                    Log.e(RadarModuleImpl.TAG, "JSONException", e);
                    promise.reject(Radar.RadarStatus.ERROR_SERVER.toString(), Radar.RadarStatus.ERROR_SERVER.toString());
                }
            }
        };
        if (location != null) {
            Radar.trackOnce(location, radarTrackCallback);
        } else {
            Radar.trackOnce(radarTrackingOptionsDesiredAccuracy, z, radarTrackCallback);
        }
    }

    public void trackVerified(ReadableMap readableMap, final Promise promise) {
        String str;
        RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy radarTrackingOptionsDesiredAccuracy = RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.MEDIUM;
        if (readableMap != null) {
            r1 = readableMap.hasKey(RadarTrackingOptions.KEY_BEACONS) ? readableMap.getBoolean(RadarTrackingOptions.KEY_BEACONS) : false;
            if (readableMap.hasKey(RadarTrackingOptions.KEY_DESIRED_ACCURACY)) {
                String lowerCase = readableMap.getString(RadarTrackingOptions.KEY_DESIRED_ACCURACY).toLowerCase();
                if (lowerCase.equals("none")) {
                    radarTrackingOptionsDesiredAccuracy = RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.NONE;
                } else if (lowerCase.equals(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.LOW_STR)) {
                    radarTrackingOptionsDesiredAccuracy = RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.LOW;
                } else if (lowerCase.equals("medium")) {
                    radarTrackingOptionsDesiredAccuracy = RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.MEDIUM;
                } else if (lowerCase.equals(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.HIGH_STR)) {
                    radarTrackingOptionsDesiredAccuracy = RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.HIGH;
                }
            }
            String string = readableMap.hasKey(DiscardedEvent.JsonKeys.REASON) ? readableMap.getString(DiscardedEvent.JsonKeys.REASON) : null;
            str = readableMap.hasKey("transactionId") ? readableMap.getString("transactionId") : null;
            r2 = string;
        } else {
            str = null;
        }
        Radar.trackVerified(r1, radarTrackingOptionsDesiredAccuracy, r2, str, new Radar.RadarTrackVerifiedCallback() { // from class: com.radar.RadarModuleImpl.3
            @Override // io.radar.sdk.Radar.RadarTrackVerifiedCallback
            public void onComplete(Radar.RadarStatus radarStatus, RadarVerifiedLocationToken radarVerifiedLocationToken) {
                if (promise == null) {
                    return;
                }
                try {
                    if (radarStatus == Radar.RadarStatus.SUCCESS) {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putString("status", radarStatus.toString());
                        if (radarVerifiedLocationToken != null) {
                            createMap.putMap(AnalyticsConstantsKt.KEY_TOKEN, RadarUtils.mapForJson(radarVerifiedLocationToken.toJson()));
                        }
                        promise.resolve(createMap);
                        return;
                    }
                    promise.reject(radarStatus.toString(), radarStatus.toString());
                } catch (JSONException e) {
                    Log.e(RadarModuleImpl.TAG, "JSONException", e);
                    promise.reject(Radar.RadarStatus.ERROR_SERVER.toString(), Radar.RadarStatus.ERROR_SERVER.toString());
                }
            }
        });
    }

    public void isTrackingVerified(Promise promise) {
        promise.resolve(Boolean.valueOf(Radar.isTrackingVerified()));
    }

    public void getVerifiedLocationToken(final Promise promise) {
        Radar.getVerifiedLocationToken(new Radar.RadarTrackVerifiedCallback() { // from class: com.radar.RadarModuleImpl.4
            @Override // io.radar.sdk.Radar.RadarTrackVerifiedCallback
            public void onComplete(Radar.RadarStatus radarStatus, RadarVerifiedLocationToken radarVerifiedLocationToken) {
                if (promise == null) {
                    return;
                }
                try {
                    if (radarStatus == Radar.RadarStatus.SUCCESS) {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putString("status", radarStatus.toString());
                        if (radarVerifiedLocationToken != null) {
                            createMap.putMap(AnalyticsConstantsKt.KEY_TOKEN, RadarUtils.mapForJson(radarVerifiedLocationToken.toJson()));
                        }
                        promise.resolve(createMap);
                        return;
                    }
                    promise.reject(radarStatus.toString(), radarStatus.toString());
                } catch (JSONException e) {
                    Log.e(RadarModuleImpl.TAG, "JSONException", e);
                    promise.reject(Radar.RadarStatus.ERROR_SERVER.toString(), Radar.RadarStatus.ERROR_SERVER.toString());
                }
            }
        });
    }

    public void clearVerifiedLocationToken() {
        Radar.clearVerifiedLocationToken();
    }

    public void startTrackingEfficient() {
        Radar.startTracking(RadarTrackingOptions.EFFICIENT);
    }

    public void startTrackingResponsive() {
        Radar.startTracking(RadarTrackingOptions.RESPONSIVE);
    }

    public void startTrackingContinuous() {
        Radar.startTracking(RadarTrackingOptions.CONTINUOUS);
    }

    public void startTrackingCustom(ReadableMap readableMap) {
        try {
            Radar.startTracking(RadarTrackingOptions.fromJson(RadarUtils.jsonForMap(readableMap)));
        } catch (JSONException e) {
            Log.e(TAG, "JSONException", e);
        }
    }

    public void startTrackingVerified(ReadableMap readableMap) {
        int i = 1200;
        if (readableMap != null) {
            r0 = readableMap.hasKey(RadarTrackingOptions.KEY_BEACONS) ? readableMap.getBoolean(RadarTrackingOptions.KEY_BEACONS) : false;
            if (readableMap.hasKey("interval")) {
                i = readableMap.getInt("interval");
            }
        }
        Radar.startTrackingVerified(i, r0);
    }

    public void mockTracking(ReadableMap readableMap) {
        ReadableMap map = readableMap.getMap("origin");
        double d = map.getDouble("latitude");
        double d2 = map.getDouble("longitude");
        Location location = new Location(TAG);
        location.setLatitude(d);
        location.setLongitude(d2);
        ReadableMap map2 = readableMap.getMap("destination");
        double d3 = map2.getDouble("latitude");
        double d4 = map2.getDouble("longitude");
        Location location2 = new Location(TAG);
        location2.setLatitude(d3);
        location2.setLongitude(d4);
        String string = readableMap.getString("mode");
        Radar.RadarRouteMode radarRouteMode = Radar.RadarRouteMode.CAR;
        if (string.equals("FOOT") || string.equals("foot")) {
            radarRouteMode = Radar.RadarRouteMode.FOOT;
        } else if (string.equals("BIKE") || string.equals("bike")) {
            radarRouteMode = Radar.RadarRouteMode.BIKE;
        } else if (string.equals("CAR") || string.equals("car")) {
            radarRouteMode = Radar.RadarRouteMode.CAR;
        }
        Radar.mockTracking(location, location2, radarRouteMode, readableMap.hasKey(ContainerStep.STEPS) ? readableMap.getInt(ContainerStep.STEPS) : 10, readableMap.hasKey("interval") ? readableMap.getInt("interval") : 1, new Radar.RadarTrackCallback() { // from class: com.radar.RadarModuleImpl.5
            @Override // io.radar.sdk.Radar.RadarTrackCallback
            public void onComplete(Radar.RadarStatus radarStatus, Location location3, RadarEvent[] radarEventArr, RadarUser radarUser) {
            }
        });
    }

    public void stopTracking() {
        Radar.stopTracking();
    }

    public void stopTrackingVerified() {
        Radar.stopTrackingVerified();
    }

    public void isTracking(Promise promise) {
        if (promise == null) {
            return;
        }
        promise.resolve(Boolean.valueOf(Radar.isTracking()));
    }

    public void getTrackingOptions(Promise promise) {
        if (promise == null) {
            return;
        }
        try {
            promise.resolve(RadarUtils.mapForJson(Radar.getTrackingOptions().toJson()));
        } catch (JSONException e) {
            Log.e(TAG, "JSONException", e);
            promise.reject(Radar.RadarStatus.ERROR_SERVER.toString(), Radar.RadarStatus.ERROR_SERVER.toString());
        }
    }

    public void isUsingRemoteTrackingOptions(Promise promise) {
        if (promise == null) {
            return;
        }
        promise.resolve(Boolean.valueOf(Radar.isUsingRemoteTrackingOptions()));
    }

    public void setForegroundServiceOptions(ReadableMap readableMap) {
        try {
            Radar.setForegroundServiceOptions(RadarTrackingOptions.RadarTrackingOptionsForegroundService.fromJson(RadarUtils.jsonForMap(readableMap)));
        } catch (JSONException e) {
            Log.e(TAG, "JSONException", e);
        }
    }

    public void setNotificationOptions(ReadableMap readableMap) {
        try {
            Radar.setNotificationOptions(RadarNotificationOptions.fromJson(RadarUtils.jsonForMap(readableMap)));
        } catch (JSONException e) {
            Log.e(TAG, "JSONException", e);
        }
    }

    public void acceptEvent(String str, String str2) {
        Radar.acceptEvent(str, str2);
    }

    public void rejectEvent(String str) {
        Radar.rejectEvent(str);
    }

    public void getTripOptions(Promise promise) {
        if (promise == null) {
            return;
        }
        try {
            RadarTripOptions tripOptions = Radar.getTripOptions();
            promise.resolve(tripOptions != null ? RadarUtils.mapForJson(tripOptions.toJson()) : null);
        } catch (JSONException e) {
            Log.e(TAG, "JSONException", e);
            promise.reject(Radar.RadarStatus.ERROR_SERVER.toString(), Radar.RadarStatus.ERROR_SERVER.toString());
        }
    }

    public void startTrip(ReadableMap readableMap, final Promise promise) {
        try {
            JSONObject jsonForMap = RadarUtils.jsonForMap(readableMap);
            JSONObject optJSONObject = jsonForMap.optJSONObject("tripOptions");
            if (optJSONObject == null) {
                optJSONObject = jsonForMap;
            }
            RadarTripOptions fromJson = RadarTripOptions.fromJson(optJSONObject);
            JSONObject optJSONObject2 = jsonForMap.optJSONObject("trackingOptions");
            Radar.startTrip(fromJson, optJSONObject2 != null ? RadarTrackingOptions.fromJson(optJSONObject2) : null, new Radar.RadarTripCallback() { // from class: com.radar.RadarModuleImpl.6
                @Override // io.radar.sdk.Radar.RadarTripCallback
                public void onComplete(Radar.RadarStatus radarStatus, RadarTrip radarTrip, RadarEvent[] radarEventArr) {
                    if (promise == null) {
                        return;
                    }
                    try {
                        if (radarStatus == Radar.RadarStatus.SUCCESS) {
                            WritableMap createMap = Arguments.createMap();
                            createMap.putString("status", radarStatus.toString());
                            if (radarTrip != null) {
                                createMap.putMap("trip", RadarUtils.mapForJson(radarTrip.toJson()));
                            }
                            if (radarEventArr != null) {
                                createMap.putArray("events", RadarUtils.arrayForJson(RadarEvent.toJson(radarEventArr)));
                            }
                            promise.resolve(createMap);
                            return;
                        }
                        promise.reject(radarStatus.toString(), radarStatus.toString());
                    } catch (JSONException e) {
                        Log.e(RadarModuleImpl.TAG, "JSONException", e);
                        promise.reject(Radar.RadarStatus.ERROR_SERVER.toString(), Radar.RadarStatus.ERROR_SERVER.toString());
                    }
                }
            });
        } catch (JSONException e) {
            Log.e(TAG, "JSONException", e);
            promise.reject(Radar.RadarStatus.ERROR_BAD_REQUEST.toString(), Radar.RadarStatus.ERROR_BAD_REQUEST.toString());
        }
    }

    public void completeTrip(final Promise promise) {
        Radar.completeTrip(new Radar.RadarTripCallback() { // from class: com.radar.RadarModuleImpl.7
            @Override // io.radar.sdk.Radar.RadarTripCallback
            public void onComplete(Radar.RadarStatus radarStatus, RadarTrip radarTrip, RadarEvent[] radarEventArr) {
                if (promise == null) {
                    return;
                }
                try {
                    if (radarStatus == Radar.RadarStatus.SUCCESS) {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putString("status", radarStatus.toString());
                        if (radarTrip != null) {
                            createMap.putMap("trip", RadarUtils.mapForJson(radarTrip.toJson()));
                        }
                        if (radarEventArr != null) {
                            createMap.putArray("events", RadarUtils.arrayForJson(RadarEvent.toJson(radarEventArr)));
                        }
                        promise.resolve(createMap);
                        return;
                    }
                    promise.reject(radarStatus.toString(), radarStatus.toString());
                } catch (JSONException e) {
                    Log.e(RadarModuleImpl.TAG, "JSONException", e);
                    promise.reject(Radar.RadarStatus.ERROR_SERVER.toString(), Radar.RadarStatus.ERROR_SERVER.toString());
                }
            }
        });
    }

    public void cancelTrip(final Promise promise) {
        Radar.cancelTrip(new Radar.RadarTripCallback() { // from class: com.radar.RadarModuleImpl.8
            @Override // io.radar.sdk.Radar.RadarTripCallback
            public void onComplete(Radar.RadarStatus radarStatus, RadarTrip radarTrip, RadarEvent[] radarEventArr) {
                if (promise == null) {
                    return;
                }
                try {
                    if (radarStatus == Radar.RadarStatus.SUCCESS) {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putString("status", radarStatus.toString());
                        if (radarTrip != null) {
                            createMap.putMap("trip", RadarUtils.mapForJson(radarTrip.toJson()));
                        }
                        if (radarEventArr != null) {
                            createMap.putArray("events", RadarUtils.arrayForJson(RadarEvent.toJson(radarEventArr)));
                        }
                        promise.resolve(createMap);
                        return;
                    }
                    promise.reject(radarStatus.toString(), radarStatus.toString());
                } catch (JSONException e) {
                    Log.e(RadarModuleImpl.TAG, "JSONException", e);
                    promise.reject(Radar.RadarStatus.ERROR_SERVER.toString(), Radar.RadarStatus.ERROR_SERVER.toString());
                }
            }
        });
    }

    public void updateTrip(ReadableMap readableMap, final Promise promise) {
        RadarTrip.RadarTripStatus radarTripStatus;
        try {
            JSONObject jsonForMap = RadarUtils.jsonForMap(readableMap);
            RadarTripOptions fromJson = RadarTripOptions.fromJson(jsonForMap.getJSONObject("options"));
            RadarTrip.RadarTripStatus radarTripStatus2 = RadarTrip.RadarTripStatus.UNKNOWN;
            if (jsonForMap.has("status")) {
                String string = jsonForMap.getString("status");
                if (string != null) {
                    if (string.equalsIgnoreCase("started")) {
                        radarTripStatus = RadarTrip.RadarTripStatus.STARTED;
                    } else if (string.equalsIgnoreCase("approaching")) {
                        radarTripStatus = RadarTrip.RadarTripStatus.APPROACHING;
                    } else if (string.equalsIgnoreCase("arrived")) {
                        radarTripStatus = RadarTrip.RadarTripStatus.ARRIVED;
                    } else if (string.equalsIgnoreCase(MetricTracker.Action.COMPLETED)) {
                        radarTripStatus = RadarTrip.RadarTripStatus.COMPLETED;
                    } else if (string.equalsIgnoreCase("canceled")) {
                        radarTripStatus = RadarTrip.RadarTripStatus.CANCELED;
                    } else if (string.equalsIgnoreCase("unknown")) {
                        radarTripStatus = RadarTrip.RadarTripStatus.UNKNOWN;
                    } else {
                        promise.reject(Radar.RadarStatus.ERROR_BAD_REQUEST.toString(), Radar.RadarStatus.ERROR_BAD_REQUEST.toString());
                    }
                    radarTripStatus2 = radarTripStatus;
                }
            } else {
                promise.reject(Radar.RadarStatus.ERROR_BAD_REQUEST.toString(), Radar.RadarStatus.ERROR_BAD_REQUEST.toString());
            }
            Radar.updateTrip(fromJson, radarTripStatus2, new Radar.RadarTripCallback() { // from class: com.radar.RadarModuleImpl.9
                @Override // io.radar.sdk.Radar.RadarTripCallback
                public void onComplete(Radar.RadarStatus radarStatus, RadarTrip radarTrip, RadarEvent[] radarEventArr) {
                    if (promise == null) {
                        return;
                    }
                    try {
                        if (radarStatus == Radar.RadarStatus.SUCCESS) {
                            WritableMap createMap = Arguments.createMap();
                            createMap.putString("status", radarStatus.toString());
                            if (radarTrip != null) {
                                createMap.putMap("trip", RadarUtils.mapForJson(radarTrip.toJson()));
                            }
                            if (radarEventArr != null) {
                                createMap.putArray("events", RadarUtils.arrayForJson(RadarEvent.toJson(radarEventArr)));
                            }
                            promise.resolve(createMap);
                            return;
                        }
                        promise.reject(radarStatus.toString(), radarStatus.toString());
                    } catch (JSONException e) {
                        Log.e(RadarModuleImpl.TAG, "JSONException", e);
                        promise.reject(Radar.RadarStatus.ERROR_SERVER.toString(), Radar.RadarStatus.ERROR_SERVER.toString());
                    }
                }
            });
        } catch (JSONException e) {
            Log.e(TAG, "JSONException", e);
            promise.reject(Radar.RadarStatus.ERROR_BAD_REQUEST.toString(), Radar.RadarStatus.ERROR_BAD_REQUEST.toString());
        }
    }

    public void getContext(ReadableMap readableMap, final Promise promise) {
        if (promise == null) {
            return;
        }
        Radar.RadarContextCallback radarContextCallback = new Radar.RadarContextCallback() { // from class: com.radar.RadarModuleImpl.10
            @Override // io.radar.sdk.Radar.RadarContextCallback
            public void onComplete(Radar.RadarStatus radarStatus, Location location, RadarContext radarContext) {
                if (radarStatus == Radar.RadarStatus.SUCCESS) {
                    try {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putString("status", radarStatus.toString());
                        if (location != null) {
                            createMap.putMap(FirebaseAnalytics.Param.LOCATION, RadarUtils.mapForJson(Radar.jsonForLocation(location)));
                        }
                        if (radarContext != null) {
                            createMap.putMap("context", RadarUtils.mapForJson(radarContext.toJson()));
                        }
                        promise.resolve(createMap);
                        return;
                    } catch (JSONException e) {
                        Log.e(RadarModuleImpl.TAG, "JSONException", e);
                        promise.reject(Radar.RadarStatus.ERROR_SERVER.toString(), Radar.RadarStatus.ERROR_SERVER.toString());
                        return;
                    }
                }
                promise.reject(radarStatus.toString(), radarStatus.toString());
            }
        };
        if (readableMap == null) {
            Radar.getContext(radarContextCallback);
            return;
        }
        double d = readableMap.getDouble("latitude");
        double d2 = readableMap.getDouble("longitude");
        Location location = new Location(TAG);
        location.setLatitude(d);
        location.setLongitude(d2);
        Radar.getContext(location, radarContextCallback);
    }

    public void searchPlaces(ReadableMap readableMap, final Promise promise) {
        Location location;
        if (promise == null) {
            return;
        }
        if (readableMap.hasKey("near")) {
            ReadableMap map = readableMap.getMap("near");
            double d = map.getDouble("latitude");
            double d2 = map.getDouble("longitude");
            Location location2 = new Location(TAG);
            location2.setLatitude(d);
            location2.setLongitude(d2);
            location = location2;
        } else {
            location = null;
        }
        int i = readableMap.hasKey(BrazeGeofence.RADIUS_METERS) ? readableMap.getInt(BrazeGeofence.RADIUS_METERS) : 1000;
        String[] stringArrayForArray = readableMap.hasKey("chains") ? RadarUtils.stringArrayForArray(readableMap.getArray("chains")) : null;
        Map<String, String> stringStringMap = RadarUtils.stringStringMap(readableMap.getMap("chainMetadata"));
        String[] stringArrayForArray2 = readableMap.hasKey("categories") ? RadarUtils.stringArrayForArray(readableMap.getArray("categories")) : null;
        String[] stringArrayForArray3 = readableMap.hasKey("groups") ? RadarUtils.stringArrayForArray(readableMap.getArray("groups")) : null;
        String[] stringArrayForArray4 = readableMap.hasKey("countryCodes") ? RadarUtils.stringArrayForArray(readableMap.getArray("countryCodes")) : null;
        int i2 = readableMap.hasKey("limit") ? readableMap.getInt("limit") : 10;
        Radar.RadarSearchPlacesCallback radarSearchPlacesCallback = new Radar.RadarSearchPlacesCallback() { // from class: com.radar.RadarModuleImpl.11
            @Override // io.radar.sdk.Radar.RadarSearchPlacesCallback
            public void onComplete(Radar.RadarStatus radarStatus, Location location3, RadarPlace[] radarPlaceArr) {
                if (radarStatus == Radar.RadarStatus.SUCCESS) {
                    try {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putString("status", radarStatus.toString());
                        if (location3 != null) {
                            createMap.putMap(FirebaseAnalytics.Param.LOCATION, RadarUtils.mapForJson(Radar.jsonForLocation(location3)));
                        }
                        if (radarPlaceArr != null) {
                            createMap.putArray("places", RadarUtils.arrayForJson(RadarPlace.toJson(radarPlaceArr)));
                        }
                        promise.resolve(createMap);
                        return;
                    } catch (JSONException e) {
                        Log.e(RadarModuleImpl.TAG, "JSONException", e);
                        promise.reject(Radar.RadarStatus.ERROR_SERVER.toString(), Radar.RadarStatus.ERROR_SERVER.toString());
                        return;
                    }
                }
                promise.reject(radarStatus.toString(), radarStatus.toString());
            }
        };
        if (location != null) {
            Radar.searchPlaces(location, i, stringArrayForArray, stringStringMap, stringArrayForArray2, stringArrayForArray3, stringArrayForArray4, Integer.valueOf(i2), radarSearchPlacesCallback);
        } else {
            Radar.searchPlaces(i, stringArrayForArray, stringStringMap, stringArrayForArray2, stringArrayForArray3, stringArrayForArray4, Integer.valueOf(i2), radarSearchPlacesCallback);
        }
    }

    public void searchGeofences(ReadableMap readableMap, final Promise promise) {
        Location location;
        if (promise == null) {
            return;
        }
        JSONObject jSONObject = null;
        if (readableMap.hasKey("near")) {
            ReadableMap map = readableMap.getMap("near");
            double d = map.getDouble("latitude");
            double d2 = map.getDouble("longitude");
            Location location2 = new Location(TAG);
            location2.setLatitude(d);
            location2.setLongitude(d2);
            location = location2;
        } else {
            location = null;
        }
        Integer valueOf = readableMap.hasKey(BrazeGeofence.RADIUS_METERS) ? Integer.valueOf(readableMap.getInt(BrazeGeofence.RADIUS_METERS)) : null;
        String[] stringArrayForArray = readableMap.hasKey("tags") ? RadarUtils.stringArrayForArray(readableMap.getArray("tags")) : null;
        if (readableMap.hasKey("metadata")) {
            try {
                jSONObject = RadarUtils.jsonForMap(readableMap.getMap("metadata"));
            } catch (JSONException e) {
                Log.e(TAG, "JSONException", e);
                promise.reject(Radar.RadarStatus.ERROR_BAD_REQUEST.toString(), Radar.RadarStatus.ERROR_BAD_REQUEST.toString());
                return;
            }
        }
        JSONObject jSONObject2 = jSONObject;
        int i = readableMap.hasKey("limit") ? readableMap.getInt("limit") : 100;
        boolean z = readableMap.hasKey("includeGeometry") ? readableMap.getBoolean("includeGeometry") : false;
        Radar.RadarSearchGeofencesCallback radarSearchGeofencesCallback = new Radar.RadarSearchGeofencesCallback() { // from class: com.radar.RadarModuleImpl.12
            @Override // io.radar.sdk.Radar.RadarSearchGeofencesCallback
            public void onComplete(Radar.RadarStatus radarStatus, Location location3, RadarGeofence[] radarGeofenceArr) {
                if (radarStatus == Radar.RadarStatus.SUCCESS) {
                    try {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putString("status", radarStatus.toString());
                        if (location3 != null) {
                            createMap.putMap(FirebaseAnalytics.Param.LOCATION, RadarUtils.mapForJson(Radar.jsonForLocation(location3)));
                        }
                        if (radarGeofenceArr != null) {
                            createMap.putArray("geofences", RadarUtils.arrayForJson(RadarGeofence.toJson(radarGeofenceArr)));
                        }
                        promise.resolve(createMap);
                        return;
                    } catch (JSONException e2) {
                        Log.e(RadarModuleImpl.TAG, "JSONException", e2);
                        promise.reject(Radar.RadarStatus.ERROR_SERVER.toString(), Radar.RadarStatus.ERROR_SERVER.toString());
                        return;
                    }
                }
                promise.reject(radarStatus.toString(), radarStatus.toString());
            }
        };
        if (location != null) {
            Radar.searchGeofences(location, valueOf, stringArrayForArray, jSONObject2, Integer.valueOf(i), Boolean.valueOf(z), radarSearchGeofencesCallback);
        } else {
            Radar.searchGeofences(valueOf, stringArrayForArray, jSONObject2, Integer.valueOf(i), Boolean.valueOf(z), radarSearchGeofencesCallback);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void autocomplete(ReadableMap readableMap, final Promise promise) {
        Location location;
        String str;
        ReadableMap map;
        if (promise == null) {
            return;
        }
        if (!readableMap.hasKey(SearchIntents.EXTRA_QUERY)) {
            promise.reject(Radar.RadarStatus.ERROR_BAD_REQUEST.toString(), Radar.RadarStatus.ERROR_BAD_REQUEST.toString());
            return;
        }
        String string = readableMap.getString(SearchIntents.EXTRA_QUERY);
        if (readableMap.hasKey("near") && (map = readableMap.getMap("near")) != null && map.hasKey("latitude") && map.hasKey("longitude")) {
            try {
                double d = map.getDouble("latitude");
                double d2 = map.getDouble("longitude");
                Location location2 = new Location(TAG);
                location2.setLatitude(d);
                location2.setLongitude(d2);
                location = location2;
            } catch (Exception unused) {
                promise.reject(Radar.RadarStatus.ERROR_BAD_REQUEST.toString(), "Invalid near coordinates");
                return;
            }
        } else {
            location = null;
        }
        int i = readableMap.hasKey("limit") ? readableMap.getInt("limit") : 10;
        String str2 = RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE;
        if (!readableMap.hasKey(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE)) {
            str2 = "country";
            if (!readableMap.hasKey("country")) {
                str = null;
                Radar.autocomplete(string, location, readableMap.hasKey("layers") ? RadarUtils.stringArrayForArray(readableMap.getArray("layers")) : null, Integer.valueOf(i), str, (Boolean) true, Boolean.valueOf(!readableMap.hasKey("mailable") ? readableMap.getBoolean("mailable") : false), new Radar.RadarGeocodeCallback() { // from class: com.radar.RadarModuleImpl.13
                    @Override // io.radar.sdk.Radar.RadarGeocodeCallback
                    public void onComplete(Radar.RadarStatus radarStatus, RadarAddress[] radarAddressArr) {
                        if (radarStatus == Radar.RadarStatus.SUCCESS) {
                            try {
                                WritableMap createMap = Arguments.createMap();
                                createMap.putString("status", radarStatus.toString());
                                if (radarAddressArr != null) {
                                    createMap.putArray("addresses", RadarUtils.arrayForJson(RadarAddress.toJson(radarAddressArr)));
                                }
                                promise.resolve(createMap);
                                return;
                            } catch (JSONException e) {
                                Log.e(RadarModuleImpl.TAG, "JSONException", e);
                                promise.reject(Radar.RadarStatus.ERROR_SERVER.toString(), Radar.RadarStatus.ERROR_SERVER.toString());
                                return;
                            }
                        }
                        promise.reject(radarStatus.toString(), radarStatus.toString());
                    }
                });
            }
        }
        str = readableMap.getString(str2);
        Radar.autocomplete(string, location, readableMap.hasKey("layers") ? RadarUtils.stringArrayForArray(readableMap.getArray("layers")) : null, Integer.valueOf(i), str, (Boolean) true, Boolean.valueOf(!readableMap.hasKey("mailable") ? readableMap.getBoolean("mailable") : false), new Radar.RadarGeocodeCallback() { // from class: com.radar.RadarModuleImpl.13
            @Override // io.radar.sdk.Radar.RadarGeocodeCallback
            public void onComplete(Radar.RadarStatus radarStatus, RadarAddress[] radarAddressArr) {
                if (radarStatus == Radar.RadarStatus.SUCCESS) {
                    try {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putString("status", radarStatus.toString());
                        if (radarAddressArr != null) {
                            createMap.putArray("addresses", RadarUtils.arrayForJson(RadarAddress.toJson(radarAddressArr)));
                        }
                        promise.resolve(createMap);
                        return;
                    } catch (JSONException e) {
                        Log.e(RadarModuleImpl.TAG, "JSONException", e);
                        promise.reject(Radar.RadarStatus.ERROR_SERVER.toString(), Radar.RadarStatus.ERROR_SERVER.toString());
                        return;
                    }
                }
                promise.reject(radarStatus.toString(), radarStatus.toString());
            }
        });
    }

    public void geocode(ReadableMap readableMap, final Promise promise) {
        if (promise == null) {
            return;
        }
        if (!readableMap.hasKey("address")) {
            promise.reject(Radar.RadarStatus.ERROR_BAD_REQUEST.toString(), Radar.RadarStatus.ERROR_BAD_REQUEST.toString());
        } else {
            Radar.geocode(readableMap.getString("address"), readableMap.hasKey("layers") ? RadarUtils.stringArrayForArray(readableMap.getArray("layers")) : null, readableMap.hasKey("countries") ? RadarUtils.stringArrayForArray(readableMap.getArray("countries")) : null, new Radar.RadarGeocodeCallback() { // from class: com.radar.RadarModuleImpl.14
                @Override // io.radar.sdk.Radar.RadarGeocodeCallback
                public void onComplete(Radar.RadarStatus radarStatus, RadarAddress[] radarAddressArr) {
                    if (radarStatus == Radar.RadarStatus.SUCCESS) {
                        try {
                            WritableMap createMap = Arguments.createMap();
                            createMap.putString("status", radarStatus.toString());
                            if (radarAddressArr != null) {
                                createMap.putArray("addresses", RadarUtils.arrayForJson(RadarAddress.toJson(radarAddressArr)));
                            }
                            promise.resolve(createMap);
                            return;
                        } catch (JSONException e) {
                            Log.e(RadarModuleImpl.TAG, "JSONException", e);
                            promise.reject(Radar.RadarStatus.ERROR_SERVER.toString(), Radar.RadarStatus.ERROR_SERVER.toString());
                            return;
                        }
                    }
                    promise.reject(radarStatus.toString(), radarStatus.toString());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.String[]] */
    public void reverseGeocode(ReadableMap readableMap, final Promise promise) {
        ?? r7;
        if (promise == null) {
            return;
        }
        if (readableMap != null) {
            ReadableMap map = readableMap.getMap(FirebaseAnalytics.Param.LOCATION);
            r7 = readableMap.hasKey("layers") ? RadarUtils.stringArrayForArray(readableMap.getArray("layers")) : null;
            r0 = map;
        } else {
            r7 = 0;
        }
        Radar.RadarGeocodeCallback radarGeocodeCallback = new Radar.RadarGeocodeCallback() { // from class: com.radar.RadarModuleImpl.15
            @Override // io.radar.sdk.Radar.RadarGeocodeCallback
            public void onComplete(Radar.RadarStatus radarStatus, RadarAddress[] radarAddressArr) {
                if (radarStatus == Radar.RadarStatus.SUCCESS) {
                    try {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putString("status", radarStatus.toString());
                        if (radarAddressArr != null) {
                            createMap.putArray("addresses", RadarUtils.arrayForJson(RadarAddress.toJson(radarAddressArr)));
                        }
                        promise.resolve(createMap);
                        return;
                    } catch (JSONException e) {
                        Log.e(RadarModuleImpl.TAG, "JSONException", e);
                        promise.reject(Radar.RadarStatus.ERROR_SERVER.toString(), Radar.RadarStatus.ERROR_SERVER.toString());
                        return;
                    }
                }
                promise.reject(radarStatus.toString(), radarStatus.toString());
            }
        };
        if (r0 != null) {
            double d = r0.getDouble("latitude");
            double d2 = r0.getDouble("longitude");
            Location location = new Location(TAG);
            location.setLatitude(d);
            location.setLongitude(d2);
            Radar.reverseGeocode(location, (String[]) r7, radarGeocodeCallback);
            return;
        }
        Radar.reverseGeocode((String[]) r7, radarGeocodeCallback);
    }

    public void ipGeocode(final Promise promise) {
        if (promise == null) {
            return;
        }
        Radar.ipGeocode(new Radar.RadarIpGeocodeCallback() { // from class: com.radar.RadarModuleImpl.16
            @Override // io.radar.sdk.Radar.RadarIpGeocodeCallback
            public void onComplete(Radar.RadarStatus radarStatus, RadarAddress radarAddress, boolean z) {
                if (radarStatus == Radar.RadarStatus.SUCCESS) {
                    try {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putString("status", radarStatus.toString());
                        if (radarAddress != null) {
                            createMap.putMap("address", RadarUtils.mapForJson(radarAddress.toJson()));
                            createMap.putBoolean("proxy", z);
                        }
                        promise.resolve(createMap);
                        return;
                    } catch (JSONException e) {
                        Log.e(RadarModuleImpl.TAG, "JSONException", e);
                        promise.reject(Radar.RadarStatus.ERROR_SERVER.toString(), Radar.RadarStatus.ERROR_SERVER.toString());
                        return;
                    }
                }
                promise.reject(radarStatus.toString(), radarStatus.toString());
            }
        });
    }

    public void validateAddress(ReadableMap readableMap, final Promise promise) {
        if (promise == null) {
            return;
        }
        try {
            Radar.validateAddress(RadarAddress.fromJson(RadarUtils.jsonForMap(readableMap)), new Radar.RadarValidateAddressCallback() { // from class: com.radar.RadarModuleImpl.17
                @Override // io.radar.sdk.Radar.RadarValidateAddressCallback
                public void onComplete(Radar.RadarStatus radarStatus, RadarAddress radarAddress, Radar.RadarAddressVerificationStatus radarAddressVerificationStatus) {
                    if (radarStatus == Radar.RadarStatus.SUCCESS) {
                        try {
                            WritableMap createMap = Arguments.createMap();
                            createMap.putString("status", radarStatus.toString());
                            if (radarAddress != null) {
                                createMap.putMap("address", RadarUtils.mapForJson(radarAddress.toJson()));
                            }
                            if (radarAddressVerificationStatus != null) {
                                createMap.putString("verificationStatus", radarAddressVerificationStatus.toString());
                            }
                            promise.resolve(createMap);
                            return;
                        } catch (JSONException e) {
                            Log.e(RadarModuleImpl.TAG, "JSONException", e);
                            promise.reject(Radar.RadarStatus.ERROR_SERVER.toString(), Radar.RadarStatus.ERROR_SERVER.toString());
                            return;
                        }
                    }
                    promise.reject(radarStatus.toString(), radarStatus.toString());
                }
            });
        } catch (JSONException unused) {
            promise.reject(Radar.RadarStatus.ERROR_BAD_REQUEST.toString(), Radar.RadarStatus.ERROR_BAD_REQUEST.toString());
        }
    }

    public void getDistance(ReadableMap readableMap, final Promise promise) {
        Location location;
        if (promise == null) {
            return;
        }
        if (!readableMap.hasKey("destination")) {
            promise.reject(Radar.RadarStatus.ERROR_BAD_REQUEST.toString(), Radar.RadarStatus.ERROR_BAD_REQUEST.toString());
            return;
        }
        ReadableMap map = readableMap.getMap("origin");
        if (map != null) {
            double d = map.getDouble("latitude");
            double d2 = map.getDouble("longitude");
            location = new Location(TAG);
            location.setLatitude(d);
            location.setLongitude(d2);
        } else {
            location = null;
        }
        ReadableMap map2 = readableMap.getMap("destination");
        double d3 = map2.getDouble("latitude");
        double d4 = map2.getDouble("longitude");
        Location location2 = new Location(TAG);
        location2.setLatitude(d3);
        location2.setLongitude(d4);
        String[] stringArrayForArray = readableMap.hasKey("modes") ? RadarUtils.stringArrayForArray(readableMap.getArray("modes")) : new String[0];
        EnumSet noneOf = EnumSet.noneOf(Radar.RadarRouteMode.class);
        for (String str : stringArrayForArray) {
            if (str.equals("FOOT") || str.equals("foot")) {
                noneOf.add(Radar.RadarRouteMode.FOOT);
            }
            if (str.equals("BIKE") || str.equals("bike")) {
                noneOf.add(Radar.RadarRouteMode.BIKE);
            }
            if (str.equals("CAR") || str.equals("car")) {
                noneOf.add(Radar.RadarRouteMode.CAR);
            }
        }
        String string = readableMap.hasKey("units") ? readableMap.getString("units") : null;
        Radar.RadarRouteUnits radarRouteUnits = (string == null || !(string.equals("METRIC") || string.equals(AnalyticsConstantsKt.METRIC))) ? Radar.RadarRouteUnits.IMPERIAL : Radar.RadarRouteUnits.METRIC;
        Radar.RadarRouteCallback radarRouteCallback = new Radar.RadarRouteCallback() { // from class: com.radar.RadarModuleImpl.18
            @Override // io.radar.sdk.Radar.RadarRouteCallback
            public void onComplete(Radar.RadarStatus radarStatus, RadarRoutes radarRoutes) {
                if (radarStatus == Radar.RadarStatus.SUCCESS) {
                    try {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putString("status", radarStatus.toString());
                        if (radarRoutes != null) {
                            createMap.putMap("routes", RadarUtils.mapForJson(radarRoutes.toJson()));
                        }
                        promise.resolve(createMap);
                        return;
                    } catch (JSONException e) {
                        Log.e(RadarModuleImpl.TAG, "JSONException", e);
                        promise.reject(Radar.RadarStatus.ERROR_SERVER.toString(), Radar.RadarStatus.ERROR_SERVER.toString());
                        return;
                    }
                }
                promise.reject(radarStatus.toString(), radarStatus.toString());
            }
        };
        if (location != null) {
            Radar.getDistance(location, location2, (EnumSet<Radar.RadarRouteMode>) noneOf, radarRouteUnits, radarRouteCallback);
        } else {
            Radar.getDistance(location2, (EnumSet<Radar.RadarRouteMode>) noneOf, radarRouteUnits, radarRouteCallback);
        }
    }

    public void getMatrix(ReadableMap readableMap, final Promise promise) {
        if (promise == null) {
            return;
        }
        ReadableArray array = readableMap.getArray("origins");
        Location[] locationArr = new Location[array.size()];
        for (int i = 0; i < array.size(); i++) {
            ReadableMap map = array.getMap(i);
            double d = map.getDouble("latitude");
            double d2 = map.getDouble("longitude");
            Location location = new Location(TAG);
            location.setLatitude(d);
            location.setLongitude(d2);
            locationArr[i] = location;
        }
        ReadableArray array2 = readableMap.getArray("destinations");
        Location[] locationArr2 = new Location[array2.size()];
        for (int i2 = 0; i2 < array2.size(); i2++) {
            ReadableMap map2 = array2.getMap(i2);
            double d3 = map2.getDouble("latitude");
            double d4 = map2.getDouble("longitude");
            Location location2 = new Location(TAG);
            location2.setLatitude(d3);
            location2.setLongitude(d4);
            locationArr2[i2] = location2;
        }
        String string = readableMap.getString("mode");
        Radar.RadarRouteMode radarRouteMode = Radar.RadarRouteMode.CAR;
        if (string != null) {
            if (string.equals("FOOT") || string.equals("foot")) {
                radarRouteMode = Radar.RadarRouteMode.FOOT;
            } else if (string.equals("BIKE") || string.equals("bike")) {
                radarRouteMode = Radar.RadarRouteMode.BIKE;
            } else if (string.equals("CAR") || string.equals("car")) {
                radarRouteMode = Radar.RadarRouteMode.CAR;
            } else if (string.equals("TRUCK") || string.equals("truck")) {
                radarRouteMode = Radar.RadarRouteMode.TRUCK;
            } else if (string.equals("MOTORBIKE") || string.equals("motorbike")) {
                radarRouteMode = Radar.RadarRouteMode.MOTORBIKE;
            }
        }
        String string2 = readableMap.hasKey("units") ? readableMap.getString("units") : null;
        Radar.getMatrix(locationArr, locationArr2, radarRouteMode, (string2 == null || !(string2.equals("METRIC") || string2.equals(AnalyticsConstantsKt.METRIC))) ? Radar.RadarRouteUnits.IMPERIAL : Radar.RadarRouteUnits.METRIC, new Radar.RadarMatrixCallback() { // from class: com.radar.RadarModuleImpl.19
            @Override // io.radar.sdk.Radar.RadarMatrixCallback
            public void onComplete(Radar.RadarStatus radarStatus, RadarRouteMatrix radarRouteMatrix) {
                if (radarStatus == Radar.RadarStatus.SUCCESS) {
                    try {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putString("status", radarStatus.toString());
                        if (radarRouteMatrix != null) {
                            createMap.putArray("matrix", RadarUtils.arrayForJson(radarRouteMatrix.toJson()));
                        }
                        promise.resolve(createMap);
                        return;
                    } catch (JSONException e) {
                        Log.e(RadarModuleImpl.TAG, "JSONException", e);
                        promise.reject(Radar.RadarStatus.ERROR_SERVER.toString(), Radar.RadarStatus.ERROR_SERVER.toString());
                        return;
                    }
                }
                promise.reject(radarStatus.toString(), radarStatus.toString());
            }
        });
    }

    public void logConversion(ReadableMap readableMap, final Promise promise) throws JSONException {
        if (promise == null) {
            return;
        }
        if (!readableMap.hasKey("name")) {
            promise.reject(Radar.RadarStatus.ERROR_BAD_REQUEST.toString(), Radar.RadarStatus.ERROR_BAD_REQUEST.toString());
            return;
        }
        String string = readableMap.getString("name");
        Double d = readableMap.hasKey("revenue") ? new Double(readableMap.getDouble("revenue")) : null;
        JSONObject jsonForMap = RadarUtils.jsonForMap(readableMap.hasKey("metadata") ? readableMap.getMap("metadata") : null);
        Radar.RadarLogConversionCallback radarLogConversionCallback = new Radar.RadarLogConversionCallback() { // from class: com.radar.RadarModuleImpl.20
            @Override // io.radar.sdk.Radar.RadarLogConversionCallback
            public void onComplete(Radar.RadarStatus radarStatus, RadarEvent radarEvent) {
                try {
                    if (radarStatus == Radar.RadarStatus.SUCCESS) {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putString("status", radarStatus.toString());
                        if (radarEvent != null) {
                            createMap.putMap("event", RadarUtils.mapForJson(radarEvent.toJson()));
                        }
                        promise.resolve(createMap);
                        return;
                    }
                    promise.reject(radarStatus.toString(), radarStatus.toString());
                } catch (JSONException e) {
                    Log.e(RadarModuleImpl.TAG, "JSONException", e);
                    promise.reject(Radar.RadarStatus.ERROR_SERVER.toString(), Radar.RadarStatus.ERROR_SERVER.toString());
                }
            }
        };
        if (d != null) {
            Radar.logConversion(string, d.doubleValue(), jsonForMap, radarLogConversionCallback);
        } else {
            Radar.logConversion(string, jsonForMap, radarLogConversionCallback);
        }
    }

    public void showInAppMessage(ReadableMap readableMap) {
        try {
            Radar.showInAppMessage(RadarInAppMessage.fromJson(RadarUtils.jsonForMap(readableMap).toString()));
        } catch (JSONException e) {
            Log.e(TAG, "JSONException", e);
        }
    }
}
