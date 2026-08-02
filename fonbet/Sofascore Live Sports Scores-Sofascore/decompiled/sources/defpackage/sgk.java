package defpackage;

import com.sofascore.network.api.RegistrationCoroutinesAPI;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sgk extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ dhk t;
    public final /* synthetic */ HashSet u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sgk(dhk dhkVar, HashSet hashSet, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.t = dhkVar;
        this.u = hashSet;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        HashSet hashSet = this.u;
        dhk dhkVar = this.t;
        switch (i) {
            case 0:
                return new sgk(dhkVar, hashSet, rq3Var, 0);
            case 1:
                return new sgk(dhkVar, hashSet, rq3Var, 1);
            case 2:
                return new sgk(dhkVar, hashSet, rq3Var, 2);
            case 3:
                return new sgk(dhkVar, hashSet, rq3Var, 3);
            case 4:
                return new sgk(dhkVar, hashSet, rq3Var, 4);
            default:
                return new sgk(dhkVar, hashSet, rq3Var, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((sgk) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        HashSet<Integer> hashSet = this.u;
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
                Object userLeagueFavorites = registrationCoroutinesAPI.userLeagueFavorites(hashSet, this);
                return userLeagueFavorites == lu3Var ? lu3Var : userLeagueFavorites;
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
                Object userLeagueNotifications = registrationCoroutinesAPI2.userLeagueNotifications(hashSet, this);
                return userLeagueNotifications == lu3Var2 ? lu3Var2 : userLeagueNotifications;
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
                Object userPlayerFavorites = registrationCoroutinesAPI3.userPlayerFavorites(hashSet, this);
                return userPlayerFavorites == lu3Var3 ? lu3Var3 : userPlayerFavorites;
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
                Object userPlayerNotifications = registrationCoroutinesAPI4.userPlayerNotifications(hashSet, this);
                return userPlayerNotifications == lu3Var4 ? lu3Var4 : userPlayerNotifications;
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
                Object userTeamFavorites = registrationCoroutinesAPI5.userTeamFavorites(hashSet, this);
                return userTeamFavorites == lu3Var5 ? lu3Var5 : userTeamFavorites;
            default:
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
                Object userTeamNotifications = registrationCoroutinesAPI6.userTeamNotifications(hashSet, this);
                return userTeamNotifications == lu3Var6 ? lu3Var6 : userTeamNotifications;
        }
    }
}
