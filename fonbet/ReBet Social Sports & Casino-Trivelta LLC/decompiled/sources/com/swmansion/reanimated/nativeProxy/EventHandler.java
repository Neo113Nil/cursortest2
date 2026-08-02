package com.swmansion.reanimated.nativeProxy;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import h8.InterfaceC4488a;

@InterfaceC4488a
/* loaded from: classes4.dex */
public class EventHandler implements RCTEventEmitter {
    public UIManagerModule.CustomEventNamesResolver mCustomEventNamesResolver;

    @InterfaceC4488a
    private final HybridData mHybridData;

    @InterfaceC4488a
    private EventHandler(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i10, String str, WritableMap writableMap) {
        receiveEvent(this.mCustomEventNamesResolver.resolveCustomEventName(str), i10, writableMap);
    }

    public native void receiveEvent(String str, int i10, WritableMap writableMap);

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
    }
}
