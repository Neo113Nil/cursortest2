package com.reactnativecommunity.picker;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* loaded from: classes8.dex */
public class PickerBlurEvent extends Event<PickerBlurEvent> {
    public static final String EVENT_NAME = "topBlur";

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topBlur";
    }

    public PickerBlurEvent(int i) {
        super(i);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), getPayload());
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* renamed from: getEventData */
    protected WritableMap getPayload() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(TypedValues.AttributesType.S_TARGET, getViewTag());
        return createMap;
    }
}
