package defpackage;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uq3 extends AtomicBoolean implements OutcomeReceiver {

    @NotNull
    private final rq3<Object> a;

    public uq3(lj2 lj2Var) {
        super(false);
        this.a = lj2Var;
    }

    public final void onError(Throwable th) {
        th.getClass();
        if (compareAndSet(false, true)) {
            rq3<Object> rq3Var = this.a;
            p2g p2gVar = w2g.b;
            rq3Var.resumeWith(new u2g(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            rq3<Object> rq3Var = this.a;
            p2g p2gVar = w2g.b;
            rq3Var.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return bf3.l("ContinuationOutcomeReceiver(outcomeReceived = ", ")", get());
    }
}
