package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes7.dex */
final class zzgtr implements zzgto {
    private static final zzgto zzb = zzgtq.zza;
    private final zzgtv zza = new zzgtv();
    private volatile zzgto zzc;
    private Object zzd;

    zzgtr(zzgto zzgtoVar) {
        this.zzc = zzgtoVar;
    }

    public final String toString() {
        Object obj = this.zzc;
        if (obj == zzb) {
            String valueOf = String.valueOf(this.zzd);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgto
    public final Object zza() {
        zzgto zzgtoVar = this.zzc;
        zzgto zzgtoVar2 = zzb;
        if (zzgtoVar != zzgtoVar2) {
            synchronized (this.zza) {
                if (this.zzc != zzgtoVar2) {
                    Object zza = this.zzc.zza();
                    this.zzd = zza;
                    this.zzc = zzgtoVar2;
                    return zza;
                }
            }
        }
        return this.zzd;
    }
}
