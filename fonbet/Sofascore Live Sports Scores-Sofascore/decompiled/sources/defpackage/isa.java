package defpackage;

import com.sofascore.model.network.response.FootballPlayerEventStatistics;
import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class isa implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ isa(int i, csa csaVar) {
        this.a = 0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Unit.a;
            case 1:
                ((String) obj).getClass();
                return new q9k(R.string.draft_order);
            case 2:
                ((String) obj).getClass();
                return new q9k(R.string.nba_draft_lottery);
            case 3:
                ((String) obj).getClass();
                return new q9k(R.string.draft_prospects);
            case 4:
                String str = (String) obj;
                str.getClass();
                return new q9k(R.string.draft_year_picks, l6g.K(str));
            case 5:
                String str2 = (String) obj;
                str2.getClass();
                return new q9k(R.string.draft_year_picks, l6g.K(str2));
            case 6:
                jrj jrjVar = (jrj) obj;
                jrjVar.getClass();
                return Integer.valueOf(jrjVar.a);
            case 7:
                bza bzaVar = (bza) obj;
                bzaVar.getClass();
                return bza.a(bzaVar, null, null, false, 767);
            case 8:
                ((String) obj).getClass();
                return new q9k(R.string.all_transactions);
            case 9:
                String str3 = (String) obj;
                str3.getClass();
                return new q9k(R.string.player_traded_from, l6g.K(str3));
            case 10:
                ((String) obj).getClass();
                return new q9k(R.string.player_signed);
            case 11:
                ((String) obj).getClass();
                return new q9k(R.string.player_waived);
            case 12:
                ((String) obj).getClass();
                return new q9k(R.string.player_claimed);
            case 13:
                ((String) obj).getClass();
                return new q9k(R.string.player_released);
            case 14:
                ((String) obj).getClass();
                return new q9k(R.string.contract_expired);
            case 15:
                ((String) obj).getClass();
                return new q9k(R.string.contract_10_days);
            case 16:
                ((String) obj).getClass();
                return new q9k(R.string.contract_10_days_2nd);
            case 17:
                ((String) obj).getClass();
                return new q9k(R.string.retired_player);
            case 18:
                ((Integer) obj).getClass();
                return "transaction_item";
            case 19:
                m4b m4bVar = (m4b) obj;
                m4bVar.getClass();
                Integer valueOf = Integer.valueOf(m4bVar.a);
                y3b y3bVar = m4bVar.b;
                x3b x3bVar = m4bVar.d;
                return new n1k(valueOf, y3bVar, x3bVar != null ? Integer.valueOf(x3bVar.a) : null);
            case 20:
                return m4b.a((m4b) obj, null, null, null, true, 95);
            case 21:
                return m4b.a((m4b) obj, null, null, null, false, 95);
            case 22:
                ava avaVar = (ava) obj;
                avaVar.getClass();
                return Boolean.valueOf(avaVar.i || avaVar.f || avaVar.h);
            case 23:
                return Unit.a;
            case 24:
                return Unit.a;
            case 25:
                return Unit.a;
            case 26:
                FootballPlayerEventStatistics footballPlayerEventStatistics = (FootballPlayerEventStatistics) obj;
                footballPlayerEventStatistics.getClass();
                return footballPlayerEventStatistics.getExpectedGoals();
            case 27:
                FootballPlayerEventStatistics footballPlayerEventStatistics2 = (FootballPlayerEventStatistics) obj;
                footballPlayerEventStatistics2.getClass();
                return Integer.valueOf(yid.m(footballPlayerEventStatistics2.getInterceptionWon()) + yid.m(footballPlayerEventStatistics2.getOutfielderBlock()) + yid.m(footballPlayerEventStatistics2.getTotalClearance()) + yid.m(footballPlayerEventStatistics2.getTotalTackle()));
            case 28:
                FootballPlayerEventStatistics footballPlayerEventStatistics3 = (FootballPlayerEventStatistics) obj;
                footballPlayerEventStatistics3.getClass();
                Integer duelWon = footballPlayerEventStatistics3.getDuelWon();
                return duelWon != null ? duelWon : yid.m(footballPlayerEventStatistics3.getDuelLost()) > 0 ? 0 : null;
            default:
                FootballPlayerEventStatistics footballPlayerEventStatistics4 = (FootballPlayerEventStatistics) obj;
                footballPlayerEventStatistics4.getClass();
                return footballPlayerEventStatistics4.getExpectedGoalsOnTarget();
        }
    }

    public /* synthetic */ isa(int i) {
        this.a = i;
    }
}
