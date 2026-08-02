package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.kbd0;
import xsna.v5q0;

/* compiled from: ListFieldSchema.java */
/* loaded from: classes.dex */
public abstract class k {
    public static final a a = new a();
    public static final b b = new b();

    /* compiled from: ListFieldSchema.java */
    public static final class a extends k {
        public static final Class<?> c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        public static List d(int i, long j, Object obj) {
            List list = (List) v5q0.c.k(j, obj);
            if (list.isEmpty()) {
                List lazyStringArrayList = list instanceof LazyStringList ? new LazyStringArrayList(i) : ((list instanceof kbd0) && (list instanceof Internal.ProtobufList)) ? ((Internal.ProtobufList) list).mutableCopyWithCapacity2(i) : new ArrayList(i);
                v5q0.q(j, obj, lazyStringArrayList);
                return lazyStringArrayList;
            }
            if (c.isAssignableFrom(list.getClass())) {
                ArrayList arrayList = new ArrayList(list.size() + i);
                arrayList.addAll(list);
                v5q0.q(j, obj, arrayList);
                return arrayList;
            }
            if (list instanceof UnmodifiableLazyStringList) {
                LazyStringArrayList lazyStringArrayList2 = new LazyStringArrayList(list.size() + i);
                lazyStringArrayList2.addAll((UnmodifiableLazyStringList) list);
                v5q0.q(j, obj, lazyStringArrayList2);
                return lazyStringArrayList2;
            }
            if ((list instanceof kbd0) && (list instanceof Internal.ProtobufList)) {
                Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                if (!protobufList.isModifiable()) {
                    Internal.ProtobufList mutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(list.size() + i);
                    v5q0.q(j, obj, mutableCopyWithCapacity2);
                    return mutableCopyWithCapacity2;
                }
            }
            return list;
        }

        @Override // com.google.protobuf.k
        public final void a(long j, Object obj) {
            Object unmodifiableList;
            List list = (List) v5q0.c.k(j, obj);
            if (list instanceof LazyStringList) {
                unmodifiableList = ((LazyStringList) list).getUnmodifiableView();
            } else {
                if (c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof kbd0) && (list instanceof Internal.ProtobufList)) {
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                    if (protobufList.isModifiable()) {
                        protobufList.makeImmutable();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            v5q0.q(j, obj, unmodifiableList);
        }

        @Override // com.google.protobuf.k
        public final void b(long j, Object obj, Object obj2) {
            List list = (List) v5q0.c.k(j, obj2);
            List d = d(list.size(), j, obj);
            int size = d.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                d.addAll(list);
            }
            if (size > 0) {
                list = d;
            }
            v5q0.q(j, obj, list);
        }

        @Override // com.google.protobuf.k
        public final List c(long j, Object obj) {
            return d(10, j, obj);
        }
    }

    /* compiled from: ListFieldSchema.java */
    public static final class b extends k {
        @Override // com.google.protobuf.k
        public final void a(long j, Object obj) {
            ((Internal.ProtobufList) v5q0.c.k(j, obj)).makeImmutable();
        }

        @Override // com.google.protobuf.k
        public final void b(long j, Object obj, Object obj2) {
            v5q0.d dVar = v5q0.c;
            Internal.ProtobufList protobufList = (Internal.ProtobufList) dVar.k(j, obj);
            Internal.ProtobufList protobufList2 = (Internal.ProtobufList) dVar.k(j, obj2);
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
            v5q0.q(j, obj, protobufList2);
        }

        @Override // com.google.protobuf.k
        public final List c(long j, Object obj) {
            Internal.ProtobufList protobufList = (Internal.ProtobufList) v5q0.c.k(j, obj);
            if (protobufList.isModifiable()) {
                return protobufList;
            }
            int size = protobufList.size();
            Internal.ProtobufList mutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            v5q0.q(j, obj, mutableCopyWithCapacity2);
            return mutableCopyWithCapacity2;
        }
    }

    public abstract void a(long j, Object obj);

    public abstract void b(long j, Object obj, Object obj2);

    public abstract List c(long j, Object obj);
}
