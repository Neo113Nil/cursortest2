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
public final class DescriptorProtos$ExtensionRangeOptions extends GeneratedMessageLite.ExtendableMessage<DescriptorProtos$ExtensionRangeOptions, Builder> implements DescriptorProtos$ExtensionRangeOptionsOrBuilder {
    public static final int DECLARATION_FIELD_NUMBER = 2;
    private static final DescriptorProtos$ExtensionRangeOptions DEFAULT_INSTANCE;
    public static final int FEATURES_FIELD_NUMBER = 50;
    private static volatile E<DescriptorProtos$ExtensionRangeOptions> PARSER = null;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    public static final int VERIFICATION_FIELD_NUMBER = 3;
    private int bitField0_;
    private DescriptorProtos$FeatureSet features_;
    private byte memoizedIsInitialized = 2;
    private Internal.e<DescriptorProtos$UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.e<Declaration> declaration_ = GeneratedMessageLite.emptyProtobufList();
    private int verification_ = 1;

    public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<DescriptorProtos$ExtensionRangeOptions, Builder> implements DescriptorProtos$ExtensionRangeOptionsOrBuilder {
        /* synthetic */ Builder(C5954e c5954e) {
            this();
        }

        public Builder addAllDeclaration(Iterable<? extends Declaration> iterable) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).addAllDeclaration(iterable);
            return this;
        }

        public Builder addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).addAllUninterpretedOption(iterable);
            return this;
        }

        public Builder addDeclaration(Declaration declaration) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).addDeclaration(declaration);
            return this;
        }

        public Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).addUninterpretedOption(descriptorProtos$UninterpretedOption);
            return this;
        }

        public Builder clearDeclaration() {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).clearDeclaration();
            return this;
        }

        public Builder clearFeatures() {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).clearFeatures();
            return this;
        }

        public Builder clearUninterpretedOption() {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).clearUninterpretedOption();
            return this;
        }

        public Builder clearVerification() {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).clearVerification();
            return this;
        }

        @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
        public Declaration getDeclaration(int i11) {
            return ((DescriptorProtos$ExtensionRangeOptions) this.instance).getDeclaration(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
        public int getDeclarationCount() {
            return ((DescriptorProtos$ExtensionRangeOptions) this.instance).getDeclarationCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
        public List<Declaration> getDeclarationList() {
            return Collections.unmodifiableList(((DescriptorProtos$ExtensionRangeOptions) this.instance).getDeclarationList());
        }

        @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
        public DescriptorProtos$FeatureSet getFeatures() {
            return ((DescriptorProtos$ExtensionRangeOptions) this.instance).getFeatures();
        }

        @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
        public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i11) {
            return ((DescriptorProtos$ExtensionRangeOptions) this.instance).getUninterpretedOption(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return ((DescriptorProtos$ExtensionRangeOptions) this.instance).getUninterpretedOptionCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
        public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
            return Collections.unmodifiableList(((DescriptorProtos$ExtensionRangeOptions) this.instance).getUninterpretedOptionList());
        }

        @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
        public VerificationState getVerification() {
            return ((DescriptorProtos$ExtensionRangeOptions) this.instance).getVerification();
        }

        @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
        public boolean hasFeatures() {
            return ((DescriptorProtos$ExtensionRangeOptions) this.instance).hasFeatures();
        }

        @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
        public boolean hasVerification() {
            return ((DescriptorProtos$ExtensionRangeOptions) this.instance).hasVerification();
        }

        public Builder mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).mergeFeatures(descriptorProtos$FeatureSet);
            return this;
        }

        public Builder removeDeclaration(int i11) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).removeDeclaration(i11);
            return this;
        }

        public Builder removeUninterpretedOption(int i11) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).removeUninterpretedOption(i11);
            return this;
        }

        public Builder setDeclaration(int i11, Declaration declaration) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).setDeclaration(i11, declaration);
            return this;
        }

        public Builder setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).setFeatures(descriptorProtos$FeatureSet);
            return this;
        }

        public Builder setUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).setUninterpretedOption(i11, descriptorProtos$UninterpretedOption);
            return this;
        }

        public Builder setVerification(VerificationState verificationState) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).setVerification(verificationState);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$ExtensionRangeOptions.DEFAULT_INSTANCE);
        }

        public Builder addDeclaration(int i11, Declaration declaration) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).addDeclaration(i11, declaration);
            return this;
        }

        public Builder addUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).addUninterpretedOption(i11, descriptorProtos$UninterpretedOption);
            return this;
        }

        public Builder setDeclaration(int i11, Declaration.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).setDeclaration(i11, builder.build());
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setFeatures(DescriptorProtos$FeatureSet.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).setFeatures((DescriptorProtos$FeatureSet) builder.build());
            return this;
        }

        public Builder setUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).setUninterpretedOption(i11, builder.build());
            return this;
        }

        public Builder addDeclaration(Declaration.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).addDeclaration(builder.build());
            return this;
        }

        public Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).addUninterpretedOption(builder.build());
            return this;
        }

        public Builder addDeclaration(int i11, Declaration.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).addDeclaration(i11, builder.build());
            return this;
        }

        public Builder addUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$ExtensionRangeOptions) this.instance).addUninterpretedOption(i11, builder.build());
            return this;
        }
    }

    public static final class Declaration extends GeneratedMessageLite<Declaration, Builder> implements DeclarationOrBuilder {
        private static final Declaration DEFAULT_INSTANCE;
        public static final int FULL_NAME_FIELD_NUMBER = 2;
        public static final int NUMBER_FIELD_NUMBER = 1;
        private static volatile E<Declaration> PARSER = null;
        public static final int REPEATED_FIELD_NUMBER = 6;
        public static final int RESERVED_FIELD_NUMBER = 5;
        public static final int TYPE_FIELD_NUMBER = 3;
        private int bitField0_;
        private int number_;
        private boolean repeated_;
        private boolean reserved_;
        private String fullName_ = "";
        private String type_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<Declaration, Builder> implements DeclarationOrBuilder {
            /* synthetic */ Builder(C5954e c5954e) {
                this();
            }

            public Builder clearFullName() {
                copyOnWrite();
                ((Declaration) this.instance).clearFullName();
                return this;
            }

            public Builder clearNumber() {
                copyOnWrite();
                ((Declaration) this.instance).clearNumber();
                return this;
            }

            public Builder clearRepeated() {
                copyOnWrite();
                ((Declaration) this.instance).clearRepeated();
                return this;
            }

            public Builder clearReserved() {
                copyOnWrite();
                ((Declaration) this.instance).clearReserved();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((Declaration) this.instance).clearType();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
            public String getFullName() {
                return ((Declaration) this.instance).getFullName();
            }

            @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
            public ByteString getFullNameBytes() {
                return ((Declaration) this.instance).getFullNameBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
            public int getNumber() {
                return ((Declaration) this.instance).getNumber();
            }

            @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
            public boolean getRepeated() {
                return ((Declaration) this.instance).getRepeated();
            }

            @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
            public boolean getReserved() {
                return ((Declaration) this.instance).getReserved();
            }

            @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
            public String getType() {
                return ((Declaration) this.instance).getType();
            }

            @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
            public ByteString getTypeBytes() {
                return ((Declaration) this.instance).getTypeBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
            public boolean hasFullName() {
                return ((Declaration) this.instance).hasFullName();
            }

            @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
            public boolean hasNumber() {
                return ((Declaration) this.instance).hasNumber();
            }

            @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
            public boolean hasRepeated() {
                return ((Declaration) this.instance).hasRepeated();
            }

            @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
            public boolean hasReserved() {
                return ((Declaration) this.instance).hasReserved();
            }

            @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
            public boolean hasType() {
                return ((Declaration) this.instance).hasType();
            }

            public Builder setFullName(String str) {
                copyOnWrite();
                ((Declaration) this.instance).setFullName(str);
                return this;
            }

            public Builder setFullNameBytes(ByteString byteString) {
                copyOnWrite();
                ((Declaration) this.instance).setFullNameBytes(byteString);
                return this;
            }

            public Builder setNumber(int i11) {
                copyOnWrite();
                ((Declaration) this.instance).setNumber(i11);
                return this;
            }

            public Builder setRepeated(boolean z11) {
                copyOnWrite();
                ((Declaration) this.instance).setRepeated(z11);
                return this;
            }

            public Builder setReserved(boolean z11) {
                copyOnWrite();
                ((Declaration) this.instance).setReserved(z11);
                return this;
            }

            public Builder setType(String str) {
                copyOnWrite();
                ((Declaration) this.instance).setType(str);
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((Declaration) this.instance).setTypeBytes(byteString);
                return this;
            }

            private Builder() {
                super(Declaration.DEFAULT_INSTANCE);
            }
        }

        static {
            Declaration declaration = new Declaration();
            DEFAULT_INSTANCE = declaration;
            GeneratedMessageLite.registerDefaultInstance(Declaration.class, declaration);
        }

        private Declaration() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFullName() {
            this.bitField0_ &= -3;
            this.fullName_ = getDefaultInstance().getFullName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNumber() {
            this.bitField0_ &= -2;
            this.number_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRepeated() {
            this.bitField0_ &= -17;
            this.repeated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReserved() {
            this.bitField0_ &= -9;
            this.reserved_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -5;
            this.type_ = getDefaultInstance().getType();
        }

        public static Declaration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Declaration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Declaration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Declaration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Declaration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static E<Declaration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFullName(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.fullName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFullNameBytes(ByteString byteString) {
            this.fullName_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNumber(int i11) {
            this.bitField0_ |= 1;
            this.number_ = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRepeated(boolean z11) {
            this.bitField0_ |= 16;
            this.repeated_ = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReserved(boolean z11) {
            this.bitField0_ |= 8;
            this.reserved_ = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.type_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeBytes(ByteString byteString) {
            this.type_ = byteString.toStringUtf8();
            this.bitField0_ |= 4;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
            E e11;
            C5954e c5954e = null;
            switch (C5954e.f60203a[bVar.ordinal()]) {
                case 1:
                    return new Declaration();
                case 2:
                    return new Builder(c5954e);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"bitField0_", "number_", "fullName_", "type_", "reserved_", "repeated_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    E<Declaration> e12 = PARSER;
                    if (e12 != null) {
                        return e12;
                    }
                    synchronized (Declaration.class) {
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

        @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
        public String getFullName() {
            return this.fullName_;
        }

        @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
        public ByteString getFullNameBytes() {
            return ByteString.copyFromUtf8(this.fullName_);
        }

        @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
        public int getNumber() {
            return this.number_;
        }

        @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
        public boolean getRepeated() {
            return this.repeated_;
        }

        @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
        public boolean getReserved() {
            return this.reserved_;
        }

        @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
        public String getType() {
            return this.type_;
        }

        @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8(this.type_);
        }

        @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
        public boolean hasFullName() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
        public boolean hasNumber() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
        public boolean hasRepeated() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
        public boolean hasReserved() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptions.DeclarationOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(Declaration declaration) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(declaration);
        }

        public static Declaration parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
            return (Declaration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
        }

        public static Declaration parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
            return (Declaration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
        }

        public static Declaration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Declaration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Declaration parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
            return (Declaration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
        }

        public static Declaration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Declaration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Declaration parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
            return (Declaration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
        }

        public static Declaration parseFrom(InputStream inputStream) throws IOException {
            return (Declaration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Declaration parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
            return (Declaration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
        }

        public static Declaration parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Declaration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Declaration parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
            return (Declaration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
        }
    }

    public interface DeclarationOrBuilder extends A {
        /* synthetic */ MessageLite getDefaultInstanceForType();

        String getFullName();

        ByteString getFullNameBytes();

        int getNumber();

        boolean getRepeated();

        boolean getReserved();

        String getType();

        ByteString getTypeBytes();

        boolean hasFullName();

        boolean hasNumber();

        boolean hasRepeated();

        boolean hasReserved();

        boolean hasType();

        @Override // com.google.protobuf.A
        /* synthetic */ boolean isInitialized();
    }

    public enum VerificationState implements Internal.a {
        DECLARATION(0),
        UNVERIFIED(1);

        public static final int DECLARATION_VALUE = 0;
        public static final int UNVERIFIED_VALUE = 1;
        private static final Internal.b<VerificationState> internalValueMap = new Internal.b<VerificationState>() { // from class: com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.VerificationState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.b
            public VerificationState findValueByNumber(int i11) {
                return VerificationState.forNumber(i11);
            }
        };
        private final int value;

        private static final class VerificationStateVerifier implements Internal.c {
            static final Internal.c INSTANCE = new VerificationStateVerifier();

            private VerificationStateVerifier() {
            }

            @Override // com.google.protobuf.Internal.c
            public boolean isInRange(int i11) {
                return VerificationState.forNumber(i11) != null;
            }
        }

        VerificationState(int i11) {
            this.value = i11;
        }

        public static VerificationState forNumber(int i11) {
            if (i11 == 0) {
                return DECLARATION;
            }
            if (i11 != 1) {
                return null;
            }
            return UNVERIFIED;
        }

        public static Internal.b<VerificationState> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.c internalGetVerifier() {
            return VerificationStateVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.a
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static VerificationState valueOf(int i11) {
            return forNumber(i11);
        }
    }

    static {
        DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions = new DescriptorProtos$ExtensionRangeOptions();
        DEFAULT_INSTANCE = descriptorProtos$ExtensionRangeOptions;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$ExtensionRangeOptions.class, descriptorProtos$ExtensionRangeOptions);
    }

    private DescriptorProtos$ExtensionRangeOptions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDeclaration(Iterable<? extends Declaration> iterable) {
        ensureDeclarationIsMutable();
        AbstractMessageLite.addAll(iterable, this.declaration_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
        ensureUninterpretedOptionIsMutable();
        AbstractMessageLite.addAll(iterable, this.uninterpretedOption_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDeclaration(Declaration declaration) {
        declaration.getClass();
        ensureDeclarationIsMutable();
        this.declaration_.add(declaration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeclaration() {
        this.declaration_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatures() {
        this.features_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUninterpretedOption() {
        this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVerification() {
        this.bitField0_ &= -3;
        this.verification_ = 1;
    }

    private void ensureDeclarationIsMutable() {
        Internal.e<Declaration> eVar = this.declaration_;
        if (eVar.isModifiable()) {
            return;
        }
        this.declaration_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    private void ensureUninterpretedOptionIsMutable() {
        Internal.e<DescriptorProtos$UninterpretedOption> eVar = this.uninterpretedOption_;
        if (eVar.isModifiable()) {
            return;
        }
        this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    public static DescriptorProtos$ExtensionRangeOptions getDefaultInstance() {
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
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$ExtensionRangeOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<DescriptorProtos$ExtensionRangeOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDeclaration(int i11) {
        ensureDeclarationIsMutable();
        this.declaration_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUninterpretedOption(int i11) {
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeclaration(int i11, Declaration declaration) {
        declaration.getClass();
        ensureDeclarationIsMutable();
        this.declaration_.set(i11, declaration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
        descriptorProtos$FeatureSet.getClass();
        this.features_ = descriptorProtos$FeatureSet;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.set(i11, descriptorProtos$UninterpretedOption);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerification(VerificationState verificationState) {
        this.verification_ = verificationState.getNumber();
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        C5954e c5954e = null;
        switch (C5954e.f60203a[bVar.ordinal()]) {
            case 1:
                return new DescriptorProtos$ExtensionRangeOptions();
            case 2:
                return new Builder(c5954e);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0002ϧ\u0004\u0000\u0002\u0002\u0002\u001b\u0003᠌\u00012ᐉ\u0000ϧЛ", new Object[]{"bitField0_", "declaration_", Declaration.class, "verification_", VerificationState.internalGetVerifier(), "features_", "uninterpretedOption_", DescriptorProtos$UninterpretedOption.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<DescriptorProtos$ExtensionRangeOptions> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (DescriptorProtos$ExtensionRangeOptions.class) {
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

    @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
    public Declaration getDeclaration(int i11) {
        return this.declaration_.get(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
    public int getDeclarationCount() {
        return this.declaration_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
    public List<Declaration> getDeclarationList() {
        return this.declaration_;
    }

    public DeclarationOrBuilder getDeclarationOrBuilder(int i11) {
        return this.declaration_.get(i11);
    }

    public List<? extends DeclarationOrBuilder> getDeclarationOrBuilderList() {
        return this.declaration_;
    }

    @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
    public DescriptorProtos$FeatureSet getFeatures() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i11) {
        return this.uninterpretedOption_.get(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public DescriptorProtos$UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i11) {
        return this.uninterpretedOption_.get(i11);
    }

    public List<? extends DescriptorProtos$UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
    public VerificationState getVerification() {
        VerificationState forNumber = VerificationState.forNumber(this.verification_);
        return forNumber == null ? VerificationState.UNVERIFIED : forNumber;
    }

    @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
    public boolean hasFeatures() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
    public boolean hasVerification() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(descriptorProtos$ExtensionRangeOptions);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDeclaration(int i11, Declaration declaration) {
        declaration.getClass();
        ensureDeclarationIsMutable();
        this.declaration_.add(i11, declaration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(i11, descriptorProtos$UninterpretedOption);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
