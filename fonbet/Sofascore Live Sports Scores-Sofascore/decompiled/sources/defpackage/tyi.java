package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.TeamPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.AmericanFootballPlayerSeasonStatistics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ltyi;", "Lltk;", "syi", "ryi", "qyi", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class tyi extends ltk {
    public final j0j b;
    public final int c;
    public final String d;
    public final yzc e;
    public final yzc f;
    public final yzc g;
    public final yzc h;
    public final yzc i;
    public final yzc j;
    public ArrayList k;
    public final ryi l;
    public ryi m;
    public nk2 n;
    public int o;

    public tyi(j0j j0jVar, fqg fqgVar) {
        j0jVar.getClass();
        fqgVar.getClass();
        this.b = j0jVar;
        Integer num = (Integer) fqgVar.a("teamID");
        this.c = num != null ? num.intValue() : 0;
        String str = (String) fqgVar.a(SearchResponseKt.SPORT_ENTITY);
        this.d = str == null ? Sports.AMERICAN_FOOTBALL : str;
        yzc yzcVar = new yzc();
        this.e = yzcVar;
        this.f = yzcVar;
        yzc yzcVar2 = new yzc();
        this.g = yzcVar2;
        this.h = yzcVar2;
        yzc yzcVar3 = new yzc();
        this.i = yzcVar3;
        this.j = yzcVar3;
        ryi ryiVar = new ryi(yt.c, lre.c, oei.d);
        this.l = ryiVar;
        this.m = ryiVar;
        this.o = 1;
    }

    public final ArrayList f(List list) {
        ryi ryiVar = this.m;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            TeamPlayerSeasonStatistics teamPlayerSeasonStatistics = (TeamPlayerSeasonStatistics) obj;
            List list2 = ryiVar.a.b;
            if (list2 == null || Intrinsics.c(Boolean.valueOf(CollectionsKt.R(list2, teamPlayerSeasonStatistics.getPlayer().getPosition())), Boolean.TRUE)) {
                if (!ryiVar.b.b || teamPlayerSeasonStatistics.getPlayedEnough()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x000f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(List list) {
        ArrayList f = f(list);
        kp5 kp5Var = qt.l;
        ArrayList arrayList = new ArrayList();
        for (Object obj : kp5Var) {
            qt qtVar = (qt) obj;
            if (!f.isEmpty()) {
                Iterator it = f.iterator();
                while (true) {
                    if (it.hasNext()) {
                        TeamPlayerSeasonStatistics teamPlayerSeasonStatistics = (TeamPlayerSeasonStatistics) it.next();
                        List g = qtVar.g();
                        int i = 0;
                        if (g == null || !g.isEmpty()) {
                            Iterator it2 = g.iterator();
                            while (it2.hasNext()) {
                                Function1 g2 = ((lk2) it2.next()).g();
                                AbstractPlayerSeasonStatistics statistics = teamPlayerSeasonStatistics.getStatistics();
                                statistics.getClass();
                                if (((Number) g2.invoke((AmericanFootballPlayerSeasonStatistics) statistics)).doubleValue() != 0.0d && (i = i + 1) < 0) {
                                    b.p();
                                    throw null;
                                }
                            }
                        }
                        if (i >= 2) {
                            arrayList.add(obj);
                            break;
                        }
                    }
                }
            }
        }
        this.g.j(arrayList);
    }
}
