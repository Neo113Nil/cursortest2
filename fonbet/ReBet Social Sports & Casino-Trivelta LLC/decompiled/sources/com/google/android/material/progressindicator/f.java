package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import com.google.android.material.progressindicator.l;
import io.agora.rtc2.video.FaceShapeAreaOptions;
import ja.AbstractC5104a;
import ja.C5106c;
import ya.AbstractC6866a;

/* loaded from: classes3.dex */
public final class f extends m {

    /* renamed from: c, reason: collision with root package name */
    public ObjectAnimator f35642c;

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f35643d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f35644e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.android.material.progressindicator.c f35645f;

    /* renamed from: g, reason: collision with root package name */
    public int f35646g;

    /* renamed from: h, reason: collision with root package name */
    public float f35647h;

    /* renamed from: i, reason: collision with root package name */
    public float f35648i;

    /* renamed from: j, reason: collision with root package name */
    public androidx.vectordrawable.graphics.drawable.b f35649j;

    /* renamed from: k, reason: collision with root package name */
    public static final TimeInterpolator f35639k = AbstractC5104a.f53859b;
    private static final int[] DELAY_SPINS_IN_MS = {0, 1500, 3000, 4500};
    private static final float[] END_FRACTION_RANGE = {0.1f, 0.87f};

    /* renamed from: l, reason: collision with root package name */
    public static final Property f35640l = new c(Float.class, "animationFraction");

    /* renamed from: m, reason: collision with root package name */
    public static final Property f35641m = new d(Float.class, "completeEndFraction");

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            f fVar = f.this;
            fVar.f35646g = (fVar.f35646g + f.DELAY_SPINS_IN_MS.length) % f.this.f35645f.indicatorColors.length;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            f.this.a();
            f fVar = f.this;
            androidx.vectordrawable.graphics.drawable.b bVar = fVar.f35649j;
            if (bVar != null) {
                bVar.b(fVar.f35706a);
            }
        }
    }

    public class c extends Property {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(f fVar) {
            return Float.valueOf(fVar.p());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(f fVar, Float f10) {
            fVar.u(f10.floatValue());
        }
    }

    public class d extends Property {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(f fVar) {
            return Float.valueOf(fVar.q());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(f fVar, Float f10) {
            fVar.v(f10.floatValue());
        }
    }

    public f(Context context, g gVar) {
        super(1);
        this.f35646g = 0;
        this.f35649j = null;
        this.f35645f = gVar;
        this.f35644e = za.h.g(context, ia.c.f48231e0, f35639k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float p() {
        return this.f35647h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float q() {
        return this.f35648i;
    }

    private void r() {
        if (this.f35642c == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<f, Float>) f35640l, 0.0f, 1.0f);
            this.f35642c = ofFloat;
            ofFloat.setDuration((long) (this.f35645f.f35614m * 6000.0f));
            this.f35642c.setInterpolator(null);
            this.f35642c.setRepeatCount(-1);
            this.f35642c.addListener(new a());
        }
        if (this.f35643d == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<f, Float>) f35641m, 0.0f, 1.0f);
            this.f35643d = ofFloat2;
            ofFloat2.setDuration((long) (this.f35645f.f35614m * 500.0f));
            this.f35643d.addListener(new b());
        }
    }

    private void s(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = DELAY_SPINS_IN_MS;
            if (i11 >= iArr.length) {
                return;
            }
            float b10 = b(i10, iArr[i11], 100);
            if (b10 >= 0.0f && b10 <= 1.0f) {
                int i12 = i11 + this.f35646g;
                int[] iArr2 = this.f35645f.indicatorColors;
                int length = i12 % iArr2.length;
                int length2 = (length + 1) % iArr2.length;
                int i13 = iArr2[length];
                int i14 = iArr2[length2];
                ((l.a) this.f35707b.get(0)).f35698c = C5106c.b().evaluate(this.f35644e.getInterpolation(b10), Integer.valueOf(i13), Integer.valueOf(i14)).intValue();
                return;
            }
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(float f10) {
        this.f35648i = f10;
    }

    private void w() {
        r();
        this.f35642c.setDuration((long) (this.f35645f.f35614m * 6000.0f));
        this.f35643d.setDuration((long) (this.f35645f.f35614m * 500.0f));
    }

    private void x(int i10) {
        l.a aVar = (l.a) this.f35707b.get(0);
        float f10 = this.f35647h * 1080.0f;
        float f11 = 0.0f;
        for (int i11 : DELAY_SPINS_IN_MS) {
            f11 += this.f35644e.getInterpolation(b(i10, i11, FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION)) * 90.0f;
        }
        aVar.f35702g = f10 + f11;
        float interpolation = this.f35644e.getInterpolation(b(i10, 0, 3000)) - this.f35644e.getInterpolation(b(i10, 3000, 3000));
        aVar.f35696a = 0.0f;
        float[] fArr = END_FRACTION_RANGE;
        float c10 = AbstractC6866a.c(fArr[0], fArr[1], interpolation);
        aVar.f35697b = c10;
        float f12 = this.f35648i;
        if (f12 > 0.0f) {
            aVar.f35697b = c10 * (1.0f - f12);
        }
    }

    @Override // com.google.android.material.progressindicator.m
    public void a() {
        ObjectAnimator objectAnimator = this.f35642c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.m
    public void c() {
        w();
        t();
    }

    @Override // com.google.android.material.progressindicator.m
    public void d(androidx.vectordrawable.graphics.drawable.b bVar) {
        this.f35649j = bVar;
    }

    @Override // com.google.android.material.progressindicator.m
    public void f() {
        ObjectAnimator objectAnimator = this.f35643d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f35706a.isVisible()) {
            this.f35643d.start();
        } else {
            a();
        }
    }

    @Override // com.google.android.material.progressindicator.m
    public void g() {
        r();
        t();
        this.f35642c.start();
    }

    @Override // com.google.android.material.progressindicator.m
    public void h() {
        this.f35649j = null;
    }

    public void t() {
        this.f35646g = 0;
        ((l.a) this.f35707b.get(0)).f35698c = this.f35645f.indicatorColors[0];
        this.f35648i = 0.0f;
    }

    public void u(float f10) {
        this.f35647h = f10;
        int i10 = (int) (f10 * 6000.0f);
        x(i10);
        s(i10);
        this.f35706a.invalidateSelf();
    }
}
