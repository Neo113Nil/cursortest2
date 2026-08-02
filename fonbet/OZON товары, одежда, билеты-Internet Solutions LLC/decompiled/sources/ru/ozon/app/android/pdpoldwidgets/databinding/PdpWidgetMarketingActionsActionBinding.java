package ru.ozon.app.android.pdpoldwidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.pdpoldwidgets.R$id;
import ru.ozon.app.android.pdpoldwidgets.R$layout;

/* loaded from: classes13.dex */
public final class PdpWidgetMarketingActionsActionBinding implements a {

    @NonNull
    public final View colorV;

    @NonNull
    public final TextView linkTv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView subTitleTv;

    @NonNull
    public final TextView titleTv;

    private PdpWidgetMarketingActionsActionBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = constraintLayout;
        this.colorV = view;
        this.linkTv = textView;
        this.subTitleTv = textView2;
        this.titleTv = textView3;
    }

    @NonNull
    public static PdpWidgetMarketingActionsActionBinding bind(@NonNull View view) {
        int i11 = R$id.colorV;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.linkTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.subTitleTv;
                TextView textView2 = (TextView) C2548q.d(i11, view);
                if (textView2 != null) {
                    i11 = R$id.titleTv;
                    TextView textView3 = (TextView) C2548q.d(i11, view);
                    if (textView3 != null) {
                        return new PdpWidgetMarketingActionsActionBinding((ConstraintLayout) view, d11, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static PdpWidgetMarketingActionsActionBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.pdp_widget_marketing_actions_action, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
