package ru.ozon.app.android.session.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import ru.ozon.app.android.session.R$id;
import ru.ozon.app.android.session.R$layout;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInputLayout;

/* loaded from: classes2.dex */
public final class WidgetOtpBinding implements a {

    @NonNull
    public final LinearLayout hintButtonsContainer;

    @NonNull
    public final ConstraintLayout otpCl;

    @NonNull
    public final Group otpDefaultPageGroup;

    @NonNull
    public final Image otpErrorImageView;

    @NonNull
    public final Group otpErrorPageGroup;

    @NonNull
    public final ButtonView otpErrorRetryButton;

    @NonNull
    public final TextAtomV2View otpErrorTitleTextAtomView;

    @NonNull
    public final OzonTextInputLayout otpEt;

    @NonNull
    public final ButtonView retrySendCodeButton;

    @NonNull
    public final ScrollView rootSv;

    @NonNull
    private final ScrollView rootView;

    @NonNull
    public final TextAtomV2View subtitleTv;

    @NonNull
    public final TextView titleTv;

    private WidgetOtpBinding(@NonNull ScrollView scrollView, @NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout, @NonNull Group group, @NonNull Image image, @NonNull Group group2, @NonNull ButtonView buttonView, @NonNull TextAtomV2View textAtomV2View, @NonNull OzonTextInputLayout ozonTextInputLayout, @NonNull ButtonView buttonView2, @NonNull ScrollView scrollView2, @NonNull TextAtomV2View textAtomV2View2, @NonNull TextView textView) {
        this.rootView = scrollView;
        this.hintButtonsContainer = linearLayout;
        this.otpCl = constraintLayout;
        this.otpDefaultPageGroup = group;
        this.otpErrorImageView = image;
        this.otpErrorPageGroup = group2;
        this.otpErrorRetryButton = buttonView;
        this.otpErrorTitleTextAtomView = textAtomV2View;
        this.otpEt = ozonTextInputLayout;
        this.retrySendCodeButton = buttonView2;
        this.rootSv = scrollView2;
        this.subtitleTv = textAtomV2View2;
        this.titleTv = textView;
    }

    @NonNull
    public static WidgetOtpBinding bind(@NonNull View view) {
        int i11 = R$id.hintButtonsContainer;
        LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
        if (linearLayout != null) {
            i11 = R$id.otpCl;
            ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
            if (constraintLayout != null) {
                i11 = R$id.otpDefaultPageGroup;
                Group group = (Group) C2548q.d(i11, view);
                if (group != null) {
                    i11 = R$id.otpErrorImageView;
                    Image image = (Image) C2548q.d(i11, view);
                    if (image != null) {
                        i11 = R$id.otpErrorPageGroup;
                        Group group2 = (Group) C2548q.d(i11, view);
                        if (group2 != null) {
                            i11 = R$id.otpErrorRetryButton;
                            ButtonView buttonView = (ButtonView) C2548q.d(i11, view);
                            if (buttonView != null) {
                                i11 = R$id.otpErrorTitleTextAtomView;
                                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                                if (textAtomV2View != null) {
                                    i11 = R$id.otpEt;
                                    OzonTextInputLayout ozonTextInputLayout = (OzonTextInputLayout) C2548q.d(i11, view);
                                    if (ozonTextInputLayout != null) {
                                        i11 = R$id.retrySendCodeButton;
                                        ButtonView buttonView2 = (ButtonView) C2548q.d(i11, view);
                                        if (buttonView2 != null) {
                                            ScrollView scrollView = (ScrollView) view;
                                            i11 = R$id.subtitleTv;
                                            TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                                            if (textAtomV2View2 != null) {
                                                i11 = R$id.titleTv;
                                                TextView textView = (TextView) C2548q.d(i11, view);
                                                if (textView != null) {
                                                    return new WidgetOtpBinding(scrollView, linearLayout, constraintLayout, group, image, group2, buttonView, textAtomV2View, ozonTextInputLayout, buttonView2, scrollView, textAtomV2View2, textView);
                                                }
                                            }
                                        }
                                    }
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
    public static WidgetOtpBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_otp, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ScrollView getConstraintLayout() {
        return this.rootView;
    }
}
