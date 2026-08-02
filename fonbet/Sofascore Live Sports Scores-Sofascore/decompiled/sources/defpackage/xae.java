package defpackage;

import android.graphics.Path;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xae extends ujk {
    public n52 b;
    public float f;
    public n52 g;
    public float k;
    public float m;
    public boolean p;
    public jii q;
    public final b20 r;
    public b20 s;
    public b20 t;
    public final joa u;
    public float c = 1.0f;
    public List d = jmk.a;
    public float e = 1.0f;
    public int h = 0;
    public int i = 0;
    public float j = 4.0f;
    public float l = 1.0f;
    public boolean n = true;
    public boolean o = true;

    public xae() {
        b20 a = e20.a();
        this.r = a;
        this.s = a;
        this.u = ypa.a(ysa.c, zg3.B);
    }

    @Override // defpackage.ujk
    public final void a(ha5 ha5Var) {
        jii jiiVar;
        if (this.n) {
            wca.J(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        n52 n52Var = this.b;
        if (n52Var != null) {
            ha5.D(ha5Var, this.s, n52Var, this.c, null, 0, 56);
        }
        n52 n52Var2 = this.g;
        if (n52Var2 != null) {
            jii jiiVar2 = this.q;
            if (this.o || jiiVar2 == null) {
                jii jiiVar3 = new jii(this.f, this.j, this.h, this.i, null, 16);
                this.q = jiiVar3;
                this.o = false;
                jiiVar = jiiVar3;
            } else {
                jiiVar = jiiVar2;
            }
            ha5.D(ha5Var, this.s, n52Var2, this.e, jiiVar, 0, 48);
        }
    }

    public final void e() {
        float f = this.k;
        b20 b20Var = this.r;
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.l == 1.0f) {
            this.s = b20Var;
            return;
        }
        b20 b20Var2 = this.s;
        if (b20Var2 != b20Var) {
            int i = b20Var2.a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
            this.s.a.rewind();
            this.s.j(i);
        } else {
            this.s = e20.a();
        }
        joa joaVar = this.u;
        ((d20) joaVar.getValue()).a.setPath(b20Var.a, false);
        float length = ((d20) joaVar.getValue()).a.getLength();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.l + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((d20) joaVar.getValue()).a(f4, f5, this.s);
            return;
        }
        b20 b20Var3 = this.t;
        if (b20Var3 == null) {
            b20Var3 = e20.a();
            this.t = b20Var3;
        }
        b20Var3.i();
        ((d20) joaVar.getValue()).a(f4, length, b20Var3);
        b20.a(this.s, b20Var3);
        b20Var3.i();
        ((d20) joaVar.getValue()).a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5, b20Var3);
        b20.a(this.s, b20Var3);
    }

    public final String toString() {
        return this.r.toString();
    }
}
