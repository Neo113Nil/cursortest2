package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final class zzhlq extends zzhdt {
    private final String zza;
    private final zzhtb zzb;

    /* synthetic */ zzhlq(String str, zzhtb zzhtbVar, byte[] bArr) {
        this.zza = str;
        this.zzb = zzhtbVar;
    }

    public final String toString() {
        String str = this.zza;
        int ordinal = this.zzb.ordinal();
        return String.format("(typeUrl=%s, outputPrefixType=%s)", str, ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zzb != zzhtb.RAW;
    }
}
