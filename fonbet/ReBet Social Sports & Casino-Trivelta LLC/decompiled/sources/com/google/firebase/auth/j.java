package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth.a f37708a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f37709b;

    public j(FirebaseAuth firebaseAuth, FirebaseAuth.a aVar) {
        this.f37708a = aVar;
        Objects.requireNonNull(firebaseAuth);
        this.f37709b = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37708a.a(this.f37709b);
    }
}
