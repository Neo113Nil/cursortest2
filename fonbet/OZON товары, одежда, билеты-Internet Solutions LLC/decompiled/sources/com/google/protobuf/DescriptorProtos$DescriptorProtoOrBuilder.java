package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$DescriptorProto;
import java.util.List;

/* loaded from: classes9.dex */
public interface DescriptorProtos$DescriptorProtoOrBuilder extends A {
    /* synthetic */ MessageLite getDefaultInstanceForType();

    DescriptorProtos$EnumDescriptorProto getEnumType(int i11);

    int getEnumTypeCount();

    List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList();

    DescriptorProtos$FieldDescriptorProto getExtension(int i11);

    int getExtensionCount();

    List<DescriptorProtos$FieldDescriptorProto> getExtensionList();

    DescriptorProtos$DescriptorProto.ExtensionRange getExtensionRange(int i11);

    int getExtensionRangeCount();

    List<DescriptorProtos$DescriptorProto.ExtensionRange> getExtensionRangeList();

    DescriptorProtos$FieldDescriptorProto getField(int i11);

    int getFieldCount();

    List<DescriptorProtos$FieldDescriptorProto> getFieldList();

    String getName();

    ByteString getNameBytes();

    DescriptorProtos$DescriptorProto getNestedType(int i11);

    int getNestedTypeCount();

    List<DescriptorProtos$DescriptorProto> getNestedTypeList();

    DescriptorProtos$OneofDescriptorProto getOneofDecl(int i11);

    int getOneofDeclCount();

    List<DescriptorProtos$OneofDescriptorProto> getOneofDeclList();

    DescriptorProtos$MessageOptions getOptions();

    String getReservedName(int i11);

    ByteString getReservedNameBytes(int i11);

    int getReservedNameCount();

    List<String> getReservedNameList();

    DescriptorProtos$DescriptorProto.ReservedRange getReservedRange(int i11);

    int getReservedRangeCount();

    List<DescriptorProtos$DescriptorProto.ReservedRange> getReservedRangeList();

    DescriptorProtos$SymbolVisibility getVisibility();

    boolean hasName();

    boolean hasOptions();

    boolean hasVisibility();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
