package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.google.protobuf.GeneratedMessageLite;
import java.util.List;

/* loaded from: classes9.dex */
public interface DescriptorProtos$MethodOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<DescriptorProtos$MethodOptions, DescriptorProtos$MethodOptions.Builder> {
    @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    boolean getDeprecated();

    DescriptorProtos$FeatureSet getFeatures();

    DescriptorProtos$MethodOptions.IdempotencyLevel getIdempotencyLevel();

    DescriptorProtos$UninterpretedOption getUninterpretedOption(int i11);

    int getUninterpretedOptionCount();

    List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList();

    boolean hasDeprecated();

    boolean hasFeatures();

    boolean hasIdempotencyLevel();

    @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder, com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
