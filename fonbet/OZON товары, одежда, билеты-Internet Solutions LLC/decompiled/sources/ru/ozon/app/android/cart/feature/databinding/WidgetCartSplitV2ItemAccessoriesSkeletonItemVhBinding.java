package ru.ozon.app.android.cart.feature.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.cart.feature.R$id;
import ru.ozon.app.android.cart.feature.R$layout;

/* loaded from: classes11.dex */
public final class WidgetCartSplitV2ItemAccessoriesSkeletonItemVhBinding implements a {

    @NonNull
    public final View buttonPlaceHolder;

    @NonNull
    public final ConstraintLayout container;

    @NonNull
    public final View imagePlaceHolder;

    @NonNull
    public final View line1PlaceHolder;

    @NonNull
    public final View line2PlaceHolder;

    @NonNull
    public final View line3PlaceHolder;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetCartSplitV2ItemAccessoriesSkeletonItemVhBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull ConstraintLayout constraintLayout2, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull View view5) {
        this.rootView = constraintLayout;
        this.buttonPlaceHolder = view;
        this.container = constraintLayout2;
        this.imagePlaceHolder = view2;
        this.line1PlaceHolder = view3;
        this.line2PlaceHolder = view4;
        this.line3PlaceHolder = view5;
    }

    @NonNull
    public static WidgetCartSplitV2ItemAccessoriesSkeletonItemVhBinding bind(@NonNull View view) {
        View d11;
        View d12;
        View d13;
        int i11 = R$id.buttonPlaceHolder;
        View d14 = C2548q.d(i11, view);
        if (d14 != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i11 = R$id.imagePlaceHolder;
            View d15 = C2548q.d(i11, view);
            if (d15 != null && (d11 = C2548q.d((i11 = R$id.line1PlaceHolder), view)) != null && (d12 = C2548q.d((i11 = R$id.line2PlaceHolder), view)) != null && (d13 = C2548q.d((i11 = R$id.line3PlaceHolder), view)) != null) {
                return new WidgetCartSplitV2ItemAccessoriesSkeletonItemVhBinding(constraintLayout, d14, constraintLayout, d15, d11, d12, d13);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetCartSplitV2ItemAccessoriesSkeletonItemVhBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_cart_split_v2_item_accessories_skeleton_item_vh, viewGroup, false);
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
