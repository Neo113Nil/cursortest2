package ru.ozon.app.android.travel.ui.molecules.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.travel.molecules.view.input.TravelTextInputLayoutV2;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.app.android.travel.ui.molecules.R$layout;

/* loaded from: classes2.dex */
public final class ViewCommonInputsV2TextInputBinding implements a {

    @NonNull
    public final AppCompatTextView commonInputV2TextInputErrorTv;

    @NonNull
    public final AppCompatTextView commonInputV2TextInputEt;

    @NonNull
    public final TravelTextInputLayoutV2 commonInputV2TextInputMtil;

    @NonNull
    private final View rootView;

    private ViewCommonInputsV2TextInputBinding(@NonNull View view, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull TravelTextInputLayoutV2 travelTextInputLayoutV2) {
        this.rootView = view;
        this.commonInputV2TextInputErrorTv = appCompatTextView;
        this.commonInputV2TextInputEt = appCompatTextView2;
        this.commonInputV2TextInputMtil = travelTextInputLayoutV2;
    }

    @NonNull
    public static ViewCommonInputsV2TextInputBinding bind(@NonNull View view) {
        int i11 = R$id.commonInputV2TextInputErrorTv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
        if (appCompatTextView != null) {
            i11 = R$id.commonInputV2TextInputEt;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView2 != null) {
                i11 = R$id.commonInputV2TextInputMtil;
                TravelTextInputLayoutV2 travelTextInputLayoutV2 = (TravelTextInputLayoutV2) C2548q.d(i11, view);
                if (travelTextInputLayoutV2 != null) {
                    return new ViewCommonInputsV2TextInputBinding(view, appCompatTextView, appCompatTextView2, travelTextInputLayoutV2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewCommonInputsV2TextInputBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_common_inputs_v2_text_input, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
