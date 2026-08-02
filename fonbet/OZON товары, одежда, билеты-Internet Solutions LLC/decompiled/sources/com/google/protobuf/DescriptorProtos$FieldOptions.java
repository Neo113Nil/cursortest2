package com.google.protobuf;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.DescriptorProtos$FeatureSet;
import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class DescriptorProtos$FieldOptions extends GeneratedMessageLite.ExtendableMessage<DescriptorProtos$FieldOptions, Builder> implements DescriptorProtos$FieldOptionsOrBuilder {
    public static final int CTYPE_FIELD_NUMBER = 1;
    public static final int DEBUG_REDACT_FIELD_NUMBER = 16;
    private static final DescriptorProtos$FieldOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 3;
    public static final int EDITION_DEFAULTS_FIELD_NUMBER = 20;
    public static final int FEATURES_FIELD_NUMBER = 21;
    public static final int FEATURE_SUPPORT_FIELD_NUMBER = 22;
    public static final int JSTYPE_FIELD_NUMBER = 6;
    public static final int LAZY_FIELD_NUMBER = 5;
    public static final int PACKED_FIELD_NUMBER = 2;
    private static volatile E<DescriptorProtos$FieldOptions> PARSER = null;
    public static final int RETENTION_FIELD_NUMBER = 17;
    public static final int TARGETS_FIELD_NUMBER = 19;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    public static final int UNVERIFIED_LAZY_FIELD_NUMBER = 15;
    public static final int WEAK_FIELD_NUMBER = 10;
    private static final Internal.d.a<OptionTargetType> targets_converter_ = new Internal.d.a<OptionTargetType>() { // from class: com.google.protobuf.DescriptorProtos$FieldOptions.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.d.a
        public OptionTargetType convert(int i11) {
            OptionTargetType forNumber = OptionTargetType.forNumber(i11);
            return forNumber == null ? OptionTargetType.TARGET_TYPE_UNKNOWN : forNumber;
        }
    };
    private int bitField0_;
    private int ctype_;
    private boolean debugRedact_;
    private boolean deprecated_;
    private FeatureSupport featureSupport_;
    private DescriptorProtos$FeatureSet features_;
    private int jstype_;
    private boolean lazy_;
    private boolean packed_;
    private int retention_;
    private boolean unverifiedLazy_;
    private boolean weak_;
    private byte memoizedIsInitialized = 2;
    private Internal.IntList targets_ = GeneratedMessageLite.emptyIntList();
    private Internal.e<EditionDefault> editionDefaults_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.e<DescriptorProtos$UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<DescriptorProtos$FieldOptions, Builder> implements DescriptorProtos$FieldOptionsOrBuilder {
        /* synthetic */ Builder(C5954e c5954e) {
            this();
        }

        public Builder addAllEditionDefaults(Iterable<? extends EditionDefault> iterable) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).addAllEditionDefaults(iterable);
            return this;
        }

        public Builder addAllTargets(Iterable<? extends OptionTargetType> iterable) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).addAllTargets(iterable);
            return this;
        }

        public Builder addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).addAllUninterpretedOption(iterable);
            return this;
        }

        public Builder addEditionDefaults(EditionDefault editionDefault) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).addEditionDefaults(editionDefault);
            return this;
        }

        public Builder addTargets(OptionTargetType optionTargetType) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).addTargets(optionTargetType);
            return this;
        }

        public Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).addUninterpretedOption(descriptorProtos$UninterpretedOption);
            return this;
        }

        public Builder clearCtype() {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).clearCtype();
            return this;
        }

        public Builder clearDebugRedact() {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).clearDebugRedact();
            return this;
        }

        public Builder clearDeprecated() {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).clearDeprecated();
            return this;
        }

        public Builder clearEditionDefaults() {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).clearEditionDefaults();
            return this;
        }

        public Builder clearFeatureSupport() {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).clearFeatureSupport();
            return this;
        }

        public Builder clearFeatures() {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).clearFeatures();
            return this;
        }

        public Builder clearJstype() {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).clearJstype();
            return this;
        }

        public Builder clearLazy() {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).clearLazy();
            return this;
        }

        public Builder clearPacked() {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).clearPacked();
            return this;
        }

        public Builder clearRetention() {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).clearRetention();
            return this;
        }

        public Builder clearTargets() {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).clearTargets();
            return this;
        }

        public Builder clearUninterpretedOption() {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).clearUninterpretedOption();
            return this;
        }

        public Builder clearUnverifiedLazy() {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).clearUnverifiedLazy();
            return this;
        }

        @Deprecated
        public Builder clearWeak() {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).clearWeak();
            return this;
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public CType getCtype() {
            return ((DescriptorProtos$FieldOptions) this.instance).getCtype();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean getDebugRedact() {
            return ((DescriptorProtos$FieldOptions) this.instance).getDebugRedact();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean getDeprecated() {
            return ((DescriptorProtos$FieldOptions) this.instance).getDeprecated();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public EditionDefault getEditionDefaults(int i11) {
            return ((DescriptorProtos$FieldOptions) this.instance).getEditionDefaults(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public int getEditionDefaultsCount() {
            return ((DescriptorProtos$FieldOptions) this.instance).getEditionDefaultsCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public List<EditionDefault> getEditionDefaultsList() {
            return Collections.unmodifiableList(((DescriptorProtos$FieldOptions) this.instance).getEditionDefaultsList());
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public FeatureSupport getFeatureSupport() {
            return ((DescriptorProtos$FieldOptions) this.instance).getFeatureSupport();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public DescriptorProtos$FeatureSet getFeatures() {
            return ((DescriptorProtos$FieldOptions) this.instance).getFeatures();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public JSType getJstype() {
            return ((DescriptorProtos$FieldOptions) this.instance).getJstype();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean getLazy() {
            return ((DescriptorProtos$FieldOptions) this.instance).getLazy();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean getPacked() {
            return ((DescriptorProtos$FieldOptions) this.instance).getPacked();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public OptionRetention getRetention() {
            return ((DescriptorProtos$FieldOptions) this.instance).getRetention();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public OptionTargetType getTargets(int i11) {
            return ((DescriptorProtos$FieldOptions) this.instance).getTargets(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public int getTargetsCount() {
            return ((DescriptorProtos$FieldOptions) this.instance).getTargetsCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public List<OptionTargetType> getTargetsList() {
            return ((DescriptorProtos$FieldOptions) this.instance).getTargetsList();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i11) {
            return ((DescriptorProtos$FieldOptions) this.instance).getUninterpretedOption(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return ((DescriptorProtos$FieldOptions) this.instance).getUninterpretedOptionCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
            return Collections.unmodifiableList(((DescriptorProtos$FieldOptions) this.instance).getUninterpretedOptionList());
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean getUnverifiedLazy() {
            return ((DescriptorProtos$FieldOptions) this.instance).getUnverifiedLazy();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        @Deprecated
        public boolean getWeak() {
            return ((DescriptorProtos$FieldOptions) this.instance).getWeak();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean hasCtype() {
            return ((DescriptorProtos$FieldOptions) this.instance).hasCtype();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean hasDebugRedact() {
            return ((DescriptorProtos$FieldOptions) this.instance).hasDebugRedact();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean hasDeprecated() {
            return ((DescriptorProtos$FieldOptions) this.instance).hasDeprecated();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean hasFeatureSupport() {
            return ((DescriptorProtos$FieldOptions) this.instance).hasFeatureSupport();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean hasFeatures() {
            return ((DescriptorProtos$FieldOptions) this.instance).hasFeatures();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean hasJstype() {
            return ((DescriptorProtos$FieldOptions) this.instance).hasJstype();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean hasLazy() {
            return ((DescriptorProtos$FieldOptions) this.instance).hasLazy();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean hasPacked() {
            return ((DescriptorProtos$FieldOptions) this.instance).hasPacked();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean hasRetention() {
            return ((DescriptorProtos$FieldOptions) this.instance).hasRetention();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean hasUnverifiedLazy() {
            return ((DescriptorProtos$FieldOptions) this.instance).hasUnverifiedLazy();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        @Deprecated
        public boolean hasWeak() {
            return ((DescriptorProtos$FieldOptions) this.instance).hasWeak();
        }

        public Builder mergeFeatureSupport(FeatureSupport featureSupport) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).mergeFeatureSupport(featureSupport);
            return this;
        }

        public Builder mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).mergeFeatures(descriptorProtos$FeatureSet);
            return this;
        }

        public Builder removeEditionDefaults(int i11) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).removeEditionDefaults(i11);
            return this;
        }

        public Builder removeUninterpretedOption(int i11) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).removeUninterpretedOption(i11);
            return this;
        }

        public Builder setCtype(CType cType) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setCtype(cType);
            return this;
        }

        public Builder setDebugRedact(boolean z11) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setDebugRedact(z11);
            return this;
        }

        public Builder setDeprecated(boolean z11) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setDeprecated(z11);
            return this;
        }

        public Builder setEditionDefaults(int i11, EditionDefault editionDefault) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setEditionDefaults(i11, editionDefault);
            return this;
        }

        public Builder setFeatureSupport(FeatureSupport featureSupport) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setFeatureSupport(featureSupport);
            return this;
        }

        public Builder setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setFeatures(descriptorProtos$FeatureSet);
            return this;
        }

        public Builder setJstype(JSType jSType) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setJstype(jSType);
            return this;
        }

        public Builder setLazy(boolean z11) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setLazy(z11);
            return this;
        }

        public Builder setPacked(boolean z11) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setPacked(z11);
            return this;
        }

        public Builder setRetention(OptionRetention optionRetention) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setRetention(optionRetention);
            return this;
        }

        public Builder setTargets(int i11, OptionTargetType optionTargetType) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setTargets(i11, optionTargetType);
            return this;
        }

        public Builder setUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setUninterpretedOption(i11, descriptorProtos$UninterpretedOption);
            return this;
        }

        public Builder setUnverifiedLazy(boolean z11) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setUnverifiedLazy(z11);
            return this;
        }

        @Deprecated
        public Builder setWeak(boolean z11) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setWeak(z11);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$FieldOptions.DEFAULT_INSTANCE);
        }

        public Builder addEditionDefaults(int i11, EditionDefault editionDefault) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).addEditionDefaults(i11, editionDefault);
            return this;
        }

        public Builder addUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).addUninterpretedOption(i11, descriptorProtos$UninterpretedOption);
            return this;
        }

        public Builder setEditionDefaults(int i11, EditionDefault.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setEditionDefaults(i11, builder.build());
            return this;
        }

        public Builder setFeatureSupport(FeatureSupport.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setFeatureSupport(builder.build());
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setFeatures(DescriptorProtos$FeatureSet.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setFeatures((DescriptorProtos$FeatureSet) builder.build());
            return this;
        }

        public Builder setUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).setUninterpretedOption(i11, builder.build());
            return this;
        }

        public Builder addEditionDefaults(EditionDefault.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).addEditionDefaults(builder.build());
            return this;
        }

        public Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).addUninterpretedOption(builder.build());
            return this;
        }

        public Builder addEditionDefaults(int i11, EditionDefault.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).addEditionDefaults(i11, builder.build());
            return this;
        }

        public Builder addUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FieldOptions) this.instance).addUninterpretedOption(i11, builder.build());
            return this;
        }
    }

    public enum CType implements Internal.a {
        STRING(0),
        CORD(1),
        STRING_PIECE(2);

        public static final int CORD_VALUE = 1;
        public static final int STRING_PIECE_VALUE = 2;
        public static final int STRING_VALUE = 0;
        private static final Internal.b<CType> internalValueMap = new Internal.b<CType>() { // from class: com.google.protobuf.DescriptorProtos.FieldOptions.CType.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.b
            public CType findValueByNumber(int i11) {
                return CType.forNumber(i11);
            }
        };
        private final int value;

        private static final class CTypeVerifier implements Internal.c {
            static final Internal.c INSTANCE = new CTypeVerifier();

            private CTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.c
            public boolean isInRange(int i11) {
                return CType.forNumber(i11) != null;
            }
        }

        CType(int i11) {
            this.value = i11;
        }

        public static CType forNumber(int i11) {
            if (i11 == 0) {
                return STRING;
            }
            if (i11 == 1) {
                return CORD;
            }
            if (i11 != 2) {
                return null;
            }
            return STRING_PIECE;
        }

        public static Internal.b<CType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.c internalGetVerifier() {
            return CTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.a
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static CType valueOf(int i11) {
            return forNumber(i11);
        }
    }

    public static final class EditionDefault extends GeneratedMessageLite<EditionDefault, Builder> implements EditionDefaultOrBuilder {
        private static final EditionDefault DEFAULT_INSTANCE;
        public static final int EDITION_FIELD_NUMBER = 3;
        private static volatile E<EditionDefault> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 2;
        private int bitField0_;
        private int edition_;
        private String value_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<EditionDefault, Builder> implements EditionDefaultOrBuilder {
            /* synthetic */ Builder(C5954e c5954e) {
                this();
            }

            public Builder clearEdition() {
                copyOnWrite();
                ((EditionDefault) this.instance).clearEdition();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((EditionDefault) this.instance).clearValue();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos$FieldOptions.EditionDefaultOrBuilder
            public DescriptorProtos$Edition getEdition() {
                return ((EditionDefault) this.instance).getEdition();
            }

            @Override // com.google.protobuf.DescriptorProtos$FieldOptions.EditionDefaultOrBuilder
            public String getValue() {
                return ((EditionDefault) this.instance).getValue();
            }

            @Override // com.google.protobuf.DescriptorProtos$FieldOptions.EditionDefaultOrBuilder
            public ByteString getValueBytes() {
                return ((EditionDefault) this.instance).getValueBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos$FieldOptions.EditionDefaultOrBuilder
            public boolean hasEdition() {
                return ((EditionDefault) this.instance).hasEdition();
            }

            @Override // com.google.protobuf.DescriptorProtos$FieldOptions.EditionDefaultOrBuilder
            public boolean hasValue() {
                return ((EditionDefault) this.instance).hasValue();
            }

            public Builder setEdition(DescriptorProtos$Edition descriptorProtos$Edition) {
                copyOnWrite();
                ((EditionDefault) this.instance).setEdition(descriptorProtos$Edition);
                return this;
            }

            public Builder setValue(String str) {
                copyOnWrite();
                ((EditionDefault) this.instance).setValue(str);
                return this;
            }

            public Builder setValueBytes(ByteString byteString) {
                copyOnWrite();
                ((EditionDefault) this.instance).setValueBytes(byteString);
                return this;
            }

            private Builder() {
                super(EditionDefault.DEFAULT_INSTANCE);
            }
        }

        static {
            EditionDefault editionDefault = new EditionDefault();
            DEFAULT_INSTANCE = editionDefault;
            GeneratedMessageLite.registerDefaultInstance(EditionDefault.class, editionDefault);
        }

        private EditionDefault() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEdition() {
            this.bitField0_ &= -2;
            this.edition_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.bitField0_ &= -3;
            this.value_ = getDefaultInstance().getValue();
        }

        public static EditionDefault getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static EditionDefault parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EditionDefault) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EditionDefault parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (EditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static E<EditionDefault> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEdition(DescriptorProtos$Edition descriptorProtos$Edition) {
            this.edition_ = descriptorProtos$Edition.getNumber();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.value_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValueBytes(ByteString byteString) {
            this.value_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
            E e11;
            C5954e c5954e = null;
            switch (C5954e.f60203a[bVar.ordinal()]) {
                case 1:
                    return new EditionDefault();
                case 2:
                    return new Builder(c5954e);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003᠌\u0000", new Object[]{"bitField0_", "value_", "edition_", DescriptorProtos$Edition.internalGetVerifier()});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    E<EditionDefault> e12 = PARSER;
                    if (e12 != null) {
                        return e12;
                    }
                    synchronized (EditionDefault.class) {
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
                    return (byte) 1;
                default:
                    throw null;
            }
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptions.EditionDefaultOrBuilder
        public DescriptorProtos$Edition getEdition() {
            DescriptorProtos$Edition forNumber = DescriptorProtos$Edition.forNumber(this.edition_);
            return forNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : forNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptions.EditionDefaultOrBuilder
        public String getValue() {
            return this.value_;
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptions.EditionDefaultOrBuilder
        public ByteString getValueBytes() {
            return ByteString.copyFromUtf8(this.value_);
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptions.EditionDefaultOrBuilder
        public boolean hasEdition() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptions.EditionDefaultOrBuilder
        public boolean hasValue() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(EditionDefault editionDefault) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(editionDefault);
        }

        public static EditionDefault parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
            return (EditionDefault) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
        }

        public static EditionDefault parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
            return (EditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
        }

        public static EditionDefault parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (EditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static EditionDefault parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
            return (EditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
        }

        public static EditionDefault parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (EditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EditionDefault parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
            return (EditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
        }

        public static EditionDefault parseFrom(InputStream inputStream) throws IOException {
            return (EditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EditionDefault parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
            return (EditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
        }

        public static EditionDefault parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (EditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static EditionDefault parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
            return (EditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
        }
    }

    public interface EditionDefaultOrBuilder extends A {
        /* synthetic */ MessageLite getDefaultInstanceForType();

        DescriptorProtos$Edition getEdition();

        String getValue();

        ByteString getValueBytes();

        boolean hasEdition();

        boolean hasValue();

        @Override // com.google.protobuf.A
        /* synthetic */ boolean isInitialized();
    }

    public static final class FeatureSupport extends GeneratedMessageLite<FeatureSupport, Builder> implements FeatureSupportOrBuilder {
        private static final FeatureSupport DEFAULT_INSTANCE;
        public static final int DEPRECATION_WARNING_FIELD_NUMBER = 3;
        public static final int EDITION_DEPRECATED_FIELD_NUMBER = 2;
        public static final int EDITION_INTRODUCED_FIELD_NUMBER = 1;
        public static final int EDITION_REMOVED_FIELD_NUMBER = 4;
        private static volatile E<FeatureSupport> PARSER;
        private int bitField0_;
        private String deprecationWarning_ = "";
        private int editionDeprecated_;
        private int editionIntroduced_;
        private int editionRemoved_;

        public static final class Builder extends GeneratedMessageLite.Builder<FeatureSupport, Builder> implements FeatureSupportOrBuilder {
            /* synthetic */ Builder(C5954e c5954e) {
                this();
            }

            public Builder clearDeprecationWarning() {
                copyOnWrite();
                ((FeatureSupport) this.instance).clearDeprecationWarning();
                return this;
            }

            public Builder clearEditionDeprecated() {
                copyOnWrite();
                ((FeatureSupport) this.instance).clearEditionDeprecated();
                return this;
            }

            public Builder clearEditionIntroduced() {
                copyOnWrite();
                ((FeatureSupport) this.instance).clearEditionIntroduced();
                return this;
            }

            public Builder clearEditionRemoved() {
                copyOnWrite();
                ((FeatureSupport) this.instance).clearEditionRemoved();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
            public String getDeprecationWarning() {
                return ((FeatureSupport) this.instance).getDeprecationWarning();
            }

            @Override // com.google.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
            public ByteString getDeprecationWarningBytes() {
                return ((FeatureSupport) this.instance).getDeprecationWarningBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
            public DescriptorProtos$Edition getEditionDeprecated() {
                return ((FeatureSupport) this.instance).getEditionDeprecated();
            }

            @Override // com.google.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
            public DescriptorProtos$Edition getEditionIntroduced() {
                return ((FeatureSupport) this.instance).getEditionIntroduced();
            }

            @Override // com.google.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
            public DescriptorProtos$Edition getEditionRemoved() {
                return ((FeatureSupport) this.instance).getEditionRemoved();
            }

            @Override // com.google.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
            public boolean hasDeprecationWarning() {
                return ((FeatureSupport) this.instance).hasDeprecationWarning();
            }

            @Override // com.google.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
            public boolean hasEditionDeprecated() {
                return ((FeatureSupport) this.instance).hasEditionDeprecated();
            }

            @Override // com.google.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
            public boolean hasEditionIntroduced() {
                return ((FeatureSupport) this.instance).hasEditionIntroduced();
            }

            @Override // com.google.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
            public boolean hasEditionRemoved() {
                return ((FeatureSupport) this.instance).hasEditionRemoved();
            }

            public Builder setDeprecationWarning(String str) {
                copyOnWrite();
                ((FeatureSupport) this.instance).setDeprecationWarning(str);
                return this;
            }

            public Builder setDeprecationWarningBytes(ByteString byteString) {
                copyOnWrite();
                ((FeatureSupport) this.instance).setDeprecationWarningBytes(byteString);
                return this;
            }

            public Builder setEditionDeprecated(DescriptorProtos$Edition descriptorProtos$Edition) {
                copyOnWrite();
                ((FeatureSupport) this.instance).setEditionDeprecated(descriptorProtos$Edition);
                return this;
            }

            public Builder setEditionIntroduced(DescriptorProtos$Edition descriptorProtos$Edition) {
                copyOnWrite();
                ((FeatureSupport) this.instance).setEditionIntroduced(descriptorProtos$Edition);
                return this;
            }

            public Builder setEditionRemoved(DescriptorProtos$Edition descriptorProtos$Edition) {
                copyOnWrite();
                ((FeatureSupport) this.instance).setEditionRemoved(descriptorProtos$Edition);
                return this;
            }

            private Builder() {
                super(FeatureSupport.DEFAULT_INSTANCE);
            }
        }

        static {
            FeatureSupport featureSupport = new FeatureSupport();
            DEFAULT_INSTANCE = featureSupport;
            GeneratedMessageLite.registerDefaultInstance(FeatureSupport.class, featureSupport);
        }

        private FeatureSupport() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeprecationWarning() {
            this.bitField0_ &= -5;
            this.deprecationWarning_ = getDefaultInstance().getDeprecationWarning();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEditionDeprecated() {
            this.bitField0_ &= -3;
            this.editionDeprecated_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEditionIntroduced() {
            this.bitField0_ &= -2;
            this.editionIntroduced_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEditionRemoved() {
            this.bitField0_ &= -9;
            this.editionRemoved_ = 0;
        }

        public static FeatureSupport getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FeatureSupport parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FeatureSupport) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FeatureSupport parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FeatureSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static E<FeatureSupport> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecationWarning(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.deprecationWarning_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecationWarningBytes(ByteString byteString) {
            this.deprecationWarning_ = byteString.toStringUtf8();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEditionDeprecated(DescriptorProtos$Edition descriptorProtos$Edition) {
            this.editionDeprecated_ = descriptorProtos$Edition.getNumber();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEditionIntroduced(DescriptorProtos$Edition descriptorProtos$Edition) {
            this.editionIntroduced_ = descriptorProtos$Edition.getNumber();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEditionRemoved(DescriptorProtos$Edition descriptorProtos$Edition) {
            this.editionRemoved_ = descriptorProtos$Edition.getNumber();
            this.bitField0_ |= 8;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
            E e11;
            C5954e c5954e = null;
            switch (C5954e.f60203a[bVar.ordinal()]) {
                case 1:
                    return new FeatureSupport();
                case 2:
                    return new Builder(c5954e);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004᠌\u0003", new Object[]{"bitField0_", "editionIntroduced_", DescriptorProtos$Edition.internalGetVerifier(), "editionDeprecated_", DescriptorProtos$Edition.internalGetVerifier(), "deprecationWarning_", "editionRemoved_", DescriptorProtos$Edition.internalGetVerifier()});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    E<FeatureSupport> e12 = PARSER;
                    if (e12 != null) {
                        return e12;
                    }
                    synchronized (FeatureSupport.class) {
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
                    return (byte) 1;
                default:
                    throw null;
            }
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
        public String getDeprecationWarning() {
            return this.deprecationWarning_;
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
        public ByteString getDeprecationWarningBytes() {
            return ByteString.copyFromUtf8(this.deprecationWarning_);
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
        public DescriptorProtos$Edition getEditionDeprecated() {
            DescriptorProtos$Edition forNumber = DescriptorProtos$Edition.forNumber(this.editionDeprecated_);
            return forNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : forNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
        public DescriptorProtos$Edition getEditionIntroduced() {
            DescriptorProtos$Edition forNumber = DescriptorProtos$Edition.forNumber(this.editionIntroduced_);
            return forNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : forNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
        public DescriptorProtos$Edition getEditionRemoved() {
            DescriptorProtos$Edition forNumber = DescriptorProtos$Edition.forNumber(this.editionRemoved_);
            return forNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : forNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
        public boolean hasDeprecationWarning() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
        public boolean hasEditionDeprecated() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
        public boolean hasEditionIntroduced() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldOptions.FeatureSupportOrBuilder
        public boolean hasEditionRemoved() {
            return (this.bitField0_ & 8) != 0;
        }

        public static Builder newBuilder(FeatureSupport featureSupport) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(featureSupport);
        }

        public static FeatureSupport parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
            return (FeatureSupport) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
        }

        public static FeatureSupport parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
            return (FeatureSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
        }

        public static FeatureSupport parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FeatureSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FeatureSupport parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
            return (FeatureSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
        }

        public static FeatureSupport parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FeatureSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FeatureSupport parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
            return (FeatureSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
        }

        public static FeatureSupport parseFrom(InputStream inputStream) throws IOException {
            return (FeatureSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FeatureSupport parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
            return (FeatureSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
        }

        public static FeatureSupport parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (FeatureSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FeatureSupport parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
            return (FeatureSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
        }
    }

    public interface FeatureSupportOrBuilder extends A {
        /* synthetic */ MessageLite getDefaultInstanceForType();

        String getDeprecationWarning();

        ByteString getDeprecationWarningBytes();

        DescriptorProtos$Edition getEditionDeprecated();

        DescriptorProtos$Edition getEditionIntroduced();

        DescriptorProtos$Edition getEditionRemoved();

        boolean hasDeprecationWarning();

        boolean hasEditionDeprecated();

        boolean hasEditionIntroduced();

        boolean hasEditionRemoved();

        @Override // com.google.protobuf.A
        /* synthetic */ boolean isInitialized();
    }

    public enum JSType implements Internal.a {
        JS_NORMAL(0),
        JS_STRING(1),
        JS_NUMBER(2);

        public static final int JS_NORMAL_VALUE = 0;
        public static final int JS_NUMBER_VALUE = 2;
        public static final int JS_STRING_VALUE = 1;
        private static final Internal.b<JSType> internalValueMap = new Internal.b<JSType>() { // from class: com.google.protobuf.DescriptorProtos.FieldOptions.JSType.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.b
            public JSType findValueByNumber(int i11) {
                return JSType.forNumber(i11);
            }
        };
        private final int value;

        private static final class JSTypeVerifier implements Internal.c {
            static final Internal.c INSTANCE = new JSTypeVerifier();

            private JSTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.c
            public boolean isInRange(int i11) {
                return JSType.forNumber(i11) != null;
            }
        }

        JSType(int i11) {
            this.value = i11;
        }

        public static JSType forNumber(int i11) {
            if (i11 == 0) {
                return JS_NORMAL;
            }
            if (i11 == 1) {
                return JS_STRING;
            }
            if (i11 != 2) {
                return null;
            }
            return JS_NUMBER;
        }

        public static Internal.b<JSType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.c internalGetVerifier() {
            return JSTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.a
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static JSType valueOf(int i11) {
            return forNumber(i11);
        }
    }

    public enum OptionRetention implements Internal.a {
        RETENTION_UNKNOWN(0),
        RETENTION_RUNTIME(1),
        RETENTION_SOURCE(2);

        public static final int RETENTION_RUNTIME_VALUE = 1;
        public static final int RETENTION_SOURCE_VALUE = 2;
        public static final int RETENTION_UNKNOWN_VALUE = 0;
        private static final Internal.b<OptionRetention> internalValueMap = new Internal.b<OptionRetention>() { // from class: com.google.protobuf.DescriptorProtos.FieldOptions.OptionRetention.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.b
            public OptionRetention findValueByNumber(int i11) {
                return OptionRetention.forNumber(i11);
            }
        };
        private final int value;

        private static final class OptionRetentionVerifier implements Internal.c {
            static final Internal.c INSTANCE = new OptionRetentionVerifier();

            private OptionRetentionVerifier() {
            }

            @Override // com.google.protobuf.Internal.c
            public boolean isInRange(int i11) {
                return OptionRetention.forNumber(i11) != null;
            }
        }

        OptionRetention(int i11) {
            this.value = i11;
        }

        public static OptionRetention forNumber(int i11) {
            if (i11 == 0) {
                return RETENTION_UNKNOWN;
            }
            if (i11 == 1) {
                return RETENTION_RUNTIME;
            }
            if (i11 != 2) {
                return null;
            }
            return RETENTION_SOURCE;
        }

        public static Internal.b<OptionRetention> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.c internalGetVerifier() {
            return OptionRetentionVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.a
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static OptionRetention valueOf(int i11) {
            return forNumber(i11);
        }
    }

    public enum OptionTargetType implements Internal.a {
        TARGET_TYPE_UNKNOWN(0),
        TARGET_TYPE_FILE(1),
        TARGET_TYPE_EXTENSION_RANGE(2),
        TARGET_TYPE_MESSAGE(3),
        TARGET_TYPE_FIELD(4),
        TARGET_TYPE_ONEOF(5),
        TARGET_TYPE_ENUM(6),
        TARGET_TYPE_ENUM_ENTRY(7),
        TARGET_TYPE_SERVICE(8),
        TARGET_TYPE_METHOD(9);

        public static final int TARGET_TYPE_ENUM_ENTRY_VALUE = 7;
        public static final int TARGET_TYPE_ENUM_VALUE = 6;
        public static final int TARGET_TYPE_EXTENSION_RANGE_VALUE = 2;
        public static final int TARGET_TYPE_FIELD_VALUE = 4;
        public static final int TARGET_TYPE_FILE_VALUE = 1;
        public static final int TARGET_TYPE_MESSAGE_VALUE = 3;
        public static final int TARGET_TYPE_METHOD_VALUE = 9;
        public static final int TARGET_TYPE_ONEOF_VALUE = 5;
        public static final int TARGET_TYPE_SERVICE_VALUE = 8;
        public static final int TARGET_TYPE_UNKNOWN_VALUE = 0;
        private static final Internal.b<OptionTargetType> internalValueMap = new Internal.b<OptionTargetType>() { // from class: com.google.protobuf.DescriptorProtos.FieldOptions.OptionTargetType.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.b
            public OptionTargetType findValueByNumber(int i11) {
                return OptionTargetType.forNumber(i11);
            }
        };
        private final int value;

        private static final class OptionTargetTypeVerifier implements Internal.c {
            static final Internal.c INSTANCE = new OptionTargetTypeVerifier();

            private OptionTargetTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.c
            public boolean isInRange(int i11) {
                return OptionTargetType.forNumber(i11) != null;
            }
        }

        OptionTargetType(int i11) {
            this.value = i11;
        }

        public static OptionTargetType forNumber(int i11) {
            switch (i11) {
                case 0:
                    return TARGET_TYPE_UNKNOWN;
                case 1:
                    return TARGET_TYPE_FILE;
                case 2:
                    return TARGET_TYPE_EXTENSION_RANGE;
                case 3:
                    return TARGET_TYPE_MESSAGE;
                case 4:
                    return TARGET_TYPE_FIELD;
                case 5:
                    return TARGET_TYPE_ONEOF;
                case 6:
                    return TARGET_TYPE_ENUM;
                case 7:
                    return TARGET_TYPE_ENUM_ENTRY;
                case 8:
                    return TARGET_TYPE_SERVICE;
                case 9:
                    return TARGET_TYPE_METHOD;
                default:
                    return null;
            }
        }

        public static Internal.b<OptionTargetType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.c internalGetVerifier() {
            return OptionTargetTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.a
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static OptionTargetType valueOf(int i11) {
            return forNumber(i11);
        }
    }

    static {
        DescriptorProtos$FieldOptions descriptorProtos$FieldOptions = new DescriptorProtos$FieldOptions();
        DEFAULT_INSTANCE = descriptorProtos$FieldOptions;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$FieldOptions.class, descriptorProtos$FieldOptions);
    }

    private DescriptorProtos$FieldOptions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEditionDefaults(Iterable<? extends EditionDefault> iterable) {
        ensureEditionDefaultsIsMutable();
        AbstractMessageLite.addAll(iterable, this.editionDefaults_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTargets(Iterable<? extends OptionTargetType> iterable) {
        ensureTargetsIsMutable();
        Iterator<? extends OptionTargetType> it = iterable.iterator();
        while (it.hasNext()) {
            this.targets_.addInt(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
        ensureUninterpretedOptionIsMutable();
        AbstractMessageLite.addAll(iterable, this.uninterpretedOption_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEditionDefaults(EditionDefault editionDefault) {
        editionDefault.getClass();
        ensureEditionDefaultsIsMutable();
        this.editionDefaults_.add(editionDefault);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTargets(OptionTargetType optionTargetType) {
        optionTargetType.getClass();
        ensureTargetsIsMutable();
        this.targets_.addInt(optionTargetType.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCtype() {
        this.bitField0_ &= -2;
        this.ctype_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDebugRedact() {
        this.bitField0_ &= -129;
        this.debugRedact_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecated() {
        this.bitField0_ &= -33;
        this.deprecated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEditionDefaults() {
        this.editionDefaults_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatureSupport() {
        this.featureSupport_ = null;
        this.bitField0_ &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatures() {
        this.features_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJstype() {
        this.bitField0_ &= -5;
        this.jstype_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLazy() {
        this.bitField0_ &= -9;
        this.lazy_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPacked() {
        this.bitField0_ &= -3;
        this.packed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRetention() {
        this.bitField0_ &= -257;
        this.retention_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargets() {
        this.targets_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUninterpretedOption() {
        this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnverifiedLazy() {
        this.bitField0_ &= -17;
        this.unverifiedLazy_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeak() {
        this.bitField0_ &= -65;
        this.weak_ = false;
    }

    private void ensureEditionDefaultsIsMutable() {
        Internal.e<EditionDefault> eVar = this.editionDefaults_;
        if (eVar.isModifiable()) {
            return;
        }
        this.editionDefaults_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    private void ensureTargetsIsMutable() {
        Internal.IntList intList = this.targets_;
        if (intList.isModifiable()) {
            return;
        }
        this.targets_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureUninterpretedOptionIsMutable() {
        Internal.e<DescriptorProtos$UninterpretedOption> eVar = this.uninterpretedOption_;
        if (eVar.isModifiable()) {
            return;
        }
        this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    public static DescriptorProtos$FieldOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFeatureSupport(FeatureSupport featureSupport) {
        featureSupport.getClass();
        FeatureSupport featureSupport2 = this.featureSupport_;
        if (featureSupport2 == null || featureSupport2 == FeatureSupport.getDefaultInstance()) {
            this.featureSupport_ = featureSupport;
        } else {
            this.featureSupport_ = FeatureSupport.newBuilder(this.featureSupport_).mergeFrom((FeatureSupport.Builder) featureSupport).buildPartial();
        }
        this.bitField0_ |= UserVerificationMethods.USER_VERIFY_ALL;
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
        this.bitField0_ |= UserVerificationMethods.USER_VERIFY_NONE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$FieldOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FieldOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<DescriptorProtos$FieldOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEditionDefaults(int i11) {
        ensureEditionDefaultsIsMutable();
        this.editionDefaults_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUninterpretedOption(int i11) {
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCtype(CType cType) {
        this.ctype_ = cType.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDebugRedact(boolean z11) {
        this.bitField0_ |= UserVerificationMethods.USER_VERIFY_PATTERN;
        this.debugRedact_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecated(boolean z11) {
        this.bitField0_ |= 32;
        this.deprecated_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEditionDefaults(int i11, EditionDefault editionDefault) {
        editionDefault.getClass();
        ensureEditionDefaultsIsMutable();
        this.editionDefaults_.set(i11, editionDefault);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatureSupport(FeatureSupport featureSupport) {
        featureSupport.getClass();
        this.featureSupport_ = featureSupport;
        this.bitField0_ |= UserVerificationMethods.USER_VERIFY_ALL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
        descriptorProtos$FeatureSet.getClass();
        this.features_ = descriptorProtos$FeatureSet;
        this.bitField0_ |= UserVerificationMethods.USER_VERIFY_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJstype(JSType jSType) {
        this.jstype_ = jSType.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLazy(boolean z11) {
        this.bitField0_ |= 8;
        this.lazy_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPacked(boolean z11) {
        this.bitField0_ |= 2;
        this.packed_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetention(OptionRetention optionRetention) {
        this.retention_ = optionRetention.getNumber();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargets(int i11, OptionTargetType optionTargetType) {
        optionTargetType.getClass();
        ensureTargetsIsMutable();
        this.targets_.setInt(i11, optionTargetType.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.set(i11, descriptorProtos$UninterpretedOption);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnverifiedLazy(boolean z11) {
        this.bitField0_ |= 16;
        this.unverifiedLazy_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeak(boolean z11) {
        this.bitField0_ |= 64;
        this.weak_ = z11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        C5954e c5954e = null;
        switch (C5954e.f60203a[bVar.ordinal()]) {
            case 1:
                return new DescriptorProtos$FieldOptions();
            case 2:
                return new Builder(c5954e);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001ϧ\u000e\u0000\u0003\u0002\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0005\u0005ဇ\u0003\u0006᠌\u0002\nဇ\u0006\u000fဇ\u0004\u0010ဇ\u0007\u0011᠌\b\u0013ࠞ\u0014\u001b\u0015ᐉ\t\u0016ဉ\nϧЛ", new Object[]{"bitField0_", "ctype_", CType.internalGetVerifier(), "packed_", "deprecated_", "lazy_", "jstype_", JSType.internalGetVerifier(), "weak_", "unverifiedLazy_", "debugRedact_", "retention_", OptionRetention.internalGetVerifier(), "targets_", OptionTargetType.internalGetVerifier(), "editionDefaults_", EditionDefault.class, "features_", "featureSupport_", "uninterpretedOption_", DescriptorProtos$UninterpretedOption.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<DescriptorProtos$FieldOptions> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (DescriptorProtos$FieldOptions.class) {
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

    @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public CType getCtype() {
        CType forNumber = CType.forNumber(this.ctype_);
        return forNumber == null ? CType.STRING : forNumber;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public boolean getDebugRedact() {
        return this.debugRedact_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public EditionDefault getEditionDefaults(int i11) {
        return this.editionDefaults_.get(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public int getEditionDefaultsCount() {
        return this.editionDefaults_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public List<EditionDefault> getEditionDefaultsList() {
        return this.editionDefaults_;
    }

    public EditionDefaultOrBuilder getEditionDefaultsOrBuilder(int i11) {
        return this.editionDefaults_.get(i11);
    }

    public List<? extends EditionDefaultOrBuilder> getEditionDefaultsOrBuilderList() {
        return this.editionDefaults_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public FeatureSupport getFeatureSupport() {
        FeatureSupport featureSupport = this.featureSupport_;
        return featureSupport == null ? FeatureSupport.getDefaultInstance() : featureSupport;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public DescriptorProtos$FeatureSet getFeatures() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public JSType getJstype() {
        JSType forNumber = JSType.forNumber(this.jstype_);
        return forNumber == null ? JSType.JS_NORMAL : forNumber;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public boolean getLazy() {
        return this.lazy_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public boolean getPacked() {
        return this.packed_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public OptionRetention getRetention() {
        OptionRetention forNumber = OptionRetention.forNumber(this.retention_);
        return forNumber == null ? OptionRetention.RETENTION_UNKNOWN : forNumber;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public OptionTargetType getTargets(int i11) {
        OptionTargetType forNumber = OptionTargetType.forNumber(this.targets_.getInt(i11));
        return forNumber == null ? OptionTargetType.TARGET_TYPE_UNKNOWN : forNumber;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public int getTargetsCount() {
        return this.targets_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public List<OptionTargetType> getTargetsList() {
        return new Internal.d(this.targets_, targets_converter_);
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i11) {
        return this.uninterpretedOption_.get(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public DescriptorProtos$UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i11) {
        return this.uninterpretedOption_.get(i11);
    }

    public List<? extends DescriptorProtos$UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public boolean getUnverifiedLazy() {
        return this.unverifiedLazy_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    @Deprecated
    public boolean getWeak() {
        return this.weak_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public boolean hasCtype() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public boolean hasDebugRedact() {
        return (this.bitField0_ & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public boolean hasDeprecated() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public boolean hasFeatureSupport() {
        return (this.bitField0_ & UserVerificationMethods.USER_VERIFY_ALL) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public boolean hasFeatures() {
        return (this.bitField0_ & UserVerificationMethods.USER_VERIFY_NONE) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public boolean hasJstype() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public boolean hasLazy() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public boolean hasPacked() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public boolean hasRetention() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public boolean hasUnverifiedLazy() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    @Deprecated
    public boolean hasWeak() {
        return (this.bitField0_ & 64) != 0;
    }

    public static Builder newBuilder(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(descriptorProtos$FieldOptions);
    }

    public static DescriptorProtos$FieldOptions parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$FieldOptions parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static DescriptorProtos$FieldOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEditionDefaults(int i11, EditionDefault editionDefault) {
        editionDefault.getClass();
        ensureEditionDefaultsIsMutable();
        this.editionDefaults_.add(i11, editionDefault);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(i11, descriptorProtos$UninterpretedOption);
    }

    public static DescriptorProtos$FieldOptions parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static DescriptorProtos$FieldOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$FieldOptions parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static DescriptorProtos$FieldOptions parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FieldOptions parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$FieldOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$FieldOptions parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
