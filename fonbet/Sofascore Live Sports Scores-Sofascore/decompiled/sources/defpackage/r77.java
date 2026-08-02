package defpackage;

import android.app.Application;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lr77;", "Lynb;", "Ln77;", "Lc77;", "Lj77;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class r77 extends ynb {
    public final wi7 l;
    public final ky6 m;
    public final do7 n;
    public final boolean o;
    public final String p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r77(Application application, fqg fqgVar, wi7 wi7Var, ky6 ky6Var) {
        super(application, tnb.a);
        fqgVar.getClass();
        wi7Var.getClass();
        ky6Var.getClass();
        this.l = wi7Var;
        this.m = ky6Var;
        Object a = fqgVar.a("USER_COMPETITION_EXTRA");
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.n = (do7) a;
        ia0 ia0Var = ia0.q;
        this.o = mz1.C();
        this.p = fc6.e();
    }

    public static vl7 t(tl7 tl7Var, boolean z, boolean z2) {
        return new vl7(tl7Var, z ? yl7.a : new zl7(bm7.Used), z, z2);
    }

    public final void u(c77 c77Var) {
        rq3 rq3Var = null;
        if (c77Var.equals(w67.a)) {
            n(null, new yt6(18));
            return;
        }
        if (c77Var.equals(v67.a)) {
            n(null, new yt6(19));
            return;
        }
        if (c77Var instanceof z67) {
            xw3.L(un0.z(this), null, null, new rh4(this, ((z67) c77Var).a, (rq3) null), 3);
        } else {
            if (c77Var.equals(t67.a)) {
                xw3.L(un0.z(this), null, null, new hs6(this, rq3Var, 16), 3);
                return;
            }
            if (c77Var.equals(b77.a) || c77Var.equals(y67.a) || c77Var.equals(a77.a) || c77Var.equals(x67.a) || c77Var.equals(u67.a)) {
                return;
            }
            zzl.b();
        }
    }
}
