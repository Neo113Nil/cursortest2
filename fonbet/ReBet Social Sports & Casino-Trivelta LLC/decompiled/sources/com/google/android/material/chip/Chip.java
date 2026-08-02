package com.google.android.material.chip;

import Ca.e;
import Ca.g;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.AbstractC2082d0;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.a;
import com.google.android.material.shape.j;
import com.google.android.material.shape.n;
import com.google.android.material.shape.q;
import ia.k;
import ia.l;
import ia.m;
import io.agora.rtc2.internal.RtcEngineEvent;
import ja.C5110g;
import java.util.List;
import xa.f;
import y0.z;

/* loaded from: classes3.dex */
public class Chip extends AppCompatCheckBox implements a.InterfaceC0498a, q, Checkable {

    /* renamed from: e, reason: collision with root package name */
    public com.google.android.material.chip.a f35169e;

    /* renamed from: f, reason: collision with root package name */
    public InsetDrawable f35170f;

    /* renamed from: g, reason: collision with root package name */
    public RippleDrawable f35171g;

    /* renamed from: h, reason: collision with root package name */
    public View.OnClickListener f35172h;

    /* renamed from: i, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f35173i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f35174j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f35175k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f35176l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f35177m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f35178n;

    /* renamed from: o, reason: collision with root package name */
    public int f35179o;

    /* renamed from: p, reason: collision with root package name */
    public int f35180p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f35181q;

    /* renamed from: r, reason: collision with root package name */
    public final c f35182r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f35183s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f35184t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f35185u;

    /* renamed from: v, reason: collision with root package name */
    public final g f35186v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f35167w = l.f48586y;

    /* renamed from: x, reason: collision with root package name */
    public static final Rect f35168x = new Rect();
    private static final int[] SELECTED_STATE = {R.attr.state_selected};
    private static final int[] CHECKABLE_STATE_SET = {R.attr.state_checkable};

    public class a extends g {
        public a() {
        }

        @Override // Ca.g
        public void a(int i10) {
        }

        @Override // Ca.g
        public void b(Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            chip.setText(chip.f35169e.Z2() ? Chip.this.f35169e.t1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f35169e != null) {
                Chip.this.f35169e.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    public class c extends androidx.customview.widget.a {
        public c(Chip chip) {
            super(chip);
        }

        @Override // androidx.customview.widget.a
        public int getVirtualViewAt(float f10, float f11) {
            return (Chip.this.n() && Chip.this.getCloseIconTouchBounds().contains(f10, f11)) ? 1 : 0;
        }

        @Override // androidx.customview.widget.a
        public void getVisibleVirtualViews(List list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.s() && Chip.this.f35172h != null) {
                list.add(1);
            }
        }

        @Override // androidx.customview.widget.a
        public boolean onPerformActionForVirtualView(int i10, int i11, Bundle bundle) {
            if (i11 != 16) {
                return false;
            }
            if (i10 == 0) {
                return Chip.this.performClick();
            }
            if (i10 == 1) {
                return Chip.this.t();
            }
            return false;
        }

        @Override // androidx.customview.widget.a
        public void onPopulateNodeForHost(z zVar) {
            zVar.u0(Chip.this.r());
            zVar.x0(Chip.this.isClickable());
            zVar.w0(Chip.this.getAccessibilityClassName());
            zVar.Z0(Chip.this.getText());
        }

        @Override // androidx.customview.widget.a
        public void onPopulateNodeForVirtualView(int i10, z zVar) {
            if (i10 != 1) {
                zVar.A0("");
                zVar.s0(Chip.f35168x);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                zVar.A0(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                zVar.A0(Chip.this.getContext().getString(k.f48548z, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            zVar.s0(Chip.this.getCloseIconTouchBoundsInt());
            zVar.b(z.a.f68223i);
            zVar.C0(Chip.this.isEnabled());
            zVar.w0(Button.class.getName());
        }

        @Override // androidx.customview.widget.a
        public void onVirtualViewKeyboardFocusChanged(int i10, boolean z10) {
            if (i10 == 1) {
                Chip.this.f35177m = z10;
            }
            if (Chip.this.f35169e.J1(Chip.this.f35177m)) {
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ia.c.f48232f);
    }

    public static /* synthetic */ void b(Chip chip, CompoundButton compoundButton, boolean z10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f35173i;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public RectF getCloseIconTouchBounds() {
        this.f35185u.setEmpty();
        if (n() && this.f35172h != null) {
            this.f35169e.k1(this.f35185u);
        }
        return this.f35185u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f35184t.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f35184t;
    }

    private e getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            return aVar.u1();
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f35176l != z10) {
            this.f35176l = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f35175k != z10) {
            this.f35175k = z10;
            refreshDrawableState();
        }
    }

    public final void A() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f35169e) == null) {
            return;
        }
        int V02 = (int) (aVar.V0() + this.f35169e.v1() + this.f35169e.C0());
        int a12 = (int) (this.f35169e.a1() + this.f35169e.w1() + this.f35169e.y0());
        if (this.f35170f != null) {
            Rect rect = new Rect();
            this.f35170f.getPadding(rect);
            a12 += rect.left;
            V02 += rect.right;
        }
        setPaddingRelative(a12, getPaddingTop(), V02, getPaddingBottom());
    }

    public final void B() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        e textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.p(getContext(), paint, this.f35186v);
        }
    }

