package ru.ozon.app.android.travel.feature.general.booking.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.travel.feature.general.booking.R$id;
import ru.ozon.app.android.travel.feature.general.booking.R$layout;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.view.CommonSelectorInputView;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.view.CommonTextInputView;

/* loaded from: classes3.dex */
public final class ItemTravelAddNewPassengerFormV2BirthCertificateBinding implements a {

    @NonNull
    public final Guideline centerVerticalGuideline;

    @NonNull
    public final TextView dashSeparatorTv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final CommonSelectorInputView seriesSelectorInputView;

    @NonNull
    public final CommonTextInputView seriesTextInputView;

    private ItemTravelAddNewPassengerFormV2BirthCertificateBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Guideline guideline, @NonNull TextView textView, @NonNull CommonSelectorInputView commonSelectorInputView, @NonNull CommonTextInputView commonTextInputView) {
        this.rootView = constraintLayout;
        this.centerVerticalGuideline = guideline;
        this.dashSeparatorTv = textView;
        this.seriesSelectorInputView = commonSelectorInputView;
        this.seriesTextInputView = commonTextInputView;
    }

    @NonNull
    public static ItemTravelAddNewPassengerFormV2BirthCertificateBinding bind(@NonNull View view) {
        int i11 = R$id.centerVerticalGuideline;
        Guideline guideline = (Guideline) C2548q.d(i11, view);
        if (guideline != null) {
            i11 = R$id.dashSeparatorTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.seriesSelectorInputView;
                CommonSelectorInputView commonSelectorInputView = (CommonSelectorInputView) C2548q.d(i11, view);
                if (commonSelectorInputView != null) {
                    i11 = R$id.seriesTextInputView;
                    CommonTextInputView commonTextInputView = (CommonTextInputView) C2548q.d(i11, view);
                    if (commonTextInputView != null) {
                        return new ItemTravelAddNewPassengerFormV2BirthCertificateBinding((ConstraintLayout) view, guideline, textView, commonSelectorInputView, commonTextInputView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemTravelAddNewPassengerFormV2BirthCertificateBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_travel_add_new_passenger_form_v2_birth_certificate, viewGroup, false);
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
