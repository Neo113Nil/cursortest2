package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.focus.FocusRingDrawable;
import com.sofascore.results.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class syb {
    public final MaterialButton a;
    public vah b;
    public e0i c;
    public kr9 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public PorterDuff.Mode k;
    public ColorStateList l;
    public ColorStateList m;
    public ColorStateList n;
    public qzb o;
    public boolean s;
    public RippleDrawable u;
    public int v;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean t = true;

    public syb(MaterialButton materialButton, vah vahVar) {
        this.a = materialButton;
        this.b = vahVar;
    }

    public final qzb a(boolean z) {
        RippleDrawable rippleDrawable = this.u;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (qzb) ((LayerDrawable) ((InsetDrawable) this.u.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void b(int i, int i2, int i3, int i4) {
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i5 = this.e;
        int i6 = this.g;
        int i7 = this.f;
        int i8 = this.h;
        this.e = i;
        this.g = i2;
        this.f = i3;
        this.h = i4;
        if (!this.q) {
            c();
        }
        materialButton.setPaddingRelative((paddingStart + i) - i5, (paddingTop + i2) - i6, (paddingEnd + i3) - i7, (paddingBottom + i4) - i8);
    }

    public final void c() {
        qzb qzbVar = new qzb(this.b);
        e0i e0iVar = this.c;
        if (e0iVar != null) {
            qzbVar.r(e0iVar);
        }
        kr9 kr9Var = this.d;
        if (kr9Var != null) {
            qzbVar.E = kr9Var;
        }
        MaterialButton materialButton = this.a;
        Context context = materialButton.getContext();
        qzbVar.p(context);
        qzbVar.setTintList(this.l);
        PorterDuff.Mode mode = this.k;
        if (mode != null) {
            qzbVar.setTintMode(mode);
        }
        float f = this.j;
        ColorStateList colorStateList = this.m;
        qzbVar.A(f);
        qzbVar.y(colorStateList);
        qzb qzbVar2 = new qzb(this.b);
        e0i e0iVar2 = this.c;
        if (e0iVar2 != null) {
            qzbVar2.r(e0iVar2);
        }
        qzbVar2.setTint(0);
        float f2 = this.j;
        int O = this.p ? o3a.O(materialButton.getContext(), x2a.O(R.attr.colorSurface, materialButton)) : 0;
        qzbVar2.A(f2);
        qzbVar2.y(ColorStateList.valueOf(O));
        qzb qzbVar3 = new qzb(this.b);
        this.o = qzbVar3;
        e0i e0iVar3 = this.c;
        if (e0iVar3 != null) {
            qzbVar3.r(e0iVar3);
        }
        this.o.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(rfo.J(this.n), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{qzbVar2, qzbVar}), this.e, this.g, this.f, this.h), this.o);
        this.u = rippleDrawable;
        FocusRingDrawable.f(context, rippleDrawable, null);
        materialButton.setInternalBackground(this.u);
        qzb a = a(false);
        if (a != null) {
            a.s(this.v);
            a.setState(materialButton.getDrawableState());
        }
        FocusRingDrawable c = FocusRingDrawable.c(materialButton.getBackground());
        if (c != null) {
            c.h = new WeakReference(a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        ach achVar;
        qzb a = a(false);
        if (a != null) {
            a.x(this.b);
            e0i e0iVar = this.c;
            if (e0iVar != null) {
                a.r(e0iVar);
            }
        }
        qzb a2 = a(true);
        if (a2 != null) {
            a2.x(this.b);
            e0i e0iVar2 = this.c;
            if (e0iVar2 != null) {
                a2.r(e0iVar2);
            }
        }
        RippleDrawable rippleDrawable = this.u;
        if (rippleDrawable != null) {
            Object findDrawableByLayerId = rippleDrawable.findDrawableByLayerId(android.R.id.mask);
            if (findDrawableByLayerId instanceof ach) {
                achVar = (ach) findDrawableByLayerId;
                if (achVar == null) {
                    boolean z = achVar instanceof qzb;
                    vah vahVar = this.b;
                    if (!z) {
                        achVar.setShapeAppearanceModel(vahVar.d());
                        return;
                    }
                    qzb qzbVar = (qzb) achVar;
                    qzbVar.x(vahVar);
                    e0i e0iVar3 = this.c;
                    if (e0iVar3 != null) {
                        qzbVar.r(e0iVar3);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        achVar = null;
        if (achVar == null) {
        }
    }

    public final void e() {
        int i = 0;
        qzb a = a(false);
        qzb a2 = a(true);
        if (a != null) {
            float f = this.j;
            ColorStateList colorStateList = this.m;
            a.A(f);
            a.y(colorStateList);
            if (a2 != null) {
                float f2 = this.j;
                if (this.p) {
                    MaterialButton materialButton = this.a;
                    i = o3a.O(materialButton.getContext(), x2a.O(R.attr.colorSurface, materialButton));
                }
                a2.A(f2);
                a2.y(ColorStateList.valueOf(i));
            }
        }
    }
}
