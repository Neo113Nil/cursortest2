package defpackage;

import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.web_view.BlazeWebViewActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class yam extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ BlazeWebViewActivity s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yam(BlazeWebViewActivity blazeWebViewActivity, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = blazeWebViewActivity;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new yam(this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        new yam(this.s, (rq3) obj2).invokeSuspend(Unit.a);
        return lu3.a;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            b1d dismissPlayerEventFlow$blazesdk_release = BlazeSDK.INSTANCE.getDismissPlayerEventFlow$blazesdk_release();
            j8m j8mVar = new j8m(this.s);
            this.r = 1;
            if (dismissPlayerEventFlow$blazesdk_release.collect(j8mVar, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        pvd.x();
        return null;
    }
}
