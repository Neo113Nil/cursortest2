package com.iab.omid.library.vungle.webviewclient;

import android.net.Uri;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.iab.omid.library.vungle.attestation.c;
import com.iab.omid.library.vungle.internal.g;
import com.iab.omid.library.vungle.internal.j;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a {
    public static boolean a(String str) {
        if (str != null && str.startsWith("omid-native")) {
            try {
                Uri parse = Uri.parse(str);
                if ("omid-native".equals(parse.getScheme())) {
                    j.b(parse);
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static void a(@NonNull WebView webView) {
        if (c.a(g.b().a()).b()) {
            webView.setWebViewClient(new b(webView.getWebViewClient()));
        }
    }
}
