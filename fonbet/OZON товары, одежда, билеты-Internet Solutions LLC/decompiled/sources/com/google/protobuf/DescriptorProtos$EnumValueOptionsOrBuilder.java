package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$EnumValueOptions;
import com.google.protobuf.DescriptorProtos$FieldOptions;
import com.google.protobuf.GeneratedMessageLite;
import java.util.List;

/* loaded from: classes9.dex */
public interface DescriptorProtos$EnumValueOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<DescriptorProtos$EnumValueOptions, DescriptorProtos$EnumValueOptions.Builder> {
    boolean getDebugRedact();

    @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    boolean getDeprecated();

    DescriptorProtos$FieldOptions.FeatureSupport getFeatureSupport();

    DescriptorProtos$FeatureSet getFeatures();

    DescriptorProtos$UninterpretedOption getUninterpretedOption(int i11);

    int getUninterpretedOptionCount();

    List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList();

    boolean hasDebugRedact();

    boolean hasDeprecated();

    boolean hasFeatureSupport();

    boolean hasFeatures();

    @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder, com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
