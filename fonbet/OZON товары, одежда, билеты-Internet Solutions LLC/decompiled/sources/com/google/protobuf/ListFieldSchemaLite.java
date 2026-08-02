package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.List;

/* loaded from: classes.dex */
final class ListFieldSchemaLite implements InterfaceC5967s {
    ListFieldSchemaLite() {
    }

    static <E> Internal.e<E> getProtobufList(Object obj, long j11) {
        return (Internal.e) UnsafeUtil.y(obj, j11);
    }

    @Override // com.google.protobuf.InterfaceC5967s
    public void makeImmutableListAt(Object obj, long j11) {
        getProtobufList(obj, j11).makeImmutable();
    }

    @Override // com.google.protobuf.InterfaceC5967s
    public <E> void mergeListsAt(Object obj, Object obj2, long j11) {
        Internal.e protobufList = getProtobufList(obj, j11);
        Internal.e protobufList2 = getProtobufList(obj2, j11);
        int size = protobufList.size();
        int size2 = protobufList2.size();
        if (size > 0 && size2 > 0) {
            if (!protobufList.isModifiable()) {
                protobufList = protobufList.mutableCopyWithCapacity2(size2 + size);
            }
            protobufList.addAll(protobufList2);
        }
        if (size > 0) {
            protobufList2 = protobufList;
        }
        UnsafeUtil.M(obj, j11, protobufList2);
    }

    @Override // com.google.protobuf.InterfaceC5967s
    public <L> List<L> mutableListAt(Object obj, long j11) {
        Internal.e protobufList = getProtobufList(obj, j11);
        if (protobufList.isModifiable()) {
            return protobufList;
        }
        int size = protobufList.size();
        Internal.e mutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
        UnsafeUtil.M(obj, j11, mutableCopyWithCapacity2);
        return mutableCopyWithCapacity2;
    }
}
