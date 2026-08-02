package com.appsonairreactnativeappsync;

import com.appsonair.appsync.interfaces.UpdateCallBack;
import com.appsonair.appsync.services.AppSyncService;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0016\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u0010*\u00020\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/appsonairreactnativeappsync/AppsonairReactNativeAppsyncModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "TAG", "", "getName", BaseJavaModule.METHOD_TYPE_SYNC, "", "options", "Lcom/facebook/react/bridge/ReadableMap;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "toMap", "", "", "Companion", "appsonair-react-native-appsync_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppsonairReactNativeAppsyncModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppsonairReactNativeAppsyncModule.kt\ncom/appsonairreactnativeappsync/AppsonairReactNativeAppsyncModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
/* loaded from: classes.dex */
public final class AppsonairReactNativeAppsyncModule extends ReactContextBaseJavaModule {

    @NotNull
    public static final String NAME = "AppsonairReactNativeAppsync";

    @NotNull
    private final String TAG;

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
                iArr[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppsonairReactNativeAppsyncModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.TAG = "AppsonairReactNativeAppsyncModule";
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public final void sync(@NotNull ReadableMap options, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Map<String, ? extends Object> map = toMap(options);
        AppSyncService.Companion companion = AppSyncService.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        companion.sync(reactApplicationContext, map, new UpdateCallBack() { // from class: com.appsonairreactnativeappsync.AppsonairReactNativeAppsyncModule$sync$1
            @Override // com.appsonair.appsync.interfaces.UpdateCallBack
            public void onFailure(String message) {
                String unused;
                unused = AppsonairReactNativeAppsyncModule.this.TAG;
                promise.reject("SYNC_FAILED", message);
            }

            @Override // com.appsonair.appsync.interfaces.UpdateCallBack
            public void onSuccess(String response) {
                String unused;
                unused = AppsonairReactNativeAppsyncModule.this.TAG;
                promise.resolve(response);
            }
        });
    }

    @NotNull
    public final Map<String, Object> toMap(@NotNull ReadableMap readableMap) {
        ReadableMap map;
        Map<String, Object> map2;
        Intrinsics.checkNotNullParameter(readableMap, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            int i10 = WhenMappings.$EnumSwitchMapping$0[readableMap.getType(nextKey).ordinal()];
            if (i10 == 1) {
                String string = readableMap.getString(nextKey);
                if (string == null) {
                    string = "";
                }
                linkedHashMap.put(nextKey, string);
            } else if (i10 == 2) {
                linkedHashMap.put(nextKey, Boolean.valueOf(readableMap.getBoolean(nextKey)));
            } else if (i10 == 3) {
                linkedHashMap.put(nextKey, Double.valueOf(readableMap.getDouble(nextKey)));
            } else if (i10 == 4 && (map = readableMap.getMap(nextKey)) != null && (map2 = toMap(map)) != null) {
                linkedHashMap.put(nextKey, map2);
            }
        }
        return linkedHashMap;
    }
}
