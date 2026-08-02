package com.sleeperbot.modules;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;

/* loaded from: classes8.dex */
public class TouchBlockerManager extends ViewGroupManager<TouchBlocker> {
    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return TouchBlocker.TAG;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public TouchBlocker createViewInstance(ThemedReactContext themedReactContext) {
        return new TouchBlocker(themedReactContext);
    }

    @ReactProp(name = "blockAllTouch")
    public void setBlockAllTouch(TouchBlocker touchBlocker, boolean z) {
        touchBlocker.setBlockAllTouch(z);
    }

    @ReactProp(name = "blockVerticalInteraction")
    public void setBlockVerticalInteraction(TouchBlocker touchBlocker, boolean z) {
        touchBlocker.setBlockVerticalInteraction(z);
    }

    @ReactProp(name = "blockHorizontalInteraction")
    public void setBlockHorizontalInteraction(TouchBlocker touchBlocker, boolean z) {
        touchBlocker.setBlockHorizontalInteraction(z);
    }
}
