package com.plaid;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.plaid.gson.PlaidJsonConverter;
import com.plaid.link.OnLoadCallback;
import com.plaid.link.Plaid;
import com.plaid.link.PlaidHandler;
import com.plaid.link.SubmissionData;
import com.plaid.link.configuration.LinkLogLevel;
import com.plaid.link.configuration.LinkTokenConfiguration;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.exception.LinkException;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkResultHandler;
import com.plaid.link.result.LinkSuccess;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@ReactModule(name = "PlaidAndroid")
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 F2\u00020\u00012\u00020\u0002:\u0001FB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\"\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J&\u0010#\u001a\u00020\u001a2\b\u0010$\u001a\u0004\u0018\u00010\u00182\b\u0010%\u001a\u0004\u0018\u00010\u00182\b\u0010&\u001a\u0004\u0018\u00010'H\u0017J(\u0010(\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u0013H\u0017J\u0018\u0010*\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0017J\u0010\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020-H\u0017J0\u0010.\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0017J\u0012\u0010/\u001a\u00020\u001a2\b\u00100\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u00101\u001a\u00020\u001a2\u0006\u00102\u001a\u000203H\u0016J\u001a\u00104\u001a\u0004\u0018\u00010\u00182\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0018H\u0002J\u001f\u00108\u001a\u0004\u0018\u00010 2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0018H\u0002¢\u0006\u0002\u00109J\u0010\u0010:\u001a\u00020\"2\u0006\u0010;\u001a\u00020\u0018H\u0002J*\u0010<\u001a\u00020\u001a2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020@2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\u0010\u0010D\u001a\u00020\u001a2\u0006\u0010E\u001a\u00020CH\u0016R\u001b\u0010\u0007\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"Lcom/plaid/PlaidModule;", "Lcom/plaid/NativePlaidLinkModuleAndroidSpec;", "Lcom/facebook/react/bridge/ActivityEventListener;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "mActivityResultManager", "Lcom/plaid/ActivityResultManager;", "getMActivityResultManager", "()Lcom/plaid/ActivityResultManager;", "mActivityResultManager$delegate", "Lkotlin/Lazy;", "jsonConverter", "Lcom/plaid/gson/PlaidJsonConverter;", "getJsonConverter", "()Lcom/plaid/gson/PlaidJsonConverter;", "jsonConverter$delegate", "onSuccessCallback", "Lcom/facebook/react/bridge/Callback;", "onExitCallback", "plaidHandler", "Lcom/plaid/link/PlaidHandler;", "getName", "", "initialize", "", "invalidate", "getLinkTokenConfiguration", "Lcom/plaid/link/configuration/LinkTokenConfiguration;", "token", "noLoadingState", "", "logLevel", "Lcom/plaid/link/configuration/LinkLogLevel;", "submit", "phoneNumber", "dateOfBirth", "params", "Lcom/facebook/react/bridge/ReadableMap;", "createPlaidLink", "onLoad", "open", "destroy", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "startLinkActivityForResult", "addListener", "eventName", "removeListeners", "count", "", "maybeGetStringField", "obj", "Lorg/json/JSONObject;", "fieldName", "maybeGetBooleanField", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Boolean;", "getLogLevel", "string", "onActivityResult", "activity", "Landroid/app/Activity;", "requestCode", "", "resultCode", EventKeys.DATA, "Landroid/content/Intent;", "onNewIntent", "intent", "Companion", "react-native-plaid-link-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPlaidModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaidModule.kt\ncom/plaid/PlaidModule\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,292:1\n136#2,9:293\n216#2:302\n217#2:304\n145#2:305\n1#3:303\n*S KotlinDebug\n*F\n+ 1 PlaidModule.kt\ncom/plaid/PlaidModule\n*L\n91#1:293,9\n91#1:302\n91#1:304\n91#1:305\n91#1:303\n*E\n"})
/* loaded from: classes3.dex */
public final class PlaidModule extends NativePlaidLinkModuleAndroidSpec implements ActivityEventListener {

