package com.inmobi.media;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Di extends WebViewRenderProcessClient {
    public final InterfaceC3880x9 a;
    public final Hi b;

    public Di(InterfaceC3880x9 interfaceC3880x9, Hi hi) {
        this.a = interfaceC3880x9;
        this.b = hi;
    }

    public final void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        Xh xh;
        webView.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("RenderViewRenderProcessClient", "onRenderProcessResponsive " + webView + " " + webViewRenderProcess);
        }
        Hi hi = this.b;
        if (hi != null) {
            Map a = hi.a();
            a.put("creativeId", hi.a.g);
            int i = hi.e + 1;
            hi.e = i;
            a.put("count", Integer.valueOf(i));
            String a2 = hi.a("RenderProcessResponsive");
            C3839vk c3839vk = C3839vk.a;
            C3839vk.b(a2, a, EnumC3943zk.SDK);
        }
        InterfaceC3880x9 interfaceC3880x92 = this.a;
        if (interfaceC3880x92 == null || (xh = ((C3906y9) interfaceC3880x92).a) == null) {
            return;
        }
        xh.a();
    }

    public final void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        Xh xh;
        webView.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("RenderViewRenderProcessClient", "onRenderProcessUnresponsive " + webView + " " + webViewRenderProcess);
        }
        Hi hi = this.b;
        if (hi != null) {
            Map a = hi.a();
            a.put("creativeId", hi.a.g);
            int i = hi.d + 1;
            hi.d = i;
            a.put("count", Integer.valueOf(i));
            String a2 = hi.a("RenderProcessUnResponsive");
            C3839vk c3839vk = C3839vk.a;
            C3839vk.b(a2, a, EnumC3943zk.SDK);
        }
        InterfaceC3880x9 interfaceC3880x92 = this.a;
        if (interfaceC3880x92 == null || (xh = ((C3906y9) interfaceC3880x92).a) == null) {
            return;
        }
        xh.a();
    }
}
