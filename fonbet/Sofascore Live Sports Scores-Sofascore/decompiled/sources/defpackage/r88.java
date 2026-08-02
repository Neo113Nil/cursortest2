package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class r88 {
    public xah a;
    public q88 b;
    public RippleDrawable c;
    public iz1 d;
    public RippleDrawable e;
    public boolean f;
    public float h;
    public float i;
    public float j;
    public int k;
    public StateListAnimator l;
    public Animator m;
    public cwc n;
    public cwc o;
    public int q;
    public final FloatingActionButton s;
    public final t9d t;
    public static final qq7 y = e80.c;
    public static final int z = R.attr.motionDurationLong2;
    public static final int A = R.attr.motionEasingEmphasizedInterpolator;
    public static final int B = R.attr.motionDurationMedium1;
    public static final int C = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] D = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    public static final int[] E = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] F = {android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] G = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    public static final int[] H = {android.R.attr.state_enabled};
    public static final int[] I = new int[0];
    public boolean g = true;
    public float p = 1.0f;
    public int r = 0;
    public final Rect u = new Rect();
    public final RectF v = new RectF();
    public final RectF w = new RectF();
    public final Matrix x = new Matrix();

    public r88(FloatingActionButton floatingActionButton, t9d t9dVar) {
        this.s = floatingActionButton;
        this.t = t9dVar;
    }

    public final void a(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.s.getDrawable();
        if (drawable == null || this.q == 0) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF = this.v;
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intrinsicWidth, intrinsicHeight);
        float f2 = this.q;
        RectF rectF2 = this.w;
        rectF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f3 = this.q / 2.0f;
        matrix.postScale(f, f, f3, f3);
    }

    public final AnimatorSet b(cwc cwcVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f};
        FloatingActionButton floatingActionButton = this.s;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        cwcVar.f("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f2);
        cwcVar.f("scale").a(ofFloat2);
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            ofFloat2.setEvaluator(new p88());
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f2);
        cwcVar.f("scale").a(ofFloat3);
        if (i == 26) {
            ofFloat3.setEvaluator(new p88());
        }
        arrayList.add(ofFloat3);
        Matrix matrix = this.x;
        a(f3, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(floatingActionButton, new zs9(), new o88(this), new Matrix(matrix));
        cwcVar.f("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        zm2.B(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(final float f, final float f2, final float f3, int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        FloatingActionButton floatingActionButton = this.s;
        final float alpha = floatingActionButton.getAlpha();
        final float scaleX = floatingActionButton.getScaleX();
        final float scaleY = floatingActionButton.getScaleY();
        final float f4 = this.p;
        final Matrix matrix = new Matrix(this.x);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: m88
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r88 r88Var = r88.this;
                FloatingActionButton floatingActionButton2 = r88Var.s;
                floatingActionButton2.setAlpha(e80.b(alpha, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.2f, floatValue));
                float f5 = scaleX;
                float f6 = f2;
                floatingActionButton2.setScaleX(e80.a(f5, f6, floatValue));
                floatingActionButton2.setScaleY(e80.a(scaleY, f6, floatValue));
                float f7 = f4;
                float f8 = f3;
                r88Var.p = e80.a(f7, f8, floatValue);
                float a = e80.a(f7, f8, floatValue);
                Matrix matrix2 = matrix;
                r88Var.a(a, matrix2);
                floatingActionButton2.setImageMatrix(matrix2);
            }
        });
        arrayList.add(ofFloat);
        zm2.B(animatorSet, arrayList);
        animatorSet.setDuration(x2a.M(floatingActionButton.getContext(), i, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(yfa.E(floatingActionButton.getContext(), i2, e80.b));
        return animatorSet;
    }

    public final AnimatorSet d(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        FloatingActionButton floatingActionButton = this.s;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(y);
        return animatorSet;
    }

    public final void e(float f, float f2, float f3) {
        FloatingActionButton floatingActionButton = this.s;
        if (floatingActionButton.getStateListAnimator() == this.l) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(D, d(f, f3));
            stateListAnimator.addState(E, d(f, f2));
            stateListAnimator.addState(F, d(f, f2));
            stateListAnimator.addState(G, d(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L));
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(y);
            stateListAnimator.addState(H, animatorSet);
            stateListAnimator.addState(I, d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            this.l = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (((FloatingActionButton) this.t.a).k || (this.f && floatingActionButton.getSizeDimension() < this.k)) {
            h();
        }
    }

    public final void g(xah xahVar) {
        this.a = xahVar;
        q88 q88Var = this.b;
        if (q88Var != null) {
            q88Var.setShapeAppearanceModel(xahVar);
        }
        Drawable.Callback callback = this.c;
        if (callback instanceof ach) {
            ((ach) callback).setShapeAppearanceModel(xahVar);
        }
        iz1 iz1Var = this.d;
        if (iz1Var != null) {
            iz1Var.o = xahVar;
            iz1Var.invalidateSelf();
        }
    }

    public final void h() {
        t9d t9dVar = this.t;
        FloatingActionButton floatingActionButton = (FloatingActionButton) t9dVar.a;
        boolean z2 = floatingActionButton.k;
        boolean z3 = this.f;
        Rect rect = this.u;
        FloatingActionButton floatingActionButton2 = this.s;
        if (z2) {
            int max = z3 ? Math.max((this.k - floatingActionButton2.getSizeDimension()) / 2, 0) : 0;
            int max2 = Math.max(max, (int) Math.ceil(this.g ? floatingActionButton2.getElevation() + this.j : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            int max3 = Math.max(max, (int) Math.ceil(r2 * 1.5f));
            rect.set(max2, max3, max2, max3);
        } else {
            if (z3) {
                int sizeDimension = floatingActionButton2.getSizeDimension();
                int i = this.k;
                if (sizeDimension < i) {
                    int sizeDimension2 = (i - floatingActionButton2.getSizeDimension()) / 2;
                    rect.set(sizeDimension2, sizeDimension2, sizeDimension2, sizeDimension2);
                }
            }
            rect.set(0, 0, 0, 0);
        }
        l4a.j(this.e, "Didn't initialize content background");
        if (((FloatingActionButton) t9dVar.a).k || (this.f && floatingActionButton2.getSizeDimension() < this.k)) {
            super/*android.view.View*/.setBackgroundDrawable(new InsetDrawable((Drawable) this.e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            RippleDrawable rippleDrawable = this.e;
            if (rippleDrawable != null) {
                super/*android.view.View*/.setBackgroundDrawable(rippleDrawable);
            }
        }
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        floatingActionButton.l.set(i2, i3, i4, i5);
        int i6 = floatingActionButton.i;
        floatingActionButton.setPadding(i2 + i6, i3 + i6, i4 + i6, i5 + i6);
    }

    public final void f() {
    }
}
