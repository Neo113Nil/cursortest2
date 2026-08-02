package com.iab.omid.library.bigosg.webviewclient;

import android.net.Uri;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.iab.omid.library.bigosg.attestation.c;
import com.iab.omid.library.bigosg.internal.g;
import com.iab.omid.library.bigosg.internal.j;

/* loaded from: classes13.dex */
public class a {
    public static void a(@NonNull WebView webView) {
        if (c.a(g.b().a()).b()) {
            webView.setWebViewClient(new b(webView.getWebViewClient()));
        }
    }

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
}
