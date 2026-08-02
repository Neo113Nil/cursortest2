package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class DescriptorProtos$UninterpretedOption extends GeneratedMessageLite<DescriptorProtos$UninterpretedOption, Builder> implements DescriptorProtos$UninterpretedOptionOrBuilder {
    public static final int AGGREGATE_VALUE_FIELD_NUMBER = 8;
    private static final DescriptorProtos$UninterpretedOption DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 6;
    public static final int IDENTIFIER_VALUE_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NEGATIVE_INT_VALUE_FIELD_NUMBER = 5;
    private static volatile E<DescriptorProtos$UninterpretedOption> PARSER = null;
    public static final int POSITIVE_INT_VALUE_FIELD_NUMBER = 4;
    public static final int STRING_VALUE_FIELD_NUMBER = 7;
    private int bitField0_;
    private double doubleValue_;
    private long negativeIntValue_;
    private long positiveIntValue_;
    private byte memoizedIsInitialized = 2;
    private Internal.e<NamePart> name_ = GeneratedMessageLite.emptyProtobufList();
    private String identifierValue_ = "";
    private ByteString stringValue_ = ByteString.EMPTY;
    private String aggregateValue_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<DescriptorProtos$UninterpretedOption, Builder> implements DescriptorProtos$UninterpretedOptionOrBuilder {
        /* synthetic */ Builder(C5954e c5954e) {
            this();
        }

        public Builder addAllName(Iterable<? extends NamePart> iterable) {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).addAllName(iterable);
            return this;
        }

        public Builder addName(NamePart namePart) {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).addName(namePart);
            return this;
        }

        public Builder clearAggregateValue() {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).clearAggregateValue();
            return this;
        }

        public Builder clearDoubleValue() {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).clearDoubleValue();
            return this;
        }

        public Builder clearIdentifierValue() {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).clearIdentifierValue();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).clearName();
            return this;
        }

        public Builder clearNegativeIntValue() {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).clearNegativeIntValue();
            return this;
        }

        public Builder clearPositiveIntValue() {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).clearPositiveIntValue();
            return this;
        }

        public Builder clearStringValue() {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).clearStringValue();
            return this;
        }

        @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public String getAggregateValue() {
            return ((DescriptorProtos$UninterpretedOption) this.instance).getAggregateValue();
        }

        @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public ByteString getAggregateValueBytes() {
            return ((DescriptorProtos$UninterpretedOption) this.instance).getAggregateValueBytes();
        }

        @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public double getDoubleValue() {
            return ((DescriptorProtos$UninterpretedOption) this.instance).getDoubleValue();
        }

        @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public String getIdentifierValue() {
            return ((DescriptorProtos$UninterpretedOption) this.instance).getIdentifierValue();
        }

        @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public ByteString getIdentifierValueBytes() {
            return ((DescriptorProtos$UninterpretedOption) this.instance).getIdentifierValueBytes();
        }

        @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public NamePart getName(int i11) {
            return ((DescriptorProtos$UninterpretedOption) this.instance).getName(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public int getNameCount() {
            return ((DescriptorProtos$UninterpretedOption) this.instance).getNameCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public List<NamePart> getNameList() {
            return Collections.unmodifiableList(((DescriptorProtos$UninterpretedOption) this.instance).getNameList());
        }

        @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public long getNegativeIntValue() {
            return ((DescriptorProtos$UninterpretedOption) this.instance).getNegativeIntValue();
        }

        @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public long getPositiveIntValue() {
            return ((DescriptorProtos$UninterpretedOption) this.instance).getPositiveIntValue();
        }

        @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public ByteString getStringValue() {
            return ((DescriptorProtos$UninterpretedOption) this.instance).getStringValue();
        }

        @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public boolean hasAggregateValue() {
            return ((DescriptorProtos$UninterpretedOption) this.instance).hasAggregateValue();
        }

        @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public boolean hasDoubleValue() {
            return ((DescriptorProtos$UninterpretedOption) this.instance).hasDoubleValue();
        }

        @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public boolean hasIdentifierValue() {
            return ((DescriptorProtos$UninterpretedOption) this.instance).hasIdentifierValue();
        }

        @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public boolean hasNegativeIntValue() {
            return ((DescriptorProtos$UninterpretedOption) this.instance).hasNegativeIntValue();
        }

        @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public boolean hasPositiveIntValue() {
            return ((DescriptorProtos$UninterpretedOption) this.instance).hasPositiveIntValue();
        }

        @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public boolean hasStringValue() {
            return ((DescriptorProtos$UninterpretedOption) this.instance).hasStringValue();
        }

        public Builder removeName(int i11) {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).removeName(i11);
            return this;
        }

        public Builder setAggregateValue(String str) {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).setAggregateValue(str);
            return this;
        }

        public Builder setAggregateValueBytes(ByteString byteString) {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).setAggregateValueBytes(byteString);
            return this;
        }

        public Builder setDoubleValue(double d11) {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).setDoubleValue(d11);
            return this;
        }

        public Builder setIdentifierValue(String str) {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).setIdentifierValue(str);
            return this;
        }

        public Builder setIdentifierValueBytes(ByteString byteString) {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).setIdentifierValueBytes(byteString);
            return this;
        }

        public Builder setName(int i11, NamePart namePart) {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).setName(i11, namePart);
            return this;
        }

        public Builder setNegativeIntValue(long j11) {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).setNegativeIntValue(j11);
            return this;
        }

        public Builder setPositiveIntValue(long j11) {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).setPositiveIntValue(j11);
            return this;
        }

        public Builder setStringValue(ByteString byteString) {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).setStringValue(byteString);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$UninterpretedOption.DEFAULT_INSTANCE);
        }

        public Builder addName(int i11, NamePart namePart) {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).addName(i11, namePart);
            return this;
        }

        public Builder setName(int i11, NamePart.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).setName(i11, builder.build());
            return this;
        }

        public Builder addName(NamePart.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).addName(builder.build());
            return this;
        }

        public Builder addName(int i11, NamePart.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$UninterpretedOption) this.instance).addName(i11, builder.build());
            return this;
        }
    }

    public static final class NamePart extends GeneratedMessageLite<NamePart, Builder> implements NamePartOrBuilder {
        private static final NamePart DEFAULT_INSTANCE;
        public static final int IS_EXTENSION_FIELD_NUMBER = 2;
        public static final int NAME_PART_FIELD_NUMBER = 1;
        private static volatile E<NamePart> PARSER;
        private int bitField0_;
        private boolean isExtension_;
        private byte memoizedIsInitialized = 2;
        private String namePart_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<NamePart, Builder> implements NamePartOrBuilder {
            /* synthetic */ Builder(C5954e c5954e) {
                this();
            }

            public Builder clearIsExtension() {
                copyOnWrite();
                ((NamePart) this.instance).clearIsExtension();
                return this;
            }

            public Builder clearNamePart() {
                copyOnWrite();
                ((NamePart) this.instance).clearNamePart();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos$UninterpretedOption.NamePartOrBuilder
            public boolean getIsExtension() {
                return ((NamePart) this.instance).getIsExtension();
            }

            @Override // com.google.protobuf.DescriptorProtos$UninterpretedOption.NamePartOrBuilder
            public String getNamePart() {
                return ((NamePart) this.instance).getNamePart();
            }

            @Override // com.google.protobuf.DescriptorProtos$UninterpretedOption.NamePartOrBuilder
            public ByteString getNamePartBytes() {
                return ((NamePart) this.instance).getNamePartBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos$UninterpretedOption.NamePartOrBuilder
            public boolean hasIsExtension() {
                return ((NamePart) this.instance).hasIsExtension();
            }

            @Override // com.google.protobuf.DescriptorProtos$UninterpretedOption.NamePartOrBuilder
            public boolean hasNamePart() {
                return ((NamePart) this.instance).hasNamePart();
            }

            public Builder setIsExtension(boolean z11) {
                copyOnWrite();
                ((NamePart) this.instance).setIsExtension(z11);
                return this;
            }

            public Builder setNamePart(String str) {
                copyOnWrite();
                ((NamePart) this.instance).setNamePart(str);
                return this;
            }

            public Builder setNamePartBytes(ByteString byteString) {
                copyOnWrite();
                ((NamePart) this.instance).setNamePartBytes(byteString);
                return this;
            }

            private Builder() {
                super(NamePart.DEFAULT_INSTANCE);
            }
        }

        static {
            NamePart namePart = new NamePart();
            DEFAULT_INSTANCE = namePart;
            GeneratedMessageLite.registerDefaultInstance(NamePart.class, namePart);
        }

        private NamePart() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsExtension() {
            this.bitField0_ &= -3;
            this.isExtension_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNamePart() {
            this.bitField0_ &= -2;
            this.namePart_ = getDefaultInstance().getNamePart();
        }

        public static NamePart getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static NamePart parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NamePart) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NamePart parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static E<NamePart> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsExtension(boolean z11) {
            this.bitField0_ |= 2;
            this.isExtension_ = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNamePart(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.namePart_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNamePartBytes(ByteString byteString) {
            this.namePart_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
            E e11;
            C5954e c5954e = null;
            switch (C5954e.f60203a[bVar.ordinal()]) {
                case 1:
                    return new NamePart();
                case 2:
                    return new Builder(c5954e);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"bitField0_", "namePart_", "isExtension_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    E<NamePart> e12 = PARSER;
                    if (e12 != null) {
                        return e12;
                    }
                    synchronized (NamePart.class) {
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

        @Override // com.google.protobuf.DescriptorProtos$UninterpretedOption.NamePartOrBuilder
        public boolean getIsExtension() {
            return this.isExtension_;
        }

        @Override // com.google.protobuf.DescriptorProtos$UninterpretedOption.NamePartOrBuilder
        public String getNamePart() {
            return this.namePart_;
        }

        @Override // com.google.protobuf.DescriptorProtos$UninterpretedOption.NamePartOrBuilder
        public ByteString getNamePartBytes() {
            return ByteString.copyFromUtf8(this.namePart_);
        }

        @Override // com.google.protobuf.DescriptorProtos$UninterpretedOption.NamePartOrBuilder
        public boolean hasIsExtension() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos$UninterpretedOption.NamePartOrBuilder
        public boolean hasNamePart() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(NamePart namePart) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(namePart);
        }

        public static NamePart parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
            return (NamePart) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
        }

        public static NamePart parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
            return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
        }

        public static NamePart parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NamePart parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
            return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
        }

        public static NamePart parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NamePart parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
            return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
        }

        public static NamePart parseFrom(InputStream inputStream) throws IOException {
            return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NamePart parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
            return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
        }

        public static NamePart parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NamePart parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
            return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
        }
    }

    public interface NamePartOrBuilder extends A {
        /* synthetic */ MessageLite getDefaultInstanceForType();

        boolean getIsExtension();

        String getNamePart();

        ByteString getNamePartBytes();

        boolean hasIsExtension();

        boolean hasNamePart();

        @Override // com.google.protobuf.A
        /* synthetic */ boolean isInitialized();
    }

    static {
        DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption = new DescriptorProtos$UninterpretedOption();
        DEFAULT_INSTANCE = descriptorProtos$UninterpretedOption;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$UninterpretedOption.class, descriptorProtos$UninterpretedOption);
    }

    private DescriptorProtos$UninterpretedOption() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllName(Iterable<? extends NamePart> iterable) {
        ensureNameIsMutable();
        AbstractMessageLite.addAll(iterable, this.name_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addName(NamePart namePart) {
        namePart.getClass();
        ensureNameIsMutable();
        this.name_.add(namePart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAggregateValue() {
        this.bitField0_ &= -33;
        this.aggregateValue_ = getDefaultInstance().getAggregateValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDoubleValue() {
        this.bitField0_ &= -9;
        this.doubleValue_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdentifierValue() {
        this.bitField0_ &= -2;
        this.identifierValue_ = getDefaultInstance().getIdentifierValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNegativeIntValue() {
        this.bitField0_ &= -5;
        this.negativeIntValue_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPositiveIntValue() {
        this.bitField0_ &= -3;
        this.positiveIntValue_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStringValue() {
        this.bitField0_ &= -17;
        this.stringValue_ = getDefaultInstance().getStringValue();
    }

    private void ensureNameIsMutable() {
        Internal.e<NamePart> eVar = this.name_;
        if (eVar.isModifiable()) {
            return;
        }
        this.name_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    public static DescriptorProtos$UninterpretedOption getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$UninterpretedOption parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<DescriptorProtos$UninterpretedOption> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeName(int i11) {
        ensureNameIsMutable();
        this.name_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAggregateValue(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.aggregateValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAggregateValueBytes(ByteString byteString) {
        this.aggregateValue_ = byteString.toStringUtf8();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDoubleValue(double d11) {
        this.bitField0_ |= 8;
        this.doubleValue_ = d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentifierValue(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.identifierValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentifierValueBytes(ByteString byteString) {
        this.identifierValue_ = byteString.toStringUtf8();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(int i11, NamePart namePart) {
        namePart.getClass();
        ensureNameIsMutable();
        this.name_.set(i11, namePart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNegativeIntValue(long j11) {
        this.bitField0_ |= 4;
        this.negativeIntValue_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPositiveIntValue(long j11) {
        this.bitField0_ |= 2;
        this.positiveIntValue_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValue(ByteString byteString) {
        byteString.getClass();
        this.bitField0_ |= 16;
        this.stringValue_ = byteString;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        C5954e c5954e = null;
        switch (C5954e.f60203a[bVar.ordinal()]) {
            case 1:
                return new DescriptorProtos$UninterpretedOption();
            case 2:
                return new Builder(c5954e);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"bitField0_", "name_", NamePart.class, "identifierValue_", "positiveIntValue_", "negativeIntValue_", "doubleValue_", "stringValue_", "aggregateValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<DescriptorProtos$UninterpretedOption> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (DescriptorProtos$UninterpretedOption.class) {
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

    @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public String getAggregateValue() {
        return this.aggregateValue_;
    }

    @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public ByteString getAggregateValueBytes() {
        return ByteString.copyFromUtf8(this.aggregateValue_);
    }

    @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public double getDoubleValue() {
        return this.doubleValue_;
    }

    @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public String getIdentifierValue() {
        return this.identifierValue_;
    }

    @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public ByteString getIdentifierValueBytes() {
        return ByteString.copyFromUtf8(this.identifierValue_);
    }

    @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public NamePart getName(int i11) {
        return this.name_.get(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public int getNameCount() {
        return this.name_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public List<NamePart> getNameList() {
        return this.name_;
    }

    public NamePartOrBuilder getNameOrBuilder(int i11) {
        return this.name_.get(i11);
    }

    public List<? extends NamePartOrBuilder> getNameOrBuilderList() {
        return this.name_;
    }

    @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public long getNegativeIntValue() {
        return this.negativeIntValue_;
    }

    @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public long getPositiveIntValue() {
        return this.positiveIntValue_;
    }

    @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public ByteString getStringValue() {
        return this.stringValue_;
    }

    @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public boolean hasAggregateValue() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public boolean hasDoubleValue() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public boolean hasIdentifierValue() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public boolean hasNegativeIntValue() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public boolean hasPositiveIntValue() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public boolean hasStringValue() {
        return (this.bitField0_ & 16) != 0;
    }

    public static Builder newBuilder(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(descriptorProtos$UninterpretedOption);
    }

    public static DescriptorProtos$UninterpretedOption parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addName(int i11, NamePart namePart) {
        namePart.getClass();
        ensureNameIsMutable();
        this.name_.add(i11, namePart);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
