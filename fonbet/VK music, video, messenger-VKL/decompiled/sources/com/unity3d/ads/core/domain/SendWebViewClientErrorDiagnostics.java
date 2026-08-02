package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.data.model.AdObject;
import java.util.List;

/* compiled from: SendWebViewClientErrorDiagnostics.kt */
/* loaded from: classes14.dex */
public interface SendWebViewClientErrorDiagnostics {
    void invoke(List<WebViewClientError> list, AdObject adObject);
}
