package com.zoontek.rnbootsplash;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import io.intercom.android.sdk.annotations.SeenState;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RNBootSplashModule.kt */
@ReactModule(name = "RNBootSplash")
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0014J \u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016¨\u0006\u0018"}, d2 = {"Lcom/zoontek/rnbootsplash/RNBootSplashModule;", "Lcom/zoontek/rnbootsplash/NativeRNBootSplashSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "onHostResume", "", "onHostPause", "onHostDestroy", "getTypedExportedConstants", "", "", SeenState.HIDE, "fade", "", "forced", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "show", "isVisible", "react-native-bootsplash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RNBootSplashModule extends NativeRNBootSplashSpec implements LifecycleEventListener {
    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNBootSplashModule(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        reactContext.addLifecycleEventListener(this);
    }

    @Override // com.zoontek.rnbootsplash.NativeRNBootSplashSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNBootSplash";
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        RNBootSplashModuleImpl.INSTANCE.onHostDestroy$react_native_bootsplash_release();
    }

    @Override // com.zoontek.rnbootsplash.NativeRNBootSplashSpec
    protected Map<String, Object> getTypedExportedConstants() {
        RNBootSplashModuleImpl rNBootSplashModuleImpl = RNBootSplashModuleImpl.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        return rNBootSplashModuleImpl.getConstants(reactApplicationContext);
    }

    @Override // com.zoontek.rnbootsplash.NativeRNBootSplashSpec
    public void hide(boolean fade, boolean forced, Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        RNBootSplashModuleImpl rNBootSplashModuleImpl = RNBootSplashModuleImpl.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        rNBootSplashModuleImpl.hide(reactApplicationContext, fade, forced, promise);
    }

    @Override // com.zoontek.rnbootsplash.NativeRNBootSplashSpec
    public void show(boolean fade, Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        RNBootSplashModuleImpl rNBootSplashModuleImpl = RNBootSplashModuleImpl.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        rNBootSplashModuleImpl.show(reactApplicationContext, fade, promise);
    }

    @Override // com.zoontek.rnbootsplash.NativeRNBootSplashSpec
    public void isVisible(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        RNBootSplashModuleImpl.INSTANCE.isVisible(promise);
    }
}
