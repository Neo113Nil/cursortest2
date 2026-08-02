package com.fyber.inneractive.sdk.activities;

import android.view.View;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class l implements View.OnClickListener {
    public final /* synthetic */ InneractiveInternalBrowserActivity a;

    public l(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView = this.a.e;
        if (webView != null) {
            webView.reload();
            int i = IAlog.a;
            IAlog.d("%s %s", "AD_INTERNAL_BROWSER_REFRESH", this.a.e.getUrl());
        }
    }
}
