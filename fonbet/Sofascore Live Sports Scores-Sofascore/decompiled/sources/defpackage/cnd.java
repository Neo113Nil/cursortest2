package defpackage;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cnd {
    public static final Matrix B = new Matrix();
    public uc5 A;
    public Canvas a;
    public yz1 b;
    public int c;
    public RectF d;
    public RectF e;
    public Rect f;
    public RectF g;
    public RectF h;
    public Rect i;
    public RectF j;
    public ska k;
    public Bitmap l;
    public Canvas m;
    public Rect n;
    public ska o;
    public Matrix p;
    public float[] q;
    public Bitmap r;
    public Bitmap s;
    public Canvas t;
    public Canvas u;
    public ska v;
    public BlurMaskFilter w;
    public float x = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public RenderNode y;
    public RenderNode z;

    public static Bitmap a(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(rectF.width() * 1.05d), 1), Math.max((int) Math.ceil(rectF.height() * 1.05d), 1), config);
    }

    public static boolean d(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    public final RectF b(RectF rectF, uc5 uc5Var) {
        if (this.e == null) {
            this.e = new RectF();
        }
        if (this.g == null) {
            this.g = new RectF();
        }
        this.e.set(rectF);
        this.e.offsetTo(rectF.left + uc5Var.b, rectF.top + uc5Var.c);
        RectF rectF2 = this.e;
        float f = uc5Var.a;
        rectF2.inset(-f, -f);
        this.g.set(rectF);
        this.e.union(this.g);
        return this.e;
    }

    public final void c() {
        float f;
        ska skaVar;
        if (this.a == null || this.b == null || this.q == null || this.d == null) {
            a70.r("OffscreenBitmap: finish() call without matching start()");
            return;
        }
        int C = wt3.C(this.c);
        if (C == 0) {
            this.a.restore();
        } else if (C != 1) {
            if (C != 2) {
                if (C == 3) {
                    if (this.y == null) {
                        a70.r("RenderNode is not ready; should've been initialized at start() time");
                        return;
                    }
                    int i = Build.VERSION.SDK_INT;
                    if (i < 29) {
                        a70.r("RenderNode not supported but we chose it as render strategy");
                        return;
                    }
                    this.a.save();
                    Canvas canvas = this.a;
                    float[] fArr = this.q;
                    canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                    this.y.endRecording();
                    if (this.b.b()) {
                        Canvas canvas2 = this.a;
                        uc5 uc5Var = (uc5) this.b.c;
                        if (this.y == null || this.z == null) {
                            a70.r("Cannot render to render node outside a start()/finish() block");
                            return;
                        }
                        if (i < 31) {
                            cp4.h("RenderEffect is not supported on API level <31");
                            return;
                        }
                        float[] fArr2 = this.q;
                        float f2 = fArr2 != null ? fArr2[0] : 1.0f;
                        f = fArr2 != null ? fArr2[4] : 1.0f;
                        uc5 uc5Var2 = this.A;
                        if (uc5Var2 == null || uc5Var.a != uc5Var2.a || uc5Var.b != uc5Var2.b || uc5Var.c != uc5Var2.c || uc5Var.d != uc5Var2.d) {
                            RenderEffect createColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(uc5Var.d, PorterDuff.Mode.SRC_IN));
                            float f3 = uc5Var.a;
                            if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                float f4 = ((f2 + f) * f3) / 2.0f;
                                createColorFilterEffect = RenderEffect.createBlurEffect(f4, f4, createColorFilterEffect, Shader.TileMode.CLAMP);
                            }
                            this.z.setRenderEffect(createColorFilterEffect);
                            this.A = uc5Var;
                        }
                        RectF b = b(this.d, uc5Var);
                        RectF rectF = new RectF(b.left * f2, b.top * f, b.right * f2, b.bottom * f);
                        this.z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
                        RecordingCanvas beginRecording = this.z.beginRecording((int) rectF.width(), (int) rectF.height());
                        beginRecording.translate((uc5Var.b * f2) + (-rectF.left), (uc5Var.c * f) + (-rectF.top));
                        beginRecording.drawRenderNode(this.y);
                        this.z.endRecording();
                        canvas2.save();
                        canvas2.translate(rectF.left, rectF.top);
                        canvas2.drawRenderNode(this.z);
                        canvas2.restore();
                    }
                    this.a.drawRenderNode(this.y);
                    this.a.restore();
                }
            } else {
                if (this.l == null) {
                    a70.r("Bitmap is not ready; should've been initialized at start() time");
                    return;
                }
                if (this.b.b()) {
                    Canvas canvas3 = this.a;
                    uc5 uc5Var3 = (uc5) this.b.c;
                    RectF rectF2 = this.d;
                    if (rectF2 == null || this.l == null) {
                        a70.r("Cannot render to bitmap outside a start()/finish() block");
                        return;
                    }
                    RectF b2 = b(rectF2, uc5Var3);
                    Rect rect = this.f;
                    if (rect == null) {
                        rect = new Rect();
                        this.f = rect;
                    }
                    rect.set((int) Math.floor(b2.left), (int) Math.floor(b2.top), (int) Math.ceil(b2.right), (int) Math.ceil(b2.bottom));
                    float[] fArr3 = this.q;
                    float f5 = fArr3 != null ? fArr3[0] : 1.0f;
                    f = fArr3 != null ? fArr3[4] : 1.0f;
                    RectF rectF3 = this.h;
                    if (rectF3 == null) {
                        rectF3 = new RectF();
                        this.h = rectF3;
                    }
                    rectF3.set(b2.left * f5, b2.top * f, b2.right * f5, b2.bottom * f);
                    Rect rect2 = this.i;
                    if (rect2 == null) {
                        rect2 = new Rect();
                        this.i = rect2;
                    }
                    rect2.set(0, 0, Math.round(this.h.width()), Math.round(this.h.height()));
                    if (d(this.r, this.h)) {
                        Bitmap bitmap = this.r;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        Bitmap bitmap2 = this.s;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        this.r = a(this.h, Bitmap.Config.ARGB_8888);
                        this.s = a(this.h, Bitmap.Config.ALPHA_8);
                        this.t = new Canvas(this.r);
                        this.u = new Canvas(this.s);
                    } else {
                        Canvas canvas4 = this.t;
                        if (canvas4 == null || this.u == null || (skaVar = this.o) == null) {
                            a70.r("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
                            return;
                        } else {
                            canvas4.drawRect(this.i, skaVar);
                            this.u.drawRect(this.i, this.o);
                        }
                    }
                    if (this.s == null) {
                        a70.r("Expected to have allocated a shadow mask bitmap");
                        return;
                    }
                    if (this.v == null) {
                        this.v = new ska(1, 0);
                    }
                    RectF rectF4 = this.d;
                    this.u.drawBitmap(this.l, Math.round((rectF4.left - b2.left) * f5), Math.round((rectF4.top - b2.top) * f), (Paint) null);
                    if (this.w == null || this.x != uc5Var3.a) {
                        float f6 = ((f5 + f) * uc5Var3.a) / 2.0f;
                        if (f6 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            this.w = new BlurMaskFilter(f6, BlurMaskFilter.Blur.NORMAL);
                        } else {
                            this.w = null;
                        }
                        this.x = uc5Var3.a;
                    }
                    this.v.setColor(uc5Var3.d);
                    float f7 = uc5Var3.a;
                    ska skaVar2 = this.v;
                    if (f7 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        skaVar2.setMaskFilter(this.w);
                    } else {
                        skaVar2.setMaskFilter(null);
                    }
                    this.v.setFilterBitmap(true);
                    this.t.drawBitmap(this.s, Math.round(uc5Var3.b * f5), Math.round(uc5Var3.c * f), this.v);
                    canvas3.drawBitmap(this.r, this.i, this.f, this.k);
                }
                Rect rect3 = this.n;
                if (rect3 == null) {
                    rect3 = new Rect();
                    this.n = rect3;
                }
                rect3.set(0, 0, (int) (this.d.width() * this.q[0]), (int) (this.d.height() * this.q[4]));
                this.a.drawBitmap(this.l, this.n, this.d, this.k);
            }
        } else {
            this.a.restore();
        }
        this.a = null;
    }

    public final Canvas e(Canvas canvas, RectF rectF, yz1 yz1Var) {
        if (this.a != null) {
            a70.r("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
            return null;
        }
        if (this.q == null) {
            this.q = new float[9];
        }
        Matrix matrix = this.p;
        if (matrix == null) {
            matrix = new Matrix();
            this.p = matrix;
        }
        canvas.getMatrix(matrix);
        this.p.getValues(this.q);
        float[] fArr = this.q;
        float f = fArr[0];
        int i = 4;
        float f2 = fArr[4];
        RectF rectF2 = this.j;
        if (rectF2 == null) {
            rectF2 = new RectF();
            this.j = rectF2;
        }
        rectF2.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
        this.a = canvas;
        this.b = yz1Var;
        if (yz1Var.b >= 255 && !yz1Var.b()) {
            i = 1;
        } else if (yz1Var.b()) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 29 || !canvas.isHardwareAccelerated() || i2 <= 31) {
                i = 3;
            }
        } else {
            i = 2;
        }
        this.c = i;
        RectF rectF3 = this.d;
        if (rectF3 == null) {
            rectF3 = new RectF();
            this.d = rectF3;
        }
        rectF3.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        ska skaVar = this.k;
        if (skaVar == null) {
            skaVar = new ska();
            this.k = skaVar;
        }
        skaVar.reset();
        int C = wt3.C(this.c);
        if (C == 0) {
            canvas.save();
            return canvas;
        }
        if (C == 1) {
            this.k.setAlpha(yz1Var.b);
            this.k.setColorFilter(null);
            ska skaVar2 = this.k;
            Matrix matrix2 = vik.a;
            canvas.saveLayer(rectF, skaVar2);
            return canvas;
        }
        Matrix matrix3 = B;
        if (C == 2) {
            if (this.o == null) {
                ska skaVar3 = new ska();
                this.o = skaVar3;
                skaVar3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (d(this.l, this.j)) {
                Bitmap bitmap = this.l;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.l = a(this.j, Bitmap.Config.ARGB_8888);
                this.m = new Canvas(this.l);
            } else {
                Canvas canvas2 = this.m;
                if (canvas2 == null) {
                    a70.r("If needNewBitmap() returns true, we should have a canvas ready");
                    return null;
                }
                canvas2.setMatrix(matrix3);
                this.m.drawRect(-1.0f, -1.0f, this.j.width() + 1.0f, this.j.height() + 1.0f, this.o);
            }
            v7a.F(this.k, null);
            this.k.setColorFilter(null);
            this.k.setAlpha(yz1Var.b);
            Canvas canvas3 = this.m;
            canvas3.scale(f, f2);
            canvas3.translate(-rectF.left, -rectF.top);
            return canvas3;
        }
        if (C != 3) {
            cp4.h("Invalid render strategy for OffscreenLayer");
            return null;
        }
        if (Build.VERSION.SDK_INT < 29) {
            a70.r("RenderNode not supported but we chose it as render strategy");
            return null;
        }
        if (this.y == null) {
            this.y = new RenderNode("OffscreenLayer.main");
        }
        if (yz1Var.b() && this.z == null) {
            this.z = new RenderNode("OffscreenLayer.shadow");
            this.A = null;
        }
        this.y.setAlpha(yz1Var.b / 255.0f);
        if (yz1Var.b()) {
            RenderNode renderNode = this.z;
            if (renderNode == null) {
                a70.r("Must initialize shadowRenderNode when we have shadow");
                return null;
            }
            renderNode.setAlpha(yz1Var.b / 255.0f);
        }
        this.y.setHasOverlappingRendering(true);
        RenderNode renderNode2 = this.y;
        RectF rectF4 = this.j;
        renderNode2.setPosition((int) rectF4.left, (int) rectF4.top, (int) rectF4.right, (int) rectF4.bottom);
        RecordingCanvas beginRecording = this.y.beginRecording((int) this.j.width(), (int) this.j.height());
        beginRecording.setMatrix(matrix3);
        beginRecording.scale(f, f2);
        beginRecording.translate(-rectF.left, -rectF.top);
        return beginRecording;
    }
}
