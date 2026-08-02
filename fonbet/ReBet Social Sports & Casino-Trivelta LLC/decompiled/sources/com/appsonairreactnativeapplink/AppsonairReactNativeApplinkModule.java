package com.appsonairreactnativeapplink;

import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.Q;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.appsonair.applink.interfaces.AppLinkListener;
import com.appsonair.applink.services.AppLinkService;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.android.gms.common.internal.AbstractC3179c;
import com.twilio.voice.EventKeys;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@ReactModule(name = AppsonairReactNativeApplinkModule.NAME)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u000e\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000bJ\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000bH\u0016J*\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0013H\u0002J\u0012\u0010+\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010\rH\u0007J\u0010\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020&H\u0007R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/appsonairreactnativeapplink/AppsonairReactNativeApplinkModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ActivityEventListener;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "context", "appLinkService", "Lcom/appsonair/applink/services/AppLinkService;", AbstractC3179c.KEY_PENDING_INTENT, "Landroid/content/Intent;", "getName", "", "initialize", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "jsonToWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "json", "Lorg/json/JSONObject;", "jsonToWritableArray", "Lcom/facebook/react/bridge/WritableArray;", "array", "Lorg/json/JSONArray;", "createAppLink", "params", "Lcom/facebook/react/bridge/ReadableMap;", "getReferralDetails", "getReferralInfo", "handleIntent", "intent", "onNewIntent", "onActivityResult", "activity", "Landroid/app/Activity;", "requestCode", "", "resultCode", EventKeys.DATA, "sendEvent", "eventName", "addListener", "removeListeners", "count", "Companion", "appsonair-react-native-applink_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppsonairReactNativeApplinkModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppsonairReactNativeApplinkModule.kt\ncom/appsonairreactnativeapplink/AppsonairReactNativeApplinkModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,229:1\n1#2:230\n32#3,2:231\n*S KotlinDebug\n*F\n+ 1 AppsonairReactNativeApplinkModule.kt\ncom/appsonairreactnativeapplink/AppsonairReactNativeApplinkModule\n*L\n145#1:231,2\n*E\n"})
/* loaded from: classes.dex */
public final class AppsonairReactNativeApplinkModule extends ReactContextBaseJavaModule implements ActivityEventListener {

    @NotNull
    public static final String NAME = "AppsonairReactNativeApplink";

    @Nullable
    private AppLinkService appLinkService;

    @NotNull
    private final ReactApplicationContext context;

