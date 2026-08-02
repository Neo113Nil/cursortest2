package s7;

import android.os.Bundle;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r extends v {

    /* renamed from: b, reason: collision with root package name */
    public final s.e f22971b;

    /* renamed from: c, reason: collision with root package name */
    public final s.e f22972c;

    /* renamed from: d, reason: collision with root package name */
    public long f22973d;

    public r(f1 f1Var) {
        super(f1Var);
        this.f22972c = new s.e(0);
        this.f22971b = new s.e(0);
    }

    public final void k(long j, String str) {
        f1 f1Var = (f1) this.f3328a;
        if (str == null || str.length() == 0) {
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22903f.a("Ad unit id must be a non-empty string");
        } else {
            d1 d1Var = f1Var.f22746g;
            f1.m(d1Var);
            d1Var.s(new a(this, str, j, 0));
        }
    }

    public final void l(long j, String str) {
        f1 f1Var = (f1) this.f3328a;
        if (str == null || str.length() == 0) {
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22903f.a("Ad unit id must be a non-empty string");
        } else {
            d1 d1Var = f1Var.f22746g;
            f1.m(d1Var);
            d1Var.s(new a(this, str, j, 1));
        }
    }

    public final void m(long j) {
        o2 o2Var = ((f1) this.f3328a).f22750l;
        f1.l(o2Var);
        l2 p10 = o2Var.p(false);
        s.e eVar = this.f22971b;
        Iterator it = ((s.b) eVar.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            o(str, j - ((Long) eVar.get(str)).longValue(), p10);
        }
        if (!eVar.isEmpty()) {
            n(j - this.f22973d, p10);
        }
        p(j);
    }

    public final void n(long j, l2 l2Var) {
        f1 f1Var = (f1) this.f3328a;
        if (l2Var == null) {
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22910n.a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            n0 n0Var2 = f1Var.f22745f;
            f1.m(n0Var2);
            n0Var2.f22910n.b(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            v3.c0(l2Var, bundle, true);
            e2 e2Var = f1Var.f22751m;
            f1.l(e2Var);
            e2Var.q("am", "_xa", bundle);
        }
    }

    public final void o(String str, long j, l2 l2Var) {
        f1 f1Var = (f1) this.f3328a;
        if (l2Var == null) {
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22910n.a("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                n0 n0Var2 = f1Var.f22745f;
                f1.m(n0Var2);
                n0Var2.f22910n.b(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            v3.c0(l2Var, bundle, true);
            e2 e2Var = f1Var.f22751m;
            f1.l(e2Var);
            e2Var.q("am", "_xu", bundle);
        }
    }

    public final void p(long j) {
        s.e eVar = this.f22971b;
        Iterator it = ((s.b) eVar.keySet()).iterator();
        while (it.hasNext()) {
            eVar.put((String) it.next(), Long.valueOf(j));
        }
        if (eVar.isEmpty()) {
            return;
        }
        this.f22973d = j;
    }
}
