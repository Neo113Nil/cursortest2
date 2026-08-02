package ru.ozon.app.android.autopicker.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.autopicker.R$id;
import ru.ozon.app.android.autopicker.R$layout;

/* loaded from: classes11.dex */
public final class ItemProductPickerSearchRadioBinding implements a {

    @NonNull
    public final ConstraintLayout radioCl;

    @NonNull
    public final RadioButton radioRb;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView titleTv;

    private ItemProductPickerSearchRadioBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull RadioButton radioButton, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.radioCl = constraintLayout2;
        this.radioRb = radioButton;
        this.titleTv = textView;
    }

    @NonNull
    public static ItemProductPickerSearchRadioBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.radioRb;
        RadioButton radioButton = (RadioButton) C2548q.d(i11, view);
        if (radioButton != null) {
            i11 = R$id.titleTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                return new ItemProductPickerSearchRadioBinding(constraintLayout, constraintLayout, radioButton, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemProductPickerSearchRadioBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_product_picker_search_radio, viewGroup, false);
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
