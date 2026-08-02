package ru.ozon.app.android.fresh.unsorted.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.app.android.uikit.view.input.MobilizationTextInputLayout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class WidgetFeedbackCurtainBinding implements a {

    @NonNull
    public final LargeButtonView btnAction;

    @NonNull
    public final AppCompatEditText etField;

    @NonNull
    public final MobilizationTextInputLayout ltField;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomView textAtomView;

    private WidgetFeedbackCurtainBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LargeButtonView largeButtonView, @NonNull AppCompatEditText appCompatEditText, @NonNull MobilizationTextInputLayout mobilizationTextInputLayout, @NonNull TextAtomView textAtomView) {
        this.rootView = constraintLayout;
        this.btnAction = largeButtonView;
        this.etField = appCompatEditText;
        this.ltField = mobilizationTextInputLayout;
        this.textAtomView = textAtomView;
    }

    @NonNull
    public static WidgetFeedbackCurtainBinding bind(@NonNull View view) {
        int i11 = R$id.btnAction;
        LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
        if (largeButtonView != null) {
            i11 = R$id.etField;
            AppCompatEditText appCompatEditText = (AppCompatEditText) C2548q.d(i11, view);
            if (appCompatEditText != null) {
                i11 = R$id.ltField;
                MobilizationTextInputLayout mobilizationTextInputLayout = (MobilizationTextInputLayout) C2548q.d(i11, view);
                if (mobilizationTextInputLayout != null) {
                    i11 = R$id.textAtomView;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null) {
                        return new WidgetFeedbackCurtainBinding((ConstraintLayout) view, largeButtonView, appCompatEditText, mobilizationTextInputLayout, textAtomView);
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
