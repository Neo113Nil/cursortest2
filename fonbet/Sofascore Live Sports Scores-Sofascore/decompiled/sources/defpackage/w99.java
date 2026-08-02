package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.ByteArrayOutputStream;

/* loaded from: classes7.dex */
public abstract class w99 {
    public static final fp4 a = new fp4(29);

    public static byte[] a(String str) {
        try {
            return a.m(str.length(), str);
        } catch (Exception e) {
            em4 em4Var = new em4(bf3.j(e, new StringBuilder("exception decoding Hex string: ")), 0);
            em4Var.b = e;
            throw em4Var;
        }
    }

    public static String b(byte[] bArr) {
        int length = bArr.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            fp4 fp4Var = a;
            fp4Var.getClass();
            if (length >= 0) {
                byte[] bArr2 = new byte[72];
                int i = 0;
                while (length > 0) {
                    int min = Math.min(36, length);
                    int i2 = i + min;
                    int i3 = 0;
                    while (i < i2) {
                        int i4 = i + 1;
                        byte b = bArr[i];
                        int i5 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        int i6 = i3 + 1;
                        byte[] bArr3 = (byte[]) fp4Var.b;
                        bArr2[i3] = bArr3[i5 >>> 4];
                        i3 += 2;
                        bArr2[i6] = bArr3[b & 15];
                        i = i4;
                    }
                    byteArrayOutputStream.write(bArr2, 0, i3);
                    length -= min;
                    i = i2;
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int i7 = aii.a;
            int length2 = byteArray.length;
            char[] cArr = new char[length2];
            for (int i8 = 0; i8 != length2; i8++) {
                cArr[i8] = (char) (byteArray[i8] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            }
            return new String(cArr);
        } catch (Exception e) {
            em4 em4Var = new em4(bf3.j(e, new StringBuilder("exception encoding Hex string: ")), 1);
            em4Var.b = e;
            throw em4Var;
        }
    }
}
