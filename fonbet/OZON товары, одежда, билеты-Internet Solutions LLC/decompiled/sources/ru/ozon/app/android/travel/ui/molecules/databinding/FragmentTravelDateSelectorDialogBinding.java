package ru.ozon.app.android.travel.ui.molecules.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.app.android.travel.ui.molecules.R$layout;
import ru.ozon.app.android.uikit.view.date.OzonDatePicker;

/* loaded from: classes2.dex */
public final class FragmentTravelDateSelectorDialogBinding implements a {

    @NonNull
    public final Button cancelBtn;

    @NonNull
    public final OzonDatePicker datePicker;

    @NonNull
    public final Button okBtn;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView titleTv;

    private FragmentTravelDateSelectorDialogBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull OzonDatePicker ozonDatePicker, @NonNull Button button2, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.cancelBtn = button;
        this.datePicker = ozonDatePicker;
        this.okBtn = button2;
        this.titleTv = textView;
    }

    @NonNull
    public static FragmentTravelDateSelectorDialogBinding bind(@NonNull View view) {
        int i11 = R$id.cancelBtn;
        Button button = (Button) C2548q.d(i11, view);
        if (button != null) {
            i11 = R$id.datePicker;
            OzonDatePicker ozonDatePicker = (OzonDatePicker) C2548q.d(i11, view);
            if (ozonDatePicker != null) {
                i11 = R$id.okBtn;
                Button button2 = (Button) C2548q.d(i11, view);
                if (button2 != null) {
                    i11 = R$id.titleTv;
                    TextView textView = (TextView) C2548q.d(i11, view);
                    if (textView != null) {
                        return new FragmentTravelDateSelectorDialogBinding((ConstraintLayout) view, button, ozonDatePicker, button2, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FragmentTravelDateSelectorDialogBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_travel_date_selector_dialog, viewGroup, false);
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
