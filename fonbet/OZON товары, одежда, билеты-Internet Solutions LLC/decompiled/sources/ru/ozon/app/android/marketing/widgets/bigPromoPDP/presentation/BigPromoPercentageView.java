package ru.ozon.app.android.marketing.widgets.bigPromoPDP.presentation;

import Pk0.h;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mz.C8355a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.bigPromoPDP.data.BigPromoPDPDTO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u0000 .2\u00020\u0001:\u0001.B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0014J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0014J\u0018\u0010\"\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&J\u0006\u0010'\u001a\u00020\u001cJ\u000e\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u000fJ\u0010\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u000fH\u0002J\u0010\u0010,\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010-\u001a\u00020\u000fH\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPercentageView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentPercentage", "indicatorColor", "bgColor", "dp8", "dp8Float", "", "dp32Float", "animator", "Landroid/animation/ValueAnimator;", "indicatorPaint", "Landroid/graphics/Paint;", "bgPaint", "bgpath", "Landroid/graphics/Path;", "rect", "Landroid/graphics/RectF;", "bgRect", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "bindOrGone", "data", "Lru/ozon/app/android/marketing/widgets/bigPromoPDP/data/BigPromoPDPDTO$AnimatedCounterDTO;", "shouldAnimateProgress", "", "cancelAnimation", "restartAnimation", "percentage", "startAnimation", "dtoPercentage", "drawInnerArc", "getCurrentPercentageToFill", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BigPromoPercentageView extends View {
    private ValueAnimator animator;
    private int bgColor;

    @NotNull
    private final Paint bgPaint;

    @NotNull
    private final RectF bgRect;

    @NotNull
    private final Path bgpath;
    private int currentPercentage;
    private final float dp32Float;
    private final int dp8;
    private final float dp8Float;
    private int indicatorColor;

    @NotNull
    private final Paint indicatorPaint;

    @NotNull
    private final RectF rect;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPercentageView$Companion;", "", "<init>", "()V", "ZERO_ANGLE", "", "START_ANGLE", "END_ANGLE", "ARC_FULL_ROTATION_DEGREE", "", "PERCENTAGE_DIVIDER", "", "DIRECTION_PERCENTAGE", "ANIM_DURATION", "", "PERCENTAGE_VALUE_HOLDER", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ BigPromoPercentageView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void drawInnerArc(Canvas canvas) {
        canvas.drawArc(this.rect, 270.0f, getCurrentPercentageToFill(), false, this.indicatorPaint);
    }

    private final float getCurrentPercentageToFill() {
        return (float) ((this.currentPercentage / 100.0d) * 360);
    }

    private final void startAnimation(float dtoPercentage) {
        int i11 = 0;
        if (this.animator != null) {
            return;
        }
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("percentage", -100.0f, dtoPercentage * (-100.0f));
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setValues(ofFloat);
        valueAnimator.setDuration(700L);
        valueAnimator.addUpdateListener(new C8355a(this, i11));
        valueAnimator.start();
        this.animator = valueAnimator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimation$lambda$3$lambda$2(BigPromoPercentageView bigPromoPercentageView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue("percentage");
        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        bigPromoPercentageView.currentPercentage = (int) ((Float) animatedValue).floatValue();
        bigPromoPercentageView.invalidate();
    }

    public final void bindOrGone(BigPromoPDPDTO.AnimatedCounterDTO data, boolean shouldAnimateProgress) {
        if (data == null) {
            ViewExtKt.gone(this);
            return;
        }
        ViewExtKt.show(this);
        Paint paint = this.indicatorPaint;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        paint.setColor(styleParser.parseColor(context, data.getCircleAccentColor(), R$color.black));
        Paint paint2 = this.bgPaint;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        paint2.setColor(styleParser.parseColor(context2, data.getCircleBackgroundColor(), R$color.black));
        this.currentPercentage = (int) (data.getPercentage() * (-100.0f));
        if (shouldAnimateProgress) {
            startAnimation(data.getPercentage());
        } else {
            invalidate();
        }
    }

    public final void cancelAnimation() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.animator = null;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.bgpath.reset();
        this.bgpath.arcTo(this.bgRect, 0.0f, 359.0f);
        canvas.drawPath(this.bgpath, this.bgPaint);
        drawInnerArc(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(ResourceExtKt.toPx(40, context), 1073741824);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        setMeasuredDimension(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(ResourceExtKt.toPx(40, context2), 1073741824));
    }

    public final void restartAnimation(float percentage) {
        cancelAnimation();
        startAnimation(percentage);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BigPromoPercentageView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.currentPercentage = -7829368;
        this.indicatorColor = -16711936;
        int px = ResourceExtKt.toPx(8);
        this.dp8 = px;
        float px2 = ResourceExtKt.toPx(8);
        this.dp8Float = px2;
        float px3 = ResourceExtKt.toPx(32);
        this.dp32Float = px3;
        Paint a11 = h.a(true);
        Paint.Style style = Paint.Style.STROKE;
        a11.setStyle(style);
        a11.setStrokeWidth(px);
        a11.setColor(this.indicatorColor);
        Paint.Join join = Paint.Join.ROUND;
        a11.setStrokeJoin(join);
        Paint.Cap cap = Paint.Cap.ROUND;
        a11.setStrokeCap(cap);
        a11.setPathEffect(new CornerPathEffect(1.0f));
        this.indicatorPaint = a11;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(style);
        paint.setStrokeWidth(px);
        paint.setColor(this.bgColor);
        paint.setStrokeJoin(join);
        paint.setStrokeCap(cap);
        paint.setPathEffect(new CornerPathEffect(1.0f));
        this.bgPaint = paint;
        this.bgpath = new Path();
        this.rect = new RectF(px2, px2, px3, px3);
        this.bgRect = new RectF(px2, px2, px3, px3);
    }
}
