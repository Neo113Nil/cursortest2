package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class obj extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ tbj s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ obj(tbj tbjVar, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.s = tbjVar;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        tbj tbjVar = this.s;
        switch (i) {
            case 0:
                return new obj(tbjVar, rq3Var, 0);
            case 1:
                return new obj(tbjVar, rq3Var, 1);
            case 2:
                return new obj(tbjVar, rq3Var, 2);
            default:
                return new obj(tbjVar, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((obj) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        tbj tbjVar = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                tbjVar.A = false;
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                tbjVar.c();
                break;
            case 2:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                tbjVar.a(tbjVar.A);
                break;
            default:
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                tbjVar.o();
                break;
        }
        return Unit.a;
    }
}
