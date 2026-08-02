package com.unity3d.ads.adplayer.model;

import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: WebViewEvent.kt */
/* loaded from: classes14.dex */
public final class OnWebRequestFailed implements WebViewEvent {
    private final String category = "REQUEST";
    private final String name = SignalingProtocol.HUNGUP_REASON_FAILED;
    private final Object[] parameters;

    public OnWebRequestFailed(List<? extends Object> list) {
        this.parameters = list.toArray(new Object[0]);
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public String getCategory() {
        return this.category;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public String getName() {
        return this.name;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public Object[] getParameters() {
        return this.parameters;
    }
}
