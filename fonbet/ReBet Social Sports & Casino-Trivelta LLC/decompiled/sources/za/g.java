package za;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C2035b;
import ja.AbstractC5104a;

/* loaded from: classes3.dex */
public class g extends AbstractC6950a {

    /* renamed from: g, reason: collision with root package name */
    public final float f68656g;

    /* renamed from: h, reason: collision with root package name */
    public final float f68657h;

    /* renamed from: i, reason: collision with root package name */
    public final float f68658i;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f68659a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f68660b;

        public a(boolean z10, int i10) {
            this.f68659a = z10;
            this.f68660b = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g.this.f68641b.setTranslationX(0.0f);
            g.this.k(0.0f, this.f68659a, this.f68660b);
        }
    }

    public g(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f68656g = resources.getDimension(ia.e.f48372v);
        this.f68657h = resources.getDimension(ia.e.f48370u);
        this.f68658i = resources.getDimension(ia.e.f48374w);
    }

    public void f() {
        if (super.b() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f68641b, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f68641b, (Property<View, Float>) View.SCALE_Y, 1.0f));
        View view = this.f68641b;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.f68644e);
        animatorSet.start();
    }

    public final boolean g(int i10, int i11) {
        return (Gravity.getAbsoluteGravity(i10, this.f68641b.getLayoutDirection()) & i11) == i11;
    }

    public void h(C2035b c2035b, int i10, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        boolean z10 = c2035b.b() == 0;
        boolean g10 = g(i10, 3);
        float width = (this.f68641b.getWidth() * this.f68641b.getScaleX()) + i(g10);
        View view = this.f68641b;
        Property property = View.TRANSLATION_X;
        if (g10) {
            width = -width;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, width);
        if (animatorUpdateListener != null) {
            ofFloat.addUpdateListener(animatorUpdateListener);
        }
        ofFloat.setInterpolator(new T0.b());
        ofFloat.setDuration(AbstractC5104a.c(this.f68642c, this.f68643d, c2035b.a()));
        ofFloat.addListener(new a(z10, i10));
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.start();
    }

    public final int i(boolean z10) {
        ViewGroup.LayoutParams layoutParams = this.f68641b.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }

    public void j(C2035b c2035b) {
        super.d(c2035b);
    }

    public void k(float f10, boolean z10, int i10) {
        float a10 = a(f10);
        boolean g10 = g(i10, 3);
        boolean z11 = z10 == g10;
        int width = this.f68641b.getWidth();
        int height = this.f68641b.getHeight();
        float f11 = width;
        if (f11 > 0.0f) {
            float f12 = height;
            if (f12 <= 0.0f) {
                return;
            }
            float f13 = this.f68656g / f11;
            float f14 = this.f68657h / f11;
            float f15 = this.f68658i / f12;
            View view = this.f68641b;
            if (g10) {
                f11 = 0.0f;
            }
            view.setPivotX(f11);
            if (!z11) {
                f14 = -f13;
            }
            float a11 = AbstractC5104a.a(0.0f, f14, a10);
            float f16 = a11 + 1.0f;
            float a12 = 1.0f - AbstractC5104a.a(0.0f, f15, a10);
            if (Float.isNaN(f16) || Float.isNaN(a12)) {
                return;
            }
            this.f68641b.setScaleX(f16);
            this.f68641b.setScaleY(a12);
            View view2 = this.f68641b;
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    childAt.setPivotX(g10 ? (width - childAt.getRight()) + childAt.getWidth() : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f17 = z11 ? 1.0f - a11 : 1.0f;
                    float f18 = a12 != 0.0f ? (f16 / a12) * f17 : 1.0f;
                    if (!Float.isNaN(f17) && !Float.isNaN(f18)) {
                        childAt.setScaleX(f17);
                        childAt.setScaleY(f18);
                    }
                }
            }
        }
    }

    public void l(C2035b c2035b, int i10) {
        if (super.e(c2035b) == null) {
            return;
        }
        k(c2035b.a(), c2035b.b() == 0, i10);
    }
}
