package com.google.protobuf;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.Internal;
import com.google.protobuf.T;
import com.google.protobuf.Utf8;
import com.google.protobuf.u;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* loaded from: classes9.dex */
abstract class BinaryWriter extends AbstractC5953d implements T {
    public static final int DEFAULT_CHUNK_SIZE = 4096;
    private static final int MAP_KEY_NUMBER = 1;
    private static final int MAP_VALUE_NUMBER = 2;
    private final BufferAllocator alloc;
    final ArrayDeque<AllocatedBuffer> buffers;
    private final int chunkSize;
    int totalDoneBytes;

    private static final class SafeDirectWriter extends BinaryWriter {
        private ByteBuffer buffer;
        private int limitMinusOne;
        private int pos;

        SafeDirectWriter(BufferAllocator bufferAllocator, int i11) {
            super(bufferAllocator, i11, null);
            nextBuffer();
        }

        private int bytesWrittenToCurrentBuffer() {
            return this.limitMinusOne - this.pos;
        }

        private void nextBuffer() {
            nextBuffer(newDirectBuffer());
        }

        private int spaceLeft() {
            return this.pos + 1;
        }

        private void writeVarint32FiveBytes(int i11) {
            ByteBuffer byteBuffer = this.buffer;
            int i12 = this.pos;
            this.pos = i12 - 1;
            byteBuffer.put(i12, (byte) (i11 >>> 28));
            int i13 = this.pos;
            this.pos = i13 - 4;
            this.buffer.putInt(i13 - 3, (i11 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN | ((((i11 >>> 21) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN) << 24) | ((((i11 >>> 14) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN) << 16) | ((((i11 >>> 7) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN) << 8));
        }

        private void writeVarint32FourBytes(int i11) {
            int i12 = this.pos;
            this.pos = i12 - 4;
            this.buffer.putInt(i12 - 3, (i11 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN | ((266338304 & i11) << 3) | (((2080768 & i11) | 2097152) << 2) | (((i11 & 16256) | 16384) << 1));
        }

        private void writeVarint32OneByte(int i11) {
            ByteBuffer byteBuffer = this.buffer;
            int i12 = this.pos;
            this.pos = i12 - 1;
            byteBuffer.put(i12, (byte) i11);
        }

        private void writeVarint32ThreeBytes(int i11) {
            int i12 = this.pos - 3;
            this.pos = i12;
            this.buffer.putInt(i12, (((i11 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN) << 8) | ((2080768 & i11) << 10) | (((i11 & 16256) | 16384) << 9));
        }

        private void writeVarint32TwoBytes(int i11) {
            int i12 = this.pos;
            this.pos = i12 - 2;
            this.buffer.putShort(i12 - 1, (short) ((i11 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN | ((i11 & 16256) << 1)));
        }

        private void writeVarint64EightBytes(long j11) {
            int i11 = this.pos;
            this.pos = i11 - 8;
            this.buffer.putLong(i11 - 7, (j11 & 127) | 128 | ((71494644084506624L & j11) << 7) | (((558551906910208L & j11) | 562949953421312L) << 6) | (((4363686772736L & j11) | 4398046511104L) << 5) | (((34091302912L & j11) | 34359738368L) << 4) | (((266338304 & j11) | 268435456) << 3) | (((2080768 & j11) | 2097152) << 2) | (((16256 & j11) | 16384) << 1));
        }

        private void writeVarint64EightBytesWithSign(long j11) {
            int i11 = this.pos;
            this.pos = i11 - 8;
            this.buffer.putLong(i11 - 7, (j11 & 127) | 128 | (((71494644084506624L & j11) | 72057594037927936L) << 7) | (((558551906910208L & j11) | 562949953421312L) << 6) | (((4363686772736L & j11) | 4398046511104L) << 5) | (((34091302912L & j11) | 34359738368L) << 4) | (((266338304 & j11) | 268435456) << 3) | (((2080768 & j11) | 2097152) << 2) | (((16256 & j11) | 16384) << 1));
        }

        private void writeVarint64FiveBytes(long j11) {
            int i11 = this.pos;
            this.pos = i11 - 5;
            this.buffer.putLong(i11 - 7, (((j11 & 127) | 128) << 24) | ((34091302912L & j11) << 28) | (((266338304 & j11) | 268435456) << 27) | (((2080768 & j11) | 2097152) << 26) | (((16256 & j11) | 16384) << 25));
        }

        private void writeVarint64FourBytes(long j11) {
            writeVarint32FourBytes((int) j11);
        }

        private void writeVarint64NineBytes(long j11) {
            ByteBuffer byteBuffer = this.buffer;
            int i11 = this.pos;
            this.pos = i11 - 1;
            byteBuffer.put(i11, (byte) (j11 >>> 56));
            writeVarint64EightBytesWithSign(j11 & 72057594037927935L);
        }

        private void writeVarint64OneByte(long j11) {
            writeVarint32OneByte((int) j11);
        }

        private void writeVarint64SevenBytes(long j11) {
            int i11 = this.pos - 7;
            this.pos = i11;
            this.buffer.putLong(i11, (((j11 & 127) | 128) << 8) | ((558551906910208L & j11) << 14) | (((4363686772736L & j11) | 4398046511104L) << 13) | (((34091302912L & j11) | 34359738368L) << 12) | (((266338304 & j11) | 268435456) << 11) | (((2080768 & j11) | 2097152) << 10) | (((16256 & j11) | 16384) << 9));
        }

        private void writeVarint64SixBytes(long j11) {
            int i11 = this.pos;
            this.pos = i11 - 6;
            this.buffer.putLong(i11 - 7, (((j11 & 127) | 128) << 16) | ((4363686772736L & j11) << 21) | (((34091302912L & j11) | 34359738368L) << 20) | (((266338304 & j11) | 268435456) << 19) | (((2080768 & j11) | 2097152) << 18) | (((16256 & j11) | 16384) << 17));
        }

        private void writeVarint64TenBytes(long j11) {
            ByteBuffer byteBuffer = this.buffer;
            int i11 = this.pos;
            this.pos = i11 - 1;
            byteBuffer.put(i11, (byte) (j11 >>> 63));
            ByteBuffer byteBuffer2 = this.buffer;
            int i12 = this.pos;
            this.pos = i12 - 1;
            byteBuffer2.put(i12, (byte) (((j11 >>> 56) & 127) | 128));
            writeVarint64EightBytesWithSign(j11 & 72057594037927935L);
        }

        private void writeVarint64ThreeBytes(long j11) {
            writeVarint32ThreeBytes((int) j11);
        }

        private void writeVarint64TwoBytes(long j11) {
            writeVarint32TwoBytes((int) j11);
        }

        @Override // com.google.protobuf.BinaryWriter
        void finishCurrentBuffer() {
            if (this.buffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                this.buffer.position(this.pos + 1);
                this.buffer = null;
                this.pos = 0;
                this.limitMinusOne = 0;
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        @Override // com.google.protobuf.BinaryWriter
        void requireSpace(int i11) {
            if (spaceLeft() < i11) {
                nextBuffer(i11);
            }
        }

        @Override // com.google.protobuf.AbstractC5953d
        public void write(byte b11) {
            ByteBuffer byteBuffer = this.buffer;
            int i11 = this.pos;
            this.pos = i11 - 1;
            byteBuffer.put(i11, b11);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeBool(int i11, boolean z11) {
            requireSpace(6);
            write(z11 ? (byte) 1 : (byte) 0);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeBytes(int i11, ByteString byteString) {
            try {
                byteString.writeToReverse(this);
                requireSpace(10);
                writeVarint32(byteString.size());
                writeTag(i11, 2);
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        @Deprecated
        public void writeEndGroup(int i11) {
            writeTag(i11, 4);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeFixed32(int i11, int i12) {
            requireSpace(9);
            writeFixed32(i12);
            writeTag(i11, 5);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeFixed64(int i11, long j11) {
            requireSpace(13);
            writeFixed64(j11);
            writeTag(i11, 1);
        }

        @Override // com.google.protobuf.BinaryWriter
        @Deprecated
        public void writeGroup(int i11, Object obj) throws IOException {
            writeTag(i11, 4);
            H.a().d(obj, this);
            writeTag(i11, 3);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeInt32(int i11, int i12) {
            requireSpace(15);
            writeInt32(i12);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.AbstractC5953d
        public void writeLazy(byte[] bArr, int i11, int i12) {
            if (spaceLeft() < i12) {
                this.totalDoneBytes += i12;
                this.buffers.addFirst(AllocatedBuffer.wrap(bArr, i11, i12));
                nextBuffer();
            } else {
                int i13 = this.pos - i12;
                this.pos = i13;
                this.buffer.position(i13 + 1);
                this.buffer.put(bArr, i11, i12);
            }
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeMessage(int i11, Object obj) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            H.a().d(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i11, 2);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeSInt32(int i11, int i12) {
            requireSpace(10);
            writeSInt32(i12);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeSInt64(int i11, long j11) {
            requireSpace(15);
            writeSInt64(j11);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        @Deprecated
        public void writeStartGroup(int i11) {
            writeTag(i11, 3);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeString(int i11, String str) {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(str);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i11, 2);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeTag(int i11, int i12) {
            writeVarint32((i11 << 3) | i12);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeUInt32(int i11, int i12) {
            requireSpace(10);
            writeVarint32(i12);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeUInt64(int i11, long j11) {
            requireSpace(15);
            writeVarint64(j11);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint32(int i11) {
            if ((i11 & (-128)) == 0) {
                writeVarint32OneByte(i11);
                return;
            }
            if ((i11 & (-16384)) == 0) {
                writeVarint32TwoBytes(i11);
                return;
            }
            if (((-2097152) & i11) == 0) {
                writeVarint32ThreeBytes(i11);
            } else if (((-268435456) & i11) == 0) {
                writeVarint32FourBytes(i11);
            } else {
                writeVarint32FiveBytes(i11);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint64(long j11) {
            switch (BinaryWriter.computeUInt64SizeNoTag(j11)) {
                case 1:
                    writeVarint64OneByte(j11);
                    break;
                case 2:
                    writeVarint64TwoBytes(j11);
                    break;
                case 3:
                    writeVarint64ThreeBytes(j11);
                    break;
                case 4:
                    writeVarint64FourBytes(j11);
                    break;
                case 5:
                    writeVarint64FiveBytes(j11);
                    break;
                case 6:
                    writeVarint64SixBytes(j11);
                    break;
                case 7:
                    writeVarint64SevenBytes(j11);
                    break;
                case 8:
                    writeVarint64EightBytes(j11);
                    break;
                case 9:
                    writeVarint64NineBytes(j11);
                    break;
                case 10:
                    writeVarint64TenBytes(j11);
                    break;
            }
        }

        private void nextBuffer(int i11) {
            nextBuffer(newDirectBuffer(i11));
        }

        @Override // com.google.protobuf.AbstractC5953d
        public void write(byte[] bArr, int i11, int i12) {
            if (spaceLeft() < i12) {
                nextBuffer(i12);
            }
            int i13 = this.pos - i12;
            this.pos = i13;
            this.buffer.position(i13 + 1);
            this.buffer.put(bArr, i11, i12);
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.hasNioBuffer()) {
                ByteBuffer nioBuffer = allocatedBuffer.nioBuffer();
                if (nioBuffer.isDirect()) {
                    finishCurrentBuffer();
                    this.buffers.addFirst(allocatedBuffer);
                    this.buffer = nioBuffer;
                    nioBuffer.limit(nioBuffer.capacity());
                    this.buffer.position(0);
                    this.buffer.order(ByteOrder.LITTLE_ENDIAN);
                    int limit = this.buffer.limit() - 1;
                    this.limitMinusOne = limit;
                    this.pos = limit;
                    return;
                }
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            throw new RuntimeException("Allocated buffer does not have NIO buffer");
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeBool(boolean z11) {
            write(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed32(int i11) {
            int i12 = this.pos;
            this.pos = i12 - 4;
            this.buffer.putInt(i12 - 3, i11);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed64(long j11) {
            int i11 = this.pos;
            this.pos = i11 - 8;
            this.buffer.putLong(i11 - 7, j11);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeGroup(int i11, Object obj, J j11) throws IOException {
            writeTag(i11, 4);
            j11.writeTo(obj, this);
            writeTag(i11, 3);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeInt32(int i11) {
            if (i11 >= 0) {
                writeVarint32(i11);
            } else {
                writeVarint64(i11);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt32(int i11) {
            writeVarint32(CodedOutputStream.encodeZigZag32(i11));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt64(long j11) {
            writeVarint64(CodedOutputStream.encodeZigZag64(j11));
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeMessage(int i11, Object obj, J j11) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            j11.writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i11, 2);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeString(String str) {
            int i11;
            int i12;
            int i13;
            char charAt;
            requireSpace(str.length());
            int length = str.length() - 1;
            this.pos -= length;
            while (length >= 0 && (charAt = str.charAt(length)) < 128) {
                this.buffer.put(this.pos + length, (byte) charAt);
                length--;
            }
            if (length == -1) {
                this.pos--;
                return;
            }
            this.pos += length;
            while (length >= 0) {
                char charAt2 = str.charAt(length);
                if (charAt2 < 128 && (i13 = this.pos) >= 0) {
                    ByteBuffer byteBuffer = this.buffer;
                    this.pos = i13 - 1;
                    byteBuffer.put(i13, (byte) charAt2);
                } else if (charAt2 < 2048 && (i12 = this.pos) > 0) {
                    ByteBuffer byteBuffer2 = this.buffer;
                    this.pos = i12 - 1;
                    byteBuffer2.put(i12, (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                    ByteBuffer byteBuffer3 = this.buffer;
                    int i14 = this.pos;
                    this.pos = i14 - 1;
                    byteBuffer3.put(i14, (byte) ((charAt2 >>> 6) | 960));
                } else if ((charAt2 < 55296 || 57343 < charAt2) && (i11 = this.pos) > 1) {
                    ByteBuffer byteBuffer4 = this.buffer;
                    this.pos = i11 - 1;
                    byteBuffer4.put(i11, (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                    ByteBuffer byteBuffer5 = this.buffer;
                    int i15 = this.pos;
                    this.pos = i15 - 1;
                    byteBuffer5.put(i15, (byte) (((charAt2 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                    ByteBuffer byteBuffer6 = this.buffer;
                    int i16 = this.pos;
                    this.pos = i16 - 1;
                    byteBuffer6.put(i16, (byte) ((charAt2 >>> '\f') | 480));
                } else {
                    if (this.pos > 2) {
                        if (length != 0) {
                            char charAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(charAt3, charAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(charAt3, charAt2);
                                ByteBuffer byteBuffer7 = this.buffer;
                                int i17 = this.pos;
                                this.pos = i17 - 1;
                                byteBuffer7.put(i17, (byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                ByteBuffer byteBuffer8 = this.buffer;
                                int i18 = this.pos;
                                this.pos = i18 - 1;
                                byteBuffer8.put(i18, (byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                ByteBuffer byteBuffer9 = this.buffer;
                                int i19 = this.pos;
                                this.pos = i19 - 1;
                                byteBuffer9.put(i19, (byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                ByteBuffer byteBuffer10 = this.buffer;
                                int i21 = this.pos;
                                this.pos = i21 - 1;
                                byteBuffer10.put(i21, (byte) ((codePoint >>> 18) | 240));
                            }
                        }
                        throw new Utf8.c(length - 1, length);
                    }
                    requireSpace(length);
                    length++;
                }
                length--;
            }
        }

        @Override // com.google.protobuf.AbstractC5953d
        public void write(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (spaceLeft() < remaining) {
                nextBuffer(remaining);
            }
            int i11 = this.pos - remaining;
            this.pos = i11;
            this.buffer.position(i11 + 1);
            this.buffer.put(byteBuffer);
        }

        @Override // com.google.protobuf.AbstractC5953d
        public void writeLazy(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (spaceLeft() < remaining) {
                this.totalDoneBytes += remaining;
                this.buffers.addFirst(AllocatedBuffer.wrap(byteBuffer));
                nextBuffer();
            } else {
                int i11 = this.pos - remaining;
                this.pos = i11;
                this.buffer.position(i11 + 1);
                this.buffer.put(byteBuffer);
            }
        }
    }

    private static final class SafeHeapWriter extends BinaryWriter {
        private AllocatedBuffer allocatedBuffer;
        private byte[] buffer;
        private int limit;
        private int limitMinusOne;
        private int offset;
        private int offsetMinusOne;
        private int pos;

        SafeHeapWriter(BufferAllocator bufferAllocator, int i11) {
            super(bufferAllocator, i11, null);
            nextBuffer();
        }

        private void nextBuffer() {
            nextBuffer(newHeapBuffer());
        }

        private void writeVarint32FiveBytes(int i11) {
            byte[] bArr = this.buffer;
            int i12 = this.pos;
            int i13 = i12 - 1;
            this.pos = i13;
            bArr[i12] = (byte) (i11 >>> 28);
            int i14 = i12 - 2;
            this.pos = i14;
            bArr[i13] = (byte) (((i11 >>> 21) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            int i15 = i12 - 3;
            this.pos = i15;
            bArr[i14] = (byte) (((i11 >>> 14) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            int i16 = i12 - 4;
            this.pos = i16;
            bArr[i15] = (byte) (((i11 >>> 7) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            this.pos = i12 - 5;
            bArr[i16] = (byte) ((i11 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
        }

        private void writeVarint32FourBytes(int i11) {
            byte[] bArr = this.buffer;
            int i12 = this.pos;
            int i13 = i12 - 1;
            this.pos = i13;
            bArr[i12] = (byte) (i11 >>> 21);
            int i14 = i12 - 2;
            this.pos = i14;
            bArr[i13] = (byte) (((i11 >>> 14) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            int i15 = i12 - 3;
            this.pos = i15;
            bArr[i14] = (byte) (((i11 >>> 7) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            this.pos = i12 - 4;
            bArr[i15] = (byte) ((i11 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
        }

        private void writeVarint32OneByte(int i11) {
            byte[] bArr = this.buffer;
            int i12 = this.pos;
            this.pos = i12 - 1;
            bArr[i12] = (byte) i11;
        }

        private void writeVarint32ThreeBytes(int i11) {
            byte[] bArr = this.buffer;
            int i12 = this.pos;
            int i13 = i12 - 1;
            this.pos = i13;
            bArr[i12] = (byte) (i11 >>> 14);
            int i14 = i12 - 2;
            this.pos = i14;
            bArr[i13] = (byte) (((i11 >>> 7) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            this.pos = i12 - 3;
            bArr[i14] = (byte) ((i11 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
        }

        private void writeVarint32TwoBytes(int i11) {
            byte[] bArr = this.buffer;
            int i12 = this.pos;
            int i13 = i12 - 1;
            this.pos = i13;
            bArr[i12] = (byte) (i11 >>> 7);
            this.pos = i12 - 2;
            bArr[i13] = (byte) ((i11 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
        }

        private void writeVarint64EightBytes(long j11) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (j11 >>> 49);
            int i13 = i11 - 2;
            this.pos = i13;
            bArr[i12] = (byte) (((j11 >>> 42) & 127) | 128);
            int i14 = i11 - 3;
            this.pos = i14;
            bArr[i13] = (byte) (((j11 >>> 35) & 127) | 128);
            int i15 = i11 - 4;
            this.pos = i15;
            bArr[i14] = (byte) (((j11 >>> 28) & 127) | 128);
            int i16 = i11 - 5;
            this.pos = i16;
            bArr[i15] = (byte) (((j11 >>> 21) & 127) | 128);
            int i17 = i11 - 6;
            this.pos = i17;
            bArr[i16] = (byte) (((j11 >>> 14) & 127) | 128);
            int i18 = i11 - 7;
            this.pos = i18;
            bArr[i17] = (byte) (((j11 >>> 7) & 127) | 128);
            this.pos = i11 - 8;
            bArr[i18] = (byte) ((j11 & 127) | 128);
        }

        private void writeVarint64FiveBytes(long j11) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (j11 >>> 28);
            int i13 = i11 - 2;
            this.pos = i13;
            bArr[i12] = (byte) (((j11 >>> 21) & 127) | 128);
            int i14 = i11 - 3;
            this.pos = i14;
            bArr[i13] = (byte) (((j11 >>> 14) & 127) | 128);
            int i15 = i11 - 4;
            this.pos = i15;
            bArr[i14] = (byte) (((j11 >>> 7) & 127) | 128);
            this.pos = i11 - 5;
            bArr[i15] = (byte) ((j11 & 127) | 128);
        }

        private void writeVarint64FourBytes(long j11) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (j11 >>> 21);
            int i13 = i11 - 2;
            this.pos = i13;
            bArr[i12] = (byte) (((j11 >>> 14) & 127) | 128);
            int i14 = i11 - 3;
            this.pos = i14;
            bArr[i13] = (byte) (((j11 >>> 7) & 127) | 128);
            this.pos = i11 - 4;
            bArr[i14] = (byte) ((j11 & 127) | 128);
        }

        private void writeVarint64NineBytes(long j11) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (j11 >>> 56);
            int i13 = i11 - 2;
            this.pos = i13;
            bArr[i12] = (byte) (((j11 >>> 49) & 127) | 128);
            int i14 = i11 - 3;
            this.pos = i14;
            bArr[i13] = (byte) (((j11 >>> 42) & 127) | 128);
            int i15 = i11 - 4;
            this.pos = i15;
            bArr[i14] = (byte) (((j11 >>> 35) & 127) | 128);
            int i16 = i11 - 5;
            this.pos = i16;
            bArr[i15] = (byte) (((j11 >>> 28) & 127) | 128);
            int i17 = i11 - 6;
            this.pos = i17;
            bArr[i16] = (byte) (((j11 >>> 21) & 127) | 128);
            int i18 = i11 - 7;
            this.pos = i18;
            bArr[i17] = (byte) (((j11 >>> 14) & 127) | 128);
            int i19 = i11 - 8;
            this.pos = i19;
            bArr[i18] = (byte) (((j11 >>> 7) & 127) | 128);
            this.pos = i11 - 9;
            bArr[i19] = (byte) ((j11 & 127) | 128);
        }

        private void writeVarint64OneByte(long j11) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            this.pos = i11 - 1;
            bArr[i11] = (byte) j11;
        }

        private void writeVarint64SevenBytes(long j11) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (j11 >>> 42);
            int i13 = i11 - 2;
            this.pos = i13;
            bArr[i12] = (byte) (((j11 >>> 35) & 127) | 128);
            int i14 = i11 - 3;
            this.pos = i14;
            bArr[i13] = (byte) (((j11 >>> 28) & 127) | 128);
            int i15 = i11 - 4;
            this.pos = i15;
            bArr[i14] = (byte) (((j11 >>> 21) & 127) | 128);
            int i16 = i11 - 5;
            this.pos = i16;
            bArr[i15] = (byte) (((j11 >>> 14) & 127) | 128);
            int i17 = i11 - 6;
            this.pos = i17;
            bArr[i16] = (byte) (((j11 >>> 7) & 127) | 128);
            this.pos = i11 - 7;
            bArr[i17] = (byte) ((j11 & 127) | 128);
        }

        private void writeVarint64SixBytes(long j11) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (j11 >>> 35);
            int i13 = i11 - 2;
            this.pos = i13;
            bArr[i12] = (byte) (((j11 >>> 28) & 127) | 128);
            int i14 = i11 - 3;
            this.pos = i14;
            bArr[i13] = (byte) (((j11 >>> 21) & 127) | 128);
            int i15 = i11 - 4;
            this.pos = i15;
            bArr[i14] = (byte) (((j11 >>> 14) & 127) | 128);
            int i16 = i11 - 5;
            this.pos = i16;
            bArr[i15] = (byte) (((j11 >>> 7) & 127) | 128);
            this.pos = i11 - 6;
            bArr[i16] = (byte) ((j11 & 127) | 128);
        }

        private void writeVarint64TenBytes(long j11) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (j11 >>> 63);
            int i13 = i11 - 2;
            this.pos = i13;
            bArr[i12] = (byte) (((j11 >>> 56) & 127) | 128);
            int i14 = i11 - 3;
            this.pos = i14;
            bArr[i13] = (byte) (((j11 >>> 49) & 127) | 128);
            int i15 = i11 - 4;
            this.pos = i15;
            bArr[i14] = (byte) (((j11 >>> 42) & 127) | 128);
            int i16 = i11 - 5;
            this.pos = i16;
            bArr[i15] = (byte) (((j11 >>> 35) & 127) | 128);
            int i17 = i11 - 6;
            this.pos = i17;
            bArr[i16] = (byte) (((j11 >>> 28) & 127) | 128);
            int i18 = i11 - 7;
            this.pos = i18;
            bArr[i17] = (byte) (((j11 >>> 21) & 127) | 128);
            int i19 = i11 - 8;
            this.pos = i19;
            bArr[i18] = (byte) (((j11 >>> 14) & 127) | 128);
            int i21 = i11 - 9;
            this.pos = i21;
            bArr[i19] = (byte) (((j11 >>> 7) & 127) | 128);
            this.pos = i11 - 10;
            bArr[i21] = (byte) ((j11 & 127) | 128);
        }

        private void writeVarint64ThreeBytes(long j11) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (((int) j11) >>> 14);
            int i13 = i11 - 2;
            this.pos = i13;
            bArr[i12] = (byte) (((j11 >>> 7) & 127) | 128);
            this.pos = i11 - 3;
            bArr[i13] = (byte) ((j11 & 127) | 128);
        }

        private void writeVarint64TwoBytes(long j11) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (j11 >>> 7);
            this.pos = i11 - 2;
            bArr[i12] = (byte) ((((int) j11) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
        }

        int bytesWrittenToCurrentBuffer() {
            return this.limitMinusOne - this.pos;
        }

        @Override // com.google.protobuf.BinaryWriter
        void finishCurrentBuffer() {
            if (this.allocatedBuffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                AllocatedBuffer allocatedBuffer = this.allocatedBuffer;
                allocatedBuffer.position((this.pos - allocatedBuffer.arrayOffset()) + 1);
                this.allocatedBuffer = null;
                this.pos = 0;
                this.limitMinusOne = 0;
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        @Override // com.google.protobuf.BinaryWriter
        void requireSpace(int i11) {
            if (spaceLeft() < i11) {
                nextBuffer(i11);
            }
        }

        int spaceLeft() {
            return this.pos - this.offsetMinusOne;
        }

        @Override // com.google.protobuf.AbstractC5953d
        public void write(byte b11) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            this.pos = i11 - 1;
            bArr[i11] = b11;
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeBool(int i11, boolean z11) throws IOException {
            requireSpace(6);
            write(z11 ? (byte) 1 : (byte) 0);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeBytes(int i11, ByteString byteString) throws IOException {
            try {
                byteString.writeToReverse(this);
                requireSpace(10);
                writeVarint32(byteString.size());
                writeTag(i11, 2);
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeEndGroup(int i11) {
            writeTag(i11, 4);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeFixed32(int i11, int i12) throws IOException {
            requireSpace(9);
            writeFixed32(i12);
            writeTag(i11, 5);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeFixed64(int i11, long j11) throws IOException {
            requireSpace(13);
            writeFixed64(j11);
            writeTag(i11, 1);
        }

        @Override // com.google.protobuf.BinaryWriter
        @Deprecated
        public void writeGroup(int i11, Object obj) throws IOException {
            writeTag(i11, 4);
            H.a().d(obj, this);
            writeTag(i11, 3);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeInt32(int i11, int i12) throws IOException {
            requireSpace(15);
            writeInt32(i12);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.AbstractC5953d
        public void writeLazy(byte[] bArr, int i11, int i12) {
            if (spaceLeft() < i12) {
                this.totalDoneBytes += i12;
                this.buffers.addFirst(AllocatedBuffer.wrap(bArr, i11, i12));
                nextBuffer();
            } else {
                int i13 = this.pos - i12;
                this.pos = i13;
                System.arraycopy(bArr, i11, this.buffer, i13 + 1, i12);
            }
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeMessage(int i11, Object obj) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            H.a().d(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i11, 2);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeSInt32(int i11, int i12) throws IOException {
            requireSpace(10);
            writeSInt32(i12);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeSInt64(int i11, long j11) throws IOException {
            requireSpace(15);
            writeSInt64(j11);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeStartGroup(int i11) {
            writeTag(i11, 3);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeString(int i11, String str) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(str);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i11, 2);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeTag(int i11, int i12) {
            writeVarint32((i11 << 3) | i12);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeUInt32(int i11, int i12) throws IOException {
            requireSpace(10);
            writeVarint32(i12);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeUInt64(int i11, long j11) throws IOException {
            requireSpace(15);
            writeVarint64(j11);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint32(int i11) {
            if ((i11 & (-128)) == 0) {
                writeVarint32OneByte(i11);
                return;
            }
            if ((i11 & (-16384)) == 0) {
                writeVarint32TwoBytes(i11);
                return;
            }
            if (((-2097152) & i11) == 0) {
                writeVarint32ThreeBytes(i11);
            } else if (((-268435456) & i11) == 0) {
                writeVarint32FourBytes(i11);
            } else {
                writeVarint32FiveBytes(i11);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint64(long j11) {
            switch (BinaryWriter.computeUInt64SizeNoTag(j11)) {
                case 1:
                    writeVarint64OneByte(j11);
                    break;
                case 2:
                    writeVarint64TwoBytes(j11);
                    break;
                case 3:
                    writeVarint64ThreeBytes(j11);
                    break;
                case 4:
                    writeVarint64FourBytes(j11);
                    break;
                case 5:
                    writeVarint64FiveBytes(j11);
                    break;
                case 6:
                    writeVarint64SixBytes(j11);
                    break;
                case 7:
                    writeVarint64SevenBytes(j11);
                    break;
                case 8:
                    writeVarint64EightBytes(j11);
                    break;
                case 9:
                    writeVarint64NineBytes(j11);
                    break;
                case 10:
                    writeVarint64TenBytes(j11);
                    break;
            }
        }

        private void nextBuffer(int i11) {
            nextBuffer(newHeapBuffer(i11));
        }

        @Override // com.google.protobuf.AbstractC5953d
        public void write(byte[] bArr, int i11, int i12) {
            if (spaceLeft() < i12) {
                nextBuffer(i12);
            }
            int i13 = this.pos - i12;
            this.pos = i13;
            System.arraycopy(bArr, i11, this.buffer, i13 + 1, i12);
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.hasArray()) {
                finishCurrentBuffer();
                this.buffers.addFirst(allocatedBuffer);
                this.allocatedBuffer = allocatedBuffer;
                this.buffer = allocatedBuffer.array();
                int arrayOffset = allocatedBuffer.arrayOffset();
                this.limit = allocatedBuffer.limit() + arrayOffset;
                int position = arrayOffset + allocatedBuffer.position();
                this.offset = position;
                this.offsetMinusOne = position - 1;
                int i11 = this.limit - 1;
                this.limitMinusOne = i11;
                this.pos = i11;
                return;
            }
            throw new RuntimeException("Allocator returned non-heap buffer");
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeBool(boolean z11) {
            write(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed32(int i11) {
            byte[] bArr = this.buffer;
            int i12 = this.pos;
            int i13 = i12 - 1;
            this.pos = i13;
            bArr[i12] = (byte) (i11 >> 24);
            int i14 = i12 - 2;
            this.pos = i14;
            bArr[i13] = (byte) (i11 >> 16);
            int i15 = i12 - 3;
            this.pos = i15;
            bArr[i14] = (byte) (i11 >> 8);
            this.pos = i12 - 4;
            bArr[i15] = (byte) i11;
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed64(long j11) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (j11 >> 56);
            int i13 = i11 - 2;
            this.pos = i13;
            bArr[i12] = (byte) (j11 >> 48);
            int i14 = i11 - 3;
            this.pos = i14;
            bArr[i13] = (byte) (j11 >> 40);
            int i15 = i11 - 4;
            this.pos = i15;
            bArr[i14] = (byte) (j11 >> 32);
            int i16 = i11 - 5;
            this.pos = i16;
            bArr[i15] = (byte) (j11 >> 24);
            int i17 = i11 - 6;
            this.pos = i17;
            bArr[i16] = (byte) (j11 >> 16);
            int i18 = i11 - 7;
            this.pos = i18;
            bArr[i17] = (byte) (j11 >> 8);
            this.pos = i11 - 8;
            bArr[i18] = (byte) j11;
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeGroup(int i11, Object obj, J j11) throws IOException {
            writeTag(i11, 4);
            j11.writeTo(obj, this);
            writeTag(i11, 3);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeInt32(int i11) {
            if (i11 >= 0) {
                writeVarint32(i11);
            } else {
                writeVarint64(i11);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt32(int i11) {
            writeVarint32(CodedOutputStream.encodeZigZag32(i11));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt64(long j11) {
            writeVarint64(CodedOutputStream.encodeZigZag64(j11));
        }

        @Override // com.google.protobuf.AbstractC5953d
        public void write(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (spaceLeft() < remaining) {
                nextBuffer(remaining);
            }
            int i11 = this.pos - remaining;
            this.pos = i11;
            byteBuffer.get(this.buffer, i11 + 1, remaining);
        }

        @Override // com.google.protobuf.AbstractC5953d
        public void writeLazy(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (spaceLeft() < remaining) {
                this.totalDoneBytes += remaining;
                this.buffers.addFirst(AllocatedBuffer.wrap(byteBuffer));
                nextBuffer();
            }
            int i11 = this.pos - remaining;
            this.pos = i11;
            byteBuffer.get(this.buffer, i11 + 1, remaining);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeMessage(int i11, Object obj, J j11) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            j11.writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i11, 2);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeString(String str) {
            int i11;
            int i12;
            int i13;
            char charAt;
            requireSpace(str.length());
            int length = str.length() - 1;
            this.pos -= length;
            while (length >= 0 && (charAt = str.charAt(length)) < 128) {
                this.buffer[this.pos + length] = (byte) charAt;
                length--;
            }
            if (length == -1) {
                this.pos--;
                return;
            }
            this.pos += length;
            while (length >= 0) {
                char charAt2 = str.charAt(length);
                if (charAt2 < 128 && (i13 = this.pos) > this.offsetMinusOne) {
                    byte[] bArr = this.buffer;
                    this.pos = i13 - 1;
                    bArr[i13] = (byte) charAt2;
                } else if (charAt2 < 2048 && (i12 = this.pos) > this.offset) {
                    byte[] bArr2 = this.buffer;
                    int i14 = i12 - 1;
                    this.pos = i14;
                    bArr2[i12] = (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
                    this.pos = i12 - 2;
                    bArr2[i14] = (byte) ((charAt2 >>> 6) | 960);
                } else if ((charAt2 < 55296 || 57343 < charAt2) && (i11 = this.pos) > this.offset + 1) {
                    byte[] bArr3 = this.buffer;
                    int i15 = i11 - 1;
                    this.pos = i15;
                    bArr3[i11] = (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
                    int i16 = i11 - 2;
                    this.pos = i16;
                    bArr3[i15] = (byte) (((charAt2 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                    this.pos = i11 - 3;
                    bArr3[i16] = (byte) ((charAt2 >>> '\f') | 480);
                } else {
                    if (this.pos > this.offset + 2) {
                        if (length != 0) {
                            char charAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(charAt3, charAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(charAt3, charAt2);
                                byte[] bArr4 = this.buffer;
                                int i17 = this.pos;
                                int i18 = i17 - 1;
                                this.pos = i18;
                                bArr4[i17] = (byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                                int i19 = i17 - 2;
                                this.pos = i19;
                                bArr4[i18] = (byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                                int i21 = i17 - 3;
                                this.pos = i21;
                                bArr4[i19] = (byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                                this.pos = i17 - 4;
                                bArr4[i21] = (byte) ((codePoint >>> 18) | 240);
                            }
                        }
                        throw new Utf8.c(length - 1, length);
                    }
                    requireSpace(length);
                    length++;
                }
                length--;
            }
        }
    }

    private static final class UnsafeDirectWriter extends BinaryWriter {
        private ByteBuffer buffer;
        private long bufferOffset;
        private long limitMinusOne;
        private long pos;

        UnsafeDirectWriter(BufferAllocator bufferAllocator, int i11) {
            super(bufferAllocator, i11, null);
            nextBuffer();
        }

        private int bufferPos() {
            return (int) (this.pos - this.bufferOffset);
        }

        private int bytesWrittenToCurrentBuffer() {
            return (int) (this.limitMinusOne - this.pos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isSupported() {
            return UnsafeUtil.B();
        }

        private void nextBuffer() {
            nextBuffer(newDirectBuffer());
        }

        private int spaceLeft() {
            return bufferPos() + 1;
        }

        private void writeVarint32FiveBytes(int i11) {
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.E(j11, (byte) (i11 >>> 28));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.E(j12, (byte) (((i11 >>> 21) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.E(j13, (byte) (((i11 >>> 14) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.E(j14, (byte) (((i11 >>> 7) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.E(j15, (byte) ((i11 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
        }

        private void writeVarint32FourBytes(int i11) {
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.E(j11, (byte) (i11 >>> 21));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.E(j12, (byte) (((i11 >>> 14) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.E(j13, (byte) (((i11 >>> 7) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.E(j14, (byte) ((i11 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
        }

        private void writeVarint32OneByte(int i11) {
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.E(j11, (byte) i11);
        }

        private void writeVarint32ThreeBytes(int i11) {
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.E(j11, (byte) (i11 >>> 14));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.E(j12, (byte) (((i11 >>> 7) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.E(j13, (byte) ((i11 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
        }

        private void writeVarint32TwoBytes(int i11) {
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.E(j11, (byte) (i11 >>> 7));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.E(j12, (byte) ((i11 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
        }

        private void writeVarint64EightBytes(long j11) {
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.E(j12, (byte) (j11 >>> 49));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.E(j13, (byte) (((j11 >>> 42) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.E(j14, (byte) (((j11 >>> 35) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.E(j15, (byte) (((j11 >>> 28) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.E(j16, (byte) (((j11 >>> 21) & 127) | 128));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.E(j17, (byte) (((j11 >>> 14) & 127) | 128));
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.E(j18, (byte) (((j11 >>> 7) & 127) | 128));
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.E(j19, (byte) ((j11 & 127) | 128));
        }

        private void writeVarint64FiveBytes(long j11) {
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.E(j12, (byte) (j11 >>> 28));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.E(j13, (byte) (((j11 >>> 21) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.E(j14, (byte) (((j11 >>> 14) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.E(j15, (byte) (((j11 >>> 7) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.E(j16, (byte) ((j11 & 127) | 128));
        }

        private void writeVarint64FourBytes(long j11) {
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.E(j12, (byte) (j11 >>> 21));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.E(j13, (byte) (((j11 >>> 14) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.E(j14, (byte) (((j11 >>> 7) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.E(j15, (byte) ((j11 & 127) | 128));
        }

        private void writeVarint64NineBytes(long j11) {
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.E(j12, (byte) (j11 >>> 56));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.E(j13, (byte) (((j11 >>> 49) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.E(j14, (byte) (((j11 >>> 42) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.E(j15, (byte) (((j11 >>> 35) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.E(j16, (byte) (((j11 >>> 28) & 127) | 128));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.E(j17, (byte) (((j11 >>> 21) & 127) | 128));
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.E(j18, (byte) (((j11 >>> 14) & 127) | 128));
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.E(j19, (byte) (((j11 >>> 7) & 127) | 128));
            long j21 = this.pos;
            this.pos = j21 - 1;
            UnsafeUtil.E(j21, (byte) ((j11 & 127) | 128));
        }

        private void writeVarint64OneByte(long j11) {
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.E(j12, (byte) j11);
        }

        private void writeVarint64SevenBytes(long j11) {
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.E(j12, (byte) (j11 >>> 42));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.E(j13, (byte) (((j11 >>> 35) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.E(j14, (byte) (((j11 >>> 28) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.E(j15, (byte) (((j11 >>> 21) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.E(j16, (byte) (((j11 >>> 14) & 127) | 128));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.E(j17, (byte) (((j11 >>> 7) & 127) | 128));
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.E(j18, (byte) ((j11 & 127) | 128));
        }

        private void writeVarint64SixBytes(long j11) {
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.E(j12, (byte) (j11 >>> 35));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.E(j13, (byte) (((j11 >>> 28) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.E(j14, (byte) (((j11 >>> 21) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.E(j15, (byte) (((j11 >>> 14) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.E(j16, (byte) (((j11 >>> 7) & 127) | 128));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.E(j17, (byte) ((j11 & 127) | 128));
        }

        private void writeVarint64TenBytes(long j11) {
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.E(j12, (byte) (j11 >>> 63));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.E(j13, (byte) (((j11 >>> 56) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.E(j14, (byte) (((j11 >>> 49) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.E(j15, (byte) (((j11 >>> 42) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.E(j16, (byte) (((j11 >>> 35) & 127) | 128));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.E(j17, (byte) (((j11 >>> 28) & 127) | 128));
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.E(j18, (byte) (((j11 >>> 21) & 127) | 128));
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.E(j19, (byte) (((j11 >>> 14) & 127) | 128));
            long j21 = this.pos;
            this.pos = j21 - 1;
            UnsafeUtil.E(j21, (byte) (((j11 >>> 7) & 127) | 128));
            long j22 = this.pos;
            this.pos = j22 - 1;
            UnsafeUtil.E(j22, (byte) ((j11 & 127) | 128));
        }

        private void writeVarint64ThreeBytes(long j11) {
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.E(j12, (byte) (((int) j11) >>> 14));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.E(j13, (byte) (((j11 >>> 7) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.E(j14, (byte) ((j11 & 127) | 128));
        }

        private void writeVarint64TwoBytes(long j11) {
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.E(j12, (byte) (j11 >>> 7));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.E(j13, (byte) ((((int) j11) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
        }

        @Override // com.google.protobuf.BinaryWriter
        void finishCurrentBuffer() {
            if (this.buffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                this.buffer.position(bufferPos() + 1);
                this.buffer = null;
                this.pos = 0L;
                this.limitMinusOne = 0L;
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        @Override // com.google.protobuf.BinaryWriter
        void requireSpace(int i11) {
            if (spaceLeft() < i11) {
                nextBuffer(i11);
            }
        }

        @Override // com.google.protobuf.AbstractC5953d
        public void write(byte b11) {
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.E(j11, b11);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeBool(int i11, boolean z11) {
            requireSpace(6);
            write(z11 ? (byte) 1 : (byte) 0);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeBytes(int i11, ByteString byteString) {
            try {
                byteString.writeToReverse(this);
                requireSpace(10);
                writeVarint32(byteString.size());
                writeTag(i11, 2);
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        @Deprecated
        public void writeEndGroup(int i11) {
            writeTag(i11, 4);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeFixed32(int i11, int i12) {
            requireSpace(9);
            writeFixed32(i12);
            writeTag(i11, 5);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeFixed64(int i11, long j11) {
            requireSpace(13);
            writeFixed64(j11);
            writeTag(i11, 1);
        }

        @Override // com.google.protobuf.BinaryWriter
        public void writeGroup(int i11, Object obj) throws IOException {
            writeTag(i11, 4);
            H.a().d(obj, this);
            writeTag(i11, 3);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeInt32(int i11, int i12) {
            requireSpace(15);
            writeInt32(i12);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.AbstractC5953d
        public void writeLazy(byte[] bArr, int i11, int i12) {
            if (spaceLeft() < i12) {
                this.totalDoneBytes += i12;
                this.buffers.addFirst(AllocatedBuffer.wrap(bArr, i11, i12));
                nextBuffer();
            } else {
                this.pos -= i12;
                this.buffer.position(bufferPos() + 1);
                this.buffer.put(bArr, i11, i12);
            }
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeMessage(int i11, Object obj) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            H.a().d(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i11, 2);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeSInt32(int i11, int i12) {
            requireSpace(10);
            writeSInt32(i12);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeSInt64(int i11, long j11) {
            requireSpace(15);
            writeSInt64(j11);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        @Deprecated
        public void writeStartGroup(int i11) {
            writeTag(i11, 3);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeString(int i11, String str) {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(str);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i11, 2);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeTag(int i11, int i12) {
            writeVarint32((i11 << 3) | i12);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeUInt32(int i11, int i12) {
            requireSpace(10);
            writeVarint32(i12);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeUInt64(int i11, long j11) {
            requireSpace(15);
            writeVarint64(j11);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint32(int i11) {
            if ((i11 & (-128)) == 0) {
                writeVarint32OneByte(i11);
                return;
            }
            if ((i11 & (-16384)) == 0) {
                writeVarint32TwoBytes(i11);
                return;
            }
            if (((-2097152) & i11) == 0) {
                writeVarint32ThreeBytes(i11);
            } else if (((-268435456) & i11) == 0) {
                writeVarint32FourBytes(i11);
            } else {
                writeVarint32FiveBytes(i11);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint64(long j11) {
            switch (BinaryWriter.computeUInt64SizeNoTag(j11)) {
                case 1:
                    writeVarint64OneByte(j11);
                    break;
                case 2:
                    writeVarint64TwoBytes(j11);
                    break;
                case 3:
                    writeVarint64ThreeBytes(j11);
                    break;
                case 4:
                    writeVarint64FourBytes(j11);
                    break;
                case 5:
                    writeVarint64FiveBytes(j11);
                    break;
                case 6:
                    writeVarint64SixBytes(j11);
                    break;
                case 7:
                    writeVarint64SevenBytes(j11);
                    break;
                case 8:
                    writeVarint64EightBytes(j11);
                    break;
                case 9:
                    writeVarint64NineBytes(j11);
                    break;
                case 10:
                    writeVarint64TenBytes(j11);
                    break;
            }
        }

        private void nextBuffer(int i11) {
            nextBuffer(newDirectBuffer(i11));
        }

        @Override // com.google.protobuf.AbstractC5953d
        public void write(byte[] bArr, int i11, int i12) {
            if (spaceLeft() < i12) {
                nextBuffer(i12);
            }
            this.pos -= i12;
            this.buffer.position(bufferPos() + 1);
            this.buffer.put(bArr, i11, i12);
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.hasNioBuffer()) {
                ByteBuffer nioBuffer = allocatedBuffer.nioBuffer();
                if (nioBuffer.isDirect()) {
                    finishCurrentBuffer();
                    this.buffers.addFirst(allocatedBuffer);
                    this.buffer = nioBuffer;
                    nioBuffer.limit(nioBuffer.capacity());
                    this.buffer.position(0);
                    long j11 = UnsafeUtil.j(this.buffer);
                    this.bufferOffset = j11;
                    long limit = j11 + (this.buffer.limit() - 1);
                    this.limitMinusOne = limit;
                    this.pos = limit;
                    return;
                }
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            throw new RuntimeException("Allocated buffer does not have NIO buffer");
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeBool(boolean z11) {
            write(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed32(int i11) {
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.E(j11, (byte) (i11 >> 24));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.E(j12, (byte) (i11 >> 16));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.E(j13, (byte) (i11 >> 8));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.E(j14, (byte) i11);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed64(long j11) {
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.E(j12, (byte) (j11 >> 56));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.E(j13, (byte) (j11 >> 48));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.E(j14, (byte) (j11 >> 40));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.E(j15, (byte) (j11 >> 32));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.E(j16, (byte) (j11 >> 24));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.E(j17, (byte) (j11 >> 16));
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.E(j18, (byte) (j11 >> 8));
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.E(j19, (byte) j11);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeGroup(int i11, Object obj, J j11) throws IOException {
            writeTag(i11, 4);
            j11.writeTo(obj, this);
            writeTag(i11, 3);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeInt32(int i11) {
            if (i11 >= 0) {
                writeVarint32(i11);
            } else {
                writeVarint64(i11);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt32(int i11) {
            writeVarint32(CodedOutputStream.encodeZigZag32(i11));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt64(long j11) {
            writeVarint64(CodedOutputStream.encodeZigZag64(j11));
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeMessage(int i11, Object obj, J j11) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            j11.writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i11, 2);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeString(String str) {
            char charAt;
            requireSpace(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length < 0 || (charAt = str.charAt(length)) >= 128) {
                    break;
                }
                long j11 = this.pos;
                this.pos = j11 - 1;
                UnsafeUtil.E(j11, (byte) charAt);
            }
            if (length == -1) {
                return;
            }
            while (length >= 0) {
                char charAt2 = str.charAt(length);
                if (charAt2 < 128) {
                    long j12 = this.pos;
                    if (j12 >= this.bufferOffset) {
                        this.pos = j12 - 1;
                        UnsafeUtil.E(j12, (byte) charAt2);
                        length--;
                    }
                }
                if (charAt2 < 2048) {
                    long j13 = this.pos;
                    if (j13 > this.bufferOffset) {
                        this.pos = j13 - 1;
                        UnsafeUtil.E(j13, (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                        long j14 = this.pos;
                        this.pos = j14 - 1;
                        UnsafeUtil.E(j14, (byte) ((charAt2 >>> 6) | 960));
                        length--;
                    }
                }
                if (charAt2 < 55296 || 57343 < charAt2) {
                    long j15 = this.pos;
                    if (j15 > this.bufferOffset + 1) {
                        this.pos = j15 - 1;
                        UnsafeUtil.E(j15, (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                        long j16 = this.pos;
                        this.pos = j16 - 1;
                        UnsafeUtil.E(j16, (byte) (((charAt2 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                        long j17 = this.pos;
                        this.pos = j17 - 1;
                        UnsafeUtil.E(j17, (byte) ((charAt2 >>> '\f') | 480));
                        length--;
                    }
                }
                if (this.pos > this.bufferOffset + 2) {
                    if (length != 0) {
                        char charAt3 = str.charAt(length - 1);
                        if (Character.isSurrogatePair(charAt3, charAt2)) {
                            length--;
                            int codePoint = Character.toCodePoint(charAt3, charAt2);
                            long j18 = this.pos;
                            this.pos = j18 - 1;
                            UnsafeUtil.E(j18, (byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                            long j19 = this.pos;
                            this.pos = j19 - 1;
                            UnsafeUtil.E(j19, (byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                            long j21 = this.pos;
                            this.pos = j21 - 1;
                            UnsafeUtil.E(j21, (byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                            long j22 = this.pos;
                            this.pos = j22 - 1;
                            UnsafeUtil.E(j22, (byte) ((codePoint >>> 18) | 240));
                        }
                    }
                    throw new Utf8.c(length - 1, length);
                }
                requireSpace(length);
                length++;
                length--;
            }
        }

        @Override // com.google.protobuf.AbstractC5953d
        public void write(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (spaceLeft() < remaining) {
                nextBuffer(remaining);
            }
            this.pos -= remaining;
            this.buffer.position(bufferPos() + 1);
            this.buffer.put(byteBuffer);
        }

        @Override // com.google.protobuf.AbstractC5953d
        public void writeLazy(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (spaceLeft() < remaining) {
                this.totalDoneBytes += remaining;
                this.buffers.addFirst(AllocatedBuffer.wrap(byteBuffer));
                nextBuffer();
            } else {
                this.pos -= remaining;
                this.buffer.position(bufferPos() + 1);
                this.buffer.put(byteBuffer);
            }
        }
    }

    private static final class UnsafeHeapWriter extends BinaryWriter {
        private AllocatedBuffer allocatedBuffer;
        private byte[] buffer;
        private long limit;
        private long limitMinusOne;
        private long offset;
        private long offsetMinusOne;
        private long pos;

        UnsafeHeapWriter(BufferAllocator bufferAllocator, int i11) {
            super(bufferAllocator, i11, null);
            nextBuffer();
        }

        private int arrayPos() {
            return (int) this.pos;
        }

        static boolean isSupported() {
            return UnsafeUtil.A();
        }

        private void nextBuffer() {
            nextBuffer(newHeapBuffer());
        }

        private void writeVarint32FiveBytes(int i11) {
            byte[] bArr = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.F(bArr, j11, (byte) (i11 >>> 28));
            byte[] bArr2 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.F(bArr2, j12, (byte) (((i11 >>> 21) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
            byte[] bArr3 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.F(bArr3, j13, (byte) (((i11 >>> 14) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
            byte[] bArr4 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.F(bArr4, j14, (byte) (((i11 >>> 7) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
            byte[] bArr5 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.F(bArr5, j15, (byte) ((i11 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
        }

        private void writeVarint32FourBytes(int i11) {
            byte[] bArr = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.F(bArr, j11, (byte) (i11 >>> 21));
            byte[] bArr2 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.F(bArr2, j12, (byte) (((i11 >>> 14) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
            byte[] bArr3 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.F(bArr3, j13, (byte) (((i11 >>> 7) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
            byte[] bArr4 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.F(bArr4, j14, (byte) ((i11 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
        }

        private void writeVarint32OneByte(int i11) {
            byte[] bArr = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.F(bArr, j11, (byte) i11);
        }

        private void writeVarint32ThreeBytes(int i11) {
            byte[] bArr = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.F(bArr, j11, (byte) (i11 >>> 14));
            byte[] bArr2 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.F(bArr2, j12, (byte) (((i11 >>> 7) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
            byte[] bArr3 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.F(bArr3, j13, (byte) ((i11 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
        }

        private void writeVarint32TwoBytes(int i11) {
            byte[] bArr = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.F(bArr, j11, (byte) (i11 >>> 7));
            byte[] bArr2 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.F(bArr2, j12, (byte) ((i11 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
        }

        private void writeVarint64EightBytes(long j11) {
            byte[] bArr = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.F(bArr, j12, (byte) (j11 >>> 49));
            byte[] bArr2 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.F(bArr2, j13, (byte) (((j11 >>> 42) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.F(bArr3, j14, (byte) (((j11 >>> 35) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.F(bArr4, j15, (byte) (((j11 >>> 28) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.F(bArr5, j16, (byte) (((j11 >>> 21) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.F(bArr6, j17, (byte) (((j11 >>> 14) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.F(bArr7, j18, (byte) (((j11 >>> 7) & 127) | 128));
            byte[] bArr8 = this.buffer;
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.F(bArr8, j19, (byte) ((j11 & 127) | 128));
        }

        private void writeVarint64FiveBytes(long j11) {
            byte[] bArr = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.F(bArr, j12, (byte) (j11 >>> 28));
            byte[] bArr2 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.F(bArr2, j13, (byte) (((j11 >>> 21) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.F(bArr3, j14, (byte) (((j11 >>> 14) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.F(bArr4, j15, (byte) (((j11 >>> 7) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.F(bArr5, j16, (byte) ((j11 & 127) | 128));
        }

        private void writeVarint64FourBytes(long j11) {
            byte[] bArr = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.F(bArr, j12, (byte) (j11 >>> 21));
            byte[] bArr2 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.F(bArr2, j13, (byte) (((j11 >>> 14) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.F(bArr3, j14, (byte) (((j11 >>> 7) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.F(bArr4, j15, (byte) ((j11 & 127) | 128));
        }

        private void writeVarint64NineBytes(long j11) {
            byte[] bArr = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.F(bArr, j12, (byte) (j11 >>> 56));
            byte[] bArr2 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.F(bArr2, j13, (byte) (((j11 >>> 49) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.F(bArr3, j14, (byte) (((j11 >>> 42) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.F(bArr4, j15, (byte) (((j11 >>> 35) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.F(bArr5, j16, (byte) (((j11 >>> 28) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.F(bArr6, j17, (byte) (((j11 >>> 21) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.F(bArr7, j18, (byte) (((j11 >>> 14) & 127) | 128));
            byte[] bArr8 = this.buffer;
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.F(bArr8, j19, (byte) (((j11 >>> 7) & 127) | 128));
            byte[] bArr9 = this.buffer;
            long j21 = this.pos;
            this.pos = j21 - 1;
            UnsafeUtil.F(bArr9, j21, (byte) ((j11 & 127) | 128));
        }

        private void writeVarint64OneByte(long j11) {
            byte[] bArr = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.F(bArr, j12, (byte) j11);
        }

        private void writeVarint64SevenBytes(long j11) {
            byte[] bArr = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.F(bArr, j12, (byte) (j11 >>> 42));
            byte[] bArr2 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.F(bArr2, j13, (byte) (((j11 >>> 35) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.F(bArr3, j14, (byte) (((j11 >>> 28) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.F(bArr4, j15, (byte) (((j11 >>> 21) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.F(bArr5, j16, (byte) (((j11 >>> 14) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.F(bArr6, j17, (byte) (((j11 >>> 7) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.F(bArr7, j18, (byte) ((j11 & 127) | 128));
        }

        private void writeVarint64SixBytes(long j11) {
            byte[] bArr = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.F(bArr, j12, (byte) (j11 >>> 35));
            byte[] bArr2 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.F(bArr2, j13, (byte) (((j11 >>> 28) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.F(bArr3, j14, (byte) (((j11 >>> 21) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.F(bArr4, j15, (byte) (((j11 >>> 14) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.F(bArr5, j16, (byte) (((j11 >>> 7) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.F(bArr6, j17, (byte) ((j11 & 127) | 128));
        }

        private void writeVarint64TenBytes(long j11) {
            byte[] bArr = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.F(bArr, j12, (byte) (j11 >>> 63));
            byte[] bArr2 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.F(bArr2, j13, (byte) (((j11 >>> 56) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.F(bArr3, j14, (byte) (((j11 >>> 49) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.F(bArr4, j15, (byte) (((j11 >>> 42) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.F(bArr5, j16, (byte) (((j11 >>> 35) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.F(bArr6, j17, (byte) (((j11 >>> 28) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.F(bArr7, j18, (byte) (((j11 >>> 21) & 127) | 128));
            byte[] bArr8 = this.buffer;
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.F(bArr8, j19, (byte) (((j11 >>> 14) & 127) | 128));
            byte[] bArr9 = this.buffer;
            long j21 = this.pos;
            this.pos = j21 - 1;
            UnsafeUtil.F(bArr9, j21, (byte) (((j11 >>> 7) & 127) | 128));
            byte[] bArr10 = this.buffer;
            long j22 = this.pos;
            this.pos = j22 - 1;
            UnsafeUtil.F(bArr10, j22, (byte) ((j11 & 127) | 128));
        }

        private void writeVarint64ThreeBytes(long j11) {
            byte[] bArr = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.F(bArr, j12, (byte) (((int) j11) >>> 14));
            byte[] bArr2 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.F(bArr2, j13, (byte) (((j11 >>> 7) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.F(bArr3, j14, (byte) ((j11 & 127) | 128));
        }

        private void writeVarint64TwoBytes(long j11) {
            byte[] bArr = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.F(bArr, j12, (byte) (j11 >>> 7));
            byte[] bArr2 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.F(bArr2, j13, (byte) ((((int) j11) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
        }

        int bytesWrittenToCurrentBuffer() {
            return (int) (this.limitMinusOne - this.pos);
        }

        @Override // com.google.protobuf.BinaryWriter
        void finishCurrentBuffer() {
            if (this.allocatedBuffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                this.allocatedBuffer.position((arrayPos() - this.allocatedBuffer.arrayOffset()) + 1);
                this.allocatedBuffer = null;
                this.pos = 0L;
                this.limitMinusOne = 0L;
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        @Override // com.google.protobuf.BinaryWriter
        void requireSpace(int i11) {
            if (spaceLeft() < i11) {
                nextBuffer(i11);
            }
        }

        int spaceLeft() {
            return (int) (this.pos - this.offsetMinusOne);
        }

        @Override // com.google.protobuf.AbstractC5953d
        public void write(byte b11) {
            byte[] bArr = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.F(bArr, j11, b11);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeBool(int i11, boolean z11) {
            requireSpace(6);
            write(z11 ? (byte) 1 : (byte) 0);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeBytes(int i11, ByteString byteString) {
            try {
                byteString.writeToReverse(this);
                requireSpace(10);
                writeVarint32(byteString.size());
                writeTag(i11, 2);
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeEndGroup(int i11) {
            writeTag(i11, 4);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeFixed32(int i11, int i12) {
            requireSpace(9);
            writeFixed32(i12);
            writeTag(i11, 5);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeFixed64(int i11, long j11) {
            requireSpace(13);
            writeFixed64(j11);
            writeTag(i11, 1);
        }

        @Override // com.google.protobuf.BinaryWriter
        public void writeGroup(int i11, Object obj) throws IOException {
            writeTag(i11, 4);
            H.a().d(obj, this);
            writeTag(i11, 3);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeInt32(int i11, int i12) {
            requireSpace(15);
            writeInt32(i12);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.AbstractC5953d
        public void writeLazy(byte[] bArr, int i11, int i12) {
            if (i11 < 0 || i11 + i12 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
            }
            if (spaceLeft() >= i12) {
                this.pos -= i12;
                System.arraycopy(bArr, i11, this.buffer, arrayPos() + 1, i12);
            } else {
                this.totalDoneBytes += i12;
                this.buffers.addFirst(AllocatedBuffer.wrap(bArr, i11, i12));
                nextBuffer();
            }
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeMessage(int i11, Object obj) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            H.a().d(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i11, 2);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeSInt32(int i11, int i12) {
            requireSpace(10);
            writeSInt32(i12);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeSInt64(int i11, long j11) {
            requireSpace(15);
            writeSInt64(j11);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeStartGroup(int i11) {
            writeTag(i11, 3);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeString(int i11, String str) {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(str);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i11, 2);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeTag(int i11, int i12) {
            writeVarint32((i11 << 3) | i12);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeUInt32(int i11, int i12) {
            requireSpace(10);
            writeVarint32(i12);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeUInt64(int i11, long j11) {
            requireSpace(15);
            writeVarint64(j11);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint32(int i11) {
            if ((i11 & (-128)) == 0) {
                writeVarint32OneByte(i11);
                return;
            }
            if ((i11 & (-16384)) == 0) {
                writeVarint32TwoBytes(i11);
                return;
            }
            if (((-2097152) & i11) == 0) {
                writeVarint32ThreeBytes(i11);
            } else if (((-268435456) & i11) == 0) {
                writeVarint32FourBytes(i11);
            } else {
                writeVarint32FiveBytes(i11);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint64(long j11) {
            switch (BinaryWriter.computeUInt64SizeNoTag(j11)) {
                case 1:
                    writeVarint64OneByte(j11);
                    break;
                case 2:
                    writeVarint64TwoBytes(j11);
                    break;
                case 3:
                    writeVarint64ThreeBytes(j11);
                    break;
                case 4:
                    writeVarint64FourBytes(j11);
                    break;
                case 5:
                    writeVarint64FiveBytes(j11);
                    break;
                case 6:
                    writeVarint64SixBytes(j11);
                    break;
                case 7:
                    writeVarint64SevenBytes(j11);
                    break;
                case 8:
                    writeVarint64EightBytes(j11);
                    break;
                case 9:
                    writeVarint64NineBytes(j11);
                    break;
                case 10:
                    writeVarint64TenBytes(j11);
                    break;
            }
        }

        private void nextBuffer(int i11) {
            nextBuffer(newHeapBuffer(i11));
        }

        @Override // com.google.protobuf.AbstractC5953d
        public void write(byte[] bArr, int i11, int i12) {
            if (i11 < 0 || i11 + i12 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
            }
            requireSpace(i12);
            this.pos -= i12;
            System.arraycopy(bArr, i11, this.buffer, arrayPos() + 1, i12);
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.hasArray()) {
                finishCurrentBuffer();
                this.buffers.addFirst(allocatedBuffer);
                this.allocatedBuffer = allocatedBuffer;
                this.buffer = allocatedBuffer.array();
                long arrayOffset = allocatedBuffer.arrayOffset();
                this.limit = allocatedBuffer.limit() + arrayOffset;
                long position = arrayOffset + allocatedBuffer.position();
                this.offset = position;
                this.offsetMinusOne = position - 1;
                long j11 = this.limit - 1;
                this.limitMinusOne = j11;
                this.pos = j11;
                return;
            }
            throw new RuntimeException("Allocator returned non-heap buffer");
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeBool(boolean z11) {
            write(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed32(int i11) {
            byte[] bArr = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.F(bArr, j11, (byte) (i11 >> 24));
            byte[] bArr2 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.F(bArr2, j12, (byte) (i11 >> 16));
            byte[] bArr3 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.F(bArr3, j13, (byte) (i11 >> 8));
            byte[] bArr4 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.F(bArr4, j14, (byte) i11);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed64(long j11) {
            byte[] bArr = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.F(bArr, j12, (byte) (j11 >> 56));
            byte[] bArr2 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.F(bArr2, j13, (byte) (j11 >> 48));
            byte[] bArr3 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.F(bArr3, j14, (byte) (j11 >> 40));
            byte[] bArr4 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.F(bArr4, j15, (byte) (j11 >> 32));
            byte[] bArr5 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.F(bArr5, j16, (byte) (j11 >> 24));
            byte[] bArr6 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.F(bArr6, j17, (byte) (j11 >> 16));
            byte[] bArr7 = this.buffer;
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.F(bArr7, j18, (byte) (j11 >> 8));
            byte[] bArr8 = this.buffer;
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.F(bArr8, j19, (byte) j11);
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeGroup(int i11, Object obj, J j11) throws IOException {
            writeTag(i11, 4);
            j11.writeTo(obj, this);
            writeTag(i11, 3);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeInt32(int i11) {
            if (i11 >= 0) {
                writeVarint32(i11);
            } else {
                writeVarint64(i11);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt32(int i11) {
            writeVarint32(CodedOutputStream.encodeZigZag32(i11));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt64(long j11) {
            writeVarint64(CodedOutputStream.encodeZigZag64(j11));
        }

        @Override // com.google.protobuf.BinaryWriter, com.google.protobuf.T
        public void writeMessage(int i11, Object obj, J j11) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            j11.writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i11, 2);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeString(String str) {
            char charAt;
            requireSpace(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length < 0 || (charAt = str.charAt(length)) >= 128) {
                    break;
                }
                byte[] bArr = this.buffer;
                long j11 = this.pos;
                this.pos = j11 - 1;
                UnsafeUtil.F(bArr, j11, (byte) charAt);
            }
            if (length == -1) {
                return;
            }
            while (length >= 0) {
                char charAt2 = str.charAt(length);
                if (charAt2 < 128) {
                    long j12 = this.pos;
                    if (j12 > this.offsetMinusOne) {
                        byte[] bArr2 = this.buffer;
                        this.pos = j12 - 1;
                        UnsafeUtil.F(bArr2, j12, (byte) charAt2);
                        length--;
                    }
                }
                if (charAt2 < 2048) {
                    long j13 = this.pos;
                    if (j13 > this.offset) {
                        byte[] bArr3 = this.buffer;
                        this.pos = j13 - 1;
                        UnsafeUtil.F(bArr3, j13, (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                        byte[] bArr4 = this.buffer;
                        long j14 = this.pos;
                        this.pos = j14 - 1;
                        UnsafeUtil.F(bArr4, j14, (byte) ((charAt2 >>> 6) | 960));
                        length--;
                    }
                }
                if (charAt2 < 55296 || 57343 < charAt2) {
                    long j15 = this.pos;
                    if (j15 > this.offset + 1) {
                        byte[] bArr5 = this.buffer;
                        this.pos = j15 - 1;
                        UnsafeUtil.F(bArr5, j15, (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                        byte[] bArr6 = this.buffer;
                        long j16 = this.pos;
                        this.pos = j16 - 1;
                        UnsafeUtil.F(bArr6, j16, (byte) (((charAt2 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                        byte[] bArr7 = this.buffer;
                        long j17 = this.pos;
                        this.pos = j17 - 1;
                        UnsafeUtil.F(bArr7, j17, (byte) ((charAt2 >>> '\f') | 480));
                        length--;
                    }
                }
                if (this.pos > this.offset + 2) {
                    if (length != 0) {
                        char charAt3 = str.charAt(length - 1);
                        if (Character.isSurrogatePair(charAt3, charAt2)) {
                            length--;
                            int codePoint = Character.toCodePoint(charAt3, charAt2);
                            byte[] bArr8 = this.buffer;
                            long j18 = this.pos;
                            this.pos = j18 - 1;
                            UnsafeUtil.F(bArr8, j18, (byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                            byte[] bArr9 = this.buffer;
                            long j19 = this.pos;
                            this.pos = j19 - 1;
                            UnsafeUtil.F(bArr9, j19, (byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                            byte[] bArr10 = this.buffer;
                            long j21 = this.pos;
                            this.pos = j21 - 1;
                            UnsafeUtil.F(bArr10, j21, (byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                            byte[] bArr11 = this.buffer;
                            long j22 = this.pos;
                            this.pos = j22 - 1;
                            UnsafeUtil.F(bArr11, j22, (byte) ((codePoint >>> 18) | 240));
                        }
                    }
                    throw new Utf8.c(length - 1, length);
                }
                requireSpace(length);
                length++;
                length--;
            }
        }

        @Override // com.google.protobuf.AbstractC5953d
        public void write(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            requireSpace(remaining);
            this.pos -= remaining;
            byteBuffer.get(this.buffer, arrayPos() + 1, remaining);
        }

        @Override // com.google.protobuf.AbstractC5953d
        public void writeLazy(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (spaceLeft() < remaining) {
                this.totalDoneBytes += remaining;
                this.buffers.addFirst(AllocatedBuffer.wrap(byteBuffer));
                nextBuffer();
            }
            this.pos -= remaining;
            byteBuffer.get(this.buffer, arrayPos() + 1, remaining);
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f60092a;

        static {
            int[] iArr = new int[WireFormat$FieldType.values().length];
            f60092a = iArr;
            try {
                iArr[WireFormat$FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60092a[WireFormat$FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60092a[WireFormat$FieldType.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60092a[WireFormat$FieldType.INT32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60092a[WireFormat$FieldType.INT64.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f60092a[WireFormat$FieldType.SFIXED32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f60092a[WireFormat$FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f60092a[WireFormat$FieldType.SINT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f60092a[WireFormat$FieldType.SINT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f60092a[WireFormat$FieldType.STRING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f60092a[WireFormat$FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f60092a[WireFormat$FieldType.UINT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f60092a[WireFormat$FieldType.FLOAT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f60092a[WireFormat$FieldType.DOUBLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f60092a[WireFormat$FieldType.MESSAGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f60092a[WireFormat$FieldType.BYTES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f60092a[WireFormat$FieldType.ENUM.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* synthetic */ BinaryWriter(BufferAllocator bufferAllocator, int i11, a aVar) {
        this(bufferAllocator, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte computeUInt64SizeNoTag(long j11) {
        byte b11;
        if (((-128) & j11) == 0) {
            return (byte) 1;
        }
        if (j11 < 0) {
            return (byte) 10;
        }
        if (((-34359738368L) & j11) != 0) {
            b11 = (byte) 6;
            j11 >>>= 28;
        } else {
            b11 = 2;
        }
        if (((-2097152) & j11) != 0) {
            b11 = (byte) (b11 + 2);
            j11 >>>= 14;
        }
        return (j11 & (-16384)) != 0 ? (byte) (b11 + 1) : b11;
    }

    static boolean isUnsafeDirectSupported() {
        return UnsafeDirectWriter.isSupported();
    }

    static boolean isUnsafeHeapSupported() {
        return UnsafeHeapWriter.isSupported();
    }

    public static BinaryWriter newDirectInstance(BufferAllocator bufferAllocator) {
        return newDirectInstance(bufferAllocator, 4096);
    }

    public static BinaryWriter newHeapInstance(BufferAllocator bufferAllocator) {
        return newHeapInstance(bufferAllocator, 4096);
    }

    static BinaryWriter newSafeDirectInstance(BufferAllocator bufferAllocator, int i11) {
        return new SafeDirectWriter(bufferAllocator, i11);
    }

    static BinaryWriter newSafeHeapInstance(BufferAllocator bufferAllocator, int i11) {
        return new SafeHeapWriter(bufferAllocator, i11);
    }

    static BinaryWriter newUnsafeDirectInstance(BufferAllocator bufferAllocator, int i11) {
        if (isUnsafeDirectSupported()) {
            return new UnsafeDirectWriter(bufferAllocator, i11);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    static BinaryWriter newUnsafeHeapInstance(BufferAllocator bufferAllocator, int i11) {
        if (isUnsafeHeapSupported()) {
            return new UnsafeHeapWriter(bufferAllocator, i11);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    private void writeBoolList_Internal(int i11, List<Boolean> list, boolean z11) throws IOException {
        if (!z11) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeBool(i11, list.get(size).booleanValue());
            }
            return;
        }
        requireSpace(list.size() + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeBool(list.get(size2).booleanValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i11, 2);
    }

    private void writeDoubleList_Internal(int i11, List<Double> list, boolean z11) throws IOException {
        if (!z11) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeDouble(i11, list.get(size).doubleValue());
            }
            return;
        }
        requireSpace((list.size() * 8) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed64(Double.doubleToRawLongBits(list.get(size2).doubleValue()));
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i11, 2);
    }

    private void writeFixed32List_Internal(int i11, List<Integer> list, boolean z11) throws IOException {
        if (!z11) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed32(i11, list.get(size).intValue());
            }
            return;
        }
        requireSpace((list.size() * 4) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed32(list.get(size2).intValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i11, 2);
    }

    private void writeFixed64List_Internal(int i11, List<Long> list, boolean z11) throws IOException {
        if (!z11) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed64(i11, list.get(size).longValue());
            }
            return;
        }
        requireSpace((list.size() * 8) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed64(list.get(size2).longValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i11, 2);
    }

    private void writeFloatList_Internal(int i11, List<Float> list, boolean z11) throws IOException {
        if (!z11) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFloat(i11, list.get(size).floatValue());
            }
            return;
        }
        requireSpace((list.size() * 4) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed32(Float.floatToRawIntBits(list.get(size2).floatValue()));
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i11, 2);
    }

    private void writeInt32List_Internal(int i11, List<Integer> list, boolean z11) throws IOException {
        if (!z11) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeInt32(i11, list.get(size).intValue());
            }
            return;
        }
        requireSpace((list.size() * 10) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeInt32(list.get(size2).intValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i11, 2);
    }

    private void writeLazyString(int i11, Object obj) throws IOException {
        if (obj instanceof String) {
            writeString(i11, (String) obj);
        } else {
            writeBytes(i11, (ByteString) obj);
        }
    }

    static final void writeMapEntryField(T t2, int i11, WireFormat$FieldType wireFormat$FieldType, Object obj) throws IOException {
        switch (a.f60092a[wireFormat$FieldType.ordinal()]) {
            case 1:
                t2.writeBool(i11, ((Boolean) obj).booleanValue());
                return;
            case 2:
                t2.writeFixed32(i11, ((Integer) obj).intValue());
                return;
            case 3:
                t2.writeFixed64(i11, ((Long) obj).longValue());
                return;
            case 4:
                t2.writeInt32(i11, ((Integer) obj).intValue());
                return;
            case 5:
                t2.writeInt64(i11, ((Long) obj).longValue());
                return;
            case 6:
                t2.writeSFixed32(i11, ((Integer) obj).intValue());
                return;
            case 7:
                t2.writeSFixed64(i11, ((Long) obj).longValue());
                return;
            case 8:
                t2.writeSInt32(i11, ((Integer) obj).intValue());
                return;
            case 9:
                t2.writeSInt64(i11, ((Long) obj).longValue());
                return;
            case 10:
                t2.writeString(i11, (String) obj);
                return;
            case 11:
                t2.writeUInt32(i11, ((Integer) obj).intValue());
                return;
            case 12:
                t2.writeUInt64(i11, ((Long) obj).longValue());
                return;
            case 13:
                t2.writeFloat(i11, ((Float) obj).floatValue());
                return;
            case 14:
                t2.writeDouble(i11, ((Double) obj).doubleValue());
                return;
            case 15:
                t2.writeMessage(i11, obj);
                return;
            case 16:
                t2.writeBytes(i11, (ByteString) obj);
                return;
            case 17:
                if (obj instanceof Internal.a) {
                    t2.writeEnum(i11, ((Internal.a) obj).getNumber());
                    return;
                } else {
                    if (!(obj instanceof Integer)) {
                        throw new IllegalArgumentException("Unexpected type for enum in map.");
                    }
                    t2.writeEnum(i11, ((Integer) obj).intValue());
                    return;
                }
            default:
                throw new IllegalArgumentException("Unsupported map value type for: " + wireFormat$FieldType);
        }
    }

    private void writeSInt32List_Internal(int i11, List<Integer> list, boolean z11) throws IOException {
        if (!z11) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeSInt32(i11, list.get(size).intValue());
            }
            return;
        }
        requireSpace((list.size() * 5) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeSInt32(list.get(size2).intValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i11, 2);
    }

    private void writeSInt64List_Internal(int i11, List<Long> list, boolean z11) throws IOException {
        if (!z11) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeSInt64(i11, list.get(size).longValue());
            }
            return;
        }
        requireSpace((list.size() * 10) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeSInt64(list.get(size2).longValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i11, 2);
    }

    private void writeUInt32List_Internal(int i11, List<Integer> list, boolean z11) throws IOException {
        if (!z11) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeUInt32(i11, list.get(size).intValue());
            }
            return;
        }
        requireSpace((list.size() * 5) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeVarint32(list.get(size2).intValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i11, 2);
    }

    private void writeUInt64List_Internal(int i11, List<Long> list, boolean z11) throws IOException {
        if (!z11) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeUInt64(i11, list.get(size).longValue());
            }
            return;
        }
        requireSpace((list.size() * 10) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeVarint64(list.get(size2).longValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i11, 2);
    }

    public final Queue<AllocatedBuffer> complete() {
        finishCurrentBuffer();
        return this.buffers;
    }

    @Override // com.google.protobuf.T
    public final T.a fieldOrder() {
        return T.a.DESCENDING;
    }

    abstract void finishCurrentBuffer();

    public abstract int getTotalBytesWritten();

    final AllocatedBuffer newDirectBuffer() {
        return this.alloc.allocateDirectBuffer(this.chunkSize);
    }

    final AllocatedBuffer newHeapBuffer() {
        return this.alloc.allocateHeapBuffer(this.chunkSize);
    }

    abstract void requireSpace(int i11);

    @Override // com.google.protobuf.T
    public abstract /* synthetic */ void writeBool(int i11, boolean z11) throws IOException;

    abstract void writeBool(boolean z11);

    @Override // com.google.protobuf.T
    public final void writeBoolList(int i11, List<Boolean> list, boolean z11) throws IOException {
        if (list instanceof BooleanArrayList) {
            writeBoolList_Internal(i11, (BooleanArrayList) list, z11);
        } else {
            writeBoolList_Internal(i11, list, z11);
        }
    }

    @Override // com.google.protobuf.T
    public abstract /* synthetic */ void writeBytes(int i11, ByteString byteString) throws IOException;

    @Override // com.google.protobuf.T
    public final void writeBytesList(int i11, List<ByteString> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeBytes(i11, list.get(size));
        }
    }

    @Override // com.google.protobuf.T
    public final void writeDouble(int i11, double d11) throws IOException {
        writeFixed64(i11, Double.doubleToRawLongBits(d11));
    }

    @Override // com.google.protobuf.T
    public final void writeDoubleList(int i11, List<Double> list, boolean z11) throws IOException {
        if (list instanceof DoubleArrayList) {
            writeDoubleList_Internal(i11, (DoubleArrayList) list, z11);
        } else {
            writeDoubleList_Internal(i11, list, z11);
        }
    }

    @Override // com.google.protobuf.T
    @Deprecated
    public abstract /* synthetic */ void writeEndGroup(int i11) throws IOException;

    @Override // com.google.protobuf.T
    public final void writeEnum(int i11, int i12) throws IOException {
        writeInt32(i11, i12);
    }

    @Override // com.google.protobuf.T
    public final void writeEnumList(int i11, List<Integer> list, boolean z11) throws IOException {
        writeInt32List(i11, list, z11);
    }

    abstract void writeFixed32(int i11);

    @Override // com.google.protobuf.T
    public abstract /* synthetic */ void writeFixed32(int i11, int i12) throws IOException;

    @Override // com.google.protobuf.T
    public final void writeFixed32List(int i11, List<Integer> list, boolean z11) throws IOException {
        if (list instanceof IntArrayList) {
            writeFixed32List_Internal(i11, (IntArrayList) list, z11);
        } else {
            writeFixed32List_Internal(i11, list, z11);
        }
    }

    @Override // com.google.protobuf.T
    public abstract /* synthetic */ void writeFixed64(int i11, long j11) throws IOException;

    abstract void writeFixed64(long j11);

    @Override // com.google.protobuf.T
    public final void writeFixed64List(int i11, List<Long> list, boolean z11) throws IOException {
        if (list instanceof LongArrayList) {
            writeFixed64List_Internal(i11, (LongArrayList) list, z11);
        } else {
            writeFixed64List_Internal(i11, list, z11);
        }
    }

    @Override // com.google.protobuf.T
    public final void writeFloat(int i11, float f7) throws IOException {
        writeFixed32(i11, Float.floatToRawIntBits(f7));
    }

    @Override // com.google.protobuf.T
    public final void writeFloatList(int i11, List<Float> list, boolean z11) throws IOException {
        if (list instanceof FloatArrayList) {
            writeFloatList_Internal(i11, (FloatArrayList) list, z11);
        } else {
            writeFloatList_Internal(i11, list, z11);
        }
    }

    @Deprecated
    public abstract /* synthetic */ void writeGroup(int i11, Object obj) throws IOException;

    @Override // com.google.protobuf.T
    @Deprecated
    public abstract /* synthetic */ void writeGroup(int i11, Object obj, J j11) throws IOException;

    @Deprecated
    public final void writeGroupList(int i11, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeGroup(i11, list.get(size));
        }
    }

    abstract void writeInt32(int i11);

    @Override // com.google.protobuf.T
    public abstract /* synthetic */ void writeInt32(int i11, int i12) throws IOException;

    @Override // com.google.protobuf.T
    public final void writeInt32List(int i11, List<Integer> list, boolean z11) throws IOException {
        if (list instanceof IntArrayList) {
            writeInt32List_Internal(i11, (IntArrayList) list, z11);
        } else {
            writeInt32List_Internal(i11, list, z11);
        }
    }

    @Override // com.google.protobuf.T
    public final void writeInt64(int i11, long j11) throws IOException {
        writeUInt64(i11, j11);
    }

    @Override // com.google.protobuf.T
    public final void writeInt64List(int i11, List<Long> list, boolean z11) throws IOException {
        writeUInt64List(i11, list, z11);
    }

    @Override // com.google.protobuf.T
    public <K, V> void writeMap(int i11, u.a<K, V> aVar, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            int totalBytesWritten = getTotalBytesWritten();
            writeMapEntryField(this, 2, aVar.f60237c, entry.getValue());
            writeMapEntryField(this, 1, aVar.f60235a, entry.getKey());
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i11, 2);
        }
    }

    @Override // com.google.protobuf.T
    public abstract /* synthetic */ void writeMessage(int i11, Object obj) throws IOException;

    @Override // com.google.protobuf.T
    public abstract /* synthetic */ void writeMessage(int i11, Object obj, J j11) throws IOException;

    public final void writeMessageList(int i11, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeMessage(i11, list.get(size));
        }
    }

    @Override // com.google.protobuf.T
    public final void writeMessageSetItem(int i11, Object obj) throws IOException {
        writeTag(1, 4);
        if (obj instanceof ByteString) {
            writeBytes(3, (ByteString) obj);
        } else {
            writeMessage(3, obj);
        }
        writeUInt32(2, i11);
        writeTag(1, 3);
    }

    @Override // com.google.protobuf.T
    public final void writeSFixed32(int i11, int i12) throws IOException {
        writeFixed32(i11, i12);
    }

    @Override // com.google.protobuf.T
    public final void writeSFixed32List(int i11, List<Integer> list, boolean z11) throws IOException {
        writeFixed32List(i11, list, z11);
    }

    @Override // com.google.protobuf.T
    public final void writeSFixed64(int i11, long j11) throws IOException {
        writeFixed64(i11, j11);
    }

    @Override // com.google.protobuf.T
    public final void writeSFixed64List(int i11, List<Long> list, boolean z11) throws IOException {
        writeFixed64List(i11, list, z11);
    }

    abstract void writeSInt32(int i11);

    @Override // com.google.protobuf.T
    public abstract /* synthetic */ void writeSInt32(int i11, int i12) throws IOException;

    @Override // com.google.protobuf.T
    public final void writeSInt32List(int i11, List<Integer> list, boolean z11) throws IOException {
        if (list instanceof IntArrayList) {
            writeSInt32List_Internal(i11, (IntArrayList) list, z11);
        } else {
            writeSInt32List_Internal(i11, list, z11);
        }
    }

    @Override // com.google.protobuf.T
    public abstract /* synthetic */ void writeSInt64(int i11, long j11) throws IOException;

    abstract void writeSInt64(long j11);

    @Override // com.google.protobuf.T
    public final void writeSInt64List(int i11, List<Long> list, boolean z11) throws IOException {
        if (list instanceof LongArrayList) {
            writeSInt64List_Internal(i11, (LongArrayList) list, z11);
        } else {
            writeSInt64List_Internal(i11, list, z11);
        }
    }

    @Override // com.google.protobuf.T
    @Deprecated
    public abstract /* synthetic */ void writeStartGroup(int i11) throws IOException;

    @Override // com.google.protobuf.T
    public abstract /* synthetic */ void writeString(int i11, String str) throws IOException;

    abstract void writeString(String str);

    @Override // com.google.protobuf.T
    public final void writeStringList(int i11, List<String> list) throws IOException {
        if (!(list instanceof LazyStringList)) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeString(i11, list.get(size));
            }
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeLazyString(i11, lazyStringList.getRaw(size2));
        }
    }

    abstract void writeTag(int i11, int i12);

    @Override // com.google.protobuf.T
    public abstract /* synthetic */ void writeUInt32(int i11, int i12) throws IOException;

    @Override // com.google.protobuf.T
    public final void writeUInt32List(int i11, List<Integer> list, boolean z11) throws IOException {
        if (list instanceof IntArrayList) {
            writeUInt32List_Internal(i11, (IntArrayList) list, z11);
        } else {
            writeUInt32List_Internal(i11, list, z11);
        }
    }

    @Override // com.google.protobuf.T
    public abstract /* synthetic */ void writeUInt64(int i11, long j11) throws IOException;

    @Override // com.google.protobuf.T
    public final void writeUInt64List(int i11, List<Long> list, boolean z11) throws IOException {
        if (list instanceof LongArrayList) {
            writeUInt64List_Internal(i11, (LongArrayList) list, z11);
        } else {
            writeUInt64List_Internal(i11, list, z11);
        }
    }

    abstract void writeVarint32(int i11);

    abstract void writeVarint64(long j11);

    private BinaryWriter(BufferAllocator bufferAllocator, int i11) {
        this.buffers = new ArrayDeque<>(4);
        if (i11 <= 0) {
            throw new IllegalArgumentException("chunkSize must be > 0");
        }
        Internal.a(bufferAllocator, "alloc");
        this.alloc = bufferAllocator;
        this.chunkSize = i11;
    }

    public static BinaryWriter newDirectInstance(BufferAllocator bufferAllocator, int i11) {
        return isUnsafeDirectSupported() ? newUnsafeDirectInstance(bufferAllocator, i11) : newSafeDirectInstance(bufferAllocator, i11);
    }

    public static BinaryWriter newHeapInstance(BufferAllocator bufferAllocator, int i11) {
        return isUnsafeHeapSupported() ? newUnsafeHeapInstance(bufferAllocator, i11) : newSafeHeapInstance(bufferAllocator, i11);
    }

    final AllocatedBuffer newDirectBuffer(int i11) {
        return this.alloc.allocateDirectBuffer(Math.max(i11, this.chunkSize));
    }

    final AllocatedBuffer newHeapBuffer(int i11) {
        return this.alloc.allocateHeapBuffer(Math.max(i11, this.chunkSize));
    }

    @Override // com.google.protobuf.T
    @Deprecated
    public final void writeGroupList(int i11, List<?> list, J j11) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeGroup(i11, list.get(size), j11);
        }
    }

    @Override // com.google.protobuf.T
    public final void writeMessageList(int i11, List<?> list, J j11) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeMessage(i11, list.get(size), j11);
        }
    }

    private void writeBoolList_Internal(int i11, BooleanArrayList booleanArrayList, boolean z11) throws IOException {
        if (z11) {
            requireSpace(booleanArrayList.size() + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = booleanArrayList.size() - 1; size >= 0; size--) {
                writeBool(booleanArrayList.getBoolean(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i11, 2);
            return;
        }
        for (int size2 = booleanArrayList.size() - 1; size2 >= 0; size2--) {
            writeBool(i11, booleanArrayList.getBoolean(size2));
        }
    }

    private void writeDoubleList_Internal(int i11, DoubleArrayList doubleArrayList, boolean z11) throws IOException {
        if (z11) {
            requireSpace((doubleArrayList.size() * 8) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = doubleArrayList.size() - 1; size >= 0; size--) {
                writeFixed64(Double.doubleToRawLongBits(doubleArrayList.getDouble(size)));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i11, 2);
            return;
        }
        for (int size2 = doubleArrayList.size() - 1; size2 >= 0; size2--) {
            writeDouble(i11, doubleArrayList.getDouble(size2));
        }
    }

    private void writeFixed32List_Internal(int i11, IntArrayList intArrayList, boolean z11) throws IOException {
        if (z11) {
            requireSpace((intArrayList.size() * 4) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                writeFixed32(intArrayList.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i11, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            writeFixed32(i11, intArrayList.getInt(size2));
        }
    }

    private void writeFixed64List_Internal(int i11, LongArrayList longArrayList, boolean z11) throws IOException {
        if (z11) {
            requireSpace((longArrayList.size() * 8) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                writeFixed64(longArrayList.getLong(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i11, 2);
            return;
        }
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            writeFixed64(i11, longArrayList.getLong(size2));
        }
    }

    private void writeFloatList_Internal(int i11, FloatArrayList floatArrayList, boolean z11) throws IOException {
        if (z11) {
            requireSpace((floatArrayList.size() * 4) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = floatArrayList.size() - 1; size >= 0; size--) {
                writeFixed32(Float.floatToRawIntBits(floatArrayList.getFloat(size)));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i11, 2);
            return;
        }
        for (int size2 = floatArrayList.size() - 1; size2 >= 0; size2--) {
            writeFloat(i11, floatArrayList.getFloat(size2));
        }
    }

    private void writeInt32List_Internal(int i11, IntArrayList intArrayList, boolean z11) throws IOException {
        if (z11) {
            requireSpace((intArrayList.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                writeInt32(intArrayList.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i11, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            writeInt32(i11, intArrayList.getInt(size2));
        }
    }

    private void writeSInt32List_Internal(int i11, IntArrayList intArrayList, boolean z11) throws IOException {
        if (z11) {
            requireSpace((intArrayList.size() * 5) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                writeSInt32(intArrayList.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i11, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            writeSInt32(i11, intArrayList.getInt(size2));
        }
    }

    private void writeSInt64List_Internal(int i11, LongArrayList longArrayList, boolean z11) throws IOException {
        if (z11) {
            requireSpace((longArrayList.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                writeSInt64(longArrayList.getLong(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i11, 2);
            return;
        }
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            writeSInt64(i11, longArrayList.getLong(size2));
        }
    }

    private void writeUInt32List_Internal(int i11, IntArrayList intArrayList, boolean z11) throws IOException {
        if (z11) {
            requireSpace((intArrayList.size() * 5) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                writeVarint32(intArrayList.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i11, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            writeUInt32(i11, intArrayList.getInt(size2));
        }
    }

    private void writeUInt64List_Internal(int i11, LongArrayList longArrayList, boolean z11) throws IOException {
        if (z11) {
            requireSpace((longArrayList.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                writeVarint64(longArrayList.getLong(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i11, 2);
            return;
        }
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            writeUInt64(i11, longArrayList.getLong(size2));
        }
    }
}
