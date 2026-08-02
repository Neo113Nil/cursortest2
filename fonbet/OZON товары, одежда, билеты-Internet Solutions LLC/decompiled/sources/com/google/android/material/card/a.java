package com.google.android.material.card;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.core.view.Y;
import i7.C7017a;
import n7.C8448a;
import ru.ozon.app.android.R;
import v7.c;
import w7.C10444a;
import y7.C10853d;
import y7.C10854e;
import y7.C10856g;
import y7.j;
import y7.k;

/* loaded from: classes9.dex */
final class a {

    /* renamed from: t, reason: collision with root package name */
    private static final double f58097t = Math.cos(Math.toRadians(45.0d));

    /* renamed from: u, reason: collision with root package name */
    private static final ColorDrawable f58098u;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final MaterialCardView f58099a;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private final C10856g f58101c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    private final C10856g f58102d;

    /* renamed from: e, reason: collision with root package name */
    private int f58103e;

    /* renamed from: f, reason: collision with root package name */
    private int f58104f;

    /* renamed from: g, reason: collision with root package name */
    private int f58105g;

    /* renamed from: h, reason: collision with root package name */
    private int f58106h;

    /* renamed from: i, reason: collision with root package name */
    private Drawable f58107i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f58108j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f58109k;

    /* renamed from: l, reason: collision with root package name */
    private ColorStateList f58110l;

    /* renamed from: m, reason: collision with root package name */
    private k f58111m;

    /* renamed from: n, reason: collision with root package name */
    private ColorStateList f58112n;

    /* renamed from: o, reason: collision with root package name */
    private RippleDrawable f58113o;

    /* renamed from: p, reason: collision with root package name */
    private LayerDrawable f58114p;

    /* renamed from: q, reason: collision with root package name */
    private C10856g f58115q;

    /* renamed from: s, reason: collision with root package name */
    private boolean f58117s;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final Rect f58100b = new Rect();

    /* renamed from: r, reason: collision with root package name */
    private boolean f58116r = false;

    /* renamed from: com.google.android.material.card.a$a, reason: collision with other inner class name */
    final class C0881a extends InsetDrawable {
        @Override // android.graphics.drawable.Drawable
        public final int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public final int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public final boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        f58098u = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public a(@NonNull MaterialCardView materialCardView, AttributeSet attributeSet, int i11, int i12) {
        this.f58099a = materialCardView;
        C10856g c10856g = new C10856g(materialCardView.getContext(), attributeSet, i11, i12);
        this.f58101c = c10856g;
        c10856g.v(materialCardView.getContext());
        c10856g.H();
        k r11 = c10856g.r();
        r11.getClass();
        k.a aVar = new k.a(r11);
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, C7017a.f65940f, i11, R.style.CardView);
        if (obtainStyledAttributes.hasValue(3)) {
            aVar.c(obtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.f58102d = new C10856g();
        q(aVar.a());
        obtainStyledAttributes.recycle();
    }

    private float a() {
        C10853d j11 = this.f58111m.j();
        C10856g c10856g = this.f58101c;
        return Math.max(Math.max(b(j11, c10856g.s()), b(this.f58111m.l(), c10856g.t())), Math.max(b(this.f58111m.g(), c10856g.n()), b(this.f58111m.e(), c10856g.m())));
    }

    private static float b(C10853d c10853d, float f7) {
        if (c10853d instanceof j) {
            return (float) ((1.0d - f58097t) * f7);
        }
        if (c10853d instanceof C10854e) {
            return f7 / 2.0f;
        }
        return 0.0f;
    }

    @NonNull
    private LayerDrawable e() {
        if (this.f58113o == null) {
            int i11 = C10444a.f103609f;
            this.f58115q = new C10856g(this.f58111m);
            this.f58113o = new RippleDrawable(this.f58109k, null, this.f58115q);
        }
        if (this.f58114p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f58113o, this.f58102d, this.f58108j});
            this.f58114p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f58114p;
    }

