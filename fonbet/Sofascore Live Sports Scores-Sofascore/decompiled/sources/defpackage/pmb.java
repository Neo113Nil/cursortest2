package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pmb extends FutureTask {
    public final /* synthetic */ int a = 0;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pmb(uk0 uk0Var, v35 v35Var) {
        super(v35Var);
        this.b = uk0Var;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        switch (this.a) {
            case 0:
                try {
                    if (!isCancelled()) {
                        try {
                            ((qmb) this.b).d((omb) get());
                        } catch (InterruptedException | ExecutionException e) {
                            ((qmb) this.b).d(new omb(e));
                        }
                    }
                    return;
                } finally {
                    this.b = null;
                }
            default:
                uk0 uk0Var = (uk0) this.b;
                AtomicBoolean atomicBoolean = uk0Var.d;
                try {
                    Object obj = get();
                    if (atomicBoolean.get()) {
                        return;
                    }
                    uk0Var.a(obj);
                    return;
                } catch (InterruptedException unused) {
                    return;
                } catch (CancellationException unused2) {
                    if (atomicBoolean.get()) {
                        return;
                    }
                    uk0Var.a(null);
                    return;
                } catch (ExecutionException e2) {
                    vp2.e("An error occurred while executing doInBackground()", e2.getCause());
                    return;
                } catch (Throwable th) {
                    vp2.e("An error occurred while executing doInBackground()", th);
                    return;
                }
        }
    }

    public /* synthetic */ pmb(Callable callable) {
        super(callable);
    }
}
