package ru.ozon.app.android.orderdone.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import ru.ozon.app.android.orderdone.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;

/* loaded from: classes13.dex */
public final class WidgetOrderDonePaymentStatusBinding implements a {

    @NonNull
    public final ImageView iconIv;

    @NonNull
    public final LottieAnimationView processingAnimationLav;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final Barrier subtitleBottomBarrier;

    @NonNull
    public final HorizontalFlexAtomsLayout subtitleHal;

    @NonNull
    public final TextAtomView subtitleTav;

    @NonNull
    public final Barrier subtitleTopBarrier;

    @NonNull
    public final TextAtomView timerTv;

    @NonNull
    public final TextAtomView titleTav;

    private WidgetOrderDonePaymentStatusBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull LottieAnimationView lottieAnimationView, @NonNull Barrier barrier, @NonNull HorizontalFlexAtomsLayout horizontalFlexAtomsLayout, @NonNull TextAtomView textAtomView, @NonNull Barrier barrier2, @NonNull TextAtomView textAtomView2, @NonNull TextAtomView textAtomView3) {
        this.rootView = constraintLayout;
        this.iconIv = imageView;
        this.processingAnimationLav = lottieAnimationView;
        this.subtitleBottomBarrier = barrier;
        this.subtitleHal = horizontalFlexAtomsLayout;
        this.subtitleTav = textAtomView;
        this.subtitleTopBarrier = barrier2;
        this.timerTv = textAtomView2;
        this.titleTav = textAtomView3;
    }

    @NonNull
    public static WidgetOrderDonePaymentStatusBinding bind(@NonNull View view) {
        int i11 = R$id.iconIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.processingAnimationLav;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) C2548q.d(i11, view);
            if (lottieAnimationView != null) {
                i11 = R$id.subtitleBottomBarrier;
                Barrier barrier = (Barrier) C2548q.d(i11, view);
                if (barrier != null) {
                    i11 = R$id.subtitleHal;
                    HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = (HorizontalFlexAtomsLayout) C2548q.d(i11, view);
                    if (horizontalFlexAtomsLayout != null) {
                        i11 = R$id.subtitleTav;
                        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView != null) {
                            i11 = R$id.subtitleTopBarrier;
                            Barrier barrier2 = (Barrier) C2548q.d(i11, view);
                            if (barrier2 != null) {
                                i11 = R$id.timerTv;
                                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                                if (textAtomView2 != null) {
                                    i11 = R$id.titleTav;
                                    TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                                    if (textAtomView3 != null) {
                                        return new WidgetOrderDonePaymentStatusBinding((ConstraintLayout) view, imageView, lottieAnimationView, barrier, horizontalFlexAtomsLayout, textAtomView, barrier2, textAtomView2, textAtomView3);
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

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
