package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.molecules.view.tripLeg.v1.TripLegView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes8.dex */
public final class WidgetOrderFlightInfoBinding implements a {

    @NonNull
    public final DisclaimerContainer disclaimerContainer;

    @NonNull
    public final VerticalAtomsLayout flightInfoAtomsVal;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomView titleTav;

    @NonNull
    public final TripLegView travelRouteView;

    private WidgetOrderFlightInfoBinding(@NonNull ConstraintLayout constraintLayout, @NonNull DisclaimerContainer disclaimerContainer, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull TextAtomView textAtomView, @NonNull TripLegView tripLegView) {
        this.rootView = constraintLayout;
        this.disclaimerContainer = disclaimerContainer;
        this.flightInfoAtomsVal = verticalAtomsLayout;
        this.titleTav = textAtomView;
        this.travelRouteView = tripLegView;
    }

    @NonNull
    public static WidgetOrderFlightInfoBinding bind(@NonNull View view) {
        int i11 = R$id.disclaimerContainer;
        DisclaimerContainer disclaimerContainer = (DisclaimerContainer) C2548q.d(i11, view);
        if (disclaimerContainer != null) {
            i11 = R$id.flightInfoAtomsVal;
            VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
            if (verticalAtomsLayout != null) {
                i11 = R$id.titleTav;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    i11 = R$id.travelRouteView;
                    TripLegView tripLegView = (TripLegView) C2548q.d(i11, view);
                    if (tripLegView != null) {
                        return new WidgetOrderFlightInfoBinding((ConstraintLayout) view, disclaimerContainer, verticalAtomsLayout, textAtomView, tripLegView);
                    }
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
