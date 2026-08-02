package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.v4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3378v4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f34339a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f34340b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f34341c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f34342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ W4 f34343e;

    public RunnableC3378v4(W4 w42, AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        this.f34339a = atomicReference;
        this.f34340b = str2;
        this.f34341c = str3;
        this.f34342d = z10;
        Objects.requireNonNull(w42);
        this.f34343e = w42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34343e.f33578a.J().g0(this.f34339a, null, this.f34340b, this.f34341c, this.f34342d);
    }
}
