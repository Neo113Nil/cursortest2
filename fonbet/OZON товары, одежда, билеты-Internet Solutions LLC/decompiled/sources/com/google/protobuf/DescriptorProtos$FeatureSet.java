package com.google.protobuf;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public final class DescriptorProtos$FeatureSet extends GeneratedMessageLite.ExtendableMessage<DescriptorProtos$FeatureSet, Builder> implements DescriptorProtos$FeatureSetOrBuilder {
    private static final DescriptorProtos$FeatureSet DEFAULT_INSTANCE;
    public static final int DEFAULT_SYMBOL_VISIBILITY_FIELD_NUMBER = 8;
    public static final int ENFORCE_NAMING_STYLE_FIELD_NUMBER = 7;
    public static final int ENUM_TYPE_FIELD_NUMBER = 2;
    public static final int FIELD_PRESENCE_FIELD_NUMBER = 1;
    public static final int JSON_FORMAT_FIELD_NUMBER = 6;
    public static final int MESSAGE_ENCODING_FIELD_NUMBER = 5;
    private static volatile E<DescriptorProtos$FeatureSet> PARSER = null;
    public static final int REPEATED_FIELD_ENCODING_FIELD_NUMBER = 3;
    public static final int UTF8_VALIDATION_FIELD_NUMBER = 4;
    private int bitField0_;
    private int defaultSymbolVisibility_;
    private int enforceNamingStyle_;
    private int enumType_;
    private int fieldPresence_;
    private int jsonFormat_;
    private byte memoizedIsInitialized = 2;
    private int messageEncoding_;
    private int repeatedFieldEncoding_;
    private int utf8Validation_;

    public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<DescriptorProtos$FeatureSet, Builder> implements DescriptorProtos$FeatureSetOrBuilder {
        /* synthetic */ Builder(C5954e c5954e) {
            this();
        }

        public Builder clearDefaultSymbolVisibility() {
            copyOnWrite();
            ((DescriptorProtos$FeatureSet) this.instance).clearDefaultSymbolVisibility();
            return this;
        }

        public Builder clearEnforceNamingStyle() {
            copyOnWrite();
            ((DescriptorProtos$FeatureSet) this.instance).clearEnforceNamingStyle();
            return this;
        }

        public Builder clearEnumType() {
            copyOnWrite();
            ((DescriptorProtos$FeatureSet) this.instance).clearEnumType();
            return this;
        }

        public Builder clearFieldPresence() {
            copyOnWrite();
            ((DescriptorProtos$FeatureSet) this.instance).clearFieldPresence();
            return this;
        }

        public Builder clearJsonFormat() {
            copyOnWrite();
            ((DescriptorProtos$FeatureSet) this.instance).clearJsonFormat();
            return this;
        }

        public Builder clearMessageEncoding() {
            copyOnWrite();
            ((DescriptorProtos$FeatureSet) this.instance).clearMessageEncoding();
            return this;
        }

        public Builder clearRepeatedFieldEncoding() {
            copyOnWrite();
            ((DescriptorProtos$FeatureSet) this.instance).clearRepeatedFieldEncoding();
            return this;
        }

        public Builder clearUtf8Validation() {
            copyOnWrite();
            ((DescriptorProtos$FeatureSet) this.instance).clearUtf8Validation();
            return this;
        }

        @Override // com.google.protobuf.DescriptorProtos$FeatureSetOrBuilder
        public VisibilityFeature.DefaultSymbolVisibility getDefaultSymbolVisibility() {
            return ((DescriptorProtos$FeatureSet) this.instance).getDefaultSymbolVisibility();
        }

        @Override // com.google.protobuf.DescriptorProtos$FeatureSetOrBuilder
        public EnforceNamingStyle getEnforceNamingStyle() {
            return ((DescriptorProtos$FeatureSet) this.instance).getEnforceNamingStyle();
        }

        @Override // com.google.protobuf.DescriptorProtos$FeatureSetOrBuilder
        public EnumType getEnumType() {
            return ((DescriptorProtos$FeatureSet) this.instance).getEnumType();
        }

        @Override // com.google.protobuf.DescriptorProtos$FeatureSetOrBuilder
        public FieldPresence getFieldPresence() {
            return ((DescriptorProtos$FeatureSet) this.instance).getFieldPresence();
        }

        @Override // com.google.protobuf.DescriptorProtos$FeatureSetOrBuilder
        public JsonFormat getJsonFormat() {
            return ((DescriptorProtos$FeatureSet) this.instance).getJsonFormat();
        }

        @Override // com.google.protobuf.DescriptorProtos$FeatureSetOrBuilder
        public MessageEncoding getMessageEncoding() {
            return ((DescriptorProtos$FeatureSet) this.instance).getMessageEncoding();
        }

        @Override // com.google.protobuf.DescriptorProtos$FeatureSetOrBuilder
        public RepeatedFieldEncoding getRepeatedFieldEncoding() {
            return ((DescriptorProtos$FeatureSet) this.instance).getRepeatedFieldEncoding();
        }

        @Override // com.google.protobuf.DescriptorProtos$FeatureSetOrBuilder
        public Utf8Validation getUtf8Validation() {
            return ((DescriptorProtos$FeatureSet) this.instance).getUtf8Validation();
        }

        @Override // com.google.protobuf.DescriptorProtos$FeatureSetOrBuilder
        public boolean hasDefaultSymbolVisibility() {
            return ((DescriptorProtos$FeatureSet) this.instance).hasDefaultSymbolVisibility();
        }

        @Override // com.google.protobuf.DescriptorProtos$FeatureSetOrBuilder
        public boolean hasEnforceNamingStyle() {
            return ((DescriptorProtos$FeatureSet) this.instance).hasEnforceNamingStyle();
        }

        @Override // com.google.protobuf.DescriptorProtos$FeatureSetOrBuilder
        public boolean hasEnumType() {
            return ((DescriptorProtos$FeatureSet) this.instance).hasEnumType();
        }

        @Override // com.google.protobuf.DescriptorProtos$FeatureSetOrBuilder
        public boolean hasFieldPresence() {
            return ((DescriptorProtos$FeatureSet) this.instance).hasFieldPresence();
        }

        @Override // com.google.protobuf.DescriptorProtos$FeatureSetOrBuilder
        public boolean hasJsonFormat() {
            return ((DescriptorProtos$FeatureSet) this.instance).hasJsonFormat();
        }

        @Override // com.google.protobuf.DescriptorProtos$FeatureSetOrBuilder
        public boolean hasMessageEncoding() {
            return ((DescriptorProtos$FeatureSet) this.instance).hasMessageEncoding();
        }

        @Override // com.google.protobuf.DescriptorProtos$FeatureSetOrBuilder
        public boolean hasRepeatedFieldEncoding() {
            return ((DescriptorProtos$FeatureSet) this.instance).hasRepeatedFieldEncoding();
        }

        @Override // com.google.protobuf.DescriptorProtos$FeatureSetOrBuilder
        public boolean hasUtf8Validation() {
            return ((DescriptorProtos$FeatureSet) this.instance).hasUtf8Validation();
        }

        public Builder setDefaultSymbolVisibility(VisibilityFeature.DefaultSymbolVisibility defaultSymbolVisibility) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSet) this.instance).setDefaultSymbolVisibility(defaultSymbolVisibility);
            return this;
        }

        public Builder setEnforceNamingStyle(EnforceNamingStyle enforceNamingStyle) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSet) this.instance).setEnforceNamingStyle(enforceNamingStyle);
            return this;
        }

        public Builder setEnumType(EnumType enumType) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSet) this.instance).setEnumType(enumType);
            return this;
        }

        public Builder setFieldPresence(FieldPresence fieldPresence) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSet) this.instance).setFieldPresence(fieldPresence);
            return this;
        }

        public Builder setJsonFormat(JsonFormat jsonFormat) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSet) this.instance).setJsonFormat(jsonFormat);
            return this;
        }

        public Builder setMessageEncoding(MessageEncoding messageEncoding) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSet) this.instance).setMessageEncoding(messageEncoding);
            return this;
        }

        public Builder setRepeatedFieldEncoding(RepeatedFieldEncoding repeatedFieldEncoding) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSet) this.instance).setRepeatedFieldEncoding(repeatedFieldEncoding);
            return this;
        }

        public Builder setUtf8Validation(Utf8Validation utf8Validation) {
            copyOnWrite();
            ((DescriptorProtos$FeatureSet) this.instance).setUtf8Validation(utf8Validation);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$FeatureSet.DEFAULT_INSTANCE);
        }
    }

    public enum EnforceNamingStyle implements Internal.a {
        ENFORCE_NAMING_STYLE_UNKNOWN(0),
        STYLE2024(1),
        STYLE_LEGACY(2);

        public static final int ENFORCE_NAMING_STYLE_UNKNOWN_VALUE = 0;
        public static final int STYLE2024_VALUE = 1;
        public static final int STYLE_LEGACY_VALUE = 2;
        private static final Internal.b<EnforceNamingStyle> internalValueMap = new Internal.b<EnforceNamingStyle>() { // from class: com.google.protobuf.DescriptorProtos.FeatureSet.EnforceNamingStyle.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.b
            public EnforceNamingStyle findValueByNumber(int i11) {
                return EnforceNamingStyle.forNumber(i11);
            }
        };
        private final int value;

        private static final class EnforceNamingStyleVerifier implements Internal.c {
            static final Internal.c INSTANCE = new EnforceNamingStyleVerifier();

            private EnforceNamingStyleVerifier() {
            }

            @Override // com.google.protobuf.Internal.c
            public boolean isInRange(int i11) {
                return EnforceNamingStyle.forNumber(i11) != null;
            }
        }

        EnforceNamingStyle(int i11) {
            this.value = i11;
        }

        public static EnforceNamingStyle forNumber(int i11) {
            if (i11 == 0) {
                return ENFORCE_NAMING_STYLE_UNKNOWN;
            }
            if (i11 == 1) {
                return STYLE2024;
            }
            if (i11 != 2) {
                return null;
            }
            return STYLE_LEGACY;
        }

        public static Internal.b<EnforceNamingStyle> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.c internalGetVerifier() {
            return EnforceNamingStyleVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.a
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static EnforceNamingStyle valueOf(int i11) {
            return forNumber(i11);
        }
    }

    public enum EnumType implements Internal.a {
        ENUM_TYPE_UNKNOWN(0),
        OPEN(1),
        CLOSED(2);

        public static final int CLOSED_VALUE = 2;
        public static final int ENUM_TYPE_UNKNOWN_VALUE = 0;
        public static final int OPEN_VALUE = 1;
        private static final Internal.b<EnumType> internalValueMap = new Internal.b<EnumType>() { // from class: com.google.protobuf.DescriptorProtos.FeatureSet.EnumType.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.b
            public EnumType findValueByNumber(int i11) {
                return EnumType.forNumber(i11);
            }
        };
        private final int value;

        private static final class EnumTypeVerifier implements Internal.c {
            static final Internal.c INSTANCE = new EnumTypeVerifier();

            private EnumTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.c
            public boolean isInRange(int i11) {
                return EnumType.forNumber(i11) != null;
            }
        }

        EnumType(int i11) {
            this.value = i11;
        }

        public static EnumType forNumber(int i11) {
            if (i11 == 0) {
                return ENUM_TYPE_UNKNOWN;
            }
            if (i11 == 1) {
                return OPEN;
            }
            if (i11 != 2) {
                return null;
            }
            return CLOSED;
        }

        public static Internal.b<EnumType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.c internalGetVerifier() {
            return EnumTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.a
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static EnumType valueOf(int i11) {
            return forNumber(i11);
        }
    }

    public enum FieldPresence implements Internal.a {
        FIELD_PRESENCE_UNKNOWN(0),
        EXPLICIT(1),
        IMPLICIT(2),
        LEGACY_REQUIRED(3);

        public static final int EXPLICIT_VALUE = 1;
        public static final int FIELD_PRESENCE_UNKNOWN_VALUE = 0;
        public static final int IMPLICIT_VALUE = 2;
        public static final int LEGACY_REQUIRED_VALUE = 3;
        private static final Internal.b<FieldPresence> internalValueMap = new Internal.b<FieldPresence>() { // from class: com.google.protobuf.DescriptorProtos.FeatureSet.FieldPresence.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.b
            public FieldPresence findValueByNumber(int i11) {
                return FieldPresence.forNumber(i11);
            }
        };
        private final int value;

        private static final class FieldPresenceVerifier implements Internal.c {
            static final Internal.c INSTANCE = new FieldPresenceVerifier();

            private FieldPresenceVerifier() {
            }

            @Override // com.google.protobuf.Internal.c
            public boolean isInRange(int i11) {
                return FieldPresence.forNumber(i11) != null;
            }
        }

        FieldPresence(int i11) {
            this.value = i11;
        }

        public static FieldPresence forNumber(int i11) {
            if (i11 == 0) {
                return FIELD_PRESENCE_UNKNOWN;
            }
            if (i11 == 1) {
                return EXPLICIT;
            }
            if (i11 == 2) {
                return IMPLICIT;
            }
            if (i11 != 3) {
                return null;
            }
            return LEGACY_REQUIRED;
        }

        public static Internal.b<FieldPresence> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.c internalGetVerifier() {
            return FieldPresenceVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.a
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static FieldPresence valueOf(int i11) {
            return forNumber(i11);
        }
    }

    public enum JsonFormat implements Internal.a {
        JSON_FORMAT_UNKNOWN(0),
        ALLOW(1),
        LEGACY_BEST_EFFORT(2);

        public static final int ALLOW_VALUE = 1;
        public static final int JSON_FORMAT_UNKNOWN_VALUE = 0;
        public static final int LEGACY_BEST_EFFORT_VALUE = 2;
        private static final Internal.b<JsonFormat> internalValueMap = new Internal.b<JsonFormat>() { // from class: com.google.protobuf.DescriptorProtos.FeatureSet.JsonFormat.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.b
            public JsonFormat findValueByNumber(int i11) {
                return JsonFormat.forNumber(i11);
            }
        };
        private final int value;

        private static final class JsonFormatVerifier implements Internal.c {
            static final Internal.c INSTANCE = new JsonFormatVerifier();

            private JsonFormatVerifier() {
            }

            @Override // com.google.protobuf.Internal.c
            public boolean isInRange(int i11) {
                return JsonFormat.forNumber(i11) != null;
            }
        }

        JsonFormat(int i11) {
            this.value = i11;
        }

        public static JsonFormat forNumber(int i11) {
            if (i11 == 0) {
                return JSON_FORMAT_UNKNOWN;
            }
            if (i11 == 1) {
                return ALLOW;
            }
            if (i11 != 2) {
                return null;
            }
            return LEGACY_BEST_EFFORT;
        }

        public static Internal.b<JsonFormat> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.c internalGetVerifier() {
            return JsonFormatVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.a
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static JsonFormat valueOf(int i11) {
            return forNumber(i11);
        }
    }

    public enum MessageEncoding implements Internal.a {
        MESSAGE_ENCODING_UNKNOWN(0),
        LENGTH_PREFIXED(1),
        DELIMITED(2);

        public static final int DELIMITED_VALUE = 2;
        public static final int LENGTH_PREFIXED_VALUE = 1;
        public static final int MESSAGE_ENCODING_UNKNOWN_VALUE = 0;
        private static final Internal.b<MessageEncoding> internalValueMap = new Internal.b<MessageEncoding>() { // from class: com.google.protobuf.DescriptorProtos.FeatureSet.MessageEncoding.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.b
            public MessageEncoding findValueByNumber(int i11) {
                return MessageEncoding.forNumber(i11);
            }
        };
        private final int value;

        private static final class MessageEncodingVerifier implements Internal.c {
            static final Internal.c INSTANCE = new MessageEncodingVerifier();

            private MessageEncodingVerifier() {
            }

            @Override // com.google.protobuf.Internal.c
            public boolean isInRange(int i11) {
                return MessageEncoding.forNumber(i11) != null;
            }
        }

        MessageEncoding(int i11) {
            this.value = i11;
        }

        public static MessageEncoding forNumber(int i11) {
            if (i11 == 0) {
                return MESSAGE_ENCODING_UNKNOWN;
            }
            if (i11 == 1) {
                return LENGTH_PREFIXED;
            }
            if (i11 != 2) {
                return null;
            }
            return DELIMITED;
        }

        public static Internal.b<MessageEncoding> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.c internalGetVerifier() {
            return MessageEncodingVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.a
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static MessageEncoding valueOf(int i11) {
            return forNumber(i11);
        }
    }

    public enum RepeatedFieldEncoding implements Internal.a {
        REPEATED_FIELD_ENCODING_UNKNOWN(0),
        PACKED(1),
        EXPANDED(2);

        public static final int EXPANDED_VALUE = 2;
        public static final int PACKED_VALUE = 1;
        public static final int REPEATED_FIELD_ENCODING_UNKNOWN_VALUE = 0;
        private static final Internal.b<RepeatedFieldEncoding> internalValueMap = new Internal.b<RepeatedFieldEncoding>() { // from class: com.google.protobuf.DescriptorProtos.FeatureSet.RepeatedFieldEncoding.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.b
            public RepeatedFieldEncoding findValueByNumber(int i11) {
                return RepeatedFieldEncoding.forNumber(i11);
            }
        };
        private final int value;

        private static final class RepeatedFieldEncodingVerifier implements Internal.c {
            static final Internal.c INSTANCE = new RepeatedFieldEncodingVerifier();

            private RepeatedFieldEncodingVerifier() {
            }

            @Override // com.google.protobuf.Internal.c
            public boolean isInRange(int i11) {
                return RepeatedFieldEncoding.forNumber(i11) != null;
            }
        }

        RepeatedFieldEncoding(int i11) {
            this.value = i11;
        }

        public static RepeatedFieldEncoding forNumber(int i11) {
            if (i11 == 0) {
                return REPEATED_FIELD_ENCODING_UNKNOWN;
            }
            if (i11 == 1) {
                return PACKED;
            }
            if (i11 != 2) {
                return null;
            }
            return EXPANDED;
        }

        public static Internal.b<RepeatedFieldEncoding> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.c internalGetVerifier() {
            return RepeatedFieldEncodingVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.a
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static RepeatedFieldEncoding valueOf(int i11) {
            return forNumber(i11);
        }
    }

    public enum Utf8Validation implements Internal.a {
        UTF8_VALIDATION_UNKNOWN(0),
        VERIFY(2),
        NONE(3);

        public static final int NONE_VALUE = 3;
        public static final int UTF8_VALIDATION_UNKNOWN_VALUE = 0;
        public static final int VERIFY_VALUE = 2;
        private static final Internal.b<Utf8Validation> internalValueMap = new Internal.b<Utf8Validation>() { // from class: com.google.protobuf.DescriptorProtos.FeatureSet.Utf8Validation.1
            /* JADX WARN: Can't rename method to resolve collision */
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
            if (i11 == 2) {
                return VERIFY;
            }
            if (i11 != 3) {
                return null;
            }
            return NONE;
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

    public static final class VisibilityFeature extends GeneratedMessageLite<VisibilityFeature, Builder> implements VisibilityFeatureOrBuilder {
        private static final VisibilityFeature DEFAULT_INSTANCE;
        private static volatile E<VisibilityFeature> PARSER;

        public static final class Builder extends GeneratedMessageLite.Builder<VisibilityFeature, Builder> implements VisibilityFeatureOrBuilder {
            /* synthetic */ Builder(C5954e c5954e) {
                this();
            }

            private Builder() {
                super(VisibilityFeature.DEFAULT_INSTANCE);
            }
        }

        public enum DefaultSymbolVisibility implements Internal.a {
            DEFAULT_SYMBOL_VISIBILITY_UNKNOWN(0),
            EXPORT_ALL(1),
            EXPORT_TOP_LEVEL(2),
            LOCAL_ALL(3),
            STRICT(4);

            public static final int DEFAULT_SYMBOL_VISIBILITY_UNKNOWN_VALUE = 0;
            public static final int EXPORT_ALL_VALUE = 1;
            public static final int EXPORT_TOP_LEVEL_VALUE = 2;
            public static final int LOCAL_ALL_VALUE = 3;
            public static final int STRICT_VALUE = 4;
            private static final Internal.b<DefaultSymbolVisibility> internalValueMap = new Internal.b<DefaultSymbolVisibility>() { // from class: com.google.protobuf.DescriptorProtos.FeatureSet.VisibilityFeature.DefaultSymbolVisibility.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.b
                public DefaultSymbolVisibility findValueByNumber(int i11) {
                    return DefaultSymbolVisibility.forNumber(i11);
                }
            };
            private final int value;

            private static final class DefaultSymbolVisibilityVerifier implements Internal.c {
                static final Internal.c INSTANCE = new DefaultSymbolVisibilityVerifier();

                private DefaultSymbolVisibilityVerifier() {
                }

                @Override // com.google.protobuf.Internal.c
                public boolean isInRange(int i11) {
                    return DefaultSymbolVisibility.forNumber(i11) != null;
                }
            }

            DefaultSymbolVisibility(int i11) {
                this.value = i11;
            }

            public static DefaultSymbolVisibility forNumber(int i11) {
                if (i11 == 0) {
                    return DEFAULT_SYMBOL_VISIBILITY_UNKNOWN;
                }
                if (i11 == 1) {
                    return EXPORT_ALL;
                }
                if (i11 == 2) {
                    return EXPORT_TOP_LEVEL;
                }
                if (i11 == 3) {
                    return LOCAL_ALL;
                }
                if (i11 != 4) {
                    return null;
                }
                return STRICT;
            }

            public static Internal.b<DefaultSymbolVisibility> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.c internalGetVerifier() {
                return DefaultSymbolVisibilityVerifier.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.a
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static DefaultSymbolVisibility valueOf(int i11) {
                return forNumber(i11);
            }
        }

        static {
            VisibilityFeature visibilityFeature = new VisibilityFeature();
            DEFAULT_INSTANCE = visibilityFeature;
            GeneratedMessageLite.registerDefaultInstance(VisibilityFeature.class, visibilityFeature);
        }

        private VisibilityFeature() {
        }

        public static VisibilityFeature getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static VisibilityFeature parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VisibilityFeature) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VisibilityFeature parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (VisibilityFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static E<VisibilityFeature> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
            E e11;
            C5954e c5954e = null;
            switch (C5954e.f60203a[bVar.ordinal()]) {
                case 1:
                    return new VisibilityFeature();
                case 2:
                    return new Builder(c5954e);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    E<VisibilityFeature> e12 = PARSER;
                    if (e12 != null) {
                        return e12;
                    }
                    synchronized (VisibilityFeature.class) {
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

        public static Builder newBuilder(VisibilityFeature visibilityFeature) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(visibilityFeature);
        }

        public static VisibilityFeature parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
            return (VisibilityFeature) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
        }

        public static VisibilityFeature parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
            return (VisibilityFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
        }

        public static VisibilityFeature parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VisibilityFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static VisibilityFeature parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
            return (VisibilityFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
        }

        public static VisibilityFeature parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VisibilityFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VisibilityFeature parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
            return (VisibilityFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
        }

        public static VisibilityFeature parseFrom(InputStream inputStream) throws IOException {
            return (VisibilityFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VisibilityFeature parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
            return (VisibilityFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
        }

        public static VisibilityFeature parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (VisibilityFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static VisibilityFeature parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
            return (VisibilityFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
        }
    }

    public interface VisibilityFeatureOrBuilder extends A {
        /* synthetic */ MessageLite getDefaultInstanceForType();

        @Override // com.google.protobuf.A
        /* synthetic */ boolean isInitialized();
    }

    static {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = new DescriptorProtos$FeatureSet();
        DEFAULT_INSTANCE = descriptorProtos$FeatureSet;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$FeatureSet.class, descriptorProtos$FeatureSet);
    }

    private DescriptorProtos$FeatureSet() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaultSymbolVisibility() {
        this.bitField0_ &= -129;
        this.defaultSymbolVisibility_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnforceNamingStyle() {
        this.bitField0_ &= -65;
        this.enforceNamingStyle_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnumType() {
        this.bitField0_ &= -3;
        this.enumType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFieldPresence() {
        this.bitField0_ &= -2;
        this.fieldPresence_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJsonFormat() {
        this.bitField0_ &= -33;
        this.jsonFormat_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageEncoding() {
        this.bitField0_ &= -17;
        this.messageEncoding_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRepeatedFieldEncoding() {
        this.bitField0_ &= -5;
        this.repeatedFieldEncoding_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUtf8Validation() {
        this.bitField0_ &= -9;
        this.utf8Validation_ = 0;
    }

    public static DescriptorProtos$FeatureSet getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$FeatureSet parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FeatureSet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FeatureSet parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FeatureSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<DescriptorProtos$FeatureSet> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultSymbolVisibility(VisibilityFeature.DefaultSymbolVisibility defaultSymbolVisibility) {
        this.defaultSymbolVisibility_ = defaultSymbolVisibility.getNumber();
        this.bitField0_ |= UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnforceNamingStyle(EnforceNamingStyle enforceNamingStyle) {
        this.enforceNamingStyle_ = enforceNamingStyle.getNumber();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnumType(EnumType enumType) {
        this.enumType_ = enumType.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFieldPresence(FieldPresence fieldPresence) {
        this.fieldPresence_ = fieldPresence.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJsonFormat(JsonFormat jsonFormat) {
        this.jsonFormat_ = jsonFormat.getNumber();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageEncoding(MessageEncoding messageEncoding) {
        this.messageEncoding_ = messageEncoding.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRepeatedFieldEncoding(RepeatedFieldEncoding repeatedFieldEncoding) {
        this.repeatedFieldEncoding_ = repeatedFieldEncoding.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUtf8Validation(Utf8Validation utf8Validation) {
        this.utf8Validation_ = utf8Validation.getNumber();
        this.bitField0_ |= 8;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        C5954e c5954e = null;
        switch (C5954e.f60203a[bVar.ordinal()]) {
            case 1:
                return new DescriptorProtos$FeatureSet();
            case 2:
                return new Builder(c5954e);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"bitField0_", "fieldPresence_", FieldPresence.internalGetVerifier(), "enumType_", EnumType.internalGetVerifier(), "repeatedFieldEncoding_", RepeatedFieldEncoding.internalGetVerifier(), "utf8Validation_", Utf8Validation.internalGetVerifier(), "messageEncoding_", MessageEncoding.internalGetVerifier(), "jsonFormat_", JsonFormat.internalGetVerifier(), "enforceNamingStyle_", EnforceNamingStyle.internalGetVerifier(), "defaultSymbolVisibility_", VisibilityFeature.DefaultSymbolVisibility.internalGetVerifier()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<DescriptorProtos$FeatureSet> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (DescriptorProtos$FeatureSet.class) {
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

    @Override // com.google.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public VisibilityFeature.DefaultSymbolVisibility getDefaultSymbolVisibility() {
        VisibilityFeature.DefaultSymbolVisibility forNumber = VisibilityFeature.DefaultSymbolVisibility.forNumber(this.defaultSymbolVisibility_);
        return forNumber == null ? VisibilityFeature.DefaultSymbolVisibility.DEFAULT_SYMBOL_VISIBILITY_UNKNOWN : forNumber;
    }

    @Override // com.google.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public EnforceNamingStyle getEnforceNamingStyle() {
        EnforceNamingStyle forNumber = EnforceNamingStyle.forNumber(this.enforceNamingStyle_);
        return forNumber == null ? EnforceNamingStyle.ENFORCE_NAMING_STYLE_UNKNOWN : forNumber;
    }

    @Override // com.google.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public EnumType getEnumType() {
        EnumType forNumber = EnumType.forNumber(this.enumType_);
        return forNumber == null ? EnumType.ENUM_TYPE_UNKNOWN : forNumber;
    }

    @Override // com.google.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public FieldPresence getFieldPresence() {
        FieldPresence forNumber = FieldPresence.forNumber(this.fieldPresence_);
        return forNumber == null ? FieldPresence.FIELD_PRESENCE_UNKNOWN : forNumber;
    }

    @Override // com.google.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public JsonFormat getJsonFormat() {
        JsonFormat forNumber = JsonFormat.forNumber(this.jsonFormat_);
        return forNumber == null ? JsonFormat.JSON_FORMAT_UNKNOWN : forNumber;
    }

    @Override // com.google.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public MessageEncoding getMessageEncoding() {
        MessageEncoding forNumber = MessageEncoding.forNumber(this.messageEncoding_);
        return forNumber == null ? MessageEncoding.MESSAGE_ENCODING_UNKNOWN : forNumber;
    }

    @Override // com.google.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public RepeatedFieldEncoding getRepeatedFieldEncoding() {
        RepeatedFieldEncoding forNumber = RepeatedFieldEncoding.forNumber(this.repeatedFieldEncoding_);
        return forNumber == null ? RepeatedFieldEncoding.REPEATED_FIELD_ENCODING_UNKNOWN : forNumber;
    }

    @Override // com.google.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public Utf8Validation getUtf8Validation() {
        Utf8Validation forNumber = Utf8Validation.forNumber(this.utf8Validation_);
        return forNumber == null ? Utf8Validation.UTF8_VALIDATION_UNKNOWN : forNumber;
    }

    @Override // com.google.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public boolean hasDefaultSymbolVisibility() {
        return (this.bitField0_ & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public boolean hasEnforceNamingStyle() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public boolean hasEnumType() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public boolean hasFieldPresence() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public boolean hasJsonFormat() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public boolean hasMessageEncoding() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public boolean hasRepeatedFieldEncoding() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public boolean hasUtf8Validation() {
        return (this.bitField0_ & 8) != 0;
    }

    public static Builder newBuilder(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(descriptorProtos$FeatureSet);
    }

    public static DescriptorProtos$FeatureSet parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$FeatureSet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$FeatureSet parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FeatureSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static DescriptorProtos$FeatureSet parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FeatureSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DescriptorProtos$FeatureSet parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FeatureSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static DescriptorProtos$FeatureSet parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FeatureSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$FeatureSet parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FeatureSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static DescriptorProtos$FeatureSet parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FeatureSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FeatureSet parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$FeatureSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$FeatureSet parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DescriptorProtos$FeatureSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$FeatureSet parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$FeatureSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
