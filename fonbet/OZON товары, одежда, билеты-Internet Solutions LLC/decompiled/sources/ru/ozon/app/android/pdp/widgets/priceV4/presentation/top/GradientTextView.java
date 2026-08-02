package ru.ozon.app.android.pdp.widgets.priceV4.presentation.top;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.vo.PriceStarsBadgeVO;
import ru.ozon.uni.core.R$style;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceV4/presentation/top/GradientTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "currentGradientColor", "", "shader", "Landroid/graphics/LinearGradient;", "animator", "Landroid/animation/ValueAnimator;", "matrix", "Landroid/graphics/Matrix;", "onDetachedFromWindow", "", "bind", "badge", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceStarsBadgeVO;", "setGradientProgress", "gradientProgress", "", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GradientTextView extends AppCompatTextView {
    private ValueAnimator animator;
    private int[] currentGradientColor;

    @NotNull
    private final Matrix matrix;
    private LinearGradient shader;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradientTextView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.matrix = new Matrix();
        setTextAlignment(4);
        setTextAppearance(R$style.OzonTextAppearance_BodyControl_300xsmall);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setGradientProgress(float gradientProgress) {
        this.matrix.setTranslate(gradientProgress, 0.0f);
        LinearGradient linearGradient = this.shader;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(this.matrix);
        }
        invalidate();
    }

    public final void bind(@NotNull final PriceStarsBadgeVO badge) {
        int[] textGradientColors;
        Intrinsics.checkNotNullParameter(badge, "badge");
        setText(badge.getText());
        if (Arrays.equals(badge.getTextGradientColors(), this.currentGradientColor)) {
            return;
        }
        this.currentGradientColor = badge.getTextGradientColors();
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer E11 = C7705l.E(badge.getTextGradientColors());
        if (E11 != null) {
            textGradientColors = C7705l.T(badge.getTextGradientColors(), E11.intValue());
        } else {
            textGradientColors = badge.getTextGradientColors();
        }
        final int[] W11 = C7705l.W(textGradientColors);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.pdp.widgets.priceV4.presentation.top.GradientTextView$bind$$inlined$afterMeasured$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                Matrix matrix;
                if (this.getMeasuredWidth() <= 0 || this.getMeasuredHeight() <= 0) {
                    return;
                }
                this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                final GradientTextView gradientTextView = (GradientTextView) this;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, (W11.length + 0.7f) * gradientTextView.getMeasuredWidth());
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.app.android.pdp.widgets.priceV4.presentation.top.GradientTextView$bind$1$1$1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        GradientTextView gradientTextView2 = GradientTextView.this;
                        Object animatedValue = it.getAnimatedValue();
                        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                        gradientTextView2.setGradientProgress(((Float) animatedValue).floatValue());
                    }
                });
                ofFloat.setDuration(badge.getTextGradientColors().length * 1700);
                ofFloat.setRepeatCount(-1);
                ofFloat.setRepeatMode(1);
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.start();
                gradientTextView.animator = ofFloat;
                float textSize = gradientTextView.getTextSize();
                LinearGradient linearGradient = new LinearGradient(-(gradientTextView.getMeasuredWidth() * W11.length), 0.0f, 0.0f, textSize * r8.length, W11, (float[]) null, Shader.TileMode.CLAMP);
                matrix = gradientTextView.matrix;
                linearGradient.setLocalMatrix(matrix);
                gradientTextView.getPaint().setShader(linearGradient);
                gradientTextView.shader = linearGradient;
            }
        });
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.currentGradientColor = null;
    }
}
