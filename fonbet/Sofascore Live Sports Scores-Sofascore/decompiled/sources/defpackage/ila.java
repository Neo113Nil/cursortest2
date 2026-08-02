package defpackage;

import androidx.compose.runtime.e;
import com.inmobi.media.Lb;
import com.sofascore.model.crowdsourcing.LatestCrowdsourcingSuggestResponse;
import com.sofascore.model.mvvm.model.City;
import com.sofascore.model.mvvm.model.Lineups;
import com.sofascore.model.mvvm.model.Round;
import com.sofascore.model.mvvm.model.Stadium;
import com.sofascore.model.mvvm.model.Venue;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.model.newNetwork.LeagueDraftPickItem;
import com.sofascore.model.newNetwork.LegPP;
import com.sofascore.model.newNetwork.LiveCategoriesResponse;
import com.sofascore.model.newNetwork.LiveStreamHighlightItem;
import com.sofascore.model.newNetwork.PowerRankingRound;
import com.sofascore.model.newNetwork.UniqueTournamentGroup;
import com.sofascore.model.newNetwork.topperformance.response.LeagueGoatPlayerVotesResponse;
import com.sofascore.model.profile.LeagueEditorsResponse;
import com.sofascore.results.R;
import com.sofascore.results.league.fragment.topStats.TopPlayerCategoryUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ila implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ila(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _childSerializers$_anonymous_$03;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_7;
        KSerializer _childSerializers$_anonymous_8;
        KSerializer _childSerializers$_anonymous_9;
        switch (this.a) {
            case 0:
                _childSerializers$_anonymous_ = LatestCrowdsourcingSuggestResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 1:
                return Lb.a();
            case 2:
                _childSerializers$_anonymous_2 = LeagueDraftPickItem._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 3:
                _childSerializers$_anonymous_$0 = LeagueDraftPickItem._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 4:
                _childSerializers$_anonymous_3 = LeagueEditorsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 5:
                _childSerializers$_anonymous_$02 = LeagueEditorsResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 6:
                return new iya(new UniqueTournamentGroup(-1, ""));
            case 7:
                return new hya(new Venue(-1, "", null, new City(""), new Stadium("", null), null, null, null, null, null, null, null, null, 4096, null));
            case 8:
                _childSerializers$_anonymous_4 = LeagueGoatPlayerVotesResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 9:
                return e.c(-1);
            case 10:
                return Unit.a;
            case 11:
                return Unit.a;
            case 12:
                tc3 tc3Var = null;
                String str = "All-time";
                vt2 vt2Var = new vt2(new rxa(0, true), str, false, null, tc3Var, null, null, 252);
                String str2 = "2022";
                Object[] objArr = null == true ? 1 : 0;
                vt2 vt2Var2 = new vt2(new rxa(1, false), str2, false, tc3Var, null == true ? 1 : 0, objArr, null, 252);
                String str3 = "2018";
                Object[] objArr2 = null == true ? 1 : 0;
                return new sxa(1, l6g.K(vt2Var, vt2Var2, new vt2(new rxa(2, false), str3, false, null == true ? 1 : 0, objArr2, null == true ? 1 : 0, null, 252), new vt2(new rxa(3, false), "2014", false, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null, 252)), l6g.K(new TopPlayerCategoryUiModel("Goals", l6g.K(new vnj(new unj(1, "Kylian Mbappe", "Forward", null, new umj("goal", "8"), null, true, null)), new vnj(new unj(2, "Lionel Messi", "Forward", null, new umj("goal", "8"), null, true, null)), new vnj(new unj(3, "Oliver Giroud", "Forward", null, new umj("goal", "8"), null, true, null))), null, null, null), new TopPlayerCategoryUiModel("Assists", l6g.K(new vnj(new unj(4, "Kylian Mbappe", "Forward", null, new umj("goal", "8"), null, true, null)), new vnj(new unj(5, "Lionel Messi", "Forward", null, new umj("goal", "8"), null, true, null)), new vnj(new unj(6, "Oliver Giroud", "Forward", null, new umj("goal", "8"), null, true, null))), null, null, null), new TopPlayerCategoryUiModel("Assists2", l6g.K(new vnj(new unj(4, "Kylian Mbappe", "Forward", null, new umj("goal", "8"), null, true, null)), new vnj(new unj(5, "Lionel Messi", "Forward", null, new umj("goal", "8"), null, true, null)), new vnj(new unj(6, "Oliver Giroud", "Forward", null, new umj("goal", "8"), null, true, null))), null, null, null)), (rxa) null, new ec9("Argentina", (xjc) xjc.h.getValue()), 24);
            case 13:
                return e.f(Boolean.FALSE);
            case 14:
                return new PowerRankingRound(new Round(1, "Round 1", null, null, null), 1);
            case 15:
                return l6g.K(new u2f(1, "Manchester City", 1, 100, false, 2), new u2f(2, "Real Madrid", 2, 95, false, null), new u2f(3, "Bayern Munich", 3, 88, false, -1), new u2f(4, "FC Barcelona", 4, 82, true, 0));
            case 16:
                mqi mqiVar = aza.a;
                return new unb(new bza(l6g.K((PowerRankingRound) mqiVar.getValue()), (PowerRankingRound) mqiVar.getValue(), (b7) aza.b.getValue(), false));
            case 17:
                mqi mqiVar2 = aza.a;
                return new unb(new bza(l6g.K((PowerRankingRound) mqiVar2.getValue()), (PowerRankingRound) mqiVar2.getValue(), (b7) aza.b.getValue(), true));
            case 18:
                _childSerializers$_anonymous_5 = LegPP._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 19:
                return Unit.a;
            case 20:
                _childSerializers$_anonymous_6 = Lineups._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 21:
                _childSerializers$_anonymous_$03 = Lineups._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            case 22:
                _childSerializers$_anonymous_$1 = Lineups._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 23:
                return new n8b(new fk2(R.drawable.ic_card_yellow, false), Integer.valueOf(R.drawable.ic_swap_lineups), new y9b(new x9b(Double.valueOf(0.0d), new t9b(R.string.xG, "1.01"), new t9b(R.string.xGOT, "1.02")), null, null, null, null, true));
            case 24:
                Integer valueOf = Integer.valueOf(R.color.n_lv_1);
                return new p9b(1, "Lionel Messi", "10", true, l6g.K(new f9b(R.drawable.ic_goal_incidents, 2, valueOf), new f9b(R.drawable.ic_football_assist_16, 3, valueOf), new f9b(R.drawable.ic_autogoal_16, 1, Integer.valueOf(R.color.error)), new f9b(R.drawable.ic_card_yellow_16)), l6g.K(new o9b("59'", "Out: Cristiano Ronaldo", true, false), new o9b("89'", "In: Karim Benzema", false, true)), new k9b(true, Double.valueOf(8.2d), Double.valueOf(7.1d), false, null, 1, "27", "6km", "27e", "192cm", "12", "us"), null, new n9b(R.drawable.ic_cross, R.color.alert, new m9k("Doubtful"), new m9k("Hamstring"), true), null, false, 3712);
            case 25:
                _childSerializers$_anonymous_7 = LineupsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 26:
                return Unit.a;
            case 27:
                _childSerializers$_anonymous_8 = LiveCategoriesResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
            case 28:
                _childSerializers$_anonymous_9 = LiveStreamHighlightItem._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_9;
            default:
                return new qw8(new ud3(28));
        }
    }
}
