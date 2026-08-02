package ru.ozon.app.android.storefront.filterWidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter.colors.AspectColorFilterView;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter.colors.RoundedBorderSelectableLayout;
import ru.ozon.app.android.storefront.filterWidgets.R$id;

/* loaded from: classes2.dex */
public final class WidgetFiltersAspectsColorFilterItemColorBinding implements a {

    @NonNull
    public final RoundedBorderSelectableLayout colorFilterRoot;

    @NonNull
    public final AspectColorFilterView colorView;

    @NonNull
    private final RoundedBorderSelectableLayout rootView;

    private WidgetFiltersAspectsColorFilterItemColorBinding(@NonNull RoundedBorderSelectableLayout roundedBorderSelectableLayout, @NonNull RoundedBorderSelectableLayout roundedBorderSelectableLayout2, @NonNull AspectColorFilterView aspectColorFilterView) {
        this.rootView = roundedBorderSelectableLayout;
        this.colorFilterRoot = roundedBorderSelectableLayout2;
        this.colorView = aspectColorFilterView;
    }

    @NonNull
    public static WidgetFiltersAspectsColorFilterItemColorBinding bind(@NonNull View view) {
        RoundedBorderSelectableLayout roundedBorderSelectableLayout = (RoundedBorderSelectableLayout) view;
        int i11 = R$id.colorView;
        AspectColorFilterView aspectColorFilterView = (AspectColorFilterView) C2548q.d(i11, view);
        if (aspectColorFilterView != null) {
            return new WidgetFiltersAspectsColorFilterItemColorBinding(roundedBorderSelectableLayout, roundedBorderSelectableLayout, aspectColorFilterView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public RoundedBorderSelectableLayout getRoot() {
        return this.rootView;
    }
}
