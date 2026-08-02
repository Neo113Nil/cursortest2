package ru.ozon.app.android.cs_orders.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.cs_orders.R$id;
import ru.ozon.app.android.uikit.view.input.MobilizationTextInputLayout;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* loaded from: classes11.dex */
public final class WidgetRecipientBinding implements a {

    @NonNull
    public final TextView nameErrorTv;

    @NonNull
    public final AppCompatEditText nameEt;

    @NonNull
    public final MobilizationTextInputLayout nameTil;

    @NonNull
    public final TextView phoneErrorTv;

    @NonNull
    public final AppCompatEditText phoneEt;

    @NonNull
    public final MobilizationTextInputLayout phoneTil;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ButtonV3View saveBa;

    private WidgetRecipientBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull AppCompatEditText appCompatEditText, @NonNull MobilizationTextInputLayout mobilizationTextInputLayout, @NonNull TextView textView2, @NonNull AppCompatEditText appCompatEditText2, @NonNull MobilizationTextInputLayout mobilizationTextInputLayout2, @NonNull ButtonV3View buttonV3View) {
        this.rootView = constraintLayout;
        this.nameErrorTv = textView;
        this.nameEt = appCompatEditText;
        this.nameTil = mobilizationTextInputLayout;
        this.phoneErrorTv = textView2;
        this.phoneEt = appCompatEditText2;
        this.phoneTil = mobilizationTextInputLayout2;
        this.saveBa = buttonV3View;
    }

    @NonNull
    public static WidgetRecipientBinding bind(@NonNull View view) {
        int i11 = R$id.nameErrorTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.nameEt;
            AppCompatEditText appCompatEditText = (AppCompatEditText) C2548q.d(i11, view);
            if (appCompatEditText != null) {
                i11 = R$id.nameTil;
                MobilizationTextInputLayout mobilizationTextInputLayout = (MobilizationTextInputLayout) C2548q.d(i11, view);
                if (mobilizationTextInputLayout != null) {
                    i11 = R$id.phoneErrorTv;
                    TextView textView2 = (TextView) C2548q.d(i11, view);
                    if (textView2 != null) {
                        i11 = R$id.phoneEt;
                        AppCompatEditText appCompatEditText2 = (AppCompatEditText) C2548q.d(i11, view);
                        if (appCompatEditText2 != null) {
                            i11 = R$id.phoneTil;
                            MobilizationTextInputLayout mobilizationTextInputLayout2 = (MobilizationTextInputLayout) C2548q.d(i11, view);
                            if (mobilizationTextInputLayout2 != null) {
                                i11 = R$id.saveBa;
                                ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
                                if (buttonV3View != null) {
                                    return new WidgetRecipientBinding((ConstraintLayout) view, textView, appCompatEditText, mobilizationTextInputLayout, textView2, appCompatEditText2, mobilizationTextInputLayout2, buttonV3View);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
