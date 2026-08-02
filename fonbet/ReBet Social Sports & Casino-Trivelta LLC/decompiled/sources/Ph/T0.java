package Ph;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class T0 extends H0 {

    /* renamed from: e, reason: collision with root package name */
    public final Continuation f9053e;

    public T0(Continuation continuation) {
        this.f9053e = continuation;
    }

    @Override // Ph.H0
    public boolean u() {
        return false;
    }

    @Override // Ph.H0
    public void v(Throwable th2) {
        Continuation continuation = this.f9053e;
        Result.Companion companion = Result.INSTANCE;
        continuation.resumeWith(Result.m147constructorimpl(Unit.INSTANCE));
    }
}
