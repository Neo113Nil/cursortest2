package defpackage;

import com.google.android.gms.internal.ads.zzwl;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.Odds;
import com.sofascore.model.network.response.bettingtips.TrendingOddsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentAchievements;
import java.util.Comparator;
import java.util.HashMap;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class o5i implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o5i(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                int compare = ((laf) obj3).compare(obj, obj2);
                return compare != 0 ? compare : Long.valueOf(((r5c) obj2).a.getCreatedAtTimestamp()).compareTo(Long.valueOf(((r5c) obj).a.getCreatedAtTimestamp()));
            case 1:
                h7i h7iVar = (h7i) obj3;
                return Boolean.valueOf(CollectionsKt.R(h7iVar.j, h7i.k((e7i) obj2))).compareTo(Boolean.valueOf(CollectionsKt.R(h7iVar.j, h7i.k((e7i) obj))));
            case 2:
                int compare2 = ((q6i) obj3).compare(obj, obj2);
                return compare2 != 0 ? compare2 : o93.b(((Category) obj).getName(), ((Category) obj2).getName());
            case 3:
                int compare3 = ((q6i) obj3).compare(obj, obj2);
                if (compare3 != 0) {
                    return compare3;
                }
                UniqueTournament uniqueTournament = ((UniqueTournamentAchievements) obj2).getUniqueTournament();
                Long valueOf = uniqueTournament != null ? Long.valueOf(uniqueTournament.getUserCount()) : null;
                UniqueTournament uniqueTournament2 = ((UniqueTournamentAchievements) obj).getUniqueTournament();
                return o93.b(valueOf, uniqueTournament2 != null ? Long.valueOf(uniqueTournament2.getUserCount()) : null);
            case 4:
                Event event = (Event) obj;
                TrendingOddsResponse trendingOddsResponse = (TrendingOddsResponse) obj3;
                Odds odds = trendingOddsResponse.getWinningOddsMap().get(Integer.valueOf(event.getId()));
                int expected = odds != null ? odds.getExpected() : 0;
                Odds odds2 = trendingOddsResponse.getWinningOddsMap().get(Integer.valueOf(event.getId()));
                Integer valueOf2 = Integer.valueOf(expected - (odds2 != null ? odds2.getActual() : 0));
                Event event2 = (Event) obj2;
                Odds odds3 = trendingOddsResponse.getWinningOddsMap().get(Integer.valueOf(event2.getId()));
                int expected2 = odds3 != null ? odds3.getExpected() : 0;
                Odds odds4 = trendingOddsResponse.getWinningOddsMap().get(Integer.valueOf(event2.getId()));
                return valueOf2.compareTo(Integer.valueOf(expected2 - (odds4 != null ? odds4.getActual() : 0)));
            default:
                HashMap hashMap = zzwl.a;
                uap uapVar = (uap) obj3;
                return uapVar.zza(obj2) - uapVar.zza(obj);
        }
    }
}
