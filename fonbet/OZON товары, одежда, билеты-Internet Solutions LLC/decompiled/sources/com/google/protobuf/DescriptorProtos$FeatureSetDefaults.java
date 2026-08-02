package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FeatureSet;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class DescriptorProtos$FeatureSetDefaults extends GeneratedMessageLite<DescriptorProtos$FeatureSetDefaults, Builder> implements DescriptorProtos$FeatureSetDefaultsOrBuilder {
    public static final int DEFAULTS_FIELD_NUMBER = 1;
    private static final DescriptorProtos$FeatureSetDefaults DEFAULT_INSTANCE;
    public static final int MAXIMUM_EDITION_FIELD_NUMBER = 5;
    public static final int MINIMUM_EDITION_FIELD_NUMBER = 4;
    private static volatile E<DescriptorProtos$FeatureSetDefaults> PARSER;
    private int bitField0_;
    private int maximumEdition_;
    private int minimumEdition_;
    private byte memoizedIsInitialized = 2;
    private Internal.e<FeatureSetEditionDefault> defaults_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<DescriptorProtos$FeatureSetDefaults, Builder> implements DescriptorProtos$FeatureSetDefaultsOrBuilder {
        /* synthetic */ Builder(C5954e c5954e) {
            this();
        }

        public Builder addAllDefaults(Iterable<? extends FeatureSetEditionDefault> iterable) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSetDefaults) this.instance).addAllDefaults(iterable);
            return this;
        }

        public Builder addDefaults(FeatureSetEditionDefault featureSetEditionDefault) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSetDefaults) this.instance).addDefaults(featureSetEditionDefault);
            return this;
        }

        public Builder clearDefaults() {
            copyOnWrite();
            ((DescriptorProtos$FeatureSetDefaults) this.instance).clearDefaults();
            return this;
        }

        public Builder clearMaximumEdition() {
            copyOnWrite();
            ((DescriptorProtos$FeatureSetDefaults) this.instance).clearMaximumEdition();
            return this;
        }

        public Builder clearMinimumEdition() {
            copyOnWrite();
            ((DescriptorProtos$FeatureSetDefaults) this.instance).clearMinimumEdition();
            return this;
        }

        @Override // com.google.protobuf.DescriptorProtos$FeatureSetDefaultsOrBuilder
        public FeatureSetEditionDefault getDefaults(int i11) {
            return ((DescriptorProtos$FeatureSetDefaults) this.instance).getDefaults(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$FeatureSetDefaultsOrBuilder
        public int getDefaultsCount() {
            return ((DescriptorProtos$FeatureSetDefaults) this.instance).getDefaultsCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$FeatureSetDefaultsOrBuilder
        public List<FeatureSetEditionDefault> getDefaultsList() {
            return Collections.unmodifiableList(((DescriptorProtos$FeatureSetDefaults) this.instance).getDefaultsList());
        }

        @Override // com.google.protobuf.DescriptorProtos$FeatureSetDefaultsOrBuilder
        public DescriptorProtos$Edition getMaximumEdition() {
            return ((DescriptorProtos$FeatureSetDefaults) this.instance).getMaximumEdition();
        }

        @Override // com.google.protobuf.DescriptorProtos$FeatureSetDefaultsOrBuilder
        public DescriptorProtos$Edition getMinimumEdition() {
            return ((DescriptorProtos$FeatureSetDefaults) this.instance).getMinimumEdition();
        }

        @Override // com.google.protobuf.DescriptorProtos$FeatureSetDefaultsOrBuilder
        public boolean hasMaximumEdition() {
            return ((DescriptorProtos$FeatureSetDefaults) this.instance).hasMaximumEdition();
        }

        @Override // com.google.protobuf.DescriptorProtos$FeatureSetDefaultsOrBuilder
        public boolean hasMinimumEdition() {
            return ((DescriptorProtos$FeatureSetDefaults) this.instance).hasMinimumEdition();
        }

        public Builder removeDefaults(int i11) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSetDefaults) this.instance).removeDefaults(i11);
            return this;
        }

        public Builder setDefaults(int i11, FeatureSetEditionDefault featureSetEditionDefault) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSetDefaults) this.instance).setDefaults(i11, featureSetEditionDefault);
            return this;
        }

        public Builder setMaximumEdition(DescriptorProtos$Edition descriptorProtos$Edition) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSetDefaults) this.instance).setMaximumEdition(descriptorProtos$Edition);
            return this;
        }

        public Builder setMinimumEdition(DescriptorProtos$Edition descriptorProtos$Edition) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSetDefaults) this.instance).setMinimumEdition(descriptorProtos$Edition);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$FeatureSetDefaults.DEFAULT_INSTANCE);
        }

        public Builder addDefaults(int i11, FeatureSetEditionDefault featureSetEditionDefault) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSetDefaults) this.instance).addDefaults(i11, featureSetEditionDefault);
            return this;
        }

        public Builder setDefaults(int i11, FeatureSetEditionDefault.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSetDefaults) this.instance).setDefaults(i11, builder.build());
            return this;
        }

        public Builder addDefaults(FeatureSetEditionDefault.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSetDefaults) this.instance).addDefaults(builder.build());
            return this;
        }

        public Builder addDefaults(int i11, FeatureSetEditionDefault.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSetDefaults) this.instance).addDefaults(i11, builder.build());
            return this;
        }
    }

    public static final class FeatureSetEditionDefault extends GeneratedMessageLite<FeatureSetEditionDefault, Builder> implements FeatureSetEditionDefaultOrBuilder {
        private static final FeatureSetEditionDefault DEFAULT_INSTANCE;
        public static final int EDITION_FIELD_NUMBER = 3;
        public static final int FIXED_FEATURES_FIELD_NUMBER = 5;
        public static final int OVERRIDABLE_FEATURES_FIELD_NUMBER = 4;
        private static volatile E<FeatureSetEditionDefault> PARSER;
        private int bitField0_;
        private int edition_;
        private DescriptorProtos$FeatureSet fixedFeatures_;
        private byte memoizedIsInitialized = 2;
        private DescriptorProtos$FeatureSet overridableFeatures_;

        public static final class Builder extends GeneratedMessageLite.Builder<FeatureSetEditionDefault, Builder> implements FeatureSetEditionDefaultOrBuilder {
            /* synthetic */ Builder(C5954e c5954e) {
                this();
            }

            public Builder clearEdition() {
                copyOnWrite();
                ((FeatureSetEditionDefault) this.instance).clearEdition();
                return this;
            }

            public Builder clearFixedFeatures() {
                copyOnWrite();
                ((FeatureSetEditionDefault) this.instance).clearFixedFeatures();
                return this;
            }

            public Builder clearOverridableFeatures() {
                copyOnWrite();
                ((FeatureSetEditionDefault) this.instance).clearOverridableFeatures();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
            public DescriptorProtos$Edition getEdition() {
                return ((FeatureSetEditionDefault) this.instance).getEdition();
            }

            @Override // com.google.protobuf.DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
            public DescriptorProtos$FeatureSet getFixedFeatures() {
                return ((FeatureSetEditionDefault) this.instance).getFixedFeatures();
            }

            @Override // com.google.protobuf.DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
            public DescriptorProtos$FeatureSet getOverridableFeatures() {
                return ((FeatureSetEditionDefault) this.instance).getOverridableFeatures();
            }

            @Override // com.google.protobuf.DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
            public boolean hasEdition() {
                return ((FeatureSetEditionDefault) this.instance).hasEdition();
            }

            @Override // com.google.protobuf.DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
            public boolean hasFixedFeatures() {
                return ((FeatureSetEditionDefault) this.instance).hasFixedFeatures();
            }

            @Override // com.google.protobuf.DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
            public boolean hasOverridableFeatures() {
                return ((FeatureSetEditionDefault) this.instance).hasOverridableFeatures();
            }

            public Builder mergeFixedFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
                copyOnWrite();
                ((FeatureSetEditionDefault) this.instance).mergeFixedFeatures(descriptorProtos$FeatureSet);
                return this;
            }

            public Builder mergeOverridableFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
                copyOnWrite();
                ((FeatureSetEditionDefault) this.instance).mergeOverridableFeatures(descriptorProtos$FeatureSet);
                return this;
            }

            public Builder setEdition(DescriptorProtos$Edition descriptorProtos$Edition) {
                copyOnWrite();
                ((FeatureSetEditionDefault) this.instance).setEdition(descriptorProtos$Edition);
                return this;
            }

            public Builder setFixedFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
                copyOnWrite();
                ((FeatureSetEditionDefault) this.instance).setFixedFeatures(descriptorProtos$FeatureSet);
                return this;
            }

            public Builder setOverridableFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
                copyOnWrite();
                ((FeatureSetEditionDefault) this.instance).setOverridableFeatures(descriptorProtos$FeatureSet);
                return this;
            }

            private Builder() {
                super(FeatureSetEditionDefault.DEFAULT_INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Builder setFixedFeatures(DescriptorProtos$FeatureSet.Builder builder) {
                copyOnWrite();
                ((FeatureSetEditionDefault) this.instance).setFixedFeatures((DescriptorProtos$FeatureSet) builder.build());
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Builder setOverridableFeatures(DescriptorProtos$FeatureSet.Builder builder) {
                copyOnWrite();
                ((FeatureSetEditionDefault) this.instance).setOverridableFeatures((DescriptorProtos$FeatureSet) builder.build());
                return this;
            }
        }

        static {
            FeatureSetEditionDefault featureSetEditionDefault = new FeatureSetEditionDefault();
            DEFAULT_INSTANCE = featureSetEditionDefault;
            GeneratedMessageLite.registerDefaultInstance(FeatureSetEditionDefault.class, featureSetEditionDefault);
        }

        private FeatureSetEditionDefault() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEdition() {
            this.bitField0_ &= -2;
            this.edition_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFixedFeatures() {
            this.fixedFeatures_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOverridableFeatures() {
            this.overridableFeatures_ = null;
            this.bitField0_ &= -3;
        }

        public static FeatureSetEditionDefault getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeFixedFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            descriptorProtos$FeatureSet.getClass();
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2 = this.fixedFeatures_;
            if (descriptorProtos$FeatureSet2 == null || descriptorProtos$FeatureSet2 == DescriptorProtos$FeatureSet.getDefaultInstance()) {
                this.fixedFeatures_ = descriptorProtos$FeatureSet;
            } else {
                this.fixedFeatures_ = ((DescriptorProtos$FeatureSet.Builder) DescriptorProtos$FeatureSet.newBuilder(this.fixedFeatures_).mergeFrom((DescriptorProtos$FeatureSet.Builder) descriptorProtos$FeatureSet)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOverridableFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            descriptorProtos$FeatureSet.getClass();
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2 = this.overridableFeatures_;
            if (descriptorProtos$FeatureSet2 == null || descriptorProtos$FeatureSet2 == DescriptorProtos$FeatureSet.getDefaultInstance()) {
                this.overridableFeatures_ = descriptorProtos$FeatureSet;
            } else {
                this.overridableFeatures_ = ((DescriptorProtos$FeatureSet.Builder) DescriptorProtos$FeatureSet.newBuilder(this.overridableFeatures_).mergeFrom((DescriptorProtos$FeatureSet.Builder) descriptorProtos$FeatureSet)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FeatureSetEditionDefault parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FeatureSetEditionDefault) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FeatureSetEditionDefault parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FeatureSetEditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static E<FeatureSetEditionDefault> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEdition(DescriptorProtos$Edition descriptorProtos$Edition) {
            this.edition_ = descriptorProtos$Edition.getNumber();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFixedFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            descriptorProtos$FeatureSet.getClass();
            this.fixedFeatures_ = descriptorProtos$FeatureSet;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOverridableFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            descriptorProtos$FeatureSet.getClass();
            this.overridableFeatures_ = descriptorProtos$FeatureSet;
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
            E e11;
            C5954e c5954e = null;
            switch (C5954e.f60203a[bVar.ordinal()]) {
                case 1:
                    return new FeatureSetEditionDefault();
                case 2:
                    return new Builder(c5954e);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0002\u0003᠌\u0000\u0004ᐉ\u0001\u0005ᐉ\u0002", new Object[]{"bitField0_", "edition_", DescriptorProtos$Edition.internalGetVerifier(), "overridableFeatures_", "fixedFeatures_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    E<FeatureSetEditionDefault> e12 = PARSER;
                    if (e12 != null) {
                        return e12;
                    }
                    synchronized (FeatureSetEditionDefault.class) {
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

        @Override // com.google.protobuf.DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
        public DescriptorProtos$Edition getEdition() {
            DescriptorProtos$Edition forNumber = DescriptorProtos$Edition.forNumber(this.edition_);
            return forNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : forNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
        public DescriptorProtos$FeatureSet getFixedFeatures() {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.fixedFeatures_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        @Override // com.google.protobuf.DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
        public DescriptorProtos$FeatureSet getOverridableFeatures() {
            DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.overridableFeatures_;
            return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
        }

        @Override // com.google.protobuf.DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
        public boolean hasEdition() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
        public boolean hasFixedFeatures() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
        public boolean hasOverridableFeatures() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(FeatureSetEditionDefault featureSetEditionDefault) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(featureSetEditionDefault);
        }

        public static FeatureSetEditionDefault parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
            return (FeatureSetEditionDefault) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
        }

        public static FeatureSetEditionDefault parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
            return (FeatureSetEditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
        }

        public static FeatureSetEditionDefault parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FeatureSetEditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FeatureSetEditionDefault parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
            return (FeatureSetEditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
        }

        public static FeatureSetEditionDefault parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FeatureSetEditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FeatureSetEditionDefault parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
            return (FeatureSetEditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
        }

        public static FeatureSetEditionDefault parseFrom(InputStream inputStream) throws IOException {
            return (FeatureSetEditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FeatureSetEditionDefault parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
            return (FeatureSetEditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
        }

        public static FeatureSetEditionDefault parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (FeatureSetEditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FeatureSetEditionDefault parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
            return (FeatureSetEditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
        }
    }

    public interface FeatureSetEditionDefaultOrBuilder extends A {
        /* synthetic */ MessageLite getDefaultInstanceForType();

        DescriptorProtos$Edition getEdition();

        DescriptorProtos$FeatureSet getFixedFeatures();

        DescriptorProtos$FeatureSet getOverridableFeatures();

        boolean hasEdition();

        boolean hasFixedFeatures();

        boolean hasOverridableFeatures();

        @Override // com.google.protobuf.A
        /* synthetic */ boolean isInitialized();
    }

    static {
        DescriptorProtos$FeatureSetDefaults descriptorProtos$FeatureSetDefaults = new DescriptorProtos$FeatureSetDefaults();
        DEFAULT_INSTANCE = descriptorProtos$FeatureSetDefaults;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$FeatureSetDefaults.class, descriptorProtos$FeatureSetDefaults);
    }

    private DescriptorProtos$FeatureSetDefaults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDefaults(Iterable<? extends FeatureSetEditionDefault> iterable) {
        ensureDefaultsIsMutable();
        AbstractMessageLite.addAll(iterable, this.defaults_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDefaults(FeatureSetEditionDefault featureSetEditionDefault) {
        featureSetEditionDefault.getClass();
        ensureDefaultsIsMutable();
        this.defaults_.add(featureSetEditionDefault);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaults() {
        this.defaults_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaximumEdition() {
        this.bitField0_ &= -3;
        this.maximumEdition_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinimumEdition() {
        this.bitField0_ &= -2;
        this.minimumEdition_ = 0;
    }

    private void ensureDefaultsIsMutable() {
        Internal.e<FeatureSetEditionDefault> eVar = this.defaults_;
        if (eVar.isModifiable()) {
            return;
        }
        this.defaults_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    public static DescriptorProtos$FeatureSetDefaults getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$FeatureSetDefaults parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<DescriptorProtos$FeatureSetDefaults> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDefaults(int i11) {
        ensureDefaultsIsMutable();
        this.defaults_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaults(int i11, FeatureSetEditionDefault featureSetEditionDefault) {
        featureSetEditionDefault.getClass();
        ensureDefaultsIsMutable();
        this.defaults_.set(i11, featureSetEditionDefault);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaximumEdition(DescriptorProtos$Edition descriptorProtos$Edition) {
        this.maximumEdition_ = descriptorProtos$Edition.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinimumEdition(DescriptorProtos$Edition descriptorProtos$Edition) {
        this.minimumEdition_ = descriptorProtos$Edition.getNumber();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        C5954e c5954e = null;
        switch (C5954e.f60203a[bVar.ordinal()]) {
            case 1:
                return new DescriptorProtos$FeatureSetDefaults();
            case 2:
                return new Builder(c5954e);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0001\u0001Л\u0004᠌\u0000\u0005᠌\u0001", new Object[]{"bitField0_", "defaults_", FeatureSetEditionDefault.class, "minimumEdition_", DescriptorProtos$Edition.internalGetVerifier(), "maximumEdition_", DescriptorProtos$Edition.internalGetVerifier()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<DescriptorProtos$FeatureSetDefaults> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (DescriptorProtos$FeatureSetDefaults.class) {
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

    @Override // com.google.protobuf.DescriptorProtos$FeatureSetDefaultsOrBuilder
    public FeatureSetEditionDefault getDefaults(int i11) {
        return this.defaults_.get(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$FeatureSetDefaultsOrBuilder
    public int getDefaultsCount() {
        return this.defaults_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$FeatureSetDefaultsOrBuilder
    public List<FeatureSetEditionDefault> getDefaultsList() {
        return this.defaults_;
    }

    public FeatureSetEditionDefaultOrBuilder getDefaultsOrBuilder(int i11) {
        return this.defaults_.get(i11);
    }

    public List<? extends FeatureSetEditionDefaultOrBuilder> getDefaultsOrBuilderList() {
        return this.defaults_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FeatureSetDefaultsOrBuilder
    public DescriptorProtos$Edition getMaximumEdition() {
        DescriptorProtos$Edition forNumber = DescriptorProtos$Edition.forNumber(this.maximumEdition_);
        return forNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : forNumber;
    }

    @Override // com.google.protobuf.DescriptorProtos$FeatureSetDefaultsOrBuilder
    public DescriptorProtos$Edition getMinimumEdition() {
        DescriptorProtos$Edition forNumber = DescriptorProtos$Edition.forNumber(this.minimumEdition_);
        return forNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : forNumber;
    }

    @Override // com.google.protobuf.DescriptorProtos$FeatureSetDefaultsOrBuilder
    public boolean hasMaximumEdition() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FeatureSetDefaultsOrBuilder
    public boolean hasMinimumEdition() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(DescriptorProtos$FeatureSetDefaults descriptorProtos$FeatureSetDefaults) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(descriptorProtos$FeatureSetDefaults);
    }

    public static DescriptorProtos$FeatureSetDefaults parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDefaults(int i11, FeatureSetEditionDefault featureSetEditionDefault) {
        featureSetEditionDefault.getClass();
        ensureDefaultsIsMutable();
        this.defaults_.add(i11, featureSetEditionDefault);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$FeatureSetDefaults parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$FeatureSetDefaults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
