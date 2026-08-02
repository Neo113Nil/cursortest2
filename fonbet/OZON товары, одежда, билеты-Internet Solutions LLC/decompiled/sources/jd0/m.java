package jd0;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* loaded from: classes3.dex */
public final class m extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7355h f69791a;

    m(C7355h c7355h) {
        this.f69791a = c7355h;
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        this.f69791a.z().k0(str);
    }
}
