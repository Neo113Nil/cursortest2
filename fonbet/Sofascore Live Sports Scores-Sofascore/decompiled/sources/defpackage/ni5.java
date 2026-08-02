package defpackage;

import com.sofascore.model.newNetwork.PlayerOfTheMatchVoteBody;
import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ni5 extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ni5(Object obj, int i, int i2, rq3 rq3Var, int i3) {
        super(1, rq3Var);
        this.r = i3;
        this.v = obj;
        this.t = i;
        this.u = i2;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        Object obj = this.v;
        switch (i) {
            case 0:
                return new ni5((oi5) obj, this.t, this.u, rq3Var, 0);
            case 1:
                return new ni5((t9c) obj, this.t, this.u, rq3Var, 1);
            case 2:
                return new ni5((zte) obj, this.t, this.u, rq3Var, 2);
            case 3:
                return new ni5((wve) obj, this.t, this.u, rq3Var, 3);
            default:
                return new ni5((vrj) obj, this.t, this.u, rq3Var, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((ni5) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.u;
        int i3 = this.t;
        Object obj2 = this.v;
        switch (i) {
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
                NetworkCoroutineAPI networkCoroutineAPI = ((oi5) obj2).a;
                this.s = 1;
                Object leagueEditors = networkCoroutineAPI.leagueEditors(i3, i2, this);
                return leagueEditors == lu3Var ? lu3Var : leagueEditors;
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
                NetworkCoroutineAPI networkCoroutineAPI2 = ((t9c) obj2).a;
                this.s = 1;
                Object matchdayHighlights = networkCoroutineAPI2.matchdayHighlights(i3, i2, this);
                return matchdayHighlights == lu3Var2 ? lu3Var2 : matchdayHighlights;
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
                NetworkCoroutineAPI networkCoroutineAPI3 = ((zte) obj2).b;
                PlayerOfTheMatchVoteBody playerOfTheMatchVoteBody = new PlayerOfTheMatchVoteBody(i2);
                this.s = 1;
                Object eventPlayerOfTheMatchVote = networkCoroutineAPI3.eventPlayerOfTheMatchVote(i3, playerOfTheMatchVoteBody, this);
                return eventPlayerOfTheMatchVote == lu3Var3 ? lu3Var3 : eventPlayerOfTheMatchVote;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i7 = this.s;
                if (i7 != 0) {
                    if (i7 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI4 = ((wve) obj2).b;
                this.s = 1;
                Object playerEventStatistics = networkCoroutineAPI4.playerEventStatistics(i3, i2, this);
                return playerEventStatistics == lu3Var4 ? lu3Var4 : playerEventStatistics;
            default:
                lu3 lu3Var5 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI5 = ((vrj) obj2).a;
                this.s = 1;
                Object hasCupTree = networkCoroutineAPI5.hasCupTree(i3, i2, this);
                return hasCupTree == lu3Var5 ? lu3Var5 : hasCupTree;
        }
    }
}
