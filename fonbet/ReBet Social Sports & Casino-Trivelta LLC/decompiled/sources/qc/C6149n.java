package qc;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* renamed from: qc.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6149n extends Event {
    public C6149n(int i10, int i11) {
        super(i10, i11);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public WritableMap getEventData() {
        return Arguments.createMap();
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topPress";
    }
}
