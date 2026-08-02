package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhjn implements zzhcu {
    private final zzhcu zza;
    private final byte[] zzb;

    private zzhjn(zzhcu zzhcuVar, byte[] bArr) {
        this.zza = zzhcuVar;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.zzb = bArr;
    }

    public static zzhcu zzb(zzhlr zzhlrVar) throws GeneralSecurityException {
        byte[] zzc;
        zzhne zzc2 = zzhlrVar.zzc(zzhda.zza());
        zzhcu zzhcuVar = (zzhcu) zzhlg.zza().zzc(zzc2.zzg(), zzhcu.class).zza(zzc2.zzb());
        zzhtb zzd = zzc2.zzd();
        int ordinal = zzd.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    zzc = zzhmk.zza.zzc();
                } else if (ordinal != 4) {
                    String valueOf = String.valueOf(zzd);
                    String.valueOf(valueOf);
                    throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(valueOf)));
                }
            }
            zzc = zzhmk.zza(zzhlrVar.zzb().intValue()).zzc();
        } else {
            zzc = zzhmk.zzb(zzhlrVar.zzb().intValue()).zzc();
        }
        return new zzhjn(zzhcuVar, zzc);
    }

    public static zzhcu zzc(zzhcu zzhcuVar, zziam zziamVar) {
        return new zzhjn(zzhcuVar, zziamVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzhcu
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzhnq.zze(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
