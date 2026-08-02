package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.UserProfileChangeRequest;
import java.util.Objects;
import lb.AbstractC5433l;

/* loaded from: classes2.dex */
final class zzack implements zzafv<zzahv> {
    private final /* synthetic */ UserProfileChangeRequest zza;
    private final /* synthetic */ zzael zzb;
    private final /* synthetic */ zzaar zzc;

    public zzack(zzaar zzaarVar, UserProfileChangeRequest userProfileChangeRequest, zzael zzaelVar) {
        this.zza = userProfileChangeRequest;
        this.zzb = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzc = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zzb.zza(AbstractC5433l.a(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzahv zzahvVar) {
        zzahv zzahvVar2 = zzahvVar;
        zzail zzailVar = new zzail();
        zzailVar.zzd(zzahvVar2.zzc());
        if (this.zza.h() || this.zza.getDisplayName() != null) {
            zzailVar.zzb(this.zza.getDisplayName());
        }
        if (this.zza.zzc() || this.zza.g() != null) {
            zzailVar.zzg(this.zza.zza());
        }
        zzaar.zza(this.zzc, this.zzb, zzahvVar2, zzailVar, this);
    }
}
