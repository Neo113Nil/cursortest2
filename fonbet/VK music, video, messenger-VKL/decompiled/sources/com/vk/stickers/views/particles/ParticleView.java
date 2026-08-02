package com.vk.stickers.views.particles;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.random.Random;
import xsna.e43;
import xsna.gg;
import xsna.haq;
import xsna.kbd;
import xsna.ll90;
import xsna.ml90;
import xsna.pq2;
import xsna.qo4;
import xsna.swe0;
import xsna.tv4;
import xsna.tye0;
import xsna.u11;

/* compiled from: ParticleView.kt */
/* loaded from: classes6.dex */
public final class ParticleView extends View {
    public pq2 b;
    public long c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public boolean m;
    public Bitmap n;
    public Bitmap o;
    public final ArrayList<b> p;
    public final ArrayList<a> q;
    public final ArrayDeque<a> r;
    public final ArrayList<Integer> s;
    public final qo4 t;
    public final Paint u;
    public final Paint v;
    public final ValueAnimator w;

    /* compiled from: ParticleView.kt */
    public static final class a {
        public int a;
        public float b;
        public float c;
        public float d;
        public int e = 255;
        public float f;
        public float g;
        public float h;
        public float i;
        public float j;
        public float k;
    }

    /* compiled from: ParticleView.kt */
    public static final class b {
        public final float a;
        public final float b;
        public final float c;
        public final float d;

        public b(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }
    }

