package com.google.protobuf;

import java.util.List;

/* loaded from: classes9.dex */
public interface FieldMaskOrBuilder extends A {
    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getPaths(int i11);

    ByteString getPathsBytes(int i11);

    int getPathsCount();

    List<String> getPathsList();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
