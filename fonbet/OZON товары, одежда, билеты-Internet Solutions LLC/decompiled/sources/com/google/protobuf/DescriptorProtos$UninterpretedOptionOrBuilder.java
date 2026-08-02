package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import java.util.List;

/* loaded from: classes9.dex */
public interface DescriptorProtos$UninterpretedOptionOrBuilder extends A {
    String getAggregateValue();

    ByteString getAggregateValueBytes();

    /* synthetic */ MessageLite getDefaultInstanceForType();

    double getDoubleValue();

    String getIdentifierValue();

    ByteString getIdentifierValueBytes();

    DescriptorProtos$UninterpretedOption.NamePart getName(int i11);

    int getNameCount();

    List<DescriptorProtos$UninterpretedOption.NamePart> getNameList();

    long getNegativeIntValue();

    long getPositiveIntValue();

    ByteString getStringValue();

    boolean hasAggregateValue();

    boolean hasDoubleValue();

    boolean hasIdentifierValue();

    boolean hasNegativeIntValue();

    boolean hasPositiveIntValue();

    boolean hasStringValue();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
