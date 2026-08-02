package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3986y implements InterfaceC0705 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ AbstractViewOnLayoutChangeListenerC3987z f281;

    public C3986y(AbstractViewOnLayoutChangeListenerC3987z abstractViewOnLayoutChangeListenerC3987z) {
        this.f281 = abstractViewOnLayoutChangeListenerC3987z;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0705
    /* renamed from: ﾒ */
    public final void mo62(WebView webView, String str, String str2) {
        WeakReference weakReference;
        String substring = str2.substring(0, str2.indexOf(63));
        String substring2 = str2.substring(str2.indexOf(63) + 1);
        if (substring.equals(StringFog.decrypt("oITAigiI\n", "0/Ci6Wntb9I=\n"))) {
            this.f281.m124(webView);
            return;
        }
        if (substring.equals(StringFog.decrypt("pwAuCA07\n", "1HRMa2xZssM=\n"))) {
            JSONObject m123 = AbstractViewOnLayoutChangeListenerC3987z.m123(this.f281, substring2);
            AbstractViewOnLayoutChangeListenerC3987z abstractViewOnLayoutChangeListenerC3987z = this.f281;
            abstractViewOnLayoutChangeListenerC3987z.mo98(m123, webView, abstractViewOnLayoutChangeListenerC3987z.mo54(webView));
            return;
        }
        if (substring.equals(StringFog.decrypt("3hLE6Jsq\n", "rWami/pLWuI=\n"))) {
            JSONObject m1232 = AbstractViewOnLayoutChangeListenerC3987z.m123(this.f281, substring2);
            AbstractViewOnLayoutChangeListenerC3987z abstractViewOnLayoutChangeListenerC3987z2 = this.f281;
            L l = abstractViewOnLayoutChangeListenerC3987z2.f286;
            abstractViewOnLayoutChangeListenerC3987z2.mo100(m1232, webView, (l == null || (weakReference = l.f100.f77) == null) ? null : (D) weakReference.get(), this.f281.mo54(webView));
            return;
        }
        if (substring.equals(StringFog.decrypt("F3UejRvW\n", "ZAF87nq1LPg=\n"))) {
            JSONObject m1233 = AbstractViewOnLayoutChangeListenerC3987z.m123(this.f281, substring2);
            m1233.remove(AbstractC0615.f2034);
            AbstractViewOnLayoutChangeListenerC3987z abstractViewOnLayoutChangeListenerC3987z3 = this.f281;
            abstractViewOnLayoutChangeListenerC3987z3.mo94(m1233, webView, abstractViewOnLayoutChangeListenerC3987z3.mo54(webView));
            return;
        }
        if (substring.equals(StringFog.decrypt("H+SCHZEE\n", "bJDgfvBgwlA=\n"))) {
            JSONObject m1234 = AbstractViewOnLayoutChangeListenerC3987z.m123(this.f281, substring2);
            try {
                AbstractC0356.m202(m1234.optString(StringFog.decrypt("bq4f\n", "Gs942TU8e8Y=\n")), m1234.optString(StringFog.decrypt("xoz2b2U=\n", "o/6bHAKYgXo=\n")), m1234.optString(StringFog.decrypt("Eh/ryjnx\n", "d22IpV2UMoE=\n")), m1234.optString(StringFog.decrypt("yOlp/FQ=\n", "rZsaiD+nV1E=\n")));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0705
    /* renamed from: ﾒ */
    public final void mo63(WebView webView, String str, boolean z) {
        AbstractC1008.m614(new C3983v(this, webView, str, z));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0705
    /* renamed from: ﾒ */
    public final void mo60(WebView webView) {
        this.f281.m124(webView);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0705
    /* renamed from: ﾒ */
    public final void mo61(WebView webView, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AbstractC0615.f2030, str);
            jSONObject.put(AbstractC0615.f2029, AbstractC0615.f2028);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractC0615.f2031, jSONObject);
            AbstractViewOnLayoutChangeListenerC3987z abstractViewOnLayoutChangeListenerC3987z = this.f281;
            abstractViewOnLayoutChangeListenerC3987z.mo105(jSONObject2, webView, this, abstractViewOnLayoutChangeListenerC3987z.mo54(webView));
        } catch (Exception e) {
            AbstractC0356.m204(StringFog.decrypt("K+uuAVqphWsYxq05V6CXWA==\n", "fI7MVzPM8io=\n"), StringFog.decrypt("iCbPQosTwuioNclEl1SB7a43nUiPVs/u7T7OQpc=\n", "zVS9LfkzoZo=\n"), (Throwable) e, false);
        }
    }
}
