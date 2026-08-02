package com.google.firebase.installations;

import B8.c;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    final TaskCompletionSource<String> f59577a;

    public e(TaskCompletionSource<String> taskCompletionSource) {
        this.f59577a = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.g
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.g
    public final boolean b(B8.d dVar) {
        if (dVar.f() != c.a.UNREGISTERED && dVar.f() != c.a.REGISTERED && dVar.f() != c.a.REGISTER_ERROR) {
            return false;
        }
        this.f59577a.trySetResult(dVar.c());
        return true;
    }
}
