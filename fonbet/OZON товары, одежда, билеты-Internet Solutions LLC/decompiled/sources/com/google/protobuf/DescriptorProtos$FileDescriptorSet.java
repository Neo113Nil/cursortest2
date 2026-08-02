package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FileDescriptorProto;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class DescriptorProtos$FileDescriptorSet extends GeneratedMessageLite.ExtendableMessage<DescriptorProtos$FileDescriptorSet, Builder> implements DescriptorProtos$FileDescriptorSetOrBuilder {
    private static final DescriptorProtos$FileDescriptorSet DEFAULT_INSTANCE;
    public static final int FILE_FIELD_NUMBER = 1;
    private static volatile E<DescriptorProtos$FileDescriptorSet> PARSER;
    private byte memoizedIsInitialized = 2;
    private Internal.e<DescriptorProtos$FileDescriptorProto> file_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<DescriptorProtos$FileDescriptorSet, Builder> implements DescriptorProtos$FileDescriptorSetOrBuilder {
        /* synthetic */ Builder(C5954e c5954e) {
            this();
        }

        public Builder addAllFile(Iterable<? extends DescriptorProtos$FileDescriptorProto> iterable) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorSet) this.instance).addAllFile(iterable);
            return this;
        }

        public Builder addFile(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorSet) this.instance).addFile(descriptorProtos$FileDescriptorProto);
            return this;
        }

        public Builder clearFile() {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorSet) this.instance).clearFile();
            return this;
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorSetOrBuilder
        public DescriptorProtos$FileDescriptorProto getFile(int i11) {
            return ((DescriptorProtos$FileDescriptorSet) this.instance).getFile(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorSetOrBuilder
        public int getFileCount() {
            return ((DescriptorProtos$FileDescriptorSet) this.instance).getFileCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorSetOrBuilder
        public List<DescriptorProtos$FileDescriptorProto> getFileList() {
            return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorSet) this.instance).getFileList());
        }

        public Builder removeFile(int i11) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorSet) this.instance).removeFile(i11);
            return this;
        }

        public Builder setFile(int i11, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorSet) this.instance).setFile(i11, descriptorProtos$FileDescriptorProto);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$FileDescriptorSet.DEFAULT_INSTANCE);
        }

        public Builder addFile(int i11, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorSet) this.instance).addFile(i11, descriptorProtos$FileDescriptorProto);
            return this;
        }

        public Builder setFile(int i11, DescriptorProtos$FileDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorSet) this.instance).setFile(i11, builder.build());
            return this;
        }

        public Builder addFile(DescriptorProtos$FileDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorSet) this.instance).addFile(builder.build());
            return this;
        }

        public Builder addFile(int i11, DescriptorProtos$FileDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorSet) this.instance).addFile(i11, builder.build());
            return this;
        }
    }

    static {
        DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet = new DescriptorProtos$FileDescriptorSet();
        DEFAULT_INSTANCE = descriptorProtos$FileDescriptorSet;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$FileDescriptorSet.class, descriptorProtos$FileDescriptorSet);
    }

    private DescriptorProtos$FileDescriptorSet() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFile(Iterable<? extends DescriptorProtos$FileDescriptorProto> iterable) {
        ensureFileIsMutable();
        AbstractMessageLite.addAll(iterable, this.file_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFile(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        descriptorProtos$FileDescriptorProto.getClass();
        ensureFileIsMutable();
        this.file_.add(descriptorProtos$FileDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFile() {
        this.file_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureFileIsMutable() {
        Internal.e<DescriptorProtos$FileDescriptorProto> eVar = this.file_;
        if (eVar.isModifiable()) {
            return;
        }
        this.file_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    public static DescriptorProtos$FileDescriptorSet getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$FileDescriptorSet parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<DescriptorProtos$FileDescriptorSet> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFile(int i11) {
        ensureFileIsMutable();
        this.file_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFile(int i11, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        descriptorProtos$FileDescriptorProto.getClass();
        ensureFileIsMutable();
        this.file_.set(i11, descriptorProtos$FileDescriptorProto);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        C5954e c5954e = null;
        switch (C5954e.f60203a[bVar.ordinal()]) {
            case 1:
                return new DescriptorProtos$FileDescriptorSet();
            case 2:
                return new Builder(c5954e);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"file_", DescriptorProtos$FileDescriptorProto.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<DescriptorProtos$FileDescriptorSet> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (DescriptorProtos$FileDescriptorSet.class) {
                    try {
                        e11 = PARSER;
                        if (e11 == null) {
                            e11 = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = e11;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return e11;
            case 6:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 7:
                this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                return null;
            default:
                throw null;
        }
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorSetOrBuilder
    public DescriptorProtos$FileDescriptorProto getFile(int i11) {
        return this.file_.get(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorSetOrBuilder
    public int getFileCount() {
        return this.file_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorSetOrBuilder
    public List<DescriptorProtos$FileDescriptorProto> getFileList() {
        return this.file_;
    }

    public DescriptorProtos$FileDescriptorProtoOrBuilder getFileOrBuilder(int i11) {
        return this.file_.get(i11);
    }

    public List<? extends DescriptorProtos$FileDescriptorProtoOrBuilder> getFileOrBuilderList() {
        return this.file_;
    }

    public static Builder newBuilder(DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(descriptorProtos$FileDescriptorSet);
    }

    public static DescriptorProtos$FileDescriptorSet parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFile(int i11, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        descriptorProtos$FileDescriptorProto.getClass();
        ensureFileIsMutable();
        this.file_.add(i11, descriptorProtos$FileDescriptorProto);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
