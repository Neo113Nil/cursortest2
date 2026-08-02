package ru.ozon.app.android.atoms.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.app.android.atoms.R$layout;

/* loaded from: classes11.dex */
public final class AtomInputBinding implements a {

    @NonNull
    public final TextInputEditText fieldEt;

    @NonNull
    public final TextInputLayout fieldTil;

    @NonNull
    private final View rootView;

    private AtomInputBinding(@NonNull View view, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout) {
        this.rootView = view;
        this.fieldEt = textInputEditText;
        this.fieldTil = textInputLayout;
    }

    @NonNull
    public static AtomInputBinding bind(@NonNull View view) {
        int i11 = R$id.fieldEt;
        TextInputEditText textInputEditText = (TextInputEditText) C2548q.d(i11, view);
        if (textInputEditText != null) {
            i11 = R$id.fieldTil;
            TextInputLayout textInputLayout = (TextInputLayout) C2548q.d(i11, view);
            if (textInputLayout != null) {
                return new AtomInputBinding(view, textInputEditText, textInputLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static AtomInputBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.atom_input, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
