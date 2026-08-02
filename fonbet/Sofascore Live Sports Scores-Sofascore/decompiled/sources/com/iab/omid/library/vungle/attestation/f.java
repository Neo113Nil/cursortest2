package com.iab.omid.library.vungle.attestation;

import android.webkit.WebView;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class f implements com.iab.omid.library.vungle.messagelistener.b {
    private final com.iab.omid.library.vungle.messagelistener.a a;

    private f(WebView webView) {
        com.iab.omid.library.vungle.messagelistener.a aVar = new com.iab.omid.library.vungle.messagelistener.a(webView, this);
        this.a = aVar;
        aVar.a();
    }

    private void a(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("mechanism");
            String string2 = jSONObject.getString("version");
            Map<String, String> b = com.iab.omid.library.vungle.utils.c.b(jSONObject.getJSONObject("attestationArgs"));
            b.put("version", string2);
            e.a(com.iab.omid.library.vungle.internal.g.b().a().getApplicationContext(), string, new a(b));
        } catch (Exception e) {
            com.iab.omid.library.vungle.utils.d.a("Error processing attestation request", e);
        }
    }

    @Override // com.iab.omid.library.vungle.messagelistener.b
    public String getListenerName() {
        return "omidJsAttestationListener";
    }

    @Override // com.iab.omid.library.vungle.messagelistener.b
    public void onMessageReceived(String str, JSONObject jSONObject) {
        if ("attest".equals(str)) {
            a(jSONObject);
            return;
        }
        com.iab.omid.library.vungle.utils.d.b("Unexpected method in AttestationMessageListener: " + str);
    }

    @Override // com.iab.omid.library.vungle.messagelistener.b
    public void onWebMessageListenerUnsupported() {
        com.iab.omid.library.vungle.utils.d.b("The Attestation Webview Listener cannot be supported in this WebView version.");
    }

    public static f a(WebView webView) {
        return new f(webView);
    }
}
