package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Property;
import ja.AbstractC5104a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class k extends Drawable implements Animatable {

    /* renamed from: q, reason: collision with root package name */
    public static final Property f35672q = new c(Float.class, "growFraction");

    /* renamed from: a, reason: collision with root package name */
    public final Context f35673a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.material.progressindicator.c f35674b;

    /* renamed from: d, reason: collision with root package name */
    public ValueAnimator f35676d;

    /* renamed from: e, reason: collision with root package name */
    public ValueAnimator f35677e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f35678f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f35679g;

    /* renamed from: h, reason: collision with root package name */
    public float f35680h;

    /* renamed from: j, reason: collision with root package name */
    public List f35682j;

    /* renamed from: k, reason: collision with root package name */
    public androidx.vectordrawable.graphics.drawable.b f35683k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f35684l;

    /* renamed from: m, reason: collision with root package name */
    public float f35685m;

    /* renamed from: o, reason: collision with root package name */
    public int f35687o;

    /* renamed from: i, reason: collision with root package name */
    public float f35681i = -1.0f;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f35686n = new Paint();

    /* renamed from: p, reason: collision with root package name */
    public Rect f35688p = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public com.google.android.material.progressindicator.a f35675c = new com.google.android.material.progressindicator.a();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            k.this.f();
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            k.super.setVisible(false, false);
            k.this.e();
        }
    }

    public class c extends Property {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(k kVar) {
            return Float.valueOf(kVar.h());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, Float f10) {
            kVar.p(f10.floatValue());
        }
    }

    public k(Context context, com.google.android.material.progressindicator.c cVar) {
        this.f35673a = context;
        this.f35674b = cVar;
        setAlpha(255);
    }

    public final void d(ValueAnimator... valueAnimatorArr) {
        boolean z10 = this.f35684l;
        this.f35684l = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.cancel();
        }
        this.f35684l = z10;
    }

    public final void e() {
        androidx.vectordrawable.graphics.drawable.b bVar = this.f35683k;
        if (bVar != null) {
            bVar.b(this);
        }
        List list = this.f35682j;
        if (list == null || this.f35684l) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((androidx.vectordrawable.graphics.drawable.b) it.next()).b(this);
        }
    }

    public final void f() {
        androidx.vectordrawable.graphics.drawable.b bVar = this.f35683k;
        if (bVar != null) {
            bVar.c(this);
        }
        List list = this.f35682j;
        if (list == null || this.f35684l) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((androidx.vectordrawable.graphics.drawable.b) it.next()).c(this);
        }
    }

    public final void g(ValueAnimator... valueAnimatorArr) {
        boolean z10 = this.f35684l;
        this.f35684l = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f35684l = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f35687o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float h() {
        if (this.f35674b.d() || this.f35674b.c()) {
            return (this.f35679g || this.f35678f) ? this.f35680h : this.f35685m;
        }
        return 1.0f;
    }

    public float i() {
        float f10 = this.f35681i;
        if (f10 > 0.0f) {
            return f10;
        }
        if (this.f35674b.b(k()) && this.f35674b.f35613l != 0) {
            float a10 = this.f35675c.a(this.f35673a.getContentResolver());
            if (a10 > 0.0f) {
                float uptimeMillis = (SystemClock.uptimeMillis() % r0) / ((int) ((((k() ? this.f35674b.f35610i : this.f35674b.f35611j) * 1000.0f) / this.f35674b.f35613l) * a10));
                return uptimeMillis < 0.0f ? (uptimeMillis % 1.0f) + 1.0f : uptimeMillis;
            }
        }
        return 0.0f;
    }

    public boolean isRunning() {
        return m() || l();
    }

    public boolean j() {
        return s(false, false, false);
    }

    public final boolean k() {
        return this instanceof j;
    }

    public boolean l() {
        ValueAnimator valueAnimator = this.f35677e;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f35679g;
    }

    public boolean m() {
        ValueAnimator valueAnimator = this.f35676d;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f35678f;
    }

    public final void n() {
        if (this.f35676d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<k, Float>) f35672q, 0.0f, 1.0f);
            this.f35676d = ofFloat;
            ofFloat.setDuration(500L);
            this.f35676d.setInterpolator(AbstractC5104a.f53859b);
            r(this.f35676d);
        }
        if (this.f35677e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<k, Float>) f35672q, 1.0f, 0.0f);
            this.f35677e = ofFloat2;
            ofFloat2.setDuration(500L);
            this.f35677e.setInterpolator(AbstractC5104a.f53859b);
            q(this.f35677e);
        }
    }

    public void o(androidx.vectordrawable.graphics.drawable.b bVar) {
        if (this.f35682j == null) {
            this.f35682j = new ArrayList();
        }
        if (this.f35682j.contains(bVar)) {
            return;
        }
        this.f35682j.add(bVar);
    }

    public void p(float f10) {
        if (this.f35685m != f10) {
            this.f35685m = f10;
            invalidateSelf();
        }
    }

    public final void q(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f35677e;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.f35677e = valueAnimator;
        valueAnimator.addListener(new b());
    }

    public final void r(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f35676d;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.f35676d = valueAnimator;
        valueAnimator.addListener(new a());
    }

    public boolean s(boolean z10, boolean z11, boolean z12) {
        return t(z10, z11, z12 && this.f35675c.a(this.f35673a.getContentResolver()) > 0.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f35687o = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f35686n.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        return s(z10, z11, true);
    }

    public void start() {
        t(true, true, false);
    }

    public void stop() {
        t(false, true, false);
    }

    public boolean t(boolean z10, boolean z11, boolean z12) {
        n();
        if (!isVisible() && !z10) {
            return false;
        }
        ValueAnimator valueAnimator = z10 ? this.f35676d : this.f35677e;
        ValueAnimator valueAnimator2 = z10 ? this.f35677e : this.f35676d;
        if (!z12) {
            if (valueAnimator2.isRunning()) {
                d(valueAnimator2);
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                g(valueAnimator);
            }
            return super.setVisible(z10, false);
        }
        if (valueAnimator.isRunning()) {
            return false;
        }
        boolean z13 = !z10 || super.setVisible(z10, false);
        if (!(z10 ? this.f35674b.d() : this.f35674b.c())) {
            g(valueAnimator);
            return z13;
        }
        if (z11 || !valueAnimator.isPaused()) {
            valueAnimator.start();
            return z13;
        }
        valueAnimator.resume();
        return z13;
    }

    public boolean u(androidx.vectordrawable.graphics.drawable.b bVar) {
        List list = this.f35682j;
        if (list == null || !list.contains(bVar)) {
            return false;
        }
        this.f35682j.remove(bVar);
        if (!this.f35682j.isEmpty()) {
            return true;
        }
        this.f35682j = null;
        return true;
    }
}
