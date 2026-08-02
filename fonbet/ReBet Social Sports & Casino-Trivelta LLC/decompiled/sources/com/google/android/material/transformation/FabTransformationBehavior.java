package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
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
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import ia.g;
import ja.AbstractC5104a;
import ja.AbstractC5105b;
import ja.C5107d;
import ja.C5110g;
import ja.C5111h;
import ja.C5112i;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c, reason: collision with root package name */
    public final Rect f36505c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f36506d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f36507e;

    /* renamed from: f, reason: collision with root package name */
    public float f36508f;

    /* renamed from: g, reason: collision with root package name */
    public float f36509g;
    private final int[] tmpArray;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f36510a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f36511b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f36512c;

        public a(boolean z10, View view, View view2) {
            this.f36510a = z10;
            this.f36511b = view;
            this.f36512c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f36510a) {
                return;
            }
            this.f36511b.setVisibility(4);
            this.f36512c.setAlpha(1.0f);
            this.f36512c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f36510a) {
                this.f36511b.setVisibility(0);
                this.f36512c.setAlpha(0.0f);
                this.f36512c.setVisibility(4);
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public C5110g f36514a;

        /* renamed from: b, reason: collision with root package name */
        public C5112i f36515b;
    }

    public FabTransformationBehavior() {
        this.f36505c = new Rect();
        this.f36506d = new RectF();
        this.f36507e = new RectF();
        this.tmpArray = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public AnimatorSet N(View view, View view2, boolean z10, boolean z11) {
        b d02 = d0(view2.getContext(), z10);
        if (z10) {
            this.f36508f = view.getTranslationX();
            this.f36509g = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Z(view, view2, z10, z11, d02, arrayList, arrayList2);
        RectF rectF = this.f36506d;
        c0(view, view2, z10, z11, d02, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        Y(view, view2, z10, d02, arrayList);
        b0(view, view2, z10, z11, d02, arrayList, arrayList2);
        a0(view, view2, z10, z11, d02, width, height, arrayList, arrayList2);
        X(view, view2, z10, z11, d02, arrayList, arrayList2);
        W(view, view2, z10, z11, d02, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        AbstractC5105b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z10, view2, view));
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i10));
        }
        return animatorSet;
    }

    public final ViewGroup O(View view) {
        View findViewById = view.findViewById(g.f48406N);
        return findViewById != null ? e0(findViewById) : e0(view);
    }

    public final void P(View view, b bVar, C5111h c5111h, C5111h c5111h2, float f10, float f11, float f12, float f13, RectF rectF) {
        float U10 = U(bVar, c5111h, f10, f12);
        float U11 = U(bVar, c5111h2, f11, f13);
        Rect rect = this.f36505c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f36506d;
        rectF2.set(rect);
        RectF rectF3 = this.f36507e;
        V(view, rectF3);
        rectF3.offset(U10, U11);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    public final void Q(View view, RectF rectF) {
        V(view, rectF);
        rectF.offset(this.f36508f, this.f36509g);
    }

    public final Pair R(float f10, float f11, boolean z10, b bVar) {
        C5111h e10;
        C5111h e11;
        if (f10 == 0.0f || f11 == 0.0f) {
            e10 = bVar.f36514a.e("translationXLinear");
            e11 = bVar.f36514a.e("translationYLinear");
        } else if ((!z10 || f11 >= 0.0f) && (z10 || f11 <= 0.0f)) {
            e10 = bVar.f36514a.e("translationXCurveDownwards");
            e11 = bVar.f36514a.e("translationYCurveDownwards");
        } else {
            e10 = bVar.f36514a.e("translationXCurveUpwards");
            e11 = bVar.f36514a.e("translationYCurveUpwards");
        }
        return new Pair(e10, e11);
    }

    public final float S(View view, View view2, C5112i c5112i) {
        float centerX;
        float centerX2;
        float f10;
        RectF rectF = this.f36506d;
        RectF rectF2 = this.f36507e;
        Q(view, rectF);
        V(view2, rectF2);
        int i10 = c5112i.f53874a & 7;
        if (i10 == 1) {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        } else if (i10 == 3) {
            centerX = rectF2.left;
            centerX2 = rectF.left;
        } else {
            if (i10 != 5) {
                f10 = 0.0f;
                return f10 + c5112i.f53875b;
            }
            centerX = rectF2.right;
            centerX2 = rectF.right;
        }
        f10 = centerX - centerX2;
        return f10 + c5112i.f53875b;
    }

    public final float T(View view, View view2, C5112i c5112i) {
        float centerY;
        float centerY2;
        float f10;
        RectF rectF = this.f36506d;
        RectF rectF2 = this.f36507e;
        Q(view, rectF);
        V(view2, rectF2);
        int i10 = c5112i.f53874a & 112;
        if (i10 == 16) {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        } else if (i10 == 48) {
            centerY = rectF2.top;
            centerY2 = rectF.top;
        } else {
            if (i10 != 80) {
                f10 = 0.0f;
                return f10 + c5112i.f53876c;
            }
            centerY = rectF2.bottom;
            centerY2 = rectF.bottom;
        }
        f10 = centerY - centerY2;
        return f10 + c5112i.f53876c;
    }

    public final float U(b bVar, C5111h c5111h, float f10, float f11) {
        long c10 = c5111h.c();
        long d10 = c5111h.d();
        C5111h e10 = bVar.f36514a.e("expansion");
        return AbstractC5104a.a(f10, f11, c5111h.e().getInterpolation((((e10.c() + e10.d()) + 17) - c10) / d10));
    }

    public final void V(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.tmpArray);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public final void W(View view, View view2, boolean z10, boolean z11, b bVar, List list, List list2) {
        ViewGroup O10;
        ObjectAnimator ofFloat;
        if ((view2 instanceof ViewGroup) && (O10 = O(view2)) != null) {
            if (z10) {
                if (!z11) {
                    C5107d.f53864a.set(O10, Float.valueOf(0.0f));
                }
                ofFloat = ObjectAnimator.ofFloat(O10, (Property<ViewGroup, Float>) C5107d.f53864a, 1.0f);
            } else {
                ofFloat = ObjectAnimator.ofFloat(O10, (Property<ViewGroup, Float>) C5107d.f53864a, 0.0f);
            }
            bVar.f36514a.e("contentFade").a(ofFloat);
            list.add(ofFloat);
        }
    }

    public final void X(View view, View view2, boolean z10, boolean z11, b bVar, List list, List list2) {
    }

    public final void Y(View view, View view2, boolean z10, b bVar, List list) {
        float S10 = S(view, view2, bVar.f36515b);
        float T10 = T(view, view2, bVar.f36515b);
        Pair R10 = R(S10, T10, z10, bVar);
        C5111h c5111h = (C5111h) R10.first;
        C5111h c5111h2 = (C5111h) R10.second;
        Property property = View.TRANSLATION_X;
        if (!z10) {
            S10 = this.f36508f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, S10);
        Property property2 = View.TRANSLATION_Y;
        if (!z10) {
            T10 = this.f36509g;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, T10);
        c5111h.a(ofFloat);
        c5111h2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    public final void Z(View view, View view2, boolean z10, boolean z11, b bVar, List list, List list2) {
        ObjectAnimator ofFloat;
        float elevation = view2.getElevation() - view.getElevation();
        if (z10) {
            if (!z11) {
                view2.setTranslationZ(-elevation);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        bVar.f36514a.e(ViewProps.ELEVATION).a(ofFloat);
        list.add(ofFloat);
    }

    public final void a0(View view, View view2, boolean z10, boolean z11, b bVar, float f10, float f11, List list, List list2) {
    }

    public final void b0(View view, View view2, boolean z10, boolean z11, b bVar, List list, List list2) {
    }

    public final void c0(View view, View view2, boolean z10, boolean z11, b bVar, List list, List list2, RectF rectF) {
        C5111h c5111h;
        C5111h c5111h2;
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float S10 = S(view, view2, bVar.f36515b);
        float T10 = T(view, view2, bVar.f36515b);
        Pair R10 = R(S10, T10, z10, bVar);
        C5111h c5111h3 = (C5111h) R10.first;
        C5111h c5111h4 = (C5111h) R10.second;
        if (z10) {
            if (!z11) {
                view2.setTranslationX(-S10);
                view2.setTranslationY(-T10);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            c5111h = c5111h4;
            c5111h2 = c5111h3;
            P(view2, bVar, c5111h2, c5111h, -S10, -T10, 0.0f, 0.0f, rectF);
        } else {
            c5111h = c5111h4;
            c5111h2 = c5111h3;
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -S10);
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -T10);
        }
        c5111h2.a(ofFloat);
        c5111h.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    public abstract b d0(Context context, boolean z10);

    public final ViewGroup e0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
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
    public void k(CoordinatorLayout.f fVar) {
        if (fVar.f18787h == 0) {
            fVar.f18787h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36505c = new Rect();
        this.f36506d = new RectF();
        this.f36507e = new RectF();
        this.tmpArray = new int[2];
    }
}
