package ru.ozon.app.android.storefront.filterWidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.islandSeparator.FiltersIslandSeparatorView;
import ru.ozon.app.android.storefront.filterWidgets.R$id;

/* loaded from: classes2.dex */
public final class FilterValuesHeaderItemBinding implements a {

    @NonNull
    public final ConstraintLayout constraintLayoutContainer;

    @NonNull
    public final LinearLayout filterValuesHeaderContainer;

    @NonNull
    public final ImageView foldIv;

    @NonNull
    public final TextView headerTv;

    @NonNull
    public final FiltersIslandSeparatorView islandSeparator;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final View separator;

    private FilterValuesHeaderItemBinding(@NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull FiltersIslandSeparatorView filtersIslandSeparatorView, @NonNull View view) {
        this.rootView = linearLayout;
        this.constraintLayoutContainer = constraintLayout;
        this.filterValuesHeaderContainer = linearLayout2;
        this.foldIv = imageView;
        this.headerTv = textView;
        this.islandSeparator = filtersIslandSeparatorView;
        this.separator = view;
    }

    @NonNull
    public static FilterValuesHeaderItemBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.constraintLayoutContainer;
        ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
        if (constraintLayout != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i11 = R$id.foldIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.headerTv;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    i11 = R$id.islandSeparator;
                    FiltersIslandSeparatorView filtersIslandSeparatorView = (FiltersIslandSeparatorView) C2548q.d(i11, view);
                    if (filtersIslandSeparatorView != null && (d11 = C2548q.d((i11 = R$id.separator), view)) != null) {
                        return new FilterValuesHeaderItemBinding(linearLayout, constraintLayout, linearLayout, imageView, textView, filtersIslandSeparatorView, d11);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
