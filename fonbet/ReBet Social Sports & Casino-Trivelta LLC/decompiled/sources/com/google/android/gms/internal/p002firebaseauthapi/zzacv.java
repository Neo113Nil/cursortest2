package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.tasks.TaskCompletionSource;
import kb.AbstractC5239y;
import lb.m0;

/* loaded from: classes2.dex */
final class zzacv extends zzaff<Void, m0> {
    private final AbstractC5239y zzv;
    private final String zzw;
    private final String zzx;
    private final String zzy;

    public zzacv(AbstractC5239y abstractC5239y, String str, String str2, String str3) {
        super(2);
        this.zzv = (AbstractC5239y) AbstractC3191o.m(abstractC5239y);
        this.zzw = AbstractC3191o.g(str);
        this.zzx = str2;
        this.zzy = str3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "finalizeMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        ((m0) this.zze).a(this.zzj, zzacq.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzw, this.zzx, this.zzy, this.zzb);
    }
}
