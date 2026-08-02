package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.google.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public final class DescriptorProtos$MethodDescriptorProto extends GeneratedMessageLite<DescriptorProtos$MethodDescriptorProto, Builder> implements DescriptorProtos$MethodDescriptorProtoOrBuilder {
    public static final int CLIENT_STREAMING_FIELD_NUMBER = 5;
    private static final DescriptorProtos$MethodDescriptorProto DEFAULT_INSTANCE;
    public static final int INPUT_TYPE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    public static final int OUTPUT_TYPE_FIELD_NUMBER = 3;
    private static volatile E<DescriptorProtos$MethodDescriptorProto> PARSER = null;
    public static final int SERVER_STREAMING_FIELD_NUMBER = 6;
    private int bitField0_;
    private boolean clientStreaming_;
    private DescriptorProtos$MethodOptions options_;
    private boolean serverStreaming_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private String inputType_ = "";
    private String outputType_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<DescriptorProtos$MethodDescriptorProto, Builder> implements DescriptorProtos$MethodDescriptorProtoOrBuilder {
        /* synthetic */ Builder(C5954e c5954e) {
            this();
        }

        public Builder clearClientStreaming() {
            copyOnWrite();
            ((DescriptorProtos$MethodDescriptorProto) this.instance).clearClientStreaming();
            return this;
        }

        public Builder clearInputType() {
            copyOnWrite();
            ((DescriptorProtos$MethodDescriptorProto) this.instance).clearInputType();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((DescriptorProtos$MethodDescriptorProto) this.instance).clearName();
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            ((DescriptorProtos$MethodDescriptorProto) this.instance).clearOptions();
            return this;
        }

        public Builder clearOutputType() {
            copyOnWrite();
            ((DescriptorProtos$MethodDescriptorProto) this.instance).clearOutputType();
            return this;
        }

        public Builder clearServerStreaming() {
            copyOnWrite();
            ((DescriptorProtos$MethodDescriptorProto) this.instance).clearServerStreaming();
            return this;
        }

        @Override // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
        public boolean getClientStreaming() {
            return ((DescriptorProtos$MethodDescriptorProto) this.instance).getClientStreaming();
        }

        @Override // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
        public String getInputType() {
            return ((DescriptorProtos$MethodDescriptorProto) this.instance).getInputType();
        }

        @Override // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
        public ByteString getInputTypeBytes() {
            return ((DescriptorProtos$MethodDescriptorProto) this.instance).getInputTypeBytes();
        }

        @Override // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
        public String getName() {
            return ((DescriptorProtos$MethodDescriptorProto) this.instance).getName();
        }

        @Override // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
            return ((DescriptorProtos$MethodDescriptorProto) this.instance).getNameBytes();
        }

        @Override // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
        public DescriptorProtos$MethodOptions getOptions() {
            return ((DescriptorProtos$MethodDescriptorProto) this.instance).getOptions();
        }

        @Override // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
        public String getOutputType() {
            return ((DescriptorProtos$MethodDescriptorProto) this.instance).getOutputType();
        }

        @Override // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
        public ByteString getOutputTypeBytes() {
            return ((DescriptorProtos$MethodDescriptorProto) this.instance).getOutputTypeBytes();
        }

        @Override // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
        public boolean getServerStreaming() {
            return ((DescriptorProtos$MethodDescriptorProto) this.instance).getServerStreaming();
        }

        @Override // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
        public boolean hasClientStreaming() {
            return ((DescriptorProtos$MethodDescriptorProto) this.instance).hasClientStreaming();
        }

        @Override // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
        public boolean hasInputType() {
            return ((DescriptorProtos$MethodDescriptorProto) this.instance).hasInputType();
        }

        @Override // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
        public boolean hasName() {
            return ((DescriptorProtos$MethodDescriptorProto) this.instance).hasName();
        }

        @Override // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
        public boolean hasOptions() {
            return ((DescriptorProtos$MethodDescriptorProto) this.instance).hasOptions();
        }

        @Override // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
        public boolean hasOutputType() {
            return ((DescriptorProtos$MethodDescriptorProto) this.instance).hasOutputType();
        }

        @Override // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
        public boolean hasServerStreaming() {
            return ((DescriptorProtos$MethodDescriptorProto) this.instance).hasServerStreaming();
        }

        public Builder mergeOptions(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
            copyOnWrite();
            ((DescriptorProtos$MethodDescriptorProto) this.instance).mergeOptions(descriptorProtos$MethodOptions);
            return this;
        }

        public Builder setClientStreaming(boolean z11) {
            copyOnWrite();
            ((DescriptorProtos$MethodDescriptorProto) this.instance).setClientStreaming(z11);
            return this;
        }

        public Builder setInputType(String str) {
            copyOnWrite();
            ((DescriptorProtos$MethodDescriptorProto) this.instance).setInputType(str);
            return this;
        }

        public Builder setInputTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((DescriptorProtos$MethodDescriptorProto) this.instance).setInputTypeBytes(byteString);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((DescriptorProtos$MethodDescriptorProto) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((DescriptorProtos$MethodDescriptorProto) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setOptions(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
            copyOnWrite();
            ((DescriptorProtos$MethodDescriptorProto) this.instance).setOptions(descriptorProtos$MethodOptions);
            return this;
        }

        public Builder setOutputType(String str) {
            copyOnWrite();
            ((DescriptorProtos$MethodDescriptorProto) this.instance).setOutputType(str);
            return this;
        }

        public Builder setOutputTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((DescriptorProtos$MethodDescriptorProto) this.instance).setOutputTypeBytes(byteString);
            return this;
        }

        public Builder setServerStreaming(boolean z11) {
            copyOnWrite();
            ((DescriptorProtos$MethodDescriptorProto) this.instance).setServerStreaming(z11);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$MethodDescriptorProto.DEFAULT_INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setOptions(DescriptorProtos$MethodOptions.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$MethodDescriptorProto) this.instance).setOptions((DescriptorProtos$MethodOptions) builder.build());
            return this;
        }
    }

    static {
        DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto = new DescriptorProtos$MethodDescriptorProto();
        DEFAULT_INSTANCE = descriptorProtos$MethodDescriptorProto;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$MethodDescriptorProto.class, descriptorProtos$MethodDescriptorProto);
    }

    private DescriptorProtos$MethodDescriptorProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientStreaming() {
        this.bitField0_ &= -17;
        this.clientStreaming_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInputType() {
        this.bitField0_ &= -3;
        this.inputType_ = getDefaultInstance().getInputType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOutputType() {
        this.bitField0_ &= -5;
        this.outputType_ = getDefaultInstance().getOutputType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerStreaming() {
        this.bitField0_ &= -33;
        this.serverStreaming_ = false;
    }

    public static DescriptorProtos$MethodDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeOptions(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
        descriptorProtos$MethodOptions.getClass();
        DescriptorProtos$MethodOptions descriptorProtos$MethodOptions2 = this.options_;
        if (descriptorProtos$MethodOptions2 == null || descriptorProtos$MethodOptions2 == DescriptorProtos$MethodOptions.getDefaultInstance()) {
            this.options_ = descriptorProtos$MethodOptions;
        } else {
            this.options_ = ((DescriptorProtos$MethodOptions.Builder) DescriptorProtos$MethodOptions.newBuilder(this.options_).mergeFrom((DescriptorProtos$MethodOptions.Builder) descriptorProtos$MethodOptions)).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$MethodDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$MethodDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DescriptorProtos$MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<DescriptorProtos$MethodDescriptorProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientStreaming(boolean z11) {
        this.bitField0_ |= 16;
        this.clientStreaming_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInputType(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.inputType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInputTypeBytes(ByteString byteString) {
        this.inputType_ = byteString.toStringUtf8();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        this.name_ = byteString.toStringUtf8();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
        descriptorProtos$MethodOptions.getClass();
        this.options_ = descriptorProtos$MethodOptions;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutputType(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.outputType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutputTypeBytes(ByteString byteString) {
        this.outputType_ = byteString.toStringUtf8();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerStreaming(boolean z11) {
        this.bitField0_ |= 32;
        this.serverStreaming_ = z11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        C5954e c5954e = null;
        switch (C5954e.f60203a[bVar.ordinal()]) {
            case 1:
                return new DescriptorProtos$MethodDescriptorProto();
            case 2:
                return new Builder(c5954e);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"bitField0_", "name_", "inputType_", "outputType_", "options_", "clientStreaming_", "serverStreaming_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<DescriptorProtos$MethodDescriptorProto> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (DescriptorProtos$MethodDescriptorProto.class) {
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

    @Override // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
    public boolean getClientStreaming() {
        return this.clientStreaming_;
    }

    @Override // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
    public String getInputType() {
        return this.inputType_;
    }

    @Override // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
    public ByteString getInputTypeBytes() {
        return ByteString.copyFromUtf8(this.inputType_);
    }

    @Override // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
    public DescriptorProtos$MethodOptions getOptions() {
        DescriptorProtos$MethodOptions descriptorProtos$MethodOptions = this.options_;
        return descriptorProtos$MethodOptions == null ? DescriptorProtos$MethodOptions.getDefaultInstance() : descriptorProtos$MethodOptions;
    }

    @Override // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
    public String getOutputType() {
        return this.outputType_;
    }

    @Override // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
    public ByteString getOutputTypeBytes() {
        return ByteString.copyFromUtf8(this.outputType_);
    }

    @Override // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
    public boolean getServerStreaming() {
        return this.serverStreaming_;
    }

    @Override // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
    public boolean hasClientStreaming() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
    public boolean hasInputType() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
    public boolean hasOptions() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
    public boolean hasOutputType() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
    public boolean hasServerStreaming() {
        return (this.bitField0_ & 32) != 0;
    }

    public static Builder newBuilder(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(descriptorProtos$MethodDescriptorProto);
    }

    public static DescriptorProtos$MethodDescriptorProto parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$MethodDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DescriptorProtos$MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DescriptorProtos$MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DescriptorProtos$MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
