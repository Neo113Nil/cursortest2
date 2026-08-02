package com.fyber.inneractive.sdk.activities;

import android.view.View;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes12.dex */
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
            this.a.e.getUrl();
        }
    }
}
