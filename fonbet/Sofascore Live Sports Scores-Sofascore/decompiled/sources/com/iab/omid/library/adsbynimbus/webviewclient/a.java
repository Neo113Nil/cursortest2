package com.iab.omid.library.adsbynimbus.webviewclient;

import android.net.Uri;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.iab.omid.library.adsbynimbus.attestation.c;
import com.iab.omid.library.adsbynimbus.internal.g;
import com.iab.omid.library.adsbynimbus.internal.j;

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
