package ru.ozon.app.android.csma.tips.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import ru.ozon.app.android.csma.tips.R$id;

/* loaded from: classes11.dex */
public final class ItemTipsInputBinding implements a {

    @NonNull
    private final TextInputLayout rootView;

    @NonNull
    public final TextInputEditText tipsEt;

    @NonNull
    public final TextInputLayout tipsTil;

    private ItemTipsInputBinding(@NonNull TextInputLayout textInputLayout, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout2) {
        this.rootView = textInputLayout;
        this.tipsEt = textInputEditText;
        this.tipsTil = textInputLayout2;
    }

    @NonNull
    public static ItemTipsInputBinding bind(@NonNull View view) {
        int i11 = R$id.tipsEt;
        TextInputEditText textInputEditText = (TextInputEditText) C2548q.d(i11, view);
        if (textInputEditText == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        TextInputLayout textInputLayout = (TextInputLayout) view;
        return new ItemTipsInputBinding(textInputLayout, textInputEditText, textInputLayout);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public TextInputLayout getConstraintLayout() {
        return this.rootView;
    }
}
