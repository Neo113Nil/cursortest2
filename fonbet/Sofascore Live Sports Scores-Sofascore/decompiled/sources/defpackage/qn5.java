package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
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
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.sofascore.results.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class qn5 extends LinearLayout {
    public final TextInputLayout a;
    public final FrameLayout b;
    public final CheckableImageButton c;
    public ColorStateList d;
    public PorterDuff.Mode e;
    public View.OnLongClickListener f;
    public final CheckableImageButton g;
    public final j12 h;
    public int i;
    public final LinkedHashSet j;
    public ColorStateList k;
    public PorterDuff.Mode l;
    public int m;
    public ImageView.ScaleType n;
    public View.OnLongClickListener o;
    public CharSequence p;
    public final AppCompatTextView q;
    public boolean r;
    public EditText s;
    public final AccessibilityManager t;
    public AccessibilityManager.TouchExplorationStateChangeListener u;
    public final on5 v;

    public qn5(TextInputLayout textInputLayout, l2a l2aVar) {
        super(textInputLayout.getContext());
        final int i = 0;
        this.i = 0;
        this.j = new LinkedHashSet();
        this.v = new on5(this);
        pn5 pn5Var = new pn5(this);
        this.t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a = a(this, from, R.id.text_input_error_icon);
        this.c = a;
        CheckableImageButton a2 = a(frameLayout, from, R.id.text_input_end_icon);
        this.g = a2;
        this.h = new j12(this, l2aVar);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.q = appCompatTextView;
        TypedArray typedArray = (TypedArray) l2aVar.c;
        if (typedArray.hasValue(38)) {
            this.d = w3a.w(getContext(), l2aVar, 38);
        }
        if (typedArray.hasValue(39)) {
            this.e = vha.F(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            j(l2aVar.q(37));
        }
        a.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        a.setImportantForAccessibility(2);
        a.setClickable(false);
        a.setPressable(false);
        a.setCheckable(false);
        a.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.k = w3a.w(getContext(), l2aVar, 32);
            }
            if (typedArray.hasValue(33)) {
                this.l = vha.F(typedArray.getInt(33, -1), null);
            }
        }
        final int i2 = 1;
        if (typedArray.hasValue(30)) {
            h(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27)) {
                g(typedArray.getText(27));
            }
            a2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.k = w3a.w(getContext(), l2aVar, 55);
            }
            if (typedArray.hasValue(56)) {
                this.l = vha.F(typedArray.getInt(56, -1), null);
            }
            h(typedArray.getBoolean(54, false) ? 1 : 0);
            g(typedArray.getText(52));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            a70.p("endIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.m) {
            this.m = dimensionPixelSize;
            a2.setMinimumWidth(dimensionPixelSize);
            a2.setMinimumHeight(dimensionPixelSize);
            a.setMinimumWidth(dimensionPixelSize);
            a.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType B = fkf.B(typedArray.getInt(31, -1));
            this.n = B;
            a2.setScaleType(B);
            a.setScaleType(B);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            appCompatTextView.setTextColor(l2aVar.m(74));
        }
        CharSequence text = typedArray.getText(72);
        this.p = TextUtils.isEmpty(text) ? null : text;
        appCompatTextView.setText(text);
        o();
        frameLayout.addView(a2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(a);
        a.setOnFocusableChangedListener(new at2(this) { // from class: nn5
            public final /* synthetic */ qn5 b;

            {
                this.b = this;
            }

            @Override // defpackage.at2
            public final void d() {
                int i3 = i;
                qn5 qn5Var = this.b;
                switch (i3) {
                    case 0:
                        CheckableImageButton checkableImageButton = qn5Var.c;
                        fkf.P(checkableImageButton, checkableImageButton.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton2 = qn5Var.g;
                        fkf.P(checkableImageButton2, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        a2.setOnFocusableChangedListener(new at2(this) { // from class: nn5
            public final /* synthetic */ qn5 b;

            {
                this.b = this;
            }

            @Override // defpackage.at2
            public final void d() {
                int i3 = i2;
                qn5 qn5Var = this.b;
                switch (i3) {
                    case 0:
                        CheckableImageButton checkableImageButton = qn5Var.c;
                        fkf.P(checkableImageButton, checkableImageButton.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton2 = qn5Var.g;
                        fkf.P(checkableImageButton2, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        textInputLayout.f0.add(pn5Var);
        if (textInputLayout.e != null) {
            pn5Var.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new y00(this, 2));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (w3a.H(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final rn5 b() {
        rn5 z84Var;
        int i = this.i;
        j12 j12Var = this.h;
        SparseArray sparseArray = (SparseArray) j12Var.d;
        rn5 rn5Var = (rn5) sparseArray.get(i);
        if (rn5Var != null) {
            return rn5Var;
        }
        qn5 qn5Var = (qn5) j12Var.e;
        if (i != -1) {
            int i2 = 1;
            if (i == 0) {
                z84Var = new z84(qn5Var, i2);
            } else if (i == 1) {
                z84Var = new sae(qn5Var, j12Var.c);
            } else if (i == 2) {
                z84Var = new jw2(qn5Var);
            } else {
                if (i != 3) {
                    a70.p(ljg.j(i, "Invalid end icon mode: "));
                    return null;
                }
                z84Var = new ed5(qn5Var);
            }
        } else {
            z84Var = new z84(qn5Var, 0);
        }
        sparseArray.append(i, z84Var);
        return z84Var;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.b.getVisibility() == 0 && this.g.getVisibility() == 0;
    }

    public final boolean e() {
        return this.c.getVisibility() == 0;
    }

    public final void f(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean z3;
        rn5 b = b();
        boolean j = b.j();
        CheckableImageButton checkableImageButton = this.g;
        boolean z4 = true;
        if (!j || (z3 = checkableImageButton.d) == b.k()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(b instanceof ed5) || (isActivated = checkableImageButton.isActivated()) == ((ed5) b).l) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z || z4) {
            fkf.K(this.a, checkableImageButton, this.k);
        }
    }

    public final void g(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            fkf.P(checkableImageButton, charSequence);
        }
    }

    public final void h(int i) {
        if (this.i == i) {
            return;
        }
        rn5 b = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.u;
        AccessibilityManager accessibilityManager = this.t;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.u = null;
        b.r();
        this.i = i;
        Iterator it = this.j.iterator();
        if (it.hasNext()) {
            throw lnb.i(it);
        }
        i(i != 0);
        rn5 b2 = b();
        int i2 = this.h.b;
        if (i2 == 0) {
            i2 = b2.d();
        }
        Drawable d0 = i2 != 0 ? td4.d0(i2, getContext()) : null;
        CheckableImageButton checkableImageButton = this.g;
        checkableImageButton.setImageDrawable(d0);
        TextInputLayout textInputLayout = this.a;
        if (d0 != null) {
            fkf.u(textInputLayout, checkableImageButton, this.k, this.l);
            fkf.K(textInputLayout, checkableImageButton, this.k);
        }
        checkableImageButton.setCheckable(b2.j());
        if (!b2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        b2.q();
        AccessibilityManager.TouchExplorationStateChangeListener h = b2.h();
        this.u = h;
        if (h != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.u);
        }
        View.OnClickListener f = b2.f();
        View.OnLongClickListener onLongClickListener = this.o;
        checkableImageButton.setOnClickListener(f);
        fkf.L(checkableImageButton, onLongClickListener);
        int c = b2.c();
        g(c != 0 ? getResources().getText(c) : null);
        EditText editText = this.s;
        if (editText != null) {
            b2.l(editText);
            k(b2);
        }
        fkf.u(textInputLayout, checkableImageButton, this.k, this.l);
        f(true);
    }

    public final void i(boolean z) {
        EditText editText;
        if (d() != z) {
            CheckableImageButton checkableImageButton = this.g;
            if (!z && checkableImageButton.hasFocus() && (editText = this.s) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z ? 0 : 8);
            l();
            n();
            this.a.s();
        }
    }

    public final void j(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.c;
        checkableImageButton.setImageDrawable(drawable);
        m();
        fkf.u(this.a, checkableImageButton, this.d, this.e);
    }

    public final void k(rn5 rn5Var) {
        if (this.s == null) {
            return;
        }
        if (rn5Var.e() != null) {
            this.s.setOnFocusChangeListener(rn5Var.e());
        }
        if (rn5Var.g() != null) {
            this.g.setOnFocusChangeListener(rn5Var.g());
        }
    }

    public final void l() {
        this.b.setVisibility((this.g.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.p == null || this.r) ? 8 : false)) ? 0 : 8);
    }

    public final void m() {
        CheckableImageButton checkableImageButton = this.c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.k.q && textInputLayout.o()) ? 0 : 8);
        l();
        n();
        if (this.i != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void n() {
        TextInputLayout textInputLayout = this.a;
        if (textInputLayout.e == null) {
            return;
        }
        this.q.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.e.getPaddingTop(), (d() || e()) ? 0 : textInputLayout.e.getPaddingEnd(), textInputLayout.e.getPaddingBottom());
    }

    public final void o() {
        AppCompatTextView appCompatTextView = this.q;
        int visibility = appCompatTextView.getVisibility();
        int i = (this.p == null || this.r) ? 8 : 0;
        if (visibility != i) {
            b().o(i == 0);
        }
        l();
        appCompatTextView.setVisibility(i);
        this.a.s();
    }
}
