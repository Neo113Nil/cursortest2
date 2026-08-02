package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.PhoneAuthProvider;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzafj implements zzafm {
    private final /* synthetic */ String zza;

    public zzafj(zzafh zzafhVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzafhVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafm
    public final void zza(PhoneAuthProvider.a aVar, Object... objArr) {
        aVar.onCodeSent(this.zza, PhoneAuthProvider.ForceResendingToken.g());
    }
}
