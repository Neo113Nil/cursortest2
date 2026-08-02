package com.amplitude.reactnative;

import com.amplitude.api.Amplitude;
import com.amplitude.api.AmplitudeClient;
import com.amplitude.api.AmplitudeLogCallback;
import com.amplitude.api.AmplitudeServerZone;
import com.amplitude.api.Constants;
import com.amplitude.api.Identify;
import com.amplitude.api.IngestionMetadata;
import com.amplitude.api.Plan;
import com.amplitude.api.Revenue;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ReactModule(name = AmplitudeReactNativeModule.NAME)
/* loaded from: classes4.dex */
public class AmplitudeReactNativeModule extends ReactContextBaseJavaModule {
    public static final String NAME = "AmplitudeReactNative";
    private final ReactApplicationContext reactContext;

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    public AmplitudeReactNativeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void initialize(String str, String str2, Promise promise) {
        Amplitude.getInstance(str).initialize(this.reactContext, str2);
        promise.resolve(true);
    }

    @ReactMethod
    public void logEvent(String str, String str2, Promise promise) {
        AmplitudeClient amplitude = Amplitude.getInstance(str);
        synchronized (amplitude) {
            amplitude.logEvent(str2);
            promise.resolve(true);
        }
    }

    @ReactMethod
    public void logEventWithProperties(String str, String str2, ReadableMap readableMap, Promise promise) throws JSONException {
        JSONObject convertMapToJson = ReactNativeHelper.convertMapToJson(readableMap);
        AmplitudeClient amplitude = Amplitude.getInstance(str);
        synchronized (amplitude) {
            amplitude.logEvent(str2, convertMapToJson);
            promise.resolve(true);
        }
    }

    @ReactMethod
    public void enableCoppaControl(String str, Promise promise) {
        AmplitudeClient amplitude = Amplitude.getInstance(str);
        synchronized (amplitude) {
            amplitude.enableCoppaControl();
            promise.resolve(true);
        }
    }

    @ReactMethod
    public void disableCoppaControl(String str, Promise promise) {
        AmplitudeClient amplitude = Amplitude.getInstance(str);
        synchronized (amplitude) {
            amplitude.disableCoppaControl();
            promise.resolve(true);
        }
    }

    @ReactMethod
    public void regenerateDeviceId(String str, Promise promise) {
        AmplitudeClient amplitude = Amplitude.getInstance(str);
        synchronized (amplitude) {
            amplitude.regenerateDeviceId();
            promise.resolve(true);
        }
    }

    @ReactMethod
    public void setDeviceId(String str, String str2, Promise promise) {
        AmplitudeClient amplitude = Amplitude.getInstance(str);
        synchronized (amplitude) {
            amplitude.setDeviceId(str2);
            promise.resolve(true);
        }
    }

    @ReactMethod
    public void getDeviceId(String str, Promise promise) {
        AmplitudeClient amplitude = Amplitude.getInstance(str);
        synchronized (amplitude) {
            promise.resolve(amplitude.getDeviceId());
        }
    }

    @ReactMethod
    public void setAdvertisingIdForDeviceId(String str, Promise promise) {
        AmplitudeClient amplitude = Amplitude.getInstance(str);
        synchronized (amplitude) {
            amplitude.useAdvertisingIdForDeviceId();
            promise.resolve(true);
        }
    }

    @ReactMethod
    public void setAppSetIdForDeviceId(String str, Promise promise) {
        AmplitudeClient amplitude = Amplitude.getInstance(str);
        synchronized (amplitude) {
            amplitude.useAppSetIdForDeviceId();
            promise.resolve(true);
        }
    }

    @ReactMethod
    public void setOptOut(String str, boolean z, Promise promise) {
        AmplitudeClient amplitude = Amplitude.getInstance(str);
        synchronized (amplitude) {
            amplitude.setOptOut(z);
            promise.resolve(true);
        }
    }

    @ReactMethod
    public void setLibraryName(String str, String str2, Promise promise) {
        AmplitudeClient amplitude = Amplitude.getInstance(str);
        synchronized (amplitude) {
            amplitude.setLibraryName(str2);
            promise.resolve(true);
        }
    }

    @ReactMethod
    public void setLibraryVersion(String str, String str2, Promise promise) {
        AmplitudeClient amplitude = Amplitude.getInstance(str);
        synchronized (amplitude) {
            amplitude.setLibraryVersion(str2);
            promise.resolve(true);
        }
    }

    @ReactMethod
    public void trackingSessionEvents(String str, boolean z, Promise promise) {
        AmplitudeClient amplitude = Amplitude.getInstance(str);
        synchronized (amplitude) {
            amplitude.trackSessionEvents(z);
            promise.resolve(true);
        }
    }

    @ReactMethod
    public void setUseDynamicConfig(String str, boolean z, Promise promise) {
        AmplitudeClient amplitude = Amplitude.getInstance(str);
        synchronized (amplitude) {
            amplitude.setUseDynamicConfig(z);
            promise.resolve(true);
        }
    }

    @ReactMethod
    public void setUserId(String str, String str2, Promise promise) {
        AmplitudeClient amplitude = Amplitude.getInstance(str);
        synchronized (amplitude) {
            amplitude.setUserId(str2);
            promise.resolve(true);
        }
    }

    @ReactMethod
    public void setServerUrl(String str, String str2, Promise promise) {
        AmplitudeClient amplitude = Amplitude.getInstance(str);
        synchronized (amplitude) {
            amplitude.setServerUrl(str2);
            promise.resolve(true);
        }
    }

    @ReactMethod
    public void logRevenueV2(String str, ReadableMap readableMap, Promise promise) throws JSONException {
        JSONObject convertMapToJson = ReactNativeHelper.convertMapToJson(readableMap);
        AmplitudeClient amplitude = Amplitude.getInstance(str);
        synchronized (amplitude) {
            amplitude.logRevenueV2(createRevenue(convertMapToJson));
            promise.resolve(true);
        }
    }

    @ReactMethod
    public void identify(String str, ReadableMap readableMap, Promise promise) throws JSONException {
        JSONObject convertMapToJson = ReactNativeHelper.convertMapToJson(readableMap);
        AmplitudeClient amplitude = Amplitude.getInstance(str);
        synchronized (amplitude) {
            amplitude.identify(createIdentify(convertMapToJson));
            promise.resolve(true);
        }
    }

    @ReactMethod
    public void groupIdentify(String str, String str2, String str3, ReadableMap readableMap, Promise promise) throws JSONException {
        JSONObject convertMapToJson = ReactNativeHelper.convertMapToJson(readableMap);
        AmplitudeClient amplitude = Amplitude.getInstance(str);
        synchronized (amplitude) {
            amplitude.groupIdentify(str2, str3, createIdentify(convertMapToJson));
            promise.resolve(true);
        }
    }

