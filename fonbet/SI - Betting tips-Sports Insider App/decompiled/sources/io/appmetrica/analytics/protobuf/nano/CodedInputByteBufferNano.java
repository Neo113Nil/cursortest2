package io.appmetrica.analytics.protobuf.nano;

import androidx.appcompat.widget.c1;
import java.io.IOException;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class CodedInputByteBufferNano {
    private static final int DEFAULT_RECURSION_LIMIT = 64;
    private static final int DEFAULT_SIZE_LIMIT = 67108864;
    private final byte[] buffer;
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int bufferStart;
    private int lastTag;
    private int recursionDepth;
    private int currentLimit = Integer.MAX_VALUE;
    private int recursionLimit = 64;
    private int sizeLimit = DEFAULT_SIZE_LIMIT;

    private CodedInputByteBufferNano(byte[] bArr, int i5, int i10) {
        this.buffer = bArr;
        this.bufferStart = i5;
        this.bufferSize = i10 + i5;
        this.bufferPos = i5;
    }

    public static int decodeZigZag32(int i5) {
        return (-(i5 & 1)) ^ (i5 >>> 1);
    }

    public static long decodeZigZag64(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static CodedInputByteBufferNano newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    private void recomputeBufferSizeAfterLimit() {
        int i5 = this.bufferSize + this.bufferSizeAfterLimit;
        this.bufferSize = i5;
        int i10 = this.currentLimit;
        if (i5 <= i10) {
            this.bufferSizeAfterLimit = 0;
            return;
        }
        int i11 = i5 - i10;
        this.bufferSizeAfterLimit = i11;
        this.bufferSize = i5 - i11;
    }

    public void checkLastTagWas(int i5) throws InvalidProtocolBufferNanoException {
        if (this.lastTag != i5) {
            throw InvalidProtocolBufferNanoException.invalidEndTag();
        }
    }

    public int getBytesUntilLimit() {
        int i5 = this.currentLimit;
        if (i5 == Integer.MAX_VALUE) {
            return -1;
        }
        return i5 - this.bufferPos;
    }

    public byte[] getData(int i5, int i10) {
        if (i10 == 0) {
            return WireFormatNano.EMPTY_BYTES;
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.buffer, this.bufferStart + i5, bArr, 0, i10);
        return bArr;
    }

    public int getPosition() {
        return this.bufferPos - this.bufferStart;
    }

    public boolean isAtEnd() {
        return this.bufferPos == this.bufferSize;
    }

    public void popLimit(int i5) {
        this.currentLimit = i5;
        recomputeBufferSizeAfterLimit();
    }

    public int pushLimit(int i5) throws InvalidProtocolBufferNanoException {
        if (i5 < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        int i10 = i5 + this.bufferPos;
        int i11 = this.currentLimit;
        if (i10 > i11) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        this.currentLimit = i10;
        recomputeBufferSizeAfterLimit();
        return i11;
    }

    public boolean readBool() throws IOException {
        return readRawVarint32() != 0;
    }

    public byte[] readBytes() throws IOException {
        int readRawVarint32 = readRawVarint32();
        int i5 = this.bufferSize;
        int i10 = this.bufferPos;
        if (readRawVarint32 > i5 - i10 || readRawVarint32 <= 0) {
            return readRawVarint32 == 0 ? WireFormatNano.EMPTY_BYTES : readRawBytes(readRawVarint32);
        }
        byte[] bArr = new byte[readRawVarint32];
        System.arraycopy(this.buffer, i10, bArr, 0, readRawVarint32);
        this.bufferPos += readRawVarint32;
        return bArr;
    }

    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    public int readEnum() throws IOException {
        return readRawVarint32();
    }

    public int readFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    public long readFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    public void readGroup(MessageNano messageNano, int i5) throws IOException {
        int i10 = this.recursionDepth;
        if (i10 >= this.recursionLimit) {
            throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
        }
        this.recursionDepth = i10 + 1;
        messageNano.mergeFrom(this);
        checkLastTagWas(WireFormatNano.makeTag(i5, 4));
        this.recursionDepth--;
    }

    public int readInt32() throws IOException {
        return readRawVarint32();
    }

    public long readInt64() throws IOException {
        return readRawVarint64();
    }

    public void readMessage(MessageNano messageNano) throws IOException {
        int readRawVarint32 = readRawVarint32();
        if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
        }
        int pushLimit = pushLimit(readRawVarint32);
        this.recursionDepth++;
        messageNano.mergeFrom(this);
        checkLastTagWas(0);
        this.recursionDepth--;
        popLimit(pushLimit);
    }

    public Object readPrimitiveField(int i5) throws IOException {
        switch (i5) {
            case 1:
                return Double.valueOf(readDouble());
            case 2:
                return Float.valueOf(readFloat());
            case 3:
                return Long.valueOf(readInt64());
            case 4:
                return Long.valueOf(readUInt64());
            case 5:
                return Integer.valueOf(readInt32());
            case 6:
                return Long.valueOf(readFixed64());
            case 7:
                return Integer.valueOf(readFixed32());
            case 8:
                return Boolean.valueOf(readBool());
            case 9:
                return readString();
            case 10:
            case 11:
            default:
                throw new IllegalArgumentException(c1.i(i5, "Unknown type "));
            case 12:
                return readBytes();
            case 13:
                return Integer.valueOf(readUInt32());
            case 14:
                return Integer.valueOf(readEnum());
            case 15:
                return Integer.valueOf(readSFixed32());
            case 16:
                return Long.valueOf(readSFixed64());
            case 17:
                return Integer.valueOf(readSInt32());
            case 18:
                return Long.valueOf(readSInt64());
        }
    }

    public byte readRawByte() throws IOException {
        int i5 = this.bufferPos;
        if (i5 == this.bufferSize) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i5 + 1;
        return bArr[i5];
    }

    public byte[] readRawBytes(int i5) throws IOException {
        if (i5 < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        int i10 = this.bufferPos;
        int i11 = i10 + i5;
        int i12 = this.currentLimit;
        if (i11 > i12) {
            skipRawBytes(i12 - i10);
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        if (i5 > this.bufferSize - i10) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        byte[] bArr = new byte[i5];
        System.arraycopy(this.buffer, i10, bArr, 0, i5);
        this.bufferPos += i5;
        return bArr;
    }

    public int readRawLittleEndian32() throws IOException {
        return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24);
    }

    public long readRawLittleEndian64() throws IOException {
        return ((readRawByte() & 255) << 8) | (readRawByte() & 255) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24) | ((readRawByte() & 255) << 32) | ((readRawByte() & 255) << 40) | ((readRawByte() & 255) << 48) | ((readRawByte() & 255) << 56);
    }

    public int readRawVarint32() throws IOException {
        int i5;
        byte readRawByte = readRawByte();
        if (readRawByte >= 0) {
            return readRawByte;
        }
        int i10 = readRawByte & ByteCompanionObject.MAX_VALUE;
        byte readRawByte2 = readRawByte();
        if (readRawByte2 >= 0) {
            i5 = readRawByte2 << 7;
        } else {
            i10 |= (readRawByte2 & ByteCompanionObject.MAX_VALUE) << 7;
            byte readRawByte3 = readRawByte();
            if (readRawByte3 >= 0) {
                i5 = readRawByte3 << 14;
            } else {
                i10 |= (readRawByte3 & ByteCompanionObject.MAX_VALUE) << 14;
                byte readRawByte4 = readRawByte();
                if (readRawByte4 < 0) {
                    int i11 = i10 | ((readRawByte4 & ByteCompanionObject.MAX_VALUE) << 21);
                    byte readRawByte5 = readRawByte();
                    int i12 = i11 | (readRawByte5 << 28);
                    if (readRawByte5 < 0) {
                        for (int i13 = 0; i13 < 5; i13++) {
                            if (readRawByte() < 0) {
                            }
                        }
                        throw InvalidProtocolBufferNanoException.malformedVarint();
                    }
                    return i12;
                }
                i5 = readRawByte4 << 21;
            }
        }
        return i10 | i5;
    }

    public long readRawVarint64() throws IOException {
        long j = 0;
        for (int i5 = 0; i5 < 64; i5 += 7) {
            j |= (r3 & ByteCompanionObject.MAX_VALUE) << i5;
            if ((readRawByte() & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferNanoException.malformedVarint();
    }

    public int readSFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    public long readSFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    public int readSInt32() throws IOException {
        return decodeZigZag32(readRawVarint32());
    }

    public long readSInt64() throws IOException {
        return decodeZigZag64(readRawVarint64());
    }

    public String readString() throws IOException {
        int readRawVarint32 = readRawVarint32();
        int i5 = this.bufferSize;
        int i10 = this.bufferPos;
        if (readRawVarint32 > i5 - i10 || readRawVarint32 <= 0) {
            return new String(readRawBytes(readRawVarint32), InternalNano.UTF_8);
        }
        String str = new String(this.buffer, i10, readRawVarint32, InternalNano.UTF_8);
        this.bufferPos += readRawVarint32;
        return str;
    }

    public int readTag() throws IOException {
        if (isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        int readRawVarint32 = readRawVarint32();
        this.lastTag = readRawVarint32;
        if (readRawVarint32 != 0) {
            return readRawVarint32;
        }
        throw InvalidProtocolBufferNanoException.invalidTag();
    }

    public int readUInt32() throws IOException {
        return readRawVarint32();
    }

    public long readUInt64() throws IOException {
        return readRawVarint64();
    }

    public void rewindToPosition(int i5) {
        int i10 = this.bufferPos;
        int i11 = this.bufferStart;
        if (i5 > i10 - i11) {
            StringBuilder r5 = c1.r(i5, "Position ", " is beyond current ");
            r5.append(this.bufferPos - this.bufferStart);
            throw new IllegalArgumentException(r5.toString());
        }
        if (i5 < 0) {
            throw new IllegalArgumentException(c1.i(i5, "Bad position "));
        }
        this.bufferPos = i11 + i5;
    }

    public int setRecursionLimit(int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException(c1.i(i5, "Recursion limit cannot be negative: "));
        }
        int i10 = this.recursionLimit;
        this.recursionLimit = i5;
        return i10;
    }

    public int setSizeLimit(int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException(c1.i(i5, "Size limit cannot be negative: "));
        }
        int i10 = this.sizeLimit;
        this.sizeLimit = i5;
        return i10;
    }

    public boolean skipField(int i5) throws IOException {
        int tagWireType = WireFormatNano.getTagWireType(i5);
        if (tagWireType == 0) {
            readInt32();
            return true;
        }
        if (tagWireType == 1) {
            readRawLittleEndian64();
            return true;
        }
        if (tagWireType == 2) {
            skipRawBytes(readRawVarint32());
            return true;
        }
        if (tagWireType == 3) {
            skipMessage();
            checkLastTagWas(WireFormatNano.makeTag(WireFormatNano.getTagFieldNumber(i5), 4));
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw InvalidProtocolBufferNanoException.invalidWireType();
        }
        readRawLittleEndian32();
        return true;
    }

    public void skipMessage() throws IOException {
        int readTag;
        do {
            readTag = readTag();
            if (readTag == 0) {
                return;
            }
        } while (skipField(readTag));
    }

    public void skipRawBytes(int i5) throws IOException {
        if (i5 < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        int i10 = this.bufferPos;
        int i11 = i10 + i5;
        int i12 = this.currentLimit;
        if (i11 > i12) {
            skipRawBytes(i12 - i10);
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        if (i5 > this.bufferSize - i10) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        this.bufferPos = i11;
    }

    public static CodedInputByteBufferNano newInstance(byte[] bArr, int i5, int i10) {
        return new CodedInputByteBufferNano(bArr, i5, i10);
    }

    public void resetSizeCounter() {
    }
}
