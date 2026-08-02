package com.google.android.material.button;

import O0.i;
import O0.m;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.shape.i;
import com.google.android.material.shape.j;
import com.google.android.material.shape.n;
import com.google.android.material.shape.q;
import com.google.android.material.shape.s;
import com.google.android.material.shape.t;
import ia.c;
import ia.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n.AbstractC5596a;
import n0.AbstractC5597a;
import oa.C5863d;
import xa.o;
import za.h;

/* loaded from: classes3.dex */
public class MaterialButton extends AppCompatButton implements Checkable, q {
    private static final int[] CHECKABLE_STATE_SET = {R.attr.state_checkable};
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};

    /* renamed from: F, reason: collision with root package name */
    public static final int f35022F = l.f48585x;

    /* renamed from: G, reason: collision with root package name */
    public static final int f35023G = c.f48209N;

    /* renamed from: H, reason: collision with root package name */
    public static final i f35024H = new a("widthIncrease");

    /* renamed from: A, reason: collision with root package name */
    public t f35025A;

    /* renamed from: B, reason: collision with root package name */
    public int f35026B;

    /* renamed from: C, reason: collision with root package name */
    public float f35027C;

    /* renamed from: D, reason: collision with root package name */
    public float f35028D;

    /* renamed from: E, reason: collision with root package name */
    public O0.l f35029E;

    /* renamed from: d, reason: collision with root package name */
    public final C5863d f35030d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f35031e;

    /* renamed from: f, reason: collision with root package name */
    public b f35032f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f35033g;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f35034h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f35035i;

    /* renamed from: j, reason: collision with root package name */
    public String f35036j;

    /* renamed from: k, reason: collision with root package name */
    public int f35037k;

    /* renamed from: l, reason: collision with root package name */
    public int f35038l;

    /* renamed from: m, reason: collision with root package name */
    public int f35039m;

    /* renamed from: n, reason: collision with root package name */
    public int f35040n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f35041o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f35042p;

    /* renamed from: q, reason: collision with root package name */
    public int f35043q;

    /* renamed from: r, reason: collision with root package name */
    public int f35044r;

    /* renamed from: s, reason: collision with root package name */
    public float f35045s;

    /* renamed from: t, reason: collision with root package name */
    public int f35046t;

    /* renamed from: u, reason: collision with root package name */
    public int f35047u;

    /* renamed from: v, reason: collision with root package name */
    public LinearLayout.LayoutParams f35048v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f35049w;

    /* renamed from: x, reason: collision with root package name */
    public int f35050x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f35051y;

    /* renamed from: z, reason: collision with root package name */
    public int f35052z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public boolean f35053c;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void b(Parcel parcel) {
            this.f35053c = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f35053c ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }
    }

    public class a extends i {
        public a(String str) {
            super(str);
        }

        @Override // O0.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(MaterialButton materialButton) {
            return materialButton.getDisplayedWidthIncrease();
        }

        @Override // O0.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MaterialButton materialButton, float f10) {
            materialButton.setDisplayedWidthIncrease(f10);
        }
    }

    public interface b {
        void a(MaterialButton materialButton, boolean z10);
    }

    public MaterialButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f48202G);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.f35050x = materialButton.getOpticalCenterShift();
        materialButton.s();
        materialButton.invalidate();
    }

    public static /* synthetic */ void b(MaterialButton materialButton, float f10) {
        int i10 = (int) (f10 * 0.11f);
        if (materialButton.f35050x != i10) {
            materialButton.f35050x = i10;
            materialButton.s();
            materialButton.invalidate();
        }
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.f35027C;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        com.google.android.material.shape.i g10;
        if (this.f35049w && this.f35051y && (g10 = this.f35030d.g()) != null) {
            return (int) (g10.z() * 0.11f);
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
        float f10 = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            f10 = Math.max(f10, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(f10);
    }

    private void setCheckedInternal(boolean z10) {
        if (!g() || this.f35041o == z10) {
            return;
        }
        this.f35041o = z10;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            ((MaterialButtonToggleGroup) getParent()).x(this, this.f35041o);
        }
        if (this.f35042p) {
            return;
        }
        this.f35042p = true;
        Iterator it = this.f35031e.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        this.f35042p = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f10) {
        if (this.f35027C != f10) {
            this.f35027C = f10;
            s();
            invalidate();
            if (getParent() instanceof com.google.android.material.button.a) {
                ((com.google.android.material.button.a) getParent()).k(this, (int) this.f35027C);
            }
        }
    }

    public final m e() {
        return h.h(getContext(), c.f48233f0, l.f48563b);
    }

    public final void f() {
        O0.l lVar = new O0.l(this, f35024H);
        this.f35029E = lVar;
        lVar.x(e());
    }

    public boolean g() {
        C5863d c5863d = this.f35030d;
        return c5863d != null && c5863d.r();
    }

    @NonNull
    @SuppressLint({"KotlinPropertyAccess"})
    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f35036j)) {
            return (g() ? CompoundButton.class : Button.class).getName();
        }
        return this.f35036j;
    }

    public int getAllowedWidthDecrease() {
        return this.f35052z;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m()) {
            return this.f35030d.b();
        }
        return 0;
    }

    public m getCornerSpringForce() {
        return this.f35030d.c();
    }

    public Drawable getIcon() {
        return this.f35035i;
    }

    public int getIconGravity() {
        return this.f35043q;
    }

    public int getIconPadding() {
        return this.f35040n;
    }

    public int getIconSize() {
        return this.f35037k;
    }

    public ColorStateList getIconTint() {
        return this.f35034h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f35033g;
    }

    public int getInsetBottom() {
        return this.f35030d.d();
    }

    public int getInsetTop() {
        return this.f35030d.e();
    }

    public ColorStateList getRippleColor() {
        if (m()) {
            return this.f35030d.i();
        }
        return null;
    }

    @NonNull
    public n getShapeAppearanceModel() {
        if (m()) {
            return this.f35030d.j();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public s getStateListShapeAppearanceModel() {
        if (m()) {
            return this.f35030d.k();
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m()) {
            return this.f35030d.l();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m()) {
            return this.f35030d.m();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return m() ? this.f35030d.n() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m() ? this.f35030d.o() : super.getSupportBackgroundTintMode();
    }

    public final boolean h() {
        int i10 = this.f35043q;
        return i10 == 3 || i10 == 4;
    }

    public final boolean i() {
        int i10 = this.f35043q;
        return i10 == 1 || i10 == 2;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f35041o;
    }

    public final boolean j() {
        int i10 = this.f35043q;
        return i10 == 16 || i10 == 32;
    }

    public final boolean k() {
        return (getParent() instanceof com.google.android.material.button.a) && ((com.google.android.material.button.a) getParent()).getOrientation() == 0;
    }

    public final boolean l() {
        return getLayoutDirection() == 1;
    }

    public final boolean m() {
        C5863d c5863d = this.f35030d;
        return (c5863d == null || c5863d.q()) ? false : true;
    }

    public final void n(boolean z10) {
        if (this.f35025A == null) {
            return;
        }
        if (this.f35029E == null) {
            f();
        }
        if (this.f35051y) {
            this.f35029E.t(Math.min(this.f35026B, this.f35025A.e(getDrawableState()).f35900a.a(getWidth())));
            if (z10) {
                this.f35029E.y();
            }
        }
    }

    public void o() {
        LinearLayout.LayoutParams layoutParams = this.f35048v;
        if (layoutParams != null) {
            setLayoutParams(layoutParams);
            this.f35048v = null;
            this.f35045s = -1.0f;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m()) {
            j.f(this, this.f35030d.g());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (g()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKABLE_STATE_SET);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(g());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        r(getMeasuredWidth(), getMeasuredHeight());
        int i15 = getResources().getConfiguration().orientation;
        if (this.f35044r != i15) {
            this.f35044r = i15;
            this.f35045s = -1.0f;
        }
        if (this.f35045s == -1.0f) {
            this.f35045s = getMeasuredWidth();
            if (this.f35048v == null && (getParent() instanceof com.google.android.material.button.a) && ((com.google.android.material.button.a) getParent()).getButtonSizeChange() != null) {
                this.f35048v = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f35048v);
                layoutParams.width = (int) this.f35045s;
                setLayoutParams(layoutParams);
            }
        }
        if (this.f35052z == -1) {
            if (this.f35035i == null) {
                i14 = 0;
            } else {
                int iconPadding = getIconPadding();
                int i16 = this.f35037k;
                if (i16 == 0) {
                    i16 = this.f35035i.getIntrinsicWidth();
                }
                i14 = iconPadding + i16;
            }
            this.f35052z = (getMeasuredWidth() - getTextLayoutWidth()) - i14;
        }
        if (this.f35046t == -1) {
            this.f35046t = getPaddingStart();
        }
        if (this.f35047u == -1) {
            this.f35047u = getPaddingEnd();
        }
        this.f35051y = k();
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setChecked(savedState.f35053c);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f35053c = this.f35041o;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        r(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void p() {
        if (i()) {
            setCompoundDrawablesRelative(this.f35035i, null, null, null);
        } else if (h()) {
            setCompoundDrawablesRelative(null, null, this.f35035i, null);
        } else if (j()) {
            setCompoundDrawablesRelative(null, this.f35035i, null, null);
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        if (isEnabled() && this.f35030d.s()) {
            toggle();
        }
        return super.performClick();
    }

    public final void q(boolean z10) {
        Drawable drawable = this.f35035i;
        if (drawable != null) {
            Drawable mutate = AbstractC5597a.r(drawable).mutate();
            this.f35035i = mutate;
            mutate.setTintList(this.f35034h);
            PorterDuff.Mode mode = this.f35033g;
            if (mode != null) {
                this.f35035i.setTintMode(mode);
            }
            int i10 = this.f35037k;
            if (i10 == 0) {
                i10 = this.f35035i.getIntrinsicWidth();
            }
            int i11 = this.f35037k;
            if (i11 == 0) {
                i11 = this.f35035i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f35035i;
            int i12 = this.f35038l;
            int i13 = this.f35039m;
            drawable2.setBounds(i12, i13, i10 + i12, i11 + i13);
            this.f35035i.setVisible(true, z10);
        }
        if (z10) {
            p();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!i() || drawable3 == this.f35035i) && ((!h() || drawable5 == this.f35035i) && (!j() || drawable4 == this.f35035i))) {
            return;
        }
        p();
    }

    public final void r(int i10, int i11) {
        if (this.f35035i == null || getLayout() == null) {
            return;
        }
        if (!i() && !h()) {
            if (j()) {
                this.f35038l = 0;
                if (this.f35043q == 16) {
                    this.f35039m = 0;
                    q(false);
                    return;
                }
                int i12 = this.f35037k;
                if (i12 == 0) {
                    i12 = this.f35035i.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - i12) - this.f35040n) - getPaddingBottom()) / 2);
                if (this.f35039m != max) {
                    this.f35039m = max;
                    q(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f35039m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i13 = this.f35043q;
        if (i13 == 1 || i13 == 3 || ((i13 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i13 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f35038l = 0;
            q(false);
            return;
        }
        int i14 = this.f35037k;
        if (i14 == 0) {
            i14 = this.f35035i.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i10 - getTextLayoutWidth()) - getPaddingEnd()) - i14) - this.f35040n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (l() != (this.f35043q == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f35038l != textLayoutWidth) {
            this.f35038l = textLayoutWidth;
            q(false);
        }
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f35035i != null) {
            if (this.f35035i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public final void s() {
        int i10 = (int) (this.f35027C - this.f35028D);
        int i11 = (i10 / 2) + this.f35050x;
        getLayoutParams().width = (int) (this.f35045s + i10);
        setPaddingRelative(this.f35046t + i11, getPaddingTop(), (this.f35047u + i10) - i11, getPaddingBottom());
    }

    public void setA11yClassName(String str) {
        this.f35036j = str;
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (m()) {
            this.f35030d.u(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (!m()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f35030d.v();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? AbstractC5596a.b(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (m()) {
            this.f35030d.w(z10);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedInternal(z10);
    }

    public void setCornerRadius(int i10) {
        if (m()) {
            this.f35030d.x(i10);
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (m()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCornerSpringForce(@NonNull m mVar) {
        this.f35030d.z(mVar);
    }

    public void setDisplayedWidthDecrease(int i10) {
        this.f35028D = Math.min(i10, this.f35052z);
        s();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (m()) {
            this.f35030d.g().e0(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f35035i != drawable) {
            this.f35035i = drawable;
            q(true);
            r(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f35043q != i10) {
            this.f35043q = i10;
            r(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f35040n != i10) {
            this.f35040n = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? AbstractC5596a.b(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f35037k != i10) {
            this.f35037k = i10;
            q(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f35034h != colorStateList) {
            this.f35034h = colorStateList;
            q(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f35033g != mode) {
            this.f35033g = mode;
            q(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(AbstractC5596a.a(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        this.f35030d.A(i10);
    }

    public void setInsetTop(int i10) {
        this.f35030d.B(i10);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f35032f = bVar;
    }

    public void setOpticalCenterEnabled(boolean z10) {
        if (this.f35049w != z10) {
            this.f35049w = z10;
            if (z10) {
                this.f35030d.y(new i.d() { // from class: oa.a
                    @Override // com.google.android.material.shape.i.d
                    public final void a(float f10) {
                        MaterialButton.b(MaterialButton.this, f10);
                    }
                });
            } else {
                this.f35030d.y(null);
            }
            post(new Runnable() { // from class: oa.b
                @Override // java.lang.Runnable
                public final void run() {
                    MaterialButton.a(MaterialButton.this);
                }
            });
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        b bVar = this.f35032f;
        if (bVar != null) {
            bVar.a(this, z10);
        }
        super.setPressed(z10);
        n(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m()) {
            this.f35030d.C(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        if (m()) {
            setRippleColor(AbstractC5596a.a(getContext(), i10));
        }
    }

    @Override // com.google.android.material.shape.q
    public void setShapeAppearanceModel(@NonNull n nVar) {
        if (!m()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f35030d.D(nVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (m()) {
            this.f35030d.E(z10);
        }
    }

    public void setSizeChange(@NonNull t tVar) {
        if (this.f35025A != tVar) {
            this.f35025A = tVar;
            n(true);
        }
    }

    public void setStateListShapeAppearanceModel(@NonNull s sVar) {
        if (!m()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        if (this.f35030d.c() == null && sVar.f()) {
            this.f35030d.z(e());
        }
        this.f35030d.F(sVar);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m()) {
            this.f35030d.G(colorStateList);
        }
    }

    public void setStrokeColorResource(int i10) {
        if (m()) {
            setStrokeColor(AbstractC5596a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (m()) {
            this.f35030d.H(i10);
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (m()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m()) {
            this.f35030d.I(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m()) {
            this.f35030d.J(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        r(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f35030d.K(z10);
    }

    @Override // android.widget.TextView
    public void setWidth(int i10) {
        this.f35045s = -1.0f;
        super.setWidth(i10);
    }

    public void setWidthChangeMax(int i10) {
        if (this.f35026B != i10) {
            this.f35026B = i10;
            n(true);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f35041o);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialButton(Context context, AttributeSet attributeSet, int i10) {
        super(La.a.e(context, attributeSet, i10, r4, new int[]{f35023G}), attributeSet, i10);
        int i11 = f35022F;
        this.f35031e = new LinkedHashSet();
        this.f35041o = false;
        this.f35042p = false;
        this.f35044r = -1;
        this.f35045s = -1.0f;
        this.f35046t = -1;
        this.f35047u = -1;
        this.f35052z = -1;
        Context context2 = getContext();
        TypedArray i12 = xa.l.i(context2, attributeSet, ia.m.MaterialButton, i10, i11, new int[0]);
        this.f35040n = i12.getDimensionPixelSize(ia.m.f48944k3, 0);
        this.f35033g = o.k(i12.getInt(ia.m.f48974n3, -1), PorterDuff.Mode.SRC_IN);
        this.f35034h = Ca.c.a(getContext(), i12, ia.m.f48964m3);
        this.f35035i = Ca.c.e(getContext(), i12, ia.m.f48924i3);
        this.f35043q = i12.getInteger(ia.m.f48934j3, 1);
        this.f35037k = i12.getDimensionPixelSize(ia.m.f48954l3, 0);
        s b10 = s.b(context2, i12, ia.m.f49004q3);
        n c10 = b10 != null ? b10.c(true) : n.e(context2, attributeSet, i10, i11).m();
        boolean z10 = i12.getBoolean(ia.m.f48984o3, false);
        C5863d c5863d = new C5863d(this, c10);
        this.f35030d = c5863d;
        c5863d.t(i12);
        setCheckedInternal(i12.getBoolean(ia.m.f48825Y2, false));
        if (b10 != null) {
            c5863d.z(e());
            c5863d.F(b10);
        }
        setOpticalCenterEnabled(z10);
        i12.recycle();
        setCompoundDrawablePadding(this.f35040n);
        q(this.f35035i != null);
    }
}