    public ParticleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new haq(0);
        this.p = new ArrayList<>();
        this.q = new ArrayList<>(200);
        this.r = new ArrayDeque<>(50);
        this.s = new ArrayList<>();
        this.t = new qo4(this, 9);
        Paint paint = new Paint(1);
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.ADD));
        this.u = paint;
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        paint2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.v = paint2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new kbd(this, 1));
        this.w = ofFloat;
        this.d = getConfig().c.b;
        this.e = getConfig().a.f;
        h();
        k();
    }

    public static void a(ParticleView particleView) {
        long nanoTime = System.nanoTime();
        if (particleView.c == 0) {
            particleView.c = nanoTime;
            return;
        }
        particleView.c = nanoTime;
        float f = (nanoTime - r2) / 1.6666666E7f;
        if (f > 4.0f) {
            f = 4.0f;
        }
        ArrayList<a> arrayList = particleView.q;
        float b2 = u11.b(particleView.getConfig().a.g, particleView.e, particleView.getConfig().a.h * f, particleView.e);
        particleView.e = b2;
        float f2 = 360;
        particleView.f = ((b2 * f) + particleView.f) % f2;
        if (particleView.d > 1.0f) {
            float f3 = particleView.d * (1.0f - (particleView.getConfig().c.c * f));
            particleView.d = f3;
            if (f3 < 1.0f) {
                particleView.d = 1.0f;
            }
        }
        particleView.g = ((particleView.getConfig().b.b * f) + particleView.g) % f2;
        ll90 ll90Var = particleView.getConfig().b;
        float f4 = particleView.d > ll90Var.e ? ll90Var.d : ll90Var.c;
        Random.b.getClass();
        if (Random.c.i() < f4 * f) {
            ArrayList<Integer> arrayList2 = particleView.s;
            if (arrayList2.isEmpty()) {
                particleView.h();
            }
            particleView.j(arrayList2.remove(0).intValue(), false);
        }
        for (int h = e43.h(arrayList); -1 < h; h--) {
            a aVar = arrayList.get(h);
            float f5 = (aVar.c * particleView.d * f) + aVar.b;
            aVar.b = f5;
            aVar.g = ((aVar.h * f) + aVar.g) % f2;
            if (f5 >= 1.0f) {
                arrayList.remove(h);
                particleView.r.add(aVar);
            }
        }
        particleView.invalidate();
    }

    public static void b(ParticleView particleView) {
        int i = particleView.getConfig().c.a;
        ArrayList arrayList = new ArrayList(i);
        int i2 = particleView.getConfig().b.a;
        int ceil = (int) Math.ceil(i / i2);
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < ceil; i4 = tv4.a(arrayList, i3, i4, 1)) {
            }
        }
        Collections.shuffle(arrayList);
        for (int i5 = 0; i5 < i && !arrayList.isEmpty(); i5++) {
            particleView.j(((Number) arrayList.remove(0)).intValue(), true);
        }
        if (particleView.getVisibility() == 0 && particleView.getWindowVisibility() == 0) {
            particleView.c = 0L;
            particleView.w.start();
        }
    }

    private final ml90 getConfig() {
        return this.b.getConfig();
    }

    public final void c(Canvas canvas, Bitmap bitmap, float f) {
        ArrayList<b> arrayList = this.p;
        float f2 = this.f;
        int save = canvas.save();
        canvas.rotate(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        try {
            float f3 = ((getConfig().a.d * 2) + (-bitmap.getHeight())) - this.k;
            float f4 = (-bitmap.getWidth()) / 2.0f;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                Paint paint = this.u;
                if (i >= size) {
                    paint.setAlpha(255);
                    return;
                }
                b bVar = arrayList.get(i);
                float f5 = bVar.a;
                save = canvas.save();
                canvas.rotate(f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                try {
                    canvas.scale(bVar.b * f, bVar.c * f);
                    paint.setAlpha((int) swe0.f(255 * bVar.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 255.0f));
                    canvas.drawBitmap(bitmap, f4, f3, paint);
                    canvas.restoreToCount(save);
                    i++;
                } finally {
                    canvas.restoreToCount(save);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d() {
        ArrayList<b> arrayList = this.p;
        arrayList.clear();
        tye0 tye0Var = getConfig().a;
        int i = tye0Var.a;
        float f = 360.0f / i;
        for (int i2 = 0; i2 < i; i2++) {
            Random.b.getClass();
            gg ggVar = Random.c;
            float i3 = (i2 * f) + (tye0Var.o * f * (ggVar.i() - 0.5f));
            float h = (float) ggVar.h(tye0Var.p, tye0Var.q);
            arrayList.add(new b(i3, h, (float) ggVar.h(tye0Var.r, tye0Var.s), h));
        }
    }

    public final void e(boolean z) {
        ValueAnimator valueAnimator = this.w;
        if (!z) {
            if (valueAnimator.isRunning()) {
                valueAnimator.pause();
            }
            removeCallbacks(this.t);
        } else if (valueAnimator.isPaused()) {
            valueAnimator.resume();
        } else {
            if (valueAnimator.isRunning() || !this.m) {
                return;
            }
            valueAnimator.start();
        }
    }

    public final void f() {
        tye0 tye0Var = getConfig().a;
        float f = this.l;
        float f2 = tye0Var.d;
        float f3 = this.j;
        float f4 = 2;
        float f5 = (tye0Var.k * f3) / f4;
        float f6 = (tye0Var.l * f3) / f4;
        float f7 = (f3 * tye0Var.m) / f4;
        float f8 = (-f) / 2.0f;
        float f9 = tye0Var.e * f2;
        int i = (int) ((f6 * f4) + f9);
        int i2 = (int) (f9 + f);
        if (i <= 0 || i2 <= 0) {
            return;
        }
        float f10 = i / 2.0f;
        float f11 = i2 - (f4 * f2);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setMaskFilter(new BlurMaskFilter(f2, BlurMaskFilter.Blur.NORMAL));
        float f12 = f11 - f;
        paint.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f12, new int[]{Color.argb(0, 255, 255, 255), Color.argb(tye0Var.b, 255, 255, 255), Color.argb(tye0Var.c, 255, 255, 255)}, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, tye0Var.n, 1.0f}, Shader.TileMode.CLAMP));
        Path path = new Path();
        path.moveTo(f10 - f7, f11);
        float f13 = f8 + f11;
        path.quadTo(f10 - f6, f13, f10 - f5, f12);
        path.lineTo(f5 + f10, f12);
        path.quadTo(f6 + f10, f13, f10 + f7, f11);
        path.close();
        canvas.drawPath(path, paint);
        this.o = createBitmap;
    }

    public final void g(int i, int i2) {
        float max = Math.max(i, i2);
        float f = max / 2.0f;
        float f2 = 1.2f * f;
        this.j = f2;
        this.k = f2 * getConfig().a.i;
        float f3 = (f - (max * getConfig().a.j)) - this.k;
        this.l = f3;
        if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.l = 1.0f;
        }
    }

    public final void h() {
        ArrayList<Integer> arrayList = this.s;
        arrayList.clear();
        int i = getConfig().b.a;
        for (int i2 = 0; i2 < i; i2 = tv4.a(arrayList, i2, i2, 1)) {
        }
        Collections.shuffle(arrayList);
    }

    public final void i() {
        this.w.cancel();
        qo4 qo4Var = this.t;
        removeCallbacks(qo4Var);
        ArrayDeque<a> arrayDeque = this.r;
        ArrayList<a> arrayList = this.q;
        arrayDeque.addAll(arrayList);
        arrayList.clear();
        h();
        this.d = getConfig().c.b;
        this.e = getConfig().a.f;
        d();
        invalidate();
        postDelayed(qo4Var, getConfig().e);
    }

    public final void j(int i, boolean z) {
        float f;
        a poll = this.r.poll();
        if (poll == null) {
            poll = new a();
        }
        ll90 ll90Var = getConfig().b;
        Random.Default r3 = Random.b;
        double d = ll90Var.h;
        double d2 = ll90Var.i;
        r3.getClass();
        gg ggVar = Random.c;
        float h = (float) ggVar.h(d, d2);
        float h2 = (float) ggVar.h(ll90Var.j, ll90Var.k);
        int l = ggVar.l(ll90Var.p, ll90Var.q);
        float f2 = ll90Var.l;
        float i2 = z ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (ggVar.i() * f2) - (f2 / 2.0f);
        float i3 = z ? ggVar.i() * ll90Var.g : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f3 = z ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : ll90Var.o;
        if (z) {
            float f4 = ll90Var.f;
            f = (ggVar.i() * f4) - (f4 / 2.0f);
        } else {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float h3 = ((float) ggVar.h(ll90Var.m, ll90Var.n)) * 6.2831855f;
        float i4 = ggVar.i() * 6.2831855f;
        poll.a = i;
        poll.b = i3;
        poll.c = h2;
        poll.d = h;
        poll.e = l;
        poll.f = i4;
        poll.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        poll.h = i2;
        poll.i = f;
        poll.j = f3;
        poll.k = h3;
        this.q.add(poll);
    }

    public final void k() {
        Bitmap createBitmap;
        int i = (int) (getConfig().b.i * 1.5d);
        Drawable drawable = getContext().getDrawable(getConfig().d);
        if (drawable == null) {
            createBitmap = null;
        } else {
            createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
        }
        this.n = createBitmap;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0 && getWindowVisibility() == 0) {
            ValueAnimator valueAnimator = this.w;
            if (valueAnimator.isPaused()) {
                valueAnimator.resume();
            } else {
                if (valueAnimator.isRunning()) {
                    return;
                }
                if (this.m) {
                    valueAnimator.start();
                } else {
                    i();
                }
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.w.pause();
        removeCallbacks(this.t);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        float f2;
        ArrayList<a> arrayList;
        int i2;
        float f3;
        float f4;
        ParticleView particleView = this;
        super.onDraw(canvas);
        float f5 = particleView.h;
        float f6 = particleView.i;
        int save = canvas.save();
        canvas.translate(f5, f6);
        try {
            float f7 = 1.0f;
            float f8 = 1.0f - ((particleView.d - 1.0f) / (particleView.getConfig().c.b - 1.0f));
            Bitmap bitmap = particleView.o;
            float f9 = 0.1f;
            if (bitmap != null && !bitmap.isRecycled()) {
                particleView.c(canvas, bitmap, f8 < 0.05f ? 0.1f : (((f8 - 0.05f) / 0.95f) * 0.9f) + 0.1f);
            }
            canvas.restoreToCount(save);
            Bitmap bitmap2 = particleView.n;
            if (bitmap2 == null || bitmap2.isRecycled()) {
                return;
            }
            ArrayList<a> arrayList2 = particleView.q;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                a aVar = arrayList2.get(i3);
                Paint paint = particleView.v;
                float f10 = aVar.b;
                ll90 ll90Var = particleView.getConfig().b;
                float f11 = ll90Var.r;
                if (f10 < f11) {
                    f = f10 / f11;
                    i = (int) (aVar.e * f);
                } else {
                    float f12 = ll90Var.s;
                    if (f10 > f12) {
                        float f13 = (f10 - f12) / (f7 - f12);
                        i = (int) ((1 - f13) * aVar.e);
                        f = f7 - f13;
                    } else {
                        i = aVar.e;
                        f = f7;
                    }
                }
                if (i == 0) {
                    i2 = size;
                    f3 = f7;
                    f2 = f9;
                    arrayList = arrayList2;
                } else {
                    float f14 = particleView.j * aVar.b;
                    f2 = f9;
                    float sin = aVar.j * ((float) Math.sin((r13 * aVar.k) + aVar.f));
                    float f15 = (((360.0f / ll90Var.a) * aVar.a) + particleView.g + (aVar.i * aVar.b)) * 0.017453292f;
                    arrayList = arrayList2;
                    i2 = size;
                    double d = f15;
                    float cos = ((((float) Math.cos(d)) * f14) - (((float) Math.sin(d)) * sin)) + particleView.h;
                    float cos2 = (sin * ((float) Math.cos(d))) + (f14 * ((float) Math.sin(d))) + particleView.i;
                    float width = particleView.getWidth() / 2.0f;
                    float height = particleView.getHeight() / 2.0f;
                    float f16 = width * f2;
                    float f17 = height * f2;
                    float abs = Math.abs(cos - particleView.h);
                    float abs2 = Math.abs(cos2 - particleView.i);
                    if (abs > width - f16) {
                        float f18 = (width - abs) / f16;
                        f3 = 1.0f;
                        f4 = Math.min(1.0f, swe0.f(f18, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
                    } else {
                        f3 = 1.0f;
                        f4 = 1.0f;
                    }
                    if (abs2 > height - f17) {
                        f4 = Math.min(f4, swe0.f((height - abs2) / f17, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3));
                    }
                    int i4 = (int) (i * f4);
                    float f19 = f * f4;
                    if (i4 == 0) {
                        continue;
                    } else {
                        save = canvas.save();
                        canvas.translate(cos, cos2);
                        try {
                            canvas.rotate(aVar.g);
                            float height2 = (aVar.d / bitmap2.getHeight()) * f19;
                            canvas.scale(height2, height2);
                            paint.setAlpha(i4);
                            canvas.drawBitmap(bitmap2, (-bitmap2.getWidth()) / 2.0f, (-bitmap2.getHeight()) / 2.0f, paint);
                        } finally {
                        }
                    }
                }
                i3++;
                particleView = this;
                arrayList2 = arrayList;
                size = i2;
                f7 = f3;
                f9 = f2;
            }
        } finally {
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.h = i / 2.0f;
        this.i = i2 / 2.0f;
        g(i, i2);
        f();
        d();
        if (this.m) {
            return;
        }
        i();
        this.m = true;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        e(i == 0);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        e(i == 0);
    }

    public final void setAnimationType(pq2 pq2Var) {
        this.b = pq2Var;
        this.d = getConfig().c.b;
        this.e = getConfig().a.f;
        k();
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        g(getWidth(), getHeight());
        f();
    }
}