    @NonNull
    private Drawable h(Drawable drawable) {
        int i11;
        int i12;
        if (this.f58099a.getUseCompatPadding()) {
            int ceil = (int) Math.ceil((r0.getMaxCardElevation() * 1.5f) + (u() ? a() : 0.0f));
            i11 = (int) Math.ceil(r0.getMaxCardElevation() + (u() ? a() : 0.0f));
            i12 = ceil;
        } else {
            i11 = 0;
            i12 = 0;
        }
        return new C0881a(drawable, i11, i12, i11, i12);
    }

    private boolean u() {
        MaterialCardView materialCardView = this.f58099a;
        return materialCardView.getPreventCornerOverlap() && this.f58101c.x() && materialCardView.getUseCompatPadding();
    }

    final void c() {
        RippleDrawable rippleDrawable = this.f58113o;
        if (rippleDrawable != null) {
            Rect bounds = rippleDrawable.getBounds();
            int i11 = bounds.bottom;
            this.f58113o.setBounds(bounds.left, bounds.top, bounds.right, i11 - 1);
            this.f58113o.setBounds(bounds.left, bounds.top, bounds.right, i11);
        }
    }

    @NonNull
    final C10856g d() {
        return this.f58101c;
    }

    final float f() {
        return this.f58101c.s();
    }

    final k g() {
        return this.f58111m;
    }

    final boolean i() {
        return this.f58116r;
    }

    final boolean j() {
        return this.f58117s;
    }

