package com.logrocket.core.graphics;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.text.MeasuredText;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.appcompat.widget.c1;
import com.google.firebase.messaging.u;
import com.google.firebase.messaging.x;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class ShimCanvas extends Canvas {

    /* renamed from: g, reason: collision with root package name */
    public static final int f6466g = Color.parseColor("#252525");

    /* renamed from: h, reason: collision with root package name */
    public static final int f6467h = Color.parseColor("#909090");

    /* renamed from: i, reason: collision with root package name */
    public static final Paint f6468i = new Paint();

    /* renamed from: a, reason: collision with root package name */
    public final f f6469a;

    /* renamed from: b, reason: collision with root package name */
    public final n f6470b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6471c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6472d;

    /* renamed from: e, reason: collision with root package name */
    public View f6473e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f6474f;

    public ShimCanvas(Bitmap bitmap, f fVar, n nVar, Map map) {
        super(bitmap);
        v.f.d(1);
        this.f6471c = false;
        this.f6472d = false;
        this.f6474f = new HashMap();
        this.f6469a = fVar;
        this.f6470b = nVar;
        nVar.f6575i = false;
        nVar.j = false;
        nVar.f6579n.clear();
        nVar.f6578m.clear();
        nVar.f6580o.clear();
        if (x.f6180g == null) {
            x xVar = new x();
            xVar.f6184c = new HashMap();
            xVar.f6185d = new ba.d("shim-canvas");
            xVar.f6182a = map;
            xVar.f6183b = new kh.g(8);
            x.f6180g = xVar;
        }
        nVar.f6581p = x.f6180g;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = f6468i;
        paint.setStyle(style);
        paint.setStrokeWidth(5.0f);
        paint.setAlpha(192);
        paint.setColor(f6467h);
    }

    public static i a(Bitmap bitmap) {
        byte[] ninePatchChunk = bitmap.getNinePatchChunk();
        if (ninePatchChunk == null) {
            return null;
        }
        ByteBuffer order = ByteBuffer.wrap(ninePatchChunk).order(ByteOrder.nativeOrder());
        if (order.get(0) == 0) {
            return null;
        }
        int i5 = order.getInt(20);
        int i10 = order.getInt(24);
        int i11 = order.getInt(12);
        int i12 = order.getInt(16);
        i iVar = new i();
        iVar.f6555a = i11;
        iVar.f6556b = i12;
        iVar.f6557c = i5;
        iVar.f6558d = i10;
        return iVar;
    }

    public final Boolean b(String str) {
        if (str == null) {
            return Boolean.FALSE;
        }
        boolean z5 = false;
        if (this.f6472d) {
            Boolean bool = (Boolean) t9.c.f23781l.get(str);
            if (!(bool != null && bool.booleanValue())) {
                z5 = true;
            }
        }
        return Boolean.valueOf(z5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0094, code lost:
    
        if ((r11.getTranslationY() + r11.getTop()) != 0.0f) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(View view, int i5, boolean z5, boolean z7) {
        this.f6473e = view;
        this.f6471c = j.a(view);
        this.f6472d = i5 == 1 && !z7;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        n nVar = this.f6470b;
        if (!nVar.f6575i && !nVar.j) {
            int identityHashCode = System.identityHashCode(view);
            o oVar = z5 ? null : new o(view);
            if (!z5) {
                nVar.f6578m.put(Integer.valueOf(identityHashCode), oVar);
            }
            nVar.b(System.identityHashCode(view), oVar, i10, i11, view.getWidth(), view.getHeight());
        }
        int save = save();
        this.f6474f.put(view, Integer.valueOf(save));
        if (save == 1) {
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            int i12 = iArr2[0];
            if (i12 != 0 || iArr2[1] != 0) {
                translate(i12, iArr2[1]);
            }
        } else {
            if (view.getTranslationX() + view.getLeft() == 0.0f) {
            }
            translate(view.getTranslationX() + view.getLeft(), view.getTranslationY() + view.getTop());
        }
        Outline outline = new Outline();
        ViewOutlineProvider outlineProvider = view.getOutlineProvider();
        if (outlineProvider != null) {
            outlineProvider.getOutline(view, outline);
        }
        float radius = outline.getRadius();
        if (radius > 0.0f) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (!nVar.f6575i && !nVar.j) {
                c1.s(3, nVar, c.type);
                nVar.e(c.left, 0);
                nVar.e(c.top, 0);
                nVar.e(c.right, Integer.valueOf(width));
                nVar.e(c.bottom, Integer.valueOf(height));
                nVar.e(c.radius, Float.valueOf(radius));
                nVar.a();
            }
        } else {
            clipRect(0, 0, view.getWidth(), view.getHeight());
        }
        float alpha = view.getAlpha();
        if (alpha < 1.0f) {
            saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (alpha * 255.0f));
        }
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        int i5 = rect.left;
        this.f6470b.g(rect.left, rect.top, rect.right, rect.bottom);
        return super.clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        if (op == Region.Op.INTERSECT) {
            float[] a7 = s6.a.a(path);
            n nVar = this.f6470b;
            if (!nVar.f6575i && !nVar.j) {
                c1.s(2, nVar, c.type);
                nVar.e(c.pts, a7);
                nVar.a();
            }
        }
        return super.clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        float f6 = rectF.left;
        if (op == Region.Op.INTERSECT) {
            this.f6470b.h((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        return super.clipRect(rectF, op);
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        if (matrix != null) {
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            n nVar = this.f6470b;
            if (!nVar.f6575i && !nVar.j) {
                c1.s(5, nVar, c.type);
                nVar.e(c.pts, fArr);
                nVar.a();
            }
        }
        super.concat(matrix);
    }

    public final void d(Integer num, int i5, int i10, ImageView imageView) {
        if (!this.f6469a.d() && num.intValue() > 0) {
            this.f6470b.i(0, 0, i5, i10, num.intValue(), imageView, new Paint());
        }
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i5, int i10, int i11, int i12) {
        if (this.f6469a.d()) {
            return;
        }
        int argb = Color.argb(i5, i10, i11, i12);
        n nVar = this.f6470b;
        if (nVar.f6575i || nVar.j) {
            return;
        }
        c1.s(6, nVar, c.type);
        nVar.e(c.color, Integer.valueOf(argb));
        nVar.a();
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f6, float f10, float f11, float f12, float f13, float f14, boolean z5, Paint paint) {
        if (this.f6469a.d()) {
            return;
        }
        int i5 = (int) f6;
        int i10 = (int) f10;
        int i11 = (int) f11;
        int i12 = (int) f12;
        View view = this.f6473e;
        n nVar = this.f6470b;
        if (nVar.f6575i || nVar.j) {
            return;
        }
        c1.s(7, nVar, c.type);
        nVar.e(c.left, Integer.valueOf(i5));
        nVar.e(c.top, Integer.valueOf(i10));
        nVar.e(c.right, Integer.valueOf(i11));
        nVar.e(c.bottom, Integer.valueOf(i12));
        nVar.e(c.startAngle, Float.valueOf(f13));
        nVar.e(c.sweepAngle, Float.valueOf(f14));
        nVar.e(c.useCenter, Boolean.valueOf(z5));
        k2.x.l(nVar, view, paint);
        nVar.a();
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f6, float f10, Paint paint) {
        int c2;
        f fVar = this.f6469a;
        if (fVar.d() || bitmap.isRecycled() || (c2 = fVar.c(bitmap)) <= 0) {
            return;
        }
        int i5 = (int) f6;
        int i10 = (int) f10;
        this.f6470b.i(i5, i10, bitmap.getWidth() + i5, bitmap.getHeight() + i10, c2, this.f6473e, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f6, float f10, float f11, Paint paint) {
        if (this.f6469a.d()) {
            return;
        }
        int i5 = (int) f6;
        int i10 = (int) f10;
        View view = this.f6473e;
        n nVar = this.f6470b;
        if (nVar.f6575i || nVar.j) {
            return;
        }
        c1.s(10, nVar, c.type);
        nVar.e(c.x0, Integer.valueOf(i5));
        nVar.e(c.y0, Integer.valueOf(i10));
        nVar.e(c.radius, Float.valueOf(f11));
        k2.x.l(nVar, view, paint);
        nVar.a();
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i5) {
        if (this.f6469a.d()) {
            return;
        }
        this.f6470b.j(i5);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f6, float f10, RectF rectF2, float f11, float f12, Paint paint) {
        if (this.f6469a.d()) {
            return;
        }
        View view = this.f6473e;
        n nVar = this.f6470b;
        if (nVar.f6575i || nVar.j) {
            return;
        }
        c1.s(12, nVar, c.type);
        nVar.e(c.outerRectLeft, Integer.valueOf((int) rectF.left));
        nVar.e(c.outerRectTop, Integer.valueOf((int) rectF.top));
        nVar.e(c.outerRectRight, Integer.valueOf((int) rectF.right));
        nVar.e(c.outerRectBottom, Integer.valueOf((int) rectF.bottom));
        nVar.e(c.outerRx, Float.valueOf(f6));
        nVar.e(c.outerRy, Float.valueOf(f10));
        nVar.e(c.innerRectLeft, Integer.valueOf((int) rectF2.left));
        nVar.e(c.innerRectTop, Integer.valueOf((int) rectF2.top));
        nVar.e(c.innerRectRight, Integer.valueOf((int) rectF2.right));
        nVar.e(c.innerRectBottom, Integer.valueOf((int) rectF2.bottom));
        nVar.e(c.innerRx, Float.valueOf(f11));
        nVar.e(c.innerRy, Float.valueOf(f12));
        k2.x.l(nVar, view, paint);
        nVar.a();
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f6, float f10, float f11, float f12, Paint paint) {
        if (this.f6469a.d()) {
            return;
        }
        int i5 = (int) f6;
        int i10 = (int) f10;
        int i11 = (int) f11;
        int i12 = (int) f12;
        View view = this.f6473e;
        n nVar = this.f6470b;
        if (nVar.f6575i || nVar.j) {
            return;
        }
        c1.s(13, nVar, c.type);
        nVar.e(c.x0, Integer.valueOf(i5));
        nVar.e(c.y0, Integer.valueOf(i10));
        nVar.e(c.x1, Integer.valueOf(i11));
        nVar.e(c.y1, Integer.valueOf(i12));
        k2.x.l(nVar, view, paint);
        nVar.a();
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i5, int i10, Paint paint) {
        if (this.f6469a.d()) {
            return;
        }
        View view = this.f6473e;
        n nVar = this.f6470b;
        if (nVar.f6575i || nVar.j) {
            return;
        }
        c1.s(14, nVar, c.type);
        nVar.e(c.offset, Integer.valueOf(i5));
        nVar.e(c.count, Integer.valueOf(i10));
        nVar.e(c.pts, fArr);
        k2.x.l(nVar, view, paint);
        nVar.a();
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f6, float f10, float f11, float f12, Paint paint) {
        if (this.f6469a.d()) {
            return;
        }
        int i5 = (int) f6;
        int i10 = (int) f10;
        int i11 = (int) f11;
        int i12 = (int) f12;
        View view = this.f6473e;
        n nVar = this.f6470b;
        if (nVar.f6575i || nVar.j) {
            return;
        }
        c1.s(15, nVar, c.type);
        nVar.e(c.left, Integer.valueOf(i5));
        nVar.e(c.top, Integer.valueOf(i10));
        nVar.e(c.right, Integer.valueOf(i11));
        nVar.e(c.bottom, Integer.valueOf(i12));
        k2.x.l(nVar, view, paint);
        nVar.a();
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        if (this.f6469a.d()) {
            return;
        }
        View view = this.f6473e;
        n nVar = this.f6470b;
        if (nVar.f6575i || nVar.j) {
            return;
        }
        c1.s(16, nVar, c.type);
        k2.x.l(nVar, view, paint);
        nVar.a();
    }

    @Keep
    public void drawPatch(Bitmap bitmap, byte[] bArr, Rect rect, Paint paint) {
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        if (this.f6469a.d()) {
            return;
        }
        float[] a7 = s6.a.a(path);
        View view = this.f6473e;
        n nVar = this.f6470b;
        if (nVar.f6575i || nVar.j) {
            return;
        }
        c1.s(18, nVar, c.type);
        nVar.e(c.pts, a7);
        k2.x.l(nVar, view, paint);
        nVar.a();
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f6, float f10, Paint paint) {
        if (this.f6469a.d()) {
            return;
        }
        int i5 = (int) f6;
        int i10 = (int) f10;
        View view = this.f6473e;
        n nVar = this.f6470b;
        if (nVar.f6575i || nVar.j) {
            return;
        }
        c1.s(20, nVar, c.type);
        nVar.e(c.x0, Integer.valueOf(i5));
        nVar.e(c.y0, Integer.valueOf(i10));
        k2.x.l(nVar, view, paint);
        nVar.a();
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        if (this.f6469a.d()) {
            return;
        }
        super.drawPoints(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i5, int i10, int i11) {
        if (this.f6469a.d()) {
            return;
        }
        super.drawRGB(i5, i10, i11);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f6, float f10, float f11, float f12, Paint paint) {
        if (this.f6469a.d()) {
            return;
        }
        View view = this.f6473e;
        this.f6470b.n((int) f6, (int) f10, (int) f11, (int) f12, view, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f6, float f10, float f11, float f12, float f13, float f14, Paint paint) {
        if (this.f6469a.d()) {
            return;
        }
        View view = this.f6473e;
        this.f6470b.o((int) f6, (int) f10, (int) f11, (int) f12, (int) f13, (int) f14, view, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i5, int i10, float f6, float f10, Paint paint) {
        if (this.f6469a.d() || this.f6471c) {
            return;
        }
        String substring = String.copyValueOf(cArr).substring(i5, i10 + i5);
        if (b(cArr == null ? null : new String(cArr)).booleanValue()) {
            e(substring, f6, f10, paint);
        } else {
            this.f6470b.c(substring, (int) f6, (int) f10, this.f6473e, paint, 27);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i5, int i10, int i11, int i12, float f6, float f10, boolean z5, Paint paint) {
        if (this.f6469a.d() || this.f6471c) {
            return;
        }
        String copyValueOf = String.copyValueOf(cArr, i5, i10);
        if (b(cArr == null ? null : new String(cArr)).booleanValue()) {
            e(copyValueOf, f6, f10, paint);
        } else {
            this.f6470b.c(copyValueOf, (int) f6, (int) f10, this.f6473e, paint, 29);
        }
    }

    public final void e(String str, float f6, float f10, Paint paint) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        int width = rect.width();
        int height = rect.height();
        int round = Math.round(f6) + rect.left;
        int round2 = Math.round(f10) + rect.top;
        Paint paint2 = new Paint();
        paint2.setColor(f6466g);
        paint2.setStyle(Paint.Style.FILL);
        View view = this.f6473e;
        n nVar = this.f6470b;
        nVar.o(round, round2, round + width, round2 + height, 5, 5, view, paint2);
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        n nVar = this.f6470b;
        if (!nVar.f6575i && !nVar.j) {
            nVar.e(c.type, Integer.valueOf(r4.k.h(34)));
            nVar.a();
        }
        super.restore();
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i5) {
        n nVar = this.f6470b;
        if (!nVar.f6575i && !nVar.j) {
            c1.s(35, nVar, c.type);
            nVar.e(c.count, Integer.valueOf(i5));
            nVar.a();
        }
        super.restoreToCount(i5);
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f6) {
        n nVar = this.f6470b;
        if (!nVar.f6575i && !nVar.j) {
            c1.s(36, nVar, c.type);
            nVar.e(c.degrees, Float.valueOf(f6));
            nVar.a();
        }
        super.rotate(f6);
    }

    @Override // android.graphics.Canvas
    public final int save() {
        n nVar = this.f6470b;
        if (!nVar.f6575i && !nVar.j) {
            nVar.e(c.type, Integer.valueOf(r4.k.h(37)));
            nVar.a();
        }
        return super.save();
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f6, float f10, float f11, float f12, Paint paint, int i5) {
        n nVar = this.f6470b;
        if (!nVar.f6575i && !nVar.j) {
            c1.s(38, nVar, c.type);
            nVar.e(c.left, Integer.valueOf((int) f6));
            nVar.e(c.top, Integer.valueOf((int) f10));
            nVar.e(c.right, Integer.valueOf((int) f11));
            nVar.e(c.bottom, Integer.valueOf((int) f12));
            k2.x.l(nVar, null, paint);
            nVar.a();
        }
        return super.save();
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f6, float f10, float f11, float f12, int i5, int i10) {
        n nVar = this.f6470b;
        if (!nVar.f6575i && !nVar.j) {
            c1.s(39, nVar, c.type);
            nVar.e(c.left, Integer.valueOf((int) f6));
            nVar.e(c.top, Integer.valueOf((int) f10));
            nVar.e(c.right, Integer.valueOf((int) f11));
            nVar.e(c.bottom, Integer.valueOf((int) f12));
            nVar.e(c.y0, Integer.valueOf(i5));
            nVar.a();
        }
        return super.saveLayerAlpha(f6, f10, f11, f12, i5, i10);
    }

    @Override // android.graphics.Canvas
    public final void scale(float f6, float f10) {
        int i5 = (int) f6;
        int i10 = (int) f10;
        n nVar = this.f6470b;
        if (!nVar.f6575i && !nVar.j) {
            c1.s(40, nVar, c.type);
            nVar.e(c.x0, Integer.valueOf(i5));
            nVar.e(c.y0, Integer.valueOf(i10));
            nVar.a();
        }
        super.scale(f6, f10);
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        if (matrix != null) {
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            n nVar = this.f6470b;
            if (!nVar.f6575i && !nVar.j) {
                c1.s(44, nVar, c.type);
                nVar.e(c.pts, fArr);
                nVar.a();
            }
        }
        super.setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final void skew(float f6, float f10) {
        int i5 = (int) f6;
        int i10 = (int) f10;
        n nVar = this.f6470b;
        if (!nVar.f6575i && !nVar.j) {
            c1.s(45, nVar, c.type);
            nVar.e(c.x0, Integer.valueOf(i5));
            nVar.e(c.y0, Integer.valueOf(i10));
            nVar.a();
        }
        super.skew(f6, f10);
    }

    @Override // android.graphics.Canvas
    public final void translate(float f6, float f10) {
        int i5 = (int) f6;
        int i10 = (int) f10;
        n nVar = this.f6470b;
        if (!nVar.f6575i && !nVar.j && (i5 != 0 || i10 != 0)) {
            c1.s(46, nVar, c.type);
            nVar.e(c.x0, Integer.valueOf(i5));
            nVar.e(c.y0, Integer.valueOf(i10));
            nVar.a();
        }
        super.translate(f6, f10);
    }

    @Keep
    public void drawPatch(Bitmap bitmap, byte[] bArr, RectF rectF, Paint paint) {
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i5, PorterDuff.Mode mode) {
        if (this.f6469a.d()) {
            return;
        }
        int c2 = r4.k.c(m4.g.h(mode));
        this.f6470b.k(this.f6473e, i5, c2);
    }

    @Override // android.graphics.Canvas
    @Keep
    public void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        int c2;
        f fVar = this.f6469a;
        if (fVar.d()) {
            return;
        }
        Bitmap bitmap = ninePatch.getBitmap();
        if (bitmap.isRecycled() || (c2 = fVar.c(bitmap)) <= 0) {
            return;
        }
        i a7 = a(bitmap);
        if (a7 != null) {
            this.f6470b.m(rect.left, rect.top, rect.right, rect.bottom, c2, this.f6473e, paint, a7.f6557c, bitmap.getWidth() - a7.f6558d, a7.f6555a, bitmap.getHeight() - a7.f6556b);
            return;
        }
        this.f6470b.l(rect.left, rect.top, rect.right, rect.bottom, c2, this.f6473e, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i5, int i10, Paint paint) {
        if (this.f6469a.d()) {
            return;
        }
        View view = this.f6473e;
        n nVar = this.f6470b;
        if (nVar.f6575i || nVar.j) {
            return;
        }
        c1.s(20, nVar, c.type);
        nVar.e(c.offset, Integer.valueOf(i5));
        nVar.e(c.count, Integer.valueOf(i10));
        nVar.e(c.pts, fArr);
        k2.x.l(nVar, view, paint);
        nVar.a();
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        if (this.f6469a.d()) {
            return;
        }
        super.drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f6, float f10, Paint paint) {
        if (this.f6469a.d()) {
            return;
        }
        super.drawRoundRect(rectF, f6, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i5, int i10, int i11, int i12) {
        this.f6470b.g(i5, i10, i11, i12);
        return super.clipOutRect(i5, i10, i11, i12);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        float f6 = rectF.left;
        this.f6470b.h((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        return super.clipRect(rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i5, BlendMode blendMode) {
        if (this.f6469a.d()) {
            return;
        }
        int c2 = r4.k.c(u.c(blendMode));
        this.f6470b.k(this.f6473e, i5, c2);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        if (this.f6469a.d()) {
            return;
        }
        this.f6470b.n((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, this.f6473e, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        float f6 = rectF.left;
        this.f6470b.g((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        return super.clipOutRect(rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        int c2;
        f fVar = this.f6469a;
        if (fVar.d() || bitmap.isRecycled()) {
            return;
        }
        if (!fVar.f6540i) {
            c2 = 0;
        } else if (rect != null) {
            int i5 = rect.left;
            int i10 = rect.top;
            c2 = fVar.f6544n.a(Bitmap.createBitmap(bitmap, i5, i10, rect.right - i5, rect.bottom - i10), fVar.j);
        } else {
            c2 = fVar.c(bitmap);
        }
        int i11 = c2;
        if (i11 > 0) {
            this.f6470b.i(rect2.left, rect2.top, rect2.right, rect2.bottom, i11, this.f6473e, paint);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j) {
        if (this.f6469a.d()) {
            return;
        }
        this.f6470b.j(Color.toArgb(j));
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        int i5 = rect.left;
        this.f6470b.h(rect.left, rect.top, rect.right, rect.bottom);
        return super.clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f6, float f10, float f11, float f12) {
        this.f6470b.g((int) f6, (int) f10, (int) f11, (int) f12);
        return super.clipOutRect(f6, f10, f11, f12);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j, BlendMode blendMode) {
        if (this.f6469a.d()) {
            return;
        }
        int argb = Color.toArgb(j);
        int c2 = r4.k.c(u.c(blendMode));
        this.f6470b.k(this.f6473e, argb, c2);
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i5, int i10, float f6, float f10, Paint paint) {
        if (this.f6469a.d() || this.f6471c) {
            return;
        }
        String charSequence2 = charSequence.subSequence(i5, i10).toString();
        if (!b(charSequence.toString()).booleanValue()) {
            View view = this.f6473e;
            this.f6470b.c(charSequence2, (int) f6, (int) f10, view, paint, 27);
            return;
        }
        e(charSequence2, f6, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i5, int i10, int i11, int i12, float f6, float f10, boolean z5, Paint paint) {
        if (this.f6469a.d() || this.f6471c) {
            return;
        }
        String charSequence2 = charSequence.subSequence(i5, i10).toString();
        if (!b(charSequence.toString()).booleanValue()) {
            this.f6470b.c(charSequence2, (int) f6, (int) f10, this.f6473e, paint, 29);
            return;
        }
        e(charSequence2, f6, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        int i5 = rect.left;
        if (op == Region.Op.INTERSECT) {
            this.f6470b.h(rect.left, rect.top, rect.right, rect.bottom);
        }
        return super.clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    @Keep
    public void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        int c2;
        f fVar = this.f6469a;
        if (fVar.d()) {
            return;
        }
        Bitmap bitmap = ninePatch.getBitmap();
        if (bitmap.isRecycled() || (c2 = fVar.c(bitmap)) <= 0) {
            return;
        }
        i a7 = a(bitmap);
        if (a7 != null) {
            this.f6470b.m((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, c2, this.f6473e, paint, a7.f6557c, bitmap.getWidth() - a7.f6558d, a7.f6555a, bitmap.getHeight() - a7.f6556b);
            return;
        }
        this.f6470b.l((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, c2, this.f6473e, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f6, float f10, float f11, float f12, Region.Op op) {
        if (op == Region.Op.INTERSECT) {
            this.f6470b.h((int) f6, (int) f10, (int) f11, (int) f12);
        }
        return super.clipRect(f6, f10, f11, f12, op);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        if (this.f6469a.d()) {
            return;
        }
        Rect rect2 = new Rect();
        rectF.round(rect2);
        drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        if (this.f6469a.d()) {
            return;
        }
        super.drawLines(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        if (this.f6469a.d()) {
            return;
        }
        super.drawOval(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f6, float f10, Paint paint) {
        if (this.f6469a.d() || this.f6471c) {
            return;
        }
        if (!b(str).booleanValue()) {
            View view = this.f6473e;
            this.f6470b.c(str, (int) f6, (int) f10, view, paint, 27);
            return;
        }
        e(str, f6, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i5, int i10, int i11, int i12, float f6, float f10, boolean z5, Paint paint) {
        this.f6469a.d();
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f6, float f10, float f11, float f12) {
        this.f6470b.h((int) f6, (int) f10, (int) f11, (int) f12);
        return super.clipRect(f6, f10, f11, f12);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f6, float f10, boolean z5, Paint paint) {
        if (this.f6469a.d()) {
            return;
        }
        super.drawArc(rectF, f6, f10, z5, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i5, int i10, int i11, int i12) {
        this.f6470b.h(i5, i10, i11, i12);
        return super.clipRect(i5, i10, i11, i12);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i5, int i10, float f6, float f10, Paint paint) {
        if (this.f6469a.d() || this.f6471c) {
            return;
        }
        String substring = str.substring(i5, i10);
        if (!b(str).booleanValue()) {
            View view = this.f6473e;
            this.f6470b.c(substring, (int) f6, (int) f10, view, paint, 27);
            return;
        }
        e(substring, f6, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        if (this.f6469a.d()) {
            return;
        }
        View view = this.f6473e;
        n nVar = this.f6470b;
        if (nVar.f6575i || nVar.j) {
            return;
        }
        c1.s(12, nVar, c.type);
        nVar.e(c.outerRectLeft, Integer.valueOf((int) rectF.left));
        nVar.e(c.outerRectTop, Integer.valueOf((int) rectF.top));
        nVar.e(c.outerRectRight, Integer.valueOf((int) rectF.right));
        nVar.e(c.outerRectBottom, Integer.valueOf((int) rectF.bottom));
        nVar.e(c.innerRectLeft, Integer.valueOf((int) rectF2.left));
        nVar.e(c.innerRectTop, Integer.valueOf((int) rectF2.top));
        nVar.e(c.innerRectRight, Integer.valueOf((int) rectF2.right));
        nVar.e(c.innerRectBottom, Integer.valueOf((int) rectF2.bottom));
        nVar.e(c.innerRadii, fArr2);
        nVar.e(c.outerRadii, fArr);
        k2.x.l(nVar, view, paint);
        nVar.a();
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i5, float[] fArr, int i10, float[] fArr2, int i11, int[] iArr, int i12, short[] sArr, int i13, int i14, Paint paint) {
    }
}
