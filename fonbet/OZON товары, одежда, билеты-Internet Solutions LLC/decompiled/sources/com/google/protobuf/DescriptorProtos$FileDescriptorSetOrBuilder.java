package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FileDescriptorSet;
import com.google.protobuf.GeneratedMessageLite;
import java.util.List;

/* loaded from: classes9.dex */
public interface DescriptorProtos$FileDescriptorSetOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<DescriptorProtos$FileDescriptorSet, DescriptorProtos$FileDescriptorSet.Builder> {
    @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    DescriptorProtos$FileDescriptorProto getFile(int i11);

    int getFileCount();

    List<DescriptorProtos$FileDescriptorProto> getFileList();

    @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder, com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
