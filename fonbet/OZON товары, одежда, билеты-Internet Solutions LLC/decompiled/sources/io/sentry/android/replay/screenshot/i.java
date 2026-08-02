package io.sentry.android.replay.screenshot;

import Sc.InterfaceC3999a;
import android.annotation.SuppressLint;
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
import org.jetbrains.annotations.NotNull;

@SuppressLint({"UseKtx"})
/* loaded from: classes10.dex */
final class i extends Canvas {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f67645a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Paint f67646b = new Paint();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Paint f67647c = new Paint();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Rect f67648d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Bitmap f67649e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Canvas f67650f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Rect f67651g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final WeakHashMap<Bitmap, Pair<Integer, Integer>> f67652h;

    public i() {
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        this.f67649e = createBitmap;
        this.f67650f = new Canvas(createBitmap);
        this.f67651g = new Rect(0, 0, 1, 1);
        this.f67652h = new WeakHashMap<>();
    }

    private final void a(float f7, float f11, Paint paint) {
        Paint paint2 = this.f67647c;
        paint2.setColorFilter(paint.getColorFilter());
        int color = paint.getColor();
        paint2.setColor(Color.argb(100, Color.red(color), Color.green(color), Color.blue(color)));
        Rect rect = this.f67648d;
        drawRoundRect(rect.left + f7, rect.top + f11, rect.right + f7, rect.bottom + f11, 10.0f, 10.0f, paint2);
    }

    private static BitmapShader c(Paint paint) {
        if (paint != null) {
            Shader shader = paint.getShader();
            if (shader instanceof BitmapShader) {
                paint.setShader(null);
                return (BitmapShader) shader;
            }
        }
        return null;
    }

    private final int d(Bitmap bitmap, Paint paint, Rect rect) {
        Bitmap asShared;
        int i11 = -16777216;
        if (bitmap.isRecycled()) {
            return -16777216;
        }
        WeakHashMap<Bitmap, Pair<Integer, Integer>> weakHashMap = this.f67652h;
        Pair<Integer, Integer> pair = weakHashMap.get(bitmap);
        if (pair != null && pair.e().intValue() == bitmap.getGenerationId()) {
            return pair.f().intValue();
        }
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.HARDWARE;
        Canvas canvas = this.f67650f;
        Bitmap bitmap2 = this.f67649e;
        Rect rect2 = this.f67651g;
        if (config == config2 && Build.VERSION.SDK_INT >= 31) {
            BitmapShader c11 = c(paint);
            asShared = bitmap.asShared();
            canvas.drawBitmap(asShared, rect, rect2, paint);
            if (c11 != null && paint != null) {
                paint.setShader(c11);
            }
            i11 = bitmap2.getPixel(0, 0);
        } else if (bitmap.getConfig() != config2) {
            BitmapShader c12 = c(paint);
            canvas.drawBitmap(bitmap, rect, rect2, paint);
            if (c12 != null && paint != null) {
                paint.setShader(c12);
            }
            i11 = bitmap2.getPixel(0, 0);
        }
        weakHashMap.put(bitmap, new Pair<>(Integer.valueOf(bitmap.getGenerationId()), Integer.valueOf(i11)));
        return i11;
    }

