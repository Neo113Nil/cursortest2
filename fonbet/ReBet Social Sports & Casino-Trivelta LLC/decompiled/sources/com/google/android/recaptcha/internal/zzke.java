package com.google.android.recaptcha.internal;

import kotlin.UByte;

/* loaded from: classes3.dex */
final class zzke extends zzkg {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzke(String str, String str2, Character ch2) {
        super(r0, ch2);
        char[] cArr;
        zzkd zzkdVar = new zzkd(str, str2.toCharArray());
        cArr = zzkdVar.zzf;
        zzjf.zza(cArr.length == 64);
    }

    @Override // com.google.android.recaptcha.internal.zzkg, com.google.android.recaptcha.internal.zzkh
    public final int zza(byte[] bArr, CharSequence charSequence) {
        CharSequence zze = zze(charSequence);
        if (!this.zza.zzc(zze.length())) {
            throw new zzkf("Invalid input length " + zze.length());
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < zze.length()) {
            int i12 = i11 + 1;
            int zzb = (this.zza.zzb(zze.charAt(i10)) << 18) | (this.zza.zzb(zze.charAt(i10 + 1)) << 12);
            bArr[i11] = (byte) (zzb >>> 16);
            int i13 = i10 + 2;
            if (i13 < zze.length()) {
                int i14 = i10 + 3;
                int zzb2 = zzb | (this.zza.zzb(zze.charAt(i13)) << 6);
                int i15 = i11 + 2;
                bArr[i12] = (byte) ((zzb2 >>> 8) & 255);
                if (i14 < zze.length()) {
                    i10 += 4;
                    i11 += 3;
                    bArr[i15] = (byte) ((zzb2 | this.zza.zzb(zze.charAt(i14))) & 255);
                } else {
                    i11 = i15;
                    i10 = i14;
                }
            } else {
                i10 = i13;
                i11 = i12;
            }
        }
        return i11;
    }

    @Override // com.google.android.recaptcha.internal.zzkg, com.google.android.recaptcha.internal.zzkh
    public final void zzb(Appendable appendable, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        zzjf.zzd(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = bArr[i12] & UByte.MAX_VALUE;
            int i15 = ((bArr[i12 + 1] & UByte.MAX_VALUE) << 8) | (i14 << 16) | (bArr[i12 + 2] & UByte.MAX_VALUE);
            appendable.append(this.zza.zza(i15 >>> 18));
            appendable.append(this.zza.zza((i15 >>> 12) & 63));
            appendable.append(this.zza.zza((i15 >>> 6) & 63));
            appendable.append(this.zza.zza(i15 & 63));
            i12 += 3;
        }
        if (i12 < i11) {
            zzf(appendable, bArr, i12, i11 - i12);
        }
    }
}
