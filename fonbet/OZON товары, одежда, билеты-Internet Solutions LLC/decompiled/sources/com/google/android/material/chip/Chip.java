package com.google.android.material.chip;

import a10.AbstractC4920h;
import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.Y;
import com.google.android.material.chip.c;
import i7.C7017a;
import java.util.ArrayList;
import s7.C9619n;
import s7.C9621p;
import s7.InterfaceC9612g;
import w7.C10444a;
import y2.q;
import y7.C10857h;
import y7.k;
import y7.o;

/* loaded from: classes9.dex */
public class Chip extends AppCompatCheckBox implements c.a, o, InterfaceC9612g<Chip> {

    /* renamed from: u, reason: collision with root package name */
    private static final Rect f58118u = new Rect();

    /* renamed from: v, reason: collision with root package name */
    private static final int[] f58119v = {R.attr.state_selected};

    /* renamed from: w, reason: collision with root package name */
    private static final int[] f58120w = {R.attr.state_checkable};

    /* renamed from: e, reason: collision with root package name */
    private c f58121e;

    /* renamed from: f, reason: collision with root package name */
    private InsetDrawable f58122f;

    /* renamed from: g, reason: collision with root package name */
    private RippleDrawable f58123g;

    /* renamed from: h, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f58124h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC9612g.a<Chip> f58125i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f58126j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f58127k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f58128l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f58129m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f58130n;

    /* renamed from: o, reason: collision with root package name */
    private int f58131o;

    /* renamed from: p, reason: collision with root package name */
    private int f58132p;

    /* renamed from: q, reason: collision with root package name */
    private String f58133q;

    /* renamed from: r, reason: collision with root package name */
    private final Rect f58134r;

    /* renamed from: s, reason: collision with root package name */
    private final RectF f58135s;

    /* renamed from: t, reason: collision with root package name */
    private final AbstractC4920h f58136t;

    final class a extends AbstractC4920h {
        a() {
        }

        @Override // a10.AbstractC4920h
        public final void a(int i11) {
        }

        @Override // a10.AbstractC4920h
        public final void b(@NonNull Typeface typeface, boolean z11) {
            Chip chip = Chip.this;
            chip.setText(chip.f58121e.u0() ? chip.f58121e.a0() : chip.getText());
            chip.requestLayout();
            chip.invalidate();
        }
    }

    private class b extends P2.a {
        b(Chip chip) {
            super(chip);
        }

        @Override // P2.a
        protected final void b(@NonNull ArrayList arrayList) {
            arrayList.add(0);
            Chip.f(Chip.this);
        }

        @Override // P2.a
        protected final boolean d(int i11, int i12) {
            if (i12 == 16) {
                Chip chip = Chip.this;
                if (i11 == 0) {
                    return chip.performClick();
                }
                if (i11 == 1) {
                    chip.playSoundEffect(0);
                }
            }
            return false;
        }

        @Override // P2.a
        protected final void e(@NonNull q qVar) {
            Chip chip = Chip.this;
            qVar.I(chip.l());
            qVar.L(chip.isClickable());
            qVar.K(chip.getAccessibilityClassName());
            qVar.r0(chip.getText());
        }

