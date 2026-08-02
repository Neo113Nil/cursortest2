package org.bouncycastle.crypto.util;

import java.math.BigInteger;
import kotlin.UByte;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* loaded from: classes5.dex */
class SSHBuffer {
    private final byte[] buffer;
    private int pos = 0;

    public SSHBuffer(byte[] bArr) {
        this.buffer = bArr;
    }

    public byte[] getBuffer() {
        return Arrays.clone(this.buffer);
    }

    public boolean hasRemaining() {
        return this.pos < this.buffer.length;
    }

    public BigInteger readBigNumPositive() {
        int readU32 = readU32();
        int i10 = this.pos;
        int i11 = i10 + readU32;
        byte[] bArr = this.buffer;
        if (i11 > bArr.length) {
            throw new IllegalArgumentException("not enough data for big num");
        }
        int i12 = readU32 + i10;
        this.pos = i12;
        return new BigInteger(1, Arrays.copyOfRange(bArr, i10, i12));
    }

    public byte[] readBlock() {
        int readU32 = readU32();
        if (readU32 == 0) {
            return new byte[0];
        }
        int i10 = this.pos;
        byte[] bArr = this.buffer;
        if (i10 > bArr.length - readU32) {
            throw new IllegalArgumentException("not enough data for block");
        }
        int i11 = readU32 + i10;
        this.pos = i11;
        return Arrays.copyOfRange(bArr, i10, i11);
    }

    public byte[] readPaddedBlock() {
        return readPaddedBlock(8);
    }

    public String readString() {
        return Strings.fromByteArray(readBlock());
    }

    public int readU32() {
        int i10 = this.pos;
        byte[] bArr = this.buffer;
        if (i10 > bArr.length - 4) {
            throw new IllegalArgumentException("4 bytes for U32 exceeds buffer.");
        }
        int i11 = i10 + 1;
        this.pos = i11;
        int i12 = (bArr[i10] & UByte.MAX_VALUE) << 24;
        int i13 = i10 + 2;
        this.pos = i13;
        int i14 = ((bArr[i11] & UByte.MAX_VALUE) << 16) | i12;
        int i15 = i10 + 3;
        this.pos = i15;
        int i16 = i14 | ((bArr[i13] & UByte.MAX_VALUE) << 8);
        this.pos = i10 + 4;
        return (bArr[i15] & UByte.MAX_VALUE) | i16;
    }

    public void skipBlock() {
        int readU32 = readU32();
        int i10 = this.pos;
        if (i10 > this.buffer.length - readU32) {
            throw new IllegalArgumentException("not enough data for block");
        }
        this.pos = i10 + readU32;
    }

    public SSHBuffer(byte[] bArr, byte[] bArr2) {
        this.buffer = bArr2;
        for (int i10 = 0; i10 != bArr.length; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                throw new IllegalArgumentException("magic-number incorrect");
            }
        }
        this.pos += bArr.length;
    }

    public byte[] readPaddedBlock(int i10) {
        int i11;
        int readU32 = readU32();
        if (readU32 == 0) {
            return new byte[0];
        }
        int i12 = this.pos;
        byte[] bArr = this.buffer;
        if (i12 > bArr.length - readU32) {
            throw new IllegalArgumentException("not enough data for block");
        }
        if (readU32 % i10 != 0) {
            throw new IllegalArgumentException("missing padding");
        }
        int i13 = i12 + readU32;
        this.pos = i13;
        if (readU32 > 0 && (i11 = bArr[i13 - 1] & UByte.MAX_VALUE) > 0 && i11 < i10) {
            i13 -= i11;
            int i14 = 1;
            int i15 = i13;
            while (i14 <= i11) {
                if (i14 != (this.buffer[i15] & UByte.MAX_VALUE)) {
                    throw new IllegalArgumentException("incorrect padding");
                }
                i14++;
                i15++;
            }
        }
        return Arrays.copyOfRange(this.buffer, i12, i13);
    }
}
