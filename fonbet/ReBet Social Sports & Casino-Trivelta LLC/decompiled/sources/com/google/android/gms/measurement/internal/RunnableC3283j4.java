package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.j4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3283j4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W4 f34058a;

    public RunnableC3283j4(W4 w42) {
        Objects.requireNonNull(w42);
        this.f34058a = w42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34058a.f33735r.a();
    }
}
