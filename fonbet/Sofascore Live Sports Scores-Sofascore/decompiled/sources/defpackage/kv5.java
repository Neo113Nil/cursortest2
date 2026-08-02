package defpackage;

import android.app.Application;
import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.TeamSelection;
import com.sofascore.model.mvvm.model.BaseballAdditionalPlayerData;
import com.sofascore.model.mvvm.model.BaseballRole;
import com.sofascore.model.mvvm.model.CustomizableDivider;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Lineups;
import com.sofascore.model.mvvm.model.MissingPlayerData;
import com.sofascore.model.mvvm.model.MissingPlayersPair;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.BaseballPlayerEventStatistics;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.model.network.response.PlayerEventStatistics;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lkv5;", "Lq8;", "hv5", "yz1", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class kv5 extends q8 {
    public final s96 e;
    public Event f;
    public LineupsResponse g;
    public final ArrayList h;
    public q22 i;
    public q22 j;
    public q22 k;
    public TeamSelection l;
    public boolean m;
    public b0i n;
    public int o;
    public int p;
    public final HashMap q;
    public final yzc r;
    public final lec s;
    public final yzc t;
    public final yzc u;
    public final g62 v;
    public final nn2 w;
    public List x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv5(s96 s96Var, Application application) {
        super(application);
        s96Var.getClass();
        this.e = s96Var;
        this.h = new ArrayList();
        this.o = 3;
        this.p = 3;
        this.q = new HashMap();
        yzc yzcVar = new yzc();
        this.r = yzcVar;
        this.s = waa.w(yzcVar);
        yzc yzcVar2 = new yzc();
        this.t = yzcVar2;
        this.u = yzcVar2;
        g62 g = ml4.g(0, 7, null);
        this.v = g;
        this.w = f5p.J(g);
        this.x = km5.a;
    }

    public static xbb l(List list, List list2) {
        xbb b = a.b();
        if (list == null) {
            list = km5.a;
        }
        if (list2 == null) {
            list2 = km5.a;
        }
        xbb M = yso.M(list, list2);
        ArrayList arrayList = new ArrayList(k13.r(M, 10));
        ListIterator listIterator = M.listIterator(0);
        while (true) {
            hc9 hc9Var = (hc9) listIterator;
            if (!hc9Var.hasNext()) {
                break;
            }
            Pair pair = (Pair) hc9Var.next();
            arrayList.add(new MissingPlayersPair((MissingPlayerData) pair.a, (MissingPlayerData) pair.b));
        }
        if (!arrayList.isEmpty()) {
            b.add(new q9k(R.string.injuries_and_suspensions));
            b.addAll(arrayList);
        }
        return a.a(b);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:255:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0692 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x096d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x06f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q22 k(yz1 yz1Var, boolean z, yz1 yz1Var2, TeamSelection teamSelection) {
        p22 p22Var;
        ArrayList arrayList;
        Lineups lineups;
        Lineups lineups2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String str;
        String str2;
        ArrayList arrayList5;
        p22 p22Var2;
        ArrayList arrayList6;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        String str3;
        String str4;
        k22 k22Var;
        zm1 zm1Var;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList10;
        ArrayList arrayList11;
        ArrayList arrayList12;
        String str5;
        ArrayList arrayList13;
        m22 m22Var;
        i22 i22Var;
        BaseballPlayerEventStatistics baseballPlayerEventStatistics;
        ArrayList arrayList14;
        ArrayList arrayList15;
        Iterator it;
        BaseballAdditionalPlayerData baseballAllPositions;
        x12 x12Var;
        List<BaseballRole> list;
        Integer sequence;
        Integer battingOrder;
        ArrayList arrayList16;
        ArrayList arrayList17;
        ArrayList arrayList18;
        ArrayList arrayList19;
        Iterator it2;
        String str6;
        ArrayList arrayList20;
        int i;
        ArrayList arrayList21;
        Collection H0;
        boolean z2;
        List list2;
        ArrayList arrayList22;
        km5 km5Var;
        km5 km5Var2;
        Lineups lineups3 = (Lineups) yz1Var2.c;
        Lineups lineups4 = (Lineups) yz1Var.c;
        List<PlayerData> players = lineups4.getPlayers();
        ArrayList arrayList23 = new ArrayList(k13.r(players, 10));
        Iterator<T> it3 = players.iterator();
        while (it3.hasNext()) {
            arrayList23.add(PlayerData.copy$default((PlayerData) it3.next(), null, null, null, null, null, null, null, null, null, null, Integer.valueOf(yz1Var.b), null, null, 7167, null));
        }
        List<PlayerData> players2 = lineups3 != null ? lineups3.getPlayers() : null;
        if (teamSelection != TeamSelection.Combined) {
            players2 = null;
        }
        if (players2 == null) {
            players2 = km5.a;
        }
        ArrayList arrayList24 = new ArrayList(k13.r(players2, 10));
        Iterator<T> it4 = players2.iterator();
        while (it4.hasNext()) {
            arrayList24.add(PlayerData.copy$default((PlayerData) it4.next(), null, null, null, null, null, null, null, null, null, null, Integer.valueOf(yz1Var2.b), null, null, 7167, null));
        }
        ArrayList w0 = CollectionsKt.w0(arrayList24, arrayList23);
        ArrayList arrayList25 = new ArrayList();
        ArrayList arrayList26 = new ArrayList();
        ArrayList arrayList27 = new ArrayList();
        Event event = this.f;
        String str7 = "event";
        if (event == null) {
            Intrinsics.i("event");
            throw null;
        }
        String s = ok3.s(event);
        String str8 = Sports.BASEBALL;
        if (!Intrinsics.c(s, Sports.BASEBALL) || z || w0.isEmpty()) {
            Event event2 = this.f;
            if (event2 == null) {
                Intrinsics.i("event");
                throw null;
            }
            String s2 = ok3.s(event2);
            boolean v = v(w0);
            switch (s2.hashCode()) {
                case -2002238939:
                    p22Var = null;
                    arrayList = w0;
                    lineups = lineups3;
                    lineups2 = lineups4;
                    arrayList2 = arrayList25;
                    arrayList3 = arrayList26;
                    arrayList4 = arrayList27;
                    str = "event";
                    str2 = Sports.BASEBALL;
                    if (s2.equals(Sports.ICE_HOCKEY)) {
                        kp5 kp5Var = gn9.e;
                        arrayList5 = arrayList;
                        p22Var2 = new p22(wib.u(kp5Var, wib.g(arrayList5, kp5Var), v, null));
                        if (p22Var2 != null) {
                            ArrayList arrayList28 = p22Var2.a;
                            Iterator it5 = arrayList28.iterator();
                            int i2 = 0;
                            while (it5.hasNext()) {
                                Object next = it5.next();
                                int i3 = i2 + 1;
                                if (i2 < 0) {
                                    b.q();
                                    throw null;
                                }
                                k22 k22Var2 = (k22) next;
                                int size = arrayList2.size();
                                boolean z3 = i2 < arrayList28.size() - 1;
                                ArrayList arrayList29 = k22Var2.b;
                                m22 m22Var2 = k22Var2.a;
                                String str9 = m22Var2.a;
                                boolean isEmpty = arrayList29.isEmpty();
                                HashMap hashMap = this.q;
                                if (isEmpty) {
                                    arrayList19 = arrayList28;
                                    it2 = it5;
                                    str6 = str2;
                                    arrayList20 = arrayList2;
                                    i = 0;
                                } else {
                                    arrayList20 = arrayList2;
                                    arrayList20.add(m22Var2);
                                    Event event3 = this.f;
                                    if (event3 == null) {
                                        Intrinsics.i(str);
                                        throw null;
                                    }
                                    str6 = str2;
                                    if (Intrinsics.c(ok3.s(event3), str6)) {
                                        if (Intrinsics.c(str9, "PITCHING_SUMMARY")) {
                                            H0 = CollectionsKt.H0(arrayList29, new y73(18));
                                            arrayList19 = arrayList28;
                                            it2 = it5;
                                        } else if (Intrinsics.c(str9, "FIELDING_SUMMARY")) {
                                            ArrayList arrayList30 = new ArrayList();
                                            Iterator it6 = arrayList29.iterator();
                                            while (it6.hasNext()) {
                                                Object next2 = it6.next();
                                                i22 i22Var2 = (i22) next2;
                                                ArrayList arrayList31 = arrayList28;
                                                Integer num = i22Var2.w;
                                                List list3 = i22Var2.p;
                                                boolean z4 = num != null;
                                                if (list3 == null) {
                                                    z2 = z4;
                                                    list2 = km5.a;
                                                } else {
                                                    z2 = z4;
                                                    list2 = list3;
                                                }
                                                Iterator it7 = it5;
                                                if (list2.contains(BaseballRole.Pitcher)) {
                                                    if (list3 == null) {
                                                        list3 = km5.a;
                                                    }
                                                    if (list3 == null || !list3.isEmpty()) {
                                                        Iterator it8 = list3.iterator();
                                                        while (it8.hasNext()) {
                                                            if (BaseballRole.INSTANCE.getBattingPositions().contains((BaseballRole) it8.next())) {
                                                            }
                                                        }
                                                    }
                                                    if (!z2) {
                                                        arrayList28 = arrayList31;
                                                        it5 = it7;
                                                    }
                                                }
                                                arrayList30.add(next2);
                                                arrayList28 = arrayList31;
                                                it5 = it7;
                                            }
                                            arrayList19 = arrayList28;
                                            it2 = it5;
                                            List H02 = CollectionsKt.H0(arrayList30, new y73(19));
                                            ArrayList arrayList32 = new ArrayList();
                                            Iterator it9 = arrayList29.iterator();
                                            while (it9.hasNext()) {
                                                Object next3 = it9.next();
                                                if (!H02.contains((i22) next3)) {
                                                    arrayList32.add(next3);
                                                }
                                            }
                                            H0 = CollectionsKt.w0(CollectionsKt.H0(arrayList32, new y73(20)), H02);
                                        } else {
                                            arrayList19 = arrayList28;
                                            it2 = it5;
                                            H0 = CollectionsKt.H0(arrayList29, new y73(21));
                                        }
                                        arrayList20.addAll(H0);
                                        int size2 = arrayList20.size() - 2;
                                        zm1 zm1Var2 = k22Var2.c;
                                        if (zm1Var2 != null) {
                                            arrayList20.add(zm1Var2);
                                        }
                                        arrayList20.add(new CustomizableDivider(true, 1, false, Integer.valueOf(i().getColor(R.color.n_lv_4)), 4, null));
                                        i = size2;
                                    } else {
                                        arrayList19 = arrayList28;
                                        it2 = it5;
                                        arrayList20.addAll(CollectionsKt.H0(arrayList29, o93.a(new kz3((x12) hashMap.getOrDefault(str9, m22Var2.f), 20), new au5(2), new au5(3))));
                                        i = arrayList20.size() - 2;
                                        arrayList20.add(new CustomizableDivider(z3, 0, false, null, 14, null));
                                    }
                                }
                                if (arrayList29.size() == 1) {
                                    m22Var2.d = false;
                                } else {
                                    hashMap.putIfAbsent(str9, m22Var2.f);
                                }
                                if (arrayList29.size() > 1) {
                                    arrayList21 = arrayList4;
                                    arrayList21.add(new z12(m22Var2, size, i));
                                } else {
                                    arrayList21 = arrayList4;
                                }
                                arrayList4 = arrayList21;
                                i2 = i3;
                                arrayList2 = arrayList20;
                                str2 = str6;
                                arrayList28 = arrayList19;
                                it5 = it2;
                            }
                        }
                        str8 = str2;
                        arrayList17 = arrayList4;
                        arrayList18 = arrayList2;
                        break;
                    }
                    p22Var2 = p22Var;
                    arrayList5 = arrayList;
                    if (p22Var2 != null) {
                    }
                    str8 = str2;
                    arrayList17 = arrayList4;
                    arrayList18 = arrayList2;
                    break;
                case -1721090992:
                    p22Var = null;
                    lineups = lineups3;
                    lineups2 = lineups4;
                    if (!s2.equals(Sports.BASEBALL)) {
                        arrayList = w0;
                        arrayList2 = arrayList25;
                        arrayList3 = arrayList26;
                        arrayList4 = arrayList27;
                        str = "event";
                        str2 = Sports.BASEBALL;
                        p22Var2 = p22Var;
                        arrayList5 = arrayList;
                        if (p22Var2 != null) {
                        }
                        str8 = str2;
                        arrayList17 = arrayList4;
                        arrayList18 = arrayList2;
                        break;
                    } else {
                        b0i b0iVar = this.n;
                        if (b0iVar == null) {
                            b0iVar = null;
                        }
                        if (b0iVar != null) {
                            Context i4 = i();
                            LinkedHashMap g = wib.g(w0, CollectionsKt.S0(u71.h));
                            List c = a.c(b0iVar);
                            Double valueOf = Double.valueOf(Double.NaN);
                            ArrayList arrayList33 = new ArrayList();
                            Iterator it10 = c.iterator();
                            while (it10.hasNext()) {
                                b0i b0iVar2 = (b0i) it10.next();
                                ArrayList arrayList34 = (ArrayList) g.get(b0iVar2);
                                Iterator it11 = it10;
                                if (arrayList34 != null) {
                                    ArrayList arrayList35 = new ArrayList();
                                    Iterator it12 = arrayList34.iterator();
                                    while (it12.hasNext()) {
                                        LinkedHashMap linkedHashMap3 = g;
                                        PlayerEventStatistics statistics = ((PlayerData) it12.next()).getStatistics();
                                        String str10 = str7;
                                        if (!(statistics instanceof BaseballPlayerEventStatistics)) {
                                            statistics = null;
                                        }
                                        BaseballPlayerEventStatistics baseballPlayerEventStatistics2 = (BaseballPlayerEventStatistics) statistics;
                                        if (baseballPlayerEventStatistics2 != null) {
                                            arrayList35.add(baseballPlayerEventStatistics2);
                                        }
                                        str7 = str10;
                                        g = linkedHashMap3;
                                    }
                                    linkedHashMap = g;
                                    str3 = str7;
                                    ArrayList j = wib.j(b0iVar2.i(), arrayList35);
                                    if (!j.isEmpty()) {
                                        Iterator it13 = j.iterator();
                                        while (it13.hasNext()) {
                                            e1 e1Var = (e1) it13.next();
                                            if (!e1Var.i()) {
                                                arrayList8 = arrayList26;
                                                x12 x12Var2 = new x12(new q9k(e1Var.g()), new q9k(e1Var.l()), e1Var.j(), e1Var.k());
                                                ArrayList arrayList36 = new ArrayList(k13.r(j, 10));
                                                Iterator it14 = j.iterator();
                                                while (it14.hasNext()) {
                                                    e1 e1Var2 = (e1) it14.next();
                                                    e1Var2.getClass();
                                                    arrayList36.add(new x12(new q9k(e1Var2.g()), new q9k(e1Var2.l()), e1Var2.j(), e1Var2.k()));
                                                    it14 = it14;
                                                    x12Var2 = x12Var2;
                                                }
                                                x12 x12Var3 = x12Var2;
                                                m22 m22Var3 = new m22(b0iVar2.d(), b0iVar2.g() != 0 ? new q9k(b0iVar2.g()) : new m9k(""), arrayList36, x12Var3, x12Var3, false, false);
                                                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                                                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                                ArrayList arrayList37 = new ArrayList();
                                                Iterator it15 = arrayList34.iterator();
                                                while (it15.hasNext()) {
                                                    PlayerData playerData = (PlayerData) it15.next();
                                                    Iterator it16 = it15;
                                                    PlayerEventStatistics statistics2 = playerData.getStatistics();
                                                    if (!(statistics2 instanceof BaseballPlayerEventStatistics)) {
                                                        statistics2 = null;
                                                    }
                                                    BaseballPlayerEventStatistics baseballPlayerEventStatistics3 = (BaseballPlayerEventStatistics) statistics2;
                                                    if (baseballPlayerEventStatistics3 != null) {
                                                        arrayList12 = arrayList27;
                                                        str5 = str8;
                                                        ArrayList arrayList38 = new ArrayList(k13.r(j, 10));
                                                        for (Iterator it17 = j.iterator(); it17.hasNext(); it17 = it17) {
                                                            e1 e1Var3 = (e1) it17.next();
                                                            arrayList38.add(new y12(new q9k(e1Var3.g()), new q9k(e1Var3.l()), e1Var3.j(), e1Var3.k(), (String) e1Var3.d().invoke(baseballPlayerEventStatistics3), ((Number) e1Var3.h().invoke(baseballPlayerEventStatistics3)).doubleValue()));
                                                        }
                                                        if (b0iVar2 == u71.d) {
                                                            Iterator it18 = arrayList38.iterator();
                                                            int i5 = 0;
                                                            while (it18.hasNext()) {
                                                                Object next4 = it18.next();
                                                                int i6 = i5 + 1;
                                                                if (i5 < 0) {
                                                                    b.q();
                                                                    throw null;
                                                                }
                                                                Iterator it19 = it18;
                                                                y12 y12Var = (y12) next4;
                                                                BaseballPlayerEventStatistics baseballPlayerEventStatistics4 = baseballPlayerEventStatistics3;
                                                                ArrayList arrayList39 = arrayList38;
                                                                ArrayList arrayList40 = arrayList25;
                                                                Pair pair = new Pair(y12Var.e, y12Var.f);
                                                                if (((e1) j.get(i5)).n()) {
                                                                    linkedHashMap4.put(pair, Double.valueOf(yid.k((Double) linkedHashMap4.get(pair)) + y12Var.j));
                                                                    Unit unit = Unit.a;
                                                                } else {
                                                                    linkedHashMap4.putIfAbsent(pair, valueOf);
                                                                }
                                                                baseballPlayerEventStatistics3 = baseballPlayerEventStatistics4;
                                                                i5 = i6;
                                                                it18 = it19;
                                                                arrayList38 = arrayList39;
                                                                arrayList25 = arrayList40;
                                                            }
                                                            arrayList11 = arrayList25;
                                                            baseballPlayerEventStatistics = baseballPlayerEventStatistics3;
                                                            arrayList14 = arrayList38;
                                                        } else {
                                                            arrayList11 = arrayList25;
                                                            baseballPlayerEventStatistics = baseballPlayerEventStatistics3;
                                                            arrayList14 = arrayList38;
                                                            if (b0iVar2 == u71.e) {
                                                                Iterator it20 = arrayList14.iterator();
                                                                int i7 = 0;
                                                                while (it20.hasNext()) {
                                                                    Object next5 = it20.next();
                                                                    int i8 = i7 + 1;
                                                                    if (i7 < 0) {
                                                                        b.q();
                                                                        throw null;
                                                                    }
                                                                    y12 y12Var2 = (y12) next5;
                                                                    r9k r9kVar = y12Var2.e;
                                                                    LinkedHashMap linkedHashMap7 = linkedHashMap4;
                                                                    ArrayList arrayList41 = w0;
                                                                    double d = y12Var2.j;
                                                                    Iterator it21 = it20;
                                                                    Pair pair2 = new Pair(r9kVar, y12Var2.f);
                                                                    if (i7 == 0) {
                                                                        linkedHashMap5.put(pair2, Double.valueOf(yid.k((Double) linkedHashMap5.get(pair2)) + ((int) d) + ((d % 1.0d) * 3.3333333333333335d)));
                                                                        Unit unit2 = Unit.a;
                                                                    } else if (((e1) j.get(i7)).n()) {
                                                                        linkedHashMap5.put(pair2, Double.valueOf(yid.k((Double) linkedHashMap5.get(pair2)) + d));
                                                                        Unit unit3 = Unit.a;
                                                                    } else {
                                                                        linkedHashMap5.putIfAbsent(pair2, valueOf);
                                                                    }
                                                                    i7 = i8;
                                                                    it20 = it21;
                                                                    w0 = arrayList41;
                                                                    linkedHashMap4 = linkedHashMap7;
                                                                }
                                                            } else {
                                                                linkedHashMap2 = linkedHashMap4;
                                                                arrayList10 = w0;
                                                                Iterator it22 = arrayList14.iterator();
                                                                int i9 = 0;
                                                                while (it22.hasNext()) {
                                                                    Object next6 = it22.next();
                                                                    int i10 = i9 + 1;
                                                                    if (i9 < 0) {
                                                                        b.q();
                                                                        throw null;
                                                                    }
                                                                    y12 y12Var3 = (y12) next6;
                                                                    Pair pair3 = new Pair(y12Var3.e, y12Var3.f);
                                                                    if (((e1) j.get(i9)).n()) {
                                                                        arrayList15 = j;
                                                                        it = it22;
                                                                        linkedHashMap6.put(pair3, Double.valueOf(yid.k((Double) linkedHashMap6.get(pair3)) + y12Var3.j));
                                                                        Unit unit4 = Unit.a;
                                                                    } else {
                                                                        arrayList15 = j;
                                                                        it = it22;
                                                                        linkedHashMap6.putIfAbsent(pair3, valueOf);
                                                                    }
                                                                    j = arrayList15;
                                                                    i9 = i10;
                                                                    it22 = it;
                                                                }
                                                                arrayList13 = j;
                                                                baseballAllPositions = playerData.getBaseballAllPositions();
                                                                BaseballPlayerEventStatistics baseballPlayerEventStatistics5 = baseballPlayerEventStatistics;
                                                                Player player = playerData.getPlayer();
                                                                String jerseyNumber = playerData.getJerseyNumber();
                                                                if (baseballAllPositions == null) {
                                                                    x12Var = x12Var3;
                                                                    list = baseballAllPositions.getRoles();
                                                                } else {
                                                                    x12Var = x12Var3;
                                                                    list = null;
                                                                }
                                                                m22 m22Var4 = m22Var3;
                                                                i22 i22Var3 = new i22(m22Var4, player, jerseyNumber, list, playerData.getPosition(), playerData.getSubstitute(), playerData.getCaptain(), playerData.getInPlay(), arrayList14, x12Var, (baseballAllPositions != null || (battingOrder = baseballAllPositions.getBattingOrder()) == null || battingOrder.intValue() <= 0) ? null : battingOrder, (baseballAllPositions == null && (sequence = baseballAllPositions.getSequence()) != null && yid.m(baseballAllPositions.getBattingOrder()) == 0) ? sequence : null, baseballPlayerEventStatistics5.getRating(), playerData.getTeamId(), playerData.getEjected(), 61440);
                                                                m22Var = m22Var4;
                                                                x12Var3 = x12Var;
                                                                i22Var = i22Var3;
                                                            }
                                                        }
                                                        linkedHashMap2 = linkedHashMap4;
                                                        arrayList10 = w0;
                                                        arrayList13 = j;
                                                        baseballAllPositions = playerData.getBaseballAllPositions();
                                                        BaseballPlayerEventStatistics baseballPlayerEventStatistics52 = baseballPlayerEventStatistics;
                                                        Player player2 = playerData.getPlayer();
                                                        String jerseyNumber2 = playerData.getJerseyNumber();
                                                        if (baseballAllPositions == null) {
                                                        }
                                                        m22 m22Var42 = m22Var3;
                                                        i22 i22Var32 = new i22(m22Var42, player2, jerseyNumber2, list, playerData.getPosition(), playerData.getSubstitute(), playerData.getCaptain(), playerData.getInPlay(), arrayList14, x12Var, (baseballAllPositions != null || (battingOrder = baseballAllPositions.getBattingOrder()) == null || battingOrder.intValue() <= 0) ? null : battingOrder, (baseballAllPositions == null && (sequence = baseballAllPositions.getSequence()) != null && yid.m(baseballAllPositions.getBattingOrder()) == 0) ? sequence : null, baseballPlayerEventStatistics52.getRating(), playerData.getTeamId(), playerData.getEjected(), 61440);
                                                        m22Var = m22Var42;
                                                        x12Var3 = x12Var;
                                                        i22Var = i22Var32;
                                                    } else {
                                                        linkedHashMap2 = linkedHashMap4;
                                                        arrayList10 = w0;
                                                        arrayList11 = arrayList25;
                                                        arrayList12 = arrayList27;
                                                        str5 = str8;
                                                        arrayList13 = j;
                                                        m22Var = m22Var3;
                                                        i22Var = null;
                                                    }
                                                    if (i22Var != null) {
                                                        arrayList37.add(i22Var);
                                                    }
                                                    m22Var3 = m22Var;
                                                    j = arrayList13;
                                                    str8 = str5;
                                                    it15 = it16;
                                                    arrayList27 = arrayList12;
                                                    arrayList25 = arrayList11;
                                                    w0 = arrayList10;
                                                    linkedHashMap4 = linkedHashMap2;
                                                }
                                                LinkedHashMap linkedHashMap8 = linkedHashMap4;
                                                arrayList6 = w0;
                                                arrayList7 = arrayList25;
                                                arrayList9 = arrayList27;
                                                str4 = str8;
                                                m22 m22Var5 = m22Var3;
                                                if (b0iVar2 == u71.d) {
                                                    String string = i4.getString(R.string.total);
                                                    string.getClass();
                                                    zm1Var = new zm1(m22Var5, string, fcp.h0(linkedHashMap8, false));
                                                } else if (b0iVar2 == u71.e) {
                                                    String string2 = i4.getString(R.string.total);
                                                    string2.getClass();
                                                    zm1Var = new zm1(m22Var5, string2, fcp.h0(linkedHashMap5, true));
                                                } else if (b0iVar2 == u71.f) {
                                                    String string3 = i4.getString(R.string.total);
                                                    string3.getClass();
                                                    zm1Var = new zm1(m22Var5, string3, fcp.h0(linkedHashMap6, false));
                                                } else {
                                                    zm1Var = null;
                                                }
                                                k22Var = new k22(m22Var5, arrayList37, zm1Var);
                                                if (k22Var == null) {
                                                    arrayList33.add(k22Var);
                                                }
                                                str8 = str4;
                                                it10 = it11;
                                                str7 = str3;
                                                g = linkedHashMap;
                                                arrayList26 = arrayList8;
                                                arrayList27 = arrayList9;
                                                arrayList25 = arrayList7;
                                                w0 = arrayList6;
                                            }
                                        }
                                        ogj.m("Collection contains no element matching the predicate.");
                                        return null;
                                    }
                                    arrayList6 = w0;
                                    arrayList7 = arrayList25;
                                    arrayList8 = arrayList26;
                                    arrayList9 = arrayList27;
                                } else {
                                    arrayList6 = w0;
                                    linkedHashMap = g;
                                    arrayList7 = arrayList25;
                                    arrayList8 = arrayList26;
                                    arrayList9 = arrayList27;
                                    str3 = str7;
                                }
                                str4 = str8;
                                k22Var = null;
                                if (k22Var == null) {
                                }
                                str8 = str4;
                                it10 = it11;
                                str7 = str3;
                                g = linkedHashMap;
                                arrayList26 = arrayList8;
                                arrayList27 = arrayList9;
                                arrayList25 = arrayList7;
                                w0 = arrayList6;
                            }
                            arrayList = w0;
                            arrayList2 = arrayList25;
                            arrayList3 = arrayList26;
                            arrayList4 = arrayList27;
                            str = str7;
                            str2 = str8;
                            p22Var2 = new p22(arrayList33);
                            arrayList5 = arrayList;
                            if (p22Var2 != null) {
                            }
                            str8 = str2;
                            arrayList17 = arrayList4;
                            arrayList18 = arrayList2;
                        } else {
                            arrayList2 = arrayList25;
                            arrayList3 = arrayList26;
                            arrayList4 = arrayList27;
                            str = "event";
                            str2 = Sports.BASEBALL;
                            arrayList5 = w0;
                            p22Var2 = p22Var;
                            if (p22Var2 != null) {
                            }
                            str8 = str2;
                            arrayList17 = arrayList4;
                            arrayList18 = arrayList2;
                        }
                    }
                    break;
                case -1160328212:
                    if (s2.equals(Sports.VOLLEYBALL)) {
                        b0i b0iVar3 = this.n;
                        if (b0iVar3 == null) {
                            b0iVar3 = null;
                        }
                        if (b0iVar3 != null) {
                            hv5 hv5Var = (hv5) this.r.d();
                            List list4 = hv5Var != null ? hv5Var.c : null;
                            if (list4 == null) {
                                list4 = null;
                            }
                            List c2 = a.c(b0iVar3);
                            LinkedHashMap g2 = wib.g(w0, c2);
                            if (list4 != null) {
                                if (b0iVar3 == qwk.e) {
                                    list4 = null;
                                }
                                if (list4 != null) {
                                    arrayList16 = new ArrayList();
                                    for (Object obj : list4) {
                                        Lineups lineups5 = lineups3;
                                        Lineups lineups6 = lineups4;
                                        b0i b0iVar4 = b0iVar3;
                                        if (b0iVar4.i().contains((e1) obj)) {
                                            arrayList16.add(obj);
                                        }
                                        b0iVar3 = b0iVar4;
                                        lineups3 = lineups5;
                                        lineups4 = lineups6;
                                    }
                                    lineups = lineups3;
                                    lineups2 = lineups4;
                                    p22Var2 = new p22(wib.u(c2, g2, false, arrayList16));
                                    arrayList5 = w0;
                                    arrayList2 = arrayList25;
                                    arrayList3 = arrayList26;
                                    arrayList4 = arrayList27;
                                    str = "event";
                                    str2 = Sports.BASEBALL;
                                    if (p22Var2 != null) {
                                    }
                                    str8 = str2;
                                    arrayList17 = arrayList4;
                                    arrayList18 = arrayList2;
                                    break;
                                }
                            }
                            lineups = lineups3;
                            lineups2 = lineups4;
                            arrayList16 = null;
                            p22Var2 = new p22(wib.u(c2, g2, false, arrayList16));
                            arrayList5 = w0;
                            arrayList2 = arrayList25;
                            arrayList3 = arrayList26;
                            arrayList4 = arrayList27;
                            str = "event";
                            str2 = Sports.BASEBALL;
                            if (p22Var2 != null) {
                            }
                            str8 = str2;
                            arrayList17 = arrayList4;
                            arrayList18 = arrayList2;
                        } else {
                            p22Var = null;
                            lineups = lineups3;
                            lineups2 = lineups4;
                            arrayList5 = w0;
                            arrayList2 = arrayList25;
                            arrayList3 = arrayList26;
                            arrayList4 = arrayList27;
                            str = "event";
                            str2 = Sports.BASEBALL;
                            p22Var2 = p22Var;
                            if (p22Var2 != null) {
                            }
                            str8 = str2;
                            arrayList17 = arrayList4;
                            arrayList18 = arrayList2;
                        }
                    }
                    p22Var = null;
                    arrayList = w0;
                    lineups = lineups3;
                    lineups2 = lineups4;
                    arrayList2 = arrayList25;
                    arrayList3 = arrayList26;
                    arrayList4 = arrayList27;
                    str = "event";
                    str2 = Sports.BASEBALL;
                    p22Var2 = p22Var;
                    arrayList5 = arrayList;
                    if (p22Var2 != null) {
                    }
                    str8 = str2;
                    arrayList17 = arrayList4;
                    arrayList18 = arrayList2;
                    break;
                case -83759494:
                    if (s2.equals(Sports.AMERICAN_FOOTBALL)) {
                        kp5 kp5Var2 = lp.e;
                        p22Var2 = new p22(wib.u(kp5Var2, wib.g(w0, kp5Var2), v, null));
                        arrayList5 = w0;
                        lineups = lineups3;
                        lineups2 = lineups4;
                        arrayList2 = arrayList25;
                        arrayList3 = arrayList26;
                        arrayList4 = arrayList27;
                        str = "event";
                        str2 = Sports.BASEBALL;
                        if (p22Var2 != null) {
                        }
                        str8 = str2;
                        arrayList17 = arrayList4;
                        arrayList18 = arrayList2;
                        break;
                    }
                    p22Var = null;
                    arrayList = w0;
                    lineups = lineups3;
                    lineups2 = lineups4;
                    arrayList2 = arrayList25;
                    arrayList3 = arrayList26;
                    arrayList4 = arrayList27;
                    str = "event";
                    str2 = Sports.BASEBALL;
                    p22Var2 = p22Var;
                    arrayList5 = arrayList;
                    if (p22Var2 != null) {
                    }
                    str8 = str2;
                    arrayList17 = arrayList4;
                    arrayList18 = arrayList2;
                    break;
                case 1767150:
                    if (s2.equals(Sports.HANDBALL)) {
                        kp5 kp5Var3 = e69.e;
                        p22Var2 = new p22(wib.u(kp5Var3, wib.g(w0, kp5Var3), v, null));
                        arrayList5 = w0;
                        lineups = lineups3;
                        lineups2 = lineups4;
                        arrayList2 = arrayList25;
                        arrayList3 = arrayList26;
                        arrayList4 = arrayList27;
                        str = "event";
                        str2 = Sports.BASEBALL;
                        if (p22Var2 != null) {
                        }
                        str8 = str2;
                        arrayList17 = arrayList4;
                        arrayList18 = arrayList2;
                        break;
                    }
                    p22Var = null;
                    arrayList = w0;
                    lineups = lineups3;
                    lineups2 = lineups4;
                    arrayList2 = arrayList25;
                    arrayList3 = arrayList26;
                    arrayList4 = arrayList27;
                    str = "event";
                    str2 = Sports.BASEBALL;
                    p22Var2 = p22Var;
                    arrayList5 = arrayList;
                    if (p22Var2 != null) {
                    }
                    str8 = str2;
                    arrayList17 = arrayList4;
                    arrayList18 = arrayList2;
                    break;
                case 108869083:
                    if (s2.equals(Sports.RUGBY)) {
                        kp5 kp5Var4 = l9g.d;
                        p22Var2 = new p22(wib.u(kp5Var4, wib.g(w0, kp5Var4), v, null));
                        arrayList5 = w0;
                        lineups = lineups3;
                        lineups2 = lineups4;
                        arrayList2 = arrayList25;
                        arrayList3 = arrayList26;
                        arrayList4 = arrayList27;
                        str = "event";
                        str2 = Sports.BASEBALL;
                        if (p22Var2 != null) {
                        }
                        str8 = str2;
                        arrayList17 = arrayList4;
                        arrayList18 = arrayList2;
                        break;
                    }
                    p22Var = null;
                    arrayList = w0;
                    lineups = lineups3;
                    lineups2 = lineups4;
                    arrayList2 = arrayList25;
                    arrayList3 = arrayList26;
                    arrayList4 = arrayList27;
                    str = "event";
                    str2 = Sports.BASEBALL;
                    p22Var2 = p22Var;
                    arrayList5 = arrayList;
                    if (p22Var2 != null) {
                    }
                    str8 = str2;
                    arrayList17 = arrayList4;
                    arrayList18 = arrayList2;
                    break;
                case 727149765:
                    if (s2.equals(Sports.BASKETBALL)) {
                        kp5 kp5Var5 = up1.d;
                        p22Var2 = new p22(wib.u(kp5Var5, wib.g(w0, kp5Var5), v, null));
                        arrayList5 = w0;
                        lineups = lineups3;
                        lineups2 = lineups4;
                        arrayList2 = arrayList25;
                        arrayList3 = arrayList26;
                        arrayList4 = arrayList27;
                        str = "event";
                        str2 = Sports.BASEBALL;
                        if (p22Var2 != null) {
                        }
                        str8 = str2;
                        arrayList17 = arrayList4;
                        arrayList18 = arrayList2;
                        break;
                    }
                    p22Var = null;
                    arrayList = w0;
                    lineups = lineups3;
                    lineups2 = lineups4;
                    arrayList2 = arrayList25;
                    arrayList3 = arrayList26;
                    arrayList4 = arrayList27;
                    str = "event";
                    str2 = Sports.BASEBALL;
                    p22Var2 = p22Var;
                    arrayList5 = arrayList;
                    if (p22Var2 != null) {
                    }
                    str8 = str2;
                    arrayList17 = arrayList4;
                    arrayList18 = arrayList2;
                    break;
                default:
                    p22Var = null;
                    arrayList = w0;
                    lineups = lineups3;
                    lineups2 = lineups4;
                    arrayList2 = arrayList25;
                    arrayList3 = arrayList26;
                    arrayList4 = arrayList27;
                    str = "event";
                    str2 = Sports.BASEBALL;
                    p22Var2 = p22Var;
                    arrayList5 = arrayList;
                    if (p22Var2 != null) {
                    }
                    str8 = str2;
                    arrayList17 = arrayList4;
                    arrayList18 = arrayList2;
                    break;
            }
        } else {
            ArrayList arrayList42 = !w0.isEmpty() ? w0 : null;
            if (arrayList42 != null) {
                ArrayList l = b.l(new q9k(R.string.probable_pitchers));
                l.addAll(arrayList42);
                km5Var2 = l;
            } else {
                km5Var2 = null;
            }
            if (km5Var2 == null) {
                km5Var2 = km5.a;
            }
            arrayList26.addAll(km5Var2);
            arrayList5 = w0;
            lineups = lineups3;
            lineups2 = lineups4;
            arrayList3 = arrayList26;
            arrayList17 = arrayList27;
            str = "event";
            arrayList18 = arrayList25;
        }
        if (v(arrayList5)) {
            Event event4 = this.f;
            if (event4 == null) {
                Intrinsics.i(str);
                throw null;
            }
            UniqueTournament uniqueTournament = event4.getTournament().getUniqueTournament();
            arrayList18.add(Intrinsics.c(uniqueTournament != null ? uniqueTournament.getHasLiveRating() : null, Boolean.TRUE) ? ds1.LIVE : ds1.POST_MATCH_ONLY);
        }
        if (teamSelection != TeamSelection.Combined) {
            Event event5 = this.f;
            if (event5 == null) {
                Intrinsics.i(str);
                throw null;
            }
            if (!Intrinsics.c(ok3.s(event5), str8)) {
                List<MissingPlayerData> missingPlayers = lineups2.getMissingPlayers();
                if (missingPlayers != null) {
                    if (missingPlayers.isEmpty()) {
                        missingPlayers = null;
                    }
                    if (missingPlayers != null) {
                        ArrayList l2 = b.l(new q9k(R.string.injuries_and_suspensions));
                        l2.addAll(missingPlayers);
                        km5Var = l2;
                        if (km5Var == null) {
                            km5Var = km5.a;
                        }
                        arrayList22 = arrayList3;
                        arrayList22.addAll(km5Var);
                        return new q22(z, arrayList18, arrayList22, arrayList17);
                    }
                }
                km5Var = null;
                if (km5Var == null) {
                }
                arrayList22 = arrayList3;
                arrayList22.addAll(km5Var);
                return new q22(z, arrayList18, arrayList22, arrayList17);
            }
        }
        arrayList22 = arrayList3;
        if (teamSelection == TeamSelection.Second) {
            arrayList22.addAll(l(lineups.getMissingPlayers(), lineups2.getMissingPlayers()));
        } else {
            arrayList22.addAll(l(lineups2.getMissingPlayers(), lineups.getMissingPlayers()));
        }
        return new q22(z, arrayList18, arrayList22, arrayList17);
    }

    public final void m(boolean z, boolean z2) {
        int i;
        this.m = z;
        this.n = null;
        if (z2) {
            int i2 = this.p;
            if (z) {
                i = this.o;
            } else {
                Event event = this.f;
                if (event == null) {
                    Intrinsics.i("event");
                    throw null;
                }
                String s = ok3.s(event);
                s.getClass();
                i = s.equals(Sports.VOLLEYBALL) ? 4 : 3;
            }
            this.p = i;
            if (i == i2) {
                o(true);
            } else if (n(i)) {
                u();
            } else {
                o(true);
            }
        }
    }

    public final boolean n(int i) {
        ArrayList arrayList;
        Object obj;
        q22 q22Var = (q22) this.t.d();
        if (q22Var != null) {
            ArrayList arrayList2 = q22Var.b;
            arrayList = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof m22) {
                    arrayList.add(next);
                }
            }
        } else {
            arrayList = null;
        }
        HashMap hashMap = this.q;
        boolean z = false;
        for (String str : hashMap.keySet()) {
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (Intrinsics.c(str, ((m22) obj).a)) {
                        break;
                    }
                }
                m22 m22Var = (m22) obj;
                if (m22Var != null) {
                    x12 x12Var = (x12) hashMap.getOrDefault(str, m22Var.f);
                    ArrayList arrayList3 = m22Var.c;
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        x12 x12Var2 = (x12) next2;
                        if (this.m || !x12Var2.c()) {
                            arrayList4.add(next2);
                        }
                    }
                    int indexOf = arrayList4.indexOf(x12Var);
                    if (indexOf == -1 || indexOf >= i) {
                        hashMap.put(str, m22Var.h);
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public final void o(boolean z) {
        boolean t = t(this.i);
        boolean t2 = t(this.j);
        boolean t3 = t(this.k);
        if (z) {
            if (t || t2 || t3) {
                xw3.L(un0.z(this), null, null, new iv5(this, null, 0), 3);
            }
        }
    }

    public final boolean t(q22 q22Var) {
        if (q22Var == null) {
            return false;
        }
        ArrayList arrayList = q22Var.b;
        Iterator it = arrayList.iterator();
        int i = 0;
        boolean z = false;
        while (true) {
            boolean hasNext = it.hasNext();
            HashMap hashMap = this.q;
            boolean z2 = true;
            if (!hasNext) {
                Iterator it2 = q22Var.d.iterator();
                while (it2.hasNext()) {
                    m22 m22Var = ((z12) it2.next()).a;
                    x12 x12Var = (x12) hashMap.getOrDefault(m22Var.a, m22Var.f);
                    if (m22Var.e != this.p || !Intrinsics.c(m22Var.f, x12Var)) {
                        z = true;
                    }
                    m22Var.e = this.p;
                    x12Var.getClass();
                    m22Var.f = x12Var;
                }
                return z;
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            if (next instanceof i22) {
                boolean z3 = (CollectionsKt.a0(i + (-1), arrayList) instanceof i22) || (CollectionsKt.a0(i2, arrayList) instanceof i22);
                i22 i22Var = (i22) next;
                Object orDefault = hashMap.getOrDefault(i22Var.m.a, i22Var.v);
                x12 x12Var2 = (x12) (z3 ? orDefault : null);
                if (i22Var.y != this.p || !Intrinsics.c(i22Var.v, x12Var2) || i22Var.z != this.m) {
                    z = true;
                }
                i22Var.y = this.p;
                i22Var.v = x12Var2;
                i22Var.z = this.m;
            }
            if (next instanceof m22) {
                m22 m22Var2 = (m22) next;
                x12 x12Var3 = (x12) hashMap.getOrDefault(m22Var2.a, m22Var2.f);
                if (m22Var2.e == this.p && Intrinsics.c(m22Var2.f, x12Var3)) {
                    z2 = z;
                }
                m22Var2.e = this.p;
                x12Var3.getClass();
                m22Var2.f = x12Var3;
                m22Var2.g = this.m;
                z = z2;
            }
            i = i2;
        }
    }

    public final void u() {
        xoe xoeVar;
        ArrayList arrayList;
        List<BaseballRole> roles;
        ArrayList arrayList2;
        List<BaseballRole> roles2;
        LineupsResponse lineupsResponse = this.g;
        if (lineupsResponse != null) {
            ArrayList arrayList3 = this.h;
            arrayList3.clear();
            Event event = this.f;
            rq3 rq3Var = null;
            if (event == null) {
                Intrinsics.i("event");
                throw null;
            }
            int i = 1;
            int id = Event.getHomeTeam$default(event, null, 1, null).getId();
            Event event2 = this.f;
            if (event2 == null) {
                Intrinsics.i("event");
                throw null;
            }
            int id2 = Event.getAwayTeam$default(event2, null, 1, null).getId();
            q22 k = k(new yz1(id, LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null)), lineupsResponse.getConfirmed(), new yz1(id2, LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null)), TeamSelection.First);
            ArrayList arrayList4 = k.b;
            ArrayList arrayList5 = new ArrayList();
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof i22) {
                    arrayList5.add(next);
                }
            }
            ArrayList arrayList6 = new ArrayList(k13.r(arrayList5, 10));
            Iterator it2 = arrayList5.iterator();
            while (it2.hasNext()) {
                arrayList6.add(Integer.valueOf(((i22) it2.next()).n.getId()));
            }
            arrayList3.addAll(arrayList6);
            this.i = k;
            q22 k2 = k(new yz1(id2, LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null)), lineupsResponse.getConfirmed(), new yz1(id, LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null)), TeamSelection.Second);
            ArrayList arrayList7 = k2.b;
            ArrayList arrayList8 = new ArrayList();
            Iterator it3 = arrayList7.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                if (next2 instanceof i22) {
                    arrayList8.add(next2);
                }
            }
            ArrayList arrayList9 = new ArrayList(k13.r(arrayList8, 10));
            Iterator it4 = arrayList8.iterator();
            while (it4.hasNext()) {
                arrayList9.add(Integer.valueOf(((i22) it4.next()).n.getId()));
            }
            arrayList3.addAll(arrayList9);
            this.j = k2;
            this.k = k(new yz1(id, LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null)), lineupsResponse.getConfirmed(), new yz1(id2, LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null)), TeamSelection.Combined);
            o(false);
            LineupsResponse lineupsResponse2 = this.g;
            if (lineupsResponse2 != null) {
                List<PlayerData> players = LineupsResponse.getHomeLineups$default(lineupsResponse2, null, 1, null).getPlayers();
                int c = sub.c(k13.r(players, 10));
                if (c < 16) {
                    c = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(c);
                for (Object obj : players) {
                    linkedHashMap.put(Integer.valueOf(((PlayerData) obj).getPlayer().getId()), obj);
                }
                List<PlayerData> players2 = LineupsResponse.getAwayLineups$default(lineupsResponse2, null, 1, null).getPlayers();
                int c2 = sub.c(k13.r(players2, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(c2 >= 16 ? c2 : 16);
                for (Object obj2 : players2) {
                    linkedHashMap2.put(Integer.valueOf(((PlayerData) obj2).getPlayer().getId()), obj2);
                }
                ArrayList arrayList10 = new ArrayList();
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    int intValue = ((Number) it5.next()).intValue();
                    PlayerData playerData = (PlayerData) linkedHashMap.get(Integer.valueOf(intValue));
                    if (playerData != null) {
                        Player player = playerData.getPlayer();
                        PlayerEventStatistics statistics = playerData.getStatistics();
                        Double rating = statistics != null ? statistics.getRating() : null;
                        String position = playerData.getPosition();
                        Event event3 = this.f;
                        if (event3 == null) {
                            Intrinsics.i("event");
                            throw null;
                        }
                        Team homeTeam$default = Event.getHomeTeam$default(event3, null, 1, null);
                        BaseballAdditionalPlayerData baseballAllPositions = playerData.getBaseballAllPositions();
                        if (baseballAllPositions == null || (roles2 = baseballAllPositions.getRoles()) == null) {
                            arrayList2 = null;
                        } else {
                            ArrayList arrayList11 = new ArrayList(k13.r(roles2, 10));
                            Iterator<T> it6 = roles2.iterator();
                            while (it6.hasNext()) {
                                arrayList11.add(((BaseballRole) it6.next()).getSerialName());
                            }
                            arrayList2 = arrayList11;
                        }
                        xoeVar = new xoe(player, null, rating, position, homeTeam$default, 1, arrayList2);
                    } else {
                        PlayerData playerData2 = (PlayerData) linkedHashMap2.get(Integer.valueOf(intValue));
                        if (playerData2 != null) {
                            Player player2 = playerData2.getPlayer();
                            PlayerEventStatistics statistics2 = playerData2.getStatistics();
                            Double rating2 = statistics2 != null ? statistics2.getRating() : null;
                            String position2 = playerData2.getPosition();
                            Event event4 = this.f;
                            if (event4 == null) {
                                Intrinsics.i("event");
                                throw null;
                            }
                            Team awayTeam$default = Event.getAwayTeam$default(event4, null, 1, null);
                            BaseballAdditionalPlayerData baseballAllPositions2 = playerData2.getBaseballAllPositions();
                            if (baseballAllPositions2 == null || (roles = baseballAllPositions2.getRoles()) == null) {
                                arrayList = null;
                            } else {
                                ArrayList arrayList12 = new ArrayList(k13.r(roles, 10));
                                Iterator<T> it7 = roles.iterator();
                                while (it7.hasNext()) {
                                    arrayList12.add(((BaseballRole) it7.next()).getSerialName());
                                }
                                arrayList = arrayList12;
                            }
                            xoeVar = new xoe(player2, null, rating2, position2, awayTeam$default, 2, arrayList);
                        } else {
                            xoeVar = null;
                        }
                    }
                    if (xoeVar != null) {
                        arrayList10.add(xoeVar);
                    }
                }
                this.x = arrayList10;
            }
            xw3.L(un0.z(this), null, null, new iv5(this, rq3Var, i), 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r8 != null ? r8.getHasLiveRating() : null, r5) == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v(ArrayList arrayList) {
        Boolean bool;
        Event event = this.f;
        if (event == null) {
            Intrinsics.i("event");
            throw null;
        }
        if (Intrinsics.c(ok3.s(event), Sports.BASKETBALL)) {
            Event event2 = this.f;
            if (event2 == null) {
                Intrinsics.i("event");
                throw null;
            }
            Tournament tournament = event2.getTournament();
            tournament.getClass();
            UniqueTournament uniqueTournament = tournament.getUniqueTournament();
            if (uniqueTournament != null) {
                Boolean hasLiveRating = uniqueTournament.getHasLiveRating();
                Boolean bool2 = Boolean.TRUE;
                bool = Boolean.valueOf(Intrinsics.c(hasLiveRating, bool2) || Intrinsics.c(uniqueTournament.getHasRating(), bool2));
            } else {
                bool = null;
            }
            Boolean bool3 = Boolean.TRUE;
            if (Intrinsics.c(bool, bool3)) {
                yea yeaVar = j58.a;
                if (j58.k()) {
                    Set a0 = ph0.a0(new String[]{StatusKt.STATUS_IN_PROGRESS, StatusKt.STATUS_SUSPENDED, StatusKt.STATUS_INTERRUPTED});
                    Event event3 = this.f;
                    if (event3 == null) {
                        Intrinsics.i("event");
                        throw null;
                    }
                    if (a0.contains(event3.getStatus().getType())) {
                        Event event4 = this.f;
                        if (event4 == null) {
                            Intrinsics.i("event");
                            throw null;
                        }
                        UniqueTournament uniqueTournament2 = event4.getTournament().getUniqueTournament();
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            PlayerEventStatistics statistics = ((PlayerData) it.next()).getStatistics();
                            if (yid.k(statistics != null ? statistics.getRating() : null) > 1.0E-4d) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
