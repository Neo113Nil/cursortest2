package ru.ozon.app.android.session.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import ru.ozon.app.android.session.R$id;

/* loaded from: classes2.dex */
public final class ItemAuthFieldInputBinding implements a {

    @NonNull
    public final TextInputEditText fieldEt;

    @NonNull
    public final TextInputLayout fieldTil;

    @NonNull
    private final FrameLayout rootView;

    private ItemAuthFieldInputBinding(@NonNull FrameLayout frameLayout, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout) {
        this.rootView = frameLayout;
        this.fieldEt = textInputEditText;
        this.fieldTil = textInputLayout;
    }

    @NonNull
    public static ItemAuthFieldInputBinding bind(@NonNull View view) {
        int i11 = R$id.fieldEt;
        TextInputEditText textInputEditText = (TextInputEditText) C2548q.d(i11, view);
        if (textInputEditText != null) {
            i11 = R$id.fieldTil;
            TextInputLayout textInputLayout = (TextInputLayout) C2548q.d(i11, view);
            if (textInputLayout != null) {
                return new ItemAuthFieldInputBinding((FrameLayout) view, textInputEditText, textInputLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}
