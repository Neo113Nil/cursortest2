package com.reactnativegooglesignin;

import android.view.View;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNGoogleSigninButtonManagerInterface;
import com.google.android.gms.common.ViewOnClickListenerC3205m;
import com.reactnativegooglesignin.RNGoogleSigninButtonViewManager;
import java.util.HashMap;
import java.util.Map;
import qc.C6139d;
import qc.C6149n;

/* loaded from: classes4.dex */
public class RNGoogleSigninButtonViewManager extends SimpleViewManager<ViewOnClickListenerC3205m> implements RNGoogleSigninButtonManagerInterface {
    public static final String MODULE_NAME = "RNGoogleSigninButton";
    private static final View.OnClickListener mOnClickListener = new View.OnClickListener() { // from class: qc.e
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            RNGoogleSigninButtonViewManager.a(view);
        }
    };
    private final ViewManagerDelegate<ViewOnClickListenerC3205m> mDelegate = new C6139d(this);

    public static /* synthetic */ void a(View view) {
        ReactContext reactContext = (ReactContext) view.getContext();
        int id2 = view.getId();
        UIManagerHelper.getEventDispatcherForReactTag(reactContext, id2).dispatchEvent(new C6149n(UIManagerHelper.getSurfaceId(reactContext), id2));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate<ViewOnClickListenerC3205m> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomBubblingEventTypeConstants = super.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants == null) {
            exportedCustomBubblingEventTypeConstants = new HashMap<>();
        }
        exportedCustomBubblingEventTypeConstants.put("topPress", MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", "onPress")));
        return exportedCustomBubblingEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return MODULE_NAME;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@NonNull ThemedReactContext themedReactContext, ViewOnClickListenerC3205m viewOnClickListenerC3205m) {
        viewOnClickListenerC3205m.setOnClickListener(mOnClickListener);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public ViewOnClickListenerC3205m createViewInstance(@NonNull ThemedReactContext themedReactContext) {
        return new ViewOnClickListenerC3205m(themedReactContext);
    }

    @Override // com.facebook.react.viewmanagers.RNGoogleSigninButtonManagerInterface
    @ReactProp(name = ViewProps.COLOR)
    public void setColor(ViewOnClickListenerC3205m viewOnClickListenerC3205m, String str) {
        if (str == null) {
            viewOnClickListenerC3205m.setColorScheme(2);
        } else {
            viewOnClickListenerC3205m.setColorScheme(!"dark".equals(str) ? 1 : 0);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNGoogleSigninButtonManagerInterface
    @ReactProp(name = "disabled")
    public void setDisabled(ViewOnClickListenerC3205m viewOnClickListenerC3205m, boolean z10) {
        viewOnClickListenerC3205m.setEnabled(!z10);
    }

    @Override // com.facebook.react.viewmanagers.RNGoogleSigninButtonManagerInterface
    @ReactProp(name = "size")
    public void setSize(ViewOnClickListenerC3205m viewOnClickListenerC3205m, int i10) {
        viewOnClickListenerC3205m.setSize(i10);
    }
}
