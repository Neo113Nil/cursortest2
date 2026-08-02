package defpackage;

import com.blaze.blazesdk.features.videos.players.ui.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hhm extends hoi implements Function2 {
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ a t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhm(a aVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = aVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        hhm hhmVar = new hhm(this.t, rq3Var);
        hhmVar.s = obj;
        return hhmVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hhm hhmVar = new hhm(this.t, (rq3) obj2);
        hhmVar.s = (s5m) obj;
        return hhmVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            s5m s5mVar = (s5m) this.s;
            int i2 = a.I;
            a aVar = this.t;
            if (!aVar.J()) {
                return Unit.a;
            }
            dxm dxmVar = aVar.q;
            lzm lzmVar = aVar.r;
            if (lzmVar != null) {
                int currentItem = dxmVar.e.getCurrentItem();
                this.s = dxmVar;
                this.r = 1;
                if (lzmVar.x(currentItem, s5mVar, this) == lu3Var) {
                    return lu3Var;
                }
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
