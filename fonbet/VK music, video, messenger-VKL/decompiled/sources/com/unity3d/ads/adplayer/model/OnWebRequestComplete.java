package com.unity3d.ads.adplayer.model;

import java.util.List;

/* compiled from: WebViewEvent.kt */
/* loaded from: classes14.dex */
public final class OnWebRequestComplete implements WebViewEvent {
    private final String category = "REQUEST";
    private final String name = "COMPLETE";
    private final Object[] parameters;

    public OnWebRequestComplete(List<? extends Object> list) {
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
