package defpackage;

import com.sofascore.model.newNetwork.post.UserPurchasePostBody;
import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bl extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ el t;
    public final /* synthetic */ String u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bl(el elVar, String str, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.t = elVar;
        this.u = str;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        String str = this.u;
        el elVar = this.t;
        switch (i) {
            case 0:
                return new bl(elVar, str, rq3Var, 0);
            default:
                return new bl(elVar, str, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((bl) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        el elVar = this.t;
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
                NetworkCoroutineAPI networkCoroutineAPI = elVar.a;
                this.s = 1;
                Object affiliateBanners = networkCoroutineAPI.getAffiliateBanners(this.u, this);
                return affiliateBanners == lu3Var ? lu3Var : affiliateBanners;
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
                NetworkCoroutineAPI networkCoroutineAPI2 = elVar.a;
                UserPurchasePostBody userPurchasePostBody = new UserPurchasePostBody(this.u, (String) null, (String) null, (Long) null, (Long) null, 30, (DefaultConstructorMarker) null);
                this.s = 1;
                Object purchaseAds = networkCoroutineAPI2.purchaseAds(userPurchasePostBody, this);
                return purchaseAds == lu3Var2 ? lu3Var2 : purchaseAds;
        }
    }
}
