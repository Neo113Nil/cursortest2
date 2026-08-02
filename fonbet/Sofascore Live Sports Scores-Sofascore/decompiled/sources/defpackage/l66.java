package defpackage;

import android.app.Application;
import android.content.Context;
import android.text.format.DateFormat;
import com.sofascore.model.Country;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.SubTeam;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.OddsProvider;
import com.sofascore.model.odds.ProviderOdds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Ll66;", "Lynb;", "Lzpf;", "Le66;", "Lpld;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l66 extends ynb {
    public final ddi l;
    public final umd m;
    public final amd n;
    public final List o;
    public OddsCountryProvider p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l66(Application application, ddi ddiVar, umd umdVar, amd amdVar) {
        super(application, tnb.a);
        ddiVar.getClass();
        umdVar.getClass();
        amdVar.getClass();
        this.l = ddiVar;
        this.m = umdVar;
        this.n = amdVar;
        yea yeaVar = j58.a;
        Country e = dv3.e();
        this.o = j58.f(e != null ? e.getIso2Alpha() : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v1, types: [ypf] */
    /* JADX WARN: Type inference failed for: r8v1, types: [dqf] */
    public final gv9 t(OddsCountryProvider oddsCountryProvider, List list) {
        TeamSides teamSides;
        Event event;
        Iterator it;
        Iterator it2;
        Iterator it3;
        cqf bqfVar;
        cqf bqfVar2;
        TeamSides teamSides2;
        Tournament tournament;
        ArrayList arrayList = new ArrayList();
        Iterator it4 = list.iterator();
        while (true) {
            teamSides = null;
            if (!it4.hasNext()) {
                break;
            }
            Object next = it4.next();
            Event event2 = ((ProviderOdds) next).getEvent();
            if (!CollectionsKt.R(this.o, event2 != null ? o3a.F(event2.getTournament()) : null)) {
                arrayList.add(next);
            }
        }
        l66 l66Var = this;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            Object next2 = it5.next();
            Event event3 = ((ProviderOdds) next2).getEvent();
            Integer valueOf = (event3 == null || (tournament = event3.getTournament()) == null) ? null : Integer.valueOf(tournament.getId());
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            ((List) obj).add(next2);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it6 = linkedHashMap.entrySet().iterator();
        while (it6.hasNext()) {
            Map.Entry entry = (Map.Entry) it6.next();
            Integer num = (Integer) entry.getKey();
            List list2 = (List) entry.getValue();
            if (num == null || (event = ((ProviderOdds) CollectionsKt.Y(list2)).getEvent()) == null) {
                it = it6;
                teamSides2 = teamSides;
            } else {
                Tournament tournament2 = event.getTournament();
                ArrayList arrayList3 = new ArrayList();
                Iterator it7 = list2.iterator();
                while (it7.hasNext()) {
                    ProviderOdds providerOdds = (ProviderOdds) it7.next();
                    Event event4 = providerOdds.getEvent();
                    if (event4 == null) {
                        it2 = it6;
                        it3 = it7;
                    } else {
                        Team homeTeam$default = Event.getHomeTeam$default(event4, teamSides, 1, teamSides);
                        Team awayTeam$default = Event.getAwayTeam$default(event4, teamSides, 1, teamSides);
                        SubTeam subTeam1 = homeTeam$default.getSubTeam1();
                        SubTeam subTeam2 = homeTeam$default.getSubTeam2();
                        SubTeam subTeam12 = awayTeam$default.getSubTeam1();
                        SubTeam subTeam22 = awayTeam$default.getSubTeam2();
                        boolean z = (subTeam1 == null || subTeam2 == null || subTeam12 == null || subTeam22 == null) ? false : true;
                        if (z) {
                            it2 = it6;
                            int id = subTeam1.getId();
                            it3 = it7;
                            String D = tba.D(subTeam1, l66Var.i());
                            if (D == null) {
                                D = "";
                            }
                            int id2 = subTeam2.getId();
                            String D2 = tba.D(subTeam2, i());
                            if (D2 == null) {
                                D2 = "";
                            }
                            bqfVar = new aqf(id, D, id2, D2);
                        } else {
                            it2 = it6;
                            it3 = it7;
                            int id3 = homeTeam$default.getId();
                            String A = tba.A(i(), homeTeam$default);
                            if (A == null) {
                                A = "";
                            }
                            bqfVar = new bqf(id3, A);
                        }
                        if (z) {
                            int id4 = subTeam12.getId();
                            String D3 = tba.D(subTeam12, i());
                            if (D3 == null) {
                                D3 = "";
                            }
                            int id5 = subTeam22.getId();
                            String D4 = tba.D(subTeam22, i());
                            if (D4 == null) {
                                D4 = "";
                            }
                            bqfVar2 = new aqf(id4, D3, id5, D4);
                        } else {
                            int id6 = awayTeam$default.getId();
                            String A2 = tba.A(i(), awayTeam$default);
                            if (A2 == null) {
                                A2 = "";
                            }
                            bqfVar2 = new bqf(id6, A2);
                        }
                        cqf cqfVar = bqfVar2;
                        int id7 = event4.getId();
                        Context i = i();
                        long startTimestamp = event4.getStartTimestamp();
                        String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(i) ? "Hm" : "hm");
                        bestPattern.getClass();
                        teamSides = new ypf(id7, fc6.i(startTimestamp, hk4.a(bestPattern)), fc6.i(event4.getStartTimestamp(), hk4.a(bi4.PATTERN_DMY.d())), ok3.s(event4), bqfVar, cqfVar, egf.a(i(), oddsCountryProvider, providerOdds));
                    }
                    if (teamSides != null) {
                        arrayList3.add(teamSides);
                    }
                    teamSides = null;
                    l66Var = this;
                    it6 = it2;
                    it7 = it3;
                }
                it = it6;
                gv9 W = l6g.W(arrayList3);
                int id8 = tournament2.getId();
                UniqueTournament uniqueTournament = tournament2.getUniqueTournament();
                Integer valueOf2 = uniqueTournament != null ? Integer.valueOf(uniqueTournament.getId()) : null;
                Season season = tournament2.getSeason();
                Integer valueOf3 = season != null ? Integer.valueOf(season.getId()) : null;
                String t = ok3.t(i(), event);
                oddsCountryProvider.getClass();
                OddsProvider provider = oddsCountryProvider.getProvider();
                provider.getClass();
                yld yldVar = new yld(provider.getId(), provider.getColors(), provider.getSlug());
                String defaultBetSlipLink = oddsCountryProvider.getDefaultBetSlipLink();
                if (defaultBetSlipLink == null) {
                    defaultBetSlipLink = oddsCountryProvider.getProvider().getDefaultBetSlipLink();
                }
                teamSides2 = new dqf(id8, valueOf2, valueOf3, t, new old(yldVar, defaultBetSlipLink, oddsCountryProvider.getBranded(), oddsCountryProvider.getOddsOffset(), oddsCountryProvider.getOddsMayDiffer(), oddsCountryProvider.getType(), oddsCountryProvider.getSignupLink()), W);
            }
            if (teamSides2 != null) {
                arrayList2.add(teamSides2);
            }
            teamSides = null;
            l66Var = this;
            it6 = it;
        }
        return l6g.W(arrayList2);
    }
}
