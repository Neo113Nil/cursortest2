package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.u4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3370u4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f34320a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f34321b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f34322c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ W4 f34323d;

    public RunnableC3370u4(W4 w42, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f34320a = atomicReference;
        this.f34321b = str2;
        this.f34322c = str3;
        Objects.requireNonNull(w42);
        this.f34323d = w42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34323d.f33578a.J().e0(this.f34320a, null, this.f34321b, this.f34322c);
    }
}
