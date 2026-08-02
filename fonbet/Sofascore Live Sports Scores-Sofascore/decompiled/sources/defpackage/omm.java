package defpackage;

import com.blaze.blazesdk.ads.ima.exo_player.ImaPresenterActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class omm extends hoi implements Function2 {
    public /* synthetic */ Object r;
    public final /* synthetic */ ImaPresenterActivity s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public omm(ImaPresenterActivity imaPresenterActivity, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = imaPresenterActivity;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        omm ommVar = new omm(this.s, rq3Var);
        ommVar.r = obj;
        return ommVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        omm ommVar = new omm(this.s, (rq3) obj2);
        ommVar.r = (ku3) obj;
        return ommVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        ku3 ku3Var = (ku3) this.r;
        ImaPresenterActivity imaPresenterActivity = this.s;
        xw3.L(ku3Var, null, null, new chm(imaPresenterActivity, null), 3);
        xw3.L(ku3Var, null, null, new rkm(imaPresenterActivity, null), 3);
        return Unit.a;
    }
}
