package com.unity3d.services.store;

import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import java.util.Arrays;

/* compiled from: StoreWebViewEventSender.kt */
/* loaded from: classes14.dex */
public final class StoreWebViewEventSender {
    private final IEventSender eventSender;

    public StoreWebViewEventSender(IEventSender iEventSender) {
        this.eventSender = iEventSender;
    }

    public final void send(StoreEvent storeEvent, Object... objArr) {
        this.eventSender.sendEvent(WebViewEventCategory.STORE, storeEvent, Arrays.copyOf(objArr, objArr.length));
    }
}
