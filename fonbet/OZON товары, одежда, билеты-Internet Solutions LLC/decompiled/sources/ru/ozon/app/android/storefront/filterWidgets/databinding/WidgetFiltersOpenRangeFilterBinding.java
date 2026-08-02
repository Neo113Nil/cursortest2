package ru.ozon.app.android.storefront.filterWidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.storefront.core.atoms.views.openRangeFilter.OpenRangeFilterView;
import ru.ozon.app.android.storefront.filterWidgets.R$id;

/* loaded from: classes2.dex */
public final class WidgetFiltersOpenRangeFilterBinding implements a {

    @NonNull
    public final OpenRangeFilterView openRangeFilter;

    @NonNull
    public final View openRangeFilterSeparator;

    @NonNull
    private final LinearLayout rootView;

    private WidgetFiltersOpenRangeFilterBinding(@NonNull LinearLayout linearLayout, @NonNull OpenRangeFilterView openRangeFilterView, @NonNull View view) {
        this.rootView = linearLayout;
        this.openRangeFilter = openRangeFilterView;
        this.openRangeFilterSeparator = view;
    }

    @NonNull
    public static WidgetFiltersOpenRangeFilterBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.openRangeFilter;
        OpenRangeFilterView openRangeFilterView = (OpenRangeFilterView) C2548q.d(i11, view);
        if (openRangeFilterView == null || (d11 = C2548q.d((i11 = R$id.openRangeFilterSeparator), view)) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        return new WidgetFiltersOpenRangeFilterBinding((LinearLayout) view, openRangeFilterView, d11);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
