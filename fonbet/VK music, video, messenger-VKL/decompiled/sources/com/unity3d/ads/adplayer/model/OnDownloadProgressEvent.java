package com.unity3d.ads.adplayer.model;

/* compiled from: WebViewEvent.kt */
/* loaded from: classes14.dex */
public final class OnDownloadProgressEvent implements WebViewEvent {
    private final String category = "ADVIEWER";
    private final String name = "ON_DOWNLOAD_PROGRESS";
    private final Object[] parameters;

    public OnDownloadProgressEvent(String str, Integer num, long j, Long l, boolean z, String str2, String str3) {
        this.parameters = new Object[]{str, num, Long.valueOf(j), l, Boolean.valueOf(z), str2, str3};
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
