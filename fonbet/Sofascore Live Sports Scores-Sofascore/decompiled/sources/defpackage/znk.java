package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class znk extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public yzc s;
    public int t;
    public final /* synthetic */ aok u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ znk(aok aokVar, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.u = aokVar;
        this.v = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        int i2 = this.v;
        aok aokVar = this.u;
        switch (i) {
            case 0:
                return new znk(aokVar, i2, rq3Var, 0);
            default:
                return new znk(aokVar, i2, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((znk) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        yzc yzcVar;
        yzc yzcVar2;
        int i = this.r;
        int i2 = this.v;
        aok aokVar = this.u;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.t;
                if (i3 == 0) {
                    y6a.M(obj);
                    yzc yzcVar3 = aokVar.i;
                    s96 s96Var = aokVar.f;
                    this.s = yzcVar3;
                    this.t = 1;
                    Object d = s96Var.d(i2, this);
                    if (d == lu3Var) {
                        break;
                    } else {
                        obj = d;
                        yzcVar = yzcVar3;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    yzcVar = this.s;
                    y6a.M(obj);
                }
                yzcVar.k(yaa.x((x2g) obj));
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.t;
                if (i4 == 0) {
                    y6a.M(obj);
                    yzc yzcVar4 = aokVar.g;
                    unk unkVar = aokVar.e;
                    this.s = yzcVar4;
                    this.t = 1;
                    Object c = unkVar.c(i2, this);
                    if (c == lu3Var2) {
                        break;
                    } else {
                        obj = c;
                        yzcVar2 = yzcVar4;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    yzcVar2 = this.s;
                    y6a.M(obj);
                }
                yzcVar2.k(obj);
                break;
        }
        return Unit.a;
    }
}
