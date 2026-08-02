package defpackage;

import android.graphics.Color;
import android.graphics.Matrix;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xc5 implements k41 {
    public final p41 a;
    public final p41 b;
    public final x13 c;
    public final z78 d;
    public final z78 e;
    public final z78 f;
    public final z78 g;
    public Matrix h;

    public xc5(p41 p41Var, p41 p41Var2, p03 p03Var) {
        this.b = p41Var;
        this.a = p41Var2;
        o41 g = ((r50) p03Var.b).g();
        this.c = (x13) g;
        g.a(this);
        p41Var2.f(g);
        z78 g2 = ((s50) p03Var.c).g();
        this.d = g2;
        g2.a(this);
        p41Var2.f(g2);
        z78 g3 = ((s50) p03Var.d).g();
        this.e = g3;
        g3.a(this);
        p41Var2.f(g3);
        z78 g4 = ((s50) p03Var.e).g();
        this.f = g4;
        g4.a(this);
        p41Var2.f(g4);
        z78 g5 = ((s50) p03Var.f).g();
        this.g = g5;
        g5.a(this);
        p41Var2.f(g5);
    }

    @Override // defpackage.k41
    public final void a() {
        this.b.a();
    }

    public final uc5 b(Matrix matrix, int i) {
        float l = this.e.l() * 0.017453292f;
        float floatValue = ((Float) this.f.e()).floatValue();
        double d = l;
        float sin = ((float) Math.sin(d)) * floatValue;
        float cos = ((float) Math.cos(d + 3.141592653589793d)) * floatValue;
        float floatValue2 = ((Float) this.g.e()).floatValue();
        int intValue = ((Integer) this.c.e()).intValue();
        int argb = Color.argb(Math.round((((Float) this.d.e()).floatValue() * i) / 255.0f), Color.red(intValue), Color.green(intValue), Color.blue(intValue));
        uc5 uc5Var = new uc5();
        uc5Var.a = floatValue2 * 0.33f;
        uc5Var.b = sin;
        uc5Var.c = cos;
        uc5Var.d = argb;
        uc5Var.e = null;
        uc5Var.c(matrix);
        if (this.h == null) {
            this.h = new Matrix();
        }
        this.a.w.e().invert(this.h);
        uc5Var.c(this.h);
        return uc5Var;
    }

    public final void c(wj9 wj9Var) {
        z78 z78Var = this.d;
        if (wj9Var == null) {
            z78Var.j(null);
        } else {
            z78Var.j(new wc5(wj9Var, 0));
        }
    }
}
