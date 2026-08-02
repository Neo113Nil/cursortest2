package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vpb extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ ypb t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vpb(ypb ypbVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = ypbVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        ypb ypbVar = this.t;
        switch (i) {
            case 0:
                return new vpb(ypbVar, rq3Var, 0);
            default:
                return new vpb(ypbVar, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((vpb) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object obj2;
        int i = this.r;
        ypb ypbVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    cg4 cg4Var = ypbVar.f;
                    this.s = 1;
                    if (cg4Var.g("FANTASY_SHOW_FEEDBACK_BUBBLE", false, this) == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                fdi fdiVar = ypbVar.i;
                do {
                    value = fdiVar.getValue();
                    obj2 = (tpb) value;
                    ppb ppbVar = obj2 instanceof ppb ? (ppb) obj2 : null;
                    ppb ppbVar2 = ppbVar == null ? null : ppbVar;
                    if (ppbVar2 != null) {
                        obj2 = ppb.a(ppbVar2, null, null, null, null, null, false, false, 95);
                    }
                } while (!fdiVar.k(value, obj2));
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (ypbVar.l(this) == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
        }
        return Unit.a;
    }
}
