package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import defpackage.mz1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class lo {
    public static String pcc(WebView webView, int i) {
        if (webView == null) {
            return "";
        }
        String userAgentString = webView.getSettings().getUserAgentString();
        return TextUtils.isEmpty(userAgentString) ? "" : mz1.j(i, userAgentString, " open_news open_news_u_s/");
    }

    public static void pcc(Uri uri, com.bytedance.sdk.openadsdk.core.mu muVar) {
        if (muVar == null || !muVar.pcc(uri)) {
            return;
        }
        try {
            muVar.sf(uri);
        } catch (Exception e) {
            e.toString();
        }
    }
}
