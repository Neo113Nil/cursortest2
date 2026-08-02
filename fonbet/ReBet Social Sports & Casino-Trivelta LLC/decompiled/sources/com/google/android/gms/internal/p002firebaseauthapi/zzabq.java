package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;
import lb.AbstractC5433l;

/* loaded from: classes2.dex */
final class zzabq implements zzafv<zzahv> {
    final /* synthetic */ zzaar zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzael zzc;

    public zzabq(zzaar zzaarVar, String str, zzael zzaelVar) {
        this.zzb = str;
        this.zzc = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zza = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zzc.zza(AbstractC5433l.a(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzahv zzahvVar) {
        zzaft zzaftVar;
        zzahv zzahvVar2 = zzahvVar;
        zzahi zzahiVar = new zzahi(zzahvVar2.zzc());
        zzaftVar = this.zza.zza;
        zzaftVar.zza(zzahiVar, new zzabp(this, this, zzahvVar2, this.zzb, this.zzc));
    }
}
