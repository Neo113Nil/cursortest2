package com.google.protobuf;

import java.io.IOException;

/* compiled from: UnknownFieldSetLiteSchema.java */
/* loaded from: classes.dex */
public final class a0 extends z<UnknownFieldSetLite, UnknownFieldSetLite> {
    @Override // com.google.protobuf.z
    public final void a(int i, int i2, Object obj) {
        ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(i, 5), Integer.valueOf(i2));
    }

    @Override // com.google.protobuf.z
    public final void b(int i, long j, Object obj) {
        ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(i, 1), Long.valueOf(j));
    }

    @Override // com.google.protobuf.z
    public final void c(int i, Object obj, Object obj2) {
        ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(i, 3), (UnknownFieldSetLite) obj2);
    }

    @Override // com.google.protobuf.z
    public final void d(UnknownFieldSetLite unknownFieldSetLite, int i, ByteString byteString) {
        unknownFieldSetLite.storeField(WireFormat.makeTag(i, 2), byteString);
    }

    @Override // com.google.protobuf.z
    public final void e(int i, long j, Object obj) {
        ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(i, 0), Long.valueOf(j));
    }

    @Override // com.google.protobuf.z
    public final UnknownFieldSetLite f(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite newInstance = UnknownFieldSetLite.newInstance();
        generatedMessageLite.unknownFields = newInstance;
        return newInstance;
    }

    @Override // com.google.protobuf.z
    public final UnknownFieldSetLite g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // com.google.protobuf.z
    public final int h(UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.getSerializedSize();
    }

    @Override // com.google.protobuf.z
    public final int i(UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.getSerializedSizeAsMessageSet();
    }

    @Override // com.google.protobuf.z
    public final void j(Object obj) {
        ((GeneratedMessageLite) obj).unknownFields.makeImmutable();
    }

    @Override // com.google.protobuf.z
    public final UnknownFieldSetLite k(Object obj, Object obj2) {
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        UnknownFieldSetLite unknownFieldSetLite2 = (UnknownFieldSetLite) obj2;
        return UnknownFieldSetLite.getDefaultInstance().equals(unknownFieldSetLite2) ? unknownFieldSetLite : UnknownFieldSetLite.getDefaultInstance().equals(unknownFieldSetLite) ? UnknownFieldSetLite.mutableCopyOf(unknownFieldSetLite, unknownFieldSetLite2) : unknownFieldSetLite.mergeFrom(unknownFieldSetLite2);
    }

    @Override // com.google.protobuf.z
    public final UnknownFieldSetLite m() {
        return UnknownFieldSetLite.newInstance();
    }

    @Override // com.google.protobuf.z
    public final void n(Object obj, UnknownFieldSetLite unknownFieldSetLite) {
        ((GeneratedMessageLite) obj).unknownFields = unknownFieldSetLite;
    }

    @Override // com.google.protobuf.z
    public final void o(Object obj, UnknownFieldSetLite unknownFieldSetLite) {
        ((GeneratedMessageLite) obj).unknownFields = unknownFieldSetLite;
    }

    @Override // com.google.protobuf.z
    public final UnknownFieldSetLite p(Object obj) {
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        unknownFieldSetLite.makeImmutable();
        return unknownFieldSetLite;
    }

    @Override // com.google.protobuf.z
    public final void q(UnknownFieldSetLite unknownFieldSetLite, Writer writer) throws IOException {
        unknownFieldSetLite.writeAsMessageSetTo(writer);
    }

    @Override // com.google.protobuf.z
    public final void r(UnknownFieldSetLite unknownFieldSetLite, Writer writer) throws IOException {
        unknownFieldSetLite.writeTo(writer);
    }
}
