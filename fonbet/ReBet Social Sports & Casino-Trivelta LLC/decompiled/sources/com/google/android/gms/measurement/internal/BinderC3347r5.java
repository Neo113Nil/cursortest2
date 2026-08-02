package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.r5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3347r5 extends AbstractBinderC3257g2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f34266a;

    public BinderC3347r5(Z5 z52, AtomicReference atomicReference) {
        this.f34266a = atomicReference;
        Objects.requireNonNull(z52);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3265h2
    public final void zze(List list) {
        AtomicReference atomicReference = this.f34266a;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
