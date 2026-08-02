package ru.ozon.app.android.atoms.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.atoms.R$id;

/* loaded from: classes11.dex */
public final class AtomCellRadioBinding implements a {

    @NonNull
    public final RadioButton radioRb;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView titleTv;

    private AtomCellRadioBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RadioButton radioButton, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.radioRb = radioButton;
        this.titleTv = textView;
    }

    @NonNull
    public static AtomCellRadioBinding bind(@NonNull View view) {
        int i11 = R$id.radioRb;
        RadioButton radioButton = (RadioButton) C2548q.d(i11, view);
        if (radioButton != null) {
            i11 = R$id.titleTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                return new AtomCellRadioBinding((ConstraintLayout) view, radioButton, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
