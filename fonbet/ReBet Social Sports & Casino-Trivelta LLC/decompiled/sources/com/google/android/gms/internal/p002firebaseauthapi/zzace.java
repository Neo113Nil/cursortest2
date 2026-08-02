package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;
import lb.AbstractC5433l;

/* loaded from: classes2.dex */
final class zzace implements zzafv<zzahv> {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzaar zzb;

    public zzace(zzaar zzaarVar, zzael zzaelVar) {
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
        zzagu zzaguVar = new zzagu(zzahvVar.zzc());
        zzaftVar = this.zzb.zza;
        zzaftVar.zza(zzaguVar, new zzacd(this, this.zza, this));
    }
}
