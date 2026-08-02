package defpackage;

import android.app.Application;
import android.content.Context;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.odds.OddsCountryProvider;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo8i;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class o8i extends q8 {
    public final umd e;
    public final amd f;
    public Team g;
    public boolean h;
    public final yzc i;
    public final lec j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8i(Application application, umd umdVar, amd amdVar) {
        super(application);
        umdVar.getClass();
        amdVar.getClass();
        this.e = umdVar;
        this.f = amdVar;
        this.h = true;
        yzc yzcVar = new yzc();
        this.i = yzcVar;
        this.j = waa.w(yzcVar);
    }

    public final boolean k() {
        Context i = i();
        amd amdVar = this.f;
        amdVar.getClass();
        yea yeaVar = j58.a;
        return fn0.B("show_motorsport_odds") && xld.g(i) && rld.t(i) && amdVar.c().size() == 1;
    }

    public final void l(Team team) {
        OddsCountryProvider oddsCountryProvider;
        this.g = team;
        boolean z = false;
        if (team != null && team.getType() == 1) {
            z = true;
        }
        this.h = z;
        rq3 rq3Var = null;
        if (!k()) {
            this.i.j(null);
            return;
        }
        Team team2 = this.g;
        if (team2 == null || (oddsCountryProvider = (OddsCountryProvider) CollectionsKt.firstOrNull(this.f.c())) == null) {
            return;
        }
        xw3.L(un0.z(this), z45.a, null, new h4i(this, team2, oddsCountryProvider, rq3Var, 5), 2);
    }
}
