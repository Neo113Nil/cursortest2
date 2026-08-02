package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
abstract class N<T, B> {
    static final int DEFAULT_RECURSION_LIMIT = 100;
    private static volatile int recursionLimit = 100;

    N() {
    }

    private final void mergeFrom(B b11, I i11, int i12) throws IOException {
        while (i11.getFieldNumber() != Integer.MAX_VALUE && mergeOneFieldFrom(b11, i11, i12)) {
        }
    }

    abstract void addFixed32(B b11, int i11, int i12);

    abstract void addFixed64(B b11, int i11, long j11);

    abstract void addGroup(B b11, int i11, T t2);

    abstract void addLengthDelimited(B b11, int i11, ByteString byteString);

    abstract void addVarint(B b11, int i11, long j11);

    abstract B getBuilderFromMessage(Object obj);

    abstract T getFromMessage(Object obj);

    abstract int getSerializedSize(T t2);

    abstract int getSerializedSizeAsMessageSet(T t2);

    abstract void makeImmutable(Object obj);

    abstract T merge(T t2, T t11);

    final boolean mergeOneFieldFrom(B b11, I i11, int i12) throws IOException {
        int tag = i11.getTag();
        int i13 = tag >>> 3;
        int i14 = tag & 7;
        if (i14 == 0) {
            addVarint(b11, i13, i11.readInt64());
            return true;
        }
        if (i14 == 1) {
            addFixed64(b11, i13, i11.readFixed64());
            return true;
        }
        if (i14 == 2) {
            addLengthDelimited(b11, i13, i11.readBytes());
            return true;
        }
        if (i14 != 3) {
            if (i14 == 4) {
                if (i12 != 0) {
                    return false;
                }
                throw InvalidProtocolBufferException.invalidEndTag();
            }
            if (i14 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            addFixed32(b11, i13, i11.readFixed32());
            return true;
        }
        B newBuilder = newBuilder();
        int i15 = 4 | (i13 << 3);
        int i16 = i12 + 1;
        if (i16 >= recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        mergeFrom(newBuilder, i11, i16);
        if (i15 != i11.getTag()) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        addGroup(b11, i13, toImmutable(newBuilder));
        return true;
    }

    abstract B newBuilder();

    abstract void setBuilderToMessage(Object obj, B b11);

    public void setRecursionLimit(int i11) {
        recursionLimit = i11;
    }

    abstract void setToMessage(Object obj, T t2);

    abstract boolean shouldDiscardUnknownFields(I i11);

    abstract T toImmutable(B b11);

    abstract void writeAsMessageSetTo(T t2, T t11) throws IOException;

    abstract void writeTo(T t2, T t11) throws IOException;
}
