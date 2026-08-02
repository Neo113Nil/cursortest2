package com.playtika.pras.sdk.views;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import com.playtika.pras.sdk.R;

/* loaded from: classes6.dex */
public final class a implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ BaseWebViewContainer b;

    public a(BaseWebViewContainer baseWebViewContainer, View view) {
        this.b = baseWebViewContainer;
        this.a = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Boolean bool;
        bool = this.b.scrollWebViewKeyboardEnabled;
        if (bool.booleanValue()) {
            Rect rect = new Rect();
            this.b.mWebView.getWindowVisibleDisplayFrame(rect);
            int height = this.b.mWebView.getRootView().getHeight();
            int i = height - rect.bottom;
            if (i > height * 0.15d) {
                ScrollView scrollView = (ScrollView) this.a.findViewById(R.id.web_view_container);
                scrollView.post(new com.playtika.pras.e.c(scrollView, i));
            }
        }
    }
}
