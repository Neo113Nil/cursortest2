package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.NonNull;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import eb.k;

/* loaded from: classes2.dex */
final class zzaga extends PhoneAuthProvider.a {
    private final /* synthetic */ PhoneAuthProvider.a zza;
    private final /* synthetic */ String zzb;

    public zzaga(PhoneAuthProvider.a aVar, String str) {
        this.zza = aVar;
        this.zzb = str;
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.a
    public final void onCodeAutoRetrievalTimeOut(@NonNull String str) {
        zzagb.zza.remove(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.a
    public final void onCodeSent(@NonNull String str, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
        this.zza.onCodeSent(str, forceResendingToken);
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.a
    public final void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
        zzagb.zza.remove(this.zzb);
        this.zza.onVerificationCompleted(phoneAuthCredential);
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.a
    public final void onVerificationFailed(@NonNull k kVar) {
        zzagb.zza.remove(this.zzb);
        this.zza.onVerificationFailed(kVar);
    }
}
