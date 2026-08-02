package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FieldOptions;
import com.google.protobuf.GeneratedMessageLite;
import java.util.List;

/* loaded from: classes9.dex */
public interface DescriptorProtos$FieldOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<DescriptorProtos$FieldOptions, DescriptorProtos$FieldOptions.Builder> {
    DescriptorProtos$FieldOptions.CType getCtype();

    boolean getDebugRedact();

    @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    boolean getDeprecated();

    DescriptorProtos$FieldOptions.EditionDefault getEditionDefaults(int i11);

    int getEditionDefaultsCount();

    List<DescriptorProtos$FieldOptions.EditionDefault> getEditionDefaultsList();

    DescriptorProtos$FieldOptions.FeatureSupport getFeatureSupport();

    DescriptorProtos$FeatureSet getFeatures();

    DescriptorProtos$FieldOptions.JSType getJstype();

    boolean getLazy();

    boolean getPacked();

    DescriptorProtos$FieldOptions.OptionRetention getRetention();

    DescriptorProtos$FieldOptions.OptionTargetType getTargets(int i11);

    int getTargetsCount();

    List<DescriptorProtos$FieldOptions.OptionTargetType> getTargetsList();

    DescriptorProtos$UninterpretedOption getUninterpretedOption(int i11);

    int getUninterpretedOptionCount();

    List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList();

    boolean getUnverifiedLazy();

    @Deprecated
    boolean getWeak();

    boolean hasCtype();

    boolean hasDebugRedact();

    boolean hasDeprecated();

    boolean hasFeatureSupport();

    boolean hasFeatures();

    boolean hasJstype();

    boolean hasLazy();

    boolean hasPacked();

    boolean hasRetention();

    boolean hasUnverifiedLazy();

    @Deprecated
    boolean hasWeak();

    @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder, com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
