package h5;

import androidx.annotation.NonNull;
import androidx.work.WorkerParameters;

/* loaded from: classes8.dex */
public final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private androidx.work.impl.C f64990a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.work.impl.t f64991b;

    /* renamed from: c, reason: collision with root package name */
    private WorkerParameters.a f64992c;

    public p(@NonNull androidx.work.impl.C c11, @NonNull androidx.work.impl.t tVar, WorkerParameters.a aVar) {
        this.f64990a = c11;
        this.f64991b = tVar;
        this.f64992c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f64990a.k().k(this.f64991b, this.f64992c);
    }
}
