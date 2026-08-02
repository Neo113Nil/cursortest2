package com.iab.omid.library.adsbynimbus.attestation;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import defpackage.y0l;

/* loaded from: classes4.dex */
public class g {
    public static boolean a(@NonNull WebView webView) {
        try {
            if (!y0l.b("WEB_MESSAGE_LISTENER") || !c.a(com.iab.omid.library.adsbynimbus.internal.g.b().a()).b()) {
                return false;
            }
            f.a(webView);
            return true;
        } catch (Exception e) {
            com.iab.omid.library.adsbynimbus.utils.d.a("Error during initialization of AttestationMessageListener", e);
            return false;
        } catch (NoClassDefFoundError unused) {
            com.iab.omid.library.adsbynimbus.utils.d.a("androidx.webkit not available, skipping attestation listener initialization");
            return false;
        }
    }
}
