package com.inmobi.media;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import defpackage.tub;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class No {
    public static boolean a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail, String str) {
        webView.getClass();
        str.getClass();
        LinkedHashMap i = tub.i(new Pair("source", str), new Pair("isCrashed", Boolean.valueOf(renderProcessGoneDetail != null ? renderProcessGoneDetail.didCrash() : false)));
        C3839vk c3839vk = C3839vk.a;
        C3839vk.b("WebViewRenderProcessGoneEvent", i, EnumC3943zk.SDK);
        webView.destroy();
        return true;
    }
}
