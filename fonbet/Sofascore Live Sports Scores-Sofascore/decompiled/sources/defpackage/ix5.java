package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.sofascore.model.database.VoteType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.model.network.response.VotesResponse;
import com.sofascore.model.newNetwork.EsportsGamesResponse;
import com.sofascore.model.newNetwork.EventBestPlayersResponse;
import com.sofascore.model.newNetwork.EventBestPlayersSummaryResponse;
import com.sofascore.model.newNetwork.EventGraphResponse;
import com.sofascore.model.newNetwork.EventIncidentsResponse;
import com.sofascore.model.newNetwork.FanPlayerOfTheMatchResponse;
import com.sofascore.model.newNetwork.PregameFormResponse;
import com.sofascore.model.newNetwork.SeasonInfo;
import com.sofascore.model.newNetwork.TvCountryChannelsResponse;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.results.event.details.EventDetailsFragment;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ix5 implements xd, op8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventDetailsFragment b;

    public /* synthetic */ ix5(EventDetailsFragment eventDetailsFragment, int i) {
        this.a = i;
        this.b = eventDetailsFragment;
    }

    @Override // defpackage.op8
    public void b(Bundle bundle, String str) {
        ly5 ly5Var;
        int i = bundle.getInt("RESULT_VOTED_PLAYER_ID");
        dz5 E = this.b.E();
        yzc yzcVar = E.w;
        iy5 iy5Var = (iy5) yzcVar.d();
        if (iy5Var == null || (ly5Var = iy5Var.w) == null || ly5Var.b != null) {
            return;
        }
        Integer valueOf = Integer.valueOf(i);
        FanPlayerOfTheMatchResponse fanPlayerOfTheMatchResponse = ly5Var.a;
        fanPlayerOfTheMatchResponse.getClass();
        ly5 ly5Var2 = new ly5(fanPlayerOfTheMatchResponse, valueOf);
        vte G = waa.G(E.i(), iy5Var.v, fanPlayerOfTheMatchResponse, Integer.valueOf(i));
        EventIncidentsResponse eventIncidentsResponse = iy5Var.a;
        List list = iy5Var.b;
        List list2 = iy5Var.c;
        OddsCountryProvider oddsCountryProvider = iy5Var.d;
        jy5 jy5Var = iy5Var.e;
        VotesResponse votesResponse = iy5Var.f;
        EventGraphResponse eventGraphResponse = iy5Var.g;
        EventGraphResponse eventGraphResponse2 = iy5Var.h;
        v04 v04Var = iy5Var.i;
        TvCountryChannelsResponse tvCountryChannelsResponse = iy5Var.j;
        ky5 ky5Var = iy5Var.k;
        EventBestPlayersResponse eventBestPlayersResponse = iy5Var.l;
        PregameFormResponse pregameFormResponse = iy5Var.m;
        EsportsGamesResponse esportsGamesResponse = iy5Var.n;
        LineupsResponse lineupsResponse = iy5Var.o;
        SeasonInfo seasonInfo = iy5Var.p;
        n6j n6jVar = iy5Var.q;
        my5 my5Var = iy5Var.r;
        my5 my5Var2 = iy5Var.s;
        Boolean bool = iy5Var.t;
        hy5 hy5Var = iy5Var.u;
        EventBestPlayersSummaryResponse eventBestPlayersSummaryResponse = iy5Var.v;
        boolean z = iy5Var.y;
        List list3 = iy5Var.z;
        List list4 = iy5Var.A;
        List list5 = iy5Var.B;
        boolean z2 = iy5Var.C;
        q5j q5jVar = iy5Var.D;
        gy5 gy5Var = iy5Var.E;
        List list6 = iy5Var.F;
        List list7 = iy5Var.G;
        ny5 ny5Var = iy5Var.H;
        gv9 gv9Var = iy5Var.I;
        en1 en1Var = iy5Var.J;
        zsi zsiVar = iy5Var.K;
        gv9 gv9Var2 = iy5Var.L;
        boolean z3 = iy5Var.M;
        mn1 mn1Var = iy5Var.N;
        gv9 gv9Var3 = iy5Var.O;
        Map map = iy5Var.P;
        list.getClass();
        list2.getClass();
        jy5Var.getClass();
        my5Var.getClass();
        my5Var2.getClass();
        hy5Var.getClass();
        list4.getClass();
        yzcVar.k(new iy5(eventIncidentsResponse, list, list2, oddsCountryProvider, jy5Var, votesResponse, eventGraphResponse, eventGraphResponse2, v04Var, tvCountryChannelsResponse, ky5Var, eventBestPlayersResponse, pregameFormResponse, esportsGamesResponse, lineupsResponse, seasonInfo, n6jVar, my5Var, my5Var2, bool, hy5Var, eventBestPlayersSummaryResponse, ly5Var2, G, z, list3, list4, list5, z2, q5jVar, gy5Var, list6, list7, ny5Var, gv9Var, en1Var, zsiVar, gv9Var2, z3, mn1Var, gv9Var3, map));
    }

    @Override // defpackage.xd
    public void onActivityResult(Object obj) {
        Bundle extras;
        iy5 iy5Var;
        VotesResponse votesResponse;
        VotesResponse votesResponse2;
        int i = this.a;
        Integer num = null;
        EventDetailsFragment eventDetailsFragment = this.b;
        ActivityResult activityResult = (ActivityResult) obj;
        switch (i) {
            case 0:
                activityResult.getClass();
                if (activityResult.a == -1) {
                    ji5 ji5Var = (ji5) eventDetailsFragment.T.getValue();
                    if (ji5Var != null) {
                        ji5Var.l();
                    }
                    Intent intent = activityResult.b;
                    if (intent != null && (extras = intent.getExtras()) != null) {
                        num = Integer.valueOf(extras.getInt("login_action"));
                    }
                    if (num == null || num.intValue() != 1) {
                        if (num != null && num.intValue() == 2) {
                            eventDetailsFragment.P();
                            break;
                        }
                    } else {
                        eventDetailsFragment.O();
                        break;
                    }
                }
                break;
            case 1:
            default:
                activityResult.getClass();
                if (activityResult.a == -1) {
                    iy5 iy5Var2 = (iy5) eventDetailsFragment.E().x.d();
                    if (iy5Var2 != null && (votesResponse2 = iy5Var2.f) != null) {
                        dz5 E = eventDetailsFragment.E();
                        Event F = eventDetailsFragment.F();
                        E.f.j(km5.a);
                        xw3.L(un0.z(E), null, null, new kv7((e4f) E, F, false, (VoteType) null, votesResponse2, (rq3) null), 3);
                    }
                    eventDetailsFragment.u();
                    break;
                }
                break;
            case 2:
                activityResult.getClass();
                if (activityResult.a == -1 && (iy5Var = (iy5) eventDetailsFragment.E().x.d()) != null && (votesResponse = iy5Var.f) != null) {
                    jqc jqcVar = (jqc) eventDetailsFragment.C.getValue();
                    xw3.L(un0.z(jqcVar), null, null, new iqc(jqcVar, eventDetailsFragment.F(), true, votesResponse, null), 3);
                    break;
                }
                break;
        }
    }
}
