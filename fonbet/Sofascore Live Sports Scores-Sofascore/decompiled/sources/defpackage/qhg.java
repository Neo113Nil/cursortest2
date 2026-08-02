package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qhg extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ yhg s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qhg(yhg yhgVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = yhgVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        yhg yhgVar = this.s;
        switch (i) {
            case 0:
                return new qhg(yhgVar, rq3Var, 0);
            case 1:
                return new qhg(yhgVar, rq3Var, 1);
            case 2:
                return new qhg(yhgVar, rq3Var, 2);
            default:
                return new qhg(yhgVar, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((qhg) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        yhg yhgVar = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                if (yhgVar.q == mhg.b) {
                    sdg sdgVar = yhgVar.m;
                    if (sdgVar == null) {
                        Intrinsics.i("rootLayout");
                        throw null;
                    }
                    sdgVar.requestFocus();
                }
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                ahg ahgVar = yhgVar.v;
                if (ahgVar == null) {
                    Intrinsics.i("videoCloseController");
                    throw null;
                }
                ahgVar.c();
                if (ahgVar.a) {
                    ahgVar.c();
                    xgg xggVar = ahgVar.g;
                    if (xggVar != null) {
                        xggVar.onCloseRequested();
                    }
                } else {
                    ahgVar.m = true;
                    ahgVar.b.a(true);
                    ahgVar.c();
                }
                return Unit.a;
            case 2:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                ahg ahgVar2 = yhgVar.v;
                if (ahgVar2 != null) {
                    ahgVar2.b(wgg.b, yhgVar.C);
                    return Unit.a;
                }
                Intrinsics.i("videoCloseController");
                throw null;
            default:
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                ahg ahgVar3 = yhgVar.v;
                if (ahgVar3 != null) {
                    ahgVar3.b(wgg.a, yhgVar.C);
                    return Unit.a;
                }
                Intrinsics.i("videoCloseController");
                throw null;
        }
    }
}
