package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import ja.AbstractC5104a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xa.o;
import ya.AbstractC6866a;

/* loaded from: classes3.dex */
class ClockHandView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final int f36379a;

    /* renamed from: b, reason: collision with root package name */
    public final TimeInterpolator f36380b;

    /* renamed from: c, reason: collision with root package name */
    public final ValueAnimator f36381c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f36382d;

    /* renamed from: e, reason: collision with root package name */
    public float f36383e;

    /* renamed from: f, reason: collision with root package name */
    public float f36384f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f36385g;

    /* renamed from: h, reason: collision with root package name */
    public final int f36386h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f36387i;

    /* renamed from: j, reason: collision with root package name */
    public final List f36388j;

    /* renamed from: k, reason: collision with root package name */
    public final int f36389k;

    /* renamed from: l, reason: collision with root package name */
    public final float f36390l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint f36391m;

    /* renamed from: n, reason: collision with root package name */
    public final RectF f36392n;

    /* renamed from: o, reason: collision with root package name */
    public final int f36393o;

    /* renamed from: p, reason: collision with root package name */
    public float f36394p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f36395q;

    /* renamed from: r, reason: collision with root package name */
    public b f36396r;

    /* renamed from: s, reason: collision with root package name */
    public double f36397s;

    /* renamed from: t, reason: collision with root package name */
    public int f36398t;

    /* renamed from: u, reason: collision with root package name */
    public int f36399u;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface b {
        void a(float f10, boolean z10);
    }

    public interface c {
        void d(float f10, boolean z10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ia.c.f48207L);
    }

    public static /* synthetic */ void a(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        clockHandView.getClass();
        clockHandView.s(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    public void b(c cVar) {
        this.f36388j.add(cVar);
    }

    public final void c(float f10, float f11) {
        this.f36399u = AbstractC6866a.b((float) (getWidth() / 2), (float) (getHeight() / 2), f10, f11) > ((float) i(2)) + o.d(getContext(), 12) ? 1 : 2;
    }

    public final void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f10 = width;
        float i10 = i(this.f36399u);
        float cos = (((float) Math.cos(this.f36397s)) * i10) + f10;
        float f11 = height;
        float sin = (i10 * ((float) Math.sin(this.f36397s))) + f11;
        this.f36391m.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f36389k, this.f36391m);
        double sin2 = Math.sin(this.f36397s);
        double cos2 = Math.cos(this.f36397s);
        this.f36391m.setStrokeWidth(this.f36393o);
        canvas.drawLine(f10, f11, width + ((int) (cos2 * r2)), height + ((int) (r2 * sin2)), this.f36391m);
        canvas.drawCircle(f10, f11, this.f36390l, this.f36391m);
    }

    public int e() {
        return this.f36399u;
    }

    public RectF f() {
        return this.f36392n;
    }

    public final int g(float f10, float f11) {
        int degrees = (int) Math.toDegrees(Math.atan2(f11 - (getHeight() / 2), f10 - (getWidth() / 2)));
        int i10 = degrees + 90;
        return i10 < 0 ? degrees + 450 : i10;
    }

    public float h() {
        return this.f36394p;
    }

    public final int i(int i10) {
        return i10 == 2 ? Math.round(this.f36398t * 0.66f) : this.f36398t;
    }

    public int j() {
        return this.f36389k;
    }

    public final Pair k(float f10) {
        float h10 = h();
        if (Math.abs(h10 - f10) > 180.0f) {
            if (h10 > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (h10 < 180.0f && f10 > 180.0f) {
                h10 += 360.0f;
            }
        }
        return new Pair(Float.valueOf(h10), Float.valueOf(f10));
    }

    public final boolean l(float f10, float f11, boolean z10, boolean z11, boolean z12) {
        float g10 = g(f10, f11);
        boolean z13 = false;
        boolean z14 = h() != g10;
        if (z11 && z14) {
            return true;
        }
        if (!z14 && !z10) {
            return false;
        }
        if (z12 && this.f36382d) {
            z13 = true;
        }
        r(g10, z13);
        return true;
    }

    public final void m() {
        this.f36381c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ClockHandView.a(ClockHandView.this, valueAnimator);
            }
        });
        this.f36381c.addListener(new a());
    }

    public void n(boolean z10) {
        this.f36382d = z10;
    }

    public void o(int i10) {
        this.f36398t = i10;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f36381c.isRunning()) {
            return;
        }
        q(h());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        b bVar;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f36383e = x10;
            this.f36384f = y10;
            this.f36385g = true;
            this.f36395q = false;
            z10 = true;
            z11 = false;
            z12 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i10 = (int) (x10 - this.f36383e);
            int i11 = (int) (y10 - this.f36384f);
            this.f36385g = (i10 * i10) + (i11 * i11) > this.f36386h;
            z11 = this.f36395q;
            boolean z13 = actionMasked == 1;
            if (this.f36387i) {
                c(x10, y10);
            }
            z12 = z13;
            z10 = false;
        } else {
            z11 = false;
            z10 = false;
            z12 = false;
        }
        boolean l10 = this.f36395q | l(x10, y10, z11, z10, z12);
        this.f36395q = l10;
        if (l10 && z12 && (bVar = this.f36396r) != null) {
            bVar.a(g(x10, y10), this.f36385g);
        }
        return true;
    }

    public void p(int i10) {
        this.f36399u = i10;
        invalidate();
    }

    public void q(float f10) {
        r(f10, false);
    }

    public void r(float f10, boolean z10) {
        this.f36381c.cancel();
        if (!z10) {
            s(f10, false);
            return;
        }
        Pair k10 = k(f10);
        this.f36381c.setFloatValues(((Float) k10.first).floatValue(), ((Float) k10.second).floatValue());
        this.f36381c.setDuration(this.f36379a);
        this.f36381c.setInterpolator(this.f36380b);
        this.f36381c.start();
    }

    public final void s(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f36394p = f11;
        this.f36397s = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float i10 = i(this.f36399u);
        float cos = width + (((float) Math.cos(this.f36397s)) * i10);
        float sin = height + (i10 * ((float) Math.sin(this.f36397s)));
        RectF rectF = this.f36392n;
        int i11 = this.f36389k;
        rectF.set(cos - i11, sin - i11, cos + i11, sin + i11);
        Iterator it = this.f36388j.iterator();
        while (it.hasNext()) {
            ((c) it.next()).d(f11, z10);
        }
        invalidate();
    }

    public void t(boolean z10) {
        if (this.f36387i && !z10) {
            this.f36399u = 1;
        }
        this.f36387i = z10;
        invalidate();
    }

    public void u(b bVar) {
        this.f36396r = bVar;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f36381c = new ValueAnimator();
        this.f36388j = new ArrayList();
        Paint paint = new Paint();
        this.f36391m = paint;
        this.f36392n = new RectF();
        this.f36399u = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ia.m.ClockHandView, i10, ia.l.f48559K);
        this.f36379a = za.h.f(context, ia.c.f48214S, 200);
        this.f36380b = za.h.g(context, ia.c.f48225b0, AbstractC5104a.f53859b);
        this.f36398t = obtainStyledAttributes.getDimensionPixelSize(ia.m.f48590A1, 0);
        this.f36389k = obtainStyledAttributes.getDimensionPixelSize(ia.m.f48600B1, 0);
        this.f36393o = getResources().getDimensionPixelSize(ia.e.f48311L);
        this.f36390l = r7.getDimensionPixelSize(ia.e.f48307J);
        int color = obtainStyledAttributes.getColor(ia.m.f49092z1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        q(0.0f);
        this.f36386h = ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
        m();
    }
}
