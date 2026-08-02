package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.measurement.internal.f4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ExecutorC3251f4 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W4 f34011a;

    public ExecutorC3251f4(W4 w42) {
        Objects.requireNonNull(w42);
        this.f34011a = w42;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f34011a.f33578a.b().t(runnable);
    }
}
