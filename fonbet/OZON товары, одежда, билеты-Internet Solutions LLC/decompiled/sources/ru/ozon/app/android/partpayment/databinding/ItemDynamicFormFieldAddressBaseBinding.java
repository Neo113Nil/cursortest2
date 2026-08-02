package ru.ozon.app.android.partpayment.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import ru.ozon.app.android.partpayment.R$id;
import ru.ozon.app.android.uikit.view.container.ReadOnlyFrame;

/* loaded from: classes13.dex */
public final class ItemDynamicFormFieldAddressBaseBinding implements a {

    @NonNull
    public final ReadOnlyFrame addressFieldContainer;

    @NonNull
    public final TextInputEditText fieldEt;

    @NonNull
    public final TextInputLayout fieldTil;

    @NonNull
    private final ReadOnlyFrame rootView;

    private ItemDynamicFormFieldAddressBaseBinding(@NonNull ReadOnlyFrame readOnlyFrame, @NonNull ReadOnlyFrame readOnlyFrame2, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout) {
        this.rootView = readOnlyFrame;
        this.addressFieldContainer = readOnlyFrame2;
        this.fieldEt = textInputEditText;
        this.fieldTil = textInputLayout;
    }

    @NonNull
    public static ItemDynamicFormFieldAddressBaseBinding bind(@NonNull View view) {
        ReadOnlyFrame readOnlyFrame = (ReadOnlyFrame) view;
        int i11 = R$id.fieldEt;
        TextInputEditText textInputEditText = (TextInputEditText) C2548q.d(i11, view);
        if (textInputEditText != null) {
            i11 = R$id.fieldTil;
            TextInputLayout textInputLayout = (TextInputLayout) C2548q.d(i11, view);
            if (textInputLayout != null) {
                return new ItemDynamicFormFieldAddressBaseBinding(readOnlyFrame, readOnlyFrame, textInputEditText, textInputLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ReadOnlyFrame getConstraintLayout() {
        return this.rootView;
    }
}
