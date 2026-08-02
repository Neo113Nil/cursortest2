package com.socure.docv.capturesdk.common.utils;

import android.animation.ValueAnimator;
import com.socure.docv.capturesdk.common.view.model.GridLine;
import com.socure.docv.capturesdk.common.view.model.GridLines;
import com.socure.docv.capturesdk.core.processor.model.Line;
import com.socure.docv.capturesdk.core.processor.model.Point;
import com.socure.docv.capturesdk.core.processor.model.Quadrilateral;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnimationUtils.kt */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0016\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001aK\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\f2%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0010H\u0000\u001a)\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00042\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u0018\"\u00020\u0019H\u0000¢\u0006\u0002\u0010\u001a\u001a\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0000\u001a \u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001cH\u0000\u001a)\u0010#\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00042\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u0018\"\u00020\u0019H\u0000¢\u0006\u0002\u0010\u001a¨\u0006$"}, d2 = {"calculateGridLines", "Lcom/socure/docv/capturesdk/common/view/model/GridLines;", "modelOutput", "", "", "calculateReducedPercentage", "animationValue", "reduceBy", "", "createAnimator", "Landroid/animation/ValueAnimator;", "animDuration", "", "animationRange", "delayDuration", "updateListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "animatedValue", "", "decreaseDrawPoints", "percentage", "gridLines", "", "Lcom/socure/docv/capturesdk/common/view/model/GridLine;", "(F[Lcom/socure/docv/capturesdk/common/view/model/GridLine;)V", "getDistanceBetweenEdges", "Lcom/socure/docv/capturesdk/core/processor/model/Point;", "line", "Lcom/socure/docv/capturesdk/core/processor/model/Line;", "getNextGridLinePoint", "previousPoint", "startEdgeDistance", "endEdgeDistance", "increaseDrawPoints", "capturesdk_productionRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AnimationUtilsKt {
    public static final float calculateReducedPercentage(float f, int i) {
        float f2 = f - i;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 100.0f) {
            return 100.0f;
        }
        return f2;
    }

    public static final GridLines calculateGridLines(List<Float> modelOutput) {
        Intrinsics.checkNotNullParameter(modelOutput, "modelOutput");
        Quadrilateral quadrilateral$capturesdk_productionRelease = ImageUtils.INSTANCE.getQuadrilateral$capturesdk_productionRelease(modelOutput);
        Point topLeft = quadrilateral$capturesdk_productionRelease.getTopLeft();
        Point topRight = quadrilateral$capturesdk_productionRelease.getTopRight();
        Point bottomRight = quadrilateral$capturesdk_productionRelease.getBottomRight();
        Point bottomLeft = quadrilateral$capturesdk_productionRelease.getBottomLeft();
        Point distanceBetweenEdges = getDistanceBetweenEdges(new Line(topLeft, topRight));
        Point distanceBetweenEdges2 = getDistanceBetweenEdges(new Line(bottomLeft, bottomRight));
        GridLine nextGridLinePoint = getNextGridLinePoint(new GridLine(topLeft.getX(), topLeft.getY(), bottomLeft.getX(), bottomLeft.getY()), distanceBetweenEdges, distanceBetweenEdges2);
        GridLine nextGridLinePoint2 = getNextGridLinePoint(nextGridLinePoint, distanceBetweenEdges, distanceBetweenEdges2);
        GridLine nextGridLinePoint3 = getNextGridLinePoint(nextGridLinePoint2, distanceBetweenEdges, distanceBetweenEdges2);
        Point distanceBetweenEdges3 = getDistanceBetweenEdges(new Line(topLeft, bottomLeft));
        Point distanceBetweenEdges4 = getDistanceBetweenEdges(new Line(topRight, bottomRight));
        GridLine nextGridLinePoint4 = getNextGridLinePoint(new GridLine(topLeft.getX(), topLeft.getY(), topRight.getX(), topRight.getY()), distanceBetweenEdges3, distanceBetweenEdges4);
        GridLine nextGridLinePoint5 = getNextGridLinePoint(nextGridLinePoint4, distanceBetweenEdges3, distanceBetweenEdges4);
        return new GridLines(nextGridLinePoint, nextGridLinePoint2, nextGridLinePoint3, nextGridLinePoint4, nextGridLinePoint5, getNextGridLinePoint(nextGridLinePoint5, distanceBetweenEdges3, distanceBetweenEdges4));
    }

    public static final Point getDistanceBetweenEdges(Line line) {
        Intrinsics.checkNotNullParameter(line, "line");
        float f = 4;
        return new Point((line.getEnd().getX() - line.getStart().getX()) / f, (line.getEnd().getY() - line.getStart().getY()) / f);
    }

    public static final GridLine getNextGridLinePoint(GridLine previousPoint, Point startEdgeDistance, Point endEdgeDistance) {
        Intrinsics.checkNotNullParameter(previousPoint, "previousPoint");
        Intrinsics.checkNotNullParameter(startEdgeDistance, "startEdgeDistance");
        Intrinsics.checkNotNullParameter(endEdgeDistance, "endEdgeDistance");
        return new GridLine(previousPoint.getStartX() + startEdgeDistance.getX(), previousPoint.getStartY() + startEdgeDistance.getY(), previousPoint.getEndX() + endEdgeDistance.getX(), previousPoint.getEndY() + endEdgeDistance.getY());
    }

    public static /* synthetic */ ValueAnimator createAnimator$default(long j, float f, long j2, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 100.0f;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            j2 = 0;
        }
        long j3 = j2;
        if ((i & 8) != 0) {
            function1 = null;
        }
        return createAnimator(j, f2, j3, function1);
    }

    public static final ValueAnimator createAnimator(long j, float f, long j2, final Function1<? super Float, Unit> function1) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, f);
        ofFloat.setDuration(j);
        ofFloat.setStartDelay(j2);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.socure.docv.capturesdk.common.utils.AnimationUtilsKt$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AnimationUtilsKt.createAnimator$lambda$2$lambda$1(Function1.this, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofFloat, "ofFloat(0F, animationRan…edValue as Float) }\n    }");
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createAnimator$lambda$2$lambda$1(Function1 function1, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (function1 != null) {
            Object animatedValue = it.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            function1.invoke((Float) animatedValue);
        }
    }

    public static final void increaseDrawPoints(float f, GridLine... gridLines) {
        Intrinsics.checkNotNullParameter(gridLines, "gridLines");
        for (GridLine gridLine : gridLines) {
            float f2 = f / 100;
            float diffX = gridLine.getDiffX() * f2;
            float diffY = f2 * gridLine.getDiffY();
            gridLine.setEndX(gridLine.getStartX() + diffX);
            gridLine.setEndY(gridLine.getStartY() + diffY);
        }
    }

    public static final void decreaseDrawPoints(float f, GridLine... gridLines) {
        Intrinsics.checkNotNullParameter(gridLines, "gridLines");
        for (GridLine gridLine : gridLines) {
            float f2 = f / 100;
            float diffX = gridLine.getDiffX() * f2;
            float diffY = f2 * gridLine.getDiffY();
            gridLine.setStartX((gridLine.getEndX() + diffX) - gridLine.getDiffX());
            gridLine.setStartY((gridLine.getEndY() + diffY) - gridLine.getDiffY());
        }
    }
}
