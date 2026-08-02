package com.google.protobuf;

import com.google.protobuf.MessageLite;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.fik;
import defpackage.sck;
import defpackage.uck;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class q extends CodedInputStream {
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

    public q(ByteBuffer byteBuffer, boolean z) {
        super();
        this.j = Integer.MAX_VALUE;
        this.a = byteBuffer;
        long a = uck.a(byteBuffer);
        this.c = a;
        this.d = byteBuffer.limit() + a;
        long position = a + byteBuffer.position();
        this.e = position;
        this.f = position;
        this.b = z;
    }

    public final void a() {
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

    public final int b() {
        return (int) (this.d - this.e);
    }

    public final ByteBuffer c(long j, long j2) {
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
    public final void checkLastTagWas(int i) {
        if (this.h != i) {
            throw InvalidProtocolBufferException.invalidEndTag();
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
    public final boolean isAtEnd() {
        return this.e == this.d;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void popLimit(int i) {
        this.j = i;
        a();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int pushLimit(int i) {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int totalBytesRead = getTotalBytesRead() + i;
        int i2 = this.j;
        if (totalBytesRead > i2) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.j = totalBytesRead;
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
        if (readRawVarint32 <= 0 || readRawVarint32 > b()) {
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
            uck.d(this.e, bArr, 0L, j);
            this.e += j;
            return ByteBuffer.wrap(bArr);
        }
        long j2 = this.e;
        long j3 = readRawVarint32;
        ByteBuffer c = c(j2, j2 + j3);
        this.e += j3;
        return c;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final ByteString readBytes() {
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 <= 0 || readRawVarint32 > b()) {
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
            ByteBuffer c = c(j, j + j2);
            this.e += j2;
            return ByteString.wrap(c);
        }
        byte[] bArr = new byte[readRawVarint32];
        long j3 = readRawVarint32;
        uck.d(this.e, bArr, 0L, j3);
        this.e += j3;
        return ByteString.wrap(bArr);
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
        long j = this.e;
        if (j == this.d) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.e = 1 + j;
        return uck.c.d(j);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte[] readRawBytes(int i) {
        if (i < 0 || i > b()) {
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
        c(j, j + j2).get(bArr);
        this.e += j2;
        return bArr;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readRawLittleEndian32() {
        long j = this.e;
        if (this.d - j < 4) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.e = 4 + j;
        sck sckVar = uck.c;
        return ((sckVar.d(j + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (sckVar.d(j) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((sckVar.d(1 + j) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((sckVar.d(2 + j) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readRawLittleEndian64() {
        long j = this.e;
        if (this.d - j < 8) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.e = 8 + j;
        sck sckVar = uck.c;
        return ((sckVar.d(j + 7) & 255) << 56) | (sckVar.d(j) & 255) | ((sckVar.d(1 + j) & 255) << 8) | ((sckVar.d(2 + j) & 255) << 16) | ((sckVar.d(3 + j) & 255) << 24) | ((sckVar.d(4 + j) & 255) << 32) | ((sckVar.d(5 + j) & 255) << 40) | ((sckVar.d(6 + j) & 255) << 48);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r4.d(r8) < 0) goto L34;
     */
    @Override // com.google.protobuf.CodedInputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int readRawVarint32() {
        int i;
        long j = this.e;
        if (this.d != j) {
            long j2 = 1 + j;
            sck sckVar = uck.c;
            byte d = sckVar.d(j);
            if (d >= 0) {
                this.e = j2;
                return d;
            }
            if (this.d - j2 >= 9) {
                long j3 = 2 + j;
                int d2 = (sckVar.d(j2) << 7) ^ d;
                if (d2 < 0) {
                    i = d2 ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int d3 = d2 ^ (sckVar.d(j3) << 14);
                    if (d3 >= 0) {
                        i = d3 ^ 16256;
                    } else {
                        j3 = j + 4;
                        int d4 = d3 ^ (sckVar.d(j4) << 21);
                        if (d4 < 0) {
                            i = (-2080896) ^ d4;
                        } else {
                            j4 = 5 + j;
                            byte d5 = sckVar.d(j3);
                            int i2 = (d4 ^ (d5 << 28)) ^ 266354560;
                            if (d5 < 0) {
                                j3 = j + 6;
                                if (sckVar.d(j4) < 0) {
                                    j4 = 7 + j;
                                    if (sckVar.d(j3) < 0) {
                                        j3 = j + 8;
                                        if (sckVar.d(j4) < 0) {
                                            long j5 = 9 + j;
                                            if (sckVar.d(j3) < 0) {
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
    public final long readRawVarint64() {
        long j;
        long j2;
        long j3;
        int i;
        long j4 = this.e;
        if (this.d != j4) {
            long j5 = 1 + j4;
            sck sckVar = uck.c;
            byte d = sckVar.d(j4);
            if (d >= 0) {
                this.e = j5;
                return d;
            }
            if (this.d - j5 >= 9) {
                long j6 = 2 + j4;
                int d2 = (sckVar.d(j5) << 7) ^ d;
                if (d2 >= 0) {
                    long j7 = 3 + j4;
                    int d3 = d2 ^ (sckVar.d(j6) << 14);
                    if (d3 >= 0) {
                        j = d3 ^ 16256;
                    } else {
                        j6 = j4 + 4;
                        int d4 = d3 ^ (sckVar.d(j7) << 21);
                        if (d4 < 0) {
                            i = (-2080896) ^ d4;
                        } else {
                            j7 = 5 + j4;
                            long d5 = d4 ^ (sckVar.d(j6) << 28);
                            if (d5 < 0) {
                                long j8 = 6 + j4;
                                long d6 = d5 ^ (sckVar.d(j7) << 35);
                                if (d6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    j7 = 7 + j4;
                                    d5 = d6 ^ (sckVar.d(j8) << 42);
                                    if (d5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        j8 = 8 + j4;
                                        d6 = d5 ^ (sckVar.d(j7) << 49);
                                        if (d6 >= 0) {
                                            long j9 = j4 + 9;
                                            long d7 = (d6 ^ (sckVar.d(j8) << 56)) ^ 71499008037633920L;
                                            if (d7 < 0) {
                                                long j10 = j4 + 10;
                                                if (sckVar.d(j9) >= 0) {
                                                    j6 = j10;
                                                    j = d7;
                                                }
                                            } else {
                                                j = d7;
                                                j6 = j9;
                                            }
                                            this.e = j6;
                                            return j;
                                        }
                                        j2 = -558586000294016L;
                                    }
                                }
                                j = j2 ^ d6;
                                j6 = j8;
                                this.e = j6;
                                return j;
                            }
                            j3 = 266354560;
                            j = j3 ^ d5;
                        }
                    }
                    j6 = j7;
                    this.e = j6;
                    return j;
                }
                i = d2 ^ (-128);
                j = i;
                this.e = j6;
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
        if (readRawVarint32 <= 0 || readRawVarint32 > b()) {
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
        uck.d(this.e, bArr, 0L, j);
        String str = new String(bArr, Internal.UTF_8);
        this.e += j;
        return str;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final String readStringRequireUtf8() {
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 > 0 && readRawVarint32 <= b()) {
            String a = fik.a(this.a, (int) (this.e - this.c), readRawVarint32);
            this.e += readRawVarint32;
            return a;
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
            if (b() < 10) {
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
                if (uck.c.d(j) < 0) {
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
        if (i >= 0 && i <= b()) {
            this.e += i;
        } else {
            if (i >= 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
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
