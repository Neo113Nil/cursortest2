package com.google.android.gms.internal.fido;

import com.ironsource.B5;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
public abstract class zzgf {
    private static final zzgf zza;
    private static final zzgf zzb;
    private static final zzgf zzc;
    private static final zzgf zzd;
    private static final zzgf zze;

    static {
        Character valueOf = Character.valueOf(B5.U);
        zza = new zzgd("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", valueOf);
        zzb = new zzgd("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", valueOf);
        zzc = new zzge("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", valueOf);
        zzd = new zzge("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", valueOf);
        zze = new zzgc("base16()", "0123456789ABCDEF");
    }

    public static zzgf zzf() {
        return zze;
    }

    public abstract void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

    public abstract int zzc(int i);

    public abstract zzgf zzd();

    public final String zzg(byte[] bArr, int i, int i2) {
        zzbm.zze(0, i2, bArr.length);
        StringBuilder sb = new StringBuilder(zzc(i2));
        try {
            zzb(sb, bArr, 0, i2);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
