package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class e2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m2 b;

    public /* synthetic */ e2(m2 m2Var, int i) {
        this.a = i;
        this.b = m2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        xv4 xv4Var;
        int i = this.a;
        m2 m2Var = this.b;
        switch (i) {
            case 0:
                d1a d1aVar = (d1a) tgj.x(m2Var, f1a.a);
                if (!(d1aVar instanceof j1a)) {
                    u3a.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + d1aVar);
                }
                j1a j1aVar = m2Var.y;
                j1a j1aVar2 = (j1a) d1aVar;
                m2Var.y = j1aVar2;
                if (j1aVar != null && !Intrinsics.c(j1aVar2, j1aVar) && ((xv4Var = m2Var.B) != null || !m2Var.I)) {
                    if (xv4Var != null) {
                        m2Var.l1(xv4Var);
                    }
                    m2Var.B = null;
                    m2Var.v1();
                }
                return Unit.a;
            default:
                m2Var.w.invoke();
                return Boolean.TRUE;
        }
    }
}
