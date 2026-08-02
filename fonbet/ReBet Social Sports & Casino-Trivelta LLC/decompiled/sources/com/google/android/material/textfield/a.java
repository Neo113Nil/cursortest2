package com.google.android.material.textfield;

import C0.j;
import Ja.C1356f;
import Ja.C1357g;
import Ja.q;
import Ja.s;
import Ja.t;
import Ja.v;
import Ja.x;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C2068x;
import androidx.appcompat.widget.a0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import ia.e;
import ia.g;
import ia.i;
import ia.m;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n.AbstractC5596a;
import n0.AbstractC5597a;
import xa.k;
import xa.o;

/* loaded from: classes3.dex */
public class a extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f36329a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f36330b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f36331c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f36332d;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f36333e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f36334f;

    /* renamed from: g, reason: collision with root package name */
    public final CheckableImageButton f36335g;

    /* renamed from: h, reason: collision with root package name */
    public final d f36336h;

    /* renamed from: i, reason: collision with root package name */
    public int f36337i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f36338j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f36339k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f36340l;

    /* renamed from: m, reason: collision with root package name */
    public int f36341m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView.ScaleType f36342n;

    /* renamed from: o, reason: collision with root package name */
    public View.OnLongClickListener f36343o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f36344p;

    /* renamed from: q, reason: collision with root package name */
    public final TextView f36345q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f36346r;

    /* renamed from: s, reason: collision with root package name */
    public EditText f36347s;

    /* renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f36348t;

    /* renamed from: u, reason: collision with root package name */
    public AccessibilityManager.TouchExplorationStateChangeListener f36349u;

    /* renamed from: v, reason: collision with root package name */
    public final TextWatcher f36350v;

    /* renamed from: w, reason: collision with root package name */
    public final TextInputLayout.g f36351w;

    /* renamed from: com.google.android.material.textfield.a$a, reason: collision with other inner class name */
    public class C0504a extends k {
        public C0504a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            a.this.m().a(editable);
        }

        @Override // xa.k, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            a.this.m().b(charSequence, i10, i11, i12);
        }
    }

    public class b implements TextInputLayout.g {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout) {
            if (a.this.f36347s == textInputLayout.getEditText()) {
                return;
            }
            if (a.this.f36347s != null) {
                a.this.f36347s.removeTextChangedListener(a.this.f36350v);
                if (a.this.f36347s.getOnFocusChangeListener() == a.this.m().e()) {
                    a.this.f36347s.setOnFocusChangeListener(null);
                }
            }
            a.this.f36347s = textInputLayout.getEditText();
            if (a.this.f36347s != null) {
                a.this.f36347s.addTextChangedListener(a.this.f36350v);
            }
            a.this.m().n(a.this.f36347s);
            a aVar = a.this;
            aVar.h0(aVar.m());
        }
    }

    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            a.this.g();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a.this.M();
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final SparseArray f36355a = new SparseArray();

        /* renamed from: b, reason: collision with root package name */
        public final a f36356b;

        /* renamed from: c, reason: collision with root package name */
        public final int f36357c;

        /* renamed from: d, reason: collision with root package name */
        public final int f36358d;

        public d(a aVar, a0 a0Var) {
            this.f36356b = aVar;
            this.f36357c = a0Var.n(m.f48726N7, 0);
            this.f36358d = a0Var.n(m.f48969m8, 0);
        }

        public final s b(int i10) {
            if (i10 == -1) {
                return new C1357g(this.f36356b);
            }
            if (i10 == 0) {
                return new v(this.f36356b);
            }
            if (i10 == 1) {
                return new x(this.f36356b, this.f36358d);
            }
            if (i10 == 2) {
                return new C1356f(this.f36356b);
            }
            if (i10 == 3) {
                return new q(this.f36356b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i10);
        }

        public s c(int i10) {
            s sVar = (s) this.f36355a.get(i10);
            if (sVar != null) {
                return sVar;
            }
            s b10 = b(i10);
            this.f36355a.append(i10, b10);
            return b10;
        }
    }

    public a(TextInputLayout textInputLayout, a0 a0Var) {
        super(textInputLayout.getContext());
        this.f36337i = 0;
        this.f36338j = new LinkedHashSet();
        this.f36350v = new C0504a();
        b bVar = new b();
        this.f36351w = bVar;
        this.f36348t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f36329a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f36330b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton i10 = i(this, from, g.f48432g0);
        this.f36331c = i10;
        CheckableImageButton i11 = i(frameLayout, from, g.f48430f0);
        this.f36335g = i11;
        this.f36336h = new d(this, a0Var);
        C2068x c2068x = new C2068x(getContext());
        this.f36345q = c2068x;
        C(a0Var);
        B(a0Var);
        D(a0Var);
        frameLayout.addView(i11);
        addView(c2068x);
        addView(frameLayout);
        addView(i10);
        textInputLayout.j(bVar);
        addOnAttachStateChangeListener(new c());
    }

    public boolean A() {
        return this.f36337i != 0;
    }

    public final void B(a0 a0Var) {
        if (!a0Var.s(m.f48979n8)) {
            if (a0Var.s(m.f48766R7)) {
                this.f36339k = Ca.c.b(getContext(), a0Var, m.f48766R7);
            }
            if (a0Var.s(m.f48776S7)) {
                this.f36340l = o.k(a0Var.k(m.f48776S7, -1), null);
            }
        }
        if (a0Var.s(m.f48746P7)) {
            U(a0Var.k(m.f48746P7, 0));
            if (a0Var.s(m.f48716M7)) {
                Q(a0Var.p(m.f48716M7));
            }
            O(a0Var.a(m.f48706L7, true));
        } else if (a0Var.s(m.f48979n8)) {
            if (a0Var.s(m.f48989o8)) {
                this.f36339k = Ca.c.b(getContext(), a0Var, m.f48989o8);
            }
            if (a0Var.s(m.f48999p8)) {
                this.f36340l = o.k(a0Var.k(m.f48999p8, -1), null);
            }
            U(a0Var.a(m.f48979n8, false) ? 1 : 0);
            Q(a0Var.p(m.f48959l8));
        }
        T(a0Var.f(m.f48736O7, getResources().getDimensionPixelSize(e.f48373v0)));
        if (a0Var.s(m.f48756Q7)) {
            X(t.b(a0Var.k(m.f48756Q7, -1)));
        }
    }

    public final void C(a0 a0Var) {
        if (a0Var.s(m.f48821X7)) {
            this.f36332d = Ca.c.b(getContext(), a0Var, m.f48821X7);
        }
        if (a0Var.s(m.f48830Y7)) {
            this.f36333e = o.k(a0Var.k(m.f48830Y7, -1), null);
        }
        if (a0Var.s(m.f48812W7)) {
            c0(a0Var.g(m.f48812W7));
        }
        this.f36331c.setContentDescription(getResources().getText(ia.k.f48528f));
        this.f36331c.setImportantForAccessibility(2);
        this.f36331c.setClickable(false);
        this.f36331c.setPressable(false);
        this.f36331c.setCheckable(false);
        this.f36331c.setFocusable(false);
    }

    public final void D(a0 a0Var) {
        this.f36345q.setVisibility(8);
        this.f36345q.setId(g.f48444m0);
        this.f36345q.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        this.f36345q.setAccessibilityLiveRegion(1);
        q0(a0Var.n(m.f48637E8, 0));
        if (a0Var.s(m.f48647F8)) {
            r0(a0Var.c(m.f48647F8));
        }
        p0(a0Var.p(m.f48627D8));
    }

    public boolean E() {
        return A() && this.f36335g.isChecked();
    }

    public boolean F() {
        return this.f36330b.getVisibility() == 0 && this.f36335g.getVisibility() == 0;
    }

    public boolean G() {
        return this.f36331c.getVisibility() == 0;
    }

    public void H(boolean z10) {
        this.f36346r = z10;
        y0();
    }

    public void I() {
        w0();
        K();
        J();
        if (m().t()) {
            u0(this.f36329a.d0());
        }
    }

    public void J() {
        t.d(this.f36329a, this.f36335g, this.f36339k);
    }

    public void K() {
        t.d(this.f36329a, this.f36331c, this.f36332d);
    }

    public void L(boolean z10) {
        boolean z11;
        boolean isActivated;
        boolean isChecked;
        s m10 = m();
        boolean z12 = true;
        if (!m10.l() || (isChecked = this.f36335g.isChecked()) == m10.m()) {
            z11 = false;
        } else {
            this.f36335g.setChecked(!isChecked);
            z11 = true;
        }
        if (!m10.j() || (isActivated = this.f36335g.isActivated()) == m10.k()) {
            z12 = z11;
        } else {
            N(!isActivated);
        }
        if (z10 || z12) {
            J();
        }
    }

    public final void M() {
        AccessibilityManager accessibilityManager;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f36349u;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = this.f36348t) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
    }

    public void N(boolean z10) {
        this.f36335g.setActivated(z10);
    }

    public void O(boolean z10) {
        this.f36335g.setCheckable(z10);
    }

    public void P(int i10) {
        Q(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void Q(CharSequence charSequence) {
        if (l() != charSequence) {
            this.f36335g.setContentDescription(charSequence);
        }
    }

    public void R(int i10) {
        S(i10 != 0 ? AbstractC5596a.b(getContext(), i10) : null);
    }

    public void S(Drawable drawable) {
        this.f36335g.setImageDrawable(drawable);
        if (drawable != null) {
            t.a(this.f36329a, this.f36335g, this.f36339k, this.f36340l);
            J();
        }
    }

    public void T(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != this.f36341m) {
            this.f36341m = i10;
            t.g(this.f36335g, i10);
            t.g(this.f36331c, i10);
        }
    }

    public void U(int i10) {
        if (this.f36337i == i10) {
            return;
        }
        t0(m());
        int i11 = this.f36337i;
        this.f36337i = i10;
        j(i11);
        a0(i10 != 0);
        s m10 = m();
        R(t(m10));
        P(m10.c());
        O(m10.l());
        if (!m10.i(this.f36329a.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f36329a.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        s0(m10);
        V(m10.f());
        EditText editText = this.f36347s;
        if (editText != null) {
            m10.n(editText);
            h0(m10);
        }
        t.a(this.f36329a, this.f36335g, this.f36339k, this.f36340l);
        L(true);
    }

    public void V(View.OnClickListener onClickListener) {
        t.h(this.f36335g, onClickListener, this.f36343o);
    }

    public void W(View.OnLongClickListener onLongClickListener) {
        this.f36343o = onLongClickListener;
        t.i(this.f36335g, onLongClickListener);
    }

    public void X(ImageView.ScaleType scaleType) {
        this.f36342n = scaleType;
        t.j(this.f36335g, scaleType);
        t.j(this.f36331c, scaleType);
    }

    public void Y(ColorStateList colorStateList) {
        if (this.f36339k != colorStateList) {
            this.f36339k = colorStateList;
            t.a(this.f36329a, this.f36335g, colorStateList, this.f36340l);
        }
    }

    public void Z(PorterDuff.Mode mode) {
        if (this.f36340l != mode) {
            this.f36340l = mode;
            t.a(this.f36329a, this.f36335g, this.f36339k, mode);
        }
    }

    public void a0(boolean z10) {
        if (F() != z10) {
            this.f36335g.setVisibility(z10 ? 0 : 8);
            v0();
            x0();
            this.f36329a.p0();
        }
    }

    public void b0(int i10) {
        c0(i10 != 0 ? AbstractC5596a.b(getContext(), i10) : null);
        K();
    }

    public void c0(Drawable drawable) {
        this.f36331c.setImageDrawable(drawable);
        w0();
        t.a(this.f36329a, this.f36331c, this.f36332d, this.f36333e);
    }

    public void d0(View.OnClickListener onClickListener) {
        t.h(this.f36331c, onClickListener, this.f36334f);
    }

    public void e0(View.OnLongClickListener onLongClickListener) {
        this.f36334f = onLongClickListener;
        t.i(this.f36331c, onLongClickListener);
    }

    public void f0(ColorStateList colorStateList) {
        if (this.f36332d != colorStateList) {
            this.f36332d = colorStateList;
            t.a(this.f36329a, this.f36331c, colorStateList, this.f36333e);
        }
    }

    public final void g() {
        if (this.f36349u == null || this.f36348t == null || !isAttachedToWindow()) {
            return;
        }
        this.f36348t.addTouchExplorationStateChangeListener(this.f36349u);
    }

    public void g0(PorterDuff.Mode mode) {
        if (this.f36333e != mode) {
            this.f36333e = mode;
            t.a(this.f36329a, this.f36331c, this.f36332d, mode);
        }
    }

    public void h() {
        this.f36335g.performClick();
        this.f36335g.jumpDrawablesToCurrentState();
    }

    public final void h0(s sVar) {
        if (this.f36347s == null) {
            return;
        }
        if (sVar.e() != null) {
            this.f36347s.setOnFocusChangeListener(sVar.e());
        }
        if (sVar.g() != null) {
            this.f36335g.setOnFocusChangeListener(sVar.g());
        }
    }

    public final CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(i.f48475h, viewGroup, false);
        checkableImageButton.setId(i10);
        t.e(checkableImageButton);
        if (Ca.c.k(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public void i0(int i10) {
        j0(i10 != 0 ? getResources().getText(i10) : null);
    }

    public final void j(int i10) {
        Iterator it = this.f36338j.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    public void j0(CharSequence charSequence) {
        this.f36335g.setContentDescription(charSequence);
    }

    public CheckableImageButton k() {
        if (G()) {
            return this.f36331c;
        }
        if (A() && F()) {
            return this.f36335g;
        }
        return null;
    }

    public void k0(int i10) {
        l0(i10 != 0 ? AbstractC5596a.b(getContext(), i10) : null);
    }

    public CharSequence l() {
        return this.f36335g.getContentDescription();
    }

    public void l0(Drawable drawable) {
        this.f36335g.setImageDrawable(drawable);
    }

    public s m() {
        return this.f36336h.c(this.f36337i);
    }

    public void m0(boolean z10) {
        if (z10 && this.f36337i != 1) {
            U(1);
        } else {
            if (z10) {
                return;
            }
            U(0);
        }
    }

    public Drawable n() {
        return this.f36335g.getDrawable();
    }

    public void n0(ColorStateList colorStateList) {
        this.f36339k = colorStateList;
        t.a(this.f36329a, this.f36335g, colorStateList, this.f36340l);
    }

    public int o() {
        return this.f36341m;
    }

    public void o0(PorterDuff.Mode mode) {
        this.f36340l = mode;
        t.a(this.f36329a, this.f36335g, this.f36339k, mode);
    }

    public int p() {
        return this.f36337i;
    }

    public void p0(CharSequence charSequence) {
        this.f36344p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f36345q.setText(charSequence);
        y0();
    }

    public ImageView.ScaleType q() {
        return this.f36342n;
    }

    public void q0(int i10) {
        j.m(this.f36345q, i10);
    }

    public CheckableImageButton r() {
        return this.f36335g;
    }

    public void r0(ColorStateList colorStateList) {
        this.f36345q.setTextColor(colorStateList);
    }

    public Drawable s() {
        return this.f36331c.getDrawable();
    }

    public final void s0(s sVar) {
        sVar.s();
        this.f36349u = sVar.h();
        g();
    }

    public final int t(s sVar) {
        int i10 = this.f36336h.f36357c;
        return i10 == 0 ? sVar.d() : i10;
    }

    public final void t0(s sVar) {
        M();
        this.f36349u = null;
        sVar.u();
    }

    public CharSequence u() {
        return this.f36335g.getContentDescription();
    }

    public final void u0(boolean z10) {
        if (!z10 || n() == null) {
            t.a(this.f36329a, this.f36335g, this.f36339k, this.f36340l);
            return;
        }
        Drawable mutate = AbstractC5597a.r(n()).mutate();
        mutate.setTint(this.f36329a.getErrorCurrentTextColors());
        this.f36335g.setImageDrawable(mutate);
    }

    public Drawable v() {
        return this.f36335g.getDrawable();
    }

    public final void v0() {
        this.f36330b.setVisibility((this.f36335g.getVisibility() != 0 || G()) ? 8 : 0);
        setVisibility((F() || G() || !((this.f36344p == null || this.f36346r) ? 8 : false)) ? 0 : 8);
    }

    public CharSequence w() {
        return this.f36344p;
    }

    public final void w0() {
        this.f36331c.setVisibility(s() != null && this.f36329a.O() && this.f36329a.d0() ? 0 : 8);
        v0();
        x0();
        if (A()) {
            return;
        }
        this.f36329a.p0();
    }

    public ColorStateList x() {
        return this.f36345q.getTextColors();
    }

    public void x0() {
        if (this.f36329a.f36283e == null) {
            return;
        }
        this.f36345q.setPaddingRelative(getContext().getResources().getDimensionPixelSize(e.f48327X), this.f36329a.f36283e.getPaddingTop(), (F() || G()) ? 0 : this.f36329a.f36283e.getPaddingEnd(), this.f36329a.f36283e.getPaddingBottom());
    }

    public int y() {
        return getPaddingEnd() + this.f36345q.getPaddingEnd() + ((F() || G()) ? this.f36335g.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.f36335g.getLayoutParams()).getMarginStart() : 0);
    }

    public final void y0() {
        int visibility = this.f36345q.getVisibility();
        int i10 = (this.f36344p == null || this.f36346r) ? 8 : 0;
        if (visibility != i10) {
            m().q(i10 == 0);
        }
        v0();
        this.f36345q.setVisibility(i10);
        this.f36329a.p0();
    }

    public TextView z() {
        return this.f36345q;
    }
}
