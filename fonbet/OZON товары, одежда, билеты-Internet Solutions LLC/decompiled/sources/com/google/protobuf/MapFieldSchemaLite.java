package com.google.protobuf;

import com.google.protobuf.u;
import java.util.Map;

/* loaded from: classes.dex */
final class MapFieldSchemaLite implements w {
    MapFieldSchemaLite() {
    }

    private static <K, V> int getSerializedSizeLite(int i11, Object obj, Object obj2) {
        v vVar = (v) obj;
        u uVar = (u) obj2;
        int i12 = 0;
        if (vVar.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : vVar.entrySet()) {
            i12 += uVar.a(i11, entry.getKey(), entry.getValue());
        }
        return i12;
    }

    private static <K, V> v<K, V> mergeFromLite(Object obj, Object obj2) {
        v<K, V> vVar = (v) obj;
        v<K, V> vVar2 = (v) obj2;
        if (!vVar2.isEmpty()) {
            if (!vVar.i()) {
                vVar = vVar.m();
            }
            vVar.l(vVar2);
        }
        return vVar;
    }

    @Override // com.google.protobuf.w
    public Map<?, ?> forMapData(Object obj) {
        return (v) obj;
    }

    @Override // com.google.protobuf.w
    public u.a<?, ?> forMapMetadata(Object obj) {
        return ((u) obj).c();
    }

    @Override // com.google.protobuf.w
    public Map<?, ?> forMutableMapData(Object obj) {
        return (v) obj;
    }

    @Override // com.google.protobuf.w
    public int getSerializedSize(int i11, Object obj, Object obj2) {
        return getSerializedSizeLite(i11, obj, obj2);
    }

    @Override // com.google.protobuf.w
    public boolean isImmutable(Object obj) {
        return !((v) obj).i();
    }

    @Override // com.google.protobuf.w
    public Object mergeFrom(Object obj, Object obj2) {
        return mergeFromLite(obj, obj2);
    }

    @Override // com.google.protobuf.w
    public Object newMapField(Object obj) {
        return v.e().m();
    }

    @Override // com.google.protobuf.w
    public Object toImmutable(Object obj) {
        ((v) obj).j();
        return obj;
    }
}
