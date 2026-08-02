package com.airbnb.lottie.utils;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
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
import androidx.core.graphics.EnumC2072b;

/* loaded from: classes.dex */
public class x {

    /* renamed from: A, reason: collision with root package name */
    public static final Matrix f29131A = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public Canvas f29132a;

    /* renamed from: b, reason: collision with root package name */
    public b f29133b;

    /* renamed from: c, reason: collision with root package name */
    public c f29134c;

    /* renamed from: d, reason: collision with root package name */
    public RectF f29135d;

    /* renamed from: e, reason: collision with root package name */
    public RectF f29136e;

    /* renamed from: f, reason: collision with root package name */
    public Rect f29137f;

    /* renamed from: g, reason: collision with root package name */
    public RectF f29138g;

    /* renamed from: h, reason: collision with root package name */
    public RectF f29139h;

    /* renamed from: i, reason: collision with root package name */
    public Rect f29140i;

    /* renamed from: j, reason: collision with root package name */
    public RectF f29141j;

    /* renamed from: k, reason: collision with root package name */
    public Paint f29142k;

    /* renamed from: l, reason: collision with root package name */
    public Bitmap f29143l;

    /* renamed from: m, reason: collision with root package name */
    public Canvas f29144m;

    /* renamed from: n, reason: collision with root package name */
    public Rect f29145n;

    /* renamed from: o, reason: collision with root package name */
    public A3.a f29146o;

    /* renamed from: p, reason: collision with root package name */
    public Matrix f29147p;
    float[] preExistingTransform;

    /* renamed from: q, reason: collision with root package name */
    public Bitmap f29148q;

    /* renamed from: r, reason: collision with root package name */
    public Bitmap f29149r;

    /* renamed from: s, reason: collision with root package name */
    public Canvas f29150s;

    /* renamed from: t, reason: collision with root package name */
    public Canvas f29151t;

    /* renamed from: u, reason: collision with root package name */
    public A3.a f29152u;

    /* renamed from: v, reason: collision with root package name */
    public BlurMaskFilter f29153v;

    /* renamed from: w, reason: collision with root package name */
    public float f29154w = 0.0f;

    /* renamed from: x, reason: collision with root package name */
    public RenderNode f29155x;

    /* renamed from: y, reason: collision with root package name */
    public RenderNode f29156y;

    /* renamed from: z, reason: collision with root package name */
    public d f29157z;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$utils$OffscreenLayer$RenderStrategy;

