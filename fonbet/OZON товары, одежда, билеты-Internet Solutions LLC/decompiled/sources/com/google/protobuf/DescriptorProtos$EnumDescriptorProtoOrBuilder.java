package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$EnumDescriptorProto;
import java.util.List;

/* loaded from: classes9.dex */
public interface DescriptorProtos$EnumDescriptorProtoOrBuilder extends A {
    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getName();

    ByteString getNameBytes();

    DescriptorProtos$EnumOptions getOptions();

    String getReservedName(int i11);

    ByteString getReservedNameBytes(int i11);

    int getReservedNameCount();

    List<String> getReservedNameList();

    DescriptorProtos$EnumDescriptorProto.EnumReservedRange getReservedRange(int i11);

    int getReservedRangeCount();

    List<DescriptorProtos$EnumDescriptorProto.EnumReservedRange> getReservedRangeList();

    DescriptorProtos$EnumValueDescriptorProto getValue(int i11);

    int getValueCount();

    List<DescriptorProtos$EnumValueDescriptorProto> getValueList();

    DescriptorProtos$SymbolVisibility getVisibility();

    boolean hasName();

    boolean hasOptions();

    boolean hasVisibility();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
