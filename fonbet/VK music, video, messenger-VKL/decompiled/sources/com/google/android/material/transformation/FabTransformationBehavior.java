package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$id;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.WeakHashMap;
import xsna.aec;
import xsna.ak3;
import xsna.b0u0;
import xsna.cac;
import xsna.cec;
import xsna.dlp0;
import xsna.dpj0;
import xsna.elp0;
import xsna.iut0;
import xsna.jgz;
import xsna.mb30;
import xsna.nr2;
import xsna.pjo;
import xsna.rb30;
import xsna.rq2;
import xsna.zdc;
import xsna.zjq;

@Deprecated
/* loaded from: classes13.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect d;
    public final RectF e;
    public final RectF f;
    public final int[] g;
    public float h;
    public float i;

    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean b;
        public final /* synthetic */ View c;
        public final /* synthetic */ View d;

        public a(View view, View view2, boolean z) {
            this.b = z;
            this.c = view;
            this.d = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.b) {
                return;
            }
            this.c.setVisibility(4);
            View view = this.d;
            view.setAlpha(1.0f);
            view.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.b) {
                this.c.setVisibility(0);
                View view = this.d;
                view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                view.setVisibility(4);
            }
        }
    }

    public static class b {

        @Nullable
        public mb30 a;
        public jgz b;
    }

    public FabTransformationBehavior() {
        this.d = new Rect();
        this.e = new RectF();
        this.f = new RectF();
        this.g = new int[2];
    }

    @NonNull
    public static Pair F(float f, float f2, boolean z, @NonNull b bVar) {
        rb30 d;
        rb30 d2;
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            d = bVar.a.d("translationXLinear");
            d2 = bVar.a.d("translationYLinear");
        } else if ((!z || f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && (z || f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            d = bVar.a.d("translationXCurveDownwards");
            d2 = bVar.a.d("translationYCurveDownwards");
        } else {
            d = bVar.a.d("translationXCurveUpwards");
            d2 = bVar.a.d("translationYCurveUpwards");
        }
        return new Pair(d, d2);
    }

    public static float I(@NonNull b bVar, @NonNull rb30 rb30Var, float f) {
        long j = rb30Var.a;
        long j2 = rb30Var.b;
        rb30 d = bVar.a.d("expansion");
        return rq2.a(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rb30Var.b().getInterpolation((((d.a + d.b) + 17) - j) / j2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03cd A[LOOP:0: B:61:0x03cb->B:62:0x03cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019f  */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AnimatorSet E(@NonNull View view, @NonNull View view2, boolean z, boolean z2) {
        ObjectAnimator ofFloat;
        ArrayList arrayList;
        float f;
        ObjectAnimator ofFloat2;
        ObjectAnimator ofFloat3;
        ArrayList arrayList2;
        boolean z3;
        AnimatorSet animatorSet;
        int i;
        int size;
        int i2;
        ObjectAnimator ofFloat4;
        ObjectAnimator ofInt;
        ObjectAnimator ofInt2;
        b K = K(view2.getContext(), z);
        if (z) {
            this.h = view.getTranslationX();
            this.i = view.getTranslationY();
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        float elevation = view2.getElevation() - view.getElevation();
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-elevation);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        K.a.d("elevation").a(ofFloat);
        arrayList3.add(ofFloat);
        float G = G(view, view2, K.b);
        float H = H(view, view2, K.b);
        Pair F = F(G, H, z, K);
        rb30 rb30Var = (rb30) F.first;
        rb30 rb30Var2 = (rb30) F.second;
        RectF rectF = this.f;
        Rect rect = this.d;
        RectF rectF2 = this.e;
        if (z) {
            f = 0.0f;
            if (!z2) {
                view2.setTranslationX(-G);
                view2.setTranslationY(-H);
            }
            arrayList = arrayList4;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            float I = I(K, rb30Var, -G);
            float I2 = I(K, rb30Var2, -H);
            view2.getWindowVisibleDisplayFrame(rect);
            rectF2.set(rect);
            J(view2, rectF);
            rectF.offset(I, I2);
            rectF.intersect(rectF2);
            rectF2.set(rectF);
            ofFloat3 = ofFloat6;
            ofFloat2 = ofFloat5;
        } else {
            arrayList = arrayList4;
            f = 0.0f;
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -G);
            ofFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -H);
        }
        rb30Var.a(ofFloat2);
        rb30Var2.a(ofFloat3);
        arrayList3.add(ofFloat2);
        arrayList3.add(ofFloat3);
        float width = rectF2.width();
        float height = rectF2.height();
        float G2 = G(view, view2, K.b);
        float H2 = H(view, view2, K.b);
        Pair F2 = F(G2, H2, z, K);
        rb30 rb30Var3 = (rb30) F2.first;
        rb30 rb30Var4 = (rb30) F2.second;
        Property property = View.TRANSLATION_X;
        if (!z) {
            G2 = this.h;
        }
        float f2 = H2;
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, G2);
        Property property2 = View.TRANSLATION_Y;
        if (!z) {
            f2 = this.i;
        }
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, f2);
        rb30Var3.a(ofFloat7);
        rb30Var4.a(ofFloat8);
        arrayList3.add(ofFloat7);
        arrayList3.add(ofFloat8);
        boolean z4 = view2 instanceof cec;
        if (z4 && (view instanceof ImageView)) {
            cec cecVar = (cec) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    ofInt2 = ObjectAnimator.ofInt(drawable, pjo.a, 0);
                } else {
                    ofInt2 = ObjectAnimator.ofInt(drawable, pjo.a, 255);
                }
                ofInt2.addUpdateListener(new com.google.android.material.transformation.a(view2));
                K.a.d("iconFade").a(ofInt2);
                arrayList3.add(ofInt2);
                com.google.android.material.transformation.b bVar = new com.google.android.material.transformation.b(cecVar, drawable);
                arrayList2 = arrayList;
                arrayList2.add(bVar);
                if (z4) {
                    z3 = z4;
                } else {
                    cec cecVar2 = (cec) view2;
                    jgz jgzVar = K.b;
                    J(view, rectF2);
                    rectF2.offset(this.h, this.i);
                    J(view2, rectF);
                    rectF.offset(-G(view, view2, jgzVar), f);
                    float centerX = rectF2.centerX() - rectF.left;
                    jgz jgzVar2 = K.b;
                    J(view, rectF2);
                    z3 = z4;
                    rectF2.offset(this.h, this.i);
                    J(view2, rectF);
                    rectF.offset(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -H(view, view2, jgzVar2));
                    float centerY = rectF2.centerY() - rectF.top;
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    if (floatingActionButton.isLaidOut()) {
                        rect.set(0, 0, floatingActionButton.getWidth(), floatingActionButton.getHeight());
                        floatingActionButton.j(rect);
                    }
                    float width2 = rect.width() / 2.0f;
                    rb30 d = K.a.d("expansion");
                    if (z) {
                        if (!z2) {
                            cecVar2.setRevealInfo(new cec.d(centerX, centerY, width2));
                        }
                        if (z2) {
                            width2 = cecVar2.getRevealInfo().c;
                        }
                        float h = zjq.h(centerX, centerY, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        float h2 = zjq.h(centerX, centerY, width, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        float h3 = zjq.h(centerX, centerY, width, height);
                        float h4 = zjq.h(centerX, centerY, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, height);
                        if (h > h2 && h > h3 && h > h4) {
                            h3 = h;
                        } else if (h2 > h3 && h2 > h4) {
                            h3 = h2;
                        } else if (h3 <= h4) {
                            h3 = h4;
                        }
                        animatorSet = aec.a(cecVar2, centerX, centerY, h3);
                        animatorSet.addListener(new c(cecVar2));
                        long j = d.a;
                        int i3 = (int) centerX;
                        int i4 = (int) centerY;
                        if (j > 0) {
                            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i3, i4, width2, width2);
                            createCircularReveal.setStartDelay(0L);
                            createCircularReveal.setDuration(j);
                            arrayList3.add(createCircularReveal);
                        }
                    } else {
                        float f3 = cecVar2.getRevealInfo().c;
                        AnimatorSet a2 = aec.a(cecVar2, centerX, centerY, width2);
                        long j2 = d.a;
                        int i5 = (int) centerX;
                        int i6 = (int) centerY;
                        if (j2 > 0) {
                            Animator createCircularReveal2 = ViewAnimationUtils.createCircularReveal(view2, i5, i6, f3, f3);
                            createCircularReveal2.setStartDelay(0L);
                            createCircularReveal2.setDuration(j2);
                            arrayList3.add(createCircularReveal2);
                        }
                        long j3 = d.a;
                        long j4 = d.b;
                        dpj0<String, rb30> dpj0Var = K.a.a;
                        int i7 = dpj0Var.d;
                        long j5 = 0;
                        int i8 = 0;
                        while (i8 < i7) {
                            dpj0<String, rb30> dpj0Var2 = dpj0Var;
                            rb30 j6 = dpj0Var.j(i8);
                            j5 = Math.max(j5, j6.a + j6.b);
                            i8++;
                            dpj0Var = dpj0Var2;
                            j3 = j3;
                        }
                        long j7 = j3 + j4;
                        if (j7 < j5) {
                            Animator createCircularReveal3 = ViewAnimationUtils.createCircularReveal(view2, i5, i6, width2, width2);
                            createCircularReveal3.setStartDelay(j7);
                            createCircularReveal3.setDuration(j5 - j7);
                            arrayList3.add(createCircularReveal3);
                        }
                        animatorSet = a2;
                    }
                    d.a(animatorSet);
                    arrayList3.add(animatorSet);
                    arrayList2.add(new zdc(cecVar2));
                }
                if (z3) {
                    cec cecVar3 = (cec) view2;
                    WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                    ColorStateList backgroundTintList = view.getBackgroundTintList();
                    int colorForState = backgroundTintList != null ? backgroundTintList.getColorForState(view.getDrawableState(), backgroundTintList.getDefaultColor()) : 0;
                    int i9 = 16777215 & colorForState;
                    if (z) {
                        if (!z2) {
                            cecVar3.setCircularRevealScrimColor(colorForState);
                        }
                        ofInt = ObjectAnimator.ofInt(cecVar3, cec.c.a, i9);
                    } else {
                        ofInt = ObjectAnimator.ofInt(cecVar3, cec.c.a, colorForState);
                    }
                    ofInt.setEvaluator(ak3.a);
                    K.a.d("color").a(ofInt);
                    arrayList3.add(ofInt);
                }
                if (view2 instanceof ViewGroup) {
                    View findViewById = view2.findViewById(R$id.mtrl_child_content_container);
                    ViewGroup viewGroup = null;
                    if (findViewById != null) {
                        if (findViewById instanceof ViewGroup) {
                            viewGroup = (ViewGroup) findViewById;
                        }
                    } else if ((view2 instanceof elp0) || (view2 instanceof dlp0)) {
                        View childAt = ((ViewGroup) view2).getChildAt(0);
                        if (childAt instanceof ViewGroup) {
                            viewGroup = (ViewGroup) childAt;
                        }
                    } else {
                        viewGroup = (ViewGroup) view2;
                    }
                    if (viewGroup != null) {
                        if (z) {
                            if (!z2) {
                                cac.a.set(viewGroup, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                            }
                            i = 0;
                            ofFloat4 = ObjectAnimator.ofFloat(viewGroup, cac.a, 1.0f);
                        } else {
                            i = 0;
                            ofFloat4 = ObjectAnimator.ofFloat(viewGroup, cac.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        }
                        K.a.d("contentFade").a(ofFloat4);
                        arrayList3.add(ofFloat4);
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        nr2.E(animatorSet2, arrayList3);
                        animatorSet2.addListener(new a(view2, view, z));
                        size = arrayList2.size();
                        for (i2 = i; i2 < size; i2++) {
                            animatorSet2.addListener((Animator.AnimatorListener) arrayList2.get(i2));
                        }
                        return animatorSet2;
                    }
                }
                i = 0;
                AnimatorSet animatorSet22 = new AnimatorSet();
                nr2.E(animatorSet22, arrayList3);
                animatorSet22.addListener(new a(view2, view, z));
                size = arrayList2.size();
                while (i2 < size) {
                }
                return animatorSet22;
            }
        }
        arrayList2 = arrayList;
        if (z4) {
        }
        if (z3) {
        }
        if (view2 instanceof ViewGroup) {
        }
        i = 0;
        AnimatorSet animatorSet222 = new AnimatorSet();
        nr2.E(animatorSet222, arrayList3);
        animatorSet222.addListener(new a(view2, view, z));
        size = arrayList2.size();
        while (i2 < size) {
        }
        return animatorSet222;
    }

    public final float G(@NonNull View view, @NonNull View view2, @NonNull jgz jgzVar) {
        RectF rectF = this.e;
        J(view, rectF);
        rectF.offset(this.h, this.i);
        RectF rectF2 = this.f;
        J(view2, rectF2);
        jgzVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final float H(@NonNull View view, @NonNull View view2, @NonNull jgz jgzVar) {
        RectF rectF = this.e;
        J(view, rectF);
        rectF.offset(this.h, this.i);
        RectF rectF2 = this.f;
        J(view2, rectF2);
        jgzVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void J(@NonNull View view, RectF rectF) {
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.g);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract b K(Context context, boolean z);

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(@NonNull View view, @NonNull View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void i(@NonNull CoordinatorLayout.f fVar) {
        if (fVar.h == 0) {
            fVar.h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Rect();
        this.e = new RectF();
        this.f = new RectF();
        this.g = new int[2];
    }
}
