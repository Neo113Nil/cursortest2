package com.facebook.imagepipeline.producers;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f30868a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30869b;

    /* renamed from: c, reason: collision with root package name */
    public final Deque f30870c;

    public q0(Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f30868a = executor;
        this.f30870c = new ArrayDeque();
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public synchronized void a(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f30870c.remove(runnable);
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public synchronized void b(Runnable runnable) {
        try {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            if (this.f30869b) {
                this.f30870c.add(runnable);
            } else {
                this.f30868a.execute(runnable);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
