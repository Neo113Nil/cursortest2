package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
class UnknownFieldSetLiteSchema extends N<O, O> {
    UnknownFieldSetLiteSchema() {
    }

    @Override // com.google.protobuf.N
    void makeImmutable(Object obj) {
        getFromMessage(obj).f();
    }

    @Override // com.google.protobuf.N
    boolean shouldDiscardUnknownFields(I i11) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.N
    public void addFixed32(O o11, int i11, int i12) {
        o11.l((i11 << 3) | 5, Integer.valueOf(i12));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.N
    public void addFixed64(O o11, int i11, long j11) {
        o11.l((i11 << 3) | 1, Long.valueOf(j11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.N
    public void addGroup(O o11, int i11, O o12) {
        o11.l((i11 << 3) | 3, o12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.N
    public void addLengthDelimited(O o11, int i11, ByteString byteString) {
        o11.l((i11 << 3) | 2, byteString);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.N
    public void addVarint(O o11, int i11, long j11) {
        o11.l(i11 << 3, Long.valueOf(j11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.protobuf.N
    public O getBuilderFromMessage(Object obj) {
        O fromMessage = getFromMessage(obj);
        if (fromMessage != O.c()) {
            return fromMessage;
        }
        O j11 = O.j();
        setToMessage(obj, j11);
        return j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.protobuf.N
    public O getFromMessage(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.N
    public int getSerializedSize(O o11) {
        return o11.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.N
    public int getSerializedSizeAsMessageSet(O o11) {
        return o11.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.N
    public O merge(O o11, O o12) {
        if (O.c().equals(o12)) {
            return o11;
        }
        if (O.c().equals(o11)) {
            return O.i(o11, o12);
        }
        o11.h(o12);
        return o11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.protobuf.N
    public O newBuilder() {
        return O.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.N
    public void setBuilderToMessage(Object obj, O o11) {
        setToMessage(obj, o11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.N
    public void setToMessage(Object obj, O o11) {
        ((GeneratedMessageLite) obj).unknownFields = o11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.N
    public O toImmutable(O o11) {
        o11.f();
        return o11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.N
    public void writeAsMessageSetTo(O o11, T t2) throws IOException {
        o11.m(t2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.N
    public void writeTo(O o11, T t2) throws IOException {
        o11.o(t2);
    }
}
