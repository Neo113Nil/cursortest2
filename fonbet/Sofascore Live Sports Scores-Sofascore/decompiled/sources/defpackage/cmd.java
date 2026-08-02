package defpackage;

import com.sofascore.model.network.response.SignupLinkResponse;
import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cmd extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ umd t;
    public final /* synthetic */ String u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cmd(int i, rq3 rq3Var, umd umdVar, String str) {
        super(1, rq3Var);
        this.r = i;
        this.t = umdVar;
        this.u = str;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        String str = this.u;
        umd umdVar = this.t;
        switch (i) {
            case 0:
                return new cmd(0, rq3Var, umdVar, str);
            default:
                return new cmd(1, rq3Var, umdVar, str);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((cmd) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        String str = this.u;
        umd umdVar = this.t;
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
                NetworkCoroutineAPI networkCoroutineAPI = umdVar.a;
                this.s = 1;
                Object betBoosts = networkCoroutineAPI.betBoosts(1, str, this);
                return betBoosts == lu3Var ? lu3Var : betBoosts;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI2 = umdVar.a;
                    this.s = 1;
                    obj = networkCoroutineAPI2.signupLinks(str, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return ((SignupLinkResponse) obj).getSignupLinks();
        }
    }
}
