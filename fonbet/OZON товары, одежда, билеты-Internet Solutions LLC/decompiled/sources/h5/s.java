package h5;

import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class s implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    private static final String f64995d = androidx.work.o.i("StopWorkRunnable");

    /* renamed from: a, reason: collision with root package name */
    private final androidx.work.impl.C f64996a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.work.impl.t f64997b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f64998c;

    public s(@NonNull androidx.work.impl.C c11, @NonNull androidx.work.impl.t tVar, boolean z11) {
        this.f64996a = c11;
        this.f64997b = tVar;
        this.f64998c = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z11 = this.f64998c;
        androidx.work.impl.C c11 = this.f64996a;
        androidx.work.impl.t tVar = this.f64997b;
        boolean o11 = z11 ? c11.k().o(tVar) : c11.k().p(tVar);
        androidx.work.o.e().a(f64995d, "StopWorkRunnable for " + tVar.a().b() + "; Processor.stopWork = " + o11);
    }
}
