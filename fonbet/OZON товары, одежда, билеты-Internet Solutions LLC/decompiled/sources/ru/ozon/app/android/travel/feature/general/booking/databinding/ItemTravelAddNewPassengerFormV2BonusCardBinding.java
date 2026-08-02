package ru.ozon.app.android.travel.feature.general.booking.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.general.booking.R$id;
import ru.ozon.app.android.travel.feature.general.booking.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes3.dex */
public final class ItemTravelAddNewPassengerFormV2BonusCardBinding implements a {

    @NonNull
    public final TextAtomView bonusCardCarrierTv;

    @NonNull
    public final ImageView bonusCardIconIv;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemTravelAddNewPassengerFormV2BonusCardBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomView textAtomView, @NonNull ImageView imageView) {
        this.rootView = constraintLayout;
        this.bonusCardCarrierTv = textAtomView;
        this.bonusCardIconIv = imageView;
    }

    @NonNull
    public static ItemTravelAddNewPassengerFormV2BonusCardBinding bind(@NonNull View view) {
        int i11 = R$id.bonusCardCarrierTv;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.bonusCardIconIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                return new ItemTravelAddNewPassengerFormV2BonusCardBinding((ConstraintLayout) view, textAtomView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemTravelAddNewPassengerFormV2BonusCardBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_travel_add_new_passenger_form_v2_bonus_card, viewGroup, false);
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
