package ru.ozon.app.android.fresh.checkout.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.airbnb.lottie.LottieAnimationView;
import ru.ozon.app.android.fresh.checkout.R$id;
import ru.ozon.app.android.fresh.checkout.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class FreshHighloadProgressBarBinding implements a {

    @NonNull
    public final LottieAnimationView animationView;

    @NonNull
    public final ConstraintLayout checkoutProgressBarView;

    @NonNull
    public final Guideline guidelineCenter;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomView titleTextAtomView;

    private FreshHighloadProgressBarBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LottieAnimationView lottieAnimationView, @NonNull ConstraintLayout constraintLayout2, @NonNull Guideline guideline, @NonNull TextAtomView textAtomView) {
        this.rootView = constraintLayout;
        this.animationView = lottieAnimationView;
        this.checkoutProgressBarView = constraintLayout2;
        this.guidelineCenter = guideline;
        this.titleTextAtomView = textAtomView;
    }

    @NonNull
    public static FreshHighloadProgressBarBinding bind(@NonNull View view) {
        int i11 = R$id.animationView;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C2548q.d(i11, view);
        if (lottieAnimationView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i11 = R$id.guidelineCenter;
            Guideline guideline = (Guideline) C2548q.d(i11, view);
            if (guideline != null) {
                i11 = R$id.titleTextAtomView;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    return new FreshHighloadProgressBarBinding(constraintLayout, lottieAnimationView, constraintLayout, guideline, textAtomView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FreshHighloadProgressBarBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fresh_highload_progress_bar, viewGroup, false);
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
