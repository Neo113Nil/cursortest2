package ru.ozon.app.android.map.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import ru.ozon.app.android.map.R$id;
import ru.ozon.app.android.map.R$layout;

/* loaded from: classes12.dex */
public final class ItemFormBlockFieldTextBinding implements a {

    @NonNull
    public final TextInputEditText fieldEt;

    @NonNull
    public final TextInputLayout fieldTil;

    @NonNull
    private final TextInputLayout rootView;

    private ItemFormBlockFieldTextBinding(@NonNull TextInputLayout textInputLayout, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout2) {
        this.rootView = textInputLayout;
        this.fieldEt = textInputEditText;
        this.fieldTil = textInputLayout2;
    }

    @NonNull
    public static ItemFormBlockFieldTextBinding bind(@NonNull View view) {
        int i11 = R$id.fieldEt;
        TextInputEditText textInputEditText = (TextInputEditText) C2548q.d(i11, view);
        if (textInputEditText == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        TextInputLayout textInputLayout = (TextInputLayout) view;
        return new ItemFormBlockFieldTextBinding(textInputLayout, textInputEditText, textInputLayout);
    }

    @NonNull
    public static ItemFormBlockFieldTextBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_form_block_field_text, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public TextInputLayout getConstraintLayout() {
        return this.rootView;
    }
}
