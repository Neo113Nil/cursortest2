package defpackage;

import defpackage.c1m;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class evm extends hoi implements Function2 {
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ obm t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evm(obm obmVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = obmVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        evm evmVar = new evm(this.t, rq3Var);
        evmVar.s = obj;
        return evmVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        evm evmVar = new evm(this.t, (rq3) obj2);
        evmVar.s = (c1m.a) obj;
        return evmVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        urm urmVar;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            c1m.a aVar = (c1m.a) this.s;
            obm obmVar = this.t;
            orm ormVar = obmVar.q;
            if (obmVar.G() && (urmVar = obmVar.r) != null) {
                int currentItem = ormVar.e.getCurrentItem();
                this.s = ormVar;
                this.r = 1;
                if (urmVar.u(currentItem, aVar, this) == lu3Var) {
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
