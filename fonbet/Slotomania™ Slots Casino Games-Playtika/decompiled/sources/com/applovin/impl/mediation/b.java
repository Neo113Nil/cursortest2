package com.applovin.impl.mediation;

import com.applovin.impl.e3;
import com.applovin.impl.mediation.a;
import com.applovin.impl.mediation.c;
import com.applovin.impl.sdk.l;
import com.applovin.impl.v2;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes7.dex */
public class b implements a.InterfaceC0102a, c.a {
    private final a a;
    private final c b;

    public b(l lVar) {
        this.a = new a(lVar);
        this.b = new c(lVar, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void c(e3 e3Var) {
        h B;
        if (e3Var == null || (B = e3Var.B()) == null || !e3Var.x().compareAndSet(false, true)) {
            return;
        }
        e3Var.w().set(true);
        v2.e(B.c(), e3Var);
    }

    public void a() {
        this.b.a();
        this.a.a();
    }

    @Override // com.applovin.impl.mediation.a.InterfaceC0102a
    public void b(final e3 e3Var) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.b$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                b.this.c(e3Var);
            }
        }, e3Var.p0());
    }

    public void e(e3 e3Var) {
        long q0 = e3Var.q0();
        if (q0 >= 0) {
            this.b.a(e3Var, q0);
        }
        if (e3Var.B0() || e3Var.C0()) {
            this.a.a(e3Var, this);
        }
    }

    @Override // com.applovin.impl.mediation.c.a
    public void a(e3 e3Var) {
        c(e3Var);
    }
}
