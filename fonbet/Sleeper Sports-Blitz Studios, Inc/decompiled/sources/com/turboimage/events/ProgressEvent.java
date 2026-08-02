package com.turboimage.events;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProgressEvent.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/turboimage/events/ProgressEvent;", "Lcom/facebook/react/uimanager/events/Event;", "Lcom/turboimage/events/StartEvent;", "surfaceId", "", "viewId", "payload", "Lcom/facebook/react/bridge/WritableMap;", "<init>", "(IILcom/facebook/react/bridge/WritableMap;)V", "getEventName", "", "getEventData", "Companion", "react-native-turbo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ProgressEvent extends Event<StartEvent> {
    public static final String EVENT_NAME = "onProgress";
    private final WritableMap payload;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressEvent(int i, int i2, WritableMap payload) {
        super(i, i2);
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.payload = payload;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return EVENT_NAME;
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* renamed from: getEventData, reason: from getter */
    protected WritableMap getPayload() {
        return this.payload;
    }
}
