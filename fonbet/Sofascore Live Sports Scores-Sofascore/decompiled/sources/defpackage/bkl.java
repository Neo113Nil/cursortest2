package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.fantasy.FantasyAverageScoreTopPlayerWrapper;
import com.sofascore.model.fantasy.FantasyPlayer;
import com.sofascore.model.fantasy.FantasyScoreTopPlayerWrapper;
import com.sofascore.model.fantasy.FantasyTopPlayersResponse;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.newNetwork.topperformance.TopPerformanceResponse;
import com.sofascore.model.newNetwork.topperformance.response.TopPerformanceStatistics;
import com.sofascore.results.R;
import com.sofascore.results.league.fragment.topStats.TopPlayerCategoryUiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bkl extends hoi implements Function2 {
    public qkl r;
    public fsf s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ xil v;
    public final /* synthetic */ qkl w;
    public final /* synthetic */ fsf x;
    public final /* synthetic */ bgl y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkl(xil xilVar, qkl qklVar, fsf fsfVar, bgl bglVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.v = xilVar;
        this.w = qklVar;
        this.x = fsfVar;
        this.y = bglVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        bkl bklVar = new bkl(this.v, this.w, this.x, this.y, rq3Var);
        bklVar.u = obj;
        return bklVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((bkl) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0053, code lost:
    
        if (r0 == r6) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01b2, code lost:
    
        if (r1 == r6) goto L71;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        Object j;
        Object T;
        TopPerformanceStatistics topPerformanceStatistics;
        wci wciVar;
        wci wciVar2;
        Object u2gVar;
        FantasyScoreTopPlayerWrapper fantasyScoreTopPlayerWrapper;
        FantasyAverageScoreTopPlayerWrapper fantasyAverageScoreTopPlayerWrapper;
        List<FantasyAverageScoreTopPlayerWrapper> averageScoreTopPlayers;
        List<FantasyScoreTopPlayerWrapper> scoreTopPlayers;
        ku3 ku3Var = (ku3) this.u;
        lu3 lu3Var = lu3.a;
        int i = this.t;
        fsf fsfVar = this.x;
        qkl qklVar = this.w;
        wci wciVar3 = null;
        if (i == 0) {
            y6a.M(obj);
            if (this.v == xil.b) {
                w3b w3bVar = qklVar.l;
                String label = Season.SubSeasonType.OVERALL.getLabel();
                this.u = null;
                this.t = 1;
                T = w3bVar.T(16, 58210, this, label, null);
            } else {
                list = null;
                Integer num = qklVar.K;
                if (num == null) {
                    return null;
                }
                int intValue = num.intValue();
                wi7 wi7Var = qklVar.t;
                this.u = ku3Var;
                this.r = qklVar;
                this.s = fsfVar;
                this.t = 2;
                j = wi7Var.j(intValue, this);
            }
            return lu3Var;
        }
        if (i == 1) {
            y6a.M(obj);
            T = obj;
            TopPerformanceResponse topPerformanceResponse = (TopPerformanceResponse) T;
            if (topPerformanceResponse == null || (topPerformanceStatistics = (TopPerformanceStatistics) topPerformanceResponse.getTopPerformanceItems()) == null) {
                return null;
            }
            gv9<TopPlayerCategoryUiModel> F = zic.F(qklVar.i(), topPerformanceStatistics, null, null, false, null, hub.e, false, 440);
            ArrayList arrayList = new ArrayList();
            for (TopPlayerCategoryUiModel topPlayerCategoryUiModel : F) {
                List L0 = CollectionsKt.L0(topPlayerCategoryUiModel.b, 3);
                TopPlayerCategoryUiModel a = L0.isEmpty() ? null : TopPlayerCategoryUiModel.a(topPlayerCategoryUiModel, l6g.W(L0), 29);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                TopPlayerCategoryUiModel topPlayerCategoryUiModel2 = (TopPlayerCategoryUiModel) next;
                if (this.y != bgl.c || !Intrinsics.c(topPlayerCategoryUiModel2.a, qklVar.i().getString(R.string.average_sofascore_rating))) {
                    arrayList2.add(next);
                }
            }
            vel velVar = vel.a;
            List<TopPlayerCategoryUiModel> H0 = CollectionsKt.H0(arrayList2, vel.e(qklVar.i()));
            ArrayList arrayList3 = new ArrayList();
            for (TopPlayerCategoryUiModel topPlayerCategoryUiModel3 : H0) {
                Context i2 = qklVar.i();
                topPlayerCategoryUiModel3.getClass();
                gv9 gv9Var = topPlayerCategoryUiModel3.b;
                vnj vnjVar = (vnj) CollectionsKt.firstOrNull(gv9Var);
                if (vnjVar != null) {
                    unj unjVar = vnjVar.a;
                    znj znjVar = unjVar.f;
                    int i3 = unjVar.a;
                    String str = unjVar.b;
                    int i4 = znjVar != null ? znjVar.a : 0;
                    String str2 = unjVar.e.b;
                    wciVar = wciVar3;
                    String u = dti.u(i2, unjVar.d, Sports.FOOTBALL, unjVar.c, false);
                    String str3 = topPlayerCategoryUiModel3.a;
                    vel velVar2 = vel.a;
                    zdl zdlVar = (zdl) ((Map) vel.i.getValue()).get(Integer.valueOf(znjVar != null ? znjVar.a : 0));
                    if (zdlVar == null) {
                        zdlVar = vel.b;
                    }
                    wciVar2 = new wci(i3, str, i4, str2, u, str3, zdlVar);
                } else {
                    wciVar = wciVar3;
                    wciVar2 = wciVar;
                }
                Object vilVar = wciVar2 == null ? wciVar : new vil(wciVar2, l6g.W(CollectionsKt.S(gv9Var, 1)));
                if (vilVar != null) {
                    arrayList3.add(vilVar);
                }
                wciVar3 = wciVar;
            }
            wci wciVar4 = wciVar3;
            gv9 W = l6g.W(arrayList3);
            fsfVar.a = !W.isEmpty() ? W : wciVar4;
            return Unit.a;
        }
        if (i != 2) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fsfVar = this.s;
        qklVar = this.r;
        y6a.M(obj);
        j = obj;
        list = null;
        FantasyTopPlayersResponse fantasyTopPlayersResponse = (FantasyTopPlayersResponse) j;
        List L02 = (fantasyTopPlayersResponse == null || (scoreTopPlayers = fantasyTopPlayersResponse.getScoreTopPlayers()) == null) ? list : CollectionsKt.L0(scoreTopPlayers, 3);
        List L03 = (fantasyTopPlayersResponse == null || (averageScoreTopPlayers = fantasyTopPlayersResponse.getAverageScoreTopPlayers()) == null) ? list : CollectionsKt.L0(averageScoreTopPlayers, 3);
        try {
            p2g p2gVar = w2g.b;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (L02 == null || (fantasyScoreTopPlayerWrapper = (FantasyScoreTopPlayerWrapper) CollectionsKt.firstOrNull(L02)) == null) {
            return list;
        }
        FantasyPlayer fantasyPlayer = fantasyScoreTopPlayerWrapper.getFantasyPlayer();
        Context i5 = qklVar.i();
        Context i6 = qklVar.i();
        String valueOf = String.valueOf(fantasyScoreTopPlayerWrapper.getTotalScore());
        valueOf.getClass();
        String string = i6.getString(R.string.n_points, valueOf);
        string.getClass();
        String string2 = qklVar.i().getString(R.string.total_points);
        string2.getClass();
        wci z = uaa.z(fantasyPlayer, i5, string, string2);
        List<FantasyScoreTopPlayerWrapper> S = CollectionsKt.S(L02, 1);
        ArrayList arrayList4 = new ArrayList(k13.r(S, 10));
        for (FantasyScoreTopPlayerWrapper fantasyScoreTopPlayerWrapper2 : S) {
            FantasyPlayer fantasyPlayer2 = fantasyScoreTopPlayerWrapper2.getFantasyPlayer();
            Context i7 = qklVar.i();
            Context i8 = qklVar.i();
            String valueOf2 = String.valueOf(fantasyScoreTopPlayerWrapper2.getTotalScore());
            valueOf2.getClass();
            String string3 = i8.getString(R.string.n_points, valueOf2);
            string3.getClass();
            arrayList4.add(w1a.F(fantasyPlayer2, i7, string3));
        }
        til tilVar = new til(z, l6g.W(arrayList4));
        if (L03 == null || (fantasyAverageScoreTopPlayerWrapper = (FantasyAverageScoreTopPlayerWrapper) CollectionsKt.firstOrNull(L03)) == null) {
            return list;
        }
        FantasyPlayer fantasyPlayer3 = fantasyAverageScoreTopPlayerWrapper.getFantasyPlayer();
        Context i9 = qklVar.i();
        String string4 = qklVar.i().getString(R.string.n_points, String.format("%.1f", Arrays.copyOf(new Object[]{fantasyAverageScoreTopPlayerWrapper.getAverageScore()}, 1)));
        string4.getClass();
        String string5 = qklVar.i().getString(R.string.fantasy_average_points);
        string5.getClass();
        wci z2 = uaa.z(fantasyPlayer3, i9, string4, string5);
        List<FantasyAverageScoreTopPlayerWrapper> S2 = CollectionsKt.S(L03, 1);
        ArrayList arrayList5 = new ArrayList(k13.r(S2, 10));
        for (FantasyAverageScoreTopPlayerWrapper fantasyAverageScoreTopPlayerWrapper2 : S2) {
            FantasyPlayer fantasyPlayer4 = fantasyAverageScoreTopPlayerWrapper2.getFantasyPlayer();
            Context i10 = qklVar.i();
            String string6 = qklVar.i().getString(R.string.n_points, String.format("%.1f", Arrays.copyOf(new Object[]{fantasyAverageScoreTopPlayerWrapper2.getAverageScore()}, 1)));
            string6.getClass();
            arrayList5.add(w1a.F(fantasyPlayer4, i10, string6));
        }
        u2gVar = l6g.K(tilVar, new til(z2, l6g.W(arrayList5)), uil.a);
        p2g p2gVar3 = w2g.b;
        fsfVar.a = u2gVar instanceof u2g ? list : u2gVar;
        return Unit.a;
    }
}