        @Override // P2.a
        protected final void f(int i11, @NonNull q qVar) {
            if (i11 != 1) {
                qVar.O("");
                qVar.G(Chip.f58118u);
                return;
            }
            Chip chip = Chip.this;
            chip.k();
            CharSequence text = chip.getText();
            qVar.O(chip.getContext().getString(ru.ozon.app.android.R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
            qVar.G(Chip.h(chip));
            qVar.b(q.a.f105942e);
            qVar.S(chip.isEnabled());
        }

        @Override // P2.a
        protected final void g(int i11, boolean z11) {
            if (i11 == 1) {
                Chip chip = Chip.this;
                chip.f58129m = z11;
                chip.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        super(B7.a.a(context, attributeSet, ru.ozon.app.android.R.attr.chipStyle, ru.ozon.app.android.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, ru.ozon.app.android.R.attr.chipStyle);
        this.f58134r = new Rect();
        this.f58135s = new RectF();
        this.f58136t = new a();
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
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
        c S11 = c.S(context2, attributeSet);
        int[] iArr = C7017a.f65941g;
        TypedArray e11 = C9619n.e(context2, attributeSet, iArr, ru.ozon.app.android.R.attr.chipStyle, ru.ozon.app.android.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        this.f58130n = e11.getBoolean(32, false);
        this.f58132p = (int) Math.ceil(e11.getDimension(20, (float) Math.ceil(C9621p.b(48, getContext()))));
        e11.recycle();
        c cVar = this.f58121e;
        if (cVar != S11) {
            if (cVar != null) {
                cVar.o0(null);
            }
            this.f58121e = S11;
            S11.r0();
            this.f58121e.o0(this);
            j(this.f58132p);
        }
        S11.A(Y.k(this));
        TypedArray e12 = C9619n.e(context2, attributeSet, iArr, ru.ozon.app.android.R.attr.chipStyle, ru.ozon.app.android.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        boolean hasValue = e12.hasValue(37);
        e12.recycle();
        new b(this);
        c cVar2 = this.f58121e;
        if (cVar2 != null) {
            cVar2.X();
        }
        Y.C(this, null);
        if (!hasValue) {
            setOutlineProvider(new com.google.android.material.chip.b(this));
        }
        setChecked(this.f58126j);
        setText(S11.a0());
        setEllipsize(S11.Y());
        r();
        if (!this.f58121e.u0()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        super.setGravity(8388627);
        q();
        if (this.f58130n) {
            setMinHeight(this.f58132p);
        }
        this.f58131o = getLayoutDirection();
        super.setOnCheckedChangeListener(new com.google.android.material.chip.a(this));
    }

    static boolean f(Chip chip) {
        c cVar = chip.f58121e;
        return (cVar == null || cVar.X() == null) ? false : true;
    }

    static Rect h(Chip chip) {
        RectF rectF = chip.f58135s;
        rectF.setEmpty();
        c cVar = chip.f58121e;
        if (cVar != null) {
            cVar.X();
        }
        int i11 = (int) rectF.left;
        int i12 = (int) rectF.top;
        int i13 = (int) rectF.right;
        int i14 = (int) rectF.bottom;
        Rect rect = chip.f58134r;
        rect.set(i11, i12, i13, i14);
        return rect;
    }

    private void m() {
        if (this.f58122f != null) {
            this.f58122f = null;
            setMinWidth(0);
            c cVar = this.f58121e;
            setMinHeight((int) (cVar != null ? cVar.V() : 0.0f));
            p();
        }
    }

    private void p() {
        int i11 = C10444a.f103609f;
        ColorStateList b11 = C10444a.b(this.f58121e.Z());
        Drawable drawable = this.f58122f;
        if (drawable == null) {
            drawable = this.f58121e;
        }
        this.f58123g = new RippleDrawable(b11, drawable, null);
        this.f58121e.getClass();
        RippleDrawable rippleDrawable = this.f58123g;
        int i12 = Y.f42258g;
        setBackground(rippleDrawable);
        q();
    }

    private void q() {
        c cVar;
        if (TextUtils.isEmpty(getText()) || (cVar = this.f58121e) == null) {
            return;
        }
        int c02 = (int) (this.f58121e.c0() + cVar.U() + this.f58121e.R());
        int d02 = (int) (this.f58121e.d0() + this.f58121e.W() + this.f58121e.Q());
        if (this.f58122f != null) {
            Rect rect = new Rect();
            this.f58122f.getPadding(rect);
            d02 += rect.left;
            c02 += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i11 = Y.f42258g;
        setPaddingRelative(d02, paddingTop, c02, paddingBottom);
    }

    private void r() {
        TextPaint paint = getPaint();
        c cVar = this.f58121e;
        if (cVar != null) {
            paint.drawableState = cVar.getState();
        }
        c cVar2 = this.f58121e;
        v7.d b02 = cVar2 != null ? cVar2.b0() : null;
        if (b02 != null) {
            b02.k(getContext(), paint, this.f58136t);
        }
    }

    @Override // com.google.android.material.chip.c.a
    public final void a() {
        j(this.f58132p);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    protected final boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        c cVar = this.f58121e;
        boolean z11 = false;
        int i11 = 0;
        z11 = false;
        if (cVar != null && cVar.f0()) {
            c cVar2 = this.f58121e;
            ?? isEnabled = isEnabled();
            int i12 = isEnabled;
            if (this.f58129m) {
                i12 = isEnabled + 1;
            }
            int i13 = i12;
            if (this.f58128l) {
                i13 = i12 + 1;
            }
            int i14 = i13;
            if (this.f58127k) {
                i14 = i13 + 1;
            }
            int i15 = i14;
            if (isChecked()) {
                i15 = i14 + 1;
            }
            int[] iArr = new int[i15];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i11 = 1;
            }
            if (this.f58129m) {
                iArr[i11] = 16842908;
                i11++;
            }
            if (this.f58128l) {
                iArr[i11] = 16843623;
                i11++;
            }
            if (this.f58127k) {
                iArr[i11] = 16842919;
                i11++;
            }
            if (isChecked()) {
                iArr[i11] = 16842913;
            }
            z11 = cVar2.m0(iArr);
        }
        if (z11) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public final CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f58133q)) {
            return this.f58133q;
        }
        if (!l()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).g()) ? "android.widget.RadioButton" : "android.widget.CompoundButton";
    }

    @Override // android.widget.TextView
    public final TextUtils.TruncateAt getEllipsize() {
        c cVar = this.f58121e;
        if (cVar != null) {
            return cVar.Y();
        }
        return null;
    }

    public final void j(int i11) {
        this.f58132p = i11;
        if (!this.f58130n) {
            if (this.f58122f != null) {
                m();
                return;
            } else {
                p();
                return;
            }
        }
        int max = Math.max(0, i11 - this.f58121e.getIntrinsicHeight());
        int max2 = Math.max(0, i11 - this.f58121e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.f58122f != null) {
                m();
                return;
            } else {
                p();
                return;
            }
        }
        int i12 = max2 > 0 ? max2 / 2 : 0;
        int i13 = max > 0 ? max / 2 : 0;
        if (this.f58122f != null) {
            Rect rect = new Rect();
            this.f58122f.getPadding(rect);
            if (rect.top == i13 && rect.bottom == i13 && rect.left == i12 && rect.right == i12) {
                p();
                return;
            }
        }
        if (getMinHeight() != i11) {
            setMinHeight(i11);
        }
        if (getMinWidth() != i11) {
            setMinWidth(i11);
        }
        this.f58122f = new InsetDrawable((Drawable) this.f58121e, i12, i13, i12, i13);
        p();
    }

    public final CharSequence k() {
        c cVar = this.f58121e;
        if (cVar != null) {
            cVar.getClass();
        }
        return null;
    }

    public final boolean l() {
        c cVar = this.f58121e;
        return cVar != null && cVar.e0();
    }

    public final void n() {
        this.f58133q = "android.view.View";
    }

    public final void o(InterfaceC9612g.a<Chip> aVar) {
        this.f58125i = aVar;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10857h.c(this, this.f58121e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i11) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i11 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f58119v);
        }
        if (l()) {
            View.mergeDrawableStates(onCreateDrawableState, f58120w);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onFocusChanged(boolean z11, int i11, Rect rect) {
        super.onFocusChanged(z11, i11, rect);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            RectF rectF = this.f58135s;
            rectF.setEmpty();
            c cVar = this.f58121e;
            if (cVar != null) {
                cVar.X();
            }
            boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
            if (this.f58128l != contains) {
                this.f58128l = contains;
                refreshDrawableState();
            }
        } else if (actionMasked == 10 && this.f58128l) {
            this.f58128l = false;
            refreshDrawableState();
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        int i11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(l());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            q A02 = q.A0(accessibilityNodeInfo);
            if (chipGroup.b()) {
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i12 >= chipGroup.getChildCount()) {
                        i13 = -1;
                        break;
                    }
                    if (chipGroup.getChildAt(i12) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i12)) == this) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    i12++;
                }
                i11 = i13;
            } else {
                i11 = -1;
            }
            Object tag = getTag(ru.ozon.app.android.R.id.row_index_key);
            A02.N(q.f.f(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i11, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public final PointerIcon onResolvePointerIcon(@NonNull MotionEvent motionEvent, int i11) {
        RectF rectF = this.f58135s;
        rectF.setEmpty();
        c cVar = this.f58121e;
        if (cVar != null) {
            cVar.X();
        }
        if (rectF.contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public final void onRtlPropertiesChanged(int i11) {
        super.onRtlPropertiesChanged(i11);
        if (this.f58131o != i11) {
            this.f58131o = i11;
            q();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r0 != 3) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        boolean z11;
        int actionMasked = motionEvent.getActionMasked();
        RectF rectF = this.f58135s;
        rectF.setEmpty();
        c cVar = this.f58121e;
        if (cVar != null) {
            cVar.X();
        }
        boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    boolean z12 = this.f58127k;
                    if (z12) {
                        if (!contains && z12) {
                            this.f58127k = false;
                            refreshDrawableState();
                        }
                        z11 = true;
                    }
                }
                z11 = false;
            } else if (this.f58127k) {
                playSoundEffect(0);
                z11 = true;
                if (this.f58127k) {
                    this.f58127k = false;
                    refreshDrawableState();
                }
            }
            z11 = false;
            if (this.f58127k) {
            }
        } else {
            if (contains) {
                if (!this.f58127k) {
                    this.f58127k = true;
                    refreshDrawableState();
                }
                z11 = true;
            }
            z11 = false;
        }
        return z11 || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        Drawable drawable2 = this.f58122f;
        if (drawable2 == null) {
            drawable2 = this.f58121e;
        }
        if (drawable == drawable2 || drawable == this.f58123g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i11) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        Drawable drawable2 = this.f58122f;
        if (drawable2 == null) {
            drawable2 = this.f58121e;
        }
        if (drawable == drawable2 || drawable == this.f58123g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public final void setBackgroundResource(int i11) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z11) {
        c cVar = this.f58121e;
        if (cVar == null) {
            this.f58126j = z11;
        } else if (cVar.e0()) {
            super.setChecked(z11);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i11, int i12, int i13, int i14) {
        if (i11 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i13 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i11, i12, i13, i14);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i11, int i12, int i13, int i14) {
        if (i11 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i13 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i11, i12, i13, i14);
    }

    @Override // android.view.View
    public final void setElevation(float f7) {
        super.setElevation(f7);
        c cVar = this.f58121e;
        if (cVar != null) {
            cVar.A(f7);
        }
    }

    @Override // android.widget.TextView
    public final void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f58121e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        c cVar = this.f58121e;
        if (cVar != null) {
            cVar.p0(truncateAt);
        }
    }

    @Override // android.widget.TextView
    public final void setGravity(int i11) {
        if (i11 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i11);
        }
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i11) {
        if (this.f58121e == null) {
            return;
        }
        super.setLayoutDirection(i11);
    }

    @Override // android.widget.TextView
    public final void setLines(int i11) {
        if (i11 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i11);
    }

    @Override // android.widget.TextView
    public final void setMaxLines(int i11) {
        if (i11 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i11);
    }

    @Override // android.widget.TextView
    public final void setMaxWidth(int i11) {
        super.setMaxWidth(i11);
        c cVar = this.f58121e;
        if (cVar != null) {
            cVar.q0(i11);
        }
    }

    @Override // android.widget.TextView
    public final void setMinLines(int i11) {
        if (i11 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i11);
    }

    @Override // android.widget.CompoundButton
    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f58124h = onCheckedChangeListener;
    }

    @Override // y7.o
    public final void setShapeAppearanceModel(@NonNull k kVar) {
        this.f58121e.setShapeAppearanceModel(kVar);
    }

    @Override // android.widget.TextView
    public final void setSingleLine(boolean z11) {
        if (!z11) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z11);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        c cVar = this.f58121e;
        if (cVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(cVar.u0() ? null : charSequence, bufferType);
        c cVar2 = this.f58121e;
        if (cVar2 != null) {
            cVar2.s0(charSequence);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        c cVar = this.f58121e;
        if (cVar != null) {
            cVar.t0(i11);
        }
        r();
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
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
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
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
    public final void setTextAppearance(int i11) {
        super.setTextAppearance(i11);
        c cVar = this.f58121e;
        if (cVar != null) {
            cVar.t0(i11);
        }
        r();
    }
}
