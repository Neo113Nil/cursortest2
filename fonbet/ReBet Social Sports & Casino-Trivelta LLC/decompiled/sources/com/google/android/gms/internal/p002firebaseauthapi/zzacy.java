package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzz;
import kb.AbstractC5239y;
import lb.m0;

/* loaded from: classes2.dex */
final class zzacy extends zzaff<AuthResult, m0> {
    private final AbstractC5239y zzv;
    private final String zzw;
    private final String zzx;

    public zzacy(AbstractC5239y abstractC5239y, String str, String str2) {
        super(2);
        this.zzv = (AbstractC5239y) AbstractC3191o.m(abstractC5239y);
        this.zzw = AbstractC3191o.g(str);
        this.zzx = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "finalizeMfaSignIn";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        zzaf zza = zzacq.zza(this.zzc, this.zzk);
        FirebaseUser firebaseUser = this.zzd;
        if (firebaseUser != null && !firebaseUser.a().equalsIgnoreCase(zza.a())) {
            zza(new Status(17024));
        } else {
            ((m0) this.zze).a(this.zzj, zza);
            zzb(new zzz(zza));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzw, this.zzv, this.zzx, this.zzb);
    }
}
