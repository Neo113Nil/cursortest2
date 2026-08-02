package com.google.firebase.auth;

import android.text.TextUtils;
import com.google.android.gms.internal.p002firebaseauthapi.zzaen;
import com.google.firebase.auth.PhoneAuthProvider;
import java.util.Objects;
import lb.k0;

/* loaded from: classes3.dex */
public final class f extends PhoneAuthProvider.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f37645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f37646b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PhoneAuthProvider.a f37647c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f37648d;

    public f(FirebaseAuth firebaseAuth, a aVar, k0 k0Var, PhoneAuthProvider.a aVar2) {
        this.f37645a = aVar;
        this.f37646b = k0Var;
        this.f37647c = aVar2;
        Objects.requireNonNull(firebaseAuth);
        this.f37648d = firebaseAuth;
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.a
    public final void onCodeAutoRetrievalTimeOut(String str) {
        this.f37647c.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.a
    public final void onCodeSent(String str, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
        this.f37647c.onCodeSent(str, forceResendingToken);
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.a
    public final void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
        this.f37647c.onVerificationCompleted(phoneAuthCredential);
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.a
    public final void onVerificationFailed(eb.k kVar) {
        if (zzaen.zza(kVar)) {
            this.f37645a.c(true);
            this.f37645a.k();
            FirebaseAuth.j0(this.f37645a);
            return;
        }
        if (TextUtils.isEmpty(this.f37646b.c())) {
            this.f37645a.k();
            kVar.getMessage();
            this.f37647c.onVerificationFailed(kVar);
        } else if (zzaen.zzb(kVar) && this.f37648d.q0().d("PHONE_PROVIDER") && TextUtils.isEmpty(this.f37646b.b())) {
            this.f37645a.e(true);
            this.f37645a.k();
            FirebaseAuth.j0(this.f37645a);
        } else {
            this.f37645a.k();
            kVar.getMessage();
            this.f37647c.onVerificationFailed(kVar);
        }
    }
}
