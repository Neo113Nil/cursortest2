package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lti extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ j6f s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lti(j6f j6fVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = j6fVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        j6f j6fVar = this.s;
        switch (i) {
            case 0:
                return new lti(j6fVar, rq3Var, 0);
            case 1:
                return new lti(j6fVar, rq3Var, 1);
            case 2:
                return new lti(j6fVar, rq3Var, 2);
            case 3:
                return new lti(j6fVar, rq3Var, 3);
            case 4:
                return new lti(j6fVar, rq3Var, 4);
            case 5:
                return new lti(j6fVar, rq3Var, 5);
            case 6:
                return new lti(j6fVar, rq3Var, 6);
            default:
                return new lti(j6fVar, rq3Var, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((lti) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        j6f j6fVar = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                j6fVar.a();
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                j6fVar.b();
                break;
            case 2:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                j6fVar.b();
                break;
            case 3:
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                j6fVar.a();
                break;
            case 4:
                lu3 lu3Var5 = lu3.a;
                y6a.M(obj);
                j6fVar.b();
                break;
            case 5:
                lu3 lu3Var6 = lu3.a;
                y6a.M(obj);
                j6fVar.b();
                break;
            case 6:
                lu3 lu3Var7 = lu3.a;
                y6a.M(obj);
                j6fVar.a();
                break;
            default:
                lu3 lu3Var8 = lu3.a;
                y6a.M(obj);
                j6fVar.b();
                break;
        }
        return Unit.a;
    }
}
