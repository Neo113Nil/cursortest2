package ru.ozon.app.android.partpayment.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import ru.ozon.app.android.partpayment.R$id;

/* loaded from: classes13.dex */
public final class ItemDynamicFormFieldTextBinding implements a {

    @NonNull
    public final TextInputEditText fieldEt;

    @NonNull
    public final TextInputLayout fieldTil;

    @NonNull
    private final TextInputLayout rootView;

    private ItemDynamicFormFieldTextBinding(@NonNull TextInputLayout textInputLayout, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout2) {
        this.rootView = textInputLayout;
        this.fieldEt = textInputEditText;
        this.fieldTil = textInputLayout2;
    }

    @NonNull
    public static ItemDynamicFormFieldTextBinding bind(@NonNull View view) {
        int i11 = R$id.fieldEt;
        TextInputEditText textInputEditText = (TextInputEditText) C2548q.d(i11, view);
        if (textInputEditText == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        TextInputLayout textInputLayout = (TextInputLayout) view;
        return new ItemDynamicFormFieldTextBinding(textInputLayout, textInputEditText, textInputLayout);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public TextInputLayout getConstraintLayout() {
        return this.rootView;
    }
}
