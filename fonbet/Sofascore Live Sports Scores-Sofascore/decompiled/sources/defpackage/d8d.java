package defpackage;

import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d8d extends hoi implements ct8 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ int t;
    public /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d8d(Object obj, rq3 rq3Var, int i) {
        super(3, rq3Var);
        this.r = i;
        this.v = obj;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.r;
        Object obj4 = this.v;
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        rq3 rq3Var = (rq3) obj3;
        switch (i) {
            case 0:
                d8d d8dVar = new d8d((qa6) obj4, rq3Var, 0);
                d8dVar.t = intValue;
                d8dVar.u = intValue2;
                return d8dVar.invokeSuspend(Unit.a);
            default:
                d8d d8dVar2 = new d8d((i7l) obj4, rq3Var, 1);
                d8dVar2.t = intValue;
                d8dVar2.u = intValue2;
                return d8dVar2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Object obj2 = this.v;
        switch (i) {
            case 0:
                int i2 = this.t;
                int i3 = this.u;
                lu3 lu3Var = lu3.a;
                int i4 = this.s;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                List a = l5i.a();
                this.t = i2;
                this.u = i3;
                this.s = 1;
                Object r = s9a.r(new ea6((qa6) obj2, a, i3, i2, null), this);
                return r == lu3Var ? lu3Var : r;
            default:
                int i5 = this.t;
                int i6 = this.u;
                lu3 lu3Var2 = lu3.a;
                int i7 = this.s;
                if (i7 != 0) {
                    if (i7 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                qa6 qa6Var = ((i7l) obj2).a;
                List a2 = l5i.a();
                this.t = i5;
                this.u = i6;
                this.s = 1;
                qa6Var.getClass();
                Object r2 = s9a.r(new ea6(qa6Var, a2, i6, i5, null), this);
                return r2 == lu3Var2 ? lu3Var2 : r2;
        }
    }
}
