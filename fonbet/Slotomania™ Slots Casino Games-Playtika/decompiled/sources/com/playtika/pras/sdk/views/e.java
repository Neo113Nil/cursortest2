package com.playtika.pras.sdk.views;

/* loaded from: classes6.dex */
public final class e implements Runnable {
    public final /* synthetic */ com.playtika.pras.e.f a;

    public e(com.playtika.pras.e.f fVar) {
        this.a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        BaseWebViewContainer baseWebViewContainer = this.a.a;
        if (baseWebViewContainer.mWebView != null) {
            str = baseWebViewContainer.widgetLoadUrl;
            if (str != null) {
                this.a.a.mWebView.stopLoading();
                this.a.a.mWebView.clearCache(true);
                this.a.a.mWebView.clearHistory();
                BaseWebViewContainer baseWebViewContainer2 = this.a.a;
                str2 = baseWebViewContainer2.widgetLoadUrl;
                baseWebViewContainer2.load(str2);
            }
        }
    }
}
