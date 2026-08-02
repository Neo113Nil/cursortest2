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
public final class DescriptorProtos$MessageOptions extends GeneratedMessageLite.ExtendableMessage<DescriptorProtos$MessageOptions, Builder> implements DescriptorProtos$MessageOptionsOrBuilder {
    private static final DescriptorProtos$MessageOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 3;
    public static final int DEPRECATED_LEGACY_JSON_FIELD_CONFLICTS_FIELD_NUMBER = 11;
    public static final int FEATURES_FIELD_NUMBER = 12;
    public static final int MAP_ENTRY_FIELD_NUMBER = 7;
    public static final int MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER = 1;
    public static final int NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER = 2;
    private static volatile E<DescriptorProtos$MessageOptions> PARSER = null;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private int bitField0_;
    private boolean deprecatedLegacyJsonFieldConflicts_;
    private boolean deprecated_;
    private DescriptorProtos$FeatureSet features_;
    private boolean mapEntry_;
    private boolean messageSetWireFormat_;
    private boolean noStandardDescriptorAccessor_;
    private byte memoizedIsInitialized = 2;
    private Internal.e<DescriptorProtos$UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<DescriptorProtos$MessageOptions, Builder> implements DescriptorProtos$MessageOptionsOrBuilder {
        /* synthetic */ Builder(C5954e c5954e) {
            this();
        }

        public Builder addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).addAllUninterpretedOption(iterable);
            return this;
        }

        public Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).addUninterpretedOption(descriptorProtos$UninterpretedOption);
            return this;
        }

        public Builder clearDeprecated() {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).clearDeprecated();
            return this;
        }

        @Deprecated
        public Builder clearDeprecatedLegacyJsonFieldConflicts() {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).clearDeprecatedLegacyJsonFieldConflicts();
            return this;
        }

        public Builder clearFeatures() {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).clearFeatures();
            return this;
        }

        public Builder clearMapEntry() {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).clearMapEntry();
            return this;
        }

        public Builder clearMessageSetWireFormat() {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).clearMessageSetWireFormat();
            return this;
        }

        public Builder clearNoStandardDescriptorAccessor() {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).clearNoStandardDescriptorAccessor();
            return this;
        }

        public Builder clearUninterpretedOption() {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).clearUninterpretedOption();
            return this;
        }

        @Override // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public boolean getDeprecated() {
            return ((DescriptorProtos$MessageOptions) this.instance).getDeprecated();
        }

        @Override // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        @Deprecated
        public boolean getDeprecatedLegacyJsonFieldConflicts() {
            return ((DescriptorProtos$MessageOptions) this.instance).getDeprecatedLegacyJsonFieldConflicts();
        }

        @Override // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public DescriptorProtos$FeatureSet getFeatures() {
            return ((DescriptorProtos$MessageOptions) this.instance).getFeatures();
        }

        @Override // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public boolean getMapEntry() {
            return ((DescriptorProtos$MessageOptions) this.instance).getMapEntry();
        }

        @Override // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public boolean getMessageSetWireFormat() {
            return ((DescriptorProtos$MessageOptions) this.instance).getMessageSetWireFormat();
        }

        @Override // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public boolean getNoStandardDescriptorAccessor() {
            return ((DescriptorProtos$MessageOptions) this.instance).getNoStandardDescriptorAccessor();
        }

        @Override // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i11) {
            return ((DescriptorProtos$MessageOptions) this.instance).getUninterpretedOption(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return ((DescriptorProtos$MessageOptions) this.instance).getUninterpretedOptionCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
            return Collections.unmodifiableList(((DescriptorProtos$MessageOptions) this.instance).getUninterpretedOptionList());
        }

        @Override // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public boolean hasDeprecated() {
            return ((DescriptorProtos$MessageOptions) this.instance).hasDeprecated();
        }

        @Override // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        @Deprecated
        public boolean hasDeprecatedLegacyJsonFieldConflicts() {
            return ((DescriptorProtos$MessageOptions) this.instance).hasDeprecatedLegacyJsonFieldConflicts();
        }

        @Override // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public boolean hasFeatures() {
            return ((DescriptorProtos$MessageOptions) this.instance).hasFeatures();
        }

        @Override // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public boolean hasMapEntry() {
            return ((DescriptorProtos$MessageOptions) this.instance).hasMapEntry();
        }

        @Override // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public boolean hasMessageSetWireFormat() {
            return ((DescriptorProtos$MessageOptions) this.instance).hasMessageSetWireFormat();
        }

        @Override // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public boolean hasNoStandardDescriptorAccessor() {
            return ((DescriptorProtos$MessageOptions) this.instance).hasNoStandardDescriptorAccessor();
        }

        public Builder mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).mergeFeatures(descriptorProtos$FeatureSet);
            return this;
        }

        public Builder removeUninterpretedOption(int i11) {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).removeUninterpretedOption(i11);
            return this;
        }

        public Builder setDeprecated(boolean z11) {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).setDeprecated(z11);
            return this;
        }

        @Deprecated
        public Builder setDeprecatedLegacyJsonFieldConflicts(boolean z11) {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).setDeprecatedLegacyJsonFieldConflicts(z11);
            return this;
        }

        public Builder setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).setFeatures(descriptorProtos$FeatureSet);
            return this;
        }

        public Builder setMapEntry(boolean z11) {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).setMapEntry(z11);
            return this;
        }

        public Builder setMessageSetWireFormat(boolean z11) {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).setMessageSetWireFormat(z11);
            return this;
        }

        public Builder setNoStandardDescriptorAccessor(boolean z11) {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).setNoStandardDescriptorAccessor(z11);
            return this;
        }

        public Builder setUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).setUninterpretedOption(i11, descriptorProtos$UninterpretedOption);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$MessageOptions.DEFAULT_INSTANCE);
        }

        public Builder addUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).addUninterpretedOption(i11, descriptorProtos$UninterpretedOption);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setFeatures(DescriptorProtos$FeatureSet.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).setFeatures((DescriptorProtos$FeatureSet) builder.build());
            return this;
        }

        public Builder setUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).setUninterpretedOption(i11, builder.build());
            return this;
        }

        public Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).addUninterpretedOption(builder.build());
            return this;
        }

        public Builder addUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$MessageOptions) this.instance).addUninterpretedOption(i11, builder.build());
            return this;
        }
    }

    static {
        DescriptorProtos$MessageOptions descriptorProtos$MessageOptions = new DescriptorProtos$MessageOptions();
        DEFAULT_INSTANCE = descriptorProtos$MessageOptions;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$MessageOptions.class, descriptorProtos$MessageOptions);
    }

    private DescriptorProtos$MessageOptions() {
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
    public void clearDeprecated() {
        this.bitField0_ &= -5;
        this.deprecated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecatedLegacyJsonFieldConflicts() {
        this.bitField0_ &= -17;
        this.deprecatedLegacyJsonFieldConflicts_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatures() {
        this.features_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapEntry() {
        this.bitField0_ &= -9;
        this.mapEntry_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageSetWireFormat() {
        this.bitField0_ &= -2;
        this.messageSetWireFormat_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNoStandardDescriptorAccessor() {
        this.bitField0_ &= -3;
        this.noStandardDescriptorAccessor_ = false;
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

    public static DescriptorProtos$MessageOptions getDefaultInstance() {
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
        this.bitField0_ |= 32;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$MessageOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$MessageOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$MessageOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DescriptorProtos$MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<DescriptorProtos$MessageOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUninterpretedOption(int i11) {
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecated(boolean z11) {
        this.bitField0_ |= 4;
        this.deprecated_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecatedLegacyJsonFieldConflicts(boolean z11) {
        this.bitField0_ |= 16;
        this.deprecatedLegacyJsonFieldConflicts_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
        descriptorProtos$FeatureSet.getClass();
        this.features_ = descriptorProtos$FeatureSet;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapEntry(boolean z11) {
        this.bitField0_ |= 8;
        this.mapEntry_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageSetWireFormat(boolean z11) {
        this.bitField0_ |= 1;
        this.messageSetWireFormat_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNoStandardDescriptorAccessor(boolean z11) {
        this.bitField0_ |= 2;
        this.noStandardDescriptorAccessor_ = z11;
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
                return new DescriptorProtos$MessageOptions();
            case 2:
                return new Builder(c5954e);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001ϧ\u0007\u0000\u0001\u0002\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0007ဇ\u0003\u000bဇ\u0004\fᐉ\u0005ϧЛ", new Object[]{"bitField0_", "messageSetWireFormat_", "noStandardDescriptorAccessor_", "deprecated_", "mapEntry_", "deprecatedLegacyJsonFieldConflicts_", "features_", "uninterpretedOption_", DescriptorProtos$UninterpretedOption.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<DescriptorProtos$MessageOptions> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (DescriptorProtos$MessageOptions.class) {
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

    @Override // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    @Deprecated
    public boolean getDeprecatedLegacyJsonFieldConflicts() {
        return this.deprecatedLegacyJsonFieldConflicts_;
    }

    @Override // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public DescriptorProtos$FeatureSet getFeatures() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public boolean getMapEntry() {
        return this.mapEntry_;
    }

    @Override // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public boolean getMessageSetWireFormat() {
        return this.messageSetWireFormat_;
    }

    @Override // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public boolean getNoStandardDescriptorAccessor() {
        return this.noStandardDescriptorAccessor_;
    }

    @Override // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i11) {
        return this.uninterpretedOption_.get(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public DescriptorProtos$UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i11) {
        return this.uninterpretedOption_.get(i11);
    }

    public List<? extends DescriptorProtos$UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public boolean hasDeprecated() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    @Deprecated
    public boolean hasDeprecatedLegacyJsonFieldConflicts() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public boolean hasFeatures() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public boolean hasMapEntry() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public boolean hasMessageSetWireFormat() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public boolean hasNoStandardDescriptorAccessor() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(descriptorProtos$MessageOptions);
    }

    public static DescriptorProtos$MessageOptions parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$MessageOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$MessageOptions parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static DescriptorProtos$MessageOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DescriptorProtos$MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(i11, descriptorProtos$UninterpretedOption);
    }

    public static DescriptorProtos$MessageOptions parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static DescriptorProtos$MessageOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DescriptorProtos$MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$MessageOptions parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static DescriptorProtos$MessageOptions parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$MessageOptions parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$MessageOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DescriptorProtos$MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$MessageOptions parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
