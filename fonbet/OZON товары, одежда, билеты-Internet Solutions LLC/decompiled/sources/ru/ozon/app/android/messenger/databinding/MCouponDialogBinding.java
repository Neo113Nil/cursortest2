package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.controls.button.DataButtonView;
import ru.ozon.uni.android.controls.button.IconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class MCouponDialogBinding implements a {

    @NonNull
    public final LottieAnimationView animationConfetti;

    @NonNull
    public final LottieAnimationView animationCoupon;

    @NonNull
    public final IconButtonView closeIv;

    @NonNull
    public final TextAtomView description;

    @NonNull
    public final AppCompatImageView imageCoupon;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final DataButtonView submitButton;

    @NonNull
    public final TextAtomView title;

    private MCouponDialogBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LottieAnimationView lottieAnimationView, @NonNull LottieAnimationView lottieAnimationView2, @NonNull IconButtonView iconButtonView, @NonNull TextAtomView textAtomView, @NonNull AppCompatImageView appCompatImageView, @NonNull DataButtonView dataButtonView, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.animationConfetti = lottieAnimationView;
        this.animationCoupon = lottieAnimationView2;
        this.closeIv = iconButtonView;
        this.description = textAtomView;
        this.imageCoupon = appCompatImageView;
        this.submitButton = dataButtonView;
        this.title = textAtomView2;
    }

    @NonNull
    public static MCouponDialogBinding bind(@NonNull View view) {
        int i11 = R$id.animationConfetti;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C2548q.d(i11, view);
        if (lottieAnimationView != null) {
            i11 = R$id.animationCoupon;
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) C2548q.d(i11, view);
            if (lottieAnimationView2 != null) {
                i11 = R$id.closeIv;
                IconButtonView iconButtonView = (IconButtonView) C2548q.d(i11, view);
                if (iconButtonView != null) {
                    i11 = R$id.description;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null) {
                        i11 = R$id.imageCoupon;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
                        if (appCompatImageView != null) {
                            i11 = R$id.submitButton;
                            DataButtonView dataButtonView = (DataButtonView) C2548q.d(i11, view);
                            if (dataButtonView != null) {
                                i11 = R$id.title;
                                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                                if (textAtomView2 != null) {
                                    return new MCouponDialogBinding((ConstraintLayout) view, lottieAnimationView, lottieAnimationView2, iconButtonView, textAtomView, appCompatImageView, dataButtonView, textAtomView2);
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
    public static MCouponDialogBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_coupon_dialog, viewGroup, false);
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
