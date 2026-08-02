package com.tiktokbusiness;

import androidx.autofill.HintConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.appevents.base.EventName;
import com.tiktok.appevents.base.TTAdRevenueEvent;
import com.tiktok.appevents.base.TTBaseEvent;
import com.tiktok.appevents.contents.TTAddToCartEvent;
import com.tiktok.appevents.contents.TTAddToWishlistEvent;
import com.tiktok.appevents.contents.TTCheckoutEvent;
import com.tiktok.appevents.contents.TTContentParams;
import com.tiktok.appevents.contents.TTContentsEvent;
import com.tiktok.appevents.contents.TTContentsEventConstants;
import com.tiktok.appevents.contents.TTPurchaseEvent;
import com.tiktok.appevents.contents.TTViewContentEvent;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTripOptions;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: TikTokBusinessModule.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 %2\u00020\u0001:\u0001%B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J6\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J,\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\"\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\"\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\"\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00172\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J7\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010$¨\u0006&"}, d2 = {"Lcom/tiktokbusiness/TikTokBusinessModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "identify", "", RadarTripOptions.KEY_EXTERNAL_ID, "externalUserName", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "email", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", MetricTracker.Object.LOGOUT, "getEventNameEnum", "Lcom/tiktok/appevents/base/EventName;", "eventName", "trackEvent", "eventId", "parameters", "Lcom/facebook/react/bridge/ReadableMap;", "trackContentEvent", "eventType", "properties", "trackCustomEvent", "trackAdRevenueEvent", "adRevenueJson", "initializeSdk", RemoteConfigConstants.RequestFieldKey.APP_ID, "ttAppId", SDKConstants.PARAM_ACCESS_TOKEN, "debug", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/facebook/react/bridge/Promise;)V", "Companion", "react-native-tiktok-business-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TikTokBusinessModule extends ReactContextBaseJavaModule {
    public static final String NAME = "TikTokBusinessModule";

    /* compiled from: TikTokBusinessModule.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.String.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TikTokBusinessModule(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public final void identify(String externalId, String externalUserName, String phoneNumber, String email, Promise promise) {
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            TikTokBusinessSdk.identify(externalId, externalUserName, phoneNumber, email);
            promise.resolve("User identified successfully");
        } catch (Exception e) {
            promise.reject("IDENTIFY_ERROR", "Failed to identify user", e);
        }
    }

    @ReactMethod
    public final void logout(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            TikTokBusinessSdk.logout();
            promise.resolve("User logged out successfully");
        } catch (Exception e) {
            promise.reject("LOGOUT_ERROR", "Failed to logout user", e);
        }
    }

    private final EventName getEventNameEnum(String eventName) {
        for (EventName eventName2 : EventName.values()) {
            if (Intrinsics.areEqual(eventName2.toString(), eventName)) {
                return eventName2;
            }
        }
        return null;
    }

    @ReactMethod
    public final void trackEvent(String eventName, String eventId, ReadableMap parameters, Promise promise) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            EventName eventNameEnum = getEventNameEnum(eventName);
            if (eventNameEnum == null) {
                promise.reject("INVALID_EVENT_NAME", "Unknown event name: " + eventName, (Throwable) null);
                return;
            }
            if (parameters != null && parameters.keySetIterator().hasNextKey()) {
                TTBaseEvent.Builder newBuilder = TTBaseEvent.newBuilder(eventNameEnum.toString());
                ReadableMapKeySetIterator keySetIterator = parameters.keySetIterator();
                while (keySetIterator.hasNextKey()) {
                    String nextKey = keySetIterator.nextKey();
                    int i = WhenMappings.$EnumSwitchMapping$0[parameters.getType(nextKey).ordinal()];
                    if (i == 1) {
                        newBuilder.addProperty(nextKey, parameters.getString(nextKey));
                    } else if (i == 2) {
                        newBuilder.addProperty(nextKey, parameters.getDouble(nextKey));
                    } else if (i != 3) {
                        Unit unit = Unit.INSTANCE;
                    } else {
                        newBuilder.addProperty(nextKey, parameters.getBoolean(nextKey));
                    }
                }
                TikTokBusinessSdk.trackTTEvent(newBuilder.build());
                promise.resolve("Event tracked successfully");
            }
            String str = eventId;
            if (str != null && str.length() != 0) {
                TikTokBusinessSdk.trackTTEvent(eventNameEnum, eventId);
                promise.resolve("Event tracked successfully");
            }
            TikTokBusinessSdk.trackTTEvent(eventNameEnum);
            promise.resolve("Event tracked successfully");
        } catch (Exception e) {
            promise.reject("TRACK_EVENT_ERROR", "Failed to track event", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009c A[Catch: Exception -> 0x020e, TryCatch #0 {Exception -> 0x020e, blocks: (B:3:0x0028, B:7:0x01f9, B:11:0x0039, B:14:0x0043, B:16:0x009c, B:18:0x00a6, B:20:0x00ac, B:22:0x00b4, B:23:0x00bb, B:25:0x00c1, B:27:0x00c9, B:29:0x00d2, B:32:0x00d9, B:33:0x00e0, B:35:0x00e6, B:37:0x00ee, B:38:0x00f5, B:40:0x00fb, B:42:0x0103, B:43:0x010a, B:45:0x0110, B:47:0x0118, B:49:0x011e, B:51:0x0124, B:53:0x0132, B:55:0x0138, B:57:0x0142, B:59:0x014a, B:60:0x0151, B:62:0x0157, B:64:0x015f, B:65:0x0166, B:67:0x016c, B:69:0x0174, B:70:0x017b, B:72:0x0181, B:74:0x0189, B:75:0x0196, B:77:0x019c, B:79:0x01a4, B:80:0x01ab, B:82:0x01b1, B:84:0x01b9, B:85:0x01c0, B:87:0x01cf, B:92:0x01d5, B:93:0x01ea, B:95:0x004b, B:98:0x0057, B:99:0x005f, B:102:0x006b, B:103:0x0073, B:106:0x007f, B:107:0x0087, B:110:0x0093), top: B:2:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0132 A[Catch: Exception -> 0x020e, TryCatch #0 {Exception -> 0x020e, blocks: (B:3:0x0028, B:7:0x01f9, B:11:0x0039, B:14:0x0043, B:16:0x009c, B:18:0x00a6, B:20:0x00ac, B:22:0x00b4, B:23:0x00bb, B:25:0x00c1, B:27:0x00c9, B:29:0x00d2, B:32:0x00d9, B:33:0x00e0, B:35:0x00e6, B:37:0x00ee, B:38:0x00f5, B:40:0x00fb, B:42:0x0103, B:43:0x010a, B:45:0x0110, B:47:0x0118, B:49:0x011e, B:51:0x0124, B:53:0x0132, B:55:0x0138, B:57:0x0142, B:59:0x014a, B:60:0x0151, B:62:0x0157, B:64:0x015f, B:65:0x0166, B:67:0x016c, B:69:0x0174, B:70:0x017b, B:72:0x0181, B:74:0x0189, B:75:0x0196, B:77:0x019c, B:79:0x01a4, B:80:0x01ab, B:82:0x01b1, B:84:0x01b9, B:85:0x01c0, B:87:0x01cf, B:92:0x01d5, B:93:0x01ea, B:95:0x004b, B:98:0x0057, B:99:0x005f, B:102:0x006b, B:103:0x0073, B:106:0x007f, B:107:0x0087, B:110:0x0093), top: B:2:0x0028 }] */
    @ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void trackContentEvent(String eventType, ReadableMap properties, Promise promise) {
        String str;
        TTContentsEvent.Builder newBuilder;
        ReadableArray array;
        int size;
        int i;
        String str2;
        String str3;
        String string;
        String str4;
        String str5 = "BRAND";
        String str6 = "CONTENT_CATEGORY";
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            switch (eventType.hashCode()) {
                case -2012936026:
                    str = "Unsupported content event type: ";
                    if (!eventType.equals(ViewHierarchyConstants.ADD_TO_CART)) {
                        promise.reject("UNSUPPORTED_EVENT_TYPE", str + eventType, (Throwable) null);
                        break;
                    } else {
                        newBuilder = TTAddToCartEvent.newBuilder();
                        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
                        if (properties != null && properties.keySetIterator().hasNextKey()) {
                            if (properties.hasKey(ShareConstants.DESCRIPTION) && properties.getType(ShareConstants.DESCRIPTION) == ReadableType.String) {
                                newBuilder.setDescription(properties.getString(ShareConstants.DESCRIPTION));
                            }
                            if (properties.hasKey("CURRENCY") && properties.getType("CURRENCY") == ReadableType.String) {
                                string = properties.getString("CURRENCY");
                                str4 = string;
                                if (str4 != null && str4.length() != 0) {
                                    newBuilder.setCurrency(TTContentsEventConstants.Currency.valueOf(string));
                                }
                            }
                            if (properties.hasKey("VALUE") && properties.getType("VALUE") == ReadableType.Number) {
                                newBuilder.setValue(properties.getDouble("VALUE"));
                            }
                            if (properties.hasKey("CONTENT_TYPE") && properties.getType("CONTENT_TYPE") == ReadableType.String) {
                                newBuilder.setContentType(properties.getString("CONTENT_TYPE"));
                            }
                            if (properties.hasKey("CONTENTS") && properties.getType("CONTENTS") != ReadableType.Null && (array = properties.getArray("CONTENTS")) != null && array.size() > 0) {
                                ArrayList arrayList = new ArrayList();
                                size = array.size();
                                i = 0;
                                while (i < size) {
                                    ReadableMap map = array.getMap(i);
                                    if (map != null) {
                                        TTContentParams.Builder newBuilder2 = TTContentParams.newBuilder();
                                        if (map.hasKey("CONTENT_ID") && map.getType("CONTENT_ID") == ReadableType.String) {
                                            newBuilder2.setContentId(map.getString("CONTENT_ID"));
                                        }
                                        if (map.hasKey(str6) && map.getType(str6) == ReadableType.String) {
                                            newBuilder2.setContentCategory(map.getString(str6));
                                        }
                                        if (map.hasKey(str5) && map.getType(str5) == ReadableType.String) {
                                            newBuilder2.setBrand(map.getString(str5));
                                        }
                                        if (map.hasKey("PRICE") && map.getType("PRICE") == ReadableType.Number) {
                                            str2 = str5;
                                            str3 = str6;
                                            newBuilder2.setPrice((float) map.getDouble("PRICE"));
                                        } else {
                                            str2 = str5;
                                            str3 = str6;
                                        }
                                        if (map.hasKey("QUANTITY") && map.getType("QUANTITY") == ReadableType.Number) {
                                            newBuilder2.setQuantity(map.getInt("QUANTITY"));
                                        }
                                        if (map.hasKey("CONTENT_NAME") && map.getType("CONTENT_NAME") == ReadableType.String) {
                                            newBuilder2.setContentName(map.getString("CONTENT_NAME"));
                                        }
                                        TTContentParams build = newBuilder2.build();
                                        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                                        arrayList.add(build);
                                    } else {
                                        str2 = str5;
                                        str3 = str6;
                                    }
                                    i++;
                                    str5 = str2;
                                    str6 = str3;
                                }
                                TTContentParams[] tTContentParamsArr = (TTContentParams[]) arrayList.toArray(new TTContentParams[0]);
                                newBuilder.setContents((TTContentParams[]) Arrays.copyOf(tTContentParamsArr, tTContentParamsArr.length));
                            }
                        }
                        TikTokBusinessSdk.trackTTEvent(newBuilder.build());
                        promise.resolve("Content event tracked successfully");
                        break;
                    }
                    break;
                case -1769016063:
                    str = "Unsupported content event type: ";
                    if (!eventType.equals(ViewHierarchyConstants.PURCHASE)) {
                        promise.reject("UNSUPPORTED_EVENT_TYPE", str + eventType, (Throwable) null);
                        break;
                    } else {
                        newBuilder = TTPurchaseEvent.newBuilder();
                        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
                        if (properties != null) {
                            if (properties.hasKey(ShareConstants.DESCRIPTION)) {
                                newBuilder.setDescription(properties.getString(ShareConstants.DESCRIPTION));
                                break;
                            }
                            if (properties.hasKey("CURRENCY")) {
                                string = properties.getString("CURRENCY");
                                str4 = string;
                                if (str4 != null) {
                                    newBuilder.setCurrency(TTContentsEventConstants.Currency.valueOf(string));
                                    break;
                                }
                                break;
                            }
                            if (properties.hasKey("VALUE")) {
                                newBuilder.setValue(properties.getDouble("VALUE"));
                                break;
                            }
                            if (properties.hasKey("CONTENT_TYPE")) {
                                newBuilder.setContentType(properties.getString("CONTENT_TYPE"));
                                break;
                            }
                            if (properties.hasKey("CONTENTS")) {
                                ArrayList arrayList2 = new ArrayList();
                                size = array.size();
                                i = 0;
                                while (i < size) {
                                }
                                TTContentParams[] tTContentParamsArr2 = (TTContentParams[]) arrayList2.toArray(new TTContentParams[0]);
                                newBuilder.setContents((TTContentParams[]) Arrays.copyOf(tTContentParamsArr2, tTContentParamsArr2.length));
                                break;
                            }
                            break;
                        }
                        TikTokBusinessSdk.trackTTEvent(newBuilder.build());
                        promise.resolve("Content event tracked successfully");
                        break;
                    }
                case -1108501673:
                    str = "Unsupported content event type: ";
                    if (!eventType.equals("CHECK_OUT")) {
                        promise.reject("UNSUPPORTED_EVENT_TYPE", str + eventType, (Throwable) null);
                        break;
                    } else {
                        newBuilder = TTCheckoutEvent.newBuilder();
                        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
                        if (properties != null) {
                        }
                        TikTokBusinessSdk.trackTTEvent(newBuilder.build());
                        promise.resolve("Content event tracked successfully");
                        break;
                    }
                    break;
                case 906241215:
                    str = "Unsupported content event type: ";
                    if (!eventType.equals(ViewHierarchyConstants.VIEW_CONTENT)) {
                        promise.reject("UNSUPPORTED_EVENT_TYPE", str + eventType, (Throwable) null);
                        break;
                    } else {
                        newBuilder = TTViewContentEvent.newBuilder();
                        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
                        if (properties != null) {
                        }
                        TikTokBusinessSdk.trackTTEvent(newBuilder.build());
                        promise.resolve("Content event tracked successfully");
                        break;
                    }
                    break;
                case 1029507147:
                    str = "Unsupported content event type: ";
                    if (!eventType.equals(ViewHierarchyConstants.ADD_TO_WISHLIST)) {
                        promise.reject("UNSUPPORTED_EVENT_TYPE", str + eventType, (Throwable) null);
                        break;
                    } else {
                        newBuilder = TTAddToWishlistEvent.newBuilder();
                        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
                        if (properties != null) {
                        }
                        TikTokBusinessSdk.trackTTEvent(newBuilder.build());
                        promise.resolve("Content event tracked successfully");
                        break;
                    }
                    break;
                default:
                    str = "Unsupported content event type: ";
                    promise.reject("UNSUPPORTED_EVENT_TYPE", str + eventType, (Throwable) null);
                    break;
            }
        } catch (Exception e) {
            promise.reject("TRACK_CONTENT_EVENT_ERROR", "Failed to track content event", e);
        }
    }

    @ReactMethod
    public final void trackCustomEvent(String eventName, ReadableMap properties, Promise promise) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            TTBaseEvent.Builder newBuilder = TTBaseEvent.newBuilder(eventName);
            if (properties != null && properties.keySetIterator().hasNextKey()) {
                ReadableMapKeySetIterator keySetIterator = properties.keySetIterator();
                while (keySetIterator.hasNextKey()) {
                    String nextKey = keySetIterator.nextKey();
                    int i = WhenMappings.$EnumSwitchMapping$0[properties.getType(nextKey).ordinal()];
                    if (i == 1) {
                        newBuilder.addProperty(nextKey, properties.getString(nextKey));
                    } else if (i == 2) {
                        newBuilder.addProperty(nextKey, properties.getDouble(nextKey));
                    } else if (i != 3) {
                        Unit unit = Unit.INSTANCE;
                    } else {
                        newBuilder.addProperty(nextKey, properties.getBoolean(nextKey));
                    }
                }
            }
            TikTokBusinessSdk.trackTTEvent(newBuilder.build());
            promise.resolve("Custom event tracked successfully");
        } catch (Exception e) {
            promise.reject("TRACK_CUSTOM_EVENT_ERROR", "Failed to track custom event", e);
        }
    }

    @ReactMethod
    public final void trackAdRevenueEvent(ReadableMap adRevenueJson, String eventId, Promise promise) {
        TTBaseEvent build;
        Intrinsics.checkNotNullParameter(adRevenueJson, "adRevenueJson");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            JSONObject jSONObject = new JSONObject();
            ReadableMapKeySetIterator keySetIterator = adRevenueJson.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                int i = WhenMappings.$EnumSwitchMapping$0[adRevenueJson.getType(nextKey).ordinal()];
                if (i == 1) {
                    jSONObject.put(nextKey, adRevenueJson.getString(nextKey));
                } else if (i == 2) {
                    jSONObject.put(nextKey, adRevenueJson.getDouble(nextKey));
                } else if (i != 3) {
                    Unit unit = Unit.INSTANCE;
                } else {
                    jSONObject.put(nextKey, adRevenueJson.getBoolean(nextKey));
                }
            }
            String str = eventId;
            if (str != null && str.length() != 0) {
                build = TTAdRevenueEvent.newBuilder(jSONObject, eventId).build();
                TikTokBusinessSdk.trackTTEvent(build);
                promise.resolve("Ad revenue event tracked successfully");
            }
            build = TTAdRevenueEvent.newBuilder(jSONObject).build();
            TikTokBusinessSdk.trackTTEvent(build);
            promise.resolve("Ad revenue event tracked successfully");
        } catch (Exception e) {
            promise.reject("TRACK_AD_REVENUE_ERROR", "Failed to track ad revenue event", e);
        }
    }

    @ReactMethod
    public final void initializeSdk(String appId, String ttAppId, String accessToken, Boolean debug, final Promise promise) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(ttAppId, "ttAppId");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            TikTokBusinessSdk.TTConfig tTAppId = new TikTokBusinessSdk.TTConfig(getReactApplicationContext(), accessToken).setAppId(appId).setTTAppId(ttAppId);
            if (Intrinsics.areEqual((Object) debug, (Object) true)) {
                tTAppId.openDebugMode().setLogLevel(TikTokBusinessSdk.LogLevel.DEBUG);
            }
            TikTokBusinessSdk.initializeSdk(tTAppId, new TikTokBusinessSdk.TTInitCallback() { // from class: com.tiktokbusiness.TikTokBusinessModule$initializeSdk$1
                @Override // com.tiktok.TikTokBusinessSdk.TTInitCallback
                public void success() {
                    TikTokBusinessSdk.startTrack();
                    Promise.this.resolve("SDK initialized successfully");
                }

                @Override // com.tiktok.TikTokBusinessSdk.TTInitCallback
                public void fail(int code, String msg) {
                    Intrinsics.checkNotNullParameter(msg, "msg");
                    Promise.this.reject("INIT_ERROR", "Failed to initialize TikTok SDK: " + msg + " (code: " + code + ")", (Throwable) null);
                }
            });
        } catch (Exception e) {
            promise.reject("INIT_ERROR", "Failed to initialize TikTok SDK", e);
        }
    }
}
