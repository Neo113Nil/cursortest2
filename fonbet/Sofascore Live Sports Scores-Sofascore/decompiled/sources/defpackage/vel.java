package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vel {
    public static final vel a = new vel();
    public static final zdl b;
    public static final Map c;
    public static final gv9 d;
    public static final List e;
    public static final mqi f;
    public static final mqi g;
    public static final joa h;
    public static final joa i;
    public static final List j;

    static {
        zdl zdlVar = new zdl(R.color.color_wc_26_red_edge, R.color.color_wc_26_red_center);
        zdl zdlVar2 = new zdl(R.color.color_wc_26_blue_edge, R.color.color_wc_26_blue_center);
        b = zdlVar2;
        Map h2 = tub.h(new Pair(Incident.CardIncident.CARD_RED, zdlVar), new Pair("blue", zdlVar2), new Pair(Incident.CardIncident.CARD_YELLOW, new zdl(R.color.color_wc_26_yellow_edge, R.color.color_wc_26_yellow_center)), new Pair("green", new zdl(R.color.color_wc_26_green_edge, R.color.color_wc_26_green_center)), new Pair("lightBlue", new zdl(R.color.color_wc_26_light_blue_edge, R.color.color_wc_26_light_blue_center)), new Pair("orange", new zdl(R.color.color_wc_26_orange_edge, R.color.color_wc_26_orange_center)), new Pair("cherry", new zdl(R.color.color_wc_26_cherry_edge, R.color.color_wc_26_cherry_center)), new Pair("gray", new zdl(R.color.color_wc_26_gray_edge, R.color.color_wc_26_gray_center)));
        c = h2;
        d = l6g.W(h2.values());
        e = b.j(zu3.v0.getIso2Alpha(), zu3.k.getIso2Alpha(), zu3.S.getIso2Alpha());
        f = ypa.b(new g0l(20));
        g = ypa.b(new g0l(21));
        g0l g0lVar = new g0l(22);
        ysa ysaVar = ysa.c;
        h = ypa.a(ysaVar, g0lVar);
        i = ypa.a(ysaVar, new g0l(23));
        j = b.j(Integer.valueOf(R.string.goals), Integer.valueOf(R.string.football_assists), Integer.valueOf(R.string.average_sofascore_rating), Integer.valueOf(R.string.football_stat_expected_goals_scored), Integer.valueOf(R.string.football_big_chances_created), Integer.valueOf(R.string.football_big_chances_missed), Integer.valueOf(R.string.football_shots_on_goal_per_game), Integer.valueOf(R.string.football_yellow_cards), Integer.valueOf(R.string.football_accurate_passes_per_game), Integer.valueOf(R.string.football_successful_dribbles_per_game), Integer.valueOf(R.string.football_interceptions_per_game), Integer.valueOf(R.string.football_tackles_per_game));
    }

    public static Map a() {
        return (Map) f.getValue();
    }

    public static Integer b(String str) {
        return (Integer) a().get(str);
    }

    public static List c(int i2, List list, List list2) {
        if (i2 <= 0) {
            return km5.a;
        }
        if (list == null) {
            list = km5.a;
        }
        if (list2 == null) {
            list2 = km5.a;
        }
        if (list2.isEmpty()) {
            return CollectionsKt.M0(i2, list);
        }
        if (list.isEmpty()) {
            return CollectionsKt.L0(list2, i2);
        }
        int i3 = i2 - 1;
        int size = list2.size();
        if (i3 > size) {
            i3 = size;
        }
        ArrayList w0 = CollectionsKt.w0(CollectionsKt.L0(list2, i3), CollectionsKt.M0(i2 - i3, list));
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = w0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (hashSet.add(Integer.valueOf(((Event) next).getId()))) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static boolean d() {
        long w = yaa.w();
        return 1778716799 <= w && w <= 1784591999;
    }

    public static mr3 e(Context context) {
        nh0 X0 = CollectionsKt.X0(j);
        int c2 = sub.c(k13.r(X0, 10));
        if (c2 < 16) {
            c2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c2);
        Iterator it = X0.iterator();
        while (true) {
            sc5 sc5Var = (sc5) it;
            if (!sc5Var.b.hasNext()) {
                return new mr3(linkedHashMap, 2);
            }
            IndexedValue indexedValue = (IndexedValue) sc5Var.next();
            linkedHashMap.put(context.getString(((Number) indexedValue.b).intValue()), Integer.valueOf(indexedValue.a));
        }
    }
}
