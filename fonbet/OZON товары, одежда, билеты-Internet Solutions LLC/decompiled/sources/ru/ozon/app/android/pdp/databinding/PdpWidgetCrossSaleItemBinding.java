package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.R$layout;

/* loaded from: classes13.dex */
public final class PdpWidgetCrossSaleItemBinding implements a {

    @NonNull
    public final Flow containerFlow;

    @NonNull
    public final ImageView disclosureIv;

    @NonNull
    public final ConstraintLayout itemCrossaleCl;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView subtitleTv;

    @NonNull
    public final TextView titleTv;

    private PdpWidgetCrossSaleItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Flow flow, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.containerFlow = flow;
        this.disclosureIv = imageView;
        this.itemCrossaleCl = constraintLayout2;
        this.subtitleTv = textView;
        this.titleTv = textView2;
    }

    @NonNull
    public static PdpWidgetCrossSaleItemBinding bind(@NonNull View view) {
        int i11 = R$id.containerFlow;
        Flow flow = (Flow) C2548q.d(i11, view);
        if (flow != null) {
            i11 = R$id.disclosureIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R$id.subtitleTv;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    i11 = R$id.titleTv;
                    TextView textView2 = (TextView) C2548q.d(i11, view);
                    if (textView2 != null) {
                        return new PdpWidgetCrossSaleItemBinding(constraintLayout, flow, imageView, constraintLayout, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static PdpWidgetCrossSaleItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.pdp_widget_cross_sale_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
