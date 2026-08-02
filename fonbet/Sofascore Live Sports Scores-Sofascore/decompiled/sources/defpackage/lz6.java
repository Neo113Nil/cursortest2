package defpackage;

import android.app.Application;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llz6;", "Ljz6;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class lz6 extends jz6 {
    public final FantasyRoundPlayerUiModel j;
    public final int k;
    public final FantasyCompetitionType l;
    public final int m;
    public final boolean n;
    public final boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz6(Application application, fqg fqgVar, wi7 wi7Var, s96 s96Var, tj7 tj7Var) {
        super(application, wi7Var, s96Var, tj7Var);
        fqgVar.getClass();
        wi7Var.getClass();
        s96Var.getClass();
        tj7Var.getClass();
        Object a = fqgVar.a(SearchResponseKt.PLAYER_ENTITY);
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.j = (FantasyRoundPlayerUiModel) a;
        Object a2 = fqgVar.a("competitionId");
        if (a2 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.k = ((Number) a2).intValue();
        Object a3 = fqgVar.a("competitionType");
        if (a3 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.l = (FantasyCompetitionType) a3;
        Object a4 = fqgVar.a("roundId");
        if (a4 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.m = ((Number) a4).intValue();
        Object a5 = fqgVar.a("tripleCaptain");
        if (a5 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.n = ((Boolean) a5).booleanValue();
        Boolean bool = (Boolean) fqgVar.a("assetsRestricted");
        this.o = bool != null ? bool.booleanValue() : false;
    }
}
