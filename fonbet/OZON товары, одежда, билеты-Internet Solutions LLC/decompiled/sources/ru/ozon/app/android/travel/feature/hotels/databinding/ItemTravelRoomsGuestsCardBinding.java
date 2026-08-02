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
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes4.dex */
public final class ItemTravelRoomsGuestsCardBinding implements a {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final SmallIconButtonView travelRoomCancellationInfoButton;

    @NonNull
    public final TextAtomView travelRoomCancellationInfoTextView;

    @NonNull
    public final VerticalAtomsLayout travelRoomGuestList;

    @NonNull
    public final TextAtomView travelRoomMealInfoTextView;

    @NonNull
    public final TextAtomView travelRoomPriceTextView;

    @NonNull
    public final TextAtomView travelRoomTitleTextView;

    private ItemTravelRoomsGuestsCardBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SmallIconButtonView smallIconButtonView, @NonNull TextAtomView textAtomView, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull TextAtomView textAtomView2, @NonNull TextAtomView textAtomView3, @NonNull TextAtomView textAtomView4) {
        this.rootView = constraintLayout;
        this.travelRoomCancellationInfoButton = smallIconButtonView;
        this.travelRoomCancellationInfoTextView = textAtomView;
        this.travelRoomGuestList = verticalAtomsLayout;
        this.travelRoomMealInfoTextView = textAtomView2;
        this.travelRoomPriceTextView = textAtomView3;
        this.travelRoomTitleTextView = textAtomView4;
    }

    @NonNull
    public static ItemTravelRoomsGuestsCardBinding bind(@NonNull View view) {
        int i11 = R$id.travelRoomCancellationInfoButton;
        SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
        if (smallIconButtonView != null) {
            i11 = R$id.travelRoomCancellationInfoTextView;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.travelRoomGuestList;
                VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
                if (verticalAtomsLayout != null) {
                    i11 = R$id.travelRoomMealInfoTextView;
                    TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView2 != null) {
                        i11 = R$id.travelRoomPriceTextView;
                        TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView3 != null) {
                            i11 = R$id.travelRoomTitleTextView;
                            TextAtomView textAtomView4 = (TextAtomView) C2548q.d(i11, view);
                            if (textAtomView4 != null) {
                                return new ItemTravelRoomsGuestsCardBinding((ConstraintLayout) view, smallIconButtonView, textAtomView, verticalAtomsLayout, textAtomView2, textAtomView3, textAtomView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemTravelRoomsGuestsCardBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_travel_rooms_guests_card, viewGroup, false);
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
