package com.iab.omid.library.vungle.attestation;

import android.webkit.WebView;
import androidx.webkit.WebViewFeature;

/* loaded from: classes8.dex */
public class g {
    public static boolean a(WebView webView) {
        try {
            if (!WebViewFeature.isFeatureSupported("WEB_MESSAGE_LISTENER") || !c.a(com.iab.omid.library.vungle.internal.g.b().a()).b()) {
                return false;
            }
            f.a(webView);
            return true;
        } catch (Exception e) {
            com.iab.omid.library.vungle.utils.d.a("Error during initialization of AttestationMessageListener", e);
            return false;
        } catch (NoClassDefFoundError unused) {
            com.iab.omid.library.vungle.utils.d.a("androidx.webkit not available, skipping attestation listener initialization");
            return false;
        }
    }
}
