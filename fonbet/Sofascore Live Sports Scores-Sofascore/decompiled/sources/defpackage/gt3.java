package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class gt3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q5b b;

    public /* synthetic */ gt3(q5b q5bVar, int i) {
        this.a = i;
        this.b = q5bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        q5b q5bVar = this.b;
        switch (i) {
            case 0:
                dma dmaVar = (dma) obj;
                bej d = q5bVar.d();
                if (d != null) {
                    d.c = dmaVar;
                }
                return Unit.a;
            case 1:
                e1d e1dVar = q5bVar.t;
                wcj wcjVar = (wcj) obj;
                String str = wcjVar.a.b;
                q80 q80Var = q5bVar.j;
                if (!Intrinsics.c(str, q80Var != null ? q80Var.b : null)) {
                    ((eoh) q5bVar.k).setValue(p69.a);
                    if (((Boolean) ((eoh) e1dVar).getValue()).booleanValue()) {
                        ((eoh) e1dVar).setValue(Boolean.FALSE);
                    } else {
                        ((eoh) q5bVar.s).setValue(Boolean.FALSE);
                    }
                }
                long j = pej.b;
                q5bVar.f(j);
                q5bVar.e(j);
                q5bVar.u.invoke(wcjVar);
                eqf eqfVar = q5bVar.b;
                fqf fqfVar = eqfVar.a;
                if (fqfVar != null) {
                    fqfVar.f(eqfVar, null);
                }
                return Unit.a;
            case 2:
                q5bVar.r.b(((lu9) obj).a);
                return Unit.a;
            case 3:
                return Boolean.valueOf(q5bVar.r.b(((lu9) obj).a));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((eoh) q5bVar.q).setValue(bool);
                return Unit.a;
        }
    }
}
