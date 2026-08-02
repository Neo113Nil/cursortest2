package defpackage;

import android.app.Application;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgk7;", "Lod7;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class gk7 extends od7 {
    public final jof A;
    public final fdi B;
    public final FantasyRoundPlayerUiModel u;
    public final String v;
    public final int w;
    public final int x;
    public final boolean y;
    public final fdi z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk7(wi7 wi7Var, fqg fqgVar, Application application) {
        super(wi7Var, application);
        Object value;
        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel;
        rz6 rz6Var;
        fqgVar.getClass();
        wi7Var.getClass();
        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2 = (FantasyRoundPlayerUiModel) fqgVar.a(SearchResponseKt.PLAYER_ENTITY);
        this.u = fantasyRoundPlayerUiModel2;
        String str = (String) fqgVar.a("position");
        rq3 rq3Var = null;
        str = (str == null || StringsKt.R(str)) ? null : str;
        this.v = str;
        Object a = fqgVar.a("competitionId");
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.w = ((Number) a).intValue();
        Object a2 = fqgVar.a("roundId");
        if (a2 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.x = ((Number) a2).intValue();
        int i = 1;
        this.y = fantasyRoundPlayerUiModel2 == null && str == null;
        fdi a3 = gdi.a(fantasyRoundPlayerUiModel2 != null ? new q67(fantasyRoundPlayerUiModel2, rlh.b, true) : null);
        this.z = a3;
        this.A = un0.u(a3);
        this.B = gdi.a(null);
        fdi fdiVar = this.q;
        do {
            value = fdiVar.getValue();
            fantasyRoundPlayerUiModel = this.u;
        } while (!fdiVar.k(value, (fantasyRoundPlayerUiModel == null || (rz6Var = fantasyRoundPlayerUiModel.b) == null) ? this.v : rz6Var.b));
        if (this.u != null) {
            xw3.L(un0.z(this), null, null, new f54(this, wi7Var, rq3Var, 4), 3);
            fcp.m0(dy0.r(new wj0(this.l, 3), new wj0(this.k, 3), this.B, new lr3(this, rq3Var, i)), un0.z(this));
        }
    }

    @Override // defpackage.od7
    /* renamed from: l, reason: from getter */
    public final boolean getY() {
        return this.y;
    }

    @Override // defpackage.od7
    /* renamed from: m, reason: from getter */
    public final int getW() {
        return this.w;
    }

    @Override // defpackage.od7
    /* renamed from: n, reason: from getter */
    public final int getX() {
        return this.x;
    }
}
