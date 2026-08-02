package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class h1 implements FieldSet$FieldDescriptorLite {
    public final Internal.EnumLiteMap a;
    public final int b;
    public final WireFormat.FieldType c;
    public final boolean d;
    public final boolean e;

    public h1(Internal.EnumLiteMap enumLiteMap, int i, WireFormat.FieldType fieldType, boolean z, boolean z2) {
        this.a = enumLiteMap;
        this.b = i;
        this.c = fieldType;
        this.d = z;
        this.e = z2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.b - ((h1) obj).b;
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final Internal.EnumLiteMap getEnumType() {
        return this.a;
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final WireFormat.JavaType getLiteJavaType() {
        return this.c.getJavaType();
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final WireFormat.FieldType getLiteType() {
        return this.c;
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final int getNumber() {
        return this.b;
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite) {
        return ((GeneratedMessageLite.Builder) builder).mergeFrom((GeneratedMessageLite.Builder) messageLite);
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final boolean isPacked() {
        return this.e;
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final boolean isRepeated() {
        return this.d;
    }
}
