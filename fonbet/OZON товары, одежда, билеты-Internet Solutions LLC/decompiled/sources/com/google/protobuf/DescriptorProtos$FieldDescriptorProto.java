package com.google.protobuf;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.DescriptorProtos$FieldOptions;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public final class DescriptorProtos$FieldDescriptorProto extends GeneratedMessageLite<DescriptorProtos$FieldDescriptorProto, Builder> implements DescriptorProtos$FieldDescriptorProtoOrBuilder {
    private static final DescriptorProtos$FieldDescriptorProto DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 7;
    public static final int EXTENDEE_FIELD_NUMBER = 2;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int LABEL_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 9;
    public static final int OPTIONS_FIELD_NUMBER = 8;
    private static volatile E<DescriptorProtos$FieldDescriptorProto> PARSER = null;
    public static final int PROTO3_OPTIONAL_FIELD_NUMBER = 17;
    public static final int TYPE_FIELD_NUMBER = 5;
    public static final int TYPE_NAME_FIELD_NUMBER = 6;
    private int bitField0_;
    private int number_;
    private int oneofIndex_;
    private DescriptorProtos$FieldOptions options_;
    private boolean proto3Optional_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private int label_ = 1;
    private int type_ = 1;
    private String typeName_ = "";
    private String extendee_ = "";
    private String defaultValue_ = "";
    private String jsonName_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<DescriptorProtos$FieldDescriptorProto, Builder> implements DescriptorProtos$FieldDescriptorProtoOrBuilder {
        /* synthetic */ Builder(C5954e c5954e) {
            this();
        }

        public Builder clearDefaultValue() {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).clearDefaultValue();
            return this;
        }

        public Builder clearExtendee() {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).clearExtendee();
            return this;
        }

        public Builder clearJsonName() {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).clearJsonName();
            return this;
        }

        public Builder clearLabel() {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).clearLabel();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).clearName();
            return this;
        }

        public Builder clearNumber() {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).clearNumber();
            return this;
        }

        public Builder clearOneofIndex() {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).clearOneofIndex();
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).clearOptions();
            return this;
        }

        public Builder clearProto3Optional() {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).clearProto3Optional();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).clearType();
            return this;
        }

        public Builder clearTypeName() {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).clearTypeName();
            return this;
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public String getDefaultValue() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).getDefaultValue();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public ByteString getDefaultValueBytes() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).getDefaultValueBytes();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public String getExtendee() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).getExtendee();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public ByteString getExtendeeBytes() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).getExtendeeBytes();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public String getJsonName() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).getJsonName();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public ByteString getJsonNameBytes() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).getJsonNameBytes();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public Label getLabel() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).getLabel();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public String getName() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).getName();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).getNameBytes();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public int getNumber() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).getNumber();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public int getOneofIndex() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).getOneofIndex();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public DescriptorProtos$FieldOptions getOptions() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).getOptions();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean getProto3Optional() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).getProto3Optional();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public Type getType() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).getType();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public String getTypeName() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).getTypeName();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public ByteString getTypeNameBytes() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).getTypeNameBytes();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasDefaultValue() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).hasDefaultValue();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasExtendee() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).hasExtendee();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasJsonName() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).hasJsonName();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasLabel() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).hasLabel();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasName() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).hasName();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasNumber() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).hasNumber();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasOneofIndex() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).hasOneofIndex();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasOptions() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).hasOptions();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasProto3Optional() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).hasProto3Optional();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasType() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).hasType();
        }

        @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasTypeName() {
            return ((DescriptorProtos$FieldDescriptorProto) this.instance).hasTypeName();
        }

        public Builder mergeOptions(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).mergeOptions(descriptorProtos$FieldOptions);
            return this;
        }

        public Builder setDefaultValue(String str) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setDefaultValue(str);
            return this;
        }

        public Builder setDefaultValueBytes(ByteString byteString) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setDefaultValueBytes(byteString);
            return this;
        }

        public Builder setExtendee(String str) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setExtendee(str);
            return this;
        }

        public Builder setExtendeeBytes(ByteString byteString) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setExtendeeBytes(byteString);
            return this;
        }

        public Builder setJsonName(String str) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setJsonName(str);
            return this;
        }

        public Builder setJsonNameBytes(ByteString byteString) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setJsonNameBytes(byteString);
            return this;
        }

        public Builder setLabel(Label label) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setLabel(label);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setNumber(int i11) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setNumber(i11);
            return this;
        }

        public Builder setOneofIndex(int i11) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setOneofIndex(i11);
            return this;
        }

        public Builder setOptions(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setOptions(descriptorProtos$FieldOptions);
            return this;
        }

        public Builder setProto3Optional(boolean z11) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setProto3Optional(z11);
            return this;
        }

        public Builder setType(Type type) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setType(type);
            return this;
        }

        public Builder setTypeName(String str) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setTypeName(str);
            return this;
        }

        public Builder setTypeNameBytes(ByteString byteString) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setTypeNameBytes(byteString);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$FieldDescriptorProto.DEFAULT_INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setOptions(DescriptorProtos$FieldOptions.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FieldDescriptorProto) this.instance).setOptions((DescriptorProtos$FieldOptions) builder.build());
            return this;
        }
    }

    public enum Label implements Internal.a {
        LABEL_OPTIONAL(1),
        LABEL_REPEATED(3),
        LABEL_REQUIRED(2);

        public static final int LABEL_OPTIONAL_VALUE = 1;
        public static final int LABEL_REPEATED_VALUE = 3;
        public static final int LABEL_REQUIRED_VALUE = 2;
        private static final Internal.b<Label> internalValueMap = new Internal.b<Label>() { // from class: com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.b
            public Label findValueByNumber(int i11) {
                return Label.forNumber(i11);
            }
        };
        private final int value;

        private static final class LabelVerifier implements Internal.c {
            static final Internal.c INSTANCE = new LabelVerifier();

            private LabelVerifier() {
            }

            @Override // com.google.protobuf.Internal.c
            public boolean isInRange(int i11) {
                return Label.forNumber(i11) != null;
            }
        }

        Label(int i11) {
            this.value = i11;
        }

        public static Label forNumber(int i11) {
            if (i11 == 1) {
                return LABEL_OPTIONAL;
            }
            if (i11 == 2) {
                return LABEL_REQUIRED;
            }
            if (i11 != 3) {
                return null;
            }
            return LABEL_REPEATED;
        }

        public static Internal.b<Label> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.c internalGetVerifier() {
            return LabelVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.a
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static Label valueOf(int i11) {
            return forNumber(i11);
        }
    }

    public enum Type implements Internal.a {
        TYPE_DOUBLE(1),
        TYPE_FLOAT(2),
        TYPE_INT64(3),
        TYPE_UINT64(4),
        TYPE_INT32(5),
        TYPE_FIXED64(6),
        TYPE_FIXED32(7),
        TYPE_BOOL(8),
        TYPE_STRING(9),
        TYPE_GROUP(10),
        TYPE_MESSAGE(11),
        TYPE_BYTES(12),
        TYPE_UINT32(13),
        TYPE_ENUM(14),
        TYPE_SFIXED32(15),
        TYPE_SFIXED64(16),
        TYPE_SINT32(17),
        TYPE_SINT64(18);

        public static final int TYPE_BOOL_VALUE = 8;
        public static final int TYPE_BYTES_VALUE = 12;
        public static final int TYPE_DOUBLE_VALUE = 1;
        public static final int TYPE_ENUM_VALUE = 14;
        public static final int TYPE_FIXED32_VALUE = 7;
        public static final int TYPE_FIXED64_VALUE = 6;
        public static final int TYPE_FLOAT_VALUE = 2;
        public static final int TYPE_GROUP_VALUE = 10;
        public static final int TYPE_INT32_VALUE = 5;
        public static final int TYPE_INT64_VALUE = 3;
        public static final int TYPE_MESSAGE_VALUE = 11;
        public static final int TYPE_SFIXED32_VALUE = 15;
        public static final int TYPE_SFIXED64_VALUE = 16;
        public static final int TYPE_SINT32_VALUE = 17;
        public static final int TYPE_SINT64_VALUE = 18;
        public static final int TYPE_STRING_VALUE = 9;
        public static final int TYPE_UINT32_VALUE = 13;
        public static final int TYPE_UINT64_VALUE = 4;
        private static final Internal.b<Type> internalValueMap = new Internal.b<Type>() { // from class: com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.b
            public Type findValueByNumber(int i11) {
                return Type.forNumber(i11);
            }
        };
        private final int value;

        private static final class TypeVerifier implements Internal.c {
            static final Internal.c INSTANCE = new TypeVerifier();

            private TypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.c
            public boolean isInRange(int i11) {
                return Type.forNumber(i11) != null;
            }
        }

        Type(int i11) {
            this.value = i11;
        }

        public static Type forNumber(int i11) {
            switch (i11) {
                case 1:
                    return TYPE_DOUBLE;
                case 2:
                    return TYPE_FLOAT;
                case 3:
                    return TYPE_INT64;
                case 4:
                    return TYPE_UINT64;
                case 5:
                    return TYPE_INT32;
                case 6:
                    return TYPE_FIXED64;
                case 7:
                    return TYPE_FIXED32;
                case 8:
                    return TYPE_BOOL;
                case 9:
                    return TYPE_STRING;
                case 10:
                    return TYPE_GROUP;
                case 11:
                    return TYPE_MESSAGE;
                case 12:
                    return TYPE_BYTES;
                case 13:
                    return TYPE_UINT32;
                case 14:
                    return TYPE_ENUM;
                case 15:
                    return TYPE_SFIXED32;
                case 16:
                    return TYPE_SFIXED64;
                case 17:
                    return TYPE_SINT32;
                case 18:
                    return TYPE_SINT64;
                default:
                    return null;
            }
        }

        public static Internal.b<Type> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.c internalGetVerifier() {
            return TypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.a
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static Type valueOf(int i11) {
            return forNumber(i11);
        }
    }

    static {
        DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = new DescriptorProtos$FieldDescriptorProto();
        DEFAULT_INSTANCE = descriptorProtos$FieldDescriptorProto;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$FieldDescriptorProto.class, descriptorProtos$FieldDescriptorProto);
    }

    private DescriptorProtos$FieldDescriptorProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaultValue() {
        this.bitField0_ &= -65;
        this.defaultValue_ = getDefaultInstance().getDefaultValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtendee() {
        this.bitField0_ &= -33;
        this.extendee_ = getDefaultInstance().getExtendee();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJsonName() {
        this.bitField0_ &= -257;
        this.jsonName_ = getDefaultInstance().getJsonName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabel() {
        this.bitField0_ &= -5;
        this.label_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumber() {
        this.bitField0_ &= -3;
        this.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOneofIndex() {
        this.bitField0_ &= -129;
        this.oneofIndex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProto3Optional() {
        this.bitField0_ &= -1025;
        this.proto3Optional_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -9;
        this.type_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeName() {
        this.bitField0_ &= -17;
        this.typeName_ = getDefaultInstance().getTypeName();
    }

    public static DescriptorProtos$FieldDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeOptions(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
        descriptorProtos$FieldOptions.getClass();
        DescriptorProtos$FieldOptions descriptorProtos$FieldOptions2 = this.options_;
        if (descriptorProtos$FieldOptions2 == null || descriptorProtos$FieldOptions2 == DescriptorProtos$FieldOptions.getDefaultInstance()) {
            this.options_ = descriptorProtos$FieldOptions;
        } else {
            this.options_ = ((DescriptorProtos$FieldOptions.Builder) DescriptorProtos$FieldOptions.newBuilder(this.options_).mergeFrom((DescriptorProtos$FieldOptions.Builder) descriptorProtos$FieldOptions)).buildPartial();
        }
        this.bitField0_ |= UserVerificationMethods.USER_VERIFY_NONE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$FieldDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<DescriptorProtos$FieldDescriptorProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultValue(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.defaultValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultValueBytes(ByteString byteString) {
        this.defaultValue_ = byteString.toStringUtf8();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtendee(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.extendee_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtendeeBytes(ByteString byteString) {
        this.extendee_ = byteString.toStringUtf8();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJsonName(String str) {
        str.getClass();
        this.bitField0_ |= 256;
        this.jsonName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJsonNameBytes(ByteString byteString) {
        this.jsonName_ = byteString.toStringUtf8();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabel(Label label) {
        this.label_ = label.getNumber();
        this.bitField0_ |= 4;
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
    public void setNumber(int i11) {
        this.bitField0_ |= 2;
        this.number_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOneofIndex(int i11) {
        this.bitField0_ |= UserVerificationMethods.USER_VERIFY_PATTERN;
        this.oneofIndex_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
        descriptorProtos$FieldOptions.getClass();
        this.options_ = descriptorProtos$FieldOptions;
        this.bitField0_ |= UserVerificationMethods.USER_VERIFY_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProto3Optional(boolean z11) {
        this.bitField0_ |= UserVerificationMethods.USER_VERIFY_ALL;
        this.proto3Optional_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(Type type) {
        this.type_ = type.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeName(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.typeName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeNameBytes(ByteString byteString) {
        this.typeName_ = byteString.toStringUtf8();
        this.bitField0_ |= 16;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        C5954e c5954e = null;
        switch (C5954e.f60203a[bVar.ordinal()]) {
            case 1:
                return new DescriptorProtos$FieldDescriptorProto();
            case 2:
                return new Builder(c5954e);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u0011\u000b\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0005\u0003င\u0001\u0004᠌\u0002\u0005᠌\u0003\u0006ဈ\u0004\u0007ဈ\u0006\bᐉ\t\tင\u0007\nဈ\b\u0011ဇ\n", new Object[]{"bitField0_", "name_", "extendee_", "number_", "label_", Label.internalGetVerifier(), "type_", Type.internalGetVerifier(), "typeName_", "defaultValue_", "options_", "oneofIndex_", "jsonName_", "proto3Optional_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<DescriptorProtos$FieldDescriptorProto> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (DescriptorProtos$FieldDescriptorProto.class) {
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

    @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public String getDefaultValue() {
        return this.defaultValue_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public ByteString getDefaultValueBytes() {
        return ByteString.copyFromUtf8(this.defaultValue_);
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public String getExtendee() {
        return this.extendee_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public ByteString getExtendeeBytes() {
        return ByteString.copyFromUtf8(this.extendee_);
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public String getJsonName() {
        return this.jsonName_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public ByteString getJsonNameBytes() {
        return ByteString.copyFromUtf8(this.jsonName_);
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public Label getLabel() {
        Label forNumber = Label.forNumber(this.label_);
        return forNumber == null ? Label.LABEL_OPTIONAL : forNumber;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public int getNumber() {
        return this.number_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public int getOneofIndex() {
        return this.oneofIndex_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public DescriptorProtos$FieldOptions getOptions() {
        DescriptorProtos$FieldOptions descriptorProtos$FieldOptions = this.options_;
        return descriptorProtos$FieldOptions == null ? DescriptorProtos$FieldOptions.getDefaultInstance() : descriptorProtos$FieldOptions;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public boolean getProto3Optional() {
        return this.proto3Optional_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public Type getType() {
        Type forNumber = Type.forNumber(this.type_);
        return forNumber == null ? Type.TYPE_DOUBLE : forNumber;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public String getTypeName() {
        return this.typeName_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public ByteString getTypeNameBytes() {
        return ByteString.copyFromUtf8(this.typeName_);
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public boolean hasDefaultValue() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public boolean hasExtendee() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public boolean hasJsonName() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public boolean hasLabel() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public boolean hasNumber() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public boolean hasOneofIndex() {
        return (this.bitField0_ & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public boolean hasOptions() {
        return (this.bitField0_ & UserVerificationMethods.USER_VERIFY_NONE) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public boolean hasProto3Optional() {
        return (this.bitField0_ & UserVerificationMethods.USER_VERIFY_ALL) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public boolean hasType() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public boolean hasTypeName() {
        return (this.bitField0_ & 16) != 0;
    }

    public static Builder newBuilder(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(descriptorProtos$FieldDescriptorProto);
    }

    public static DescriptorProtos$FieldDescriptorProto parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
