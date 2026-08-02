package com.vk.utils.vectordrawable.internal.element;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import androidx.annotation.Keep;
import com.unity3d.services.UnityAdsConstants;
import com.vk.utils.vectordrawable.AnimationTarget;
import com.vk.utils.vectordrawable.VectorPath;
import kotlin.Lazy;
import xsna.a040;
import xsna.bpn0;
import xsna.rq90;
import xsna.x9;

/* compiled from: PathElement.kt */
@Keep
/* loaded from: classes6.dex */
public final class PathElement implements VectorPath, AnimationTarget {
    private int fillAlpha;
    private int fillColor;
    private final Path.FillType fillType;
    private boolean isFillAndStroke;
    private final String name;
    private final Path originalPath;
    private final Lazy path$delegate;
    private final String pathData;
    private rq90.a[] pathDataNodes;
    private final Paint pathPaint;
    private final Matrix scaleMatrix;
    private int strokeAlpha;
    private int strokeColor;
    private final Paint.Cap strokeLineCap;
    private final Paint.Join strokeLineJoin;
    private final float strokeMiterLimit;
    private float strokeRatio;
    private float strokeWidth;
    private float trimPathEnd;
    private float trimPathOffset;
    private float trimPathStart;
    private final Path trimmedPath;

    public PathElement(String str, int i, int i2, Path.FillType fillType, String str2, int i3, int i4, Paint.Cap cap, Paint.Join join, float f, float f2, float f3, float f4, float f5) {
        this.name = str;
        this.fillAlpha = i;
        this.fillType = fillType;
        this.pathData = str2;
        this.strokeLineCap = cap;
        this.strokeLineJoin = join;
        this.strokeMiterLimit = f;
        this.strokeWidth = f2;
        this.trimPathEnd = f3;
        this.trimPathOffset = f4;
        this.trimPathStart = f5;
        this.fillColor = i2;
        this.strokeColor = i4;
        this.strokeAlpha = i3;
        this.path$delegate = new bpn0(new a040(this, 13));
        this.pathPaint = x9.c(true);
        Path d = str2 != null ? rq90.d(str2) : new Path();
        d.setFillType(fillType);
        this.originalPath = d;
        Matrix matrix = new Matrix();
        matrix.reset();
        this.scaleMatrix = matrix;
        this.trimmedPath = new Path(getPath());
        this.strokeRatio = 1.0f;
        updatePaint();
    }

    private final void makeFillPaint() {
        Paint paint = this.pathPaint;
        paint.setColor(getFillColor());
        paint.setAlpha(this.fillAlpha);
        paint.setStyle(Paint.Style.FILL);
    }

