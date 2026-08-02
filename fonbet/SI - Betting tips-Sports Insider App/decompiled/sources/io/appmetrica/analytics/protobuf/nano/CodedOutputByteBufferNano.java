package io.appmetrica.analytics.protobuf.nano;

import androidx.appcompat.widget.c1;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class CodedOutputByteBufferNano {
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    public static final int LITTLE_ENDIAN_64_SIZE = 8;
    private static final int MAX_UTF8_EXPANSION = 3;
    private final ByteBuffer buffer;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException(int i5, int i10) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i5 + " limit " + i10 + ").");
        }
    }

    private CodedOutputByteBufferNano(byte[] bArr, int i5, int i10) {
        this(ByteBuffer.wrap(bArr, i5, i10));
    }

    public static int computeBoolSize(int i5, boolean z5) {
        return computeBoolSizeNoTag(z5) + computeTagSize(i5);
    }

    public static int computeBoolSizeNoTag(boolean z5) {
        return 1;
    }

    public static int computeBytesSize(int i5, byte[] bArr) {
        return computeBytesSizeNoTag(bArr) + computeTagSize(i5);
    }

    public static int computeBytesSizeNoTag(byte[] bArr) {
        return computeRawVarint32Size(bArr.length) + bArr.length;
    }

    public static int computeDoubleSize(int i5, double d10) {
        return computeDoubleSizeNoTag(d10) + computeTagSize(i5);
    }

    public static int computeDoubleSizeNoTag(double d10) {
        return 8;
    }

    public static int computeEnumSize(int i5, int i10) {
        return computeEnumSizeNoTag(i10) + computeTagSize(i5);
    }

    public static int computeEnumSizeNoTag(int i5) {
        return computeRawVarint32Size(i5);
    }

    public static int computeFieldSize(int i5, int i10, Object obj) {
        switch (i10) {
            case 1:
                return computeDoubleSize(i5, ((Double) obj).doubleValue());
            case 2:
                return computeFloatSize(i5, ((Float) obj).floatValue());
            case 3:
                return computeInt64Size(i5, ((Long) obj).longValue());
            case 4:
                return computeUInt64Size(i5, ((Long) obj).longValue());
            case 5:
                return computeInt32Size(i5, ((Integer) obj).intValue());
            case 6:
                return computeFixed64Size(i5, ((Long) obj).longValue());
            case 7:
                return computeFixed32Size(i5, ((Integer) obj).intValue());
            case 8:
                return computeBoolSize(i5, ((Boolean) obj).booleanValue());
            case 9:
                return computeStringSize(i5, (String) obj);
            case 10:
                return computeGroupSize(i5, (MessageNano) obj);
            case 11:
                return computeMessageSize(i5, (MessageNano) obj);
            case 12:
                return computeBytesSize(i5, (byte[]) obj);
            case 13:
                return computeUInt32Size(i5, ((Integer) obj).intValue());
            case 14:
                return computeEnumSize(i5, ((Integer) obj).intValue());
            case 15:
                return computeSFixed32Size(i5, ((Integer) obj).intValue());
            case 16:
                return computeSFixed64Size(i5, ((Long) obj).longValue());
            case 17:
                return computeSInt32Size(i5, ((Integer) obj).intValue());
            case 18:
                return computeSInt64Size(i5, ((Long) obj).longValue());
            default:
                throw new IllegalArgumentException(c1.i(i10, "Unknown type: "));
        }
    }

    public static int computeFixed32Size(int i5, int i10) {
        return computeFixed32SizeNoTag(i10) + computeTagSize(i5);
    }

    public static int computeFixed32SizeNoTag(int i5) {
        return 4;
    }

    public static int computeFixed64Size(int i5, long j) {
        return computeFixed64SizeNoTag(j) + computeTagSize(i5);
    }

    public static int computeFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int computeFloatSize(int i5, float f6) {
        return computeFloatSizeNoTag(f6) + computeTagSize(i5);
    }

    public static int computeFloatSizeNoTag(float f6) {
        return 4;
    }

    public static int computeGroupSize(int i5, MessageNano messageNano) {
        return computeGroupSizeNoTag(messageNano) + (computeTagSize(i5) * 2);
    }

    public static int computeGroupSizeNoTag(MessageNano messageNano) {
        return messageNano.getSerializedSize();
    }

    public static int computeInt32Size(int i5, int i10) {
        return computeInt32SizeNoTag(i10) + computeTagSize(i5);
    }

    public static int computeInt32SizeNoTag(int i5) {
        if (i5 >= 0) {
            return computeRawVarint32Size(i5);
        }
        return 10;
    }

    public static int computeInt64Size(int i5, long j) {
        return computeInt64SizeNoTag(j) + computeTagSize(i5);
    }

    public static int computeInt64SizeNoTag(long j) {
        return computeRawVarint64Size(j);
    }

    public static int computeMessageSize(int i5, MessageNano messageNano) {
        return computeMessageSizeNoTag(messageNano) + computeTagSize(i5);
    }

    public static int computeMessageSizeNoTag(MessageNano messageNano) {
        int serializedSize = messageNano.getSerializedSize();
        return computeRawVarint32Size(serializedSize) + serializedSize;
    }

    public static int computeRawVarint32Size(int i5) {
        if ((i5 & (-128)) == 0) {
            return 1;
        }
        if ((i5 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i5) == 0) {
            return 3;
        }
        return (i5 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeRawVarint64Size(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int computeSFixed32Size(int i5, int i10) {
        return computeSFixed32SizeNoTag(i10) + computeTagSize(i5);
    }

    public static int computeSFixed32SizeNoTag(int i5) {
        return 4;
    }

    public static int computeSFixed64Size(int i5, long j) {
        return computeSFixed64SizeNoTag(j) + computeTagSize(i5);
    }

    public static int computeSFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int computeSInt32Size(int i5, int i10) {
        return computeSInt32SizeNoTag(i10) + computeTagSize(i5);
    }

    public static int computeSInt32SizeNoTag(int i5) {
        return computeRawVarint32Size(encodeZigZag32(i5));
    }

    public static int computeSInt64Size(int i5, long j) {
        return computeSInt64SizeNoTag(j) + computeTagSize(i5);
    }

    public static int computeSInt64SizeNoTag(long j) {
        return computeRawVarint64Size(encodeZigZag64(j));
    }

    public static int computeStringSize(int i5, String str) {
        return computeStringSizeNoTag(str) + computeTagSize(i5);
    }

    public static int computeStringSizeNoTag(String str) {
        int encodedLength = encodedLength(str);
        return computeRawVarint32Size(encodedLength) + encodedLength;
    }

    public static int computeTagSize(int i5) {
        return computeRawVarint32Size(WireFormatNano.makeTag(i5, 0));
    }

    public static int computeUInt32Size(int i5, int i10) {
        return computeUInt32SizeNoTag(i10) + computeTagSize(i5);
    }

    public static int computeUInt32SizeNoTag(int i5) {
        return computeRawVarint32Size(i5);
    }

    public static int computeUInt64Size(int i5, long j) {
        return computeUInt64SizeNoTag(j) + computeTagSize(i5);
    }

    public static int computeUInt64SizeNoTag(long j) {
        return computeRawVarint64Size(j);
    }

    private static void encode(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        if (!byteBuffer.hasArray()) {
            encodeDirect(charSequence, byteBuffer);
            return;
        }
        try {
            byteBuffer.position(encode(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e7) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e7);
            throw bufferOverflowException;
        }
    }

    private static void encodeDirect(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int i5 = 0;
        while (i5 < length) {
            char charAt = charSequence.charAt(i5);
            if (charAt < 128) {
                byteBuffer.put((byte) charAt);
            } else if (charAt < 2048) {
                byteBuffer.put((byte) ((charAt >>> 6) | 960));
                byteBuffer.put((byte) ((charAt & '?') | 128));
            } else {
                if (charAt >= 55296 && 57343 >= charAt) {
                    int i10 = i5 + 1;
                    if (i10 != charSequence.length()) {
                        char charAt2 = charSequence.charAt(i10);
                        if (Character.isSurrogatePair(charAt, charAt2)) {
                            int codePoint = Character.toCodePoint(charAt, charAt2);
                            byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                            byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                            byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                            byteBuffer.put((byte) ((codePoint & 63) | 128));
                            i5 = i10;
                        } else {
                            i5 = i10;
                        }
                    }
                    StringBuilder sb2 = new StringBuilder("Unpaired surrogate at index ");
                    sb2.append(i5 - 1);
                    throw new IllegalArgumentException(sb2.toString());
                }
                byteBuffer.put((byte) ((charAt >>> '\f') | 480));
                byteBuffer.put((byte) (((charAt >>> 6) & 63) | 128));
                byteBuffer.put((byte) ((charAt & '?') | 128));
            }
            i5++;
        }
    }

    public static int encodeZigZag32(int i5) {
        return (i5 >> 31) ^ (i5 << 1);
    }

    public static long encodeZigZag64(long j) {
        return (j >> 63) ^ (j << 1);
    }

    private static int encodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i5 = 0;
        while (i5 < length && charSequence.charAt(i5) < 128) {
            i5++;
        }
        int i10 = length;
        while (true) {
            if (i5 < length) {
                char charAt = charSequence.charAt(i5);
                if (charAt >= 2048) {
                    i10 += encodedLengthGeneral(charSequence, i5);
                    break;
                }
                i10 += (127 - charAt) >>> 31;
                i5++;
            } else {
                break;
            }
        }
        if (i10 >= length) {
            return i10;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i10 + 4294967296L));
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i5) {
        int length = charSequence.length();
        int i10 = 0;
        while (i5 < length) {
            char charAt = charSequence.charAt(i5);
            if (charAt < 2048) {
                i10 += (127 - charAt) >>> 31;
            } else {
                i10 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i5) < 65536) {
                        throw new IllegalArgumentException(c1.i(i5, "Unpaired surrogate at index "));
                    }
                    i5++;
                }
            }
            i5++;
        }
        return i10;
    }

    public static CodedOutputByteBufferNano newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public int position() {
        return this.buffer.position();
    }

    public void reset() {
        this.buffer.clear();
    }

    public int spaceLeft() {
        return this.buffer.remaining();
    }

    public void writeBool(int i5, boolean z5) throws IOException {
        writeTag(i5, 0);
        writeBoolNoTag(z5);
    }

    public void writeBoolNoTag(boolean z5) throws IOException {
        writeRawByte(z5 ? 1 : 0);
    }

    public void writeBytes(int i5, byte[] bArr) throws IOException {
        writeTag(i5, 2);
        writeBytesNoTag(bArr);
    }

    public void writeBytesNoTag(byte[] bArr) throws IOException {
        writeRawVarint32(bArr.length);
        writeRawBytes(bArr);
    }

    public void writeDouble(int i5, double d10) throws IOException {
        writeTag(i5, 1);
        writeDoubleNoTag(d10);
    }

    public void writeDoubleNoTag(double d10) throws IOException {
        writeRawLittleEndian64(Double.doubleToLongBits(d10));
    }

    public void writeEnum(int i5, int i10) throws IOException {
        writeTag(i5, 0);
        writeEnumNoTag(i10);
    }

    public void writeEnumNoTag(int i5) throws IOException {
        writeRawVarint32(i5);
    }

    public void writeField(int i5, int i10, Object obj) throws IOException {
        switch (i10) {
            case 1:
                writeDouble(i5, ((Double) obj).doubleValue());
                return;
            case 2:
                writeFloat(i5, ((Float) obj).floatValue());
                return;
            case 3:
                writeInt64(i5, ((Long) obj).longValue());
                return;
            case 4:
                writeUInt64(i5, ((Long) obj).longValue());
                return;
            case 5:
                writeInt32(i5, ((Integer) obj).intValue());
                return;
            case 6:
                writeFixed64(i5, ((Long) obj).longValue());
                return;
            case 7:
                writeFixed32(i5, ((Integer) obj).intValue());
                return;
            case 8:
                writeBool(i5, ((Boolean) obj).booleanValue());
                return;
            case 9:
                writeString(i5, (String) obj);
                return;
            case 10:
                writeGroup(i5, (MessageNano) obj);
                return;
            case 11:
                writeMessage(i5, (MessageNano) obj);
                return;
            case 12:
                writeBytes(i5, (byte[]) obj);
                return;
            case 13:
                writeUInt32(i5, ((Integer) obj).intValue());
                return;
            case 14:
                writeEnum(i5, ((Integer) obj).intValue());
                return;
            case 15:
                writeSFixed32(i5, ((Integer) obj).intValue());
                return;
            case 16:
                writeSFixed64(i5, ((Long) obj).longValue());
                return;
            case 17:
                writeSInt32(i5, ((Integer) obj).intValue());
                return;
            case 18:
                writeSInt64(i5, ((Long) obj).longValue());
                return;
            default:
                throw new IOException(c1.i(i10, "Unknown type: "));
        }
    }

    public void writeFixed32(int i5, int i10) throws IOException {
        writeTag(i5, 5);
        writeFixed32NoTag(i10);
    }

    public void writeFixed32NoTag(int i5) throws IOException {
        writeRawLittleEndian32(i5);
    }

    public void writeFixed64(int i5, long j) throws IOException {
        writeTag(i5, 1);
        writeFixed64NoTag(j);
    }

    public void writeFixed64NoTag(long j) throws IOException {
        writeRawLittleEndian64(j);
    }

    public void writeFloat(int i5, float f6) throws IOException {
        writeTag(i5, 5);
        writeFloatNoTag(f6);
    }

    public void writeFloatNoTag(float f6) throws IOException {
        writeRawLittleEndian32(Float.floatToIntBits(f6));
    }

    public void writeGroup(int i5, MessageNano messageNano) throws IOException {
        writeTag(i5, 3);
        writeGroupNoTag(messageNano);
        writeTag(i5, 4);
    }

    public void writeGroupNoTag(MessageNano messageNano) throws IOException {
        messageNano.writeTo(this);
    }

    public void writeInt32(int i5, int i10) throws IOException {
        writeTag(i5, 0);
        writeInt32NoTag(i10);
    }

    public void writeInt32NoTag(int i5) throws IOException {
        if (i5 >= 0) {
            writeRawVarint32(i5);
        } else {
            writeRawVarint64(i5);
        }
    }

    public void writeInt64(int i5, long j) throws IOException {
        writeTag(i5, 0);
        writeInt64NoTag(j);
    }

    public void writeInt64NoTag(long j) throws IOException {
        writeRawVarint64(j);
    }

    public void writeMessage(int i5, MessageNano messageNano) throws IOException {
        writeTag(i5, 2);
        writeMessageNoTag(messageNano);
    }

    public void writeMessageNoTag(MessageNano messageNano) throws IOException {
        writeRawVarint32(messageNano.getCachedSize());
        messageNano.writeTo(this);
    }

    public void writeRawByte(byte b10) throws IOException {
        if (!this.buffer.hasRemaining()) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.put(b10);
    }

    public void writeRawBytes(byte[] bArr) throws IOException {
        writeRawBytes(bArr, 0, bArr.length);
    }

    public void writeRawLittleEndian32(int i5) throws IOException {
        if (this.buffer.remaining() < 4) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.putInt(i5);
    }

    public void writeRawLittleEndian64(long j) throws IOException {
        if (this.buffer.remaining() < 8) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.putLong(j);
    }

    public void writeRawVarint32(int i5) throws IOException {
        while ((i5 & (-128)) != 0) {
            writeRawByte((i5 & 127) | 128);
            i5 >>>= 7;
        }
        writeRawByte(i5);
    }

    public void writeRawVarint64(long j) throws IOException {
        while (((-128) & j) != 0) {
            writeRawByte((((int) j) & 127) | 128);
            j >>>= 7;
        }
        writeRawByte((int) j);
    }

    public void writeSFixed32(int i5, int i10) throws IOException {
        writeTag(i5, 5);
        writeSFixed32NoTag(i10);
    }

    public void writeSFixed32NoTag(int i5) throws IOException {
        writeRawLittleEndian32(i5);
    }

    public void writeSFixed64(int i5, long j) throws IOException {
        writeTag(i5, 1);
        writeSFixed64NoTag(j);
    }

    public void writeSFixed64NoTag(long j) throws IOException {
        writeRawLittleEndian64(j);
    }

    public void writeSInt32(int i5, int i10) throws IOException {
        writeTag(i5, 0);
        writeSInt32NoTag(i10);
    }

    public void writeSInt32NoTag(int i5) throws IOException {
        writeRawVarint32(encodeZigZag32(i5));
    }

    public void writeSInt64(int i5, long j) throws IOException {
        writeTag(i5, 0);
        writeSInt64NoTag(j);
    }

    public void writeSInt64NoTag(long j) throws IOException {
        writeRawVarint64(encodeZigZag64(j));
    }

    public void writeString(int i5, String str) throws IOException {
        writeTag(i5, 2);
        writeStringNoTag(str);
    }

    public void writeStringNoTag(String str) throws IOException {
        try {
            int computeRawVarint32Size = computeRawVarint32Size(str.length());
            if (computeRawVarint32Size != computeRawVarint32Size(str.length() * 3)) {
                writeRawVarint32(encodedLength(str));
                encode(str, this.buffer);
                return;
            }
            int position = this.buffer.position();
            if (this.buffer.remaining() < computeRawVarint32Size) {
                throw new OutOfSpaceException(position + computeRawVarint32Size, this.buffer.limit());
            }
            this.buffer.position(position + computeRawVarint32Size);
            encode(str, this.buffer);
            int position2 = this.buffer.position();
            this.buffer.position(position);
            writeRawVarint32((position2 - position) - computeRawVarint32Size);
            this.buffer.position(position2);
        } catch (BufferOverflowException e7) {
            OutOfSpaceException outOfSpaceException = new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
            outOfSpaceException.initCause(e7);
            throw outOfSpaceException;
        }
    }

    public void writeTag(int i5, int i10) throws IOException {
        writeRawVarint32(WireFormatNano.makeTag(i5, i10));
    }

    public void writeUInt32(int i5, int i10) throws IOException {
        writeTag(i5, 0);
        writeUInt32NoTag(i10);
    }

    public void writeUInt32NoTag(int i5) throws IOException {
        writeRawVarint32(i5);
    }

    public void writeUInt64(int i5, long j) throws IOException {
        writeTag(i5, 0);
        writeUInt64NoTag(j);
    }

    public void writeUInt64NoTag(long j) throws IOException {
        writeRawVarint64(j);
    }

    private CodedOutputByteBufferNano(ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    public static CodedOutputByteBufferNano newInstance(byte[] bArr, int i5, int i10) {
        return new CodedOutputByteBufferNano(bArr, i5, i10);
    }

    public void writeRawBytes(byte[] bArr, int i5, int i10) throws IOException {
        if (this.buffer.remaining() < i10) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.put(bArr, i5, i10);
    }

    public void writeRawByte(int i5) throws IOException {
        writeRawByte((byte) i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int encode(CharSequence charSequence, byte[] bArr, int i5, int i10) {
        int i11;
        char charAt;
        int length = charSequence.length();
        int i12 = i10 + i5;
        int i13 = 0;
        while (i13 < length && (i11 = i13 + i5) < i12 && (charAt = charSequence.charAt(i13)) < 128) {
            bArr[i11] = (byte) charAt;
            i13++;
        }
        int i14 = i5 + i13;
        while (i13 < length) {
            char charAt2 = charSequence.charAt(i13);
            if (charAt2 < 128 && i14 < i12) {
                bArr[i14] = (byte) charAt2;
                i14++;
            } else if (charAt2 < 2048 && i14 <= i12 - 2) {
                int i15 = i14 + 1;
                bArr[i14] = (byte) ((charAt2 >>> 6) | 960);
                i14 += 2;
                bArr[i15] = (byte) ((charAt2 & '?') | 128);
            } else {
                if ((charAt2 >= 55296 && 57343 >= charAt2) || i14 > i12 - 3) {
                    if (i14 <= i12 - 4) {
                        int i16 = i13 + 1;
                        if (i16 != charSequence.length()) {
                            char charAt3 = charSequence.charAt(i16);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                bArr[i14] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i14 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i17 = i14 + 3;
                                bArr[i14 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i14 += 4;
                                bArr[i17] = (byte) ((codePoint & 63) | 128);
                                i13 = i16;
                            } else {
                                i13 = i16;
                            }
                        }
                        StringBuilder sb2 = new StringBuilder("Unpaired surrogate at index ");
                        sb2.append(i13 - 1);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i14);
                }
                bArr[i14] = (byte) ((charAt2 >>> '\f') | 480);
                int i18 = i14 + 2;
                bArr[i14 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i14 += 3;
                bArr[i18] = (byte) ((charAt2 & '?') | 128);
            }
            i13++;
        }
        return i14;
    }
}
