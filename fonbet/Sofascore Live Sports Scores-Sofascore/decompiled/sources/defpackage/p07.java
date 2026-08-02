package defpackage;

import android.app.Application;
import androidx.compose.runtime.e;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lp07;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class p07 extends q8 {
    public final wi7 e;
    public final tj7 f;
    public final int g;
    public final FantasyCompetitionType h;
    public final int i;
    public final e1d j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p07(wi7 wi7Var, tj7 tj7Var, fqg fqgVar, Application application) {
        super(application);
        fqgVar.getClass();
        wi7Var.getClass();
        tj7Var.getClass();
        this.e = wi7Var;
        this.f = tj7Var;
        Object a = fqgVar.a("competitionId");
        rq3 rq3Var = null;
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.g = ((Number) a).intValue();
        Object a2 = fqgVar.a("competitionType");
        if (a2 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.h = (FantasyCompetitionType) a2;
        Object a3 = fqgVar.a("roundId");
        if (a3 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.i = ((Number) a3).intValue();
        Boolean bool = (Boolean) fqgVar.a("assetsRestricted");
        this.j = e.f(new o07(null, null, true, bool != null ? bool.booleanValue() : false));
        xw3.L(un0.z(this), null, null, new hs6(this, rq3Var, 8), 3);
    }
}
