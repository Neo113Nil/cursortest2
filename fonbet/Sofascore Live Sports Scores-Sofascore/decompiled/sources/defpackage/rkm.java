package defpackage;

import com.blaze.blazesdk.ads.ima.exo_player.ImaPresenterActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rkm extends hoi implements Function2 {
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ ImaPresenterActivity t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rkm(ImaPresenterActivity imaPresenterActivity, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = imaPresenterActivity;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        rkm rkmVar = new rkm(this.t, rq3Var);
        rkmVar.s = obj;
        return rkmVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        rkm rkmVar = new rkm(this.t, (rq3) obj2);
        rkmVar.s = (ku3) obj;
        return rkmVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            ku3 ku3Var = (ku3) this.s;
            ImaPresenterActivity imaPresenterActivity = this.t;
            xdh xdhVar = ((x8m) imaPresenterActivity.m.getValue()).r;
            if (xdhVar == null) {
                return Unit.a;
            }
            cjm cjmVar = new cjm(ku3Var, imaPresenterActivity);
            this.r = 1;
            if (xdhVar.collect(cjmVar, this) == lu3Var) {
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
