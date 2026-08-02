package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.ActionCodeSettings;

/* loaded from: classes2.dex */
final class zzaeh extends zzaff<Void, Void> {
    private final zzahm zzv;

    public zzaeh(String str, String str2, ActionCodeSettings actionCodeSettings) {
        super(6);
        AbstractC3191o.g(str);
        AbstractC3191o.g(str2);
        AbstractC3191o.m(actionCodeSettings);
        this.zzv = zzahm.zza(actionCodeSettings, str, str2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "verifyBeforeUpdateEmail";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zzc(this.zzv, this.zzb);
    }
}
