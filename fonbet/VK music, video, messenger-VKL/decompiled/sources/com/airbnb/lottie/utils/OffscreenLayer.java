package com.airbnb.lottie.utils;

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
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import xsna.b3r0;
import xsna.hg90;
import xsna.j32;
import xsna.k32;
import xsna.xky;

/* loaded from: classes12.dex */
public final class OffscreenLayer {
    public static final Matrix B = new Matrix();

    @Nullable
    public com.airbnb.lottie.utils.a A;

    @Nullable
    public Canvas a;

    @Nullable
    public b b;
    public RenderStrategy c;

    @Nullable
    public RectF d;

    @Nullable
    public RectF e;

    @Nullable
    public Rect f;

    @Nullable
    public RectF g;

    @Nullable
    public RectF h;

    @Nullable
    public Rect i;

    @Nullable
    public RectF j;

    @Nullable
    public xky k;

    @Nullable
    public Bitmap l;

    @Nullable
    public Canvas m;

    @Nullable
    public Rect n;

    @Nullable
    public xky o;

    @Nullable
    public Matrix p;

    @Nullable
    public float[] q;

    @Nullable
    public Bitmap r;

    @Nullable
    public Bitmap s;

    @Nullable
    public Canvas t;

    @Nullable
    public Canvas u;

    @Nullable
    public xky v;

    @Nullable
    public BlurMaskFilter w;
    public float x = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    @Nullable
    public RenderNode y;

