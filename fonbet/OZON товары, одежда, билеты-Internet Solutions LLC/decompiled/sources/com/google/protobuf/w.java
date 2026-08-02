package com.google.protobuf;

import com.google.protobuf.u;
import java.util.Map;

/* loaded from: classes.dex */
interface w {
    Map<?, ?> forMapData(Object obj);

    u.a<?, ?> forMapMetadata(Object obj);

    Map<?, ?> forMutableMapData(Object obj);

    int getSerializedSize(int i11, Object obj, Object obj2);

    boolean isImmutable(Object obj);

    Object mergeFrom(Object obj, Object obj2);

    Object newMapField(Object obj);

    Object toImmutable(Object obj);
}
