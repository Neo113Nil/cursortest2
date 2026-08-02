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
public final class DescriptorProtos$MethodOptions extends GeneratedMessageLite.ExtendableMessage<DescriptorProtos$MethodOptions, Builder> implements DescriptorProtos$MethodOptionsOrBuilder {
    private static final DescriptorProtos$MethodOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 33;
    public static final int FEATURES_FIELD_NUMBER = 35;
    public static final int IDEMPOTENCY_LEVEL_FIELD_NUMBER = 34;
    private static volatile E<DescriptorProtos$MethodOptions> PARSER = null;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private int bitField0_;
    private boolean deprecated_;
    private DescriptorProtos$FeatureSet features_;
    private int idempotencyLevel_;
    private byte memoizedIsInitialized = 2;
    private Internal.e<DescriptorProtos$UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<DescriptorProtos$MethodOptions, Builder> implements DescriptorProtos$MethodOptionsOrBuilder {
        /* synthetic */ Builder(C5954e c5954e) {
            this();
        }

        public Builder addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).addAllUninterpretedOption(iterable);
            return this;
        }

        public Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).addUninterpretedOption(descriptorProtos$UninterpretedOption);
            return this;
        }

        public Builder clearDeprecated() {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).clearDeprecated();
            return this;
        }

        public Builder clearFeatures() {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).clearFeatures();
            return this;
        }

        public Builder clearIdempotencyLevel() {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).clearIdempotencyLevel();
            return this;
        }

        public Builder clearUninterpretedOption() {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).clearUninterpretedOption();
            return this;
        }

        @Override // com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder
        public boolean getDeprecated() {
            return ((DescriptorProtos$MethodOptions) this.instance).getDeprecated();
        }

        @Override // com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder
        public DescriptorProtos$FeatureSet getFeatures() {
            return ((DescriptorProtos$MethodOptions) this.instance).getFeatures();
        }

        @Override // com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder
        public IdempotencyLevel getIdempotencyLevel() {
            return ((DescriptorProtos$MethodOptions) this.instance).getIdempotencyLevel();
        }

        @Override // com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder
        public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i11) {
            return ((DescriptorProtos$MethodOptions) this.instance).getUninterpretedOption(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return ((DescriptorProtos$MethodOptions) this.instance).getUninterpretedOptionCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder
        public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
            return Collections.unmodifiableList(((DescriptorProtos$MethodOptions) this.instance).getUninterpretedOptionList());
        }

        @Override // com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder
        public boolean hasDeprecated() {
            return ((DescriptorProtos$MethodOptions) this.instance).hasDeprecated();
        }

        @Override // com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder
        public boolean hasFeatures() {
            return ((DescriptorProtos$MethodOptions) this.instance).hasFeatures();
        }

        @Override // com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder
        public boolean hasIdempotencyLevel() {
            return ((DescriptorProtos$MethodOptions) this.instance).hasIdempotencyLevel();
        }

        public Builder mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).mergeFeatures(descriptorProtos$FeatureSet);
            return this;
        }

        public Builder removeUninterpretedOption(int i11) {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).removeUninterpretedOption(i11);
            return this;
        }

        public Builder setDeprecated(boolean z11) {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).setDeprecated(z11);
            return this;
        }

        public Builder setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).setFeatures(descriptorProtos$FeatureSet);
            return this;
        }

        public Builder setIdempotencyLevel(IdempotencyLevel idempotencyLevel) {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).setIdempotencyLevel(idempotencyLevel);
            return this;
        }

        public Builder setUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).setUninterpretedOption(i11, descriptorProtos$UninterpretedOption);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$MethodOptions.DEFAULT_INSTANCE);
        }

        public Builder addUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).addUninterpretedOption(i11, descriptorProtos$UninterpretedOption);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setFeatures(DescriptorProtos$FeatureSet.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).setFeatures((DescriptorProtos$FeatureSet) builder.build());
            return this;
        }

        public Builder setUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).setUninterpretedOption(i11, builder.build());
            return this;
        }

        public Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).addUninterpretedOption(builder.build());
            return this;
        }

        public Builder addUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$MethodOptions) this.instance).addUninterpretedOption(i11, builder.build());
            return this;
        }
    }

    public enum IdempotencyLevel implements Internal.a {
        IDEMPOTENCY_UNKNOWN(0),
        NO_SIDE_EFFECTS(1),
        IDEMPOTENT(2);

        public static final int IDEMPOTENCY_UNKNOWN_VALUE = 0;
        public static final int IDEMPOTENT_VALUE = 2;
        public static final int NO_SIDE_EFFECTS_VALUE = 1;
        private static final Internal.b<IdempotencyLevel> internalValueMap = new Internal.b<IdempotencyLevel>() { // from class: com.google.protobuf.DescriptorProtos.MethodOptions.IdempotencyLevel.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.b
            public IdempotencyLevel findValueByNumber(int i11) {
                return IdempotencyLevel.forNumber(i11);
            }
        };
        private final int value;

        private static final class IdempotencyLevelVerifier implements Internal.c {
            static final Internal.c INSTANCE = new IdempotencyLevelVerifier();

            private IdempotencyLevelVerifier() {
            }

            @Override // com.google.protobuf.Internal.c
            public boolean isInRange(int i11) {
                return IdempotencyLevel.forNumber(i11) != null;
            }
        }

        IdempotencyLevel(int i11) {
            this.value = i11;
        }

        public static IdempotencyLevel forNumber(int i11) {
            if (i11 == 0) {
                return IDEMPOTENCY_UNKNOWN;
            }
            if (i11 == 1) {
                return NO_SIDE_EFFECTS;
            }
            if (i11 != 2) {
                return null;
            }
            return IDEMPOTENT;
        }

        public static Internal.b<IdempotencyLevel> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.c internalGetVerifier() {
            return IdempotencyLevelVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.a
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IdempotencyLevel valueOf(int i11) {
            return forNumber(i11);
        }
    }

    static {
        DescriptorProtos$MethodOptions descriptorProtos$MethodOptions = new DescriptorProtos$MethodOptions();
        DEFAULT_INSTANCE = descriptorProtos$MethodOptions;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$MethodOptions.class, descriptorProtos$MethodOptions);
    }

    private DescriptorProtos$MethodOptions() {
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
        this.bitField0_ &= -2;
        this.deprecated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatures() {
        this.features_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdempotencyLevel() {
        this.bitField0_ &= -3;
        this.idempotencyLevel_ = 0;
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

    public static DescriptorProtos$MethodOptions getDefaultInstance() {
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
        this.bitField0_ |= 4;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$MethodOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$MethodOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<DescriptorProtos$MethodOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUninterpretedOption(int i11) {
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecated(boolean z11) {
        this.bitField0_ |= 1;
        this.deprecated_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
        descriptorProtos$FeatureSet.getClass();
        this.features_ = descriptorProtos$FeatureSet;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdempotencyLevel(IdempotencyLevel idempotencyLevel) {
        this.idempotencyLevel_ = idempotencyLevel.getNumber();
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
                return new DescriptorProtos$MethodOptions();
            case 2:
                return new Builder(c5954e);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001!ϧ\u0004\u0000\u0001\u0002!ဇ\u0000\"᠌\u0001#ᐉ\u0002ϧЛ", new Object[]{"bitField0_", "deprecated_", "idempotencyLevel_", IdempotencyLevel.internalGetVerifier(), "features_", "uninterpretedOption_", DescriptorProtos$UninterpretedOption.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<DescriptorProtos$MethodOptions> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (DescriptorProtos$MethodOptions.class) {
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

    @Override // com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder
    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder
    public DescriptorProtos$FeatureSet getFeatures() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder
    public IdempotencyLevel getIdempotencyLevel() {
        IdempotencyLevel forNumber = IdempotencyLevel.forNumber(this.idempotencyLevel_);
        return forNumber == null ? IdempotencyLevel.IDEMPOTENCY_UNKNOWN : forNumber;
    }

    @Override // com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i11) {
        return this.uninterpretedOption_.get(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public DescriptorProtos$UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i11) {
        return this.uninterpretedOption_.get(i11);
    }

    public List<? extends DescriptorProtos$UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder
    public boolean hasDeprecated() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder
    public boolean hasFeatures() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder
    public boolean hasIdempotencyLevel() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(descriptorProtos$MethodOptions);
    }

    public static DescriptorProtos$MethodOptions parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$MethodOptions parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static DescriptorProtos$MethodOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(i11, descriptorProtos$UninterpretedOption);
    }

    public static DescriptorProtos$MethodOptions parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static DescriptorProtos$MethodOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$MethodOptions parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static DescriptorProtos$MethodOptions parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$MethodOptions parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$MethodOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$MethodOptions parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
