package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public final class JavaFeaturesProto$JavaFeatures extends GeneratedMessageLite<JavaFeaturesProto$JavaFeatures, Builder> implements JavaFeaturesProto$JavaFeaturesOrBuilder {
    private static final JavaFeaturesProto$JavaFeatures DEFAULT_INSTANCE;
    public static final int LARGE_ENUM_FIELD_NUMBER = 3;
    public static final int LEGACY_CLOSED_ENUM_FIELD_NUMBER = 1;
    public static final int NEST_IN_FILE_CLASS_FIELD_NUMBER = 5;
    private static volatile E<JavaFeaturesProto$JavaFeatures> PARSER = null;
    public static final int USE_OLD_OUTER_CLASSNAME_DEFAULT_FIELD_NUMBER = 4;
    public static final int UTF8_VALIDATION_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean largeEnum_;
    private boolean legacyClosedEnum_;
    private int nestInFileClass_;
    private boolean useOldOuterClassnameDefault_;
    private int utf8Validation_;

    public static final class Builder extends GeneratedMessageLite.Builder<JavaFeaturesProto$JavaFeatures, Builder> implements JavaFeaturesProto$JavaFeaturesOrBuilder {
        /* synthetic */ Builder(C5965p c5965p) {
            this();
        }

        public Builder clearLargeEnum() {
            copyOnWrite();
            ((JavaFeaturesProto$JavaFeatures) this.instance).clearLargeEnum();
            return this;
        }

        public Builder clearLegacyClosedEnum() {
            copyOnWrite();
            ((JavaFeaturesProto$JavaFeatures) this.instance).clearLegacyClosedEnum();
            return this;
        }

        public Builder clearNestInFileClass() {
            copyOnWrite();
            ((JavaFeaturesProto$JavaFeatures) this.instance).clearNestInFileClass();
            return this;
        }

        public Builder clearUseOldOuterClassnameDefault() {
            copyOnWrite();
            ((JavaFeaturesProto$JavaFeatures) this.instance).clearUseOldOuterClassnameDefault();
            return this;
        }

        public Builder clearUtf8Validation() {
            copyOnWrite();
            ((JavaFeaturesProto$JavaFeatures) this.instance).clearUtf8Validation();
            return this;
        }

        @Override // com.google.protobuf.JavaFeaturesProto$JavaFeaturesOrBuilder
        public boolean getLargeEnum() {
            return ((JavaFeaturesProto$JavaFeatures) this.instance).getLargeEnum();
        }

        @Override // com.google.protobuf.JavaFeaturesProto$JavaFeaturesOrBuilder
        public boolean getLegacyClosedEnum() {
            return ((JavaFeaturesProto$JavaFeatures) this.instance).getLegacyClosedEnum();
        }

        @Override // com.google.protobuf.JavaFeaturesProto$JavaFeaturesOrBuilder
        public NestInFileClassFeature.NestInFileClass getNestInFileClass() {
            return ((JavaFeaturesProto$JavaFeatures) this.instance).getNestInFileClass();
        }

        @Override // com.google.protobuf.JavaFeaturesProto$JavaFeaturesOrBuilder
        public boolean getUseOldOuterClassnameDefault() {
            return ((JavaFeaturesProto$JavaFeatures) this.instance).getUseOldOuterClassnameDefault();
        }

        @Override // com.google.protobuf.JavaFeaturesProto$JavaFeaturesOrBuilder
        public Utf8Validation getUtf8Validation() {
            return ((JavaFeaturesProto$JavaFeatures) this.instance).getUtf8Validation();
        }

        @Override // com.google.protobuf.JavaFeaturesProto$JavaFeaturesOrBuilder
        public boolean hasLargeEnum() {
            return ((JavaFeaturesProto$JavaFeatures) this.instance).hasLargeEnum();
        }

        @Override // com.google.protobuf.JavaFeaturesProto$JavaFeaturesOrBuilder
        public boolean hasLegacyClosedEnum() {
            return ((JavaFeaturesProto$JavaFeatures) this.instance).hasLegacyClosedEnum();
        }

        @Override // com.google.protobuf.JavaFeaturesProto$JavaFeaturesOrBuilder
        public boolean hasNestInFileClass() {
            return ((JavaFeaturesProto$JavaFeatures) this.instance).hasNestInFileClass();
        }

        @Override // com.google.protobuf.JavaFeaturesProto$JavaFeaturesOrBuilder
        public boolean hasUseOldOuterClassnameDefault() {
            return ((JavaFeaturesProto$JavaFeatures) this.instance).hasUseOldOuterClassnameDefault();
        }

        @Override // com.google.protobuf.JavaFeaturesProto$JavaFeaturesOrBuilder
        public boolean hasUtf8Validation() {
            return ((JavaFeaturesProto$JavaFeatures) this.instance).hasUtf8Validation();
        }

        public Builder setLargeEnum(boolean z11) {
            copyOnWrite();
            ((JavaFeaturesProto$JavaFeatures) this.instance).setLargeEnum(z11);
            return this;
        }

        public Builder setLegacyClosedEnum(boolean z11) {
            copyOnWrite();
            ((JavaFeaturesProto$JavaFeatures) this.instance).setLegacyClosedEnum(z11);
            return this;
        }

        public Builder setNestInFileClass(NestInFileClassFeature.NestInFileClass nestInFileClass) {
            copyOnWrite();
            ((JavaFeaturesProto$JavaFeatures) this.instance).setNestInFileClass(nestInFileClass);
            return this;
        }

        public Builder setUseOldOuterClassnameDefault(boolean z11) {
            copyOnWrite();
            ((JavaFeaturesProto$JavaFeatures) this.instance).setUseOldOuterClassnameDefault(z11);
            return this;
        }

        public Builder setUtf8Validation(Utf8Validation utf8Validation) {
            copyOnWrite();
            ((JavaFeaturesProto$JavaFeatures) this.instance).setUtf8Validation(utf8Validation);
            return this;
        }

        private Builder() {
            super(JavaFeaturesProto$JavaFeatures.DEFAULT_INSTANCE);
        }
    }

    public static final class NestInFileClassFeature extends GeneratedMessageLite<NestInFileClassFeature, Builder> implements NestInFileClassFeatureOrBuilder {
        private static final NestInFileClassFeature DEFAULT_INSTANCE;
        private static volatile E<NestInFileClassFeature> PARSER;

        public static final class Builder extends GeneratedMessageLite.Builder<NestInFileClassFeature, Builder> implements NestInFileClassFeatureOrBuilder {
            /* synthetic */ Builder(C5965p c5965p) {
                this();
            }

            private Builder() {
                super(NestInFileClassFeature.DEFAULT_INSTANCE);
            }
        }

        public enum NestInFileClass implements Internal.a {
            NEST_IN_FILE_CLASS_UNKNOWN(0),
            NO(1),
            YES(2),
            LEGACY(3);

            public static final int LEGACY_VALUE = 3;
            public static final int NEST_IN_FILE_CLASS_UNKNOWN_VALUE = 0;
            public static final int NO_VALUE = 1;
            public static final int YES_VALUE = 2;
            private static final Internal.b<NestInFileClass> internalValueMap = new Internal.b<NestInFileClass>() { // from class: com.google.protobuf.JavaFeaturesProto.JavaFeatures.NestInFileClassFeature.NestInFileClass.1
                @Override // com.google.protobuf.Internal.b
                public NestInFileClass findValueByNumber(int i11) {
                    return NestInFileClass.forNumber(i11);
                }
            };
            private final int value;

            private static final class NestInFileClassVerifier implements Internal.c {
                static final Internal.c INSTANCE = new NestInFileClassVerifier();

                private NestInFileClassVerifier() {
                }

                @Override // com.google.protobuf.Internal.c
                public boolean isInRange(int i11) {
                    return NestInFileClass.forNumber(i11) != null;
                }
            }

            NestInFileClass(int i11) {
                this.value = i11;
            }

            public static NestInFileClass forNumber(int i11) {
                if (i11 == 0) {
                    return NEST_IN_FILE_CLASS_UNKNOWN;
                }
                if (i11 == 1) {
                    return NO;
                }
                if (i11 == 2) {
                    return YES;
                }
                if (i11 != 3) {
                    return null;
                }
                return LEGACY;
            }

            public static Internal.b<NestInFileClass> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.c internalGetVerifier() {
                return NestInFileClassVerifier.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.a
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static NestInFileClass valueOf(int i11) {
                return forNumber(i11);
            }
        }

        static {
            NestInFileClassFeature nestInFileClassFeature = new NestInFileClassFeature();
            DEFAULT_INSTANCE = nestInFileClassFeature;
            GeneratedMessageLite.registerDefaultInstance(NestInFileClassFeature.class, nestInFileClassFeature);
        }

        private NestInFileClassFeature() {
        }

        public static NestInFileClassFeature getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static NestInFileClassFeature parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NestInFileClassFeature) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NestInFileClassFeature parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NestInFileClassFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static E<NestInFileClassFeature> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
            E e11;
            C5965p c5965p = null;
            switch (C5965p.f60229a[bVar.ordinal()]) {
                case 1:
                    return new NestInFileClassFeature();
                case 2:
                    return new Builder(c5965p);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    E<NestInFileClassFeature> e12 = PARSER;
                    if (e12 != null) {
                        return e12;
                    }
                    synchronized (NestInFileClassFeature.class) {
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

        public static Builder newBuilder(NestInFileClassFeature nestInFileClassFeature) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(nestInFileClassFeature);
        }

        public static NestInFileClassFeature parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
            return (NestInFileClassFeature) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
        }

        public static NestInFileClassFeature parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
            return (NestInFileClassFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
        }

        public static NestInFileClassFeature parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NestInFileClassFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NestInFileClassFeature parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
            return (NestInFileClassFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
        }

        public static NestInFileClassFeature parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NestInFileClassFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NestInFileClassFeature parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
            return (NestInFileClassFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
        }

        public static NestInFileClassFeature parseFrom(InputStream inputStream) throws IOException {
            return (NestInFileClassFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NestInFileClassFeature parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
            return (NestInFileClassFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
        }

        public static NestInFileClassFeature parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NestInFileClassFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NestInFileClassFeature parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
            return (NestInFileClassFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
        }
    }

    public interface NestInFileClassFeatureOrBuilder extends A {
        /* synthetic */ MessageLite getDefaultInstanceForType();

        @Override // com.google.protobuf.A
        /* synthetic */ boolean isInitialized();
    }

    public enum Utf8Validation implements Internal.a {
        UTF8_VALIDATION_UNKNOWN(0),
        DEFAULT(1),
        VERIFY(2);

        public static final int DEFAULT_VALUE = 1;
        public static final int UTF8_VALIDATION_UNKNOWN_VALUE = 0;
        public static final int VERIFY_VALUE = 2;
        private static final Internal.b<Utf8Validation> internalValueMap = new Internal.b<Utf8Validation>() { // from class: com.google.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation.1
            @Override // com.google.protobuf.Internal.b
            public Utf8Validation findValueByNumber(int i11) {
                return Utf8Validation.forNumber(i11);
            }
        };
        private final int value;

        private static final class Utf8ValidationVerifier implements Internal.c {
            static final Internal.c INSTANCE = new Utf8ValidationVerifier();

            private Utf8ValidationVerifier() {
            }

            @Override // com.google.protobuf.Internal.c
            public boolean isInRange(int i11) {
                return Utf8Validation.forNumber(i11) != null;
            }
        }

        Utf8Validation(int i11) {
            this.value = i11;
        }

        public static Utf8Validation forNumber(int i11) {
            if (i11 == 0) {
                return UTF8_VALIDATION_UNKNOWN;
            }
            if (i11 == 1) {
                return DEFAULT;
            }
            if (i11 != 2) {
                return null;
            }
            return VERIFY;
        }

        public static Internal.b<Utf8Validation> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.c internalGetVerifier() {
            return Utf8ValidationVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.a
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static Utf8Validation valueOf(int i11) {
            return forNumber(i11);
        }
    }

    static {
        JavaFeaturesProto$JavaFeatures javaFeaturesProto$JavaFeatures = new JavaFeaturesProto$JavaFeatures();
        DEFAULT_INSTANCE = javaFeaturesProto$JavaFeatures;
        GeneratedMessageLite.registerDefaultInstance(JavaFeaturesProto$JavaFeatures.class, javaFeaturesProto$JavaFeatures);
    }

    private JavaFeaturesProto$JavaFeatures() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLargeEnum() {
        this.bitField0_ &= -5;
        this.largeEnum_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLegacyClosedEnum() {
        this.bitField0_ &= -2;
        this.legacyClosedEnum_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNestInFileClass() {
        this.bitField0_ &= -17;
        this.nestInFileClass_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUseOldOuterClassnameDefault() {
        this.bitField0_ &= -9;
        this.useOldOuterClassnameDefault_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUtf8Validation() {
        this.bitField0_ &= -3;
        this.utf8Validation_ = 0;
    }

    public static JavaFeaturesProto$JavaFeatures getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static JavaFeaturesProto$JavaFeatures parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<JavaFeaturesProto$JavaFeatures> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLargeEnum(boolean z11) {
        this.bitField0_ |= 4;
        this.largeEnum_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLegacyClosedEnum(boolean z11) {
        this.bitField0_ |= 1;
        this.legacyClosedEnum_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNestInFileClass(NestInFileClassFeature.NestInFileClass nestInFileClass) {
        this.nestInFileClass_ = nestInFileClass.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseOldOuterClassnameDefault(boolean z11) {
        this.bitField0_ |= 8;
        this.useOldOuterClassnameDefault_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUtf8Validation(Utf8Validation utf8Validation) {
        this.utf8Validation_ = utf8Validation.getNumber();
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        C5965p c5965p = null;
        switch (C5965p.f60229a[bVar.ordinal()]) {
            case 1:
                return new JavaFeaturesProto$JavaFeatures();
            case 2:
                return new Builder(c5965p);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005᠌\u0004", new Object[]{"bitField0_", "legacyClosedEnum_", "utf8Validation_", Utf8Validation.internalGetVerifier(), "largeEnum_", "useOldOuterClassnameDefault_", "nestInFileClass_", NestInFileClassFeature.NestInFileClass.internalGetVerifier()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<JavaFeaturesProto$JavaFeatures> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (JavaFeaturesProto$JavaFeatures.class) {
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

    @Override // com.google.protobuf.JavaFeaturesProto$JavaFeaturesOrBuilder
    public boolean getLargeEnum() {
        return this.largeEnum_;
    }

    @Override // com.google.protobuf.JavaFeaturesProto$JavaFeaturesOrBuilder
    public boolean getLegacyClosedEnum() {
        return this.legacyClosedEnum_;
    }

    @Override // com.google.protobuf.JavaFeaturesProto$JavaFeaturesOrBuilder
    public NestInFileClassFeature.NestInFileClass getNestInFileClass() {
        NestInFileClassFeature.NestInFileClass forNumber = NestInFileClassFeature.NestInFileClass.forNumber(this.nestInFileClass_);
        return forNumber == null ? NestInFileClassFeature.NestInFileClass.NEST_IN_FILE_CLASS_UNKNOWN : forNumber;
    }

    @Override // com.google.protobuf.JavaFeaturesProto$JavaFeaturesOrBuilder
    public boolean getUseOldOuterClassnameDefault() {
        return this.useOldOuterClassnameDefault_;
    }

    @Override // com.google.protobuf.JavaFeaturesProto$JavaFeaturesOrBuilder
    public Utf8Validation getUtf8Validation() {
        Utf8Validation forNumber = Utf8Validation.forNumber(this.utf8Validation_);
        return forNumber == null ? Utf8Validation.UTF8_VALIDATION_UNKNOWN : forNumber;
    }

    @Override // com.google.protobuf.JavaFeaturesProto$JavaFeaturesOrBuilder
    public boolean hasLargeEnum() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.JavaFeaturesProto$JavaFeaturesOrBuilder
    public boolean hasLegacyClosedEnum() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.JavaFeaturesProto$JavaFeaturesOrBuilder
    public boolean hasNestInFileClass() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.JavaFeaturesProto$JavaFeaturesOrBuilder
    public boolean hasUseOldOuterClassnameDefault() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.JavaFeaturesProto$JavaFeaturesOrBuilder
    public boolean hasUtf8Validation() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(JavaFeaturesProto$JavaFeatures javaFeaturesProto$JavaFeatures) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(javaFeaturesProto$JavaFeatures);
    }

    public static JavaFeaturesProto$JavaFeatures parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(InputStream inputStream) throws IOException {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static JavaFeaturesProto$JavaFeatures parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (JavaFeaturesProto$JavaFeatures) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
