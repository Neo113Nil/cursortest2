package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FeatureSet;
import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class DescriptorProtos$EnumOptions extends GeneratedMessageLite.ExtendableMessage<DescriptorProtos$EnumOptions, Builder> implements DescriptorProtos$EnumOptionsOrBuilder {
    public static final int ALLOW_ALIAS_FIELD_NUMBER = 2;
    private static final DescriptorProtos$EnumOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 3;
    public static final int DEPRECATED_LEGACY_JSON_FIELD_CONFLICTS_FIELD_NUMBER = 6;
    public static final int FEATURES_FIELD_NUMBER = 7;
    private static volatile E<DescriptorProtos$EnumOptions> PARSER = null;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private boolean allowAlias_;
    private int bitField0_;
    private boolean deprecatedLegacyJsonFieldConflicts_;
    private boolean deprecated_;
    private DescriptorProtos$FeatureSet features_;
    private byte memoizedIsInitialized = 2;
    private Internal.e<DescriptorProtos$UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<DescriptorProtos$EnumOptions, Builder> implements DescriptorProtos$EnumOptionsOrBuilder {
        /* synthetic */ Builder(C5954e c5954e) {
            this();
        }

        public Builder addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).addAllUninterpretedOption(iterable);
            return this;
        }

        public Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).addUninterpretedOption(descriptorProtos$UninterpretedOption);
            return this;
        }

        public Builder clearAllowAlias() {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).clearAllowAlias();
            return this;
        }

        public Builder clearDeprecated() {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).clearDeprecated();
            return this;
        }

        @Deprecated
        public Builder clearDeprecatedLegacyJsonFieldConflicts() {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).clearDeprecatedLegacyJsonFieldConflicts();
            return this;
        }

        public Builder clearFeatures() {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).clearFeatures();
            return this;
        }

        public Builder clearUninterpretedOption() {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).clearUninterpretedOption();
            return this;
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
        public boolean getAllowAlias() {
            return ((DescriptorProtos$EnumOptions) this.instance).getAllowAlias();
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
        public boolean getDeprecated() {
            return ((DescriptorProtos$EnumOptions) this.instance).getDeprecated();
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
        @Deprecated
        public boolean getDeprecatedLegacyJsonFieldConflicts() {
            return ((DescriptorProtos$EnumOptions) this.instance).getDeprecatedLegacyJsonFieldConflicts();
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
        public DescriptorProtos$FeatureSet getFeatures() {
            return ((DescriptorProtos$EnumOptions) this.instance).getFeatures();
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
        public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i11) {
            return ((DescriptorProtos$EnumOptions) this.instance).getUninterpretedOption(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return ((DescriptorProtos$EnumOptions) this.instance).getUninterpretedOptionCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
        public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
            return Collections.unmodifiableList(((DescriptorProtos$EnumOptions) this.instance).getUninterpretedOptionList());
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
        public boolean hasAllowAlias() {
            return ((DescriptorProtos$EnumOptions) this.instance).hasAllowAlias();
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
        public boolean hasDeprecated() {
            return ((DescriptorProtos$EnumOptions) this.instance).hasDeprecated();
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
        @Deprecated
        public boolean hasDeprecatedLegacyJsonFieldConflicts() {
            return ((DescriptorProtos$EnumOptions) this.instance).hasDeprecatedLegacyJsonFieldConflicts();
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
        public boolean hasFeatures() {
            return ((DescriptorProtos$EnumOptions) this.instance).hasFeatures();
        }

        public Builder mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).mergeFeatures(descriptorProtos$FeatureSet);
            return this;
        }

        public Builder removeUninterpretedOption(int i11) {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).removeUninterpretedOption(i11);
            return this;
        }

        public Builder setAllowAlias(boolean z11) {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).setAllowAlias(z11);
            return this;
        }

        public Builder setDeprecated(boolean z11) {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).setDeprecated(z11);
            return this;
        }

        @Deprecated
        public Builder setDeprecatedLegacyJsonFieldConflicts(boolean z11) {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).setDeprecatedLegacyJsonFieldConflicts(z11);
            return this;
        }

        public Builder setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).setFeatures(descriptorProtos$FeatureSet);
            return this;
        }

        public Builder setUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).setUninterpretedOption(i11, descriptorProtos$UninterpretedOption);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$EnumOptions.DEFAULT_INSTANCE);
        }

        public Builder addUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).addUninterpretedOption(i11, descriptorProtos$UninterpretedOption);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setFeatures(DescriptorProtos$FeatureSet.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).setFeatures((DescriptorProtos$FeatureSet) builder.build());
            return this;
        }

        public Builder setUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).setUninterpretedOption(i11, builder.build());
            return this;
        }

        public Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).addUninterpretedOption(builder.build());
            return this;
        }

        public Builder addUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumOptions) this.instance).addUninterpretedOption(i11, builder.build());
            return this;
        }
    }

    static {
        DescriptorProtos$EnumOptions descriptorProtos$EnumOptions = new DescriptorProtos$EnumOptions();
        DEFAULT_INSTANCE = descriptorProtos$EnumOptions;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$EnumOptions.class, descriptorProtos$EnumOptions);
    }

    private DescriptorProtos$EnumOptions() {
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
    public void clearAllowAlias() {
        this.bitField0_ &= -2;
        this.allowAlias_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecated() {
        this.bitField0_ &= -3;
        this.deprecated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecatedLegacyJsonFieldConflicts() {
        this.bitField0_ &= -5;
        this.deprecatedLegacyJsonFieldConflicts_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatures() {
        this.features_ = null;
        this.bitField0_ &= -9;
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

    public static DescriptorProtos$EnumOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
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
        this.bitField0_ |= 8;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$EnumOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$EnumOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$EnumOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DescriptorProtos$EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<DescriptorProtos$EnumOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUninterpretedOption(int i11) {
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowAlias(boolean z11) {
        this.bitField0_ |= 1;
        this.allowAlias_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecated(boolean z11) {
        this.bitField0_ |= 2;
        this.deprecated_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecatedLegacyJsonFieldConflicts(boolean z11) {
        this.bitField0_ |= 4;
        this.deprecatedLegacyJsonFieldConflicts_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
        descriptorProtos$FeatureSet.getClass();
        this.features_ = descriptorProtos$FeatureSet;
        this.bitField0_ |= 8;
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
                return new DescriptorProtos$EnumOptions();
            case 2:
                return new Builder(c5954e);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0002ϧ\u0005\u0000\u0001\u0002\u0002ဇ\u0000\u0003ဇ\u0001\u0006ဇ\u0002\u0007ᐉ\u0003ϧЛ", new Object[]{"bitField0_", "allowAlias_", "deprecated_", "deprecatedLegacyJsonFieldConflicts_", "features_", "uninterpretedOption_", DescriptorProtos$UninterpretedOption.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<DescriptorProtos$EnumOptions> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (DescriptorProtos$EnumOptions.class) {
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

    @Override // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    public boolean getAllowAlias() {
        return this.allowAlias_;
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    @Deprecated
    public boolean getDeprecatedLegacyJsonFieldConflicts() {
        return this.deprecatedLegacyJsonFieldConflicts_;
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    public DescriptorProtos$FeatureSet getFeatures() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i11) {
        return this.uninterpretedOption_.get(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public DescriptorProtos$UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i11) {
        return this.uninterpretedOption_.get(i11);
    }

    public List<? extends DescriptorProtos$UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    public boolean hasAllowAlias() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    public boolean hasDeprecated() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    @Deprecated
    public boolean hasDeprecatedLegacyJsonFieldConflicts() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    public boolean hasFeatures() {
        return (this.bitField0_ & 8) != 0;
    }

    public static Builder newBuilder(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(descriptorProtos$EnumOptions);
    }

    public static DescriptorProtos$EnumOptions parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$EnumOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$EnumOptions parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static DescriptorProtos$EnumOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DescriptorProtos$EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(i11, descriptorProtos$UninterpretedOption);
    }

    public static DescriptorProtos$EnumOptions parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static DescriptorProtos$EnumOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DescriptorProtos$EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$EnumOptions parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static DescriptorProtos$EnumOptions parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$EnumOptions parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$EnumOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DescriptorProtos$EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$EnumOptions parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
