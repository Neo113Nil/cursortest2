package com.google.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.u;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
abstract class BinaryReader implements I {
    private static final int FIXED32_MULTIPLE_MASK = 3;
    private static final int FIXED64_MULTIPLE_MASK = 7;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f60091a;

        static {
            int[] iArr = new int[WireFormat$FieldType.values().length];
            f60091a = iArr;
            try {
                iArr[WireFormat$FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60091a[WireFormat$FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60091a[WireFormat$FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60091a[WireFormat$FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60091a[WireFormat$FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f60091a[WireFormat$FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f60091a[WireFormat$FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f60091a[WireFormat$FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f60091a[WireFormat$FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f60091a[WireFormat$FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f60091a[WireFormat$FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f60091a[WireFormat$FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f60091a[WireFormat$FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f60091a[WireFormat$FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f60091a[WireFormat$FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f60091a[WireFormat$FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f60091a[WireFormat$FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* synthetic */ BinaryReader(a aVar) {
        this();
    }

    public static BinaryReader newInstance(ByteBuffer byteBuffer, boolean z11) {
        if (byteBuffer.hasArray()) {
            return new SafeHeapReader(byteBuffer, z11);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ int getFieldNumber() throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ int getTag();

    public abstract int getTotalBytesRead();

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ void mergeGroupField(Object obj, J j11, C5957h c5957h) throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ void mergeMessageField(Object obj, J j11, C5957h c5957h) throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ boolean readBool() throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ void readBoolList(List list) throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ ByteString readBytes() throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ void readBytesList(List list) throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ double readDouble() throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ void readDoubleList(List list) throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ int readEnum() throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ void readEnumList(List list) throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ int readFixed32() throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ void readFixed32List(List list) throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ long readFixed64() throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ void readFixed64List(List list) throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ float readFloat() throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ void readFloatList(List list) throws IOException;

    @Override // com.google.protobuf.I
    @Deprecated
    public abstract /* synthetic */ Object readGroup(Class cls, C5957h c5957h) throws IOException;

    @Deprecated
    public abstract /* synthetic */ Object readGroupBySchemaWithCheck(J j11, C5957h c5957h) throws IOException;

    @Override // com.google.protobuf.I
    @Deprecated
    public abstract /* synthetic */ void readGroupList(List list, J j11, C5957h c5957h) throws IOException;

    @Deprecated
    public abstract /* synthetic */ void readGroupList(List list, Class cls, C5957h c5957h) throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ int readInt32() throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ void readInt32List(List list) throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ long readInt64() throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ void readInt64List(List list) throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ void readMap(Map map, u.a aVar, C5957h c5957h) throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ Object readMessage(Class cls, C5957h c5957h) throws IOException;

    public abstract /* synthetic */ Object readMessageBySchemaWithCheck(J j11, C5957h c5957h) throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ void readMessageList(List list, J j11, C5957h c5957h) throws IOException;

    public abstract /* synthetic */ void readMessageList(List list, Class cls, C5957h c5957h) throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ int readSFixed32() throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ void readSFixed32List(List list) throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ long readSFixed64() throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ void readSFixed64List(List list) throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ int readSInt32() throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ void readSInt32List(List list) throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ long readSInt64() throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ void readSInt64List(List list) throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ String readString() throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ void readStringList(List list) throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ void readStringListRequireUtf8(List list) throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ String readStringRequireUtf8() throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ int readUInt32() throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ void readUInt32List(List list) throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ long readUInt64() throws IOException;

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ void readUInt64List(List list) throws IOException;

    public boolean shouldDiscardUnknownFields() {
        return false;
    }

    @Override // com.google.protobuf.I
    public abstract /* synthetic */ boolean skipField() throws IOException;

    private static final class SafeHeapReader extends BinaryReader {
        private final byte[] buffer;
        private final boolean bufferIsImmutable;
        private int endGroupTag;
        private final int initialPos;
        private int limit;
        private int pos;
        private int tag;

        public SafeHeapReader(ByteBuffer byteBuffer, boolean z11) {
            super(null);
            this.bufferIsImmutable = z11;
            this.buffer = byteBuffer.array();
            int position = byteBuffer.position() + byteBuffer.arrayOffset();
            this.pos = position;
            this.initialPos = position;
            this.limit = byteBuffer.limit() + byteBuffer.arrayOffset();
        }

        private boolean isAtEnd() {
            return this.pos == this.limit;
        }

        private byte readByte() throws IOException {
            int i11 = this.pos;
            if (i11 == this.limit) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i11 + 1;
            return bArr[i11];
        }

        private Object readField(WireFormat$FieldType wireFormat$FieldType, Class<?> cls, C5957h c5957h) throws IOException {
            switch (a.f60091a[wireFormat$FieldType.ordinal()]) {
                case 1:
                    return Boolean.valueOf(readBool());
                case 2:
                    return readBytes();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(readEnum());
                case 5:
                    return Integer.valueOf(readFixed32());
                case 6:
                    return Long.valueOf(readFixed64());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(readInt32());
                case 9:
                    return Long.valueOf(readInt64());
                case 10:
                    return readMessage(cls, c5957h);
                case 11:
                    return Integer.valueOf(readSFixed32());
                case 12:
                    return Long.valueOf(readSFixed64());
                case 13:
                    return Integer.valueOf(readSInt32());
                case 14:
                    return Long.valueOf(readSInt64());
                case 15:
                    return readStringRequireUtf8();
                case 16:
                    return Integer.valueOf(readUInt32());
                case 17:
                    return Long.valueOf(readUInt64());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        private int readLittleEndian32() throws IOException {
            requireBytes(4);
            return readLittleEndian32_NoCheck();
        }

        private int readLittleEndian32_NoCheck() {
            int i11 = this.pos;
            byte[] bArr = this.buffer;
            this.pos = i11 + 4;
            return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
        }

        private long readLittleEndian64() throws IOException {
            requireBytes(8);
            return readLittleEndian64_NoCheck();
        }

        private long readLittleEndian64_NoCheck() {
            int i11 = this.pos;
            byte[] bArr = this.buffer;
            this.pos = i11 + 8;
            return ((bArr[i11 + 7] & 255) << 56) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48);
        }

        private int readVarint32() throws IOException {
            int i11;
            int i12 = this.pos;
            int i13 = this.limit;
            if (i13 == i12) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            if (b11 >= 0) {
                this.pos = i14;
                return b11;
            }
            if (i13 - i14 < 9) {
                return (int) readVarint64SlowPath();
            }
            int i15 = i12 + 2;
            int i16 = (bArr[i14] << 7) ^ b11;
            if (i16 < 0) {
                i11 = i16 ^ (-128);
            } else {
                int i17 = i12 + 3;
                int i18 = (bArr[i15] << 14) ^ i16;
                if (i18 >= 0) {
                    i11 = i18 ^ 16256;
                } else {
                    int i19 = i12 + 4;
                    int i21 = i18 ^ (bArr[i17] << 21);
                    if (i21 < 0) {
                        i11 = (-2080896) ^ i21;
                    } else {
                        i17 = i12 + 5;
                        byte b12 = bArr[i19];
                        int i22 = (i21 ^ (b12 << 28)) ^ 266354560;
                        if (b12 < 0) {
                            i19 = i12 + 6;
                            if (bArr[i17] < 0) {
                                i17 = i12 + 7;
                                if (bArr[i19] < 0) {
                                    i19 = i12 + 8;
                                    if (bArr[i17] < 0) {
                                        i17 = i12 + 9;
                                        if (bArr[i19] < 0) {
                                            int i23 = i12 + 10;
                                            if (bArr[i17] < 0) {
                                                throw InvalidProtocolBufferException.malformedVarint();
                                            }
                                            i15 = i23;
                                            i11 = i22;
                                        }
                                    }
                                }
                            }
                            i11 = i22;
                        }
                        i11 = i22;
                    }
                    i15 = i19;
                }
                i15 = i17;
            }
            this.pos = i15;
            return i11;
        }

        private long readVarint64SlowPath() throws IOException {
            long j11 = 0;
            for (int i11 = 0; i11 < 64; i11 += 7) {
                j11 |= (r3 & Byte.MAX_VALUE) << i11;
                if ((readByte() & 128) == 0) {
                    return j11;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void requireBytes(int i11) throws IOException {
            if (i11 < 0 || i11 > this.limit - this.pos) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        private void requirePosition(int i11) throws IOException {
            if (this.pos != i11) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        private void requireWireType(int i11) throws IOException {
            if ((this.tag & 7) != i11) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        private void skipBytes(int i11) throws IOException {
            requireBytes(i11);
            this.pos += i11;
        }

        private void skipGroup() throws IOException {
            int i11 = this.endGroupTag;
            this.endGroupTag = ((this.tag >>> 3) << 3) | 4;
            while (getFieldNumber() != Integer.MAX_VALUE && skipField()) {
            }
            if (this.tag != this.endGroupTag) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            this.endGroupTag = i11;
        }

        private void skipVarint() throws IOException {
            int i11 = this.limit;
            int i12 = this.pos;
            if (i11 - i12 >= 10) {
                byte[] bArr = this.buffer;
                int i13 = 0;
                while (i13 < 10) {
                    int i14 = i12 + 1;
                    if (bArr[i12] >= 0) {
                        this.pos = i14;
                        return;
                    } else {
                        i13++;
                        i12 = i14;
                    }
                }
            }
            skipVarintSlowPath();
        }

        private void skipVarintSlowPath() throws IOException {
            for (int i11 = 0; i11 < 10; i11++) {
                if (readByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void verifyPackedFixed32Length(int i11) throws IOException {
            requireBytes(i11);
            if ((i11 & 3) != 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        }

        private void verifyPackedFixed64Length(int i11) throws IOException {
            requireBytes(i11);
            if ((i11 & 7) != 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public int getFieldNumber() throws IOException {
            if (isAtEnd()) {
                return Integer.MAX_VALUE;
            }
            int readVarint32 = readVarint32();
            this.tag = readVarint32;
            if (readVarint32 == this.endGroupTag) {
                return Integer.MAX_VALUE;
            }
            return readVarint32 >>> 3;
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public int getTag() {
            return this.tag;
        }

        @Override // com.google.protobuf.BinaryReader
        public int getTotalBytesRead() {
            return this.pos - this.initialPos;
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public <T> void mergeGroupField(T t2, J<T> j11, C5957h c5957h) throws IOException {
            int i11 = this.endGroupTag;
            this.endGroupTag = ((this.tag >>> 3) << 3) | 4;
            try {
                j11.mergeFrom(t2, this, c5957h);
                if (this.tag == this.endGroupTag) {
                } else {
                    throw InvalidProtocolBufferException.parseFailure();
                }
            } finally {
                this.endGroupTag = i11;
            }
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public <T> void mergeMessageField(T t2, J<T> j11, C5957h c5957h) throws IOException {
            int readVarint32 = readVarint32();
            requireBytes(readVarint32);
            int i11 = this.limit;
            int i12 = this.pos + readVarint32;
            this.limit = i12;
            try {
                j11.mergeFrom(t2, this, c5957h);
                if (this.pos == i12) {
                } else {
                    throw InvalidProtocolBufferException.parseFailure();
                }
            } finally {
                this.limit = i11;
            }
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public boolean readBool() throws IOException {
            requireWireType(0);
            return readVarint32() != 0;
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public void readBoolList(List<Boolean> list) throws IOException {
            int i11;
            int i12;
            if (!(list instanceof BooleanArrayList)) {
                int i13 = this.tag & 7;
                if (i13 != 0) {
                    if (i13 != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int readVarint32 = this.pos + readVarint32();
                    while (this.pos < readVarint32) {
                        list.add(Boolean.valueOf(readVarint32() != 0));
                    }
                    requirePosition(readVarint32);
                    return;
                }
                do {
                    list.add(Boolean.valueOf(readBool()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i11 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i11;
                return;
            }
            BooleanArrayList booleanArrayList = (BooleanArrayList) list;
            int i14 = this.tag & 7;
            if (i14 != 0) {
                if (i14 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int readVarint322 = this.pos + readVarint32();
                while (this.pos < readVarint322) {
                    booleanArrayList.addBoolean(readVarint32() != 0);
                }
                requirePosition(readVarint322);
                return;
            }
            do {
                booleanArrayList.addBoolean(readBool());
                if (isAtEnd()) {
                    return;
                } else {
                    i12 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i12;
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public ByteString readBytes() throws IOException {
            requireWireType(2);
            int readVarint32 = readVarint32();
            if (readVarint32 == 0) {
                return ByteString.EMPTY;
            }
            requireBytes(readVarint32);
            ByteString wrap = this.bufferIsImmutable ? ByteString.wrap(this.buffer, this.pos, readVarint32) : ByteString.copyFrom(this.buffer, this.pos, readVarint32);
            this.pos += readVarint32;
            return wrap;
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public void readBytesList(List<ByteString> list) throws IOException {
            int i11;
            if ((this.tag & 7) != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(readBytes());
                if (isAtEnd()) {
                    return;
                } else {
                    i11 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i11;
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public double readDouble() throws IOException {
            requireWireType(1);
            return Double.longBitsToDouble(readLittleEndian64());
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public void readDoubleList(List<Double> list) throws IOException {
            int i11;
            int i12;
            if (!(list instanceof DoubleArrayList)) {
                int i13 = this.tag & 7;
                if (i13 == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (isAtEnd()) {
                            return;
                        } else {
                            i11 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i11;
                    return;
                }
                if (i13 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int readVarint32 = readVarint32();
                verifyPackedFixed64Length(readVarint32);
                int i14 = this.pos + readVarint32;
                while (this.pos < i14) {
                    list.add(Double.valueOf(Double.longBitsToDouble(readLittleEndian64_NoCheck())));
                }
                return;
            }
            DoubleArrayList doubleArrayList = (DoubleArrayList) list;
            int i15 = this.tag & 7;
            if (i15 == 1) {
                do {
                    doubleArrayList.addDouble(readDouble());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i12 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i12;
                return;
            }
            if (i15 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int readVarint322 = readVarint32();
            verifyPackedFixed64Length(readVarint322);
            int i16 = this.pos + readVarint322;
            while (this.pos < i16) {
                doubleArrayList.addDouble(Double.longBitsToDouble(readLittleEndian64_NoCheck()));
            }
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public int readEnum() throws IOException {
            requireWireType(0);
            return readVarint32();
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public void readEnumList(List<Integer> list) throws IOException {
            int i11;
            int i12;
            if (!(list instanceof IntArrayList)) {
                int i13 = this.tag & 7;
                if (i13 != 0) {
                    if (i13 != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int readVarint32 = this.pos + readVarint32();
                    while (this.pos < readVarint32) {
                        list.add(Integer.valueOf(readVarint32()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(readEnum()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i11 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i11;
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int i14 = this.tag & 7;
            if (i14 != 0) {
                if (i14 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int readVarint322 = this.pos + readVarint32();
                while (this.pos < readVarint322) {
                    intArrayList.addInt(readVarint32());
                }
                return;
            }
            do {
                intArrayList.addInt(readEnum());
                if (isAtEnd()) {
                    return;
                } else {
                    i12 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i12;
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public int readFixed32() throws IOException {
            requireWireType(5);
            return readLittleEndian32();
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public void readFixed32List(List<Integer> list) throws IOException {
            int i11;
            int i12;
            if (!(list instanceof IntArrayList)) {
                int i13 = this.tag & 7;
                if (i13 == 2) {
                    int readVarint32 = readVarint32();
                    verifyPackedFixed32Length(readVarint32);
                    int i14 = this.pos + readVarint32;
                    while (this.pos < i14) {
                        list.add(Integer.valueOf(readLittleEndian32_NoCheck()));
                    }
                    return;
                }
                if (i13 != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    list.add(Integer.valueOf(readFixed32()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i11 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i11;
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int i15 = this.tag & 7;
            if (i15 == 2) {
                int readVarint322 = readVarint32();
                verifyPackedFixed32Length(readVarint322);
                int i16 = this.pos + readVarint322;
                while (this.pos < i16) {
                    intArrayList.addInt(readLittleEndian32_NoCheck());
                }
                return;
            }
            if (i15 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                intArrayList.addInt(readFixed32());
                if (isAtEnd()) {
                    return;
                } else {
                    i12 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i12;
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public long readFixed64() throws IOException {
            requireWireType(1);
            return readLittleEndian64();
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public void readFixed64List(List<Long> list) throws IOException {
            int i11;
            int i12;
            if (!(list instanceof LongArrayList)) {
                int i13 = this.tag & 7;
                if (i13 == 1) {
                    do {
                        list.add(Long.valueOf(readFixed64()));
                        if (isAtEnd()) {
                            return;
                        } else {
                            i11 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i11;
                    return;
                }
                if (i13 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int readVarint32 = readVarint32();
                verifyPackedFixed64Length(readVarint32);
                int i14 = this.pos + readVarint32;
                while (this.pos < i14) {
                    list.add(Long.valueOf(readLittleEndian64_NoCheck()));
                }
                return;
            }
            LongArrayList longArrayList = (LongArrayList) list;
            int i15 = this.tag & 7;
            if (i15 == 1) {
                do {
                    longArrayList.addLong(readFixed64());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i12 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i12;
                return;
            }
            if (i15 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int readVarint322 = readVarint32();
            verifyPackedFixed64Length(readVarint322);
            int i16 = this.pos + readVarint322;
            while (this.pos < i16) {
                longArrayList.addLong(readLittleEndian64_NoCheck());
            }
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public float readFloat() throws IOException {
            requireWireType(5);
            return Float.intBitsToFloat(readLittleEndian32());
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public void readFloatList(List<Float> list) throws IOException {
            int i11;
            int i12;
            if (!(list instanceof FloatArrayList)) {
                int i13 = this.tag & 7;
                if (i13 == 2) {
                    int readVarint32 = readVarint32();
                    verifyPackedFixed32Length(readVarint32);
                    int i14 = this.pos + readVarint32;
                    while (this.pos < i14) {
                        list.add(Float.valueOf(Float.intBitsToFloat(readLittleEndian32_NoCheck())));
                    }
                    return;
                }
                if (i13 != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i11 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i11;
                return;
            }
            FloatArrayList floatArrayList = (FloatArrayList) list;
            int i15 = this.tag & 7;
            if (i15 == 2) {
                int readVarint322 = readVarint32();
                verifyPackedFixed32Length(readVarint322);
                int i16 = this.pos + readVarint322;
                while (this.pos < i16) {
                    floatArrayList.addFloat(Float.intBitsToFloat(readLittleEndian32_NoCheck()));
                }
                return;
            }
            if (i15 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                floatArrayList.addFloat(readFloat());
                if (isAtEnd()) {
                    return;
                } else {
                    i12 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i12;
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        @Deprecated
        public <T> T readGroup(Class<T> cls, C5957h c5957h) throws IOException {
            requireWireType(3);
            return (T) readGroup(H.a().b(cls), c5957h);
        }

        @Override // com.google.protobuf.BinaryReader
        @Deprecated
        public <T> T readGroupBySchemaWithCheck(J<T> j11, C5957h c5957h) throws IOException {
            requireWireType(3);
            return (T) readGroup(j11, c5957h);
        }

        @Override // com.google.protobuf.BinaryReader
        @Deprecated
        public <T> void readGroupList(List<T> list, Class<T> cls, C5957h c5957h) throws IOException {
            readGroupList(list, H.a().b(cls), c5957h);
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public int readInt32() throws IOException {
            requireWireType(0);
            return readVarint32();
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public void readInt32List(List<Integer> list) throws IOException {
            int i11;
            int i12;
            if (!(list instanceof IntArrayList)) {
                int i13 = this.tag & 7;
                if (i13 == 0) {
                    do {
                        list.add(Integer.valueOf(readInt32()));
                        if (isAtEnd()) {
                            return;
                        } else {
                            i11 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i11;
                    return;
                }
                if (i13 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int readVarint32 = this.pos + readVarint32();
                while (this.pos < readVarint32) {
                    list.add(Integer.valueOf(readVarint32()));
                }
                requirePosition(readVarint32);
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int i14 = this.tag & 7;
            if (i14 == 0) {
                do {
                    intArrayList.addInt(readInt32());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i12 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i12;
                return;
            }
            if (i14 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int readVarint322 = this.pos + readVarint32();
            while (this.pos < readVarint322) {
                intArrayList.addInt(readVarint32());
            }
            requirePosition(readVarint322);
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public long readInt64() throws IOException {
            requireWireType(0);
            return readVarint64();
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public void readInt64List(List<Long> list) throws IOException {
            int i11;
            int i12;
            if (!(list instanceof LongArrayList)) {
                int i13 = this.tag & 7;
                if (i13 == 0) {
                    do {
                        list.add(Long.valueOf(readInt64()));
                        if (isAtEnd()) {
                            return;
                        } else {
                            i11 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i11;
                    return;
                }
                if (i13 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int readVarint32 = this.pos + readVarint32();
                while (this.pos < readVarint32) {
                    list.add(Long.valueOf(readVarint64()));
                }
                requirePosition(readVarint32);
                return;
            }
            LongArrayList longArrayList = (LongArrayList) list;
            int i14 = this.tag & 7;
            if (i14 == 0) {
                do {
                    longArrayList.addLong(readInt64());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i12 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i12;
                return;
            }
            if (i14 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int readVarint322 = this.pos + readVarint32();
            while (this.pos < readVarint322) {
                longArrayList.addLong(readVarint64());
            }
            requirePosition(readVarint322);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public <K, V> void readMap(Map<K, V> map, u.a<K, V> aVar, C5957h c5957h) throws IOException {
            requireWireType(2);
            int readVarint32 = readVarint32();
            requireBytes(readVarint32);
            int i11 = this.limit;
            this.limit = this.pos + readVarint32;
            try {
                Object obj = aVar.f60236b;
                V v11 = aVar.f60238d;
                Object obj2 = v11;
                while (true) {
                    int fieldNumber = getFieldNumber();
                    if (fieldNumber == Integer.MAX_VALUE) {
                        map.put(obj, obj2);
                        return;
                    }
                    if (fieldNumber == 1) {
                        obj = readField(aVar.f60235a, null, null);
                    } else if (fieldNumber != 2) {
                        try {
                            if (!skipField()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        } catch (InvalidProtocolBufferException.InvalidWireTypeException e11) {
                            if (!skipField()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.", (IOException) e11);
                            }
                        }
                    } else {
                        obj2 = readField(aVar.f60237c, v11.getClass(), c5957h);
                    }
                }
            } finally {
                this.limit = i11;
            }
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public <T> T readMessage(Class<T> cls, C5957h c5957h) throws IOException {
            requireWireType(2);
            return (T) readMessage(H.a().b(cls), c5957h);
        }

        @Override // com.google.protobuf.BinaryReader
        public <T> T readMessageBySchemaWithCheck(J<T> j11, C5957h c5957h) throws IOException {
            requireWireType(2);
            return (T) readMessage(j11, c5957h);
        }

        @Override // com.google.protobuf.BinaryReader
        public <T> void readMessageList(List<T> list, Class<T> cls, C5957h c5957h) throws IOException {
            readMessageList(list, H.a().b(cls), c5957h);
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public int readSFixed32() throws IOException {
            requireWireType(5);
            return readLittleEndian32();
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public void readSFixed32List(List<Integer> list) throws IOException {
            int i11;
            int i12;
            if (!(list instanceof IntArrayList)) {
                int i13 = this.tag & 7;
                if (i13 == 2) {
                    int readVarint32 = readVarint32();
                    verifyPackedFixed32Length(readVarint32);
                    int i14 = this.pos + readVarint32;
                    while (this.pos < i14) {
                        list.add(Integer.valueOf(readLittleEndian32_NoCheck()));
                    }
                    return;
                }
                if (i13 != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    list.add(Integer.valueOf(readSFixed32()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i11 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i11;
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int i15 = this.tag & 7;
            if (i15 == 2) {
                int readVarint322 = readVarint32();
                verifyPackedFixed32Length(readVarint322);
                int i16 = this.pos + readVarint322;
                while (this.pos < i16) {
                    intArrayList.addInt(readLittleEndian32_NoCheck());
                }
                return;
            }
            if (i15 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                intArrayList.addInt(readSFixed32());
                if (isAtEnd()) {
                    return;
                } else {
                    i12 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i12;
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public long readSFixed64() throws IOException {
            requireWireType(1);
            return readLittleEndian64();
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public void readSFixed64List(List<Long> list) throws IOException {
            int i11;
            int i12;
            if (!(list instanceof LongArrayList)) {
                int i13 = this.tag & 7;
                if (i13 == 1) {
                    do {
                        list.add(Long.valueOf(readSFixed64()));
                        if (isAtEnd()) {
                            return;
                        } else {
                            i11 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i11;
                    return;
                }
                if (i13 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int readVarint32 = readVarint32();
                verifyPackedFixed64Length(readVarint32);
                int i14 = this.pos + readVarint32;
                while (this.pos < i14) {
                    list.add(Long.valueOf(readLittleEndian64_NoCheck()));
                }
                return;
            }
            LongArrayList longArrayList = (LongArrayList) list;
            int i15 = this.tag & 7;
            if (i15 == 1) {
                do {
                    longArrayList.addLong(readSFixed64());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i12 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i12;
                return;
            }
            if (i15 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int readVarint322 = readVarint32();
            verifyPackedFixed64Length(readVarint322);
            int i16 = this.pos + readVarint322;
            while (this.pos < i16) {
                longArrayList.addLong(readLittleEndian64_NoCheck());
            }
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public int readSInt32() throws IOException {
            requireWireType(0);
            return CodedInputStream.decodeZigZag32(readVarint32());
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public void readSInt32List(List<Integer> list) throws IOException {
            int i11;
            int i12;
            if (!(list instanceof IntArrayList)) {
                int i13 = this.tag & 7;
                if (i13 != 0) {
                    if (i13 != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int readVarint32 = this.pos + readVarint32();
                    while (this.pos < readVarint32) {
                        list.add(Integer.valueOf(CodedInputStream.decodeZigZag32(readVarint32())));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(readSInt32()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i11 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i11;
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int i14 = this.tag & 7;
            if (i14 != 0) {
                if (i14 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int readVarint322 = this.pos + readVarint32();
                while (this.pos < readVarint322) {
                    intArrayList.addInt(CodedInputStream.decodeZigZag32(readVarint32()));
                }
                return;
            }
            do {
                intArrayList.addInt(readSInt32());
                if (isAtEnd()) {
                    return;
                } else {
                    i12 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i12;
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public long readSInt64() throws IOException {
            requireWireType(0);
            return CodedInputStream.decodeZigZag64(readVarint64());
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public void readSInt64List(List<Long> list) throws IOException {
            int i11;
            int i12;
            if (!(list instanceof LongArrayList)) {
                int i13 = this.tag & 7;
                if (i13 != 0) {
                    if (i13 != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int readVarint32 = this.pos + readVarint32();
                    while (this.pos < readVarint32) {
                        list.add(Long.valueOf(CodedInputStream.decodeZigZag64(readVarint64())));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(readSInt64()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i11 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i11;
                return;
            }
            LongArrayList longArrayList = (LongArrayList) list;
            int i14 = this.tag & 7;
            if (i14 != 0) {
                if (i14 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int readVarint322 = this.pos + readVarint32();
                while (this.pos < readVarint322) {
                    longArrayList.addLong(CodedInputStream.decodeZigZag64(readVarint64()));
                }
                return;
            }
            do {
                longArrayList.addLong(readSInt64());
                if (isAtEnd()) {
                    return;
                } else {
                    i12 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i12;
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public String readString() throws IOException {
            return readStringInternal(false);
        }

        public String readStringInternal(boolean z11) throws IOException {
            requireWireType(2);
            int readVarint32 = readVarint32();
            if (readVarint32 == 0) {
                return "";
            }
            requireBytes(readVarint32);
            if (z11) {
                byte[] bArr = this.buffer;
                int i11 = this.pos;
                if (!Utf8.o(bArr, i11, i11 + readVarint32)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
            }
            String str = new String(this.buffer, this.pos, readVarint32, Internal.f60125a);
            this.pos += readVarint32;
            return str;
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public void readStringList(List<String> list) throws IOException {
            readStringListInternal(list, false);
        }

        public void readStringListInternal(List<String> list, boolean z11) throws IOException {
            int i11;
            int i12;
            if ((this.tag & 7) != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            if (!(list instanceof LazyStringList) || z11) {
                do {
                    list.add(readStringInternal(z11));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i11 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i11;
                return;
            }
            LazyStringList lazyStringList = (LazyStringList) list;
            do {
                lazyStringList.add(readBytes());
                if (isAtEnd()) {
                    return;
                } else {
                    i12 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i12;
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public void readStringListRequireUtf8(List<String> list) throws IOException {
            readStringListInternal(list, true);
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public String readStringRequireUtf8() throws IOException {
            return readStringInternal(true);
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public int readUInt32() throws IOException {
            requireWireType(0);
            return readVarint32();
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public void readUInt32List(List<Integer> list) throws IOException {
            int i11;
            int i12;
            if (!(list instanceof IntArrayList)) {
                int i13 = this.tag & 7;
                if (i13 != 0) {
                    if (i13 != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int readVarint32 = this.pos + readVarint32();
                    while (this.pos < readVarint32) {
                        list.add(Integer.valueOf(readVarint32()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(readUInt32()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i11 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i11;
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int i14 = this.tag & 7;
            if (i14 != 0) {
                if (i14 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int readVarint322 = this.pos + readVarint32();
                while (this.pos < readVarint322) {
                    intArrayList.addInt(readVarint32());
                }
                return;
            }
            do {
                intArrayList.addInt(readUInt32());
                if (isAtEnd()) {
                    return;
                } else {
                    i12 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i12;
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public long readUInt64() throws IOException {
            requireWireType(0);
            return readVarint64();
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public void readUInt64List(List<Long> list) throws IOException {
            int i11;
            int i12;
            if (!(list instanceof LongArrayList)) {
                int i13 = this.tag & 7;
                if (i13 == 0) {
                    do {
                        list.add(Long.valueOf(readUInt64()));
                        if (isAtEnd()) {
                            return;
                        } else {
                            i11 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i11;
                    return;
                }
                if (i13 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int readVarint32 = this.pos + readVarint32();
                while (this.pos < readVarint32) {
                    list.add(Long.valueOf(readVarint64()));
                }
                requirePosition(readVarint32);
                return;
            }
            LongArrayList longArrayList = (LongArrayList) list;
            int i14 = this.tag & 7;
            if (i14 == 0) {
                do {
                    longArrayList.addLong(readUInt64());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i12 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i12;
                return;
            }
            if (i14 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int readVarint322 = this.pos + readVarint32();
            while (this.pos < readVarint322) {
                longArrayList.addLong(readVarint64());
            }
            requirePosition(readVarint322);
        }

        public long readVarint64() throws IOException {
            long j11;
            long j12;
            long j13;
            int i11 = this.pos;
            int i12 = this.limit;
            if (i12 == i11) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            int i13 = i11 + 1;
            byte b11 = bArr[i11];
            if (b11 >= 0) {
                this.pos = i13;
                return b11;
            }
            if (i12 - i13 < 9) {
                return readVarint64SlowPath();
            }
            int i14 = i11 + 2;
            int i15 = (bArr[i13] << 7) ^ b11;
            if (i15 < 0) {
                j11 = i15 ^ (-128);
            } else {
                int i16 = i11 + 3;
                int i17 = (bArr[i14] << 14) ^ i15;
                if (i17 >= 0) {
                    j11 = i17 ^ 16256;
                    i14 = i16;
                } else {
                    int i18 = i11 + 4;
                    int i19 = i17 ^ (bArr[i16] << 21);
                    if (i19 < 0) {
                        long j14 = (-2080896) ^ i19;
                        i14 = i18;
                        j11 = j14;
                    } else {
                        long j15 = i19;
                        i14 = i11 + 5;
                        long j16 = j15 ^ (bArr[i18] << 28);
                        if (j16 >= 0) {
                            j13 = 266354560;
                        } else {
                            int i21 = i11 + 6;
                            long j17 = j16 ^ (bArr[i14] << 35);
                            if (j17 < 0) {
                                j12 = -34093383808L;
                            } else {
                                i14 = i11 + 7;
                                j16 = j17 ^ (bArr[i21] << 42);
                                if (j16 >= 0) {
                                    j13 = 4363953127296L;
                                } else {
                                    i21 = i11 + 8;
                                    j17 = j16 ^ (bArr[i14] << 49);
                                    if (j17 < 0) {
                                        j12 = -558586000294016L;
                                    } else {
                                        i14 = i11 + 9;
                                        long j18 = (j17 ^ (bArr[i21] << 56)) ^ 71499008037633920L;
                                        if (j18 < 0) {
                                            int i22 = i11 + 10;
                                            if (bArr[i14] < 0) {
                                                throw InvalidProtocolBufferException.malformedVarint();
                                            }
                                            i14 = i22;
                                        }
                                        j11 = j18;
                                    }
                                }
                            }
                            j11 = j17 ^ j12;
                            i14 = i21;
                        }
                        j11 = j16 ^ j13;
                    }
                }
            }
            this.pos = i14;
            return j11;
        }

        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public boolean skipField() throws IOException {
            int i11;
            if (isAtEnd() || (i11 = this.tag) == this.endGroupTag) {
                return false;
            }
            int i12 = i11 & 7;
            if (i12 == 0) {
                skipVarint();
                return true;
            }
            if (i12 == 1) {
                skipBytes(8);
                return true;
            }
            if (i12 == 2) {
                skipBytes(readVarint32());
                return true;
            }
            if (i12 == 3) {
                skipGroup();
                return true;
            }
            if (i12 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipBytes(4);
            return true;
        }

        private <T> T readGroup(J<T> j11, C5957h c5957h) throws IOException {
            T newInstance = j11.newInstance();
            mergeGroupField(newInstance, j11, c5957h);
            j11.makeImmutable(newInstance);
            return newInstance;
        }

        private <T> T readMessage(J<T> j11, C5957h c5957h) throws IOException {
            T newInstance = j11.newInstance();
            mergeMessageField(newInstance, j11, c5957h);
            j11.makeImmutable(newInstance);
            return newInstance;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        @Deprecated
        public <T> void readGroupList(List<T> list, J<T> j11, C5957h c5957h) throws IOException {
            int i11;
            int i12 = this.tag;
            if ((i12 & 7) == 3) {
                do {
                    list.add(readGroup(j11, c5957h));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i11 = this.pos;
                    }
                } while (readVarint32() == i12);
                this.pos = i11;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.BinaryReader, com.google.protobuf.I
        public <T> void readMessageList(List<T> list, J<T> j11, C5957h c5957h) throws IOException {
            int i11;
            int i12 = this.tag;
            if ((i12 & 7) == 2) {
                do {
                    list.add(readMessage(j11, c5957h));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i11 = this.pos;
                    }
                } while (readVarint32() == i12);
                this.pos = i11;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    private BinaryReader() {
    }
}
