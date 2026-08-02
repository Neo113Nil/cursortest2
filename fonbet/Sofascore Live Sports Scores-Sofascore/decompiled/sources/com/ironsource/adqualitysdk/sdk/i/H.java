package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class H extends AbstractRunnableC0606 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ I f86;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ WebView f87;

    public H(I i, WebView webView) {
        this.f86 = i;
        this.f87 = webView;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        String str;
        JSONObject jSONObject;
        I i = this.f86;
        i.getClass();
        String str2 = I.f88.f83;
        try {
            String decrypt = StringFog.decrypt("DxXheIpxK0oLGOlkn3opUxET9Q==\n", "VE6oNsA0aB4=\n");
            C0555 c0555 = ((C0346) AbstractC0274.m142()).f857;
            synchronized (c0555) {
                jSONObject = c0555.f3206;
            }
            String replace = str2.replace(decrypt, jSONObject.optString(StringFog.decrypt("uiUE\n", "0Exq2mvPsnA=\n"), c0555.f1823)).replace(StringFog.decrypt("t4O+HbJ7jMezkq4Pog==\n", "7Nj9Uv82w4k=\n"), I.f88.f82);
            str = (i.f90 ? replace.replace(StringFog.decrypt("abwDe+Ze9FJ4tBt+\n", "MudGI7IMtQ0=\n"), I.f88.f81) : replace.replace(StringFog.decrypt("HhT5vDc+yUMPHOG5\n", "RU+85GNsiBw=\n"), "")).replace(StringFog.decrypt("12zXGhxSMK7YeMYKGE8osA==\n", "jDeUVVIcde0=\n"), i.f91);
        } catch (Throwable th) {
            AbstractC0420.m243(I.f89, StringFog.decrypt("nlbbU0VTyuv7Q8xIfQD36pJKw1lUB5ml\n", "2ySpPDdzo4U=\n") + th.getLocalizedMessage());
            str = str2;
        }
        AbstractC1008.m610(new G(this, AbstractC0728.m412(str.getBytes())));
    }
}
