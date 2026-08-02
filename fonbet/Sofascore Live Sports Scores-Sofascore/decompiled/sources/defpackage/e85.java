package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class e85 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ wzc t;
    public final /* synthetic */ e1d u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e85(wzc wzcVar, e1d e1dVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = wzcVar;
        this.u = e1dVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new e85(this.t, this.u, rq3Var, 0);
            case 1:
                return new e85(this.t, this.u, rq3Var, 1);
            default:
                return new e85(this.t, this.u, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((e85) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        e1d e1dVar = this.u;
        wzc wzcVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    ArrayList u = fc6.u(obj);
                    z88 b = wzcVar.b();
                    d85 d85Var = new d85(u, e1dVar, 0);
                    this.s = 1;
                    if (b.collect(d85Var, this) == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    ArrayList u2 = fc6.u(obj);
                    z88 b2 = wzcVar.b();
                    d85 d85Var2 = new d85(u2, e1dVar, 1);
                    this.s = 1;
                    if (b2.collect(d85Var2, this) == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    ArrayList u3 = fc6.u(obj);
                    z88 b3 = wzcVar.b();
                    d85 d85Var3 = new d85(u3, e1dVar, 2);
                    this.s = 1;
                    if (b3.collect(d85Var3, this) == lu3Var3) {
                        break;
                    }
                } else if (i4 != 1) {
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
