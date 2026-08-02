package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.app.android.fresh.feature.b2b.R$layout;
import ru.ozon.app.android.pdp.utils.views.input.PdpTextInputLayout;

/* loaded from: classes12.dex */
public final class CommonTextWithErrorInputBinding implements a {

    @NonNull
    public final AppCompatEditText inputET;

    @NonNull
    public final PdpTextInputLayout inputTIL;

    @NonNull
    public final AppCompatTextView inputTextErrorTV;

    @NonNull
    private final View rootView;

    private CommonTextWithErrorInputBinding(@NonNull View view, @NonNull AppCompatEditText appCompatEditText, @NonNull PdpTextInputLayout pdpTextInputLayout, @NonNull AppCompatTextView appCompatTextView) {
        this.rootView = view;
        this.inputET = appCompatEditText;
        this.inputTIL = pdpTextInputLayout;
        this.inputTextErrorTV = appCompatTextView;
    }

    @NonNull
    public static CommonTextWithErrorInputBinding bind(@NonNull View view) {
        int i11 = R$id.inputET;
        AppCompatEditText appCompatEditText = (AppCompatEditText) C2548q.d(i11, view);
        if (appCompatEditText != null) {
            i11 = R$id.inputTIL;
            PdpTextInputLayout pdpTextInputLayout = (PdpTextInputLayout) C2548q.d(i11, view);
            if (pdpTextInputLayout != null) {
                i11 = R$id.inputTextErrorTV;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                if (appCompatTextView != null) {
                    return new CommonTextWithErrorInputBinding(view, appCompatEditText, pdpTextInputLayout, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static CommonTextWithErrorInputBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.common_text_with_error_input, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
