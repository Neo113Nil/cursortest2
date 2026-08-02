package ru.ozon.app.android.storefront.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import ru.ozon.app.android.storefront.R$id;

/* loaded from: classes2.dex */
public final class WidgetRateInputItemBinding implements a {

    @NonNull
    public final TextInputEditText rateInputEt;

    @NonNull
    public final TextInputLayout rateInputTil;

    @NonNull
    private final TextInputLayout rootView;

    private WidgetRateInputItemBinding(@NonNull TextInputLayout textInputLayout, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout2) {
        this.rootView = textInputLayout;
        this.rateInputEt = textInputEditText;
        this.rateInputTil = textInputLayout2;
    }

    @NonNull
    public static WidgetRateInputItemBinding bind(@NonNull View view) {
        int i11 = R$id.rateInputEt;
        TextInputEditText textInputEditText = (TextInputEditText) C2548q.d(i11, view);
        if (textInputEditText == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        TextInputLayout textInputLayout = (TextInputLayout) view;
        return new WidgetRateInputItemBinding(textInputLayout, textInputEditText, textInputLayout);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public TextInputLayout getConstraintLayout() {
        return this.rootView;
    }
}
