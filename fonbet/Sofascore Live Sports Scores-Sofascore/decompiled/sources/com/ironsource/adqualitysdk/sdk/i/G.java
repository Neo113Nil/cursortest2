package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class G extends AbstractRunnableC0606 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ H f84;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f85;

    public G(H h, String str) {
        this.f84 = h;
        this.f85 = str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo58() {
        WebView webView = this.f84.f87;
        String str = this.f85;
        String str2 = W.f112;
        if (webView != null) {
            if (webView.getHandler() == null && webView.getRootView() == null) {
                return;
            }
            StringBuilder m642 = AbstractC1072.m642("1sqJIoS3jArM38UmgbWSS93fkCHf9g==\n", "vKv/Q/fU/mM=\n", new StringBuilder(), str);
            m642.append(StringFog.decrypt("T7/UPw==\n", "bZb9BJ9mi5U=\n"));
            webView.loadUrl(m642.toString());
        }
    }
}
