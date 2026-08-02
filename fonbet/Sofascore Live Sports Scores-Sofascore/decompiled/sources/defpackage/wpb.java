package defpackage;

import com.sofascore.model.fantasy.FantasyPlayerFixture;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.CountrySport;
import com.sofascore.model.newNetwork.LegPP;
import com.sofascore.model.newNetwork.MonthlyUniqueTournamentItem;
import com.sofascore.model.newNetwork.PlayerCharacteristic;
import com.sofascore.model.newNetwork.PlayerHistoricalRating;
import com.sofascore.model.newNetwork.PowerRankingsGraphData;
import com.sofascore.model.newNetwork.PredictedEvent;
import com.sofascore.model.newNetwork.SetPP;
import com.sofascore.model.newNetwork.mediaposts.PersonalizedMediaPost;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseTopPlayersStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.TopPlayersStatisticsItem;
import com.sofascore.model.profile.PlayerSubscription;
import com.sofascore.model.profile.TeamSubscription;
import com.sofascore.model.profile.UniqueTournamentSubscription;
import com.sofascore.results.dialog.SettingsItem;
import java.util.Comparator;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wpb implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ wpb(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        switch (this.a) {
            case 0:
                return Integer.valueOf(((mp6) obj).h.ordinal()).compareTo(Integer.valueOf(((mp6) obj2).h.ordinal()));
            case 1:
                urb urbVar = (urb) obj2;
                ((hod) ((urb) obj)).getClass();
                int i2 = 3;
                try {
                    Class.forName("android.app.Application", false, hod.class.getClassLoader());
                    i = 8;
                } catch (Exception unused) {
                    i = 3;
                }
                ((hod) urbVar).getClass();
                try {
                    Class.forName("android.app.Application", false, hod.class.getClassLoader());
                    i2 = 8;
                } catch (Exception unused2) {
                }
                return i - i2;
            case 2:
                Set set = t4c.c;
                return Integer.valueOf(CollectionsKt.b0(set, ((s4c) obj).a)).compareTo(Integer.valueOf(CollectionsKt.b0(set, ((s4c) obj2).a)));
            case 3:
                Set set2 = t4c.d;
                return Integer.valueOf(CollectionsKt.b0(set2, ((s4c) obj).a)).compareTo(Integer.valueOf(CollectionsKt.b0(set2, ((s4c) obj2).a)));
            case 4:
                Set set3 = t4c.e;
                return Integer.valueOf(CollectionsKt.b0(set3, ((s4c) obj).a)).compareTo(Integer.valueOf(CollectionsKt.b0(set3, ((s4c) obj2).a)));
            case 5:
                Set set4 = t4c.f;
                return Integer.valueOf(CollectionsKt.b0(set4, ((s4c) obj).a)).compareTo(Integer.valueOf(CollectionsKt.b0(set4, ((s4c) obj2).a)));
            case 6:
                return o93.b((Comparable) hz8.K().getOrDefault(((Event) obj).getStatusType(), Integer.MAX_VALUE), (Comparable) hz8.K().getOrDefault(((Event) obj2).getStatusType(), Integer.MAX_VALUE));
            case 7:
                return Integer.valueOf(((PlayerHistoricalRating) obj).getStartTimestamp()).compareTo(Integer.valueOf(((PlayerHistoricalRating) obj2).getStartTimestamp()));
            case 8:
                return Long.valueOf(((PersonalizedMediaPost) obj2).getCreatedAtTimestamp()).compareTo(Long.valueOf(((PersonalizedMediaPost) obj).getCreatedAtTimestamp()));
            case 9:
                return o93.b(((MonthlyUniqueTournamentItem) obj).getDate(), ((MonthlyUniqueTournamentItem) obj2).getDate());
            case 10:
                return Integer.valueOf(((CountrySport) obj).getPosition()).compareTo(Integer.valueOf(((CountrySport) obj2).getPosition()));
            case 11:
                return Integer.valueOf(((l9e) obj2).a).compareTo(Integer.valueOf(((l9e) obj).a));
            case 12:
                return Long.valueOf(((FantasyPlayerFixture) obj).getEventStartTimestamp()).compareTo(Long.valueOf(((FantasyPlayerFixture) obj2).getEventStartTimestamp()));
            case 13:
                Double d = ((mte) obj2).c;
                Double valueOf = Double.valueOf(d != null ? d.doubleValue() : 0.0d);
                Double d2 = ((mte) obj).c;
                return valueOf.compareTo(Double.valueOf(d2 != null ? d2.doubleValue() : 0.0d));
            case 14:
                return o93.b(((mte) obj2).c, ((mte) obj).c);
            case 15:
                return Double.valueOf(yid.k(((BaseTopPlayersStatisticsItem) ((TopPlayersStatisticsItem) ((Pair) obj2).a).getStatistics()).getRating())).compareTo(Double.valueOf(yid.k(((BaseTopPlayersStatisticsItem) ((TopPlayersStatisticsItem) ((Pair) obj).a).getStatistics()).getRating())));
            case 16:
                return Integer.valueOf(((PlayerCharacteristic) obj).getRank()).compareTo(Integer.valueOf(((PlayerCharacteristic) obj2).getRank()));
            case 17:
                return Integer.valueOf(((PlayerCharacteristic) obj).getRank()).compareTo(Integer.valueOf(((PlayerCharacteristic) obj2).getRank()));
            case 18:
                return Integer.valueOf(((SetPP) obj2).getSet()).compareTo(Integer.valueOf(((SetPP) obj).getSet()));
            case 19:
                return Integer.valueOf(((SetPP) obj).getSet()).compareTo(Integer.valueOf(((SetPP) obj2).getSet()));
            case 20:
                return Integer.valueOf(((LegPP) obj2).getLeg()).compareTo(Integer.valueOf(((LegPP) obj).getLeg()));
            case 21:
                return Integer.valueOf(((j1f) obj).a()).compareTo(Integer.valueOf(((j1f) obj2).a()));
            case 22:
                return Integer.valueOf(((PowerRankingsGraphData) obj).getRound()).compareTo(Integer.valueOf(((PowerRankingsGraphData) obj2).getRound()));
            case 23:
                return Boolean.valueOf(!Intrinsics.c(((SettingsItem) obj).a, "qa")).compareTo(Boolean.valueOf(!Intrinsics.c(((SettingsItem) obj2).a, "qa")));
            case 24:
                return ((rvh) obj).b - ((rvh) obj2).b;
            case 25:
                long j = -1;
                Long valueOf2 = Long.valueOf(obj2 instanceof PlayerSubscription ? ((PlayerSubscription) obj2).getUserCount() : obj2 instanceof TeamSubscription ? ((TeamSubscription) obj2).getUserCount() : -1L);
                if (obj instanceof PlayerSubscription) {
                    j = ((PlayerSubscription) obj).getUserCount();
                } else if (obj instanceof TeamSubscription) {
                    j = ((TeamSubscription) obj).getUserCount();
                }
                return valueOf2.compareTo(Long.valueOf(j));
            case 26:
                return Long.valueOf(((TeamSubscription) obj2).getUserCount()).compareTo(Long.valueOf(((TeamSubscription) obj).getUserCount()));
            case 27:
                return Long.valueOf(((UniqueTournamentSubscription) obj2).getUserCount()).compareTo(Long.valueOf(((UniqueTournamentSubscription) obj).getUserCount()));
            case 28:
                return Long.valueOf(((PredictedEvent) obj).getStartDateTimestamp()).compareTo(Long.valueOf(((PredictedEvent) obj2).getStartDateTimestamp()));
            default:
                return Long.valueOf(((PredictedEvent) obj2).getStartDateTimestamp()).compareTo(Long.valueOf(((PredictedEvent) obj).getStartDateTimestamp()));
        }
    }
}
