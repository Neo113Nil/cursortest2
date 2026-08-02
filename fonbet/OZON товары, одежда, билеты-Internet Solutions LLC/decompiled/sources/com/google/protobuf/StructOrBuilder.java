package com.google.protobuf;

import java.util.Map;

/* loaded from: classes9.dex */
public interface StructOrBuilder extends A {
    boolean containsFields(String str);

    /* synthetic */ MessageLite getDefaultInstanceForType();

    @Deprecated
    Map<String, Value> getFields();

    int getFieldsCount();

    Map<String, Value> getFieldsMap();

    Value getFieldsOrDefault(String str, Value value);

    Value getFieldsOrThrow(String str);

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
