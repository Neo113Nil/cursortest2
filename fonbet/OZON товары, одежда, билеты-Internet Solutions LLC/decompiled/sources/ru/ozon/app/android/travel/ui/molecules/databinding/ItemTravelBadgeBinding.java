package ru.ozon.app.android.travel.ui.molecules.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.molecules.view.travelBadge.v1.TravelBadgeView;

/* loaded from: classes2.dex */
public final class ItemTravelBadgeBinding implements a {

    @NonNull
    private final TravelBadgeView rootView;

    @NonNull
    public final TravelBadgeView travelBadgeView;

    private ItemTravelBadgeBinding(@NonNull TravelBadgeView travelBadgeView, @NonNull TravelBadgeView travelBadgeView2) {
        this.rootView = travelBadgeView;
        this.travelBadgeView = travelBadgeView2;
    }

    @NonNull
    public static ItemTravelBadgeBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TravelBadgeView travelBadgeView = (TravelBadgeView) view;
        return new ItemTravelBadgeBinding(travelBadgeView, travelBadgeView);
    }

    @Override // X4.a
    @NonNull
    public TravelBadgeView getRoot() {
        return this.rootView;
    }
}
