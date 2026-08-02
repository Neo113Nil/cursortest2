package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Color;
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

/* loaded from: classes3.dex */
public final class B extends Canvas {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f51670a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f51671b = new Paint();

    /* renamed from: c, reason: collision with root package name */
    public final Paint f51672c = new Paint();

    /* renamed from: d, reason: collision with root package name */
    public final Rect f51673d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Bitmap f51674e;

    /* renamed from: f, reason: collision with root package name */
    public final Canvas f51675f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f51676g;

    /* renamed from: h, reason: collision with root package name */
    public final WeakHashMap f51677h;

    public B() {
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        this.f51674e = createBitmap;
        this.f51675f = new Canvas(createBitmap);
        this.f51676g = new Rect(0, 0, 1, 1);
        this.f51677h = new WeakHashMap();
    }

    public final void a(Paint paint, float f10, float f11) {
        this.f51672c.setColorFilter(paint.getColorFilter());
        int color = paint.getColor();
        this.f51672c.setColor(Color.argb(100, Color.red(color), Color.green(color), Color.blue(color)));
        Rect rect = this.f51673d;
        drawRoundRect(rect.left + f10, rect.top + f11, rect.right + f10, rect.bottom + f11, 10.0f, 10.0f, this.f51672c);
    }

    public final Canvas b() {
        Canvas canvas = this.f51670a;
        if (canvas != null) {
            return canvas;
        }
        Intrinsics.throwUninitializedPropertyAccessException("delegate");
        return null;
    }

    public final BitmapShader c(Paint paint) {
        if (paint == null) {
            return null;
        }
        Shader shader = paint.getShader();
        if (!(shader instanceof BitmapShader)) {
            return null;
        }
        paint.setShader(null);
        return (BitmapShader) shader;
    }

