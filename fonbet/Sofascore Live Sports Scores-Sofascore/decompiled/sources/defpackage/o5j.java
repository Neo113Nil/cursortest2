package defpackage;

import com.sofascore.model.newNetwork.newRankings.Ranking;
import com.sofascore.model.newNetwork.newRankings.RankingRow;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class o5j {
    public static final o5j a = new o5j();

    public static String a(c6j c6jVar, RankingRow rankingRow) {
        if (rankingRow != null) {
            int ordinal = c6jVar.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                Double points = rankingRow.getPoints();
                if (points != null) {
                    return String.valueOf((int) points.doubleValue());
                }
            } else {
                if (ordinal != 2 && ordinal != 3) {
                    zzl.b();
                    return null;
                }
                Double points2 = rankingRow.getPoints();
                if (points2 != null) {
                    return String.format(dla.d(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(points2.doubleValue())}, 1));
                }
            }
        }
        return null;
    }

    public static q5j b(List list, List list2, int i, int i2) {
        Object obj;
        Object obj2;
        List<RankingRow> rankingRows;
        List<RankingRow> rankingRows2;
        list.getClass();
        list2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<E> it = c6j.j.iterator();
        while (true) {
            RankingRow rankingRow = null;
            if (!it.hasNext()) {
                break;
            }
            c6j c6jVar = (c6j) it.next();
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((Ranking) obj).getRankingType().getId() == c6jVar.d) {
                    break;
                }
            }
            Ranking ranking = (Ranking) obj;
            RankingRow rankingRow2 = (ranking == null || (rankingRows2 = ranking.getRankingRows()) == null) ? null : (RankingRow) CollectionsKt.firstOrNull(rankingRows2);
            Iterator it3 = list2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it3.next();
                if (((Ranking) obj2).getRankingType().getId() == c6jVar.d) {
                    break;
                }
            }
            Ranking ranking2 = (Ranking) obj2;
            if (ranking2 != null && (rankingRows = ranking2.getRankingRows()) != null) {
                rankingRow = (RankingRow) CollectionsKt.firstOrNull(rankingRows);
            }
            linkedHashMap.put(c6jVar, new Pair(rankingRow2, rankingRow));
        }
        xbb b = a.b();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            c6j c6jVar2 = (c6j) entry.getKey();
            Pair pair = (Pair) entry.getValue();
            RankingRow rankingRow3 = (RankingRow) pair.a;
            RankingRow rankingRow4 = (RankingRow) pair.b;
            if (rankingRow3 != null || rankingRow4 != null) {
                b.add(new p5j(c6jVar2, rankingRow3 != null ? yid.p(rankingRow3.getPosition()) : null, a(c6jVar2, rankingRow3), rankingRow4 != null ? yid.p(rankingRow4.getPosition()) : null, a(c6jVar2, rankingRow4)));
            }
        }
        xbb a2 = a.a(b);
        if (a2.isEmpty()) {
            a2 = null;
        }
        if (a2 != null) {
            return new q5j(i, i2, l6g.W(a2));
        }
        return null;
    }
}
