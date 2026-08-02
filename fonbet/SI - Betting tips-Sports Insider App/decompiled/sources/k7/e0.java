package k7;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f18856a = "0123456789abcdef".toCharArray();

    public final boolean equals(Object obj) {
        boolean z5;
        if (obj instanceof e0) {
            byte[] bArr = ((d0) this).f18850b;
            int length = bArr.length * 8;
            byte[] bArr2 = ((d0) ((e0) obj)).f18850b;
            if (length == bArr2.length * 8) {
                if (bArr.length == bArr2.length) {
                    z5 = true;
                    for (int i5 = 0; i5 < bArr.length; i5++) {
                        z5 &= bArr[i5] == bArr2[i5];
                    }
                } else {
                    z5 = false;
                }
                if (z5) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((d0) this).f18850b;
        if (bArr.length * 8 < 32) {
            int i5 = bArr[0] & 255;
            for (int i10 = 1; i10 < bArr.length; i10++) {
                i5 |= (bArr[i10] & 255) << (i10 * 8);
            }
            return i5;
        }
        int length = bArr.length;
        if (length < 4) {
            throw new IllegalStateException(a.d("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        }
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    public final String toString() {
        byte[] bArr = ((d0) this).f18850b;
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b10 : bArr) {
            char[] cArr = f18856a;
            sb2.append(cArr[(b10 >> 4) & 15]);
            sb2.append(cArr[b10 & 15]);
        }
        return sb2.toString();
    }
}
