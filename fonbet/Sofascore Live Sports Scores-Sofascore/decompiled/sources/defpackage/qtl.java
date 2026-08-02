package defpackage;

import com.blaze.blazesdk.delegates.BlazeSDKDelegate;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.results.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qtl extends hoi implements Function1 {
    public final /* synthetic */ g0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qtl(g0 g0Var, rq3 rq3Var) {
        super(1, rq3Var);
        this.r = g0Var;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new qtl(this.r, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new qtl(this.r, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        BlazeSDKDelegate sdkDelegate$blazesdk_release = BlazeSDK.INSTANCE.getSdkDelegate$blazesdk_release();
        if (sdkDelegate$blazesdk_release != null) {
            sdkDelegate$blazesdk_release.onErrorThrown(this.r.d());
        }
        return Unit.a;
    }
}
