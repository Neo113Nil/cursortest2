package ru.ozon.app.android.travel.feature.general.booking.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.general.booking.R$id;
import ru.ozon.app.android.travel.molecules.view.travelFiltersButton.TravelFiltersButtonView;
import ru.ozon.app.android.uikit.view.atoms.select.SelectView;
import ru.ozon.app.android.uikit.view.atoms.texts.TextAtomWithIconView;

/* loaded from: classes3.dex */
public final class WidgetTravelSearchSortAndFilterBinding implements a {

    @NonNull
    public final TextAtomWithIconView buttonTAWIV;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final SelectView sortingSelectView;

    @NonNull
    public final TravelFiltersButtonView travelFiltersButtonViewTfbv;

    private WidgetTravelSearchSortAndFilterBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomWithIconView textAtomWithIconView, @NonNull SelectView selectView, @NonNull TravelFiltersButtonView travelFiltersButtonView) {
        this.rootView = constraintLayout;
        this.buttonTAWIV = textAtomWithIconView;
        this.sortingSelectView = selectView;
        this.travelFiltersButtonViewTfbv = travelFiltersButtonView;
    }

    @NonNull
    public static WidgetTravelSearchSortAndFilterBinding bind(@NonNull View view) {
        int i11 = R$id.buttonTAWIV;
        TextAtomWithIconView textAtomWithIconView = (TextAtomWithIconView) C2548q.d(i11, view);
        if (textAtomWithIconView != null) {
            i11 = R$id.sortingSelectView;
            SelectView selectView = (SelectView) C2548q.d(i11, view);
            if (selectView != null) {
                i11 = R$id.travelFiltersButtonViewTfbv;
                TravelFiltersButtonView travelFiltersButtonView = (TravelFiltersButtonView) C2548q.d(i11, view);
                if (travelFiltersButtonView != null) {
                    return new WidgetTravelSearchSortAndFilterBinding((ConstraintLayout) view, textAtomWithIconView, selectView, travelFiltersButtonView);
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
