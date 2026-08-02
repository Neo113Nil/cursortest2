package Ph;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class g1 extends Sh.C implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final long f9091e;

    public g1(long j10, Continuation continuation) {
        super(continuation.get$context(), continuation);
        this.f9091e = j10;
    }

    @Override // Ph.AbstractC1439a, Ph.I0
    public String i0() {
        return super.i0() + "(timeMillis=" + this.f9091e + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        B(h1.a(this.f9091e, AbstractC1440a0.b(get$context()), this));
    }
}
