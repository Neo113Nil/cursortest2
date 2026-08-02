package defpackage;

import android.content.Context;
import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.model.fantasy.FantasyLeagueType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.BasketballPlayerEventStatistics;
import com.sofascore.model.newNetwork.FeaturedPlayer;
import com.sofascore.model.newNetwork.RefereeStatisticsItem;
import com.sofascore.model.newNetwork.mediaposts.PersonalizedMediaPost;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.feed.MediaShortsVideoDialog;
import com.sofascore.results.feed.compose.model.ShortVideoFeedCardModel;
import com.sofascore.results.league.fragment.events.LeagueEventsFragment;
import com.sofascore.results.player.statistics.career.PlayerCareerStatisticsFragment;
import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cp implements Comparator, iub {
    public final /* synthetic */ int a;
    public final Object b;

    public cp(d8b[] d8bVarArr) {
        this.a = 19;
        this.b = d8bVarArr;
        if (d8bVarArr.length > 1) {
            Arrays.sort(d8bVarArr, this);
        }
    }

    public static String c(int i, int i2, String str) {
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(i2);
        sb.append(charAt);
        int i3 = i2 + 1;
        if (d(charAt)) {
            while (i3 < i) {
                char charAt2 = str.charAt(i3);
                if (!d(charAt2)) {
                    break;
                }
                sb.append(charAt2);
                i3++;
            }
        } else {
            while (i3 < i) {
                char charAt3 = str.charAt(i3);
                if (d(charAt3)) {
                    break;
                }
                sb.append(charAt3);
                i3++;
            }
        }
        return sb.toString();
    }

    public static boolean d(char c) {
        return c >= '0' && c <= '9';
    }

    @Override // defpackage.iub
    public String a(wcd wcdVar) {
        d8b d8bVar;
        d8b[] d8bVarArr = (d8b[]) this.b;
        int length = d8bVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                d8bVar = null;
                break;
            }
            d8bVar = d8bVarArr[i];
            if (wcdVar.a.d < d8bVar.b) {
                break;
            }
            i++;
        }
        if (d8bVar == null) {
            d8bVar = (d8b) ph0.M(d8bVarArr);
        }
        return d8bVar.a(wcdVar);
    }

    public int b(String str, String str2) {
        if (str == null || str2 == null) {
            return 0;
        }
        int length = str.length();
        int length2 = str2.length();
        int i = 0;
        int i2 = 0;
        while (i < length && i2 < length2) {
            String c = c(length, i, str);
            i += c.length();
            String c2 = c(length2, i2, str2);
            i2 += c2.length();
            if (!d(c.charAt(0)) || !d(c2.charAt(0))) {
                return Collator.getInstance((Locale) this.b).compare(c.toLowerCase(), c2.toLowerCase());
            }
            int length3 = c.length();
            int length4 = length3 - c2.length();
            if (length4 == 0) {
                for (int i3 = 0; i3 < length3; i3++) {
                    length4 = c.charAt(i3) - c2.charAt(i3);
                    if (length4 != 0) {
                        return length4;
                    }
                }
            }
            if (length4 != 0) {
                return length4;
            }
        }
        return length - length2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable;
        Integer num;
        Integer points;
        Integer num2;
        Integer assists;
        Integer num3;
        Integer rebounds;
        switch (this.a) {
            case 0:
                return b((String) obj, (String) obj2);
            case 1:
                int compare = ((qe8) this.b).compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                Comparable name = obj instanceof Player ? ((Player) obj).getName() : obj instanceof Team ? ((Team) obj).getName() : obj instanceof UniqueTournament ? ((UniqueTournament) obj).getName() : 0;
                if (obj2 instanceof Player) {
                    comparable = ((Player) obj2).getName();
                } else if (obj2 instanceof Team) {
                    comparable = ((Team) obj2).getName();
                } else {
                    comparable = 0;
                    if (obj2 instanceof UniqueTournament) {
                        comparable = ((UniqueTournament) obj2).getName();
                    }
                }
                return o93.b(name, comparable);
            case 2:
                int compare2 = ((qe8) this.b).compare(obj, obj2);
                return compare2 != 0 ? compare2 : Integer.valueOf(((ol1) obj2).b.size()).compareTo(Integer.valueOf(((ol1) obj).b.size()));
            case 3:
                int compare3 = ((w53) this.b).compare(obj, obj2);
                return compare3 != 0 ? compare3 : Integer.valueOf(x53.a((xkk) obj)).compareTo(Integer.valueOf(x53.a((xkk) obj2)));
            case 4:
                int compare4 = ((mr3) this.b).compare(obj, obj2);
                if (compare4 != 0) {
                    return compare4;
                }
                EventSuggest.IncidentSuggest incidentSuggest = (EventSuggest.IncidentSuggest) obj2;
                EventSuggest.IncidentSuggest.GoalSuggest goalSuggest = incidentSuggest instanceof EventSuggest.IncidentSuggest.GoalSuggest ? (EventSuggest.IncidentSuggest.GoalSuggest) incidentSuggest : null;
                Integer valueOf = goalSuggest != null ? Integer.valueOf(goalSuggest.getAwayScoreSuggest() + goalSuggest.getHomeScoreSuggest()) : 0;
                EventSuggest.IncidentSuggest incidentSuggest2 = (EventSuggest.IncidentSuggest) obj;
                EventSuggest.IncidentSuggest.GoalSuggest goalSuggest2 = incidentSuggest2 instanceof EventSuggest.IncidentSuggest.GoalSuggest ? (EventSuggest.IncidentSuggest.GoalSuggest) incidentSuggest2 : null;
                return valueOf.compareTo(goalSuggest2 != null ? Integer.valueOf(goalSuggest2.getAwayScoreSuggest() + goalSuggest2.getHomeScoreSuggest()) : 0);
            case 5:
                yt5 yt5Var = (yt5) this.b;
                return ((Comparable) yt5Var.invoke(obj2)).compareTo((Comparable) yt5Var.invoke(obj));
            case 6:
                int compare5 = ((cp) this.b).compare(obj, obj2);
                return compare5 != 0 ? compare5 : o93.b(((ku5) obj).b, ((ku5) obj2).b);
            case 7:
                Integer num4 = 0;
                int compare6 = ((y73) this.b).compare(obj, obj2);
                if (compare6 != 0) {
                    return compare6;
                }
                BasketballPlayerEventStatistics basketballStatistics = ((FeaturedPlayer) obj2).getBasketballStatistics();
                if (basketballStatistics == null || (num = basketballStatistics.getPoints()) == null) {
                    num = num4;
                }
                BasketballPlayerEventStatistics basketballStatistics2 = ((FeaturedPlayer) obj).getBasketballStatistics();
                if (basketballStatistics2 != null && (points = basketballStatistics2.getPoints()) != null) {
                    num4 = points;
                }
                return num.compareTo(num4);
            case 8:
                Integer num5 = 0;
                int compare7 = ((cp) this.b).compare(obj, obj2);
                if (compare7 != 0) {
                    return compare7;
                }
                BasketballPlayerEventStatistics basketballStatistics3 = ((FeaturedPlayer) obj2).getBasketballStatistics();
                if (basketballStatistics3 == null || (num2 = basketballStatistics3.getAssists()) == null) {
                    num2 = num5;
                }
                BasketballPlayerEventStatistics basketballStatistics4 = ((FeaturedPlayer) obj).getBasketballStatistics();
                if (basketballStatistics4 != null && (assists = basketballStatistics4.getAssists()) != null) {
                    num5 = assists;
                }
                return num2.compareTo(num5);
            case 9:
                Integer num6 = 0;
                int compare8 = ((cp) this.b).compare(obj, obj2);
                if (compare8 != 0) {
                    return compare8;
                }
                BasketballPlayerEventStatistics basketballStatistics5 = ((FeaturedPlayer) obj2).getBasketballStatistics();
                if (basketballStatistics5 == null || (num3 = basketballStatistics5.getRebounds()) == null) {
                    num3 = num6;
                }
                BasketballPlayerEventStatistics basketballStatistics6 = ((FeaturedPlayer) obj).getBasketballStatistics();
                if (basketballStatistics6 != null && (rebounds = basketballStatistics6.getRebounds()) != null) {
                    num6 = rebounds;
                }
                return num3.compareTo(num6);
            case 10:
                return ((n93) this.b).compare(((Event) obj).getTournament().getGroupSign(), ((Event) obj2).getTournament().getGroupSign());
            case 11:
                int compare9 = ((y73) this.b).compare(obj, obj2);
                return compare9 != 0 ? compare9 : Long.valueOf(((r5c) obj2).a.getCreatedAtTimestamp()).compareTo(Long.valueOf(((r5c) obj).a.getCreatedAtTimestamp()));
            case 12:
                qfg qfgVar = (qfg) this.b;
                return ((Comparable) qfgVar.invoke(obj)).compareTo((Comparable) qfgVar.invoke(obj2));
            case 13:
                int compare10 = ((v66) this.b).compare(obj, obj2);
                return compare10 != 0 ? compare10 : Integer.valueOf(((FantasyRoundPlayerUiModel) obj).d).compareTo(Integer.valueOf(((FantasyRoundPlayerUiModel) obj2).d));
            case 14:
                Function1 function1 = (Function1) this.b;
                j67 j67Var = (j67) function1.invoke(obj);
                FantasyLeagueType fantasyLeagueType = j67Var != null ? j67Var.j : null;
                j67 j67Var2 = (j67) function1.invoke(obj2);
                return o93.b(fantasyLeagueType, j67Var2 != null ? j67Var2.j : null);
            case 15:
                int compare11 = ((se7) this.b).compare(obj, obj2);
                return compare11 != 0 ? compare11 : Integer.valueOf(((FantasyRoundPlayerUiModel) obj).d).compareTo(Integer.valueOf(((FantasyRoundPlayerUiModel) obj2).d));
            case 16:
                int compare12 = ((se7) this.b).compare(obj, obj2);
                return compare12 != 0 ? compare12 : Integer.valueOf(((FantasyRoundPlayerUiModel) obj).d).compareTo(Integer.valueOf(((FantasyRoundPlayerUiModel) obj2).d));
            case 17:
                int compare13 = ((se7) this.b).compare(obj, obj2);
                return compare13 != 0 ? compare13 : Integer.valueOf(((FantasyRoundPlayerUiModel) obj).d).compareTo(Integer.valueOf(((FantasyRoundPlayerUiModel) obj2).d));
            case 18:
                LeagueEventsFragment leagueEventsFragment = (LeagueEventsFragment) this.b;
                Context requireContext = leagueEventsFragment.requireContext();
                requireContext.getClass();
                String p = tba.p(requireContext, (Team) obj);
                Context requireContext2 = leagueEventsFragment.requireContext();
                requireContext2.getClass();
                return o93.b(p, tba.p(requireContext2, (Team) obj2));
            case 19:
                d8b d8bVar = (d8b) obj;
                d8b d8bVar2 = (d8b) obj2;
                d8bVar.getClass();
                d8bVar2.getClass();
                return d8bVar.a - d8bVar2.a;
            case 20:
                Integer num7 = (Integer) ((xeb) this.b).i.get(Integer.valueOf(((Event) obj).getId()));
                Integer valueOf2 = Integer.valueOf(num7 != null ? num7.intValue() : Integer.MAX_VALUE);
                Integer num8 = (Integer) ((xeb) this.b).i.get(Integer.valueOf(((Event) obj2).getId()));
                return valueOf2.compareTo(Integer.valueOf(num8 != null ? num8.intValue() : Integer.MAX_VALUE));
            case 21:
                int compare14 = ((wpb) this.b).compare(obj, obj2);
                if (compare14 != 0) {
                    return compare14;
                }
                Event event = (Event) obj;
                Long valueOf3 = Long.valueOf(-event.getStartTimestamp());
                if (!ok3.C(event)) {
                    valueOf3 = null;
                }
                if (valueOf3 == null) {
                    valueOf3 = Long.valueOf(event.getStartTimestamp());
                }
                Event event2 = (Event) obj2;
                Long valueOf4 = ok3.C(event2) ? Long.valueOf(-event2.getStartTimestamp()) : null;
                if (valueOf4 == null) {
                    valueOf4 = Long.valueOf(event2.getStartTimestamp());
                }
                return valueOf3.compareTo(valueOf4);
            case 22:
                return ((n93) this.b).compare(((PersonalizedMediaPost) obj2).getFinalScore(), ((PersonalizedMediaPost) obj).getFinalScore());
            case 23:
                String str = ((ShortVideoFeedCardModel) obj).l;
                mqi mqiVar = ((MediaShortsVideoDialog) this.b).w;
                return Integer.valueOf(!Intrinsics.c(str, (String) mqiVar.getValue()) ? 1 : 0).compareTo(Integer.valueOf(!Intrinsics.c(((ShortVideoFeedCardModel) obj2).l, (String) mqiVar.getValue()) ? 1 : 0));
            case 24:
                g0d g0dVar = (g0d) this.b;
                return Float.valueOf(g0dVar.c(((Map.Entry) obj2).getKey())).compareTo(Float.valueOf(g0dVar.c(((Map.Entry) obj).getKey())));
            case 25:
                PlayerCareerStatisticsFragment playerCareerStatisticsFragment = (PlayerCareerStatisticsFragment) this.b;
                Context requireContext3 = playerCareerStatisticsFragment.requireContext();
                requireContext3.getClass();
                String p2 = tba.p(requireContext3, (Team) obj);
                Context requireContext4 = playerCareerStatisticsFragment.requireContext();
                requireContext4.getClass();
                return o93.b(p2, tba.p(requireContext4, (Team) obj2));
            case 26:
                int compare15 = ((laf) this.b).compare(obj, obj2);
                return compare15 != 0 ? compare15 : o93.b(((RefereeStatisticsItem) obj2).getUniqueTournament().getName(), ((RefereeStatisticsItem) obj).getUniqueTournament().getName());
            case 27:
                int compare16 = ((y2f) this.b).compare(obj, obj2);
                return compare16 != 0 ? compare16 : Integer.valueOf(((s3h) obj).f).compareTo(Integer.valueOf(((s3h) obj2).f));
            case 28:
                f7h f7hVar = (f7h) this.b;
                int o = f7hVar.o(obj) - f7hVar.o(obj2);
                return o != 0 ? o : obj.getClass().getName().compareTo(obj2.getClass().getName());
            default:
                int compare17 = ((i31) this.b).compare(obj, obj2);
                if (compare17 != 0) {
                    return compare17;
                }
                Integer position = ((l3i) obj).a.getPosition();
                if (position == null) {
                    position = r0;
                }
                Integer position2 = ((l3i) obj2).a.getPosition();
                return position.compareTo(position2 != null ? position2 : Integer.MAX_VALUE);
        }
    }

    public cp() {
        this.a = 0;
        this.b = Locale.getDefault();
    }

    public /* synthetic */ cp(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
