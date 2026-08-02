package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class he8 extends Drawable.ConstantState {
    public Drawable.ConstantState a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public int k;
    public float l;
    public int m;
    public float n;
    public int o;
    public float p;
    public int q;
    public float r;
    public int s;
    public vah t;
    public int u;
    public int v;
    public Rect w;
    public int[] x;

    public he8(he8 he8Var) {
        this.b = 0;
        this.c = false;
        this.d = Integer.MIN_VALUE;
        this.e = false;
        this.f = Integer.MIN_VALUE;
        this.g = Integer.MIN_VALUE;
        this.h = Integer.MIN_VALUE;
        this.i = Integer.MIN_VALUE;
        this.j = Float.NaN;
        this.k = Integer.MIN_VALUE;
        this.l = Float.NaN;
        this.m = Integer.MIN_VALUE;
        this.n = Float.NaN;
        this.o = Integer.MIN_VALUE;
        this.p = Float.NaN;
        this.q = Integer.MIN_VALUE;
        this.r = Float.NaN;
        this.s = Integer.MIN_VALUE;
        this.t = null;
        this.u = Integer.MIN_VALUE;
        this.v = Integer.MIN_VALUE;
        this.w = null;
        this.x = FocusRingDrawable.q;
        if (he8Var != null) {
            this.a = he8Var.a;
            this.b = he8Var.b;
            this.c = he8Var.c;
            this.d = he8Var.d;
            this.e = he8Var.e;
            this.f = he8Var.f;
            this.g = he8Var.g;
            this.h = he8Var.h;
            this.i = he8Var.i;
            this.j = he8Var.j;
            this.k = he8Var.k;
            this.l = he8Var.l;
            this.m = he8Var.m;
            this.n = he8Var.n;
            this.o = he8Var.o;
            this.p = he8Var.p;
            this.q = he8Var.q;
            this.r = he8Var.r;
            this.s = he8Var.s;
            this.u = he8Var.u;
            this.v = he8Var.v;
            vah vahVar = he8Var.t;
            if (vahVar instanceof xah) {
                this.t = ((xah) vahVar).m().a();
            } else if (vahVar instanceof jdi) {
                this.t = ((jdi) vahVar).j().d();
            } else {
                this.t = vahVar;
            }
            if (he8Var.w != null) {
                this.w = new Rect(he8Var.w);
            }
            int[] iArr = he8Var.x;
            this.x = Arrays.copyOf(iArr, iArr.length);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        Drawable.ConstantState constantState = this.a;
        return this.b | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new FocusRingDrawable(this, null, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new FocusRingDrawable(this, resources, null);
    }
}
