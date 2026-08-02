package defpackage;

import android.content.Context;
import com.sofascore.model.Money;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.network.response.EventStatisticsGroup;
import com.sofascore.model.network.response.EventStatisticsItem;
import com.sofascore.model.network.response.EventStatisticsPeriod;
import com.sofascore.model.network.response.EventStatisticsResponse;
import com.sofascore.model.network.response.FootballPlayerEventStatistics;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.model.network.response.TeamAverageRatingVersion;
import com.sofascore.results.R;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fab {
    public static final fab a = new fab();

    public static double a(List list) {
        Double rating;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FootballPlayerEventStatistics footballStatistics = ((PlayerData) it.next()).getFootballStatistics();
            Double d = null;
            if (footballStatistics != null && (rating = footballStatistics.getRating()) != null && rating.doubleValue() > 0.0d) {
                d = rating;
            }
            if (d != null) {
                arrayList.add(d);
            }
        }
        return CollectionsKt.O(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        if (r4 > 0.0d) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
    
        if (r4 > 0.0d) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(LineupsResponse lineupsResponse, EventStatisticsResponse eventStatisticsResponse, Double d, Double d2, TeamAverageRatingVersion teamAverageRatingVersion) {
        EventStatisticsItem eventStatisticsItem;
        Double d3;
        Double d4;
        double doubleValue;
        List<EventStatisticsPeriod> statistics;
        Object obj;
        List<EventStatisticsGroup> groups;
        Object obj2;
        lineupsResponse.getClass();
        if (eventStatisticsResponse != null && (statistics = eventStatisticsResponse.getStatistics()) != null) {
            Iterator<T> it = statistics.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (Intrinsics.c(((EventStatisticsPeriod) obj).getPeriod(), "ALL")) {
                        break;
                    }
                }
            }
            EventStatisticsPeriod eventStatisticsPeriod = (EventStatisticsPeriod) obj;
            if (eventStatisticsPeriod != null && (groups = eventStatisticsPeriod.getGroups()) != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it2 = groups.iterator();
                while (it2.hasNext()) {
                    o13.v(((EventStatisticsGroup) it2.next()).getStatisticsItems(), arrayList);
                }
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it3.next();
                        if (Intrinsics.c(((EventStatisticsItem) obj2).getName(), "Average rating")) {
                            break;
                        }
                    }
                }
                eventStatisticsItem = (EventStatisticsItem) obj2;
                if (eventStatisticsItem != null) {
                    double homeValue$default = EventStatisticsItem.getHomeValue$default(eventStatisticsItem, null, 1, null);
                    d3 = Double.valueOf(homeValue$default);
                }
                d3 = null;
                if (eventStatisticsItem != null) {
                    double awayValue$default = EventStatisticsItem.getAwayValue$default(eventStatisticsItem, null, 1, null);
                    d4 = Double.valueOf(awayValue$default);
                }
                d4 = null;
                doubleValue = d3 == null ? d3.doubleValue() : a(LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null).getPlayers());
                double doubleValue2 = d4 == null ? d4.doubleValue() : a(LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null).getPlayers());
                if (doubleValue <= 0.0d && doubleValue2 > 0.0d) {
                    lineupsResponse.setFirstTeamAverageRating(doubleValue);
                    lineupsResponse.setSecondTeamAverageRating(doubleValue2);
                    if (d3 == null || d4 == null) {
                        return;
                    }
                    lineupsResponse.setAvgRatingVersion(eventStatisticsItem.getAvgRatingVersion());
                    return;
                }
                if (d == null || d2 != null) {
                    lineupsResponse.setPregameRatingShown(true);
                    if (d != null) {
                        lineupsResponse.setFirstTeamAverageRating(d.doubleValue());
                    }
                    if (d2 != null) {
                        lineupsResponse.setSecondTeamAverageRating(d2.doubleValue());
                    }
                    if (teamAverageRatingVersion == null) {
                        teamAverageRatingVersion = TeamAverageRatingVersion.ORIGINAL;
                    }
                    lineupsResponse.setAvgRatingVersion(teamAverageRatingVersion);
                }
                return;
            }
        }
        eventStatisticsItem = null;
        if (eventStatisticsItem != null) {
        }
        d3 = null;
        if (eventStatisticsItem != null) {
        }
        d4 = null;
        if (d3 == null) {
        }
        if (d4 == null) {
        }
        if (doubleValue <= 0.0d) {
        }
        if (d == null) {
        }
        lineupsResponse.setPregameRatingShown(true);
        if (d != null) {
        }
        if (d2 != null) {
        }
        if (teamAverageRatingVersion == null) {
        }
        lineupsResponse.setAvgRatingVersion(teamAverageRatingVersion);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static k06 c(Context context, List list, long j, Map map, String str, j06 j06Var) {
        double d;
        String quantityString;
        String str2;
        String w;
        String str3;
        int i;
        String str4;
        PlayerData playerData;
        Float f;
        Double kilometersCovered;
        Money proposedMarketValueRaw;
        Integer height;
        list.getClass();
        Iterator it = list.iterator();
        double d2 = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        long j2 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        String str5 = null;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        boolean z = false;
        while (it.hasNext()) {
            PlayerData playerData2 = (PlayerData) it.next();
            Iterator it2 = it;
            if (Intrinsics.c(playerData2.getSubstitute(), Boolean.TRUE)) {
                playerData = playerData2;
            } else {
                Long dateOfBirthTimestamp = playerData2.getPlayer().getDateOfBirthTimestamp();
                if (dateOfBirthTimestamp != null) {
                    if (dateOfBirthTimestamp.longValue() <= 0) {
                        dateOfBirthTimestamp = null;
                    }
                    if (dateOfBirthTimestamp != null) {
                        playerData = playerData2;
                        i4++;
                        d4 = ((int) ChronoUnit.YEARS.between(vxd.o(Instant.ofEpochMilli(dateOfBirthTimestamp.longValue() * 1000)), vxd.o(Instant.ofEpochMilli(1000 * j)))) + d4;
                        proposedMarketValueRaw = playerData.getPlayer().getProposedMarketValueRaw();
                        if (proposedMarketValueRaw == null) {
                            Set set = o84.a;
                            Long b = o84.b(context, proposedMarketValueRaw, 0L);
                            if (b != null) {
                                j2 = b.longValue() + j2;
                                i2++;
                                if (str5 == null) {
                                    str5 = o84.d(context);
                                }
                            } else {
                                z = true;
                            }
                        }
                        height = playerData.getPlayer().getHeight();
                        if (height != null) {
                            if (height.intValue() <= 0) {
                                height = null;
                            }
                            if (height != null) {
                                i3 += height.intValue();
                                i5++;
                            }
                        }
                        i5 = i5;
                    }
                }
                playerData = playerData2;
                proposedMarketValueRaw = playerData.getPlayer().getProposedMarketValueRaw();
                if (proposedMarketValueRaw == null) {
                }
                height = playerData.getPlayer().getHeight();
                if (height != null) {
                }
                i5 = i5;
            }
            FootballPlayerEventStatistics footballStatistics = playerData.getFootballStatistics();
            if (footballStatistics != null && (kilometersCovered = footballStatistics.getKilometersCovered()) != null) {
                i6++;
                d2 = kilometersCovered.doubleValue() + d2;
            }
            if (map != null && (f = (Float) map.get(Integer.valueOf(playerData.getPlayer().getId()))) != null) {
                d3 += f.floatValue();
                i7++;
            }
            it = it2;
        }
        int i8 = i5;
        int i9 = i6;
        if (i4 < 7) {
            d = d2;
            quantityString = null;
        } else {
            d = d2;
            double a2 = wzb.a((d4 / i4) * 10.0d) / 10.0d;
            quantityString = context.getResources().getQuantityString(R.plurals.years_short, (int) ((a2 * 10.0d) % 10.0d), String.format(dla.d(), "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(a2)}, 1)));
        }
        if (z || i2 < 7 || str5 == null) {
            str2 = null;
        } else {
            Set set2 = o84.a;
            str2 = o84.c(context, j2, false, 28);
        }
        if (i8 < 7) {
            str3 = null;
        } else {
            w = v7a.w(context, (i3 / i8) / 100.0d, (r4 & 4) == 0, false);
            str3 = w;
        }
        if (i7 == 0 || str == null) {
            i = 7;
            str4 = null;
        } else {
            str4 = ph0.a0(new String[]{StatusKt.STATUS_NOT_STARTED, StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED}).contains(str) ? context.getString(R.string.n_points, String.format(dla.d(), "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d3)}, 1))) : context.getString(R.string.fantasy_points_short, String.valueOf(wzb.a(d3)));
            i = 7;
        }
        return new k06(quantityString, str2, str3, str4, i9 < i ? null : context.getString(R.string.kilometers_format, yid.c("%.1f", Double.valueOf(d))), j06Var);
    }
}
