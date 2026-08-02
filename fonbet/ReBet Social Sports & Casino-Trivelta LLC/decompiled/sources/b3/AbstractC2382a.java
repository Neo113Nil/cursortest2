package b3;

import com.plaid.internal.EnumC3631g;

/* renamed from: b3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2382a {
    public static byte[] a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static byte[] b(byte[] bArr, byte b10) {
        if (bArr == null) {
            return new byte[]{b10};
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, 0, bArr2, 1, length);
        bArr2[0] = b10;
        return bArr2;
    }

    public static int c(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i10 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i10;
            }
            i10 = (i10 * EnumC3631g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE) ^ bArr[length];
        }
    }
}
