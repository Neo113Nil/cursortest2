package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$integer;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.cuk0;
import xsna.hlq;
import xsna.jkw;
import xsna.kn10;
import xsna.l6j0;
import xsna.m18;
import xsna.mb30;
import xsna.nr2;
import xsna.obr;
import xsna.olg0;
import xsna.rq2;
import xsna.tb30;
import xsna.u11;
import xsna.yqr;
import xsna.zqr;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes13.dex */
public class d {
    public static final hlq C = rq2.c;
    public static final int D = R$attr.motionDurationLong2;
    public static final int E = R$attr.motionEasingEmphasizedInterpolator;
    public static final int F = R$attr.motionDurationMedium1;
    public static final int G = R$attr.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] H = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] I = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    public static final int[] J = {R.attr.state_focused, R.attr.state_enabled};
    public static final int[] K = {R.attr.state_hovered, R.attr.state_enabled};
    public static final int[] L = {R.attr.state_enabled};
    public static final int[] M = new int[0];

    @Nullable
    public yqr B;

    @Nullable
    public com.google.android.material.shape.a a;

    @Nullable
    public MaterialShapeDrawable b;

    @Nullable
    public Drawable c;

    @Nullable
    public m18 d;

    @Nullable
    public LayerDrawable e;
    public boolean f;
    public float h;
    public float i;
    public float j;
    public int k;

    @Nullable
    public Animator l;

    @Nullable
    public mb30 m;

    @Nullable
    public mb30 n;
    public float o;
    public int q;
    public ArrayList<Animator.AnimatorListener> s;
    public ArrayList<Animator.AnimatorListener> t;
    public ArrayList<f> u;
    public final FloatingActionButton v;
    public final FloatingActionButton.b w;
    public boolean g = true;
    public float p = 1.0f;
    public int r = 0;
    public final Rect x = new Rect();
    public final RectF y = new RectF();
    public final RectF z = new RectF();
    public final Matrix A = new Matrix();

    /* compiled from: FloatingActionButtonImpl.java */
    public class a extends kn10 {
        public a() {
        }

        @Override // android.animation.TypeEvaluator
        public final Matrix evaluate(float f, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
            d.this.p = f;
            float[] fArr = this.a;
            matrix.getValues(fArr);
            float[] fArr2 = this.b;
            matrix2.getValues(fArr2);
            for (int i = 0; i < 9; i++) {
                float f2 = fArr2[i];
                float f3 = fArr[i];
                fArr2[i] = u11.b(f2, f3, f, f3);
            }
            Matrix matrix3 = this.c;
            matrix3.setValues(fArr2);
            return matrix3;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;
        public final /* synthetic */ float e;
        public final /* synthetic */ float f;
        public final /* synthetic */ float g;
        public final /* synthetic */ float h;
        public final /* synthetic */ Matrix i;

        public b(float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
            this.f = f5;
            this.g = f6;
            this.h = f7;
            this.i = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            d dVar = d.this;
            dVar.v.setAlpha(rq2.b(this.b, this.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.2f, floatValue));
            FloatingActionButton floatingActionButton = dVar.v;
            float f = this.d;
            float f2 = this.e;
            floatingActionButton.setScaleX(rq2.a(f, f2, floatValue));
            dVar.v.setScaleY(rq2.a(this.f, f2, floatValue));
            float f3 = this.g;
            float f4 = this.h;
            dVar.p = rq2.a(f3, f4, floatValue);
            float a = rq2.a(f3, f4, floatValue);
            Matrix matrix = this.i;
            dVar.a(a, matrix);
            dVar.v.setImageMatrix(matrix);
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    public class c extends i {
        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.d$d, reason: collision with other inner class name */
    public class C0121d extends i {
        public final /* synthetic */ zqr f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0121d(zqr zqrVar) {
            super(zqrVar);
            this.f = zqrVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            zqr zqrVar = this.f;
            return zqrVar.h + zqrVar.i;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    public class e extends i {
        public final /* synthetic */ zqr f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(zqr zqrVar) {
            super(zqrVar);
            this.f = zqrVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            zqr zqrVar = this.f;
            return zqrVar.h + zqrVar.j;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    public interface f {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl.java */
    public interface g {
    }

    /* compiled from: FloatingActionButtonImpl.java */
    public class h extends i {
        public final /* synthetic */ zqr f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(zqr zqrVar) {
            super(zqrVar);
            this.f = zqrVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            return this.f.h;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    public abstract class i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public boolean b;
        public float c;
        public float d;
        public final /* synthetic */ zqr e;

        public i(zqr zqrVar) {
            this.e = zqrVar;
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            float f = (int) this.d;
            MaterialShapeDrawable materialShapeDrawable = this.e.b;
            if (materialShapeDrawable != null) {
                materialShapeDrawable.setElevation(f);
            }
            this.b = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            boolean z = this.b;
            zqr zqrVar = this.e;
            if (!z) {
                MaterialShapeDrawable materialShapeDrawable = zqrVar.b;
                this.c = materialShapeDrawable == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : materialShapeDrawable.getElevation();
                this.d = a();
                this.b = true;
            }
            float f = this.c;
            float animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * (this.d - f)) + f);
            MaterialShapeDrawable materialShapeDrawable2 = zqrVar.b;
            if (materialShapeDrawable2 != null) {
                materialShapeDrawable2.setElevation(animatedFraction);
            }
        }
    }

    public d(FloatingActionButton floatingActionButton, FloatingActionButton.b bVar) {
        this.v = floatingActionButton;
        this.w = bVar;
        cuk0 cuk0Var = new cuk0();
        zqr zqrVar = (zqr) this;
        cuk0Var.a(H, d(new e(zqrVar)));
        cuk0Var.a(I, d(new C0121d(zqrVar)));
        cuk0Var.a(J, d(new C0121d(zqrVar)));
        cuk0Var.a(K, d(new C0121d(zqrVar)));
        cuk0Var.a(L, d(new h(zqrVar)));
        cuk0Var.a(M, d(new c(zqrVar)));
        this.o = floatingActionButton.getRotation();
    }

    @NonNull
    public static ValueAnimator d(@NonNull i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(C);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        return valueAnimator;
    }

    public final void a(float f2, @NonNull Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.v.getDrawable();
        if (drawable == null || this.q == 0) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF = this.y;
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intrinsicWidth, intrinsicHeight);
        float f3 = this.q;
        RectF rectF2 = this.z;
        rectF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, f3);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f4 = this.q / 2.0f;
        matrix.postScale(f2, f2, f4, f4);
    }

    @NonNull
    public final AnimatorSet b(@NonNull mb30 mb30Var, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f2};
        FloatingActionButton floatingActionButton = this.v;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        mb30Var.d("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f3);
        mb30Var.d("scale").a(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f3);
        mb30Var.d("scale").a(ofFloat3);
        arrayList.add(ofFloat3);
        Matrix matrix = this.A;
        a(f4, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(floatingActionButton, new jkw(), new a(), new Matrix(matrix));
        mb30Var.d("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        nr2.E(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f2, float f3, float f4, int i2, int i3) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        FloatingActionButton floatingActionButton = this.v;
        ofFloat.addUpdateListener(new b(floatingActionButton.getAlpha(), f2, floatingActionButton.getScaleX(), f3, floatingActionButton.getScaleY(), this.p, f4, new Matrix(this.A)));
        arrayList.add(ofFloat);
        nr2.E(animatorSet, arrayList);
        animatorSet.setDuration(tb30.c(i2, floatingActionButton.getContext().getResources().getInteger(R$integer.material_motion_duration_long_1), floatingActionButton.getContext()));
        animatorSet.setInterpolator(tb30.d(floatingActionButton.getContext(), i3, rq2.b));
        return animatorSet;
    }

    public float e() {
        throw null;
    }

    public void f(@NonNull Rect rect) {
        int max = this.f ? Math.max((this.k - this.v.getSizeDimension()) / 2, 0) : 0;
        int max2 = Math.max(max, (int) Math.ceil(this.g ? e() + this.j : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        int max3 = Math.max(max, (int) Math.ceil(r0 * 1.5f));
        rect.set(max2, max3, max2, max3);
    }

    public void g(ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, ColorStateList colorStateList2, int i2) {
        throw null;
    }

    public void h() {
        throw null;
    }

    public void i() {
        throw null;
    }

    public void j(int[] iArr) {
        throw null;
    }

    public void k(float f2, float f3, float f4) {
        throw null;
    }

    public final void l() {
        ArrayList<f> arrayList = this.u;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            if (it.hasNext()) {
                it.next().b();
                throw null;
            }
        }
    }

    public void m(@Nullable ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setTintList(olg0.c(colorStateList));
        }
    }

    public final void n(@NonNull com.google.android.material.shape.a aVar) {
        this.a = aVar;
        MaterialShapeDrawable materialShapeDrawable = this.b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(aVar);
        }
        Object obj = this.c;
        if (obj instanceof l6j0) {
            ((l6j0) obj).setShapeAppearanceModel(aVar);
        }
        m18 m18Var = this.d;
        if (m18Var != null) {
            m18Var.o = aVar;
            m18Var.invalidateSelf();
        }
    }

    public boolean o() {
        throw null;
    }

    public void p() {
        throw null;
    }

    public final void q() {
        Rect rect = this.x;
        f(rect);
        obr.e(this.e, "Didn't initialize content background");
        boolean o = o();
        FloatingActionButton.b bVar = this.w;
        if (o) {
            super/*android.view.View*/.setBackgroundDrawable(new InsetDrawable((Drawable) this.e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            LayerDrawable layerDrawable = this.e;
            if (layerDrawable != null) {
                super/*android.view.View*/.setBackgroundDrawable(layerDrawable);
            } else {
                bVar.getClass();
            }
        }
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        FloatingActionButton floatingActionButton = FloatingActionButton.this;
        floatingActionButton.m.set(i2, i3, i4, i5);
        int i6 = floatingActionButton.j;
        floatingActionButton.setPadding(i2 + i6, i3 + i6, i4 + i6, i5 + i6);
    }
}
