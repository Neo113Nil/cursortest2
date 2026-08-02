package l0;

import android.os.OutcomeReceiver;
import eg.l;
import gf.o;
import gf.q;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Continuation<Object> f19303a;

    public e(l lVar) {
        super(false);
        this.f19303a = lVar;
    }

    public final void onError(Throwable th2) {
        if (compareAndSet(false, true)) {
            Continuation<Object> continuation = this.f19303a;
            o oVar = q.f10031a;
            continuation.resumeWith(h8.b.h(th2));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            Continuation<Object> continuation = this.f19303a;
            o oVar = q.f10031a;
            continuation.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
