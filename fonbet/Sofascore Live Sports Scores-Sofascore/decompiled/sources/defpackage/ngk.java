package defpackage;

import com.sofascore.model.profile.UserInfoRequest;
import com.sofascore.network.api.RegistrationCoroutinesAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ngk extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ dhk t;
    public final /* synthetic */ UserInfoRequest u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ngk(dhk dhkVar, UserInfoRequest userInfoRequest, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.t = dhkVar;
        this.u = userInfoRequest;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        UserInfoRequest userInfoRequest = this.u;
        dhk dhkVar = this.t;
        switch (i) {
            case 0:
                return new ngk(dhkVar, userInfoRequest, rq3Var, 0);
            default:
                return new ngk(dhkVar, userInfoRequest, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((ngk) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        UserInfoRequest userInfoRequest = this.u;
        dhk dhkVar = this.t;
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
                RegistrationCoroutinesAPI registrationCoroutinesAPI = dhkVar.b;
                this.s = 1;
                Object obj2 = registrationCoroutinesAPI.tokenInit(userInfoRequest, this);
                return obj2 == lu3Var ? lu3Var : obj2;
            default:
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
                RegistrationCoroutinesAPI registrationCoroutinesAPI2 = dhkVar.b;
                this.s = 1;
                Object userInfo = registrationCoroutinesAPI2.userInfo(userInfoRequest, this);
                return userInfo == lu3Var2 ? lu3Var2 : userInfo;
        }
    }
}
