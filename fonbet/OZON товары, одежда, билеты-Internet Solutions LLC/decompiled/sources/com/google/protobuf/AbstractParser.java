package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public abstract class AbstractParser<MessageType extends MessageLite> implements E<MessageType> {
    private static final C5957h EMPTY_REGISTRY = C5957h.b();

    private MessageType checkMessageInitialized(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        M newUninitializedMessageException = newUninitializedMessageException(messagetype);
        newUninitializedMessageException.getClass();
        throw new InvalidProtocolBufferException(newUninitializedMessageException.getMessage()).setUnfinishedMessage(messagetype);
    }

    private M newUninitializedMessageException(MessageType messagetype) {
        return messagetype instanceof AbstractMessageLite ? ((AbstractMessageLite) messagetype).newUninitializedMessageException() : new M();
    }

    @Override // com.google.protobuf.E
    public abstract /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, C5957h c5957h) throws InvalidProtocolBufferException;

    /* renamed from: parseDelimitedFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m21parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws InvalidProtocolBufferException {
        return checkMessageInitialized(m34parsePartialDelimitedFrom(inputStream, c5957h));
    }

    /* renamed from: parsePartialDelimitedFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m34parsePartialDelimitedFrom(InputStream inputStream, C5957h c5957h) throws InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return m39parsePartialFrom((InputStream) new AbstractMessageLite.Builder.a(inputStream, CodedInputStream.readRawVarint32(read, inputStream)), c5957h);
        } catch (IOException e11) {
            throw new InvalidProtocolBufferException(e11);
        }
    }

    /* renamed from: parseDelimitedFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m20parseDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return m21parseDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    /* renamed from: parsePartialDelimitedFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m33parsePartialDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return m34parsePartialDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m37parsePartialFrom(CodedInputStream codedInputStream) throws InvalidProtocolBufferException {
        return (MessageType) parsePartialFrom(codedInputStream, EMPTY_REGISTRY);
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m36parsePartialFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        CodedInputStream newCodedInput = byteString.newCodedInput();
        MessageType messagetype = (MessageType) parsePartialFrom(newCodedInput, c5957h);
        try {
            newCodedInput.checkLastTagWas(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e11) {
            throw e11.setUnfinishedMessage(messagetype);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: parseFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m24parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized((MessageLite) parsePartialFrom(codedInputStream, c5957h));
    }

    /* renamed from: parseFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m23parseFrom(CodedInputStream codedInputStream) throws InvalidProtocolBufferException {
        return m24parseFrom(codedInputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.E
    public MessageType parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return checkMessageInitialized(m36parsePartialFrom(byteString, c5957h));
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m35parsePartialFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return m36parsePartialFrom(byteString, EMPTY_REGISTRY);
    }

    /* renamed from: parseFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m22parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return parseFrom(byteString, EMPTY_REGISTRY);
    }

    @Override // 
    /* renamed from: parsePartialFrom */
    public MessageType mo42parsePartialFrom(byte[] bArr, int i11, int i12, C5957h c5957h) throws InvalidProtocolBufferException {
        CodedInputStream newInstance = CodedInputStream.newInstance(bArr, i11, i12);
        MessageType messagetype = (MessageType) parsePartialFrom(newInstance, c5957h);
        try {
            newInstance.checkLastTagWas(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e11) {
            throw e11.setUnfinishedMessage(messagetype);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: parseFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m28parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        CodedInputStream newInstance = CodedInputStream.newInstance(byteBuffer);
        MessageLite messageLite = (MessageLite) parsePartialFrom(newInstance, c5957h);
        try {
            newInstance.checkLastTagWas(0);
            return (MessageType) checkMessageInitialized(messageLite);
        } catch (InvalidProtocolBufferException e11) {
            throw e11.setUnfinishedMessage(messageLite);
        }
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m41parsePartialFrom(byte[] bArr, int i11, int i12) throws InvalidProtocolBufferException {
        return mo42parsePartialFrom(bArr, i11, i12, EMPTY_REGISTRY);
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m43parsePartialFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return mo42parsePartialFrom(bArr, 0, bArr.length, c5957h);
    }

    /* renamed from: parseFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m27parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return m28parseFrom(byteBuffer, EMPTY_REGISTRY);
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m40parsePartialFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return mo42parsePartialFrom(bArr, 0, bArr.length, EMPTY_REGISTRY);
    }

    /* renamed from: parseFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m31parseFrom(byte[] bArr, int i11, int i12, C5957h c5957h) throws InvalidProtocolBufferException {
        return checkMessageInitialized(mo42parsePartialFrom(bArr, i11, i12, c5957h));
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m39parsePartialFrom(InputStream inputStream, C5957h c5957h) throws InvalidProtocolBufferException {
        CodedInputStream newInstance = CodedInputStream.newInstance(inputStream);
        MessageType messagetype = (MessageType) parsePartialFrom(newInstance, c5957h);
        try {
            newInstance.checkLastTagWas(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e11) {
            throw e11.setUnfinishedMessage(messagetype);
        }
    }

    /* renamed from: parseFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m30parseFrom(byte[] bArr, int i11, int i12) throws InvalidProtocolBufferException {
        return m31parseFrom(bArr, i11, i12, EMPTY_REGISTRY);
    }

    /* renamed from: parseFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m32parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return m31parseFrom(bArr, 0, bArr.length, c5957h);
    }

    /* renamed from: parseFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m29parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return m32parseFrom(bArr, EMPTY_REGISTRY);
    }

    /* renamed from: parseFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m26parseFrom(InputStream inputStream, C5957h c5957h) throws InvalidProtocolBufferException {
        return checkMessageInitialized(m39parsePartialFrom(inputStream, c5957h));
    }

    /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m38parsePartialFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return m39parsePartialFrom(inputStream, EMPTY_REGISTRY);
    }

    /* renamed from: parseFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m25parseFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return m26parseFrom(inputStream, EMPTY_REGISTRY);
    }
}