    public final void C(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", AppStateModule.APP_STATE_BACKGROUND) != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    @Override // com.google.android.material.chip.a.InterfaceC0498a
    public void a() {
        m(this.f35180p);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.f35183s ? super.dispatchHoverEvent(motionEvent) : this.f35182r.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f35183s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f35182r.dispatchKeyEvent(keyEvent) || this.f35182r.getKeyboardFocusedVirtualViewId() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f35169e;
        if ((aVar == null || !aVar.B1()) ? false : this.f35169e.y2(l())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f35181q)) {
            return this.f35181q;
        }
        if (!r()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f35170f;
        return insetDrawable == null ? this.f35169e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            return aVar.R0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            return aVar.S0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            return aVar.T0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            return Math.max(0.0f, aVar.U0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f35169e;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            return aVar.V0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            return aVar.W0();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            return aVar.X0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            return aVar.Y0();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            return aVar.Z0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            return aVar.a1();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            return aVar.b1();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            return aVar.c1();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            return aVar.d1();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            return aVar.e1();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            return aVar.f1();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            return aVar.g1();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            return aVar.h1();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            return aVar.j1();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            return aVar.n1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f35183s && (this.f35182r.getKeyboardFocusedVirtualViewId() == 1 || this.f35182r.getAccessibilityFocusedVirtualViewId() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C5110g getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            return aVar.o1();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            return aVar.p1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            return aVar.q1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            return aVar.r1();
        }
        return null;
    }

    @NonNull
    public n getShapeAppearanceModel() {
        return this.f35169e.H();
    }

    public C5110g getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            return aVar.s1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            return aVar.v1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            return aVar.w1();
        }
        return 0.0f;
    }

