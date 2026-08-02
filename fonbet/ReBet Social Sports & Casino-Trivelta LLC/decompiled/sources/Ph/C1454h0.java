package Ph;

import java.util.concurrent.Future;

/* renamed from: Ph.h0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1454h0 implements InterfaceC1456i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Future f9093a;

    public C1454h0(Future future) {
        this.f9093a = future;
    }

    @Override // Ph.InterfaceC1456i0
    public void dispose() {
        this.f9093a.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f9093a + ']';
    }
}
