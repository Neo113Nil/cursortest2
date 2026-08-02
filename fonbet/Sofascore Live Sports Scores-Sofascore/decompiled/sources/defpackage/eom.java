package defpackage;

import com.blaze.blazesdk.features.videos.players.ui.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class eom extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ a s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eom(a aVar, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = aVar;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new eom(this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new eom(this.s, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            int i2 = a.I;
            a aVar = this.s;
            th2 B = yqo.B(((w3m) aVar.getViewModel()).O, aVar.getLifecycleOwner().getLifecycle(), e6b.d);
            smm smmVar = new smm(aVar);
            this.r = 1;
            if (B.collect(smmVar, this) == lu3Var) {
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
