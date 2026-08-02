package Ph;

import java.util.concurrent.Future;

/* renamed from: Ph.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1461l implements InterfaceC1463m {

    /* renamed from: a, reason: collision with root package name */
    public final Future f9104a;

    public C1461l(Future future) {
        this.f9104a = future;
    }

    @Override // Ph.InterfaceC1463m
    public void b(Throwable th2) {
        this.f9104a.cancel(false);
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f9104a + ']';
    }
}