    @Nullable
    public RenderNode z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RenderStrategy {
        private static final /* synthetic */ RenderStrategy[] $VALUES;
        public static final RenderStrategy BITMAP;
        public static final RenderStrategy DIRECT;
        public static final RenderStrategy RENDER_NODE;
        public static final RenderStrategy SAVE_LAYER;

        static {
            RenderStrategy renderStrategy = new RenderStrategy("DIRECT", 0);
            DIRECT = renderStrategy;
            RenderStrategy renderStrategy2 = new RenderStrategy("SAVE_LAYER", 1);
            SAVE_LAYER = renderStrategy2;
            RenderStrategy renderStrategy3 = new RenderStrategy("BITMAP", 2);
            BITMAP = renderStrategy3;
            RenderStrategy renderStrategy4 = new RenderStrategy("RENDER_NODE", 3);
            RENDER_NODE = renderStrategy4;
            $VALUES = new RenderStrategy[]{renderStrategy, renderStrategy2, renderStrategy3, renderStrategy4};
        }

        public RenderStrategy() {
            throw null;
        }

        public static RenderStrategy valueOf(String str) {
            return (RenderStrategy) Enum.valueOf(RenderStrategy.class, str);
        }

        public static RenderStrategy[] values() {
            return (RenderStrategy[]) $VALUES.clone();
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[RenderStrategy.values().length];
            a = iArr;
            try {
                iArr[RenderStrategy.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[RenderStrategy.SAVE_LAYER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[RenderStrategy.BITMAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[RenderStrategy.RENDER_NODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class b {
        public int a = 255;

        @Nullable
        public com.airbnb.lottie.utils.a b = null;

        public final boolean a() {
            return this.b != null;
        }
    }

    public static Bitmap a(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(rectF.width() * 1.05d), 1), Math.max((int) Math.ceil(rectF.height() * 1.05d), 1), config);
    }

    public static boolean d(@Nullable Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    public final RectF b(RectF rectF, com.airbnb.lottie.utils.a aVar) {
        if (this.e == null) {
            this.e = new RectF();
        }
        if (this.g == null) {
            this.g = new RectF();
        }
        this.e.set(rectF);
        this.e.offsetTo(rectF.left + aVar.b, rectF.top + aVar.c);
        RectF rectF2 = this.e;
        float f = aVar.a;
        rectF2.inset(-f, -f);
        this.g.set(rectF);
        this.e.union(this.g);
        return this.e;
    }

    public final void c() {
        float f;
        xky xkyVar;
        RenderEffect createColorFilterEffect;
        RecordingCanvas beginRecording;
        if (this.a == null || this.b == null || this.q == null || this.d == null) {
            throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
        }
        int i = a.a[this.c.ordinal()];
        if (i == 1) {
            this.a.restore();
        } else if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    if (this.y == null) {
                        throw new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                    }
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 < 29) {
                        throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                    }
                    this.a.save();
                    Canvas canvas = this.a;
                    float[] fArr = this.q;
                    canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                    this.y.endRecording();
                    if (this.b.a()) {
                        Canvas canvas2 = this.a;
                        com.airbnb.lottie.utils.a aVar = this.b.b;
                        if (this.y == null || this.z == null) {
                            throw new IllegalStateException("Cannot render to render node outside a start()/finish() block");
                        }
                        if (i2 < 31) {
                            throw new RuntimeException("RenderEffect is not supported on API level <31");
                        }
                        float[] fArr2 = this.q;
                        float f2 = fArr2 != null ? fArr2[0] : 1.0f;
                        f = fArr2 != null ? fArr2[4] : 1.0f;
                        com.airbnb.lottie.utils.a aVar2 = this.A;
                        if (aVar2 == null || aVar.a != aVar2.a || aVar.b != aVar2.b || aVar.c != aVar2.c || aVar.d != aVar2.d) {
                            createColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(aVar.d, PorterDuff.Mode.SRC_IN));
                            float f3 = aVar.a;
                            if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                float f4 = ((f2 + f) * f3) / 2.0f;
                                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                createColorFilterEffect = RenderEffect.createBlurEffect(f4, f4, createColorFilterEffect, Shader.TileMode.CLAMP);
                            }
                            this.z.setRenderEffect(createColorFilterEffect);
                            this.A = aVar;
                        }
                        RectF b2 = b(this.d, aVar);
                        RectF rectF = new RectF(b2.left * f2, b2.top * f, b2.right * f2, b2.bottom * f);
                        this.z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
                        beginRecording = this.z.beginRecording((int) rectF.width(), (int) rectF.height());
                        beginRecording.translate((aVar.b * f2) + (-rectF.left), (aVar.c * f) + (-rectF.top));
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
                    throw new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
                }
                if (this.b.a()) {
                    Canvas canvas3 = this.a;
                    com.airbnb.lottie.utils.a aVar3 = this.b.b;
                    RectF rectF2 = this.d;
                    if (rectF2 == null || this.l == null) {
                        throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
                    }
                    RectF b3 = b(rectF2, aVar3);
                    if (this.f == null) {
                        this.f = new Rect();
                    }
                    this.f.set((int) Math.floor(b3.left), (int) Math.floor(b3.top), (int) Math.ceil(b3.right), (int) Math.ceil(b3.bottom));
                    float[] fArr3 = this.q;
                    float f5 = fArr3 != null ? fArr3[0] : 1.0f;
                    f = fArr3 != null ? fArr3[4] : 1.0f;
                    if (this.h == null) {
                        this.h = new RectF();
                    }
                    this.h.set(b3.left * f5, b3.top * f, b3.right * f5, b3.bottom * f);
                    if (this.i == null) {
                        this.i = new Rect();
                    }
                    this.i.set(0, 0, Math.round(this.h.width()), Math.round(this.h.height()));
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
                        if (canvas4 == null || this.u == null || (xkyVar = this.o) == null) {
                            throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
                        }
                        canvas4.drawRect(this.i, xkyVar);
                        this.u.drawRect(this.i, this.o);
                    }
                    if (this.s == null) {
                        throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
                    }
                    if (this.v == null) {
                        this.v = new xky(1);
                    }
                    RectF rectF3 = this.d;
                    this.u.drawBitmap(this.l, Math.round((rectF3.left - b3.left) * f5), Math.round((rectF3.top - b3.top) * f), (Paint) null);
                    if (this.w == null || this.x != aVar3.a) {
                        float f6 = ((f5 + f) * aVar3.a) / 2.0f;
                        if (f6 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            this.w = new BlurMaskFilter(f6, BlurMaskFilter.Blur.NORMAL);
                        } else {
                            this.w = null;
                        }
                        this.x = aVar3.a;
                    }
                    this.v.setColor(aVar3.d);
                    if (aVar3.a > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        this.v.setMaskFilter(this.w);
                    } else {
                        this.v.setMaskFilter(null);
                    }
                    this.v.setFilterBitmap(true);
                    this.t.drawBitmap(this.s, Math.round(aVar3.b * f5), Math.round(aVar3.c * f), this.v);
                    canvas3.drawBitmap(this.r, this.i, this.f, this.k);
                }
                if (this.n == null) {
                    this.n = new Rect();
                }
                this.n.set(0, 0, (int) (this.d.width() * this.q[0]), (int) (this.d.height() * this.q[4]));
                this.a.drawBitmap(this.l, this.n, this.d, this.k);
            }
        } else {
            this.a.restore();
        }
        this.a = null;
    }

