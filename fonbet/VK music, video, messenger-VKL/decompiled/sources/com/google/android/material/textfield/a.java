package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import xsna.ank;
import xsna.b0u0;
import xsna.hqv;
import xsna.iut0;
import xsna.lhg;
import xsna.m33;
import xsna.ml;
import xsna.nic;
import xsna.om90;
import xsna.q270;
import xsna.q7;
import xsna.qkp;
import xsna.qm10;
import xsna.sno0;
import xsna.t1u0;
import xsna.tmo;
import xsna.yyo0;

/* compiled from: EndCompoundLayout.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class a extends LinearLayout {
    public final TextInputLayout b;

    @NonNull
    public final FrameLayout c;

    @NonNull
    public final CheckableImageButton d;
    public ColorStateList e;
    public PorterDuff.Mode f;
    public View.OnLongClickListener g;

    @NonNull
    public final CheckableImageButton h;
    public final d i;
    public int j;
    public final LinkedHashSet<TextInputLayout.g> k;
    public ColorStateList l;
    public PorterDuff.Mode m;
    public int n;

    @NonNull
    public ImageView.ScaleType o;
    public View.OnLongClickListener p;

    @Nullable
    public CharSequence q;

    @NonNull
    public final AppCompatTextView r;
    public boolean s;
    public EditText t;

    @Nullable
    public final AccessibilityManager u;

    @Nullable
    public q7 v;
    public final C0127a w;

    /* compiled from: EndCompoundLayout.java */
    /* renamed from: com.google.android.material.textfield.a$a, reason: collision with other inner class name */
    public class C0127a extends sno0 {
        public C0127a() {
        }

        @Override // xsna.sno0, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            a.this.b().a();
        }

        @Override // xsna.sno0, android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            a.this.b().b();
        }
    }

    /* compiled from: EndCompoundLayout.java */
    public class b implements TextInputLayout.f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public final void a(@NonNull TextInputLayout textInputLayout) {
            a aVar = a.this;
            C0127a c0127a = aVar.w;
            if (aVar.t == textInputLayout.getEditText()) {
                return;
            }
            EditText editText = aVar.t;
            if (editText != null) {
                editText.removeTextChangedListener(c0127a);
                if (aVar.t.getOnFocusChangeListener() == aVar.b().e()) {
                    aVar.t.setOnFocusChangeListener(null);
                }
            }
            EditText editText2 = textInputLayout.getEditText();
            aVar.t = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(c0127a);
            }
            aVar.b().m(aVar.t);
            aVar.j(aVar.b());
        }
    }

    /* compiled from: EndCompoundLayout.java */
    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            a aVar = a.this;
            AccessibilityManager accessibilityManager = aVar.u;
            if (aVar.v == null || accessibilityManager == null) {
                return;
            }
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (aVar.isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new ml(aVar.v));
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            AccessibilityManager accessibilityManager;
            a aVar = a.this;
            q7 q7Var = aVar.v;
            if (q7Var == null || (accessibilityManager = aVar.u) == null) {
                return;
            }
            accessibilityManager.removeTouchExplorationStateChangeListener(new ml(q7Var));
        }
    }

    /* compiled from: EndCompoundLayout.java */
    public static class d {
        public final SparseArray<qkp> a = new SparseArray<>();
        public final a b;
        public final int c;
        public final int d;

        public d(a aVar, yyo0 yyo0Var) {
            this.b = aVar;
            int i = R$styleable.TextInputLayout_endIconDrawable;
            TypedArray typedArray = yyo0Var.b;
            this.c = typedArray.getResourceId(i, 0);
            this.d = typedArray.getResourceId(R$styleable.TextInputLayout_passwordToggleDrawable, 0);
        }
    }

    public a(TextInputLayout textInputLayout, yyo0 yyo0Var) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.j = 0;
        this.k = new LinkedHashSet<>();
        this.w = new C0127a();
        b bVar = new b();
        this.u = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a = a(R$id.text_input_error_icon, from, this);
        this.d = a;
        CheckableImageButton a2 = a(R$id.text_input_end_icon, from, frameLayout);
        this.h = a2;
        this.i = new d(this, yyo0Var);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.r = appCompatTextView;
        int i = R$styleable.TextInputLayout_errorIconTint;
        TypedArray typedArray = yyo0Var.b;
        if (typedArray.hasValue(i)) {
            this.e = qm10.b(getContext(), yyo0Var, R$styleable.TextInputLayout_errorIconTint);
        }
        if (typedArray.hasValue(R$styleable.TextInputLayout_errorIconTintMode)) {
            this.f = t1u0.e(typedArray.getInt(R$styleable.TextInputLayout_errorIconTintMode, -1), null);
        }
        if (typedArray.hasValue(R$styleable.TextInputLayout_errorIconDrawable)) {
            i(yyo0Var.b(R$styleable.TextInputLayout_errorIconDrawable));
        }
        a.setContentDescription(getResources().getText(R$string.error_icon_content_description));
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        a.setImportantForAccessibility(2);
        a.setClickable(false);
        a.setPressable(false);
        a.setFocusable(false);
        if (!typedArray.hasValue(R$styleable.TextInputLayout_passwordToggleEnabled)) {
            if (typedArray.hasValue(R$styleable.TextInputLayout_endIconTint)) {
                this.l = qm10.b(getContext(), yyo0Var, R$styleable.TextInputLayout_endIconTint);
            }
            if (typedArray.hasValue(R$styleable.TextInputLayout_endIconTintMode)) {
                this.m = t1u0.e(typedArray.getInt(R$styleable.TextInputLayout_endIconTintMode, -1), null);
            }
        }
        if (typedArray.hasValue(R$styleable.TextInputLayout_endIconMode)) {
            g(typedArray.getInt(R$styleable.TextInputLayout_endIconMode, 0));
            if (typedArray.hasValue(R$styleable.TextInputLayout_endIconContentDescription) && a2.getContentDescription() != (text = typedArray.getText(R$styleable.TextInputLayout_endIconContentDescription))) {
                a2.setContentDescription(text);
            }
            a2.setCheckable(typedArray.getBoolean(R$styleable.TextInputLayout_endIconCheckable, true));
        } else if (typedArray.hasValue(R$styleable.TextInputLayout_passwordToggleEnabled)) {
            if (typedArray.hasValue(R$styleable.TextInputLayout_passwordToggleTint)) {
                this.l = qm10.b(getContext(), yyo0Var, R$styleable.TextInputLayout_passwordToggleTint);
            }
            if (typedArray.hasValue(R$styleable.TextInputLayout_passwordToggleTintMode)) {
                this.m = t1u0.e(typedArray.getInt(R$styleable.TextInputLayout_passwordToggleTintMode, -1), null);
            }
            g(typedArray.getBoolean(R$styleable.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(R$styleable.TextInputLayout_passwordToggleContentDescription);
            if (a2.getContentDescription() != text2) {
                a2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(R$styleable.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(R$dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.n) {
            this.n = dimensionPixelSize;
            a2.setMinimumWidth(dimensionPixelSize);
            a2.setMinimumHeight(dimensionPixelSize);
            a.setMinimumWidth(dimensionPixelSize);
            a.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(R$styleable.TextInputLayout_endIconScaleType)) {
            ImageView.ScaleType b2 = hqv.b(typedArray.getInt(R$styleable.TextInputLayout_endIconScaleType, -1));
            this.o = b2;
            a2.setScaleType(b2);
            a.setScaleType(b2);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R$id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(R$styleable.TextInputLayout_suffixTextAppearance, 0));
        if (typedArray.hasValue(R$styleable.TextInputLayout_suffixTextColor)) {
            appCompatTextView.setTextColor(yyo0Var.a(R$styleable.TextInputLayout_suffixTextColor));
        }
        CharSequence text3 = typedArray.getText(R$styleable.TextInputLayout_suffixText);
        this.q = TextUtils.isEmpty(text3) ? null : text3;
        appCompatTextView.setText(text3);
        n();
        frameLayout.addView(a2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(a);
        textInputLayout.f0.add(bVar);
        if (textInputLayout.e != null) {
            bVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new c());
    }

    public final CheckableImageButton a(int i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R$layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (qm10.e(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final qkp b() {
        qkp ankVar;
        int i = this.j;
        d dVar = this.i;
        SparseArray<qkp> sparseArray = dVar.a;
        qkp qkpVar = sparseArray.get(i);
        if (qkpVar != null) {
            return qkpVar;
        }
        a aVar = dVar.b;
        if (i == -1) {
            ankVar = new ank(aVar);
        } else if (i == 0) {
            ankVar = new q270(aVar);
        } else if (i == 1) {
            ankVar = new om90(aVar, dVar.d);
        } else if (i == 2) {
            ankVar = new nic(aVar);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(lhg.a(i, "Invalid end icon mode: "));
            }
            ankVar = new tmo(aVar);
        }
        sparseArray.append(i, ankVar);
        return ankVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.h;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        return this.r.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.c.getVisibility() == 0 && this.h.getVisibility() == 0;
    }

    public final boolean e() {
        return this.d.getVisibility() == 0;
    }

    public final void f(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean z3;
        qkp b2 = b();
        boolean k = b2.k();
        CheckableImageButton checkableImageButton = this.h;
        boolean z4 = true;
        if (!k || (z3 = checkableImageButton.e) == b2.l()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(b2 instanceof tmo) || (isActivated = checkableImageButton.isActivated()) == b2.j()) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z || z4) {
            hqv.c(this.b, checkableImageButton, this.l);
        }
    }

    public final void g(int i) {
        if (this.j == i) {
            return;
        }
        qkp b2 = b();
        q7 q7Var = this.v;
        AccessibilityManager accessibilityManager = this.u;
        if (q7Var != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new ml(q7Var));
        }
        this.v = null;
        b2.s();
        this.j = i;
        Iterator<TextInputLayout.g> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        h(i != 0);
        qkp b3 = b();
        int i2 = this.i.c;
        if (i2 == 0) {
            i2 = b3.d();
        }
        Drawable a = i2 != 0 ? m33.a(i2, getContext()) : null;
        CheckableImageButton checkableImageButton = this.h;
        checkableImageButton.setImageDrawable(a);
        TextInputLayout textInputLayout = this.b;
        if (a != null) {
            hqv.a(textInputLayout, checkableImageButton, this.l, this.m);
            hqv.c(textInputLayout, checkableImageButton, this.l);
        }
        int c2 = b3.c();
        CharSequence text = c2 != 0 ? getResources().getText(c2) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(b3.k());
        if (!b3.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        b3.r();
        q7 h = b3.h();
        this.v = h;
        if (h != null && accessibilityManager != null) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new ml(this.v));
            }
        }
        View.OnClickListener f = b3.f();
        View.OnLongClickListener onLongClickListener = this.p;
        checkableImageButton.setOnClickListener(f);
        hqv.d(checkableImageButton, onLongClickListener);
        EditText editText = this.t;
        if (editText != null) {
            b3.m(editText);
            j(b3);
        }
        hqv.a(textInputLayout, checkableImageButton, this.l, this.m);
        f(true);
    }

    public final void h(boolean z) {
        if (d() != z) {
            this.h.setVisibility(z ? 0 : 8);
            k();
            m();
            this.b.q();
        }
    }

    public final void i(@Nullable Drawable drawable) {
        CheckableImageButton checkableImageButton = this.d;
        checkableImageButton.setImageDrawable(drawable);
        l();
        hqv.a(this.b, checkableImageButton, this.e, this.f);
    }

    public final void j(qkp qkpVar) {
        if (this.t == null) {
            return;
        }
        if (qkpVar.e() != null) {
            this.t.setOnFocusChangeListener(qkpVar.e());
        }
        if (qkpVar.g() != null) {
            this.h.setOnFocusChangeListener(qkpVar.g());
        }
    }

    public final void k() {
        this.c.setVisibility((this.h.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.q == null || this.s) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.d;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.b;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.k.q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.j != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int i;
        TextInputLayout textInputLayout = this.b;
        if (textInputLayout.e == null) {
            return;
        }
        if (d() || e()) {
            i = 0;
        } else {
            EditText editText = textInputLayout.e;
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            i = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R$dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.e.getPaddingTop();
        int paddingBottom = textInputLayout.e.getPaddingBottom();
        WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
        this.r.setPaddingRelative(dimensionPixelSize, paddingTop, i, paddingBottom);
    }

    public final void n() {
        AppCompatTextView appCompatTextView = this.r;
        int visibility = appCompatTextView.getVisibility();
        int i = (this.q == null || this.s) ? 8 : 0;
        if (visibility != i) {
            b().p(i == 0);
        }
        k();
        appCompatTextView.setVisibility(i);
        this.b.q();
    }
}
