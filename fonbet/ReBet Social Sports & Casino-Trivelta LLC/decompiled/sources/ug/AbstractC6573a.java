package ug;

/* renamed from: ug.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6573a {
    public static byte[] a(byte[] bArr) {
        int i10;
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer(((length / 3) + 1) * 4);
        int i11 = 0;
        while (i11 < length) {
            stringBuffer.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((bArr[i11] >> 2) & 63));
            int i12 = (bArr[i11] << 4) & 63;
            int i13 = i11 + 1;
            if (i13 < length) {
                i12 |= (bArr[i13] >> 4) & 15;
            }
            stringBuffer.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(i12));
            if (i13 < length) {
                int i14 = (bArr[i13] << 2) & 63;
                i10 = i11 + 2;
                if (i10 < length) {
                    i14 |= (bArr[i10] >> 6) & 3;
                }
                stringBuffer.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(i14));
            } else {
                i10 = i11 + 2;
                stringBuffer.append('=');
            }
            if (i10 < length) {
                stringBuffer.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(bArr[i10] & 63));
            } else {
                stringBuffer.append('=');
            }
            i11 = i10 + 1;
        }
        return c(stringBuffer.toString());
    }

    public static String b(byte[] bArr) {
        return d(a(bArr));
    }

    public static byte[] c(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = (byte) str.charAt(i10);
        }
        return bArr;
    }

    public static String d(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b10 : bArr) {
            stringBuffer.append((char) b10);
        }
        return stringBuffer.toString();
    }
}
