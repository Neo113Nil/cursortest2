package com.zoho.livechat.android.ui.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;

/* loaded from: classes4.dex */
public class ArticleWebView extends WebView {

    public interface a {
    }

    public ArticleWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public a getOnScrollChangedCallback() {
        return null;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
    }

    public void setOnScrollChangedCallback(a aVar) {
    }
}
