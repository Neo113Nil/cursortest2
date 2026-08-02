package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.R$layout;
import ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat.AirplaneSeatView;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes8.dex */
public final class ItemFlightSeatsLegendBinding implements a {

    @NonNull
    public final BadgeView flightSeatsLegendBadgeBV;

    @NonNull
    public final Barrier flightSeatsLegendBarrierB;

    @NonNull
    public final TextAtomView flightSeatsLegendDescriptionTAV;

    @NonNull
    public final View flightSeatsLegendSeparatorV;

    @NonNull
    public final AirplaneSeatView flightSeatsLegendSignASV;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemFlightSeatsLegendBinding(@NonNull ConstraintLayout constraintLayout, @NonNull BadgeView badgeView, @NonNull Barrier barrier, @NonNull TextAtomView textAtomView, @NonNull View view, @NonNull AirplaneSeatView airplaneSeatView) {
        this.rootView = constraintLayout;
        this.flightSeatsLegendBadgeBV = badgeView;
        this.flightSeatsLegendBarrierB = barrier;
        this.flightSeatsLegendDescriptionTAV = textAtomView;
        this.flightSeatsLegendSeparatorV = view;
        this.flightSeatsLegendSignASV = airplaneSeatView;
    }

    @NonNull
    public static ItemFlightSeatsLegendBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.flightSeatsLegendBadgeBV;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            i11 = R$id.flightSeatsLegendBarrierB;
            Barrier barrier = (Barrier) C2548q.d(i11, view);
            if (barrier != null) {
                i11 = R$id.flightSeatsLegendDescriptionTAV;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null && (d11 = C2548q.d((i11 = R$id.flightSeatsLegendSeparatorV), view)) != null) {
                    i11 = R$id.flightSeatsLegendSignASV;
                    AirplaneSeatView airplaneSeatView = (AirplaneSeatView) C2548q.d(i11, view);
                    if (airplaneSeatView != null) {
                        return new ItemFlightSeatsLegendBinding((ConstraintLayout) view, badgeView, barrier, textAtomView, d11, airplaneSeatView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemFlightSeatsLegendBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_flight_seats_legend, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
