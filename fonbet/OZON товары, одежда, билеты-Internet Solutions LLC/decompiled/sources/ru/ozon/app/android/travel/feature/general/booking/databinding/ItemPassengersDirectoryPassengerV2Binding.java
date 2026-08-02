package ru.ozon.app.android.travel.feature.general.booking.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.general.booking.R$id;
import ru.ozon.app.android.travel.feature.general.booking.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes3.dex */
public final class ItemPassengersDirectoryPassengerV2Binding implements a {

    @NonNull
    public final SmallIconButtonView additionalActionsSIBV;

    @NonNull
    public final TextAtomView fullNameTav;

    @NonNull
    public final TextAtomView personalInfoTAV;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemPassengersDirectoryPassengerV2Binding(@NonNull ConstraintLayout constraintLayout, @NonNull SmallIconButtonView smallIconButtonView, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.additionalActionsSIBV = smallIconButtonView;
        this.fullNameTav = textAtomView;
        this.personalInfoTAV = textAtomView2;
    }

    @NonNull
    public static ItemPassengersDirectoryPassengerV2Binding bind(@NonNull View view) {
        int i11 = R$id.additionalActionsSIBV;
        SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
        if (smallIconButtonView != null) {
            i11 = R$id.fullNameTav;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.personalInfoTAV;
                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView2 != null) {
                    return new ItemPassengersDirectoryPassengerV2Binding((ConstraintLayout) view, smallIconButtonView, textAtomView, textAtomView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemPassengersDirectoryPassengerV2Binding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_passengers_directory_passenger_v2, viewGroup, false);
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
