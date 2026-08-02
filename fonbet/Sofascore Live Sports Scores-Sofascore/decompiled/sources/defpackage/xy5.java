package defpackage;

import android.content.Context;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.fantasy.FantasyLeagueConfig;
import com.sofascore.model.fantasy.FantasyRoundPlayer;
import com.sofascore.model.fantasy.FantasyRoundPlayerStatistics;
import com.sofascore.model.fantasy.FantasyTeamOfTheRoundResponse;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Transfer;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.TeamAchievementsResponse;
import com.sofascore.model.newNetwork.TransferHistoryResponse;
import com.sofascore.model.newNetwork.UniqueTournamentAchievements;
import com.sofascore.model.newNetwork.mediaposts.PersonalizedMediaPost;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xy5 extends hoi implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int r;
    public Object s;
    public int t;
    public int u;
    public Object v;
    public int w;
    public Object x;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy5(dz5 dz5Var, int i, int i2, Event event, Integer num, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 0;
        this.y = dz5Var;
        this.u = i;
        this.w = i2;
        this.z = event;
        this.A = num;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.A;
        switch (i) {
            case 0:
                xy5 xy5Var = new xy5((dz5) this.y, this.u, this.w, (Event) this.z, (Integer) obj2, rq3Var);
                xy5Var.v = obj;
                return xy5Var;
            case 1:
                xy5 xy5Var2 = new xy5((nr6) obj2, this.w, rq3Var, 1);
                xy5Var2.v = obj;
                return xy5Var2;
            case 2:
                xy5 xy5Var3 = new xy5(this.u, this.w, rq3Var, (tj7) obj2);
                xy5Var3.z = obj;
                return xy5Var3;
            case 3:
                xy5 xy5Var4 = new xy5((qx7) obj2, this.w, rq3Var, 3);
                xy5Var4.v = obj;
                return xy5Var4;
            case 4:
                xy5 xy5Var5 = new xy5((sy8) this.y, (Context) this.z, (int[]) obj2, rq3Var);
                xy5Var5.v = obj;
                return xy5Var5;
            default:
                xy5 xy5Var6 = new xy5((Integer) obj2, (ord) this.y, (qqe) this.z, this.u, this.w, rq3Var);
                xy5Var6.v = obj;
                return xy5Var6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((xy5) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x02bd, code lost:
    
        if (r5 == r6) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x046c, code lost:
    
        if (r1 == r6) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ab, code lost:
    
        if (r3 == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x05c4, code lost:
    
        if (r1 == r4) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x05aa, code lost:
    
        if (r3 == r4) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        if (r3 == r2) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017e  */
    /* JADX WARN: Type inference failed for: r10v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v29, types: [int] */
    /* JADX WARN: Type inference failed for: r5v14, types: [int] */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0118 -> B:38:0x011b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x020c -> B:52:0x0210). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        av4 t;
        Object w;
        List<UniqueTournamentAchievements> achievements;
        Object T;
        gv9 gv9Var;
        Object obj2;
        boolean z;
        fo1 fo1Var;
        av4 t2;
        Object w2;
        gv9 gv9Var2;
        ?? r5;
        Object T2;
        fo1 fo1Var2;
        FantasyTeamOfTheRoundResponse fantasyTeamOfTheRoundResponse;
        av4 t3;
        zu4 t4;
        Object w3;
        Object T3;
        zu4 zu4Var;
        Map map;
        List list;
        LinkedHashMap linkedHashMap;
        Map map2;
        Object T4;
        Map map3;
        Map map4;
        Object R;
        List arrayList;
        List list2;
        int i;
        Set set;
        Context context;
        int length;
        sy8 sy8Var;
        int[] iArr;
        av4 t5;
        Object w4;
        av4 av4Var;
        List<Transfer> list3;
        Object T5;
        TransferHistoryResponse transferHistoryResponse;
        int i2 = this.r;
        int i3 = 0;
        Object obj3 = this.A;
        nl7 nl7Var = null;
        switch (i2) {
            case 0:
                dz5 dz5Var = (dz5) this.y;
                ku3 ku3Var = (ku3) this.v;
                lu3 lu3Var = lu3.a;
                int i4 = this.t;
                if (i4 == 0) {
                    y6a.M(obj);
                    av4 t6 = xw3.t(ku3Var, null, new vy5(dz5Var, this.u, r10, 3), 3);
                    t = xw3.t(ku3Var, null, new vy5(dz5Var, this.w, r10, 2), 3);
                    this.v = null;
                    this.s = t;
                    this.t = 1;
                    w = t6.w(this);
                    break;
                } else if (i4 == 1) {
                    t = (av4) this.s;
                    y6a.M(obj);
                    w = obj;
                } else if (i4 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    List<UniqueTournamentAchievements> list4 = (List) this.x;
                    y6a.M(obj);
                    achievements = list4;
                    T = obj;
                    TeamAchievementsResponse teamAchievementsResponse = (TeamAchievementsResponse) T;
                    List<UniqueTournamentAchievements> achievements2 = teamAchievementsResponse != null ? teamAchievementsResponse.getAchievements() : null;
                    Event event = (Event) this.z;
                    Integer num = (Integer) obj3;
                    int i5 = this.u;
                    int i6 = this.w;
                    if (achievements != null && achievements2 != null) {
                        UniqueTournament uniqueTournament = event.getTournament().getUniqueTournament();
                        boolean z2 = num != null && dz5.y(num.intValue(), achievements) > 0 && dz5.y(num.intValue(), achievements2) > 0;
                        if (!z2) {
                            if (dz5.v(achievements) > (Event.getHomeTeam$default(event, null, 1, null).getNational() ? 0 : 4)) {
                                if (dz5.v(achievements2) > (Event.getAwayTeam$default(event, null, 1, null).getNational() ? 0 : 4)) {
                                    i3 = 1;
                                }
                            }
                        }
                        if (z2) {
                            int intValue = new Integer(dz5.y(num.intValue(), achievements)).intValue();
                            int intValue2 = new Integer(dz5.y(num.intValue(), achievements2)).intValue();
                            r10 = uniqueTournament != null ? tba.x(uniqueTournament) : 0;
                            if (r10 == 0) {
                                r10 = "";
                            }
                            break;
                        } else if (i3 != 0) {
                            break;
                        }
                    }
                }
                TeamAchievementsResponse teamAchievementsResponse2 = (TeamAchievementsResponse) w;
                achievements = teamAchievementsResponse2 != null ? teamAchievementsResponse2.getAchievements() : null;
                this.v = null;
                this.s = null;
                this.x = achievements;
                this.t = 2;
                T = t.T(this);
                break;
            case 1:
                int i7 = this.w;
                nr6 nr6Var = (nr6) obj3;
                ku3 ku3Var2 = (ku3) this.v;
                lu3 lu3Var2 = lu3.a;
                int i8 = this.u;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            gv9Var2 = (gv9) this.z;
                            fo1 fo1Var3 = (fo1) this.y;
                            gv9 gv9Var3 = (gv9) this.x;
                            y6a.M(obj);
                            gv9Var = gv9Var3;
                            fo1Var2 = fo1Var3;
                            T2 = obj;
                            fantasyTeamOfTheRoundResponse = (FantasyTeamOfTheRoundResponse) T2;
                            if (fantasyTeamOfTheRoundResponse != null) {
                                int score = fantasyTeamOfTheRoundResponse.getScore();
                                List<FantasyRoundPlayer> players = fantasyTeamOfTheRoundResponse.getPlayers();
                                ArrayList arrayList2 = new ArrayList(k13.r(players, 10));
                                Iterator it = players.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(hkg.g0((FantasyRoundPlayer) it.next(), nr6Var.i()));
                                }
                                nl7Var = new nl7(gv9Var, new ol7(fo1Var2, score, l6g.W(arrayList2), new pl7(fantasyTeamOfTheRoundResponse.getMaxScoreTeam().getTeamId(), fantasyTeamOfTheRoundResponse.getMaxScoreTeam().getScore(), fantasyTeamOfTheRoundResponse.getMaxScoreTeam().getNameCode()), new pl7(fantasyTeamOfTheRoundResponse.getMinScoreTeam().getTeamId(), fantasyTeamOfTheRoundResponse.getMinScoreTeam().getScore(), fantasyTeamOfTheRoundResponse.getMinScoreTeam().getNameCode())), gv9Var2, false);
                            }
                            nr6Var.n(hr6.a(nr6Var.k(), null, null, null, null, null, null, null, null, null, null, null, null, nl7Var, false, false, null, false, false, 1040383));
                            break;
                        } else {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        ?? r1 = this.t;
                        t2 = (av4) this.s;
                        fo1 fo1Var4 = (fo1) this.y;
                        gv9Var = (gv9) this.x;
                        y6a.M(obj);
                        fo1Var = fo1Var4;
                        z = r1;
                        w2 = obj;
                    }
                } else {
                    y6a.M(obj);
                    nl7 nl7Var2 = nr6Var.k().n;
                    if (nl7Var2 != null && (gv9Var = nl7Var2.a) != null) {
                        Iterator it2 = gv9Var.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj2 = it2.next();
                                if (((fo1) obj2).a == i7) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        fo1 fo1Var5 = (fo1) obj2;
                        if (fo1Var5 == null) {
                            break;
                        } else {
                            z = nr6Var.h.c.d == FantasyCompetitionType.WEEKLY;
                            nl7 nl7Var3 = nr6Var.k().n;
                            if (nl7Var3 != null) {
                                hr6 k = nr6Var.k();
                                ol7 ol7Var = nl7Var3.b;
                                int i9 = ol7Var.b;
                                gv9 gv9Var4 = ol7Var.c;
                                pl7 pl7Var = ol7Var.d;
                                pl7 pl7Var2 = ol7Var.e;
                                gv9Var4.getClass();
                                ol7 ol7Var2 = new ol7(fo1Var5, i9, gv9Var4, pl7Var, pl7Var2);
                                fo1Var = fo1Var5;
                                gv9 gv9Var5 = nl7Var3.a;
                                gv9 gv9Var6 = nl7Var3.c;
                                gv9Var5.getClass();
                                nr6Var.n(hr6.a(k, null, null, null, null, null, null, null, null, null, null, null, null, new nl7(gv9Var5, ol7Var2, gv9Var6, true), false, false, null, false, false, 1040383));
                            } else {
                                fo1Var = fo1Var5;
                            }
                            av4 p = yaa.p(ku3Var2, z, new jr6(nr6Var, i7, r10, i3));
                            t2 = xw3.t(ku3Var2, null, new jr6(nr6Var, i7, r10, 1), 3);
                            if (p != null) {
                                this.v = null;
                                this.x = gv9Var;
                                this.y = fo1Var;
                                this.s = t2;
                                this.t = z ? 1 : 0;
                                this.u = 1;
                                w2 = p.w(this);
                                lu3 lu3Var3 = lu3.a;
                                z = z;
                                break;
                            }
                            gv9Var2 = null;
                            fo1Var = fo1Var;
                            r5 = z;
                            this.v = null;
                            this.x = gv9Var;
                            this.y = fo1Var;
                            this.s = null;
                            this.z = gv9Var2;
                            this.t = r5;
                            this.u = 2;
                            T2 = t2.T(this);
                            if (T2 != lu3Var2) {
                                fo1Var2 = fo1Var;
                                fantasyTeamOfTheRoundResponse = (FantasyTeamOfTheRoundResponse) T2;
                                if (fantasyTeamOfTheRoundResponse != null) {
                                }
                                nr6Var.n(hr6.a(nr6Var.k(), null, null, null, null, null, null, null, null, null, null, null, null, nl7Var, false, false, null, false, false, 1040383));
                            }
                            break;
                        }
                    } else {
                        break;
                    }
                }
                List list5 = (List) w2;
                if (list5 != null) {
                    if (list5.isEmpty()) {
                        list5 = null;
                    }
                    if (list5 != null) {
                        gv9Var2 = l6g.W(list5);
                        r5 = z;
                        this.v = null;
                        this.x = gv9Var;
                        this.y = fo1Var;
                        this.s = null;
                        this.z = gv9Var2;
                        this.t = r5;
                        this.u = 2;
                        T2 = t2.T(this);
                        if (T2 != lu3Var2) {
                        }
                    }
                }
                gv9Var2 = null;
                fo1Var = fo1Var;
                r5 = z;
                this.v = null;
                this.x = gv9Var;
                this.y = fo1Var;
                this.s = null;
                this.z = gv9Var2;
                this.t = r5;
                this.u = 2;
                T2 = t2.T(this);
                if (T2 != lu3Var2) {
                }
                break;
            case 2:
                int i10 = this.w;
                int i11 = this.u;
                tj7 tj7Var = (tj7) obj3;
                ku3 ku3Var3 = (ku3) this.z;
                lu3 lu3Var4 = lu3.a;
                int i12 = this.t;
                rq3 rq3Var = null;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 == 4) {
                                    y6a.M(obj);
                                    break;
                                } else {
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                }
                            } else {
                                Map map5 = (Map) this.v;
                                Map map6 = (Map) this.y;
                                y6a.M(obj);
                                T4 = obj;
                                map4 = map5;
                                map3 = map6;
                                hs4 hs4Var = z45.a;
                                t53 t53Var = new t53(map3, (tj7) obj3, map4, (FantasyLeagueConfig) T4, (rq3) null);
                                this.z = null;
                                this.s = null;
                                this.x = null;
                                this.y = null;
                                this.v = null;
                                this.t = 4;
                                R = xw3.R(hs4Var, t53Var, this);
                                if (R != lu3Var4) {
                                }
                                break;
                            }
                        } else {
                            map = (Map) this.y;
                            zu4 zu4Var2 = (zu4) this.x;
                            y6a.M(obj);
                            zu4Var = zu4Var2;
                            T3 = obj;
                            list = (List) T3;
                            if (list == null) {
                                int c = sub.c(k13.r(list, 10));
                                if (c < 16) {
                                    c = 16;
                                }
                                linkedHashMap = new LinkedHashMap(c);
                                for (Object obj4 : list) {
                                    linkedHashMap.put(new Integer(((FantasyRoundPlayerStatistics) obj4).getFantasyPlayerId()), obj4);
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            if (linkedHashMap != null) {
                                map2 = lm5.a;
                                map2.getClass();
                            } else {
                                map2 = linkedHashMap;
                            }
                            this.z = null;
                            this.s = null;
                            this.x = null;
                            this.y = map;
                            this.v = map2;
                            this.t = 3;
                            T4 = zu4Var.T(this);
                            if (T4 != lu3Var4) {
                                map3 = map;
                                map4 = map2;
                                hs4 hs4Var2 = z45.a;
                                t53 t53Var2 = new t53(map3, (tj7) obj3, map4, (FantasyLeagueConfig) T4, (rq3) null);
                                this.z = null;
                                this.s = null;
                                this.x = null;
                                this.y = null;
                                this.v = null;
                                this.t = 4;
                                R = xw3.R(hs4Var2, t53Var2, this);
                                if (R != lu3Var4) {
                                }
                            }
                        }
                    } else {
                        t4 = (zu4) this.x;
                        av4 av4Var2 = (av4) this.s;
                        y6a.M(obj);
                        t3 = av4Var2;
                        w3 = obj;
                    }
                } else {
                    y6a.M(obj);
                    av4 t7 = xw3.t(ku3Var3, null, new du1(tj7Var, i11, i10, rq3Var, 2), 3);
                    t3 = xw3.t(ku3Var3, null, new oj7(i10, 1, rq3Var, tj7Var), 3);
                    t4 = xw3.t(ku3Var3, null, new oj7(i11, i3, rq3Var, tj7Var), 3);
                    this.z = null;
                    this.s = t3;
                    this.x = t4;
                    this.t = 1;
                    w3 = t7.w(this);
                    break;
                }
                Map map7 = (Map) w3;
                this.z = null;
                this.s = null;
                this.x = t4;
                this.y = map7;
                this.t = 2;
                T3 = t3.T(this);
                if (T3 != lu3Var4) {
                    zu4Var = t4;
                    map = map7;
                    list = (List) T3;
                    if (list == null) {
                    }
                    if (linkedHashMap != null) {
                    }
                    this.z = null;
                    this.s = null;
                    this.x = null;
                    this.y = map;
                    this.v = map2;
                    this.t = 3;
                    T4 = zu4Var.T(this);
                    if (T4 != lu3Var4) {
                    }
                }
                break;
            case 3:
                qx7 qx7Var = (qx7) obj3;
                a38 a38Var = qx7Var.d;
                ku3 ku3Var4 = (ku3) this.v;
                lu3 lu3Var5 = lu3.a;
                int i13 = this.u;
                if (i13 == 0) {
                    y6a.M(obj);
                    Set W0 = CollectionsKt.W0(a38Var.a.f);
                    List S0 = CollectionsKt.S0(a38Var.a.a);
                    arrayList = new ArrayList();
                    list2 = S0;
                    i = this.w;
                    set = W0;
                    if (arrayList.size() < 5) {
                    }
                } else if (i13 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    i = this.t;
                    List subList = (List) this.z;
                    arrayList = (List) this.y;
                    list2 = (List) this.x;
                    Set set2 = (Set) this.s;
                    y6a.M(obj);
                    Object u = obj;
                    set = set2;
                    arrayList.addAll(CollectionsKt.W((Iterable) u));
                    i += subList.size();
                    if (arrayList.size() < 5 || i >= list2.size()) {
                        break;
                    } else {
                        int size = (5 - arrayList.size()) + i;
                        int size2 = list2.size();
                        if (size > size2) {
                            size = size2;
                        }
                        subList = list2.subList(i, size);
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj5 : subList) {
                            PersonalizedMediaPost personalizedMediaPost = (PersonalizedMediaPost) obj5;
                            if (personalizedMediaPost.getId() != -99999 && !set.contains(new Integer(personalizedMediaPost.getId()))) {
                                arrayList3.add(obj5);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(k13.r(arrayList3, 10));
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            arrayList4.add(xw3.t(ku3Var4, null, new zi7((PersonalizedMediaPost) it3.next(), qx7Var, set, (rq3) null, 3), 3));
                        }
                        this.v = ku3Var4;
                        this.s = set;
                        this.x = list2;
                        this.y = arrayList;
                        this.z = subList;
                        this.t = i;
                        this.u = 1;
                        u = m6k.u(arrayList4, this);
                        if (u == lu3Var5) {
                            break;
                        }
                        arrayList.addAll(CollectionsKt.W((Iterable) u));
                        i += subList.size();
                        if (arrayList.size() < 5) {
                        }
                    }
                }
                break;
            case 4:
                Context context2 = (Context) this.z;
                sy8 sy8Var2 = (sy8) this.y;
                lu3 lu3Var6 = lu3.a;
                int i14 = this.w;
                if (i14 == 0) {
                    y6a.M(obj);
                    ku3 ku3Var5 = (ku3) this.v;
                    int i15 = sy8.b;
                    sy8Var2.b(ku3Var5, context2);
                    int[] iArr2 = (int[]) obj3;
                    context = context2;
                    length = iArr2.length;
                    sy8Var = sy8Var2;
                    iArr = iArr2;
                    if (i3 < length) {
                    }
                } else if (i14 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    length = this.u;
                    int i16 = this.t;
                    Context context3 = (Context) this.x;
                    sy8 sy8Var3 = (sy8) this.s;
                    iArr = (int[]) this.v;
                    y6a.M(obj);
                    i3 = i16 + 1;
                    context = context3;
                    sy8Var = sy8Var3;
                    if (i3 < length) {
                        int i17 = iArr[i3];
                        t01 a = sy8Var.a();
                        this.v = iArr;
                        this.s = sy8Var;
                        this.x = context;
                        this.t = i3;
                        this.u = length;
                        this.w = 1;
                        if (a.p(context, i17, this) == lu3Var6) {
                            break;
                        } else {
                            sy8Var3 = sy8Var;
                            context3 = context;
                            i16 = i3;
                            i3 = i16 + 1;
                            context = context3;
                            sy8Var = sy8Var3;
                            if (i3 < length) {
                                break;
                            }
                        }
                    }
                }
            default:
                qqe qqeVar = (qqe) this.z;
                ku3 ku3Var6 = (ku3) this.v;
                lu3 lu3Var7 = lu3.a;
                int i18 = this.t;
                if (i18 != 0) {
                    if (i18 != 1) {
                        if (i18 == 2) {
                            list3 = (List) this.x;
                            y6a.M(obj);
                            T5 = obj;
                            ((ord) this.y).invoke(new use(list3, (x2g) T5));
                            break;
                        } else {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        t5 = (av4) this.s;
                        y6a.M(obj);
                        w4 = obj;
                    }
                } else {
                    y6a.M(obj);
                    av4 t8 = Boolean.valueOf(((Integer) obj3) == null).equals(Boolean.TRUE) ? xw3.t(ku3Var6, null, new pqe(qqeVar, this.u, r10, i3), 3) : null;
                    t5 = xw3.t(ku3Var6, null, new gz6(qqeVar, this.u, this.w, (Integer) obj3, (rq3) null, 8), 3);
                    if (t8 != null) {
                        this.v = null;
                        this.s = t5;
                        this.t = 1;
                        w4 = t8.w(this);
                        break;
                    }
                    av4Var = t5;
                    list3 = null;
                    this.v = null;
                    this.s = null;
                    this.x = list3;
                    this.t = 2;
                    T5 = av4Var.T(this);
                    break;
                }
                x2g x2gVar = (x2g) w4;
                if (x2gVar != null && (transferHistoryResponse = (TransferHistoryResponse) yaa.x(x2gVar)) != null) {
                    List<Transfer> transferHistory = transferHistoryResponse.getTransferHistory();
                    av4Var = t5;
                    list3 = transferHistory;
                    this.v = null;
                    this.s = null;
                    this.x = list3;
                    this.t = 2;
                    T5 = av4Var.T(this);
                }
                av4Var = t5;
                list3 = null;
                this.v = null;
                this.s = null;
                this.x = list3;
                this.t = 2;
                T5 = av4Var.T(this);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy5(int i, int i2, rq3 rq3Var, tj7 tj7Var) {
        super(2, rq3Var);
        this.r = 2;
        this.A = tj7Var;
        this.u = i;
        this.w = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy5(sy8 sy8Var, Context context, int[] iArr, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 4;
        this.y = sy8Var;
        this.z = context;
        this.A = iArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy5(Integer num, ord ordVar, qqe qqeVar, int i, int i2, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 5;
        this.A = num;
        this.y = ordVar;
        this.z = qqeVar;
        this.u = i;
        this.w = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xy5(Object obj, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.A = obj;
        this.w = i;
    }
}
