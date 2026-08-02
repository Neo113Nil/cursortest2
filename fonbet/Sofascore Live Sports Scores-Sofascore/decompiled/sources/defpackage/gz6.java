package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.TvType;
import com.sofascore.model.fantasy.FantasyPlayerFixture;
import com.sofascore.model.fantasy.FantasyPlayerFormAndFixturesResponse;
import com.sofascore.model.fantasy.FantasyRound;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Round;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.newNetwork.TeamPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.TeamPlayerSeasonStatisticsRaw;
import com.sofascore.model.newNetwork.TeamPlayerSeasonStatisticsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentTeamsResponse;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.AmericanFootballPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.BasketballPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.FootballPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.FutsalPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.HandballPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.IceHockeyPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.MiniFootballPlayerSeasonStatistics;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gz6 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gz6(Object obj, int i, int i2, Object obj2, rq3 rq3Var, int i3) {
        super(2, rq3Var);
        this.r = i3;
        this.v = obj;
        this.t = i;
        this.u = i2;
        this.w = obj2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.w;
        switch (i) {
            case 0:
                return new gz6((jz6) obj2, this.t, this.u, rq3Var, 0);
            case 1:
                gz6 gz6Var = new gz6((ksa) obj2, this.t, this.u, rq3Var, 1);
                gz6Var.v = obj;
                return gz6Var;
            case 2:
                return new gz6((o4b) this.v, this.t, this.u, (String) obj2, rq3Var, 2);
            case 3:
                return new gz6((osb) this.v, this.t, (t6e) obj2, this.u, rq3Var, 3);
            case 4:
                return new gz6((u8c) this.v, this.t, this.u, (MediaPost) obj2, rq3Var, 4);
            case 5:
                return new gz6((u8c) this.v, this.t, this.u, (Event) obj2, rq3Var, 5);
            case 6:
                return new gz6((cnc) this.v, this.t, this.u, (g08) obj2, rq3Var, 6);
            case 7:
                return new gz6((fqe) this.v, this.t, this.u, (Event) obj2, rq3Var, 7);
            case 8:
                return new gz6((qqe) this.v, this.t, this.u, (Integer) obj2, rq3Var, 8);
            case 9:
                return new gz6((tyi) this.v, this.t, this.u, (String) obj2, rq3Var, 9);
            case 10:
                return new gz6((ksa) this.v, this.t, this.u, (Context) obj2, rq3Var, 10);
            default:
                return new gz6((vng) this.v, this.t, (TvType) obj2, this.u, rq3Var, 11);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
        }
        return ((gz6) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:338:0x03b4, code lost:
    
        if (r0 == r8) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x03a7, code lost:
    
        if (r5 == r8) goto L184;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0153 A[LOOP:0: B:41:0x014d->B:43:0x0153, LOOP_END] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object E;
        FantasyPlayerFormAndFixturesResponse fantasyPlayerFormAndFixturesResponse;
        Object i;
        int i2;
        Object J0;
        Object n;
        KSerializer serializer;
        List<TeamPlayerSeasonStatisticsRaw> playerStatistics;
        Object P;
        int i3 = this.r;
        int i4 = 26;
        Object[] objArr = 0;
        int i5 = this.t;
        int i6 = this.u;
        Object obj2 = this.w;
        Integer num = null;
        r11 = null;
        r11 = null;
        r11 = null;
        r11 = null;
        r11 = null;
        r11 = null;
        r11 = null;
        r11 = null;
        r11 = null;
        ArrayList arrayList = null;
        switch (i3) {
            case 0:
                wi7 wi7Var = ((jz6) obj2).e;
                lu3 lu3Var = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    E = wi7Var.E(i5, this);
                    break;
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        FantasyPlayerFormAndFixturesResponse fantasyPlayerFormAndFixturesResponse2 = (FantasyPlayerFormAndFixturesResponse) this.v;
                        y6a.M(obj);
                        fantasyPlayerFormAndFixturesResponse = fantasyPlayerFormAndFixturesResponse2;
                        i = obj;
                        List list = (List) i;
                        if (fantasyPlayerFormAndFixturesResponse == null) {
                            return null;
                        }
                        list.getClass();
                        ArrayList w0 = CollectionsKt.w0(fantasyPlayerFormAndFixturesResponse.getFixtures(), fantasyPlayerFormAndFixturesResponse.getForm());
                        ArrayList arrayList2 = new ArrayList(k13.r(w0, 10));
                        Iterator it = w0.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(s9a.D((FantasyPlayerFixture) it.next(), false));
                        }
                        List H0 = CollectionsKt.H0(arrayList2, new v66(23));
                        if (H0.isEmpty()) {
                            return null;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj3 : H0) {
                            Integer valueOf = Integer.valueOf(((FantasyPlayerFixtureUiModel) obj3).f);
                            Object obj4 = linkedHashMap.get(valueOf);
                            if (obj4 == null) {
                                obj4 = new ArrayList();
                                linkedHashMap.put(valueOf, obj4);
                            }
                            ((List) obj4).add(obj3);
                        }
                        IntRange intRange = new IntRange(((FantasyPlayerFixtureUiModel) CollectionsKt.Y(H0)).f, ((FantasyPlayerFixtureUiModel) CollectionsKt.h0(H0)).f, 1);
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj5 : list) {
                            int sequence = ((FantasyRound) obj5).getSequence();
                            if (intRange.a <= sequence && sequence <= intRange.b) {
                                arrayList3.add(obj5);
                            }
                        }
                        List<FantasyRound> H02 = CollectionsKt.H0(arrayList3, new v66(i4));
                        ArrayList arrayList4 = new ArrayList(k13.r(H02, 10));
                        for (FantasyRound fantasyRound : H02) {
                            Integer valueOf2 = Integer.valueOf(fantasyRound.getId());
                            int sequence2 = fantasyRound.getSequence();
                            String name = fantasyRound.getName();
                            Iterable iterable = (List) linkedHashMap.get(Integer.valueOf(fantasyRound.getSequence()));
                            if (iterable == null) {
                                iterable = km5.a;
                            }
                            arrayList4.add(new zd7(valueOf2, sequence2, name, l6g.W(CollectionsKt.H0(iterable, new v66(27)))));
                        }
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj6 : H0) {
                            if (Intrinsics.c(((FantasyPlayerFixtureUiModel) obj6).n, StatusKt.STATUS_FINISHED)) {
                                arrayList5.add(obj6);
                            }
                        }
                        Iterator it2 = arrayList5.iterator();
                        if (it2.hasNext()) {
                            Integer valueOf3 = Integer.valueOf(((FantasyPlayerFixtureUiModel) it2.next()).f);
                            while (true) {
                                num = valueOf3;
                                while (it2.hasNext()) {
                                    valueOf3 = Integer.valueOf(((FantasyPlayerFixtureUiModel) it2.next()).f);
                                    if (num.compareTo(valueOf3) < 0) {
                                        break;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            Object next = it3.next();
                            zd7 zd7Var = (zd7) next;
                            if (num != null && zd7Var.b <= num.intValue()) {
                                arrayList6.add(next);
                            }
                        }
                        List<zd7> H03 = CollectionsKt.H0(arrayList6, new v66(25));
                        ArrayList arrayList7 = new ArrayList();
                        Iterator it4 = arrayList4.iterator();
                        while (it4.hasNext()) {
                            Object next2 = it4.next();
                            zd7 zd7Var2 = (zd7) next2;
                            if (num == null || zd7Var2.b > num.intValue()) {
                                arrayList7.add(next2);
                            }
                        }
                        List<zd7> H04 = CollectionsKt.H0(arrayList7, new v66(24));
                        Iterator it5 = H03.iterator();
                        int i8 = 0;
                        while (it5.hasNext()) {
                            i8 += gvd.B((zd7) it5.next());
                        }
                        Iterator it6 = H04.iterator();
                        int i9 = 0;
                        while (it6.hasNext()) {
                            i9 += gvd.B((zd7) it6.next());
                        }
                        if (i8 >= 3 && i9 >= 3) {
                            i8 = 3;
                        } else if (i8 >= 3) {
                            i8 = 6 - i9;
                        }
                        int c = llf.c(i8, 0, 6);
                        xbb b = a.b();
                        int i10 = 0;
                        for (zd7 zd7Var3 : H03) {
                            int B = gvd.B(zd7Var3) + i10;
                            if (B > c) {
                                ArrayList U0 = CollectionsKt.U0(a.a(b));
                                int i11 = 6 - i10;
                                xbb b2 = a.b();
                                int i12 = 0;
                                for (zd7 zd7Var4 : H04) {
                                    int B2 = gvd.B(zd7Var4) + i12;
                                    if (B2 > i11) {
                                        ArrayList U02 = CollectionsKt.U0(a.a(b2));
                                        i2 = 6 - (i10 + i12);
                                        if (i2 > 0) {
                                            zd7 zd7Var5 = (zd7) CollectionsKt.a0(U0.size(), H03);
                                            zd7 zd7Var6 = (zd7) CollectionsKt.a0(U02.size(), H04);
                                            if (zd7Var5 != null && gvd.B(zd7Var5) <= i2) {
                                                U0.add(0, zd7Var5);
                                                i10 += gvd.B(zd7Var5);
                                            } else if (zd7Var6 != null && gvd.B(zd7Var6) <= i2) {
                                                U02.add(zd7Var6);
                                                i12 += gvd.B(zd7Var6);
                                            }
                                        }
                                        return new a07(l6g.W(U0), l6g.W(U02), i10, i12);
                                    }
                                    b2.add(zd7Var4);
                                    i12 = B2;
                                }
                                ArrayList U022 = CollectionsKt.U0(a.a(b2));
                                i2 = 6 - (i10 + i12);
                                if (i2 > 0) {
                                }
                                return new a07(l6g.W(U0), l6g.W(U022), i10, i12);
                            }
                            b.add(0, zd7Var3);
                            i10 = B;
                        }
                        ArrayList U03 = CollectionsKt.U0(a.a(b));
                        int i112 = 6 - i10;
                        xbb b22 = a.b();
                        int i122 = 0;
                        while (r8.hasNext()) {
                        }
                        ArrayList U0222 = CollectionsKt.U0(a.a(b22));
                        i2 = 6 - (i10 + i122);
                        if (i2 > 0) {
                        }
                        return new a07(l6g.W(U03), l6g.W(U0222), i10, i122);
                    }
                    y6a.M(obj);
                    E = obj;
                }
                fantasyPlayerFormAndFixturesResponse = (FantasyPlayerFormAndFixturesResponse) E;
                this.v = fantasyPlayerFormAndFixturesResponse;
                this.s = 2;
                i = wi7Var.i(i6, this);
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i13 = this.s;
                if (i13 == 0) {
                    y6a.M(obj);
                    ksa ksaVar = (ksa) obj2;
                    fsa fsaVar = new fsa((oug) this.v, ksaVar, objArr == true ? 1 : 0);
                    kx4 kx4Var = ((csa) ((eoh) ksaVar.f).getValue()).i;
                    this.s = 1;
                    if (wca.o(fsaVar, this.t, this.u, 100, kx4Var, this) == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i13 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 2:
                o4b o4bVar = (o4b) this.v;
                jof jofVar = o4bVar.f;
                lu3 lu3Var3 = lu3.a;
                int i14 = this.s;
                int i15 = this.t;
                if (i14 == 0) {
                    y6a.M(obj);
                    if (jofVar.a.getValue() instanceof unb) {
                        m4b m4bVar = (m4b) ((vnb) jofVar.a.getValue()).a();
                        gv9 gv9Var = m4bVar != null ? m4bVar.c : null;
                        if (gv9Var != null && !gv9Var.isEmpty()) {
                            return Unit.a;
                        }
                    }
                    w3b w3bVar = o4bVar.l;
                    this.s = 1;
                    J0 = w3bVar.J0(i15, i6, this);
                    if (J0 == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i14 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    J0 = obj;
                }
                UniqueTournamentTeamsResponse uniqueTournamentTeamsResponse = (UniqueTournamentTeamsResponse) J0;
                if (jofVar.a.getValue() instanceof unb) {
                    o4bVar.n(null, new uf8(i4, o4bVar, uniqueTournamentTeamsResponse));
                } else {
                    o4bVar.o(new yx4(i15, o4bVar, uniqueTournamentTeamsResponse, (String) obj2, 5));
                }
                return Unit.a;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i16 = this.s;
                if (i16 != 0) {
                    if (i16 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                zsb zsbVar = ((osb) this.v).e;
                String t6eVar = ((t6e) obj2).toString();
                this.s = 1;
                zsbVar.getClass();
                Object P2 = yaa.P(new lh7(zsbVar, this.t, t6eVar, this.u, (rq3) null, 3), this);
                return P2 == lu3Var4 ? lu3Var4 : P2;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i17 = this.s;
                if (i17 != 0) {
                    if (i17 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w3b w3bVar2 = ((u8c) this.v).d;
                Round round = ((MediaPost) obj2).getRound();
                this.s = 1;
                Object A0 = w3bVar2.A0(i5, i6, round, this);
                return A0 == lu3Var5 ? lu3Var5 : A0;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i18 = this.s;
                if (i18 != 0) {
                    if (i18 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                g39 g39Var = ((u8c) this.v).f;
                boolean shouldReverseTeams = ((Event) obj2).shouldReverseTeams();
                this.s = 1;
                g39Var.getClass();
                Object P3 = yaa.P(new b39(g39Var, this.t, this.u, shouldReverseTeams, null), this);
                return P3 == lu3Var6 ? lu3Var6 : P3;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i19 = this.s;
                if (i19 != 0) {
                    if (i19 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wqc wqcVar = ((cnc) this.v).f;
                String str = ((g08) obj2).a;
                this.s = 1;
                Object e = wqcVar.e(i5, i6, this, str);
                return e == lu3Var7 ? lu3Var7 : e;
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i20 = this.s;
                if (i20 != 0) {
                    if (i20 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                fqe fqeVar = (fqe) this.v;
                Event event = (Event) obj2;
                boolean shouldReverseTeams2 = event != null ? event.shouldReverseTeams() : false;
                this.s = 1;
                yzd yzdVar = fqe.B;
                Object u = fqeVar.u(i5, i6, shouldReverseTeams2, this);
                return u == lu3Var8 ? lu3Var8 : u;
            case 8:
                lu3 lu3Var9 = lu3.a;
                int i21 = this.s;
                if (i21 != 0) {
                    if (i21 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wve wveVar = ((qqe) this.v).b;
                this.s = 1;
                wveVar.getClass();
                Object P4 = yaa.P(new lh7((Integer) obj2, wveVar, this.t, this.u, (rq3) null, 4), this);
                return P4 == lu3Var9 ? lu3Var9 : P4;
            case 9:
                tyi tyiVar = (tyi) this.v;
                lu3 lu3Var10 = lu3.a;
                int i22 = this.s;
                if (i22 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    n = tyiVar.b.n(tyiVar.c, this.t, this.u, this, (String) obj2);
                    if (n == lu3Var10) {
                        return lu3Var10;
                    }
                } else {
                    if (i22 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    n = obj;
                }
                TeamPlayerSeasonStatisticsResponse teamPlayerSeasonStatisticsResponse = (TeamPlayerSeasonStatisticsResponse) n;
                String str2 = tyiVar.d;
                switch (str2.hashCode()) {
                    case -2002238939:
                        if (str2.equals(Sports.ICE_HOCKEY)) {
                            serializer = IceHockeyPlayerSeasonStatistics.INSTANCE.serializer();
                            if (teamPlayerSeasonStatisticsResponse != null && (playerStatistics = teamPlayerSeasonStatisticsResponse.getPlayerStatistics()) != null) {
                                arrayList = new ArrayList(k13.r(playerStatistics, 10));
                                for (TeamPlayerSeasonStatisticsRaw teamPlayerSeasonStatisticsRaw : playerStatistics) {
                                    arrayList.add(new TeamPlayerSeasonStatistics(teamPlayerSeasonStatisticsRaw.getPlayer(), (AbstractPlayerSeasonStatistics) vga.a.a(serializer, teamPlayerSeasonStatisticsRaw.getStatistics()), teamPlayerSeasonStatisticsRaw.getPlayedEnough()));
                                }
                                break;
                            }
                        }
                        break;
                    case -1263172551:
                        if (str2.equals(Sports.FUTSAL)) {
                            serializer = FutsalPlayerSeasonStatistics.INSTANCE.serializer();
                            if (teamPlayerSeasonStatisticsResponse != null) {
                                arrayList = new ArrayList(k13.r(playerStatistics, 10));
                                while (r0.hasNext()) {
                                }
                                break;
                            }
                        }
                        break;
                    case -83759494:
                        if (str2.equals(Sports.AMERICAN_FOOTBALL)) {
                            serializer = AmericanFootballPlayerSeasonStatistics.INSTANCE.serializer();
                            if (teamPlayerSeasonStatisticsResponse != null) {
                            }
                        }
                        break;
                    case 1767150:
                        if (str2.equals(Sports.HANDBALL)) {
                            serializer = HandballPlayerSeasonStatistics.INSTANCE.serializer();
                            if (teamPlayerSeasonStatisticsResponse != null) {
                            }
                        }
                        break;
                    case 394668909:
                        if (str2.equals(Sports.FOOTBALL)) {
                            serializer = FootballPlayerSeasonStatistics.INSTANCE.serializer();
                            if (teamPlayerSeasonStatisticsResponse != null) {
                            }
                        }
                        break;
                    case 727149765:
                        if (str2.equals(Sports.BASKETBALL)) {
                            serializer = BasketballPlayerSeasonStatistics.INSTANCE.serializer();
                            if (teamPlayerSeasonStatisticsResponse != null) {
                            }
                        }
                        break;
                    case 932645060:
                        if (str2.equals(Sports.MINI_FOOTBALL)) {
                            serializer = MiniFootballPlayerSeasonStatistics.INSTANCE.serializer();
                            if (teamPlayerSeasonStatisticsResponse != null) {
                            }
                        }
                        break;
                }
                if (arrayList != null) {
                    tyiVar.k = arrayList;
                    tyiVar.g(arrayList);
                }
                return Unit.a;
            case 10:
                lu3 lu3Var11 = lu3.a;
                int i23 = this.s;
                if (i23 == 0) {
                    y6a.M(obj);
                    int s = ao2.s(-48, (Context) obj2);
                    this.s = 1;
                    if (((ksa) this.v).f(i5 + i6 + 2, s, this) == lu3Var11) {
                        return lu3Var11;
                    }
                } else {
                    if (i23 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            default:
                lu3 lu3Var12 = lu3.a;
                int i24 = this.s;
                if (i24 == 0) {
                    y6a.M(obj);
                    z3k z3kVar = (z3k) ((vng) this.v).a;
                    this.s = 1;
                    z3kVar.getClass();
                    P = yaa.P(new lh7(z3kVar, this.t, (TvType) obj2, this.u, (rq3) null, 8), this);
                    if (P == lu3Var12) {
                        return lu3Var12;
                    }
                } else {
                    if (i24 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P = obj;
                }
                return yaa.x((x2g) P);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gz6(Object obj, int i, int i2, rq3 rq3Var, int i3) {
        super(2, rq3Var);
        this.r = i3;
        this.w = obj;
        this.t = i;
        this.u = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gz6(Object obj, int i, Enum r3, int i2, rq3 rq3Var, int i3) {
        super(2, rq3Var);
        this.r = i3;
        this.v = obj;
        this.t = i;
        this.w = r3;
        this.u = i2;
    }
}
