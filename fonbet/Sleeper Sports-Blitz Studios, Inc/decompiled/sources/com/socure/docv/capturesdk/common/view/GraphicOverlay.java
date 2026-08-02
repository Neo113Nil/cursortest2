package com.socure.docv.capturesdk.common.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.res.ResourcesCompat;
import com.socure.docv.capturesdk.R;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.utils.AnimationUtilsKt;
import com.socure.docv.capturesdk.common.utils.ImageUtils;
import com.socure.docv.capturesdk.common.view.model.GridLine;
import com.socure.docv.capturesdk.common.view.model.GridLines;
import com.socure.docv.capturesdk.feature.scanner.data.Dimension;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.sentry.Session;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GraphicOverlay.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010*\u001a\u00020\u001dJ\u001c\u0010+\u001a\u00020\u001d2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0-2\u0006\u0010.\u001a\u00020/J*\u00100\u001a\u00020\u001d2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0-2\u0006\u0010.\u001a\u00020/2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001d02J\u0010\u00103\u001a\u00020\u001d2\u0006\u00104\u001a\u000205H\u0014J\b\u00106\u001a\u00020\u001dH\u0002J\u0006\u00107\u001a\u00020\u001dJ\u001e\u00108\u001a\u00020\u001d2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0-2\u0006\u0010.\u001a\u00020/H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u001d0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u001d0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u001d0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/socure/docv/capturesdk/common/view/GraphicOverlay;", "Landroid/view/View;", "context", "Landroid/content/Context;", Session.JsonKeys.ATTRS, "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "corners", "", "", "fillPaint", "Landroid/graphics/Paint;", "fillPath", "Landroid/graphics/Path;", "green", "", "gridLines", "Lcom/socure/docv/capturesdk/common/view/model/GridLines;", "gridPaint", "Lkotlin/Lazy;", "isCaptureAnimationInProgress", "", "lock", "", "onClearAnimationUpdate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "percentage", "", "onDrawAnimationUpdate", "animatedValue", "onShowTickGraphic", "paint", "paintStrokeWidth", "successVectorDimen", "translucentGreen", "translucentGreenDark", "translucentWhite", "vectorDrawable", "Landroid/graphics/drawable/Drawable;", "white", "clear", "drawRect", "coords", "", "dimension", "Lcom/socure/docv/capturesdk/feature/scanner/data/Dimension;", "drawRectWithAnimation", "completionCallback", "Lkotlin/Function0;", "onDraw", "canvas", "Landroid/graphics/Canvas;", MetricTracker.Object.RESET, "resetAnimation", "setCornersAndPaint", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GraphicOverlay extends View {
    private final List<Float> corners;
    private final Paint fillPaint;
    private final Path fillPath;
    private final int green;
    private GridLines gridLines;
    private Lazy<? extends Paint> gridPaint;
    private boolean isCaptureAnimationInProgress;
    private final Object lock;
    private final Function1<Float, Unit> onClearAnimationUpdate;
    private final Function1<Float, Unit> onDrawAnimationUpdate;
    private final Function1<Float, Unit> onShowTickGraphic;
    private final Paint paint;
    private final float paintStrokeWidth;
    private final float successVectorDimen;
    private final int translucentGreen;
    private final int translucentGreenDark;
    private final int translucentWhite;
    private Drawable vectorDrawable;
    private final int white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphicOverlay(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.lock = new Object();
        this.corners = new ArrayList();
        this.paint = new Paint();
        this.fillPaint = new Paint();
        this.fillPath = new Path();
        this.green = ResourcesCompat.getColor(getResources(), R.color.socure_green, null);
        this.translucentGreen = ResourcesCompat.getColor(getResources(), R.color.socure_translucent_green, null);
        this.translucentGreenDark = ResourcesCompat.getColor(getResources(), R.color.socure_translucent_green_dark, null);
        this.white = ResourcesCompat.getColor(getResources(), R.color.socure_white, null);
        this.translucentWhite = ResourcesCompat.getColor(getResources(), R.color.socure_translucent_white, null);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, R.styleable.GraphicOverlaySocure, 0, 0);
        this.paintStrokeWidth = obtainStyledAttributes.getDimension(R.styleable.GraphicOverlaySocure_paint_stroke_width_socure, obtainStyledAttributes.getResources().getDimension(R.dimen.capture_animation_paint_stroke_socure));
        this.successVectorDimen = obtainStyledAttributes.getDimension(R.styleable.GraphicOverlaySocure_success_vector_dimen_socure, obtainStyledAttributes.getResources().getDimension(R.dimen.capture_animation_tick_dimen_socure));
        this.gridPaint = LazyKt.lazy(new Function0<Paint>() { // from class: com.socure.docv.capturesdk.common.view.GraphicOverlay$1$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Paint invoke() {
                int i;
                float f;
                float f2;
                float f3;
                Paint paint = new Paint();
                GraphicOverlay graphicOverlay = GraphicOverlay.this;
                i = graphicOverlay.green;
                paint.setColor(i);
                f = graphicOverlay.paintStrokeWidth;
                if (f > 0.0f) {
                    f3 = graphicOverlay.paintStrokeWidth;
                    f2 = f3 / 2;
                } else {
                    f2 = 1.0f;
                }
                paint.setStrokeWidth(f2);
                return paint;
            }
        });
        obtainStyledAttributes.recycle();
        this.onDrawAnimationUpdate = new Function1<Float, Unit>() { // from class: com.socure.docv.capturesdk.common.view.GraphicOverlay$onDrawAnimationUpdate$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                invoke(f.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(float f) {
                GridLines gridLines;
                Unit unit;
                LoggerKt.logD("SDLT_G_Overlay", "onDrawAnimationUpdate");
                gridLines = GraphicOverlay.this.gridLines;
                if (gridLines != null) {
                    GraphicOverlay graphicOverlay = GraphicOverlay.this;
                    GridLine v1 = gridLines.getV1();
                    GridLine v2 = gridLines.getV2();
                    GridLine v3 = gridLines.getV3();
                    GridLine h1 = gridLines.getH1();
                    GridLine h2 = gridLines.getH2();
                    GridLine h3 = gridLines.getH3();
                    AnimationUtilsKt.increaseDrawPoints(AnimationUtilsKt.calculateReducedPercentage(f, 0), v1, h1);
                    AnimationUtilsKt.increaseDrawPoints(AnimationUtilsKt.calculateReducedPercentage(f, 11), v2, h2);
                    AnimationUtilsKt.increaseDrawPoints(AnimationUtilsKt.calculateReducedPercentage(f, 22), v3, h3);
                    graphicOverlay.invalidate();
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    LoggerKt.logDetailed("SDLT_G_Overlay", "gridLines is NULL");
                }
            }
        };
        this.onClearAnimationUpdate = new Function1<Float, Unit>() { // from class: com.socure.docv.capturesdk.common.view.GraphicOverlay$onClearAnimationUpdate$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                invoke(f.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(float f) {
                GridLines gridLines;
                Unit unit;
                LoggerKt.logD("SDLT_G_Overlay", "onClearAnimationUpdate");
                gridLines = GraphicOverlay.this.gridLines;
                if (gridLines != null) {
                    GraphicOverlay graphicOverlay = GraphicOverlay.this;
                    GridLine v1 = gridLines.getV1();
                    GridLine v2 = gridLines.getV2();
                    GridLine v3 = gridLines.getV3();
                    GridLine h1 = gridLines.getH1();
                    GridLine h2 = gridLines.getH2();
                    GridLine h3 = gridLines.getH3();
                    AnimationUtilsKt.decreaseDrawPoints(AnimationUtilsKt.calculateReducedPercentage(f, 0), v1, h1);
                    AnimationUtilsKt.decreaseDrawPoints(AnimationUtilsKt.calculateReducedPercentage(f, 11), v2, h2);
                    AnimationUtilsKt.decreaseDrawPoints(AnimationUtilsKt.calculateReducedPercentage(f, 22), v3, h3);
                    graphicOverlay.invalidate();
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    LoggerKt.logDetailed("SDLT_G_Overlay", "gridLines is NULL");
                }
            }
        };
        this.onShowTickGraphic = new Function1<Float, Unit>() { // from class: com.socure.docv.capturesdk.common.view.GraphicOverlay$onShowTickGraphic$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                invoke(f.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(float f) {
                List list;
                Drawable drawable;
                List list2;
                List list3;
                List list4;
                List list5;
                List list6;
                List list7;
                float f2;
                Drawable drawable2;
                Paint paint;
                int i;
                LoggerKt.logD("SDLT_G_Overlay", "onShowTickGraphic");
                list = GraphicOverlay.this.corners;
                if (!list.isEmpty()) {
                    drawable = GraphicOverlay.this.vectorDrawable;
                    if (drawable == null) {
                        GraphicOverlay graphicOverlay = GraphicOverlay.this;
                        graphicOverlay.vectorDrawable = ResourcesCompat.getDrawable(graphicOverlay.getResources(), R.drawable.ic_socure_capture_success, null);
                        paint = GraphicOverlay.this.fillPaint;
                        i = GraphicOverlay.this.translucentGreenDark;
                        paint.setColor(i);
                    }
                    list2 = GraphicOverlay.this.corners;
                    float floatValue = ((Number) list2.get(0)).floatValue();
                    list3 = GraphicOverlay.this.corners;
                    float floatValue2 = ((Number) list3.get(6)).floatValue();
                    list4 = GraphicOverlay.this.corners;
                    float f3 = 2;
                    int floatValue3 = (int) (floatValue + ((floatValue2 - ((Number) list4.get(0)).floatValue()) / f3));
                    list5 = GraphicOverlay.this.corners;
                    float floatValue4 = ((Number) list5.get(1)).floatValue();
                    list6 = GraphicOverlay.this.corners;
                    float floatValue5 = ((Number) list6.get(7)).floatValue();
                    list7 = GraphicOverlay.this.corners;
                    int floatValue6 = (int) (floatValue4 + ((floatValue5 - ((Number) list7.get(1)).floatValue()) / f3));
                    f2 = GraphicOverlay.this.successVectorDimen;
                    int i2 = (int) ((f / 100) * (f2 / f3));
                    drawable2 = GraphicOverlay.this.vectorDrawable;
                    if (drawable2 != null) {
                        drawable2.setBounds(floatValue3 - i2, floatValue6 - i2, floatValue3 + i2, floatValue6 + i2);
                    }
                    GraphicOverlay.this.invalidate();
                    return;
                }
                LoggerKt.logDetailed("SDLT_G_Overlay", "corners list is EMPTY");
            }
        };
    }

    public final void clear() {
        if (this.isCaptureAnimationInProgress) {
            return;
        }
        this.corners.clear();
        this.vectorDrawable = null;
        this.isCaptureAnimationInProgress = false;
        invalidate();
    }

    public final void drawRect(List<Float> coords, Dimension dimension) {
        Intrinsics.checkNotNullParameter(coords, "coords");
        Intrinsics.checkNotNullParameter(dimension, "dimension");
        setCornersAndPaint(coords, dimension);
        this.paint.setColor(this.white);
        this.fillPaint.setColor(this.translucentWhite);
        invalidate();
    }

    public final void drawRectWithAnimation(List<Float> coords, Dimension dimension, final Function0<Unit> completionCallback) {
        Intrinsics.checkNotNullParameter(coords, "coords");
        Intrinsics.checkNotNullParameter(dimension, "dimension");
        Intrinsics.checkNotNullParameter(completionCallback, "completionCallback");
        setCornersAndPaint(coords, dimension);
        this.paint.setColor(this.green);
        this.fillPaint.setColor(this.translucentGreen);
        this.isCaptureAnimationInProgress = true;
        this.gridLines = AnimationUtilsKt.calculateGridLines(this.corners);
        ValueAnimator createAnimator$default = AnimationUtilsKt.createAnimator$default(600L, 122.0f, 0L, this.onDrawAnimationUpdate, 4, null);
        ValueAnimator createAnimator = AnimationUtilsKt.createAnimator(300L, 122.0f, 300L, this.onClearAnimationUpdate);
        ValueAnimator createAnimator$default2 = AnimationUtilsKt.createAnimator$default(300L, 0.0f, 100L, this.onShowTickGraphic, 2, null);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(createAnimator$default, createAnimator, createAnimator$default2);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.socure.docv.capturesdk.common.view.GraphicOverlay$drawRectWithAnimation$lambda$2$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                Function0.this.invoke();
            }
        });
        animatorSet.start();
    }

    private final void setCornersAndPaint(List<Float> coords, Dimension dimension) {
        reset();
        this.corners.addAll(coords);
        ImageUtils.INSTANCE.scaleIddModelCoordinates$capturesdk_productionRelease(this.corners, new Dimension(getWidth(), getHeight()), dimension);
        this.fillPaint.setStyle(Paint.Style.FILL);
        this.paint.setStrokeWidth(this.paintStrokeWidth);
    }

    private final void reset() {
        this.paint.reset();
        this.fillPaint.reset();
        this.fillPath.reset();
    }

    public final void resetAnimation() {
        this.isCaptureAnimationInProgress = false;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.corners.size() == 12) {
            synchronized (this.lock) {
                canvas.drawLine(this.corners.get(0).floatValue(), this.corners.get(1).floatValue(), this.corners.get(3).floatValue(), this.corners.get(4).floatValue(), this.paint);
                canvas.drawLine(this.corners.get(3).floatValue(), this.corners.get(4).floatValue(), this.corners.get(6).floatValue(), this.corners.get(7).floatValue(), this.paint);
                canvas.drawLine(this.corners.get(6).floatValue(), this.corners.get(7).floatValue(), this.corners.get(9).floatValue(), this.corners.get(10).floatValue(), this.paint);
                canvas.drawLine(this.corners.get(9).floatValue(), this.corners.get(10).floatValue(), this.corners.get(0).floatValue(), this.corners.get(1).floatValue(), this.paint);
                this.fillPath.moveTo(this.corners.get(0).floatValue(), this.corners.get(1).floatValue());
                this.fillPath.lineTo(this.corners.get(3).floatValue(), this.corners.get(4).floatValue());
                this.fillPath.lineTo(this.corners.get(6).floatValue(), this.corners.get(7).floatValue());
                this.fillPath.lineTo(this.corners.get(9).floatValue(), this.corners.get(10).floatValue());
                this.fillPath.lineTo(this.corners.get(0).floatValue(), this.corners.get(1).floatValue());
                canvas.drawPath(this.fillPath, this.fillPaint);
                if (this.isCaptureAnimationInProgress) {
                    GridLines gridLines = this.gridLines;
                    if (gridLines != null) {
                        GridLine[] gridLineArr = {gridLines.getV1(), gridLines.getV2(), gridLines.getV3(), gridLines.getH1(), gridLines.getH2(), gridLines.getH3()};
                        for (int i = 0; i < 6; i++) {
                            GridLine gridLine = gridLineArr[i];
                            canvas.drawLine(gridLine.getStartX(), gridLine.getStartY(), gridLine.getEndX(), gridLine.getEndY(), this.gridPaint.getValue());
                        }
                    }
                    Drawable drawable = this.vectorDrawable;
                    if (drawable != null) {
                        drawable.draw(canvas);
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
            return;
        }
        LoggerKt.logDetailed("SDLT_G_Overlay", "corners.size is not 12 - size: " + this.corners.size());
        reset();
    }
}
