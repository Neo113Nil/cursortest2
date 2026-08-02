package com.google.protobuf;

/* loaded from: classes9.dex */
public interface E<MessageType> {
    MessageType parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException;

    MessageType parsePartialFrom(CodedInputStream codedInputStream, C5957h c5957h) throws InvalidProtocolBufferException;
}
