package ru.ozon.app.android.ordertracking.v4.presentation.view;

import U7.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ordertracking.v4.presentation.util.marqueeanimation.GradientManager;
import ru.ozon.app.android.ordertracking.v4.presentation.util.marqueeanimation.MarqueeViewAnimationHelper;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000 42\u00020\u0001:\u00014B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0014J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0015J(\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0015J\u001c\u0010 \u001a\u00020\u00152\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u0007H\u0016J\u0015\u0010'\u001a\u00020\u00152\b\u0010(\u001a\u0004\u0018\u00010)¢\u0006\u0002\u0010*J\u0014\u0010+\u001a\u00020\u00152\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00150-J\u0006\u0010.\u001a\u00020\u0015J\u0006\u0010/\u001a\u00020\u0015J\u0006\u00100\u001a\u00020\u0015J\u0006\u00101\u001a\u00020\u0015J \u00102\u001a\u0002032\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/view/OrderTrackingMarqueeView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "originalText", "", "scrollingText", "lastMeasuredWidth", "lastMeasuredHeight", "lastMeasuredText", "animationManager", "Lru/ozon/app/android/ordertracking/v4/presentation/util/marqueeanimation/MarqueeViewAnimationHelper;", "gradientManager", "Lru/ozon/app/android/ordertracking/v4/presentation/util/marqueeanimation/GradientManager;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onSizeChanged", "width", "height", "oldwidth", "oldheight", "setText", "text", "", "type", "Landroid/widget/TextView$BufferType;", "setTextColor", "color", "setAnimationPixelSpeed", "speed", "", "(Ljava/lang/Float;)V", "startAnimation", "onComplete", "Lkotlin/Function0;", "stopAnimation", "stopAnimationWithFade", "pauseAnimation", "resumeAnimation", "shouldRecalculateLayout", "", "Companion", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderTrackingMarqueeView extends AppCompatTextView {

    @NotNull
    private final MarqueeViewAnimationHelper animationManager;

    @NotNull
    private final GradientManager gradientManager;
    private int lastMeasuredHeight;

    @NotNull
    private String lastMeasuredText;
    private int lastMeasuredWidth;

    @NotNull
    private String originalText;

    @NotNull
    private String scrollingText;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderTrackingMarqueeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final boolean shouldRecalculateLayout(String text, int widthMeasureSpec, int heightMeasureSpec) {
        return (Intrinsics.d(text, this.lastMeasuredText) && View.MeasureSpec.getSize(widthMeasureSpec) == this.lastMeasuredWidth && View.MeasureSpec.getSize(heightMeasureSpec) == this.lastMeasuredHeight) ? false : true;
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"LifecycleMethodsOrder"})
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!this.animationManager.getIsAnimationNeeded()) {
            super.onDraw(canvas);
            return;
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        int alpha = getPaint().getAlpha();
        getPaint().setAlpha((int) (this.animationManager.getAlpha() * alpha));
        canvas.save();
        canvas.translate(this.animationManager.getStartScrollingPosition() + getPaddingLeft(), 0.0f);
        canvas.drawText(this.scrollingText, 0.0f, getBaseline(), getPaint());
        canvas.drawText(this.scrollingText, this.animationManager.getTextWidth(), getBaseline(), getPaint());
        getPaint().setAlpha(alpha);
        canvas.restore();
        this.gradientManager.applyGradients(canvas, getWidth(), getHeight(), this.animationManager.getAnimationState() == MarqueeViewAnimationHelper.AnimationState.RUNNING);
        canvas.restoreToCount(saveLayer);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        String str = this.originalText;
        TextView.BufferType bufferType = TextView.BufferType.NORMAL;
        super.setText(str, bufferType);
        if (!shouldRecalculateLayout(this.originalText, widthMeasureSpec, heightMeasureSpec)) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int size = (View.MeasureSpec.getSize(widthMeasureSpec) - getPaddingLeft()) - getPaddingRight();
        this.animationManager.setAnimationNeeded(getPaint().measureText(this.originalText) > ((float) size));
        if (this.animationManager.getIsAnimationNeeded()) {
            String e11 = d.e(this.originalText, "  •  ");
            this.scrollingText = e11;
            MarqueeViewAnimationHelper marqueeViewAnimationHelper = this.animationManager;
            TextPaint paint = getPaint();
            Intrinsics.checkNotNullExpressionValue(paint, "getPaint(...)");
            marqueeViewAnimationHelper.setupAnimator(e11, paint);
        } else {
            super.setText(this.originalText, bufferType);
        }
        this.lastMeasuredWidth = View.MeasureSpec.getSize(widthMeasureSpec);
        this.lastMeasuredHeight = View.MeasureSpec.getSize(heightMeasureSpec);
        this.lastMeasuredText = this.originalText;
    }

    @Override // android.view.View
    @SuppressLint({"LifecycleMethodsOrder"})
    protected void onSizeChanged(int width, int height, int oldwidth, int oldheight) {
        super.onSizeChanged(width, height, oldwidth, oldheight);
        this.gradientManager.setupGradients(width);
        if (!(width == oldwidth && height == oldheight) && this.animationManager.getIsAnimationNeeded()) {
            MarqueeViewAnimationHelper marqueeViewAnimationHelper = this.animationManager;
            String str = this.scrollingText;
            TextPaint paint = getPaint();
            Intrinsics.checkNotNullExpressionValue(paint, "getPaint(...)");
            marqueeViewAnimationHelper.setupAnimator(str, paint);
        }
    }

    public final void pauseAnimation() {
        this.animationManager.pauseAnimation();
    }

    public final void resumeAnimation() {
        this.animationManager.resumeAnimation();
    }

    public final void setAnimationPixelSpeed(Float speed) {
        this.animationManager.setAnimationPixelSpeed(speed);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence text, TextView.BufferType type) {
        String str;
        if (Intrinsics.d(this.originalText, text != null ? text.toString() : null)) {
            return;
        }
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        this.originalText = str;
        requestLayout();
    }

    @Override // android.widget.TextView
    public void setTextColor(int color) {
        super.setTextColor(color);
        getPaint().setColor(color);
    }

    public final void startAnimation(@NotNull Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        this.animationManager.startAnimation(onComplete);
    }

    public final void stopAnimation() {
        this.animationManager.stopAnimation();
    }

    public final void stopAnimationWithFade() {
        this.animationManager.stopAnimationWithFade();
    }

    public /* synthetic */ OrderTrackingMarqueeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderTrackingMarqueeView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.originalText = "";
        this.scrollingText = "";
        this.lastMeasuredText = "";
        this.animationManager = new MarqueeViewAnimationHelper(new OrderTrackingMarqueeView$animationManager$1(this));
        this.gradientManager = new GradientManager();
        setSingleLine();
    }
}
