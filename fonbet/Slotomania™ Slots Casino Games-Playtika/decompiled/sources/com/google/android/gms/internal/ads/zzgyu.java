package com.google.android.gms.internal.ads;

import com.ironsource.B5;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public abstract class zzgyu {
    private static final zzgyu zza;
    private static final zzgyu zzb;
    private static final zzgyu zzc;

    static {
        Character valueOf = Character.valueOf(B5.U);
        zza = new zzgyr("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", valueOf);
        zzb = new zzgyr("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", valueOf);
        new zzgyt("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", valueOf);
        new zzgyt("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", valueOf);
        zzc = new zzgyq("base16()", "0123456789ABCDEF");
    }

    zzgyu() {
    }

    public static zzgyu zzl() {
        return zza;
    }

    public static zzgyu zzm() {
        return zzb;
    }

    public static zzgyu zzn() {
        return zzc;
    }

    abstract void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

    abstract int zzb(byte[] bArr, CharSequence charSequence) throws zzgys;

    abstract int zzd(int i);

    abstract int zzf(int i);

    CharSequence zzg(CharSequence charSequence) {
        throw null;
    }

    public abstract zzgyu zzh();

    public abstract zzgyu zzi();

    public final String zzj(byte[] bArr, int i, int i2) {
        zzgsw.zzo(0, i2, bArr.length);
        StringBuilder sb = new StringBuilder(zzd(i2));
        try {
            zza(sb, bArr, 0, i2);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final byte[] zzk(CharSequence charSequence) {
        try {
            CharSequence zzg = zzg(charSequence);
            int zzf = zzf(zzg.length());
            byte[] bArr = new byte[zzf];
            int zzb2 = zzb(bArr, zzg);
            if (zzb2 == zzf) {
                return bArr;
            }
            byte[] bArr2 = new byte[zzb2];
            System.arraycopy(bArr, 0, bArr2, 0, zzb2);
            return bArr2;
        } catch (zzgys e) {
            throw new IllegalArgumentException(e);
        }
    }
}
