package com.iab.omid.library.bigosg.attestation;

import android.webkit.WebView;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class f implements com.iab.omid.library.bigosg.messagelistener.b {
    private final com.iab.omid.library.bigosg.messagelistener.a a;

    private f(WebView webView) {
        com.iab.omid.library.bigosg.messagelistener.a aVar = new com.iab.omid.library.bigosg.messagelistener.a(webView, this);
        this.a = aVar;
        aVar.a();
    }

    public static f a(WebView webView) {
        return new f(webView);
    }

    @Override // com.iab.omid.library.bigosg.messagelistener.b
    public String getListenerName() {
        return "omidJsAttestationListener";
    }

    @Override // com.iab.omid.library.bigosg.messagelistener.b
    public void onMessageReceived(String str, JSONObject jSONObject) {
        if ("attest".equals(str)) {
            a(jSONObject);
        } else {
            com.iab.omid.library.bigosg.utils.d.b("Unexpected method in AttestationMessageListener: ".concat(String.valueOf(str)));
        }
    }

    @Override // com.iab.omid.library.bigosg.messagelistener.b
    public void onWebMessageListenerUnsupported() {
        com.iab.omid.library.bigosg.utils.d.b("The Attestation Webview Listener cannot be supported in this WebView version.");
    }

    private void a(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("mechanism");
            String string2 = jSONObject.getString("version");
            Map<String, String> b = com.iab.omid.library.bigosg.utils.c.b(jSONObject.getJSONObject("attestationArgs"));
            b.put("version", string2);
            e.a(com.iab.omid.library.bigosg.internal.g.b().a().getApplicationContext(), string, new a(b));
        } catch (Exception e) {
            com.iab.omid.library.bigosg.utils.d.a("Error processing attestation request", e);
        }
    }
}
