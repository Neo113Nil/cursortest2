package defpackage;

import com.blaze.blazesdk.players.BlazeVideoManager;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class m1n extends hoi implements Function2 {
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ BlazeVideoManager t;
    public final /* synthetic */ n4m u;
    public final /* synthetic */ long v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1n(BlazeVideoManager blazeVideoManager, n4m n4mVar, long j, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = blazeVideoManager;
        this.u = n4mVar;
        this.v = j;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        m1n m1nVar = new m1n(this.t, this.u, this.v, rq3Var);
        m1nVar.s = obj;
        return m1nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m1n) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        ku3 ku3Var;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        BlazeVideoManager blazeVideoManager = this.t;
        if (i == 0) {
            y6a.M(obj);
            ku3 ku3Var2 = (ku3) this.s;
            this.s = ku3Var2;
            this.r = 1;
            Object l = BlazeVideoManager.l(blazeVideoManager, this.u, this);
            if (l == lu3Var) {
                return lu3Var;
            }
            ku3Var = ku3Var2;
            obj = l;
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ku3Var = (ku3) this.s;
            y6a.M(obj);
        }
        vcc vccVar = (vcc) obj;
        if (vccVar == null) {
            return Unit.a;
        }
        s9a.t(ku3Var);
        vg6 vg6Var = (vg6) blazeVideoManager.a;
        vg6Var.j0();
        List singletonList = Collections.singletonList(vccVar);
        vg6Var.j0();
        vg6Var.a0(singletonList, false, this.v, 0);
        ((vg6) blazeVideoManager.a).a();
        return Unit.a;
    }
}
