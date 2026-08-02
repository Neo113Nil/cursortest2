package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.material.progressindicator.l;

/* loaded from: classes3.dex */
public final class p extends m {

    /* renamed from: i, reason: collision with root package name */
    public static final Property f35721i = new b(Float.class, "animationFraction");

    /* renamed from: c, reason: collision with root package name */
    public ObjectAnimator f35722c;

    /* renamed from: d, reason: collision with root package name */
    public T0.b f35723d;

    /* renamed from: e, reason: collision with root package name */
    public final c f35724e;

    /* renamed from: f, reason: collision with root package name */
    public int f35725f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f35726g;

    /* renamed from: h, reason: collision with root package name */
    public float f35727h;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            p pVar = p.this;
            pVar.f35725f = (pVar.f35725f + 1) % p.this.f35724e.indicatorColors.length;
            p.this.f35726g = true;
        }
    }

    public class b extends Property {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(p pVar) {
            return Float.valueOf(pVar.n());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(p pVar, Float f10) {
            pVar.r(f10.floatValue());
        }
    }

    public p(r rVar) {
        super(3);
        this.f35725f = 1;
        this.f35724e = rVar;
        this.f35723d = new T0.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float n() {
        return this.f35727h;
    }

    private void o() {
        if (this.f35722c == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<p, Float>) f35721i, 0.0f, 1.0f);
            this.f35722c = ofFloat;
            ofFloat.setDuration((long) (this.f35724e.f35614m * 333.0f));
            this.f35722c.setInterpolator(null);
            this.f35722c.setRepeatCount(-1);
            this.f35722c.addListener(new a());
        }
    }

    private void s() {
        o();
        this.f35722c.setDuration((long) (this.f35724e.f35614m * 333.0f));
    }

    private void t(int i10) {
        ((l.a) this.f35707b.get(0)).f35696a = 0.0f;
        float b10 = b(i10, 0, 667);
        l.a aVar = (l.a) this.f35707b.get(0);
        l.a aVar2 = (l.a) this.f35707b.get(1);
        float interpolation = this.f35723d.getInterpolation(b10);
        aVar2.f35696a = interpolation;
        aVar.f35697b = interpolation;
        l.a aVar3 = (l.a) this.f35707b.get(1);
        l.a aVar4 = (l.a) this.f35707b.get(2);
        float interpolation2 = this.f35723d.getInterpolation(b10 + 0.49925038f);
        aVar4.f35696a = interpolation2;
        aVar3.f35697b = interpolation2;
        ((l.a) this.f35707b.get(2)).f35697b = 1.0f;
    }

    @Override // com.google.android.material.progressindicator.m
    public void a() {
        ObjectAnimator objectAnimator = this.f35722c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.m
    public void c() {
        s();
        q();
    }

    @Override // com.google.android.material.progressindicator.m
    public void d(androidx.vectordrawable.graphics.drawable.b bVar) {
    }

    @Override // com.google.android.material.progressindicator.m
    public void f() {
    }

    @Override // com.google.android.material.progressindicator.m
    public void g() {
        o();
        q();
        this.f35722c.start();
    }

    @Override // com.google.android.material.progressindicator.m
    public void h() {
    }

    public final void p() {
        if (!this.f35726g || ((l.a) this.f35707b.get(1)).f35697b >= 1.0f) {
            return;
        }
        ((l.a) this.f35707b.get(2)).f35698c = ((l.a) this.f35707b.get(1)).f35698c;
        ((l.a) this.f35707b.get(1)).f35698c = ((l.a) this.f35707b.get(0)).f35698c;
        ((l.a) this.f35707b.get(0)).f35698c = this.f35724e.indicatorColors[this.f35725f];
        this.f35726g = false;
    }

    public void q() {
        this.f35726g = true;
        this.f35725f = 1;
        for (l.a aVar : this.f35707b) {
            c cVar = this.f35724e;
            aVar.f35698c = cVar.indicatorColors[0];
            aVar.f35699d = cVar.f35609h / 2;
        }
    }

    public void r(float f10) {
        this.f35727h = f10;
        t((int) (f10 * 333.0f));
        p();
        this.f35706a.invalidateSelf();
    }
}
