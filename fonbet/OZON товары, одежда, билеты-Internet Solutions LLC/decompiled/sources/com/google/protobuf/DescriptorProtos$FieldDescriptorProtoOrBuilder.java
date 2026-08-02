package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FieldDescriptorProto;

/* loaded from: classes9.dex */
public interface DescriptorProtos$FieldDescriptorProtoOrBuilder extends A {
    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getDefaultValue();

    ByteString getDefaultValueBytes();

    String getExtendee();

    ByteString getExtendeeBytes();

    String getJsonName();

    ByteString getJsonNameBytes();

    DescriptorProtos$FieldDescriptorProto.Label getLabel();

    String getName();

    ByteString getNameBytes();

    int getNumber();

    int getOneofIndex();

    DescriptorProtos$FieldOptions getOptions();

    boolean getProto3Optional();

    DescriptorProtos$FieldDescriptorProto.Type getType();

    String getTypeName();

    ByteString getTypeNameBytes();

    boolean hasDefaultValue();

    boolean hasExtendee();

    boolean hasJsonName();

    boolean hasLabel();

    boolean hasName();

    boolean hasNumber();

    boolean hasOneofIndex();

    boolean hasOptions();

    boolean hasProto3Optional();

    boolean hasType();

    boolean hasTypeName();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
