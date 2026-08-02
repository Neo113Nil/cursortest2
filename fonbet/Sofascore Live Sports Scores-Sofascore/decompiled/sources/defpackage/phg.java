package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class phg extends hoi implements Function2 {
    public final /* synthetic */ int r = 1;
    public final /* synthetic */ xag s;
    public final /* synthetic */ yhg t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public phg(xag xagVar, yhg yhgVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = xagVar;
        this.t = yhgVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        yhg yhgVar = this.t;
        xag xagVar = this.s;
        switch (i) {
            case 0:
                return new phg(yhgVar, xagVar, rq3Var);
            default:
                return new phg(xagVar, yhgVar, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((phg) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        yhg yhgVar = this.t;
        xag xagVar = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                boolean z = !yhgVar.E && yhgVar.r == nhg.c;
                if (z && !yhgVar.G) {
                    yhgVar.G = true;
                    Iterator it = ((zag) xagVar).w.iterator();
                    while (it.hasNext()) {
                        ((vag) it.next()).a();
                    }
                } else if (!z && yhgVar.G) {
                    yhgVar.G = false;
                    ((zag) xagVar).g();
                }
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                ((zag) xagVar).i(kig.LOADED, yhgVar.C);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public phg(yhg yhgVar, xag xagVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = yhgVar;
        this.s = xagVar;
    }
}
