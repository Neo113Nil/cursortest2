package defpackage;

import com.blaze.blazesdk.shared.BlazeSDK;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ylm extends hoi implements ct8 {
    public int r;
    public /* synthetic */ b98 s;
    public /* synthetic */ Throwable t;

    public ylm(rq3 rq3Var) {
        super(3, rq3Var);
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ylm ylmVar = new ylm((rq3) obj3);
        ylmVar.s = (b98) obj;
        ylmVar.t = (Throwable) obj2;
        return ylmVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            b98 b98Var = this.s;
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(this.t, null);
            this.s = null;
            this.r = 1;
            if (b98Var.emit(null, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
