package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class cpd implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dpd b;

    public /* synthetic */ cpd(dpd dpdVar, int i) {
        this.a = i;
        this.b = dpdVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        dpd dpdVar = this.b;
        switch (i) {
            case 0:
                synchronized (dpd.g) {
                    dpd.f.remove(((uae) dpdVar.e.getValue()).a.w());
                }
                return Unit.a;
            default:
                h84 h84Var = dpdVar.d;
                uae uaeVar = (uae) h84Var.invoke();
                if (i.c(uaeVar) != -1) {
                    return tnf.j(uaeVar.a.w(), true);
                }
                a70.n("OkioStorage requires absolute paths, but did not get an absolute path from producePath = ", h84Var, ", instead got ", uaeVar);
                return null;
        }
    }
}
