package ru.ozon.app.android.travel.molecules.view.starsBadge.v1;

import Sc.InterfaceC4008j;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.G;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.core.R$style;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/starsBadge/v1/GradientTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "gradientProgress", "", "setGradientProgress", "(F)V", "onDetachedFromWindow", "()V", "Lru/ozon/app/android/travel/molecules/view/starsBadge/v1/StarsBadgeVI;", "badge", "bind", "(Lru/ozon/app/android/travel/molecules/view/starsBadge/v1/StarsBadgeVI;)V", "", "currentGradientColor", "[I", "Landroid/graphics/LinearGradient;", "shader", "Landroid/graphics/LinearGradient;", "Landroid/animation/ValueAnimator;", "animator$delegate", "LSc/j;", "getAnimator", "()Landroid/animation/ValueAnimator;", "animator", "Landroid/graphics/Matrix;", "matrix", "Landroid/graphics/Matrix;", "Companion", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GradientTextView extends AppCompatTextView {

    /* renamed from: animator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j animator;
    private int[] currentGradientColor;

    @NotNull
    private final Matrix matrix;
    private LinearGradient shader;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/starsBadge/v1/GradientTextView$Companion;", "", "<init>", "()V", "ONE_COLOR_ANIMATE_TIME", "", "CYCLIC_GRADIENT_COEF", "", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradientTextView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.animator = LazyUtilsKt.unsafeLazy(new GradientTextView$animator$2(this));
        this.matrix = new Matrix();
        setTextAlignment(4);
        setTextAppearance(R$style.OzonTextAppearance_BodyControl_300xsmall);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ValueAnimator getAnimator() {
        return (ValueAnimator) this.animator.getValue();
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

    public final void bind(@NotNull final StarsBadgeVI badge) {
        Intrinsics.checkNotNullParameter(badge, "badge");
        setText(badge.getText());
        if (Arrays.equals(badge.getTextGradientColors(), this.currentGradientColor)) {
            return;
        }
        this.currentGradientColor = badge.getTextGradientColors();
        getAnimator().cancel();
        final int[] textGradientColors = badge.getTextGradientColors();
        G.a(this, new Runnable() { // from class: ru.ozon.app.android.travel.molecules.view.starsBadge.v1.GradientTextView$bind$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                ValueAnimator animator;
                Matrix matrix;
                animator = this.getAnimator();
                animator.setFloatValues(0.0f, (textGradientColors.length + 0.7f) * this.getMeasuredWidth());
                animator.setDuration(badge.getTextGradientColors().length * 1700);
                animator.start();
                GradientTextView gradientTextView = this;
                float textSize = this.getTextSize();
                LinearGradient linearGradient = new LinearGradient(-(this.getMeasuredWidth() * textGradientColors.length), 0.0f, 0.0f, textSize * r6.length, textGradientColors, (float[]) null, Shader.TileMode.CLAMP);
                matrix = this.matrix;
                linearGradient.setLocalMatrix(matrix);
                this.getPaint().setShader(linearGradient);
                gradientTextView.shader = linearGradient;
            }
        });
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getAnimator().cancel();
        this.currentGradientColor = null;
    }
}
