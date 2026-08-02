package com.google.protobuf;

import com.google.protobuf.MessageLite;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.fik;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class n extends CodedInputStream {
    public final byte[] a;
    public final boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;

    public n(byte[] bArr, int i, int i2, boolean z) {
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
    public final void checkLastTagWas(int i) {
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
    public final boolean isAtEnd() {
        return this.e == this.c;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void popLimit(int i) {
        this.i = i;
        a();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int pushLimit(int i) {
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
    public final boolean readBool() {
        return readRawVarint64() != 0;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte[] readByteArray() {
        return readRawBytes(readRawVarint32());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final ByteBuffer readByteBuffer() {
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
    public final ByteString readBytes() {
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
    public final double readDouble() {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readEnum() {
        return readRawVarint32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readFixed32() {
        return readRawLittleEndian32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readFixed64() {
        return readRawLittleEndian64();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final float readFloat() {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final MessageLite readGroup(int i, Parser parser, ExtensionRegistryLite extensionRegistryLite) {
        checkRecursionLimit();
        this.recursionDepth++;
        MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
        checkLastTagWas(WireFormat.makeTag(i, 4));
        this.recursionDepth--;
        return messageLite;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readInt32() {
        return readRawVarint32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readInt64() {
        return readRawVarint64();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final MessageLite readMessage(Parser parser, ExtensionRegistryLite extensionRegistryLite) {
        int readRawVarint32 = readRawVarint32();
        checkRecursionLimit();
        int pushLimit = pushLimit(readRawVarint32);
        this.recursionDepth++;
        MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
        checkLastTagWas(0);
        this.recursionDepth--;
        if (getBytesUntilLimit() != 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        popLimit(pushLimit);
        return messageLite;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte readRawByte() {
        int i = this.e;
        if (i == this.c) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.e = i + 1;
        return this.a[i];
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte[] readRawBytes(int i) {
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
    public final int readRawLittleEndian32() {
        int i = this.e;
        if (this.c - i < 4) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.e = i + 4;
        byte[] bArr = this.a;
        return ((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readRawLittleEndian64() {
        int i = this.e;
        if (this.c - i < 8) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.e = i + 8;
        byte[] bArr = this.a;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readRawVarint32() {
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
                    int i8 = (bArr[i5] << 14) ^ i6;
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
    public final long readRawVarint64() {
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
                    int i7 = (bArr[i4] << 14) ^ i5;
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
    public final long readRawVarint64SlowPath() {
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
    public final int readSFixed32() {
        return readRawLittleEndian32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readSFixed64() {
        return readRawLittleEndian64();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readSInt32() {
        return CodedInputStream.decodeZigZag32(readRawVarint32());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readSInt64() {
        return CodedInputStream.decodeZigZag64(readRawVarint64());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final String readString() {
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
    public final String readStringRequireUtf8() {
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 > 0) {
            int i = this.c;
            int i2 = this.e;
            if (readRawVarint32 <= i - i2) {
                String a = fik.a.a(i2, readRawVarint32, this.a);
                this.e += readRawVarint32;
                return a;
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
    public final int readTag() {
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
    public final int readUInt32() {
        return readRawVarint32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readUInt64() {
        return readRawVarint64();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void readUnknownGroup(int i, MessageLite.Builder builder) {
        readGroup(i, builder, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void resetSizeCounter() {
        this.f = this.e;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean skipField(int i) {
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
    public final void skipRawBytes(int i) {
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
    public final void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
        checkRecursionLimit();
        this.recursionDepth++;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(WireFormat.makeTag(i, 4));
        this.recursionDepth--;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
        int readRawVarint32 = readRawVarint32();
        checkRecursionLimit();
        int pushLimit = pushLimit(readRawVarint32);
        this.recursionDepth++;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(0);
        this.recursionDepth--;
        if (getBytesUntilLimit() == 0) {
            popLimit(pushLimit);
            return;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean skipField(int i, CodedOutputStream codedOutputStream) {
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
