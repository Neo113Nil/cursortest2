package ru.ozon.app.android.travel.ui.molecules.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.travel.molecules.view.input.TravelEditTextInputLayoutV2;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.app.android.travel.ui.molecules.R$layout;

/* loaded from: classes2.dex */
public final class ViewCommonInputsV2EditInputBinding implements a {

    @NonNull
    public final AppCompatTextView commonInputV2TextInputErrorTv;

    @NonNull
    public final TravelEditTextInputLayoutV2 commonInputV2TextInputMtil;

    @NonNull
    private final View rootView;

    private ViewCommonInputsV2EditInputBinding(@NonNull View view, @NonNull AppCompatTextView appCompatTextView, @NonNull TravelEditTextInputLayoutV2 travelEditTextInputLayoutV2) {
        this.rootView = view;
        this.commonInputV2TextInputErrorTv = appCompatTextView;
        this.commonInputV2TextInputMtil = travelEditTextInputLayoutV2;
    }

    @NonNull
    public static ViewCommonInputsV2EditInputBinding bind(@NonNull View view) {
        int i11 = R$id.commonInputV2TextInputErrorTv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
        if (appCompatTextView != null) {
            i11 = R$id.commonInputV2TextInputMtil;
            TravelEditTextInputLayoutV2 travelEditTextInputLayoutV2 = (TravelEditTextInputLayoutV2) C2548q.d(i11, view);
            if (travelEditTextInputLayoutV2 != null) {
                return new ViewCommonInputsV2EditInputBinding(view, appCompatTextView, travelEditTextInputLayoutV2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewCommonInputsV2EditInputBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_common_inputs_v2_edit_input, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
