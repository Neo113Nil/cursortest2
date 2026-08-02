package com.applovin.impl.mediation;

import com.applovin.impl.e3;
import com.applovin.impl.i0;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;

/* loaded from: classes7.dex */
public class c {
    private final l a;
    private final p b;
    private final a c;
    private i0 d;

    public interface a {
        void a(e3 e3Var);
    }

    c(l lVar, a aVar) {
        this.a = lVar;
        this.b = lVar.Q();
        this.c = aVar;
    }

    public void a(final e3 e3Var, long j) {
        if (p.a()) {
            this.b.a("AdHiddenCallbackTimeoutManager", "Scheduling in " + j + "ms...");
        }
        this.d = i0.a(j, this.a, new Runnable() { // from class: com.applovin.impl.mediation.c$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                c.this.a(e3Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(e3 e3Var) {
        if (p.a()) {
            this.b.a("AdHiddenCallbackTimeoutManager", "Timing out...");
        }
        this.c.a(e3Var);
    }

    public void a() {
        if (p.a()) {
            this.b.a("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        }
        i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.a();
            this.d = null;
        }
    }
}
