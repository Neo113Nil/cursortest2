package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzgdj {
    public static String zza(byte[] bArr, boolean z) {
        return zzc(z).zzj(bArr, 0, bArr.length);
    }

    public static byte[] zzb(String str, boolean z) throws IllegalArgumentException {
        byte[] zzk = zzc(z).zzk(str);
        if (zzk.length != 0 || str.length() <= 0) {
            return zzk;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }

    private static zzgyu zzc(boolean z) {
        return z ? zzgyu.zzm().zzh() : zzgyu.zzl();
    }
}