    @Override // android.graphics.Canvas
    public boolean clipOutPath(Path path) {
        boolean clipOutPath;
        Intrinsics.checkNotNullParameter(path, "path");
        clipOutPath = b().clipOutPath(path);
        return clipOutPath;
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(RectF rect) {
        boolean clipOutRect;
        Intrinsics.checkNotNullParameter(rect, "rect");
        clipOutRect = b().clipOutRect(rect);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(Path path, Region.Op op) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(op, "op");
        return b().clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(RectF rect, Region.Op op) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(op, "op");
        return b().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public void concat(Matrix matrix) {
        b().concat(matrix);
    }

    public final int d(Bitmap bitmap, Paint paint, Rect rect) {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap asShared;
        int i10 = -16777216;
        if (bitmap.isRecycled()) {
            return -16777216;
        }
        Pair pair = (Pair) this.f51677h.get(bitmap);
        if (pair != null && ((Number) pair.getFirst()).intValue() == bitmap.getGenerationId()) {
            return ((Number) pair.getSecond()).intValue();
        }
        Bitmap.Config config3 = bitmap.getConfig();
        config = Bitmap.Config.HARDWARE;
        if (config3 != config || Build.VERSION.SDK_INT < 31) {
            Bitmap.Config config4 = bitmap.getConfig();
            config2 = Bitmap.Config.HARDWARE;
            if (config4 != config2) {
                BitmapShader c10 = c(paint);
                this.f51675f.drawBitmap(bitmap, rect, this.f51676g, paint);
                if (c10 != null && paint != null) {
                    paint.setShader(c10);
                }
                i10 = this.f51674e.getPixel(0, 0);
            }
        } else {
            BitmapShader c11 = c(paint);
            Canvas canvas = this.f51675f;
            asShared = bitmap.asShared();
            canvas.drawBitmap(asShared, rect, this.f51676g, paint);
            if (c11 != null && paint != null) {
                paint.setShader(c11);
            }
            i10 = this.f51674e.getPixel(0, 0);
        }
        this.f51677h.put(bitmap, new Pair(Integer.valueOf(bitmap.getGenerationId()), Integer.valueOf(i10)));
        return i10;
    }

    @Override // android.graphics.Canvas
    public void disableZ() {
        b().disableZ();
    }

    @Override // android.graphics.Canvas
    public void drawARGB(int i10, int i11, int i12, int i13) {
        b().drawARGB(i10, i11, i12, i13);
    }

    @Override // android.graphics.Canvas
    public void drawArc(RectF oval, float f10, float f11, boolean z10, Paint paint) {
        Intrinsics.checkNotNullParameter(oval, "oval");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c10 = c(paint);
        b().drawArc(oval, f10, f11, z10, paint);
        paint.setShader(c10);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(int[] colors, int i10, int i11, float f10, float f11, int i12, int i13, boolean z10, Paint paint) {
        Intrinsics.checkNotNullParameter(colors, "colors");
    }

    @Override // android.graphics.Canvas
    public void drawBitmapMesh(Bitmap bitmap, int i10, int i11, float[] verts, int i12, int[] iArr, int i13, Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(verts, "verts");
    }

    @Override // android.graphics.Canvas
    public void drawCircle(float f10, float f11, float f12, Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c10 = c(paint);
        b().drawCircle(f10, f11, f12, paint);
        paint.setShader(c10);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i10) {
        b().drawColor(i10);
    }

    @Override // android.graphics.Canvas
    public void drawDoubleRoundRect(RectF outer, float f10, float f11, RectF inner, float f12, float f13, Paint paint) {
        Intrinsics.checkNotNullParameter(outer, "outer");
        Intrinsics.checkNotNullParameter(inner, "inner");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c10 = c(paint);
        b().drawDoubleRoundRect(outer, f10, f11, inner, f12, f13, paint);
        paint.setShader(c10);
    }

    @Override // android.graphics.Canvas
    public void drawGlyphs(int[] glyphIds, int i10, float[] positions, int i11, int i12, Font font, Paint paint) {
        Intrinsics.checkNotNullParameter(glyphIds, "glyphIds");
        Intrinsics.checkNotNullParameter(positions, "positions");
        Intrinsics.checkNotNullParameter(font, "font");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public void drawLine(float f10, float f11, float f12, float f13, Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c10 = c(paint);
        b().drawLine(f10, f11, f12, f13, paint);
        paint.setShader(c10);
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] pts, int i10, int i11, Paint paint) {
        Intrinsics.checkNotNullParameter(pts, "pts");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c10 = c(paint);
        b().drawLines(pts, i10, i11, paint);
        paint.setShader(c10);
    }

    @Override // android.graphics.Canvas
    public void drawMesh(Mesh mesh, BlendMode blendMode, Paint paint) {
        Intrinsics.checkNotNullParameter(mesh, "mesh");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public void drawOval(RectF oval, Paint paint) {
        Intrinsics.checkNotNullParameter(oval, "oval");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c10 = c(paint);
        b().drawOval(oval, paint);
        paint.setShader(c10);
    }

    @Override // android.graphics.Canvas
    public void drawPaint(Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c10 = c(paint);
        b().drawPaint(paint);
        paint.setShader(c10);
    }

    @Override // android.graphics.Canvas
    public void drawPatch(NinePatch patch, Rect dst, Paint paint) {
        Intrinsics.checkNotNullParameter(patch, "patch");
        Intrinsics.checkNotNullParameter(dst, "dst");
        BitmapShader c10 = c(paint);
        b().drawPatch(patch, dst, paint);
        if (paint == null) {
            return;
        }
        paint.setShader(c10);
    }

    @Override // android.graphics.Canvas
    public void drawPath(Path path, Paint paint) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c10 = c(paint);
        b().drawPath(path, paint);
        paint.setShader(c10);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture) {
        Intrinsics.checkNotNullParameter(picture, "picture");
        this.f51671b.setColorFilter(null);
        this.f51671b.setColor(-16777216);
        b().drawRect(0.0f, 0.0f, picture.getWidth(), picture.getHeight(), this.f51671b);
    }

    @Override // android.graphics.Canvas
    public void drawPoint(float f10, float f11, Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c10 = c(paint);
        b().drawPoint(f10, f11, paint);
        paint.setShader(c10);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] fArr, int i10, int i11, Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c10 = c(paint);
        b().drawPoints(fArr, i10, i11, paint);
        paint.setShader(c10);
    }

    @Override // android.graphics.Canvas
    public void drawPosText(String text, float[] pos, Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(pos, "pos");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public void drawRGB(int i10, int i11, int i12) {
        b().drawRGB(i10, i11, i12);
    }

    @Override // android.graphics.Canvas
    public void drawRect(RectF rect, Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c10 = c(paint);
        b().drawRect(rect, paint);
        paint.setShader(c10);
    }

    @Override // android.graphics.Canvas
    public void drawRenderNode(RenderNode renderNode) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(RectF rect, float f10, float f11, Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c10 = c(paint);
        b().drawRoundRect(rect, f10, f11, paint);
        paint.setShader(c10);
    }

    @Override // android.graphics.Canvas
    public void drawText(char[] text, int i10, int i11, float f10, float f11, Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text, i10, i11, this.f51673d);
        a(paint, f10, f11);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(String text, Path path, float f10, float f11, Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(char[] text, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text, 0, i10 + i11, this.f51673d);
        a(paint, f10, f11);
    }

    @Override // android.graphics.Canvas
    public void drawVertices(Canvas.VertexMode mode, int i10, float[] verts, int i11, float[] fArr, int i12, int[] iArr, int i13, short[] sArr, int i14, int i15, Paint paint) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(verts, "verts");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    public final void e(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "<set-?>");
        this.f51670a = canvas;
    }

    @Override // android.graphics.Canvas
    public void enableZ() {
        b().enableZ();
    }

    @Override // android.graphics.Canvas
    public boolean getClipBounds(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        return b().getClipBounds(bounds);
    }

    @Override // android.graphics.Canvas
    public int getDensity() {
        return b().getDensity();
    }

    @Override // android.graphics.Canvas
    public DrawFilter getDrawFilter() {
        return b().getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public int getHeight() {
        return b().getHeight();
    }

    @Override // android.graphics.Canvas
    public void getMatrix(Matrix ctm) {
        Intrinsics.checkNotNullParameter(ctm, "ctm");
        b().getMatrix(ctm);
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapHeight() {
        return b().getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapWidth() {
        return b().getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public int getSaveCount() {
        return b().getSaveCount();
    }

    @Override // android.graphics.Canvas
    public int getWidth() {
        return b().getWidth();
    }

    @Override // android.graphics.Canvas
    public boolean isHardwareAccelerated() {
        return false;
    }

    @Override // android.graphics.Canvas
    public boolean isOpaque() {
        return b().isOpaque();
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(RectF rect, Canvas.EdgeType type) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(type, "type");
        return b().quickReject(rect, type);
    }

    @Override // android.graphics.Canvas
    public void restore() {
        b().restore();
    }

    @Override // android.graphics.Canvas
    public void restoreToCount(int i10) {
        b().restoreToCount(i10);
    }

    @Override // android.graphics.Canvas
    public void rotate(float f10) {
        b().rotate(f10);
    }

    @Override // android.graphics.Canvas
    public int save() {
        return b().save();
    }

    @Override // android.graphics.Canvas
    public int saveLayer(RectF rectF, Paint paint, int i10) {
        BitmapShader c10 = c(paint);
        int saveLayer = b().saveLayer(rectF, paint, i10);
        if (paint == null) {
            return saveLayer;
        }
        paint.setShader(c10);
        return saveLayer;
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(RectF rectF, int i10, int i11) {
        return b().saveLayerAlpha(rectF, i10, i11);
    }

    @Override // android.graphics.Canvas
    public void scale(float f10, float f11) {
        b().scale(f10, f11);
    }

    @Override // android.graphics.Canvas
    public void setBitmap(Bitmap bitmap) {
        b().setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public void setDensity(int i10) {
        b().setDensity(i10);
    }

    @Override // android.graphics.Canvas
    public void setDrawFilter(DrawFilter drawFilter) {
        b().setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public void setMatrix(Matrix matrix) {
        b().setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public void skew(float f10, float f11) {
        b().skew(f10, f11);
    }

    @Override // android.graphics.Canvas
    public void translate(float f10, float f11) {
        b().translate(f10, f11);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(Rect rect) {
        boolean clipOutRect;
        Intrinsics.checkNotNullParameter(rect, "rect");
        clipOutRect = b().clipOutRect(rect);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return b().clipPath(path);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(Rect rect, Region.Op op) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(op, "op");
        return b().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(int[] colors, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, Paint paint) {
        Intrinsics.checkNotNullParameter(colors, "colors");
    }

    @Override // android.graphics.Canvas
    public void drawColor(long j10) {
        b().drawColor(j10);
    }

    @Override // android.graphics.Canvas
    public void drawPosText(char[] text, int i10, int i11, float[] pos, Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(pos, "pos");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(char[] text, int i10, int i11, Path path, float f10, float f11, Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(RectF rect) {
        boolean quickReject;
        Intrinsics.checkNotNullParameter(rect, "rect");
        quickReject = b().quickReject(rect);
        return quickReject;
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(RectF rectF, int i10) {
        return b().saveLayerAlpha(rectF, i10);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(float f10, float f11, float f12, float f13) {
        boolean clipOutRect;
        clipOutRect = b().clipOutRect(f10, f11, f12, f13);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(RectF rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return b().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, float f10, float f11, Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f51671b.setColor(d(bitmap, paint, null));
        this.f51671b.setColorFilter(null);
        b().drawRect(f10, f11, f10 + bitmap.getWidth(), f11 + bitmap.getHeight(), this.f51671b);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i10, PorterDuff.Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        b().drawColor(i10, mode);
    }

    @Override // android.graphics.Canvas
    public void drawText(String text, float f10, float f11, Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text, 0, text.length(), this.f51673d);
        a(paint, f10, f11);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(CharSequence text, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text.toString(), i10, i11, this.f51673d);
        a(paint, f10, f11);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(Path path, Canvas.EdgeType type) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(type, "type");
        return b().quickReject(path, type);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float f10, float f11, float f12, float f13, int i10, int i11) {
        return b().saveLayerAlpha(f10, f11, f12, f13, i10, i11);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(int i10, int i11, int i12, int i13) {
        boolean clipOutRect;
        clipOutRect = b().clipOutRect(i10, i11, i12, i13);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return b().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public void drawArc(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c10 = c(paint);
        b().drawArc(f10, f11, f12, f13, f14, f15, z10, paint);
        paint.setShader(c10);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i10, BlendMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        b().drawColor(i10, mode);
    }

    @Override // android.graphics.Canvas
    public void drawDoubleRoundRect(RectF outer, float[] outerRadii, RectF inner, float[] innerRadii, Paint paint) {
        Intrinsics.checkNotNullParameter(outer, "outer");
        Intrinsics.checkNotNullParameter(outerRadii, "outerRadii");
        Intrinsics.checkNotNullParameter(inner, "inner");
        Intrinsics.checkNotNullParameter(innerRadii, "innerRadii");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c10 = c(paint);
        b().drawDoubleRoundRect(outer, outerRadii, inner, innerRadii, paint);
        paint.setShader(c10);
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] pts, Paint paint) {
        Intrinsics.checkNotNullParameter(pts, "pts");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c10 = c(paint);
        b().drawLines(pts, paint);
        paint.setShader(c10);
    }

    @Override // android.graphics.Canvas
    public void drawOval(float f10, float f11, float f12, float f13, Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c10 = c(paint);
        b().drawOval(f10, f11, f12, f13, paint);
        paint.setShader(c10);
    }

    @Override // android.graphics.Canvas
    public void drawPatch(NinePatch patch, RectF dst, Paint paint) {
        Intrinsics.checkNotNullParameter(patch, "patch");
        Intrinsics.checkNotNullParameter(dst, "dst");
        BitmapShader c10 = c(paint);
        b().drawPatch(patch, dst, paint);
        if (paint == null) {
            return;
        }
        paint.setShader(c10);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture, RectF dst) {
        Intrinsics.checkNotNullParameter(picture, "picture");
        Intrinsics.checkNotNullParameter(dst, "dst");
        this.f51671b.setColorFilter(null);
        this.f51671b.setColor(-16777216);
        b().drawRect(dst, this.f51671b);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] pts, Paint paint) {
        Intrinsics.checkNotNullParameter(pts, "pts");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c10 = c(paint);
        b().drawPoints(pts, paint);
        paint.setShader(c10);
    }

    @Override // android.graphics.Canvas
    public void drawRect(Rect r10, Paint paint) {
        Intrinsics.checkNotNullParameter(r10, "r");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c10 = c(paint);
        b().drawRect(r10, paint);
        paint.setShader(c10);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(float f10, float f11, float f12, float f13, float f14, float f15, Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c10 = c(paint);
        b().drawRoundRect(f10, f11, f12, f13, f14, f15, paint);
        paint.setShader(c10);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(Path path) {
        boolean quickReject;
        Intrinsics.checkNotNullParameter(path, "path");
        quickReject = b().quickReject(path);
        return quickReject;
    }

    @Override // android.graphics.Canvas
    public int saveLayer(RectF rectF, Paint paint) {
        BitmapShader c10 = c(paint);
        int saveLayer = b().saveLayer(rectF, paint);
        if (paint == null) {
            return saveLayer;
        }
        paint.setShader(c10);
        return saveLayer;
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float f10, float f11, float f12, float f13, int i10) {
        return b().saveLayerAlpha(f10, f11, f12, f13, i10);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float f10, float f11, float f12, float f13, Region.Op op) {
        Intrinsics.checkNotNullParameter(op, "op");
        return b().clipRect(f10, f11, f12, f13, op);
    }

    @Override // android.graphics.Canvas
    public void drawColor(long j10, BlendMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        b().drawColor(j10, mode);
    }

    @Override // android.graphics.Canvas
    public void drawText(String text, int i10, int i11, float f10, float f11, Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text, i10, i11, this.f51673d);
        a(paint, f10, f11);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(MeasuredText text, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        String measuredText;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        measuredText = text.toString();
        paint.getTextBounds(measuredText, i10, i11, this.f51673d);
        a(paint, f10, f11);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(float f10, float f11, float f12, float f13, Canvas.EdgeType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return b().quickReject(f10, f11, f12, f13, type);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float f10, float f11, float f12, float f13) {
        return b().clipRect(f10, f11, f12, f13);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(float f10, float f11, float f12, float f13) {
        boolean quickReject;
        quickReject = b().quickReject(f10, f11, f12, f13);
        return quickReject;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(int i10, int i11, int i12, int i13) {
        return b().clipRect(i10, i11, i12, i13);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Rect rect, RectF dst, Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(dst, "dst");
        this.f51671b.setColor(d(bitmap, paint, rect));
        this.f51671b.setColorFilter(null);
        b().drawRect(dst, this.f51671b);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture, Rect dst) {
        Intrinsics.checkNotNullParameter(picture, "picture");
        Intrinsics.checkNotNullParameter(dst, "dst");
        this.f51671b.setColorFilter(null);
        this.f51671b.setColor(-16777216);
        b().drawRect(dst, this.f51671b);
    }

    @Override // android.graphics.Canvas
    public void drawRect(float f10, float f11, float f12, float f13, Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c10 = c(paint);
        b().drawRect(f10, f11, f12, f13, paint);
        paint.setShader(c10);
    }

    @Override // android.graphics.Canvas
    public void drawText(CharSequence text, int i10, int i11, float f10, float f11, Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text.toString(), 0, text.length(), this.f51673d);
        a(paint, f10, f11);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float f10, float f11, float f12, float f13, Paint paint, int i10) {
        BitmapShader c10 = c(paint);
        int saveLayer = b().saveLayer(f10, f11, f12, f13, paint, i10);
        if (paint == null) {
            return saveLayer;
        }
        paint.setShader(c10);
        return saveLayer;
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float f10, float f11, float f12, float f13, Paint paint) {
        BitmapShader c10 = c(paint);
        int saveLayer = b().saveLayer(f10, f11, f12, f13, paint);
        if (paint == null) {
            return saveLayer;
        }
        paint.setShader(c10);
        return saveLayer;
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Rect rect, Rect dst, Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(dst, "dst");
        this.f51671b.setColor(d(bitmap, paint, rect));
        this.f51671b.setColorFilter(null);
        b().drawRect(dst, this.f51671b);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f51671b.setColor(d(bitmap, paint, null));
        this.f51671b.setColorFilter(null);
        int save = b().save();
        b().setMatrix(matrix);
        b().drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.f51671b);
        b().restoreToCount(save);
    }
}
