package oa;

import O0.m;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.shape.i;
import com.google.android.material.shape.n;
import com.google.android.material.shape.q;
import com.google.android.material.shape.s;
import sa.AbstractC6344a;
import xa.o;

/* renamed from: oa.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5863d {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f59567a;

    /* renamed from: b, reason: collision with root package name */
    public n f59568b;

    /* renamed from: c, reason: collision with root package name */
    public s f59569c;

    /* renamed from: d, reason: collision with root package name */
    public m f59570d;

    /* renamed from: e, reason: collision with root package name */
    public i.d f59571e;

    /* renamed from: f, reason: collision with root package name */
    public int f59572f;

    /* renamed from: g, reason: collision with root package name */
    public int f59573g;

    /* renamed from: h, reason: collision with root package name */
    public int f59574h;

    /* renamed from: i, reason: collision with root package name */
    public int f59575i;

    /* renamed from: j, reason: collision with root package name */
    public int f59576j;

    /* renamed from: k, reason: collision with root package name */
    public int f59577k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f59578l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f59579m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f59580n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f59581o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f59582p;

    /* renamed from: t, reason: collision with root package name */
    public boolean f59586t;

    /* renamed from: v, reason: collision with root package name */
    public LayerDrawable f59588v;

    /* renamed from: w, reason: collision with root package name */
    public int f59589w;

    /* renamed from: q, reason: collision with root package name */
    public boolean f59583q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f59584r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f59585s = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f59587u = true;

    public C5863d(MaterialButton materialButton, n nVar) {
        this.f59567a = materialButton;
        this.f59568b = nVar;
    }

    public void A(int i10) {
        L(this.f59574h, i10);
    }

    public void B(int i10) {
        L(i10, this.f59575i);
    }

    public void C(ColorStateList colorStateList) {
        if (this.f59581o != colorStateList) {
            this.f59581o = colorStateList;
            if (this.f59567a.getBackground() instanceof RippleDrawable) {
                ((RippleDrawable) this.f59567a.getBackground()).setColor(Da.a.d(colorStateList));
            }
        }
    }

    public void D(n nVar) {
        this.f59568b = nVar;
        this.f59569c = null;
        N();
    }

    public void E(boolean z10) {
        this.f59583q = z10;
        O();
    }

    public void F(s sVar) {
        this.f59569c = sVar;
        N();
    }

    public void G(ColorStateList colorStateList) {
        if (this.f59580n != colorStateList) {
            this.f59580n = colorStateList;
            O();
        }
    }

    public void H(int i10) {
        if (this.f59577k != i10) {
            this.f59577k = i10;
            O();
        }
    }

    public void I(ColorStateList colorStateList) {
        if (this.f59579m != colorStateList) {
            this.f59579m = colorStateList;
            if (g() != null) {
                g().setTintList(this.f59579m);
            }
        }
    }

    public void J(PorterDuff.Mode mode) {
        if (this.f59578l != mode) {
            this.f59578l = mode;
            if (g() == null || this.f59578l == null) {
                return;
            }
            g().setTintMode(this.f59578l);
        }
    }

    public void K(boolean z10) {
        this.f59587u = z10;
    }

    public final void L(int i10, int i11) {
        int paddingStart = this.f59567a.getPaddingStart();
        int paddingTop = this.f59567a.getPaddingTop();
        int paddingEnd = this.f59567a.getPaddingEnd();
        int paddingBottom = this.f59567a.getPaddingBottom();
        int i12 = this.f59574h;
        int i13 = this.f59575i;
        this.f59575i = i11;
        this.f59574h = i10;
        if (!this.f59584r) {
            M();
        }
        this.f59567a.setPaddingRelative(paddingStart, (paddingTop + i10) - i12, paddingEnd, (paddingBottom + i11) - i13);
    }

    public final void M() {
        this.f59567a.setInternalBackground(a());
        i g10 = g();
        if (g10 != null) {
            g10.e0(this.f59589w);
            g10.setState(this.f59567a.getDrawableState());
        }
    }

    public final void N() {
        i g10 = g();
        if (g10 != null) {
            s sVar = this.f59569c;
            if (sVar != null) {
                g10.l0(sVar);
            } else {
                g10.setShapeAppearanceModel(this.f59568b);
            }
            m mVar = this.f59570d;
            if (mVar != null) {
                g10.d0(mVar);
            }
        }
        i p10 = p();
        if (p10 != null) {
            s sVar2 = this.f59569c;
            if (sVar2 != null) {
                p10.l0(sVar2);
            } else {
                p10.setShapeAppearanceModel(this.f59568b);
            }
            m mVar2 = this.f59570d;
            if (mVar2 != null) {
                p10.d0(mVar2);
            }
        }
        q f10 = f();
        if (f10 != null) {
            f10.setShapeAppearanceModel(this.f59568b);
            if (f10 instanceof i) {
                i iVar = (i) f10;
                s sVar3 = this.f59569c;
                if (sVar3 != null) {
                    iVar.l0(sVar3);
                }
                m mVar3 = this.f59570d;
                if (mVar3 != null) {
                    iVar.d0(mVar3);
                }
            }
        }
    }

    public final void O() {
        i g10 = g();
        i p10 = p();
        if (g10 != null) {
            g10.n0(this.f59577k, this.f59580n);
            if (p10 != null) {
                p10.m0(this.f59577k, this.f59583q ? AbstractC6344a.d(this.f59567a, ia.c.f48260t) : 0);
            }
        }
    }

    public final InsetDrawable P(Drawable drawable) {
        return new InsetDrawable(drawable, this.f59572f, this.f59574h, this.f59573g, this.f59575i);
    }

    public final Drawable a() {
        i iVar = new i(this.f59568b);
        s sVar = this.f59569c;
        if (sVar != null) {
            iVar.l0(sVar);
        }
        m mVar = this.f59570d;
        if (mVar != null) {
            iVar.d0(mVar);
        }
        i.d dVar = this.f59571e;
        if (dVar != null) {
            iVar.h0(dVar);
        }
        iVar.T(this.f59567a.getContext());
        iVar.setTintList(this.f59579m);
        PorterDuff.Mode mode = this.f59578l;
        if (mode != null) {
            iVar.setTintMode(mode);
        }
        iVar.n0(this.f59577k, this.f59580n);
        i iVar2 = new i(this.f59568b);
        s sVar2 = this.f59569c;
        if (sVar2 != null) {
            iVar2.l0(sVar2);
        }
        m mVar2 = this.f59570d;
        if (mVar2 != null) {
            iVar2.d0(mVar2);
        }
        iVar2.setTint(0);
        iVar2.m0(this.f59577k, this.f59583q ? AbstractC6344a.d(this.f59567a, ia.c.f48260t) : 0);
        i iVar3 = new i(this.f59568b);
        this.f59582p = iVar3;
        s sVar3 = this.f59569c;
        if (sVar3 != null) {
            iVar3.l0(sVar3);
        }
        m mVar3 = this.f59570d;
        if (mVar3 != null) {
            ((i) this.f59582p).d0(mVar3);
        }
        this.f59582p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(Da.a.d(this.f59581o), P(new LayerDrawable(new Drawable[]{iVar2, iVar})), this.f59582p);
        this.f59588v = rippleDrawable;
        return rippleDrawable;
    }

    public int b() {
        return this.f59576j;
    }

    public m c() {
        return this.f59570d;
    }

    public int d() {
        return this.f59575i;
    }

    public int e() {
        return this.f59574h;
    }

    public q f() {
        LayerDrawable layerDrawable = this.f59588v;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f59588v.getNumberOfLayers() > 2 ? (q) this.f59588v.getDrawable(2) : (q) this.f59588v.getDrawable(1);
    }

    public i g() {
        return h(false);
    }

    public final i h(boolean z10) {
        LayerDrawable layerDrawable = this.f59588v;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (i) ((LayerDrawable) ((InsetDrawable) this.f59588v.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0);
    }

    public ColorStateList i() {
        return this.f59581o;
    }

    public n j() {
        return this.f59568b;
    }

    public s k() {
        return this.f59569c;
    }

    public ColorStateList l() {
        return this.f59580n;
    }

    public int m() {
        return this.f59577k;
    }

    public ColorStateList n() {
        return this.f59579m;
    }

    public PorterDuff.Mode o() {
        return this.f59578l;
    }

    public final i p() {
        return h(true);
    }

    public boolean q() {
        return this.f59584r;
    }

    public boolean r() {
        return this.f59586t;
    }

    public boolean s() {
        return this.f59587u;
    }

    public void t(TypedArray typedArray) {
        this.f59572f = typedArray.getDimensionPixelOffset(ia.m.f48834Z2, 0);
        this.f59573g = typedArray.getDimensionPixelOffset(ia.m.f48844a3, 0);
        this.f59574h = typedArray.getDimensionPixelOffset(ia.m.f48854b3, 0);
        this.f59575i = typedArray.getDimensionPixelOffset(ia.m.f48864c3, 0);
        if (typedArray.hasValue(ia.m.f48904g3)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(ia.m.f48904g3, -1);
            this.f59576j = dimensionPixelSize;
            D(this.f59568b.x(dimensionPixelSize));
            this.f59585s = true;
        }
        this.f59577k = typedArray.getDimensionPixelSize(ia.m.f49024s3, 0);
        this.f59578l = o.k(typedArray.getInt(ia.m.f48894f3, -1), PorterDuff.Mode.SRC_IN);
        this.f59579m = Ca.c.a(this.f59567a.getContext(), typedArray, ia.m.f48884e3);
        this.f59580n = Ca.c.a(this.f59567a.getContext(), typedArray, ia.m.f49014r3);
        this.f59581o = Ca.c.a(this.f59567a.getContext(), typedArray, ia.m.f48994p3);
        this.f59586t = typedArray.getBoolean(ia.m.f48874d3, false);
        this.f59589w = typedArray.getDimensionPixelSize(ia.m.f48914h3, 0);
        this.f59587u = typedArray.getBoolean(ia.m.f49034t3, true);
        int paddingStart = this.f59567a.getPaddingStart();
        int paddingTop = this.f59567a.getPaddingTop();
        int paddingEnd = this.f59567a.getPaddingEnd();
        int paddingBottom = this.f59567a.getPaddingBottom();
        if (typedArray.hasValue(ia.m.f48816X2)) {
            v();
        } else {
            M();
        }
        this.f59567a.setPaddingRelative(paddingStart + this.f59572f, paddingTop + this.f59574h, paddingEnd + this.f59573g, paddingBottom + this.f59575i);
    }

    public void u(int i10) {
        if (g() != null) {
            g().setTint(i10);
        }
    }

    public void v() {
        this.f59584r = true;
        this.f59567a.setSupportBackgroundTintList(this.f59579m);
        this.f59567a.setSupportBackgroundTintMode(this.f59578l);
    }

    public void w(boolean z10) {
        this.f59586t = z10;
    }

    public void x(int i10) {
        if (this.f59585s && this.f59576j == i10) {
            return;
        }
        this.f59576j = i10;
        this.f59585s = true;
        D(this.f59568b.x(i10));
    }

    public void y(i.d dVar) {
        this.f59571e = dVar;
        i g10 = g();
        if (g10 != null) {
            g10.h0(dVar);
        }
    }

    public void z(m mVar) {
        this.f59570d = mVar;
        if (this.f59569c != null) {
            N();
        }
    }
}
