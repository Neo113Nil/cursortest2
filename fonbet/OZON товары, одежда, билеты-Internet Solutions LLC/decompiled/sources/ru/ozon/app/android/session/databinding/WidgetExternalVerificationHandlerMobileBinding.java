package ru.ozon.app.android.session.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.session.R$layout;
import ru.ozon.app.android.web.webview.OzonWebView;

/* loaded from: classes2.dex */
public final class WidgetExternalVerificationHandlerMobileBinding implements a {

    @NonNull
    public final OzonWebView externalVerificationHandlerMobileWidget;

    @NonNull
    private final OzonWebView rootView;

    private WidgetExternalVerificationHandlerMobileBinding(@NonNull OzonWebView ozonWebView, @NonNull OzonWebView ozonWebView2) {
        this.rootView = ozonWebView;
        this.externalVerificationHandlerMobileWidget = ozonWebView2;
    }

    @NonNull
    public static WidgetExternalVerificationHandlerMobileBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        OzonWebView ozonWebView = (OzonWebView) view;
        return new WidgetExternalVerificationHandlerMobileBinding(ozonWebView, ozonWebView);
    }

    @NonNull
    public static WidgetExternalVerificationHandlerMobileBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_external_verification_handler_mobile, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public OzonWebView getConstraintLayout() {
        return this.rootView;
    }
}
