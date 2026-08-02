package k5;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: k5.s0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7563s0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f70857a = {56, 52, 98, 55, 98, 98, 101, 99, 100, 98, 56, 56, 49, 48, 99, 102, 49, 50, 100, 54, 57, 97, 53, 55, 55, 55, 53, 102, 52, 57, 53, 99, 55, 49, 101, 101, 50, 56, 100, 48};

    public static String a(byte[] bArr) {
        try {
            int[] iArr = f70857a;
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < 32; i11++) {
                sb2.append((char) iArr[i11]);
            }
            SecretKeySpec secretKeySpec = new SecretKeySpec(sb2.toString().getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(new byte[cipher.getBlockSize()]));
            return new String(cipher.doFinal(bArr));
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }
}
