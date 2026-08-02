package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$MethodDescriptorProto;
import com.google.protobuf.DescriptorProtos$ServiceOptions;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class DescriptorProtos$ServiceDescriptorProto extends GeneratedMessageLite<DescriptorProtos$ServiceDescriptorProto, Builder> implements DescriptorProtos$ServiceDescriptorProtoOrBuilder {
    private static final DescriptorProtos$ServiceDescriptorProto DEFAULT_INSTANCE;
    public static final int METHOD_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile E<DescriptorProtos$ServiceDescriptorProto> PARSER;
    private int bitField0_;
    private DescriptorProtos$ServiceOptions options_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private Internal.e<DescriptorProtos$MethodDescriptorProto> method_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<DescriptorProtos$ServiceDescriptorProto, Builder> implements DescriptorProtos$ServiceDescriptorProtoOrBuilder {
        /* synthetic */ Builder(C5954e c5954e) {
            this();
        }

        public Builder addAllMethod(Iterable<? extends DescriptorProtos$MethodDescriptorProto> iterable) {
            copyOnWrite();
            ((DescriptorProtos$ServiceDescriptorProto) this.instance).addAllMethod(iterable);
            return this;
        }

        public Builder addMethod(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$ServiceDescriptorProto) this.instance).addMethod(descriptorProtos$MethodDescriptorProto);
            return this;
        }

        public Builder clearMethod() {
            copyOnWrite();
            ((DescriptorProtos$ServiceDescriptorProto) this.instance).clearMethod();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((DescriptorProtos$ServiceDescriptorProto) this.instance).clearName();
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            ((DescriptorProtos$ServiceDescriptorProto) this.instance).clearOptions();
            return this;
        }

        @Override // com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
        public DescriptorProtos$MethodDescriptorProto getMethod(int i11) {
            return ((DescriptorProtos$ServiceDescriptorProto) this.instance).getMethod(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
        public int getMethodCount() {
            return ((DescriptorProtos$ServiceDescriptorProto) this.instance).getMethodCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
        public List<DescriptorProtos$MethodDescriptorProto> getMethodList() {
            return Collections.unmodifiableList(((DescriptorProtos$ServiceDescriptorProto) this.instance).getMethodList());
        }

        @Override // com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
        public String getName() {
            return ((DescriptorProtos$ServiceDescriptorProto) this.instance).getName();
        }

        @Override // com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
            return ((DescriptorProtos$ServiceDescriptorProto) this.instance).getNameBytes();
        }

        @Override // com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
        public DescriptorProtos$ServiceOptions getOptions() {
            return ((DescriptorProtos$ServiceDescriptorProto) this.instance).getOptions();
        }

        @Override // com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
        public boolean hasName() {
            return ((DescriptorProtos$ServiceDescriptorProto) this.instance).hasName();
        }

        @Override // com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
        public boolean hasOptions() {
            return ((DescriptorProtos$ServiceDescriptorProto) this.instance).hasOptions();
        }

        public Builder mergeOptions(DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions) {
            copyOnWrite();
            ((DescriptorProtos$ServiceDescriptorProto) this.instance).mergeOptions(descriptorProtos$ServiceOptions);
            return this;
        }

        public Builder removeMethod(int i11) {
            copyOnWrite();
            ((DescriptorProtos$ServiceDescriptorProto) this.instance).removeMethod(i11);
            return this;
        }

        public Builder setMethod(int i11, DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$ServiceDescriptorProto) this.instance).setMethod(i11, descriptorProtos$MethodDescriptorProto);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((DescriptorProtos$ServiceDescriptorProto) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((DescriptorProtos$ServiceDescriptorProto) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setOptions(DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions) {
            copyOnWrite();
            ((DescriptorProtos$ServiceDescriptorProto) this.instance).setOptions(descriptorProtos$ServiceOptions);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$ServiceDescriptorProto.DEFAULT_INSTANCE);
        }

        public Builder addMethod(int i11, DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$ServiceDescriptorProto) this.instance).addMethod(i11, descriptorProtos$MethodDescriptorProto);
            return this;
        }

        public Builder setMethod(int i11, DescriptorProtos$MethodDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$ServiceDescriptorProto) this.instance).setMethod(i11, builder.build());
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setOptions(DescriptorProtos$ServiceOptions.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$ServiceDescriptorProto) this.instance).setOptions((DescriptorProtos$ServiceOptions) builder.build());
            return this;
        }

        public Builder addMethod(DescriptorProtos$MethodDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$ServiceDescriptorProto) this.instance).addMethod(builder.build());
            return this;
        }

        public Builder addMethod(int i11, DescriptorProtos$MethodDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$ServiceDescriptorProto) this.instance).addMethod(i11, builder.build());
            return this;
        }
    }

    static {
        DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto = new DescriptorProtos$ServiceDescriptorProto();
        DEFAULT_INSTANCE = descriptorProtos$ServiceDescriptorProto;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$ServiceDescriptorProto.class, descriptorProtos$ServiceDescriptorProto);
    }

    private DescriptorProtos$ServiceDescriptorProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMethod(Iterable<? extends DescriptorProtos$MethodDescriptorProto> iterable) {
        ensureMethodIsMutable();
        AbstractMessageLite.addAll(iterable, this.method_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMethod(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        descriptorProtos$MethodDescriptorProto.getClass();
        ensureMethodIsMutable();
        this.method_.add(descriptorProtos$MethodDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMethod() {
        this.method_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = null;
        this.bitField0_ &= -3;
    }

    private void ensureMethodIsMutable() {
        Internal.e<DescriptorProtos$MethodDescriptorProto> eVar = this.method_;
        if (eVar.isModifiable()) {
            return;
        }
        this.method_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    public static DescriptorProtos$ServiceDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeOptions(DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions) {
        descriptorProtos$ServiceOptions.getClass();
        DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions2 = this.options_;
        if (descriptorProtos$ServiceOptions2 == null || descriptorProtos$ServiceOptions2 == DescriptorProtos$ServiceOptions.getDefaultInstance()) {
            this.options_ = descriptorProtos$ServiceOptions;
        } else {
            this.options_ = ((DescriptorProtos$ServiceOptions.Builder) DescriptorProtos$ServiceOptions.newBuilder(this.options_).mergeFrom((DescriptorProtos$ServiceOptions.Builder) descriptorProtos$ServiceOptions)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$ServiceDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<DescriptorProtos$ServiceDescriptorProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMethod(int i11) {
        ensureMethodIsMutable();
        this.method_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMethod(int i11, DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        descriptorProtos$MethodDescriptorProto.getClass();
        ensureMethodIsMutable();
        this.method_.set(i11, descriptorProtos$MethodDescriptorProto);
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
    public void setOptions(DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions) {
        descriptorProtos$ServiceOptions.getClass();
        this.options_ = descriptorProtos$ServiceOptions;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        C5954e c5954e = null;
        switch (C5954e.f60203a[bVar.ordinal()]) {
            case 1:
                return new DescriptorProtos$ServiceDescriptorProto();
            case 2:
                return new Builder(c5954e);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001", new Object[]{"bitField0_", "name_", "method_", DescriptorProtos$MethodDescriptorProto.class, "options_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<DescriptorProtos$ServiceDescriptorProto> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (DescriptorProtos$ServiceDescriptorProto.class) {
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

    @Override // com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
    public DescriptorProtos$MethodDescriptorProto getMethod(int i11) {
        return this.method_.get(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
    public int getMethodCount() {
        return this.method_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
    public List<DescriptorProtos$MethodDescriptorProto> getMethodList() {
        return this.method_;
    }

    public DescriptorProtos$MethodDescriptorProtoOrBuilder getMethodOrBuilder(int i11) {
        return this.method_.get(i11);
    }

    public List<? extends DescriptorProtos$MethodDescriptorProtoOrBuilder> getMethodOrBuilderList() {
        return this.method_;
    }

    @Override // com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
    public DescriptorProtos$ServiceOptions getOptions() {
        DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions = this.options_;
        return descriptorProtos$ServiceOptions == null ? DescriptorProtos$ServiceOptions.getDefaultInstance() : descriptorProtos$ServiceOptions;
    }

    @Override // com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
    public boolean hasOptions() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(descriptorProtos$ServiceDescriptorProto);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMethod(int i11, DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        descriptorProtos$MethodDescriptorProto.getClass();
        ensureMethodIsMutable();
        this.method_.add(i11, descriptorProtos$MethodDescriptorProto);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
