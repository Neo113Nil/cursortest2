package com.mattermost.pasteinputtext;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* loaded from: classes8.dex */
public class PasteTextInputPasteEvent extends Event<PasteTextInputPasteEvent> {
    private static final String EVENT_NAME = "onPaste";
    private final ReadableMap mEventData;

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return false;
    }

    @Deprecated
    public PasteTextInputPasteEvent(int i) {
        this(-1, i, null);
    }

    public PasteTextInputPasteEvent(int i, int i2, ReadableMap readableMap) {
        super(i, i2);
        this.mEventData = readableMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return EVENT_NAME;
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* renamed from: getEventData */
    protected WritableMap getPayload() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(TypedValues.AttributesType.S_TARGET, getViewTag());
        createMap.merge(this.mEventData);
        return createMap;
    }
}
