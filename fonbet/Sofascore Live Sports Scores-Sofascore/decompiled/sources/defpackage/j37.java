package defpackage;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lj37;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j37 extends q8 {
    public final wi7 e;
    public final j67 f;
    public final ev6 g;
    public final boolean h;
    public final boolean i;
    public final fdi j;
    public final jof k;
    public final g62 l;
    public final nn2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j37(wi7 wi7Var, fqg fqgVar, Application application) {
        super(application);
        wi7Var.getClass();
        fqgVar.getClass();
        this.e = wi7Var;
        Object a = fqgVar.a("FANTASY_LEAGUE_EXTRA");
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        j67 j67Var = (j67) a;
        this.f = j67Var;
        Object a2 = fqgVar.a("FANTASY_COMPETITION_EXTRA");
        if (a2 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.g = (ev6) a2;
        Boolean bool = (Boolean) fqgVar.a("FANTASY_LEAGUE_POSITION_ON_SETTINGS");
        Boolean bool2 = Boolean.TRUE;
        this.h = Intrinsics.c(bool, bool2);
        this.i = Intrinsics.c((Boolean) fqgVar.a("FANTASY_LEAGUE_POSITION_ON_CHAT"), bool2);
        fdi a3 = gdi.a(j67Var);
        this.j = a3;
        this.k = un0.u(a3);
        g62 g = ml4.g(0, 7, null);
        this.l = g;
        this.m = f5p.J(g);
    }
}
