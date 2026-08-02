package org.bouncycastle.util.encoders;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.UByte;

/* loaded from: classes5.dex */
public class Base64Encoder implements Encoder {
    protected final byte[] encodingTable = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    protected byte padding = kotlin.io.encoding.Base64.padSymbol;
    protected final byte[] decodingTable = new byte[128];

    public Base64Encoder() {
        initialiseDecodingTable();
    }

    private int decodeLastBlock(OutputStream outputStream, char c10, char c11, char c12, char c13) {
        char c14 = this.padding;
        if (c12 == c14) {
            if (c13 != c14) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
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

    private boolean ignore(char c10) {
        return c10 == '\n' || c10 == '\r' || c10 == '\t' || c10 == ' ';
    }

    private int nextI(String str, int i10, int i11) {
        while (i10 < i11 && ignore(str.charAt(i10))) {
            i10++;
        }
        return i10;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(String str, OutputStream outputStream) {
        byte[] bArr = new byte[54];
        int length = str.length();
        while (length > 0 && ignore(str.charAt(length - 1))) {
            length--;
        }
        if (length == 0) {
            return 0;
        }
        int i10 = length;
        int i11 = 0;
        while (i10 > 0 && i11 != 4) {
            if (!ignore(str.charAt(i10 - 1))) {
                i11++;
            }
            i10--;
        }
        int nextI = nextI(str, 0, i10);
        int i12 = 0;
        int i13 = 0;
        while (nextI < i10) {
            int i14 = nextI + 1;
            byte b10 = this.decodingTable[str.charAt(nextI)];
            int nextI2 = nextI(str, i14, i10);
            int i15 = nextI2 + 1;
            byte b11 = this.decodingTable[str.charAt(nextI2)];
            int nextI3 = nextI(str, i15, i10);
            int i16 = nextI3 + 1;
            byte b12 = this.decodingTable[str.charAt(nextI3)];
            int nextI4 = nextI(str, i16, i10);
            int i17 = nextI4 + 1;
            byte b13 = this.decodingTable[str.charAt(nextI4)];
            if ((b10 | b11 | b12 | b13) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            bArr[i12] = (byte) ((b10 << 2) | (b11 >> 4));
            int i18 = i12 + 2;
            bArr[i12 + 1] = (byte) ((b11 << 4) | (b12 >> 2));
            i12 += 3;
            bArr[i18] = (byte) ((b12 << 6) | b13);
            i13 += 3;
            if (i12 == 54) {
                outputStream.write(bArr);
                i12 = 0;
            }
            nextI = nextI(str, i17, i10);
        }
        if (i12 > 0) {
            outputStream.write(bArr, 0, i12);
        }
        int nextI5 = nextI(str, nextI, length);
        int nextI6 = nextI(str, nextI5 + 1, length);
        int nextI7 = nextI(str, nextI6 + 1, length);
        return i13 + decodeLastBlock(outputStream, str.charAt(nextI5), str.charAt(nextI6), str.charAt(nextI7), str.charAt(nextI(str, nextI7 + 1, length)));
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int encode(byte[] bArr, int i10, int i11, OutputStream outputStream) {
        byte[] bArr2 = new byte[72];
        int i12 = i10;
        while (i11 > 0) {
            int min = Math.min(54, i11);
            byte[] bArr3 = bArr;
            outputStream.write(bArr2, 0, encode(bArr3, i12, min, bArr2, 0));
            i12 += min;
            i11 -= min;
            bArr = bArr3;
        }
        return ((i11 + 2) / 3) * 4;
    }

    public void initialiseDecodingTable() {
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

    private int nextI(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && ignore((char) bArr[i10])) {
            i10++;
        }
        return i10;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(byte[] bArr, int i10, int i11, OutputStream outputStream) {
        byte[] bArr2 = new byte[54];
        int i12 = i10 + i11;
        while (i12 > i10 && ignore((char) bArr[i12 - 1])) {
            i12--;
        }
        if (i12 == 0) {
            return 0;
        }
        int i13 = i12;
        int i14 = 0;
        while (i13 > i10 && i14 != 4) {
            if (!ignore((char) bArr[i13 - 1])) {
                i14++;
            }
            i13--;
        }
        int nextI = nextI(bArr, i10, i13);
        int i15 = 0;
        int i16 = 0;
        while (nextI < i13) {
            int i17 = nextI + 1;
            byte b10 = this.decodingTable[bArr[nextI]];
            int nextI2 = nextI(bArr, i17, i13);
            int i18 = nextI2 + 1;
            byte b11 = this.decodingTable[bArr[nextI2]];
            int nextI3 = nextI(bArr, i18, i13);
            int i19 = nextI3 + 1;
            byte b12 = this.decodingTable[bArr[nextI3]];
            int nextI4 = nextI(bArr, i19, i13);
            int i20 = nextI4 + 1;
            byte b13 = this.decodingTable[bArr[nextI4]];
            if ((b10 | b11 | b12 | b13) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            bArr2[i15] = (byte) ((b10 << 2) | (b11 >> 4));
            int i21 = i15 + 2;
            bArr2[i15 + 1] = (byte) ((b11 << 4) | (b12 >> 2));
            i15 += 3;
            bArr2[i21] = (byte) ((b12 << 6) | b13);
            if (i15 == 54) {
                outputStream.write(bArr2);
                i15 = 0;
            }
            i16 += 3;
            nextI = nextI(bArr, i20, i13);
        }
        if (i15 > 0) {
            outputStream.write(bArr2, 0, i15);
        }
        int nextI5 = nextI(bArr, nextI, i12);
        int nextI6 = nextI(bArr, nextI5 + 1, i12);
        int nextI7 = nextI(bArr, nextI6 + 1, i12);
        return i16 + decodeLastBlock(outputStream, (char) bArr[nextI5], (char) bArr[nextI6], (char) bArr[nextI7], (char) bArr[nextI(bArr, nextI7 + 1, i12)]);
    }

    public int encode(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13 = (i10 + i11) - 2;
        int i14 = i10;
        int i15 = i12;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            int i16 = i14 + 2;
            int i17 = bArr[i14 + 1] & UByte.MAX_VALUE;
            i14 += 3;
            byte b11 = bArr[i16];
            int i18 = b11 & UByte.MAX_VALUE;
            byte[] bArr3 = this.encodingTable;
            bArr2[i15] = bArr3[(b10 >>> 2) & 63];
            bArr2[i15 + 1] = bArr3[((b10 << 4) | (i17 >>> 4)) & 63];
            int i19 = i15 + 3;
            bArr2[i15 + 2] = bArr3[((i17 << 2) | (i18 >>> 6)) & 63];
            i15 += 4;
            bArr2[i19] = bArr3[b11 & 63];
        }
        int i20 = i11 - (i14 - i10);
        if (i20 == 1) {
            int i21 = bArr[i14] & UByte.MAX_VALUE;
            byte[] bArr4 = this.encodingTable;
            bArr2[i15] = bArr4[(i21 >>> 2) & 63];
            bArr2[i15 + 1] = bArr4[(i21 << 4) & 63];
            int i22 = i15 + 3;
            byte b12 = this.padding;
            bArr2[i15 + 2] = b12;
            i15 += 4;
            bArr2[i22] = b12;
        } else if (i20 == 2) {
            int i23 = bArr[i14] & UByte.MAX_VALUE;
            int i24 = bArr[i14 + 1] & UByte.MAX_VALUE;
            byte[] bArr5 = this.encodingTable;
            bArr2[i15] = bArr5[(i23 >>> 2) & 63];
            bArr2[i15 + 1] = bArr5[((i23 << 4) | (i24 >>> 4)) & 63];
            int i25 = i15 + 3;
            bArr2[i15 + 2] = bArr5[(i24 << 2) & 63];
            i15 += 4;
            bArr2[i25] = this.padding;
        }
        return i15 - i12;
    }
}
