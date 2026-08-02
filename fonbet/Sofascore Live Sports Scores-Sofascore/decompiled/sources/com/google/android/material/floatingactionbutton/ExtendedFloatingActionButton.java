package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.sofascore.results.R;
import defpackage.a70;
import defpackage.by4;
import defpackage.cwc;
import defpackage.e51;
import defpackage.eb;
import defpackage.f51;
import defpackage.fp4;
import defpackage.j0l;
import defpackage.ljg;
import defpackage.m6k;
import defpackage.oyn;
import defpackage.pjf;
import defpackage.sz8;
import defpackage.t9d;
import defpackage.ts3;
import defpackage.uj6;
import defpackage.us3;
import defpackage.vj6;
import defpackage.wj6;
import defpackage.x6k;
import defpackage.xah;
import defpackage.xs3;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements ts3 {
    public static final e51 j0 = new e51(11, "width", Float.class);
    public static final e51 k0 = new e51(12, "height", Float.class);
    public static final e51 l0 = new e51(13, "paddingStart", Float.class);
    public static final e51 m0 = new e51(14, "paddingEnd", Float.class);
    public int Q;
    public boolean R;
    public final uj6 S;
    public final uj6 T;
    public final wj6 U;
    public final vj6 V;
    public int W;
    public int a0;
    public int b0;
    public final ExtendedFloatingActionButtonBehavior c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public ColorStateList g0;
    public int h0;
    public int i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [x6k] */
    /* JADX WARN: Type inference failed for: r2v3, types: [fp4, java.lang.Object] */
    public ExtendedFloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(oyn.U(context, attributeSet, R.attr.extendedFloatingActionButtonStyle, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon), attributeSet, R.attr.extendedFloatingActionButtonStyle);
        this.Q = 0;
        this.R = true;
        j0l j0lVar = new j0l(6, false);
        wj6 wj6Var = new wj6(this, j0lVar);
        this.U = wj6Var;
        vj6 vj6Var = new vj6(this, j0lVar);
        this.V = vj6Var;
        this.d0 = true;
        this.e0 = false;
        this.f0 = false;
        Context context2 = getContext();
        this.c0 = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray Y = m6k.Y(context2, attributeSet, pjf.m, R.attr.extendedFloatingActionButtonStyle, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, new int[0]);
        cwc a = cwc.a(context2, Y, 5);
        cwc a2 = cwc.a(context2, Y, 4);
        cwc a3 = cwc.a(context2, Y, 2);
        cwc a4 = cwc.a(context2, Y, 6);
        this.W = Y.getDimensionPixelSize(0, -1);
        int i = Y.getInt(3, 1);
        this.a0 = getPaddingStart();
        this.b0 = getPaddingEnd();
        j0l j0lVar2 = new j0l(6, false);
        t9d t9dVar = new t9d(this);
        ?? fp4Var = new fp4(this, t9dVar);
        uj6 uj6Var = new uj6(this, j0lVar2, i != 1 ? i != 2 ? new x6k(this, fp4Var, t9dVar, false, 8) : fp4Var : t9dVar, true);
        this.T = uj6Var;
        uj6 uj6Var2 = new uj6(this, j0lVar2, new sz8(this, 23), false);
        this.S = uj6Var2;
        wj6Var.f = a;
        vj6Var.f = a2;
        uj6Var.f = a3;
        uj6Var2.f = a4;
        Y.recycle();
        setShapeAppearanceModel(xah.i(context2, attributeSet, R.attr.extendedFloatingActionButtonStyle, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, xah.m).a());
        this.g0 = getTextColors();
    }

    public final void A() {
        CharSequence charSequence;
        if (this.d0 || !isClickable()) {
            charSequence = null;
        } else {
            charSequence = getText();
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = getContentDescription();
            }
        }
        if (TextUtils.equals(getTooltipText(), charSequence)) {
            return;
        }
        setTooltipText(charSequence);
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // defpackage.ts3
    @NonNull
    public us3 getBehavior() {
        return this.c0;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        int i = this.W;
        if (i >= 0) {
            return i;
        }
        return getIconSize() + (Math.min(getPaddingStart(), getPaddingEnd()) * 2);
    }

    public int getCurrentOriginalTextColor() {
        return this.g0.getColorForState(getDrawableState(), 0);
    }

    @Nullable
    public cwc getExtendMotionSpec() {
        return this.T.f;
    }

    @Nullable
    public cwc getHideMotionSpec() {
        return this.V.f;
    }

    public ColorStateList getOriginalTextColor() {
        return this.g0;
    }

    @Nullable
    public cwc getShowMotionSpec() {
        return this.U.f;
    }

    @Nullable
    public cwc getShrinkMotionSpec() {
        return this.S.f;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.d0 || !TextUtils.isEmpty(getText()) || getIcon() == null) {
            A();
        } else {
            this.d0 = false;
            this.S.g();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.f0 = z;
    }

    public void setAnimationEnabled(boolean z) {
        this.R = z;
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        A();
    }

    public void setCollapsedSize(int i) {
        this.W = i;
    }

    @Override // android.view.View
    public void setContentDescription(@Nullable CharSequence charSequence) {
        super.setContentDescription(charSequence);
        A();
    }

    public void setExtendMotionSpec(@Nullable cwc cwcVar) {
        this.T.f = cwcVar;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(cwc.b(i, getContext()));
    }

    public void setExtended(boolean z) {
        if (this.d0 == z) {
            return;
        }
        uj6 uj6Var = z ? this.T : this.S;
        if (uj6Var.h()) {
            return;
        }
        uj6Var.g();
    }

    public void setHideMotionSpec(@Nullable cwc cwcVar) {
        this.V.f = cwcVar;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(cwc.b(i, getContext()));
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (!this.d0 || this.e0) {
            return;
        }
        this.a0 = getPaddingStart();
        this.b0 = getPaddingEnd();
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (!this.d0 || this.e0) {
            return;
        }
        this.a0 = i;
        this.b0 = i3;
    }

    public void setShowMotionSpec(@Nullable cwc cwcVar) {
        this.U.f = cwcVar;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(cwc.b(i, getContext()));
    }

    public void setShrinkMotionSpec(@Nullable cwc cwcVar) {
        this.S.f = cwcVar;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(cwc.b(i, getContext()));
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        A();
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        this.g0 = getTextColors();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        if (r5.f0 != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i) {
        f51 f51Var;
        if (i == 0) {
            f51Var = this.U;
        } else if (i == 1) {
            f51Var = this.V;
        } else if (i == 2) {
            f51Var = this.S;
        } else {
            if (i != 3) {
                a70.r(ljg.j(i, "Unknown strategy type: "));
                return;
            }
            f51Var = this.T;
        }
        if (f51Var.h()) {
            return;
        }
        if (this.R) {
            if (!isLaidOut()) {
                int visibility = getVisibility();
                int i2 = this.Q;
                if (visibility == 0 ? i2 == 1 : i2 != 2) {
                }
            }
            if (!isInEditMode()) {
                if (i == 2) {
                    ViewGroup.LayoutParams layoutParams = getLayoutParams();
                    if (layoutParams != null) {
                        this.h0 = layoutParams.width;
                        this.i0 = layoutParams.height;
                    } else {
                        this.h0 = getWidth();
                        this.i0 = getHeight();
                    }
                }
                measure(0, 0);
                AnimatorSet a = f51Var.a();
                a.addListener(new eb(f51Var, 6));
                Iterator it = f51Var.c.iterator();
                while (it.hasNext()) {
                    a.addListener((Animator.AnimatorListener) it.next());
                }
                a.start();
                return;
            }
        }
        f51Var.g();
    }

    public final void z(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // android.widget.TextView
    public void setTextColor(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.g0 = getTextColors();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends us3 {
        public Rect a;
        public final boolean b;
        public final boolean c;

        public ExtendedFloatingActionButtonBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pjf.n);
            this.b = obtainStyledAttributes.getBoolean(0, false);
            this.c = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }

        @Override // defpackage.us3
        public final /* bridge */ /* synthetic */ boolean e(Rect rect, View view) {
            return false;
        }

        @Override // defpackage.us3
        public final void g(xs3 xs3Var) {
            if (xs3Var.h == 0) {
                xs3Var.h = 80;
            }
        }

        @Override // defpackage.us3
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                w(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof xs3 ? ((xs3) layoutParams).a instanceof BottomSheetBehavior : false) {
                    x(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // defpackage.us3
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList k = coordinatorLayout.k(extendedFloatingActionButton);
            int size = k.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = (View) k.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof xs3 ? ((xs3) layoutParams).a instanceof BottomSheetBehavior : false) && x(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (w(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.p(i, extendedFloatingActionButton);
            return true;
        }

        public final boolean w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            xs3 xs3Var = (xs3) extendedFloatingActionButton.getLayoutParams();
            boolean z = this.b;
            boolean z2 = this.c;
            if ((!z && !z2) || xs3Var.f != appBarLayout.getId()) {
                return false;
            }
            Rect rect = this.a;
            if (rect == null) {
                rect = new Rect();
                this.a = rect;
            }
            by4.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                int i = z2 ? 2 : 1;
                e51 e51Var = ExtendedFloatingActionButton.j0;
                extendedFloatingActionButton.y(i);
            } else {
                int i2 = z2 ? 3 : 0;
                e51 e51Var2 = ExtendedFloatingActionButton.j0;
                extendedFloatingActionButton.y(i2);
            }
            return true;
        }

        public final boolean x(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            xs3 xs3Var = (xs3) extendedFloatingActionButton.getLayoutParams();
            boolean z = this.b;
            boolean z2 = this.c;
            if ((!z && !z2) || xs3Var.f != view.getId()) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((xs3) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                int i = z2 ? 2 : 1;
                e51 e51Var = ExtendedFloatingActionButton.j0;
                extendedFloatingActionButton.y(i);
            } else {
                int i2 = z2 ? 3 : 0;
                e51 e51Var2 = ExtendedFloatingActionButton.j0;
                extendedFloatingActionButton.y(i2);
            }
            return true;
        }

        public ExtendedFloatingActionButtonBehavior() {
            this.b = false;
            this.c = true;
        }
    }
}