    @NotNull
    public final Canvas b() {
        Canvas canvas = this.f67645a;
        if (canvas != null) {
            return canvas;
        }
        Intrinsics.n("delegate");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return b().clipOutPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(@NotNull RectF rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return b().clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    @InterfaceC3999a
    public final boolean clipPath(@NotNull Path path, @NotNull Region.Op op) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(op, "op");
        return b().clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    @InterfaceC3999a
    public final boolean clipRect(@NotNull RectF rect, @NotNull Region.Op op) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(op, "op");
        return b().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        b().concat(matrix);
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        b().disableZ();
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i11, int i12, int i13, int i14) {
        b().drawARGB(i11, i12, i13, i14);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(@NotNull RectF oval, float f7, float f11, boolean z11, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(oval, "oval");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c11 = c(paint);
        b().drawArc(oval, f7, f11, z11, paint);
        paint.setShader(c11);
    }

    @Override // android.graphics.Canvas
    @InterfaceC3999a
    public final void drawBitmap(@NotNull int[] colors, int i11, int i12, float f7, float f11, int i13, int i14, boolean z11, Paint paint) {
        Intrinsics.checkNotNullParameter(colors, "colors");
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(@NotNull Bitmap bitmap, int i11, int i12, @NotNull float[] verts, int i13, int[] iArr, int i14, Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(verts, "verts");
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f7, float f11, float f12, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c11 = c(paint);
        b().drawCircle(f7, f11, f12, paint);
        paint.setShader(c11);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i11) {
        b().drawColor(i11);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(@NotNull RectF outer, float f7, float f11, @NotNull RectF inner, float f12, float f13, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(outer, "outer");
        Intrinsics.checkNotNullParameter(inner, "inner");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c11 = c(paint);
        b().drawDoubleRoundRect(outer, f7, f11, inner, f12, f13, paint);
        paint.setShader(c11);
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(@NotNull int[] glyphIds, int i11, @NotNull float[] positions, int i12, int i13, @NotNull Font font, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(glyphIds, "glyphIds");
        Intrinsics.checkNotNullParameter(positions, "positions");
        Intrinsics.checkNotNullParameter(font, "font");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f7, float f11, float f12, float f13, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c11 = c(paint);
        b().drawLine(f7, f11, f12, f13, paint);
        paint.setShader(c11);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(@NotNull float[] pts, int i11, int i12, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(pts, "pts");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c11 = c(paint);
        b().drawLines(pts, i11, i12, paint);
        paint.setShader(c11);
    }

    @Override // android.graphics.Canvas
    public final void drawMesh(@NotNull Mesh mesh, BlendMode blendMode, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(mesh, "mesh");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void drawOval(@NotNull RectF oval, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(oval, "oval");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c11 = c(paint);
        b().drawOval(oval, paint);
        paint.setShader(c11);
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(@NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c11 = c(paint);
        b().drawPaint(paint);
        paint.setShader(c11);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(@NotNull NinePatch patch, @NotNull Rect dst, Paint paint) {
        Intrinsics.checkNotNullParameter(patch, "patch");
        Intrinsics.checkNotNullParameter(dst, "dst");
        BitmapShader c11 = c(paint);
        b().drawPatch(patch, dst, paint);
        if (paint == null) {
            return;
        }
        paint.setShader(c11);
    }

    @Override // android.graphics.Canvas
    public final void drawPath(@NotNull Path path, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c11 = c(paint);
        b().drawPath(path, paint);
        paint.setShader(c11);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(@NotNull Picture picture) {
        Intrinsics.checkNotNullParameter(picture, "picture");
        Paint paint = this.f67646b;
        paint.setColorFilter(null);
        paint.setColor(-16777216);
        b().drawRect(0.0f, 0.0f, picture.getWidth(), picture.getHeight(), paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f7, float f11, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c11 = c(paint);
        b().drawPoint(f7, f11, paint);
        paint.setShader(c11);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i11, int i12, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c11 = c(paint);
        b().drawPoints(fArr, i11, i12, paint);
        paint.setShader(c11);
    }

    @Override // android.graphics.Canvas
    @InterfaceC3999a
    public final void drawPosText(@NotNull String text, @NotNull float[] pos, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(pos, "pos");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i11, int i12, int i13) {
        b().drawRGB(i11, i12, i13);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(@NotNull RectF rect, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c11 = c(paint);
        b().drawRect(rect, paint);
        paint.setShader(c11);
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(@NotNull RenderNode renderNode) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(@NotNull RectF rect, float f7, float f11, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c11 = c(paint);
        b().drawRoundRect(rect, f7, f11, paint);
        paint.setShader(c11);
    }

    @Override // android.graphics.Canvas
    public final void drawText(@NotNull char[] text, int i11, int i12, float f7, float f11, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text, i11, i12, this.f67648d);
        a(f7, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(@NotNull String text, @NotNull Path path, float f7, float f11, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(@NotNull char[] text, int i11, int i12, int i13, int i14, float f7, float f11, boolean z11, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text, 0, i11 + i12, this.f67648d);
        a(f7, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(@NotNull Canvas.VertexMode mode, int i11, @NotNull float[] verts, int i12, float[] fArr, int i13, int[] iArr, int i14, short[] sArr, int i15, int i16, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(verts, "verts");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        b().enableZ();
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(@NotNull Rect bounds) {
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
    @InterfaceC3999a
    public final void getMatrix(@NotNull Matrix ctm) {
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
    @InterfaceC3999a
    public final boolean quickReject(@NotNull RectF rect, @NotNull Canvas.EdgeType type) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(type, "type");
        return b().quickReject(rect, type);
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        b().restore();
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i11) {
        b().restoreToCount(i11);
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f7) {
        b().rotate(f7);
    }

    @Override // android.graphics.Canvas
    public final int save() {
        return b().save();
    }

    @Override // android.graphics.Canvas
    @InterfaceC3999a
    public final int saveLayer(RectF rectF, Paint paint, int i11) {
        BitmapShader c11 = c(paint);
        int saveLayer = b().saveLayer(rectF, paint, i11);
        if (paint == null) {
            return saveLayer;
        }
        paint.setShader(c11);
        return saveLayer;
    }

    @Override // android.graphics.Canvas
    @InterfaceC3999a
    public final int saveLayerAlpha(RectF rectF, int i11, int i12) {
        return b().saveLayerAlpha(rectF, i11, i12);
    }

    @Override // android.graphics.Canvas
    public final void scale(float f7, float f11) {
        b().scale(f7, f11);
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        b().setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i11) {
        b().setDensity(i11);
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
    public final void skew(float f7, float f11) {
        b().skew(f7, f11);
    }

    @Override // android.graphics.Canvas
    public final void translate(float f7, float f11) {
        b().translate(f7, f11);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return b().clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return b().clipPath(path);
    }

    @Override // android.graphics.Canvas
    @InterfaceC3999a
    public final boolean clipRect(@NotNull Rect rect, @NotNull Region.Op op) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(op, "op");
        return b().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    @InterfaceC3999a
    public final void drawBitmap(@NotNull int[] colors, int i11, int i12, int i13, int i14, int i15, int i16, boolean z11, Paint paint) {
        Intrinsics.checkNotNullParameter(colors, "colors");
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j11) {
        b().drawColor(j11);
    }

    @Override // android.graphics.Canvas
    @InterfaceC3999a
    public final void drawPosText(@NotNull char[] text, int i11, int i12, @NotNull float[] pos, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(pos, "pos");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(@NotNull char[] text, int i11, int i12, @NotNull Path path, float f7, float f11, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(@NotNull RectF rect) {
        boolean quickReject;
        Intrinsics.checkNotNullParameter(rect, "rect");
        quickReject = b().quickReject(rect);
        return quickReject;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i11) {
        return b().saveLayerAlpha(rectF, i11);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f7, float f11, float f12, float f13) {
        return b().clipOutRect(f7, f11, f12, f13);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(@NotNull RectF rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return b().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(@NotNull Bitmap bitmap, float f7, float f11, Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int d11 = d(bitmap, paint, null);
        Paint paint2 = this.f67646b;
        paint2.setColor(d11);
        paint2.setColorFilter(null);
        b().drawRect(f7, f11, f7 + bitmap.getWidth(), f11 + bitmap.getHeight(), paint2);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i11, @NotNull PorterDuff.Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        b().drawColor(i11, mode);
    }

    @Override // android.graphics.Canvas
    public final void drawText(@NotNull String text, float f7, float f11, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text, 0, text.length(), this.f67648d);
        a(f7, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(@NotNull CharSequence text, int i11, int i12, int i13, int i14, float f7, float f11, boolean z11, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text.toString(), i11, i12, this.f67648d);
        a(f7, f11, paint);
    }

    @Override // android.graphics.Canvas
    @InterfaceC3999a
    public final boolean quickReject(@NotNull Path path, @NotNull Canvas.EdgeType type) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(type, "type");
        return b().quickReject(path, type);
    }

    @Override // android.graphics.Canvas
    @InterfaceC3999a
    public final int saveLayerAlpha(float f7, float f11, float f12, float f13, int i11, int i12) {
        return b().saveLayerAlpha(f7, f11, f12, f13, i11, i12);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i11, int i12, int i13, int i14) {
        return b().clipOutRect(i11, i12, i13, i14);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return b().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f7, float f11, float f12, float f13, float f14, float f15, boolean z11, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c11 = c(paint);
        b().drawArc(f7, f11, f12, f13, f14, f15, z11, paint);
        paint.setShader(c11);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i11, @NotNull BlendMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        b().drawColor(i11, mode);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(@NotNull RectF outer, @NotNull float[] outerRadii, @NotNull RectF inner, @NotNull float[] innerRadii, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(outer, "outer");
        Intrinsics.checkNotNullParameter(outerRadii, "outerRadii");
        Intrinsics.checkNotNullParameter(inner, "inner");
        Intrinsics.checkNotNullParameter(innerRadii, "innerRadii");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c11 = c(paint);
        b().drawDoubleRoundRect(outer, outerRadii, inner, innerRadii, paint);
        paint.setShader(c11);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(@NotNull float[] pts, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(pts, "pts");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c11 = c(paint);
        b().drawLines(pts, paint);
        paint.setShader(c11);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f7, float f11, float f12, float f13, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c11 = c(paint);
        b().drawOval(f7, f11, f12, f13, paint);
        paint.setShader(c11);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(@NotNull NinePatch patch, @NotNull RectF dst, Paint paint) {
        Intrinsics.checkNotNullParameter(patch, "patch");
        Intrinsics.checkNotNullParameter(dst, "dst");
        BitmapShader c11 = c(paint);
        b().drawPatch(patch, dst, paint);
        if (paint == null) {
            return;
        }
        paint.setShader(c11);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(@NotNull Picture picture, @NotNull RectF dst) {
        Intrinsics.checkNotNullParameter(picture, "picture");
        Intrinsics.checkNotNullParameter(dst, "dst");
        Paint paint = this.f67646b;
        paint.setColorFilter(null);
        paint.setColor(-16777216);
        b().drawRect(dst, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(@NotNull float[] pts, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(pts, "pts");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c11 = c(paint);
        b().drawPoints(pts, paint);
        paint.setShader(c11);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(@NotNull Rect r11, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(r11, "r");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c11 = c(paint);
        b().drawRect(r11, paint);
        paint.setShader(c11);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f7, float f11, float f12, float f13, float f14, float f15, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c11 = c(paint);
        b().drawRoundRect(f7, f11, f12, f13, f14, f15, paint);
        paint.setShader(c11);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(@NotNull Path path) {
        boolean quickReject;
        Intrinsics.checkNotNullParameter(path, "path");
        quickReject = b().quickReject(path);
        return quickReject;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        BitmapShader c11 = c(paint);
        int saveLayer = b().saveLayer(rectF, paint);
        if (paint == null) {
            return saveLayer;
        }
        paint.setShader(c11);
        return saveLayer;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f7, float f11, float f12, float f13, int i11) {
        return b().saveLayerAlpha(f7, f11, f12, f13, i11);
    }

    @Override // android.graphics.Canvas
    @InterfaceC3999a
    public final boolean clipRect(float f7, float f11, float f12, float f13, @NotNull Region.Op op) {
        Intrinsics.checkNotNullParameter(op, "op");
        return b().clipRect(f7, f11, f12, f13, op);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j11, @NotNull BlendMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        b().drawColor(j11, mode);
    }

    @Override // android.graphics.Canvas
    public final void drawText(@NotNull String text, int i11, int i12, float f7, float f11, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text, i11, i12, this.f67648d);
        a(f7, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(@NotNull MeasuredText text, int i11, int i12, int i13, int i14, float f7, float f11, boolean z11, @NotNull Paint paint) {
        String measuredText;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        measuredText = text.toString();
        paint.getTextBounds(measuredText, i11, i12, this.f67648d);
        a(f7, f11, paint);
    }

    @Override // android.graphics.Canvas
    @InterfaceC3999a
    public final boolean quickReject(float f7, float f11, float f12, float f13, @NotNull Canvas.EdgeType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return b().quickReject(f7, f11, f12, f13, type);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f7, float f11, float f12, float f13) {
        return b().clipRect(f7, f11, f12, f13);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f7, float f11, float f12, float f13) {
        boolean quickReject;
        quickReject = b().quickReject(f7, f11, f12, f13);
        return quickReject;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i11, int i12, int i13, int i14) {
        return b().clipRect(i11, i12, i13, i14);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(@NotNull Bitmap bitmap, Rect rect, @NotNull RectF dst, Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int d11 = d(bitmap, paint, rect);
        Paint paint2 = this.f67646b;
        paint2.setColor(d11);
        paint2.setColorFilter(null);
        b().drawRect(dst, paint2);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(@NotNull Picture picture, @NotNull Rect dst) {
        Intrinsics.checkNotNullParameter(picture, "picture");
        Intrinsics.checkNotNullParameter(dst, "dst");
        Paint paint = this.f67646b;
        paint.setColorFilter(null);
        paint.setColor(-16777216);
        b().drawRect(dst, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f7, float f11, float f12, float f13, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader c11 = c(paint);
        b().drawRect(f7, f11, f12, f13, paint);
        paint.setShader(c11);
    }

    @Override // android.graphics.Canvas
    public final void drawText(@NotNull CharSequence text, int i11, int i12, float f7, float f11, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text.toString(), 0, text.length(), this.f67648d);
        a(f7, f11, paint);
    }

    @Override // android.graphics.Canvas
    @InterfaceC3999a
    public final int saveLayer(float f7, float f11, float f12, float f13, Paint paint, int i11) {
        BitmapShader c11 = c(paint);
        int saveLayer = b().saveLayer(f7, f11, f12, f13, paint, i11);
        if (paint == null) {
            return saveLayer;
        }
        paint.setShader(c11);
        return saveLayer;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f7, float f11, float f12, float f13, Paint paint) {
        BitmapShader c11 = c(paint);
        int saveLayer = b().saveLayer(f7, f11, f12, f13, paint);
        if (paint == null) {
            return saveLayer;
        }
        paint.setShader(c11);
        return saveLayer;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(@NotNull Bitmap bitmap, Rect rect, @NotNull Rect dst, Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int d11 = d(bitmap, paint, rect);
        Paint paint2 = this.f67646b;
        paint2.setColor(d11);
        paint2.setColorFilter(null);
        b().drawRect(dst, paint2);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(@NotNull Bitmap bitmap, @NotNull Matrix matrix, Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        int d11 = d(bitmap, paint, null);
        Paint paint2 = this.f67646b;
        paint2.setColor(d11);
        paint2.setColorFilter(null);
        int save = b().save();
        b().setMatrix(matrix);
        b().drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), paint2);
        b().restoreToCount(save);
    }
}
