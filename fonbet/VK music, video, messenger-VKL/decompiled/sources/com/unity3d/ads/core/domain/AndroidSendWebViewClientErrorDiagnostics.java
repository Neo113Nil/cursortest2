package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import xsna.dt;
import xsna.pn00;

/* compiled from: AndroidSendWebViewClientErrorDiagnostics.kt */
/* loaded from: classes14.dex */
public final class AndroidSendWebViewClientErrorDiagnostics implements SendWebViewClientErrorDiagnostics {
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidSendWebViewClientErrorDiagnostics(SendDiagnosticEvent sendDiagnosticEvent) {
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    @Override // com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics
    public void invoke(List<WebViewClientError> list, AdObject adObject) {
        for (WebViewClientError webViewClientError : list) {
            String url = webViewClientError.getUrl();
            Map b = (url == null || url.length() == 0) ? null : dt.b("webview_url", webViewClientError.getUrl());
            LinkedHashMap m = pn00.m(new Pair("reason", Integer.valueOf(webViewClientError.getReason().getCode())));
            if (webViewClientError.getStatusCode() != null) {
                m.put("webview_error_code", webViewClientError.getStatusCode());
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "webview_error", (Double) null, b, m, adObject, (Integer) null, (ByteString) null, 98, (Object) null);
        }
    }
}
