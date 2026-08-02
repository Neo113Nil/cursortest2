package ru.ozon.app.android.partpayment.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import ru.ozon.app.android.partpayment.R$id;

/* loaded from: classes13.dex */
public final class WidgetFormPageLandingLimitBinding implements a {

    @NonNull
    public final TextView descriptionTv;

    @NonNull
    public final TextInputEditText inputEt;

    @NonNull
    public final TextInputLayout inputTil;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView sendBtn;

    @NonNull
    public final TextView titleTv;

    private WidgetFormPageLandingLimitBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = constraintLayout;
        this.descriptionTv = textView;
        this.inputEt = textInputEditText;
        this.inputTil = textInputLayout;
        this.sendBtn = textView2;
        this.titleTv = textView3;
    }

    @NonNull
    public static WidgetFormPageLandingLimitBinding bind(@NonNull View view) {
        int i11 = R$id.descriptionTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.inputEt;
            TextInputEditText textInputEditText = (TextInputEditText) C2548q.d(i11, view);
            if (textInputEditText != null) {
                i11 = R$id.inputTil;
                TextInputLayout textInputLayout = (TextInputLayout) C2548q.d(i11, view);
                if (textInputLayout != null) {
                    i11 = R$id.sendBtn;
                    TextView textView2 = (TextView) C2548q.d(i11, view);
                    if (textView2 != null) {
                        i11 = R$id.titleTv;
                        TextView textView3 = (TextView) C2548q.d(i11, view);
                        if (textView3 != null) {
                            return new WidgetFormPageLandingLimitBinding((ConstraintLayout) view, textView, textInputEditText, textInputLayout, textView2, textView3);
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
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
