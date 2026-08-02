package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$ExtensionRangeOptions;
import com.google.protobuf.GeneratedMessageLite;
import java.util.List;

/* loaded from: classes9.dex */
public interface DescriptorProtos$ExtensionRangeOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<DescriptorProtos$ExtensionRangeOptions, DescriptorProtos$ExtensionRangeOptions.Builder> {
    DescriptorProtos$ExtensionRangeOptions.Declaration getDeclaration(int i11);

    int getDeclarationCount();

    List<DescriptorProtos$ExtensionRangeOptions.Declaration> getDeclarationList();

    @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    DescriptorProtos$FeatureSet getFeatures();

    DescriptorProtos$UninterpretedOption getUninterpretedOption(int i11);

    int getUninterpretedOptionCount();

    List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList();

    DescriptorProtos$ExtensionRangeOptions.VerificationState getVerification();

    boolean hasFeatures();

    boolean hasVerification();

    @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder, com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