    @ReactMethod
    public void setUserProperties(String str, ReadableMap readableMap, Promise promise) throws JSONException {
        JSONObject convertMapToJson = ReactNativeHelper.convertMapToJson(readableMap);
        AmplitudeClient amplitude = Amplitude.getInstance(str);
        synchronized (amplitude) {
            amplitude.setUserProperties(convertMapToJson);
            promise.resolve(true);
        }
    }

    @ReactMethod
    public void clearUserProperties(String str, Promise promise) {
        AmplitudeClient amplitude = Amplitude.getInstance(str);
        synchronized (amplitude) {
            amplitude.clearUserProperties();
            promise.resolve(true);
        }
    }

    @ReactMethod
    public void setGroup(String str, String str2, String str3, Promise promise) {
        AmplitudeClient amplitude = Amplitude.getInstance(str);
        synchronized (amplitude) {
            amplitude.setGroup(str2, str3);
            promise.resolve(true);
        }
    }

    @ReactMethod
    public void uploadEvents(String str, Promise promise) {
        AmplitudeClient amplitude = Amplitude.getInstance(str);
        synchronized (amplitude) {
            amplitude.uploadEvents();
            promise.resolve(true);
        }
    }

    @ReactMethod
    public void getSessionId(String str, Promise promise) {
        synchronized (Amplitude.getInstance(str)) {
            promise.resolve(Double.valueOf(r3.getSessionId()));
        }
    }

    @ReactMethod
    public void setMinTimeBetweenSessionsMillis(String str, double d, Promise promise) {
        AmplitudeClient amplitude = Amplitude.getInstance(str);
        synchronized (amplitude) {
            amplitude.setMinTimeBetweenSessionsMillis((long) d);
            promise.resolve(true);
        }
    }

    @ReactMethod
    public void setServerZone(String str, String str2, boolean z, Promise promise) {
        AmplitudeClient amplitude = Amplitude.getInstance(str);
        synchronized (amplitude) {
            amplitude.setServerZone(str2.equals("EU") ? AmplitudeServerZone.EU : AmplitudeServerZone.US, z);
            promise.resolve(true);
        }
    }

    @ReactMethod
    public void setEventUploadMaxBatchSize(String str, int i, Promise promise) {
        AmplitudeClient amplitude = Amplitude.getInstance(str);
        synchronized (amplitude) {
            amplitude.setEventUploadMaxBatchSize(i);
            promise.resolve(true);
        }
    }

    @ReactMethod
    public void setEventUploadPeriodMillis(String str, int i, Promise promise) {
        AmplitudeClient amplitude = Amplitude.getInstance(str);
        synchronized (amplitude) {
            amplitude.setEventUploadPeriodMillis(i);
            promise.resolve(true);
        }
    }

    @ReactMethod
    public void setEventUploadThreshold(String str, int i, Promise promise) {
        AmplitudeClient amplitude = Amplitude.getInstance(str);
        synchronized (amplitude) {
            amplitude.setEventUploadThreshold(i);
            promise.resolve(true);
        }
    }

    @ReactMethod
    public void setPlan(String str, ReadableMap readableMap, Promise promise) {
        Plan plan = new Plan();
        if (readableMap.hasKey(Constants.AMP_PLAN_BRANCH)) {
            plan.setBranch(readableMap.getString(Constants.AMP_PLAN_BRANCH));
        }
        if (readableMap.hasKey("source")) {
            plan.setSource(readableMap.getString("source"));
        }
        if (readableMap.hasKey("version")) {
            plan.setVersion(readableMap.getString("version"));
        }
        if (readableMap.hasKey(Constants.AMP_PLAN_VERSION_ID)) {
            plan.setVersionId(readableMap.getString(Constants.AMP_PLAN_VERSION_ID));
        }
        AmplitudeClient amplitude = Amplitude.getInstance(str);
        synchronized (amplitude) {
            amplitude.setPlan(plan);
            promise.resolve(true);
        }
    }

    @ReactMethod
    public void setIngestionMetadata(String str, ReadableMap readableMap, Promise promise) {
        IngestionMetadata ingestionMetadata = new IngestionMetadata();
        if (readableMap.hasKey("sourceName")) {
            ingestionMetadata.setSourceName(readableMap.getString("sourceName"));
        }
        if (readableMap.hasKey("sourceVersion")) {
            ingestionMetadata.setSourceVersion(readableMap.getString("sourceVersion"));
        }
        AmplitudeClient amplitude = Amplitude.getInstance(str);
        synchronized (amplitude) {
            amplitude.setIngestionMetadata(ingestionMetadata);
            promise.resolve(true);
        }
    }

