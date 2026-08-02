package com.google.protobuf;

import com.google.protobuf.MessageLite;

/* renamed from: com.google.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC5955f<ContainingType extends MessageLite, Type> {
    public abstract Type getDefaultValue();

    public abstract WireFormat$FieldType getLiteType();

    public abstract MessageLite getMessageDefaultInstance();

    public abstract int getNumber();

    boolean isLite() {
        return true;
    }

    public abstract boolean isRepeated();
}
