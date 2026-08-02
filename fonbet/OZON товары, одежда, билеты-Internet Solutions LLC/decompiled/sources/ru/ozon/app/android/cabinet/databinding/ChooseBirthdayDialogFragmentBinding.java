package ru.ozon.app.android.cabinet.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.cabinet.R$id;
import ru.ozon.app.android.cabinet.R$layout;
import ru.ozon.app.android.uikit.view.date.OzonDatePicker;

/* loaded from: classes11.dex */
public final class ChooseBirthdayDialogFragmentBinding implements a {

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

    private ChooseBirthdayDialogFragmentBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull OzonDatePicker ozonDatePicker, @NonNull Button button2, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.cancelBtn = button;
        this.datePicker = ozonDatePicker;
        this.okBtn = button2;
        this.titleTv = textView;
    }

    @NonNull
    public static ChooseBirthdayDialogFragmentBinding bind(@NonNull View view) {
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
                        return new ChooseBirthdayDialogFragmentBinding((ConstraintLayout) view, button, ozonDatePicker, button2, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ChooseBirthdayDialogFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.choose_birthday_dialog_fragment, viewGroup, false);
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
