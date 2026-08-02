package com.unity3d.ads.adplayer.model;

import com.unity3d.services.ads.offerwall.OfferwallEvent;

/* compiled from: WebViewEvent.kt */
/* loaded from: classes14.dex */
public final class OnOfferwallEvent implements WebViewEvent {
    private final String name;
    private final String category = "OFFERWALL";
    private final Object[] parameters = new Object[0];

    public OnOfferwallEvent(OfferwallEvent offerwallEvent) {
        this.name = offerwallEvent.name();
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
