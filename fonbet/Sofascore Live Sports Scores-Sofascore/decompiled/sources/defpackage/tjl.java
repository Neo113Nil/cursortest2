package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class tjl extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public Integer s;
    public int t;
    public final /* synthetic */ rxb u;
    public final /* synthetic */ qkl v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tjl(rxb rxbVar, qkl qklVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = rxbVar;
        this.v = qklVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        qkl qklVar = this.v;
        rxb rxbVar = this.u;
        switch (i) {
            case 0:
                return new tjl(rxbVar, qklVar, rq3Var, 0);
            default:
                return new tjl(rxbVar, qklVar, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((tjl) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Integer num;
        Integer num2;
        int i = this.r;
        qkl qklVar = this.v;
        rxb rxbVar = this.u;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.t;
                if (i2 == 0) {
                    y6a.M(obj);
                    Integer num3 = new Integer(rxbVar.a.getId());
                    int id = rxbVar.a.getId();
                    this.s = num3;
                    this.t = 1;
                    obj = qklVar.t(id, this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                    num = num3;
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    num = this.s;
                    y6a.M(obj);
                }
                return new Pair(num, obj);
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.t;
                if (i3 == 0) {
                    y6a.M(obj);
                    Integer num4 = new Integer(rxbVar.a.getId());
                    int id2 = rxbVar.a.getId();
                    this.s = num4;
                    this.t = 1;
                    obj = qklVar.t(id2, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                    num2 = num4;
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    num2 = this.s;
                    y6a.M(obj);
                }
                return new Pair(num2, obj);
        }
    }
}
