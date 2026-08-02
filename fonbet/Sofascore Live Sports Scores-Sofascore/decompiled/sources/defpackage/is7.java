package defpackage;

import android.app.Application;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lis7;", "Lj31;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class is7 extends j31 {
    public final bt7 i;
    public final j0j j;
    public final w3b k;
    public final fdi l;
    public g9i m;
    public final fdi n;
    public final fdi o;
    public final fu3 p;
    public final fu3 q;
    public String r;
    public List s;
    public List t;
    public List u;
    public List v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is7(Application application, bt7 bt7Var, j0j j0jVar, w3b w3bVar, gzh gzhVar) {
        super(application, gzhVar);
        j0jVar.getClass();
        w3bVar.getClass();
        gzhVar.getClass();
        this.i = bt7Var;
        this.j = j0jVar;
        this.k = w3bVar;
        fdi a = gdi.a(Boolean.FALSE);
        this.l = a;
        this.n = gdi.a("");
        rq3 rq3Var = null;
        v98 v98Var = new v98(new ip1(this, rq3Var, 22), new wf2(new ws7[0], 5));
        iz2 z = un0.z(this);
        km5 km5Var = km5.a;
        this.o = j34.c(v98Var, z, new ws7(km5Var, km5Var));
        this.p = j72.t(hkg.H(la8.a(new sj3(a, 3), new ds7(1, rq3Var, this))));
        this.q = j72.t(hkg.H(bt7Var.a.j(l5i.a())));
        this.r = "";
        this.s = km5Var;
        this.t = km5Var;
        this.u = km5Var;
        this.v = km5Var;
    }

    public final void m(boolean z) {
        g9i g9iVar = this.m;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        this.m = xw3.L(un0.z(this), null, null, new gs7(this, z, null), 3);
    }
}
