package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.n3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3314n3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f34174a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N3 f34175b;

    public RunnableC3314n3(N3 n32, zzr zzrVar) {
        this.f34174a = zzrVar;
        Objects.requireNonNull(n32);
        this.f34175b = n32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N3 n32 = this.f34175b;
        n32.O0().E();
        n32.O0().h0(this.f34174a);
    }
}
