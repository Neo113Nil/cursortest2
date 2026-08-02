package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FeatureSet;
import com.google.protobuf.DescriptorProtos$FieldOptions;
import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class DescriptorProtos$EnumValueOptions extends GeneratedMessageLite.ExtendableMessage<DescriptorProtos$EnumValueOptions, Builder> implements DescriptorProtos$EnumValueOptionsOrBuilder {
    public static final int DEBUG_REDACT_FIELD_NUMBER = 3;
    private static final DescriptorProtos$EnumValueOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 1;
    public static final int FEATURES_FIELD_NUMBER = 2;
    public static final int FEATURE_SUPPORT_FIELD_NUMBER = 4;
    private static volatile E<DescriptorProtos$EnumValueOptions> PARSER = null;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private int bitField0_;
    private boolean debugRedact_;
    private boolean deprecated_;
    private DescriptorProtos$FieldOptions.FeatureSupport featureSupport_;
    private DescriptorProtos$FeatureSet features_;
    private byte memoizedIsInitialized = 2;
    private Internal.e<DescriptorProtos$UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<DescriptorProtos$EnumValueOptions, Builder> implements DescriptorProtos$EnumValueOptionsOrBuilder {
        /* synthetic */ Builder(C5954e c5954e) {
            this();
        }

        public Builder addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).addAllUninterpretedOption(iterable);
            return this;
        }

        public Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).addUninterpretedOption(descriptorProtos$UninterpretedOption);
            return this;
        }

        public Builder clearDebugRedact() {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).clearDebugRedact();
            return this;
        }

        public Builder clearDeprecated() {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).clearDeprecated();
            return this;
        }

        public Builder clearFeatureSupport() {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).clearFeatureSupport();
            return this;
        }

        public Builder clearFeatures() {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).clearFeatures();
            return this;
        }

        public Builder clearUninterpretedOption() {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).clearUninterpretedOption();
            return this;
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
        public boolean getDebugRedact() {
            return ((DescriptorProtos$EnumValueOptions) this.instance).getDebugRedact();
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
        public boolean getDeprecated() {
            return ((DescriptorProtos$EnumValueOptions) this.instance).getDeprecated();
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
        public DescriptorProtos$FieldOptions.FeatureSupport getFeatureSupport() {
            return ((DescriptorProtos$EnumValueOptions) this.instance).getFeatureSupport();
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
        public DescriptorProtos$FeatureSet getFeatures() {
            return ((DescriptorProtos$EnumValueOptions) this.instance).getFeatures();
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
        public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i11) {
            return ((DescriptorProtos$EnumValueOptions) this.instance).getUninterpretedOption(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return ((DescriptorProtos$EnumValueOptions) this.instance).getUninterpretedOptionCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
        public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
            return Collections.unmodifiableList(((DescriptorProtos$EnumValueOptions) this.instance).getUninterpretedOptionList());
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
        public boolean hasDebugRedact() {
            return ((DescriptorProtos$EnumValueOptions) this.instance).hasDebugRedact();
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
        public boolean hasDeprecated() {
            return ((DescriptorProtos$EnumValueOptions) this.instance).hasDeprecated();
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
        public boolean hasFeatureSupport() {
            return ((DescriptorProtos$EnumValueOptions) this.instance).hasFeatureSupport();
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
        public boolean hasFeatures() {
            return ((DescriptorProtos$EnumValueOptions) this.instance).hasFeatures();
        }

        public Builder mergeFeatureSupport(DescriptorProtos$FieldOptions.FeatureSupport featureSupport) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).mergeFeatureSupport(featureSupport);
            return this;
        }

        public Builder mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).mergeFeatures(descriptorProtos$FeatureSet);
            return this;
        }

        public Builder removeUninterpretedOption(int i11) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).removeUninterpretedOption(i11);
            return this;
        }

        public Builder setDebugRedact(boolean z11) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).setDebugRedact(z11);
            return this;
        }

        public Builder setDeprecated(boolean z11) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).setDeprecated(z11);
            return this;
        }

        public Builder setFeatureSupport(DescriptorProtos$FieldOptions.FeatureSupport featureSupport) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).setFeatureSupport(featureSupport);
            return this;
        }

        public Builder setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).setFeatures(descriptorProtos$FeatureSet);
            return this;
        }

        public Builder setUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).setUninterpretedOption(i11, descriptorProtos$UninterpretedOption);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$EnumValueOptions.DEFAULT_INSTANCE);
        }

        public Builder addUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).addUninterpretedOption(i11, descriptorProtos$UninterpretedOption);
            return this;
        }

        public Builder setFeatureSupport(DescriptorProtos$FieldOptions.FeatureSupport.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).setFeatureSupport(builder.build());
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setFeatures(DescriptorProtos$FeatureSet.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).setFeatures((DescriptorProtos$FeatureSet) builder.build());
            return this;
        }

        public Builder setUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).setUninterpretedOption(i11, builder.build());
            return this;
        }

        public Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).addUninterpretedOption(builder.build());
            return this;
        }

        public Builder addUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumValueOptions) this.instance).addUninterpretedOption(i11, builder.build());
            return this;
        }
    }

    static {
        DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions = new DescriptorProtos$EnumValueOptions();
        DEFAULT_INSTANCE = descriptorProtos$EnumValueOptions;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$EnumValueOptions.class, descriptorProtos$EnumValueOptions);
    }

    private DescriptorProtos$EnumValueOptions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
        ensureUninterpretedOptionIsMutable();
        AbstractMessageLite.addAll(iterable, this.uninterpretedOption_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDebugRedact() {
        this.bitField0_ &= -5;
        this.debugRedact_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecated() {
        this.bitField0_ &= -2;
        this.deprecated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatureSupport() {
        this.featureSupport_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatures() {
        this.features_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUninterpretedOption() {
        this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureUninterpretedOptionIsMutable() {
        Internal.e<DescriptorProtos$UninterpretedOption> eVar = this.uninterpretedOption_;
        if (eVar.isModifiable()) {
            return;
        }
        this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    public static DescriptorProtos$EnumValueOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFeatureSupport(DescriptorProtos$FieldOptions.FeatureSupport featureSupport) {
        featureSupport.getClass();
        DescriptorProtos$FieldOptions.FeatureSupport featureSupport2 = this.featureSupport_;
        if (featureSupport2 == null || featureSupport2 == DescriptorProtos$FieldOptions.FeatureSupport.getDefaultInstance()) {
            this.featureSupport_ = featureSupport;
        } else {
            this.featureSupport_ = DescriptorProtos$FieldOptions.FeatureSupport.newBuilder(this.featureSupport_).mergeFrom((DescriptorProtos$FieldOptions.FeatureSupport.Builder) featureSupport).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
        descriptorProtos$FeatureSet.getClass();
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2 = this.features_;
        if (descriptorProtos$FeatureSet2 == null || descriptorProtos$FeatureSet2 == DescriptorProtos$FeatureSet.getDefaultInstance()) {
            this.features_ = descriptorProtos$FeatureSet;
        } else {
            this.features_ = ((DescriptorProtos$FeatureSet.Builder) DescriptorProtos$FeatureSet.newBuilder(this.features_).mergeFrom((DescriptorProtos$FeatureSet.Builder) descriptorProtos$FeatureSet)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$EnumValueOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$EnumValueOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$EnumValueOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DescriptorProtos$EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<DescriptorProtos$EnumValueOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUninterpretedOption(int i11) {
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDebugRedact(boolean z11) {
        this.bitField0_ |= 4;
        this.debugRedact_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecated(boolean z11) {
        this.bitField0_ |= 1;
        this.deprecated_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatureSupport(DescriptorProtos$FieldOptions.FeatureSupport featureSupport) {
        featureSupport.getClass();
        this.featureSupport_ = featureSupport;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
        descriptorProtos$FeatureSet.getClass();
        this.features_ = descriptorProtos$FeatureSet;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.set(i11, descriptorProtos$UninterpretedOption);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        C5954e c5954e = null;
        switch (C5954e.f60203a[bVar.ordinal()]) {
            case 1:
                return new DescriptorProtos$EnumValueOptions();
            case 2:
                return new Builder(c5954e);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001ϧ\u0005\u0000\u0001\u0002\u0001ဇ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဉ\u0003ϧЛ", new Object[]{"bitField0_", "deprecated_", "features_", "debugRedact_", "featureSupport_", "uninterpretedOption_", DescriptorProtos$UninterpretedOption.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<DescriptorProtos$EnumValueOptions> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (DescriptorProtos$EnumValueOptions.class) {
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

    @Override // com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public boolean getDebugRedact() {
        return this.debugRedact_;
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public DescriptorProtos$FieldOptions.FeatureSupport getFeatureSupport() {
        DescriptorProtos$FieldOptions.FeatureSupport featureSupport = this.featureSupport_;
        return featureSupport == null ? DescriptorProtos$FieldOptions.FeatureSupport.getDefaultInstance() : featureSupport;
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public DescriptorProtos$FeatureSet getFeatures() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i11) {
        return this.uninterpretedOption_.get(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public DescriptorProtos$UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i11) {
        return this.uninterpretedOption_.get(i11);
    }

    public List<? extends DescriptorProtos$UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public boolean hasDebugRedact() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public boolean hasDeprecated() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public boolean hasFeatureSupport() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public boolean hasFeatures() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(descriptorProtos$EnumValueOptions);
    }

    public static DescriptorProtos$EnumValueOptions parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$EnumValueOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$EnumValueOptions parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static DescriptorProtos$EnumValueOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DescriptorProtos$EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(i11, descriptorProtos$UninterpretedOption);
    }

    public static DescriptorProtos$EnumValueOptions parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static DescriptorProtos$EnumValueOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DescriptorProtos$EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$EnumValueOptions parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static DescriptorProtos$EnumValueOptions parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$EnumValueOptions parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$EnumValueOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DescriptorProtos$EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$EnumValueOptions parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
