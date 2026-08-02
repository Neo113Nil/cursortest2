package com.google.protobuf;

import com.google.protobuf.Value;

/* loaded from: classes9.dex */
public interface ValueOrBuilder extends A {
    boolean getBoolValue();

    /* synthetic */ MessageLite getDefaultInstanceForType();

    Value.KindCase getKindCase();

    ListValue getListValue();

    NullValue getNullValue();

    int getNullValueValue();

    double getNumberValue();

    String getStringValue();

    ByteString getStringValueBytes();

    Struct getStructValue();

    boolean hasBoolValue();

    boolean hasListValue();

    boolean hasNullValue();

    boolean hasNumberValue();

    boolean hasStringValue();

    boolean hasStructValue();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
