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
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Y;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.mlkit.common.sdkinternal.C;
import j7.C7292a;
import j7.C7293b;
import j7.C7294c;
import j7.C7295d;
import j7.C7296e;
import j7.C7299h;
import j7.C7300i;
import java.util.ArrayList;
import m7.C8099a;
import m7.InterfaceC8100b;
import ru.ozon.app.android.R;

@Deprecated
/* loaded from: classes9.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c, reason: collision with root package name */
    private final Rect f58842c;

    /* renamed from: d, reason: collision with root package name */
    private final RectF f58843d;

    /* renamed from: e, reason: collision with root package name */
    private final RectF f58844e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f58845f;

    /* renamed from: g, reason: collision with root package name */
    private float f58846g;

    /* renamed from: h, reason: collision with root package name */
    private float f58847h;

    final class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f58848a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f58849b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f58850c;

        a(boolean z11, View view, View view2) {
            this.f58848a = z11;
            this.f58849b = view;
            this.f58850c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f58848a) {
                return;
            }
            this.f58849b.setVisibility(4);
            View view = this.f58850c;
            view.setAlpha(1.0f);
            view.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.f58848a) {
                this.f58849b.setVisibility(0);
                View view = this.f58850c;
                view.setAlpha(0.0f);
                view.setVisibility(4);
            }
        }
    }

    protected static class b {

        /* renamed from: a, reason: collision with root package name */
        public C7299h f58851a;

        /* renamed from: b, reason: collision with root package name */
        public C f58852b;
    }

    public FabTransformationBehavior() {
        this.f58842c = new Rect();
        this.f58843d = new RectF();
        this.f58844e = new RectF();
        this.f58845f = new int[2];
    }

    @NonNull
    private static Pair f(float f7, float f11, boolean z11, @NonNull b bVar) {
        C7300i d11;
        C7300i d12;
        if (f7 == 0.0f || f11 == 0.0f) {
            d11 = bVar.f58851a.d("translationXLinear");
            d12 = bVar.f58851a.d("translationYLinear");
        } else if ((!z11 || f11 >= 0.0f) && (z11 || f11 <= 0.0f)) {
            d11 = bVar.f58851a.d("translationXCurveDownwards");
            d12 = bVar.f58851a.d("translationYCurveDownwards");
        } else {
            d11 = bVar.f58851a.d("translationXCurveUpwards");
            d12 = bVar.f58851a.d("translationYCurveUpwards");
        }
        return new Pair(d11, d12);
    }

    private float g(@NonNull View view, @NonNull View view2, @NonNull C c11) {
        RectF rectF = this.f58843d;
        RectF rectF2 = this.f58844e;
        j(view, rectF);
        rectF.offset(this.f58846g, this.f58847h);
        j(view2, rectF2);
        c11.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    private float h(@NonNull View view, @NonNull View view2, @NonNull C c11) {
        RectF rectF = this.f58843d;
        RectF rectF2 = this.f58844e;
        j(view, rectF);
        rectF.offset(this.f58846g, this.f58847h);
        j(view2, rectF2);
        c11.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    private static float i(@NonNull b bVar, @NonNull C7300i c7300i, float f7) {
        long c11 = c7300i.c();
        long d11 = c7300i.d();
        C7300i d12 = bVar.f58851a.d("expansion");
        return C7292a.a(f7, 0.0f, c7300i.e().getInterpolation((((d12.d() + d12.c()) + 17) - c11) / d11));
    }

    private void j(@NonNull View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f58845f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0389 A[LOOP:0: B:96:0x0387->B:97:0x0389, LOOP_END] */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final AnimatorSet e(@NonNull View view, @NonNull View view2, boolean z11, boolean z12) {
        ObjectAnimator ofFloat;
        ArrayList arrayList;
        float f7;
        ObjectAnimator ofFloat2;
        ObjectAnimator ofFloat3;
        ArrayList arrayList2;
        boolean z13;
        int size;
        int i11;
        ObjectAnimator ofFloat4;
        ObjectAnimator ofInt;
        C7300i c7300i;
        AnimatorSet animatorSet;
        ObjectAnimator ofInt2;
        b k11 = k(view2.getContext(), z11);
        if (z11) {
            this.f58846g = view.getTranslationX();
            this.f58847h = view.getTranslationY();
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        float k12 = Y.k(view2) - Y.k(view);
        if (z11) {
            if (!z12) {
                view2.setTranslationZ(-k12);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -k12);
        }
        k11.f58851a.d("elevation").a(ofFloat);
        arrayList3.add(ofFloat);
        RectF rectF = this.f58843d;
        float g10 = g(view, view2, k11.f58852b);
        float h11 = h(view, view2, k11.f58852b);
        Pair f11 = f(g10, h11, z11, k11);
        C7300i c7300i2 = (C7300i) f11.first;
        C7300i c7300i3 = (C7300i) f11.second;
        RectF rectF2 = this.f58844e;
        Rect rect = this.f58842c;
        if (z11) {
            f7 = 0.0f;
            if (!z12) {
                view2.setTranslationX(-g10);
                view2.setTranslationY(-h11);
            }
            arrayList = arrayList4;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float i12 = i(k11, c7300i2, -g10);
            float i13 = i(k11, c7300i3, -h11);
            view2.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            j(view2, rectF2);
            rectF2.offset(i12, i13);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
            ofFloat3 = ofFloat6;
            ofFloat2 = ofFloat5;
        } else {
            arrayList = arrayList4;
            f7 = 0.0f;
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -g10);
            ofFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -h11);
        }
        c7300i2.a(ofFloat2);
        c7300i3.a(ofFloat3);
        arrayList3.add(ofFloat2);
        arrayList3.add(ofFloat3);
        float width = rectF.width();
        float height = rectF.height();
        float g11 = g(view, view2, k11.f58852b);
        float h12 = h(view, view2, k11.f58852b);
        Pair f12 = f(g11, h12, z11, k11);
        C7300i c7300i4 = (C7300i) f12.first;
        C7300i c7300i5 = (C7300i) f12.second;
        Property property = View.TRANSLATION_X;
        if (!z11) {
            g11 = this.f58846g;
        }
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, g11);
        Property property2 = View.TRANSLATION_Y;
        if (!z11) {
            h12 = this.f58847h;
        }
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, h12);
        c7300i4.a(ofFloat7);
        c7300i5.a(ofFloat8);
        arrayList3.add(ofFloat7);
        arrayList3.add(ofFloat8);
        boolean z14 = view2 instanceof InterfaceC8100b;
        if (z14 && (view instanceof ImageView)) {
            InterfaceC8100b interfaceC8100b = (InterfaceC8100b) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z11) {
                    if (!z12) {
                        drawable.setAlpha(255);
                    }
                    ofInt2 = ObjectAnimator.ofInt(drawable, C7296e.f69470a, 0);
                } else {
                    ofInt2 = ObjectAnimator.ofInt(drawable, C7296e.f69470a, 255);
                }
                ofInt2.addUpdateListener(new com.google.android.material.transformation.b(view2));
                k11.f58851a.d("iconFade").a(ofInt2);
                arrayList3.add(ofInt2);
                c cVar = new c(interfaceC8100b, drawable);
                arrayList2 = arrayList;
                arrayList2.add(cVar);
                if (z14) {
                    InterfaceC8100b interfaceC8100b2 = (InterfaceC8100b) view2;
                    C c11 = k11.f58852b;
                    j(view, rectF);
                    rectF.offset(this.f58846g, this.f58847h);
                    j(view2, rectF2);
                    rectF2.offset(-g(view, view2, c11), f7);
                    float centerX = rectF.centerX() - rectF2.left;
                    C c12 = k11.f58852b;
                    j(view, rectF);
                    rectF.offset(this.f58846g, this.f58847h);
                    j(view2, rectF2);
                    rectF2.offset(0.0f, -h(view, view2, c12));
                    float centerY = rectF.centerY() - rectF2.top;
                    ((FloatingActionButton) view).i(rect);
                    float width2 = rect.width() / 2.0f;
                    C7300i d11 = k11.f58851a.d("expansion");
                    if (z11) {
                        if (!z12) {
                            interfaceC8100b2.a();
                        }
                        if (z12) {
                            width2 = interfaceC8100b2.c().f74615c;
                        }
                        double d12 = 0.0f - centerX;
                        double d13 = 0.0f - centerY;
                        c7300i = d11;
                        float hypot = (float) Math.hypot(d12, d13);
                        double d14 = width - centerX;
                        float hypot2 = (float) Math.hypot(d14, d13);
                        double d15 = height - centerY;
                        float hypot3 = (float) Math.hypot(d14, d15);
                        float hypot4 = (float) Math.hypot(d12, d15);
                        if (hypot > hypot2 && hypot > hypot3 && hypot > hypot4) {
                            hypot3 = hypot;
                        } else if (hypot2 > hypot3 && hypot2 > hypot4) {
                            hypot3 = hypot2;
                        } else if (hypot3 <= hypot4) {
                            hypot3 = hypot4;
                        }
                        animatorSet = C8099a.a(interfaceC8100b2, centerX, centerY, hypot3);
                        animatorSet.addListener(new d(interfaceC8100b2));
                        long c13 = c7300i.c();
                        int i14 = (int) centerX;
                        int i15 = (int) centerY;
                        if (c13 > 0) {
                            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i14, i15, width2, width2);
                            createCircularReveal.setStartDelay(0L);
                            createCircularReveal.setDuration(c13);
                            arrayList3.add(createCircularReveal);
                        }
                    } else {
                        c7300i = d11;
                        float f13 = interfaceC8100b2.c().f74615c;
                        AnimatorSet a11 = C8099a.a(interfaceC8100b2, centerX, centerY, width2);
                        long c14 = c7300i.c();
                        int i16 = (int) centerX;
                        int i17 = (int) centerY;
                        if (c14 > 0) {
                            Animator createCircularReveal2 = ViewAnimationUtils.createCircularReveal(view2, i16, i17, f13, f13);
                            createCircularReveal2.setStartDelay(0L);
                            createCircularReveal2.setDuration(c14);
                            arrayList3.add(createCircularReveal2);
                        }
                        long c15 = c7300i.c();
                        long d16 = c7300i.d();
                        long e11 = k11.f58851a.e();
                        long j11 = c15 + d16;
                        if (j11 < e11) {
                            Animator createCircularReveal3 = ViewAnimationUtils.createCircularReveal(view2, i16, i17, width2, width2);
                            createCircularReveal3.setStartDelay(j11);
                            createCircularReveal3.setDuration(e11 - j11);
                            arrayList3.add(createCircularReveal3);
                        }
                        animatorSet = a11;
                    }
                    c7300i.a(animatorSet);
                    arrayList3.add(animatorSet);
                    arrayList2.add(C8099a.b(interfaceC8100b2));
                }
                if (z14) {
                    InterfaceC8100b interfaceC8100b3 = (InterfaceC8100b) view2;
                    ColorStateList i18 = Y.i(view);
                    int colorForState = i18 != null ? i18.getColorForState(view.getDrawableState(), i18.getDefaultColor()) : 0;
                    int i19 = 16777215 & colorForState;
                    if (z11) {
                        if (!z12) {
                            interfaceC8100b3.f();
                        }
                        ofInt = ObjectAnimator.ofInt(interfaceC8100b3, InterfaceC8100b.c.f74612a, i19);
                    } else {
                        ofInt = ObjectAnimator.ofInt(interfaceC8100b3, InterfaceC8100b.c.f74612a, colorForState);
                    }
                    ofInt.setEvaluator(C7294c.a());
                    k11.f58851a.d("color").a(ofInt);
                    arrayList3.add(ofInt);
                }
                z13 = view2 instanceof ViewGroup;
                if (z13) {
                    View findViewById = view2.findViewById(R.id.mtrl_child_content_container);
                    ViewGroup viewGroup = null;
                    if (findViewById != null) {
                        if (findViewById instanceof ViewGroup) {
                            viewGroup = (ViewGroup) findViewById;
                        }
                    } else if (z13) {
                        viewGroup = (ViewGroup) view2;
                    }
                    if (viewGroup != null) {
                        if (z11) {
                            if (!z12) {
                                C7295d.f69469a.set(viewGroup, Float.valueOf(0.0f));
                            }
                            ofFloat4 = ObjectAnimator.ofFloat(viewGroup, C7295d.f69469a, 1.0f);
                        } else {
                            ofFloat4 = ObjectAnimator.ofFloat(viewGroup, C7295d.f69469a, 0.0f);
                        }
                        k11.f58851a.d("contentFade").a(ofFloat4);
                        arrayList3.add(ofFloat4);
                    }
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                C7293b.a(animatorSet2, arrayList3);
                animatorSet2.addListener(new a(z11, view2, view));
                size = arrayList2.size();
                for (i11 = 0; i11 < size; i11++) {
                    animatorSet2.addListener((Animator.AnimatorListener) arrayList2.get(i11));
                }
                return animatorSet2;
            }
        }
        arrayList2 = arrayList;
        if (z14) {
        }
        if (z14) {
        }
        z13 = view2 instanceof ViewGroup;
        if (z13) {
        }
        AnimatorSet animatorSet22 = new AnimatorSet();
        C7293b.a(animatorSet22, arrayList3);
        animatorSet22.addListener(new a(z11, view2, view));
        size = arrayList2.size();
        while (i11 < size) {
        }
        return animatorSet22;
    }

    protected abstract b k(Context context, boolean z11);

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean layoutDependsOn(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int j11 = ((FloatingActionButton) view2).j();
        return j11 == 0 || j11 == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onAttachedToLayoutParams(@NonNull CoordinatorLayout.f fVar) {
        if (fVar.f41889h == 0) {
            fVar.f41889h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f58842c = new Rect();
        this.f58843d = new RectF();
        this.f58844e = new RectF();
        this.f58845f = new int[2];
    }
}
