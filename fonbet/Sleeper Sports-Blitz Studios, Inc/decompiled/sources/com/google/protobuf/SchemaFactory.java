package com.google.protobuf;

@CheckReturnValue
/* loaded from: classes8.dex */
interface SchemaFactory {
    <T> Schema<T> createSchema(Class<T> messageType);
}
