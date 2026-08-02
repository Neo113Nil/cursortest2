package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.s5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3355s5 extends AbstractBinderC3281j2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f34283a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z5 f34284b;

    public BinderC3355s5(Z5 z52, AtomicReference atomicReference) {
        this.f34283a = atomicReference;
        Objects.requireNonNull(z52);
        this.f34284b = z52;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3289k2
    public final void w0(zzoq zzoqVar) {
        AtomicReference atomicReference = this.f34283a;
        synchronized (atomicReference) {
            this.f34284b.f33578a.a().w().b("[sgtm] Got upload batches from service. count", Integer.valueOf(zzoqVar.f34449a.size()));
            atomicReference.set(zzoqVar);
            atomicReference.notifyAll();
        }
    }
}
