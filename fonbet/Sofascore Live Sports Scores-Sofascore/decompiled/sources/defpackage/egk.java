package defpackage;

import com.sofascore.network.api.NetworkCoroutineAPI;
import com.sofascore.network.api.RegistrationCoroutinesAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class egk extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ dhk t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ egk(dhk dhkVar, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.t = dhkVar;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        dhk dhkVar = this.t;
        switch (i) {
            case 0:
                return new egk(dhkVar, rq3Var, 0);
            case 1:
                return new egk(dhkVar, rq3Var, 1);
            case 2:
                return new egk(dhkVar, rq3Var, 2);
            case 3:
                return new egk(dhkVar, rq3Var, 3);
            case 4:
                return new egk(dhkVar, rq3Var, 4);
            case 5:
                return new egk(dhkVar, rq3Var, 5);
            case 6:
                return new egk(dhkVar, rq3Var, 6);
            default:
                return new egk(dhkVar, rq3Var, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((egk) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
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
                Object deleteAccount = registrationCoroutinesAPI.deleteAccount(this);
                return deleteAccount == lu3Var ? lu3Var : deleteAccount;
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
                NetworkCoroutineAPI networkCoroutineAPI = dhkVar.a;
                this.s = 1;
                Object deleteReferral = networkCoroutineAPI.deleteReferral(this);
                return deleteReferral == lu3Var2 ? lu3Var2 : deleteReferral;
            case 2:
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
                NetworkCoroutineAPI networkCoroutineAPI2 = dhkVar.a;
                this.s = 1;
                Object generateReferralShareLink = networkCoroutineAPI2.generateReferralShareLink(this);
                return generateReferralShareLink == lu3Var3 ? lu3Var3 : generateReferralShareLink;
            case 3:
                lu3 lu3Var4 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI3 = dhkVar.a;
                this.s = 1;
                Object userRegion = networkCoroutineAPI3.userRegion(this);
                return userRegion == lu3Var4 ? lu3Var4 : userRegion;
            case 4:
                lu3 lu3Var5 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI4 = dhkVar.c;
                this.s = 1;
                Object valuableUsersVersions = networkCoroutineAPI4.getValuableUsersVersions(this);
                return valuableUsersVersions == lu3Var5 ? lu3Var5 : valuableUsersVersions;
            case 5:
                lu3 lu3Var6 = lu3.a;
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
                RegistrationCoroutinesAPI registrationCoroutinesAPI2 = dhkVar.b;
                this.s = 1;
                Object sync = registrationCoroutinesAPI2.sync(this);
                return sync == lu3Var6 ? lu3Var6 : sync;
            case 6:
                lu3 lu3Var7 = lu3.a;
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
                RegistrationCoroutinesAPI registrationCoroutinesAPI3 = dhkVar.b;
                this.s = 1;
                Object obj2 = registrationCoroutinesAPI3.tokenRefresh(this);
                return obj2 == lu3Var7 ? lu3Var7 : obj2;
            default:
                lu3 lu3Var8 = lu3.a;
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
                RegistrationCoroutinesAPI registrationCoroutinesAPI4 = dhkVar.b;
                this.s = 1;
                Object userLogout = registrationCoroutinesAPI4.userLogout(this);
                return userLogout == lu3Var8 ? lu3Var8 : userLogout;
        }
    }
}
