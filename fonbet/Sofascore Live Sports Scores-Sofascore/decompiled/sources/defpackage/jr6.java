package defpackage;

import com.sofascore.model.fantasy.FantasyCompetitionPriceChangesResponse;
import com.sofascore.model.fantasy.FantasyLeague;
import com.sofascore.model.fantasy.FantasyPlayerPriceChanges;
import com.sofascore.model.fantasy.FantasyRound;
import com.sofascore.model.fantasy.FantasyTopPlayerRoundWrapper;
import com.sofascore.model.fantasy.FantasyUserCompetition;
import com.sofascore.model.fantasy.FantasyUserCompetitionResponse;
import com.sofascore.model.fantasy.FantasyUserLeague;
import com.sofascore.model.fantasy.FantasyUserRound;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jr6 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ nr6 t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jr6(nr6 nr6Var, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.t = nr6Var;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        int i2 = this.u;
        nr6 nr6Var = this.t;
        switch (i) {
            case 0:
                return new jr6(nr6Var, i2, rq3Var, 0);
            case 1:
                return new jr6(nr6Var, i2, rq3Var, 1);
            case 2:
                return new jr6(nr6Var, i2, rq3Var, 2);
            case 3:
                return new jr6(nr6Var, i2, rq3Var, 3);
            case 4:
                return new jr6(nr6Var, i2, rq3Var, 4);
            case 5:
                return new jr6(nr6Var, i2, rq3Var, 5);
            case 6:
                return new jr6(nr6Var, i2, rq3Var, 6);
            case 7:
                return new jr6(nr6Var, i2, rq3Var, 7);
            default:
                return new jr6(nr6Var, i2, rq3Var, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((jr6) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x0243, code lost:
    
        if (r0 == r1) goto L112;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [lu3] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object T;
        Object f;
        List<FantasyPlayerPriceChanges> priceChanges;
        List H0;
        Object i;
        Object K;
        List H02;
        List<FantasyTopPlayerRoundWrapper> L0;
        Object N;
        FantasyUserCompetition userCompetition;
        Object O;
        int i2 = this.r;
        int i3 = this.u;
        nr6 nr6Var = this.t;
        switch (i2) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i4 = this.s;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                ky6 ky6Var = nr6Var.f;
                this.s = 1;
                Object b = ky6Var.b(i3, this);
                return b == lu3Var ? lu3Var : b;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                if (i5 != 0) {
                    if (i5 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wi7 wi7Var = nr6Var.e;
                this.s = 1;
                Object J = wi7Var.J(i3, this);
                return J == lu3Var2 ? lu3Var2 : J;
            case 2:
                Object obj2 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var2 = nr6Var.e;
                    String str = nr6Var.i;
                    this.s = 1;
                    T = wi7Var2.T(i3, str, this);
                    break;
                } else {
                    if (i6 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    T = obj;
                }
                obj2 = new ArrayList();
                Iterator it = ((Iterable) T).iterator();
                while (it.hasNext()) {
                    FantasyLeague league = ((FantasyUserLeague) it.next()).getLeague();
                    j67 w = league != null ? iz8.w(league) : null;
                    if (w != null) {
                        obj2.add(w);
                    }
                }
                return obj2;
            case 3:
                lu3 lu3Var3 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    gv9 gv9Var = nr6Var.k().i;
                    if (gv9Var != null) {
                        return gv9Var;
                    }
                    wi7 wi7Var3 = nr6Var.e;
                    this.s = 1;
                    f = wi7Var3.f(i3, this);
                    if (f == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    f = obj;
                }
                FantasyCompetitionPriceChangesResponse fantasyCompetitionPriceChangesResponse = (FantasyCompetitionPriceChangesResponse) f;
                if (fantasyCompetitionPriceChangesResponse == null || (priceChanges = fantasyCompetitionPriceChangesResponse.getPriceChanges()) == null || (H0 = CollectionsKt.H0(priceChanges, new v66(7))) == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : H0) {
                    if (((FantasyPlayerPriceChanges) obj3).getTotalPriceChange() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        arrayList.add(obj3);
                    }
                }
                List L02 = CollectionsKt.L0(arrayList, 5);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : H0) {
                    if (((FantasyPlayerPriceChanges) obj4).getTotalPriceChange() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        arrayList2.add(obj4);
                    }
                }
                return CollectionsKt.w0(CollectionsKt.M0(5, arrayList2), L02);
            case 4:
                lu3 lu3Var4 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var4 = nr6Var.e;
                    this.s = 1;
                    i = wi7Var4.i(i3, this);
                    if (i == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    i = obj;
                }
                Iterable iterable = (Iterable) i;
                ArrayList arrayList3 = new ArrayList(k13.r(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(pd0.K((FantasyRound) it2.next()));
                }
                return arrayList3;
            case 5:
                lu3 lu3Var5 = lu3.a;
                int i9 = this.s;
                if (i9 != 0) {
                    if (i9 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wi7 wi7Var5 = nr6Var.e;
                this.s = 1;
                Object j = wi7Var5.j(i3, this);
                return j == lu3Var5 ? lu3Var5 : j;
            case 6:
                lu3 lu3Var6 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var6 = nr6Var.e;
                    this.s = 1;
                    K = wi7Var6.K(i3, this);
                    if (K == lu3Var6) {
                        return lu3Var6;
                    }
                } else {
                    if (i10 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    K = obj;
                }
                List list = (List) K;
                if (list == null || (H02 = CollectionsKt.H0(list, new v66(8))) == null || (L0 = CollectionsKt.L0(H02, 5)) == null) {
                    return null;
                }
                ArrayList arrayList4 = new ArrayList(k13.r(L0, 10));
                for (FantasyTopPlayerRoundWrapper fantasyTopPlayerRoundWrapper : L0) {
                    arrayList4.add(new kj7(FantasyRoundPlayerUiModel.b(hkg.g0(fantasyTopPlayerRoundWrapper.getPlayer(), nr6Var.i()), null, 0, false, false, false, null, null, 534773759), fantasyTopPlayerRoundWrapper.getRound().getId(), f5p.C(nr6Var.i(), fantasyTopPlayerRoundWrapper.getRound().getSequence(), fantasyTopPlayerRoundWrapper.getRound().getName())));
                }
                return arrayList4;
            case 7:
                lu3 lu3Var7 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var7 = nr6Var.e;
                    String str2 = nr6Var.i;
                    this.s = 1;
                    N = wi7Var7.N(i3, str2, this);
                    if (N == lu3Var7) {
                        return lu3Var7;
                    }
                } else {
                    if (i11 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    N = obj;
                }
                FantasyUserCompetitionResponse fantasyUserCompetitionResponse = (FantasyUserCompetitionResponse) N;
                if (fantasyUserCompetitionResponse == null || (userCompetition = fantasyUserCompetitionResponse.getUserCompetition()) == null) {
                    return null;
                }
                return fkf.O(userCompetition, nr6Var.i());
            default:
                lu3 lu3Var8 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var8 = nr6Var.e;
                    String str3 = nr6Var.i;
                    this.s = 1;
                    O = wi7Var8.O(i3, str3, this);
                    if (O == lu3Var8) {
                        return lu3Var8;
                    }
                } else {
                    if (i12 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    O = obj;
                }
                List list2 = (List) O;
                if (list2 == null) {
                    return null;
                }
                ArrayList arrayList5 = new ArrayList(k13.r(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(pco.T((FantasyUserRound) it3.next()));
                }
                return arrayList5;
        }
    }
}
