package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$ServiceOptions;
import com.google.protobuf.GeneratedMessageLite;
import java.util.List;

/* loaded from: classes9.dex */
public interface DescriptorProtos$ServiceOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<DescriptorProtos$ServiceOptions, DescriptorProtos$ServiceOptions.Builder> {
    @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    boolean getDeprecated();

    DescriptorProtos$FeatureSet getFeatures();

    DescriptorProtos$UninterpretedOption getUninterpretedOption(int i11);

    int getUninterpretedOptionCount();

    List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList();

    boolean hasDeprecated();

    boolean hasFeatures();

    @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder, com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
