package Ja;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C2068x;
import androidx.appcompat.widget.a0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes3.dex */
public class y extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f6057a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f6058b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f6059c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f6060d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f6061e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f6062f;

    /* renamed from: g, reason: collision with root package name */
    public int f6063g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView.ScaleType f6064h;

    /* renamed from: i, reason: collision with root package name */
    public View.OnLongClickListener f6065i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6066j;

    public y(TextInputLayout textInputLayout, a0 a0Var) {
        super(textInputLayout.getContext());
        this.f6057a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(ia.i.f48476i, (ViewGroup) this, false);
        this.f6060d = checkableImageButton;
        t.e(checkableImageButton);
        C2068x c2068x = new C2068x(getContext());
        this.f6058b = c2068x;
        j(a0Var);
        i(a0Var);
        addView(checkableImageButton);
        addView(c2068x);
    }

    public void A(y0.z zVar) {
        if (this.f6058b.getVisibility() != 0) {
            zVar.b1(this.f6060d);
        } else {
            zVar.J0(this.f6058b);
            zVar.b1(this.f6058b);
        }
    }

    public void B() {
        EditText editText = this.f6057a.f36283e;
        if (editText == null) {
            return;
        }
        this.f6058b.setPaddingRelative(k() ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(ia.e.f48327X), editText.getCompoundPaddingBottom());
    }

    public final void C() {
        int i10 = (this.f6059c == null || this.f6066j) ? 8 : 0;
        setVisibility((this.f6060d.getVisibility() == 0 || i10 == 0) ? 0 : 8);
        this.f6058b.setVisibility(i10);
        this.f6057a.p0();
    }

    public CharSequence a() {
        return this.f6059c;
    }

    public ColorStateList b() {
        return this.f6058b.getTextColors();
    }

    public int c() {
        return getPaddingStart() + this.f6058b.getPaddingStart() + (k() ? this.f6060d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.f6060d.getLayoutParams()).getMarginEnd() : 0);
    }

    public TextView d() {
        return this.f6058b;
    }

    public CharSequence e() {
        return this.f6060d.getContentDescription();
    }

    public Drawable f() {
        return this.f6060d.getDrawable();
    }

    public int g() {
        return this.f6063g;
    }

    public ImageView.ScaleType h() {
        return this.f6064h;
    }

    public final void i(a0 a0Var) {
        this.f6058b.setVisibility(8);
        this.f6058b.setId(ia.g.f48442l0);
        this.f6058b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f6058b.setAccessibilityLiveRegion(1);
        o(a0Var.n(ia.m.f49049u8, 0));
        if (a0Var.s(ia.m.f49059v8)) {
            p(a0Var.c(ia.m.f49059v8));
        }
        n(a0Var.p(ia.m.f49039t8));
    }

    public final void j(a0 a0Var) {
        if (Ca.c.k(getContext())) {
            ((ViewGroup.MarginLayoutParams) this.f6060d.getLayoutParams()).setMarginEnd(0);
        }
        u(null);
        v(null);
        if (a0Var.s(ia.m.f48607B8)) {
            this.f6061e = Ca.c.b(getContext(), a0Var, ia.m.f48607B8);
        }
        if (a0Var.s(ia.m.f48617C8)) {
            this.f6062f = xa.o.k(a0Var.k(ia.m.f48617C8, -1), null);
        }
        if (a0Var.s(ia.m.f49089y8)) {
            s(a0Var.g(ia.m.f49089y8));
            if (a0Var.s(ia.m.f49079x8)) {
                r(a0Var.p(ia.m.f49079x8));
            }
            q(a0Var.a(ia.m.f49069w8, true));
        }
        t(a0Var.f(ia.m.f49099z8, getResources().getDimensionPixelSize(ia.e.f48373v0)));
        if (a0Var.s(ia.m.f48597A8)) {
            w(t.b(a0Var.k(ia.m.f48597A8, -1)));
        }
    }

    public boolean k() {
        return this.f6060d.getVisibility() == 0;
    }

    public void l(boolean z10) {
        this.f6066j = z10;
        C();
    }

    public void m() {
        t.d(this.f6057a, this.f6060d, this.f6061e);
    }

    public void n(CharSequence charSequence) {
        this.f6059c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f6058b.setText(charSequence);
        C();
    }

    public void o(int i10) {
        C0.j.m(this.f6058b, i10);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        B();
    }

    public void p(ColorStateList colorStateList) {
        this.f6058b.setTextColor(colorStateList);
    }

    public void q(boolean z10) {
        this.f6060d.setCheckable(z10);
    }

    public void r(CharSequence charSequence) {
        if (e() != charSequence) {
            this.f6060d.setContentDescription(charSequence);
        }
    }

    public void s(Drawable drawable) {
        this.f6060d.setImageDrawable(drawable);
        if (drawable != null) {
            t.a(this.f6057a, this.f6060d, this.f6061e, this.f6062f);
            z(true);
            m();
        } else {
            z(false);
            u(null);
            v(null);
            r(null);
        }
    }

    public void t(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i10 != this.f6063g) {
            this.f6063g = i10;
            t.g(this.f6060d, i10);
        }
    }

    public void u(View.OnClickListener onClickListener) {
        t.h(this.f6060d, onClickListener, this.f6065i);
    }

    public void v(View.OnLongClickListener onLongClickListener) {
        this.f6065i = onLongClickListener;
        t.i(this.f6060d, onLongClickListener);
    }

    public void w(ImageView.ScaleType scaleType) {
        this.f6064h = scaleType;
        t.j(this.f6060d, scaleType);
    }

    public void x(ColorStateList colorStateList) {
        if (this.f6061e != colorStateList) {
            this.f6061e = colorStateList;
            t.a(this.f6057a, this.f6060d, colorStateList, this.f6062f);
        }
    }

    public void y(PorterDuff.Mode mode) {
        if (this.f6062f != mode) {
            this.f6062f = mode;
            t.a(this.f6057a, this.f6060d, this.f6061e, mode);
        }
    }

    public void z(boolean z10) {
        if (k() != z10) {
            this.f6060d.setVisibility(z10 ? 0 : 8);
            B();
            C();
        }
    }
}
