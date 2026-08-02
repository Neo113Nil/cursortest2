package com.braze.reactbridge.util;

import com.braze.support.BrazeLogger;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: MapFactory.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0001H\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"shouldUseJavaMapForMapFactory", "", "TAG", "", "getMutableMap", "Lcom/facebook/react/bridge/WritableMap;", "getMutableArray", "Lcom/facebook/react/bridge/WritableArray;", "setShouldUseJavaMapForMapFactory", "", "shouldUseJavaMap", "braze_react-native-sdk_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MapFactoryKt {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("MapFactory");
    private static boolean shouldUseJavaMapForMapFactory;

    public static final WritableMap getMutableMap() {
        if (shouldUseJavaMapForMapFactory) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.util.MapFactoryKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String mutableMap$lambda$0;
                    mutableMap$lambda$0 = MapFactoryKt.getMutableMap$lambda$0();
                    return mutableMap$lambda$0;
                }
            }, 12, (Object) null);
            return new JavaOnlyMap();
        }
        return new WritableNativeMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getMutableMap$lambda$0() {
        return "Using JavaOnlyMap for WritableMap. This should only fire for tests!";
    }

    public static final WritableArray getMutableArray() {
        if (shouldUseJavaMapForMapFactory) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.util.MapFactoryKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String mutableArray$lambda$1;
                    mutableArray$lambda$1 = MapFactoryKt.getMutableArray$lambda$1();
                    return mutableArray$lambda$1;
                }
            }, 12, (Object) null);
            return new JavaOnlyArray();
        }
        return new WritableNativeArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getMutableArray$lambda$1() {
        return "Using JavaOnlyArray for WritableArray. This should only fire for tests!";
    }

    public static final void setShouldUseJavaMapForMapFactory(boolean z) {
        shouldUseJavaMapForMapFactory = z;
    }
}
