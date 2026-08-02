package ru.ozon.app.android.pdp.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.view.ViewExtKt;
import ru.ozon.app.android.product.common.wave.WaveModel;
import ru.ozon.app.android.product.common.wave.WaveView;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\t\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a9\u0010\u0013\u001a\u00020\u0012*\u00020\u000b2\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0017\u001a\u00020\u0003*\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/constraintlayout/helper/widget/Flow;", "flow", "", "cleanUpFlow", "(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/helper/widget/Flow;)V", "Lru/ozon/app/android/product/common/wave/WaveView;", "", "waveWidth", "bind", "(Lru/ozon/app/android/product/common/wave/WaveView;F)V", "Landroid/view/View;", "", "targetValue", "", "duration", "Lkotlin/Function0;", "onEnd", "Landroid/animation/ValueAnimator;", "animateWidthAndFade", "(Landroid/view/View;IJLkotlin/jvm/functions/Function0;)Landroid/animation/ValueAnimator;", "", "colorToken", "bindBackground", "(Landroid/view/View;Ljava/lang/String;)V", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ViewExtKt {
    @NotNull
    public static final ValueAnimator animateWidthAndFade(@NotNull final View view, final int i11, long j11, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ValueAnimator ofInt = ValueAnimator.ofInt(view.getMeasuredWidth() == i11 ? 0 : view.getMeasuredWidth(), i11);
        ofInt.setDuration(j11);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: KC.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ViewExtKt.animateWidthAndFade$lambda$7$lambda$5(view, i11, valueAnimator);
            }
        });
        ofInt.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.pdp.view.ViewExtKt$animateWidthAndFade$lambda$7$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                Function0 function02 = Function0.this;
                if (function02 != null) {
                    function02.invoke();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        ofInt.start();
        Intrinsics.checkNotNullExpressionValue(ofInt, "also(...)");
        return ofInt;
    }

    public static /* synthetic */ ValueAnimator animateWidthAndFade$default(View view, int i11, long j11, Function0 function0, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        if ((i12 & 2) != 0) {
            j11 = 600;
        }
        if ((i12 & 4) != 0) {
            function0 = null;
        }
        return animateWidthAndFade(view, i11, j11, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateWidthAndFade$lambda$7$lambda$5(View view, int i11, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        view.setAlpha(view.getMeasuredWidth() < i11 ? it.getAnimatedFraction() : 1.0f - it.getAnimatedFraction());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.width = ((Integer) animatedValue).intValue();
        view.setLayoutParams(layoutParams);
    }

    public static final void bind(@NotNull WaveView waveView, float f7) {
        Intrinsics.checkNotNullParameter(waveView, "<this>");
        waveView.bind(new WaveModel(f7, 0, 2, null));
    }

    public static final void bindBackground(@NotNull View view, String str) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, str);
        if (parseColor != null) {
            view.setBackgroundColor(parseColor.intValue());
        } else {
            view.setBackground(null);
        }
    }

    public static final void cleanUpFlow(@NotNull ConstraintLayout constraintLayout, @NotNull Flow flow) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<this>");
        Intrinsics.checkNotNullParameter(flow, "flow");
        int[] referencedIds = flow.getReferencedIds();
        Intrinsics.checkNotNullExpressionValue(referencedIds, "getReferencedIds(...)");
        for (int i11 : referencedIds) {
            constraintLayout.removeView(constraintLayout.getViewById(i11));
        }
        flow.setReferencedIds(new int[0]);
    }
}
