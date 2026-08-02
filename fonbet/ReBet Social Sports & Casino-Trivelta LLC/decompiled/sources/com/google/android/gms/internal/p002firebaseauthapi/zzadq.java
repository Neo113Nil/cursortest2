package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.ActionCodeSettings;
import lb.m0;

/* loaded from: classes2.dex */
final class zzadq extends zzaff<Void, m0> {

    @NonNull
    private final zzahm zzv;

    public zzadq(String str, ActionCodeSettings actionCodeSettings) {
        super(6);
        AbstractC3191o.h(str, "token cannot be null or empty");
        zzahm zzahmVar = new zzahm(4);
        this.zzv = zzahmVar;
        zzahmVar.zzd(str);
        if (actionCodeSettings != null) {
            zzahmVar.zza(actionCodeSettings);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "sendEmailVerification";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzb);
    }
}
