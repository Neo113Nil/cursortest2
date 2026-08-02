package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$EnumDescriptorProto;
import com.google.protobuf.DescriptorProtos$ExtensionRangeOptions;
import com.google.protobuf.DescriptorProtos$FieldDescriptorProto;
import com.google.protobuf.DescriptorProtos$MessageOptions;
import com.google.protobuf.DescriptorProtos$OneofDescriptorProto;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class DescriptorProtos$DescriptorProto extends GeneratedMessageLite<DescriptorProtos$DescriptorProto, Builder> implements DescriptorProtos$DescriptorProtoOrBuilder {
    private static final DescriptorProtos$DescriptorProto DEFAULT_INSTANCE;
    public static final int ENUM_TYPE_FIELD_NUMBER = 4;
    public static final int EXTENSION_FIELD_NUMBER = 6;
    public static final int EXTENSION_RANGE_FIELD_NUMBER = 5;
    public static final int FIELD_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NESTED_TYPE_FIELD_NUMBER = 3;
    public static final int ONEOF_DECL_FIELD_NUMBER = 8;
    public static final int OPTIONS_FIELD_NUMBER = 7;
    private static volatile E<DescriptorProtos$DescriptorProto> PARSER = null;
    public static final int RESERVED_NAME_FIELD_NUMBER = 10;
    public static final int RESERVED_RANGE_FIELD_NUMBER = 9;
    public static final int VISIBILITY_FIELD_NUMBER = 11;
    private int bitField0_;
    private DescriptorProtos$MessageOptions options_;
    private int visibility_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private Internal.e<DescriptorProtos$FieldDescriptorProto> field_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.e<DescriptorProtos$FieldDescriptorProto> extension_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.e<DescriptorProtos$DescriptorProto> nestedType_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.e<DescriptorProtos$EnumDescriptorProto> enumType_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.e<ExtensionRange> extensionRange_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.e<DescriptorProtos$OneofDescriptorProto> oneofDecl_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.e<ReservedRange> reservedRange_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.e<String> reservedName_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<DescriptorProtos$DescriptorProto, Builder> implements DescriptorProtos$DescriptorProtoOrBuilder {
        /* synthetic */ Builder(C5954e c5954e) {
            this();
        }

        public Builder addAllEnumType(Iterable<? extends DescriptorProtos$EnumDescriptorProto> iterable) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addAllEnumType(iterable);
            return this;
        }

        public Builder addAllExtension(Iterable<? extends DescriptorProtos$FieldDescriptorProto> iterable) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addAllExtension(iterable);
            return this;
        }

        public Builder addAllExtensionRange(Iterable<? extends ExtensionRange> iterable) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addAllExtensionRange(iterable);
            return this;
        }

        public Builder addAllField(Iterable<? extends DescriptorProtos$FieldDescriptorProto> iterable) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addAllField(iterable);
            return this;
        }

        public Builder addAllNestedType(Iterable<? extends DescriptorProtos$DescriptorProto> iterable) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addAllNestedType(iterable);
            return this;
        }

        public Builder addAllOneofDecl(Iterable<? extends DescriptorProtos$OneofDescriptorProto> iterable) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addAllOneofDecl(iterable);
            return this;
        }

        public Builder addAllReservedName(Iterable<String> iterable) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addAllReservedName(iterable);
            return this;
        }

        public Builder addAllReservedRange(Iterable<? extends ReservedRange> iterable) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addAllReservedRange(iterable);
            return this;
        }

        public Builder addEnumType(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addEnumType(descriptorProtos$EnumDescriptorProto);
            return this;
        }

        public Builder addExtension(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addExtension(descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public Builder addExtensionRange(ExtensionRange extensionRange) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addExtensionRange(extensionRange);
            return this;
        }

        public Builder addField(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addField(descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public Builder addNestedType(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addNestedType(descriptorProtos$DescriptorProto);
            return this;
        }

        public Builder addOneofDecl(DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addOneofDecl(descriptorProtos$OneofDescriptorProto);
            return this;
        }

        public Builder addReservedName(String str) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addReservedName(str);
            return this;
        }

        public Builder addReservedNameBytes(ByteString byteString) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addReservedNameBytes(byteString);
            return this;
        }

        public Builder addReservedRange(ReservedRange reservedRange) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addReservedRange(reservedRange);
            return this;
        }

        public Builder clearEnumType() {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).clearEnumType();
            return this;
        }

        public Builder clearExtension() {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).clearExtension();
            return this;
        }

        public Builder clearExtensionRange() {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).clearExtensionRange();
            return this;
        }

        public Builder clearField() {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).clearField();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).clearName();
            return this;
        }

        public Builder clearNestedType() {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).clearNestedType();
            return this;
        }

        public Builder clearOneofDecl() {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).clearOneofDecl();
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).clearOptions();
            return this;
        }

        public Builder clearReservedName() {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).clearReservedName();
            return this;
        }

        public Builder clearReservedRange() {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).clearReservedRange();
            return this;
        }

        public Builder clearVisibility() {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).clearVisibility();
            return this;
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public DescriptorProtos$EnumDescriptorProto getEnumType(int i11) {
            return ((DescriptorProtos$DescriptorProto) this.instance).getEnumType(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public int getEnumTypeCount() {
            return ((DescriptorProtos$DescriptorProto) this.instance).getEnumTypeCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList() {
            return Collections.unmodifiableList(((DescriptorProtos$DescriptorProto) this.instance).getEnumTypeList());
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public DescriptorProtos$FieldDescriptorProto getExtension(int i11) {
            return ((DescriptorProtos$DescriptorProto) this.instance).getExtension(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public int getExtensionCount() {
            return ((DescriptorProtos$DescriptorProto) this.instance).getExtensionCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public List<DescriptorProtos$FieldDescriptorProto> getExtensionList() {
            return Collections.unmodifiableList(((DescriptorProtos$DescriptorProto) this.instance).getExtensionList());
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public ExtensionRange getExtensionRange(int i11) {
            return ((DescriptorProtos$DescriptorProto) this.instance).getExtensionRange(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public int getExtensionRangeCount() {
            return ((DescriptorProtos$DescriptorProto) this.instance).getExtensionRangeCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public List<ExtensionRange> getExtensionRangeList() {
            return Collections.unmodifiableList(((DescriptorProtos$DescriptorProto) this.instance).getExtensionRangeList());
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public DescriptorProtos$FieldDescriptorProto getField(int i11) {
            return ((DescriptorProtos$DescriptorProto) this.instance).getField(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public int getFieldCount() {
            return ((DescriptorProtos$DescriptorProto) this.instance).getFieldCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public List<DescriptorProtos$FieldDescriptorProto> getFieldList() {
            return Collections.unmodifiableList(((DescriptorProtos$DescriptorProto) this.instance).getFieldList());
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public String getName() {
            return ((DescriptorProtos$DescriptorProto) this.instance).getName();
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public ByteString getNameBytes() {
            return ((DescriptorProtos$DescriptorProto) this.instance).getNameBytes();
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public DescriptorProtos$DescriptorProto getNestedType(int i11) {
            return ((DescriptorProtos$DescriptorProto) this.instance).getNestedType(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public int getNestedTypeCount() {
            return ((DescriptorProtos$DescriptorProto) this.instance).getNestedTypeCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public List<DescriptorProtos$DescriptorProto> getNestedTypeList() {
            return Collections.unmodifiableList(((DescriptorProtos$DescriptorProto) this.instance).getNestedTypeList());
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public DescriptorProtos$OneofDescriptorProto getOneofDecl(int i11) {
            return ((DescriptorProtos$DescriptorProto) this.instance).getOneofDecl(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public int getOneofDeclCount() {
            return ((DescriptorProtos$DescriptorProto) this.instance).getOneofDeclCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public List<DescriptorProtos$OneofDescriptorProto> getOneofDeclList() {
            return Collections.unmodifiableList(((DescriptorProtos$DescriptorProto) this.instance).getOneofDeclList());
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public DescriptorProtos$MessageOptions getOptions() {
            return ((DescriptorProtos$DescriptorProto) this.instance).getOptions();
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public String getReservedName(int i11) {
            return ((DescriptorProtos$DescriptorProto) this.instance).getReservedName(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public ByteString getReservedNameBytes(int i11) {
            return ((DescriptorProtos$DescriptorProto) this.instance).getReservedNameBytes(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public int getReservedNameCount() {
            return ((DescriptorProtos$DescriptorProto) this.instance).getReservedNameCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public List<String> getReservedNameList() {
            return Collections.unmodifiableList(((DescriptorProtos$DescriptorProto) this.instance).getReservedNameList());
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public ReservedRange getReservedRange(int i11) {
            return ((DescriptorProtos$DescriptorProto) this.instance).getReservedRange(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public int getReservedRangeCount() {
            return ((DescriptorProtos$DescriptorProto) this.instance).getReservedRangeCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public List<ReservedRange> getReservedRangeList() {
            return Collections.unmodifiableList(((DescriptorProtos$DescriptorProto) this.instance).getReservedRangeList());
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public DescriptorProtos$SymbolVisibility getVisibility() {
            return ((DescriptorProtos$DescriptorProto) this.instance).getVisibility();
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public boolean hasName() {
            return ((DescriptorProtos$DescriptorProto) this.instance).hasName();
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public boolean hasOptions() {
            return ((DescriptorProtos$DescriptorProto) this.instance).hasOptions();
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public boolean hasVisibility() {
            return ((DescriptorProtos$DescriptorProto) this.instance).hasVisibility();
        }

        public Builder mergeOptions(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).mergeOptions(descriptorProtos$MessageOptions);
            return this;
        }

        public Builder removeEnumType(int i11) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).removeEnumType(i11);
            return this;
        }

        public Builder removeExtension(int i11) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).removeExtension(i11);
            return this;
        }

        public Builder removeExtensionRange(int i11) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).removeExtensionRange(i11);
            return this;
        }

        public Builder removeField(int i11) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).removeField(i11);
            return this;
        }

        public Builder removeNestedType(int i11) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).removeNestedType(i11);
            return this;
        }

        public Builder removeOneofDecl(int i11) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).removeOneofDecl(i11);
            return this;
        }

        public Builder removeReservedRange(int i11) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).removeReservedRange(i11);
            return this;
        }

        public Builder setEnumType(int i11, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setEnumType(i11, descriptorProtos$EnumDescriptorProto);
            return this;
        }

        public Builder setExtension(int i11, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setExtension(i11, descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public Builder setExtensionRange(int i11, ExtensionRange extensionRange) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setExtensionRange(i11, extensionRange);
            return this;
        }

        public Builder setField(int i11, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setField(i11, descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setNestedType(int i11, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setNestedType(i11, descriptorProtos$DescriptorProto);
            return this;
        }

        public Builder setOneofDecl(int i11, DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setOneofDecl(i11, descriptorProtos$OneofDescriptorProto);
            return this;
        }

        public Builder setOptions(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setOptions(descriptorProtos$MessageOptions);
            return this;
        }

        public Builder setReservedName(int i11, String str) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setReservedName(i11, str);
            return this;
        }

        public Builder setReservedRange(int i11, ReservedRange reservedRange) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setReservedRange(i11, reservedRange);
            return this;
        }

        public Builder setVisibility(DescriptorProtos$SymbolVisibility descriptorProtos$SymbolVisibility) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setVisibility(descriptorProtos$SymbolVisibility);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$DescriptorProto.DEFAULT_INSTANCE);
        }

        public Builder addEnumType(int i11, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addEnumType(i11, descriptorProtos$EnumDescriptorProto);
            return this;
        }

        public Builder addExtension(int i11, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addExtension(i11, descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public Builder addExtensionRange(int i11, ExtensionRange extensionRange) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addExtensionRange(i11, extensionRange);
            return this;
        }

        public Builder addField(int i11, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addField(i11, descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public Builder addNestedType(int i11, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addNestedType(i11, descriptorProtos$DescriptorProto);
            return this;
        }

        public Builder addOneofDecl(int i11, DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addOneofDecl(i11, descriptorProtos$OneofDescriptorProto);
            return this;
        }

        public Builder addReservedRange(int i11, ReservedRange reservedRange) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addReservedRange(i11, reservedRange);
            return this;
        }

        public Builder setEnumType(int i11, DescriptorProtos$EnumDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setEnumType(i11, builder.build());
            return this;
        }

        public Builder setExtension(int i11, DescriptorProtos$FieldDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setExtension(i11, builder.build());
            return this;
        }

        public Builder setExtensionRange(int i11, ExtensionRange.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setExtensionRange(i11, builder.build());
            return this;
        }

        public Builder setField(int i11, DescriptorProtos$FieldDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setField(i11, builder.build());
            return this;
        }

        public Builder setNestedType(int i11, Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setNestedType(i11, builder.build());
            return this;
        }

        public Builder setOneofDecl(int i11, DescriptorProtos$OneofDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setOneofDecl(i11, builder.build());
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setOptions(DescriptorProtos$MessageOptions.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setOptions((DescriptorProtos$MessageOptions) builder.build());
            return this;
        }

        public Builder setReservedRange(int i11, ReservedRange.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setReservedRange(i11, builder.build());
            return this;
        }

        public Builder addEnumType(DescriptorProtos$EnumDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addEnumType(builder.build());
            return this;
        }

        public Builder addExtension(DescriptorProtos$FieldDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addExtension(builder.build());
            return this;
        }

        public Builder addExtensionRange(ExtensionRange.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addExtensionRange(builder.build());
            return this;
        }

        public Builder addField(DescriptorProtos$FieldDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addField(builder.build());
            return this;
        }

        public Builder addNestedType(Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addNestedType(builder.build());
            return this;
        }

        public Builder addOneofDecl(DescriptorProtos$OneofDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addOneofDecl(builder.build());
            return this;
        }

        public Builder addReservedRange(ReservedRange.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addReservedRange(builder.build());
            return this;
        }

        public Builder addEnumType(int i11, DescriptorProtos$EnumDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addEnumType(i11, builder.build());
            return this;
        }

        public Builder addExtension(int i11, DescriptorProtos$FieldDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addExtension(i11, builder.build());
            return this;
        }

        public Builder addExtensionRange(int i11, ExtensionRange.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addExtensionRange(i11, builder.build());
            return this;
        }

        public Builder addField(int i11, DescriptorProtos$FieldDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addField(i11, builder.build());
            return this;
        }

        public Builder addNestedType(int i11, Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addNestedType(i11, builder.build());
            return this;
        }

        public Builder addOneofDecl(int i11, DescriptorProtos$OneofDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addOneofDecl(i11, builder.build());
            return this;
        }

        public Builder addReservedRange(int i11, ReservedRange.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addReservedRange(i11, builder.build());
            return this;
        }
    }

    public static final class ExtensionRange extends GeneratedMessageLite<ExtensionRange, Builder> implements ExtensionRangeOrBuilder {
        private static final ExtensionRange DEFAULT_INSTANCE;
        public static final int END_FIELD_NUMBER = 2;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile E<ExtensionRange> PARSER = null;
        public static final int START_FIELD_NUMBER = 1;
        private int bitField0_;
        private int end_;
        private byte memoizedIsInitialized = 2;
        private DescriptorProtos$ExtensionRangeOptions options_;
        private int start_;

        public static final class Builder extends GeneratedMessageLite.Builder<ExtensionRange, Builder> implements ExtensionRangeOrBuilder {
            /* synthetic */ Builder(C5954e c5954e) {
                this();
            }

            public Builder clearEnd() {
                copyOnWrite();
                ((ExtensionRange) this.instance).clearEnd();
                return this;
            }

            public Builder clearOptions() {
                copyOnWrite();
                ((ExtensionRange) this.instance).clearOptions();
                return this;
            }

            public Builder clearStart() {
                copyOnWrite();
                ((ExtensionRange) this.instance).clearStart();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos$DescriptorProto.ExtensionRangeOrBuilder
            public int getEnd() {
                return ((ExtensionRange) this.instance).getEnd();
            }

            @Override // com.google.protobuf.DescriptorProtos$DescriptorProto.ExtensionRangeOrBuilder
            public DescriptorProtos$ExtensionRangeOptions getOptions() {
                return ((ExtensionRange) this.instance).getOptions();
            }

            @Override // com.google.protobuf.DescriptorProtos$DescriptorProto.ExtensionRangeOrBuilder
            public int getStart() {
                return ((ExtensionRange) this.instance).getStart();
            }

            @Override // com.google.protobuf.DescriptorProtos$DescriptorProto.ExtensionRangeOrBuilder
            public boolean hasEnd() {
                return ((ExtensionRange) this.instance).hasEnd();
            }

            @Override // com.google.protobuf.DescriptorProtos$DescriptorProto.ExtensionRangeOrBuilder
            public boolean hasOptions() {
                return ((ExtensionRange) this.instance).hasOptions();
            }

            @Override // com.google.protobuf.DescriptorProtos$DescriptorProto.ExtensionRangeOrBuilder
            public boolean hasStart() {
                return ((ExtensionRange) this.instance).hasStart();
            }

            public Builder mergeOptions(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
                copyOnWrite();
                ((ExtensionRange) this.instance).mergeOptions(descriptorProtos$ExtensionRangeOptions);
                return this;
            }

            public Builder setEnd(int i11) {
                copyOnWrite();
                ((ExtensionRange) this.instance).setEnd(i11);
                return this;
            }

            public Builder setOptions(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
                copyOnWrite();
                ((ExtensionRange) this.instance).setOptions(descriptorProtos$ExtensionRangeOptions);
                return this;
            }

            public Builder setStart(int i11) {
                copyOnWrite();
                ((ExtensionRange) this.instance).setStart(i11);
                return this;
            }

            private Builder() {
                super(ExtensionRange.DEFAULT_INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Builder setOptions(DescriptorProtos$ExtensionRangeOptions.Builder builder) {
                copyOnWrite();
                ((ExtensionRange) this.instance).setOptions((DescriptorProtos$ExtensionRangeOptions) builder.build());
                return this;
            }
        }

        static {
            ExtensionRange extensionRange = new ExtensionRange();
            DEFAULT_INSTANCE = extensionRange;
            GeneratedMessageLite.registerDefaultInstance(ExtensionRange.class, extensionRange);
        }

        private ExtensionRange() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnd() {
            this.bitField0_ &= -3;
            this.end_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStart() {
            this.bitField0_ &= -2;
            this.start_ = 0;
        }

        public static ExtensionRange getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
            descriptorProtos$ExtensionRangeOptions.getClass();
            DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions2 = this.options_;
            if (descriptorProtos$ExtensionRangeOptions2 == null || descriptorProtos$ExtensionRangeOptions2 == DescriptorProtos$ExtensionRangeOptions.getDefaultInstance()) {
                this.options_ = descriptorProtos$ExtensionRangeOptions;
            } else {
                this.options_ = ((DescriptorProtos$ExtensionRangeOptions.Builder) DescriptorProtos$ExtensionRangeOptions.newBuilder(this.options_).mergeFrom((DescriptorProtos$ExtensionRangeOptions.Builder) descriptorProtos$ExtensionRangeOptions)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ExtensionRange parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ExtensionRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExtensionRange parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static E<ExtensionRange> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnd(int i11) {
            this.bitField0_ |= 2;
            this.end_ = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
            descriptorProtos$ExtensionRangeOptions.getClass();
            this.options_ = descriptorProtos$ExtensionRangeOptions;
            this.bitField0_ |= 4;
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
                    return new ExtensionRange();
                case 2:
                    return new Builder(c5954e);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001င\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "start_", "end_", "options_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    E<ExtensionRange> e12 = PARSER;
                    if (e12 != null) {
                        return e12;
                    }
                    synchronized (ExtensionRange.class) {
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

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProto.ExtensionRangeOrBuilder
        public int getEnd() {
            return this.end_;
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProto.ExtensionRangeOrBuilder
        public DescriptorProtos$ExtensionRangeOptions getOptions() {
            DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions = this.options_;
            return descriptorProtos$ExtensionRangeOptions == null ? DescriptorProtos$ExtensionRangeOptions.getDefaultInstance() : descriptorProtos$ExtensionRangeOptions;
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProto.ExtensionRangeOrBuilder
        public int getStart() {
            return this.start_;
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProto.ExtensionRangeOrBuilder
        public boolean hasEnd() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProto.ExtensionRangeOrBuilder
        public boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProto.ExtensionRangeOrBuilder
        public boolean hasStart() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(ExtensionRange extensionRange) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(extensionRange);
        }

        public static ExtensionRange parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
            return (ExtensionRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
        }

        public static ExtensionRange parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
            return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
        }

        public static ExtensionRange parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ExtensionRange parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
            return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
        }

        public static ExtensionRange parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExtensionRange parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
            return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
        }

        public static ExtensionRange parseFrom(InputStream inputStream) throws IOException {
            return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExtensionRange parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
            return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
        }

        public static ExtensionRange parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ExtensionRange parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
            return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
        }
    }

    public interface ExtensionRangeOrBuilder extends A {
        /* synthetic */ MessageLite getDefaultInstanceForType();

        int getEnd();

        DescriptorProtos$ExtensionRangeOptions getOptions();

        int getStart();

        boolean hasEnd();

        boolean hasOptions();

        boolean hasStart();

        @Override // com.google.protobuf.A
        /* synthetic */ boolean isInitialized();
    }

    public static final class ReservedRange extends GeneratedMessageLite<ReservedRange, Builder> implements ReservedRangeOrBuilder {
        private static final ReservedRange DEFAULT_INSTANCE;
        public static final int END_FIELD_NUMBER = 2;
        private static volatile E<ReservedRange> PARSER = null;
        public static final int START_FIELD_NUMBER = 1;
        private int bitField0_;
        private int end_;
        private int start_;

        public static final class Builder extends GeneratedMessageLite.Builder<ReservedRange, Builder> implements ReservedRangeOrBuilder {
            /* synthetic */ Builder(C5954e c5954e) {
                this();
            }

            public Builder clearEnd() {
                copyOnWrite();
                ((ReservedRange) this.instance).clearEnd();
                return this;
            }

            public Builder clearStart() {
                copyOnWrite();
                ((ReservedRange) this.instance).clearStart();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos$DescriptorProto.ReservedRangeOrBuilder
            public int getEnd() {
                return ((ReservedRange) this.instance).getEnd();
            }

            @Override // com.google.protobuf.DescriptorProtos$DescriptorProto.ReservedRangeOrBuilder
            public int getStart() {
                return ((ReservedRange) this.instance).getStart();
            }

            @Override // com.google.protobuf.DescriptorProtos$DescriptorProto.ReservedRangeOrBuilder
            public boolean hasEnd() {
                return ((ReservedRange) this.instance).hasEnd();
            }

            @Override // com.google.protobuf.DescriptorProtos$DescriptorProto.ReservedRangeOrBuilder
            public boolean hasStart() {
                return ((ReservedRange) this.instance).hasStart();
            }

            public Builder setEnd(int i11) {
                copyOnWrite();
                ((ReservedRange) this.instance).setEnd(i11);
                return this;
            }

            public Builder setStart(int i11) {
                copyOnWrite();
                ((ReservedRange) this.instance).setStart(i11);
                return this;
            }

            private Builder() {
                super(ReservedRange.DEFAULT_INSTANCE);
            }
        }

        static {
            ReservedRange reservedRange = new ReservedRange();
            DEFAULT_INSTANCE = reservedRange;
            GeneratedMessageLite.registerDefaultInstance(ReservedRange.class, reservedRange);
        }

        private ReservedRange() {
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

        public static ReservedRange getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ReservedRange parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ReservedRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReservedRange parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static E<ReservedRange> parser() {
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
                    return new ReservedRange();
                case 2:
                    return new Builder(c5954e);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "start_", "end_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    E<ReservedRange> e12 = PARSER;
                    if (e12 != null) {
                        return e12;
                    }
                    synchronized (ReservedRange.class) {
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

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProto.ReservedRangeOrBuilder
        public int getEnd() {
            return this.end_;
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProto.ReservedRangeOrBuilder
        public int getStart() {
            return this.start_;
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProto.ReservedRangeOrBuilder
        public boolean hasEnd() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos$DescriptorProto.ReservedRangeOrBuilder
        public boolean hasStart() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(ReservedRange reservedRange) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(reservedRange);
        }

        public static ReservedRange parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
            return (ReservedRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
        }

        public static ReservedRange parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
            return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
        }

        public static ReservedRange parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ReservedRange parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
            return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
        }

        public static ReservedRange parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ReservedRange parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
            return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
        }

        public static ReservedRange parseFrom(InputStream inputStream) throws IOException {
            return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReservedRange parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
            return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
        }

        public static ReservedRange parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ReservedRange parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
            return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
        }
    }

    public interface ReservedRangeOrBuilder extends A {
        /* synthetic */ MessageLite getDefaultInstanceForType();

        int getEnd();

        int getStart();

        boolean hasEnd();

        boolean hasStart();

        @Override // com.google.protobuf.A
        /* synthetic */ boolean isInitialized();
    }

    static {
        DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = new DescriptorProtos$DescriptorProto();
        DEFAULT_INSTANCE = descriptorProtos$DescriptorProto;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$DescriptorProto.class, descriptorProtos$DescriptorProto);
    }

    private DescriptorProtos$DescriptorProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEnumType(Iterable<? extends DescriptorProtos$EnumDescriptorProto> iterable) {
        ensureEnumTypeIsMutable();
        AbstractMessageLite.addAll(iterable, this.enumType_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExtension(Iterable<? extends DescriptorProtos$FieldDescriptorProto> iterable) {
        ensureExtensionIsMutable();
        AbstractMessageLite.addAll(iterable, this.extension_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExtensionRange(Iterable<? extends ExtensionRange> iterable) {
        ensureExtensionRangeIsMutable();
        AbstractMessageLite.addAll(iterable, this.extensionRange_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllField(Iterable<? extends DescriptorProtos$FieldDescriptorProto> iterable) {
        ensureFieldIsMutable();
        AbstractMessageLite.addAll(iterable, this.field_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNestedType(Iterable<? extends DescriptorProtos$DescriptorProto> iterable) {
        ensureNestedTypeIsMutable();
        AbstractMessageLite.addAll(iterable, this.nestedType_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOneofDecl(Iterable<? extends DescriptorProtos$OneofDescriptorProto> iterable) {
        ensureOneofDeclIsMutable();
        AbstractMessageLite.addAll(iterable, this.oneofDecl_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllReservedName(Iterable<String> iterable) {
        ensureReservedNameIsMutable();
        AbstractMessageLite.addAll(iterable, this.reservedName_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllReservedRange(Iterable<? extends ReservedRange> iterable) {
        ensureReservedRangeIsMutable();
        AbstractMessageLite.addAll(iterable, this.reservedRange_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnumType(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        descriptorProtos$EnumDescriptorProto.getClass();
        ensureEnumTypeIsMutable();
        this.enumType_.add(descriptorProtos$EnumDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtension(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        ensureExtensionIsMutable();
        this.extension_.add(descriptorProtos$FieldDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtensionRange(ExtensionRange extensionRange) {
        extensionRange.getClass();
        ensureExtensionRangeIsMutable();
        this.extensionRange_.add(extensionRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addField(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        ensureFieldIsMutable();
        this.field_.add(descriptorProtos$FieldDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNestedType(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.getClass();
        ensureNestedTypeIsMutable();
        this.nestedType_.add(descriptorProtos$DescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOneofDecl(DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
        descriptorProtos$OneofDescriptorProto.getClass();
        ensureOneofDeclIsMutable();
        this.oneofDecl_.add(descriptorProtos$OneofDescriptorProto);
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
    public void addReservedRange(ReservedRange reservedRange) {
        reservedRange.getClass();
        ensureReservedRangeIsMutable();
        this.reservedRange_.add(reservedRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnumType() {
        this.enumType_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtension() {
        this.extension_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtensionRange() {
        this.extensionRange_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearField() {
        this.field_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNestedType() {
        this.nestedType_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOneofDecl() {
        this.oneofDecl_ = GeneratedMessageLite.emptyProtobufList();
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
    public void clearVisibility() {
        this.bitField0_ &= -5;
        this.visibility_ = 0;
    }

    private void ensureEnumTypeIsMutable() {
        Internal.e<DescriptorProtos$EnumDescriptorProto> eVar = this.enumType_;
        if (eVar.isModifiable()) {
            return;
        }
        this.enumType_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    private void ensureExtensionIsMutable() {
        Internal.e<DescriptorProtos$FieldDescriptorProto> eVar = this.extension_;
        if (eVar.isModifiable()) {
            return;
        }
        this.extension_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    private void ensureExtensionRangeIsMutable() {
        Internal.e<ExtensionRange> eVar = this.extensionRange_;
        if (eVar.isModifiable()) {
            return;
        }
        this.extensionRange_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    private void ensureFieldIsMutable() {
        Internal.e<DescriptorProtos$FieldDescriptorProto> eVar = this.field_;
        if (eVar.isModifiable()) {
            return;
        }
        this.field_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    private void ensureNestedTypeIsMutable() {
        Internal.e<DescriptorProtos$DescriptorProto> eVar = this.nestedType_;
        if (eVar.isModifiable()) {
            return;
        }
        this.nestedType_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    private void ensureOneofDeclIsMutable() {
        Internal.e<DescriptorProtos$OneofDescriptorProto> eVar = this.oneofDecl_;
        if (eVar.isModifiable()) {
            return;
        }
        this.oneofDecl_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    private void ensureReservedNameIsMutable() {
        Internal.e<String> eVar = this.reservedName_;
        if (eVar.isModifiable()) {
            return;
        }
        this.reservedName_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    private void ensureReservedRangeIsMutable() {
        Internal.e<ReservedRange> eVar = this.reservedRange_;
        if (eVar.isModifiable()) {
            return;
        }
        this.reservedRange_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    public static DescriptorProtos$DescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeOptions(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
        descriptorProtos$MessageOptions.getClass();
        DescriptorProtos$MessageOptions descriptorProtos$MessageOptions2 = this.options_;
        if (descriptorProtos$MessageOptions2 == null || descriptorProtos$MessageOptions2 == DescriptorProtos$MessageOptions.getDefaultInstance()) {
            this.options_ = descriptorProtos$MessageOptions;
        } else {
            this.options_ = ((DescriptorProtos$MessageOptions.Builder) DescriptorProtos$MessageOptions.newBuilder(this.options_).mergeFrom((DescriptorProtos$MessageOptions.Builder) descriptorProtos$MessageOptions)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$DescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<DescriptorProtos$DescriptorProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEnumType(int i11) {
        ensureEnumTypeIsMutable();
        this.enumType_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExtension(int i11) {
        ensureExtensionIsMutable();
        this.extension_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExtensionRange(int i11) {
        ensureExtensionRangeIsMutable();
        this.extensionRange_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeField(int i11) {
        ensureFieldIsMutable();
        this.field_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeNestedType(int i11) {
        ensureNestedTypeIsMutable();
        this.nestedType_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOneofDecl(int i11) {
        ensureOneofDeclIsMutable();
        this.oneofDecl_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeReservedRange(int i11) {
        ensureReservedRangeIsMutable();
        this.reservedRange_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnumType(int i11, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        descriptorProtos$EnumDescriptorProto.getClass();
        ensureEnumTypeIsMutable();
        this.enumType_.set(i11, descriptorProtos$EnumDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtension(int i11, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        ensureExtensionIsMutable();
        this.extension_.set(i11, descriptorProtos$FieldDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtensionRange(int i11, ExtensionRange extensionRange) {
        extensionRange.getClass();
        ensureExtensionRangeIsMutable();
        this.extensionRange_.set(i11, extensionRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setField(int i11, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        ensureFieldIsMutable();
        this.field_.set(i11, descriptorProtos$FieldDescriptorProto);
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
    public void setNestedType(int i11, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.getClass();
        ensureNestedTypeIsMutable();
        this.nestedType_.set(i11, descriptorProtos$DescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOneofDecl(int i11, DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
        descriptorProtos$OneofDescriptorProto.getClass();
        ensureOneofDeclIsMutable();
        this.oneofDecl_.set(i11, descriptorProtos$OneofDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
        descriptorProtos$MessageOptions.getClass();
        this.options_ = descriptorProtos$MessageOptions;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReservedName(int i11, String str) {
        str.getClass();
        ensureReservedNameIsMutable();
        this.reservedName_.set(i11, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReservedRange(int i11, ReservedRange reservedRange) {
        reservedRange.getClass();
        ensureReservedRangeIsMutable();
        this.reservedRange_.set(i11, reservedRange);
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
                return new DescriptorProtos$DescriptorProto();
            case 2:
                return new Builder(c5954e);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\b\u0007\u0001ဈ\u0000\u0002Л\u0003Л\u0004Л\u0005Л\u0006Л\u0007ᐉ\u0001\bЛ\t\u001b\n\u001a\u000b᠌\u0002", new Object[]{"bitField0_", "name_", "field_", DescriptorProtos$FieldDescriptorProto.class, "nestedType_", DescriptorProtos$DescriptorProto.class, "enumType_", DescriptorProtos$EnumDescriptorProto.class, "extensionRange_", ExtensionRange.class, "extension_", DescriptorProtos$FieldDescriptorProto.class, "options_", "oneofDecl_", DescriptorProtos$OneofDescriptorProto.class, "reservedRange_", ReservedRange.class, "reservedName_", "visibility_", DescriptorProtos$SymbolVisibility.internalGetVerifier()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<DescriptorProtos$DescriptorProto> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (DescriptorProtos$DescriptorProto.class) {
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

    @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public DescriptorProtos$EnumDescriptorProto getEnumType(int i11) {
        return this.enumType_.get(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public int getEnumTypeCount() {
        return this.enumType_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList() {
        return this.enumType_;
    }

    public DescriptorProtos$EnumDescriptorProtoOrBuilder getEnumTypeOrBuilder(int i11) {
        return this.enumType_.get(i11);
    }

    public List<? extends DescriptorProtos$EnumDescriptorProtoOrBuilder> getEnumTypeOrBuilderList() {
        return this.enumType_;
    }

    @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public DescriptorProtos$FieldDescriptorProto getExtension(int i11) {
        return this.extension_.get(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public int getExtensionCount() {
        return this.extension_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public List<DescriptorProtos$FieldDescriptorProto> getExtensionList() {
        return this.extension_;
    }

    public DescriptorProtos$FieldDescriptorProtoOrBuilder getExtensionOrBuilder(int i11) {
        return this.extension_.get(i11);
    }

    public List<? extends DescriptorProtos$FieldDescriptorProtoOrBuilder> getExtensionOrBuilderList() {
        return this.extension_;
    }

    @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public ExtensionRange getExtensionRange(int i11) {
        return this.extensionRange_.get(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public int getExtensionRangeCount() {
        return this.extensionRange_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public List<ExtensionRange> getExtensionRangeList() {
        return this.extensionRange_;
    }

    public ExtensionRangeOrBuilder getExtensionRangeOrBuilder(int i11) {
        return this.extensionRange_.get(i11);
    }

    public List<? extends ExtensionRangeOrBuilder> getExtensionRangeOrBuilderList() {
        return this.extensionRange_;
    }

    @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public DescriptorProtos$FieldDescriptorProto getField(int i11) {
        return this.field_.get(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public int getFieldCount() {
        return this.field_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public List<DescriptorProtos$FieldDescriptorProto> getFieldList() {
        return this.field_;
    }

    public DescriptorProtos$FieldDescriptorProtoOrBuilder getFieldOrBuilder(int i11) {
        return this.field_.get(i11);
    }

    public List<? extends DescriptorProtos$FieldDescriptorProtoOrBuilder> getFieldOrBuilderList() {
        return this.field_;
    }

    @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public DescriptorProtos$DescriptorProto getNestedType(int i11) {
        return this.nestedType_.get(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public int getNestedTypeCount() {
        return this.nestedType_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public List<DescriptorProtos$DescriptorProto> getNestedTypeList() {
        return this.nestedType_;
    }

    public DescriptorProtos$DescriptorProtoOrBuilder getNestedTypeOrBuilder(int i11) {
        return this.nestedType_.get(i11);
    }

    public List<? extends DescriptorProtos$DescriptorProtoOrBuilder> getNestedTypeOrBuilderList() {
        return this.nestedType_;
    }

    @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public DescriptorProtos$OneofDescriptorProto getOneofDecl(int i11) {
        return this.oneofDecl_.get(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public int getOneofDeclCount() {
        return this.oneofDecl_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public List<DescriptorProtos$OneofDescriptorProto> getOneofDeclList() {
        return this.oneofDecl_;
    }

    public DescriptorProtos$OneofDescriptorProtoOrBuilder getOneofDeclOrBuilder(int i11) {
        return this.oneofDecl_.get(i11);
    }

    public List<? extends DescriptorProtos$OneofDescriptorProtoOrBuilder> getOneofDeclOrBuilderList() {
        return this.oneofDecl_;
    }

    @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public DescriptorProtos$MessageOptions getOptions() {
        DescriptorProtos$MessageOptions descriptorProtos$MessageOptions = this.options_;
        return descriptorProtos$MessageOptions == null ? DescriptorProtos$MessageOptions.getDefaultInstance() : descriptorProtos$MessageOptions;
    }

    @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public String getReservedName(int i11) {
        return this.reservedName_.get(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public ByteString getReservedNameBytes(int i11) {
        return ByteString.copyFromUtf8(this.reservedName_.get(i11));
    }

    @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public int getReservedNameCount() {
        return this.reservedName_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public List<String> getReservedNameList() {
        return this.reservedName_;
    }

    @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public ReservedRange getReservedRange(int i11) {
        return this.reservedRange_.get(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public int getReservedRangeCount() {
        return this.reservedRange_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public List<ReservedRange> getReservedRangeList() {
        return this.reservedRange_;
    }

    public ReservedRangeOrBuilder getReservedRangeOrBuilder(int i11) {
        return this.reservedRange_.get(i11);
    }

    public List<? extends ReservedRangeOrBuilder> getReservedRangeOrBuilderList() {
        return this.reservedRange_;
    }

    @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public DescriptorProtos$SymbolVisibility getVisibility() {
        DescriptorProtos$SymbolVisibility forNumber = DescriptorProtos$SymbolVisibility.forNumber(this.visibility_);
        return forNumber == null ? DescriptorProtos$SymbolVisibility.VISIBILITY_UNSET : forNumber;
    }

    @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public boolean hasOptions() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public boolean hasVisibility() {
        return (this.bitField0_ & 4) != 0;
    }

    public static Builder newBuilder(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(descriptorProtos$DescriptorProto);
    }

    public static DescriptorProtos$DescriptorProto parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnumType(int i11, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        descriptorProtos$EnumDescriptorProto.getClass();
        ensureEnumTypeIsMutable();
        this.enumType_.add(i11, descriptorProtos$EnumDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtension(int i11, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        ensureExtensionIsMutable();
        this.extension_.add(i11, descriptorProtos$FieldDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtensionRange(int i11, ExtensionRange extensionRange) {
        extensionRange.getClass();
        ensureExtensionRangeIsMutable();
        this.extensionRange_.add(i11, extensionRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addField(int i11, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        ensureFieldIsMutable();
        this.field_.add(i11, descriptorProtos$FieldDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNestedType(int i11, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.getClass();
        ensureNestedTypeIsMutable();
        this.nestedType_.add(i11, descriptorProtos$DescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOneofDecl(int i11, DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
        descriptorProtos$OneofDescriptorProto.getClass();
        ensureOneofDeclIsMutable();
        this.oneofDecl_.add(i11, descriptorProtos$OneofDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReservedRange(int i11, ReservedRange reservedRange) {
        reservedRange.getClass();
        ensureReservedRangeIsMutable();
        this.reservedRange_.add(i11, reservedRange);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}
