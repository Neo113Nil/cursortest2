package u0;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class f extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Continuation<Object> f65916a;

    public f(Continuation continuation) {
        super(false);
        this.f65916a = continuation;
    }

    public void onError(Throwable th2) {
        if (compareAndSet(false, true)) {
            Continuation<Object> continuation = this.f65916a;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(th2)));
        }
    }

    public void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f65916a.resumeWith(Result.m147constructorimpl(obj));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
