package ru.ozon.app.android.pdpoldwidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.pdpoldwidgets.R$id;
import ru.ozon.app.android.pdpoldwidgets.R$layout;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes13.dex */
public final class PdpWidgetComparisonCarouselEmptyItemBinding implements a {

    @NonNull
    public final ConstraintLayout compareProductsEmptyStateCL;

    @NonNull
    public final SingleAtom emptyStateButtonSA;

    @NonNull
    public final ImageView emptyStateImageIV;

    @NonNull
    private final ConstraintLayout rootView;

    private PdpWidgetComparisonCarouselEmptyItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull SingleAtom singleAtom, @NonNull ImageView imageView) {
        this.rootView = constraintLayout;
        this.compareProductsEmptyStateCL = constraintLayout2;
        this.emptyStateButtonSA = singleAtom;
        this.emptyStateImageIV = imageView;
    }

    @NonNull
    public static PdpWidgetComparisonCarouselEmptyItemBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.emptyStateButtonSA;
        SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
        if (singleAtom != null) {
            i11 = R$id.emptyStateImageIV;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                return new PdpWidgetComparisonCarouselEmptyItemBinding(constraintLayout, constraintLayout, singleAtom, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static PdpWidgetComparisonCarouselEmptyItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.pdp_widget_comparison_carousel_empty_item, viewGroup, false);
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
