package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class fba extends cea {
    public final Function1 e;

    public fba(Function1 function1) {
        this.e = function1;
    }

    @Override // defpackage.cea
    public final boolean l() {
        return false;
    }

    @Override // defpackage.cea
    public final void m(Throwable th) {
        this.e.invoke(th);
    }
}
