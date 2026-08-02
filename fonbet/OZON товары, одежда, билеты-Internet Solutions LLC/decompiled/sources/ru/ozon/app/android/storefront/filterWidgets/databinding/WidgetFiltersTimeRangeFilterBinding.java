package ru.ozon.app.android.storefront.filterWidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.storefront.core.atoms.views.TimeRangeFilterView;
import ru.ozon.app.android.storefront.filterWidgets.R$id;

/* loaded from: classes2.dex */
public final class WidgetFiltersTimeRangeFilterBinding implements a {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View timeRangeFilterSeparator;

    @NonNull
    public final TimeRangeFilterView timeRangeFilterView;

    private WidgetFiltersTimeRangeFilterBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull TimeRangeFilterView timeRangeFilterView) {
        this.rootView = constraintLayout;
        this.timeRangeFilterSeparator = view;
        this.timeRangeFilterView = timeRangeFilterView;
    }

    @NonNull
    public static WidgetFiltersTimeRangeFilterBinding bind(@NonNull View view) {
        int i11 = R$id.timeRangeFilterSeparator;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.timeRangeFilterView;
            TimeRangeFilterView timeRangeFilterView = (TimeRangeFilterView) C2548q.d(i11, view);
            if (timeRangeFilterView != null) {
                return new WidgetFiltersTimeRangeFilterBinding((ConstraintLayout) view, d11, timeRangeFilterView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
