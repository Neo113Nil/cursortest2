package defpackage;

import android.app.Application;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lj07;", "Ld50;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j07 extends d50 {
    public final wi7 c;
    public final ev6 d;
    public final int e;
    public final String f;
    public final g62 g;
    public final nn2 h;
    public s17 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j07(wi7 wi7Var, fqg fqgVar, Application application) {
        super(application);
        fqgVar.getClass();
        wi7Var.getClass();
        this.c = wi7Var;
        Object a = fqgVar.a("competition");
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.d = (ev6) a;
        Object a2 = fqgVar.a("roundId");
        if (a2 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.e = ((Number) a2).intValue();
        ia0 ia0Var = ia0.q;
        this.f = fc6.e();
        g62 g = ml4.g(0, 7, null);
        this.g = g;
        this.h = f5p.J(g);
        iz2 z = un0.z(this);
        hs4 hs4Var = z45.a;
        xw3.L(z, hq4.c, null, new i07(this, null), 2);
    }
}
