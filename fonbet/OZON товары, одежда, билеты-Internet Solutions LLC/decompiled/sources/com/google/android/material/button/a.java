package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.NonNull;
import androidx.core.view.Y;
import n7.C8448a;
import ru.ozon.app.android.R;
import s7.C9621p;
import v7.c;
import w7.C10444a;
import y7.C10856g;
import y7.k;
import y7.o;

/* loaded from: classes9.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private final MaterialButton f58078a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private k f58079b;

    /* renamed from: c, reason: collision with root package name */
    private int f58080c;

    /* renamed from: d, reason: collision with root package name */
    private int f58081d;

    /* renamed from: e, reason: collision with root package name */
    private int f58082e;

    /* renamed from: f, reason: collision with root package name */
    private int f58083f;

    /* renamed from: g, reason: collision with root package name */
    private int f58084g;

    /* renamed from: h, reason: collision with root package name */
    private int f58085h;

    /* renamed from: i, reason: collision with root package name */
    private PorterDuff.Mode f58086i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f58087j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f58088k;

    /* renamed from: l, reason: collision with root package name */
    private ColorStateList f58089l;

    /* renamed from: m, reason: collision with root package name */
    private C10856g f58090m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f58091n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f58092o = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f58093p = false;

    /* renamed from: q, reason: collision with root package name */
    private boolean f58094q;

    /* renamed from: r, reason: collision with root package name */
    private RippleDrawable f58095r;

    /* renamed from: s, reason: collision with root package name */
    private int f58096s;

    a(MaterialButton materialButton, @NonNull k kVar) {
        this.f58078a = materialButton;
        this.f58079b = kVar;
    }

    private void C(int i11, int i12) {
        int i13 = Y.f42258g;
        MaterialButton materialButton = this.f58078a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i14 = this.f58082e;
        int i15 = this.f58083f;
        this.f58083f = i12;
        this.f58082e = i11;
        if (!this.f58092o) {
            D();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i11) - i14, paddingEnd, (paddingBottom + i12) - i15);
    }

    private void D() {
        C10856g c10856g = new C10856g(this.f58079b);
        MaterialButton materialButton = this.f58078a;
        c10856g.v(materialButton.getContext());
        androidx.core.graphics.drawable.a.j(c10856g, this.f58087j);
        PorterDuff.Mode mode = this.f58086i;
        if (mode != null) {
            androidx.core.graphics.drawable.a.k(c10856g, mode);
        }
        float f7 = this.f58085h;
        ColorStateList colorStateList = this.f58088k;
        c10856g.K(f7);
        c10856g.J(colorStateList);
        C10856g c10856g2 = new C10856g(this.f58079b);
        c10856g2.setTint(0);
        c10856g2.I(this.f58085h, this.f58091n ? C8448a.b(R.attr.colorSurface, materialButton) : 0);
        C10856g c10856g3 = new C10856g(this.f58079b);
        this.f58090m = c10856g3;
        androidx.core.graphics.drawable.a.i(c10856g3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(C10444a.b(this.f58089l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c10856g2, c10856g}), this.f58080c, this.f58082e, this.f58081d, this.f58083f), this.f58090m);
        this.f58095r = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        C10856g f11 = f(false);
        if (f11 != null) {
            f11.A(this.f58096s);
        }
    }

    private void E() {
        C10856g f7 = f(false);
        C10856g f11 = f(true);
        if (f7 != null) {
            float f12 = this.f58085h;
            ColorStateList colorStateList = this.f58088k;
            f7.K(f12);
            f7.J(colorStateList);
            if (f11 != null) {
                f11.I(this.f58085h, this.f58091n ? C8448a.b(R.attr.colorSurface, this.f58078a) : 0);
            }
        }
    }

    private C10856g f(boolean z11) {
        RippleDrawable rippleDrawable = this.f58095r;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C10856g) ((LayerDrawable) ((InsetDrawable) this.f58095r.getDrawable(0)).getDrawable()).getDrawable(!z11 ? 1 : 0);
    }

    final void A(ColorStateList colorStateList) {
        if (this.f58087j != colorStateList) {
            this.f58087j = colorStateList;
            if (f(false) != null) {
                androidx.core.graphics.drawable.a.j(f(false), this.f58087j);
            }
        }
    }

    final void B(PorterDuff.Mode mode) {
        if (this.f58086i != mode) {
            this.f58086i = mode;
            if (f(false) == null || this.f58086i == null) {
                return;
            }
            androidx.core.graphics.drawable.a.k(f(false), this.f58086i);
        }
    }

    final int a() {
        return this.f58084g;
    }

    public final int b() {
        return this.f58083f;
    }

    public final int c() {
        return this.f58082e;
    }

    public final o d() {
        RippleDrawable rippleDrawable = this.f58095r;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f58095r.getNumberOfLayers() > 2 ? (o) this.f58095r.getDrawable(2) : (o) this.f58095r.getDrawable(1);
    }

    final C10856g e() {
        return f(false);
    }

    final ColorStateList g() {
        return this.f58089l;
    }

    @NonNull
    final k h() {
        return this.f58079b;
    }

    final ColorStateList i() {
        return this.f58088k;
    }

    final int j() {
        return this.f58085h;
    }

    final ColorStateList k() {
        return this.f58087j;
    }

    final PorterDuff.Mode l() {
        return this.f58086i;
    }

    final boolean m() {
        return this.f58092o;
    }

    final boolean n() {
        return this.f58094q;
    }

    final void o(@NonNull TypedArray typedArray) {
        this.f58080c = typedArray.getDimensionPixelOffset(1, 0);
        this.f58081d = typedArray.getDimensionPixelOffset(2, 0);
        this.f58082e = typedArray.getDimensionPixelOffset(3, 0);
        this.f58083f = typedArray.getDimensionPixelOffset(4, 0);
        if (typedArray.hasValue(8)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(8, -1);
            this.f58084g = dimensionPixelSize;
            w(this.f58079b.o(dimensionPixelSize));
            this.f58093p = true;
        }
        this.f58085h = typedArray.getDimensionPixelSize(20, 0);
        this.f58086i = C9621p.e(typedArray.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        MaterialButton materialButton = this.f58078a;
        this.f58087j = c.a(materialButton.getContext(), typedArray, 6);
        this.f58088k = c.a(materialButton.getContext(), typedArray, 19);
        this.f58089l = c.a(materialButton.getContext(), typedArray, 16);
        this.f58094q = typedArray.getBoolean(5, false);
        this.f58096s = typedArray.getDimensionPixelSize(9, 0);
        int i11 = Y.f42258g;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        if (typedArray.hasValue(0)) {
            q();
        } else {
            D();
        }
        materialButton.setPaddingRelative(paddingStart + this.f58080c, paddingTop + this.f58082e, paddingEnd + this.f58081d, paddingBottom + this.f58083f);
    }

    final void p(int i11) {
        if (f(false) != null) {
            f(false).setTint(i11);
        }
    }

    final void q() {
        this.f58092o = true;
        ColorStateList colorStateList = this.f58087j;
        MaterialButton materialButton = this.f58078a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(this.f58086i);
    }

    final void r(boolean z11) {
        this.f58094q = z11;
    }

    final void s(int i11) {
        if (this.f58093p && this.f58084g == i11) {
            return;
        }
        this.f58084g = i11;
        this.f58093p = true;
        w(this.f58079b.o(i11));
    }

    public final void t(int i11) {
        C(this.f58082e, i11);
    }

    public final void u(int i11) {
        C(i11, this.f58083f);
    }

    final void v(ColorStateList colorStateList) {
        if (this.f58089l != colorStateList) {
            this.f58089l = colorStateList;
            MaterialButton materialButton = this.f58078a;
            if (materialButton.getBackground() instanceof RippleDrawable) {
                ((RippleDrawable) materialButton.getBackground()).setColor(C10444a.b(colorStateList));
            }
        }
    }

    final void w(@NonNull k kVar) {
        this.f58079b = kVar;
        if (f(false) != null) {
            f(false).setShapeAppearanceModel(kVar);
        }
        if (f(true) != null) {
            f(true).setShapeAppearanceModel(kVar);
        }
        if (d() != null) {
            d().setShapeAppearanceModel(kVar);
        }
    }

    final void x(boolean z11) {
        this.f58091n = z11;
        E();
    }

    final void y(ColorStateList colorStateList) {
        if (this.f58088k != colorStateList) {
            this.f58088k = colorStateList;
            E();
        }
    }

    final void z(int i11) {
        if (this.f58085h != i11) {
            this.f58085h = i11;
            E();
        }
    }
}
