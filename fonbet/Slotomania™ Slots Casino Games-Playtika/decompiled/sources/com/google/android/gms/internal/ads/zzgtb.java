package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes8.dex */
final class zzgtb extends zzgsu {
    private final Object zza;

    zzgtb(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgtb) {
            return this.zza.equals(((zzgtb) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.zza.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 13);
        sb.append("Optional.of(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgsu
    public final Object zza(Object obj) {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgsu
    public final zzgsu zzb(zzgsn zzgsnVar) {
        Object apply = zzgsnVar.apply(this.zza);
        zzgsw.zzk(apply, "the Function passed to Optional.transform() must not return null.");
        return new zzgtb(apply);
    }
}
