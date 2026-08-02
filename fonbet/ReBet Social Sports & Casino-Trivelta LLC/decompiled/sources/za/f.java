package za;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C2035b;
import ja.AbstractC5104a;

/* loaded from: classes3.dex */
public class f extends AbstractC6950a {

    /* renamed from: g, reason: collision with root package name */
    public final float f68653g;

    /* renamed from: h, reason: collision with root package name */
    public final float f68654h;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.f68641b.setTranslationY(0.0f);
            f.this.k(0.0f);
        }
    }

    public f(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f68653g = resources.getDimension(ia.e.f48366s);
        this.f68654h = resources.getDimension(ia.e.f48368t);
    }

    public void f() {
        if (super.b() == null) {
            return;
        }
        Animator g10 = g();
        g10.setDuration(this.f68644e);
        g10.start();
    }

    public final Animator g() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f68641b, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f68641b, (Property<View, Float>) View.SCALE_Y, 1.0f));
        View view = this.f68641b;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new T0.b());
        return animatorSet;
    }

    public void h(C2035b c2035b, Animator.AnimatorListener animatorListener) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f68641b, (Property<View, Float>) View.TRANSLATION_Y, this.f68641b.getHeight() * this.f68641b.getScaleY());
        ofFloat.setInterpolator(new T0.b());
        ofFloat.setDuration(AbstractC5104a.c(this.f68642c, this.f68643d, c2035b.a()));
        ofFloat.addListener(new a());
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.start();
    }

    public void i(C2035b c2035b, Animator.AnimatorListener animatorListener) {
        Animator g10 = g();
        g10.setDuration(AbstractC5104a.c(this.f68642c, this.f68643d, c2035b.a()));
        if (animatorListener != null) {
            g10.addListener(animatorListener);
        }
        g10.start();
    }

    public void j(C2035b c2035b) {
        super.d(c2035b);
    }

    public void k(float f10) {
        float a10 = a(f10);
        float width = this.f68641b.getWidth();
        float height = this.f68641b.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f11 = this.f68653g / width;
        float f12 = this.f68654h / height;
        float a11 = 1.0f - AbstractC5104a.a(0.0f, f11, a10);
        float a12 = 1.0f - AbstractC5104a.a(0.0f, f12, a10);
        if (Float.isNaN(a11) || Float.isNaN(a12)) {
            return;
        }
        this.f68641b.setScaleX(a11);
        this.f68641b.setPivotY(height);
        this.f68641b.setScaleY(a12);
        View view = this.f68641b;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(a12 != 0.0f ? a11 / a12 : 1.0f);
            }
        }
    }

    public void l(C2035b c2035b) {
        if (super.e(c2035b) == null) {
            return;
        }
        k(c2035b.a());
    }
}
