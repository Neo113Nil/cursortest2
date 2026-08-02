package ru.ozon.app.android.search.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.catalog.components.searchresultssortv2.presentation.FilterButtonView;
import ru.ozon.app.android.uikit.view.atoms.select.SelectView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;

/* loaded from: classes13.dex */
public final class WidgetSearchResultsSortV2Binding implements a {

    @NonNull
    public final FilterButtonView filterBtn;

    @NonNull
    public final ConstraintLayout rootCl;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final SelectView sortBtn;

    @NonNull
    public final SmallIconButtonView viewBtn;

    private WidgetSearchResultsSortV2Binding(@NonNull ConstraintLayout constraintLayout, @NonNull FilterButtonView filterButtonView, @NonNull ConstraintLayout constraintLayout2, @NonNull SelectView selectView, @NonNull SmallIconButtonView smallIconButtonView) {
        this.rootView = constraintLayout;
        this.filterBtn = filterButtonView;
        this.rootCl = constraintLayout2;
        this.sortBtn = selectView;
        this.viewBtn = smallIconButtonView;
    }

    @NonNull
    public static WidgetSearchResultsSortV2Binding bind(@NonNull View view) {
        int i11 = R$id.filterBtn;
        FilterButtonView filterButtonView = (FilterButtonView) C2548q.d(i11, view);
        if (filterButtonView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i11 = R$id.sortBtn;
            SelectView selectView = (SelectView) C2548q.d(i11, view);
            if (selectView != null) {
                i11 = R$id.viewBtn;
                SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
                if (smallIconButtonView != null) {
                    return new WidgetSearchResultsSortV2Binding(constraintLayout, filterButtonView, constraintLayout, selectView, smallIconButtonView);
                }
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