    @NotNull
    private static final String LINK_TOKEN_PREFIX = "link";

    @NotNull
    public static final String NAME = "PlaidAndroid";

    /* renamed from: jsonConverter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy jsonConverter;

    /* renamed from: mActivityResultManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mActivityResultManager;

    @Nullable
    private Callback onExitCallback;

    @Nullable
    private Callback onSuccessCallback;

    @Nullable
    private PlaidHandler plaidHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.mActivityResultManager = LazyKt.lazy(new Function0() { // from class: com.plaid.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ActivityResultManager mActivityResultManager_delegate$lambda$0;
                mActivityResultManager_delegate$lambda$0 = PlaidModule.mActivityResultManager_delegate$lambda$0();
                return mActivityResultManager_delegate$lambda$0;
            }
        });
        this.jsonConverter = LazyKt.lazy(new Function0() { // from class: com.plaid.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PlaidJsonConverter jsonConverter_delegate$lambda$1;
                jsonConverter_delegate$lambda$1 = PlaidModule.jsonConverter_delegate$lambda$1();
                return jsonConverter_delegate$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createPlaidLink$lambda$4(PlaidModule plaidModule, LinkEvent linkEvent) {
        Intrinsics.checkNotNullParameter(linkEvent, "linkEvent");
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) plaidModule.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onEvent", GlobalFunctionsKt.convertJsonToMap(new JSONObject(plaidModule.getJsonConverter().convert(linkEvent))));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createPlaidLink$lambda$5(Callback callback) {
        try {
            callback.invoke(new Object[0]);
        } catch (Exception e10) {
            Log.e("PlaidModule", "onLoad callback failed", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroy$lambda$8(Promise promise, CountDownLatch countDownLatch) {
        try {
            Plaid.INSTANCE.destroy();
            countDownLatch.countDown();
        } catch (Exception e10) {
            promise.reject("DESTROY_FAILED", "Failed to destroy Plaid", e10);
            countDownLatch.countDown();
        }
    }

    private final PlaidJsonConverter getJsonConverter() {
        return (PlaidJsonConverter) this.jsonConverter.getValue();
    }

    private final LinkTokenConfiguration getLinkTokenConfiguration(String token, boolean noLoadingState, LinkLogLevel logLevel) {
        if (token != null && StringsKt.startsWith$default(token, LINK_TOKEN_PREFIX, false, 2, (Object) null)) {
            return new LinkTokenConfiguration.Builder().token(token).logLevel(logLevel).noLoadingState(noLoadingState).build();
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    private final LinkLogLevel getLogLevel(String string) {
        switch (string.hashCode()) {
            case 3237038:
                if (string.equals("info")) {
                    return LinkLogLevel.INFO;
                }
                break;
            case 3641990:
                if (string.equals("warn")) {
                    return LinkLogLevel.WARN;
                }
                break;
            case 95458899:
                if (string.equals("debug")) {
                    return LinkLogLevel.DEBUG;
                }
                break;
            case 96784904:
                if (string.equals("error")) {
                    return LinkLogLevel.ERROR;
                }
                break;
        }
        return LinkLogLevel.ASSERT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlaidJsonConverter jsonConverter_delegate$lambda$1() {
        return new PlaidJsonConverter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActivityResultManager mActivityResultManager_delegate$lambda$0() {
        return new ActivityResultManager();
    }

    private final Boolean maybeGetBooleanField(JSONObject obj, String fieldName) {
        if (obj.has(fieldName)) {
            return Boolean.valueOf(obj.getBoolean(fieldName));
        }
        return null;
    }

    private final String maybeGetStringField(JSONObject obj, String fieldName) {
        if (!obj.has(fieldName) || TextUtils.isEmpty(obj.getString(fieldName))) {
            return null;
        }
        return obj.getString(fieldName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onActivityResult$lambda$11(PlaidModule plaidModule, LinkSuccess success) {
        Intrinsics.checkNotNullParameter(success, "success");
        WritableMap convertJsonToMap = GlobalFunctionsKt.convertJsonToMap(new JSONObject(plaidModule.getJsonConverter().convert(success)));
        System.out.print(convertJsonToMap);
        Callback callback = plaidModule.onSuccessCallback;
        if (callback != null) {
            callback.invoke(convertJsonToMap);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onActivityResult$lambda$12(PlaidModule plaidModule, LinkExit exit) {
        Intrinsics.checkNotNullParameter(exit, "exit");
        WritableMap convertJsonToMap = GlobalFunctionsKt.convertJsonToMap(new JSONObject(plaidModule.getJsonConverter().convert(exit)));
        System.out.print(convertJsonToMap);
        Callback callback = plaidModule.onExitCallback;
        if (callback != null) {
            callback.invoke(convertJsonToMap);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startLinkActivityForResult$lambda$9(PlaidModule plaidModule, LinkEvent linkEvent) {
        Intrinsics.checkNotNullParameter(linkEvent, "linkEvent");
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) plaidModule.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onEvent", GlobalFunctionsKt.convertJsonToMap(new JSONObject(plaidModule.getJsonConverter().convert(linkEvent))));
        return Unit.INSTANCE;
    }

    @Override // com.plaid.NativePlaidLinkModuleAndroidSpec
    public void addListener(@Nullable String eventName) {
    }

    @Override // com.plaid.NativePlaidLinkModuleAndroidSpec
    @ReactMethod
    public void createPlaidLink(@NotNull String token, boolean noLoadingState, @NotNull String logLevel, @NotNull final Callback onLoad) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(onLoad, "onLoad");
        LinkTokenConfiguration linkTokenConfiguration = getLinkTokenConfiguration(token, noLoadingState, getLogLevel(logLevel));
        if (linkTokenConfiguration == null) {
            throw new LinkException("Unable to open link, please check that your configuration is valid");
        }
        try {
            Plaid.setLinkEventListener(new Function1() { // from class: com.plaid.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit createPlaidLink$lambda$4;
                    createPlaidLink$lambda$4 = PlaidModule.createPlaidLink$lambda$4(PlaidModule.this, (LinkEvent) obj);
                    return createPlaidLink$lambda$4;
                }
            });
            Context applicationContext = getReactApplicationContext().getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            this.plaidHandler = Plaid.create((Application) applicationContext, linkTokenConfiguration, new OnLoadCallback() { // from class: com.plaid.k
                @Override // com.plaid.link.OnLoadCallback
                public final void onLoad() {
                    PlaidModule.createPlaidLink$lambda$5(Callback.this);
                }
            });
        } catch (JSONException e10) {
            Log.e("PlaidModule", e10.toString());
            throw e10;
        }
    }

    @Override // com.plaid.NativePlaidLinkModuleAndroidSpec
    @ReactMethod
    public void destroy(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.plaid.g
            @Override // java.lang.Runnable
            public final void run() {
                PlaidModule.destroy$lambda$8(Promise.this, countDownLatch);
            }
        });
        try {
            if (countDownLatch.await(5L, TimeUnit.SECONDS)) {
                promise.resolve(null);
            } else {
                promise.reject("TIMEOUT", "Timed out waiting for destroy() to complete.");
            }
        } catch (InterruptedException e10) {
            promise.reject("INTERRUPTED", "Thread was interrupted", e10);
        }
    }

    @NotNull
    public final ActivityResultManager getMActivityResultManager() {
        return (ActivityResultManager) this.mActivityResultManager.getValue();
    }

    @Override // com.plaid.NativePlaidLinkModuleAndroidSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "PlaidAndroid";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        getReactApplicationContext().addActivityEventListener(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        super.invalidate();
        getReactApplicationContext().removeActivityEventListener(this);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(@NotNull Activity activity, int requestCode, int resultCode, @Nullable Intent data) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (getMActivityResultManager().get(Integer.valueOf(requestCode)) != null) {
            getMActivityResultManager().dispatch(requestCode, resultCode, data);
        } else {
            if (new LinkResultHandler(new Function1() { // from class: com.plaid.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit onActivityResult$lambda$11;
                    onActivityResult$lambda$11 = PlaidModule.onActivityResult$lambda$11(PlaidModule.this, (LinkSuccess) obj);
                    return onActivityResult$lambda$11;
                }
            }, new Function1() { // from class: com.plaid.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit onActivityResult$lambda$12;
                    onActivityResult$lambda$12 = PlaidModule.onActivityResult$lambda$12(PlaidModule.this, (LinkExit) obj);
                    return onActivityResult$lambda$12;
                }
            }).onActivityResult(requestCode, resultCode, data)) {
                return;
            }
            Log.i("PlaidModule", "Result code not handled.");
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
    }

    @Override // com.plaid.NativePlaidLinkModuleAndroidSpec
    @ReactMethod
    public void open(@NotNull Callback onSuccessCallback, @NotNull Callback onExitCallback) {
        Intrinsics.checkNotNullParameter(onSuccessCallback, "onSuccessCallback");
        Intrinsics.checkNotNullParameter(onExitCallback, "onExitCallback");
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Current activity is null");
        }
        PlaidHandler plaidHandler = this.plaidHandler;
        if (plaidHandler == null) {
            throw new LinkException("Create must be called before open.");
        }
        this.onSuccessCallback = onSuccessCallback;
        this.onExitCallback = onExitCallback;
        plaidHandler.open(currentActivity);
    }

    @Override // com.plaid.NativePlaidLinkModuleAndroidSpec
    public void removeListeners(double count) {
    }

    @Override // com.plaid.NativePlaidLinkModuleAndroidSpec
    @ReactMethod
    public void startLinkActivityForResult(@NotNull String token, boolean noLoadingState, @NotNull String logLevel, @NotNull Callback onSuccessCallback, @NotNull Callback onExitCallback) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(onSuccessCallback, "onSuccessCallback");
        Intrinsics.checkNotNullParameter(onExitCallback, "onExitCallback");
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Current activity is null");
        }
        this.onSuccessCallback = onSuccessCallback;
        this.onExitCallback = onExitCallback;
        try {
            Plaid.setLinkEventListener(new Function1() { // from class: com.plaid.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit startLinkActivityForResult$lambda$9;
                    startLinkActivityForResult$lambda$9 = PlaidModule.startLinkActivityForResult$lambda$9(PlaidModule.this, (LinkEvent) obj);
                    return startLinkActivityForResult$lambda$9;
                }
            });
            LinkTokenConfiguration linkTokenConfiguration = getLinkTokenConfiguration(token, noLoadingState, getLogLevel(logLevel));
            if (linkTokenConfiguration == null) {
                throw new LinkException("Unable to open link, please check that your configuration is valid");
            }
            Context applicationContext = getReactApplicationContext().getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            Plaid.create((Application) applicationContext, linkTokenConfiguration).open(currentActivity);
        } catch (JSONException e10) {
            Log.e("PlaidModule", e10.toString());
            throw e10;
        }
    }

    @Override // com.plaid.NativePlaidLinkModuleAndroidSpec
    @ReactMethod
    public void submit(@Nullable String phoneNumber, @Nullable String dateOfBirth, @Nullable ReadableMap params) {
        if (this.plaidHandler != null) {
            Map map = null;
            if (params != null) {
                HashMap<String, Object> hashMap = params.toHashMap();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    Pair pair = value instanceof String ? TuplesKt.to(key, value) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                map = MapsKt.toMap(arrayList);
            }
            SubmissionData submissionData = new SubmissionData(phoneNumber, dateOfBirth, map);
            PlaidHandler plaidHandler = this.plaidHandler;
            if (plaidHandler != null) {
                plaidHandler.submit(submissionData);
            }
        }
    }
}
