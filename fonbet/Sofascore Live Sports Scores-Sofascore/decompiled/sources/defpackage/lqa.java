package defpackage;

import androidx.compose.runtime.e;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lqa {
    public final ku3 a;
    public final k29 b;
    public final sr8 c;
    public j38 d;
    public j38 e;
    public j38 f;
    public boolean g;
    public final e1d h;
    public final e1d i;
    public final e1d j;
    public final e1d k;
    public long l;
    public long m;
    public n29 n;
    public final q50 o;
    public final q50 p;
    public final e1d q;
    public long r;

    public lqa(ku3 ku3Var, k29 k29Var, sr8 sr8Var) {
        this.a = ku3Var;
        this.b = k29Var;
        this.c = sr8Var;
        Boolean bool = Boolean.FALSE;
        this.h = e.f(bool);
        this.i = e.f(bool);
        this.j = e.f(bool);
        this.k = e.f(bool);
        this.l = 9223372034707292159L;
        this.m = 0L;
        this.n = k29Var != null ? k29Var.b() : null;
        this.o = new q50(new r6a(0L), lz.l, null, 12);
        this.p = new q50(Float.valueOf(1.0f), lz.f, null, 12);
        this.q = e.f(new r6a(0L));
        this.r = 9223372034707292159L;
    }

    public final void a() {
        n29 n29Var = this.n;
        j38 j38Var = this.d;
        e1d e1dVar = this.i;
        boolean booleanValue = ((Boolean) ((eoh) e1dVar).getValue()).booleanValue();
        ku3 ku3Var = this.a;
        rq3 rq3Var = null;
        if (booleanValue || j38Var == null || n29Var == null) {
            if (b()) {
                if (n29Var != null) {
                    n29Var.g(1.0f);
                }
                xw3.L(ku3Var, null, null, new jqa(this, rq3Var, 0), 3);
                return;
            }
            return;
        }
        ((eoh) e1dVar).setValue(Boolean.TRUE);
        boolean b = b();
        boolean z = !b;
        if (!b) {
            n29Var.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        xw3.L(ku3Var, null, null, new w21(z, this, j38Var, n29Var, (rq3) null), 3);
    }

    public final boolean b() {
        return ((Boolean) ((eoh) this.j).getValue()).booleanValue();
    }

    public final void c() {
        k29 k29Var;
        e1d e1dVar = this.h;
        boolean booleanValue = ((Boolean) ((eoh) e1dVar).getValue()).booleanValue();
        int i = 3;
        ku3 ku3Var = this.a;
        rq3 rq3Var = null;
        if (booleanValue) {
            ((eoh) e1dVar).setValue(Boolean.FALSE);
            xw3.L(ku3Var, null, null, new jqa(this, rq3Var, 2), 3);
        }
        e1d e1dVar2 = this.i;
        if (((Boolean) ((eoh) e1dVar2).getValue()).booleanValue()) {
            ((eoh) e1dVar2).setValue(Boolean.FALSE);
            xw3.L(ku3Var, null, null, new jqa(this, rq3Var, i), 3);
        }
        if (b()) {
            ((eoh) this.j).setValue(Boolean.FALSE);
            xw3.L(ku3Var, null, null, new jqa(this, rq3Var, 4), 3);
        }
        this.g = false;
        d(0L);
        this.l = 9223372034707292159L;
        n29 n29Var = this.n;
        if (n29Var != null && (k29Var = this.b) != null) {
            k29Var.a(n29Var);
        }
        this.n = null;
        this.d = null;
        this.f = null;
        this.e = null;
    }

    public final void d(long j) {
        ((eoh) this.q).setValue(new r6a(j));
    }
}
