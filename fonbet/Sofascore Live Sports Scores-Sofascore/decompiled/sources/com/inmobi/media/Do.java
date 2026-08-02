package com.inmobi.media;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.ironsource.C4094gc;
import defpackage.td4;
import java.net.URLDecoder;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class Do {
    public static WebResourceResponse a(String str, InterfaceC3880x9 interfaceC3880x9) {
        String str2;
        str.getClass();
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("IMResourceCacheManager", "shouldInterceptRequest ".concat(str));
        }
        try {
            str2 = URLDecoder.decode(StringsKt.l0(str).toString(), com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
        } catch (Exception unused) {
            str2 = null;
        }
        if (str2 != null) {
            if (StringsKt.J(str2, "inmobicache=true", false)) {
                return (WebResourceResponse) td4.t0(kotlin.coroutines.g.a, new Co(str2, interfaceC3880x9, null));
            }
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).a("IMResourceCacheManager", "Cache is not enabled for URL: ".concat(str2));
            }
        }
        return null;
    }

    public static WebResourceResponse a(WebResourceRequest webResourceRequest, InterfaceC3880x9 interfaceC3880x9) {
        webResourceRequest.getClass();
        webResourceRequest.getClass();
        if (!C4094gc.a.equalsIgnoreCase(webResourceRequest.getMethod())) {
            return null;
        }
        String uri = webResourceRequest.getUrl().toString();
        uri.getClass();
        return a(uri, interfaceC3880x9);
    }
}
