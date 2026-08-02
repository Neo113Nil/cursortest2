package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth.b f37640a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f37641b;

    public d(FirebaseAuth firebaseAuth, FirebaseAuth.b bVar) {
        this.f37640a = bVar;
        Objects.requireNonNull(firebaseAuth);
        this.f37641b = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37640a.a(this.f37641b);
    }
}
