package defpackage;

import android.view.View;
import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.model.mvvm.model.Batsman;
import com.sofascore.model.mvvm.model.PinnedTournament;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.mvvm.model.StandingsTableRow;
import com.sofascore.model.network.response.BasketballPlayerEventStatistics;
import com.sofascore.model.newNetwork.AffiliateBanner;
import com.sofascore.model.newNetwork.FeaturedPlayer;
import com.sofascore.model.newNetwork.MonthlyUniqueTournamentItem;
import com.sofascore.model.profile.ContributionStatus;
import java.util.Comparator;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class y73 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ y73(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int m;
        int m2;
        int i = Integer.MIN_VALUE;
        int i2 = 1;
        switch (this.a) {
            case 0:
                return Integer.valueOf(((e93) ((Map.Entry) obj).getKey()).ordinal()).compareTo(Integer.valueOf(((e93) ((Map.Entry) obj2).getKey()).ordinal()));
            case 1:
                return Integer.valueOf(((e93) ((Map.Entry) obj).getKey()).ordinal()).compareTo(Integer.valueOf(((e93) ((Map.Entry) obj2).getKey()).ordinal()));
            case 2:
                return Integer.valueOf(((e93) ((Map.Entry) obj).getKey()).ordinal()).compareTo(Integer.valueOf(((e93) ((Map.Entry) obj2).getKey()).ordinal()));
            case 3:
                return Integer.valueOf(((e93) ((Map.Entry) obj).getKey()).ordinal()).compareTo(Integer.valueOf(((e93) ((Map.Entry) obj2).getKey()).ordinal()));
            case 4:
                return Integer.valueOf(((e93) ((Map.Entry) obj).getKey()).ordinal()).compareTo(Integer.valueOf(((e93) ((Map.Entry) obj2).getKey()).ordinal()));
            case 5:
                return Integer.valueOf(((PinnedTournament) obj).getOrderIndex()).compareTo(Integer.valueOf(((PinnedTournament) obj2).getOrderIndex()));
            case 6:
                wyf wyfVar = (wyf) obj2;
                EventSuggest.IncidentSuggest incidentSuggest = wyfVar.a;
                EventSuggest.IncidentSuggest incidentSuggest2 = wyfVar.a;
                if (incidentSuggest.getTime() != null || incidentSuggest2.getAddedTime() != null) {
                    m = yid.m(incidentSuggest2.getAddedTime()) + yid.m(incidentSuggest2.getTime()) + (yid.m(incidentSuggest2.getTime()) > 45 ? 16 : 0);
                } else {
                    if (!(incidentSuggest2 instanceof EventSuggest.IncidentSuggest.CardSuggest)) {
                        if (incidentSuggest2 instanceof EventSuggest.IncidentSuggest.GoalSuggest) {
                            m = Integer.MAX_VALUE;
                        }
                        zzl.b();
                        return 0;
                    }
                    m = Integer.MIN_VALUE;
                }
                Integer valueOf = Integer.valueOf(m);
                wyf wyfVar2 = (wyf) obj;
                EventSuggest.IncidentSuggest incidentSuggest3 = wyfVar2.a;
                EventSuggest.IncidentSuggest incidentSuggest4 = wyfVar2.a;
                if (incidentSuggest3.getTime() != null || incidentSuggest4.getAddedTime() != null) {
                    i = yid.m(incidentSuggest4.getAddedTime()) + yid.m(incidentSuggest4.getTime()) + (yid.m(incidentSuggest4.getTime()) <= 45 ? 0 : 16);
                } else if (!(incidentSuggest4 instanceof EventSuggest.IncidentSuggest.CardSuggest)) {
                    if (incidentSuggest4 instanceof EventSuggest.IncidentSuggest.GoalSuggest) {
                        i = Integer.MAX_VALUE;
                    }
                    zzl.b();
                    return 0;
                }
                return valueOf.compareTo(Integer.valueOf(i));
            case 7:
                EventSuggest.IncidentSuggest incidentSuggest5 = (EventSuggest.IncidentSuggest) obj2;
                if (incidentSuggest5.getTime() != null || incidentSuggest5.getAddedTime() != null) {
                    m2 = yid.m(incidentSuggest5.getAddedTime()) + yid.m(incidentSuggest5.getTime()) + (yid.m(incidentSuggest5.getTime()) > 45 ? 16 : 0);
                } else {
                    if (!(incidentSuggest5 instanceof EventSuggest.IncidentSuggest.CardSuggest)) {
                        if (incidentSuggest5 instanceof EventSuggest.IncidentSuggest.GoalSuggest) {
                            m2 = Integer.MAX_VALUE;
                        }
                        zzl.b();
                        return 0;
                    }
                    m2 = Integer.MIN_VALUE;
                }
                Integer valueOf2 = Integer.valueOf(m2);
                EventSuggest.IncidentSuggest incidentSuggest6 = (EventSuggest.IncidentSuggest) obj;
                if (incidentSuggest6.getTime() != null || incidentSuggest6.getAddedTime() != null) {
                    i = yid.m(incidentSuggest6.getAddedTime()) + yid.m(incidentSuggest6.getTime()) + (yid.m(incidentSuggest6.getTime()) <= 45 ? 0 : 16);
                } else if (!(incidentSuggest6 instanceof EventSuggest.IncidentSuggest.CardSuggest)) {
                    if (incidentSuggest6 instanceof EventSuggest.IncidentSuggest.GoalSuggest) {
                        i = Integer.MAX_VALUE;
                    }
                    zzl.b();
                    return 0;
                }
                return valueOf2.compareTo(Integer.valueOf(i));
            case 8:
                EventSuggest.IncidentSuggest.GoalSuggest goalSuggest = (EventSuggest.IncidentSuggest.GoalSuggest) obj;
                EventSuggest.IncidentSuggest.GoalSuggest goalSuggest2 = (EventSuggest.IncidentSuggest.GoalSuggest) obj2;
                return Integer.valueOf(goalSuggest.getAwayScoreSuggest() + goalSuggest.getHomeScoreSuggest()).compareTo(Integer.valueOf(goalSuggest2.getAwayScoreSuggest() + goalSuggest2.getHomeScoreSuggest()));
            case 9:
                return Integer.valueOf(((ContributionStatus) obj).ordinal()).compareTo(Integer.valueOf(((ContributionStatus) obj2).ordinal()));
            case 10:
                WeakHashMap weakHashMap = bsk.a;
                float z = ((View) obj).getZ();
                float z2 = ((View) obj2).getZ();
                if (z > z2) {
                    return -1;
                }
                return z < z2 ? 1 : 0;
            case 11:
                return Boolean.valueOf(((nz3) obj).a).compareTo(Boolean.valueOf(((nz3) obj2).a));
            case 12:
                return o93.b(((MonthlyUniqueTournamentItem) obj).getDate(), ((MonthlyUniqueTournamentItem) obj2).getDate());
            case 13:
                wma wmaVar = (wma) obj;
                wma wmaVar2 = (wma) obj2;
                int d = Intrinsics.d(wmaVar.p, wmaVar2.p);
                return d != 0 ? d : Intrinsics.d(wmaVar.hashCode(), wmaVar2.hashCode());
            case 14:
                return Integer.valueOf(((AffiliateBanner) obj).getId()).compareTo(Integer.valueOf(((AffiliateBanner) obj2).getId()));
            case 15:
                String str = (String) obj;
                Integer valueOf3 = Integer.valueOf(StringsKt.J(str, "api.sofascore", false) ? 0 : StringsKt.J(str, "master.dev", false) ? 1 : Integer.MAX_VALUE);
                String str2 = (String) obj2;
                if (StringsKt.J(str2, "api.sofascore", false)) {
                    i2 = 0;
                } else if (!StringsKt.J(str2, "master.dev", false)) {
                    i2 = Integer.MAX_VALUE;
                }
                return valueOf3.compareTo(Integer.valueOf(i2));
            case 16:
                return ((h25) obj).a - ((h25) obj2).a;
            case 17:
                return o93.b(((PlayerData) obj).getPlayer().getName(), ((PlayerData) obj2).getPlayer().getName());
            case 18:
                return o93.b(((i22) obj).x, ((i22) obj2).x);
            case 19:
                Integer num = ((i22) obj).w;
                if (num == null) {
                    num = r6;
                }
                Integer num2 = ((i22) obj2).w;
                return num.compareTo(num2 != null ? num2 : Integer.MAX_VALUE);
            case 20:
                return o93.b(((i22) obj).x, ((i22) obj2).x);
            case 21:
                return o93.b(((i22) obj).w, ((i22) obj2).w);
            case 22:
                return o93.b(((PlayerData) obj).getGameStar(), ((PlayerData) obj2).getGameStar());
            case 23:
                ey5 ey5Var = ey5.a;
                return Integer.valueOf(ey5.c((String) ((Map.Entry) obj).getKey())).compareTo(Integer.valueOf(ey5.c((String) ((Map.Entry) obj2).getKey())));
            case 24:
                ey5 ey5Var2 = ey5.a;
                return Integer.valueOf(ey5.c((String) ((Map.Entry) obj).getKey())).compareTo(Integer.valueOf(ey5.c((String) ((Map.Entry) obj2).getKey())));
            case 25:
                return Integer.valueOf(((StandingsTableRow) obj).getPosition()).compareTo(Integer.valueOf(((StandingsTableRow) obj2).getPosition()));
            case 26:
                FeaturedPlayer featuredPlayer = (FeaturedPlayer) obj2;
                BasketballPlayerEventStatistics basketballStatistics = featuredPlayer.getBasketballStatistics();
                int m3 = yid.m(basketballStatistics != null ? basketballStatistics.getPoints() : null);
                BasketballPlayerEventStatistics basketballStatistics2 = featuredPlayer.getBasketballStatistics();
                int m4 = yid.m(basketballStatistics2 != null ? basketballStatistics2.getAssists() : null) + m3;
                BasketballPlayerEventStatistics basketballStatistics3 = featuredPlayer.getBasketballStatistics();
                Integer valueOf4 = Integer.valueOf(yid.m(basketballStatistics3 != null ? basketballStatistics3.getRebounds() : null) + m4);
                FeaturedPlayer featuredPlayer2 = (FeaturedPlayer) obj;
                BasketballPlayerEventStatistics basketballStatistics4 = featuredPlayer2.getBasketballStatistics();
                int m5 = yid.m(basketballStatistics4 != null ? basketballStatistics4.getPoints() : null);
                BasketballPlayerEventStatistics basketballStatistics5 = featuredPlayer2.getBasketballStatistics();
                int m6 = yid.m(basketballStatistics5 != null ? basketballStatistics5.getAssists() : null) + m5;
                BasketballPlayerEventStatistics basketballStatistics6 = featuredPlayer2.getBasketballStatistics();
                return valueOf4.compareTo(Integer.valueOf(yid.m(basketballStatistics6 != null ? basketballStatistics6.getRebounds() : null) + m6));
            case 27:
                return Long.valueOf(rik.w((c9g) obj2)).compareTo(Long.valueOf(rik.w((c9g) obj)));
            case 28:
                return Boolean.valueOf(!((r5c) obj).a.getKeyHighlight()).compareTo(Boolean.valueOf(!((r5c) obj2).a.getKeyHighlight()));
            default:
                return o93.b(((Batsman) obj).getFowOver(), ((Batsman) obj2).getFowOver());
        }
    }
}
