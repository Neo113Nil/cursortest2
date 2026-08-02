package defpackage;

import android.util.Log;
import android.view.animation.AnimationUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.sofascore.model.fantasy.FantasyAverageScoreTopPlayerWrapper;
import com.sofascore.model.fantasy.FantasyCompetitionPriceChangesResponse;
import com.sofascore.model.fantasy.FantasyPlayerPriceChanges;
import com.sofascore.model.fantasy.FantasyScoreTopPlayerWrapper;
import com.sofascore.model.fantasy.FantasyTopPlayerRoundWrapper;
import com.sofascore.model.fantasy.FantasyTopPlayersResponse;
import com.sofascore.model.fantasy.FantasyUserLeague;
import com.sofascore.model.fantasy.FantasyUserRoundRanking;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StageType;
import com.sofascore.results.R;
import com.sofascore.results.chat.view.FloatingIndicationLabelView;
import com.sofascore.results.dialog.FollowSubStagesViewModel;
import com.sofascore.results.event.details.view.odds.FeaturedOddsView;
import com.sofascore.results.fantasy.ui.components.view.FantasyNotificationsActionButton;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.featuredtournament.FeaturedTournamentFragment;
import com.sofascore.results.main.favorites.FavoriteEventsFragment;
import com.sofascore.results.service.InstallReferrerWorker;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class d17 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d17(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.t;
        switch (i) {
            case 0:
                return new d17((e17) obj2, rq3Var, 0);
            case 1:
                return new d17((n27) obj2, rq3Var, 1);
            case 2:
                return new d17((d47) obj2, rq3Var, 2);
            case 3:
                return new d17((e57) obj2, rq3Var, 3);
            case 4:
                return new d17((r57) obj2, rq3Var, 4);
            case 5:
                return new d17((d87) obj2, rq3Var, 5);
            case 6:
                return new d17((FantasyNotificationsActionButton) obj2, rq3Var, 6);
            case 7:
                return new d17((ia7) obj2, rq3Var, 7);
            case 8:
                return new d17((te7) obj2, rq3Var, 8);
            case 9:
                return new d17((if7) obj2, rq3Var, 9);
            case 10:
                return new d17((imh) obj2, rq3Var, 10);
            case 11:
                return new d17((im7) obj2, rq3Var, 11);
            case 12:
                return new d17((ao7) obj2, rq3Var, 12);
            case 13:
                return new d17((Function2) obj2, rq3Var, 13);
            case 14:
                return new d17((FavoriteEventsFragment) obj2, rq3Var, 14);
            case 15:
                return new d17((FeaturedOddsView) obj2, rq3Var, 15);
            case 16:
                return new d17((tu7) obj2, rq3Var, 16);
            case 17:
                return new d17((FeaturedTournamentFragment) obj2, rq3Var, 17);
            case 18:
                return new d17((ExtendedFloatingActionButton) obj2, rq3Var, 18);
            case 19:
                return new d17((FloatingIndicationLabelView) obj2, rq3Var, 19);
            case 20:
                return new d17((z88) obj2, rq3Var, 20);
            case 21:
                return new d17((se8) obj2, rq3Var, 21);
            case 22:
                return new d17((FollowSubStagesViewModel) obj2, rq3Var, 22);
            case 23:
                return new d17((ej0) obj2, rq3Var, 23);
            case 24:
                return new d17((Event) obj2, rq3Var, 24);
            case 25:
                return new d17((xy8) obj2, rq3Var, 25);
            case 26:
                return new d17((n50) obj2, rq3Var, 26);
            case 27:
                return new d17((du9) obj2, rq3Var, 27);
            case 28:
                return new d17((InstallReferrerWorker) obj2, rq3Var, 28);
            default:
                return new d17((jda) obj2, rq3Var, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 6:
                ((d17) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
            case 14:
                ((d17) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((d17) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:318:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x051b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v14, types: [rlh] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.ArrayList] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object V;
        Object e0;
        Object a;
        Object K;
        ?? r1;
        List<FantasyTopPlayerRoundWrapper> H0;
        Object f;
        boolean z;
        List<FantasyPlayerPriceChanges> priceChanges;
        Iterator it;
        gv9 W;
        fdi fdiVar;
        Object value;
        gf7 gf7Var;
        ef7 ef7Var;
        Object j;
        Object c;
        Object A;
        int i = this.r;
        int i2 = 8;
        int i3 = 3;
        final int i4 = 0;
        Object obj2 = this.t;
        final int i5 = 1;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                e17 e17Var = (e17) obj2;
                e1d e1dVar = e17Var.f;
                lu3 lu3Var = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var = e17Var.c;
                    String str = e17Var.e;
                    int i7 = e17Var.d;
                    this.s = 1;
                    V = wi7Var.V(i7, str, this);
                    if (V == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i6 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    V = obj;
                }
                List list = (List) V;
                if (list == null) {
                    c17 c17Var = (c17) ((eoh) e1dVar).getValue();
                    FantasyUserRoundRanking fantasyUserRoundRanking = c17Var.a;
                    List list2 = c17Var.b;
                    list2.getClass();
                    ((eoh) e1dVar).setValue(new c17(fantasyUserRoundRanking, list2, false));
                    return Unit.a;
                }
                c17 c17Var2 = (c17) ((eoh) e1dVar).getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (((FantasyUserRoundRanking) obj3).isGlobal()) {
                        arrayList.add(obj3);
                    }
                }
                FantasyUserRoundRanking fantasyUserRoundRanking2 = (FantasyUserRoundRanking) CollectionsKt.firstOrNull(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list) {
                    if (!((FantasyUserRoundRanking) obj4).isGlobal()) {
                        arrayList2.add(obj4);
                    }
                }
                List L0 = CollectionsKt.L0(CollectionsKt.H0(arrayList2, new v66(14)), 3);
                c17Var2.getClass();
                L0.getClass();
                ((eoh) e1dVar).setValue(new c17(fantasyUserRoundRanking2, L0, false));
                return Unit.a;
            case 1:
                n27 n27Var = (n27) obj2;
                lu3 lu3Var2 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var2 = n27Var.c;
                    int i9 = n27Var.d.c;
                    this.s = 1;
                    e0 = wi7Var2.e0(i9, this);
                    if (e0 == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    e0 = obj;
                }
                FantasyUserLeague fantasyUserLeague = (FantasyUserLeague) e0;
                if (fantasyUserLeague != null) {
                    return c6o.Q(fantasyUserLeague, n27Var.e);
                }
                return null;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i10 = this.s;
                if (i10 != 0) {
                    if (i10 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                d47 d47Var = (d47) obj2;
                wi7 wi7Var3 = d47Var.e;
                int i11 = d47Var.g.a;
                this.s = 1;
                Object g0 = wi7Var3.g0(i11, this);
                return g0 == lu3Var3 ? lu3Var3 : g0;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((e57) obj2).v(this) == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i12 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i13 = this.s;
                if (i13 != 0) {
                    if (i13 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                r57 r57Var = (r57) obj2;
                wi7 wi7Var4 = r57Var.b;
                int i14 = r57Var.d.a;
                this.s = 1;
                Object b = wi7Var4.b(i14, this);
                return b == lu3Var5 ? lu3Var5 : b;
            case 5:
                d87 d87Var = (d87) obj2;
                lu3 lu3Var6 = lu3.a;
                int i15 = this.s;
                try {
                    if (i15 == 0) {
                        y6a.M(obj);
                        lx6 lx6Var = d87Var.c;
                        this.s = 1;
                        a = lx6Var.a(null, this);
                        if (a == lu3Var6) {
                            return lu3Var6;
                        }
                    } else {
                        if (i15 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        a = obj;
                    }
                    ((ix6) a).a(d87Var.a);
                    d87Var.a(false);
                    return Unit.a;
                } catch (Throwable th) {
                    d87Var.a(false);
                    throw th;
                }
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i16 = this.s;
                if (i16 == 0) {
                    y6a.M(obj);
                    ad2 ad2Var = qv5.a;
                    FantasyNotificationsActionButton fantasyNotificationsActionButton = (FantasyNotificationsActionButton) obj2;
                    LinkedHashMap linkedHashMap = qv5.b;
                    KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(z42.class);
                    Object obj5 = linkedHashMap.get(orCreateKotlinClass);
                    if (obj5 == null) {
                        obj5 = beh.b(0, 0, null, 7);
                        linkedHashMap.put(orCreateKotlinClass, obj5);
                    }
                    f10 f10Var = new f10(fantasyNotificationsActionButton, i2);
                    this.s = 1;
                    if (((b1d) obj5).collect(f10Var, this) == lu3Var7) {
                        return lu3Var7;
                    }
                } else {
                    if (i16 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            case 7:
                lu3 lu3Var8 = lu3.a;
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
                ia7 ia7Var = (ia7) obj2;
                wi7 wi7Var5 = ia7Var.e;
                int i18 = ia7Var.f;
                this.s = 1;
                Object e02 = wi7Var5.e0(i18, this);
                return e02 == lu3Var8 ? lu3Var8 : e02;
            case 8:
                te7 te7Var = (te7) obj2;
                lu3 lu3Var9 = lu3.a;
                int i19 = this.s;
                if (i19 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var6 = te7Var.e;
                    int i20 = te7Var.g;
                    this.s = 1;
                    K = wi7Var6.K(i20, this);
                    if (K == lu3Var9) {
                        return lu3Var9;
                    }
                } else {
                    if (i19 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    K = obj;
                }
                List list3 = (List) K;
                if (list3 == null || (H0 = CollectionsKt.H0(list3, new se7(i4))) == null) {
                    r1 = rlh.b;
                } else {
                    r1 = new ArrayList(k13.r(H0, 10));
                    for (FantasyTopPlayerRoundWrapper fantasyTopPlayerRoundWrapper : H0) {
                        r1.add(new kj7(FantasyRoundPlayerUiModel.b(hkg.g0(fantasyTopPlayerRoundWrapper.getPlayer(), te7Var.i()), null, 0, false, false, false, null, null, 534773759), fantasyTopPlayerRoundWrapper.getRound().getId(), f5p.C(te7Var.i(), fantasyTopPlayerRoundWrapper.getRound().getSequence(), fantasyTopPlayerRoundWrapper.getRound().getName())));
                    }
                }
                ((eoh) te7Var.h).setValue(re7.a(te7Var.k(), l6g.W(r1), null, 4));
                return Unit.a;
            case 9:
                if7 if7Var = (if7) obj2;
                lu3 lu3Var10 = lu3.a;
                int i21 = this.s;
                if (i21 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var7 = if7Var.c;
                    int i22 = if7Var.d;
                    this.s = 1;
                    f = wi7Var7.f(i22, this);
                    if (f == lu3Var10) {
                        return lu3Var10;
                    }
                } else {
                    if (i21 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    f = obj;
                }
                FantasyCompetitionPriceChangesResponse fantasyCompetitionPriceChangesResponse = (FantasyCompetitionPriceChangesResponse) f;
                if (fantasyCompetitionPriceChangesResponse != null) {
                    xbb b2 = a.b();
                    b2.add(ef7.b);
                    List<FantasyPlayerPriceChanges> priceChanges2 = fantasyCompetitionPriceChangesResponse.getPriceChanges();
                    if (priceChanges2 == null || !priceChanges2.isEmpty()) {
                        Iterator it2 = priceChanges2.iterator();
                        while (it2.hasNext()) {
                            if (((FantasyPlayerPriceChanges) it2.next()).getTotalPriceChange() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                z = true;
                                priceChanges = fantasyCompetitionPriceChangesResponse.getPriceChanges();
                                if (priceChanges != null || !priceChanges.isEmpty()) {
                                    it = priceChanges.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (((FantasyPlayerPriceChanges) it.next()).getTotalPriceChange() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                                i4 = 1;
                                            }
                                        }
                                    }
                                }
                                if (z) {
                                    b2.add(ef7.c);
                                }
                                if (i4 != 0) {
                                    b2.add(ef7.d);
                                }
                                W = l6g.W(a.a(b2));
                                if7Var.e = CollectionsKt.H0(fantasyCompetitionPriceChangesResponse.getPriceChanges(), new se7(i3));
                                fdiVar = if7Var.f;
                                do {
                                    value = fdiVar.getValue();
                                    gf7Var = (gf7) value;
                                    ef7Var = gf7Var.b;
                                    if (!CollectionsKt.R(W, ef7Var)) {
                                        ef7Var = null;
                                    }
                                    if (ef7Var == null) {
                                        ef7Var = (ef7) CollectionsKt.Y(W);
                                    }
                                } while (!fdiVar.k(value, gf7.a(gf7Var, ef7Var, W, null, new Long(fantasyCompetitionPriceChangesResponse.getLastUpdatedTimestamp()), 40)));
                            }
                        }
                    }
                    z = false;
                    priceChanges = fantasyCompetitionPriceChangesResponse.getPriceChanges();
                    if (priceChanges != null) {
                    }
                    it = priceChanges.iterator();
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    if (z) {
                    }
                    if (i4 != 0) {
                    }
                    W = l6g.W(a.a(b2));
                    if7Var.e = CollectionsKt.H0(fantasyCompetitionPriceChangesResponse.getPriceChanges(), new se7(i3));
                    fdiVar = if7Var.f;
                    do {
                        value = fdiVar.getValue();
                        gf7Var = (gf7) value;
                        ef7Var = gf7Var.b;
                        if (!CollectionsKt.R(W, ef7Var)) {
                        }
                        if (ef7Var == null) {
                        }
                    } while (!fdiVar.k(value, gf7.a(gf7Var, ef7Var, W, null, new Long(fantasyCompetitionPriceChangesResponse.getLastUpdatedTimestamp()), 40)));
                }
                return Unit.a;
            case 10:
                lu3 lu3Var11 = lu3.a;
                int i23 = this.s;
                if (i23 == 0) {
                    y6a.M(obj);
                    efi efiVar = new efi(R.string.team_update_failed_toast, R.drawable.ic_x_16);
                    this.s = 1;
                    if (((imh) obj2).a(efiVar, this) == lu3Var11) {
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
            case 11:
                final im7 im7Var = (im7) obj2;
                lu3 lu3Var12 = lu3.a;
                int i24 = this.s;
                if (i24 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var8 = im7Var.e;
                    int i25 = im7Var.f;
                    this.s = 1;
                    j = wi7Var8.j(i25, this);
                    if (j == lu3Var12) {
                        return lu3Var12;
                    }
                } else {
                    if (i24 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    j = obj;
                }
                FantasyTopPlayersResponse fantasyTopPlayersResponse = (FantasyTopPlayersResponse) j;
                cm7 cm7Var = cm7.MOST_POINTS;
                List<FantasyScoreTopPlayerWrapper> scoreTopPlayers = fantasyTopPlayersResponse != null ? fantasyTopPlayersResponse.getScoreTopPlayers() : null;
                if (scoreTopPlayers == null || scoreTopPlayers.isEmpty()) {
                    cm7Var = null;
                }
                cm7 cm7Var2 = cm7.AVERAGE_POINTS;
                List<FantasyAverageScoreTopPlayerWrapper> averageScoreTopPlayers = fantasyTopPlayersResponse != null ? fantasyTopPlayersResponse.getAverageScoreTopPlayers() : null;
                if (averageScoreTopPlayers == null || averageScoreTopPlayers.isEmpty()) {
                    cm7Var2 = null;
                }
                ((eoh) im7Var.g).setValue(nm7.a(im7Var.k(), l6g.W(ph0.x(new cm7[]{cm7Var, cm7Var2})), null, null, null, 14));
                fcp.m0(new yf4(sea.y(new Function0() { // from class: gm7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i26 = i5;
                        im7 im7Var2 = im7Var;
                        switch (i26) {
                            case 0:
                                return im7Var2.k().d;
                            default:
                                return im7Var2.k().c;
                        }
                    }
                }), sea.y(new Function0() { // from class: gm7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i26 = i4;
                        im7 im7Var2 = im7Var;
                        switch (i26) {
                            case 0:
                                return im7Var2.k().d;
                            default:
                                return im7Var2.k().c;
                        }
                    }
                }), new hm7(fantasyTopPlayersResponse, im7Var, rq3Var, i4), i5), un0.z(im7Var));
                return Unit.a;
            case 12:
                lu3 lu3Var13 = lu3.a;
                int i26 = this.s;
                if (i26 == 0) {
                    y6a.M(obj);
                    aeh aehVar = ((ao7) obj2).p;
                    this.s = 1;
                    if (aehVar.emit(an7.a, this) == lu3Var13) {
                        return lu3Var13;
                    }
                } else {
                    if (i26 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 13:
                lu3 lu3Var14 = lu3.a;
                int i27 = this.s;
                if (i27 == 0) {
                    y6a.M(obj);
                    ia0 ia0Var = ia0.q;
                    udl h = ok3.p().h();
                    this.s = 1;
                    if (((Function2) obj2).invoke(h, this) == lu3Var14) {
                        return lu3Var14;
                    }
                } else {
                    if (i27 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                ad2 ad2Var2 = qv5.a;
                qv5.a(z42.a);
                return Unit.a;
            case 14:
                FavoriteEventsFragment favoriteEventsFragment = (FavoriteEventsFragment) obj2;
                lu3 lu3Var15 = lu3.a;
                int i28 = this.s;
                if (i28 == 0) {
                    y6a.M(obj);
                    jof jofVar = favoriteEventsFragment.E().h;
                    qa7 qa7Var = new qa7(favoriteEventsFragment, rq3Var, 12);
                    jofVar.getClass();
                    this.s = 1;
                    if (fcp.c0(jofVar, qa7Var, this) == lu3Var15) {
                        return lu3Var15;
                    }
                } else {
                    if (i28 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                a70.r("SharedFlow never completes, this call should never return.");
                return null;
            case 15:
                FeaturedOddsView featuredOddsView = (FeaturedOddsView) obj2;
                lu3 lu3Var16 = lu3.a;
                int i29 = this.s;
                if (i29 == 0) {
                    y6a.M(obj);
                    s5d natsSocket = featuredOddsView.getNatsSocket();
                    fdi fdiVar2 = featuredOddsView.m;
                    natsSocket.getClass();
                    fdiVar2.getClass();
                    z88 g02 = k53.g0(la8.a(new wj0(fdiVar2, i3), new tl(rq3Var, natsSocket, r3)), z45.a);
                    qa7 qa7Var2 = new qa7(featuredOddsView, rq3Var, 13);
                    this.s = 1;
                    if (fcp.c0(g02, qa7Var2, this) == lu3Var16) {
                        return lu3Var16;
                    }
                } else {
                    if (i29 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 16:
                lu3 lu3Var17 = lu3.a;
                int i30 = this.s;
                if (i30 == 0) {
                    y6a.M(obj);
                    cg4 cg4Var = ((tu7) obj2).g;
                    long currentTimeMillis = System.currentTimeMillis();
                    this.s = 1;
                    if (cg4Var.h("pref_bet_boost_last_interaction_timestamp", currentTimeMillis, this) == lu3Var17) {
                        return lu3Var17;
                    }
                } else {
                    if (i30 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 17:
                lu3 lu3Var18 = lu3.a;
                int i31 = this.s;
                if (i31 == 0) {
                    y6a.M(obj);
                    FeaturedTournamentFragment featuredTournamentFragment = (FeaturedTournamentFragment) obj2;
                    e6b e6bVar = e6b.e;
                    fv7 fv7Var = new fv7(featuredTournamentFragment, null);
                    this.s = 1;
                    if (b6a.A(featuredTournamentFragment, e6bVar, fv7Var, this) == lu3Var18) {
                        return lu3Var18;
                    }
                } else {
                    if (i31 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 18:
                lu3 lu3Var19 = lu3.a;
                int i32 = this.s;
                if (i32 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (n4o.y(2000L, this) == lu3Var19) {
                        return lu3Var19;
                    }
                } else {
                    if (i32 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                ((ExtendedFloatingActionButton) obj2).y(3);
                return Unit.a;
            case 19:
                FloatingIndicationLabelView floatingIndicationLabelView = (FloatingIndicationLabelView) obj2;
                lu3 lu3Var20 = lu3.a;
                int i33 = this.s;
                if (i33 == 0) {
                    y6a.M(obj);
                    long j2 = floatingIndicationLabelView.e;
                    this.s = 1;
                    if (n4o.y(j2, this) == lu3Var20) {
                        return lu3Var20;
                    }
                } else {
                    if (i33 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                int i34 = FloatingIndicationLabelView.f;
                if (floatingIndicationLabelView.getVisibility() == 0) {
                    floatingIndicationLabelView.setVisibility(4);
                    floatingIndicationLabelView.d.b.startAnimation(AnimationUtils.loadAnimation(floatingIndicationLabelView.getContext(), R.anim.float_action_hide));
                }
                return Unit.a;
            case 20:
                lu3 lu3Var21 = lu3.a;
                int i35 = this.s;
                if (i35 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object collect = ((z88) obj2).collect(med.a, this);
                    if (collect != lu3Var21) {
                        collect = Unit.a;
                    }
                    if (collect == lu3Var21) {
                        return lu3Var21;
                    }
                } else {
                    if (i35 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 21:
                lu3 lu3Var22 = lu3.a;
                int i36 = this.s;
                if (i36 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (zm2.l((se8) obj2, null, this) == lu3Var22) {
                        return lu3Var22;
                    }
                } else {
                    if (i36 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 22:
                FollowSubStagesViewModel followSubStagesViewModel = (FollowSubStagesViewModel) obj2;
                lu3 lu3Var23 = lu3.a;
                int i37 = this.s;
                if (i37 == 0) {
                    y6a.M(obj);
                    tak takVar = followSubStagesViewModel.e;
                    this.s = 1;
                    c = takVar.c(this);
                    if (c == lu3Var23) {
                        return lu3Var23;
                    }
                } else {
                    if (i37 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    c = obj;
                }
                boolean R = CollectionsKt.R((Iterable) c, followSubStagesViewModel.g);
                followSubStagesViewModel.i.j(Boolean.valueOf(R));
                List<FollowSubStagesViewModel.SubStageInfo> list4 = followSubStagesViewModel.h;
                int c2 = sub.c(k13.r(list4, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(c2 >= 16 ? c2 : 16);
                for (FollowSubStagesViewModel.SubStageInfo subStageInfo : list4) {
                    HashSet hashSet = subStageInfo.c;
                    linkedHashMap2.put(Integer.valueOf(subStageInfo.a), Boolean.valueOf(!R ? hashSet.isEmpty() : hashSet.contains(StageType.MUTED)));
                }
                tee X = l6g.X(linkedHashMap2);
                followSubStagesViewModel.m = new LinkedHashMap(X);
                followSubStagesViewModel.k.j(X);
                return Unit.a;
            case 23:
                lu3 lu3Var24 = lu3.a;
                int i38 = this.s;
                if (i38 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((ej0) obj2).c(this) == lu3Var24) {
                        return lu3Var24;
                    }
                } else {
                    if (i38 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 24:
                lu3 lu3Var25 = lu3.a;
                int i39 = this.s;
                if (i39 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (su8.a.B((Event) obj2, this) == lu3Var25) {
                        return lu3Var25;
                    }
                } else {
                    if (i39 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 25:
                lu3 lu3Var26 = lu3.a;
                int i40 = this.s;
                try {
                    if (i40 == 0) {
                        y6a.M(obj);
                        xy8 xy8Var = (xy8) obj2;
                        re0 re0Var = new re0(xy8Var.b);
                        this.s = 1;
                        if (xy8Var.b(re0Var, this) == lu3Var26) {
                            return lu3Var26;
                        }
                    } else {
                        if (i40 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    return Unit.a;
                } catch (pz2 e) {
                    return new Integer(Log.e("GlanceRemoteViewService", "Error when trying to start session for list items", e));
                }
            case 26:
                lu3 lu3Var27 = lu3.a;
                int i41 = this.s;
                if (i41 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((n50) obj2).invoke(this) == lu3Var27) {
                        return lu3Var27;
                    }
                } else {
                    if (i41 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 27:
                lu3 lu3Var28 = lu3.a;
                int i42 = this.s;
                if (i42 != 0) {
                    if (i42 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                Function1 function1 = ((du9) obj2).c;
                this.s = 1;
                Object invoke = function1.invoke(this);
                return invoke == lu3Var28 ? lu3Var28 : invoke;
            case 28:
                lu3 lu3Var29 = lu3.a;
                int i43 = this.s;
                if (i43 != 0) {
                    if (i43 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                InstallReferrerWorker installReferrerWorker = (InstallReferrerWorker) obj2;
                this.s = 1;
                lj2 lj2Var = new lj2(1, z9a.b(this));
                lj2Var.t();
                try {
                    InstallReferrerClient installReferrerClient = installReferrerWorker.a;
                    if (installReferrerClient != null) {
                        installReferrerClient.startConnection(new l5a(lj2Var));
                    }
                } catch (Exception unused) {
                    if (lj2Var.r() instanceof oed) {
                        p2g p2gVar = w2g.b;
                        lj2Var.resumeWith(new Integer(-1));
                    }
                }
                lj2Var.v(new oi(installReferrerWorker, i2));
                Object q = lj2Var.q();
                lu3 lu3Var30 = lu3.a;
                return q == lu3Var29 ? lu3Var29 : q;
            default:
                lu3 lu3Var31 = lu3.a;
                int i44 = this.s;
                if (i44 == 0) {
                    y6a.M(obj);
                    z88 data = ((jda) obj2).d.getData();
                    this.s = 1;
                    A = rd0.A(data, this);
                    if (A == lu3Var31) {
                        return lu3Var31;
                    }
                } else {
                    if (i44 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    A = obj;
                }
                p0d p0dVar = (p0d) A;
                if (p0dVar != null) {
                    return p0dVar.a();
                }
                lm5 lm5Var = lm5.a;
                lm5Var.getClass();
                return lm5Var;
        }
    }
}
