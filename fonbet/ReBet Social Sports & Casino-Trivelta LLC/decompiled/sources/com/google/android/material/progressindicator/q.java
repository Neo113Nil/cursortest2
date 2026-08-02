package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import com.google.android.material.progressindicator.l;
import ia.AbstractC4539a;
import java.util.Iterator;
import s0.AbstractC6307a;

/* loaded from: classes3.dex */
public final class q extends m {

    /* renamed from: c, reason: collision with root package name */
    public ObjectAnimator f35730c;

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f35731d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.android.material.progressindicator.c f35732e;

    /* renamed from: f, reason: collision with root package name */
    public int f35733f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f35734g;

    /* renamed from: h, reason: collision with root package name */
    public float f35735h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.vectordrawable.graphics.drawable.b f35736i;
    private final Interpolator[] interpolatorArray;
    private static final int[] DURATION_TO_MOVE_SEGMENT_ENDS = {533, 567, 850, 750};
    private static final int[] DELAY_TO_MOVE_SEGMENT_ENDS = {1267, 1000, 333, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final Property f35729j = new c(Float.class, "animationFraction");

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            q qVar = q.this;
            qVar.f35733f = (qVar.f35733f + 1) % q.this.f35732e.indicatorColors.length;
            q.this.f35734g = true;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            q.this.a();
            q qVar = q.this;
            androidx.vectordrawable.graphics.drawable.b bVar = qVar.f35736i;
            if (bVar != null) {
                bVar.b(qVar.f35706a);
            }
        }
    }

    public class c extends Property {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(q qVar) {
            return Float.valueOf(qVar.n());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(q qVar, Float f10) {
            qVar.r(f10.floatValue());
        }
    }

    public q(Context context, r rVar) {
        super(2);
        this.f35733f = 0;
        this.f35736i = null;
        this.f35732e = rVar;
        this.interpolatorArray = new Interpolator[]{androidx.vectordrawable.graphics.drawable.d.a(context, AbstractC4539a.f48188a), androidx.vectordrawable.graphics.drawable.d.a(context, AbstractC4539a.f48189b), androidx.vectordrawable.graphics.drawable.d.a(context, AbstractC4539a.f48190c), androidx.vectordrawable.graphics.drawable.d.a(context, AbstractC4539a.f48191d)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float n() {
        return this.f35735h;
    }

    private void o() {
        if (this.f35730c == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<q, Float>) f35729j, 0.0f, 1.0f);
            this.f35730c = ofFloat;
            ofFloat.setDuration((long) (this.f35732e.f35614m * 1800.0f));
            this.f35730c.setInterpolator(null);
            this.f35730c.setRepeatCount(-1);
            this.f35730c.addListener(new a());
        }
        if (this.f35731d == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<q, Float>) f35729j, 1.0f);
            this.f35731d = ofFloat2;
            ofFloat2.setDuration((long) (this.f35732e.f35614m * 1800.0f));
            this.f35731d.setInterpolator(null);
            this.f35731d.addListener(new b());
        }
    }

    private void p() {
        if (this.f35734g) {
            Iterator it = this.f35707b.iterator();
            while (it.hasNext()) {
                ((l.a) it.next()).f35698c = this.f35732e.indicatorColors[this.f35733f];
            }
            this.f35734g = false;
        }
    }

    private void s() {
        o();
        this.f35730c.setDuration((long) (this.f35732e.f35614m * 1800.0f));
        this.f35731d.setDuration((long) (this.f35732e.f35614m * 1800.0f));
    }

    private void t(int i10) {
        for (int i11 = 0; i11 < this.f35707b.size(); i11++) {
            l.a aVar = (l.a) this.f35707b.get(i11);
            int[] iArr = DELAY_TO_MOVE_SEGMENT_ENDS;
            int i12 = i11 * 2;
            int i13 = iArr[i12];
            int[] iArr2 = DURATION_TO_MOVE_SEGMENT_ENDS;
            aVar.f35696a = AbstractC6307a.a(this.interpolatorArray[i12].getInterpolation(b(i10, i13, iArr2[i12])), 0.0f, 1.0f);
            int i14 = i12 + 1;
            aVar.f35697b = AbstractC6307a.a(this.interpolatorArray[i14].getInterpolation(b(i10, iArr[i14], iArr2[i14])), 0.0f, 1.0f);
        }
    }

    @Override // com.google.android.material.progressindicator.m
    public void a() {
        ObjectAnimator objectAnimator = this.f35730c;
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
        this.f35736i = bVar;
    }

    @Override // com.google.android.material.progressindicator.m
    public void f() {
        ObjectAnimator objectAnimator = this.f35731d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        a();
        if (this.f35706a.isVisible()) {
            this.f35731d.setFloatValues(this.f35735h, 1.0f);
            this.f35731d.setDuration((long) ((1.0f - this.f35735h) * 1800.0f));
            this.f35731d.start();
        }
    }

    @Override // com.google.android.material.progressindicator.m
    public void g() {
        o();
        q();
        this.f35730c.start();
    }

    @Override // com.google.android.material.progressindicator.m
    public void h() {
        this.f35736i = null;
    }

    public void q() {
        this.f35733f = 0;
        Iterator it = this.f35707b.iterator();
        while (it.hasNext()) {
            ((l.a) it.next()).f35698c = this.f35732e.indicatorColors[0];
        }
    }

    public void r(float f10) {
        this.f35735h = f10;
        t((int) (f10 * 1800.0f));
        p();
        this.f35706a.invalidateSelf();
    }
}
