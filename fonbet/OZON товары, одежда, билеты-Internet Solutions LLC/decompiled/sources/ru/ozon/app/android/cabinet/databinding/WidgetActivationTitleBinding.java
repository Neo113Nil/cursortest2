package ru.ozon.app.android.cabinet.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.cabinet.R$id;
import ru.ozon.app.android.uikit.view.input.MobilizationTextInputLayout;

/* loaded from: classes11.dex */
public final class WidgetActivationTitleBinding implements a {

    @NonNull
    public final Button activationActionButton;

    @NonNull
    public final TextView descriptionTv;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView titleTv;

    @NonNull
    public final EditText valueEt;

    @NonNull
    public final MobilizationTextInputLayout valueTil;

    private WidgetActivationTitleBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull TextView textView, @NonNull TextView textView2, @NonNull EditText editText, @NonNull MobilizationTextInputLayout mobilizationTextInputLayout) {
        this.rootView = linearLayout;
        this.activationActionButton = button;
        this.descriptionTv = textView;
        this.titleTv = textView2;
        this.valueEt = editText;
        this.valueTil = mobilizationTextInputLayout;
    }

    @NonNull
    public static WidgetActivationTitleBinding bind(@NonNull View view) {
        int i11 = R$id.activationActionButton;
        Button button = (Button) C2548q.d(i11, view);
        if (button != null) {
            i11 = R$id.descriptionTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.titleTv;
                TextView textView2 = (TextView) C2548q.d(i11, view);
                if (textView2 != null) {
                    i11 = R$id.valueEt;
                    EditText editText = (EditText) C2548q.d(i11, view);
                    if (editText != null) {
                        i11 = R$id.valueTil;
                        MobilizationTextInputLayout mobilizationTextInputLayout = (MobilizationTextInputLayout) C2548q.d(i11, view);
                        if (mobilizationTextInputLayout != null) {
                            return new WidgetActivationTitleBinding((LinearLayout) view, button, textView, textView2, editText, mobilizationTextInputLayout);
                        }
                    }
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
