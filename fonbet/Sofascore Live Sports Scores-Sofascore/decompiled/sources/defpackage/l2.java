package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l2 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ m2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2(m2 m2Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = m2Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        m2 m2Var = this.s;
        switch (i) {
            case 0:
                return new l2(m2Var, rq3Var, 0);
            default:
                return new l2(m2Var, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((l2) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        rq3 rq3Var = null;
        m2 m2Var = this.s;
        int i2 = 3;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                if (m2Var.D == null) {
                    sf9 sf9Var = new sf9();
                    wzc wzcVar = m2Var.q;
                    if (wzcVar != null) {
                        xw3.L(m2Var.Y0(), null, null, new l0(wzcVar, sf9Var, rq3Var, i2), 3);
                    }
                    m2Var.D = sf9Var;
                }
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                sf9 sf9Var2 = m2Var.D;
                if (sf9Var2 != null) {
                    tf9 tf9Var = new tf9(sf9Var2);
                    wzc wzcVar2 = m2Var.q;
                    if (wzcVar2 != null) {
                        xw3.L(m2Var.Y0(), null, null, new l0(wzcVar2, tf9Var, rq3Var, 4), 3);
                    }
                    m2Var.D = null;
                }
                break;
        }
        return Unit.a;
    }
}
