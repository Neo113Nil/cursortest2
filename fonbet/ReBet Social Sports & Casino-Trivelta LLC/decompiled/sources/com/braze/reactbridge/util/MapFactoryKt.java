package com.braze.reactbridge.util;

import com.braze.reactbridge.util.MapFactoryKt;
import com.braze.support.BrazeLogger;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/facebook/react/bridge/WritableMap;", "getMutableMap", "()Lcom/facebook/react/bridge/WritableMap;", "Lcom/facebook/react/bridge/WritableArray;", "getMutableArray", "()Lcom/facebook/react/bridge/WritableArray;", "", "shouldUseJavaMapForMapFactory", "Z", "", "TAG", "Ljava/lang/String;", "braze_react-native-sdk_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class MapFactoryKt {

    @NotNull
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("MapFactory");
    private static boolean shouldUseJavaMapForMapFactory;

    @NotNull
    public static final WritableArray getMutableArray() {
        if (!shouldUseJavaMapForMapFactory) {
            return new WritableNativeArray();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: W3.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String mutableArray$lambda$1;
                mutableArray$lambda$1 = MapFactoryKt.getMutableArray$lambda$1();
                return mutableArray$lambda$1;
            }
        }, 12, (Object) null);
        return new JavaOnlyArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getMutableArray$lambda$1() {
        return "Using JavaOnlyArray for WritableArray. This should only fire for tests!";
    }

    @NotNull
    public static final WritableMap getMutableMap() {
        if (!shouldUseJavaMapForMapFactory) {
            return new WritableNativeMap();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: W3.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String mutableMap$lambda$0;
                mutableMap$lambda$0 = MapFactoryKt.getMutableMap$lambda$0();
                return mutableMap$lambda$0;
            }
        }, 12, (Object) null);
        return new JavaOnlyMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getMutableMap$lambda$0() {
        return "Using JavaOnlyMap for WritableMap. This should only fire for tests!";
    }
}
