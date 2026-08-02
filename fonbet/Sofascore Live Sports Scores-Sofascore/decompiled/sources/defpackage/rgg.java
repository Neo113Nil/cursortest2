package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class rgg extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ sgg s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rgg(sgg sggVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = sggVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        sgg sggVar = this.s;
        switch (i) {
            case 0:
                return new rgg(sggVar, rq3Var, 0);
            case 1:
                return new rgg(sggVar, rq3Var, 1);
            case 2:
                return new rgg(sggVar, rq3Var, 2);
            default:
                return new rgg(sggVar, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((rgg) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        sgg sggVar = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                sggVar.setVisibility(8);
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                sggVar.setVisibility(0);
                break;
            case 2:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                sggVar.c.start();
                break;
            default:
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                sggVar.c.stop();
                break;
        }
        return Unit.a;
    }
}
