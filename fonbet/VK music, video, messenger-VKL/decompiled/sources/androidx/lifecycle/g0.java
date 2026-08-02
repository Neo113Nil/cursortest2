package androidx.lifecycle;

import kotlin.coroutines.EmptyCoroutineContext;
import xsna.dtx0;
import xsna.ge00;
import xsna.izs;
import xsna.s3q0;

/* compiled from: WithLifecycleState.kt */
/* loaded from: classes12.dex */
public final class g0 implements izs<Throwable, s3q0> {
    public final /* synthetic */ ge00 b;
    public final /* synthetic */ Lifecycle c;
    public final /* synthetic */ h0 d;

    public g0(ge00 ge00Var, Lifecycle lifecycle, h0 h0Var) {
        this.b = ge00Var;
        this.c = lifecycle;
        this.d = h0Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Throwable th) {
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.b;
        ge00 ge00Var = this.b;
        boolean S = ge00Var.S(emptyCoroutineContext);
        h0 h0Var = this.d;
        Lifecycle lifecycle = this.c;
        if (S) {
            ge00Var.P(emptyCoroutineContext, new dtx0(lifecycle, h0Var));
        } else {
            lifecycle.removeObserver(h0Var);
        }
        return s3q0.a;
    }
}
