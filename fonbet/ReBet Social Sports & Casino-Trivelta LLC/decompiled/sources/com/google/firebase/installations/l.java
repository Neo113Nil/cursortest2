package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public class l implements o {

    /* renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f37824a;

    public l(TaskCompletionSource taskCompletionSource) {
        this.f37824a = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.o
    public boolean a(xb.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f37824a.trySetResult(dVar.d());
        return true;
    }

    @Override // com.google.firebase.installations.o
    public boolean b(Exception exc) {
        return false;
    }
}