    @ReactMethod
    public void enableLogging(String str, Boolean bool, Promise promise) {
        AmplitudeClient amplitude = Amplitude.getInstance(str);
        synchronized (amplitude) {
            amplitude.enableLogging(bool.booleanValue());
            if (bool.booleanValue()) {
                amplitude.setLogCallback(new AmplitudeLogCallback() { // from class: com.amplitude.reactnative.AmplitudeReactNativeModule.1
                    @Override // com.amplitude.api.AmplitudeLogCallback
                    public void onError(String str2, String str3) {
                        WritableNativeMap writableNativeMap = new WritableNativeMap();
                        writableNativeMap.putString("tag", str2);
                        writableNativeMap.putString("message", str3);
                        ((DeviceEventManagerModule.RCTDeviceEventEmitter) AmplitudeReactNativeModule.this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("AmplitudeLogError", writableNativeMap);
                    }
                });
            } else {
                amplitude.setLogCallback(null);
            }
            promise.resolve(true);
        }
    }

    @ReactMethod
    public void setLogLevel(String str, Integer num, Promise promise) {
        AmplitudeClient amplitude = Amplitude.getInstance(str);
        synchronized (amplitude) {
            amplitude.setLogLevel(num.intValue());
            promise.resolve(true);
        }
    }

    private Revenue createRevenue(JSONObject jSONObject) {
        Revenue revenue = new Revenue();
        try {
            if (jSONObject.has("productId")) {
                revenue.setProductId(jSONObject.getString("productId"));
            }
            if (jSONObject.has(FirebaseAnalytics.Param.PRICE)) {
                revenue.setPrice(jSONObject.getDouble(FirebaseAnalytics.Param.PRICE));
            }
            if (jSONObject.has("quantity")) {
                revenue.setQuantity(jSONObject.getInt("quantity"));
            } else {
                revenue.setQuantity(1);
            }
            if (jSONObject.has("revenueType")) {
                revenue.setRevenueType(jSONObject.getString("revenueType"));
            }
            if (jSONObject.has("receipt") && jSONObject.has("receiptSignature")) {
                revenue.setReceipt(jSONObject.getString("receipt"), jSONObject.getString("receiptSignature"));
            }
            if (jSONObject.has("eventProperties")) {
                revenue.setEventProperties(jSONObject.getJSONObject("eventProperties"));
            }
        } catch (JSONException unused) {
        }
        return revenue;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b4 A[Catch: JSONException -> 0x0009, TryCatch #0 {JSONException -> 0x0009, blocks: (B:6:0x0015, B:7:0x001d, B:9:0x0023, B:10:0x002d, B:12:0x0031, B:16:0x0368, B:21:0x003b, B:25:0x021b, B:27:0x0223, B:28:0x028a, B:30:0x0292, B:31:0x02f9, B:33:0x0301, B:34:0x0309, B:36:0x0311, B:37:0x0319, B:39:0x0321, B:40:0x0329, B:42:0x0331, B:43:0x0339, B:45:0x0341, B:46:0x0349, B:48:0x0351, B:49:0x0359, B:51:0x0361, B:52:0x029a, B:54:0x02a2, B:55:0x02aa, B:57:0x02b2, B:58:0x02ba, B:60:0x02c2, B:61:0x02ca, B:63:0x02d2, B:64:0x02da, B:66:0x02e2, B:67:0x02ea, B:69:0x02f2, B:70:0x022b, B:72:0x0233, B:73:0x023b, B:75:0x0243, B:76:0x024b, B:78:0x0253, B:79:0x025b, B:81:0x0263, B:82:0x026b, B:84:0x0273, B:85:0x027b, B:87:0x0283, B:90:0x0045, B:94:0x00ba, B:96:0x00c2, B:97:0x013d, B:99:0x0145, B:100:0x01ac, B:102:0x01b4, B:103:0x01bc, B:105:0x01c4, B:106:0x01cc, B:108:0x01d4, B:109:0x01dc, B:111:0x01e4, B:112:0x01ec, B:114:0x01f4, B:115:0x01fc, B:117:0x0204, B:118:0x020c, B:120:0x0214, B:121:0x014d, B:123:0x0155, B:124:0x015d, B:126:0x0165, B:127:0x016d, B:129:0x0175, B:130:0x017d, B:132:0x0185, B:133:0x018d, B:135:0x0195, B:136:0x019d, B:138:0x01a5, B:139:0x00cb, B:141:0x00d3, B:142:0x00db, B:144:0x00e3, B:145:0x00eb, B:147:0x00f3, B:148:0x00fb, B:150:0x0103, B:151:0x010b, B:153:0x0113, B:154:0x011b, B:156:0x0123, B:159:0x004f, B:165:0x0059, B:171:0x0063, B:174:0x006b, B:176:0x0073, B:177:0x007b, B:179:0x0083, B:180:0x008b, B:182:0x0093, B:183:0x009b, B:185:0x00a3, B:186:0x00ab, B:188:0x00b3, B:191:0x012b, B:197:0x0135), top: B:5:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01bc A[Catch: JSONException -> 0x0009, TryCatch #0 {JSONException -> 0x0009, blocks: (B:6:0x0015, B:7:0x001d, B:9:0x0023, B:10:0x002d, B:12:0x0031, B:16:0x0368, B:21:0x003b, B:25:0x021b, B:27:0x0223, B:28:0x028a, B:30:0x0292, B:31:0x02f9, B:33:0x0301, B:34:0x0309, B:36:0x0311, B:37:0x0319, B:39:0x0321, B:40:0x0329, B:42:0x0331, B:43:0x0339, B:45:0x0341, B:46:0x0349, B:48:0x0351, B:49:0x0359, B:51:0x0361, B:52:0x029a, B:54:0x02a2, B:55:0x02aa, B:57:0x02b2, B:58:0x02ba, B:60:0x02c2, B:61:0x02ca, B:63:0x02d2, B:64:0x02da, B:66:0x02e2, B:67:0x02ea, B:69:0x02f2, B:70:0x022b, B:72:0x0233, B:73:0x023b, B:75:0x0243, B:76:0x024b, B:78:0x0253, B:79:0x025b, B:81:0x0263, B:82:0x026b, B:84:0x0273, B:85:0x027b, B:87:0x0283, B:90:0x0045, B:94:0x00ba, B:96:0x00c2, B:97:0x013d, B:99:0x0145, B:100:0x01ac, B:102:0x01b4, B:103:0x01bc, B:105:0x01c4, B:106:0x01cc, B:108:0x01d4, B:109:0x01dc, B:111:0x01e4, B:112:0x01ec, B:114:0x01f4, B:115:0x01fc, B:117:0x0204, B:118:0x020c, B:120:0x0214, B:121:0x014d, B:123:0x0155, B:124:0x015d, B:126:0x0165, B:127:0x016d, B:129:0x0175, B:130:0x017d, B:132:0x0185, B:133:0x018d, B:135:0x0195, B:136:0x019d, B:138:0x01a5, B:139:0x00cb, B:141:0x00d3, B:142:0x00db, B:144:0x00e3, B:145:0x00eb, B:147:0x00f3, B:148:0x00fb, B:150:0x0103, B:151:0x010b, B:153:0x0113, B:154:0x011b, B:156:0x0123, B:159:0x004f, B:165:0x0059, B:171:0x0063, B:174:0x006b, B:176:0x0073, B:177:0x007b, B:179:0x0083, B:180:0x008b, B:182:0x0093, B:183:0x009b, B:185:0x00a3, B:186:0x00ab, B:188:0x00b3, B:191:0x012b, B:197:0x0135), top: B:5:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x014d A[Catch: JSONException -> 0x0009, TryCatch #0 {JSONException -> 0x0009, blocks: (B:6:0x0015, B:7:0x001d, B:9:0x0023, B:10:0x002d, B:12:0x0031, B:16:0x0368, B:21:0x003b, B:25:0x021b, B:27:0x0223, B:28:0x028a, B:30:0x0292, B:31:0x02f9, B:33:0x0301, B:34:0x0309, B:36:0x0311, B:37:0x0319, B:39:0x0321, B:40:0x0329, B:42:0x0331, B:43:0x0339, B:45:0x0341, B:46:0x0349, B:48:0x0351, B:49:0x0359, B:51:0x0361, B:52:0x029a, B:54:0x02a2, B:55:0x02aa, B:57:0x02b2, B:58:0x02ba, B:60:0x02c2, B:61:0x02ca, B:63:0x02d2, B:64:0x02da, B:66:0x02e2, B:67:0x02ea, B:69:0x02f2, B:70:0x022b, B:72:0x0233, B:73:0x023b, B:75:0x0243, B:76:0x024b, B:78:0x0253, B:79:0x025b, B:81:0x0263, B:82:0x026b, B:84:0x0273, B:85:0x027b, B:87:0x0283, B:90:0x0045, B:94:0x00ba, B:96:0x00c2, B:97:0x013d, B:99:0x0145, B:100:0x01ac, B:102:0x01b4, B:103:0x01bc, B:105:0x01c4, B:106:0x01cc, B:108:0x01d4, B:109:0x01dc, B:111:0x01e4, B:112:0x01ec, B:114:0x01f4, B:115:0x01fc, B:117:0x0204, B:118:0x020c, B:120:0x0214, B:121:0x014d, B:123:0x0155, B:124:0x015d, B:126:0x0165, B:127:0x016d, B:129:0x0175, B:130:0x017d, B:132:0x0185, B:133:0x018d, B:135:0x0195, B:136:0x019d, B:138:0x01a5, B:139:0x00cb, B:141:0x00d3, B:142:0x00db, B:144:0x00e3, B:145:0x00eb, B:147:0x00f3, B:148:0x00fb, B:150:0x0103, B:151:0x010b, B:153:0x0113, B:154:0x011b, B:156:0x0123, B:159:0x004f, B:165:0x0059, B:171:0x0063, B:174:0x006b, B:176:0x0073, B:177:0x007b, B:179:0x0083, B:180:0x008b, B:182:0x0093, B:183:0x009b, B:185:0x00a3, B:186:0x00ab, B:188:0x00b3, B:191:0x012b, B:197:0x0135), top: B:5:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00cb A[Catch: JSONException -> 0x0009, TryCatch #0 {JSONException -> 0x0009, blocks: (B:6:0x0015, B:7:0x001d, B:9:0x0023, B:10:0x002d, B:12:0x0031, B:16:0x0368, B:21:0x003b, B:25:0x021b, B:27:0x0223, B:28:0x028a, B:30:0x0292, B:31:0x02f9, B:33:0x0301, B:34:0x0309, B:36:0x0311, B:37:0x0319, B:39:0x0321, B:40:0x0329, B:42:0x0331, B:43:0x0339, B:45:0x0341, B:46:0x0349, B:48:0x0351, B:49:0x0359, B:51:0x0361, B:52:0x029a, B:54:0x02a2, B:55:0x02aa, B:57:0x02b2, B:58:0x02ba, B:60:0x02c2, B:61:0x02ca, B:63:0x02d2, B:64:0x02da, B:66:0x02e2, B:67:0x02ea, B:69:0x02f2, B:70:0x022b, B:72:0x0233, B:73:0x023b, B:75:0x0243, B:76:0x024b, B:78:0x0253, B:79:0x025b, B:81:0x0263, B:82:0x026b, B:84:0x0273, B:85:0x027b, B:87:0x0283, B:90:0x0045, B:94:0x00ba, B:96:0x00c2, B:97:0x013d, B:99:0x0145, B:100:0x01ac, B:102:0x01b4, B:103:0x01bc, B:105:0x01c4, B:106:0x01cc, B:108:0x01d4, B:109:0x01dc, B:111:0x01e4, B:112:0x01ec, B:114:0x01f4, B:115:0x01fc, B:117:0x0204, B:118:0x020c, B:120:0x0214, B:121:0x014d, B:123:0x0155, B:124:0x015d, B:126:0x0165, B:127:0x016d, B:129:0x0175, B:130:0x017d, B:132:0x0185, B:133:0x018d, B:135:0x0195, B:136:0x019d, B:138:0x01a5, B:139:0x00cb, B:141:0x00d3, B:142:0x00db, B:144:0x00e3, B:145:0x00eb, B:147:0x00f3, B:148:0x00fb, B:150:0x0103, B:151:0x010b, B:153:0x0113, B:154:0x011b, B:156:0x0123, B:159:0x004f, B:165:0x0059, B:171:0x0063, B:174:0x006b, B:176:0x0073, B:177:0x007b, B:179:0x0083, B:180:0x008b, B:182:0x0093, B:183:0x009b, B:185:0x00a3, B:186:0x00ab, B:188:0x00b3, B:191:0x012b, B:197:0x0135), top: B:5:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0223 A[Catch: JSONException -> 0x0009, TryCatch #0 {JSONException -> 0x0009, blocks: (B:6:0x0015, B:7:0x001d, B:9:0x0023, B:10:0x002d, B:12:0x0031, B:16:0x0368, B:21:0x003b, B:25:0x021b, B:27:0x0223, B:28:0x028a, B:30:0x0292, B:31:0x02f9, B:33:0x0301, B:34:0x0309, B:36:0x0311, B:37:0x0319, B:39:0x0321, B:40:0x0329, B:42:0x0331, B:43:0x0339, B:45:0x0341, B:46:0x0349, B:48:0x0351, B:49:0x0359, B:51:0x0361, B:52:0x029a, B:54:0x02a2, B:55:0x02aa, B:57:0x02b2, B:58:0x02ba, B:60:0x02c2, B:61:0x02ca, B:63:0x02d2, B:64:0x02da, B:66:0x02e2, B:67:0x02ea, B:69:0x02f2, B:70:0x022b, B:72:0x0233, B:73:0x023b, B:75:0x0243, B:76:0x024b, B:78:0x0253, B:79:0x025b, B:81:0x0263, B:82:0x026b, B:84:0x0273, B:85:0x027b, B:87:0x0283, B:90:0x0045, B:94:0x00ba, B:96:0x00c2, B:97:0x013d, B:99:0x0145, B:100:0x01ac, B:102:0x01b4, B:103:0x01bc, B:105:0x01c4, B:106:0x01cc, B:108:0x01d4, B:109:0x01dc, B:111:0x01e4, B:112:0x01ec, B:114:0x01f4, B:115:0x01fc, B:117:0x0204, B:118:0x020c, B:120:0x0214, B:121:0x014d, B:123:0x0155, B:124:0x015d, B:126:0x0165, B:127:0x016d, B:129:0x0175, B:130:0x017d, B:132:0x0185, B:133:0x018d, B:135:0x0195, B:136:0x019d, B:138:0x01a5, B:139:0x00cb, B:141:0x00d3, B:142:0x00db, B:144:0x00e3, B:145:0x00eb, B:147:0x00f3, B:148:0x00fb, B:150:0x0103, B:151:0x010b, B:153:0x0113, B:154:0x011b, B:156:0x0123, B:159:0x004f, B:165:0x0059, B:171:0x0063, B:174:0x006b, B:176:0x0073, B:177:0x007b, B:179:0x0083, B:180:0x008b, B:182:0x0093, B:183:0x009b, B:185:0x00a3, B:186:0x00ab, B:188:0x00b3, B:191:0x012b, B:197:0x0135), top: B:5:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0292 A[Catch: JSONException -> 0x0009, TryCatch #0 {JSONException -> 0x0009, blocks: (B:6:0x0015, B:7:0x001d, B:9:0x0023, B:10:0x002d, B:12:0x0031, B:16:0x0368, B:21:0x003b, B:25:0x021b, B:27:0x0223, B:28:0x028a, B:30:0x0292, B:31:0x02f9, B:33:0x0301, B:34:0x0309, B:36:0x0311, B:37:0x0319, B:39:0x0321, B:40:0x0329, B:42:0x0331, B:43:0x0339, B:45:0x0341, B:46:0x0349, B:48:0x0351, B:49:0x0359, B:51:0x0361, B:52:0x029a, B:54:0x02a2, B:55:0x02aa, B:57:0x02b2, B:58:0x02ba, B:60:0x02c2, B:61:0x02ca, B:63:0x02d2, B:64:0x02da, B:66:0x02e2, B:67:0x02ea, B:69:0x02f2, B:70:0x022b, B:72:0x0233, B:73:0x023b, B:75:0x0243, B:76:0x024b, B:78:0x0253, B:79:0x025b, B:81:0x0263, B:82:0x026b, B:84:0x0273, B:85:0x027b, B:87:0x0283, B:90:0x0045, B:94:0x00ba, B:96:0x00c2, B:97:0x013d, B:99:0x0145, B:100:0x01ac, B:102:0x01b4, B:103:0x01bc, B:105:0x01c4, B:106:0x01cc, B:108:0x01d4, B:109:0x01dc, B:111:0x01e4, B:112:0x01ec, B:114:0x01f4, B:115:0x01fc, B:117:0x0204, B:118:0x020c, B:120:0x0214, B:121:0x014d, B:123:0x0155, B:124:0x015d, B:126:0x0165, B:127:0x016d, B:129:0x0175, B:130:0x017d, B:132:0x0185, B:133:0x018d, B:135:0x0195, B:136:0x019d, B:138:0x01a5, B:139:0x00cb, B:141:0x00d3, B:142:0x00db, B:144:0x00e3, B:145:0x00eb, B:147:0x00f3, B:148:0x00fb, B:150:0x0103, B:151:0x010b, B:153:0x0113, B:154:0x011b, B:156:0x0123, B:159:0x004f, B:165:0x0059, B:171:0x0063, B:174:0x006b, B:176:0x0073, B:177:0x007b, B:179:0x0083, B:180:0x008b, B:182:0x0093, B:183:0x009b, B:185:0x00a3, B:186:0x00ab, B:188:0x00b3, B:191:0x012b, B:197:0x0135), top: B:5:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0301 A[Catch: JSONException -> 0x0009, TryCatch #0 {JSONException -> 0x0009, blocks: (B:6:0x0015, B:7:0x001d, B:9:0x0023, B:10:0x002d, B:12:0x0031, B:16:0x0368, B:21:0x003b, B:25:0x021b, B:27:0x0223, B:28:0x028a, B:30:0x0292, B:31:0x02f9, B:33:0x0301, B:34:0x0309, B:36:0x0311, B:37:0x0319, B:39:0x0321, B:40:0x0329, B:42:0x0331, B:43:0x0339, B:45:0x0341, B:46:0x0349, B:48:0x0351, B:49:0x0359, B:51:0x0361, B:52:0x029a, B:54:0x02a2, B:55:0x02aa, B:57:0x02b2, B:58:0x02ba, B:60:0x02c2, B:61:0x02ca, B:63:0x02d2, B:64:0x02da, B:66:0x02e2, B:67:0x02ea, B:69:0x02f2, B:70:0x022b, B:72:0x0233, B:73:0x023b, B:75:0x0243, B:76:0x024b, B:78:0x0253, B:79:0x025b, B:81:0x0263, B:82:0x026b, B:84:0x0273, B:85:0x027b, B:87:0x0283, B:90:0x0045, B:94:0x00ba, B:96:0x00c2, B:97:0x013d, B:99:0x0145, B:100:0x01ac, B:102:0x01b4, B:103:0x01bc, B:105:0x01c4, B:106:0x01cc, B:108:0x01d4, B:109:0x01dc, B:111:0x01e4, B:112:0x01ec, B:114:0x01f4, B:115:0x01fc, B:117:0x0204, B:118:0x020c, B:120:0x0214, B:121:0x014d, B:123:0x0155, B:124:0x015d, B:126:0x0165, B:127:0x016d, B:129:0x0175, B:130:0x017d, B:132:0x0185, B:133:0x018d, B:135:0x0195, B:136:0x019d, B:138:0x01a5, B:139:0x00cb, B:141:0x00d3, B:142:0x00db, B:144:0x00e3, B:145:0x00eb, B:147:0x00f3, B:148:0x00fb, B:150:0x0103, B:151:0x010b, B:153:0x0113, B:154:0x011b, B:156:0x0123, B:159:0x004f, B:165:0x0059, B:171:0x0063, B:174:0x006b, B:176:0x0073, B:177:0x007b, B:179:0x0083, B:180:0x008b, B:182:0x0093, B:183:0x009b, B:185:0x00a3, B:186:0x00ab, B:188:0x00b3, B:191:0x012b, B:197:0x0135), top: B:5:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0309 A[Catch: JSONException -> 0x0009, TryCatch #0 {JSONException -> 0x0009, blocks: (B:6:0x0015, B:7:0x001d, B:9:0x0023, B:10:0x002d, B:12:0x0031, B:16:0x0368, B:21:0x003b, B:25:0x021b, B:27:0x0223, B:28:0x028a, B:30:0x0292, B:31:0x02f9, B:33:0x0301, B:34:0x0309, B:36:0x0311, B:37:0x0319, B:39:0x0321, B:40:0x0329, B:42:0x0331, B:43:0x0339, B:45:0x0341, B:46:0x0349, B:48:0x0351, B:49:0x0359, B:51:0x0361, B:52:0x029a, B:54:0x02a2, B:55:0x02aa, B:57:0x02b2, B:58:0x02ba, B:60:0x02c2, B:61:0x02ca, B:63:0x02d2, B:64:0x02da, B:66:0x02e2, B:67:0x02ea, B:69:0x02f2, B:70:0x022b, B:72:0x0233, B:73:0x023b, B:75:0x0243, B:76:0x024b, B:78:0x0253, B:79:0x025b, B:81:0x0263, B:82:0x026b, B:84:0x0273, B:85:0x027b, B:87:0x0283, B:90:0x0045, B:94:0x00ba, B:96:0x00c2, B:97:0x013d, B:99:0x0145, B:100:0x01ac, B:102:0x01b4, B:103:0x01bc, B:105:0x01c4, B:106:0x01cc, B:108:0x01d4, B:109:0x01dc, B:111:0x01e4, B:112:0x01ec, B:114:0x01f4, B:115:0x01fc, B:117:0x0204, B:118:0x020c, B:120:0x0214, B:121:0x014d, B:123:0x0155, B:124:0x015d, B:126:0x0165, B:127:0x016d, B:129:0x0175, B:130:0x017d, B:132:0x0185, B:133:0x018d, B:135:0x0195, B:136:0x019d, B:138:0x01a5, B:139:0x00cb, B:141:0x00d3, B:142:0x00db, B:144:0x00e3, B:145:0x00eb, B:147:0x00f3, B:148:0x00fb, B:150:0x0103, B:151:0x010b, B:153:0x0113, B:154:0x011b, B:156:0x0123, B:159:0x004f, B:165:0x0059, B:171:0x0063, B:174:0x006b, B:176:0x0073, B:177:0x007b, B:179:0x0083, B:180:0x008b, B:182:0x0093, B:183:0x009b, B:185:0x00a3, B:186:0x00ab, B:188:0x00b3, B:191:0x012b, B:197:0x0135), top: B:5:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x029a A[Catch: JSONException -> 0x0009, TryCatch #0 {JSONException -> 0x0009, blocks: (B:6:0x0015, B:7:0x001d, B:9:0x0023, B:10:0x002d, B:12:0x0031, B:16:0x0368, B:21:0x003b, B:25:0x021b, B:27:0x0223, B:28:0x028a, B:30:0x0292, B:31:0x02f9, B:33:0x0301, B:34:0x0309, B:36:0x0311, B:37:0x0319, B:39:0x0321, B:40:0x0329, B:42:0x0331, B:43:0x0339, B:45:0x0341, B:46:0x0349, B:48:0x0351, B:49:0x0359, B:51:0x0361, B:52:0x029a, B:54:0x02a2, B:55:0x02aa, B:57:0x02b2, B:58:0x02ba, B:60:0x02c2, B:61:0x02ca, B:63:0x02d2, B:64:0x02da, B:66:0x02e2, B:67:0x02ea, B:69:0x02f2, B:70:0x022b, B:72:0x0233, B:73:0x023b, B:75:0x0243, B:76:0x024b, B:78:0x0253, B:79:0x025b, B:81:0x0263, B:82:0x026b, B:84:0x0273, B:85:0x027b, B:87:0x0283, B:90:0x0045, B:94:0x00ba, B:96:0x00c2, B:97:0x013d, B:99:0x0145, B:100:0x01ac, B:102:0x01b4, B:103:0x01bc, B:105:0x01c4, B:106:0x01cc, B:108:0x01d4, B:109:0x01dc, B:111:0x01e4, B:112:0x01ec, B:114:0x01f4, B:115:0x01fc, B:117:0x0204, B:118:0x020c, B:120:0x0214, B:121:0x014d, B:123:0x0155, B:124:0x015d, B:126:0x0165, B:127:0x016d, B:129:0x0175, B:130:0x017d, B:132:0x0185, B:133:0x018d, B:135:0x0195, B:136:0x019d, B:138:0x01a5, B:139:0x00cb, B:141:0x00d3, B:142:0x00db, B:144:0x00e3, B:145:0x00eb, B:147:0x00f3, B:148:0x00fb, B:150:0x0103, B:151:0x010b, B:153:0x0113, B:154:0x011b, B:156:0x0123, B:159:0x004f, B:165:0x0059, B:171:0x0063, B:174:0x006b, B:176:0x0073, B:177:0x007b, B:179:0x0083, B:180:0x008b, B:182:0x0093, B:183:0x009b, B:185:0x00a3, B:186:0x00ab, B:188:0x00b3, B:191:0x012b, B:197:0x0135), top: B:5:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022b A[Catch: JSONException -> 0x0009, TryCatch #0 {JSONException -> 0x0009, blocks: (B:6:0x0015, B:7:0x001d, B:9:0x0023, B:10:0x002d, B:12:0x0031, B:16:0x0368, B:21:0x003b, B:25:0x021b, B:27:0x0223, B:28:0x028a, B:30:0x0292, B:31:0x02f9, B:33:0x0301, B:34:0x0309, B:36:0x0311, B:37:0x0319, B:39:0x0321, B:40:0x0329, B:42:0x0331, B:43:0x0339, B:45:0x0341, B:46:0x0349, B:48:0x0351, B:49:0x0359, B:51:0x0361, B:52:0x029a, B:54:0x02a2, B:55:0x02aa, B:57:0x02b2, B:58:0x02ba, B:60:0x02c2, B:61:0x02ca, B:63:0x02d2, B:64:0x02da, B:66:0x02e2, B:67:0x02ea, B:69:0x02f2, B:70:0x022b, B:72:0x0233, B:73:0x023b, B:75:0x0243, B:76:0x024b, B:78:0x0253, B:79:0x025b, B:81:0x0263, B:82:0x026b, B:84:0x0273, B:85:0x027b, B:87:0x0283, B:90:0x0045, B:94:0x00ba, B:96:0x00c2, B:97:0x013d, B:99:0x0145, B:100:0x01ac, B:102:0x01b4, B:103:0x01bc, B:105:0x01c4, B:106:0x01cc, B:108:0x01d4, B:109:0x01dc, B:111:0x01e4, B:112:0x01ec, B:114:0x01f4, B:115:0x01fc, B:117:0x0204, B:118:0x020c, B:120:0x0214, B:121:0x014d, B:123:0x0155, B:124:0x015d, B:126:0x0165, B:127:0x016d, B:129:0x0175, B:130:0x017d, B:132:0x0185, B:133:0x018d, B:135:0x0195, B:136:0x019d, B:138:0x01a5, B:139:0x00cb, B:141:0x00d3, B:142:0x00db, B:144:0x00e3, B:145:0x00eb, B:147:0x00f3, B:148:0x00fb, B:150:0x0103, B:151:0x010b, B:153:0x0113, B:154:0x011b, B:156:0x0123, B:159:0x004f, B:165:0x0059, B:171:0x0063, B:174:0x006b, B:176:0x0073, B:177:0x007b, B:179:0x0083, B:180:0x008b, B:182:0x0093, B:183:0x009b, B:185:0x00a3, B:186:0x00ab, B:188:0x00b3, B:191:0x012b, B:197:0x0135), top: B:5:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00c2 A[Catch: JSONException -> 0x0009, TryCatch #0 {JSONException -> 0x0009, blocks: (B:6:0x0015, B:7:0x001d, B:9:0x0023, B:10:0x002d, B:12:0x0031, B:16:0x0368, B:21:0x003b, B:25:0x021b, B:27:0x0223, B:28:0x028a, B:30:0x0292, B:31:0x02f9, B:33:0x0301, B:34:0x0309, B:36:0x0311, B:37:0x0319, B:39:0x0321, B:40:0x0329, B:42:0x0331, B:43:0x0339, B:45:0x0341, B:46:0x0349, B:48:0x0351, B:49:0x0359, B:51:0x0361, B:52:0x029a, B:54:0x02a2, B:55:0x02aa, B:57:0x02b2, B:58:0x02ba, B:60:0x02c2, B:61:0x02ca, B:63:0x02d2, B:64:0x02da, B:66:0x02e2, B:67:0x02ea, B:69:0x02f2, B:70:0x022b, B:72:0x0233, B:73:0x023b, B:75:0x0243, B:76:0x024b, B:78:0x0253, B:79:0x025b, B:81:0x0263, B:82:0x026b, B:84:0x0273, B:85:0x027b, B:87:0x0283, B:90:0x0045, B:94:0x00ba, B:96:0x00c2, B:97:0x013d, B:99:0x0145, B:100:0x01ac, B:102:0x01b4, B:103:0x01bc, B:105:0x01c4, B:106:0x01cc, B:108:0x01d4, B:109:0x01dc, B:111:0x01e4, B:112:0x01ec, B:114:0x01f4, B:115:0x01fc, B:117:0x0204, B:118:0x020c, B:120:0x0214, B:121:0x014d, B:123:0x0155, B:124:0x015d, B:126:0x0165, B:127:0x016d, B:129:0x0175, B:130:0x017d, B:132:0x0185, B:133:0x018d, B:135:0x0195, B:136:0x019d, B:138:0x01a5, B:139:0x00cb, B:141:0x00d3, B:142:0x00db, B:144:0x00e3, B:145:0x00eb, B:147:0x00f3, B:148:0x00fb, B:150:0x0103, B:151:0x010b, B:153:0x0113, B:154:0x011b, B:156:0x0123, B:159:0x004f, B:165:0x0059, B:171:0x0063, B:174:0x006b, B:176:0x0073, B:177:0x007b, B:179:0x0083, B:180:0x008b, B:182:0x0093, B:183:0x009b, B:185:0x00a3, B:186:0x00ab, B:188:0x00b3, B:191:0x012b, B:197:0x0135), top: B:5:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0145 A[Catch: JSONException -> 0x0009, TryCatch #0 {JSONException -> 0x0009, blocks: (B:6:0x0015, B:7:0x001d, B:9:0x0023, B:10:0x002d, B:12:0x0031, B:16:0x0368, B:21:0x003b, B:25:0x021b, B:27:0x0223, B:28:0x028a, B:30:0x0292, B:31:0x02f9, B:33:0x0301, B:34:0x0309, B:36:0x0311, B:37:0x0319, B:39:0x0321, B:40:0x0329, B:42:0x0331, B:43:0x0339, B:45:0x0341, B:46:0x0349, B:48:0x0351, B:49:0x0359, B:51:0x0361, B:52:0x029a, B:54:0x02a2, B:55:0x02aa, B:57:0x02b2, B:58:0x02ba, B:60:0x02c2, B:61:0x02ca, B:63:0x02d2, B:64:0x02da, B:66:0x02e2, B:67:0x02ea, B:69:0x02f2, B:70:0x022b, B:72:0x0233, B:73:0x023b, B:75:0x0243, B:76:0x024b, B:78:0x0253, B:79:0x025b, B:81:0x0263, B:82:0x026b, B:84:0x0273, B:85:0x027b, B:87:0x0283, B:90:0x0045, B:94:0x00ba, B:96:0x00c2, B:97:0x013d, B:99:0x0145, B:100:0x01ac, B:102:0x01b4, B:103:0x01bc, B:105:0x01c4, B:106:0x01cc, B:108:0x01d4, B:109:0x01dc, B:111:0x01e4, B:112:0x01ec, B:114:0x01f4, B:115:0x01fc, B:117:0x0204, B:118:0x020c, B:120:0x0214, B:121:0x014d, B:123:0x0155, B:124:0x015d, B:126:0x0165, B:127:0x016d, B:129:0x0175, B:130:0x017d, B:132:0x0185, B:133:0x018d, B:135:0x0195, B:136:0x019d, B:138:0x01a5, B:139:0x00cb, B:141:0x00d3, B:142:0x00db, B:144:0x00e3, B:145:0x00eb, B:147:0x00f3, B:148:0x00fb, B:150:0x0103, B:151:0x010b, B:153:0x0113, B:154:0x011b, B:156:0x0123, B:159:0x004f, B:165:0x0059, B:171:0x0063, B:174:0x006b, B:176:0x0073, B:177:0x007b, B:179:0x0083, B:180:0x008b, B:182:0x0093, B:183:0x009b, B:185:0x00a3, B:186:0x00ab, B:188:0x00b3, B:191:0x012b, B:197:0x0135), top: B:5:0x0015 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Identify createIdentify(JSONObject jSONObject) {
        Identify identify = new Identify();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                Iterator<String> keys2 = jSONObject2.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    switch (next.hashCode()) {
                        case -2001704214:
                            if (!next.equals(Constants.AMP_OP_PREPEND)) {
                                break;
                            } else {
                                if (jSONObject2.get(next2) instanceof Double) {
                                    identify.prepend(next2, jSONObject2.getDouble(next2));
                                } else if (jSONObject2.get(next2) instanceof Integer) {
                                    identify.prepend(next2, jSONObject2.getInt(next2));
                                } else if (jSONObject2.get(next2) instanceof Long) {
                                    identify.prepend(next2, jSONObject2.getLong(next2));
                                } else if (jSONObject2.get(next2) instanceof String) {
                                    identify.prepend(next2, jSONObject2.getString(next2));
                                } else if (jSONObject2.get(next2) instanceof JSONObject) {
                                    identify.prepend(next2, jSONObject2.getJSONObject(next2));
                                } else if (jSONObject2.get(next2) instanceof JSONArray) {
                                    identify.prepend(next2, jSONObject2.getJSONArray(next2));
                                } else if (jSONObject2.get(next2) instanceof Boolean) {
                                    identify.prepend(next2, jSONObject2.getBoolean(next2));
                                }
                                if (!(jSONObject2.get(next2) instanceof Double)) {
                                    identify.preInsert(next2, jSONObject2.getDouble(next2));
                                } else if (jSONObject2.get(next2) instanceof Integer) {
                                    identify.preInsert(next2, jSONObject2.getInt(next2));
                                } else if (jSONObject2.get(next2) instanceof Long) {
                                    identify.preInsert(next2, jSONObject2.getLong(next2));
                                } else if (jSONObject2.get(next2) instanceof String) {
                                    identify.preInsert(next2, jSONObject2.getString(next2));
                                } else if (jSONObject2.get(next2) instanceof JSONObject) {
                                    identify.preInsert(next2, jSONObject2.getJSONObject(next2));
                                } else if (jSONObject2.get(next2) instanceof JSONArray) {
                                    identify.preInsert(next2, jSONObject2.getJSONArray(next2));
                                } else if (jSONObject2.get(next2) instanceof Boolean) {
                                    identify.preInsert(next2, jSONObject2.getBoolean(next2));
                                }
                                if (jSONObject2.get(next2) instanceof Double) {
                                    identify.postInsert(next2, jSONObject2.getDouble(next2));
                                } else if (jSONObject2.get(next2) instanceof Integer) {
                                    identify.postInsert(next2, jSONObject2.getInt(next2));
                                } else if (jSONObject2.get(next2) instanceof Long) {
                                    identify.postInsert(next2, jSONObject2.getLong(next2));
                                } else if (jSONObject2.get(next2) instanceof String) {
                                    identify.postInsert(next2, jSONObject2.getString(next2));
                                } else if (jSONObject2.get(next2) instanceof JSONObject) {
                                    identify.postInsert(next2, jSONObject2.getJSONObject(next2));
                                } else if (jSONObject2.get(next2) instanceof JSONArray) {
                                    identify.postInsert(next2, jSONObject2.getJSONArray(next2));
                                } else if (jSONObject2.get(next2) instanceof Boolean) {
                                    identify.postInsert(next2, jSONObject2.getBoolean(next2));
                                }
                                if (!(jSONObject2.get(next2) instanceof Double)) {
                                    identify.set(next2, jSONObject2.getDouble(next2));
                                } else if (jSONObject2.get(next2) instanceof Integer) {
                                    identify.set(next2, jSONObject2.getInt(next2));
                                } else if (jSONObject2.get(next2) instanceof Long) {
                                    identify.set(next2, jSONObject2.getLong(next2));
                                } else if (jSONObject2.get(next2) instanceof String) {
                                    identify.set(next2, jSONObject2.getString(next2));
                                } else if (jSONObject2.get(next2) instanceof JSONObject) {
                                    identify.set(next2, jSONObject2.getJSONObject(next2));
                                } else if (jSONObject2.get(next2) instanceof JSONArray) {
                                    identify.set(next2, jSONObject2.getJSONArray(next2));
                                } else if (jSONObject2.get(next2) instanceof Boolean) {
                                    identify.set(next2, jSONObject2.getBoolean(next2));
                                }
                                if (jSONObject2.get(next2) instanceof Double) {
                                    identify.setOnce(next2, jSONObject2.getDouble(next2));
                                } else if (jSONObject2.get(next2) instanceof Integer) {
                                    identify.setOnce(next2, jSONObject2.getInt(next2));
                                } else if (jSONObject2.get(next2) instanceof Long) {
                                    identify.setOnce(next2, jSONObject2.getLong(next2));
                                } else if (jSONObject2.get(next2) instanceof String) {
                                    identify.setOnce(next2, jSONObject2.getString(next2));
                                } else if (jSONObject2.get(next2) instanceof JSONObject) {
                                    identify.setOnce(next2, jSONObject2.getJSONObject(next2));
                                } else if (jSONObject2.get(next2) instanceof JSONArray) {
                                    identify.setOnce(next2, jSONObject2.getJSONArray(next2));
                                } else if (jSONObject2.get(next2) instanceof Boolean) {
                                    identify.setOnce(next2, jSONObject2.getBoolean(next2));
                                }
                                identify.unset(next2);
                                break;
                            }
                        case -600472680:
                            if (!next.equals(Constants.AMP_OP_PREINSERT)) {
                                break;
                            } else {
                                if (!(jSONObject2.get(next2) instanceof Double)) {
                                }
                                if (jSONObject2.get(next2) instanceof Double) {
                                }
                                if (!(jSONObject2.get(next2) instanceof Double)) {
                                }
                                if (jSONObject2.get(next2) instanceof Double) {
                                }
                                identify.unset(next2);
                                break;
                            }
                            break;
                        case 1168893:
                            if (!next.equals(Constants.AMP_OP_ADD)) {
                                break;
                            } else {
                                if (jSONObject2.get(next2) instanceof Double) {
                                    identify.add(next2, jSONObject2.getDouble(next2));
                                } else if (jSONObject2.get(next2) instanceof Integer) {
                                    identify.add(next2, jSONObject2.getInt(next2));
                                } else if (jSONObject2.get(next2) instanceof Long) {
                                    identify.add(next2, jSONObject2.getLong(next2));
                                } else if (jSONObject2.get(next2) instanceof String) {
                                    identify.add(next2, jSONObject2.getString(next2));
                                } else if (jSONObject2.get(next2) instanceof JSONObject) {
                                    identify.add(next2, jSONObject2.getJSONObject(next2));
                                }
                                if (!(jSONObject2.get(next2) instanceof Double)) {
                                    identify.append(next2, jSONObject2.getDouble(next2));
                                } else if (jSONObject2.get(next2) instanceof Integer) {
                                    identify.append(next2, jSONObject2.getInt(next2));
                                } else if (jSONObject2.get(next2) instanceof Long) {
                                    identify.append(next2, jSONObject2.getLong(next2));
                                } else if (jSONObject2.get(next2) instanceof String) {
                                    identify.append(next2, jSONObject2.getString(next2));
                                } else if (jSONObject2.get(next2) instanceof JSONObject) {
                                    identify.append(next2, jSONObject2.getJSONObject(next2));
                                } else if (jSONObject2.get(next2) instanceof JSONArray) {
                                    identify.append(next2, jSONObject2.getJSONArray(next2));
                                } else if (jSONObject2.get(next2) instanceof Boolean) {
                                    identify.append(next2, jSONObject2.getBoolean(next2));
                                }
                                if (jSONObject2.get(next2) instanceof Double) {
                                }
                                if (!(jSONObject2.get(next2) instanceof Double)) {
                                }
                                if (jSONObject2.get(next2) instanceof Double) {
                                }
                                if (!(jSONObject2.get(next2) instanceof Double)) {
                                }
                                if (jSONObject2.get(next2) instanceof Double) {
                                }
                                identify.unset(next2);
                                break;
                            }
                            break;
                        case 1186238:
                            if (!next.equals("$set")) {
                                break;
                            } else {
                                if (!(jSONObject2.get(next2) instanceof Double)) {
                                }
                                if (jSONObject2.get(next2) instanceof Double) {
                                }
                                identify.unset(next2);
                                break;
                            }
                            break;
                        case 301505887:
                            if (!next.equals(Constants.AMP_OP_SET_ONCE)) {
                                break;
                            } else {
                                if (jSONObject2.get(next2) instanceof Double) {
                                }
                                identify.unset(next2);
                                break;
                            }
                        case 474293310:
                            if (!next.equals(Constants.AMP_OP_APPEND)) {
                                break;
                            } else {
                                if (!(jSONObject2.get(next2) instanceof Double)) {
                                }
                                if (jSONObject2.get(next2) instanceof Double) {
                                }
                                if (!(jSONObject2.get(next2) instanceof Double)) {
                                }
                                if (jSONObject2.get(next2) instanceof Double) {
                                }
                                if (!(jSONObject2.get(next2) instanceof Double)) {
                                }
                                if (jSONObject2.get(next2) instanceof Double) {
                                }
                                identify.unset(next2);
                                break;
                            }
                            break;
                        case 1061581469:
                            if (!next.equals(Constants.AMP_OP_POSTINSERT)) {
                                break;
                            } else {
                                if (jSONObject2.get(next2) instanceof Double) {
                                }
                                if (!(jSONObject2.get(next2) instanceof Double)) {
                                }
                                if (jSONObject2.get(next2) instanceof Double) {
                                }
                                identify.unset(next2);
                                break;
                            }
                            break;
                        case 1142092165:
                            if (!next.equals("$unset")) {
                                break;
                            } else {
                                identify.unset(next2);
                                break;
                            }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        return identify;
    }
}
