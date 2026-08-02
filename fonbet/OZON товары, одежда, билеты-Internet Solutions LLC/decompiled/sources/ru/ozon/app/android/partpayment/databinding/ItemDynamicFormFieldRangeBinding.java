package ru.ozon.app.android.partpayment.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import ru.ozon.app.android.partpayment.R$id;

/* loaded from: classes13.dex */
public final class ItemDynamicFormFieldRangeBinding implements a {

    @NonNull
    public final TextInputEditText fieldEt;

    @NonNull
    public final TextInputLayout fieldTil;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final AppCompatTextView titleTv;

    private ItemDynamicFormFieldRangeBinding(@NonNull LinearLayout linearLayout, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout, @NonNull AppCompatTextView appCompatTextView) {
        this.rootView = linearLayout;
        this.fieldEt = textInputEditText;
        this.fieldTil = textInputLayout;
        this.titleTv = appCompatTextView;
    }

    @NonNull
    public static ItemDynamicFormFieldRangeBinding bind(@NonNull View view) {
        int i11 = R$id.fieldEt;
        TextInputEditText textInputEditText = (TextInputEditText) C2548q.d(i11, view);
        if (textInputEditText != null) {
            i11 = R$id.fieldTil;
            TextInputLayout textInputLayout = (TextInputLayout) C2548q.d(i11, view);
            if (textInputLayout != null) {
                i11 = R$id.titleTv;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                if (appCompatTextView != null) {
                    return new ItemDynamicFormFieldRangeBinding((LinearLayout) view, textInputEditText, textInputLayout, appCompatTextView);
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
