package com.google.protobuf;

import java.util.List;

/* loaded from: classes9.dex */
public interface DescriptorProtos$ServiceDescriptorProtoOrBuilder extends A {
    /* synthetic */ MessageLite getDefaultInstanceForType();

    DescriptorProtos$MethodDescriptorProto getMethod(int i11);

    int getMethodCount();

    List<DescriptorProtos$MethodDescriptorProto> getMethodList();

    String getName();

    ByteString getNameBytes();

    DescriptorProtos$ServiceOptions getOptions();

    boolean hasName();

    boolean hasOptions();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
