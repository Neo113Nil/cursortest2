package com.google.android.gms.internal.fido;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;

/* loaded from: classes9.dex */
final class zzgc extends zzge {
    final char[] zza;

    private zzgc(zzgb zzgbVar) {
        super(zzgbVar, null);
        char[] cArr;
        this.zza = new char[UserVerificationMethods.USER_VERIFY_NONE];
        cArr = zzgbVar.zzf;
        zzbm.zzc(cArr.length == 16);
        for (int i11 = 0; i11 < 256; i11++) {
            this.zza[i11] = zzgbVar.zza(i11 >>> 4);
            this.zza[i11 | 256] = zzgbVar.zza(i11 & 15);
        }
    }

    @Override // com.google.android.gms.internal.fido.zzge
    final zzgf zza(zzgb zzgbVar, Character ch2) {
        return new zzgc(zzgbVar);
    }

    @Override // com.google.android.gms.internal.fido.zzge, com.google.android.gms.internal.fido.zzgf
    final void zzb(Appendable appendable, byte[] bArr, int i11, int i12) throws IOException {
        zzbm.zze(0, i12, bArr.length);
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = bArr[i13] & 255;
            appendable.append(this.zza[i14]);
            appendable.append(this.zza[i14 | 256]);
        }
    }

    zzgc(String str, String str2) {
        this(new zzgb("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
