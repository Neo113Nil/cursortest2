package com.google.firebase.auth;

import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.firebase.auth.PhoneAuthProvider;
import java.util.Objects;
import lb.C5425d;

/* loaded from: classes3.dex */
public final class g extends PhoneAuthProvider.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PhoneAuthProvider.a f37649a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f37650b;

    public g(FirebaseAuth firebaseAuth, PhoneAuthProvider.a aVar) {
        this.f37649a = aVar;
        Objects.requireNonNull(firebaseAuth);
        this.f37650b = firebaseAuth;
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.a
    public final void onCodeAutoRetrievalTimeOut(String str) {
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.a
    public final void onCodeSent(String str, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
        C5425d c5425d;
        PhoneAuthProvider.a aVar = this.f37649a;
        c5425d = this.f37650b.f37563g;
        aVar.onVerificationCompleted(PhoneAuthProvider.a(str, (String) AbstractC3191o.m(c5425d.e())));
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.a
    public final void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
        this.f37649a.onVerificationCompleted(phoneAuthCredential);
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.a
    public final void onVerificationFailed(eb.k kVar) {
        this.f37649a.onVerificationFailed(kVar);
    }
}
