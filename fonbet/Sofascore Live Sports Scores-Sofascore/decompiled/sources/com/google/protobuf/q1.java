package com.google.protobuf;

import com.google.protobuf.Internal;
import defpackage.uck;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class q1 extends r1 {
    @Override // com.google.protobuf.r1
    public final void a(Object obj, long j) {
        ((Internal.ProtobufList) uck.j(obj, j)).makeImmutable();
    }

    @Override // com.google.protobuf.r1
    public final void b(long j, Object obj, Object obj2) {
        Internal.ProtobufList protobufList = (Internal.ProtobufList) uck.j(obj, j);
        Internal.ProtobufList protobufList2 = (Internal.ProtobufList) uck.j(obj2, j);
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
        uck.r(j, obj, protobufList2);
    }

    @Override // com.google.protobuf.r1
    public final List c(Object obj, long j) {
        Internal.ProtobufList protobufList = (Internal.ProtobufList) uck.j(obj, j);
        if (protobufList.isModifiable()) {
            return protobufList;
        }
        int size = protobufList.size();
        Internal.ProtobufList mutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
        uck.r(j, obj, mutableCopyWithCapacity2);
        return mutableCopyWithCapacity2;
    }
}
