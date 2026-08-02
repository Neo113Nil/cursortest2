package defpackage;

import com.sofascore.model.profile.ProfileNetworkResponse;
import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hgk extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ dhk t;
    public final /* synthetic */ String u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hgk(dhk dhkVar, String str, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.t = dhkVar;
        this.u = str;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        String str = this.u;
        dhk dhkVar = this.t;
        switch (i) {
            case 0:
                return new hgk(dhkVar, str, rq3Var, 0);
            case 1:
                return new hgk(dhkVar, str, rq3Var, 1);
            case 2:
                return new hgk(dhkVar, str, rq3Var, 2);
            case 3:
                return new hgk(dhkVar, str, rq3Var, 3);
            case 4:
                return new hgk(dhkVar, str, rq3Var, 4);
            case 5:
                return new hgk(dhkVar, str, rq3Var, 5);
            case 6:
                return new hgk(dhkVar, str, rq3Var, 6);
            case 7:
                return new hgk(dhkVar, str, rq3Var, 7);
            case 8:
                return new hgk(dhkVar, str, rq3Var, 8);
            default:
                return new hgk(dhkVar, str, rq3Var, 9);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((hgk) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        String str = this.u;
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
                NetworkCoroutineAPI networkCoroutineAPI = dhkVar.a;
                this.s = 1;
                Object userBadges = networkCoroutineAPI.getUserBadges(str, this);
                return userBadges == lu3Var ? lu3Var : userBadges;
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
                NetworkCoroutineAPI networkCoroutineAPI2 = dhkVar.a;
                this.s = 1;
                Object referralShareLink = networkCoroutineAPI2.getReferralShareLink(str, this);
                return referralShareLink == lu3Var2 ? lu3Var2 : referralShareLink;
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
                NetworkCoroutineAPI networkCoroutineAPI3 = dhkVar.a;
                this.s = 1;
                Object referrals = networkCoroutineAPI3.getReferrals(str, this);
                return referrals == lu3Var3 ? lu3Var3 : referrals;
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
                NetworkCoroutineAPI networkCoroutineAPI4 = dhkVar.a;
                this.s = 1;
                Object sofaSeason = networkCoroutineAPI4.getSofaSeason(str, this);
                return sofaSeason == lu3Var4 ? lu3Var4 : sofaSeason;
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
                NetworkCoroutineAPI networkCoroutineAPI5 = dhkVar.a;
                this.s = 1;
                Object userContributionSummary = networkCoroutineAPI5.getUserContributionSummary(str, this);
                return userContributionSummary == lu3Var5 ? lu3Var5 : userContributionSummary;
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
                NetworkCoroutineAPI networkCoroutineAPI6 = dhkVar.a;
                this.s = 1;
                Object userContributions = networkCoroutineAPI6.getUserContributions(str, this);
                return userContributions == lu3Var6 ? lu3Var6 : userContributions;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI7 = dhkVar.a;
                    this.s = 1;
                    obj = networkCoroutineAPI7.profile(str, this);
                    if (obj == lu3Var7) {
                        return lu3Var7;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return ((ProfileNetworkResponse) obj).getUserAccount();
            case 7:
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
                NetworkCoroutineAPI networkCoroutineAPI8 = dhkVar.a;
                this.s = 1;
                Object userSubscriptions = networkCoroutineAPI8.userSubscriptions(str, this);
                return userSubscriptions == lu3Var8 ? lu3Var8 : userSubscriptions;
            case 8:
                lu3 lu3Var9 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI9 = dhkVar.a;
                this.s = 1;
                Object hasSofaSeason = networkCoroutineAPI9.hasSofaSeason(str, this);
                return hasSofaSeason == lu3Var9 ? lu3Var9 : hasSofaSeason;
            default:
                lu3 lu3Var10 = lu3.a;
                int i11 = this.s;
                if (i11 != 0) {
                    if (i11 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI10 = dhkVar.a;
                this.s = 1;
                Object sendSofaSeasonWatched = networkCoroutineAPI10.sendSofaSeasonWatched(str, this);
                return sendSofaSeasonWatched == lu3Var10 ? lu3Var10 : sendSofaSeasonWatched;
        }
    }
}
