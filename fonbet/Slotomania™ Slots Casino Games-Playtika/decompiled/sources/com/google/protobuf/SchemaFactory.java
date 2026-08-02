package com.google.protobuf;

@CheckReturnValue
/* loaded from: classes6.dex */
interface SchemaFactory {
    <T> Schema<T> createSchema(Class<T> messageType);
}
