package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import java.util.Map;

/* compiled from: MapFieldSchemaLite.java */
/* loaded from: classes.dex */
public final class n implements m {
    @Override // com.google.protobuf.m
    public final MapFieldLite a(Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapFieldLite mapFieldLite2 = (MapFieldLite) obj2;
        if (!mapFieldLite2.isEmpty()) {
            if (!mapFieldLite.isMutable()) {
                mapFieldLite = mapFieldLite.mutableCopy();
            }
            mapFieldLite.mergeFrom(mapFieldLite2);
        }
        return mapFieldLite;
    }

    @Override // com.google.protobuf.m
    public final MapEntryLite.b<?, ?> b(Object obj) {
        return ((MapEntryLite) obj).getMetadata();
    }

    @Override // com.google.protobuf.m
    public final Object c(Object obj) {
        ((MapFieldLite) obj).makeImmutable();
        return obj;
    }

    @Override // com.google.protobuf.m
    public final MapFieldLite d(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // com.google.protobuf.m
    public final MapFieldLite e(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // com.google.protobuf.m
    public final MapFieldLite f() {
        return MapFieldLite.emptyMapField().mutableCopy();
    }

    @Override // com.google.protobuf.m
    public final int g(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapEntryLite mapEntryLite = (MapEntryLite) obj2;
        int i2 = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : mapFieldLite.entrySet()) {
            i2 += mapEntryLite.computeMessageSize(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }

    @Override // com.google.protobuf.m
    public final boolean h(Object obj) {
        return !((MapFieldLite) obj).isMutable();
    }
}
