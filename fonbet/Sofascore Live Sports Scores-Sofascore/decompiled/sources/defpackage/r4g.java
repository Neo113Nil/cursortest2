package defpackage;

import android.content.Context;
import com.sofascore.model.firebase.AdType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class r4g extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ u4g s;
    public final /* synthetic */ AdType.RewardedInterstitial t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4g(u4g u4gVar, AdType.RewardedInterstitial rewardedInterstitial, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = u4gVar;
        this.t = rewardedInterstitial;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new r4g(this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((r4g) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            Context i2 = this.s.i();
            this.r = 1;
            obj = s9a.r(new o4g(this.t, i2, null), this);
            if (obj == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        ksh kshVar = (ksh) obj;
        if (kshVar != null) {
            return kshVar;
        }
        ilg.c();
        return null;
    }
}
