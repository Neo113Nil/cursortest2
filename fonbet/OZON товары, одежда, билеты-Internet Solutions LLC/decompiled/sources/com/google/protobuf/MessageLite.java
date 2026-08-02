package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public interface MessageLite extends A {

    public interface Builder extends A, Cloneable {
        MessageLite build();

        MessageLite buildPartial();

        Builder clear();

        /* renamed from: clone */
        Builder mo19clone();

        /* synthetic */ MessageLite getDefaultInstanceForType();

        @Override // com.google.protobuf.A
        /* synthetic */ boolean isInitialized();

        boolean mergeDelimitedFrom(InputStream inputStream) throws IOException;

        boolean mergeDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException;

        Builder mergeFrom(ByteString byteString) throws InvalidProtocolBufferException;

        Builder mergeFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException;

        Builder mergeFrom(CodedInputStream codedInputStream) throws IOException;

        Builder mergeFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException;

        Builder mergeFrom(MessageLite messageLite);

        Builder mergeFrom(InputStream inputStream) throws IOException;

        Builder mergeFrom(InputStream inputStream, C5957h c5957h) throws IOException;

        Builder mergeFrom(byte[] bArr) throws InvalidProtocolBufferException;

        Builder mergeFrom(byte[] bArr, int i11, int i12) throws InvalidProtocolBufferException;

        Builder mergeFrom(byte[] bArr, int i11, int i12, C5957h c5957h) throws InvalidProtocolBufferException;

        Builder mergeFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException;
    }

    /* synthetic */ MessageLite getDefaultInstanceForType();

    E<? extends MessageLite> getParserForType();

    int getSerializedSize();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();

    Builder newBuilderForType();

    Builder toBuilder();

    byte[] toByteArray();

    ByteString toByteString();

    void writeDelimitedTo(OutputStream outputStream) throws IOException;

    void writeTo(CodedOutputStream codedOutputStream) throws IOException;

    void writeTo(OutputStream outputStream) throws IOException;
}
