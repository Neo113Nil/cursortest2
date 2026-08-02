package defpackage;

import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pe8 extends wtc implements be8 {
    @Override // defpackage.be8
    public final void I(zd8 zd8Var) {
        View q = ok3.q(this);
        zd8Var.b(this.a.n && ok3.q(this).hasFocusable());
        View findFocus = q.findFocus();
        if (findFocus != null) {
            zd8Var.c(td8.a(findFocus, q));
        }
    }
}
