package defpackage;

import com.ironsource.U3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wh2 extends p7 {
    public final /* synthetic */ xh2 h;

    public wh2(xh2 xh2Var) {
        this.h = xh2Var;
    }

    @Override // defpackage.p7
    public final String h() {
        uh2 uh2Var = (uh2) this.h.a.get();
        return uh2Var == null ? "Completer object has been garbage collected, future will fail soon" : mz1.n(new StringBuilder("tag=["), uh2Var.a, U3.j.e);
    }
}
