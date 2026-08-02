package com.ironsource.adqualitysdk.sdk.i;

import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ϯ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC0370 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String f1112 = StringFog.decrypt("4jNMkXAtpADaAmmNfTI=\n", "o1cd5BFBzXQ=\n");

    static {
        StringFog.decrypt("Fpc/w0XTJqQXmTPLS9Nouw==\n", "ZfhQrimyC9A=\n");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m215(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        try {
            byte[] decode = Base64.decode(str.getBytes(), 0);
            byte[] copyOfRange = Arrays.copyOfRange(decode, 16, decode.length);
            CipherInputStream cipherInputStream = null;
            try {
                try {
                    int length = str3.length();
                    byte[] bArr = new byte[length / 2];
                    for (int i = 0; i < length; i += 2) {
                        bArr[i / 2] = (byte) (Character.digit(str3.charAt(i + 1), 16) + (Character.digit(str3.charAt(i), 16) << 4));
                    }
                    int length2 = str4.length();
                    byte[] bArr2 = new byte[length2 / 2];
                    for (int i2 = 0; i2 < length2; i2 += 2) {
                        bArr2[i2 / 2] = (byte) (Character.digit(str4.charAt(i2 + 1), 16) + (Character.digit(str4.charAt(i2), 16) << 4));
                    }
                    Cipher cipher = Cipher.getInstance(StringFog.decrypt("Hpe37pDiJw4PmaeS5vAFRTu7iqY=\n", "X9LkwdOgZCE=\n"));
                    cipher.init(2, SecretKeyFactory.getInstance(StringFog.decrypt("rIbIZVqLewu48cx8V+0GcL6N2XNWjB4FvoegfUOafRWviA==\n", "/MSNMhPfM0Y=\n"), StringFog.decrypt("/pI=\n", "vNHDwsoeGyE=\n")).generateSecret(new PBEKeySpec(str2.toCharArray(), bArr2, 1, NotificationCompat.FLAG_LOCAL_ONLY)), new IvParameterSpec(bArr, 0, cipher.getBlockSize()));
                    CipherInputStream cipherInputStream2 = new CipherInputStream(new ByteArrayInputStream(copyOfRange), cipher);
                    try {
                        StringFog.decrypt("Bb/NZ9s=\n", "UOuLSuOoayM=\n");
                        byte[] bArr3 = new byte[8192];
                        for (int read = cipherInputStream2.read(bArr3); read > -1; read = cipherInputStream2.read(bArr3)) {
                            sb.append(new String(bArr3, 0, read, StringFog.decrypt("/idrGlo=\n", "q3MtN2Lu52g=\n")));
                        }
                        cipherInputStream2.close();
                    } catch (Throwable th) {
                        th = th;
                        cipherInputStream = cipherInputStream2;
                        try {
                            AbstractC0356.m204(f1112, StringFog.decrypt("1UfvUZIlb+rzR+ROlGxl6LBG6UyJa2w=\n", "kDWdPuAFC48=\n"), th, false);
                            if (cipherInputStream != null) {
                                cipherInputStream.close();
                            }
                            return sb.toString();
                        } catch (Throwable th2) {
                            if (cipherInputStream != null) {
                                try {
                                    cipherInputStream.close();
                                } catch (Throwable unused) {
                                }
                            }
                            throw th2;
                        }
                    }
                } catch (Throwable unused2) {
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            AbstractC0356.m204(f1112, StringFog.decrypt("bosadIzlmIpOmBxykKLbnE6aGmKOsduZR54H\n", "K/loG/7F+/g=\n"), th4, false);
        }
        return sb.toString();
    }
}
