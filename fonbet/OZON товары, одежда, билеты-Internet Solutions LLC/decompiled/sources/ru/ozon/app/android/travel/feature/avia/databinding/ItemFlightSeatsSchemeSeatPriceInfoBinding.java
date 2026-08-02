package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes8.dex */
public final class ItemFlightSeatsSchemeSeatPriceInfoBinding implements a {

    @NonNull
    public final TextAtomView flightSeatsSchemeItemTextView;

    @NonNull
    public final TextAtomView flightSeatsSchemePriceTextView;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemFlightSeatsSchemeSeatPriceInfoBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.flightSeatsSchemeItemTextView = textAtomView;
        this.flightSeatsSchemePriceTextView = textAtomView2;
    }

    @NonNull
    public static ItemFlightSeatsSchemeSeatPriceInfoBinding bind(@NonNull View view) {
        int i11 = R$id.flightSeatsSchemeItemTextView;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.flightSeatsSchemePriceTextView;
            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView2 != null) {
                return new ItemFlightSeatsSchemeSeatPriceInfoBinding((ConstraintLayout) view, textAtomView, textAtomView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemFlightSeatsSchemeSeatPriceInfoBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_flight_seats_scheme_seat_price_info, viewGroup, false);
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
