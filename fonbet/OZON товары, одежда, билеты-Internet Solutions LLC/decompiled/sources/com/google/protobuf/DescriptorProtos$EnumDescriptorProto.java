package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$EnumOptions;
import com.google.protobuf.DescriptorProtos$EnumValueDescriptorProto;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class DescriptorProtos$EnumDescriptorProto extends GeneratedMessageLite<DescriptorProtos$EnumDescriptorProto, Builder> implements DescriptorProtos$EnumDescriptorProtoOrBuilder {
    private static final DescriptorProtos$EnumDescriptorProto DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile E<DescriptorProtos$EnumDescriptorProto> PARSER = null;
    public static final int RESERVED_NAME_FIELD_NUMBER = 5;
    public static final int RESERVED_RANGE_FIELD_NUMBER = 4;
    public static final int VALUE_FIELD_NUMBER = 2;
    public static final int VISIBILITY_FIELD_NUMBER = 6;
    private int bitField0_;
    private DescriptorProtos$EnumOptions options_;
    private int visibility_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private Internal.e<DescriptorProtos$EnumValueDescriptorProto> value_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.e<EnumReservedRange> reservedRange_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.e<String> reservedName_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<DescriptorProtos$EnumDescriptorProto, Builder> implements DescriptorProtos$EnumDescriptorProtoOrBuilder {
        /* synthetic */ Builder(C5954e c5954e) {
            this();
        }

        public Builder addAllReservedName(Iterable<String> iterable) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).addAllReservedName(iterable);
            return this;
        }

        public Builder addAllReservedRange(Iterable<? extends EnumReservedRange> iterable) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).addAllReservedRange(iterable);
            return this;
        }

        public Builder addAllValue(Iterable<? extends DescriptorProtos$EnumValueDescriptorProto> iterable) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).addAllValue(iterable);
            return this;
        }

        public Builder addReservedName(String str) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).addReservedName(str);
            return this;
        }

        public Builder addReservedNameBytes(ByteString byteString) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).addReservedNameBytes(byteString);
            return this;
        }

        public Builder addReservedRange(EnumReservedRange enumReservedRange) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).addReservedRange(enumReservedRange);
            return this;
        }

        public Builder addValue(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).addValue(descriptorProtos$EnumValueDescriptorProto);
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).clearName();
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).clearOptions();
            return this;
        }

        public Builder clearReservedName() {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).clearReservedName();
            return this;
        }

        public Builder clearReservedRange() {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).clearReservedRange();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).clearValue();
            return this;
        }

        public Builder clearVisibility() {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).clearVisibility();
            return this;
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public String getName() {
            return ((DescriptorProtos$EnumDescriptorProto) this.instance).getName();
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
            return ((DescriptorProtos$EnumDescriptorProto) this.instance).getNameBytes();
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public DescriptorProtos$EnumOptions getOptions() {
            return ((DescriptorProtos$EnumDescriptorProto) this.instance).getOptions();
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public String getReservedName(int i11) {
            return ((DescriptorProtos$EnumDescriptorProto) this.instance).getReservedName(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public ByteString getReservedNameBytes(int i11) {
            return ((DescriptorProtos$EnumDescriptorProto) this.instance).getReservedNameBytes(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public int getReservedNameCount() {
            return ((DescriptorProtos$EnumDescriptorProto) this.instance).getReservedNameCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public List<String> getReservedNameList() {
            return Collections.unmodifiableList(((DescriptorProtos$EnumDescriptorProto) this.instance).getReservedNameList());
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public EnumReservedRange getReservedRange(int i11) {
            return ((DescriptorProtos$EnumDescriptorProto) this.instance).getReservedRange(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public int getReservedRangeCount() {
            return ((DescriptorProtos$EnumDescriptorProto) this.instance).getReservedRangeCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public List<EnumReservedRange> getReservedRangeList() {
            return Collections.unmodifiableList(((DescriptorProtos$EnumDescriptorProto) this.instance).getReservedRangeList());
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public DescriptorProtos$EnumValueDescriptorProto getValue(int i11) {
            return ((DescriptorProtos$EnumDescriptorProto) this.instance).getValue(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public int getValueCount() {
            return ((DescriptorProtos$EnumDescriptorProto) this.instance).getValueCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public List<DescriptorProtos$EnumValueDescriptorProto> getValueList() {
            return Collections.unmodifiableList(((DescriptorProtos$EnumDescriptorProto) this.instance).getValueList());
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public DescriptorProtos$SymbolVisibility getVisibility() {
            return ((DescriptorProtos$EnumDescriptorProto) this.instance).getVisibility();
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public boolean hasName() {
            return ((DescriptorProtos$EnumDescriptorProto) this.instance).hasName();
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public boolean hasOptions() {
            return ((DescriptorProtos$EnumDescriptorProto) this.instance).hasOptions();
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public boolean hasVisibility() {
            return ((DescriptorProtos$EnumDescriptorProto) this.instance).hasVisibility();
        }

        public Builder mergeOptions(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).mergeOptions(descriptorProtos$EnumOptions);
            return this;
        }

        public Builder removeReservedRange(int i11) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).removeReservedRange(i11);
            return this;
        }

        public Builder removeValue(int i11) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).removeValue(i11);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setOptions(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).setOptions(descriptorProtos$EnumOptions);
            return this;
        }

        public Builder setReservedName(int i11, String str) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).setReservedName(i11, str);
            return this;
        }

        public Builder setReservedRange(int i11, EnumReservedRange enumReservedRange) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).setReservedRange(i11, enumReservedRange);
            return this;
        }

        public Builder setValue(int i11, DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).setValue(i11, descriptorProtos$EnumValueDescriptorProto);
            return this;
        }

        public Builder setVisibility(DescriptorProtos$SymbolVisibility descriptorProtos$SymbolVisibility) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).setVisibility(descriptorProtos$SymbolVisibility);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$EnumDescriptorProto.DEFAULT_INSTANCE);
        }

        public Builder addReservedRange(int i11, EnumReservedRange enumReservedRange) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).addReservedRange(i11, enumReservedRange);
            return this;
        }

        public Builder addValue(int i11, DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).addValue(i11, descriptorProtos$EnumValueDescriptorProto);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setOptions(DescriptorProtos$EnumOptions.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).setOptions((DescriptorProtos$EnumOptions) builder.build());
            return this;
        }

        public Builder setReservedRange(int i11, EnumReservedRange.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).setReservedRange(i11, builder.build());
            return this;
        }

        public Builder setValue(int i11, DescriptorProtos$EnumValueDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).setValue(i11, builder.build());
            return this;
        }

        public Builder addReservedRange(EnumReservedRange.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).addReservedRange(builder.build());
            return this;
        }

        public Builder addValue(DescriptorProtos$EnumValueDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).addValue(builder.build());
            return this;
        }

        public Builder addReservedRange(int i11, EnumReservedRange.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).addReservedRange(i11, builder.build());
            return this;
        }

        public Builder addValue(int i11, DescriptorProtos$EnumValueDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$EnumDescriptorProto) this.instance).addValue(i11, builder.build());
            return this;
        }
    }

    public static final class EnumReservedRange extends GeneratedMessageLite<EnumReservedRange, Builder> implements EnumReservedRangeOrBuilder {
        private static final EnumReservedRange DEFAULT_INSTANCE;
        public static final int END_FIELD_NUMBER = 2;
        private static volatile E<EnumReservedRange> PARSER = null;
        public static final int START_FIELD_NUMBER = 1;
        private int bitField0_;
        private int end_;
        private int start_;

        public static final class Builder extends GeneratedMessageLite.Builder<EnumReservedRange, Builder> implements EnumReservedRangeOrBuilder {
            /* synthetic */ Builder(C5954e c5954e) {
                this();
            }

            public Builder clearEnd() {
                copyOnWrite();
                ((EnumReservedRange) this.instance).clearEnd();
                return this;
            }

            public Builder clearStart() {
                copyOnWrite();
                ((EnumReservedRange) this.instance).clearStart();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProto.EnumReservedRangeOrBuilder
            public int getEnd() {
                return ((EnumReservedRange) this.instance).getEnd();
            }

            @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProto.EnumReservedRangeOrBuilder
            public int getStart() {
                return ((EnumReservedRange) this.instance).getStart();
            }

            @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProto.EnumReservedRangeOrBuilder
            public boolean hasEnd() {
                return ((EnumReservedRange) this.instance).hasEnd();
            }

            @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProto.EnumReservedRangeOrBuilder
            public boolean hasStart() {
                return ((EnumReservedRange) this.instance).hasStart();
            }

            public Builder setEnd(int i11) {
                copyOnWrite();
                ((EnumReservedRange) this.instance).setEnd(i11);
                return this;
            }

            public Builder setStart(int i11) {
                copyOnWrite();
                ((EnumReservedRange) this.instance).setStart(i11);
                return this;
            }

            private Builder() {
                super(EnumReservedRange.DEFAULT_INSTANCE);
            }
        }

        static {
            EnumReservedRange enumReservedRange = new EnumReservedRange();
            DEFAULT_INSTANCE = enumReservedRange;
            GeneratedMessageLite.registerDefaultInstance(EnumReservedRange.class, enumReservedRange);
        }

        private EnumReservedRange() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnd() {
            this.bitField0_ &= -3;
            this.end_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStart() {
            this.bitField0_ &= -2;
            this.start_ = 0;
        }

        public static EnumReservedRange getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static EnumReservedRange parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EnumReservedRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumReservedRange parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static E<EnumReservedRange> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnd(int i11) {
            this.bitField0_ |= 2;
            this.end_ = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStart(int i11) {
            this.bitField0_ |= 1;
            this.start_ = i11;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
            E e11;
            C5954e c5954e = null;
            switch (C5954e.f60203a[bVar.ordinal()]) {
                case 1:
                    return new EnumReservedRange();
                case 2:
                    return new Builder(c5954e);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "start_", "end_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    E<EnumReservedRange> e12 = PARSER;
                    if (e12 != null) {
                        return e12;
                    }
                    synchronized (EnumReservedRange.class) {
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

        @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProto.EnumReservedRangeOrBuilder
        public int getEnd() {
            return this.end_;
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProto.EnumReservedRangeOrBuilder
        public int getStart() {
            return this.start_;
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProto.EnumReservedRangeOrBuilder
        public boolean hasEnd() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProto.EnumReservedRangeOrBuilder
        public boolean hasStart() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(EnumReservedRange enumReservedRange) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(enumReservedRange);
        }

        public static EnumReservedRange parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
            return (EnumReservedRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
        }

        public static EnumReservedRange parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
            return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
        }

        public static EnumReservedRange parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static EnumReservedRange parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
            return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
        }

        public static EnumReservedRange parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EnumReservedRange parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
            return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
        }

        public static EnumReservedRange parseFrom(InputStream inputStream) throws IOException {
            return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumReservedRange parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
            return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
        }

        public static EnumReservedRange parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static EnumReservedRange parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
            return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
        }
    }

    public interface EnumReservedRangeOrBuilder extends A {
        /* synthetic */ MessageLite getDefaultInstanceForType();

        int getEnd();

        int getStart();

        boolean hasEnd();

        boolean hasStart();

        @Override // com.google.protobuf.A
        /* synthetic */ boolean isInitialized();
    }

    static {
        DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto = new DescriptorProtos$EnumDescriptorProto();
        DEFAULT_INSTANCE = descriptorProtos$EnumDescriptorProto;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$EnumDescriptorProto.class, descriptorProtos$EnumDescriptorProto);
    }

    private DescriptorProtos$EnumDescriptorProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllReservedName(Iterable<String> iterable) {
        ensureReservedNameIsMutable();
        AbstractMessageLite.addAll(iterable, this.reservedName_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllReservedRange(Iterable<? extends EnumReservedRange> iterable) {
        ensureReservedRangeIsMutable();
        AbstractMessageLite.addAll(iterable, this.reservedRange_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValue(Iterable<? extends DescriptorProtos$EnumValueDescriptorProto> iterable) {
        ensureValueIsMutable();
        AbstractMessageLite.addAll(iterable, this.value_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReservedName(String str) {
        str.getClass();
        ensureReservedNameIsMutable();
        this.reservedName_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReservedNameBytes(ByteString byteString) {
        ensureReservedNameIsMutable();
        this.reservedName_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReservedRange(EnumReservedRange enumReservedRange) {
        enumReservedRange.getClass();
        ensureReservedRangeIsMutable();
        this.reservedRange_.add(enumReservedRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValue(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        descriptorProtos$EnumValueDescriptorProto.getClass();
        ensureValueIsMutable();
        this.value_.add(descriptorProtos$EnumValueDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReservedName() {
        this.reservedName_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReservedRange() {
        this.reservedRange_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVisibility() {
        this.bitField0_ &= -5;
        this.visibility_ = 0;
    }

    private void ensureReservedNameIsMutable() {
        Internal.e<String> eVar = this.reservedName_;
        if (eVar.isModifiable()) {
            return;
        }
        this.reservedName_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    private void ensureReservedRangeIsMutable() {
        Internal.e<EnumReservedRange> eVar = this.reservedRange_;
        if (eVar.isModifiable()) {
            return;
        }
        this.reservedRange_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    private void ensureValueIsMutable() {
        Internal.e<DescriptorProtos$EnumValueDescriptorProto> eVar = this.value_;
        if (eVar.isModifiable()) {
            return;
        }
        this.value_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    public static DescriptorProtos$EnumDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeOptions(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
        descriptorProtos$EnumOptions.getClass();
        DescriptorProtos$EnumOptions descriptorProtos$EnumOptions2 = this.options_;
        if (descriptorProtos$EnumOptions2 == null || descriptorProtos$EnumOptions2 == DescriptorProtos$EnumOptions.getDefaultInstance()) {
            this.options_ = descriptorProtos$EnumOptions;
        } else {
            this.options_ = ((DescriptorProtos$EnumOptions.Builder) DescriptorProtos$EnumOptions.newBuilder(this.options_).mergeFrom((DescriptorProtos$EnumOptions.Builder) descriptorProtos$EnumOptions)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$EnumDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<DescriptorProtos$EnumDescriptorProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeReservedRange(int i11) {
        ensureReservedRangeIsMutable();
        this.reservedRange_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValue(int i11) {
        ensureValueIsMutable();
        this.value_.remove(i11);
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
    public void setOptions(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
        descriptorProtos$EnumOptions.getClass();
        this.options_ = descriptorProtos$EnumOptions;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReservedName(int i11, String str) {
        str.getClass();
        ensureReservedNameIsMutable();
        this.reservedName_.set(i11, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReservedRange(int i11, EnumReservedRange enumReservedRange) {
        enumReservedRange.getClass();
        ensureReservedRangeIsMutable();
        this.reservedRange_.set(i11, enumReservedRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i11, DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        descriptorProtos$EnumValueDescriptorProto.getClass();
        ensureValueIsMutable();
        this.value_.set(i11, descriptorProtos$EnumValueDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVisibility(DescriptorProtos$SymbolVisibility descriptorProtos$SymbolVisibility) {
        this.visibility_ = descriptorProtos$SymbolVisibility.getNumber();
        this.bitField0_ |= 4;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        C5954e c5954e = null;
        switch (C5954e.f60203a[bVar.ordinal()]) {
            case 1:
                return new DescriptorProtos$EnumDescriptorProto();
            case 2:
                return new Builder(c5954e);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001\u0004\u001b\u0005\u001a\u0006᠌\u0002", new Object[]{"bitField0_", "name_", "value_", DescriptorProtos$EnumValueDescriptorProto.class, "options_", "reservedRange_", EnumReservedRange.class, "reservedName_", "visibility_", DescriptorProtos$SymbolVisibility.internalGetVerifier()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<DescriptorProtos$EnumDescriptorProto> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (DescriptorProtos$EnumDescriptorProto.class) {
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

    @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public DescriptorProtos$EnumOptions getOptions() {
        DescriptorProtos$EnumOptions descriptorProtos$EnumOptions = this.options_;
        return descriptorProtos$EnumOptions == null ? DescriptorProtos$EnumOptions.getDefaultInstance() : descriptorProtos$EnumOptions;
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public String getReservedName(int i11) {
        return this.reservedName_.get(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public ByteString getReservedNameBytes(int i11) {
        return ByteString.copyFromUtf8(this.reservedName_.get(i11));
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public int getReservedNameCount() {
        return this.reservedName_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public List<String> getReservedNameList() {
        return this.reservedName_;
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public EnumReservedRange getReservedRange(int i11) {
        return this.reservedRange_.get(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public int getReservedRangeCount() {
        return this.reservedRange_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public List<EnumReservedRange> getReservedRangeList() {
        return this.reservedRange_;
    }

    public EnumReservedRangeOrBuilder getReservedRangeOrBuilder(int i11) {
        return this.reservedRange_.get(i11);
    }

    public List<? extends EnumReservedRangeOrBuilder> getReservedRangeOrBuilderList() {
        return this.reservedRange_;
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public DescriptorProtos$EnumValueDescriptorProto getValue(int i11) {
        return this.value_.get(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public int getValueCount() {
        return this.value_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public List<DescriptorProtos$EnumValueDescriptorProto> getValueList() {
        return this.value_;
    }

    public DescriptorProtos$EnumValueDescriptorProtoOrBuilder getValueOrBuilder(int i11) {
        return this.value_.get(i11);
    }

    public List<? extends DescriptorProtos$EnumValueDescriptorProtoOrBuilder> getValueOrBuilderList() {
        return this.value_;
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public DescriptorProtos$SymbolVisibility getVisibility() {
        DescriptorProtos$SymbolVisibility forNumber = DescriptorProtos$SymbolVisibility.forNumber(this.visibility_);
        return forNumber == null ? DescriptorProtos$SymbolVisibility.VISIBILITY_UNSET : forNumber;
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public boolean hasOptions() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public boolean hasVisibility() {
        return (this.bitField0_ & 4) != 0;
    }

    public static Builder newBuilder(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(descriptorProtos$EnumDescriptorProto);
    }

    public static DescriptorProtos$EnumDescriptorProto parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReservedRange(int i11, EnumReservedRange enumReservedRange) {
        enumReservedRange.getClass();
        ensureReservedRangeIsMutable();
        this.reservedRange_.add(i11, enumReservedRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValue(int i11, DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        descriptorProtos$EnumValueDescriptorProto.getClass();
        ensureValueIsMutable();
        this.value_.add(i11, descriptorProtos$EnumValueDescriptorProto);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
