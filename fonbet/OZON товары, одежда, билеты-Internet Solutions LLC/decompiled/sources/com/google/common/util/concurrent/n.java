package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes9.dex */
final class n implements Executor {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Executor f59207a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f59208b;

    n(Executor executor, a aVar) {
        this.f59207a = executor;
        this.f59208b = aVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.f59207a.execute(runnable);
        } catch (RejectedExecutionException e11) {
            this.f59208b.w(e11);
        }
    }
}
