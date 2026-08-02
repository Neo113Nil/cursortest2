package ru.ozon.app.android.storefront.widgets.cms.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.storefront.widgets.cms.webview.view.AspectRatioWebView;

/* loaded from: classes2.dex */
public final class WebViewWidgetBinding implements a {

    @NonNull
    private final AspectRatioWebView rootView;

    @NonNull
    public final AspectRatioWebView webViewWidget;

    private WebViewWidgetBinding(@NonNull AspectRatioWebView aspectRatioWebView, @NonNull AspectRatioWebView aspectRatioWebView2) {
        this.rootView = aspectRatioWebView;
        this.webViewWidget = aspectRatioWebView2;
    }

    @NonNull
    public static WebViewWidgetBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        AspectRatioWebView aspectRatioWebView = (AspectRatioWebView) view;
        return new WebViewWidgetBinding(aspectRatioWebView, aspectRatioWebView);
    }

    @Override // X4.a
    @NonNull
    public AspectRatioWebView getRoot() {
        return this.rootView;
    }
}
