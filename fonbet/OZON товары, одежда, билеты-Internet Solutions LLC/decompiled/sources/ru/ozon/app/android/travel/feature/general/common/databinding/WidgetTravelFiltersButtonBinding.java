package ru.ozon.app.android.travel.feature.general.common.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.molecules.view.travelFiltersButton.TravelFiltersButtonView;

/* loaded from: classes3.dex */
public final class WidgetTravelFiltersButtonBinding implements a {

    @NonNull
    private final TravelFiltersButtonView rootView;

    @NonNull
    public final TravelFiltersButtonView travelFiltersButtonTfbv;

    private WidgetTravelFiltersButtonBinding(@NonNull TravelFiltersButtonView travelFiltersButtonView, @NonNull TravelFiltersButtonView travelFiltersButtonView2) {
        this.rootView = travelFiltersButtonView;
        this.travelFiltersButtonTfbv = travelFiltersButtonView2;
    }

    @NonNull
    public static WidgetTravelFiltersButtonBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TravelFiltersButtonView travelFiltersButtonView = (TravelFiltersButtonView) view;
        return new WidgetTravelFiltersButtonBinding(travelFiltersButtonView, travelFiltersButtonView);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public TravelFiltersButtonView getConstraintLayout() {
        return this.rootView;
    }
}
