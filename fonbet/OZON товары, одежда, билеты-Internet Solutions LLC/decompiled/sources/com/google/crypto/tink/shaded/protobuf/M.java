package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
interface M {
    L a();

    L forMapData(Object obj);

    void forMapMetadata(Object obj);

    L forMutableMapData(Object obj);

    int getSerializedSize(int i11, Object obj, Object obj2);

    boolean isImmutable(Object obj);

    L mergeFrom(Object obj, Object obj2);

    Object toImmutable(Object obj);
}
