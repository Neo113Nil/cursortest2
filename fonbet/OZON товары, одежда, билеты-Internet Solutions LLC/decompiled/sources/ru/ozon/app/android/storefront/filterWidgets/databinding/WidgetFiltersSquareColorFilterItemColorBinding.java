package ru.ozon.app.android.storefront.filterWidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter.colors.RoundedBorderSelectableLayout;
import ru.ozon.app.android.storefront.filterWidgets.R$id;
import ru.ozon.uni.android.atom.icon.IconView;

/* loaded from: classes2.dex */
public final class WidgetFiltersSquareColorFilterItemColorBinding implements a {

    @NonNull
    public final RoundedBorderSelectableLayout colorFilterRoot;

    @NonNull
    public final IconView iconView;

    @NonNull
    private final RoundedBorderSelectableLayout rootView;

    private WidgetFiltersSquareColorFilterItemColorBinding(@NonNull RoundedBorderSelectableLayout roundedBorderSelectableLayout, @NonNull RoundedBorderSelectableLayout roundedBorderSelectableLayout2, @NonNull IconView iconView) {
        this.rootView = roundedBorderSelectableLayout;
        this.colorFilterRoot = roundedBorderSelectableLayout2;
        this.iconView = iconView;
    }

    @NonNull
    public static WidgetFiltersSquareColorFilterItemColorBinding bind(@NonNull View view) {
        RoundedBorderSelectableLayout roundedBorderSelectableLayout = (RoundedBorderSelectableLayout) view;
        int i11 = R$id.iconView;
        IconView iconView = (IconView) C2548q.d(i11, view);
        if (iconView != null) {
            return new WidgetFiltersSquareColorFilterItemColorBinding(roundedBorderSelectableLayout, roundedBorderSelectableLayout, iconView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public RoundedBorderSelectableLayout getConstraintLayout() {
        return this.rootView;
    }
}
