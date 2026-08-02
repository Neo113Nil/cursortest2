package ru.ozon.app.android.cs_orders.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputEditText;
import ru.ozon.app.android.cs_orders.R$id;
import ru.ozon.app.android.uikit.view.input.MobilizationTextInputLayout;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* loaded from: classes11.dex */
public final class WidgetDeliveryDateChangedComplaintFormInputBinding implements a {

    @NonNull
    public final AppCompatTextView commentErrorTv;

    @NonNull
    public final TextInputEditText commentTiet;

    @NonNull
    public final MobilizationTextInputLayout commentTil;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final ButtonV3View submitBtn;

    private WidgetDeliveryDateChangedComplaintFormInputBinding(@NonNull LinearLayout linearLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull TextInputEditText textInputEditText, @NonNull MobilizationTextInputLayout mobilizationTextInputLayout, @NonNull ButtonV3View buttonV3View) {
        this.rootView = linearLayout;
        this.commentErrorTv = appCompatTextView;
        this.commentTiet = textInputEditText;
        this.commentTil = mobilizationTextInputLayout;
        this.submitBtn = buttonV3View;
    }

    @NonNull
    public static WidgetDeliveryDateChangedComplaintFormInputBinding bind(@NonNull View view) {
        int i11 = R$id.commentErrorTv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
        if (appCompatTextView != null) {
            i11 = R$id.commentTiet;
            TextInputEditText textInputEditText = (TextInputEditText) C2548q.d(i11, view);
            if (textInputEditText != null) {
                i11 = R$id.commentTil;
                MobilizationTextInputLayout mobilizationTextInputLayout = (MobilizationTextInputLayout) C2548q.d(i11, view);
                if (mobilizationTextInputLayout != null) {
                    i11 = R$id.submitBtn;
                    ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
                    if (buttonV3View != null) {
                        return new WidgetDeliveryDateChangedComplaintFormInputBinding((LinearLayout) view, appCompatTextView, textInputEditText, mobilizationTextInputLayout, buttonV3View);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
