package defpackage;

import android.app.Application;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lh7i;", "Lq8;", "e7i", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class h7i extends q8 {
    public final s96 e;
    public final vyh f;
    public final tak g;
    public final Long h;
    public final mqi i;
    public Set j;
    public g9i k;
    public final yzc l;
    public final yzc m;
    public List n;
    public g9i o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7i(Application application, fqg fqgVar, s96 s96Var, vyh vyhVar, tak takVar) {
        super(application);
        fqgVar.getClass();
        s96Var.getClass();
        vyhVar.getClass();
        takVar.getClass();
        this.e = s96Var;
        this.f = vyhVar;
        this.g = takVar;
        this.h = (Long) fqgVar.a("ARG_WEEK_START_EPOCH_SECONDS");
        this.i = ypa.b(new w1i(this, 3));
        this.j = rm5.a;
        yzc yzcVar = new yzc();
        this.l = yzcVar;
        this.m = yzcVar;
        this.n = km5.a;
        g9i g9iVar = this.o;
        rq3 rq3Var = null;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        this.o = xw3.L(un0.z(this), null, null, new g7i(this, rq3Var, 0), 3);
        g9i g9iVar2 = this.k;
        if (g9iVar2 != null) {
            g9iVar2.e(null);
        }
        iz2 z = un0.z(this);
        hs4 hs4Var = z45.a;
        this.k = xw3.L(z, hq4.c, null, new g7i(this, rq3Var, 1), 2);
    }

    public static Integer k(e7i e7iVar) {
        if (e7iVar instanceof d7i) {
            return Integer.valueOf(((d7i) e7iVar).a.getId());
        }
        if (e7iVar instanceof c7i) {
            return ((c7i) e7iVar).a.getUniqueStageId();
        }
        zzl.b();
        return null;
    }
}
