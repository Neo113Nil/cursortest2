package defpackage;

import com.blaze.blazesdk.features.videos.players.ui.a;
import defpackage.c1m;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gx0 extends hoi implements Function2 {
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ a t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx0(a aVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = aVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        gx0 gx0Var = new gx0(this.t, rq3Var);
        gx0Var.s = obj;
        return gx0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        gx0 gx0Var = new gx0(this.t, (rq3) obj2);
        gx0Var.s = (c1m.a) obj;
        return gx0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lzm lzmVar;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            c1m.a aVar = (c1m.a) this.s;
            a aVar2 = this.t;
            dxm dxmVar = aVar2.q;
            if (aVar2.J() && (lzmVar = aVar2.r) != null) {
                int currentItem = dxmVar.e.getCurrentItem();
                this.s = dxmVar;
                this.r = 1;
                if (lzmVar.v(currentItem, aVar, this) == lu3Var) {
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
