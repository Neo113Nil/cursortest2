package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import defpackage.ach;
import defpackage.e0i;
import defpackage.eq3;
import defpackage.fzb;
import defpackage.hzb;
import defpackage.jdi;
import defpackage.l4a;
import defpackage.m6k;
import defpackage.o3a;
import defpackage.oyn;
import defpackage.pjf;
import defpackage.qzb;
import defpackage.td4;
import defpackage.w3a;
import defpackage.x2a;
import defpackage.xah;
import defpackage.yfa;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class MaterialCardView extends CardView implements Checkable, ach {
    public static final int[] k = {R.attr.state_checkable};
    public static final int[] l = {R.attr.state_checked};
    public static final int[] m = {com.sofascore.results.R.attr.state_dragged};
    public static final int[] n = {R.attr.state_hovered};
    public final hzb g;
    public final boolean h;
    public boolean i;
    public boolean j;

    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(oyn.U(context, attributeSet, i, com.sofascore.results.R.style.Widget_MaterialComponents_CardView), attributeSet, i);
        jdi g;
        this.i = false;
        this.j = false;
        this.h = true;
        TypedArray Y = m6k.Y(getContext(), attributeSet, pjf.A, i, com.sofascore.results.R.style.Widget_MaterialComponents_CardView, new int[0]);
        hzb hzbVar = new hzb(this, attributeSet, i);
        this.g = hzbVar;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        qzb qzbVar = hzbVar.c;
        qzbVar.t(cardBackgroundColor);
        hzbVar.b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        hzbVar.l();
        MaterialCardView materialCardView = hzbVar.a;
        ColorStateList x = w3a.x(materialCardView.getContext(), Y, 11);
        hzbVar.o = x;
        if (x == null) {
            hzbVar.o = ColorStateList.valueOf(-1);
        }
        hzbVar.i = Y.getDimensionPixelSize(12, 0);
        boolean z = Y.getBoolean(0, false);
        hzbVar.t = z;
        materialCardView.setLongClickable(z);
        hzbVar.m = w3a.x(materialCardView.getContext(), Y, 6);
        hzbVar.g(w3a.z(materialCardView.getContext(), Y, 2));
        hzbVar.g = Y.getDimensionPixelSize(5, 0);
        hzbVar.f = Y.getDimensionPixelSize(4, 0);
        hzbVar.h = Y.getInteger(3, 8388661);
        ColorStateList x2 = w3a.x(materialCardView.getContext(), Y, 7);
        hzbVar.l = x2;
        if (x2 == null) {
            hzbVar.l = ColorStateList.valueOf(o3a.O(materialCardView.getContext(), x2a.O(com.sofascore.results.R.attr.colorControlHighlight, materialCardView)));
        }
        ColorStateList x3 = w3a.x(materialCardView.getContext(), Y, 1);
        x3 = x3 == null ? ColorStateList.valueOf(0) : x3;
        qzb qzbVar2 = hzbVar.d;
        qzbVar2.t(x3);
        RippleDrawable rippleDrawable = hzbVar.p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(hzbVar.l);
        }
        qzbVar.s(materialCardView.getCardElevation());
        float f = hzbVar.i;
        ColorStateList colorStateList = hzbVar.o;
        qzbVar2.A(f);
        qzbVar2.y(colorStateList);
        materialCardView.setBackgroundInternal(hzbVar.d(qzbVar));
        Drawable c = hzbVar.j() ? hzbVar.c() : qzbVar2;
        hzbVar.j = c;
        materialCardView.setForeground(hzbVar.d(c));
        if (hzbVar.e == -1.0f && (g = jdi.g(materialCardView.getContext(), Y, 8)) != null) {
            e0i F = yfa.F(materialCardView.getContext());
            qzbVar.r(F);
            qzbVar2.r(F);
            qzb qzbVar3 = hzbVar.r;
            if (qzbVar3 != null) {
                qzbVar3.r(F);
            }
            hzbVar.h(g);
        }
        Y.recycle();
    }

    @NonNull
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.g.c.getBounds());
        return rectF;
    }

    public final void b() {
        hzb hzbVar;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (hzbVar = this.g).p) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i = bounds.bottom;
        hzbVar.p.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        hzbVar.p.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    @Override // androidx.cardview.widget.CardView
    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return this.g.c.b.c;
    }

    @NonNull
    public ColorStateList getCardForegroundColor() {
        return this.g.d.b.c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    @Nullable
    public Drawable getCheckedIcon() {
        return this.g.k;
    }

    public int getCheckedIconGravity() {
        return this.g.h;
    }

    public int getCheckedIconMargin() {
        return this.g.f;
    }

    public int getCheckedIconSize() {
        return this.g.g;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        return this.g.m;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.g.b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.g.b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.g.b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.g.b.top;
    }

    public float getProgress() {
        return this.g.c.b.j;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.g.c.m();
    }

    public ColorStateList getRippleColor() {
        return this.g.l;
    }

    @NonNull
    public xah getShapeAppearanceModel() {
        return this.g.n.d();
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.g.o;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    @Nullable
    public ColorStateList getStrokeColorStateList() {
        return this.g.o;
    }

    public int getStrokeWidth() {
        return this.g.i;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hzb hzbVar = this.g;
        hzbVar.k();
        l4a.I(this, hzbVar.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 8);
        hzb hzbVar = this.g;
        if (hzbVar != null && hzbVar.t) {
            View.mergeDrawableStates(onCreateDrawableState, k);
        }
        if (this.i) {
            View.mergeDrawableStates(onCreateDrawableState, l);
        }
        if (this.j) {
            View.mergeDrawableStates(onCreateDrawableState, m);
        }
        if (isDuplicateParentStateEnabled()) {
            if (isPressed()) {
                View.mergeDrawableStates(onCreateDrawableState, FrameLayout.PRESSED_STATE_SET);
            }
            if (isHovered()) {
                View.mergeDrawableStates(onCreateDrawableState, n);
            }
            if (isEnabled()) {
                View.mergeDrawableStates(onCreateDrawableState, FrameLayout.ENABLED_STATE_SET);
            }
            if (isFocused()) {
                View.mergeDrawableStates(onCreateDrawableState, FrameLayout.FOCUSED_STATE_SET);
            }
            if (isSelected()) {
                View.mergeDrawableStates(onCreateDrawableState, FrameLayout.SELECTED_STATE_SET);
            }
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.i);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        hzb hzbVar = this.g;
        accessibilityNodeInfo.setCheckable(hzbVar != null && hzbVar.t);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.i);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.g.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.h) {
            hzb hzbVar = this.g;
            if (!hzbVar.s) {
                hzbVar.s = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.g.c.t(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        hzb hzbVar = this.g;
        hzbVar.c.s(hzbVar.a.getCardElevation());
    }

    public void setCardForegroundColor(@Nullable ColorStateList colorStateList) {
        qzb qzbVar = this.g.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        qzbVar.t(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.g.t = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.i != z) {
            toggle();
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        this.g.g(drawable);
    }

    public void setCheckedIconGravity(int i) {
        hzb hzbVar = this.g;
        if (hzbVar.h != i) {
            hzbVar.h = i;
            MaterialCardView materialCardView = hzbVar.a;
            hzbVar.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.g.f = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.g.f = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.g.g(td4.d0(i, getContext()));
    }

    public void setCheckedIconSize(int i) {
        this.g.g = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.g.g = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        hzb hzbVar = this.g;
        hzbVar.m = colorStateList;
        Drawable drawable = hzbVar.k;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        hzb hzbVar = this.g;
        if (hzbVar != null) {
            hzbVar.k();
        }
    }

    public void setDragged(boolean z) {
        if (this.j != z) {
            this.j = z;
            refreshDrawableState();
            b();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.g.m();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        hzb hzbVar = this.g;
        hzbVar.m();
        hzbVar.l();
    }

    public void setProgress(float f) {
        hzb hzbVar = this.g;
        hzbVar.c.u(f);
        qzb qzbVar = hzbVar.d;
        if (qzbVar != null) {
            qzbVar.u(f);
        }
        qzb qzbVar2 = hzbVar.r;
        if (qzbVar2 != null) {
            qzbVar2.u(f);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        hzb hzbVar = this.g;
        hzbVar.e = f;
        hzbVar.h(hzbVar.n.d().a(f));
        hzbVar.j.invalidateSelf();
        if (hzbVar.i() || (hzbVar.a.getPreventCornerOverlap() && !hzbVar.c.q())) {
            hzbVar.l();
        }
        if (hzbVar.i()) {
            hzbVar.m();
        }
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        hzb hzbVar = this.g;
        hzbVar.l = colorStateList;
        RippleDrawable rippleDrawable = hzbVar.p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList q = eq3.q(i, getContext());
        hzb hzbVar = this.g;
        hzbVar.l = q;
        RippleDrawable rippleDrawable = hzbVar.p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(q);
        }
    }

    @Override // defpackage.ach
    public void setShapeAppearanceModel(@NonNull xah xahVar) {
        setClipToOutline(xahVar.l(getBoundsAsRectF()));
        this.g.h(xahVar);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        hzb hzbVar = this.g;
        if (hzbVar.o != colorStateList) {
            hzbVar.o = colorStateList;
            qzb qzbVar = hzbVar.d;
            qzbVar.A(hzbVar.i);
            qzbVar.y(colorStateList);
        }
        invalidate();
    }

    public void setStrokeWidth(int i) {
        hzb hzbVar = this.g;
        if (i != hzbVar.i) {
            hzbVar.i = i;
            qzb qzbVar = hzbVar.d;
            ColorStateList colorStateList = hzbVar.o;
            qzbVar.A(i);
            qzbVar.y(colorStateList);
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        hzb hzbVar = this.g;
        hzbVar.m();
        hzbVar.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        hzb hzbVar = this.g;
        if (hzbVar != null && hzbVar.t && isEnabled()) {
            this.i = !this.i;
            refreshDrawableState();
            b();
            hzbVar.f(this.i, true);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        this.g.c.t(colorStateList);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setOnCheckedChangeListener(@Nullable fzb fzbVar) {
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.sofascore.results.R.attr.materialCardViewStyle);
    }
}
