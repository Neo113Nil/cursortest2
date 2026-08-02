package com.iab.omid.library.vungle.attestation;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import defpackage.y0l;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class g {
    public static boolean a(@NonNull WebView webView) {
        try {
            if (!y0l.b("WEB_MESSAGE_LISTENER") || !c.a(com.iab.omid.library.vungle.internal.g.b().a()).b()) {
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
