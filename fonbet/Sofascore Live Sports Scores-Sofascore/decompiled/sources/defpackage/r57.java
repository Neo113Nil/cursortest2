package defpackage;

import androidx.compose.runtime.e;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lr57;", "Lltk;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class r57 extends ltk {
    public final wi7 b;
    public final ev6 c;
    public final j67 d;
    public final e1d e;
    public final g62 f;
    public final nn2 g;

    public r57(wi7 wi7Var, fqg fqgVar) {
        wi7Var.getClass();
        fqgVar.getClass();
        this.b = wi7Var;
        Object a = fqgVar.a("FANTASY_COMPETITION_EXTRA");
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.c = (ev6) a;
        Object a2 = fqgVar.a("FANTASY_LEAGUE_EXTRA");
        if (a2 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.d = (j67) a2;
        this.e = e.f(new q57(false));
        g62 g = ml4.g(0, 7, null);
        this.f = g;
        this.g = f5p.J(g);
    }
}
