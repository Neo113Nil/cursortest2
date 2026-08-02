package ru.ozon.app.android.session.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.session.R$id;
import ru.ozon.app.android.session.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class WidgetConfirmDeleteOtpLayoutBinding implements a {

    @NonNull
    public final LargeButtonView continueLBV;

    @NonNull
    public final ConstraintLayout deleteOtpContainer;

    @NonNull
    public final TextAtomView descriptionTAV;

    @NonNull
    public final EditText otpEt;

    @NonNull
    public final LargeBorderlessButtonView resendCodeLBBV;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomView titleTAV;

    private WidgetConfirmDeleteOtpLayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LargeButtonView largeButtonView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextAtomView textAtomView, @NonNull EditText editText, @NonNull LargeBorderlessButtonView largeBorderlessButtonView, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.continueLBV = largeButtonView;
        this.deleteOtpContainer = constraintLayout2;
        this.descriptionTAV = textAtomView;
        this.otpEt = editText;
        this.resendCodeLBBV = largeBorderlessButtonView;
        this.titleTAV = textAtomView2;
    }

    @NonNull
    public static WidgetConfirmDeleteOtpLayoutBinding bind(@NonNull View view) {
        int i11 = R$id.continueLBV;
        LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
        if (largeButtonView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i11 = R$id.descriptionTAV;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.otpEt;
                EditText editText = (EditText) C2548q.d(i11, view);
                if (editText != null) {
                    i11 = R$id.resendCodeLBBV;
                    LargeBorderlessButtonView largeBorderlessButtonView = (LargeBorderlessButtonView) C2548q.d(i11, view);
                    if (largeBorderlessButtonView != null) {
                        i11 = R$id.titleTAV;
                        TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView2 != null) {
                            return new WidgetConfirmDeleteOtpLayoutBinding(constraintLayout, largeButtonView, constraintLayout, textAtomView, editText, largeBorderlessButtonView, textAtomView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetConfirmDeleteOtpLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_confirm_delete_otp_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
