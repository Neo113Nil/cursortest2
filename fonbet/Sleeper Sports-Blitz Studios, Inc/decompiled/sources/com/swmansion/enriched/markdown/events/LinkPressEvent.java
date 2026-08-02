package com.swmansion.enriched.markdown.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkPressEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/swmansion/enriched/markdown/events/LinkPressEvent;", "Lcom/facebook/react/uimanager/events/Event;", "surfaceId", "", "viewId", "url", "", "<init>", "(IILjava/lang/String;)V", "getEventName", "getEventData", "Lcom/facebook/react/bridge/WritableMap;", "Companion", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LinkPressEvent extends Event<LinkPressEvent> {
    public static final String EVENT_NAME = "onLinkPress";
    private final String url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkPressEvent(int i, int i2, String url) {
        super(i, i2);
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return EVENT_NAME;
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* renamed from: getEventData */
    protected WritableMap getPayload() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("url", this.url);
        return createMap;
    }
}
