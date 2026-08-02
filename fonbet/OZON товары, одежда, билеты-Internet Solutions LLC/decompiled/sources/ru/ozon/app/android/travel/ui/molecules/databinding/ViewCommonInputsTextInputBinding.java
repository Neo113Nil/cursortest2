package ru.ozon.app.android.travel.ui.molecules.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.travel.molecules.view.input.TravelTextInputLayout;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.app.android.travel.ui.molecules.R$layout;

/* loaded from: classes2.dex */
public final class ViewCommonInputsTextInputBinding implements a {

    @NonNull
    public final AppCompatTextView commonInputTextInputErrorTv;

    @NonNull
    public final AppCompatTextView commonInputTextInputEt;

    @NonNull
    public final TravelTextInputLayout commonInputTextInputMtil;

    @NonNull
    private final View rootView;

    private ViewCommonInputsTextInputBinding(@NonNull View view, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull TravelTextInputLayout travelTextInputLayout) {
        this.rootView = view;
        this.commonInputTextInputErrorTv = appCompatTextView;
        this.commonInputTextInputEt = appCompatTextView2;
        this.commonInputTextInputMtil = travelTextInputLayout;
    }

    @NonNull
    public static ViewCommonInputsTextInputBinding bind(@NonNull View view) {
        int i11 = R$id.commonInputTextInputErrorTv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
        if (appCompatTextView != null) {
            i11 = R$id.commonInputTextInputEt;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView2 != null) {
                i11 = R$id.commonInputTextInputMtil;
                TravelTextInputLayout travelTextInputLayout = (TravelTextInputLayout) C2548q.d(i11, view);
                if (travelTextInputLayout != null) {
                    return new ViewCommonInputsTextInputBinding(view, appCompatTextView, appCompatTextView2, travelTextInputLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewCommonInputsTextInputBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_common_inputs_text_input, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
