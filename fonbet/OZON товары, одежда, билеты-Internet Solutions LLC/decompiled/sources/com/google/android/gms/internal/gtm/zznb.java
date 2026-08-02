package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes9.dex */
public final class zznb extends zzjv {
    static String zzb(String str, String str2) throws UnsupportedEncodingException {
        int i11;
        StringBuilder sb2 = new StringBuilder();
        Charset forName = Charset.forName("UTF-8");
        int i12 = 0;
        while (i12 < str.length()) {
            char charAt = str.charAt(i12);
            if (str2.indexOf(charAt) != -1) {
                sb2.append(charAt);
                i12++;
            } else {
                if (Character.isHighSurrogate(charAt)) {
                    int i13 = i12 + 1;
                    if (i13 >= str.length()) {
                        throw new UnsupportedEncodingException();
                    }
                    if (!Character.isLowSurrogate(str.charAt(i13))) {
                        throw new UnsupportedEncodingException();
                    }
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                int i14 = i11 + i12;
                byte[] bytes = str.substring(i12, i14).getBytes(forName);
                for (int i15 = 0; i15 < bytes.length; i15++) {
                    sb2.append("%");
                    sb2.append(Character.toUpperCase(Character.forDigit((bytes[i15] >> 4) & 15, 16)));
                    sb2.append(Character.toUpperCase(Character.forDigit(bytes[i15] & 15, 16)));
                }
                i12 = i14;
            }
        }
        return sb2.toString().replaceAll(" ", "%20");
    }

    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(true);
        try {
            return new zzrh(zzb(zzju.zzd(zzqwVarArr.length > 0 ? (zzqw) Preconditions.checkNotNull(zzqwVarArr[0]) : zzra.zze), "#;/?:@&=+$,abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_.!~*'()0123456789"));
        } catch (UnsupportedEncodingException unused) {
            return zzra.zze;
        }
    }
}
