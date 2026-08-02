package com.google.protobuf;

/* loaded from: classes9.dex */
public interface DescriptorProtos$MethodDescriptorProtoOrBuilder extends A {
    boolean getClientStreaming();

    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getInputType();

    ByteString getInputTypeBytes();

    String getName();

    ByteString getNameBytes();

    DescriptorProtos$MethodOptions getOptions();

    String getOutputType();

    ByteString getOutputTypeBytes();

    boolean getServerStreaming();

    boolean hasClientStreaming();

    boolean hasInputType();

    boolean hasName();

    boolean hasOptions();

    boolean hasOutputType();

    boolean hasServerStreaming();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
