package com.google.protobuf;

import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.hwx;
import xsna.lhg;
import xsna.tgw;
import xsna.v5q0;

/* loaded from: classes.dex */
public abstract class CodedInputStream {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_SIZE_LIMIT = Integer.MAX_VALUE;
    private static volatile int defaultRecursionLimit = 100;
    int recursionDepth;
    int recursionLimit;
    private boolean shouldDiscardUnknownFields;
    int sizeLimit;
    com.google.protobuf.d wrapper;

    public static int decodeZigZag32(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long decodeZigZag64(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static CodedInputStream newInstance(InputStream inputStream) {
        return newInstance(inputStream, 4096);
    }

    public static int readRawVarint32(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            i2 |= (read & 127) << i3;
            if ((read & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if ((read2 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public abstract void checkLastTagWas(int i) throws InvalidProtocolBufferException;

    public void checkRecursionLimit() throws InvalidProtocolBufferException {
        if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    public final void discardUnknownFields() {
        this.shouldDiscardUnknownFields = true;
    }

    public abstract void enableAliasing(boolean z);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd() throws IOException;

    public abstract void popLimit(int i);

    public abstract int pushLimit(int i) throws InvalidProtocolBufferException;

    public abstract boolean readBool() throws IOException;

    public abstract byte[] readByteArray() throws IOException;

    public abstract ByteBuffer readByteBuffer() throws IOException;

    public abstract ByteString readBytes() throws IOException;

    public abstract double readDouble() throws IOException;

    public abstract int readEnum() throws IOException;

    public abstract int readFixed32() throws IOException;

    public abstract long readFixed64() throws IOException;

    public abstract float readFloat() throws IOException;

    public abstract <T extends MessageLite> T readGroup(int i, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract int readInt32() throws IOException;

    public abstract long readInt64() throws IOException;

    public abstract <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract byte readRawByte() throws IOException;

    public abstract byte[] readRawBytes(int i) throws IOException;

    public abstract int readRawLittleEndian32() throws IOException;

    public abstract long readRawLittleEndian64() throws IOException;

    public abstract int readRawVarint32() throws IOException;

    public abstract long readRawVarint64() throws IOException;

    public abstract long readRawVarint64SlowPath() throws IOException;

    public abstract int readSFixed32() throws IOException;

    public abstract long readSFixed64() throws IOException;

    public abstract int readSInt32() throws IOException;

    public abstract long readSInt64() throws IOException;

    public abstract String readString() throws IOException;

    public abstract String readStringRequireUtf8() throws IOException;

    public abstract int readTag() throws IOException;

    public abstract int readUInt32() throws IOException;

    public abstract long readUInt64() throws IOException;

    @Deprecated
    public abstract void readUnknownGroup(int i, MessageLite.Builder builder) throws IOException;

    public abstract void resetSizeCounter();

    public final int setRecursionLimit(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(lhg.a(i, "Recursion limit cannot be negative: "));
        }
        int i2 = this.recursionLimit;
        this.recursionLimit = i;
        return i2;
    }

    public final int setSizeLimit(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(lhg.a(i, "Size limit cannot be negative: "));
        }
        int i2 = this.sizeLimit;
        this.sizeLimit = i;
        return i2;
    }

    public final boolean shouldDiscardUnknownFields() {
        return this.shouldDiscardUnknownFields;
    }

    public abstract boolean skipField(int i) throws IOException;

    @Deprecated
    public abstract boolean skipField(int i, CodedOutputStream codedOutputStream) throws IOException;

    public void skipMessage() throws IOException {
        int readTag;
        do {
            readTag = readTag();
            if (readTag == 0) {
                return;
            }
            checkRecursionLimit();
            this.recursionDepth++;
            this.recursionDepth--;
        } while (skipField(readTag));
    }

    public abstract void skipRawBytes(int i) throws IOException;

    public final void unsetDiscardUnknownFields() {
        this.shouldDiscardUnknownFields = false;
    }

    private CodedInputStream() {
        this.recursionLimit = defaultRecursionLimit;
        this.sizeLimit = Integer.MAX_VALUE;
        this.shouldDiscardUnknownFields = false;
    }

    public static CodedInputStream newInstance(InputStream inputStream, int i) {
        if (i > 0) {
            return inputStream == null ? newInstance(Internal.EMPTY_BYTE_ARRAY) : new d(inputStream, i);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static final class b extends CodedInputStream {
        public final byte[] a;
        public final boolean b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public int i;

        public b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.i = Integer.MAX_VALUE;
            this.a = bArr;
            this.c = i2 + i;
            this.e = i;
            this.f = i;
            this.b = z;
        }

        public final void a() {
            int i = this.c + this.d;
            this.c = i;
            int i2 = i - this.f;
            int i3 = this.i;
            if (i2 <= i3) {
                this.d = 0;
                return;
            }
            int i4 = i2 - i3;
            this.d = i4;
            this.c = i - i4;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void checkLastTagWas(int i) throws InvalidProtocolBufferException {
            if (this.g != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void enableAliasing(boolean z) {
            this.h = z;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int getBytesUntilLimit() {
            int i = this.i;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int getLastTag() {
            return this.g;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int getTotalBytesRead() {
            return this.e - this.f;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean isAtEnd() throws IOException {
            return this.e == this.c;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void popLimit(int i) {
            this.i = i;
            a();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int pushLimit(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = getTotalBytesRead() + i;
            if (totalBytesRead < 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            int i2 = this.i;
            if (totalBytesRead > i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.i = totalBytesRead;
            a();
            return i2;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final ByteBuffer readByteBuffer() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.c;
                int i2 = this.e;
                if (readRawVarint32 <= i - i2) {
                    boolean z = this.b;
                    byte[] bArr = this.a;
                    ByteBuffer wrap = (z || !this.h) ? ByteBuffer.wrap(Arrays.copyOfRange(bArr, i2, i2 + readRawVarint32)) : ByteBuffer.wrap(bArr, i2, readRawVarint32).slice();
                    this.e += readRawVarint32;
                    return wrap;
                }
            }
            if (readRawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (readRawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final ByteString readBytes() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.c;
                int i2 = this.e;
                if (readRawVarint32 <= i - i2) {
                    boolean z = this.b;
                    byte[] bArr = this.a;
                    ByteString wrap = (z && this.h) ? ByteString.wrap(bArr, i2, readRawVarint32) : ByteString.copyFrom(bArr, i2, readRawVarint32);
                    this.e += readRawVarint32;
                    return wrap;
                }
            }
            return readRawVarint32 == 0 ? ByteString.EMPTY : ByteString.wrap(readRawBytes(readRawVarint32));
        }

        @Override // com.google.protobuf.CodedInputStream
        public final double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(pushLimit);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final byte readRawByte() throws IOException {
            int i = this.e;
            if (i == this.c) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.e = i + 1;
            return this.a[i];
        }

        @Override // com.google.protobuf.CodedInputStream
        public final byte[] readRawBytes(int i) throws IOException {
            if (i > 0) {
                int i2 = this.c;
                int i3 = this.e;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.e = i4;
                    return Arrays.copyOfRange(this.a, i3, i4);
                }
            }
            if (i > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readRawLittleEndian32() throws IOException {
            int i = this.e;
            if (this.c - i < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.e = i + 4;
            byte[] bArr = this.a;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readRawLittleEndian64() throws IOException {
            int i = this.e;
            if (this.c - i < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.e = i + 8;
            byte[] bArr = this.a;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readRawVarint32() throws IOException {
            int i;
            int i2 = this.e;
            int i3 = this.c;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.a;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.e = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << AmfConstants.TYPE_RECORDSET_MARKER) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.e = i5;
                    return i;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readRawVarint64() throws IOException {
            long j;
            long j2;
            long j3;
            long j4;
            int i = this.e;
            int i2 = this.c;
            if (i2 != i) {
                int i3 = i + 1;
                byte[] bArr = this.a;
                byte b = bArr[i];
                if (b >= 0) {
                    this.e = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << AmfConstants.TYPE_RECORDSET_MARKER) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << 21);
                            if (i9 < 0) {
                                j4 = (-2080896) ^ i9;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (bArr[i8] << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    i8 = i + 6;
                                    long j7 = j6 ^ (bArr[i4] << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (bArr[i8] << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i + 8;
                                            j7 = j6 ^ (bArr[i4] << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (bArr[i8] << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i10 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i10;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j4 = j2 ^ j7;
                                }
                                j = j3 ^ j6;
                            }
                            i4 = i8;
                            j = j4;
                        }
                    }
                    this.e = i4;
                    return j;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readRawVarint64SlowPath() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((readRawByte() & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readSInt32() throws IOException {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readSInt64() throws IOException {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final String readString() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.c;
                int i2 = this.e;
                if (readRawVarint32 <= i - i2) {
                    String str = new String(this.a, i2, readRawVarint32, Internal.UTF_8);
                    this.e += readRawVarint32;
                    return str;
                }
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final String readStringRequireUtf8() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.c;
                int i2 = this.e;
                if (readRawVarint32 <= i - i2) {
                    String h = b0.a.h(i2, readRawVarint32, this.a);
                    this.e += readRawVarint32;
                    return h;
                }
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readTag() throws IOException {
            if (isAtEnd()) {
                this.g = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.g = readRawVarint32;
            if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
                return this.g;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        @Deprecated
        public final void readUnknownGroup(int i, MessageLite.Builder builder) throws IOException {
            readGroup(i, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void resetSizeCounter() {
            this.f = this.e;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean skipField(int i) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i);
            int i2 = 0;
            if (tagWireType == 0) {
                if (this.c - this.e < 10) {
                    while (i2 < 10) {
                        if (readRawByte() < 0) {
                            i2++;
                        }
                    }
                    throw InvalidProtocolBufferException.malformedVarint();
                }
                while (i2 < 10) {
                    int i3 = this.e;
                    this.e = i3 + 1;
                    if (this.a[i3] < 0) {
                        i2++;
                    }
                }
                throw InvalidProtocolBufferException.malformedVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void skipRawBytes(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.c;
                int i3 = this.e;
                if (i <= i2 - i3) {
                    this.e = i3 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final <T extends MessageLite> T readGroup(int i, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i, 4));
            this.recursionDepth--;
            return parsePartialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(pushLimit);
                return parsePartialFrom;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean skipField(int i, CodedOutputStream codedOutputStream) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                long readRawVarint64 = readRawVarint64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeUInt64NoTag(readRawVarint64);
                return true;
            }
            if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString readBytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i);
                skipMessage(codedOutputStream);
                int makeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4);
                checkLastTagWas(makeTag);
                codedOutputStream.writeUInt32NoTag(makeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int readRawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    /* loaded from: classes13.dex */
    public static final class c extends CodedInputStream {
        public final Iterable<ByteBuffer> a;
        public final Iterator<ByteBuffer> b;
        public ByteBuffer c;
        public final boolean d;
        public boolean e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public long l;
        public long m;
        public long n;
        public long o;

        public c(Iterable iterable, int i, boolean z) {
            super();
            this.h = Integer.MAX_VALUE;
            this.f = i;
            this.a = iterable;
            this.b = iterable.iterator();
            this.d = z;
            this.j = 0;
            this.k = 0;
            if (i != 0) {
                g();
                return;
            }
            this.c = Internal.EMPTY_BYTE_BUFFER;
            this.l = 0L;
            this.m = 0L;
            this.o = 0L;
            this.n = 0L;
        }

        public final long a() {
            return this.o - this.l;
        }

        public final void b() throws InvalidProtocolBufferException {
            if (!this.b.hasNext()) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            g();
        }

        public final void c(int i, byte[] bArr) throws IOException {
            if (i < 0 || i > e()) {
                if (i > 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i != 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                return;
            }
            int i2 = i;
            while (i2 > 0) {
                if (a() == 0) {
                    b();
                }
                int min = Math.min(i2, (int) a());
                long j = min;
                v5q0.f(this.l, bArr, i - i2, j);
                i2 -= min;
                this.l += j;
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void checkLastTagWas(int i) throws InvalidProtocolBufferException {
            if (this.i != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        public final void d() {
            int i = this.f + this.g;
            this.f = i;
            int i2 = i - this.k;
            int i3 = this.h;
            if (i2 <= i3) {
                this.g = 0;
                return;
            }
            int i4 = i2 - i3;
            this.g = i4;
            this.f = i - i4;
        }

        public final int e() {
            return (int) (((this.f - this.j) - this.l) + this.m);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void enableAliasing(boolean z) {
            this.e = z;
        }

        public final ByteBuffer f(int i, int i2) throws IOException {
            int position = this.c.position();
            int limit = this.c.limit();
            ByteBuffer byteBuffer = this.c;
            try {
                try {
                    byteBuffer.position(i);
                    byteBuffer.limit(i2);
                    return this.c.slice();
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            } finally {
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }

        public final void g() {
            ByteBuffer next = this.b.next();
            this.c = next;
            this.j += (int) (this.l - this.m);
            long position = next.position();
            this.l = position;
            this.m = position;
            this.o = this.c.limit();
            long b = v5q0.b(this.c);
            this.n = b;
            this.l += b;
            this.m += b;
            this.o += b;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int getBytesUntilLimit() {
            int i = this.h;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int getLastTag() {
            return this.i;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int getTotalBytesRead() {
            return (int) (((this.j - this.k) + this.l) - this.m);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean isAtEnd() throws IOException {
            return (((long) this.j) + this.l) - this.m == ((long) this.f);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void popLimit(int i) {
            this.h = i;
            d();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int pushLimit(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = getTotalBytesRead() + i;
            int i2 = this.h;
            if (totalBytesRead > i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.h = totalBytesRead;
            d();
            return i2;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final ByteBuffer readByteBuffer() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = readRawVarint32;
                if (j <= a()) {
                    if (this.d || !this.e) {
                        byte[] bArr = new byte[readRawVarint32];
                        v5q0.f(this.l, bArr, 0L, j);
                        this.l += j;
                        return ByteBuffer.wrap(bArr);
                    }
                    long j2 = this.l + j;
                    this.l = j2;
                    long j3 = j2 - this.n;
                    return f((int) (j3 - j), (int) j3);
                }
            }
            if (readRawVarint32 > 0 && readRawVarint32 <= e()) {
                byte[] bArr2 = new byte[readRawVarint32];
                c(readRawVarint32, bArr2);
                return ByteBuffer.wrap(bArr2);
            }
            if (readRawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (readRawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final ByteString readBytes() throws IOException {
            int readRawVarint32 = readRawVarint32();
            boolean z = this.d;
            if (readRawVarint32 > 0) {
                long j = readRawVarint32;
                long j2 = this.o;
                long j3 = this.l;
                if (j <= j2 - j3) {
                    if (z && this.e) {
                        int i = (int) (j3 - this.n);
                        ByteString wrap = ByteString.wrap(f(i, readRawVarint32 + i));
                        this.l += j;
                        return wrap;
                    }
                    byte[] bArr = new byte[readRawVarint32];
                    v5q0.f(j3, bArr, 0L, j);
                    this.l += j;
                    return ByteString.wrap(bArr);
                }
            }
            if (readRawVarint32 <= 0 || readRawVarint32 > e()) {
                if (readRawVarint32 == 0) {
                    return ByteString.EMPTY;
                }
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (!z || !this.e) {
                byte[] bArr2 = new byte[readRawVarint32];
                c(readRawVarint32, bArr2);
                return ByteString.wrap(bArr2);
            }
            ArrayList arrayList = new ArrayList();
            while (readRawVarint32 > 0) {
                if (a() == 0) {
                    b();
                }
                int min = Math.min(readRawVarint32, (int) a());
                int i2 = (int) (this.l - this.n);
                arrayList.add(ByteString.wrap(f(i2, i2 + min)));
                readRawVarint32 -= min;
                this.l += min;
            }
            return ByteString.copyFrom(arrayList);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(pushLimit);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final byte readRawByte() throws IOException {
            if (a() == 0) {
                b();
            }
            long j = this.l;
            this.l = 1 + j;
            return v5q0.c.f(j);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final byte[] readRawBytes(int i) throws IOException {
            if (i >= 0) {
                long j = i;
                if (j <= a()) {
                    byte[] bArr = new byte[i];
                    v5q0.f(this.l, bArr, 0L, j);
                    this.l += j;
                    return bArr;
                }
            }
            if (i >= 0 && i <= e()) {
                byte[] bArr2 = new byte[i];
                c(i, bArr2);
                return bArr2;
            }
            if (i > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readRawLittleEndian32() throws IOException {
            if (a() < 4) {
                return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24);
            }
            long j = this.l;
            this.l = 4 + j;
            v5q0.d dVar = v5q0.c;
            return ((dVar.f(j + 3) & 255) << 24) | (dVar.f(j) & 255) | ((dVar.f(1 + j) & 255) << 8) | ((dVar.f(2 + j) & 255) << 16);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readRawLittleEndian64() throws IOException {
            if (a() < 8) {
                return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24) | ((readRawByte() & 255) << 32) | ((readRawByte() & 255) << 40) | ((readRawByte() & 255) << 48) | ((readRawByte() & 255) << 56);
            }
            this.l = 8 + this.l;
            v5q0.d dVar = v5q0.c;
            return (dVar.f(r13) & 255) | ((dVar.f(r13 + 1) & 255) << 8) | ((dVar.f(r13 + 2) & 255) << 16) | ((dVar.f(3 + r13) & 255) << 24) | ((dVar.f(4 + r13) & 255) << 32) | ((dVar.f(5 + r13) & 255) << 40) | ((dVar.f(6 + r13) & 255) << 48) | ((dVar.f(r13 + 7) & 255) << 56);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readRawVarint32() throws IOException {
            int i;
            long j = this.l;
            if (this.o != j) {
                long j2 = j + 1;
                v5q0.d dVar = v5q0.c;
                byte f = dVar.f(j);
                if (f >= 0) {
                    this.l++;
                    return f;
                }
                if (this.o - this.l >= 10) {
                    long j3 = 2 + j;
                    int f2 = (dVar.f(j2) << 7) ^ f;
                    if (f2 < 0) {
                        i = f2 ^ (-128);
                    } else {
                        long j4 = 3 + j;
                        int f3 = (dVar.f(j3) << AmfConstants.TYPE_RECORDSET_MARKER) ^ f2;
                        if (f3 >= 0) {
                            i = f3 ^ 16256;
                        } else {
                            long j5 = 4 + j;
                            int f4 = f3 ^ (dVar.f(j4) << 21);
                            if (f4 < 0) {
                                i = (-2080896) ^ f4;
                            } else {
                                j4 = 5 + j;
                                byte f5 = dVar.f(j5);
                                int i2 = (f4 ^ (f5 << 28)) ^ 266354560;
                                if (f5 < 0) {
                                    j5 = 6 + j;
                                    if (dVar.f(j4) < 0) {
                                        j4 = 7 + j;
                                        if (dVar.f(j5) < 0) {
                                            j5 = 8 + j;
                                            if (dVar.f(j4) < 0) {
                                                j4 = 9 + j;
                                                if (dVar.f(j5) < 0) {
                                                    long j6 = j + 10;
                                                    if (dVar.f(j4) >= 0) {
                                                        i = i2;
                                                        j3 = j6;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i2;
                                }
                                i = i2;
                            }
                            j3 = j5;
                        }
                        j3 = j4;
                    }
                    this.l = j3;
                    return i;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readRawVarint64() throws IOException {
            long j;
            long j2;
            long j3;
            long j4 = this.l;
            if (this.o != j4) {
                long j5 = j4 + 1;
                v5q0.d dVar = v5q0.c;
                byte f = dVar.f(j4);
                if (f >= 0) {
                    this.l++;
                    return f;
                }
                if (this.o - this.l >= 10) {
                    long j6 = 2 + j4;
                    int f2 = (dVar.f(j5) << 7) ^ f;
                    if (f2 < 0) {
                        j = f2 ^ (-128);
                    } else {
                        long j7 = 3 + j4;
                        int f3 = (dVar.f(j6) << AmfConstants.TYPE_RECORDSET_MARKER) ^ f2;
                        if (f3 >= 0) {
                            j = f3 ^ 16256;
                        } else {
                            long j8 = 4 + j4;
                            int f4 = f3 ^ (dVar.f(j7) << 21);
                            if (f4 < 0) {
                                j = (-2080896) ^ f4;
                                j6 = j8;
                            } else {
                                long j9 = 5 + j4;
                                long f5 = (dVar.f(j8) << 28) ^ f4;
                                if (f5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    j7 = 6 + j4;
                                    long f6 = f5 ^ (dVar.f(j9) << 35);
                                    if (f6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j9 = 7 + j4;
                                        f5 = f6 ^ (dVar.f(j7) << 42);
                                        if (f5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j7 = 8 + j4;
                                            f6 = f5 ^ (dVar.f(j9) << 49);
                                            if (f6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j9 = 9 + j4;
                                                long f7 = (f6 ^ (dVar.f(j7) << 56)) ^ 71499008037633920L;
                                                if (f7 < 0) {
                                                    long j10 = j4 + 10;
                                                    if (dVar.f(j9) >= 0) {
                                                        j6 = j10;
                                                        j = f7;
                                                    }
                                                } else {
                                                    j = f7;
                                                    j6 = j9;
                                                }
                                            }
                                        }
                                    }
                                    j = j2 ^ f6;
                                }
                                j = j3 ^ f5;
                                j6 = j9;
                            }
                        }
                        j6 = j7;
                    }
                    this.l = j6;
                    return j;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readRawVarint64SlowPath() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((readRawByte() & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readSInt32() throws IOException {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readSInt64() throws IOException {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final String readString() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = readRawVarint32;
                long j2 = this.o;
                long j3 = this.l;
                if (j <= j2 - j3) {
                    byte[] bArr = new byte[readRawVarint32];
                    v5q0.f(j3, bArr, 0L, j);
                    String str = new String(bArr, Internal.UTF_8);
                    this.l += j;
                    return str;
                }
            }
            if (readRawVarint32 > 0 && readRawVarint32 <= e()) {
                byte[] bArr2 = new byte[readRawVarint32];
                c(readRawVarint32, bArr2);
                return new String(bArr2, Internal.UTF_8);
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final String readStringRequireUtf8() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = readRawVarint32;
                long j2 = this.o;
                long j3 = this.l;
                if (j <= j2 - j3) {
                    String c = b0.c(this.c, (int) (j3 - this.m), readRawVarint32);
                    this.l += j;
                    return c;
                }
            }
            if (readRawVarint32 >= 0 && readRawVarint32 <= e()) {
                byte[] bArr = new byte[readRawVarint32];
                c(readRawVarint32, bArr);
                return b0.a.h(0, readRawVarint32, bArr);
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readTag() throws IOException {
            if (isAtEnd()) {
                this.i = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.i = readRawVarint32;
            if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
                return this.i;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        @Deprecated
        public final void readUnknownGroup(int i, MessageLite.Builder builder) throws IOException {
            readGroup(i, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void resetSizeCounter() {
            this.k = (int) ((this.j + this.l) - this.m);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean skipField(int i) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                for (int i2 = 0; i2 < 10; i2++) {
                    if (readRawByte() >= 0) {
                        return true;
                    }
                }
                throw InvalidProtocolBufferException.malformedVarint();
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void skipRawBytes(int i) throws IOException {
            if (i < 0 || i > ((this.f - this.j) - this.l) + this.m) {
                if (i >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            while (i > 0) {
                if (a() == 0) {
                    b();
                }
                int min = Math.min(i, (int) a());
                i -= min;
                this.l += min;
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public final <T extends MessageLite> T readGroup(int i, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i, 4));
            this.recursionDepth--;
            return parsePartialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(pushLimit);
                return parsePartialFrom;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean skipField(int i, CodedOutputStream codedOutputStream) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                long readRawVarint64 = readRawVarint64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeUInt64NoTag(readRawVarint64);
                return true;
            }
            if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString readBytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i);
                skipMessage(codedOutputStream);
                int makeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4);
                checkLastTagWas(makeTag);
                codedOutputStream.writeUInt32NoTag(makeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int readRawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    /* loaded from: classes13.dex */
    public static final class d extends CodedInputStream {
        public final InputStream a;
        public final byte[] b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;

        public d(InputStream inputStream, int i) {
            super();
            this.h = Integer.MAX_VALUE;
            Internal.checkNotNull(inputStream, "input");
            this.a = inputStream;
            this.b = new byte[i];
            this.c = 0;
            this.e = 0;
            this.g = 0;
        }

        public final byte[] a(int i, boolean z) throws IOException {
            byte[] b = b(i);
            if (b != null) {
                return z ? (byte[]) b.clone() : b;
            }
            int i2 = this.e;
            int i3 = this.c;
            int i4 = i3 - i2;
            this.g += i3;
            this.e = 0;
            this.c = 0;
            ArrayList c = c(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.b, i2, bArr, 0, i4);
            Iterator it = c.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return bArr;
        }

        public final byte[] b(int i) throws IOException {
            if (i == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i2 = this.g;
            int i3 = this.e;
            int i4 = i2 + i3 + i;
            if (i4 - this.sizeLimit > 0) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            int i5 = this.h;
            if (i4 > i5) {
                skipRawBytes((i5 - i2) - i3);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            int i6 = this.c - i3;
            int i7 = i - i6;
            InputStream inputStream = this.a;
            if (i7 >= 4096) {
                try {
                    if (i7 > inputStream.available()) {
                        return null;
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.setThrownFromInputStream();
                    throw e;
                }
            }
            byte[] bArr = new byte[i];
            System.arraycopy(this.b, this.e, bArr, 0, i6);
            this.g += this.c;
            this.e = 0;
            this.c = 0;
            while (i6 < i) {
                try {
                    int read = inputStream.read(bArr, i6, i - i6);
                    if (read == -1) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.g += read;
                    i6 += read;
                } catch (InvalidProtocolBufferException e2) {
                    e2.setThrownFromInputStream();
                    throw e2;
                }
            }
            return bArr;
        }

        public final ArrayList c(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, 4096);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.a.read(bArr, i2, min - i2);
                    if (read == -1) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.g += read;
                    i2 += read;
                }
                i -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void checkLastTagWas(int i) throws InvalidProtocolBufferException {
            if (this.f != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        public final void d() {
            int i = this.c + this.d;
            this.c = i;
            int i2 = this.g + i;
            int i3 = this.h;
            if (i2 <= i3) {
                this.d = 0;
                return;
            }
            int i4 = i2 - i3;
            this.d = i4;
            this.c = i - i4;
        }

        public final void e(int i) throws IOException {
            if (f(i)) {
                return;
            }
            if (i <= (this.sizeLimit - this.g) - this.e) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }

        public final boolean f(int i) throws IOException {
            InputStream inputStream = this.a;
            int i2 = this.e;
            int i3 = i2 + i;
            int i4 = this.c;
            if (i3 <= i4) {
                throw new IllegalStateException(tgw.b(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            }
            int i5 = this.sizeLimit;
            int i6 = this.g;
            if (i <= (i5 - i6) - i2 && i6 + i2 + i <= this.h) {
                byte[] bArr = this.b;
                if (i2 > 0) {
                    if (i4 > i2) {
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.g += i2;
                    this.c -= i2;
                    this.e = 0;
                }
                int i7 = this.c;
                try {
                    int read = inputStream.read(bArr, i7, Math.min(bArr.length - i7, (this.sizeLimit - this.g) - i7));
                    if (read == 0 || read < -1 || read > bArr.length) {
                        throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                    }
                    if (read > 0) {
                        this.c += read;
                        d();
                        if (this.c >= i) {
                            return true;
                        }
                        return f(i);
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.setThrownFromInputStream();
                    throw e;
                }
            }
            return false;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int getBytesUntilLimit() {
            int i = this.h;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - (this.g + this.e);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int getLastTag() {
            return this.f;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int getTotalBytesRead() {
            return this.g + this.e;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean isAtEnd() throws IOException {
            return this.e == this.c && !f(1);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void popLimit(int i) {
            this.h = i;
            d();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int pushLimit(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i2 = this.g + this.e + i;
            int i3 = this.h;
            if (i2 > i3) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.h = i2;
            d();
            return i3;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final byte[] readByteArray() throws IOException {
            int readRawVarint32 = readRawVarint32();
            int i = this.c;
            int i2 = this.e;
            if (readRawVarint32 > i - i2 || readRawVarint32 <= 0) {
                if (readRawVarint32 >= 0) {
                    return a(readRawVarint32, false);
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            byte[] copyOfRange = Arrays.copyOfRange(this.b, i2, i2 + readRawVarint32);
            this.e += readRawVarint32;
            return copyOfRange;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final ByteBuffer readByteBuffer() throws IOException {
            int readRawVarint32 = readRawVarint32();
            int i = this.c;
            int i2 = this.e;
            if (readRawVarint32 <= i - i2 && readRawVarint32 > 0) {
                ByteBuffer wrap = ByteBuffer.wrap(Arrays.copyOfRange(this.b, i2, i2 + readRawVarint32));
                this.e += readRawVarint32;
                return wrap;
            }
            if (readRawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (readRawVarint32 >= 0) {
                return ByteBuffer.wrap(a(readRawVarint32, true));
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final ByteString readBytes() throws IOException {
            int readRawVarint32 = readRawVarint32();
            int i = this.c;
            int i2 = this.e;
            int i3 = i - i2;
            byte[] bArr = this.b;
            if (readRawVarint32 <= i3 && readRawVarint32 > 0) {
                ByteString copyFrom = ByteString.copyFrom(bArr, i2, readRawVarint32);
                this.e += readRawVarint32;
                return copyFrom;
            }
            if (readRawVarint32 == 0) {
                return ByteString.EMPTY;
            }
            if (readRawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            byte[] b = b(readRawVarint32);
            if (b != null) {
                return ByteString.copyFrom(b);
            }
            int i4 = this.e;
            int i5 = this.c;
            int i6 = i5 - i4;
            this.g += i5;
            this.e = 0;
            this.c = 0;
            ArrayList c = c(readRawVarint32 - i6);
            byte[] bArr2 = new byte[readRawVarint32];
            System.arraycopy(bArr, i4, bArr2, 0, i6);
            Iterator it = c.iterator();
            while (it.hasNext()) {
                byte[] bArr3 = (byte[]) it.next();
                System.arraycopy(bArr3, 0, bArr2, i6, bArr3.length);
                i6 += bArr3.length;
            }
            return ByteString.wrap(bArr2);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(pushLimit);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final byte readRawByte() throws IOException {
            if (this.e == this.c) {
                e(1);
            }
            int i = this.e;
            this.e = i + 1;
            return this.b[i];
        }

        @Override // com.google.protobuf.CodedInputStream
        public final byte[] readRawBytes(int i) throws IOException {
            int i2 = this.e;
            if (i > this.c - i2 || i <= 0) {
                return a(i, false);
            }
            int i3 = i + i2;
            this.e = i3;
            return Arrays.copyOfRange(this.b, i2, i3);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readRawLittleEndian32() throws IOException {
            int i = this.e;
            if (this.c - i < 4) {
                e(4);
                i = this.e;
            }
            this.e = i + 4;
            byte[] bArr = this.b;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readRawLittleEndian64() throws IOException {
            int i = this.e;
            if (this.c - i < 8) {
                e(8);
                i = this.e;
            }
            this.e = i + 8;
            byte[] bArr = this.b;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readRawVarint32() throws IOException {
            int i;
            int i2 = this.e;
            int i3 = this.c;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.b;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.e = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << AmfConstants.TYPE_RECORDSET_MARKER) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.e = i5;
                    return i;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readRawVarint64() throws IOException {
            long j;
            long j2;
            long j3;
            long j4;
            int i = this.e;
            int i2 = this.c;
            if (i2 != i) {
                int i3 = i + 1;
                byte[] bArr = this.b;
                byte b = bArr[i];
                if (b >= 0) {
                    this.e = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << AmfConstants.TYPE_RECORDSET_MARKER) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << 21);
                            if (i9 < 0) {
                                j4 = (-2080896) ^ i9;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (bArr[i8] << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    i8 = i + 6;
                                    long j7 = j6 ^ (bArr[i4] << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (bArr[i8] << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i + 8;
                                            j7 = j6 ^ (bArr[i4] << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (bArr[i8] << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i10 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i10;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j4 = j2 ^ j7;
                                }
                                j = j3 ^ j6;
                            }
                            i4 = i8;
                            j = j4;
                        }
                    }
                    this.e = i4;
                    return j;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readRawVarint64SlowPath() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((readRawByte() & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readSInt32() throws IOException {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readSInt64() throws IOException {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final String readString() throws IOException {
            int readRawVarint32 = readRawVarint32();
            byte[] bArr = this.b;
            if (readRawVarint32 > 0) {
                int i = this.c;
                int i2 = this.e;
                if (readRawVarint32 <= i - i2) {
                    String str = new String(bArr, i2, readRawVarint32, Internal.UTF_8);
                    this.e += readRawVarint32;
                    return str;
                }
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (readRawVarint32 > this.c) {
                return new String(a(readRawVarint32, false), Internal.UTF_8);
            }
            e(readRawVarint32);
            String str2 = new String(bArr, this.e, readRawVarint32, Internal.UTF_8);
            this.e += readRawVarint32;
            return str2;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final String readStringRequireUtf8() throws IOException {
            int readRawVarint32 = readRawVarint32();
            int i = this.e;
            int i2 = this.c;
            int i3 = i2 - i;
            byte[] bArr = this.b;
            if (readRawVarint32 <= i3 && readRawVarint32 > 0) {
                this.e = i + readRawVarint32;
            } else {
                if (readRawVarint32 == 0) {
                    return "";
                }
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                i = 0;
                if (readRawVarint32 <= i2) {
                    e(readRawVarint32);
                    this.e = readRawVarint32;
                } else {
                    bArr = a(readRawVarint32, false);
                }
            }
            return b0.a.h(i, readRawVarint32, bArr);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readTag() throws IOException {
            if (isAtEnd()) {
                this.f = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.f = readRawVarint32;
            if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
                return this.f;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        @Deprecated
        public final void readUnknownGroup(int i, MessageLite.Builder builder) throws IOException {
            readGroup(i, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void resetSizeCounter() {
            this.g = -this.e;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean skipField(int i) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i);
            int i2 = 0;
            if (tagWireType == 0) {
                if (this.c - this.e < 10) {
                    while (i2 < 10) {
                        if (readRawByte() < 0) {
                            i2++;
                        }
                    }
                    throw InvalidProtocolBufferException.malformedVarint();
                }
                while (i2 < 10) {
                    int i3 = this.e;
                    this.e = i3 + 1;
                    if (this.b[i3] < 0) {
                        i2++;
                    }
                }
                throw InvalidProtocolBufferException.malformedVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void skipRawBytes(int i) throws IOException {
            int i2 = this.c;
            int i3 = this.e;
            if (i <= i2 - i3 && i >= 0) {
                this.e = i3 + i;
                return;
            }
            InputStream inputStream = this.a;
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i4 = this.g;
            int i5 = i4 + i3;
            int i6 = i5 + i;
            int i7 = this.h;
            if (i6 > i7) {
                skipRawBytes((i7 - i4) - i3);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.g = i5;
            int i8 = i2 - i3;
            this.c = 0;
            this.e = 0;
            while (i8 < i) {
                long j = i - i8;
                try {
                    try {
                        long skip = inputStream.skip(j);
                        if (skip < 0 || skip > j) {
                            throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                        }
                        if (skip == 0) {
                            break;
                        } else {
                            i8 += (int) skip;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        e.setThrownFromInputStream();
                        throw e;
                    }
                } catch (Throwable th) {
                    this.g += i8;
                    d();
                    throw th;
                }
            }
            this.g += i8;
            d();
            if (i8 >= i) {
                return;
            }
            int i9 = this.c;
            int i10 = i9 - this.e;
            this.e = i9;
            e(1);
            while (true) {
                int i11 = i - i10;
                int i12 = this.c;
                if (i11 <= i12) {
                    this.e = i11;
                    return;
                } else {
                    i10 += i12;
                    this.e = i12;
                    e(1);
                }
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public final <T extends MessageLite> T readGroup(int i, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i, 4));
            this.recursionDepth--;
            return parsePartialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(pushLimit);
                return parsePartialFrom;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean skipField(int i, CodedOutputStream codedOutputStream) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                long readRawVarint64 = readRawVarint64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeUInt64NoTag(readRawVarint64);
                return true;
            }
            if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString readBytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i);
                skipMessage(codedOutputStream);
                int makeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4);
                checkLastTagWas(makeTag);
                codedOutputStream.writeUInt32NoTag(makeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int readRawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void enableAliasing(boolean z) {
        }
    }

    /* loaded from: classes13.dex */
    public static final class e extends CodedInputStream {
        public final ByteBuffer a;
        public final boolean b;
        public final long c;
        public long d;
        public long e;
        public long f;
        public int g;
        public int h;
        public boolean i;
        public int j;

        public e(ByteBuffer byteBuffer, boolean z) {
            super();
            this.j = Integer.MAX_VALUE;
            this.a = byteBuffer;
            long b = v5q0.b(byteBuffer);
            this.c = b;
            this.d = byteBuffer.limit() + b;
            long position = b + byteBuffer.position();
            this.e = position;
            this.f = position;
            this.b = z;
        }

        public static boolean a() {
            return v5q0.d;
        }

        public final void b() {
            long j = this.d + this.g;
            this.d = j;
            int i = (int) (j - this.f);
            int i2 = this.j;
            if (i <= i2) {
                this.g = 0;
                return;
            }
            int i3 = i - i2;
            this.g = i3;
            this.d = j - i3;
        }

        public final int c() {
            return (int) (this.d - this.e);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void checkLastTagWas(int i) throws InvalidProtocolBufferException {
            if (this.h != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        public final ByteBuffer d(long j, long j2) throws IOException {
            long j3 = this.c;
            ByteBuffer byteBuffer = this.a;
            int position = byteBuffer.position();
            int limit = byteBuffer.limit();
            try {
                try {
                    byteBuffer.position((int) (j - j3));
                    byteBuffer.limit((int) (j2 - j3));
                    return byteBuffer.slice();
                } catch (IllegalArgumentException e) {
                    InvalidProtocolBufferException truncatedMessage = InvalidProtocolBufferException.truncatedMessage();
                    truncatedMessage.initCause(e);
                    throw truncatedMessage;
                }
            } finally {
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void enableAliasing(boolean z) {
            this.i = z;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int getBytesUntilLimit() {
            int i = this.j;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int getLastTag() {
            return this.h;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int getTotalBytesRead() {
            return (int) (this.e - this.f);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean isAtEnd() throws IOException {
            return this.e == this.d;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void popLimit(int i) {
            this.j = i;
            b();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int pushLimit(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = getTotalBytesRead() + i;
            int i2 = this.j;
            if (totalBytesRead > i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.j = totalBytesRead;
            b();
            return i2;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final ByteBuffer readByteBuffer() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 <= 0 || readRawVarint32 > c()) {
                if (readRawVarint32 == 0) {
                    return Internal.EMPTY_BYTE_BUFFER;
                }
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.b || !this.i) {
                byte[] bArr = new byte[readRawVarint32];
                long j = readRawVarint32;
                v5q0.f(this.e, bArr, 0L, j);
                this.e += j;
                return ByteBuffer.wrap(bArr);
            }
            long j2 = this.e;
            long j3 = readRawVarint32;
            ByteBuffer d = d(j2, j2 + j3);
            this.e += j3;
            return d;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final ByteString readBytes() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 <= 0 || readRawVarint32 > c()) {
                if (readRawVarint32 == 0) {
                    return ByteString.EMPTY;
                }
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.b && this.i) {
                long j = this.e;
                long j2 = readRawVarint32;
                ByteBuffer d = d(j, j + j2);
                this.e += j2;
                return ByteString.wrap(d);
            }
            byte[] bArr = new byte[readRawVarint32];
            long j3 = readRawVarint32;
            v5q0.f(this.e, bArr, 0L, j3);
            this.e += j3;
            return ByteString.wrap(bArr);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(pushLimit);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final byte readRawByte() throws IOException {
            long j = this.e;
            if (j == this.d) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.e = 1 + j;
            return v5q0.c.f(j);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final byte[] readRawBytes(int i) throws IOException {
            if (i < 0 || i > c()) {
                if (i > 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i == 0) {
                    return Internal.EMPTY_BYTE_ARRAY;
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            byte[] bArr = new byte[i];
            long j = this.e;
            long j2 = i;
            d(j, j + j2).get(bArr);
            this.e += j2;
            return bArr;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readRawLittleEndian32() throws IOException {
            long j = this.e;
            if (this.d - j < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.e = 4 + j;
            v5q0.d dVar = v5q0.c;
            return ((dVar.f(j + 3) & 255) << 24) | (dVar.f(j) & 255) | ((dVar.f(1 + j) & 255) << 8) | ((dVar.f(2 + j) & 255) << 16);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readRawLittleEndian64() throws IOException {
            long j = this.e;
            if (this.d - j < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.e = 8 + j;
            v5q0.d dVar = v5q0.c;
            return ((dVar.f(j + 7) & 255) << 56) | (dVar.f(j) & 255) | ((dVar.f(1 + j) & 255) << 8) | ((dVar.f(2 + j) & 255) << 16) | ((dVar.f(3 + j) & 255) << 24) | ((dVar.f(4 + j) & 255) << 32) | ((dVar.f(5 + j) & 255) << 40) | ((dVar.f(6 + j) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
        
            if (r4.f(r8) < 0) goto L34;
         */
        @Override // com.google.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int readRawVarint32() throws IOException {
            int i;
            long j = this.e;
            if (this.d != j) {
                long j2 = 1 + j;
                v5q0.d dVar = v5q0.c;
                byte f = dVar.f(j);
                if (f >= 0) {
                    this.e = j2;
                    return f;
                }
                if (this.d - j2 >= 9) {
                    long j3 = 2 + j;
                    int f2 = (dVar.f(j2) << 7) ^ f;
                    if (f2 < 0) {
                        i = f2 ^ (-128);
                    } else {
                        long j4 = 3 + j;
                        int f3 = f2 ^ (dVar.f(j3) << AmfConstants.TYPE_RECORDSET_MARKER);
                        if (f3 >= 0) {
                            i = f3 ^ 16256;
                        } else {
                            j3 = j + 4;
                            int f4 = f3 ^ (dVar.f(j4) << 21);
                            if (f4 < 0) {
                                i = (-2080896) ^ f4;
                            } else {
                                j4 = 5 + j;
                                byte f5 = dVar.f(j3);
                                int i2 = (f4 ^ (f5 << 28)) ^ 266354560;
                                if (f5 < 0) {
                                    j3 = j + 6;
                                    if (dVar.f(j4) < 0) {
                                        j4 = 7 + j;
                                        if (dVar.f(j3) < 0) {
                                            j3 = j + 8;
                                            if (dVar.f(j4) < 0) {
                                                long j5 = 9 + j;
                                                if (dVar.f(j3) < 0) {
                                                    j3 = j + 10;
                                                } else {
                                                    i = i2;
                                                    j3 = j5;
                                                }
                                            }
                                        }
                                    }
                                    i = i2;
                                }
                                i = i2;
                            }
                        }
                        j3 = j4;
                    }
                    this.e = j3;
                    return i;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readRawVarint64() throws IOException {
            long j;
            long j2;
            long j3;
            int i;
            long j4 = this.e;
            if (this.d != j4) {
                long j5 = 1 + j4;
                v5q0.d dVar = v5q0.c;
                byte f = dVar.f(j4);
                if (f >= 0) {
                    this.e = j5;
                    return f;
                }
                if (this.d - j5 >= 9) {
                    long j6 = 2 + j4;
                    int f2 = (dVar.f(j5) << 7) ^ f;
                    if (f2 >= 0) {
                        long j7 = 3 + j4;
                        int f3 = f2 ^ (dVar.f(j6) << AmfConstants.TYPE_RECORDSET_MARKER);
                        if (f3 >= 0) {
                            j = f3 ^ 16256;
                        } else {
                            j6 = j4 + 4;
                            int f4 = f3 ^ (dVar.f(j7) << 21);
                            if (f4 < 0) {
                                i = (-2080896) ^ f4;
                            } else {
                                j7 = 5 + j4;
                                long f5 = f4 ^ (dVar.f(j6) << 28);
                                if (f5 < 0) {
                                    long j8 = 6 + j4;
                                    long f6 = f5 ^ (dVar.f(j7) << 35);
                                    if (f6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = 7 + j4;
                                        f5 = f6 ^ (dVar.f(j8) << 42);
                                        if (f5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j8 = 8 + j4;
                                            f6 = f5 ^ (dVar.f(j7) << 49);
                                            if (f6 >= 0) {
                                                long j9 = j4 + 9;
                                                long f7 = (f6 ^ (dVar.f(j8) << 56)) ^ 71499008037633920L;
                                                if (f7 < 0) {
                                                    long j10 = j4 + 10;
                                                    if (dVar.f(j9) >= 0) {
                                                        j6 = j10;
                                                        j = f7;
                                                    }
                                                } else {
                                                    j = f7;
                                                    j6 = j9;
                                                }
                                                this.e = j6;
                                                return j;
                                            }
                                            j2 = -558586000294016L;
                                        }
                                    }
                                    j = j2 ^ f6;
                                    j6 = j8;
                                    this.e = j6;
                                    return j;
                                }
                                j3 = 266354560;
                                j = j3 ^ f5;
                            }
                        }
                        j6 = j7;
                        this.e = j6;
                        return j;
                    }
                    i = f2 ^ (-128);
                    j = i;
                    this.e = j6;
                    return j;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readRawVarint64SlowPath() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((readRawByte() & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readSInt32() throws IOException {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readSInt64() throws IOException {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final String readString() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 <= 0 || readRawVarint32 > c()) {
                if (readRawVarint32 == 0) {
                    return "";
                }
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = new byte[readRawVarint32];
            long j = readRawVarint32;
            v5q0.f(this.e, bArr, 0L, j);
            String str = new String(bArr, Internal.UTF_8);
            this.e += j;
            return str;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final String readStringRequireUtf8() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0 && readRawVarint32 <= c()) {
                String c = b0.c(this.a, (int) (this.e - this.c), readRawVarint32);
                this.e += readRawVarint32;
                return c;
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readTag() throws IOException {
            if (isAtEnd()) {
                this.h = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.h = readRawVarint32;
            if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
                return this.h;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        @Deprecated
        public final void readUnknownGroup(int i, MessageLite.Builder builder) throws IOException {
            readGroup(i, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void resetSizeCounter() {
            this.f = this.e;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean skipField(int i) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i);
            int i2 = 0;
            if (tagWireType == 0) {
                if (c() < 10) {
                    while (i2 < 10) {
                        if (readRawByte() < 0) {
                            i2++;
                        }
                    }
                    throw InvalidProtocolBufferException.malformedVarint();
                }
                while (i2 < 10) {
                    long j = this.e;
                    this.e = 1 + j;
                    if (v5q0.c.f(j) < 0) {
                        i2++;
                    }
                }
                throw InvalidProtocolBufferException.malformedVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void skipRawBytes(int i) throws IOException {
            if (i >= 0 && i <= c()) {
                this.e += i;
            } else {
                if (i >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public final <T extends MessageLite> T readGroup(int i, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i, 4));
            this.recursionDepth--;
            return parsePartialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(pushLimit);
                return parsePartialFrom;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean skipField(int i, CodedOutputStream codedOutputStream) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                long readRawVarint64 = readRawVarint64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeUInt64NoTag(readRawVarint64);
                return true;
            }
            if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString readBytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i);
                skipMessage(codedOutputStream);
                int makeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4);
                checkLastTagWas(makeTag);
                codedOutputStream.writeUInt32NoTag(makeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int readRawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    public static CodedInputStream newInstance(Iterable<ByteBuffer> iterable) {
        if (!e.a()) {
            return newInstance(new hwx(iterable));
        }
        return newInstance(iterable, false);
    }

    public static int readRawVarint32(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return readRawVarint32(read, inputStream);
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
        int readTag;
        do {
            readTag = readTag();
            if (readTag == 0) {
                return;
            }
            checkRecursionLimit();
            this.recursionDepth++;
            this.recursionDepth--;
        } while (skipField(readTag, codedOutputStream));
    }

    public static CodedInputStream newInstance(Iterable<ByteBuffer> iterable, boolean z) {
        int i = 0;
        int i2 = 0;
        for (ByteBuffer byteBuffer : iterable) {
            i2 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i |= 1;
            } else {
                i = byteBuffer.isDirect() ? i | 2 : i | 4;
            }
        }
        if (i == 2) {
            return new c(iterable, i2, z);
        }
        return newInstance(new hwx(iterable));
    }

    public static CodedInputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static CodedInputStream newInstance(byte[] bArr, int i, int i2) {
        return newInstance(bArr, i, i2, false);
    }

    public static CodedInputStream newInstance(byte[] bArr, int i, int i2, boolean z) {
        b bVar = new b(bArr, i, i2, z);
        try {
            bVar.pushLimit(i2);
            return bVar;
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static CodedInputStream newInstance(ByteBuffer byteBuffer) {
        return newInstance(byteBuffer, false);
    }

    public static CodedInputStream newInstance(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return newInstance(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && e.a()) {
            return new e(byteBuffer, z);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return newInstance(bArr, 0, remaining, true);
    }
}
