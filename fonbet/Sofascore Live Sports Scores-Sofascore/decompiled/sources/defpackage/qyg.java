package defpackage;

import com.sofascore.model.mvvm.model.Season;
import com.sofascore.results.player.statistics.compare.model.ComparisonSeasonInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class qyg {
    public static final String a = Season.SubSeasonType.OVERALL.getLabel();

    public static final y83 a(ComparisonSeasonInfo comparisonSeasonInfo, gv9 gv9Var) {
        Object obj;
        Object obj2;
        gv9 gv9Var2;
        boolean z;
        Iterator<E> it = gv9Var.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (b((m93) obj2, comparisonSeasonInfo)) {
                break;
            }
        }
        m93 m93Var = (m93) obj2;
        if (m93Var == null || (gv9Var2 = m93Var.c) == null) {
            return null;
        }
        Iterator<E> it2 = gv9Var2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            ComparisonSeasonInfo comparisonSeasonInfo2 = ((y83) next).c;
            if ((comparisonSeasonInfo2 instanceof ComparisonSeasonInfo.TennisYearInfo) && (comparisonSeasonInfo instanceof ComparisonSeasonInfo.TennisYearInfo)) {
                z = Intrinsics.c(((ComparisonSeasonInfo.TennisYearInfo) comparisonSeasonInfo2).a, ((ComparisonSeasonInfo.TennisYearInfo) comparisonSeasonInfo).a);
            } else {
                if ((comparisonSeasonInfo2 instanceof ComparisonSeasonInfo.UniqueTournamentSeasonInfo) && (comparisonSeasonInfo instanceof ComparisonSeasonInfo.UniqueTournamentSeasonInfo)) {
                    ComparisonSeasonInfo.UniqueTournamentSeasonInfo uniqueTournamentSeasonInfo = (ComparisonSeasonInfo.UniqueTournamentSeasonInfo) comparisonSeasonInfo2;
                    ComparisonSeasonInfo.UniqueTournamentSeasonInfo uniqueTournamentSeasonInfo2 = (ComparisonSeasonInfo.UniqueTournamentSeasonInfo) comparisonSeasonInfo;
                    if (uniqueTournamentSeasonInfo.a == uniqueTournamentSeasonInfo2.a && uniqueTournamentSeasonInfo.b == uniqueTournamentSeasonInfo2.b) {
                        z = true;
                    }
                }
                z = false;
            }
            if (z) {
                obj = next;
                break;
            }
        }
        return (y83) obj;
    }

    public static final boolean b(m93 m93Var, ComparisonSeasonInfo comparisonSeasonInfo) {
        if (comparisonSeasonInfo instanceof ComparisonSeasonInfo.TennisYearInfo) {
            gv9 gv9Var = m93Var.c;
            if (gv9Var == null || !gv9Var.isEmpty()) {
                Iterator<E> it = gv9Var.iterator();
                while (it.hasNext()) {
                    if (((y83) it.next()).c instanceof ComparisonSeasonInfo.TennisYearInfo) {
                        return true;
                    }
                }
            }
        } else {
            if (!(comparisonSeasonInfo instanceof ComparisonSeasonInfo.UniqueTournamentSeasonInfo)) {
                zzl.b();
                return false;
            }
            Integer num = m93Var.a;
            int i = ((ComparisonSeasonInfo.UniqueTournamentSeasonInfo) comparisonSeasonInfo).a;
            if (num != null && num.intValue() == i) {
                return true;
            }
        }
        return false;
    }

    public static final String c(String str, List list) {
        if (str != null) {
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.c(((Season.SubSeasonType) it.next()).getLabel(), str)) {
                        break;
                    }
                }
            }
            str = null;
            if (str != null) {
                return str;
            }
        }
        Season.SubSeasonType subSeasonType = (Season.SubSeasonType) CollectionsKt.firstOrNull(list);
        return subSeasonType != null ? subSeasonType.getLabel() : a;
    }
}
