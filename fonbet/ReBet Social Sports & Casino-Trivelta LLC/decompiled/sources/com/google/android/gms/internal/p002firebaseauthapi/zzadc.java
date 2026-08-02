package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzz;
import lb.m0;

/* loaded from: classes2.dex */
final class zzadc extends zzaff<AuthResult, m0> {
    private final EmailAuthCredential zzv;
    private final String zzw;

    public zzadc(EmailAuthCredential emailAuthCredential, String str) {
        super(2);
        this.zzv = (EmailAuthCredential) AbstractC3191o.n(emailAuthCredential, "credential cannot be null");
        AbstractC3191o.h(emailAuthCredential.zzc(), "email cannot be null");
        AbstractC3191o.h(emailAuthCredential.zzd(), "password cannot be null");
        this.zzw = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "linkEmailAuthCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        zzaf zza = zzacq.zza(this.zzc, this.zzk);
        ((m0) this.zze).a(this.zzj, zza);
        zzb(new zzz(zza));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv.zzc(), AbstractC3191o.g(this.zzv.zzd()), this.zzd.zze(), this.zzd.l(), this.zzw, this.zzb);
    }
}
