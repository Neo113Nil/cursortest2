package com.google.android.gms.internal.fido;

import kotlin.UByte;

/* loaded from: classes2.dex */
final class zzcf extends zzcg {
    private zzcf(zzcd zzcdVar, Character ch2) {
        super(zzcdVar, ch2);
        char[] cArr;
        cArr = zzcdVar.zzf;
        zzap.zzc(cArr.length == 64);
    }

    @Override // com.google.android.gms.internal.fido.zzcg
    public final zzch zza(zzcd zzcdVar, Character ch2) {
        return new zzcf(zzcdVar, ch2);
    }

    @Override // com.google.android.gms.internal.fido.zzcg, com.google.android.gms.internal.fido.zzch
    public final void zzb(Appendable appendable, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        zzap.zze(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = bArr[i12] & UByte.MAX_VALUE;
            int i15 = ((bArr[i12 + 1] & UByte.MAX_VALUE) << 8) | (i14 << 16) | (bArr[i12 + 2] & UByte.MAX_VALUE);
            appendable.append(this.zzb.zza(i15 >>> 18));
            appendable.append(this.zzb.zza((i15 >>> 12) & 63));
            appendable.append(this.zzb.zza((i15 >>> 6) & 63));
            appendable.append(this.zzb.zza(i15 & 63));
            i12 += 3;
        }
        if (i12 < i11) {
            zze(appendable, bArr, i12, i11 - i12);
        }
    }

    public zzcf(String str, String str2, Character ch2) {
        this(new zzcd(str, str2.toCharArray()), ch2);
    }
}
