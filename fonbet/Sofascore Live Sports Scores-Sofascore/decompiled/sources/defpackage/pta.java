package defpackage;

import com.ironsource.U3;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.newNetwork.TopFollowedPlayerInfo;
import com.sofascore.model.newNetwork.TopFollowedPlayersResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pta extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ yta t;
    public final /* synthetic */ Season u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pta(yta ytaVar, Season season, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = ytaVar;
        this.u = season;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Season season = this.u;
        yta ytaVar = this.t;
        switch (i) {
            case 0:
                return new pta(ytaVar, season, rq3Var, 0);
            case 1:
                return new pta(ytaVar, season, rq3Var, 1);
            case 2:
                return new pta(ytaVar, season, rq3Var, 2);
            case 3:
                return new pta(ytaVar, season, rq3Var, 3);
            case 4:
                return new pta(ytaVar, season, rq3Var, 4);
            case 5:
                return new pta(ytaVar, season, rq3Var, 5);
            case 6:
                return new pta(ytaVar, season, rq3Var, 6);
            case 7:
                return new pta(ytaVar, season, rq3Var, 7);
            case 8:
                return new pta(ytaVar, season, rq3Var, 8);
            default:
                return new pta(ytaVar, season, rq3Var, 9);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((pta) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        List<TopFollowedPlayerInfo> topFollowedPlayers;
        List<TopFollowedPlayerInfo> H0;
        int id;
        int i = this.r;
        Season season = this.u;
        yta ytaVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 != 0) {
                    if (i2 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w3b w3bVar = ytaVar.e;
                int i3 = ytaVar.k;
                int id2 = season.getId();
                this.s = 1;
                Object K = w3bVar.K(i3, id2, this, U3.i.l);
                return K == lu3Var ? lu3Var : K;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    w3b w3bVar2 = ytaVar.e;
                    int i5 = ytaVar.i;
                    int id3 = season.getId();
                    this.s = 1;
                    obj = w3bVar2.i0(i5, id3, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                TopFollowedPlayersResponse topFollowedPlayersResponse = (TopFollowedPlayersResponse) obj;
                if (topFollowedPlayersResponse != null && (topFollowedPlayers = topFollowedPlayersResponse.getTopFollowedPlayers()) != null) {
                    List<TopFollowedPlayerInfo> list = topFollowedPlayers.isEmpty() ? null : topFollowedPlayers;
                    if (list != null && (H0 = CollectionsKt.H0(list, new se7(22))) != null) {
                        ArrayList arrayList = new ArrayList(k13.r(H0, 10));
                        for (TopFollowedPlayerInfo topFollowedPlayerInfo : H0) {
                            arrayList.add(new nta(topFollowedPlayerInfo.getPlayer().getId(), topFollowedPlayerInfo.getTeam().getId(), tba.t(topFollowedPlayerInfo.getPlayer()), topFollowedPlayerInfo.getPlayer().getUserCount()));
                        }
                        ytaVar.A.j(arrayList);
                    }
                }
                return Unit.a;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i6 = this.s;
                if (i6 != 0) {
                    if (i6 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w3b w3bVar3 = ytaVar.e;
                int i7 = ytaVar.i;
                id = season != null ? season.getId() : -1;
                this.s = 1;
                w3bVar3.getClass();
                Object r = s9a.r(new zb9(i7, id, null, w3bVar3), this);
                return r == lu3Var3 ? lu3Var3 : r;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i8 = this.s;
                if (i8 != 0) {
                    if (i8 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w3b w3bVar4 = ytaVar.e;
                int i9 = ytaVar.i;
                int id4 = season.getId();
                this.s = 1;
                Object M = w3bVar4.M(i9, id4, this);
                return M == lu3Var4 ? lu3Var4 : M;
            case 4:
                lu3 lu3Var5 = lu3.a;
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
                w3b w3bVar5 = ytaVar.e;
                int i11 = ytaVar.i;
                Integer num = season != null ? new Integer(season.getId()) : null;
                this.s = 1;
                w3bVar5.getClass();
                Object r2 = s9a.r(new mj5(num, w3bVar5, i11, (rq3) null, 5), this);
                return r2 == lu3Var5 ? lu3Var5 : r2;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i12 = this.s;
                if (i12 != 0) {
                    if (i12 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w3b w3bVar6 = ytaVar.e;
                int i13 = ytaVar.i;
                id = season != null ? season.getId() : -1;
                this.s = 1;
                Object A = w3bVar6.A(i13, id, this);
                return A == lu3Var6 ? lu3Var6 : A;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i14 = this.s;
                if (i14 != 0) {
                    if (i14 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w3b w3bVar7 = ytaVar.e;
                int i15 = ytaVar.i;
                int id5 = season.getId();
                this.s = 1;
                Object J = w3bVar7.J(i15, id5, this);
                return J == lu3Var7 ? lu3Var7 : J;
            case 7:
                lu3 lu3Var8 = lu3.a;
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
                w3b w3bVar8 = ytaVar.e;
                int i17 = ytaVar.i;
                int id6 = season.getId();
                this.s = 1;
                Object H = w3bVar8.H(i17, id6, this);
                return H == lu3Var8 ? lu3Var8 : H;
            case 8:
                lu3 lu3Var9 = lu3.a;
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
                w3b w3bVar9 = ytaVar.e;
                int i19 = ytaVar.i;
                int id7 = season.getId();
                this.s = 1;
                Object N = w3bVar9.N(i19, id7, this, U3.i.l);
                return N == lu3Var9 ? lu3Var9 : N;
            default:
                lu3 lu3Var10 = lu3.a;
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
                w3b w3bVar10 = ytaVar.e;
                int i21 = ytaVar.i;
                int id8 = season.getId();
                this.s = 1;
                Object L = w3bVar10.L(i21, id8, this);
                return L == lu3Var10 ? lu3Var10 : L;
        }
    }
}