    public final void k(com.google.android.material.chip.a aVar) {
        aVar.C2(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final int[] l() {
        ?? isEnabled = isEnabled();
        int i10 = isEnabled;
        if (this.f35177m) {
            i10 = isEnabled + 1;
        }
        int i11 = i10;
        if (this.f35176l) {
            i11 = i10 + 1;
        }
        int i12 = i11;
        if (this.f35175k) {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (isChecked()) {
            i13 = i12 + 1;
        }
        int[] iArr = new int[i13];
        int i14 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i14 = 1;
        }
        if (this.f35177m) {
            iArr[i14] = 16842908;
            i14++;
        }
        if (this.f35176l) {
            iArr[i14] = 16843623;
            i14++;
        }
        if (this.f35175k) {
            iArr[i14] = 16842919;
            i14++;
        }
        if (isChecked()) {
            iArr[i14] = 16842913;
        }
        return iArr;
    }

    public boolean m(int i10) {
        this.f35180p = i10;
        if (!v()) {
            if (this.f35170f != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int max = Math.max(0, i10 - this.f35169e.getIntrinsicHeight());
        int max2 = Math.max(0, i10 - this.f35169e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.f35170f != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int i11 = max2 > 0 ? max2 / 2 : 0;
        int i12 = max > 0 ? max / 2 : 0;
        if (this.f35170f != null) {
            Rect rect = new Rect();
            this.f35170f.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                y();
                return true;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        q(i11, i12, i11, i12);
        y();
        return true;
    }

    public final boolean n() {
        com.google.android.material.chip.a aVar = this.f35169e;
        return (aVar == null || aVar.d1() == null) ? false : true;
    }

    public final void o(Context context, AttributeSet attributeSet, int i10) {
        TypedArray i11 = xa.l.i(context, attributeSet, m.Chip, i10, f35167w, new int[0]);
        this.f35178n = i11.getBoolean(m.f48932j1, false);
        this.f35180p = (int) Math.ceil(i11.getDimension(m.f48814X0, Ca.b.e(context)));
        i11.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        j.f(this, this.f35169e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, SELECTED_STATE);
        }
        if (r()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKABLE_STATE_SET);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f35183s) {
            this.f35182r.onFocusChanged(z10, i10, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), RtcEngineEvent.EvtType.EVT_MEDIA_ENGINE_LOAD_SUCCESS) : super.onResolvePointerIcon(motionEvent, i10);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f35179o != i10) {
            this.f35179o = i10;
            A();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f35175k) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z10 = true;
                    }
                }
                z10 = false;
            } else if (this.f35175k) {
                t();
                z10 = true;
                setCloseIconPressed(false);
            }
            z10 = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                z10 = true;
            }
            z10 = false;
        }
        return z10 || super.onTouchEvent(motionEvent);
    }

    public final void p() {
        setOutlineProvider(new b());
    }

    public final void q(int i10, int i11, int i12, int i13) {
        this.f35170f = new InsetDrawable((Drawable) this.f35169e, i10, i11, i12, i13);
    }

    public boolean r() {
        com.google.android.material.chip.a aVar = this.f35169e;
        return aVar != null && aVar.A1();
    }

    public boolean s() {
        com.google.android.material.chip.a aVar = this.f35169e;
        return aVar != null && aVar.C1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f35181q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f35171g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f35171g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.K1(z10);
        }
    }

    public void setCheckableResource(int i10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.L1(i10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar == null) {
            this.f35174j = z10;
        } else if (aVar.A1()) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.M1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.N1(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.O1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.P1(i10);
        }
    }

    public void setCheckedIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.Q1(i10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.S1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.T1(i10);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.U1(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.V1(i10);
        }
    }

    public void setChipDrawable(@NonNull com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f35169e;
        if (aVar2 != aVar) {
            w(aVar2);
            this.f35169e = aVar;
            aVar.N2(false);
            k(this.f35169e);
            m(this.f35180p);
        }
    }

    public void setChipEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.W1(f10);
        }
    }

    public void setChipEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.X1(i10);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.Y1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.Z1(i10);
        }
    }

    public void setChipIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.a2(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.b2(i10);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.c2(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.d2(i10);
        }
    }

    public void setChipIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.e2(i10);
        }
    }

    public void setChipMinHeight(float f10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.g2(f10);
        }
    }

    public void setChipMinHeightResource(int i10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.h2(i10);
        }
    }

    public void setChipStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.i2(f10);
        }
    }

    public void setChipStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.j2(i10);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.k2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.l2(i10);
        }
    }

    public void setChipStrokeWidth(float f10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.m2(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.n2(i10);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.p2(drawable);
        }
        x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.q2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.r2(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.s2(i10);
        }
    }

    public void setCloseIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.t2(i10);
        }
        x();
    }

    public void setCloseIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.u2(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.v2(i10);
        }
    }

    public void setCloseIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.w2(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.x2(i10);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.z2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.A2(i10);
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.e0(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f35169e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.D2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f35178n = z10;
        m(this.f35180p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(C5110g c5110g) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.E2(c5110g);
        }
    }

    public void setHideMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.F2(i10);
        }
    }

    public void setIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.G2(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.H2(i10);
        }
    }

    public void setIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.I2(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.J2(i10);
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f35169e == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.K2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i10);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f35173i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f35172h = onClickListener;
        x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.L2(colorStateList);
        }
        if (this.f35169e.y1()) {
            return;
        }
        z();
    }

    public void setRippleColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.M2(i10);
            if (this.f35169e.y1()) {
                return;
            }
            z();
        }
    }

    @Override // com.google.android.material.shape.q
    public void setShapeAppearanceModel(@NonNull n nVar) {
        this.f35169e.setShapeAppearanceModel(nVar);
    }

    public void setShowMotionSpec(C5110g c5110g) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.O2(c5110g);
        }
    }

    public void setShowMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.P2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (!z10) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z10);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.Z2() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f35169e;
        if (aVar2 != null) {
            aVar2.Q2(charSequence);
        }
    }

    public void setTextAppearance(e eVar) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.R2(eVar);
        }
        B();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.T2(f10);
        }
    }

    public void setTextEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.U2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.V2(TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics()));
        }
        B();
    }

    public void setTextStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.W2(f10);
        }
    }

    public void setTextStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.X2(i10);
        }
    }

    public boolean t() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f35172h;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        if (this.f35183s) {
            this.f35182r.sendEventForVirtualView(1, 1);
        }
        return z10;
    }

    public final void u() {
        if (this.f35170f != null) {
            this.f35170f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            y();
        }
    }

    public boolean v() {
        return this.f35178n;
    }

    public final void w(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.C2(null);
        }
    }

    public final void x() {
        if (n() && s() && this.f35172h != null) {
            AbstractC2082d0.l0(this, this.f35182r);
            this.f35183s = true;
        } else {
            AbstractC2082d0.l0(this, null);
            this.f35183s = false;
        }
    }

    public final void y() {
        z();
    }

    public final void z() {
        this.f35171g = new RippleDrawable(Da.a.d(this.f35169e.r1()), getBackgroundDrawable(), null);
        this.f35169e.Y2(false);
        setBackground(this.f35171g);
        A();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Chip(Context context, AttributeSet attributeSet, int i10) {
        super(La.a.d(context, attributeSet, i10, r4), attributeSet, i10);
        int i11 = f35167w;
        this.f35184t = new Rect();
        this.f35185u = new RectF();
        this.f35186v = new a();
        Context context2 = getContext();
        C(attributeSet);
        com.google.android.material.chip.a H02 = com.google.android.material.chip.a.H0(context2, attributeSet, i10, i11);
        o(context2, attributeSet, i10);
        setChipDrawable(H02);
        H02.e0(getElevation());
        TypedArray i12 = xa.l.i(context2, attributeSet, m.Chip, i10, i11, new int[0]);
        boolean hasValue = i12.hasValue(m.f48982o1);
        i12.recycle();
        this.f35182r = new c(this);
        x();
        if (!hasValue) {
            p();
        }
        setChecked(this.f35174j);
        setText(H02.t1());
        setEllipsize(H02.n1());
        B();
        if (!this.f35169e.Z2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        A();
        if (v()) {
            setMinHeight(this.f35180p);
        }
        this.f35179o = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ra.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                Chip.b(Chip.this, compoundButton, z10);
            }
        });
    }

    public void setCloseIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.B2(z10);
        }
        x();
    }

    public void setCheckedIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.R1(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.f2(z10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.S2(i10);
        }
        B();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        com.google.android.material.chip.a aVar = this.f35169e;
        if (aVar != null) {
            aVar.S2(i10);
        }
        B();
    }

    public void setInternalOnCheckedChangeListener(f fVar) {
    }
}
