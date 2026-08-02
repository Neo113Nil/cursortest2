package Qa;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class K extends H {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f9566g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ H f9567h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1516f f9568i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(C1516f c1516f, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, H h10) {
        super(taskCompletionSource);
        this.f9568i = c1516f;
        this.f9566g = taskCompletionSource2;
        this.f9567h = h10;
    }

    @Override // Qa.H
    public final void b() {
        Object obj;
        AtomicInteger atomicInteger;
        G g10;
        obj = this.f9568i.f9582f;
        synchronized (obj) {
            try {
                C1516f.o(this.f9568i, this.f9566g);
                atomicInteger = this.f9568i.f9588l;
                if (atomicInteger.getAndIncrement() > 0) {
                    g10 = this.f9568i.f9578b;
                    g10.d("Already connected to the service.", new Object[0]);
                }
                C1516f.q(this.f9568i, this.f9567h);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
