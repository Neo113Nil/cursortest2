package io.sentry.vendor;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f17201a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    public static byte[] a(byte[] bArr) {
        byte[] bArr2;
        int length = bArr.length;
        int i5 = (length / 3) * 4;
        int i10 = length % 3;
        if (i10 == 1) {
            i5 += 2;
        } else if (i10 == 2) {
            i5 += 3;
        }
        byte[] bArr3 = new byte[i5];
        int i11 = 0;
        int i12 = 0;
        int i13 = -1;
        while (true) {
            int i14 = i11 + 3;
            bArr2 = f17201a;
            if (i14 > length) {
                break;
            }
            int i15 = (bArr[i11 + 2] & 255) | ((bArr[i11] & 255) << 16) | ((bArr[i11 + 1] & 255) << 8);
            bArr3[i12] = bArr2[(i15 >> 18) & 63];
            bArr3[i12 + 1] = bArr2[(i15 >> 12) & 63];
            bArr3[i12 + 2] = bArr2[(i15 >> 6) & 63];
            bArr3[i12 + 3] = bArr2[i15 & 63];
            int i16 = i12 + 4;
            i13--;
            if (i13 == 0) {
                i12 += 5;
                bArr3[i16] = 10;
                i13 = 19;
            } else {
                i12 = i16;
            }
            i11 = i14;
        }
        if (i11 == length - 1) {
            int i17 = (bArr[i11] & 255) << 4;
            bArr3[i12] = bArr2[(i17 >> 6) & 63];
            bArr3[i12 + 1] = bArr2[i17 & 63];
            return bArr3;
        }
        if (i11 == length - 2) {
            int i18 = ((bArr[i11 + 1] & 255) << 2) | ((bArr[i11] & 255) << 10);
            bArr3[i12] = bArr2[(i18 >> 12) & 63];
            bArr3[i12 + 1] = bArr2[(i18 >> 6) & 63];
            bArr3[i12 + 2] = bArr2[i18 & 63];
        }
        return bArr3;
    }
}
