package e3;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.UByte;
import kotlin.io.encoding.Base64;

/* renamed from: e3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4171b {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f45638a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f45639b = new byte[128];

    public C4171b() {
        d();
    }

    public static int b(String str, int i10, int i11) {
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (charAt != '\n' && charAt != '\r' && charAt != '\t' && charAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i10;
    }

    public final int a(OutputStream outputStream, String str) {
        char c10;
        char charAt;
        byte[] bArr = new byte[54];
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '\n' || charAt == '\r' || charAt == '\t' || charAt == ' ')) {
            length--;
        }
        if (length == 0) {
            return 0;
        }
        int i10 = length;
        int i11 = 0;
        while (true) {
            c10 = 4;
            if (i10 <= 0 || i11 == 4) {
                break;
            }
            char charAt2 = str.charAt(i10 - 1);
            if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != '\t' && charAt2 != ' ') {
                i11++;
            }
            i10--;
        }
        int b10 = b(str, 0, i10);
        int i12 = 0;
        int i13 = 0;
        while (b10 < i10) {
            int i14 = b10 + 1;
            byte b11 = this.f45639b[str.charAt(b10)];
            int b12 = b(str, i14, i10);
            int i15 = b12 + 1;
            byte b13 = this.f45639b[str.charAt(b12)];
            int b14 = b(str, i15, i10);
            int i16 = b14 + 1;
            byte b15 = this.f45639b[str.charAt(b14)];
            int b16 = b(str, i16, i10);
            char c11 = c10;
            int i17 = b16 + 1;
            byte b17 = this.f45639b[str.charAt(b16)];
            if ((b11 | b13 | b15 | b17) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            bArr[i12] = (byte) ((b11 << 2) | (b13 >> 4));
            int i18 = i12 + 2;
            bArr[i12 + 1] = (byte) ((b13 << 4) | (b15 >> 2));
            i12 += 3;
            bArr[i18] = (byte) ((b15 << 6) | b17);
            i13 += 3;
            if (i12 == 54) {
                outputStream.write(bArr);
                i12 = 0;
            }
            b10 = b(str, i17, i10);
            c10 = c11;
        }
        if (i12 > 0) {
            outputStream.write(bArr, 0, i12);
        }
        int b18 = b(str, b10, length);
        int b19 = b(str, b18 + 1, length);
        int b20 = b(str, b19 + 1, length);
        int b21 = b(str, b20 + 1, length);
        char charAt3 = str.charAt(b18);
        char charAt4 = str.charAt(b19);
        char charAt5 = str.charAt(b20);
        char charAt6 = str.charAt(b21);
        int i19 = 2;
        if (charAt5 == '=') {
            if (charAt6 != '=') {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            byte[] bArr2 = this.f45639b;
            byte b22 = bArr2[charAt3];
            byte b23 = bArr2[charAt4];
            if ((b22 | b23) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b23 >> 4) | (b22 << 2));
            i19 = 1;
        } else if (charAt6 == '=') {
            byte[] bArr3 = this.f45639b;
            byte b24 = bArr3[charAt3];
            byte b25 = bArr3[charAt4];
            byte b26 = bArr3[charAt5];
            if ((b24 | b25 | b26) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b24 << 2) | (b25 >> 4));
            outputStream.write((b26 >> 2) | (b25 << 4));
        } else {
            byte[] bArr4 = this.f45639b;
            byte b27 = bArr4[charAt3];
            byte b28 = bArr4[charAt4];
            byte b29 = bArr4[charAt5];
            byte b30 = bArr4[charAt6];
            if ((b27 | b28 | b29 | b30) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b27 << 2) | (b28 >> 4));
            outputStream.write((b28 << 4) | (b29 >> 2));
            outputStream.write(b30 | (b29 << 6));
            i19 = 3;
        }
        return i13 + i19;
    }

    public final int c(byte[] bArr, int i10, ByteArrayOutputStream byteArrayOutputStream) {
        int i11 = 0;
        if (i10 < 0) {
            return 0;
        }
        byte[] bArr2 = new byte[72];
        int i12 = i10;
        int i13 = 0;
        while (i12 > 0) {
            int min = Math.min(54, i12);
            int i14 = i13 + min;
            int i15 = i14 - 2;
            int i16 = i11;
            int i17 = i13;
            while (i17 < i15) {
                byte b10 = bArr[i17];
                int i18 = i17 + 2;
                int i19 = bArr[i17 + 1] & UByte.MAX_VALUE;
                i17 += 3;
                byte b11 = bArr[i18];
                int i20 = b11 & UByte.MAX_VALUE;
                byte[] bArr3 = this.f45638a;
                bArr2[i16] = bArr3[(b10 >>> 2) & 63];
                bArr2[i16 + 1] = bArr3[((b10 << 4) | (i19 >>> 4)) & 63];
                int i21 = i16 + 3;
                bArr2[i16 + 2] = bArr3[((i19 << 2) | (i20 >>> 6)) & 63];
                i16 += 4;
                bArr2[i21] = bArr3[b11 & 63];
            }
            int i22 = min - (i17 - i13);
            if (i22 == 1) {
                int i23 = bArr[i17] & UByte.MAX_VALUE;
                byte[] bArr4 = this.f45638a;
                bArr2[i16] = bArr4[(i23 >>> 2) & 63];
                bArr2[i16 + 1] = bArr4[(i23 << 4) & 63];
                int i24 = i16 + 3;
                bArr2[i16 + 2] = Base64.padSymbol;
                i16 += 4;
                bArr2[i24] = Base64.padSymbol;
            } else if (i22 == 2) {
                int i25 = bArr[i17] & UByte.MAX_VALUE;
                int i26 = bArr[i17 + 1] & UByte.MAX_VALUE;
                byte[] bArr5 = this.f45638a;
                bArr2[i16] = bArr5[(i25 >>> 2) & 63];
                bArr2[i16 + 1] = bArr5[((i25 << 4) | (i26 >>> 4)) & 63];
                int i27 = i16 + 3;
                bArr2[i16 + 2] = bArr5[(i26 << 2) & 63];
                i16 += 4;
                bArr2[i27] = Base64.padSymbol;
            }
            byteArrayOutputStream.write(bArr2, 0, i16);
            i12 -= min;
            i11 = 0;
            i13 = i14;
        }
        return ((i10 + 2) / 3) * 4;
    }

    public final void d() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f45639b;
            if (i11 >= bArr.length) {
                break;
            }
            bArr[i11] = -1;
            i11++;
        }
        while (true) {
            byte[] bArr2 = this.f45638a;
            if (i10 >= bArr2.length) {
                return;
            }
            this.f45639b[bArr2[i10]] = (byte) i10;
            i10++;
        }
    }
}
