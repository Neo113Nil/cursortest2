package com.google.protobuf;

import Am.C2438a;
import C.C2702w;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.Utf8;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class CodedOutputStream extends AbstractC5953d {
    public static final int DEFAULT_BUFFER_SIZE = 4096;

    @Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    private boolean serializationDeterministic;
    Object wrapper;
    private static final Logger logger = Logger.getLogger(CodedOutputStream.class.getName());
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = UnsafeUtil.A();

    /* loaded from: classes9.dex */
    private static abstract class AbstractBufferedEncoder extends CodedOutputStream {
        final byte[] buffer;
        final int limit;
        int position;
        int totalBytesWritten;

        AbstractBufferedEncoder(int i11) {
            super();
            if (i11 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i11, 20)];
            this.buffer = bArr;
            this.limit = bArr.length;
        }

        final void buffer(byte b11) {
            int i11 = this.position;
            this.buffer[i11] = b11;
            this.position = i11 + 1;
            this.totalBytesWritten++;
        }

        final void bufferFixed32NoTag(int i11) {
            int i12 = this.position;
            byte[] bArr = this.buffer;
            bArr[i12] = (byte) i11;
            bArr[i12 + 1] = (byte) (i11 >> 8);
            bArr[i12 + 2] = (byte) (i11 >> 16);
            bArr[i12 + 3] = (byte) (i11 >> 24);
            this.position = i12 + 4;
            this.totalBytesWritten += 4;
        }

        final void bufferFixed64NoTag(long j11) {
            int i11 = this.position;
            byte[] bArr = this.buffer;
            bArr[i11] = (byte) j11;
            bArr[i11 + 1] = (byte) (j11 >> 8);
            bArr[i11 + 2] = (byte) (j11 >> 16);
            bArr[i11 + 3] = (byte) (j11 >> 24);
            bArr[i11 + 4] = (byte) (j11 >> 32);
            bArr[i11 + 5] = (byte) (j11 >> 40);
            bArr[i11 + 6] = (byte) (j11 >> 48);
            bArr[i11 + 7] = (byte) (j11 >> 56);
            this.position = i11 + 8;
            this.totalBytesWritten += 8;
        }

        final void bufferInt32NoTag(int i11) {
            if (i11 >= 0) {
                bufferUInt32NoTag(i11);
            } else {
                bufferUInt64NoTag(i11);
            }
        }

        final void bufferTag(int i11, int i12) {
            bufferUInt32NoTag((i11 << 3) | i12);
        }

        final void bufferUInt32NoTag(int i11) {
            if (!CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                while ((i11 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i12 = this.position;
                    this.position = i12 + 1;
                    bArr[i12] = (byte) (i11 | UserVerificationMethods.USER_VERIFY_PATTERN);
                    this.totalBytesWritten++;
                    i11 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i13 = this.position;
                this.position = i13 + 1;
                bArr2[i13] = (byte) i11;
                this.totalBytesWritten++;
                return;
            }
            long j11 = this.position;
            while ((i11 & (-128)) != 0) {
                byte[] bArr3 = this.buffer;
                int i14 = this.position;
                this.position = i14 + 1;
                UnsafeUtil.F(bArr3, i14, (byte) (i11 | UserVerificationMethods.USER_VERIFY_PATTERN));
                i11 >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i15 = this.position;
            this.position = i15 + 1;
            UnsafeUtil.F(bArr4, i15, (byte) i11);
            this.totalBytesWritten += (int) (this.position - j11);
        }

        final void bufferUInt64NoTag(long j11) {
            if (!CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                while ((j11 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i11 = this.position;
                    this.position = i11 + 1;
                    bArr[i11] = (byte) (((int) j11) | UserVerificationMethods.USER_VERIFY_PATTERN);
                    this.totalBytesWritten++;
                    j11 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i12 = this.position;
                this.position = i12 + 1;
                bArr2[i12] = (byte) j11;
                this.totalBytesWritten++;
                return;
            }
            long j12 = this.position;
            while ((j11 & (-128)) != 0) {
                byte[] bArr3 = this.buffer;
                int i13 = this.position;
                this.position = i13 + 1;
                UnsafeUtil.F(bArr3, i13, (byte) (((int) j11) | UserVerificationMethods.USER_VERIFY_PATTERN));
                j11 >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i14 = this.position;
            this.position = i14 + 1;
            UnsafeUtil.F(bArr4, i14, (byte) j11);
            this.totalBytesWritten += (int) (this.position - j12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.totalBytesWritten;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int spaceLeft() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    private static class ArrayEncoder extends CodedOutputStream {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        ArrayEncoder(byte[] bArr, int i11, int i12) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i13 = i11 + i12;
            if ((i11 | i12 | (bArr.length - i13)) < 0) {
                Locale locale = Locale.US;
                StringBuilder a11 = C2438a.a("Array range is invalid. Buffer.length=", bArr.length, ", offset=", ", length=", i11);
                a11.append(i12);
                throw new IllegalArgumentException(a11.toString());
            }
            this.buffer = bArr;
            this.offset = i11;
            this.position = i11;
            this.limit = i13;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.position - this.offset;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int spaceLeft() {
            return this.limit - this.position;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.AbstractC5953d
        public final void write(byte b11) throws IOException {
            int i11 = this.position;
            try {
                int i12 = i11 + 1;
                try {
                    this.buffer[i11] = b11;
                    this.position = i12;
                } catch (IndexOutOfBoundsException e11) {
                    e = e11;
                    i11 = i12;
                    throw new b(i11, this.limit, 1, (RuntimeException) e);
                }
            } catch (IndexOutOfBoundsException e12) {
                e = e12;
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeBool(int i11, boolean z11) throws IOException {
            writeTag(i11, 0);
            write(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteArray(int i11, byte[] bArr) throws IOException {
            writeByteArray(i11, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteArrayNoTag(byte[] bArr, int i11, int i12) throws IOException {
            writeUInt32NoTag(i12);
            write(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteBuffer(int i11, ByteBuffer byteBuffer) throws IOException {
            writeTag(i11, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeBytes(int i11, ByteString byteString) throws IOException {
            writeTag(i11, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed32(int i11, int i12) throws IOException {
            writeTag(i11, 5);
            writeFixed32NoTag(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed32NoTag(int i11) throws IOException {
            int i12 = this.position;
            try {
                byte[] bArr = this.buffer;
                bArr[i12] = (byte) i11;
                bArr[i12 + 1] = (byte) (i11 >> 8);
                bArr[i12 + 2] = (byte) (i11 >> 16);
                bArr[i12 + 3] = (byte) (i11 >> 24);
                this.position = i12 + 4;
            } catch (IndexOutOfBoundsException e11) {
                throw new b(i12, this.limit, 4, (RuntimeException) e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed64(int i11, long j11) throws IOException {
            writeTag(i11, 1);
            writeFixed64NoTag(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed64NoTag(long j11) throws IOException {
            int i11 = this.position;
            try {
                byte[] bArr = this.buffer;
                bArr[i11] = (byte) j11;
                bArr[i11 + 1] = (byte) (j11 >> 8);
                bArr[i11 + 2] = (byte) (j11 >> 16);
                bArr[i11 + 3] = (byte) (j11 >> 24);
                bArr[i11 + 4] = (byte) (j11 >> 32);
                bArr[i11 + 5] = (byte) (j11 >> 40);
                bArr[i11 + 6] = (byte) (j11 >> 48);
                bArr[i11 + 7] = (byte) (j11 >> 56);
                this.position = i11 + 8;
            } catch (IndexOutOfBoundsException e11) {
                throw new b(i11, this.limit, 8, (RuntimeException) e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeInt32(int i11, int i12) throws IOException {
            writeTag(i11, 0);
            writeInt32NoTag(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeInt32NoTag(int i11) throws IOException {
            if (i11 >= 0) {
                writeUInt32NoTag(i11);
            } else {
                writeUInt64NoTag(i11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.AbstractC5953d
        public final void writeLazy(byte[] bArr, int i11, int i12) throws IOException {
            write(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeMessage(int i11, MessageLite messageLite) throws IOException {
            writeTag(i11, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeMessageSetExtension(int i11, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i11);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            C5964o.a(duplicate);
            write(duplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeRawMessageSetExtension(int i11, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i11);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeString(int i11, String str) throws IOException {
            writeTag(i11, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeStringNoTag(String str) throws IOException {
            int i11 = this.position;
            try {
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 != computeUInt32SizeNoTag) {
                    writeUInt32NoTag(Utf8.j(str));
                    this.position = Utf8.h(str, this.buffer, this.position, spaceLeft());
                    return;
                }
                int i12 = i11 + computeUInt32SizeNoTag2;
                this.position = i12;
                int h11 = Utf8.h(str, this.buffer, i12, spaceLeft());
                this.position = i11;
                writeUInt32NoTag((h11 - i11) - computeUInt32SizeNoTag2);
                this.position = h11;
            } catch (Utf8.c e11) {
                this.position = i11;
                inefficientWriteStringNoTag(str, e11);
            } catch (IndexOutOfBoundsException e12) {
                throw new b(e12);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeTag(int i11, int i12) throws IOException {
            writeUInt32NoTag((i11 << 3) | i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt32(int i11, int i12) throws IOException {
            writeTag(i11, 0);
            writeUInt32NoTag(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt32NoTag(int i11) throws IOException {
            int i12;
            int i13 = this.position;
            while ((i11 & (-128)) != 0) {
                try {
                    i12 = i13 + 1;
                    try {
                        this.buffer[i13] = (byte) (i11 | UserVerificationMethods.USER_VERIFY_PATTERN);
                        i11 >>>= 7;
                        i13 = i12;
                    } catch (IndexOutOfBoundsException e11) {
                        e = e11;
                        i13 = i12;
                        throw new b(i13, this.limit, 1, (RuntimeException) e);
                    }
                } catch (IndexOutOfBoundsException e12) {
                    e = e12;
                    throw new b(i13, this.limit, 1, (RuntimeException) e);
                }
            }
            i12 = i13 + 1;
            this.buffer[i13] = (byte) i11;
            this.position = i12;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt64(int i11, long j11) throws IOException {
            writeTag(i11, 0);
            writeUInt64NoTag(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt64NoTag(long j11) throws IOException {
            int i11;
            int i12;
            int i13 = this.position;
            if (!CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS || spaceLeft() < 10) {
                while ((j11 & (-128)) != 0) {
                    try {
                        i12 = i13 + 1;
                    } catch (IndexOutOfBoundsException e11) {
                        e = e11;
                    }
                    try {
                        this.buffer[i13] = (byte) (((int) j11) | UserVerificationMethods.USER_VERIFY_PATTERN);
                        j11 >>>= 7;
                        i13 = i12;
                    } catch (IndexOutOfBoundsException e12) {
                        e = e12;
                        i13 = i12;
                        throw new b(i13, this.limit, 1, (RuntimeException) e);
                    }
                }
                i11 = i13 + 1;
                try {
                    this.buffer[i13] = (byte) j11;
                } catch (IndexOutOfBoundsException e13) {
                    e = e13;
                    i13 = i11;
                    throw new b(i13, this.limit, 1, (RuntimeException) e);
                }
            } else {
                while ((j11 & (-128)) != 0) {
                    UnsafeUtil.F(this.buffer, i13, (byte) (((int) j11) | UserVerificationMethods.USER_VERIFY_PATTERN));
                    j11 >>>= 7;
                    i13++;
                }
                i11 = i13 + 1;
                UnsafeUtil.F(this.buffer, i13, (byte) j11);
            }
            this.position = i11;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteArray(int i11, byte[] bArr, int i12, int i13) throws IOException {
            writeTag(i11, 2);
            writeByteArrayNoTag(bArr, i12, i13);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.AbstractC5953d
        public final void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.AbstractC5953d
        public final void write(byte[] bArr, int i11, int i12) throws IOException {
            try {
                System.arraycopy(bArr, i11, this.buffer, this.position, i12);
                this.position += i12;
            } catch (IndexOutOfBoundsException e11) {
                throw new b(this.position, this.limit, i12, (RuntimeException) e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.AbstractC5953d
        public final void write(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.buffer, this.position, remaining);
                this.position += remaining;
            } catch (IndexOutOfBoundsException e11) {
                throw new b(this.position, this.limit, remaining, (RuntimeException) e11);
            }
        }
    }

    /* loaded from: classes9.dex */
    private static final class ByteOutputEncoder extends AbstractBufferedEncoder {
        private final AbstractC5953d out;

        ByteOutputEncoder(AbstractC5953d abstractC5953d, int i11) {
            super(i11);
            if (abstractC5953d == null) {
                throw new NullPointerException("out");
            }
            this.out = abstractC5953d;
        }

        private void doFlush() throws IOException {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private void flushIfNotAvailable(int i11) throws IOException {
            if (this.limit - this.position < i11) {
                doFlush();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() throws IOException {
            if (this.position > 0) {
                doFlush();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.AbstractC5953d
        public void write(byte b11) throws IOException {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i11, boolean z11) throws IOException {
            flushIfNotAvailable(11);
            bufferTag(i11, 0);
            buffer(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i11, byte[] bArr) throws IOException {
            writeByteArray(i11, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i11, int i12) throws IOException {
            writeUInt32NoTag(i12);
            write(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i11, ByteBuffer byteBuffer) throws IOException {
            writeTag(i11, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i11, ByteString byteString) throws IOException {
            writeTag(i11, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i11, int i12) throws IOException {
            flushIfNotAvailable(14);
            bufferTag(i11, 5);
            bufferFixed32NoTag(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i11) throws IOException {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i11, long j11) throws IOException {
            flushIfNotAvailable(18);
            bufferTag(i11, 1);
            bufferFixed64NoTag(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j11) throws IOException {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i11, int i12) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i11, 0);
            bufferInt32NoTag(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i11) throws IOException {
            if (i11 >= 0) {
                writeUInt32NoTag(i11);
            } else {
                writeUInt64NoTag(i11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.AbstractC5953d
        public void writeLazy(byte[] bArr, int i11, int i12) throws IOException {
            flush();
            this.out.writeLazy(bArr, i11, i12);
            this.totalBytesWritten += i12;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i11, MessageLite messageLite) throws IOException {
            writeTag(i11, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i11, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i11);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            write(duplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i11, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i11);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i11, String str) throws IOException {
            writeTag(i11, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
            int length = str.length() * 3;
            int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
            int i11 = computeUInt32SizeNoTag + length;
            int i12 = this.limit;
            if (i11 > i12) {
                byte[] bArr = new byte[length];
                int h11 = Utf8.h(str, bArr, 0, length);
                writeUInt32NoTag(h11);
                writeLazy(bArr, 0, h11);
                return;
            }
            if (i11 > i12 - this.position) {
                doFlush();
            }
            int i13 = this.position;
            try {
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 != computeUInt32SizeNoTag) {
                    int j11 = Utf8.j(str);
                    bufferUInt32NoTag(j11);
                    this.position = Utf8.h(str, this.buffer, this.position, j11);
                    this.totalBytesWritten += j11;
                    return;
                }
                int i14 = i13 + computeUInt32SizeNoTag2;
                this.position = i14;
                int h12 = Utf8.h(str, this.buffer, i14, this.limit - i14);
                this.position = i13;
                int i15 = (h12 - i13) - computeUInt32SizeNoTag2;
                bufferUInt32NoTag(i15);
                this.position = h12;
                this.totalBytesWritten += i15;
            } catch (Utf8.c e11) {
                this.totalBytesWritten -= this.position - i13;
                this.position = i13;
                inefficientWriteStringNoTag(str, e11);
            } catch (IndexOutOfBoundsException e12) {
                throw new b(e12);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i11, int i12) throws IOException {
            writeUInt32NoTag((i11 << 3) | i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i11, int i12) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i11, 0);
            bufferUInt32NoTag(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i11) throws IOException {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i11, long j11) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i11, 0);
            bufferUInt64NoTag(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j11) throws IOException {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i11, byte[] bArr, int i12, int i13) throws IOException {
            writeTag(i11, 2);
            writeByteArrayNoTag(bArr, i12, i13);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.AbstractC5953d
        public void write(byte[] bArr, int i11, int i12) throws IOException {
            flush();
            this.out.write(bArr, i11, i12);
            this.totalBytesWritten += i12;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.AbstractC5953d
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            flush();
            int remaining = byteBuffer.remaining();
            this.out.writeLazy(byteBuffer);
            this.totalBytesWritten += remaining;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.AbstractC5953d
        public void write(ByteBuffer byteBuffer) throws IOException {
            flush();
            int remaining = byteBuffer.remaining();
            this.out.write(byteBuffer);
            this.totalBytesWritten += remaining;
        }
    }

    /* loaded from: classes9.dex */
    private static final class HeapNioEncoder extends ArrayEncoder {
        private final ByteBuffer byteBuffer;
        private int initialPosition;

        HeapNioEncoder(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
            this.byteBuffer = byteBuffer;
            this.initialPosition = byteBuffer.position();
        }

        @Override // com.google.protobuf.CodedOutputStream.ArrayEncoder, com.google.protobuf.CodedOutputStream
        public void flush() {
            this.byteBuffer.position(this.initialPosition + getTotalBytesWritten());
        }
    }

    /* loaded from: classes9.dex */
    private static final class OutputStreamEncoder extends AbstractBufferedEncoder {
        private final OutputStream out;

        OutputStreamEncoder(OutputStream outputStream, int i11) {
            super(i11);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.out = outputStream;
        }

        private void doFlush() throws IOException {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private void flushIfNotAvailable(int i11) throws IOException {
            if (this.limit - this.position < i11) {
                doFlush();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() throws IOException {
            if (this.position > 0) {
                doFlush();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.AbstractC5953d
        public void write(byte b11) throws IOException {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i11, boolean z11) throws IOException {
            flushIfNotAvailable(11);
            bufferTag(i11, 0);
            buffer(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i11, byte[] bArr) throws IOException {
            writeByteArray(i11, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i11, int i12) throws IOException {
            writeUInt32NoTag(i12);
            write(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i11, ByteBuffer byteBuffer) throws IOException {
            writeTag(i11, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i11, ByteString byteString) throws IOException {
            writeTag(i11, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i11, int i12) throws IOException {
            flushIfNotAvailable(14);
            bufferTag(i11, 5);
            bufferFixed32NoTag(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i11) throws IOException {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i11, long j11) throws IOException {
            flushIfNotAvailable(18);
            bufferTag(i11, 1);
            bufferFixed64NoTag(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j11) throws IOException {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i11, int i12) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i11, 0);
            bufferInt32NoTag(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i11) throws IOException {
            if (i11 >= 0) {
                writeUInt32NoTag(i11);
            } else {
                writeUInt64NoTag(i11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.AbstractC5953d
        public void writeLazy(byte[] bArr, int i11, int i12) throws IOException {
            write(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i11, MessageLite messageLite) throws IOException {
            writeTag(i11, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i11, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i11);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            write(duplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i11, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i11);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i11, String str) throws IOException {
            writeTag(i11, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
            int j11;
            try {
                int length = str.length() * 3;
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
                int i11 = computeUInt32SizeNoTag + length;
                int i12 = this.limit;
                if (i11 > i12) {
                    byte[] bArr = new byte[length];
                    int h11 = Utf8.h(str, bArr, 0, length);
                    writeUInt32NoTag(h11);
                    writeLazy(bArr, 0, h11);
                    return;
                }
                if (i11 > i12 - this.position) {
                    doFlush();
                }
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                int i13 = this.position;
                try {
                    if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                        int i14 = i13 + computeUInt32SizeNoTag2;
                        this.position = i14;
                        int h12 = Utf8.h(str, this.buffer, i14, this.limit - i14);
                        this.position = i13;
                        j11 = (h12 - i13) - computeUInt32SizeNoTag2;
                        bufferUInt32NoTag(j11);
                        this.position = h12;
                    } else {
                        j11 = Utf8.j(str);
                        bufferUInt32NoTag(j11);
                        this.position = Utf8.h(str, this.buffer, this.position, j11);
                    }
                    this.totalBytesWritten += j11;
                } catch (Utf8.c e11) {
                    this.totalBytesWritten -= this.position - i13;
                    this.position = i13;
                    throw e11;
                } catch (ArrayIndexOutOfBoundsException e12) {
                    throw new b(e12);
                }
            } catch (Utf8.c e13) {
                inefficientWriteStringNoTag(str, e13);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i11, int i12) throws IOException {
            writeUInt32NoTag((i11 << 3) | i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i11, int i12) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i11, 0);
            bufferUInt32NoTag(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i11) throws IOException {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i11, long j11) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i11, 0);
            bufferUInt64NoTag(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j11) throws IOException {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i11, byte[] bArr, int i12, int i13) throws IOException {
            writeTag(i11, 2);
            writeByteArrayNoTag(bArr, i12, i13);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.AbstractC5953d
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.AbstractC5953d
        public void write(byte[] bArr, int i11, int i12) throws IOException {
            int i13 = this.limit;
            int i14 = this.position;
            if (i13 - i14 >= i12) {
                System.arraycopy(bArr, i11, this.buffer, i14, i12);
                this.position += i12;
                this.totalBytesWritten += i12;
                return;
            }
            int i15 = i13 - i14;
            System.arraycopy(bArr, i11, this.buffer, i14, i15);
            int i16 = i11 + i15;
            int i17 = i12 - i15;
            this.position = this.limit;
            this.totalBytesWritten += i15;
            doFlush();
            if (i17 <= this.limit) {
                System.arraycopy(bArr, i16, this.buffer, 0, i17);
                this.position = i17;
            } else {
                this.out.write(bArr, i16, i17);
            }
            this.totalBytesWritten += i17;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.AbstractC5953d
        public void write(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            int i11 = this.limit;
            int i12 = this.position;
            if (i11 - i12 >= remaining) {
                byteBuffer.get(this.buffer, i12, remaining);
                this.position += remaining;
                this.totalBytesWritten += remaining;
                return;
            }
            int i13 = i11 - i12;
            byteBuffer.get(this.buffer, i12, i13);
            int i14 = remaining - i13;
            this.position = this.limit;
            this.totalBytesWritten += i13;
            doFlush();
            while (true) {
                int i15 = this.limit;
                if (i14 > i15) {
                    byteBuffer.get(this.buffer, 0, i15);
                    this.out.write(this.buffer, 0, this.limit);
                    int i16 = this.limit;
                    i14 -= i16;
                    this.totalBytesWritten += i16;
                } else {
                    byteBuffer.get(this.buffer, 0, i14);
                    this.position = i14;
                    this.totalBytesWritten += i14;
                    return;
                }
            }
        }
    }

    /* loaded from: classes9.dex */
    private static final class SafeDirectNioEncoder extends CodedOutputStream {
        private final ByteBuffer buffer;
        private final int initialPosition;
        private final ByteBuffer originalBuffer;

        SafeDirectNioEncoder(ByteBuffer byteBuffer) {
            super();
            this.originalBuffer = byteBuffer;
            this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.initialPosition = byteBuffer.position();
        }

        private void encode(String str) throws IOException {
            try {
                Utf8.i(str, this.buffer);
            } catch (IndexOutOfBoundsException e11) {
                throw new b(e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
            this.originalBuffer.position(this.buffer.position());
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return this.buffer.position() - this.initialPosition;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int spaceLeft() {
            return this.buffer.remaining();
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.AbstractC5953d
        public void write(byte b11) throws IOException {
            try {
                this.buffer.put(b11);
            } catch (BufferOverflowException e11) {
                throw new b(this.buffer.position(), this.buffer.limit(), 1, (RuntimeException) e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i11, boolean z11) throws IOException {
            writeTag(i11, 0);
            write(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i11, byte[] bArr) throws IOException {
            writeByteArray(i11, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i11, int i12) throws IOException {
            writeUInt32NoTag(i12);
            write(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i11, ByteBuffer byteBuffer) throws IOException {
            writeTag(i11, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i11, ByteString byteString) throws IOException {
            writeTag(i11, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i11, int i12) throws IOException {
            writeTag(i11, 5);
            writeFixed32NoTag(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i11) throws IOException {
            try {
                this.buffer.putInt(i11);
            } catch (BufferOverflowException e11) {
                throw new b(this.buffer.position(), this.buffer.limit(), 4, (RuntimeException) e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i11, long j11) throws IOException {
            writeTag(i11, 1);
            writeFixed64NoTag(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j11) throws IOException {
            try {
                this.buffer.putLong(j11);
            } catch (BufferOverflowException e11) {
                throw new b(this.buffer.position(), this.buffer.limit(), 8, (RuntimeException) e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i11, int i12) throws IOException {
            writeTag(i11, 0);
            writeInt32NoTag(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i11) throws IOException {
            if (i11 >= 0) {
                writeUInt32NoTag(i11);
            } else {
                writeUInt64NoTag(i11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.AbstractC5953d
        public void writeLazy(byte[] bArr, int i11, int i12) throws IOException {
            write(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i11, MessageLite messageLite) throws IOException {
            writeTag(i11, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i11, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i11);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            write(duplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i11, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i11);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i11, String str) throws IOException {
            writeTag(i11, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
            int position = this.buffer.position();
            try {
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 != computeUInt32SizeNoTag) {
                    writeUInt32NoTag(Utf8.j(str));
                    encode(str);
                    return;
                }
                int position2 = this.buffer.position() + computeUInt32SizeNoTag2;
                this.buffer.position(position2);
                encode(str);
                int position3 = this.buffer.position();
                this.buffer.position(position);
                writeUInt32NoTag(position3 - position2);
                this.buffer.position(position3);
            } catch (Utf8.c e11) {
                this.buffer.position(position);
                inefficientWriteStringNoTag(str, e11);
            } catch (IllegalArgumentException e12) {
                throw new b(e12);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i11, int i12) throws IOException {
            writeUInt32NoTag((i11 << 3) | i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i11, int i12) throws IOException {
            writeTag(i11, 0);
            writeUInt32NoTag(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i11) throws IOException {
            while ((i11 & (-128)) != 0) {
                try {
                    this.buffer.put((byte) (i11 | UserVerificationMethods.USER_VERIFY_PATTERN));
                    i11 >>>= 7;
                } catch (BufferOverflowException e11) {
                    throw new b(e11);
                }
            }
            this.buffer.put((byte) i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i11, long j11) throws IOException {
            writeTag(i11, 0);
            writeUInt64NoTag(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j11) throws IOException {
            while (((-128) & j11) != 0) {
                try {
                    this.buffer.put((byte) (((int) j11) | UserVerificationMethods.USER_VERIFY_PATTERN));
                    j11 >>>= 7;
                } catch (BufferOverflowException e11) {
                    throw new b(e11);
                }
            }
            this.buffer.put((byte) j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i11, byte[] bArr, int i12, int i13) throws IOException {
            writeTag(i11, 2);
            writeByteArrayNoTag(bArr, i12, i13);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.AbstractC5953d
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.AbstractC5953d
        public void write(byte[] bArr, int i11, int i12) throws IOException {
            try {
                this.buffer.put(bArr, i11, i12);
            } catch (IndexOutOfBoundsException e11) {
                throw new b(e11);
            } catch (BufferOverflowException e12) {
                throw new b(e12);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.AbstractC5953d
        public void write(ByteBuffer byteBuffer) throws IOException {
            try {
                this.buffer.put(byteBuffer);
            } catch (BufferOverflowException e11) {
                throw new b(e11);
            }
        }
    }

    /* loaded from: classes9.dex */
    private static final class UnsafeDirectNioEncoder extends CodedOutputStream {
        private final long address;
        private final ByteBuffer buffer;
        private final long initialPosition;
        private final long limit;
        private final long oneVarintLimit;
        private final ByteBuffer originalBuffer;
        private long position;

        UnsafeDirectNioEncoder(ByteBuffer byteBuffer) {
            super();
            this.originalBuffer = byteBuffer;
            this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long j11 = UnsafeUtil.j(byteBuffer);
            this.address = j11;
            long position = byteBuffer.position() + j11;
            this.initialPosition = position;
            long limit = j11 + byteBuffer.limit();
            this.limit = limit;
            this.oneVarintLimit = limit - 10;
            this.position = position;
        }

        private int bufferPos(long j11) {
            return (int) (j11 - this.address);
        }

        static boolean isSupported() {
            return UnsafeUtil.B();
        }

        private void repositionBuffer(long j11) {
            this.buffer.position(bufferPos(j11));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
            this.originalBuffer.position(bufferPos(this.position));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return (int) (this.position - this.initialPosition);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int spaceLeft() {
            return (int) (this.limit - this.position);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.AbstractC5953d
        public void write(byte b11) throws IOException {
            long j11 = this.position;
            if (j11 >= this.limit) {
                throw new b(this.position, this.limit, 1, (RuntimeException) null);
            }
            this.position = 1 + j11;
            UnsafeUtil.E(j11, b11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i11, boolean z11) throws IOException {
            writeTag(i11, 0);
            write(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i11, byte[] bArr) throws IOException {
            writeByteArray(i11, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i11, int i12) throws IOException {
            writeUInt32NoTag(i12);
            write(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i11, ByteBuffer byteBuffer) throws IOException {
            writeTag(i11, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i11, ByteString byteString) throws IOException {
            writeTag(i11, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i11, int i12) throws IOException {
            writeTag(i11, 5);
            writeFixed32NoTag(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i11) throws IOException {
            try {
                this.buffer.putInt(bufferPos(this.position), i11);
                this.position += 4;
            } catch (IndexOutOfBoundsException e11) {
                throw new b(this.position, this.limit, 4, e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i11, long j11) throws IOException {
            writeTag(i11, 1);
            writeFixed64NoTag(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j11) throws IOException {
            try {
                this.buffer.putLong(bufferPos(this.position), j11);
                this.position += 8;
            } catch (IndexOutOfBoundsException e11) {
                throw new b(this.position, this.limit, 8, e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i11, int i12) throws IOException {
            writeTag(i11, 0);
            writeInt32NoTag(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i11) throws IOException {
            if (i11 >= 0) {
                writeUInt32NoTag(i11);
            } else {
                writeUInt64NoTag(i11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.AbstractC5953d
        public void writeLazy(byte[] bArr, int i11, int i12) throws IOException {
            write(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i11, MessageLite messageLite) throws IOException {
            writeTag(i11, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i11, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i11);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            write(duplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i11, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i11);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i11, String str) throws IOException {
            writeTag(i11, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
            long j11 = this.position;
            try {
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 != computeUInt32SizeNoTag) {
                    int j12 = Utf8.j(str);
                    writeUInt32NoTag(j12);
                    repositionBuffer(this.position);
                    Utf8.i(str, this.buffer);
                    this.position += j12;
                    return;
                }
                int bufferPos = bufferPos(this.position) + computeUInt32SizeNoTag2;
                this.buffer.position(bufferPos);
                Utf8.i(str, this.buffer);
                int position = this.buffer.position() - bufferPos;
                writeUInt32NoTag(position);
                this.position += position;
            } catch (Utf8.c e11) {
                this.position = j11;
                repositionBuffer(j11);
                inefficientWriteStringNoTag(str, e11);
            } catch (IllegalArgumentException e12) {
                throw new b(e12);
            } catch (IndexOutOfBoundsException e13) {
                throw new b(e13);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i11, int i12) throws IOException {
            writeUInt32NoTag((i11 << 3) | i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i11, int i12) throws IOException {
            writeTag(i11, 0);
            writeUInt32NoTag(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i11) throws IOException {
            long j11;
            long j12 = this.position;
            if (j12 > this.oneVarintLimit) {
                while (j12 < this.limit) {
                    if ((i11 & (-128)) == 0) {
                        j11 = 1 + j12;
                        UnsafeUtil.E(j12, (byte) i11);
                    } else {
                        UnsafeUtil.E(j12, (byte) (i11 | UserVerificationMethods.USER_VERIFY_PATTERN));
                        i11 >>>= 7;
                        j12++;
                    }
                }
                throw new b("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(j12), Long.valueOf(this.limit), 1)));
            }
            while ((i11 & (-128)) != 0) {
                UnsafeUtil.E(j12, (byte) (i11 | UserVerificationMethods.USER_VERIFY_PATTERN));
                i11 >>>= 7;
                j12++;
            }
            j11 = 1 + j12;
            UnsafeUtil.E(j12, (byte) i11);
            this.position = j11;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i11, long j11) throws IOException {
            writeTag(i11, 0);
            writeUInt64NoTag(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j11) throws IOException {
            long j12;
            long j13 = this.position;
            if (j13 > this.oneVarintLimit) {
                long j14 = j13;
                long j15 = j11;
                while (j14 < this.limit) {
                    if ((j15 & (-128)) == 0) {
                        j12 = 1 + j14;
                        UnsafeUtil.E(j14, (byte) j15);
                    } else {
                        UnsafeUtil.E(j14, (byte) (((int) j15) | UserVerificationMethods.USER_VERIFY_PATTERN));
                        j15 >>>= 7;
                        j14++;
                    }
                }
                throw new b(j14, this.limit, 1, (RuntimeException) null);
            }
            long j16 = j13;
            long j17 = j11;
            while ((j17 & (-128)) != 0) {
                UnsafeUtil.E(j16, (byte) (((int) j17) | UserVerificationMethods.USER_VERIFY_PATTERN));
                j17 >>>= 7;
                j16++;
            }
            j12 = 1 + j16;
            UnsafeUtil.E(j16, (byte) j17);
            this.position = j12;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i11, byte[] bArr, int i12, int i13) throws IOException {
            writeTag(i11, 2);
            writeByteArrayNoTag(bArr, i12, i13);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.AbstractC5953d
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.AbstractC5953d
        public void write(byte[] bArr, int i11, int i12) throws IOException {
            if (bArr != null && i11 >= 0 && i12 >= 0 && bArr.length - i12 >= i11) {
                long j11 = i12;
                long j12 = this.limit - j11;
                long j13 = this.position;
                if (j12 >= j13) {
                    UnsafeUtil.o(bArr, i11, j13, j11);
                    this.position += j11;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            }
            throw new b(this.position, this.limit, i12, (RuntimeException) null);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.AbstractC5953d
        public void write(ByteBuffer byteBuffer) throws IOException {
            try {
                int remaining = byteBuffer.remaining();
                repositionBuffer(this.position);
                this.buffer.put(byteBuffer);
                this.position += remaining;
            } catch (BufferOverflowException e11) {
                throw new b(e11);
            }
        }
    }

    /* loaded from: classes9.dex */
    public static class b extends IOException {
        b(RuntimeException runtimeException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", runtimeException);
        }

        b(int i11, int i12, int i13, RuntimeException runtimeException) {
            this(i11, i12, i13, runtimeException);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        b(long j11, long j12, int i11, RuntimeException runtimeException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3.toString()), runtimeException);
            Locale locale = Locale.US;
            StringBuilder d11 = C2702w.d(j11, "Pos: ", ", limit: ");
            d11.append(j12);
            d11.append(", len: ");
            d11.append(i11);
        }
    }

    public static int computeBoolSize(int i11, boolean z11) {
        return computeBoolSizeNoTag(z11) + computeTagSize(i11);
    }

    public static int computeBoolSizeNoTag(boolean z11) {
        return 1;
    }

    public static int computeByteArraySize(int i11, byte[] bArr) {
        return computeByteArraySizeNoTag(bArr) + computeTagSize(i11);
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeLengthDelimitedFieldSize(bArr.length);
    }

    public static int computeByteBufferSize(int i11, ByteBuffer byteBuffer) {
        return computeByteBufferSizeNoTag(byteBuffer) + computeTagSize(i11);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        return computeLengthDelimitedFieldSize(byteBuffer.capacity());
    }

    public static int computeBytesSize(int i11, ByteString byteString) {
        return computeBytesSizeNoTag(byteString) + computeTagSize(i11);
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        return computeLengthDelimitedFieldSize(byteString.size());
    }

    public static int computeDoubleSize(int i11, double d11) {
        return computeDoubleSizeNoTag(d11) + computeTagSize(i11);
    }

    public static int computeDoubleSizeNoTag(double d11) {
        return 8;
    }

    public static int computeEnumSize(int i11, int i12) {
        return computeEnumSizeNoTag(i12) + computeTagSize(i11);
    }

    public static int computeEnumSizeNoTag(int i11) {
        return computeInt32SizeNoTag(i11);
    }

    public static int computeFixed32Size(int i11, int i12) {
        return computeFixed32SizeNoTag(i12) + computeTagSize(i11);
    }

    public static int computeFixed32SizeNoTag(int i11) {
        return 4;
    }

    public static int computeFixed64Size(int i11, long j11) {
        return computeFixed64SizeNoTag(j11) + computeTagSize(i11);
    }

    public static int computeFixed64SizeNoTag(long j11) {
        return 8;
    }

    public static int computeFloatSize(int i11, float f7) {
        return computeFloatSizeNoTag(f7) + computeTagSize(i11);
    }

    public static int computeFloatSizeNoTag(float f7) {
        return 4;
    }

    @Deprecated
    public static int computeGroupSize(int i11, MessageLite messageLite) {
        return messageLite.getSerializedSize() + (computeTagSize(i11) * 2);
    }

    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    public static int computeInt32Size(int i11, int i12) {
        return computeInt32SizeNoTag(i12) + computeTagSize(i11);
    }

    public static int computeInt32SizeNoTag(int i11) {
        return computeUInt64SizeNoTag(i11);
    }

    public static int computeInt64Size(int i11, long j11) {
        return computeInt64SizeNoTag(j11) + computeTagSize(i11);
    }

    public static int computeInt64SizeNoTag(long j11) {
        return computeUInt64SizeNoTag(j11);
    }

    @Deprecated
    public static int computeLazyFieldMessageSetExtensionSize(int i11, r rVar) {
        return rVar.computeMessageSetExtensionSize(i11);
    }

    @Deprecated
    public static int computeLazyFieldSize(int i11, r rVar) {
        return rVar.computeSize(i11);
    }

    @Deprecated
    public static int computeLazyFieldSizeNoTag(r rVar) {
        return rVar.computeSizeNoTag();
    }

    static int computeLengthDelimitedFieldSize(int i11) {
        return computeUInt32SizeNoTag(i11) + i11;
    }

    public static int computeMessageSetExtensionSize(int i11, MessageLite messageLite) {
        return computeMessageSize(3, messageLite) + computeUInt32Size(2, i11) + (computeTagSize(1) * 2);
    }

    public static int computeMessageSize(int i11, MessageLite messageLite) {
        return computeMessageSizeNoTag(messageLite) + computeTagSize(i11);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
        return computeLengthDelimitedFieldSize(messageLite.getSerializedSize());
    }

    static int computePreferredBufferSize(int i11) {
        if (i11 > 4096) {
            return 4096;
        }
        return i11;
    }

    public static int computeRawMessageSetExtensionSize(int i11, ByteString byteString) {
        return computeBytesSize(3, byteString) + computeUInt32Size(2, i11) + (computeTagSize(1) * 2);
    }

    @Deprecated
    public static int computeRawVarint32Size(int i11) {
        return computeUInt32SizeNoTag(i11);
    }

    @Deprecated
    public static int computeRawVarint64Size(long j11) {
        return computeUInt64SizeNoTag(j11);
    }

    public static int computeSFixed32Size(int i11, int i12) {
        return computeSFixed32SizeNoTag(i12) + computeTagSize(i11);
    }

    public static int computeSFixed32SizeNoTag(int i11) {
        return 4;
    }

    public static int computeSFixed64Size(int i11, long j11) {
        return computeSFixed64SizeNoTag(j11) + computeTagSize(i11);
    }

    public static int computeSFixed64SizeNoTag(long j11) {
        return 8;
    }

    public static int computeSInt32Size(int i11, int i12) {
        return computeSInt32SizeNoTag(i12) + computeTagSize(i11);
    }

    public static int computeSInt32SizeNoTag(int i11) {
        return computeUInt32SizeNoTag(encodeZigZag32(i11));
    }

    public static int computeSInt64Size(int i11, long j11) {
        return computeSInt64SizeNoTag(j11) + computeTagSize(i11);
    }

    public static int computeSInt64SizeNoTag(long j11) {
        return computeUInt64SizeNoTag(encodeZigZag64(j11));
    }

    public static int computeStringSize(int i11, String str) {
        return computeStringSizeNoTag(str) + computeTagSize(i11);
    }

    public static int computeStringSizeNoTag(String str) {
        int length;
        try {
            length = Utf8.j(str);
        } catch (Utf8.c unused) {
            length = str.getBytes(Internal.f60125a).length;
        }
        return computeLengthDelimitedFieldSize(length);
    }

    public static int computeTagSize(int i11) {
        return computeUInt32SizeNoTag(i11 << 3);
    }

    public static int computeUInt32Size(int i11, int i12) {
        return computeUInt32SizeNoTag(i12) + computeTagSize(i11);
    }

    public static int computeUInt32SizeNoTag(int i11) {
        return (352 - (Integer.numberOfLeadingZeros(i11) * 9)) >>> 6;
    }

    public static int computeUInt64Size(int i11, long j11) {
        return computeUInt64SizeNoTag(j11) + computeTagSize(i11);
    }

    public static int computeUInt64SizeNoTag(long j11) {
        return (640 - (Long.numberOfLeadingZeros(j11) * 9)) >>> 6;
    }

    public static int encodeZigZag32(int i11) {
        return (i11 >> 31) ^ (i11 << 1);
    }

    public static long encodeZigZag64(long j11) {
        return (j11 >> 63) ^ (j11 << 1);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream) {
        return newInstance(outputStream, 4096);
    }

    static CodedOutputStream newSafeInstance(ByteBuffer byteBuffer) {
        return new SafeDirectNioEncoder(byteBuffer);
    }

    static CodedOutputStream newUnsafeInstance(ByteBuffer byteBuffer) {
        return new UnsafeDirectNioEncoder(byteBuffer);
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void flush() throws IOException;

    public abstract int getTotalBytesWritten();

    final void inefficientWriteStringNoTag(String str, Utf8.c cVar) throws IOException {
        logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) cVar);
        byte[] bytes = str.getBytes(Internal.f60125a);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e11) {
            throw new b(e11);
        }
    }

    boolean isSerializationDeterministic() {
        return this.serializationDeterministic;
    }

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.serializationDeterministic = true;
    }

    @Override // com.google.protobuf.AbstractC5953d
    public abstract void write(byte b11) throws IOException;

    @Override // com.google.protobuf.AbstractC5953d
    public abstract void write(ByteBuffer byteBuffer) throws IOException;

    @Override // com.google.protobuf.AbstractC5953d
    public abstract void write(byte[] bArr, int i11, int i12) throws IOException;

    public abstract void writeBool(int i11, boolean z11) throws IOException;

    public final void writeBoolNoTag(boolean z11) throws IOException {
        write(z11 ? (byte) 1 : (byte) 0);
    }

    public abstract void writeByteArray(int i11, byte[] bArr) throws IOException;

    public abstract void writeByteArray(int i11, byte[] bArr, int i12, int i13) throws IOException;

    public final void writeByteArrayNoTag(byte[] bArr) throws IOException {
        writeByteArrayNoTag(bArr, 0, bArr.length);
    }

    abstract void writeByteArrayNoTag(byte[] bArr, int i11, int i12) throws IOException;

    public abstract void writeByteBuffer(int i11, ByteBuffer byteBuffer) throws IOException;

    public abstract void writeBytes(int i11, ByteString byteString) throws IOException;

    public abstract void writeBytesNoTag(ByteString byteString) throws IOException;

    public final void writeDouble(int i11, double d11) throws IOException {
        writeFixed64(i11, Double.doubleToRawLongBits(d11));
    }

    public final void writeDoubleNoTag(double d11) throws IOException {
        writeFixed64NoTag(Double.doubleToRawLongBits(d11));
    }

    public final void writeEnum(int i11, int i12) throws IOException {
        writeInt32(i11, i12);
    }

    public final void writeEnumNoTag(int i11) throws IOException {
        writeInt32NoTag(i11);
    }

    public abstract void writeFixed32(int i11, int i12) throws IOException;

    public abstract void writeFixed32NoTag(int i11) throws IOException;

    public abstract void writeFixed64(int i11, long j11) throws IOException;

    public abstract void writeFixed64NoTag(long j11) throws IOException;

    public final void writeFloat(int i11, float f7) throws IOException {
        writeFixed32(i11, Float.floatToRawIntBits(f7));
    }

    public final void writeFloatNoTag(float f7) throws IOException {
        writeFixed32NoTag(Float.floatToRawIntBits(f7));
    }

    @Deprecated
    public final void writeGroup(int i11, MessageLite messageLite) throws IOException {
        writeTag(i11, 3);
        writeGroupNoTag(messageLite);
        writeTag(i11, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(MessageLite messageLite) throws IOException {
        messageLite.writeTo(this);
    }

    public abstract void writeInt32(int i11, int i12) throws IOException;

    public abstract void writeInt32NoTag(int i11) throws IOException;

    public final void writeInt64(int i11, long j11) throws IOException {
        writeUInt64(i11, j11);
    }

    public final void writeInt64NoTag(long j11) throws IOException {
        writeUInt64NoTag(j11);
    }

    @Override // com.google.protobuf.AbstractC5953d
    public abstract void writeLazy(ByteBuffer byteBuffer) throws IOException;

    @Override // com.google.protobuf.AbstractC5953d
    public abstract void writeLazy(byte[] bArr, int i11, int i12) throws IOException;

    public abstract void writeMessage(int i11, MessageLite messageLite) throws IOException;

    public abstract void writeMessageNoTag(MessageLite messageLite) throws IOException;

    public abstract void writeMessageSetExtension(int i11, MessageLite messageLite) throws IOException;

    public final void writeRawByte(byte b11) throws IOException {
        write(b11);
    }

    public abstract void writeRawBytes(ByteBuffer byteBuffer) throws IOException;

    public final void writeRawBytes(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Deprecated
    public final void writeRawLittleEndian32(int i11) throws IOException {
        writeFixed32NoTag(i11);
    }

    @Deprecated
    public final void writeRawLittleEndian64(long j11) throws IOException {
        writeFixed64NoTag(j11);
    }

    public abstract void writeRawMessageSetExtension(int i11, ByteString byteString) throws IOException;

    @Deprecated
    public final void writeRawVarint32(int i11) throws IOException {
        writeUInt32NoTag(i11);
    }

    @Deprecated
    public final void writeRawVarint64(long j11) throws IOException {
        writeUInt64NoTag(j11);
    }

    public final void writeSFixed32(int i11, int i12) throws IOException {
        writeFixed32(i11, i12);
    }

    public final void writeSFixed32NoTag(int i11) throws IOException {
        writeFixed32NoTag(i11);
    }

    public final void writeSFixed64(int i11, long j11) throws IOException {
        writeFixed64(i11, j11);
    }

    public final void writeSFixed64NoTag(long j11) throws IOException {
        writeFixed64NoTag(j11);
    }

    public final void writeSInt32(int i11, int i12) throws IOException {
        writeUInt32(i11, encodeZigZag32(i12));
    }

    public final void writeSInt32NoTag(int i11) throws IOException {
        writeUInt32NoTag(encodeZigZag32(i11));
    }

    public final void writeSInt64(int i11, long j11) throws IOException {
        writeUInt64(i11, encodeZigZag64(j11));
    }

    public final void writeSInt64NoTag(long j11) throws IOException {
        writeUInt64NoTag(encodeZigZag64(j11));
    }

    public abstract void writeString(int i11, String str) throws IOException;

    public abstract void writeStringNoTag(String str) throws IOException;

    public abstract void writeTag(int i11, int i12) throws IOException;

    public abstract void writeUInt32(int i11, int i12) throws IOException;

    public abstract void writeUInt32NoTag(int i11) throws IOException;

    public abstract void writeUInt64(int i11, long j11) throws IOException;

    public abstract void writeUInt64NoTag(long j11) throws IOException;

    private CodedOutputStream() {
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i11) {
        return new OutputStreamEncoder(outputStream, i11);
    }

    public final void writeRawByte(int i11) throws IOException {
        write((byte) i11);
    }

    public final void writeRawBytes(byte[] bArr, int i11, int i12) throws IOException {
        write(bArr, i11, i12);
    }

    public static CodedOutputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public final void writeRawBytes(ByteString byteString) throws IOException {
        byteString.writeTo(this);
    }

    public static CodedOutputStream newInstance(byte[] bArr, int i11, int i12) {
        return new ArrayEncoder(bArr, i11, i12);
    }

    public static CodedOutputStream newInstance(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new HeapNioEncoder(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            if (UnsafeDirectNioEncoder.isSupported()) {
                return newUnsafeInstance(byteBuffer);
            }
            return newSafeInstance(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    @Deprecated
    public static CodedOutputStream newInstance(ByteBuffer byteBuffer, int i11) {
        return newInstance(byteBuffer);
    }

    static CodedOutputStream newInstance(AbstractC5953d abstractC5953d, int i11) {
        if (i11 >= 0) {
            return new ByteOutputEncoder(abstractC5953d, i11);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }
}
