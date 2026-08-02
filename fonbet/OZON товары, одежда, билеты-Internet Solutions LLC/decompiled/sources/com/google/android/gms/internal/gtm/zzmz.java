package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

/* loaded from: classes9.dex */
public final class zzmz extends zzjv {
    static String zzb(String str, String str2) throws UnsupportedEncodingException {
        Charset forName = Charset.forName("UTF-8");
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (i11 < str.length()) {
            char charAt = str.charAt(i11);
            if (charAt != '%') {
                sb2.append(charAt);
                i11++;
            } else {
                byte zzc = zzc(str, i11);
                int i12 = i11 + 3;
                if ((zzc & 128) != 0) {
                    int i13 = 0;
                    while (((zzc << i13) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                        i13++;
                    }
                    if (i13 < 2 || i13 > 4) {
                        throw new UnsupportedEncodingException();
                    }
                    byte[] bArr = new byte[i13];
                    bArr[0] = zzc;
                    for (int i14 = 1; i14 < i13; i14++) {
                        byte zzc2 = zzc(str, i12);
                        i12 += 3;
                        if ((zzc2 & 192) != 128) {
                            throw new UnsupportedEncodingException();
                        }
                        bArr[i14] = zzc2;
                    }
                    CharBuffer decode = forName.decode(ByteBuffer.wrap(bArr));
                    if (decode.length() != 1 || str2.indexOf(decode.charAt(0)) == -1) {
                        sb2.append((CharSequence) decode);
                    } else {
                        sb2.append(str.substring(i11, i12));
                    }
                } else if (str2.indexOf(zzc) == -1) {
                    sb2.append((char) zzc);
                } else {
                    sb2.append(str.substring(i11, i12));
                }
                i11 = i12;
            }
        }
        return sb2.toString();
    }

    private static byte zzc(String str, int i11) throws UnsupportedEncodingException {
        int i12 = i11 + 3;
        if (i12 > str.length() || str.charAt(i11) != '%') {
            throw new UnsupportedEncodingException();
        }
        String substring = str.substring(i11 + 1, i12);
        if (substring.charAt(0) == '+' || substring.charAt(0) == '-') {
            throw new UnsupportedEncodingException();
        }
        try {
            return (byte) Integer.parseInt(substring, 16);
        } catch (NumberFormatException unused) {
            throw new UnsupportedEncodingException();
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(true);
        try {
            return new zzrh(zzb(zzju.zzd(zzqwVarArr.length > 0 ? (zzqw) Preconditions.checkNotNull(zzqwVarArr[0]) : zzra.zze), "#;/?:@&=+$,"));
        } catch (UnsupportedEncodingException unused) {
            return zzra.zze;
        }
    }
}
