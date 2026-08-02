package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.ayy;
import xsna.jbd0;
import xsna.t4q0;
import xsna.u5q0;

/* compiled from: ListFieldSchema.java */
/* loaded from: classes.dex */
public abstract class t {
    public static final a a = new a();
    public static final b b = new b();

    /* compiled from: ListFieldSchema.java */
    public static final class a extends t {
        public static final Class<?> c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        public static List d(int i, long j, Object obj) {
            List list = (List) u5q0.d.i(j, obj);
            if (list.isEmpty()) {
                List sVar = list instanceof ayy ? new s(i) : ((list instanceof jbd0) && (list instanceof q.d)) ? ((q.d) list).mutableCopyWithCapacity(i) : new ArrayList(i);
                u5q0.o(j, obj, sVar);
                return sVar;
            }
            if (c.isAssignableFrom(list.getClass())) {
                ArrayList arrayList = new ArrayList(list.size() + i);
                arrayList.addAll(list);
                u5q0.o(j, obj, arrayList);
                return arrayList;
            }
            if (list instanceof t4q0) {
                s sVar2 = new s(list.size() + i);
                sVar2.addAll((t4q0) list);
                u5q0.o(j, obj, sVar2);
                return sVar2;
            }
            if ((list instanceof jbd0) && (list instanceof q.d)) {
                q.d dVar = (q.d) list;
                if (!dVar.isModifiable()) {
                    q.d mutableCopyWithCapacity = dVar.mutableCopyWithCapacity(list.size() + i);
                    u5q0.o(j, obj, mutableCopyWithCapacity);
                    return mutableCopyWithCapacity;
                }
            }
            return list;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.t
        public final void a(long j, Object obj) {
            Object unmodifiableList;
            List list = (List) u5q0.d.i(j, obj);
            if (list instanceof ayy) {
                unmodifiableList = ((ayy) list).getUnmodifiableView();
            } else {
                if (c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof jbd0) && (list instanceof q.d)) {
                    q.d dVar = (q.d) list;
                    if (dVar.isModifiable()) {
                        dVar.makeImmutable();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            u5q0.o(j, obj, unmodifiableList);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.t
        public final void b(long j, Object obj, Object obj2) {
            List list = (List) u5q0.d.i(j, obj2);
            List d = d(list.size(), j, obj);
            int size = d.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                d.addAll(list);
            }
            if (size > 0) {
                list = d;
            }
            u5q0.o(j, obj, list);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.t
        public final List c(long j, Object obj) {
            return d(10, j, obj);
        }
    }

    /* compiled from: ListFieldSchema.java */
    public static final class b extends t {
        @Override // com.google.crypto.tink.shaded.protobuf.t
        public final void a(long j, Object obj) {
            ((q.d) u5q0.d.i(j, obj)).makeImmutable();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.t
        public final void b(long j, Object obj, Object obj2) {
            u5q0.e eVar = u5q0.d;
            q.d dVar = (q.d) eVar.i(j, obj);
            q.d dVar2 = (q.d) eVar.i(j, obj2);
            int size = dVar.size();
            int size2 = dVar2.size();
            if (size > 0 && size2 > 0) {
                if (!dVar.isModifiable()) {
                    dVar = dVar.mutableCopyWithCapacity(size2 + size);
                }
                dVar.addAll(dVar2);
            }
            if (size > 0) {
                dVar2 = dVar;
            }
            u5q0.o(j, obj, dVar2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.t
        public final List c(long j, Object obj) {
            q.d dVar = (q.d) u5q0.d.i(j, obj);
            if (dVar.isModifiable()) {
                return dVar;
            }
            int size = dVar.size();
            q.d mutableCopyWithCapacity = dVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            u5q0.o(j, obj, mutableCopyWithCapacity);
            return mutableCopyWithCapacity;
        }
    }

    public abstract void a(long j, Object obj);

    public abstract void b(long j, Object obj, Object obj2);

    public abstract List c(long j, Object obj);
}
