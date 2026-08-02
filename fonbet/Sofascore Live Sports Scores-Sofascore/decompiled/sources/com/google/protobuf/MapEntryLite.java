package com.google.protobuf;

import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import defpackage.cp4;
import defpackage.dbl;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class MapEntryLite<K, V> {
    private static final int KEY_FIELD_NUMBER = 1;
    private static final int VALUE_FIELD_NUMBER = 2;
    private final K key;
    private final v1 metadata;
    private final V value;

    private MapEntryLite(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        this.metadata = new v1(fieldType, k, fieldType2, v);
        this.key = k;
        this.value = v;
    }

    public static <K, V> int computeSerializedSize(v1 v1Var, K k, V v) {
        return d1.c(v1Var.c, 2, v) + d1.c(v1Var.a, 1, k);
    }

    public static <K, V> MapEntryLite<K, V> newDefaultInstance(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        return new MapEntryLite<>(fieldType, k, fieldType2, v);
    }

    public static <K, V> Map.Entry<K, V> parseEntry(CodedInputStream codedInputStream, v1 v1Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        Object obj = v1Var.b;
        WireFormat.FieldType fieldType = v1Var.c;
        WireFormat.FieldType fieldType2 = v1Var.a;
        Object obj2 = v1Var.d;
        while (true) {
            int readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == WireFormat.makeTag(1, fieldType2.getWireType())) {
                obj = parseField(codedInputStream, extensionRegistryLite, fieldType2, obj);
            } else if (readTag == WireFormat.makeTag(2, fieldType.getWireType())) {
                obj2 = parseField(codedInputStream, extensionRegistryLite, fieldType, obj2);
            } else if (!codedInputStream.skipField(readTag)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public static <T> T parseField(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, WireFormat.FieldType fieldType, T t) throws IOException {
        int i = u1.a[fieldType.ordinal()];
        if (i == 1) {
            MessageLite.Builder builder = ((MessageLite) t).toBuilder();
            codedInputStream.readMessage(builder, extensionRegistryLite);
            return (T) builder.buildPartial();
        }
        if (i == 2) {
            return (T) Integer.valueOf(codedInputStream.readEnum());
        }
        if (i != 3) {
            d1 d1Var = d1.d;
            return (T) WireFormat.readPrimitiveField(codedInputStream, fieldType, dbl.b);
        }
        cp4.h("Groups are not allowed in maps.");
        return null;
    }

    public static <K, V> void writeTo(CodedOutputStream codedOutputStream, v1 v1Var, K k, V v) throws IOException {
        d1.r(codedOutputStream, v1Var.a, 1, k);
        d1.r(codedOutputStream, v1Var.c, 2, v);
    }

    public int computeMessageSize(int i, K k, V v) {
        return CodedOutputStream.computeLengthDelimitedFieldSize(computeSerializedSize(this.metadata, k, v)) + CodedOutputStream.computeTagSize(i);
    }

    public K getKey() {
        return this.key;
    }

    public v1 getMetadata() {
        return this.metadata;
    }

    public V getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void parseInto(MapFieldLite<K, V> mapFieldLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
        v1 v1Var = this.metadata;
        Object obj = v1Var.b;
        Object obj2 = v1Var.d;
        while (true) {
            int readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            }
            int makeTag = WireFormat.makeTag(1, this.metadata.a.getWireType());
            v1 v1Var2 = this.metadata;
            if (readTag == makeTag) {
                obj = parseField(codedInputStream, extensionRegistryLite, v1Var2.a, obj);
            } else if (readTag == WireFormat.makeTag(2, v1Var2.c.getWireType())) {
                obj2 = parseField(codedInputStream, extensionRegistryLite, this.metadata.c, obj2);
            } else if (!codedInputStream.skipField(readTag)) {
                break;
            }
        }
        codedInputStream.checkLastTagWas(0);
        codedInputStream.popLimit(pushLimit);
        mapFieldLite.put(obj, obj2);
    }

    public void serializeTo(CodedOutputStream codedOutputStream, int i, K k, V v) throws IOException {
        codedOutputStream.writeTag(i, 2);
        codedOutputStream.writeUInt32NoTag(computeSerializedSize(this.metadata, k, v));
        writeTo(codedOutputStream, this.metadata, k, v);
    }

    private MapEntryLite(v1 v1Var, K k, V v) {
        this.metadata = v1Var;
        this.key = k;
        this.value = v;
    }

    public Map.Entry<K, V> parseEntry(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return parseEntry(byteString.newCodedInput(), this.metadata, extensionRegistryLite);
    }
}
