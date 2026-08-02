package R2;

import androidx.work.WorkerParameters;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class W implements U {

    /* renamed from: a, reason: collision with root package name */
    public final C1543t f9960a;

    /* renamed from: b, reason: collision with root package name */
    public final Z2.b f9961b;

    public W(C1543t processor, Z2.b workTaskExecutor) {
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        this.f9960a = processor;
        this.f9961b = workTaskExecutor;
    }

    public static final void g(W w10, C1549z c1549z, WorkerParameters.a aVar) {
        w10.f9960a.p(c1549z, aVar);
    }

    @Override // R2.U
    public void c(C1549z workSpecId, int i10) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f9961b.d(new Y2.E(this.f9960a, workSpecId, false, i10));
    }

    @Override // R2.U
    public void d(final C1549z workSpecId, final WorkerParameters.a aVar) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f9961b.d(new Runnable() { // from class: R2.V
            @Override // java.lang.Runnable
            public final void run() {
                W.g(W.this, workSpecId, aVar);
            }
        });
    }
}
