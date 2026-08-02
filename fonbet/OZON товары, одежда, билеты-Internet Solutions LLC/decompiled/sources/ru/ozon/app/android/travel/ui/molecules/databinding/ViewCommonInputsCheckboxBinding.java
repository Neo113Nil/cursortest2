package ru.ozon.app.android.travel.ui.molecules.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.app.android.travel.ui.molecules.R$layout;

/* loaded from: classes2.dex */
public final class ViewCommonInputsCheckboxBinding implements a {

    @NonNull
    public final AppCompatTextView commonInputCheckboxErrorTv;

    @NonNull
    public final AppCompatTextView commonInputCheckboxTextTv;

    @NonNull
    public final SwitchMaterial commonInputCheckboxView;

    @NonNull
    private final View rootView;

    private ViewCommonInputsCheckboxBinding(@NonNull View view, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull SwitchMaterial switchMaterial) {
        this.rootView = view;
        this.commonInputCheckboxErrorTv = appCompatTextView;
        this.commonInputCheckboxTextTv = appCompatTextView2;
        this.commonInputCheckboxView = switchMaterial;
    }

    @NonNull
    public static ViewCommonInputsCheckboxBinding bind(@NonNull View view) {
        int i11 = R$id.commonInputCheckboxErrorTv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
        if (appCompatTextView != null) {
            i11 = R$id.commonInputCheckboxTextTv;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView2 != null) {
                i11 = R$id.commonInputCheckboxView;
                SwitchMaterial switchMaterial = (SwitchMaterial) C2548q.d(i11, view);
                if (switchMaterial != null) {
                    return new ViewCommonInputsCheckboxBinding(view, appCompatTextView, appCompatTextView2, switchMaterial);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewCommonInputsCheckboxBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_common_inputs_checkbox, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
