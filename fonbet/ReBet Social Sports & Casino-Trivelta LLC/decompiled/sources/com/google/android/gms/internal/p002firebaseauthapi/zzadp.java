package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.ActionCodeSettings;
import lb.m0;

/* loaded from: classes2.dex */
final class zzadp extends zzaff<Void, m0> {

    @NonNull
    private final zzahm zzv;
    private final String zzw;

    public zzadp(String str, ActionCodeSettings actionCodeSettings, String str2, String str3, String str4) {
        super(4);
        AbstractC3191o.h(str, "email cannot be null or empty");
        zzahm zzahmVar = new zzahm(actionCodeSettings.O());
        this.zzv = zzahmVar;
        zzahmVar.zzb(str);
        zzahmVar.zza(actionCodeSettings);
        zzahmVar.zzc(str2);
        zzahmVar.zza(str3);
        this.zzw = str4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zzb(this.zzv, this.zzb);
    }
}
