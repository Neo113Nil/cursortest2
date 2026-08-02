package ru.ozon.app.android.travel.molecules.view.progressView;

import Bi.a;
import Bu.d;
import Ij.C3261b;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.core.content.res.g;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$font;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.PaintExtKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\f\b\u0007\u0018\u0000 A2\u00020\u0001:\u0001AB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u00020\u00062\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u00062\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b \u0010\u000fR\u0014\u0010!\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R$\u0010\r\u001a\u00020-2\u0006\u00103\u001a\u00020-8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\r\u0010/\"\u0004\b4\u00105R*\u00107\u001a\u0002062\u0006\u00103\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R*\u0010=\u001a\u00020-2\u0006\u00103\u001a\u00020-8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010/\u001a\u0004\b>\u0010?\"\u0004\b@\u00105¨\u0006B"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/progressView/TravelHorizontalProgressView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "recalculateBounds", "()V", "updateBackgroundRect", "updateFillRect", "updateTextBaseline", "", "percent", "animateProgress", "(I)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "color", "setBarColor", "(Ljava/lang/Integer;)V", "setFillColor", "setProgress", "defaultBarColor", "I", "defaultFillColor", "Landroid/graphics/Paint;", "barPaint", "Landroid/graphics/Paint;", "fillPaint", "textPaint", "Landroid/graphics/RectF;", "backgroundRectBounds", "Landroid/graphics/RectF;", "fillRectBounds", "", "textBaseline", "F", "Landroid/animation/ValueAnimator;", "animator", "Landroid/animation/ValueAnimator;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "setPercent", "(F)V", "", "text", "Ljava/lang/CharSequence;", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "fillRadius", "getFillRadius", "()F", "setFillRadius", "Companion", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelHorizontalProgressView extends View {
    private ValueAnimator animator;

    @NotNull
    private final RectF backgroundRectBounds;

    @NotNull
    private final Paint barPaint;
    private final int defaultBarColor;
    private final int defaultFillColor;

    @NotNull
    private final Paint fillPaint;
    private float fillRadius;

    @NotNull
    private final RectF fillRectBounds;
    private float percent;

    @NotNull
    private CharSequence text;
    private float textBaseline;

    @NotNull
    private final Paint textPaint;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/progressView/TravelHorizontalProgressView$Companion;", "", "<init>", "()V", "DEFAULT_ANIMATION_DURATION", "", "MAX_VALUE", "", "MIN_VALUE", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelHorizontalProgressView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int themeColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        this.defaultBarColor = themeColor;
        int themeColor2 = ThemeExtKt.themeColor(context, R$attr.graphicPositivePrimary);
        this.defaultFillColor = themeColor2;
        this.barPaint = C3261b.b(1, themeColor);
        this.fillPaint = C3261b.b(1, themeColor2);
        Paint paint = new Paint(1);
        paint.setTypeface(g.e(R$font.onest_medium, context));
        paint.setTextSize(ResourceExtKt.toPxF(12, context));
        paint.setColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        paint.setTextAlign(Paint.Align.CENTER);
        this.textPaint = paint;
        this.backgroundRectBounds = new RectF();
        this.fillRectBounds = new RectF();
        this.text = "";
        this.fillRadius = ResourceExtKt.toPxF(16, context);
    }

    private final void animateProgress(int percent) {
        int i11 = 2;
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.percent, percent / 100.0f);
        ofFloat.setDuration(700L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new d(this, i11));
        this.animator = ofFloat;
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateProgress$lambda$5$lambda$4(TravelHorizontalProgressView travelHorizontalProgressView, ValueAnimator valueAnimator) {
        travelHorizontalProgressView.setPercent(((Float) a.b(valueAnimator, "valueAnimator", "null cannot be cast to non-null type kotlin.Float")).floatValue());
        travelHorizontalProgressView.invalidate();
    }

    private final void recalculateBounds() {
        updateBackgroundRect();
        updateFillRect();
        updateTextBaseline();
        invalidate();
    }

    private final void setPercent(float f7) {
        this.percent = f7;
        updateFillRect();
    }

    private final void updateBackgroundRect() {
        this.backgroundRectBounds.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
    }

    private final void updateFillRect() {
        RectF rectF = this.fillRectBounds;
        rectF.set(this.backgroundRectBounds);
        if (this.percent < 1.0f) {
            float width = rectF.width();
            if (width <= 0.0f) {
                rectF.right = rectF.left;
                return;
            }
            float f7 = 2 * this.fillRadius;
            float f11 = ((width - f7) * this.percent) + f7;
            if (f11 <= width) {
                width = f11;
            }
            rectF.right = rectF.left + width;
        }
    }

    private final void updateTextBaseline() {
        this.textBaseline = PaintExtKt.getBaseline(this.textPaint, getHeight() / 2.0f);
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        RectF rectF = this.backgroundRectBounds;
        float f7 = this.fillRadius;
        canvas.drawRoundRect(rectF, f7, f7, this.barPaint);
        if (this.percent > 0.0f) {
            RectF rectF2 = this.fillRectBounds;
            float f11 = this.fillRadius;
            canvas.drawRoundRect(rectF2, f11, f11, this.fillPaint);
        }
        CharSequence charSequence = this.text;
        canvas.drawText(charSequence, 0, charSequence.length(), getWidth() / 2.0f, this.textBaseline, this.textPaint);
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (changed) {
            recalculateBounds();
        }
    }

    public final void setBarColor(Integer color) {
        this.barPaint.setColor(color != null ? color.intValue() : this.defaultBarColor);
        invalidate();
    }

    public final void setFillColor(Integer color) {
        this.fillPaint.setColor(color != null ? color.intValue() : this.defaultFillColor);
        invalidate();
    }

    public final void setFillRadius(float f7) {
        this.fillRadius = f7;
        invalidate();
    }

    public final void setProgress(int percent) {
        animateProgress(h.e(percent, 0, 100));
    }

    public final void setText(@NotNull CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.text = value;
        invalidate();
    }
}
