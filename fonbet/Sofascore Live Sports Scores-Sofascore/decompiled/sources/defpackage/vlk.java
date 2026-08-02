package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vlk extends xka implements Function1 {
    public final /* synthetic */ int i;
    public final /* synthetic */ wlk j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vlk(wlk wlkVar, int i) {
        super(1);
        this.i = i;
        this.j = wlkVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.i;
        wlk wlkVar = this.j;
        switch (i) {
            case 0:
                wlkVar.d = true;
                wlkVar.f.invoke();
                return Unit.a;
            default:
                ha5 ha5Var = (ha5) obj;
                u39 u39Var = wlkVar.b;
                float f = wlkVar.k;
                float f2 = wlkVar.l;
                sx2 L0 = ha5Var.L0();
                long D = L0.D();
                L0.t().o();
                try {
                    ((hpo) L0.a).G(f, f2, 0L);
                    u39Var.a(ha5Var);
                    mz1.v(L0, D);
                    return Unit.a;
                } catch (Throwable th) {
                    mz1.v(L0, D);
                    throw th;
                }
        }
    }
}
