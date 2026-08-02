package ru.ozon.app.android.checkout.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.airbnb.lottie.LottieAnimationView;
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.app.android.checkout.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes11.dex */
public final class HighloadProgressBarBinding implements a {

    @NonNull
    public final LottieAnimationView animationView;

    @NonNull
    public final Guideline guidelineCenter;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomView titleTextAtomView;

    private HighloadProgressBarBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LottieAnimationView lottieAnimationView, @NonNull Guideline guideline, @NonNull TextAtomView textAtomView) {
        this.rootView = constraintLayout;
        this.animationView = lottieAnimationView;
        this.guidelineCenter = guideline;
        this.titleTextAtomView = textAtomView;
    }

    @NonNull
    public static HighloadProgressBarBinding bind(@NonNull View view) {
        int i11 = R$id.animationView;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C2548q.d(i11, view);
        if (lottieAnimationView != null) {
            i11 = R$id.guidelineCenter;
            Guideline guideline = (Guideline) C2548q.d(i11, view);
            if (guideline != null) {
                i11 = R$id.titleTextAtomView;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    return new HighloadProgressBarBinding((ConstraintLayout) view, lottieAnimationView, guideline, textAtomView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static HighloadProgressBarBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.highload_progress_bar, viewGroup, false);
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
