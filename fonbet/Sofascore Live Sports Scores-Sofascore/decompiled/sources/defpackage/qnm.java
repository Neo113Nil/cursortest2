package defpackage;

import com.blaze.blazesdk.user_activity.models.requests.UserActivityRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qnm extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ UserActivityRequest s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qnm(UserActivityRequest userActivityRequest, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = userActivityRequest;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new qnm(this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new qnm(this.s, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            vsl vslVar = tsl.d;
            if (vslVar == null) {
                return null;
            }
            this.r = 1;
            obj = vslVar.postUserActivity(this.s, this);
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
        return (c2g) obj;
    }
}
