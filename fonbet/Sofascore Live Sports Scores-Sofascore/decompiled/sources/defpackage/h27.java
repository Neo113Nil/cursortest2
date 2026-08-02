package defpackage;

import android.app.Application;
import androidx.compose.runtime.e;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lh27;", "Ld50;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h27 extends d50 {
    public final wi7 c;
    public final ev6 d;
    public final j67 e;
    public final e1d f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h27(wi7 wi7Var, fqg fqgVar, Application application) {
        super(application);
        wi7Var.getClass();
        fqgVar.getClass();
        this.c = wi7Var;
        Object a = fqgVar.a("FANTASY_COMPETITION_EXTRA");
        rq3 rq3Var = null;
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        ev6 ev6Var = (ev6) a;
        this.d = ev6Var;
        Object a2 = fqgVar.a("FANTASY_LEAGUE_EXTRA");
        if (a2 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        j67 j67Var = (j67) a2;
        this.e = j67Var;
        this.f = e.f(new f27(true, null, j67Var, ev6Var));
        xw3.L(un0.z(this), null, null, new g27(this, rq3Var, 0), 3);
    }
}
