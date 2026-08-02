package ru.ozon.app.android.fresh.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;

/* loaded from: classes12.dex */
public final class WidgetFooterLayoutExpressBinding implements a {

    @NonNull
    public final LinearLayout footerBtnContainer;

    @NonNull
    public final LargeBorderlessButtonView footerLbv;

    @NonNull
    private final LinearLayout rootView;

    private WidgetFooterLayoutExpressBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LargeBorderlessButtonView largeBorderlessButtonView) {
        this.rootView = linearLayout;
        this.footerBtnContainer = linearLayout2;
        this.footerLbv = largeBorderlessButtonView;
    }

    @NonNull
    public static WidgetFooterLayoutExpressBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R$id.footerLbv;
        LargeBorderlessButtonView largeBorderlessButtonView = (LargeBorderlessButtonView) C2548q.d(i11, view);
        if (largeBorderlessButtonView != null) {
            return new WidgetFooterLayoutExpressBinding(linearLayout, linearLayout, largeBorderlessButtonView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
