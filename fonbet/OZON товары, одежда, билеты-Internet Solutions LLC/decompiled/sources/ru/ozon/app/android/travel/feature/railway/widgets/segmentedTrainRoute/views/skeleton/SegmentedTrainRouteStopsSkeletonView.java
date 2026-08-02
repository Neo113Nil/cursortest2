package ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.views.skeleton;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0014J\b\u00104\u001a\u000201H\u0002J \u00105\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u001e2\u0006\u00107\u001a\u00020\u001e2\u0006\u00108\u001a\u00020 H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/views/skeleton/SegmentedTrainRouteStopsSkeletonView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "skeleton", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "skeleton2", "skeleton3", "skeleton4", "skeleton5", "skeleton6", "skeleton7", "skeleton8", "skeleton9", "skeleton10", "skeleton11", "skeleton12", "skeleton13", "skeleton14", "skeleton15", "skeleton16", "guideline", "Landroidx/constraintlayout/widget/Guideline;", "linePaint", "Landroid/graphics/Paint;", "circlePaintFill", "circlePaintStroke", "dp2", "", "dpf4", "", "dp10", "dp12", "dpf12", "dp16", "dpf20", "dpf26", "dp40", "dpf60", "dpf66", "dpf72", "dpf108", "dpf114", "dpf120", "dpf186", "dpf192", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setConstraints", "createRoundedShimmerView", "width", "height", "radius", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SegmentedTrainRouteStopsSkeletonView extends ConstraintLayout {

    @NotNull
    private final Paint circlePaintFill;

    @NotNull
    private final Paint circlePaintStroke;
    private final int dp10;
    private final int dp12;
    private final int dp16;
    private final int dp2;
    private final int dp40;
    private final float dpf108;
    private final float dpf114;
    private final float dpf12;
    private final float dpf120;
    private final float dpf186;
    private final float dpf192;
    private final float dpf20;
    private final float dpf26;
    private final float dpf4;
    private final float dpf60;
    private final float dpf66;
    private final float dpf72;

    @NotNull
    private final Guideline guideline;

    @NotNull
    private final Paint linePaint;

    @NotNull
    private final RoundedShimmerView skeleton;

    @NotNull
    private final RoundedShimmerView skeleton10;

    @NotNull
    private final RoundedShimmerView skeleton11;

    @NotNull
    private final RoundedShimmerView skeleton12;

    @NotNull
    private final RoundedShimmerView skeleton13;

    @NotNull
    private final RoundedShimmerView skeleton14;

    @NotNull
    private final RoundedShimmerView skeleton15;

    @NotNull
    private final RoundedShimmerView skeleton16;

    @NotNull
    private final RoundedShimmerView skeleton2;

    @NotNull
    private final RoundedShimmerView skeleton3;

    @NotNull
    private final RoundedShimmerView skeleton4;

    @NotNull
    private final RoundedShimmerView skeleton5;

    @NotNull
    private final RoundedShimmerView skeleton6;

    @NotNull
    private final RoundedShimmerView skeleton7;

    @NotNull
    private final RoundedShimmerView skeleton8;

    @NotNull
    private final RoundedShimmerView skeleton9;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedTrainRouteStopsSkeletonView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.skeleton = createRoundedShimmerView(ResourceExtKt.toPx(34, context), ResourceExtKt.toPx(20, context), ResourceExtKt.toPxF(6, context));
        this.skeleton2 = createRoundedShimmerView(ResourceExtKt.toPx(49, context), ResourceExtKt.toPx(20, context), ResourceExtKt.toPxF(6, context));
        this.skeleton3 = createRoundedShimmerView(ResourceExtKt.toPx(62, context), ResourceExtKt.toPx(14, context), ResourceExtKt.toPxF(4, context));
        this.skeleton4 = createRoundedShimmerView(ResourceExtKt.toPx(130, context), ResourceExtKt.toPx(14, context), ResourceExtKt.toPxF(4, context));
        this.skeleton5 = createRoundedShimmerView(ResourceExtKt.toPx(92, context), ResourceExtKt.toPx(16, context), ResourceExtKt.toPxF(4, context));
        this.skeleton6 = createRoundedShimmerView(ResourceExtKt.toPx(40, context), ResourceExtKt.toPx(16, context), ResourceExtKt.toPxF(4, context));
        this.skeleton7 = createRoundedShimmerView(ResourceExtKt.toPx(46, context), ResourceExtKt.toPx(16, context), ResourceExtKt.toPxF(4, context));
        this.skeleton8 = createRoundedShimmerView(ResourceExtKt.toPx(92, context), ResourceExtKt.toPx(16, context), ResourceExtKt.toPxF(4, context));
        this.skeleton9 = createRoundedShimmerView(ResourceExtKt.toPx(40, context), ResourceExtKt.toPx(16, context), ResourceExtKt.toPxF(4, context));
        this.skeleton10 = createRoundedShimmerView(ResourceExtKt.toPx(46, context), ResourceExtKt.toPx(16, context), ResourceExtKt.toPxF(4, context));
        this.skeleton11 = createRoundedShimmerView(ResourceExtKt.toPx(110, context), ResourceExtKt.toPx(16, context), ResourceExtKt.toPxF(4, context));
        this.skeleton12 = createRoundedShimmerView(ResourceExtKt.toPx(36, context), ResourceExtKt.toPx(20, context), ResourceExtKt.toPxF(6, context));
        this.skeleton13 = createRoundedShimmerView(ResourceExtKt.toPx(72, context), ResourceExtKt.toPx(20, context), ResourceExtKt.toPxF(6, context));
        this.skeleton14 = createRoundedShimmerView(ResourceExtKt.toPx(100, context), ResourceExtKt.toPx(14, context), ResourceExtKt.toPxF(4, context));
        this.skeleton15 = createRoundedShimmerView(ResourceExtKt.toPx(136, context), ResourceExtKt.toPx(16, context), ResourceExtKt.toPxF(4, context));
        this.skeleton16 = createRoundedShimmerView(ResourceExtKt.toPx(m.e.DEFAULT_SWIPE_ANIMATION_DURATION, context), ResourceExtKt.toPx(32, context), ResourceExtKt.toPxF(8, context));
        Guideline guideline = new Guideline(context);
        guideline.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41615V = 1;
        bVar.f41624c = 0.4f;
        guideline.setLayoutParams(bVar);
        addView(guideline);
        this.guideline = guideline;
        Paint paint = new Paint();
        paint.setColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(ResourceExtKt.toPxF(2, context));
        this.linePaint = paint;
        Paint paint2 = new Paint(paint);
        paint2.setStyle(Paint.Style.FILL);
        this.circlePaintFill = paint2;
        Paint paint3 = new Paint(paint);
        paint3.setStyle(style);
        this.circlePaintStroke = paint3;
        this.dp2 = ResourceExtKt.toPx(2, context);
        this.dpf4 = ResourceExtKt.toPxF(4, context);
        this.dp10 = ResourceExtKt.toPx(10, context);
        int px = ResourceExtKt.toPx(12, context);
        this.dp12 = px;
        float pxF = ResourceExtKt.toPxF(12, context);
        this.dpf12 = pxF;
        this.dp16 = ResourceExtKt.toPx(16, context);
        this.dpf20 = ResourceExtKt.toPxF(20, context);
        this.dpf26 = ResourceExtKt.toPxF(26, context);
        this.dp40 = ResourceExtKt.toPx(40, context);
        this.dpf60 = ResourceExtKt.toPxF(60, context);
        this.dpf66 = ResourceExtKt.toPxF(66, context);
        this.dpf72 = ResourceExtKt.toPxF(72, context);
        this.dpf108 = ResourceExtKt.toPxF(108, context);
        this.dpf114 = ResourceExtKt.toPxF(114, context);
        this.dpf120 = ResourceExtKt.toPxF(120, context);
        this.dpf186 = ResourceExtKt.toPxF(186, context);
        this.dpf192 = ResourceExtKt.toPxF(192, context);
        setPadding(px, px, px, px);
        setBackground(new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(context, R$attr.bgSecondary), pxF));
        setConstraints();
    }

    private final RoundedShimmerView createRoundedShimmerView(int width, int height, float radius) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView.setId(View.generateViewId());
        roundedShimmerView.setLayoutParams(new ConstraintLayout.b(width, height));
        roundedShimmerView.setCornerRadius(radius);
        addView(roundedShimmerView);
        return roundedShimmerView;
    }

    private final void setConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new SegmentedTrainRouteStopsSkeletonView$setConstraints$1(this));
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float width = getWidth() * 0.4f;
        canvas.drawCircle(width, this.dpf20, this.dpf4, this.circlePaintFill);
        canvas.drawLine(width, this.dpf26, width, this.dpf60, this.linePaint);
        canvas.drawCircle(width, this.dpf66, this.dpf4, this.circlePaintStroke);
        canvas.drawLine(width, this.dpf72, width, this.dpf108, this.linePaint);
        canvas.drawCircle(width, this.dpf114, this.dpf4, this.circlePaintStroke);
        canvas.drawLine(width, this.dpf120, width, this.dpf186, this.linePaint);
        canvas.drawCircle(width, this.dpf192, this.dpf4, this.circlePaintFill);
    }
}
