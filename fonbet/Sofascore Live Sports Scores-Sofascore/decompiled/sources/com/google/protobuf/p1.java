package com.google.protobuf;

import com.google.protobuf.Internal;
import defpackage.e7f;
import defpackage.uck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class p1 extends r1 {
    public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(int i, long j, Object obj) {
        List list = (List) uck.j(obj, j);
        if (list.isEmpty()) {
            List lazyStringArrayList = list instanceof LazyStringList ? new LazyStringArrayList(i) : ((list instanceof e7f) && (list instanceof Internal.ProtobufList)) ? ((Internal.ProtobufList) list).mutableCopyWithCapacity2(i) : new ArrayList(i);
            uck.r(j, obj, lazyStringArrayList);
            return lazyStringArrayList;
        }
        if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            uck.r(j, obj, arrayList);
            return arrayList;
        }
        if (list instanceof UnmodifiableLazyStringList) {
            LazyStringArrayList lazyStringArrayList2 = new LazyStringArrayList(list.size() + i);
            lazyStringArrayList2.addAll((UnmodifiableLazyStringList) list);
            uck.r(j, obj, lazyStringArrayList2);
            return lazyStringArrayList2;
        }
        if ((list instanceof e7f) && (list instanceof Internal.ProtobufList)) {
            Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
            if (!protobufList.isModifiable()) {
                Internal.ProtobufList mutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(list.size() + i);
                uck.r(j, obj, mutableCopyWithCapacity2);
                return mutableCopyWithCapacity2;
            }
        }
        return list;
    }

    @Override // com.google.protobuf.r1
    public final void a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) uck.j(obj, j);
        if (list instanceof LazyStringList) {
            unmodifiableList = ((LazyStringList) list).getUnmodifiableView();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof e7f) && (list instanceof Internal.ProtobufList)) {
                Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                if (protobufList.isModifiable()) {
                    protobufList.makeImmutable();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        uck.r(j, obj, unmodifiableList);
    }

    @Override // com.google.protobuf.r1
    public final void b(long j, Object obj, Object obj2) {
        List list = (List) uck.j(obj2, j);
        List d = d(list.size(), j, obj);
        int size = d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d.addAll(list);
        }
        if (size > 0) {
            list = d;
        }
        uck.r(j, obj, list);
    }

    @Override // com.google.protobuf.r1
    public final List c(Object obj, long j) {
        return d(10, j, obj);
    }
}
