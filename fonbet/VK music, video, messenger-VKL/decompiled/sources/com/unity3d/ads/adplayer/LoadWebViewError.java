package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.WebViewClientError;
import java.util.List;

/* compiled from: AdPlayerError.kt */
/* loaded from: classes14.dex */
public final class LoadWebViewError extends AdPlayerError {
    private final List<WebViewClientError> errors;

    public LoadWebViewError(List<WebViewClientError> list) {
        super("AdPlayer was not able to load the webview.", null);
        this.errors = list;
    }

    public final List<WebViewClientError> getErrors() {
        return this.errors;
    }
}