    @Nullable
    private Intent pendingIntent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppsonairReactNativeApplinkModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.context = reactContext;
        reactContext.addActivityEventListener(this);
    }

    private final WritableArray jsonToWritableArray(JSONArray array) {
        WritableArray createArray = Arguments.createArray();
        int length = array.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object opt = array.opt(i10);
            if (opt instanceof JSONObject) {
                createArray.pushMap(jsonToWritableMap((JSONObject) opt));
            } else if (opt instanceof JSONArray) {
                createArray.pushArray(jsonToWritableArray((JSONArray) opt));
            } else if (opt instanceof Boolean) {
                createArray.pushBoolean(((Boolean) opt).booleanValue());
            } else if (opt instanceof Integer) {
                createArray.pushInt(((Number) opt).intValue());
            } else if (opt instanceof Double) {
                createArray.pushDouble(((Number) opt).doubleValue());
            } else if (opt instanceof String) {
                createArray.pushString((String) opt);
            } else {
                createArray.pushString(opt != null ? opt.toString() : null);
            }
        }
        return createArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WritableMap jsonToWritableMap(JSONObject json) {
        WritableMap createMap = Arguments.createMap();
        Iterator<String> keys = json.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = json.opt(next);
            if (opt instanceof JSONObject) {
                Intrinsics.checkNotNull(next);
                createMap.putMap(next, jsonToWritableMap((JSONObject) opt));
            } else if (opt instanceof JSONArray) {
                Intrinsics.checkNotNull(next);
                createMap.putArray(next, jsonToWritableArray((JSONArray) opt));
            } else if (opt instanceof Boolean) {
                Intrinsics.checkNotNull(next);
                createMap.putBoolean(next, ((Boolean) opt).booleanValue());
            } else if (opt instanceof Integer) {
                Intrinsics.checkNotNull(next);
                createMap.putInt(next, ((Number) opt).intValue());
            } else if (opt instanceof Double) {
                Intrinsics.checkNotNull(next);
                createMap.putDouble(next, ((Number) opt).doubleValue());
            } else if (opt instanceof String) {
                Intrinsics.checkNotNull(next);
                createMap.putString(next, (String) opt);
            } else {
                Intrinsics.checkNotNull(next);
                createMap.putString(next, opt != null ? opt.toString() : null);
            }
        }
        return createMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendEvent(String eventName, WritableMap params) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.context.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(eventName, params);
    }

    @ReactMethod
    public final void addListener(@Nullable String eventName) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (r4 > 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r2 > 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r3 > 0) goto L14;
     */
    @ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void createAppLink(@NotNull ReadableMap params, @NotNull Promise promise) {
        Object obj;
        Object obj2;
        Object obj3;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(promise, "promise");
        String string = params.getString("metaTitle");
        Map map = null;
        if (string != null) {
            int length = string.length();
            obj = string;
        }
        obj = null;
        String string2 = params.getString("metaDescription");
        if (string2 != null) {
            int length2 = string2.length();
            obj2 = string2;
        }
        obj2 = null;
        String string3 = params.getString("metaImageUrl");
        if (string3 != null) {
            int length3 = string3.length();
            obj3 = string3;
        }
        obj3 = null;
        if (obj != null || obj2 != null || obj3 != null) {
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            Pair pair = TuplesKt.to("title", obj);
            Object obj4 = obj2;
            if (obj2 == null) {
                obj4 = JSONObject.NULL;
            }
            Pair pair2 = TuplesKt.to("description", obj4);
            Object obj5 = obj3;
            if (obj3 == null) {
                obj5 = JSONObject.NULL;
            }
            map = MapsKt.mapOf(pair, pair2, TuplesKt.to("imageUrl", obj5));
        }
        AbstractC1459k.d(Q.a(C1452g0.c()), null, null, new AppsonairReactNativeApplinkModule$createAppLink$1(this, params, map, promise, null), 3, null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public final void getReferralDetails(@NotNull Promise promise) {
        String str;
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            AppLinkService appLinkService = this.appLinkService;
            JSONObject referralLink = appLinkService != null ? appLinkService.getReferralLink() : null;
            if (referralLink == null) {
                promise.reject("NO_REFERRAL", "No referral details available");
                return;
            }
            WritableMap createMap = Arguments.createMap();
            Iterator<String> keys = referralLink.keys();
            Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = referralLink.opt(next);
                if (opt instanceof String) {
                    Intrinsics.checkNotNull(next);
                    createMap.putString(next, (String) opt);
                } else if (opt instanceof Integer) {
                    Intrinsics.checkNotNull(next);
                    createMap.putInt(next, ((Number) opt).intValue());
                } else if (opt instanceof Double) {
                    Intrinsics.checkNotNull(next);
                    createMap.putDouble(next, ((Number) opt).doubleValue());
                } else if (opt instanceof Boolean) {
                    Intrinsics.checkNotNull(next);
                    createMap.putBoolean(next, ((Boolean) opt).booleanValue());
                } else {
                    Intrinsics.checkNotNull(next);
                    if (opt == null || (str = opt.toString()) == null) {
                        str = "";
                    }
                    createMap.putString(next, str);
                }
            }
            promise.resolve(createMap);
        } catch (Exception e10) {
            promise.reject("REFERRAL_ERROR", e10.getMessage(), e10);
        }
    }

    @ReactMethod
    public final void getReferralInfo(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        AbstractC1459k.d(Q.a(C1452g0.c()), null, null, new AppsonairReactNativeApplinkModule$getReferralInfo$1(this, promise, null), 3, null);
    }

    public final void handleIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        AppLinkService appLinkService = this.appLinkService;
        if (appLinkService == null) {
            this.pendingIntent = intent;
        } else if (appLinkService != null) {
            String packageName = this.context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            AppLinkService.handleDeepLink$default(appLinkService, intent, packageName, null, null, 12, null);
        }
    }

    @ReactMethod
    public final void initialize(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("NO_ACTIVITY", "Activity is null");
            return;
        }
        AppLinkService companion = AppLinkService.INSTANCE.getInstance(currentActivity);
        this.appLinkService = companion;
        if (companion != null) {
            ReactApplicationContext reactApplicationContext = this.context;
            Intent intent = currentActivity.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            companion.initialize(reactApplicationContext, intent, new AppLinkListener() { // from class: com.appsonairreactnativeapplink.AppsonairReactNativeApplinkModule$initialize$1
                @Override // com.appsonair.applink.interfaces.AppLinkListener
                public void onDeepLinkError(Uri uri, String error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                }

                @Override // com.appsonair.applink.interfaces.AppLinkListener
                public void onDeepLinkProcessed(Uri uri, JSONObject result) {
                    WritableMap jsonToWritableMap;
                    Intrinsics.checkNotNullParameter(uri, "uri");
                    Intrinsics.checkNotNullParameter(result, "result");
                    WritableMap createMap = Arguments.createMap();
                    createMap.putString("uri", uri.toString());
                    jsonToWritableMap = AppsonairReactNativeApplinkModule.this.jsonToWritableMap(result);
                    createMap.putMap("result", jsonToWritableMap);
                    AppsonairReactNativeApplinkModule.this.sendEvent("onDeepLinkProcessed", createMap);
                }

                @Override // com.appsonair.applink.interfaces.AppLinkListener
                public void onReferralLinkDetected(JSONObject result) {
                    WritableMap jsonToWritableMap;
                    Intrinsics.checkNotNullParameter(result, "result");
                    jsonToWritableMap = AppsonairReactNativeApplinkModule.this.jsonToWritableMap(result);
                    AppsonairReactNativeApplinkModule.this.sendEvent("onReferralLinkDetected", jsonToWritableMap);
                }
            });
        }
        Intent intent2 = this.pendingIntent;
        if (intent2 != null) {
            AppLinkService appLinkService = this.appLinkService;
            if (appLinkService != null) {
                String packageName = this.context.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                AppLinkService.handleDeepLink$default(appLinkService, intent2, packageName, null, null, 12, null);
            }
            this.pendingIntent = null;
        }
        promise.resolve(Boolean.TRUE);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(@NotNull Activity activity, int requestCode, int resultCode, @Nullable Intent data) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        AppLinkService appLinkService = this.appLinkService;
        if (appLinkService != null) {
            String packageName = this.context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            AppLinkService.handleDeepLink$default(appLinkService, intent, packageName, null, null, 12, null);
        }
    }

    @ReactMethod
    public final void removeListeners(int count) {
    }
}
