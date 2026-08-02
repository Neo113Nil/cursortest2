package b3;

import kotlin.UByte;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: b3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2387f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f24982a = 0;

    static {
        try {
        } catch (Exception unused) {
        }
    }

    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i10 = 0; i10 != length; i10++) {
            cArr[i10] = (char) (bArr[i10] & UByte.MAX_VALUE);
        }
        return new String(cArr);
    }

    public static String b(byte[] bArr) {
        char c10;
        int i10;
        byte b10;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < bArr.length) {
            int i14 = i13 + 1;
            byte b11 = bArr[i12];
            if ((b11 & 240) == 240) {
                i13 += 2;
                i12 += 4;
            } else {
                i12 = (b11 & 224) == 224 ? i12 + 3 : (b11 & 192) == 192 ? i12 + 2 : i12 + 1;
                i13 = i14;
            }
        }
        char[] cArr = new char[i13];
        int i15 = 0;
        while (i11 < bArr.length) {
            byte b12 = bArr[i11];
            if ((b12 & 240) == 240) {
                int i16 = (((((b12 & 3) << 18) | ((bArr[i11 + 1] & 63) << 12)) | ((bArr[i11 + 2] & 63) << 6)) | (bArr[i11 + 3] & 63)) - PKIFailureInfo.notAuthorized;
                char c11 = (char) ((i16 >> 10) | 55296);
                c10 = (char) ((i16 & 1023) | 56320);
                cArr[i15] = c11;
                i11 += 4;
                i15++;
            } else if ((b12 & 224) == 224) {
                c10 = (char) (((b12 & 15) << 12) | ((bArr[i11 + 1] & 63) << 6) | (bArr[i11 + 2] & 63));
                i11 += 3;
            } else {
                if ((b12 & 208) == 208) {
                    i10 = (b12 & 31) << 6;
                    b10 = bArr[i11 + 1];
                } else if ((b12 & 192) == 192) {
                    i10 = (b12 & 31) << 6;
                    b10 = bArr[i11 + 1];
                } else {
                    c10 = (char) (b12 & UByte.MAX_VALUE);
                    i11++;
                }
                c10 = (char) (i10 | (b10 & 63));
                i11 += 2;
            }
            cArr[i15] = c10;
            i15++;
        }
        return new String(cArr);
    }
}
