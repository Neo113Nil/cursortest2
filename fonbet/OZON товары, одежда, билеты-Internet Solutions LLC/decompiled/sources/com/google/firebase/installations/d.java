package com.google.firebase.installations;

import B8.c;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.a;

/* loaded from: classes.dex */
final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    private final h f59575a;

    /* renamed from: b, reason: collision with root package name */
    private final TaskCompletionSource<f> f59576b;

    public d(h hVar, TaskCompletionSource<f> taskCompletionSource) {
        this.f59575a = hVar;
        this.f59576b = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.g
    public final boolean a(Exception exc) {
        this.f59576b.trySetException(exc);
        return true;
    }

    @Override // com.google.firebase.installations.g
    public final boolean b(B8.d dVar) {
        if (dVar.f() != c.a.REGISTERED || this.f59575a.c(dVar)) {
            return false;
        }
        a.C0906a c0906a = new a.C0906a();
        c0906a.b(dVar.a());
        c0906a.d(dVar.b());
        c0906a.c(dVar.g());
        this.f59576b.setResult(c0906a.a());
        return true;
    }
}
