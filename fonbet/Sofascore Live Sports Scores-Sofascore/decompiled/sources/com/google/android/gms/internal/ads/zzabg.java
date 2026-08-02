package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzabg implements zzabe {
    public final zzabe a;

    public zzabg(zzabe zzabeVar) {
        this.a = zzabeVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzabg) {
            return this.a.equals(((zzabg) obj).a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzabj
    public final int f(int i) {
        return this.a.f(i);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzabj
    public zzbg zza() {
        return this.a.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzabj
    public zzv zzb(int i) {
        return this.a.zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzabe
    public zzv zzc() {
        return this.a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzabj
    public final int zze() {
        return this.a.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzabj
    public final int zzf(int i) {
        return this.a.zzf(i);
    }

    @Override // com.google.android.gms.internal.ads.zzabe
    public final int zzh() {
        return this.a.zzh();
    }
}
