package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.1 */
/* loaded from: classes7.dex */
final class zzlg implements zzko {
    private final zzkq zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    @Override // com.google.android.gms.internal.measurement.zzko
    public final zzkq zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzko
    public final zzlf zzb() {
        int i = this.zzd;
        return (i & 1) != 0 ? zzlf.PROTO2 : (i & 4) == 4 ? zzlf.EDITIONS : zzlf.PROTO3;
    }

    final String zzd() {
        return this.zzb;
    }

    zzlg(zzkq zzkqVar, String str, Object[] objArr) {
        this.zza = zzkqVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.zzd = i | (charAt2 << i2);
                return;
            } else {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzko
    public final boolean zzc() {
        return (this.zzd & 2) == 2;
    }

    final Object[] zze() {
        return this.zzc;
    }
}
