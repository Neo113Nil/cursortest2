package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$SourceCodeInfo;
import com.google.protobuf.GeneratedMessageLite;
import java.util.List;

/* loaded from: classes9.dex */
public interface DescriptorProtos$SourceCodeInfoOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<DescriptorProtos$SourceCodeInfo, DescriptorProtos$SourceCodeInfo.Builder> {
    @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    DescriptorProtos$SourceCodeInfo.Location getLocation(int i11);

    int getLocationCount();

    List<DescriptorProtos$SourceCodeInfo.Location> getLocationList();

    @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder, com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
