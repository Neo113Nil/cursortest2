package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.webkit.WebView;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʰ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0301 extends AbstractC1026 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1026 f554;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1026 f555;

    public C0301(C1102 c1102, AbstractC1026 abstractC1026, AbstractC1026 abstractC10262) {
        this.f555 = abstractC1026;
        this.f554 = abstractC10262;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1026
    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void mo106(JSONObject jSONObject, WebView webView, Activity activity) {
        this.f555.mo106(jSONObject, webView, activity);
        AbstractC1008.m611(new C1128(this.f554, jSONObject, webView, activity));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1026
    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void mo94(JSONObject jSONObject, WebView webView, Activity activity) {
        this.f555.mo94(jSONObject, webView, activity);
        AbstractC1008.m611(new C1153(this.f554, jSONObject, webView, activity));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1026
    /* renamed from: ｋ, reason: contains not printable characters */
    public final void mo105(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
        this.f555.mo105(jSONObject, webView, obj, activity);
        AbstractC1008.m611(new C1107(this.f554, jSONObject, webView, (C3986y) obj, activity));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1026
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void mo181(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
        this.f555.mo181(jSONObject, webView, obj, activity);
        AbstractC1008.m611(new C0272(this.f554, jSONObject, webView, (D) obj, activity));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1026
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo183(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
        this.f555.mo183(jSONObject, webView, obj, activity);
        AbstractC1008.m611(new C0281(this.f554, jSONObject, webView, (D) obj, activity));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1026
    /* renamed from: ｋ, reason: contains not printable characters */
    public final void mo96(JSONObject jSONObject, WebView webView, Activity activity) {
        this.f555.mo96(jSONObject, webView, activity);
        AbstractC1008.m611(new C0253(this.f554, jSONObject, webView, activity));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1026
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void mo98(JSONObject jSONObject, WebView webView, Activity activity) {
        this.f555.mo98(jSONObject, webView, activity);
        AbstractC1008.m611(new C0256(this.f554, jSONObject, webView, activity));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1026
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo101(JSONObject jSONObject, WebView webView, Activity activity) {
        this.f555.mo101(jSONObject, webView, activity);
        AbstractC1008.m611(new C0270(this.f554, jSONObject, webView, activity));
    }
}
