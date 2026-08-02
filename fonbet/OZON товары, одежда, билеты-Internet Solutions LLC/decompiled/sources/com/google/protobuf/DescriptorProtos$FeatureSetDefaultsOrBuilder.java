package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FeatureSetDefaults;
import java.util.List;

/* loaded from: classes9.dex */
public interface DescriptorProtos$FeatureSetDefaultsOrBuilder extends A {
    /* synthetic */ MessageLite getDefaultInstanceForType();

    DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefault getDefaults(int i11);

    int getDefaultsCount();

    List<DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefault> getDefaultsList();

    DescriptorProtos$Edition getMaximumEdition();

    DescriptorProtos$Edition getMinimumEdition();

    boolean hasMaximumEdition();

    boolean hasMinimumEdition();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
