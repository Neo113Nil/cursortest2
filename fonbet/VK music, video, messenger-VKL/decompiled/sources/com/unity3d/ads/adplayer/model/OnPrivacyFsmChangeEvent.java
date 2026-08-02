package com.unity3d.ads.adplayer.model;

/* compiled from: WebViewEvent.kt */
/* loaded from: classes14.dex */
public final class OnPrivacyFsmChangeEvent implements WebViewEvent {
    private final String category = "ADVIEWER";
    private final String name = "ON_PRIVACY_FSM_CHANGE";
    private final Object[] parameters;

    public OnPrivacyFsmChangeEvent(String str) {
        this.parameters = new Object[]{str};
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
