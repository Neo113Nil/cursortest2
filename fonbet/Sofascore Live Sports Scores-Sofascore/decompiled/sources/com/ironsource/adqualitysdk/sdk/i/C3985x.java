package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3985x extends AbstractRunnableC0606 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C3986y f277;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ boolean f278;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ String f279;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ WebView f280;

    public C3985x(C3986y c3986y, WebView webView, String str, boolean z) {
        this.f277 = c3986y;
        this.f280 = webView;
        this.f279 = str;
        this.f278 = z;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        AbstractC1008.m614(new C3984w(this, this.f280.getOriginalUrl(), this.f277.f281.mo54(this.f280)));
    }
}