    final void k(@NonNull TypedArray typedArray) {
        MaterialCardView materialCardView = this.f58099a;
        ColorStateList a11 = c.a(materialCardView.getContext(), typedArray, 11);
        this.f58112n = a11;
        if (a11 == null) {
            this.f58112n = ColorStateList.valueOf(-1);
        }
        this.f58106h = typedArray.getDimensionPixelSize(12, 0);
        boolean z11 = typedArray.getBoolean(0, false);
        this.f58117s = z11;
        materialCardView.setLongClickable(z11);
        this.f58110l = c.a(materialCardView.getContext(), typedArray, 6);
        Drawable c11 = c.c(materialCardView.getContext(), typedArray, 2);
        if (c11 != null) {
            Drawable mutate = c11.mutate();
            this.f58108j = mutate;
            androidx.core.graphics.drawable.a.j(mutate, this.f58110l);
            o(materialCardView.isChecked());
        } else {
            this.f58108j = f58098u;
        }
        LayerDrawable layerDrawable = this.f58114p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f58108j);
        }
        this.f58104f = typedArray.getDimensionPixelSize(5, 0);
        this.f58103e = typedArray.getDimensionPixelSize(4, 0);
        this.f58105g = typedArray.getInteger(3, 8388661);
        ColorStateList a12 = c.a(materialCardView.getContext(), typedArray, 7);
        this.f58109k = a12;
        if (a12 == null) {
            this.f58109k = ColorStateList.valueOf(C8448a.b(R.attr.colorControlHighlight, materialCardView));
        }
        ColorStateList a13 = c.a(materialCardView.getContext(), typedArray, 1);
        if (a13 == null) {
            a13 = ColorStateList.valueOf(0);
        }
        C10856g c10856g = this.f58102d;
        c10856g.B(a13);
        int i11 = C10444a.f103609f;
        RippleDrawable rippleDrawable = this.f58113o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(this.f58109k);
        }
        x();
        float f7 = this.f58106h;
        ColorStateList colorStateList = this.f58112n;
        c10856g.K(f7);
        c10856g.J(colorStateList);
        materialCardView.setBackgroundInternal(h(this.f58101c));
        Drawable drawable = c10856g;
        if (materialCardView.isClickable()) {
            drawable = e();
        }
        this.f58107i = drawable;
        materialCardView.setForeground(h(drawable));
    }

    final void l(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        if (this.f58114p != null) {
            MaterialCardView materialCardView = this.f58099a;
            if (materialCardView.getUseCompatPadding()) {
                i13 = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (u() ? a() : 0.0f)) * 2.0f);
                i14 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (u() ? a() : 0.0f)) * 2.0f);
            } else {
                i13 = 0;
                i14 = 0;
            }
            int i17 = this.f58105g;
            int i18 = (i17 & 8388613) == 8388613 ? ((i11 - this.f58103e) - this.f58104f) - i14 : this.f58103e;
            int i19 = (i17 & 80) == 80 ? this.f58103e : ((i12 - this.f58103e) - this.f58104f) - i13;
            int i21 = (i17 & 8388613) == 8388613 ? this.f58103e : ((i11 - this.f58103e) - this.f58104f) - i14;
            int i22 = (i17 & 80) == 80 ? ((i12 - this.f58103e) - this.f58104f) - i13 : this.f58103e;
            int i23 = Y.f42258g;
            if (materialCardView.getLayoutDirection() == 1) {
                i16 = i21;
                i15 = i18;
            } else {
                i15 = i21;
                i16 = i18;
            }
            this.f58114p.setLayerInset(2, i16, i22, i15, i19);
        }
    }

    final void m() {
        this.f58116r = true;
    }

    final void n(ColorStateList colorStateList) {
        this.f58101c.B(colorStateList);
    }

    public final void o(boolean z11) {
        Drawable drawable = this.f58108j;
        if (drawable != null) {
            drawable.setAlpha(z11 ? 255 : 0);
        }
    }

    final void p(float f7) {
        q(this.f58111m.o(f7));
        this.f58107i.invalidateSelf();
        boolean u11 = u();
        C10856g c10856g = this.f58101c;
        MaterialCardView materialCardView = this.f58099a;
        if (u11 || (materialCardView.getPreventCornerOverlap() && !c10856g.x())) {
            w();
        }
        if (u()) {
            if (!this.f58116r) {
                materialCardView.setBackgroundInternal(h(c10856g));
            }
            materialCardView.setForeground(h(this.f58107i));
        }
    }

    final void q(@NonNull k kVar) {
        this.f58111m = kVar;
        C10856g c10856g = this.f58101c;
        c10856g.setShapeAppearanceModel(kVar);
        c10856g.G(!c10856g.x());
        C10856g c10856g2 = this.f58102d;
        if (c10856g2 != null) {
            c10856g2.setShapeAppearanceModel(kVar);
        }
        C10856g c10856g3 = this.f58115q;
        if (c10856g3 != null) {
            c10856g3.setShapeAppearanceModel(kVar);
        }
    }

    final void r(ColorStateList colorStateList) {
        if (this.f58112n == colorStateList) {
            return;
        }
        this.f58112n = colorStateList;
        float f7 = this.f58106h;
        C10856g c10856g = this.f58102d;
        c10856g.K(f7);
        c10856g.J(colorStateList);
    }

    final void s(int i11) {
        if (i11 == this.f58106h) {
            return;
        }
        this.f58106h = i11;
        ColorStateList colorStateList = this.f58112n;
        C10856g c10856g = this.f58102d;
        c10856g.K(i11);
        c10856g.J(colorStateList);
    }

    final void t(int i11, int i12, int i13, int i14) {
        this.f58100b.set(i11, i12, i13, i14);
        w();
    }

    final void v() {
        Drawable drawable = this.f58107i;
        MaterialCardView materialCardView = this.f58099a;
        Drawable e11 = materialCardView.isClickable() ? e() : this.f58102d;
        this.f58107i = e11;
        if (drawable != e11) {
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(e11);
            } else {
                materialCardView.setForeground(h(e11));
            }
        }
    }

    final void w() {
        MaterialCardView materialCardView = this.f58099a;
        float f7 = 0.0f;
        float a11 = ((materialCardView.getPreventCornerOverlap() && !this.f58101c.x()) || u()) ? a() : 0.0f;
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            f7 = (float) ((1.0d - f58097t) * materialCardView.getCardViewRadius());
        }
        int i11 = (int) (a11 - f7);
        Rect rect = this.f58100b;
        materialCardView.setAncestorContentPadding(rect.left + i11, rect.top + i11, rect.right + i11, rect.bottom + i11);
    }

    final void x() {
        this.f58101c.A(this.f58099a.getCardElevation());
    }
}
