package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public class k implements o {

    /* renamed from: a, reason: collision with root package name */
    public final p f37822a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f37823b;

    public k(p pVar, TaskCompletionSource taskCompletionSource) {
        this.f37822a = pVar;
        this.f37823b = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.o
    public boolean a(xb.d dVar) {
        if (!dVar.k() || this.f37822a.f(dVar)) {
            return false;
        }
        this.f37823b.setResult(m.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }

    @Override // com.google.firebase.installations.o
    public boolean b(Exception exc) {
        this.f37823b.trySetException(exc);
        return true;
    }
}
