package q4;

import android.view.View;
import eg.c0;
import eg.m0;
import eg.t1;
import eg.z0;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public io.sentry.android.replay.p f22030a;

    /* renamed from: b, reason: collision with root package name */
    public t1 f22031b;

    /* renamed from: c, reason: collision with root package name */
    public q f22032c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22033d;

    public final synchronized void a() {
        try {
            t1 t1Var = this.f22031b;
            Continuation continuation = null;
            if (t1Var != null) {
                t1Var.k(null);
            }
            z0 z0Var = z0.f9245a;
            lg.e eVar = m0.f9201a;
            this.f22031b = c0.t(z0Var, jg.q.f18523a.f9624e, null, new r(this, continuation, 0), 2);
            this.f22030a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        q qVar = this.f22032c;
        if (qVar == null) {
            return;
        }
        this.f22033d = true;
        qVar.f22023a.a(qVar.f22024b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        q qVar = this.f22032c;
        if (qVar != null) {
            qVar.e();
        }
    }
}
