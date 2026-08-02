package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.PhoneAuthCredential;

/* loaded from: classes2.dex */
public final class zzafw {
    public static zzajg zza(PhoneAuthCredential phoneAuthCredential) {
        return !TextUtils.isEmpty(phoneAuthCredential.zzd()) ? zzajg.zzb(phoneAuthCredential.N(), phoneAuthCredential.zzd(), phoneAuthCredential.O()) : zzajg.zza(phoneAuthCredential.zzc(), phoneAuthCredential.j(), phoneAuthCredential.O());
    }
}
