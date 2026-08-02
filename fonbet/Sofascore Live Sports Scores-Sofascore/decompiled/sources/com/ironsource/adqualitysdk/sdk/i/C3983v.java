package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3983v extends AbstractRunnableC0606 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C3986y f270;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ boolean f271;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ String f272;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ WebView f273;

    public C3983v(C3986y c3986y, WebView webView, String str, boolean z) {
        this.f270 = c3986y;
        this.f273 = webView;
        this.f272 = str;
        this.f271 = z;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        AbstractViewOnLayoutChangeListenerC3987z abstractViewOnLayoutChangeListenerC3987z = this.f270.f281;
        if (abstractViewOnLayoutChangeListenerC3987z.f287) {
            List list = abstractViewOnLayoutChangeListenerC3987z.f290;
            if (list == null || list.isEmpty()) {
                C3986y c3986y = this.f270;
                WebView webView = this.f273;
                String str = this.f272;
                boolean z = this.f271;
                c3986y.getClass();
                AbstractC1008.m612(new C3985x(c3986y, webView, str, z));
                return;
            }
            Iterator it = this.f270.f281.f290.iterator();
            while (it.hasNext()) {
                if (this.f272.startsWith((String) it.next())) {
                    C3986y c3986y2 = this.f270;
                    WebView webView2 = this.f273;
                    String str2 = this.f272;
                    boolean z2 = this.f271;
                    c3986y2.getClass();
                    AbstractC1008.m612(new C3985x(c3986y2, webView2, str2, z2));
                    return;
                }
            }
        }
    }
}
