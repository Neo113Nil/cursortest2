package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class gn1 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ mn1 c;

    public /* synthetic */ gn1(mn1 mn1Var, xtc xtcVar, int i) {
        this.c = mn1Var;
        this.b = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        mn1 mn1Var = this.c;
        xtc xtcVar = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                m6k.c(aba.K(49), mn1Var, of3Var, xtcVar);
                break;
            default:
                m6k.b(aba.K(1), mn1Var, of3Var, xtcVar);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ gn1(xtc xtcVar, mn1 mn1Var, int i) {
        this.b = xtcVar;
        this.c = mn1Var;
    }
}
