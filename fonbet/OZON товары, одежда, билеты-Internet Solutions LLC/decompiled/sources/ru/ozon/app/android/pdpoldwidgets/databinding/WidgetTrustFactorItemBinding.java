package ru.ozon.app.android.pdpoldwidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.pdpoldwidgets.R$id;
import ru.ozon.app.android.pdpoldwidgets.R$layout;

/* loaded from: classes13.dex */
public final class WidgetTrustFactorItemBinding implements a {

    @NonNull
    public final TextView descriptionTv;

    @NonNull
    public final ImageView iconIv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView titleTv;

    @NonNull
    public final ConstraintLayout trustFactorsItemCl;

    private WidgetTrustFactorItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.descriptionTv = textView;
        this.iconIv = imageView;
        this.titleTv = textView2;
        this.trustFactorsItemCl = constraintLayout2;
    }

    @NonNull
    public static WidgetTrustFactorItemBinding bind(@NonNull View view) {
        int i11 = R$id.descriptionTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.iconIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.titleTv;
                TextView textView2 = (TextView) C2548q.d(i11, view);
                if (textView2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    return new WidgetTrustFactorItemBinding(constraintLayout, textView, imageView, textView2, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetTrustFactorItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_trust_factor_item, viewGroup, false);
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
