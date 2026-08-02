package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.customview.view.AbsSavedState;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.ach;
import defpackage.cqa;
import defpackage.d0i;
import defpackage.e0i;
import defpackage.eq3;
import defpackage.jdi;
import defpackage.kdi;
import defpackage.kr9;
import defpackage.l4a;
import defpackage.ldi;
import defpackage.lnb;
import defpackage.ly4;
import defpackage.m6k;
import defpackage.nyb;
import defpackage.oyb;
import defpackage.oyn;
import defpackage.pjf;
import defpackage.pn0;
import defpackage.pyb;
import defpackage.qzb;
import defpackage.rfo;
import defpackage.ryb;
import defpackage.syb;
import defpackage.td4;
import defpackage.vah;
import defpackage.vha;
import defpackage.w3a;
import defpackage.xah;
import defpackage.yfa;
import defpackage.yp8;
import defpackage.yq5;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class MaterialButton extends AppCompatButton implements Checkable, ach {
    public static final int[] N = {R.attr.state_checkable};
    public static final int[] O = {R.attr.state_checked};
    public static final ly4 P = new ly4(1);
    public int A;
    public int B;
    public LinearLayout.LayoutParams C;
    public boolean D;
    public int E;
    public boolean F;
    public int G;
    public ldi H;
    public int I;
    public pyb J;
    public float K;
    public float L;
    public d0i M;
    public final syb d;
    public final LinkedHashSet e;
    public oyb f;
    public PorterDuff.Mode g;
    public ColorStateList h;
    public Drawable i;
    public PorterDuff.Mode j;
    public ColorStateList k;
    public Drawable l;
    public boolean m;
    public String n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public int w;
    public int x;
    public int y;
    public float z;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.c = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(oyn.T(i, com.sofascore.results.R.style.Widget_MaterialComponents_Button, context, attributeSet, new int[]{com.sofascore.results.R.attr.materialSizeOverlay}), attributeSet, i);
        this.e = new LinkedHashSet();
        this.u = false;
        this.v = false;
        this.y = Integer.MIN_VALUE;
        this.z = -2.1474836E9f;
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        this.G = Integer.MIN_VALUE;
        this.J = pyb.d;
        Context context2 = getContext();
        TypedArray Y = m6k.Y(context2, attributeSet, pjf.u, i, com.sofascore.results.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.r = Y.getDimensionPixelSize(13, 0);
        int i2 = Y.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.g = vha.F(i2, mode);
        this.h = w3a.x(getContext(), Y, 15);
        this.i = w3a.z(getContext(), Y, 11);
        this.w = Y.getInteger(12, 1);
        this.o = Y.getDimensionPixelSize(14, 0);
        this.j = vha.F(Y.getInt(22, -1), mode);
        this.k = Y.hasValue(21) ? w3a.x(getContext(), Y, 21) : this.h;
        this.x = Y.getInteger(20, 3);
        Drawable z = w3a.z(getContext(), Y, 19);
        this.l = z;
        this.m = z == null;
        vah g = jdi.g(context2, Y, 23);
        g = g == null ? xah.h(context2, attributeSet, i, com.sofascore.results.R.style.Widget_MaterialComponents_Button).a() : g;
        boolean z2 = Y.getBoolean(17, false);
        syb sybVar = new syb(this, g);
        this.d = sybVar;
        sybVar.e = Y.getDimensionPixelOffset(2, 0);
        sybVar.f = Y.getDimensionPixelOffset(3, 0);
        sybVar.g = Y.getDimensionPixelOffset(4, 0);
        sybVar.h = Y.getDimensionPixelOffset(5, 0);
        if (Y.hasValue(9)) {
            int dimensionPixelSize = Y.getDimensionPixelSize(9, -1);
            sybVar.i = dimensionPixelSize;
            sybVar.b = sybVar.b.a(dimensionPixelSize);
            sybVar.d();
            sybVar.r = true;
        }
        sybVar.j = Y.getDimensionPixelSize(26, 0);
        sybVar.k = vha.F(Y.getInt(8, -1), mode);
        sybVar.l = w3a.x(getContext(), Y, 7);
        sybVar.m = w3a.x(getContext(), Y, 25);
        sybVar.n = w3a.x(getContext(), Y, 18);
        sybVar.s = Y.getBoolean(6, false);
        sybVar.v = Y.getDimensionPixelSize(10, 0);
        sybVar.t = Y.getBoolean(27, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (Y.hasValue(0)) {
            sybVar.q = true;
            setSupportBackgroundTintList(sybVar.l);
            setSupportBackgroundTintMode(sybVar.k);
        } else {
            sybVar.c();
        }
        setPaddingRelative(paddingStart + sybVar.e, paddingTop + sybVar.g, paddingEnd + sybVar.f, paddingBottom + sybVar.h);
        setCheckedInternal(Y.getBoolean(1, false));
        if (g instanceof jdi) {
            sybVar.c = yfa.F(getContext());
            if (sybVar.b instanceof jdi) {
                sybVar.d();
            }
        }
        setOpticalCenterEnabled(z2);
        Y.recycle();
        setCompoundDrawablePadding(this.r);
        t(this.i != null);
        w(this.l != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.K;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        qzb a;
        if (this.D && this.F && (a = this.d.a(false)) != null) {
            return (int) (a.j() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f);
    }

    private void setCheckedInternal(boolean z) {
        if (!i() || this.u == z) {
            return;
        }
        this.u = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.u;
            if (!materialButtonToggleGroup.n) {
                materialButtonToggleGroup.l(getId(), z2);
            }
        }
        if (this.v) {
            return;
        }
        this.v = true;
        Iterator it = this.e.iterator();
        if (it.hasNext()) {
            throw lnb.i(it);
        }
        this.v = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f) {
        if (this.K != f) {
            this.K = f;
            v();
            invalidate();
            if (getParent() instanceof ryb) {
                ryb rybVar = (ryb) getParent();
                int i = (int) this.K;
                int indexOfChild = rybVar.indexOfChild(this);
                if (indexOfChild < 0) {
                    return;
                }
                MaterialButton h = rybVar.h(indexOfChild);
                MaterialButton g = rybVar.g(indexOfChild);
                if (h == null && g == null) {
                    return;
                }
                if (h == null) {
                    g.setDisplayedWidthDecrease(i);
                }
                if (g == null) {
                    h.setDisplayedWidthDecrease(i);
                }
                if (h == null || g == null) {
                    return;
                }
                h.setDisplayedWidthDecrease(i / 2);
                g.setDisplayedWidthDecrease((i + 1) / 2);
            }
        }
    }

    public final boolean c() {
        if (k() && n()) {
            return true;
        }
        if (j() && m()) {
            return true;
        }
        return l() && o();
    }

    public final boolean d(int i) {
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        return i == 1 || i == 3 || (i == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE);
    }

    public final int e(int i, int i2) {
        int i3;
        int i4;
        Drawable drawable = this.i;
        if (drawable != null) {
            i3 = this.o;
            if (i3 == 0) {
                i3 = drawable.getIntrinsicWidth();
            }
        } else {
            i3 = 0;
        }
        Drawable drawable2 = this.l;
        if (drawable2 != null) {
            i4 = this.o;
            if (i4 == 0) {
                i4 = drawable2.getIntrinsicWidth();
            }
        } else {
            i4 = 0;
        }
        int textLayoutWidth = (((((i - getTextLayoutWidth()) - getPaddingEnd()) - i3) - i4) - this.r) - getPaddingStart();
        if (getActualTextAlignment() == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        return (getLayoutDirection() == 1) != (i2 == 4) ? -textLayoutWidth : textLayoutWidth;
    }

    public final int f(int i, int i2) {
        return Math.max(0, (((((i - getTextHeight()) - getPaddingTop()) - i2) - this.r) - getPaddingBottom()) / 2);
    }

    public final Drawable g(int i) {
        if (i == 0) {
            if (this.l == null || !n()) {
                return null;
            }
            return this.l;
        }
        if (i == 1) {
            if (this.l == null || !o()) {
                return null;
            }
            return this.l;
        }
        if (i == 2 && this.l != null && m()) {
            return this.l;
        }
        return null;
    }

    @NonNull
    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.n)) {
            return (i() ? CompoundButton.class : Button.class).getName();
        }
        return this.n;
    }

    public int getAllowedWidthDecrease() {
        return this.G;
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (p()) {
            return this.d.i;
        }
        return 0;
    }

    @Nullable
    public e0i getCornerSpringForce() {
        return this.d.c;
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.w;
    }

    public int getIconPadding() {
        return this.r;
    }

    public int getIconSize() {
        return this.o;
    }

    public ColorStateList getIconTint() {
        return this.h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.g;
    }

    public int getInsetBottom() {
        return this.d.h;
    }

    public int getInsetLeft() {
        return this.d.e;
    }

    public int getInsetRight() {
        return this.d.f;
    }

    public int getInsetTop() {
        return this.d.g;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        if (p()) {
            return this.d.n;
        }
        return null;
    }

    @Nullable
    public Drawable getSecondaryIcon() {
        return this.l;
    }

    public int getSecondaryIconGravity() {
        return this.x;
    }

    public ColorStateList getSecondaryIconTint() {
        return this.k;
    }

    public PorterDuff.Mode getSecondaryIconTintMode() {
        return this.j;
    }

    @NonNull
    public vah getShapeAppearance() {
        if (p()) {
            return this.d.b;
        }
        a70.r("Attempted to get ShapeAppearance from a MaterialButton which has an overwritten background.");
        return null;
    }

    @NonNull
    public xah getShapeAppearanceModel() {
        if (p()) {
            return this.d.b.d();
        }
        a70.r("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (p()) {
            return this.d.m;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (p()) {
            return this.d.j;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        return p() ? this.d.l : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return p() ? this.d.k : super.getSupportBackgroundTintMode();
    }

    public final Drawable h(int i) {
        if (i == 0) {
            if (this.i == null || !k()) {
                return null;
            }
            return this.i;
        }
        if (i == 1) {
            if (this.i == null || !j()) {
                return null;
            }
            return this.i;
        }
        if (i == 2 && this.i != null && j()) {
            return this.i;
        }
        return null;
    }

    public final boolean i() {
        syb sybVar = this.d;
        return sybVar != null && sybVar.s;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.u;
    }

    public final boolean j() {
        int i = this.w;
        return i == 3 || i == 4;
    }

    public final boolean k() {
        int i = this.w;
        return i == 1 || i == 2;
    }

    public final boolean l() {
        int i = this.w;
        return i == 16 || i == 32;
    }

    public final boolean m() {
        int i = this.x;
        return i == 3 || i == 4;
    }

    public final boolean n() {
        int i = this.x;
        return i == 1 || i == 2;
    }

    public final boolean o() {
        int i = this.x;
        return i == 16 || i == 32;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (p()) {
            l4a.I(this, this.d.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (i()) {
            View.mergeDrawableStates(onCreateDrawableState, N);
        }
        if (this.u) {
            View.mergeDrawableStates(onCreateDrawableState, O);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.u);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(i());
        accessibilityNodeInfo.setChecked(this.u);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        u(getMeasuredWidth(), getMeasuredHeight());
        x(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.y != i6) {
            this.y = i6;
            this.z = -2.1474836E9f;
        }
        if (this.z == -2.1474836E9f) {
            this.z = getMeasuredWidth();
            if (this.C == null && (getParent() instanceof ryb) && ((ryb) getParent()).getButtonSizeChange() != null) {
                this.C = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.C);
                layoutParams.width = (int) this.z;
                setLayoutParams(layoutParams);
            }
        }
        boolean z2 = false;
        if (this.G == Integer.MIN_VALUE) {
            if (this.i == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int i7 = this.o;
                if (i7 == 0) {
                    i7 = this.i.getIntrinsicWidth();
                }
                i5 = iconPadding + i7;
            }
            this.G = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.A == Integer.MIN_VALUE) {
            this.A = getPaddingStart();
        }
        if (this.B == Integer.MIN_VALUE) {
            this.B = getPaddingEnd();
        }
        if ((getParent() instanceof ryb) && ((ryb) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.F = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        setChecked(savedState.c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = this.u;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        u(getMeasuredWidth(), getMeasuredHeight());
        x(getMeasuredWidth(), getMeasuredHeight());
    }

    public final boolean p() {
        syb sybVar = this.d;
        return (sybVar == null || sybVar.q) ? false : true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean z;
        if (isEnabled() && this.d.t) {
            toggle();
            z = true;
        } else {
            z = false;
        }
        boolean performClick = super.performClick();
        if (z && !performClick) {
            playSoundEffect(0);
        }
        return performClick;
    }

    public final /* synthetic */ void q() {
        this.E = getOpticalCenterShift();
        v();
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        if (r4 == 2) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(boolean z) {
        int i;
        if (this.H == null) {
            return;
        }
        if (this.M == null) {
            d0i d0iVar = new d0i(this, P);
            this.M = d0iVar;
            d0iVar.m = yfa.F(getContext());
        }
        if (this.F) {
            int ordinal = this.J.ordinal();
            int i2 = 0;
            int i3 = (ordinal == 1 || ordinal == 2) ? this.I / 2 : ordinal != 3 ? 0 : this.I;
            ldi ldiVar = this.H;
            int[] drawableState = getDrawableState();
            int[][] iArr = ldiVar.c;
            int i4 = 0;
            while (true) {
                i = -1;
                if (i4 >= ldiVar.a) {
                    i4 = -1;
                    break;
                } else if (StateSet.stateSetMatches(iArr[i4], drawableState)) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 < 0) {
                int[] iArr2 = StateSet.WILD_CARD;
                int[][] iArr3 = ldiVar.c;
                int i5 = 0;
                while (true) {
                    if (i5 >= ldiVar.a) {
                        break;
                    }
                    if (StateSet.stateSetMatches(iArr3[i5], iArr2)) {
                        i = i5;
                        break;
                    }
                    i5++;
                }
                i4 = i;
            }
            kdi kdiVar = (kdi) (i4 < 0 ? ldiVar.b : ldiVar.d[i4]).a;
            int width = getWidth();
            float f = kdiVar.b;
            int i6 = kdiVar.a;
            if (i6 == 1) {
                f *= width;
            }
            i2 = (int) f;
            this.M.a(Math.min(i3, i2));
            if (z) {
                this.M.e();
            }
        }
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.i != null) {
            if (this.i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public final boolean s(Runnable runnable) {
        d0i d0iVar = this.M;
        if (d0iVar == null || !d0iVar.f) {
            return false;
        }
        post(new yq5(22, this, runnable));
        return true;
    }

    public void setA11yClassName(@Nullable String str) {
        this.n = str;
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!p()) {
            super.setBackgroundColor(i);
            return;
        }
        syb sybVar = this.d;
        if (sybVar.a(false) != null) {
            sybVar.a(false).setTint(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (!p()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        syb sybVar = this.d;
        sybVar.q = true;
        MaterialButton materialButton = sybVar.a;
        materialButton.setSupportBackgroundTintList(sybVar.l);
        materialButton.setSupportBackgroundTintMode(sybVar.k);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? td4.d0(i, getContext()) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (p()) {
            this.d.s = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablePadding(int i) {
        if (getCompoundDrawablePadding() != i) {
            this.z = -2.1474836E9f;
        }
        super.setCompoundDrawablePadding(i);
    }

    public void setCornerRadius(int i) {
        if (p()) {
            syb sybVar = this.d;
            if (sybVar.r && sybVar.i == i) {
                return;
            }
            sybVar.i = i;
            sybVar.r = true;
            sybVar.b = sybVar.b.a(i);
            sybVar.d();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (p()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(@NonNull e0i e0iVar) {
        syb sybVar = this.d;
        sybVar.c = e0iVar;
        if (sybVar.b instanceof jdi) {
            sybVar.d();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.L = Math.min(i, this.G);
        v();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (p()) {
            this.d.a(false).s(f);
        }
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (this.i == drawable || s(new nyb(this, drawable, 1))) {
            return;
        }
        this.z = -2.1474836E9f;
        this.i = drawable;
        t(true);
        u(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setIconGravity(int i) {
        if (this.w != i) {
            if (this.i != null && this.l != null && c()) {
                a70.p("iconGravity cannot have the same alignment as secondaryIconGravity");
            } else {
                this.w = i;
                u(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setIconPadding(int i) {
        if (this.r != i) {
            this.r = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? td4.d0(i, getContext()) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            a70.p("iconSize cannot be less than 0");
            return;
        }
        if (this.o == i || s(new pn0(this, i, 10))) {
            return;
        }
        this.z = -2.1474836E9f;
        this.o = i;
        t(true);
        w(true);
    }

    public void setIconTint(@Nullable ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            t(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.g != mode) {
            this.g = mode;
            t(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(eq3.q(i, getContext()));
    }

    public void setInsetBottom(int i) {
        syb sybVar = this.d;
        sybVar.b(sybVar.e, sybVar.g, sybVar.f, i);
    }

    public void setInsetLeft(int i) {
        syb sybVar = this.d;
        sybVar.b(i, sybVar.g, sybVar.f, sybVar.h);
    }

    public void setInsetRight(int i) {
        syb sybVar = this.d;
        sybVar.b(sybVar.e, sybVar.g, i, sybVar.h);
    }

    public void setInsetTop(int i) {
        syb sybVar = this.d;
        sybVar.b(sybVar.e, i, sybVar.f, sybVar.h);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(@Nullable oyb oybVar) {
        this.f = oybVar;
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.D != z) {
            this.D = z;
            syb sybVar = this.d;
            if (z) {
                kr9 kr9Var = new kr9(this, 7);
                sybVar.d = kr9Var;
                qzb a = sybVar.a(false);
                if (a != null) {
                    a.E = kr9Var;
                }
            } else {
                sybVar.d = null;
                qzb a2 = sybVar.a(false);
                if (a2 != null) {
                    a2.E = null;
                }
            }
            post(new yp8(this, 13));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        oyb oybVar = this.f;
        if (oybVar != null) {
            ((MaterialButtonToggleGroup) ((cqa) oybVar).a).invalidate();
        }
        super.setPressed(z);
        r(false);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (p()) {
            syb sybVar = this.d;
            MaterialButton materialButton = sybVar.a;
            if (sybVar.n != colorStateList) {
                sybVar.n = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(rfo.J(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (p()) {
            setRippleColor(eq3.q(i, getContext()));
        }
    }

    public void setSecondaryIcon(@Nullable Drawable drawable) {
        if (this.l == drawable || s(new nyb(this, drawable, 0))) {
            return;
        }
        this.z = -2.1474836E9f;
        this.l = drawable;
        this.m = false;
        w(true);
        x(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setSecondaryIconGravity(int i) {
        if (this.x != i) {
            if (this.l != null && this.i != null && c()) {
                a70.p("secondaryIconGravity cannot have the same alignment as iconGravity");
            } else {
                this.x = i;
                x(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setSecondaryIconResource(int i) {
        setSecondaryIcon(i != 0 ? td4.d0(i, getContext()) : null);
    }

    public void setSecondaryIconTint(@Nullable ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            w(false);
        }
    }

    public void setSecondaryIconTintMode(PorterDuff.Mode mode) {
        if (this.j != mode) {
            this.j = mode;
            w(false);
        }
    }

    public void setSecondaryIconTintResource(int i) {
        setSecondaryIconTint(eq3.q(i, getContext()));
    }

    public void setShapeAppearance(@NonNull vah vahVar) {
        if (!p()) {
            a70.r("Attempted to set ShapeAppearance on a MaterialButton which has an overwritten background.");
            return;
        }
        syb sybVar = this.d;
        if (sybVar.c == null && vahVar.f()) {
            sybVar.c = yfa.F(getContext());
            if (sybVar.b instanceof jdi) {
                sybVar.d();
            }
        }
        sybVar.b = vahVar;
        sybVar.d();
    }

    @Override // defpackage.ach
    public void setShapeAppearanceModel(@NonNull xah xahVar) {
        if (!p()) {
            a70.r("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
            return;
        }
        syb sybVar = this.d;
        sybVar.b = xahVar;
        sybVar.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (p()) {
            syb sybVar = this.d;
            sybVar.p = z;
            sybVar.e();
        }
    }

    public void setSizeChange(@NonNull ldi ldiVar) {
        if (this.H != ldiVar) {
            this.H = ldiVar;
            r(true);
        }
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        if (p()) {
            syb sybVar = this.d;
            if (sybVar.m != colorStateList) {
                sybVar.m = colorStateList;
                sybVar.e();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (p()) {
            setStrokeColor(eq3.q(i, getContext()));
        }
    }

    public void setStrokeWidth(int i) {
        if (p()) {
            syb sybVar = this.d;
            if (sybVar.j != i) {
                sybVar.j = i;
                sybVar.e();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (p()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (!p()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        syb sybVar = this.d;
        if (sybVar.l != colorStateList) {
            sybVar.l = colorStateList;
            if (sybVar.a(false) != null) {
                sybVar.a(false).setTintList(sybVar.l);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (!p()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        syb sybVar = this.d;
        if (sybVar.k != mode) {
            sybVar.k = mode;
            if (sybVar.a(false) == null || sybVar.k == null) {
                return;
            }
            sybVar.a(false).setTintMode(sybVar.k);
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.z = -2.1474836E9f;
        super.setText(charSequence, bufferType);
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        u(getMeasuredWidth(), getMeasuredHeight());
        x(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        this.z = -2.1474836E9f;
        super.setTextAppearance(context, i);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void setTextSize(int i, float f) {
        this.z = -2.1474836E9f;
        super.setTextSize(i, f);
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.d.t = z;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.z = -2.1474836E9f;
        super.setWidth(i);
    }

    public void setWidthChangeDirection(@NonNull pyb pybVar) {
        if (this.J != pybVar) {
            this.J = pybVar;
            r(true);
        }
    }

    public void setWidthChangeMax(int i) {
        if (this.I != i) {
            this.I = i;
            r(true);
        }
    }

    public final void t(boolean z) {
        Drawable drawable = this.i;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.i = mutate;
            mutate.setTintList(this.h);
            PorterDuff.Mode mode = this.g;
            if (mode != null) {
                this.i.setTintMode(mode);
            }
            int i = this.o;
            if (i == 0) {
                i = this.i.getIntrinsicWidth();
            }
            int i2 = this.o;
            if (i2 == 0) {
                i2 = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i3 = this.p;
            int i4 = this.q;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.i.setVisible(true, z);
        }
        if (this.i != null && this.l != null && c()) {
            a70.p("iconGravity cannot have the same alignment as secondaryIconGravity");
            return;
        }
        if (this.i == null && this.l != null && c()) {
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (k() && compoundDrawablesRelative[0] != this.i) || (j() && compoundDrawablesRelative[2] != this.i) || (l() && compoundDrawablesRelative[1] != this.i);
        if (z || z2) {
            if (k()) {
                setCompoundDrawablesRelative(this.i, g(1), g(2), null);
            } else if (j()) {
                setCompoundDrawablesRelative(g(0), g(1), this.i, null);
            } else if (l()) {
                setCompoundDrawablesRelative(g(0), this.i, g(2), null);
            }
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.u);
    }

    public final void u(int i, int i2) {
        if (this.i == null || getLayout() == null) {
            return;
        }
        if (k() || j()) {
            this.q = 0;
            if (d(this.w)) {
                this.p = 0;
                t(false);
                return;
            }
            int e = e(i, this.w);
            if (this.p != e) {
                this.p = e;
                t(false);
                return;
            }
            return;
        }
        if (l()) {
            this.p = 0;
            if (this.w == 16) {
                this.q = 0;
                t(false);
                return;
            }
            int i3 = this.o;
            if (i3 == 0) {
                i3 = this.i.getIntrinsicHeight();
            }
            int f = f(i2, i3);
            if (this.q != f) {
                this.q = f;
                t(false);
            }
        }
    }

    public final void v() {
        int i = (int) (this.K - this.L);
        boolean z = getLayoutDirection() == 1;
        int i2 = this.E;
        if (z) {
            i2 = -i2;
        }
        int i3 = (i / 2) + i2;
        if (getLayoutParams() != null) {
            getLayoutParams().width = (int) (this.z + i);
        }
        setPaddingRelative(this.A + i3, getPaddingTop(), (this.B + i) - i3, getPaddingBottom());
    }

    public final void w(boolean z) {
        Drawable drawable = this.l;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.l = mutate;
            mutate.setTintList(this.k);
            PorterDuff.Mode mode = this.j;
            if (mode != null) {
                this.l.setTintMode(mode);
            }
            int i = this.o;
            if (i == 0) {
                i = this.l.getIntrinsicWidth();
            }
            int i2 = this.o;
            if (i2 == 0) {
                i2 = this.l.getIntrinsicHeight();
            }
            Drawable drawable2 = this.l;
            int i3 = this.s;
            int i4 = this.t;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.l.setVisible(true, z);
        }
        if (this.l != null && this.i != null && c()) {
            a70.p("secondaryIconGravity cannot have the same alignment as iconGravity");
            return;
        }
        if (this.l == null) {
            if (this.m) {
                return;
            }
            if (this.i != null && c()) {
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (n() && compoundDrawablesRelative[0] != this.l) || (m() && compoundDrawablesRelative[2] != this.l) || (o() && compoundDrawablesRelative[1] != this.l);
        if (z || z2) {
            if (n()) {
                setCompoundDrawablesRelative(this.l, h(1), h(2), null);
            } else if (m()) {
                setCompoundDrawablesRelative(h(0), h(1), this.l, null);
            } else if (o()) {
                setCompoundDrawablesRelative(h(0), this.l, h(2), null);
            }
        }
    }

    public final void x(int i, int i2) {
        if (this.l == null || getLayout() == null) {
            return;
        }
        if (n() || m()) {
            this.t = 0;
            if (d(this.x)) {
                this.s = 0;
                w(false);
                return;
            }
            int e = e(i, this.x);
            if (this.s != e) {
                this.s = e;
                w(false);
                return;
            }
            return;
        }
        if (o()) {
            this.s = 0;
            if (this.x == 16) {
                this.t = 0;
                w(false);
                return;
            }
            int i3 = this.o;
            if (i3 == 0) {
                i3 = this.l.getIntrinsicHeight();
            }
            int f = f(i2, i3);
            if (this.t != f) {
                this.t = f;
                w(false);
            }
        }
    }

    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.sofascore.results.R.attr.materialButtonStyle);
    }
}
