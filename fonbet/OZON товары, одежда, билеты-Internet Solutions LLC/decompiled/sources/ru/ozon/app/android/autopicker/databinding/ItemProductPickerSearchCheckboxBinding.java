package ru.ozon.app.android.autopicker.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.autopicker.R$id;
import ru.ozon.app.android.autopicker.R$layout;

/* loaded from: classes11.dex */
public final class ItemProductPickerSearchCheckboxBinding implements a {

    @NonNull
    public final CheckBox checkboxCb;

    @NonNull
    public final ConstraintLayout checkboxCl;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView titleTv;

    private ItemProductPickerSearchCheckboxBinding(@NonNull ConstraintLayout constraintLayout, @NonNull CheckBox checkBox, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.checkboxCb = checkBox;
        this.checkboxCl = constraintLayout2;
        this.titleTv = textView;
    }

    @NonNull
    public static ItemProductPickerSearchCheckboxBinding bind(@NonNull View view) {
        int i11 = R$id.checkboxCb;
        CheckBox checkBox = (CheckBox) C2548q.d(i11, view);
        if (checkBox != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i12 = R$id.titleTv;
            TextView textView = (TextView) C2548q.d(i12, view);
            if (textView != null) {
                return new ItemProductPickerSearchCheckboxBinding(constraintLayout, checkBox, constraintLayout, textView);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemProductPickerSearchCheckboxBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_product_picker_search_checkbox, viewGroup, false);
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
