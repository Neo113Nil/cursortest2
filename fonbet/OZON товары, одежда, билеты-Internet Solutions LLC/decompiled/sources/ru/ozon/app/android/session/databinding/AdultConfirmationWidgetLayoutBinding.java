package ru.ozon.app.android.session.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.session.R$id;
import ru.ozon.app.android.session.R$layout;
import ru.ozon.app.android.uikit.databinding.ViewProgressbarBgBinding;
import ru.ozon.app.android.uikit.view.input.MobilizationTextInputLayout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class AdultConfirmationWidgetLayoutBinding implements a {

    @NonNull
    public final LargeButtonView adultConfirmationActionButton;

    @NonNull
    public final TextView adultConfirmationInfo;

    @NonNull
    public final MobilizationTextInputLayout adultConfirmationInputLayout;

    @NonNull
    public final TextView adultInputError;

    @NonNull
    public final ConstraintLayout adultWidget;

    @NonNull
    public final LinearLayout inputContainer;

    @NonNull
    public final ViewProgressbarBgBinding progressBar;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomView termsOfUse;

    @NonNull
    public final TextAtomView topText;

    private AdultConfirmationWidgetLayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LargeButtonView largeButtonView, @NonNull TextView textView, @NonNull MobilizationTextInputLayout mobilizationTextInputLayout, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout2, @NonNull LinearLayout linearLayout, @NonNull ViewProgressbarBgBinding viewProgressbarBgBinding, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.adultConfirmationActionButton = largeButtonView;
        this.adultConfirmationInfo = textView;
        this.adultConfirmationInputLayout = mobilizationTextInputLayout;
        this.adultInputError = textView2;
        this.adultWidget = constraintLayout2;
        this.inputContainer = linearLayout;
        this.progressBar = viewProgressbarBgBinding;
        this.termsOfUse = textAtomView;
        this.topText = textAtomView2;
    }

    @NonNull
    public static AdultConfirmationWidgetLayoutBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.adultConfirmationActionButton;
        LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
        if (largeButtonView != null) {
            i11 = R$id.adultConfirmationInfo;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.adultConfirmationInputLayout;
                MobilizationTextInputLayout mobilizationTextInputLayout = (MobilizationTextInputLayout) C2548q.d(i11, view);
                if (mobilizationTextInputLayout != null) {
                    i11 = R$id.adultInputError;
                    TextView textView2 = (TextView) C2548q.d(i11, view);
                    if (textView2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i11 = R$id.inputContainer;
                        LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                        if (linearLayout != null && (d11 = C2548q.d((i11 = R$id.progressBar), view)) != null) {
                            ViewProgressbarBgBinding bind = ViewProgressbarBgBinding.bind(d11);
                            i11 = R$id.termsOfUse;
                            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                            if (textAtomView != null) {
                                i11 = R$id.topText;
                                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                                if (textAtomView2 != null) {
                                    return new AdultConfirmationWidgetLayoutBinding(constraintLayout, largeButtonView, textView, mobilizationTextInputLayout, textView2, constraintLayout, linearLayout, bind, textAtomView, textAtomView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static AdultConfirmationWidgetLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.adult_confirmation_widget_layout, viewGroup, false);
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
