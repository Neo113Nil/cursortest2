package ru.ozon.app.android.session.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import ru.ozon.app.android.session.R$id;
import ru.ozon.app.android.session.R$layout;

/* loaded from: classes2.dex */
public final class WidgetEditUserFullNameItemBinding implements a {

    @NonNull
    public final TextInputEditText inputEt;

    @NonNull
    public final TextInputLayout inputTil;

    @NonNull
    private final TextInputLayout rootView;

    private WidgetEditUserFullNameItemBinding(@NonNull TextInputLayout textInputLayout, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout2) {
        this.rootView = textInputLayout;
        this.inputEt = textInputEditText;
        this.inputTil = textInputLayout2;
    }

    @NonNull
    public static WidgetEditUserFullNameItemBinding bind(@NonNull View view) {
        int i11 = R$id.inputEt;
        TextInputEditText textInputEditText = (TextInputEditText) C2548q.d(i11, view);
        if (textInputEditText == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        TextInputLayout textInputLayout = (TextInputLayout) view;
        return new WidgetEditUserFullNameItemBinding(textInputLayout, textInputEditText, textInputLayout);
    }

    @NonNull
    public static WidgetEditUserFullNameItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static WidgetEditUserFullNameItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_edit_user_full_name_item, viewGroup, false);
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
