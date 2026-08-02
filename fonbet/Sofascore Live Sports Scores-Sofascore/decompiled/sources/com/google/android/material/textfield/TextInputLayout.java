package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.CheckableImageButton;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.a9j;
import defpackage.b13;
import defpackage.bsk;
import defpackage.by4;
import defpackage.ddj;
import defpackage.e80;
import defpackage.ed5;
import defpackage.edj;
import defpackage.eei;
import defpackage.eq3;
import defpackage.fb5;
import defpackage.fc6;
import defpackage.fdj;
import defpackage.fjg;
import defpackage.fkf;
import defpackage.hxj;
import defpackage.hz8;
import defpackage.ilg;
import defpackage.imf;
import defpackage.kac;
import defpackage.l2a;
import defpackage.l4a;
import defpackage.m6k;
import defpackage.o1a;
import defpackage.o23;
import defpackage.o3a;
import defpackage.oyn;
import defpackage.ozb;
import defpackage.p7g;
import defpackage.pa4;
import defpackage.pjf;
import defpackage.pn5;
import defpackage.q0;
import defpackage.qa4;
import defpackage.qn5;
import defpackage.qzb;
import defpackage.t4f;
import defpackage.td4;
import defpackage.ug5;
import defpackage.ut3;
import defpackage.uv1;
import defpackage.uyb;
import defpackage.w3a;
import defpackage.wah;
import defpackage.wz1;
import defpackage.x2a;
import defpackage.xah;
import defpackage.xb0;
import defpackage.xbi;
import defpackage.yfa;
import defpackage.ym6;
import defpackage.zzl;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] D0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorStateList A;
    public boolean A0;
    public ColorStateList B;
    public boolean B0;
    public ColorStateList C;
    public boolean C0;
    public boolean D;
    public CharSequence E;
    public boolean F;
    public qzb G;
    public qzb H;
    public StateListDrawable I;
    public boolean J;
    public qzb K;
    public qzb L;
    public xah M;
    public boolean N;
    public final int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public final Rect W;
    public final FrameLayout a;
    public final Rect a0;
    public final xbi b;
    public final RectF b0;
    public final qn5 c;
    public Typeface c0;
    public final int d;
    public ColorDrawable d0;
    public EditText e;
    public int e0;
    public CharSequence f;
    public final LinkedHashSet f0;
    public int g;
    public ColorDrawable g0;
    public int h;
    public int h0;
    public int i;
    public Drawable i0;
    public int j;
    public ColorStateList j0;
    public final o1a k;
    public ColorStateList k0;
    public boolean l;
    public int l0;
    public int m;
    public int m0;
    public boolean n;
    public int n0;
    public fdj o;
    public ColorStateList o0;
    public AppCompatTextView p;
    public int p0;
    public int q;
    public int q0;
    public int r;
    public int r0;
    public CharSequence s;
    public int s0;
    public boolean t;
    public int t0;
    public AppCompatTextView u;
    public int u0;
    public ColorStateList v;
    public boolean v0;
    public int w;
    public final b13 w0;
    public ym6 x;
    public boolean x0;
    public ym6 y;
    public boolean y0;
    public ColorStateList z;
    public ValueAnimator z0;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public CharSequence c;
        public boolean d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.d = parcel.readInt() == 1;
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.c) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.c, parcel, i);
            parcel.writeInt(this.d ? 1 : 0);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(oyn.U(context, attributeSet, com.sofascore.results.R.attr.textInputStyle, com.sofascore.results.R.style.Widget_Design_TextInputLayout), attributeSet, com.sofascore.results.R.attr.textInputStyle);
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = new o1a(this);
        this.o = new ilg(29);
        this.W = new Rect();
        this.a0 = new Rect();
        this.b0 = new RectF();
        this.f0 = new LinkedHashSet();
        b13 b13Var = new b13(this);
        this.w0 = b13Var;
        this.C0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = e80.a;
        b13Var.X = linearInterpolator;
        b13Var.l(false);
        b13Var.W = linearInterpolator;
        b13Var.l(false);
        b13Var.s(8388659);
        m6k.v(context2, attributeSet, com.sofascore.results.R.attr.textInputStyle, com.sofascore.results.R.style.Widget_Design_TextInputLayout);
        int[] iArr = pjf.U;
        m6k.w(context2, attributeSet, iArr, com.sofascore.results.R.attr.textInputStyle, com.sofascore.results.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.sofascore.results.R.attr.textInputStyle, com.sofascore.results.R.style.Widget_Design_TextInputLayout);
        l2a l2aVar = new l2a(context2, obtainStyledAttributes);
        xbi xbiVar = new xbi(this, l2aVar);
        this.b = xbiVar;
        this.D = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.y0 = obtainStyledAttributes.getBoolean(47, true);
        this.x0 = obtainStyledAttributes.getBoolean(42, true);
        if (obtainStyledAttributes.hasValue(6)) {
            setMinEms(obtainStyledAttributes.getInt(6, -1));
        } else if (obtainStyledAttributes.hasValue(3)) {
            setMinWidth(obtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setMaxEms(obtainStyledAttributes.getInt(5, -1));
        } else if (obtainStyledAttributes.hasValue(2)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.M = xah.h(context2, attributeSet, com.sofascore.results.R.attr.textInputStyle, com.sofascore.results.R.style.Widget_Design_TextInputLayout).a();
        this.O = context2.getResources().getDimensionPixelOffset(com.sofascore.results.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.Q = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.d = getResources().getDimensionPixelSize(com.sofascore.results.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.S = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.sofascore.results.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.T = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.sofascore.results.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.R = this.S;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        wah m = this.M.m();
        if (dimension >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            m.e = new q0(dimension);
        }
        if (dimension2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            m.f = new q0(dimension2);
        }
        if (dimension3 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            m.g = new q0(dimension3);
        }
        if (dimension4 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            m.h = new q0(dimension4);
        }
        this.M = m.a();
        ColorStateList w = w3a.w(context2, l2aVar, 7);
        if (w != null) {
            int defaultColor = w.getDefaultColor();
            this.p0 = defaultColor;
            this.V = defaultColor;
            if (w.isStateful()) {
                this.q0 = w.getColorForState(new int[]{-16842910}, -1);
                this.r0 = w.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.s0 = w.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.r0 = this.p0;
                ColorStateList q = eq3.q(com.sofascore.results.R.color.mtrl_filled_background_color, context2);
                this.q0 = q.getColorForState(new int[]{-16842910}, -1);
                this.s0 = q.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.V = 0;
            this.p0 = 0;
            this.q0 = 0;
            this.r0 = 0;
            this.s0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList m2 = l2aVar.m(1);
            this.k0 = m2;
            this.j0 = m2;
        }
        ColorStateList w2 = w3a.w(context2, l2aVar, 14);
        this.n0 = obtainStyledAttributes.getColor(14, 0);
        this.l0 = context2.getColor(com.sofascore.results.R.color.mtrl_textinput_default_box_stroke_color);
        this.t0 = context2.getColor(com.sofascore.results.R.color.mtrl_textinput_disabled_color);
        this.m0 = context2.getColor(com.sofascore.results.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (w2 != null) {
            setBoxStrokeColorStateList(w2);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(w3a.w(context2, l2aVar, 15));
        }
        if (obtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(50, 0));
        }
        this.B = l2aVar.m(24);
        this.C = l2aVar.m(25);
        int resourceId = obtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = obtainStyledAttributes.getText(35);
        int i2 = obtainStyledAttributes.getInt(34, 1);
        boolean z = obtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(45, 0);
        boolean z2 = obtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = obtainStyledAttributes.getText(43);
        int resourceId3 = obtainStyledAttributes.getResourceId(58, 0);
        CharSequence text3 = obtainStyledAttributes.getText(57);
        boolean z3 = obtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(19, -1));
        this.r = obtainStyledAttributes.getResourceId(22, 0);
        this.q = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i2);
        setCounterOverflowTextAppearance(this.q);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.r);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(l2aVar.m(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(l2aVar.m(46));
        }
        if (obtainStyledAttributes.hasValue(51)) {
            setHintTextColor(l2aVar.m(51));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(l2aVar.m(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(l2aVar.m(21));
        }
        if (obtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(l2aVar.m(59));
        }
        qn5 qn5Var = new qn5(this, l2aVar);
        this.c = qn5Var;
        boolean z4 = obtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(obtainStyledAttributes.getInt(49, 1));
        l2aVar.F();
        setImportantForAccessibility(2);
        setImportantForAutofill(1);
        frameLayout.addView(xbiVar);
        frameLayout.addView(qn5Var);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    @Nullable
    private Drawable getEditTextBoxBackground() {
        EditText editText = this.e;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.G;
        }
        EditText editText2 = this.e;
        int O = o3a.O(editText2.getContext(), x2a.O(com.sofascore.results.R.attr.colorControlHighlight, editText2));
        int i = this.P;
        int[][] iArr = D0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            qzb qzbVar = this.G;
            int i2 = this.V;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{o3a.J(0.1f, O, i2), i2}), qzbVar, qzbVar);
        }
        Context context = getContext();
        qzb qzbVar2 = this.G;
        int O2 = o3a.O(context, x2a.P(context, com.sofascore.results.R.attr.colorSurface, "TextInputLayout"));
        qzb qzbVar3 = new qzb(qzbVar2.k());
        int J = o3a.J(0.1f, O, O2);
        qzbVar3.t(new ColorStateList(iArr, new int[]{J, 0}));
        qzbVar3.setTint(O2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{J, O2});
        qzb qzbVar4 = new qzb(qzbVar2.k());
        qzbVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, qzbVar3, qzbVar4), qzbVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.I == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.I = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.I.addState(new int[0], h(false));
        }
        return this.I;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        qzb qzbVar = this.H;
        if (qzbVar != null) {
            return qzbVar;
        }
        qzb h = h(true);
        this.H = h;
        return h;
    }

    public static void m(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.e != null) {
            a70.p("We already have an EditText, can only have one");
            return;
        }
        getEndIconMode();
        this.e = editText;
        int i = this.g;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.i);
        }
        int i2 = this.h;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.j);
        }
        this.J = false;
        k();
        setTextInputAccessibilityDelegate(new edj(this));
        Typeface typeface = this.e.getTypeface();
        b13 b13Var = this.w0;
        boolean t = b13Var.t(typeface);
        boolean z = b13Var.z(typeface);
        if (t || z) {
            b13Var.l(false);
        }
        b13Var.y(this.e.getTextSize());
        float letterSpacing = this.e.getLetterSpacing();
        if (b13Var.h0 != letterSpacing) {
            b13Var.h0 = letterSpacing;
            b13Var.l(false);
        }
        int gravity = this.e.getGravity();
        b13Var.s((gravity & (-113)) | 48);
        b13Var.x(gravity);
        this.u0 = editText.getMinimumHeight();
        this.e.addTextChangedListener(new ddj(this, editText));
        if (this.j0 == null) {
            this.j0 = this.e.getHintTextColors();
        }
        if (this.D) {
            if (TextUtils.isEmpty(this.E)) {
                CharSequence hint = this.e.getHint();
                this.f = hint;
                setHint(hint);
                this.e.setHint((CharSequence) null);
            }
            this.F = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        if (this.p != null) {
            p(this.e.getText());
        }
        t();
        this.k.b();
        this.b.bringToFront();
        qn5 qn5Var = this.c;
        qn5Var.bringToFront();
        Iterator it = this.f0.iterator();
        while (it.hasNext()) {
            ((pn5) it.next()).a(this);
        }
        qn5Var.n();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        w(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.E)) {
            return;
        }
        this.E = charSequence;
        this.w0.B(charSequence);
        if (this.v0) {
            return;
        }
        l();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.t == z) {
            return;
        }
        AppCompatTextView appCompatTextView = this.u;
        if (!z) {
            if (appCompatTextView != null) {
                appCompatTextView.setVisibility(8);
            }
            this.u = null;
        } else if (appCompatTextView != null) {
            this.a.addView(appCompatTextView);
            this.u.setVisibility(0);
        }
        this.t = z;
    }

    public final void a() {
        if (this.e == null || this.P != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.e;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.w0.g() + this.d), this.e.getPaddingEnd(), getResources().getDimensionPixelSize(com.sofascore.results.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.e;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.sofascore.results.R.dimen.material_filled_edittext_font_2_0_padding_top), this.e.getPaddingEnd(), getResources().getDimensionPixelSize(com.sofascore.results.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (w3a.H(getContext())) {
            EditText editText3 = this.e;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.sofascore.results.R.dimen.material_filled_edittext_font_1_3_padding_top), this.e.getPaddingEnd(), getResources().getDimensionPixelSize(com.sofascore.results.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        v();
        setEditText((EditText) view);
    }

    public final void b(float f) {
        b13 b13Var = this.w0;
        if (b13Var.b == f) {
            return;
        }
        if (this.z0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.z0 = valueAnimator;
            valueAnimator.setInterpolator(yfa.E(getContext(), com.sofascore.results.R.attr.motionEasingEmphasizedInterpolator, e80.b));
            this.z0.setDuration(x2a.M(getContext(), com.sofascore.results.R.attr.motionDurationMedium4, 167));
            this.z0.addUpdateListener(new wz1(this, 5));
        }
        this.z0.setFloatValues(b13Var.b, f);
        this.z0.start();
    }

    public final void c() {
        int i;
        int i2;
        qzb qzbVar = this.G;
        if (qzbVar == null) {
            return;
        }
        xah k = qzbVar.k();
        xah xahVar = this.M;
        if (k != xahVar) {
            this.G.setShapeAppearanceModel(xahVar);
        }
        if (this.P == 2 && (i = this.R) > -1 && (i2 = this.U) != 0) {
            qzb qzbVar2 = this.G;
            qzbVar2.A(i);
            qzbVar2.y(ColorStateList.valueOf(i2));
        }
        int i3 = this.V;
        if (this.P == 1) {
            Integer v = o3a.v(com.sofascore.results.R.attr.colorSurface, getContext());
            i3 = o23.h(this.V, v != null ? v.intValue() : 0);
        }
        this.V = i3;
        this.G.t(ColorStateList.valueOf(i3));
        qzb qzbVar3 = this.K;
        if (qzbVar3 != null && this.L != null) {
            if (this.R > -1 && this.U != 0) {
                qzbVar3.t(this.e.isFocused() ? ColorStateList.valueOf(this.l0) : ColorStateList.valueOf(this.U));
                this.L.t(ColorStateList.valueOf(this.U));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        if (this.e == null) {
            zzl.s();
            return null;
        }
        boolean z = getLayoutDirection() == 1;
        int i = rect.bottom;
        Rect rect2 = this.a0;
        rect2.bottom = i;
        int i2 = this.P;
        if (i2 == 1) {
            rect2.left = i(rect.left, z);
            rect2.top = rect.top + this.Q;
            rect2.right = j(rect.right, z);
            return rect2;
        }
        int i3 = rect.left;
        if (i2 != 2) {
            rect2.left = i(i3, z);
            rect2.top = getPaddingTop();
            rect2.right = j(rect.right, z);
            return rect2;
        }
        rect2.left = this.e.getPaddingLeft() + i3;
        rect2.top = rect.top - e();
        rect2.right = rect.right - this.e.getPaddingRight();
        return rect2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f != null) {
            boolean z = this.F;
            this.F = false;
            CharSequence hint = editText.getHint();
            this.e.setHint(this.f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.e.setHint(hint);
                this.F = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.e) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.B0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.B0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        qzb qzbVar;
        super.draw(canvas);
        boolean z = this.D;
        b13 b13Var = this.w0;
        if (z) {
            b13Var.f(canvas);
        }
        if (this.L == null || (qzbVar = this.K) == null) {
            return;
        }
        qzbVar.draw(canvas);
        if (this.e.isFocused()) {
            Rect bounds = this.L.getBounds();
            Rect bounds2 = this.K.getBounds();
            float f = b13Var.b;
            int centerX = bounds2.centerX();
            bounds.left = e80.c(f, centerX, bounds2.left);
            bounds.right = e80.c(f, centerX, bounds2.right);
            this.L.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.A0) {
            return;
        }
        this.A0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        b13 b13Var = this.w0;
        if (b13Var != null) {
            b13Var.S = drawableState;
            ColorStateList colorStateList2 = b13Var.p;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = b13Var.o) != null && colorStateList.isStateful())) {
                b13Var.l(false);
                z = true;
                if (this.e != null) {
                    w(isLaidOut() && isEnabled(), false);
                }
                t();
                z();
                if (z) {
                    invalidate();
                }
                this.A0 = false;
            }
        }
        z = false;
        if (this.e != null) {
        }
        t();
        z();
        if (z) {
        }
        this.A0 = false;
    }

    public final int e() {
        if (this.D) {
            int i = this.P;
            b13 b13Var = this.w0;
            if (i == 0) {
                return (int) b13Var.g();
            }
            if (i == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (b13Var.g() / 2.0f);
                }
                float g = b13Var.g();
                TextPaint textPaint = b13Var.V;
                textPaint.setTextSize(b13Var.n);
                textPaint.setTypeface(b13Var.x);
                textPaint.setLetterSpacing(b13Var.g0);
                return Math.max(0, (int) (g - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final ym6 f() {
        ym6 ym6Var = new ym6();
        ym6Var.c = x2a.M(getContext(), com.sofascore.results.R.attr.motionDurationShort2, 87);
        ym6Var.d = yfa.E(getContext(), com.sofascore.results.R.attr.motionEasingLinearInterpolator, e80.a);
        return ym6Var;
    }

    public final boolean g() {
        return this.D && !TextUtils.isEmpty(this.E) && (this.G instanceof qa4);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.e;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    @NonNull
    public qzb getBoxBackground() {
        int i = this.P;
        if (i == 1 || i == 2) {
            return this.G;
        }
        zzl.s();
        return null;
    }

    public int getBoxBackgroundColor() {
        return this.V;
    }

    public int getBoxBackgroundMode() {
        return this.P;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.Q;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        xah xahVar = this.M;
        RectF rectF = this.b0;
        return layoutDirection == 1 ? xahVar.h.a(rectF) : xahVar.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        xah xahVar = this.M;
        RectF rectF = this.b0;
        return layoutDirection == 1 ? xahVar.g.a(rectF) : xahVar.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        xah xahVar = this.M;
        RectF rectF = this.b0;
        return layoutDirection == 1 ? xahVar.e.a(rectF) : xahVar.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        xah xahVar = this.M;
        RectF rectF = this.b0;
        return layoutDirection == 1 ? xahVar.f.a(rectF) : xahVar.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.n0;
    }

    @Nullable
    public ColorStateList getBoxStrokeErrorColor() {
        return this.o0;
    }

    public int getBoxStrokeWidth() {
        return this.S;
    }

    public int getBoxStrokeWidthFocused() {
        return this.T;
    }

    public int getCounterMaxLength() {
        return this.m;
    }

    @Nullable
    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.l && this.n && (appCompatTextView = this.p) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCounterOverflowTextColor() {
        return this.A;
    }

    @Nullable
    public ColorStateList getCounterTextColor() {
        return this.z;
    }

    @Nullable
    public ColorStateList getCursorColor() {
        return this.B;
    }

    @Nullable
    public ColorStateList getCursorErrorColor() {
        return this.C;
    }

    @Nullable
    public ColorStateList getDefaultHintTextColor() {
        return this.j0;
    }

    @Nullable
    public EditText getEditText() {
        return this.e;
    }

    @Nullable
    public CharSequence getEndIconContentDescription() {
        return this.c.g.getContentDescription();
    }

    @Nullable
    public Drawable getEndIconDrawable() {
        return this.c.g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.c.m;
    }

    public int getEndIconMode() {
        return this.c.i;
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.c.n;
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.c.g;
    }

    @Nullable
    public CharSequence getError() {
        o1a o1aVar = this.k;
        if (o1aVar.q) {
            return o1aVar.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.k.t;
    }

    @Nullable
    public CharSequence getErrorContentDescription() {
        return this.k.s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.k.r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    @Nullable
    public Drawable getErrorIconDrawable() {
        return this.c.c.getDrawable();
    }

    @Nullable
    public CharSequence getHelperText() {
        o1a o1aVar = this.k;
        if (o1aVar.x) {
            return o1aVar.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.k.y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    @Nullable
    public CharSequence getHint() {
        if (this.D) {
            return this.E;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.w0.g();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b13 b13Var = this.w0;
        return b13Var.h(b13Var.p);
    }

    public int getHintMaxLines() {
        return this.w0.o0;
    }

    @Nullable
    public ColorStateList getHintTextColor() {
        return this.k0;
    }

    @NonNull
    public fdj getLengthCounter() {
        return this.o;
    }

    public int getMaxEms() {
        return this.h;
    }

    public int getMaxWidth() {
        return this.j;
    }

    public int getMinEms() {
        return this.g;
    }

    public int getMinWidth() {
        return this.i;
    }

    @Nullable
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.c.g.getContentDescription();
    }

    @Nullable
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.c.g.getDrawable();
    }

    @Nullable
    public CharSequence getPlaceholderText() {
        if (this.t) {
            return this.s;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.w;
    }

    @Nullable
    public ColorStateList getPlaceholderTextColor() {
        return this.v;
    }

    @Nullable
    public CharSequence getPrefixText() {
        return this.b.c;
    }

    @Nullable
    public ColorStateList getPrefixTextColor() {
        return this.b.b.getTextColors();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.b.b;
    }

    @NonNull
    public xah getShapeAppearanceModel() {
        return this.M;
    }

    @Nullable
    public CharSequence getStartIconContentDescription() {
        return this.b.d.getContentDescription();
    }

    @Nullable
    public Drawable getStartIconDrawable() {
        return this.b.d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.b.g;
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.b.h;
    }

    @Nullable
    public CharSequence getSuffixText() {
        return this.c.p;
    }

    @Nullable
    public ColorStateList getSuffixTextColor() {
        return this.c.q.getTextColors();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.c.q;
    }

    @Nullable
    public Typeface getTypeface() {
        return this.c0;
    }

    public final qzb h(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.sofascore.results.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        EditText editText = this.e;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.sofascore.results.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.sofascore.results.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        p7g p7gVar = new p7g();
        p7g p7gVar2 = new p7g();
        p7g p7gVar3 = new p7g();
        p7g p7gVar4 = new p7g();
        ug5 ug5Var = new ug5();
        ug5 ug5Var2 = new ug5();
        ug5 ug5Var3 = new ug5();
        ug5 ug5Var4 = new ug5();
        q0 q0Var = new q0(f);
        q0 q0Var2 = new q0(f);
        q0 q0Var3 = new q0(dimensionPixelOffset);
        q0 q0Var4 = new q0(dimensionPixelOffset);
        xah xahVar = new xah();
        xahVar.a = p7gVar;
        xahVar.b = p7gVar2;
        xahVar.c = p7gVar3;
        xahVar.d = p7gVar4;
        xahVar.e = q0Var;
        xahVar.f = q0Var2;
        xahVar.g = q0Var4;
        xahVar.h = q0Var3;
        xahVar.i = ug5Var;
        xahVar.j = ug5Var2;
        xahVar.k = ug5Var3;
        xahVar.l = ug5Var4;
        EditText editText2 = this.e;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = qzb.F;
            dropDownBackgroundTintList = ColorStateList.valueOf(o3a.O(context, x2a.P(context, com.sofascore.results.R.attr.colorSurface, qzb.class.getSimpleName())));
        }
        qzb qzbVar = new qzb();
        qzbVar.p(context);
        qzbVar.t(dropDownBackgroundTintList);
        qzbVar.s(popupElevation);
        qzbVar.setShapeAppearanceModel(xahVar);
        ozb ozbVar = qzbVar.b;
        if (ozbVar.h == null) {
            ozbVar.h = new Rect();
        }
        qzbVar.b.h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        qzbVar.invalidateSelf();
        return qzbVar;
    }

    public final int i(int i, boolean z) {
        return ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.e.getCompoundPaddingLeft() : this.c.c() : this.b.a()) + i;
    }

    public final int j(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.e.getCompoundPaddingRight() : this.b.a() : this.c.c());
    }

    public final void k() {
        int i = this.P;
        if (i == 0) {
            this.G = null;
            this.K = null;
            this.L = null;
        } else if (i == 1) {
            this.G = new qzb(this.M);
            this.K = new qzb();
            this.L = new qzb();
        } else {
            if (i != 2) {
                a70.p(fc6.h(this.P, " is illegal; only @BoxBackgroundMode constants are supported.", new StringBuilder()));
                return;
            }
            if (!this.D || (this.G instanceof qa4)) {
                this.G = new qzb(this.M);
            } else {
                xah xahVar = this.M;
                int i2 = qa4.I;
                if (xahVar == null) {
                    xahVar = new xah();
                }
                pa4 pa4Var = new pa4(xahVar, new RectF());
                qa4 qa4Var = new qa4(pa4Var);
                qa4Var.H = pa4Var;
                this.G = qa4Var;
            }
            this.K = null;
            this.L = null;
        }
        u();
        z();
        if (this.P == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.Q = getResources().getDimensionPixelSize(com.sofascore.results.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (w3a.H(getContext())) {
                this.Q = getResources().getDimensionPixelSize(com.sofascore.results.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.P != 0) {
            v();
        }
        EditText editText = this.e;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.P;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        int i;
        float f5;
        int i2;
        if (g()) {
            int width = this.e.getWidth();
            int gravity = this.e.getGravity();
            b13 b13Var = this.w0;
            boolean c = b13Var.c(b13Var.H);
            b13Var.J = c;
            Rect rect = b13Var.h;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = b13Var.k0;
                    }
                } else if (c) {
                    f = rect.right;
                    f2 = b13Var.k0;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                float max = Math.max(f3, rect.left);
                rectF = this.b0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (b13Var.k0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (b13Var.J) {
                        f5 = b13Var.k0;
                        f4 = f5 + max;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (b13Var.J) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f5 = b13Var.k0;
                    f4 = f5 + max;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = b13Var.g() + rect.top;
                if (b13Var.j0 != null && !b13Var.C()) {
                    StaticLayout staticLayout = b13Var.j0;
                    float lineWidth = (b13Var.n / b13Var.m) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (b13Var.J) {
                        rectF.right = rectF.left + lineWidth;
                    } else {
                        rectF.left = rectF.right - lineWidth;
                    }
                }
                if (rectF.width() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || rectF.height() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                }
                float f6 = rectF.left;
                float f7 = this.O;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.R);
                rectF.top = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                qa4 qa4Var = (qa4) this.G;
                qa4Var.getClass();
                qa4Var.F(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = b13Var.k0 / 2.0f;
            f3 = f - f2;
            float max2 = Math.max(f3, rect.left);
            rectF = this.b0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f4 = (width / 2.0f) + (b13Var.k0 / 2.0f);
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = b13Var.g() + rect.top;
            if (b13Var.j0 != null) {
                StaticLayout staticLayout2 = b13Var.j0;
                float lineWidth2 = (b13Var.n / b13Var.m) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
                if (b13Var.J) {
                }
            }
            if (rectF.width() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            }
        }
    }

    public final void n(AppCompatTextView appCompatTextView, int i) {
        try {
            appCompatTextView.setTextAppearance(i);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        appCompatTextView.setTextAppearance(com.sofascore.results.R.style.TextAppearance_AppCompat_Caption);
        appCompatTextView.setTextColor(getContext().getColor(com.sofascore.results.R.color.design_error));
    }

    public final boolean o() {
        o1a o1aVar = this.k;
        return (o1aVar.o != 1 || o1aVar.r == null || TextUtils.isEmpty(o1aVar.p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.w0.k(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        qn5 qn5Var = this.c;
        qn5Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.C0 = false;
        if (this.e != null && this.e.getMeasuredHeight() < (max = Math.max(qn5Var.getMeasuredHeight(), this.b.getMeasuredHeight()))) {
            this.e.setMinimumHeight(max);
            z = true;
        }
        boolean s = s();
        if (z || s) {
            this.e.post(new t4f(this, 16));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float i5;
        int i6;
        int compoundPaddingTop;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.e;
        if (editText != null) {
            Rect rect = this.W;
            by4.a(this, editText, rect);
            qzb qzbVar = this.K;
            if (qzbVar != null) {
                int i7 = rect.bottom;
                qzbVar.setBounds(rect.left, i7 - this.S, rect.right, i7);
            }
            qzb qzbVar2 = this.L;
            if (qzbVar2 != null) {
                int i8 = rect.bottom;
                qzbVar2.setBounds(rect.left, i8 - this.T, rect.right, i8);
            }
            if (this.D) {
                float textSize = this.e.getTextSize();
                b13 b13Var = this.w0;
                b13Var.y(textSize);
                TextPaint textPaint = b13Var.V;
                int gravity = this.e.getGravity();
                b13Var.s((gravity & (-113)) | 48);
                b13Var.x(gravity);
                Rect d = d(rect);
                b13Var.o(d.left, d.top, d.right, d.bottom);
                if (this.e == null) {
                    zzl.s();
                    return;
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(b13Var.m);
                    textPaint.setTypeface(b13Var.A);
                    textPaint.setLetterSpacing(b13Var.h0);
                    i5 = -textPaint.ascent();
                } else {
                    i5 = b13Var.i() * b13Var.q;
                }
                int compoundPaddingLeft = this.e.getCompoundPaddingLeft() + rect.left;
                Rect rect2 = this.a0;
                rect2.left = compoundPaddingLeft;
                if (this.P != 1 || this.e.getMinLines() > 1) {
                    if (this.P != 0 || getHintMaxLines() == 1) {
                        i6 = 0;
                    } else {
                        textPaint.setTextSize(b13Var.m);
                        textPaint.setTypeface(b13Var.A);
                        textPaint.setLetterSpacing(b13Var.h0);
                        i6 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.e.getCompoundPaddingTop() + rect.top) - i6;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (i5 / 2.0f));
                }
                rect2.top = compoundPaddingTop;
                rect2.right = rect.right - this.e.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.P != 1 || this.e.getMinLines() > 1) ? rect.bottom - this.e.getCompoundPaddingBottom() : (int) (rect2.top + i5);
                rect2.bottom = compoundPaddingBottom;
                b13Var.u(rect2.left, rect2.top, rect2.right, compoundPaddingBottom, true);
                b13Var.l(false);
                if (!g() || this.v0) {
                    return;
                }
                l();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.C0;
        qn5 qn5Var = this.c;
        if (!z) {
            qn5Var.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.C0 = true;
        }
        if (this.u != null && (editText = this.e) != null) {
            this.u.setGravity(editText.getGravity());
            this.u.setPadding(this.e.getCompoundPaddingLeft(), this.e.getCompoundPaddingTop(), this.e.getCompoundPaddingRight(), this.e.getCompoundPaddingBottom());
        }
        qn5Var.n();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.e.getMeasuredWidth() - this.e.getCompoundPaddingLeft()) - this.e.getCompoundPaddingRight();
        b13 b13Var = this.w0;
        TextPaint textPaint = b13Var.V;
        textPaint.setTextSize(b13Var.n);
        textPaint.setTypeface(b13Var.x);
        textPaint.setLetterSpacing(b13Var.g0);
        float f2 = measuredWidth;
        b13Var.t0 = b13Var.e(b13Var.p0, textPaint, b13Var.H, (b13Var.n / b13Var.m) * f2, b13Var.J).getHeight();
        textPaint.setTextSize(b13Var.m);
        textPaint.setTypeface(b13Var.A);
        textPaint.setLetterSpacing(b13Var.h0);
        b13Var.u0 = b13Var.e(b13Var.o0, textPaint, b13Var.H, f2, b13Var.J).getHeight();
        EditText editText2 = this.e;
        Rect rect = this.W;
        by4.a(this, editText2, rect);
        Rect d = d(rect);
        b13Var.o(d.left, d.top, d.right, d.bottom);
        v();
        a();
        if (this.e == null) {
            return;
        }
        int i3 = b13Var.u0;
        if (i3 != -1) {
            f = i3;
        } else {
            TextPaint textPaint2 = b13Var.V;
            textPaint2.setTextSize(b13Var.m);
            textPaint2.setTypeface(b13Var.A);
            textPaint2.setLetterSpacing(b13Var.h0);
            f = -textPaint2.ascent();
        }
        CharSequence charSequence = this.s;
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (charSequence != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.u.getPaint());
            textPaint3.setTextSize(this.u.getTextSize());
            textPaint3.setTypeface(this.u.getTypeface());
            textPaint3.setLetterSpacing(this.u.getLetterSpacing());
            eei eeiVar = new eei(this.s, textPaint3, measuredWidth);
            eeiVar.k = getLayoutDirection() == 1;
            eeiVar.j = true;
            float lineSpacingExtra = this.u.getLineSpacingExtra();
            float lineSpacingMultiplier = this.u.getLineSpacingMultiplier();
            eeiVar.g = lineSpacingExtra;
            eeiVar.h = lineSpacingMultiplier;
            eeiVar.m = new imf(this, 22);
            StaticLayout a = eeiVar.a();
            if (this.P == 1) {
                f3 = b13Var.g() + this.Q + this.d;
            }
            f3 += a.getHeight();
        }
        float max = Math.max(f, f3);
        if (this.e.getMeasuredHeight() < max) {
            this.e.setMinimumHeight(Math.round(max));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        setError(savedState.c);
        if (savedState.d) {
            post(new kac(this, 21));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.N) {
            ut3 ut3Var = this.M.e;
            RectF rectF = this.b0;
            float a = ut3Var.a(rectF);
            float a2 = this.M.f.a(rectF);
            float a3 = this.M.h.a(rectF);
            float a4 = this.M.g.a(rectF);
            xah xahVar = this.M;
            hz8 hz8Var = xahVar.a;
            hz8 hz8Var2 = xahVar.b;
            hz8 hz8Var3 = xahVar.d;
            hz8 hz8Var4 = xahVar.c;
            ug5 ug5Var = new ug5();
            ug5 ug5Var2 = new ug5();
            ug5 ug5Var3 = new ug5();
            ug5 ug5Var4 = new ug5();
            q0 q0Var = new q0(a2);
            q0 q0Var2 = new q0(a);
            q0 q0Var3 = new q0(a4);
            q0 q0Var4 = new q0(a3);
            xah xahVar2 = new xah();
            xahVar2.a = hz8Var2;
            xahVar2.b = hz8Var;
            xahVar2.c = hz8Var3;
            xahVar2.d = hz8Var4;
            xahVar2.e = q0Var;
            xahVar2.f = q0Var2;
            xahVar2.g = q0Var4;
            xahVar2.h = q0Var3;
            xahVar2.i = ug5Var;
            xahVar2.j = ug5Var2;
            xahVar2.k = ug5Var3;
            xahVar2.l = ug5Var4;
            this.N = z;
            setShapeAppearanceModel(xahVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (o()) {
            savedState.c = getError();
        }
        qn5 qn5Var = this.c;
        savedState.d = qn5Var.i != 0 && qn5Var.g.d;
        return savedState;
    }

    public final void p(Editable editable) {
        ((ilg) this.o).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.n;
        int i = this.m;
        if (i == -1) {
            this.p.setText(String.valueOf(length));
            this.p.setContentDescription(null);
            this.n = false;
        } else {
            this.n = length > i;
            Context context = getContext();
            this.p.setContentDescription(context.getString(this.n ? com.sofascore.results.R.string.character_counter_overflowed_content_description : com.sofascore.results.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.m)));
            if (z != this.n) {
                q();
            }
            String str = uv1.b;
            uv1 uv1Var = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? uv1.e : uv1.d;
            AppCompatTextView appCompatTextView = this.p;
            String string = getContext().getString(com.sofascore.results.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.m));
            uv1Var.getClass();
            fjg fjgVar = a9j.a;
            appCompatTextView.setText(string != null ? uv1Var.c(string).toString() : null);
        }
        if (this.e == null || z == this.n) {
            return;
        }
        w(false, false);
        z();
        t();
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.p;
        if (appCompatTextView != null) {
            n(appCompatTextView, this.n ? this.q : this.r);
            if (!this.n && (colorStateList2 = this.z) != null) {
                this.p.setTextColor(colorStateList2);
            }
            if (!this.n || (colorStateList = this.A) == null) {
                return;
            }
            this.p.setTextColor(colorStateList);
        }
    }

    public final void r() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.B;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue K = x2a.K(context.getTheme(), com.sofascore.results.R.attr.colorControlActivated);
            if (K != null) {
                int i = K.resourceId;
                if (i != 0) {
                    colorStateList2 = eq3.q(i, context);
                } else {
                    int i2 = K.data;
                    if (i2 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i2);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.e;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable mutate = this.e.getTextCursorDrawable().mutate();
        if ((o() || (this.p != null && this.n)) && (colorStateList = this.C) != null) {
            colorStateList2 = colorStateList;
        }
        mutate.setTintList(colorStateList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s() {
        boolean z;
        qn5 qn5Var;
        Drawable[] compoundDrawablesRelative;
        ColorDrawable colorDrawable;
        Drawable drawable;
        ColorDrawable colorDrawable2;
        if (this.e == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            xbi xbiVar = this.b;
            if (xbiVar.getMeasuredWidth() > 0) {
                int max = Math.max(0, xbiVar.getMeasuredWidth() - this.e.getPaddingLeft());
                if (this.d0 == null || this.e0 != max) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.d0 = colorDrawable3;
                    this.e0 = max;
                    colorDrawable3.setBounds(0, 0, max, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.e.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.d0;
                if (drawable2 != colorDrawable4) {
                    this.e.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z = true;
                    qn5Var = this.c;
                    if ((!qn5Var.e() || ((qn5Var.i != 0 && qn5Var.d()) || qn5Var.p != null)) && qn5Var.getMeasuredWidth() > 0) {
                        int measuredWidth = qn5Var.q.getMeasuredWidth() - this.e.getPaddingRight();
                        if (!qn5Var.e()) {
                            checkableImageButton = qn5Var.c;
                        } else if (qn5Var.i != 0 && qn5Var.d()) {
                            checkableImageButton = qn5Var.g;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth;
                        }
                        int max2 = Math.max(0, measuredWidth);
                        compoundDrawablesRelative = this.e.getCompoundDrawablesRelative();
                        colorDrawable = this.g0;
                        if (colorDrawable == null && this.h0 != max2) {
                            this.h0 = max2;
                            colorDrawable.setBounds(0, 0, max2, 1);
                            this.e.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.g0, compoundDrawablesRelative[3]);
                            return true;
                        }
                        if (colorDrawable == null) {
                            ColorDrawable colorDrawable5 = new ColorDrawable();
                            this.g0 = colorDrawable5;
                            this.h0 = max2;
                            colorDrawable5.setBounds(0, 0, max2, 1);
                        }
                        drawable = compoundDrawablesRelative[2];
                        colorDrawable2 = this.g0;
                        if (drawable != colorDrawable2) {
                            this.i0 = drawable;
                            this.e.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            return true;
                        }
                    } else if (this.g0 != null) {
                        Drawable[] compoundDrawablesRelative3 = this.e.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.g0) {
                            this.e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.i0, compoundDrawablesRelative3[3]);
                        } else {
                            z2 = z;
                        }
                        this.g0 = null;
                        return z2;
                    }
                    return z;
                }
                z = false;
                qn5Var = this.c;
                if (qn5Var.e()) {
                }
                int measuredWidth2 = qn5Var.q.getMeasuredWidth() - this.e.getPaddingRight();
                if (!qn5Var.e()) {
                }
                if (checkableImageButton != null) {
                }
                int max22 = Math.max(0, measuredWidth2);
                compoundDrawablesRelative = this.e.getCompoundDrawablesRelative();
                colorDrawable = this.g0;
                if (colorDrawable == null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.g0;
                if (drawable != colorDrawable2) {
                }
                return z;
            }
        }
        if (this.d0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.e.getCompoundDrawablesRelative();
            this.e.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.d0 = null;
            z = true;
            qn5Var = this.c;
            if (qn5Var.e()) {
            }
            int measuredWidth22 = qn5Var.q.getMeasuredWidth() - this.e.getPaddingRight();
            if (!qn5Var.e()) {
            }
            if (checkableImageButton != null) {
            }
            int max222 = Math.max(0, measuredWidth22);
            compoundDrawablesRelative = this.e.getCompoundDrawablesRelative();
            colorDrawable = this.g0;
            if (colorDrawable == null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.g0;
            if (drawable != colorDrawable2) {
            }
            return z;
        }
        z = false;
        qn5Var = this.c;
        if (qn5Var.e()) {
        }
        int measuredWidth222 = qn5Var.q.getMeasuredWidth() - this.e.getPaddingRight();
        if (!qn5Var.e()) {
        }
        if (checkableImageButton != null) {
        }
        int max2222 = Math.max(0, measuredWidth222);
        compoundDrawablesRelative = this.e.getCompoundDrawablesRelative();
        colorDrawable = this.g0;
        if (colorDrawable == null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.g0;
        if (drawable != colorDrawable2) {
        }
        return z;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.V != i) {
            this.V = i;
            this.p0 = i;
            this.r0 = i;
            this.s0 = i;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.p0 = defaultColor;
        this.V = defaultColor;
        this.q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.r0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.s0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.P) {
            return;
        }
        this.P = i;
        if (this.e != null) {
            k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.Q = i;
    }

    public void setBoxCornerFamily(int i) {
        wah m = this.M.m();
        ut3 ut3Var = this.M.e;
        m.a = l4a.n(i);
        m.e = ut3Var;
        ut3 ut3Var2 = this.M.f;
        m.b = l4a.n(i);
        m.f = ut3Var2;
        ut3 ut3Var3 = this.M.h;
        m.d = l4a.n(i);
        m.h = ut3Var3;
        ut3 ut3Var4 = this.M.g;
        m.c = l4a.n(i);
        m.g = ut3Var4;
        this.M = m.a();
        c();
    }

    public void setBoxStrokeColor(int i) {
        if (this.n0 != i) {
            this.n0 = i;
            z();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.l0 = colorStateList.getDefaultColor();
            this.t0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.m0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.n0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.n0 != colorStateList.getDefaultColor()) {
            this.n0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.o0 != colorStateList) {
            this.o0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.S = i;
        z();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.T = i;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.l != z) {
            o1a o1aVar = this.k;
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
                this.p = appCompatTextView;
                appCompatTextView.setId(com.sofascore.results.R.id.textinput_counter);
                Typeface typeface = this.c0;
                if (typeface != null) {
                    this.p.setTypeface(typeface);
                }
                this.p.setMaxLines(1);
                o1aVar.a(this.p, 2);
                ((ViewGroup.MarginLayoutParams) this.p.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.sofascore.results.R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.p != null) {
                    EditText editText = this.e;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                o1aVar.g(this.p, 2);
                this.p = null;
            }
            this.l = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.m != i) {
            if (i > 0) {
                this.m = i;
            } else {
                this.m = -1;
            }
            if (!this.l || this.p == null) {
                return;
            }
            EditText editText = this.e;
            p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.q != i) {
            this.q = i;
            q();
        }
    }

    public void setCounterOverflowTextColor(@Nullable ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.r != i) {
            this.r = i;
            q();
        }
    }

    public void setCounterTextColor(@Nullable ColorStateList colorStateList) {
        if (this.z != colorStateList) {
            this.z = colorStateList;
            q();
        }
    }

    public void setCursorColor(@Nullable ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            if (o() || (this.p != null && this.n)) {
                r();
            }
        }
    }

    public void setDefaultHintTextColor(@Nullable ColorStateList colorStateList) {
        this.j0 = colorStateList;
        this.k0 = colorStateList;
        if (this.e != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.c.g.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.c.g.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        qn5 qn5Var = this.c;
        qn5Var.g(i != 0 ? qn5Var.getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        qn5 qn5Var = this.c;
        Drawable d0 = i != 0 ? td4.d0(i, qn5Var.getContext()) : null;
        TextInputLayout textInputLayout = qn5Var.a;
        CheckableImageButton checkableImageButton = qn5Var.g;
        checkableImageButton.setImageDrawable(d0);
        if (d0 != null) {
            fkf.u(textInputLayout, checkableImageButton, qn5Var.k, qn5Var.l);
            fkf.K(textInputLayout, checkableImageButton, qn5Var.k);
        }
    }

    public void setEndIconMinSize(int i) {
        qn5 qn5Var = this.c;
        if (i < 0) {
            qn5Var.getClass();
            a70.p("endIconSize cannot be less than 0");
        } else if (i != qn5Var.m) {
            qn5Var.m = i;
            CheckableImageButton checkableImageButton = qn5Var.g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = qn5Var.c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.c.h(i);
    }

    public void setEndIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        qn5 qn5Var = this.c;
        CheckableImageButton checkableImageButton = qn5Var.g;
        View.OnLongClickListener onLongClickListener = qn5Var.o;
        checkableImageButton.setOnClickListener(onClickListener);
        fkf.L(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        qn5 qn5Var = this.c;
        qn5Var.o = onLongClickListener;
        CheckableImageButton checkableImageButton = qn5Var.g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        fkf.L(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        qn5 qn5Var = this.c;
        qn5Var.n = scaleType;
        qn5Var.g.setScaleType(scaleType);
        qn5Var.c.setScaleType(scaleType);
    }

    public void setEndIconTintList(@Nullable ColorStateList colorStateList) {
        qn5 qn5Var = this.c;
        if (qn5Var.k != colorStateList) {
            qn5Var.k = colorStateList;
            fkf.u(qn5Var.a, qn5Var.g, colorStateList, qn5Var.l);
        }
    }

    public void setEndIconTintMode(@Nullable PorterDuff.Mode mode) {
        qn5 qn5Var = this.c;
        if (qn5Var.l != mode) {
            qn5Var.l = mode;
            fkf.u(qn5Var.a, qn5Var.g, qn5Var.k, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.c.i(z);
    }

    public void setError(@Nullable CharSequence charSequence) {
        o1a o1aVar = this.k;
        if (!o1aVar.q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            o1aVar.f();
            return;
        }
        o1aVar.c();
        o1aVar.p = charSequence;
        o1aVar.r.setText(charSequence);
        int i = o1aVar.n;
        if (i != 1) {
            o1aVar.o = 1;
        }
        o1aVar.i(i, o1aVar.o, o1aVar.h(o1aVar.r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        o1a o1aVar = this.k;
        o1aVar.t = i;
        AppCompatTextView appCompatTextView = o1aVar.r;
        if (appCompatTextView != null) {
            appCompatTextView.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(@Nullable CharSequence charSequence) {
        o1a o1aVar = this.k;
        o1aVar.s = charSequence;
        AppCompatTextView appCompatTextView = o1aVar.r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        o1a o1aVar = this.k;
        TextInputLayout textInputLayout = o1aVar.h;
        if (o1aVar.q == z) {
            return;
        }
        o1aVar.c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(o1aVar.g, null);
            o1aVar.r = appCompatTextView;
            appCompatTextView.setId(com.sofascore.results.R.id.textinput_error);
            o1aVar.r.setTextAlignment(5);
            Typeface typeface = o1aVar.B;
            if (typeface != null) {
                o1aVar.r.setTypeface(typeface);
            }
            int i = o1aVar.u;
            o1aVar.u = i;
            AppCompatTextView appCompatTextView2 = o1aVar.r;
            if (appCompatTextView2 != null) {
                o1aVar.h.n(appCompatTextView2, i);
            }
            ColorStateList colorStateList = o1aVar.v;
            o1aVar.v = colorStateList;
            AppCompatTextView appCompatTextView3 = o1aVar.r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = o1aVar.s;
            o1aVar.s = charSequence;
            AppCompatTextView appCompatTextView4 = o1aVar.r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i2 = o1aVar.t;
            o1aVar.t = i2;
            AppCompatTextView appCompatTextView5 = o1aVar.r;
            if (appCompatTextView5 != null) {
                appCompatTextView5.setAccessibilityLiveRegion(i2);
            }
            o1aVar.r.setVisibility(4);
            o1aVar.a(o1aVar.r, 0);
        } else {
            o1aVar.f();
            o1aVar.g(o1aVar.r, 0);
            o1aVar.r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        o1aVar.q = z;
    }

    public void setErrorIconDrawable(int i) {
        qn5 qn5Var = this.c;
        qn5Var.j(i != 0 ? td4.d0(i, qn5Var.getContext()) : null);
        fkf.K(qn5Var.a, qn5Var.c, qn5Var.d);
    }

    public void setErrorIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        qn5 qn5Var = this.c;
        CheckableImageButton checkableImageButton = qn5Var.c;
        View.OnLongClickListener onLongClickListener = qn5Var.f;
        checkableImageButton.setOnClickListener(onClickListener);
        fkf.L(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        qn5 qn5Var = this.c;
        qn5Var.f = onLongClickListener;
        CheckableImageButton checkableImageButton = qn5Var.c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        fkf.L(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(@Nullable ColorStateList colorStateList) {
        qn5 qn5Var = this.c;
        if (qn5Var.d != colorStateList) {
            qn5Var.d = colorStateList;
            fkf.u(qn5Var.a, qn5Var.c, colorStateList, qn5Var.e);
        }
    }

    public void setErrorIconTintMode(@Nullable PorterDuff.Mode mode) {
        qn5 qn5Var = this.c;
        if (qn5Var.e != mode) {
            qn5Var.e = mode;
            fkf.u(qn5Var.a, qn5Var.c, qn5Var.d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        o1a o1aVar = this.k;
        o1aVar.u = i;
        AppCompatTextView appCompatTextView = o1aVar.r;
        if (appCompatTextView != null) {
            o1aVar.h.n(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(@Nullable ColorStateList colorStateList) {
        o1a o1aVar = this.k;
        o1aVar.v = colorStateList;
        AppCompatTextView appCompatTextView = o1aVar.r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.x0 != z) {
            this.x0 = z;
            w(false, false);
        }
    }

    public void setHelperText(@Nullable CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        o1a o1aVar = this.k;
        if (isEmpty) {
            if (o1aVar.x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!o1aVar.x) {
            setHelperTextEnabled(true);
        }
        o1aVar.c();
        o1aVar.w = charSequence;
        o1aVar.y.setText(charSequence);
        int i = o1aVar.n;
        if (i != 2) {
            o1aVar.o = 2;
        }
        o1aVar.i(i, o1aVar.o, o1aVar.h(o1aVar.y, charSequence));
    }

    public void setHelperTextColor(@Nullable ColorStateList colorStateList) {
        o1a o1aVar = this.k;
        o1aVar.A = colorStateList;
        AppCompatTextView appCompatTextView = o1aVar.y;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        o1a o1aVar = this.k;
        TextInputLayout textInputLayout = o1aVar.h;
        if (o1aVar.x == z) {
            return;
        }
        o1aVar.c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(o1aVar.g, null);
            o1aVar.y = appCompatTextView;
            appCompatTextView.setId(com.sofascore.results.R.id.textinput_helper_text);
            o1aVar.y.setTextAlignment(5);
            Typeface typeface = o1aVar.B;
            if (typeface != null) {
                o1aVar.y.setTypeface(typeface);
            }
            o1aVar.y.setVisibility(4);
            o1aVar.y.setImportantForAccessibility(2);
            int i = o1aVar.z;
            o1aVar.z = i;
            AppCompatTextView appCompatTextView2 = o1aVar.y;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setTextAppearance(i);
            }
            ColorStateList colorStateList = o1aVar.A;
            o1aVar.A = colorStateList;
            AppCompatTextView appCompatTextView3 = o1aVar.y;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            o1aVar.a(o1aVar.y, 1);
        } else {
            o1aVar.c();
            int i2 = o1aVar.n;
            if (i2 == 2) {
                o1aVar.o = 0;
            }
            o1aVar.i(i2, o1aVar.o, o1aVar.h(o1aVar.y, ""));
            o1aVar.g(o1aVar.y, 1);
            o1aVar.y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        o1aVar.x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        o1a o1aVar = this.k;
        o1aVar.z = i;
        AppCompatTextView appCompatTextView = o1aVar.y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHintAnimationEnabled(boolean z) {
        this.y0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.D) {
            this.D = z;
            if (z) {
                CharSequence hint = this.e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.E)) {
                        setHint(hint);
                    }
                    this.e.setHint((CharSequence) null);
                }
                this.F = true;
            } else {
                this.F = false;
                if (!TextUtils.isEmpty(this.E) && TextUtils.isEmpty(this.e.getHint())) {
                    this.e.setHint(this.E);
                }
                setHintInternal(null);
            }
            if (this.e != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i) {
        b13 b13Var = this.w0;
        if (i != b13Var.p0) {
            b13Var.p0 = i;
            b13Var.l(false);
        }
        b13Var.v(i);
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        b13 b13Var = this.w0;
        b13Var.q(i);
        this.k0 = b13Var.p;
        if (this.e != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(@Nullable ColorStateList colorStateList) {
        if (this.k0 != colorStateList) {
            if (this.j0 == null) {
                this.w0.r(colorStateList);
            }
            this.k0 = colorStateList;
            if (this.e != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(@NonNull fdj fdjVar) {
        this.o = fdjVar;
    }

    public void setMaxEms(int i) {
        this.h = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.j = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.g = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.i = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        qn5 qn5Var = this.c;
        qn5Var.g.setContentDescription(i != 0 ? qn5Var.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        qn5 qn5Var = this.c;
        qn5Var.g.setImageDrawable(i != 0 ? td4.d0(i, qn5Var.getContext()) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        qn5 qn5Var = this.c;
        if (z && qn5Var.i != 1) {
            qn5Var.h(1);
        } else if (z) {
            qn5Var.getClass();
        } else {
            qn5Var.h(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList) {
        qn5 qn5Var = this.c;
        qn5Var.k = colorStateList;
        fkf.u(qn5Var.a, qn5Var.g, colorStateList, qn5Var.l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode mode) {
        qn5 qn5Var = this.c;
        qn5Var.l = mode;
        fkf.u(qn5Var.a, qn5Var.g, qn5Var.k, mode);
    }

    public void setPlaceholderText(@Nullable CharSequence charSequence) {
        if (this.u == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
            this.u = appCompatTextView;
            appCompatTextView.setId(com.sofascore.results.R.id.textinput_placeholder);
            this.u.setImportantForAccessibility(1);
            this.u.setAccessibilityLiveRegion(1);
            ym6 f = f();
            this.x = f;
            f.b = 67L;
            this.y = f();
            setPlaceholderTextAppearance(this.w);
            setPlaceholderTextColor(this.v);
            bsk.q(this.u, new uyb(4));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.t) {
                setPlaceholderTextEnabled(true);
            }
            this.s = charSequence;
        }
        EditText editText = this.e;
        x(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.w = i;
        AppCompatTextView appCompatTextView = this.u;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(@Nullable ColorStateList colorStateList) {
        if (this.v != colorStateList) {
            this.v = colorStateList;
            AppCompatTextView appCompatTextView = this.u;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(@Nullable CharSequence charSequence) {
        xbi xbiVar = this.b;
        xbiVar.getClass();
        xbiVar.c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        xbiVar.b.setText(charSequence);
        xbiVar.f();
    }

    public void setPrefixTextAppearance(int i) {
        this.b.b.setTextAppearance(i);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.b.b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(@NonNull xah xahVar) {
        qzb qzbVar = this.G;
        if (qzbVar == null || qzbVar.k() == xahVar) {
            return;
        }
        this.M = xahVar;
        c();
    }

    public void setStartIconCheckable(boolean z) {
        this.b.d.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? td4.d0(i, getContext()) : null);
    }

    public void setStartIconMinSize(int i) {
        xbi xbiVar = this.b;
        if (i < 0) {
            xbiVar.getClass();
            a70.p("startIconSize cannot be less than 0");
        } else if (i != xbiVar.g) {
            xbiVar.g = i;
            CheckableImageButton checkableImageButton = xbiVar.d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        xbi xbiVar = this.b;
        CheckableImageButton checkableImageButton = xbiVar.d;
        View.OnLongClickListener onLongClickListener = xbiVar.i;
        checkableImageButton.setOnClickListener(onClickListener);
        fkf.L(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        xbi xbiVar = this.b;
        xbiVar.i = onLongClickListener;
        CheckableImageButton checkableImageButton = xbiVar.d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        fkf.L(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        xbi xbiVar = this.b;
        xbiVar.h = scaleType;
        xbiVar.d.setScaleType(scaleType);
    }

    public void setStartIconTintList(@Nullable ColorStateList colorStateList) {
        xbi xbiVar = this.b;
        if (xbiVar.e != colorStateList) {
            xbiVar.e = colorStateList;
            fkf.u(xbiVar.a, xbiVar.d, colorStateList, xbiVar.f);
        }
    }

    public void setStartIconTintMode(@Nullable PorterDuff.Mode mode) {
        xbi xbiVar = this.b;
        if (xbiVar.f != mode) {
            xbiVar.f = mode;
            fkf.u(xbiVar.a, xbiVar.d, xbiVar.e, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.b.d(z);
    }

    public void setSuffixText(@Nullable CharSequence charSequence) {
        qn5 qn5Var = this.c;
        qn5Var.getClass();
        qn5Var.p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        qn5Var.q.setText(charSequence);
        qn5Var.o();
    }

    public void setSuffixTextAppearance(int i) {
        this.c.q.setTextAppearance(i);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.c.q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@Nullable edj edjVar) {
        EditText editText = this.e;
        if (editText != null) {
            bsk.q(editText, edjVar);
        }
    }

    public void setTypeface(@Nullable Typeface typeface) {
        if (typeface != this.c0) {
            this.c0 = typeface;
            b13 b13Var = this.w0;
            boolean t = b13Var.t(typeface);
            boolean z = b13Var.z(typeface);
            if (t || z) {
                b13Var.l(false);
            }
            o1a o1aVar = this.k;
            if (typeface != o1aVar.B) {
                o1aVar.B = typeface;
                AppCompatTextView appCompatTextView = o1aVar.r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = o1aVar.y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.p;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.e;
        if (editText == null || this.P != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = fb5.a;
        Drawable mutate = background.mutate();
        if (o()) {
            mutate.setColorFilter(xb0.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.n && (appCompatTextView = this.p) != null) {
            mutate.setColorFilter(xb0.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.e.refreshDrawableState();
        }
    }

    public final void u() {
        EditText editText = this.e;
        if (editText == null || this.G == null) {
            return;
        }
        if ((this.J || editText.getBackground() == null) && this.P != 0) {
            this.e.setBackground(getEditTextBoxBackground());
            this.J = true;
        }
    }

    public final void v() {
        if (this.P != 1) {
            FrameLayout frameLayout = this.a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int e = e();
            if (e != layoutParams.topMargin) {
                layoutParams.topMargin = e;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z, boolean z2) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean isEnabled = isEnabled();
        EditText editText = this.e;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.e;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.j0;
        b13 b13Var = this.w0;
        if (colorStateList2 != null) {
            b13Var.n(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.j0;
            int i = this.t0;
            if (colorStateList3 != null) {
                i = colorStateList3.getColorForState(new int[]{-16842910}, i);
            }
            b13Var.n(ColorStateList.valueOf(i));
        } else if (o()) {
            AppCompatTextView appCompatTextView2 = this.k.r;
            b13Var.n(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.n && (appCompatTextView = this.p) != null) {
            b13Var.n(appCompatTextView.getTextColors());
        } else if (z4 && (colorStateList = this.k0) != null) {
            b13Var.r(colorStateList);
        }
        qn5 qn5Var = this.c;
        xbi xbiVar = this.b;
        if (z3 || !this.x0 || (isEnabled() && z4)) {
            if (z2 || this.v0) {
                ValueAnimator valueAnimator = this.z0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.z0.cancel();
                }
                if (z && this.y0) {
                    b(1.0f);
                } else {
                    b13Var.A(1.0f);
                }
                this.v0 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.e;
                x(editText3 != null ? editText3.getText() : null);
                xbiVar.j = false;
                xbiVar.f();
                qn5Var.r = false;
                qn5Var.o();
                return;
            }
            return;
        }
        if (z2 || !this.v0) {
            ValueAnimator valueAnimator2 = this.z0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.z0.cancel();
            }
            if (z && this.y0) {
                b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else {
                b13Var.A(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            if (g() && !((qa4) this.G).H.s.isEmpty() && g()) {
                ((qa4) this.G).F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            this.v0 = true;
            AppCompatTextView appCompatTextView3 = this.u;
            if (appCompatTextView3 != null && this.t) {
                appCompatTextView3.setText((CharSequence) null);
                hxj.a(this.a, this.y);
                this.u.setVisibility(4);
            }
            xbiVar.j = true;
            xbiVar.f();
            qn5Var.r = true;
            qn5Var.o();
        }
    }

    public final void x(Editable editable) {
        ((ilg) this.o).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.a;
        if (length != 0 || this.v0) {
            AppCompatTextView appCompatTextView = this.u;
            if (appCompatTextView == null || !this.t) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            hxj.a(frameLayout, this.y);
            this.u.setVisibility(4);
            return;
        }
        if (this.u == null || !this.t || TextUtils.isEmpty(this.s)) {
            return;
        }
        this.u.setText(this.s);
        hxj.a(frameLayout, this.x);
        this.u.setVisibility(0);
        this.u.bringToFront();
    }

    public final void y(boolean z, boolean z2) {
        int defaultColor = this.o0.getDefaultColor();
        int colorForState = this.o0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.o0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.U = colorForState2;
        } else if (z2) {
            this.U = colorForState;
        } else {
            this.U = defaultColor;
        }
    }

    public final void z() {
        AppCompatTextView appCompatTextView;
        int i;
        EditText editText;
        EditText editText2;
        if (this.G == null || this.P == 0) {
            return;
        }
        boolean z = isFocused() || ((editText2 = this.e) != null && editText2.hasFocus());
        boolean z2 = isHovered() || ((editText = this.e) != null && editText.isHovered());
        if (!isEnabled()) {
            this.U = this.t0;
        } else if (o()) {
            if (this.o0 != null) {
                y(z, z2);
            } else {
                this.U = getErrorCurrentTextColors();
            }
        } else if (!this.n || (appCompatTextView = this.p) == null) {
            if (z) {
                this.U = this.n0;
            } else if (z2) {
                this.U = this.m0;
            } else {
                this.U = this.l0;
            }
        } else if (this.o0 != null) {
            y(z, z2);
        } else {
            this.U = appCompatTextView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        qn5 qn5Var = this.c;
        TextInputLayout textInputLayout = qn5Var.a;
        CheckableImageButton checkableImageButton = qn5Var.g;
        TextInputLayout textInputLayout2 = qn5Var.a;
        qn5Var.m();
        fkf.K(textInputLayout2, qn5Var.c, qn5Var.d);
        fkf.K(textInputLayout2, checkableImageButton, qn5Var.k);
        if (qn5Var.b() instanceof ed5) {
            if (!textInputLayout.o() || checkableImageButton.getDrawable() == null) {
                fkf.u(textInputLayout, checkableImageButton, qn5Var.k, qn5Var.l);
            } else {
                Drawable mutate = checkableImageButton.getDrawable().mutate();
                mutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(mutate);
            }
        }
        xbi xbiVar = this.b;
        fkf.K(xbiVar.a, xbiVar.d, xbiVar.e);
        if (this.P == 2) {
            int i2 = this.R;
            if (z && isEnabled()) {
                i = this.T;
                this.R = i;
            } else {
                i = this.S;
                this.R = i;
            }
            if (i != i2 && g() && !this.v0) {
                if (g()) {
                    ((qa4) this.G).F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                l();
            }
        }
        if (this.P == 1) {
            if (!isEnabled()) {
                this.V = this.q0;
            } else if (z2 && !z) {
                this.V = this.s0;
            } else if (z) {
                this.V = this.r0;
            } else {
                this.V = this.p0;
            }
        }
        c();
        if (getEndIconMode() == 3) {
            EditText editText3 = this.e;
            if ((editText3 instanceof AutoCompleteTextView) && editText3.getInputType() == 0) {
                getEndIconView().setFocusable(false);
                getEndIconView().setClickable(false);
            } else {
                getEndIconView().setFocusable(true);
                getEndIconView().setClickable(true);
            }
        }
    }

    public void setHint(@Nullable CharSequence charSequence) {
        if (this.D) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(com.ironsource.mediationsdk.metadata.a.o);
        }
    }

    public void setStartIconContentDescription(@Nullable CharSequence charSequence) {
        this.b.b(charSequence);
    }

    public void setStartIconDrawable(@Nullable Drawable drawable) {
        this.b.c(drawable);
    }

    public void setEndIconContentDescription(@Nullable CharSequence charSequence) {
        this.c.g(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence) {
        this.c.g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.c.g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(@Nullable Drawable drawable) {
        this.c.j(drawable);
    }

    public void setEndIconDrawable(@Nullable Drawable drawable) {
        qn5 qn5Var = this.c;
        TextInputLayout textInputLayout = qn5Var.a;
        CheckableImageButton checkableImageButton = qn5Var.g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            fkf.u(textInputLayout, checkableImageButton, qn5Var.k, qn5Var.l);
            fkf.K(textInputLayout, checkableImageButton, qn5Var.k);
        }
    }

    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