        static {
            int[] iArr = new int[c.values().length];
            $SwitchMap$com$airbnb$lottie$utils$OffscreenLayer$RenderStrategy = iArr;
            try {
                iArr[c.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$utils$OffscreenLayer$RenderStrategy[c.SAVE_LAYER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$utils$OffscreenLayer$RenderStrategy[c.BITMAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$utils$OffscreenLayer$RenderStrategy[c.RENDER_NODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f29158a;

        /* renamed from: b, reason: collision with root package name */
        public EnumC2072b f29159b;

        /* renamed from: c, reason: collision with root package name */
        public ColorFilter f29160c;

        /* renamed from: d, reason: collision with root package name */
        public d f29161d;

        public b() {
            f();
        }

        public boolean a() {
            EnumC2072b enumC2072b = this.f29159b;
            return (enumC2072b == null || enumC2072b == EnumC2072b.SRC_OVER) ? false : true;
        }

        public boolean b() {
            return this.f29160c != null;
        }

        public boolean c() {
            return this.f29161d != null;
        }

        public boolean d() {
            return (e() || a() || c() || b()) ? false : true;
        }

        public boolean e() {
            return this.f29158a < 255;
        }

        public void f() {
            this.f29158a = 255;
            this.f29159b = null;
            this.f29160c = null;
            this.f29161d = null;
        }
    }

    public enum c {
        DIRECT,
        SAVE_LAYER,
        BITMAP,
        RENDER_NODE
    }

    public final Bitmap a(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(rectF.width() * 1.05d), 1), Math.max((int) Math.ceil(rectF.height() * 1.05d), 1), config);
    }

    public final RectF b(RectF rectF, d dVar) {
        if (this.f29136e == null) {
            this.f29136e = new RectF();
        }
        if (this.f29138g == null) {
            this.f29138g = new RectF();
        }
        this.f29136e.set(rectF);
        this.f29136e.offsetTo(rectF.left + dVar.f(), rectF.top + dVar.g());
        this.f29136e.inset(-dVar.h(), -dVar.h());
        this.f29138g.set(rectF);
        this.f29136e.union(this.f29138g);
        return this.f29136e;
    }

    public final c c(Canvas canvas, b bVar) {
        if (bVar.d()) {
            return c.DIRECT;
        }
        if (!bVar.c()) {
            return c.SAVE_LAYER;
        }
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 29 || !canvas.isHardwareAccelerated()) ? c.BITMAP : i10 <= 31 ? c.BITMAP : c.RENDER_NODE;
    }

    public final void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    public void e() {
        if (this.f29132a == null || this.f29133b == null || this.preExistingTransform == null || this.f29135d == null) {
            throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
        }
        int i10 = a.$SwitchMap$com$airbnb$lottie$utils$OffscreenLayer$RenderStrategy[this.f29134c.ordinal()];
        if (i10 == 1) {
            this.f29132a.restore();
        } else if (i10 == 2) {
            this.f29132a.restore();
        } else if (i10 != 3) {
            if (i10 == 4) {
                if (this.f29155x == null) {
                    throw new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                }
                if (Build.VERSION.SDK_INT < 29) {
                    throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                }
                this.f29132a.save();
                Canvas canvas = this.f29132a;
                float[] fArr = this.preExistingTransform;
                canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                this.f29155x.endRecording();
                if (this.f29133b.c()) {
                    i(this.f29132a, this.f29133b.f29161d);
                }
                this.f29132a.drawRenderNode(this.f29155x);
                this.f29132a.restore();
            }
        } else {
            if (this.f29143l == null) {
                throw new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
            }
            if (this.f29133b.c()) {
                h(this.f29132a, this.f29133b.f29161d);
            }
            if (this.f29145n == null) {
                this.f29145n = new Rect();
            }
            this.f29145n.set(0, 0, (int) (this.f29135d.width() * this.preExistingTransform[0]), (int) (this.f29135d.height() * this.preExistingTransform[4]));
            this.f29132a.drawBitmap(this.f29143l, this.f29145n, this.f29135d, this.f29142k);
        }
        this.f29132a = null;
    }

    public boolean f() {
        return this.f29134c == c.RENDER_NODE;
    }

    public final boolean g(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    public final void h(Canvas canvas, d dVar) {
        A3.a aVar;
        RectF rectF = this.f29135d;
        if (rectF == null || this.f29143l == null) {
            throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
        }
        RectF b10 = b(rectF, dVar);
        if (this.f29137f == null) {
            this.f29137f = new Rect();
        }
        this.f29137f.set((int) Math.floor(b10.left), (int) Math.floor(b10.top), (int) Math.ceil(b10.right), (int) Math.ceil(b10.bottom));
        float[] fArr = this.preExistingTransform;
        float f10 = fArr != null ? fArr[0] : 1.0f;
        float f11 = fArr != null ? fArr[4] : 1.0f;
        if (this.f29139h == null) {
            this.f29139h = new RectF();
        }
        this.f29139h.set(b10.left * f10, b10.top * f11, b10.right * f10, b10.bottom * f11);
        if (this.f29140i == null) {
            this.f29140i = new Rect();
        }
        this.f29140i.set(0, 0, Math.round(this.f29139h.width()), Math.round(this.f29139h.height()));
        if (g(this.f29148q, this.f29139h)) {
            Bitmap bitmap = this.f29148q;
            if (bitmap != null) {
                d(bitmap);
            }
            Bitmap bitmap2 = this.f29149r;
            if (bitmap2 != null) {
                d(bitmap2);
            }
            this.f29148q = a(this.f29139h, Bitmap.Config.ARGB_8888);
            this.f29149r = a(this.f29139h, Bitmap.Config.ALPHA_8);
            this.f29150s = new Canvas(this.f29148q);
            this.f29151t = new Canvas(this.f29149r);
        } else {
            Canvas canvas2 = this.f29150s;
            if (canvas2 == null || this.f29151t == null || (aVar = this.f29146o) == null) {
                throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
            }
            canvas2.drawRect(this.f29140i, aVar);
            this.f29151t.drawRect(this.f29140i, this.f29146o);
        }
        if (this.f29149r == null) {
            throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
        }
        if (this.f29152u == null) {
            this.f29152u = new A3.a(1);
        }
        RectF rectF2 = this.f29135d;
        this.f29151t.drawBitmap(this.f29143l, Math.round((rectF2.left - b10.left) * f10), Math.round((rectF2.top - b10.top) * f11), (Paint) null);
        if (this.f29153v == null || this.f29154w != dVar.h()) {
            float h10 = (dVar.h() * (f10 + f11)) / 2.0f;
            if (h10 > 0.0f) {
                this.f29153v = new BlurMaskFilter(h10, BlurMaskFilter.Blur.NORMAL);
            } else {
                this.f29153v = null;
            }
            this.f29154w = dVar.h();
        }
        this.f29152u.setColor(dVar.e());
        if (dVar.h() > 0.0f) {
            this.f29152u.setMaskFilter(this.f29153v);
        } else {
            this.f29152u.setMaskFilter(null);
        }
        this.f29152u.setFilterBitmap(true);
        this.f29150s.drawBitmap(this.f29149r, Math.round(dVar.f() * f10), Math.round(dVar.g() * f11), this.f29152u);
        canvas.drawBitmap(this.f29148q, this.f29140i, this.f29137f, this.f29142k);
    }

    public final void i(Canvas canvas, d dVar) {
        RenderEffect createColorFilterEffect;
        RecordingCanvas beginRecording;
        if (this.f29155x == null || this.f29156y == null) {
            throw new IllegalStateException("Cannot render to render node outside a start()/finish() block");
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw new RuntimeException("RenderEffect is not supported on API level <31");
        }
        float[] fArr = this.preExistingTransform;
        float f10 = fArr != null ? fArr[0] : 1.0f;
        float f11 = fArr != null ? fArr[4] : 1.0f;
        d dVar2 = this.f29157z;
        if (dVar2 == null || !dVar.j(dVar2)) {
            createColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(dVar.e(), PorterDuff.Mode.SRC_IN));
            if (dVar.h() > 0.0f) {
                float h10 = (dVar.h() * (f10 + f11)) / 2.0f;
                createColorFilterEffect = RenderEffect.createBlurEffect(h10, h10, createColorFilterEffect, Shader.TileMode.CLAMP);
            }
            this.f29156y.setRenderEffect(createColorFilterEffect);
            this.f29157z = dVar;
        }
        RectF b10 = b(this.f29135d, dVar);
        RectF rectF = new RectF(b10.left * f10, b10.top * f11, b10.right * f10, b10.bottom * f11);
        this.f29156y.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
        beginRecording = this.f29156y.beginRecording((int) rectF.width(), (int) rectF.height());
        beginRecording.translate((-rectF.left) + (dVar.f() * f10), (-rectF.top) + (dVar.g() * f11));
        beginRecording.drawRenderNode(this.f29155x);
        this.f29156y.endRecording();
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        canvas.drawRenderNode(this.f29156y);
        canvas.restore();
    }

    public Canvas j(Canvas canvas, RectF rectF, b bVar) {
        RecordingCanvas beginRecording;
        if (this.f29132a != null) {
            throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
        }
        if (this.preExistingTransform == null) {
            this.preExistingTransform = new float[9];
        }
        if (this.f29147p == null) {
            this.f29147p = new Matrix();
        }
        canvas.getMatrix(this.f29147p);
        this.f29147p.getValues(this.preExistingTransform);
        float[] fArr = this.preExistingTransform;
        float f10 = fArr[0];
        float f11 = fArr[4];
        if (this.f29141j == null) {
            this.f29141j = new RectF();
        }
        this.f29141j.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
        this.f29132a = canvas;
        this.f29133b = bVar;
        this.f29134c = c(canvas, bVar);
        if (this.f29135d == null) {
            this.f29135d = new RectF();
        }
        this.f29135d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.f29142k == null) {
            this.f29142k = new A3.a();
        }
        this.f29142k.reset();
        int i10 = a.$SwitchMap$com$airbnb$lottie$utils$OffscreenLayer$RenderStrategy[this.f29134c.ordinal()];
        if (i10 == 1) {
            canvas.save();
            return canvas;
        }
        if (i10 == 2) {
            this.f29142k.setAlpha(bVar.f29158a);
            this.f29142k.setColorFilter(bVar.f29160c);
            if (bVar.a()) {
                androidx.core.graphics.f.b(this.f29142k, bVar.f29159b);
            }
            z.n(canvas, rectF, this.f29142k);
            return canvas;
        }
        if (i10 == 3) {
            if (this.f29146o == null) {
                A3.a aVar = new A3.a();
                this.f29146o = aVar;
                aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (g(this.f29143l, this.f29141j)) {
                Bitmap bitmap = this.f29143l;
                if (bitmap != null) {
                    d(bitmap);
                }
                this.f29143l = a(this.f29141j, Bitmap.Config.ARGB_8888);
                this.f29144m = new Canvas(this.f29143l);
            } else {
                Canvas canvas2 = this.f29144m;
                if (canvas2 == null) {
                    throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                }
                canvas2.setMatrix(f29131A);
                this.f29144m.drawRect(-1.0f, -1.0f, this.f29141j.width() + 1.0f, this.f29141j.height() + 1.0f, this.f29146o);
            }
            androidx.core.graphics.f.b(this.f29142k, bVar.f29159b);
            this.f29142k.setColorFilter(bVar.f29160c);
            this.f29142k.setAlpha(bVar.f29158a);
            Canvas canvas3 = this.f29144m;
            canvas3.scale(f10, f11);
            canvas3.translate(-rectF.left, -rectF.top);
            return canvas3;
        }
        if (i10 != 4) {
            throw new RuntimeException("Invalid render strategy for OffscreenLayer");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
        }
        if (this.f29155x == null) {
            this.f29155x = u.a("OffscreenLayer.main");
        }
        if (bVar.c() && this.f29156y == null) {
            this.f29156y = u.a("OffscreenLayer.shadow");
            this.f29157z = null;
        }
        if (bVar.a() || bVar.b()) {
            if (this.f29142k == null) {
                this.f29142k = new A3.a();
            }
            this.f29142k.reset();
            androidx.core.graphics.f.b(this.f29142k, bVar.f29159b);
            this.f29142k.setColorFilter(bVar.f29160c);
            this.f29155x.setUseCompositingLayer(true, this.f29142k);
            if (bVar.c()) {
                RenderNode renderNode = this.f29156y;
                if (renderNode == null) {
                    throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
                }
                renderNode.setUseCompositingLayer(true, this.f29142k);
            }
        }
        this.f29155x.setAlpha(bVar.f29158a / 255.0f);
        if (bVar.c()) {
            RenderNode renderNode2 = this.f29156y;
            if (renderNode2 == null) {
                throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
            }
            renderNode2.setAlpha(bVar.f29158a / 255.0f);
        }
        this.f29155x.setHasOverlappingRendering(true);
        RenderNode renderNode3 = this.f29155x;
        RectF rectF2 = this.f29141j;
        renderNode3.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        beginRecording = this.f29155x.beginRecording((int) this.f29141j.width(), (int) this.f29141j.height());
        beginRecording.setMatrix(f29131A);
        beginRecording.scale(f10, f11);
        beginRecording.translate(-rectF.left, -rectF.top);
        return beginRecording;
    }
}
