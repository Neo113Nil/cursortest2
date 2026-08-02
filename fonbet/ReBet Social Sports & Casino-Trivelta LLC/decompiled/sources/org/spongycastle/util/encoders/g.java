package org.spongycastle.util.encoders;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.UByte;

/* loaded from: classes5.dex */
public class g implements d {
    protected final byte[] encodingTable = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    protected final byte[] decodingTable = new byte[128];

    public g() {
        b();
    }

    private static boolean a(char c10) {
        return c10 == '\n' || c10 == '\r' || c10 == '\t' || c10 == ' ';
    }

    public void b() {
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
                byte[] bArr3 = this.decodingTable;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
            this.decodingTable[bArr2[i10]] = (byte) i10;
            i10++;
        }
    }

    @Override // org.spongycastle.util.encoders.d
    public int decode(String str, OutputStream outputStream) {
        int length = str.length();
        while (length > 0 && a(str.charAt(length - 1))) {
            length--;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            while (i10 < length && a(str.charAt(i10))) {
                i10++;
            }
            int i12 = i10 + 1;
            byte b10 = this.decodingTable[str.charAt(i10)];
            while (i12 < length && a(str.charAt(i12))) {
                i12++;
            }
            int i13 = i12 + 1;
            byte b11 = this.decodingTable[str.charAt(i12)];
            if ((b10 | b11) < 0) {
                throw new IOException("invalid characters encountered in Hex string");
            }
            outputStream.write((b10 << 4) | b11);
            i11++;
            i10 = i13;
        }
        return i11;
    }

    @Override // org.spongycastle.util.encoders.d
    public int encode(byte[] bArr, int i10, int i11, OutputStream outputStream) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            byte b10 = bArr[i12];
            outputStream.write(this.encodingTable[(b10 & UByte.MAX_VALUE) >>> 4]);
            outputStream.write(this.encodingTable[b10 & 15]);
        }
        return i11 * 2;
    }
}
