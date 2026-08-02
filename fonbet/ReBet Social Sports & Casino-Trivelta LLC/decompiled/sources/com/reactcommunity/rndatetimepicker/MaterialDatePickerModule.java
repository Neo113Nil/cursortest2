package com.reactcommunity.rndatetimepicker;

import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.reactcommunity.rndatetimepicker.MaterialDatePickerModule;
import jc.AbstractC5118d;
import jc.v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/reactcommunity/rndatetimepicker/MaterialDatePickerModule;", "Lcom/reactcommunity/rndatetimepicker/NativeModuleMaterialDatePickerSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "", "dismiss", "(Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReadableMap;", "params", "open", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "Companion", "a", "react-native-community_datetimepicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MaterialDatePickerModule extends NativeModuleMaterialDatePickerSpec {

    @NotNull
    public static final String NAME = "RNCMaterialDatePicker";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialDatePickerModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void open$lambda$0(ReadableMap readableMap, Promise promise, FragmentManager fragmentManager, MaterialDatePickerModule materialDatePickerModule) {
        Bundle e10 = AbstractC5118d.e(readableMap);
        Intrinsics.checkNotNull(e10);
        ReactApplicationContext reactApplicationContext = materialDatePickerModule.getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        new v(e10, promise, fragmentManager, reactApplicationContext).m();
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleMaterialDatePickerSpec
    public void dismiss(@Nullable Promise promise) {
        AbstractC5118d.h((AbstractActivityC2168s) getReactApplicationContext().getCurrentActivity(), "RNCMaterialDatePicker", promise);
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleMaterialDatePickerSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "RNCMaterialDatePicker";
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleMaterialDatePickerSpec
    public void open(@NotNull final ReadableMap params, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(promise, "promise");
        AbstractActivityC2168s abstractActivityC2168s = (AbstractActivityC2168s) getReactApplicationContext().getCurrentActivity();
        if (abstractActivityC2168s == null) {
            promise.reject("E_NO_ACTIVITY", "Tried to open a MaterialDatePicker dialog while not attached to an Activity");
            return;
        }
        final FragmentManager supportFragmentManager = abstractActivityC2168s.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: jc.f
            @Override // java.lang.Runnable
            public final void run() {
                MaterialDatePickerModule.open$lambda$0(ReadableMap.this, promise, supportFragmentManager, this);
            }
        });
    }
}
