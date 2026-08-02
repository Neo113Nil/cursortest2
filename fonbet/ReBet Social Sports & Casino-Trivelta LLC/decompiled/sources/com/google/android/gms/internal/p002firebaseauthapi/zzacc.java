package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;
import lb.AbstractC5433l;

/* loaded from: classes2.dex */
final class zzacc implements zzafv<zzahv> {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzaar zzb;

    public zzacc(zzaar zzaarVar, zzael zzaelVar) {
        this.zza = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzb = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zza.zza(AbstractC5433l.a(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzahv zzahvVar) {
        zzaft zzaftVar;
        zzahv zzahvVar2 = zzahvVar;
        zzahi zzahiVar = new zzahi(zzahvVar2.zzc());
        zzaftVar = this.zzb.zza;
        zzaftVar.zza(zzahiVar, new zzacb(this, this, this.zza, zzahvVar2));
    }
}
