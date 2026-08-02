package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rae implements ak3 {
    public final hlg a;
    public final String b;
    public final Function2 c;
    public final mqi d = ypa.b(new xxb(this, 24));

    public rae(hlg hlgVar, String str, Function2 function2) {
        this.a = hlgVar;
        this.b = str;
        this.c = function2;
    }

    @Override // defpackage.ak3
    public final Object T0(boolean z, Function2 function2, rq3 rq3Var) {
        qae qaeVar = (qae) rq3Var.getContext().get(qae.b);
        rq3 rq3Var2 = null;
        pae paeVar = qaeVar != null ? qaeVar.a : null;
        if (paeVar != null) {
            return function2.invoke(paeVar, rq3Var);
        }
        pae paeVar2 = new pae(this.c, (glg) this.d.getValue());
        return xw3.R(new qae(paeVar2), new gjb(function2, paeVar2, rq3Var2, 29), rq3Var);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        mqi mqiVar = this.d;
        if (mqiVar.isInitialized()) {
            ((glg) mqiVar.getValue()).close();
        }
    }
}
