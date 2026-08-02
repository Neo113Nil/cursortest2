package org.spongycastle.util.encoders;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.UByte;
import kotlin.io.encoding.Base64;

/* loaded from: classes5.dex */
public class b implements d {
    protected final byte[] encodingTable = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: a, reason: collision with root package name */
    public byte f62874a = Base64.padSymbol;
    protected final byte[] decodingTable = new byte[128];

    public b() {
        c();
    }

    public final int a(OutputStream outputStream, char c10, char c11, char c12, char c13) {
        char c14 = this.f62874a;
        if (c12 == c14) {
            byte[] bArr = this.decodingTable;
            byte b10 = bArr[c10];
            byte b11 = bArr[c11];
            if ((b10 | b11) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b10 << 2) | (b11 >> 4));
            return 1;
        }
        if (c13 == c14) {
            byte[] bArr2 = this.decodingTable;
            byte b12 = bArr2[c10];
            byte b13 = bArr2[c11];
            byte b14 = bArr2[c12];
            if ((b12 | b13 | b14) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b12 << 2) | (b13 >> 4));
            outputStream.write((b13 << 4) | (b14 >> 2));
            return 2;
        }
        byte[] bArr3 = this.decodingTable;
        byte b15 = bArr3[c10];
        byte b16 = bArr3[c11];
        byte b17 = bArr3[c12];
        byte b18 = bArr3[c13];
        if ((b15 | b16 | b17 | b18) < 0) {
            throw new IOException("invalid characters encountered at end of base64 data");
        }
        outputStream.write((b15 << 2) | (b16 >> 4));
        outputStream.write((b16 << 4) | (b17 >> 2));
        outputStream.write((b17 << 6) | b18);
        return 3;
    }

    public final boolean b(char c10) {
        return c10 == '\n' || c10 == '\r' || c10 == '\t' || c10 == ' ';
    }

    public void c() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr = this.decodingTable;
            if (i11 >= bArr.length) {
                break;
            }
            bArr[i11] = -1;
            i11++;
        }
        while (true) {
            byte[] bArr2 = this.encodingTable;
            if (i10 >= bArr2.length) {
                return;
            }
            this.decodingTable[bArr2[i10]] = (byte) i10;
            i10++;
        }
    }

    public final int d(String str, int i10, int i11) {
        while (i10 < i11 && b(str.charAt(i10))) {
            i10++;
        }
        return i10;
    }

    @Override // org.spongycastle.util.encoders.d
    public int decode(String str, OutputStream outputStream) {
        int length = str.length();
        while (length > 0 && b(str.charAt(length - 1))) {
            length--;
        }
        int i10 = length - 4;
        int i11 = 0;
        int d10 = d(str, 0, i10);
        while (d10 < i10) {
            int i12 = d10 + 1;
            byte b10 = this.decodingTable[str.charAt(d10)];
            int d11 = d(str, i12, i10);
            int i13 = d11 + 1;
            byte b11 = this.decodingTable[str.charAt(d11)];
            int d12 = d(str, i13, i10);
            int i14 = d12 + 1;
            byte b12 = this.decodingTable[str.charAt(d12)];
            int d13 = d(str, i14, i10);
            int i15 = d13 + 1;
            byte b13 = this.decodingTable[str.charAt(d13)];
            if ((b10 | b11 | b12 | b13) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            outputStream.write((b10 << 2) | (b11 >> 4));
            outputStream.write((b11 << 4) | (b12 >> 2));
            outputStream.write((b12 << 6) | b13);
            i11 += 3;
            d10 = d(str, i15, i10);
        }
        return i11 + a(outputStream, str.charAt(i10), str.charAt(length - 3), str.charAt(length - 2), str.charAt(length - 1));
    }

    @Override // org.spongycastle.util.encoders.d
    public int encode(byte[] bArr, int i10, int i11, OutputStream outputStream) {
        int i12;
        int i13 = i11 % 3;
        int i14 = i11 - i13;
        int i15 = i10;
        while (true) {
            i12 = i10 + i14;
            if (i15 >= i12) {
                break;
            }
            int i16 = bArr[i15] & UByte.MAX_VALUE;
            int i17 = bArr[i15 + 1] & UByte.MAX_VALUE;
            byte b10 = bArr[i15 + 2];
            int i18 = b10 & UByte.MAX_VALUE;
            outputStream.write(this.encodingTable[(i16 >>> 2) & 63]);
            outputStream.write(this.encodingTable[((i16 << 4) | (i17 >>> 4)) & 63]);
            outputStream.write(this.encodingTable[((i17 << 2) | (i18 >>> 6)) & 63]);
            outputStream.write(this.encodingTable[b10 & 63]);
            i15 += 3;
        }
        if (i13 == 1) {
            int i19 = bArr[i12] & UByte.MAX_VALUE;
            outputStream.write(this.encodingTable[(i19 >>> 2) & 63]);
            outputStream.write(this.encodingTable[(i19 << 4) & 63]);
            outputStream.write(this.f62874a);
            outputStream.write(this.f62874a);
        } else if (i13 == 2) {
            int i20 = bArr[i12] & UByte.MAX_VALUE;
            int i21 = bArr[i12 + 1] & UByte.MAX_VALUE;
            outputStream.write(this.encodingTable[(i20 >>> 2) & 63]);
            outputStream.write(this.encodingTable[((i20 << 4) | (i21 >>> 4)) & 63]);
            outputStream.write(this.encodingTable[(i21 << 2) & 63]);
            outputStream.write(this.f62874a);
        }
        return ((i14 / 3) * 4) + (i13 == 0 ? 0 : 4);
    }
}