    private final void makeStrokePaint() {
        Paint paint = this.pathPaint;
        paint.setColor(getStrokeColor());
        paint.setAlpha(getStrokeAlpha());
        paint.setStyle(Paint.Style.STROKE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Path path_delegate$lambda$0(PathElement pathElement) {
        return new Path(pathElement.originalPath);
    }

    private final void trimPath() {
        if (this.trimPathStart == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.trimPathEnd == 1.0f && this.trimPathOffset == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            getPath().set(this.originalPath);
            getPath().transform(this.scaleMatrix);
            return;
        }
        PathMeasure pathMeasure = new PathMeasure(this.originalPath, false);
        float length = pathMeasure.getLength();
        this.trimmedPath.reset();
        float f = this.trimPathStart;
        float f2 = this.trimPathOffset;
        pathMeasure.getSegment((f + f2) * length, (this.trimPathEnd + f2) * length, this.trimmedPath, true);
        getPath().set(this.trimmedPath);
        getPath().transform(this.scaleMatrix);
    }

    private final void updatePaint() {
        this.pathPaint.setStrokeWidth(getStrokeWidth() * this.strokeRatio);
        if (getFillColor() != 0 && getStrokeColor() != 0) {
            this.isFillAndStroke = true;
        } else if (getFillColor() != 0) {
            this.pathPaint.setColor(getFillColor());
            this.pathPaint.setAlpha(this.fillAlpha);
            this.pathPaint.setStyle(Paint.Style.FILL);
            this.isFillAndStroke = false;
        } else if (getStrokeColor() != 0) {
            this.pathPaint.setColor(getStrokeColor());
            this.pathPaint.setAlpha(getStrokeAlpha());
            this.pathPaint.setStyle(Paint.Style.STROKE);
            this.isFillAndStroke = false;
        } else {
            this.pathPaint.setColor(0);
        }
        this.pathPaint.setStrokeCap(this.strokeLineCap);
        this.pathPaint.setStrokeJoin(this.strokeLineJoin);
        this.pathPaint.setStrokeMiter(this.strokeMiterLimit);
    }

    private final void updatePath() {
        rq90.a[] aVarArr = this.pathDataNodes;
        if (aVarArr == null) {
            trimPath();
            return;
        }
        getPath().reset();
        rq90.a.b(aVarArr, getPath());
        getPath().transform(this.scaleMatrix);
    }

    public final void draw(Canvas canvas) {
        if (!this.isFillAndStroke) {
            canvas.drawPath(getPath(), this.pathPaint);
            return;
        }
        makeFillPaint();
        canvas.drawPath(getPath(), this.pathPaint);
        makeStrokePaint();
        canvas.drawPath(getPath(), this.pathPaint);
    }

    @Override // com.vk.utils.vectordrawable.VectorPath
    public int getFillColor() {
        return this.fillColor;
    }

    public final Path.FillType getFillType() {
        return this.fillType;
    }

    public final String getName() {
        return this.name;
    }

    @Override // com.vk.utils.vectordrawable.VectorPath
    public Path getPath() {
        return (Path) this.path$delegate.getValue();
    }

    public final String getPathData() {
        return this.pathData;
    }

    public final Paint getPathPaint() {
        return this.pathPaint;
    }

    @Override // com.vk.utils.vectordrawable.VectorPath
    public int getStrokeAlpha() {
        return this.strokeAlpha;
    }

    @Override // com.vk.utils.vectordrawable.VectorPath
    public int getStrokeColor() {
        return this.strokeColor;
    }

    public final Paint.Cap getStrokeLineCap() {
        return this.strokeLineCap;
    }

    public final Paint.Join getStrokeLineJoin() {
        return this.strokeLineJoin;
    }

    public final float getStrokeMiterLimit() {
        return this.strokeMiterLimit;
    }

    @Override // com.vk.utils.vectordrawable.VectorPath
    public float getStrokeWidth() {
        return this.strokeWidth;
    }

    public final float getTrimPathEnd() {
        return this.trimPathEnd;
    }

    public final float getTrimPathOffset() {
        return this.trimPathOffset;
    }

    public final float getTrimPathStart() {
        return this.trimPathStart;
    }

    public final boolean isFillAndStroke() {
        return this.isFillAndStroke;
    }

    @Override // com.vk.utils.vectordrawable.VectorPath
    public void setFillColor(int i) {
        this.fillColor = i;
        this.fillAlpha = (i >> 24) & 255;
        updatePaint();
    }

    public final void setPathData(rq90.a[] aVarArr) {
        this.pathDataNodes = rq90.e(aVarArr);
        updatePath();
    }

    public final void setStrokeAlpha(float f) {
        setStrokeAlpha(Math.min(255, (int) (255 * f)));
    }

    @Override // com.vk.utils.vectordrawable.VectorPath
    public void setStrokeColor(int i) {
        this.strokeColor = i;
        setStrokeAlpha((i >> 24) & 255);
        updatePaint();
    }

    public final void setStrokeRatio(float f) {
        this.strokeRatio = f;
        updatePaint();
    }

    @Override // com.vk.utils.vectordrawable.VectorPath
    public void setStrokeWidth(float f) {
        this.strokeWidth = f;
        updatePaint();
    }

    public final void setTrimPathEnd(float f) {
        this.trimPathEnd = f;
        updatePath();
    }

    public final void setTrimPathOffset(float f) {
        this.trimPathOffset = f;
        updatePath();
    }

    public final void setTrimPathStart(float f) {
        this.trimPathStart = f;
        updatePath();
    }

    public final void transform(Matrix matrix) {
        this.scaleMatrix.set(matrix);
        updatePath();
    }

    @Override // com.vk.utils.vectordrawable.VectorPath
    public void setStrokeAlpha(int i) {
        this.strokeAlpha = i;
        updatePaint();
    }

    public PathElement(PathElement pathElement) {
        this(pathElement.name, pathElement.fillAlpha, pathElement.getFillColor(), pathElement.fillType, pathElement.pathData, pathElement.getStrokeAlpha(), pathElement.getStrokeColor(), pathElement.strokeLineCap, pathElement.strokeLineJoin, pathElement.strokeMiterLimit, pathElement.getStrokeWidth(), pathElement.trimPathEnd, pathElement.trimPathOffset, pathElement.trimPathStart);
        this.isFillAndStroke = pathElement.isFillAndStroke;
        this.originalPath.set(pathElement.originalPath);
        getPath().set(pathElement.getPath());
        this.pathPaint.set(pathElement.pathPaint);
        this.scaleMatrix.set(pathElement.scaleMatrix);
        this.trimmedPath.set(pathElement.trimmedPath);
        this.strokeRatio = pathElement.getStrokeWidth();
        rq90.a[] aVarArr = pathElement.pathDataNodes;
        if (aVarArr != null) {
            this.pathDataNodes = rq90.e(aVarArr);
        }
    }
}
