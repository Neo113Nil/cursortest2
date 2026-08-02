package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.material.progressindicator.l;
import ja.C5106c;

/* loaded from: classes3.dex */
public final class e extends m {

    /* renamed from: c, reason: collision with root package name */
    public ObjectAnimator f35629c;

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f35630d;

    /* renamed from: e, reason: collision with root package name */
    public final T0.b f35631e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.android.material.progressindicator.c f35632f;

    /* renamed from: g, reason: collision with root package name */
    public int f35633g;

    /* renamed from: h, reason: collision with root package name */
    public float f35634h;

    /* renamed from: i, reason: collision with root package name */
    public float f35635i;

    /* renamed from: j, reason: collision with root package name */
    public androidx.vectordrawable.graphics.drawable.b f35636j;
    private static final int[] DELAY_TO_EXPAND_IN_MS = {0, 1350, 2700, 4050};
    private static final int[] DELAY_TO_COLLAPSE_IN_MS = {667, 2017, 3367, 4717};
    private static final int[] DELAY_TO_FADE_IN_MS = {1000, 2350, 3700, 5050};

    /* renamed from: k, reason: collision with root package name */
    public static final Property f35627k = new c(Float.class, "animationFraction");

    /* renamed from: l, reason: collision with root package name */
    public static final Property f35628l = new d(Float.class, "completeEndFraction");

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            e eVar = e.this;
            eVar.f35633g = (eVar.f35633g + 4) % e.this.f35632f.indicatorColors.length;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            e.this.a();
            e eVar = e.this;
            androidx.vectordrawable.graphics.drawable.b bVar = eVar.f35636j;
            if (bVar != null) {
                bVar.b(eVar.f35706a);
            }
        }
    }

    public class c extends Property {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(e eVar) {
            return Float.valueOf(eVar.o());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(e eVar, Float f10) {
            eVar.t(f10.floatValue());
        }
    }

    public class d extends Property {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(e eVar) {
            return Float.valueOf(eVar.p());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(e eVar, Float f10) {
            eVar.u(f10.floatValue());
        }
    }

    public e(g gVar) {
        super(1);
        this.f35633g = 0;
        this.f35636j = null;
        this.f35632f = gVar;
        this.f35631e = new T0.b();
    }

    @Override // com.google.android.material.progressindicator.m
    public void a() {
        ObjectAnimator objectAnimator = this.f35629c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.m
    public void c() {
        v();
        s();
    }

    @Override // com.google.android.material.progressindicator.m
    public void d(androidx.vectordrawable.graphics.drawable.b bVar) {
        this.f35636j = bVar;
    }

    @Override // com.google.android.material.progressindicator.m
    public void f() {
        ObjectAnimator objectAnimator = this.f35630d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f35706a.isVisible()) {
            this.f35630d.start();
        } else {
            a();
        }
    }

    @Override // com.google.android.material.progressindicator.m
    public void g() {
        q();
        s();
        this.f35629c.start();
    }

    @Override // com.google.android.material.progressindicator.m
    public void h() {
        this.f35636j = null;
    }

    public final float o() {
        return this.f35634h;
    }

    public final float p() {
        return this.f35635i;
    }

    public final void q() {
        if (this.f35629c == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<e, Float>) f35627k, 0.0f, 1.0f);
            this.f35629c = ofFloat;
            ofFloat.setDuration((long) (this.f35632f.f35614m * 5400.0f));
            this.f35629c.setInterpolator(null);
            this.f35629c.setRepeatCount(-1);
            this.f35629c.addListener(new a());
        }
        if (this.f35630d == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<e, Float>) f35628l, 0.0f, 1.0f);
            this.f35630d = ofFloat2;
            ofFloat2.setDuration((long) (this.f35632f.f35614m * 333.0f));
            this.f35630d.setInterpolator(this.f35631e);
            this.f35630d.addListener(new b());
        }
    }

    public final void r(int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            float b10 = b(i10, DELAY_TO_FADE_IN_MS[i11], 333);
            if (b10 > 0.0f && b10 < 1.0f) {
                int i12 = i11 + this.f35633g;
                int[] iArr = this.f35632f.indicatorColors;
                int length = i12 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                int i13 = iArr[length];
                int i14 = iArr[length2];
                ((l.a) this.f35707b.get(0)).f35698c = C5106c.b().evaluate(this.f35631e.getInterpolation(b10), Integer.valueOf(i13), Integer.valueOf(i14)).intValue();
                return;
            }
        }
    }

    public void s() {
        this.f35633g = 0;
        ((l.a) this.f35707b.get(0)).f35698c = this.f35632f.indicatorColors[0];
        this.f35635i = 0.0f;
    }

    public void t(float f10) {
        this.f35634h = f10;
        int i10 = (int) (f10 * 5400.0f);
        w(i10);
        r(i10);
        this.f35706a.invalidateSelf();
    }

    public final void u(float f10) {
        this.f35635i = f10;
    }

    public final void v() {
        q();
        this.f35629c.setDuration((long) (this.f35632f.f35614m * 5400.0f));
        this.f35630d.setDuration((long) (this.f35632f.f35614m * 333.0f));
    }

    public final void w(int i10) {
        l.a aVar = (l.a) this.f35707b.get(0);
        float f10 = this.f35634h;
        aVar.f35696a = (f10 * 1520.0f) - 20.0f;
        aVar.f35697b = f10 * 1520.0f;
        for (int i11 = 0; i11 < 4; i11++) {
            aVar.f35697b += this.f35631e.getInterpolation(b(i10, DELAY_TO_EXPAND_IN_MS[i11], 667)) * 250.0f;
            aVar.f35696a += this.f35631e.getInterpolation(b(i10, DELAY_TO_COLLAPSE_IN_MS[i11], 667)) * 250.0f;
        }
        float f11 = aVar.f35696a;
        float f12 = aVar.f35697b;
        aVar.f35696a = (f11 + ((f12 - f11) * this.f35635i)) / 360.0f;
        aVar.f35697b = f12 / 360.0f;
    }
}