    public final Canvas e(Canvas canvas, RectF rectF, b bVar) {
        RenderStrategy renderStrategy;
        RecordingCanvas beginRecording;
        if (this.a != null) {
            throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
        }
        if (this.q == null) {
            this.q = new float[9];
        }
        if (this.p == null) {
            this.p = new Matrix();
        }
        canvas.getMatrix(this.p);
        this.p.getValues(this.q);
        float[] fArr = this.q;
        float f = fArr[0];
        float f2 = fArr[4];
        if (this.j == null) {
            this.j = new RectF();
        }
        this.j.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
        this.a = canvas;
        this.b = bVar;
        if (bVar.a >= 255 && !bVar.a()) {
            renderStrategy = RenderStrategy.DIRECT;
        } else if (bVar.a()) {
            int i = Build.VERSION.SDK_INT;
            renderStrategy = (i < 29 || !canvas.isHardwareAccelerated()) ? RenderStrategy.BITMAP : i <= 31 ? RenderStrategy.BITMAP : RenderStrategy.RENDER_NODE;
        } else {
            renderStrategy = RenderStrategy.SAVE_LAYER;
        }
        this.c = renderStrategy;
        if (this.d == null) {
            this.d = new RectF();
        }
        this.d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.k == null) {
            this.k = new xky();
        }
        this.k.reset();
        int i2 = a.a[this.c.ordinal()];
        if (i2 == 1) {
            canvas.save();
            return canvas;
        }
        if (i2 == 2) {
            this.k.setAlpha(bVar.a);
            this.k.setColorFilter(null);
            b3r0.f(canvas, this.k, rectF);
            return canvas;
        }
        Matrix matrix = B;
        if (i2 == 3) {
            if (this.o == null) {
                xky xkyVar = new xky();
                this.o = xkyVar;
                xkyVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
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
                    throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                }
                canvas2.setMatrix(matrix);
                this.m.drawRect(-1.0f, -1.0f, this.j.width() + 1.0f, this.j.height() + 1.0f, this.o);
            }
            hg90.a(this.k, null);
            this.k.setColorFilter(null);
            this.k.setAlpha(bVar.a);
            Canvas canvas3 = this.m;
            canvas3.scale(f, f2);
            canvas3.translate(-rectF.left, -rectF.top);
            return canvas3;
        }
        if (i2 != 4) {
            throw new RuntimeException("Invalid render strategy for OffscreenLayer");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
        }
        if (this.y == null) {
            this.y = j32.c();
        }
        if (bVar.a() && this.z == null) {
            this.z = k32.d();
            this.A = null;
        }
        this.y.setAlpha(bVar.a / 255.0f);
        if (bVar.a()) {
            RenderNode renderNode = this.z;
            if (renderNode == null) {
                throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
            }
            renderNode.setAlpha(bVar.a / 255.0f);
        }
        this.y.setHasOverlappingRendering(true);
        RenderNode renderNode2 = this.y;
        RectF rectF2 = this.j;
        renderNode2.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        beginRecording = this.y.beginRecording((int) this.j.width(), (int) this.j.height());
        beginRecording.setMatrix(matrix);
        beginRecording.scale(f, f2);
        beginRecording.translate(-rectF.left, -rectF.top);
        return beginRecording;
    }
}
