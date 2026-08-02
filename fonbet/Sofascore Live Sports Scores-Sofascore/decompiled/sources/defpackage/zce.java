package defpackage;

import com.sofascore.model.newNetwork.PlayerDetailsResponse;
import com.sofascore.model.newNetwork.PlayerPenaltyHistoryResponse;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zce extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ ade t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zce(ade adeVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = adeVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        ade adeVar = this.t;
        switch (i) {
            case 0:
                return new zce(adeVar, rq3Var, 0);
            default:
                return new zce(adeVar, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((zce) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        ade adeVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    wve wveVar = adeVar.e;
                    int i3 = adeVar.f;
                    this.s = 1;
                    obj = wveVar.i(i3, this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                PlayerDetailsResponse playerDetailsResponse = (PlayerDetailsResponse) yaa.x((x2g) obj);
                if (playerDetailsResponse != null) {
                    return playerDetailsResponse.getPlayer();
                }
                return null;
            default:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    wve wveVar2 = adeVar.e;
                    int i5 = adeVar.f;
                    this.s = 1;
                    obj = wveVar2.l(i5, this);
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
                PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse = (PlayerPenaltyHistoryResponse) obj;
                if (playerPenaltyHistoryResponse != null) {
                    return PlayerPenaltyHistoryResponse.copy$default(playerPenaltyHistoryResponse, null, CollectionsKt.B0(playerPenaltyHistoryResponse.getPenalties()), 0, 0, 13, null);
                }
                return null;
        }
    }
}
