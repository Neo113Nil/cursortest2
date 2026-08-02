package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.cwc;
import defpackage.dwc;
import defpackage.e80;
import defpackage.fm6;
import defpackage.fp4;
import defpackage.n2f;
import defpackage.ot2;
import defpackage.xs3;
import defpackage.zm2;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes3.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect c;
    public final RectF d;
    public final RectF e;
    public final int[] f;
    public float g;
    public float h;

    public FabTransformationBehavior() {
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }

    public static float B(fp4 fp4Var, dwc dwcVar, float f) {
        long j = dwcVar.a;
        long j2 = dwcVar.b;
        dwc f2 = ((cwc) fp4Var.b).f("expansion");
        return e80.a(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, dwcVar.b().getInterpolation((((f2.a + f2.b) + 17) - j) / j2));
    }

    public static Pair y(float f, float f2, boolean z, fp4 fp4Var) {
        dwc f3;
        dwc f4;
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f3 = ((cwc) fp4Var.b).f("translationXLinear");
            f4 = ((cwc) fp4Var.b).f("translationYLinear");
        } else if ((!z || f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && (z || f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            f3 = ((cwc) fp4Var.b).f("translationXCurveDownwards");
            f4 = ((cwc) fp4Var.b).f("translationYCurveDownwards");
        } else {
            f3 = ((cwc) fp4Var.b).f("translationXCurveUpwards");
            f4 = ((cwc) fp4Var.b).f("translationYCurveUpwards");
        }
        return new Pair(f3, f4);
    }

    public final float A(View view, View view2, n2f n2fVar) {
        RectF rectF = this.d;
        C(view, rectF);
        rectF.offset(this.g, this.h);
        RectF rectF2 = this.e;
        C(view2, rectF2);
        n2fVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void C(View view, RectF rectF) {
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f);
        rectF.offsetTo(r3[0], r3[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract fp4 D(Context context, boolean z);

    @Override // com.google.android.material.transformation.ExpandableBehavior, defpackage.us3
    public final boolean f(View view, View view2) {
        int expandedComponentIdHint;
        if (view.getVisibility() != 8) {
            return (view2 instanceof FloatingActionButton) && ((expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint()) == 0 || expandedComponentIdHint == view.getId());
        }
        a70.r("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        return false;
    }

    @Override // defpackage.us3
    public final void g(xs3 xs3Var) {
        if (xs3Var.h == 0) {
            xs3Var.h = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet x(View view, View view2, boolean z, boolean z2) {
        ObjectAnimator ofFloat;
        float f;
        ObjectAnimator ofFloat2;
        ObjectAnimator ofFloat3;
        ObjectAnimator ofFloat4;
        Property property = View.TRANSLATION_Y;
        Property property2 = View.TRANSLATION_X;
        fp4 D = D(view2.getContext(), z);
        if (z) {
            this.g = view.getTranslationX();
            this.h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        float elevation = view2.getElevation() - view.getElevation();
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-elevation);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        ((cwc) D.b).f("elevation").a(ofFloat);
        arrayList.add(ofFloat);
        float z3 = z(view, view2, (n2f) D.c);
        float A = A(view, view2, (n2f) D.c);
        Pair y = y(z3, A, z, D);
        dwc dwcVar = (dwc) y.first;
        dwc dwcVar2 = (dwc) y.second;
        RectF rectF = this.d;
        if (z) {
            f = 0.0f;
            if (!z2) {
                view2.setTranslationX(-z3);
                view2.setTranslationY(-A);
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            float B = B(D, dwcVar, -z3);
            float B2 = B(D, dwcVar2, -A);
            Rect rect = this.c;
            view2.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            RectF rectF2 = this.e;
            C(view2, rectF2);
            rectF2.offset(B, B2);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
            ofFloat3 = ofFloat6;
            ofFloat2 = ofFloat5;
        } else {
            f = 0.0f;
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property2, -z3);
            ofFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, -A);
        }
        dwcVar.a(ofFloat2);
        dwcVar2.a(ofFloat3);
        arrayList.add(ofFloat2);
        arrayList.add(ofFloat3);
        rectF.width();
        rectF.height();
        float z4 = z(view, view2, (n2f) D.c);
        float A2 = A(view, view2, (n2f) D.c);
        Pair y2 = y(z4, A2, z, D);
        dwc dwcVar3 = (dwc) y2.first;
        dwc dwcVar4 = (dwc) y2.second;
        if (!z) {
            z4 = this.g;
        }
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, z4);
        if (!z) {
            A2 = this.h;
        }
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, A2);
        dwcVar3.a(ofFloat7);
        dwcVar4.a(ofFloat8);
        arrayList.add(ofFloat7);
        arrayList.add(ofFloat8);
        if (view2 instanceof ViewGroup) {
            View findViewById = view2.findViewById(R.id.mtrl_child_content_container);
            ViewGroup viewGroup = findViewById != null ? findViewById instanceof ViewGroup ? (ViewGroup) findViewById : null : (ViewGroup) view2;
            if (viewGroup != null) {
                if (z) {
                    if (!z2) {
                        ot2.a.set(viewGroup, Float.valueOf(f));
                    }
                    ofFloat4 = ObjectAnimator.ofFloat(viewGroup, ot2.a, 1.0f);
                } else {
                    ofFloat4 = ObjectAnimator.ofFloat(viewGroup, ot2.a, f);
                }
                ((cwc) D.b).f("contentFade").a(ofFloat4);
                arrayList.add(ofFloat4);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        zm2.B(animatorSet, arrayList);
        animatorSet.addListener(new fm6(z, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    public final float z(View view, View view2, n2f n2fVar) {
        RectF rectF = this.d;
        C(view, rectF);
        rectF.offset(this.g, this.h);
        RectF rectF2 = this.e;
        C(view2, rectF2);
        n2fVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }
}
