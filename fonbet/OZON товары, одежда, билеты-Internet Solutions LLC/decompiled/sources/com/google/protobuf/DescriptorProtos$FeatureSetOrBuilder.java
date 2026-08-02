package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FeatureSet;
import com.google.protobuf.GeneratedMessageLite;

/* loaded from: classes9.dex */
public interface DescriptorProtos$FeatureSetOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<DescriptorProtos$FeatureSet, DescriptorProtos$FeatureSet.Builder> {
    @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    DescriptorProtos$FeatureSet.VisibilityFeature.DefaultSymbolVisibility getDefaultSymbolVisibility();

    DescriptorProtos$FeatureSet.EnforceNamingStyle getEnforceNamingStyle();

    DescriptorProtos$FeatureSet.EnumType getEnumType();

    DescriptorProtos$FeatureSet.FieldPresence getFieldPresence();

    DescriptorProtos$FeatureSet.JsonFormat getJsonFormat();

    DescriptorProtos$FeatureSet.MessageEncoding getMessageEncoding();

    DescriptorProtos$FeatureSet.RepeatedFieldEncoding getRepeatedFieldEncoding();

    DescriptorProtos$FeatureSet.Utf8Validation getUtf8Validation();

    boolean hasDefaultSymbolVisibility();

    boolean hasEnforceNamingStyle();

    boolean hasEnumType();

    boolean hasFieldPresence();

    boolean hasJsonFormat();

    boolean hasMessageEncoding();

    boolean hasRepeatedFieldEncoding();

    boolean hasUtf8Validation();

    @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder, com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
