package ru.ozon.app.android.checkout.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.atoms.atom2.ButtonAtom;
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.app.android.uikit.view.input.MobilizationTextInputLayout;

/* loaded from: classes11.dex */
public final class WidgetDiscountCodeBinding implements a {

    @NonNull
    public final ButtonAtom buttonAtom;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final EditText valueEt;

    @NonNull
    public final MobilizationTextInputLayout valueTil;

    private WidgetDiscountCodeBinding(@NonNull LinearLayout linearLayout, @NonNull ButtonAtom buttonAtom, @NonNull EditText editText, @NonNull MobilizationTextInputLayout mobilizationTextInputLayout) {
        this.rootView = linearLayout;
        this.buttonAtom = buttonAtom;
        this.valueEt = editText;
        this.valueTil = mobilizationTextInputLayout;
    }

    @NonNull
    public static WidgetDiscountCodeBinding bind(@NonNull View view) {
        int i11 = R$id.buttonAtom;
        ButtonAtom buttonAtom = (ButtonAtom) C2548q.d(i11, view);
        if (buttonAtom != null) {
            i11 = R$id.valueEt;
            EditText editText = (EditText) C2548q.d(i11, view);
            if (editText != null) {
                i11 = R$id.valueTil;
                MobilizationTextInputLayout mobilizationTextInputLayout = (MobilizationTextInputLayout) C2548q.d(i11, view);
                if (mobilizationTextInputLayout != null) {
                    return new WidgetDiscountCodeBinding((LinearLayout) view, buttonAtom, editText, mobilizationTextInputLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
