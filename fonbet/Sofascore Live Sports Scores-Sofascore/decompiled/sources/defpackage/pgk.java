package defpackage;

import com.sofascore.network.api.RegistrationCoroutinesAPI;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pgk extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ dhk t;
    public final /* synthetic */ Set u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pgk(dhk dhkVar, Set set, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.t = dhkVar;
        this.u = set;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        Set set = this.u;
        dhk dhkVar = this.t;
        switch (i) {
            case 0:
                return new pgk(dhkVar, set, rq3Var, 0);
            case 1:
                return new pgk(dhkVar, set, rq3Var, 1);
            case 2:
                return new pgk(dhkVar, set, rq3Var, 2);
            case 3:
                return new pgk(dhkVar, set, rq3Var, 3);
            case 4:
                return new pgk(dhkVar, set, rq3Var, 4);
            case 5:
                return new pgk(dhkVar, set, rq3Var, 5);
            default:
                return new pgk(dhkVar, set, rq3Var, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((pgk) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Set<Integer> set = this.u;
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
                Object userEvents = registrationCoroutinesAPI.userEvents(set, this);
                return userEvents == lu3Var ? lu3Var : userEvents;
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
                RegistrationCoroutinesAPI registrationCoroutinesAPI2 = dhkVar.b;
                this.s = 1;
                Object userFantasyCompetitions = registrationCoroutinesAPI2.userFantasyCompetitions(set, this);
                return userFantasyCompetitions == lu3Var2 ? lu3Var2 : userFantasyCompetitions;
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
                RegistrationCoroutinesAPI registrationCoroutinesAPI3 = dhkVar.b;
                this.s = 1;
                Object userMutedEvents = registrationCoroutinesAPI3.userMutedEvents(set, this);
                return userMutedEvents == lu3Var3 ? lu3Var3 : userMutedEvents;
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
                RegistrationCoroutinesAPI registrationCoroutinesAPI4 = dhkVar.b;
                this.s = 1;
                Object userMutedStages = registrationCoroutinesAPI4.userMutedStages(set, this);
                return userMutedStages == lu3Var4 ? lu3Var4 : userMutedStages;
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
                RegistrationCoroutinesAPI registrationCoroutinesAPI5 = dhkVar.b;
                this.s = 1;
                Object userPinnedLeagues = registrationCoroutinesAPI5.userPinnedLeagues(set, this);
                return userPinnedLeagues == lu3Var5 ? lu3Var5 : userPinnedLeagues;
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
                RegistrationCoroutinesAPI registrationCoroutinesAPI6 = dhkVar.b;
                this.s = 1;
                Object userStages = registrationCoroutinesAPI6.userStages(set, this);
                return userStages == lu3Var6 ? lu3Var6 : userStages;
            default:
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
                RegistrationCoroutinesAPI registrationCoroutinesAPI7 = dhkVar.b;
                this.s = 1;
                Object userUniqueStages = registrationCoroutinesAPI7.userUniqueStages(set, this);
                return userUniqueStages == lu3Var7 ? lu3Var7 : userUniqueStages;
        }
    }
}
