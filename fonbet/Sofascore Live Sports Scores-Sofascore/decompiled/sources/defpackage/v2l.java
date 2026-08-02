package defpackage;

import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class v2l extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ a3l t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2l(a3l a3lVar, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.t = a3lVar;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        a3l a3lVar = this.t;
        switch (i) {
            case 0:
                return new v2l(a3lVar, rq3Var, 0);
            case 1:
                return new v2l(a3lVar, rq3Var, 1);
            default:
                return new v2l(a3lVar, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((v2l) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        a3l a3lVar = this.t;
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
                NetworkCoroutineAPI networkCoroutineAPI = a3lVar.a;
                this.s = 1;
                Object popularUpcomingEvents = networkCoroutineAPI.getPopularUpcomingEvents(this);
                return popularUpcomingEvents == lu3Var ? lu3Var : popularUpcomingEvents;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 != 0) {
                    if (i3 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI2 = a3lVar.a;
                this.s = 1;
                Object weeklyChallengeAssets = networkCoroutineAPI2.getWeeklyChallengeAssets(this);
                return weeklyChallengeAssets == lu3Var2 ? lu3Var2 : weeklyChallengeAssets;
            default:
                lu3 lu3Var3 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI3 = a3lVar.a;
                this.s = 1;
                Object weeklyChallengeTimestamp = networkCoroutineAPI3.getWeeklyChallengeTimestamp(this);
                return weeklyChallengeTimestamp == lu3Var3 ? lu3Var3 : weeklyChallengeTimestamp;
        }
    }
}
