package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.Mesh;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import android.os.Build;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends Canvas {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f16107a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f16108b = new Paint();

    /* renamed from: c, reason: collision with root package name */
    public final Paint f16109c = new Paint();

    /* renamed from: d, reason: collision with root package name */
    public final Rect f16110d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Bitmap f16111e;

    /* renamed from: f, reason: collision with root package name */
    public final Canvas f16112f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f16113g;

    /* renamed from: h, reason: collision with root package name */
    public final WeakHashMap f16114h;

    public i() {
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        this.f16111e = createBitmap;
        this.f16112f = new Canvas(createBitmap);
        this.f16113g = new Rect(0, 0, 1, 1);
        this.f16114h = new WeakHashMap();
    }

    public static BitmapShader c(Paint paint) {
        if (paint != null) {
            Shader shader = paint.getShader();
            if (shader instanceof BitmapShader) {
                paint.setShader(null);
                return (BitmapShader) shader;
            }
        }
        return null;
    }

    public final void a(float f6, float f10, Paint paint) {
        ColorFilter colorFilter = paint.getColorFilter();
        Paint paint2 = this.f16109c;
        paint2.setColorFilter(colorFilter);
        int color = paint.getColor();
        paint2.setColor(Color.argb(100, Color.red(color), Color.green(color), Color.blue(color)));
        Rect rect = this.f16110d;
        drawRoundRect(rect.left + f6, rect.top + f10, rect.right + f6, rect.bottom + f10, 10.0f, 10.0f, paint2);
    }

    public final Canvas b() {
        Canvas canvas = this.f16107a;
        if (canvas != null) {
            return canvas;
        }
        Intrinsics.throwUninitializedPropertyAccessException("delegate");
        return null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return b().clipOutPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return b().clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(op, "op");
        return b().clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rect, Region.Op op) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(op, "op");
        return b().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        b().concat(matrix);
    }

    public final int d(Bitmap bitmap, Paint paint, Rect rect) {
        Bitmap.Config config;
        int i5 = -16777216;
        if (bitmap.isRecycled()) {
            return -16777216;
        }
        WeakHashMap weakHashMap = this.f16114h;
        Pair pair = (Pair) weakHashMap.get(bitmap);
        if (pair != null && ((Number) pair.f19192a).intValue() == bitmap.getGenerationId()) {
            return ((Number) pair.f19193b).intValue();
        }
        Bitmap.Config config2 = bitmap.getConfig();
        config = Bitmap.Config.HARDWARE;
        Bitmap bitmap2 = this.f16111e;
        Rect rect2 = this.f16113g;
        Canvas canvas = this.f16112f;
        if (config2 == config && Build.VERSION.SDK_INT >= 31) {
            BitmapShader c2 = c(paint);
            canvas.drawBitmap(bitmap.asShared(), rect, rect2, paint);
            if (c2 != null && paint != null) {
                paint.setShader(c2);
            }
            i5 = bitmap2.getPixel(0, 0);
        } else if (bitmap.getConfig() != config) {
            BitmapShader c8 = c(paint);
            canvas.drawBitmap(bitmap, rect, rect2, paint);
            if (c8 != null && paint != null) {
                paint.setShader(c8);
            }
            i5 = bitmap2.getPixel(0, 0);
        }
        weakHashMap.put(bitmap, new Pair(Integer.valueOf(bitmap.getGenerationId()), Integer.valueOf(i5)));
        return i5;
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        b().disableZ();
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i5, int i10, int i11, int i12) {
        b().drawARGB(i5, i10, i11, i12);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF oval, float f6, float f10, boolean z5, Paint paint) {
        Intrinsics.checkNotNullParameter(oval, "oval");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c2 = c(paint);
        b().drawArc(oval, f6, f10, z5, paint);
        paint.setShader(c2);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] colors, int i5, int i10, float f6, float f10, int i11, int i12, boolean z5, Paint paint) {
        Intrinsics.checkNotNullParameter(colors, "colors");
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i5, int i10, float[] verts, int i11, int[] iArr, int i12, Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(verts, "verts");
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f6, float f10, float f11, Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c2 = c(paint);
        b().drawCircle(f6, f10, f11, paint);
        paint.setShader(c2);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i5) {
        b().drawColor(i5);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF outer, float f6, float f10, RectF inner, float f11, float f12, Paint paint) {
        Intrinsics.checkNotNullParameter(outer, "outer");
        Intrinsics.checkNotNullParameter(inner, "inner");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c2 = c(paint);
        b().drawDoubleRoundRect(outer, f6, f10, inner, f11, f12, paint);
        paint.setShader(c2);
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] glyphIds, int i5, float[] positions, int i10, int i11, Font font, Paint paint) {
        Intrinsics.checkNotNullParameter(glyphIds, "glyphIds");
        Intrinsics.checkNotNullParameter(positions, "positions");
        Intrinsics.checkNotNullParameter(font, "font");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f6, float f10, float f11, float f12, Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c2 = c(paint);
        b().drawLine(f6, f10, f11, f12, paint);
        paint.setShader(c2);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] pts, int i5, int i10, Paint paint) {
        Intrinsics.checkNotNullParameter(pts, "pts");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c2 = c(paint);
        b().drawLines(pts, i5, i10, paint);
        paint.setShader(c2);
    }

    @Override // android.graphics.Canvas
    public final void drawMesh(Mesh mesh, BlendMode blendMode, Paint paint) {
        Intrinsics.checkNotNullParameter(mesh, "mesh");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF oval, Paint paint) {
        Intrinsics.checkNotNullParameter(oval, "oval");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c2 = c(paint);
        b().drawOval(oval, paint);
        paint.setShader(c2);
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c2 = c(paint);
        b().drawPaint(paint);
        paint.setShader(c2);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch patch, Rect dst, Paint paint) {
        Intrinsics.checkNotNullParameter(patch, "patch");
        Intrinsics.checkNotNullParameter(dst, "dst");
        BitmapShader c2 = c(paint);
        b().drawPatch(patch, dst, paint);
        if (paint == null) {
            return;
        }
        paint.setShader(c2);
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c2 = c(paint);
        b().drawPath(path, paint);
        paint.setShader(c2);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        Intrinsics.checkNotNullParameter(picture, "picture");
        Paint paint = this.f16108b;
        paint.setColorFilter(null);
        paint.setColor(-16777216);
        b().drawRect(0.0f, 0.0f, picture.getWidth(), picture.getHeight(), paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f6, float f10, Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c2 = c(paint);
        b().drawPoint(f6, f10, paint);
        paint.setShader(c2);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i5, int i10, Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c2 = c(paint);
        b().drawPoints(fArr, i5, i10, paint);
        paint.setShader(c2);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String text, float[] pos, Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(pos, "pos");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i5, int i10, int i11) {
        b().drawRGB(i5, i10, i11);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rect, Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c2 = c(paint);
        b().drawRect(rect, paint);
        paint.setShader(c2);
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rect, float f6, float f10, Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c2 = c(paint);
        b().drawRoundRect(rect, f6, f10, paint);
        paint.setShader(c2);
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] text, int i5, int i10, float f6, float f10, Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text, i5, i10, this.f16110d);
        a(f6, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String text, Path path, float f6, float f10, Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] text, int i5, int i10, int i11, int i12, float f6, float f10, boolean z5, Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text, 0, i5 + i10, this.f16110d);
        a(f6, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode mode, int i5, float[] verts, int i10, float[] fArr, int i11, int[] iArr, int i12, short[] sArr, int i13, int i14, Paint paint) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(verts, "verts");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        b().enableZ();
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        return b().getClipBounds(bounds);
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        return b().getDensity();
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        return b().getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        return b().getHeight();
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix ctm) {
        Intrinsics.checkNotNullParameter(ctm, "ctm");
        b().getMatrix(ctm);
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        return b().getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        return b().getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        return b().getSaveCount();
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        return b().getWidth();
    }

    @Override // android.graphics.Canvas
    public final boolean isHardwareAccelerated() {
        return false;
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        return b().isOpaque();
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rect, Canvas.EdgeType type) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(type, "type");
        return b().quickReject(rect, type);
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        b().restore();
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i5) {
        b().restoreToCount(i5);
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f6) {
        b().rotate(f6);
    }

    @Override // android.graphics.Canvas
    public final int save() {
        return b().save();
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i5) {
        BitmapShader c2 = c(paint);
        int saveLayer = b().saveLayer(rectF, paint, i5);
        if (paint == null) {
            return saveLayer;
        }
        paint.setShader(c2);
        return saveLayer;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i5, int i10) {
        return b().saveLayerAlpha(rectF, i5, i10);
    }

    @Override // android.graphics.Canvas
    public final void scale(float f6, float f10) {
        b().scale(f6, f10);
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        b().setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i5) {
        b().setDensity(i5);
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        b().setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        b().setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final void skew(float f6, float f10) {
        b().skew(f6, f10);
    }

    @Override // android.graphics.Canvas
    public final void translate(float f6, float f10) {
        b().translate(f6, f10);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return b().clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return b().clipPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(op, "op");
        return b().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] colors, int i5, int i10, int i11, int i12, int i13, int i14, boolean z5, Paint paint) {
        Intrinsics.checkNotNullParameter(colors, "colors");
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j) {
        b().drawColor(j);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] text, int i5, int i10, float[] pos, Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(pos, "pos");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] text, int i5, int i10, Path path, float f6, float f10, Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return b().quickReject(rect);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i5) {
        return b().saveLayerAlpha(rectF, i5);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f6, float f10, float f11, float f12) {
        return b().clipOutRect(f6, f10, f11, f12);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return b().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f6, float f10, Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int d10 = d(bitmap, paint, null);
        Paint paint2 = this.f16108b;
        paint2.setColor(d10);
        paint2.setColorFilter(null);
        b().drawRect(f6, f10, f6 + bitmap.getWidth(), f10 + bitmap.getHeight(), paint2);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i5, PorterDuff.Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        b().drawColor(i5, mode);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String text, float f6, float f10, Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text, 0, text.length(), this.f16110d);
        a(f6, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence text, int i5, int i10, int i11, int i12, float f6, float f10, boolean z5, Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text.toString(), i5, i10, this.f16110d);
        a(f6, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType type) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(type, "type");
        return b().quickReject(path, type);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f6, float f10, float f11, float f12, int i5, int i10) {
        return b().saveLayerAlpha(f6, f10, f11, f12, i5, i10);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i5, int i10, int i11, int i12) {
        return b().clipOutRect(i5, i10, i11, i12);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return b().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f6, float f10, float f11, float f12, float f13, float f14, boolean z5, Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c2 = c(paint);
        b().drawArc(f6, f10, f11, f12, f13, f14, z5, paint);
        paint.setShader(c2);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i5, BlendMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        b().drawColor(i5, mode);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF outer, float[] outerRadii, RectF inner, float[] innerRadii, Paint paint) {
        Intrinsics.checkNotNullParameter(outer, "outer");
        Intrinsics.checkNotNullParameter(outerRadii, "outerRadii");
        Intrinsics.checkNotNullParameter(inner, "inner");
        Intrinsics.checkNotNullParameter(innerRadii, "innerRadii");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c2 = c(paint);
        b().drawDoubleRoundRect(outer, outerRadii, inner, innerRadii, paint);
        paint.setShader(c2);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] pts, Paint paint) {
        Intrinsics.checkNotNullParameter(pts, "pts");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c2 = c(paint);
        b().drawLines(pts, paint);
        paint.setShader(c2);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f6, float f10, float f11, float f12, Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c2 = c(paint);
        b().drawOval(f6, f10, f11, f12, paint);
        paint.setShader(c2);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch patch, RectF dst, Paint paint) {
        Intrinsics.checkNotNullParameter(patch, "patch");
        Intrinsics.checkNotNullParameter(dst, "dst");
        BitmapShader c2 = c(paint);
        b().drawPatch(patch, dst, paint);
        if (paint == null) {
            return;
        }
        paint.setShader(c2);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF dst) {
        Intrinsics.checkNotNullParameter(picture, "picture");
        Intrinsics.checkNotNullParameter(dst, "dst");
        Paint paint = this.f16108b;
        paint.setColorFilter(null);
        paint.setColor(-16777216);
        b().drawRect(dst, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] pts, Paint paint) {
        Intrinsics.checkNotNullParameter(pts, "pts");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c2 = c(paint);
        b().drawPoints(pts, paint);
        paint.setShader(c2);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect r5, Paint paint) {
        Intrinsics.checkNotNullParameter(r5, "r");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c2 = c(paint);
        b().drawRect(r5, paint);
        paint.setShader(c2);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f6, float f10, float f11, float f12, float f13, float f14, Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c2 = c(paint);
        b().drawRoundRect(f6, f10, f11, f12, f13, f14, paint);
        paint.setShader(c2);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return b().quickReject(path);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        BitmapShader c2 = c(paint);
        int saveLayer = b().saveLayer(rectF, paint);
        if (paint == null) {
            return saveLayer;
        }
        paint.setShader(c2);
        return saveLayer;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f6, float f10, float f11, float f12, int i5) {
        return b().saveLayerAlpha(f6, f10, f11, f12, i5);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f6, float f10, float f11, float f12, Region.Op op) {
        Intrinsics.checkNotNullParameter(op, "op");
        return b().clipRect(f6, f10, f11, f12, op);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j, BlendMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        b().drawColor(j, mode);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String text, int i5, int i10, float f6, float f10, Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text, i5, i10, this.f16110d);
        a(f6, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText text, int i5, int i10, int i11, int i12, float f6, float f10, boolean z5, Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text.toString(), i5, i10, this.f16110d);
        a(f6, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f6, float f10, float f11, float f12, Canvas.EdgeType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return b().quickReject(f6, f10, f11, f12, type);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f6, float f10, float f11, float f12) {
        return b().clipRect(f6, f10, f11, f12);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f6, float f10, float f11, float f12) {
        return b().quickReject(f6, f10, f11, f12);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i5, int i10, int i11, int i12) {
        return b().clipRect(i5, i10, i11, i12);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF dst, Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int d10 = d(bitmap, paint, rect);
        Paint paint2 = this.f16108b;
        paint2.setColor(d10);
        paint2.setColorFilter(null);
        b().drawRect(dst, paint2);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect dst) {
        Intrinsics.checkNotNullParameter(picture, "picture");
        Intrinsics.checkNotNullParameter(dst, "dst");
        Paint paint = this.f16108b;
        paint.setColorFilter(null);
        paint.setColor(-16777216);
        b().drawRect(dst, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f6, float f10, float f11, float f12, Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c2 = c(paint);
        b().drawRect(f6, f10, f11, f12, paint);
        paint.setShader(c2);
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence text, int i5, int i10, float f6, float f10, Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text.toString(), 0, text.length(), this.f16110d);
        a(f6, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f6, float f10, float f11, float f12, Paint paint, int i5) {
        BitmapShader c2 = c(paint);
        int saveLayer = b().saveLayer(f6, f10, f11, f12, paint, i5);
        if (paint == null) {
            return saveLayer;
        }
        paint.setShader(c2);
        return saveLayer;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f6, float f10, float f11, float f12, Paint paint) {
        BitmapShader c2 = c(paint);
        int saveLayer = b().saveLayer(f6, f10, f11, f12, paint);
        if (paint == null) {
            return saveLayer;
        }
        paint.setShader(c2);
        return saveLayer;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect dst, Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int d10 = d(bitmap, paint, rect);
        Paint paint2 = this.f16108b;
        paint2.setColor(d10);
        paint2.setColorFilter(null);
        b().drawRect(dst, paint2);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        int d10 = d(bitmap, paint, null);
        Paint paint2 = this.f16108b;
        paint2.setColor(d10);
        paint2.setColorFilter(null);
        int save = b().save();
        b().setMatrix(matrix);
        b().drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), paint2);
        b().restoreToCount(save);
    }
}
