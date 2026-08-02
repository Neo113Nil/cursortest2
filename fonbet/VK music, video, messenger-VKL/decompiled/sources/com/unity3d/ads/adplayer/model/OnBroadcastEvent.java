package com.unity3d.ads.adplayer.model;

/* compiled from: WebViewEvent.kt */
/* loaded from: classes14.dex */
public final class OnBroadcastEvent implements WebViewEvent {
    private final String category = "ADVIEWER";
    private final String name;
    private final Object[] parameters;

    public OnBroadcastEvent(String str, String str2) {
        this.name = str;
        this.parameters = new Object[]{str2};
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
