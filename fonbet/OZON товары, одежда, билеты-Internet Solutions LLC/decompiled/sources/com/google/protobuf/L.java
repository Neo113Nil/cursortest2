package com.google.protobuf;

import com.google.protobuf.Internal;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class L {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?> f60131a;

    /* renamed from: b, reason: collision with root package name */
    private static final N<?, ?> f60132b;

    /* renamed from: c, reason: collision with root package name */
    private static final UnknownFieldSetLiteSchema f60133c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f60134d = 0;

    static {
        Class<?> cls;
        Class<?> cls2;
        int i11 = C5950a.f60193b;
        N<?, ?> n11 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f60131a = cls;
        try {
            int i12 = C5950a.f60193b;
            try {
                cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                n11 = (N) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            }
        } catch (Throwable unused3) {
        }
        f60132b = n11;
        f60133c = new UnknownFieldSetLiteSchema();
    }

    public static void A(int i11, List<Long> list, T t2, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        t2.writeSInt64List(i11, list, z11);
    }

    public static void B(int i11, List<Integer> list, T t2, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        t2.writeUInt32List(i11, list, z11);
    }

    public static void C(int i11, List<Long> list, T t2, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        t2.writeUInt64List(i11, list, z11);
    }

    static int a(List<Integer> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += CodedOutputStream.computeEnumSizeNoTag(list.get(i11).intValue());
                i11++;
            }
            return i12;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += CodedOutputStream.computeEnumSizeNoTag(intArrayList.getInt(i11));
            i11++;
        }
        return i13;
    }

    static int b(int i11, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.computeFixed32Size(i11, 0) * size;
    }

    static int c(int i11, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.computeFixed64Size(i11, 0L) * size;
    }

    static int d(List<Integer> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += CodedOutputStream.computeInt32SizeNoTag(list.get(i11).intValue());
                i11++;
            }
            return i12;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += CodedOutputStream.computeInt32SizeNoTag(intArrayList.getInt(i11));
            i11++;
        }
        return i13;
    }

    static int e(List<Long> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += CodedOutputStream.computeInt64SizeNoTag(list.get(i11).longValue());
                i11++;
            }
            return i12;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += CodedOutputStream.computeInt64SizeNoTag(longArrayList.getLong(i11));
            i11++;
        }
        return i13;
    }

    static int f(List<Integer> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += CodedOutputStream.computeSInt32SizeNoTag(list.get(i11).intValue());
                i11++;
            }
            return i12;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += CodedOutputStream.computeSInt32SizeNoTag(intArrayList.getInt(i11));
            i11++;
        }
        return i13;
    }

    static int g(List<Long> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += CodedOutputStream.computeSInt64SizeNoTag(list.get(i11).longValue());
                i11++;
            }
            return i12;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += CodedOutputStream.computeSInt64SizeNoTag(longArrayList.getLong(i11));
            i11++;
        }
        return i13;
    }

    static int h(List<Integer> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += CodedOutputStream.computeUInt32SizeNoTag(list.get(i11).intValue());
                i11++;
            }
            return i12;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += CodedOutputStream.computeUInt32SizeNoTag(intArrayList.getInt(i11));
            i11++;
        }
        return i13;
    }

    static int i(List<Long> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += CodedOutputStream.computeUInt64SizeNoTag(list.get(i11).longValue());
                i11++;
            }
            return i12;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += CodedOutputStream.computeUInt64SizeNoTag(longArrayList.getLong(i11));
            i11++;
        }
        return i13;
    }

    static Object j(Object obj, int i11, AbstractList abstractList, Internal.b bVar, Object obj2, N n11) {
        if (bVar == null) {
            return obj2;
        }
        int size = abstractList.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            Integer num = (Integer) abstractList.get(i13);
            int intValue = num.intValue();
            if (bVar.findValueByNumber(intValue) != null) {
                if (i13 != i12) {
                    abstractList.set(i12, num);
                }
                i12++;
            } else {
                obj2 = n(obj, i11, intValue, obj2, n11);
            }
        }
        if (i12 != size) {
            abstractList.subList(i12, size).clear();
        }
        return obj2;
    }

    static <UT, UB> UB k(Object obj, int i11, List<Integer> list, Internal.c cVar, UB ub2, N<UT, UB> n11) {
        if (cVar == null) {
            return ub2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (!cVar.isInRange(intValue)) {
                    ub2 = (UB) n(obj, i11, intValue, ub2, n11);
                    it.remove();
                }
            }
            return ub2;
        }
        int size = list.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            Integer num = list.get(i13);
            int intValue2 = num.intValue();
            if (cVar.isInRange(intValue2)) {
                if (i13 != i12) {
                    list.set(i12, num);
                }
                i12++;
            } else {
                ub2 = (UB) n(obj, i11, intValue2, ub2, n11);
            }
        }
        if (i12 != size) {
            list.subList(i12, size).clear();
        }
        return ub2;
    }

    public static void l(Class<?> cls) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            return;
        }
        int i11 = C5950a.f60193b;
        Class<?> cls2 = f60131a;
        if (cls2 != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean m(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static <UT, UB> UB n(Object obj, int i11, int i12, UB ub2, N<UT, UB> n11) {
        if (ub2 == null) {
            ub2 = n11.getBuilderFromMessage(obj);
        }
        n11.addVarint(ub2, i11, i12);
        return ub2;
    }

    public static N<?, ?> o() {
        return f60132b;
    }

    public static UnknownFieldSetLiteSchema p() {
        return f60133c;
    }

    public static void q(int i11, List<Boolean> list, T t2, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        t2.writeBoolList(i11, list, z11);
    }

    public static void r(int i11, List<Double> list, T t2, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        t2.writeDoubleList(i11, list, z11);
    }

    public static void s(int i11, List<Integer> list, T t2, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        t2.writeFixed32List(i11, list, z11);
    }

    public static void t(int i11, List<Long> list, T t2, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        t2.writeFixed64List(i11, list, z11);
    }

    public static void u(int i11, List<Float> list, T t2, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        t2.writeFloatList(i11, list, z11);
    }

    public static void v(int i11, List<Integer> list, T t2, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        t2.writeInt32List(i11, list, z11);
    }

    public static void w(int i11, List<Long> list, T t2, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        t2.writeInt64List(i11, list, z11);
    }

    public static void x(int i11, List<Integer> list, T t2, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        t2.writeSFixed32List(i11, list, z11);
    }

    public static void y(int i11, List<Long> list, T t2, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        t2.writeSFixed64List(i11, list, z11);
    }

    public static void z(int i11, List<Integer> list, T t2, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        t2.writeSInt32List(i11, list, z11);
    }
}
