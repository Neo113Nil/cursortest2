package ru.ozon.app.android.travel.feature.hotels.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.feature.hotels.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes4.dex */
public final class ItemTravelRoomsGuestsCardCompactBinding implements a {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomView travelRoomCompactTitleTV;

    @NonNull
    public final VerticalAtomsLayout travelRoomGuestListCompactVAL;

    @NonNull
    public final TextAtomView travelRoomPriceCompactTV;

    private ItemTravelRoomsGuestsCardCompactBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomView textAtomView, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.travelRoomCompactTitleTV = textAtomView;
        this.travelRoomGuestListCompactVAL = verticalAtomsLayout;
        this.travelRoomPriceCompactTV = textAtomView2;
    }

    @NonNull
    public static ItemTravelRoomsGuestsCardCompactBinding bind(@NonNull View view) {
        int i11 = R$id.travelRoomCompactTitleTV;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.travelRoomGuestListCompactVAL;
            VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
            if (verticalAtomsLayout != null) {
                i11 = R$id.travelRoomPriceCompactTV;
                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView2 != null) {
                    return new ItemTravelRoomsGuestsCardCompactBinding((ConstraintLayout) view, textAtomView, verticalAtomsLayout, textAtomView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemTravelRoomsGuestsCardCompactBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_travel_rooms_guests_card_compact, viewGroup, false);
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
