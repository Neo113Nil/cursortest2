package com.google.protobuf;

import java.util.List;

/* loaded from: classes9.dex */
public interface DescriptorProtos$FileDescriptorProtoOrBuilder extends A {
    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getDependency(int i11);

    ByteString getDependencyBytes(int i11);

    int getDependencyCount();

    List<String> getDependencyList();

    DescriptorProtos$Edition getEdition();

    DescriptorProtos$EnumDescriptorProto getEnumType(int i11);

    int getEnumTypeCount();

    List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList();

    DescriptorProtos$FieldDescriptorProto getExtension(int i11);

    int getExtensionCount();

    List<DescriptorProtos$FieldDescriptorProto> getExtensionList();

    DescriptorProtos$DescriptorProto getMessageType(int i11);

    int getMessageTypeCount();

    List<DescriptorProtos$DescriptorProto> getMessageTypeList();

    String getName();

    ByteString getNameBytes();

    String getOptionDependency(int i11);

    ByteString getOptionDependencyBytes(int i11);

    int getOptionDependencyCount();

    List<String> getOptionDependencyList();

    DescriptorProtos$FileOptions getOptions();

    String getPackage();

    ByteString getPackageBytes();

    int getPublicDependency(int i11);

    int getPublicDependencyCount();

    List<Integer> getPublicDependencyList();

    DescriptorProtos$ServiceDescriptorProto getService(int i11);

    int getServiceCount();

    List<DescriptorProtos$ServiceDescriptorProto> getServiceList();

    DescriptorProtos$SourceCodeInfo getSourceCodeInfo();

    String getSyntax();

    ByteString getSyntaxBytes();

    int getWeakDependency(int i11);

    int getWeakDependencyCount();

    List<Integer> getWeakDependencyList();

    boolean hasEdition();

    boolean hasName();

    boolean hasOptions();

    boolean hasPackage();

    boolean hasSourceCodeInfo();

    boolean hasSyntax();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
