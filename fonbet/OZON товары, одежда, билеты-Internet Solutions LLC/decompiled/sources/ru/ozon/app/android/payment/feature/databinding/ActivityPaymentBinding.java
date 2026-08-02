package ru.ozon.app.android.payment.feature.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import ru.ozon.app.android.payment.feature.R$id;
import ru.ozon.app.android.payment.feature.R$layout;
import ru.ozon.app.android.web.webview.OzonWebView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes13.dex */
public final class ActivityPaymentBinding implements a {

    @NonNull
    public final IconButtonV3View close;

    @NonNull
    public final LinearLayout container;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextAtomV2View title;

    @NonNull
    public final FrameLayout titleContainer;

    @NonNull
    public final Toolbar toolbar;

    @NonNull
    public final OzonWebView webView;

    private ActivityPaymentBinding(@NonNull LinearLayout linearLayout, @NonNull IconButtonV3View iconButtonV3View, @NonNull LinearLayout linearLayout2, @NonNull TextAtomV2View textAtomV2View, @NonNull FrameLayout frameLayout, @NonNull Toolbar toolbar, @NonNull OzonWebView ozonWebView) {
        this.rootView = linearLayout;
        this.close = iconButtonV3View;
        this.container = linearLayout2;
        this.title = textAtomV2View;
        this.titleContainer = frameLayout;
        this.toolbar = toolbar;
        this.webView = ozonWebView;
    }

    @NonNull
    public static ActivityPaymentBinding bind(@NonNull View view) {
        int i11 = R$id.close;
        IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
        if (iconButtonV3View != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i11 = R$id.title;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                i11 = R$id.titleContainer;
                FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                if (frameLayout != null) {
                    i11 = R$id.toolbar;
                    Toolbar toolbar = (Toolbar) C2548q.d(i11, view);
                    if (toolbar != null) {
                        i11 = R$id.webView;
                        OzonWebView ozonWebView = (OzonWebView) C2548q.d(i11, view);
                        if (ozonWebView != null) {
                            return new ActivityPaymentBinding(linearLayout, iconButtonV3View, linearLayout, textAtomV2View, frameLayout, toolbar, ozonWebView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ActivityPaymentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityPaymentBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.activity_payment, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
