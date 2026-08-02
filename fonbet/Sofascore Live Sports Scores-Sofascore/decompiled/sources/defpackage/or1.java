package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.FootballPlayerSeasonStatistics;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class or1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinkedHashMap b;
    public final /* synthetic */ gvh c;
    public final /* synthetic */ String d;

    public /* synthetic */ or1(gvh gvhVar, String str, LinkedHashMap linkedHashMap) {
        this.a = 2;
        this.c = gvhVar;
        this.d = str;
        this.b = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0703 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(Object obj) {
        boolean z;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        boolean z2;
        boolean z3;
        Set g0;
        Set g02;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics;
        FootballPlayerSeasonStatistics B;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics2;
        FootballPlayerSeasonStatistics B2;
        Gender gender;
        boolean z4;
        wyg wygVar;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics3;
        FootballPlayerSeasonStatistics B3;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics4;
        FootballPlayerSeasonStatistics B4;
        o73 o73Var = (o73) obj;
        o73Var.getClass();
        Map map = o73Var.b;
        ArrayList arrayList = o73Var.c;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((c73) entry.getValue()).a != null) {
                linkedHashMap3.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(sub.c(linkedHashMap3.size()));
        Iterator it = linkedHashMap3.entrySet().iterator();
        while (true) {
            Player player = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) it.next();
            Object key = entry2.getKey();
            qo2 qo2Var = ((c73) entry2.getValue()).a;
            a73 a73Var = qo2Var instanceof a73 ? (a73) qo2Var : null;
            if (a73Var != null) {
                player = a73Var.c;
            }
            linkedHashMap4.put(key, player);
        }
        o73Var.a(new q9k(R.string.age), new sc6(23), null, null);
        o73Var.a(new q9k(R.string.player_height), new sc6(29), null, null);
        o73Var.a(new q9k(R.string.market_value), new lk8(4), null, null);
        LinkedHashMap linkedHashMap5 = this.b;
        if (!linkedHashMap5.isEmpty()) {
            Iterator it2 = linkedHashMap5.entrySet().iterator();
            while (it2.hasNext()) {
                Season season = ((c73) ((Map.Entry) it2.next()).getValue()).b;
                if (Intrinsics.c(season != null ? Boolean.valueOf(season.isAllTimeSeason()) : null, Boolean.TRUE)) {
                    break;
                }
            }
        }
        o73Var.d(new mk8(10));
        o73Var.c(this.c, this.d, new b42(28), new mk8(16));
        lk8 lk8Var = new lk8(21);
        LinkedHashMap linkedHashMap6 = new LinkedHashMap(sub.c(map.size()));
        for (Map.Entry entry3 : map.entrySet()) {
            linkedHashMap6.put(entry3.getKey(), (v0i) lk8Var.invoke((c73) entry3.getValue(), o73Var.a));
        }
        if (!linkedHashMap6.isEmpty()) {
            Iterator it3 = linkedHashMap6.entrySet().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (((v0i) ((Map.Entry) it3.next()).getValue()) != null) {
                    arrayList.add(new f83(l6g.X(linkedHashMap6)));
                    break;
                }
            }
        }
        mqi mqiVar = bii.a;
        int i = 0;
        o73Var.b(new q9k(bii.b(Sports.FOOTBALL, false)));
        o73Var.a(new q9k(R.string.football_minutes_per_game), new lk8(25), new mk8(26), null);
        o73Var.a(new q9k(R.string.football_total_minutes_played), new lk8(26), new mk8(27), null);
        o73Var.a(new q9k(R.string.matches_played), new sc6(24), new pi8(25), null);
        int i2 = 1;
        if (!linkedHashMap4.isEmpty()) {
            if (!linkedHashMap4.isEmpty()) {
                Iterator it4 = linkedHashMap4.entrySet().iterator();
                while (it4.hasNext()) {
                    Player player2 = (Player) ((Map.Entry) it4.next()).getValue();
                    if (!Intrinsics.c(player2 != null ? Boolean.valueOf(Intrinsics.c(player2.getPosition(), "G")) : null, Boolean.TRUE)) {
                    }
                }
            }
            z = true;
            pi8 pi8Var = new pi8(26);
            if (z) {
                pi8Var.invoke(o73Var);
            }
            o73Var.b(new q9k(R.string.football_attacking));
            o73Var.a(new q9k(R.string.goals), new sc6(25), new pi8(27), null);
            o73Var.a(new q9k(R.string.football_expected_goals), new sc6(26), new pi8(28), null);
            o73Var.a(new q9k(R.string.goals_per_game), new sc6(28), new pi8(29), null);
            linkedHashMap = new LinkedHashMap(sub.c(map.size()));
            for (Map.Entry entry4 : map.entrySet()) {
                Object key2 = entry4.getKey();
                c73 c73Var = (c73) entry4.getValue();
                c73Var.getClass();
                d73 d73Var = c73Var.c;
                wyg wygVar2 = d73Var != null ? d73Var.c : null;
                linkedHashMap.put(key2, o1j.z(td4.n0((wygVar2 == null || (B4 = o1j.B(wygVar2)) == null) ? null : B4.getShotsOffTarget(), (wygVar2 == null || (abstractPlayerSeasonStatistics4 = wygVar2.a) == null) ? null : abstractPlayerSeasonStatistics4.getAppearances())));
            }
            linkedHashMap2 = new LinkedHashMap(sub.c(map.size()));
            for (Map.Entry entry5 : map.entrySet()) {
                Object key3 = entry5.getKey();
                c73 c73Var2 = (c73) entry5.getValue();
                c73Var2.getClass();
                d73 d73Var2 = c73Var2.c;
                wyg wygVar3 = d73Var2 != null ? d73Var2.c : null;
                linkedHashMap2.put(key3, o1j.z(td4.n0((wygVar3 == null || (B3 = o1j.B(wygVar3)) == null) ? null : B3.getShotsOnTarget(), (wygVar3 == null || (abstractPlayerSeasonStatistics3 = wygVar3.a) == null) ? null : abstractPlayerSeasonStatistics3.getAppearances())));
            }
            if (!linkedHashMap.isEmpty()) {
                Iterator it5 = linkedHashMap.entrySet().iterator();
                while (it5.hasNext()) {
                    if (((String) ((Map.Entry) it5.next()).getValue()) != null) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (!linkedHashMap2.isEmpty()) {
                Iterator it6 = linkedHashMap2.entrySet().iterator();
                while (it6.hasNext()) {
                    if (((String) ((Map.Entry) it6.next()).getValue()) != null) {
                        z3 = true;
                        break;
                    }
                }
            }
            z3 = false;
            if (!z2 || z3) {
                LinkedHashMap linkedHashMap7 = new LinkedHashMap(sub.c(map.size()));
                for (Map.Entry entry6 : map.entrySet()) {
                    Object key4 = entry6.getKey();
                    c73 c73Var3 = (c73) entry6.getValue();
                    c73Var3.getClass();
                    d73 d73Var3 = c73Var3.c;
                    wyg wygVar4 = d73Var3 != null ? d73Var3.c : null;
                    linkedHashMap7.put(key4, yid.h(td4.n0((wygVar4 == null || (B2 = o1j.B(wygVar4)) == null) ? null : B2.getShotsOffTarget(), (wygVar4 == null || (abstractPlayerSeasonStatistics2 = wygVar4.a) == null) ? null : abstractPlayerSeasonStatistics2.getAppearances())));
                }
                g0 = l98.g0(linkedHashMap7);
                if (g0 == null) {
                    g0 = rm5.a;
                }
                LinkedHashMap linkedHashMap8 = new LinkedHashMap(sub.c(map.size()));
                for (Map.Entry entry7 : map.entrySet()) {
                    Object key5 = entry7.getKey();
                    c73 c73Var4 = (c73) entry7.getValue();
                    c73Var4.getClass();
                    d73 d73Var4 = c73Var4.c;
                    wyg wygVar5 = d73Var4 != null ? d73Var4.c : null;
                    linkedHashMap8.put(key5, td4.n0((wygVar5 == null || (B = o1j.B(wygVar5)) == null) ? null : B.getShotsOnTarget(), (wygVar5 == null || (abstractPlayerSeasonStatistics = wygVar5.a) == null) ? null : abstractPlayerSeasonStatistics.getAppearances()));
                }
                g02 = l98.g0(linkedHashMap8);
                if (g02 == null) {
                    g02 = rm5.a;
                }
                arrayList.add(new d83(l6g.X(linkedHashMap), l6g.X(linkedHashMap2), g0, g02));
            }
            o73Var.a(new q9k(R.string.football_big_chances_missed), new lk8(i), new mk8(0), null);
            o73Var.b(new q9k(R.string.passes));
            o73Var.a(new q9k(R.string.football_assists), new lk8(i2), new mk8(1), null);
            o73Var.a(new q9k(R.string.football_assists_per_game), new lk8(2), new mk8(2), null);
            o73Var.a(new q9k(R.string.football_expected_assists), new lk8(3), new mk8(4), null);
            o73Var.a(new q9k(R.string.football_big_chances_created), new lk8(5), new mk8(5), null);
            o73Var.a(new q9k(R.string.football_long_balls), new lk8(6), new mk8(6), null);
            o73Var.a(new q9k(R.string.football_crosses), new lk8(7), new mk8(7), null);
            o73Var.b(new q9k(R.string.defending_per_game));
            o73Var.a(new q9k(R.string.interceptions), new lk8(8), new mk8(9), null);
            int i3 = 11;
            o73Var.a(new q9k(R.string.football_tackles), new lk8(9), new mk8(11), null);
            if (!linkedHashMap4.isEmpty()) {
                if (!linkedHashMap4.isEmpty()) {
                    Iterator it7 = linkedHashMap4.entrySet().iterator();
                    while (it7.hasNext()) {
                        Player player3 = (Player) ((Map.Entry) it7.next()).getValue();
                        if ((player3 != null ? player3.getGender() : null) == Gender.Female) {
                        }
                    }
                }
                gender = Gender.Female;
                o73Var.a(new n9k(R.string.football_dribbled_past, gender), new lk8(10), new mk8(12), null);
                o73Var.a(new q9k(R.string.football_clearances), new lk8(i3), new mk8(13), null);
                o73Var.a(new q9k(R.string.blocked_shots), new lk8(12), new mk8(14), null);
                o73Var.b(new q9k(R.string.other_per_game));
                o73Var.a(new q9k(R.string.football_successful_dribbles), new lk8(14), new mk8(15), null);
                o73Var.a(new q9k(R.string.ground_duels_won), new lk8(15), new mk8(17), null);
                o73Var.a(new q9k(R.string.aerial_duels_won), new lk8(16), new mk8(18), null);
                o73Var.a(new q9k(R.string.football_possession_lost), new lk8(17), new mk8(19), null);
                o73Var.a(new q9k(R.string.football_fouls), new lk8(18), new mk8(21), null);
                o73Var.a(new q9k(R.string.football_was_fouled), new lk8(19), new mk8(22), null);
                o73Var.b(new q9k(R.string.football_statistics_category_cards));
                o73Var.a(new q9k(R.string.football_yellow_cards), new lk8(20), new mk8(23), null);
                o73Var.a(new q9k(R.string.yellow_red_cards), new lk8(22), new mk8(24), null);
                o73Var.a(new q9k(R.string.football_red_cards), new lk8(23), new mk8(25), null);
                if (!linkedHashMap5.isEmpty()) {
                    Iterator it8 = linkedHashMap5.entrySet().iterator();
                    while (it8.hasNext()) {
                        if (((c73) ((Map.Entry) it8.next()).getValue()).a != null) {
                            z4 = true;
                            break;
                        }
                    }
                }
                z4 = false;
                if (!linkedHashMap5.isEmpty()) {
                    Iterator it9 = linkedHashMap5.entrySet().iterator();
                    while (it9.hasNext()) {
                        d73 d73Var5 = ((c73) ((Map.Entry) it9.next()).getValue()).c;
                        if (((d73Var5 == null || (wygVar = d73Var5.c) == null) ? null : o1j.B(wygVar)) != null) {
                            break;
                        }
                    }
                }
                i = 1;
                if (z4 && i != 0) {
                    arrayList.add(c83.a);
                }
                return Unit.a;
            }
            gender = Gender.Male;
            o73Var.a(new n9k(R.string.football_dribbled_past, gender), new lk8(10), new mk8(12), null);
            o73Var.a(new q9k(R.string.football_clearances), new lk8(i3), new mk8(13), null);
            o73Var.a(new q9k(R.string.blocked_shots), new lk8(12), new mk8(14), null);
            o73Var.b(new q9k(R.string.other_per_game));
            o73Var.a(new q9k(R.string.football_successful_dribbles), new lk8(14), new mk8(15), null);
            o73Var.a(new q9k(R.string.ground_duels_won), new lk8(15), new mk8(17), null);
            o73Var.a(new q9k(R.string.aerial_duels_won), new lk8(16), new mk8(18), null);
            o73Var.a(new q9k(R.string.football_possession_lost), new lk8(17), new mk8(19), null);
            o73Var.a(new q9k(R.string.football_fouls), new lk8(18), new mk8(21), null);
            o73Var.a(new q9k(R.string.football_was_fouled), new lk8(19), new mk8(22), null);
            o73Var.b(new q9k(R.string.football_statistics_category_cards));
            o73Var.a(new q9k(R.string.football_yellow_cards), new lk8(20), new mk8(23), null);
            o73Var.a(new q9k(R.string.yellow_red_cards), new lk8(22), new mk8(24), null);
            o73Var.a(new q9k(R.string.football_red_cards), new lk8(23), new mk8(25), null);
            if (!linkedHashMap5.isEmpty()) {
            }
            z4 = false;
            if (!linkedHashMap5.isEmpty()) {
            }
            i = 1;
            if (z4) {
                arrayList.add(c83.a);
            }
            return Unit.a;
        }
        z = false;
        pi8 pi8Var2 = new pi8(26);
        if (z) {
        }
        o73Var.b(new q9k(R.string.football_attacking));
        o73Var.a(new q9k(R.string.goals), new sc6(25), new pi8(27), null);
        o73Var.a(new q9k(R.string.football_expected_goals), new sc6(26), new pi8(28), null);
        o73Var.a(new q9k(R.string.goals_per_game), new sc6(28), new pi8(29), null);
        linkedHashMap = new LinkedHashMap(sub.c(map.size()));
        while (r9.hasNext()) {
        }
        linkedHashMap2 = new LinkedHashMap(sub.c(map.size()));
        while (r10.hasNext()) {
        }
        if (!linkedHashMap.isEmpty()) {
        }
        z2 = false;
        if (!linkedHashMap2.isEmpty()) {
        }
        z3 = false;
        if (!z2) {
        }
        LinkedHashMap linkedHashMap72 = new LinkedHashMap(sub.c(map.size()));
        while (r11.hasNext()) {
        }
        g0 = l98.g0(linkedHashMap72);
        if (g0 == null) {
        }
        LinkedHashMap linkedHashMap82 = new LinkedHashMap(sub.c(map.size()));
        while (r2.hasNext()) {
        }
        g02 = l98.g0(linkedHashMap82);
        if (g02 == null) {
        }
        arrayList.add(new d83(l6g.X(linkedHashMap), l6g.X(linkedHashMap2), g0, g02));
        o73Var.a(new q9k(R.string.football_big_chances_missed), new lk8(i), new mk8(0), null);
        o73Var.b(new q9k(R.string.passes));
        o73Var.a(new q9k(R.string.football_assists), new lk8(i2), new mk8(1), null);
        o73Var.a(new q9k(R.string.football_assists_per_game), new lk8(2), new mk8(2), null);
        o73Var.a(new q9k(R.string.football_expected_assists), new lk8(3), new mk8(4), null);
        o73Var.a(new q9k(R.string.football_big_chances_created), new lk8(5), new mk8(5), null);
        o73Var.a(new q9k(R.string.football_long_balls), new lk8(6), new mk8(6), null);
        o73Var.a(new q9k(R.string.football_crosses), new lk8(7), new mk8(7), null);
        o73Var.b(new q9k(R.string.defending_per_game));
        o73Var.a(new q9k(R.string.interceptions), new lk8(8), new mk8(9), null);
        int i32 = 11;
        o73Var.a(new q9k(R.string.football_tackles), new lk8(9), new mk8(11), null);
        if (!linkedHashMap4.isEmpty()) {
        }
        gender = Gender.Male;
        o73Var.a(new n9k(R.string.football_dribbled_past, gender), new lk8(10), new mk8(12), null);
        o73Var.a(new q9k(R.string.football_clearances), new lk8(i32), new mk8(13), null);
        o73Var.a(new q9k(R.string.blocked_shots), new lk8(12), new mk8(14), null);
        o73Var.b(new q9k(R.string.other_per_game));
        o73Var.a(new q9k(R.string.football_successful_dribbles), new lk8(14), new mk8(15), null);
        o73Var.a(new q9k(R.string.ground_duels_won), new lk8(15), new mk8(17), null);
        o73Var.a(new q9k(R.string.aerial_duels_won), new lk8(16), new mk8(18), null);
        o73Var.a(new q9k(R.string.football_possession_lost), new lk8(17), new mk8(19), null);
        o73Var.a(new q9k(R.string.football_fouls), new lk8(18), new mk8(21), null);
        o73Var.a(new q9k(R.string.football_was_fouled), new lk8(19), new mk8(22), null);
        o73Var.b(new q9k(R.string.football_statistics_category_cards));
        o73Var.a(new q9k(R.string.football_yellow_cards), new lk8(20), new mk8(23), null);
        o73Var.a(new q9k(R.string.yellow_red_cards), new lk8(22), new mk8(24), null);
        o73Var.a(new q9k(R.string.football_red_cards), new lk8(23), new mk8(25), null);
        if (!linkedHashMap5.isEmpty()) {
        }
        z4 = false;
        if (!linkedHashMap5.isEmpty()) {
        }
        i = 1;
        if (z4) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x06f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x06c8  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        LinkedHashMap linkedHashMap;
        int c;
        boolean z;
        boolean z2;
        wyg wygVar;
        boolean z3;
        boolean z4 = true;
        byte b = 0;
        switch (this.a) {
            case 0:
                o73 o73Var = (o73) obj;
                o73Var.getClass();
                o73Var.a(new q9k(R.string.age), new hd3(b, 15), null, null);
                ArrayList arrayList = o73Var.c;
                o73Var.a(new q9k(R.string.player_height), new hd3(b, 7), null, null);
                LinkedHashMap linkedHashMap2 = this.b;
                if (!linkedHashMap2.isEmpty()) {
                    Iterator it = linkedHashMap2.entrySet().iterator();
                    while (it.hasNext()) {
                        Season season = ((c73) ((Map.Entry) it.next()).getValue()).b;
                        if (Intrinsics.c(season != null ? Boolean.valueOf(season.isAllTimeSeason()) : null, Boolean.TRUE)) {
                            o73Var.c(this.c, this.d, new b42(28), new yq1(22));
                            pr1 pr1Var = new pr1(0);
                            tfh tfhVar = tfh.b;
                            List<Map.Entry> H0 = CollectionsKt.H0(o73Var.b.entrySet(), new qe8(28));
                            kp5 kp5Var = tfh.d;
                            c = sub.c(k13.r(kp5Var, 10));
                            if (c < 16) {
                                c = 16;
                            }
                            linkedHashMap = new LinkedHashMap(c);
                            for (Object obj2 : kp5Var) {
                                tfh tfhVar2 = (tfh) obj2;
                                ArrayList arrayList2 = new ArrayList(k13.r(H0, 10));
                                for (Map.Entry entry : H0) {
                                    arrayList2.add((v0i) pr1Var.invoke((c73) entry.getValue(), (e93) entry.getKey(), tfhVar2, o73Var.a));
                                }
                                linkedHashMap.put(obj2, l6g.W(arrayList2));
                            }
                            if (!linkedHashMap.isEmpty()) {
                                Iterator it2 = linkedHashMap.entrySet().iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        gv9 gv9Var = (gv9) ((Map.Entry) it2.next()).getValue();
                                        if (gv9Var == null || !gv9Var.isEmpty()) {
                                            Iterator<E> it3 = gv9Var.iterator();
                                            while (it3.hasNext()) {
                                                if (((v0i) it3.next()) != null) {
                                                    arrayList.add(new a83(l6g.X(linkedHashMap), tfhVar));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            mqi mqiVar = bii.a;
                            o73Var.b(new q9k(bii.b(Sports.BASKETBALL, false)));
                            o73Var.a(new q9k(R.string.matches_total), new hd3(b, 21), new yq1(27), null);
                            o73Var.a(new q9k(R.string.basketball_minutes_per_game), new hd3(b, 22), new yq1(28), null);
                            o73Var.b(new q9k(R.string.points_per_game));
                            o73Var.a(new q9k(R.string.total), new hd3(b, 23), new yq1(25), null);
                            o73Var.a(new q9k(R.string.free_throws), new hd3(b, 24), new yq1(29), null);
                            o73Var.a(new q9k(R.string.two_pointers), new hd3(b, 25), new qr1(0), null);
                            o73Var.a(new q9k(R.string.three_pointers), new hd3(b, 26), new qr1(1), null);
                            o73Var.a(new q9k(R.string.field_goals), new hd3(b, 5), new yq1(10), null);
                            o73Var.b(new q9k(R.string.rebounds_per_game));
                            o73Var.a(new q9k(R.string.total), new hd3(b, 6), new yq1(11), null);
                            o73Var.a(new q9k(R.string.defensive_rebounds), new hd3(b, 8), new yq1(12), null);
                            o73Var.a(new q9k(R.string.offensive_rebounds), new hd3(b, 9), new yq1(13), null);
                            o73Var.b(new q9k(R.string.other_per_game));
                            o73Var.a(new q9k(R.string.basketball_assists), new hd3(b, 10), new yq1(14), null);
                            o73Var.a(new q9k(R.string.turnovers), new hd3(b, 11), new yq1(15), null);
                            o73Var.a(new q9k(R.string.steals), new hd3(b, 12), new yq1(17), null);
                            o73Var.a(new q9k(R.string.assist_to_turnover_ratio), new hd3(b, 13), new yq1(18), null);
                            o73Var.a(new q9k(R.string.blocks), new hd3(b, 14), new yq1(19), null);
                            o73Var.a(new q9k(R.string.personal_fouls), new hd3(b, 16), new yq1(20), null);
                            o73Var.a(new q9k(R.string.basketball_plus_minus), new hd3(b, 17), new yq1(21), null);
                            o73Var.a(new q9k(R.string.performance_index_rating_long), new hd3(b, 18), new yq1(23), null);
                            o73Var.b(new q9k(R.string.extra));
                            o73Var.a(new q9k(R.string.basketball_double_double), new hd3(b, 19), new yq1(24), null);
                            o73Var.a(new q9k(R.string.basketball_triple_double), new hd3(b, 20), new yq1(26), null);
                            if (!linkedHashMap2.isEmpty()) {
                                Iterator it4 = linkedHashMap2.entrySet().iterator();
                                while (it4.hasNext()) {
                                    if (((c73) ((Map.Entry) it4.next()).getValue()).a != null) {
                                        z = true;
                                        if (!linkedHashMap2.isEmpty()) {
                                            Iterator it5 = linkedHashMap2.entrySet().iterator();
                                            while (it5.hasNext()) {
                                                d73 d73Var = ((c73) ((Map.Entry) it5.next()).getValue()).c;
                                                if (((d73Var == null || (wygVar = d73Var.c) == null) ? null : rr1.b(wygVar)) != null) {
                                                    z2 = false;
                                                    if (z && z2) {
                                                        arrayList.add(c83.a);
                                                    }
                                                    return Unit.a;
                                                }
                                            }
                                        }
                                        z2 = true;
                                        if (z) {
                                            arrayList.add(c83.a);
                                        }
                                        return Unit.a;
                                    }
                                }
                            }
                            z = false;
                            if (!linkedHashMap2.isEmpty()) {
                            }
                            z2 = true;
                            if (z) {
                            }
                            return Unit.a;
                        }
                    }
                }
                o73Var.d(new yq1(16));
                o73Var.c(this.c, this.d, new b42(28), new yq1(22));
                pr1 pr1Var2 = new pr1(0);
                tfh tfhVar3 = tfh.b;
                List<Map.Entry> H02 = CollectionsKt.H0(o73Var.b.entrySet(), new qe8(28));
                kp5 kp5Var2 = tfh.d;
                c = sub.c(k13.r(kp5Var2, 10));
                if (c < 16) {
                }
                linkedHashMap = new LinkedHashMap(c);
                while (r3.hasNext()) {
                }
                if (!linkedHashMap.isEmpty()) {
                }
                mqi mqiVar2 = bii.a;
                o73Var.b(new q9k(bii.b(Sports.BASKETBALL, false)));
                o73Var.a(new q9k(R.string.matches_total), new hd3(b, 21), new yq1(27), null);
                o73Var.a(new q9k(R.string.basketball_minutes_per_game), new hd3(b, 22), new yq1(28), null);
                o73Var.b(new q9k(R.string.points_per_game));
                o73Var.a(new q9k(R.string.total), new hd3(b, 23), new yq1(25), null);
                o73Var.a(new q9k(R.string.free_throws), new hd3(b, 24), new yq1(29), null);
                o73Var.a(new q9k(R.string.two_pointers), new hd3(b, 25), new qr1(0), null);
                o73Var.a(new q9k(R.string.three_pointers), new hd3(b, 26), new qr1(1), null);
                o73Var.a(new q9k(R.string.field_goals), new hd3(b, 5), new yq1(10), null);
                o73Var.b(new q9k(R.string.rebounds_per_game));
                o73Var.a(new q9k(R.string.total), new hd3(b, 6), new yq1(11), null);
                o73Var.a(new q9k(R.string.defensive_rebounds), new hd3(b, 8), new yq1(12), null);
                o73Var.a(new q9k(R.string.offensive_rebounds), new hd3(b, 9), new yq1(13), null);
                o73Var.b(new q9k(R.string.other_per_game));
                o73Var.a(new q9k(R.string.basketball_assists), new hd3(b, 10), new yq1(14), null);
                o73Var.a(new q9k(R.string.turnovers), new hd3(b, 11), new yq1(15), null);
                o73Var.a(new q9k(R.string.steals), new hd3(b, 12), new yq1(17), null);
                o73Var.a(new q9k(R.string.assist_to_turnover_ratio), new hd3(b, 13), new yq1(18), null);
                o73Var.a(new q9k(R.string.blocks), new hd3(b, 14), new yq1(19), null);
                o73Var.a(new q9k(R.string.personal_fouls), new hd3(b, 16), new yq1(20), null);
                o73Var.a(new q9k(R.string.basketball_plus_minus), new hd3(b, 17), new yq1(21), null);
                o73Var.a(new q9k(R.string.performance_index_rating_long), new hd3(b, 18), new yq1(23), null);
                o73Var.b(new q9k(R.string.extra));
                o73Var.a(new q9k(R.string.basketball_double_double), new hd3(b, 19), new yq1(24), null);
                o73Var.a(new q9k(R.string.basketball_triple_double), new hd3(b, 20), new yq1(26), null);
                if (!linkedHashMap2.isEmpty()) {
                }
                z = false;
                if (!linkedHashMap2.isEmpty()) {
                }
                z2 = true;
                if (z) {
                }
                return Unit.a;
            case 1:
                return a(obj);
            default:
                o73 o73Var2 = (o73) obj;
                o73Var2.getClass();
                o73Var2.c(this.c, this.d, new hl8(20), new hl8(12));
                o73Var2.b(new q9k(R.string.summary));
                mqi mqiVar3 = bii.a;
                o73Var2.a(new q9k(bii.b(Sports.FOOTBALL, false)), new nl8(4), new hl8(24), null);
                o73Var2.a(new q9k(R.string.football_goals_scored), new nl8(16), new ol8(1), null);
                o73Var2.a(new q9k(R.string.football_goals_conceded), new nl8(18), new ol8(3), null);
                o73Var2.a(new q9k(R.string.football_assists), new nl8(19), new ol8(4), null);
                o73Var2.b(new q9k(R.string.football_attacking));
                o73Var2.a(new q9k(R.string.goals_per_game), new nl8(12), new ol8(2), null);
                o73Var2.a(new q9k(R.string.football_shots_on_goal_per_game), new nl8(20), new ol8(5), null);
                o73Var2.a(new q9k(R.string.big_chances_per_game), new nl8(21), new ol8(6), null);
                o73Var2.a(new q9k(R.string.big_chances_missed_per_game), new nl8(22), new hl8(10), null);
                o73Var2.b(new q9k(R.string.passes));
                o73Var2.a(new q9k(R.string.football_ball_possession), new lk8(28), new hl8(11), null);
                o73Var2.a(new q9k(R.string.accurate_per_game), new lk8(29), new hl8(13), null);
                o73Var2.a(new q9k(R.string.football_accurate_long_balls_per_game), new nl8(0), new hl8(14), null);
                o73Var2.b(new q9k(R.string.football_defending));
                o73Var2.a(new q9k(R.string.football_clean_sheets), new nl8(1), new hl8(15), null);
                o73Var2.a(new q9k(R.string.goals_conceded_per_game), new nl8(2), new hl8(16), null);
                o73Var2.a(new q9k(R.string.football_interceptions_per_game), new nl8(3), new hl8(17), null);
                o73Var2.a(new q9k(R.string.football_tackles_per_game), new nl8(5), new hl8(18), null);
                o73Var2.a(new q9k(R.string.football_clearances_per_game), new nl8(6), new hl8(19), null);
                o73Var2.a(new q9k(R.string.football_penalty_goals_conceded), new nl8(7), new hl8(21), null);
                o73Var2.a(new q9k(R.string.football_saves_per_game), new nl8(8), new hl8(22), null);
                o73Var2.b(new q9k(R.string.other));
                o73Var2.a(new q9k(R.string.total_duels_won_per_game), new nl8(9), new hl8(23), null);
                o73Var2.a(new q9k(R.string.football_fouls_per_game), new nl8(10), new hl8(25), null);
                o73Var2.a(new q9k(R.string.offsides_per_game), new nl8(11), new hl8(26), null);
                o73Var2.a(new q9k(R.string.football_goal_kicks_per_game), new nl8(13), new hl8(27), null);
                o73Var2.a(new q9k(R.string.football_throw_ins_per_game), new nl8(14), new hl8(28), null);
                o73Var2.a(new q9k(R.string.yellow_cards_per_game), new nl8(15), new hl8(29), null);
                o73Var2.a(new q9k(R.string.football_red_cards), new nl8(17), new ol8(0), null);
                LinkedHashMap linkedHashMap3 = this.b;
                if (!linkedHashMap3.isEmpty()) {
                    Iterator it6 = linkedHashMap3.entrySet().iterator();
                    while (it6.hasNext()) {
                        if (((c73) ((Map.Entry) it6.next()).getValue()).a != null) {
                            z3 = true;
                            if (!linkedHashMap3.isEmpty()) {
                                Iterator it7 = linkedHashMap3.entrySet().iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        if (ktm.v((c73) ((Map.Entry) it7.next()).getValue()) != null) {
                                            z4 = false;
                                        }
                                    }
                                }
                            }
                            if (z3 && z4) {
                                o73Var2.c.add(c83.a);
                            }
                            return Unit.a;
                        }
                    }
                }
                z3 = false;
                if (!linkedHashMap3.isEmpty()) {
                }
                if (z3) {
                    o73Var2.c.add(c83.a);
                }
                return Unit.a;
        }
    }

    public /* synthetic */ or1(LinkedHashMap linkedHashMap, gvh gvhVar, String str, int i) {
        this.a = i;
        this.b = linkedHashMap;
        this.c = gvhVar;
        this.d = str;
    }
}
