package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC3493z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public static final E f37237a;

    /* renamed from: b, reason: collision with root package name */
    public static final E f37238b;

    public static final class b extends E {

        /* renamed from: c, reason: collision with root package name */
        public static final Class f37239c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        public b() {
            super();
        }

        public static List f(Object obj, long j10) {
            return (List) o0.C(obj, j10);
        }

        public static List g(Object obj, long j10, int i10) {
            List f10 = f(obj, j10);
            if (f10.isEmpty()) {
                List c10 = f10 instanceof D ? new C(i10) : ((f10 instanceof Y) && (f10 instanceof AbstractC3493z.d)) ? ((AbstractC3493z.d) f10).mutableCopyWithCapacity(i10) : new ArrayList(i10);
                o0.R(obj, j10, c10);
                return c10;
            }
            if (f37239c.isAssignableFrom(f10.getClass())) {
                ArrayList arrayList = new ArrayList(f10.size() + i10);
                arrayList.addAll(f10);
                o0.R(obj, j10, arrayList);
                return arrayList;
            }
            if (f10 instanceof n0) {
                C c11 = new C(f10.size() + i10);
                c11.addAll((n0) f10);
                o0.R(obj, j10, c11);
                return c11;
            }
            if ((f10 instanceof Y) && (f10 instanceof AbstractC3493z.d)) {
                AbstractC3493z.d dVar = (AbstractC3493z.d) f10;
                if (!dVar.isModifiable()) {
                    AbstractC3493z.d mutableCopyWithCapacity = dVar.mutableCopyWithCapacity(f10.size() + i10);
                    o0.R(obj, j10, mutableCopyWithCapacity);
                    return mutableCopyWithCapacity;
                }
            }
            return f10;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.E
        public void c(Object obj, long j10) {
            Object unmodifiableList;
            List list = (List) o0.C(obj, j10);
            if (list instanceof D) {
                unmodifiableList = ((D) list).getUnmodifiableView();
            } else {
                if (f37239c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof Y) && (list instanceof AbstractC3493z.d)) {
                    AbstractC3493z.d dVar = (AbstractC3493z.d) list;
                    if (dVar.isModifiable()) {
                        dVar.makeImmutable();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            o0.R(obj, j10, unmodifiableList);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.E
        public void d(Object obj, Object obj2, long j10) {
            List f10 = f(obj2, j10);
            List g10 = g(obj, j10, f10.size());
            int size = g10.size();
            int size2 = f10.size();
            if (size > 0 && size2 > 0) {
                g10.addAll(f10);
            }
            if (size > 0) {
                f10 = g10;
            }
            o0.R(obj, j10, f10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.E
        public List e(Object obj, long j10) {
            return g(obj, j10, 10);
        }
    }

    public static final class c extends E {
        public c() {
            super();
        }

        public static AbstractC3493z.d f(Object obj, long j10) {
            return (AbstractC3493z.d) o0.C(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.E
        public void c(Object obj, long j10) {
            f(obj, j10).makeImmutable();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.E
        public void d(Object obj, Object obj2, long j10) {
            AbstractC3493z.d f10 = f(obj, j10);
            AbstractC3493z.d f11 = f(obj2, j10);
            int size = f10.size();
            int size2 = f11.size();
            if (size > 0 && size2 > 0) {
                if (!f10.isModifiable()) {
                    f10 = f10.mutableCopyWithCapacity(size2 + size);
                }
                f10.addAll(f11);
            }
            if (size > 0) {
                f11 = f10;
            }
            o0.R(obj, j10, f11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.E
        public List e(Object obj, long j10) {
            AbstractC3493z.d f10 = f(obj, j10);
            if (f10.isModifiable()) {
                return f10;
            }
            int size = f10.size();
            AbstractC3493z.d mutableCopyWithCapacity = f10.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            o0.R(obj, j10, mutableCopyWithCapacity);
            return mutableCopyWithCapacity;
        }
    }

    static {
        f37237a = new b();
        f37238b = new c();
    }

    public static E a() {
        return f37237a;
    }

    public static E b() {
        return f37238b;
    }

    public abstract void c(Object obj, long j10);

    public abstract void d(Object obj, Object obj2, long j10);

    public abstract List e(Object obj, long j10);

    public E() {
    }
}
