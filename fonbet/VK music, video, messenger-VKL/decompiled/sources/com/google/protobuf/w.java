package com.google.protobuf;

import com.google.protobuf.Internal;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: SchemaUtil.java */
/* loaded from: classes.dex */
public final class w {
    public static final Class<?> a;
    public static final z<?, ?> b;
    public static final a0 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        z<?, ?> zVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zVar = (z) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        b = zVar;
        c = new a0();
    }

    public static void A(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((e) writer).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeSInt32(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeSInt32SizeNoTag(list.get(i4).intValue());
        }
        codedOutputStream.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            codedOutputStream.writeSInt32NoTag(list.get(i2).intValue());
            i2++;
        }
    }

    public static void B(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((e) writer).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeSInt64(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeSInt64SizeNoTag(list.get(i4).longValue());
        }
        codedOutputStream.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            codedOutputStream.writeSInt64NoTag(list.get(i2).longValue());
            i2++;
        }
    }

    public static void C(int i, List<String> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((e) writer).a;
        int i2 = 0;
        if (!(list instanceof LazyStringList)) {
            while (i2 < list.size()) {
                codedOutputStream.writeString(i, list.get(i2));
                i2++;
            }
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        while (i2 < list.size()) {
            Object raw = lazyStringList.getRaw(i2);
            if (raw instanceof String) {
                codedOutputStream.writeString(i, (String) raw);
            } else {
                codedOutputStream.writeBytes(i, (ByteString) raw);
            }
            i2++;
        }
    }

    public static void D(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((e) writer).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeUInt32(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeUInt32SizeNoTag(list.get(i4).intValue());
        }
        codedOutputStream.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            codedOutputStream.writeUInt32NoTag(list.get(i2).intValue());
            i2++;
        }
    }

    public static void E(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((e) writer).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeUInt64(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeUInt64SizeNoTag(list.get(i4).longValue());
        }
        codedOutputStream.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            codedOutputStream.writeUInt64NoTag(list.get(i2).longValue());
            i2++;
        }
    }

    public static int a(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.computeEnumSizeNoTag(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        j jVar = (j) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.computeEnumSizeNoTag(jVar.getInt(i));
            i++;
        }
        return i3;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.computeFixed32Size(i, 0) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.computeFixed64Size(i, 0L) * size;
    }

    public static int d(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.computeInt32SizeNoTag(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        j jVar = (j) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.computeInt32SizeNoTag(jVar.getInt(i));
            i++;
        }
        return i3;
    }

    public static int e(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof l)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.computeInt64SizeNoTag(list.get(i).longValue());
                i++;
            }
            return i2;
        }
        l lVar = (l) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.computeInt64SizeNoTag(lVar.getLong(i));
            i++;
        }
        return i3;
    }

    public static int f(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.computeSInt32SizeNoTag(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        j jVar = (j) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.computeSInt32SizeNoTag(jVar.getInt(i));
            i++;
        }
        return i3;
    }

    public static int g(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof l)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.computeSInt64SizeNoTag(list.get(i).longValue());
                i++;
            }
            return i2;
        }
        l lVar = (l) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.computeSInt64SizeNoTag(lVar.getLong(i));
            i++;
        }
        return i3;
    }

    public static int h(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.computeUInt32SizeNoTag(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        j jVar = (j) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.computeUInt32SizeNoTag(jVar.getInt(i));
            i++;
        }
        return i3;
    }

    public static int i(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof l)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.computeUInt64SizeNoTag(list.get(i).longValue());
                i++;
            }
            return i2;
        }
        l lVar = (l) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.computeUInt64SizeNoTag(lVar.getLong(i));
            i++;
        }
        return i3;
    }

    public static Object j(Object obj, int i, AbstractList abstractList, Internal.EnumLiteMap enumLiteMap, Object obj2, z zVar) {
        if (enumLiteMap == null) {
            return obj2;
        }
        int size = abstractList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) abstractList.get(i3);
            int intValue = num.intValue();
            if (enumLiteMap.findValueByNumber(intValue) != null) {
                if (i3 != i2) {
                    abstractList.set(i2, num);
                }
                i2++;
            } else {
                obj2 = m(obj, i, intValue, obj2, zVar);
            }
        }
        if (i2 != size) {
            abstractList.subList(i2, size).clear();
        }
        return obj2;
    }

    public static <UT, UB> UB k(Object obj, int i, List<Integer> list, Internal.EnumVerifier enumVerifier, UB ub, z<UT, UB> zVar) {
        if (enumVerifier == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (!enumVerifier.isInRange(intValue)) {
                    ub = (UB) m(obj, i, intValue, ub, zVar);
                    it.remove();
                }
            }
            return ub;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = list.get(i3);
            int intValue2 = num.intValue();
            if (enumVerifier.isInRange(intValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                ub = (UB) m(obj, i, intValue2, ub, zVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static <UT, UB> UB m(Object obj, int i, int i2, UB ub, z<UT, UB> zVar) {
        if (ub == null) {
            ub = (UB) zVar.f(obj);
        }
        zVar.e(i, i2, ub);
        return ub;
    }

    public static void n(int i, List<Boolean> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((e) writer).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeBool(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeBoolSizeNoTag(list.get(i4).booleanValue());
        }
        codedOutputStream.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            codedOutputStream.writeBoolNoTag(list.get(i2).booleanValue());
            i2++;
        }
    }

    public static void o(int i, List<ByteString> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) writer;
        eVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            eVar.a.writeBytes(i, list.get(i2));
        }
    }

    public static void p(int i, List<Double> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((e) writer).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeDouble(i, list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeDoubleSizeNoTag(list.get(i4).doubleValue());
        }
        codedOutputStream.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            codedOutputStream.writeDoubleNoTag(list.get(i2).doubleValue());
            i2++;
        }
    }

    public static void q(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((e) writer).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeEnum(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeEnumSizeNoTag(list.get(i4).intValue());
        }
        codedOutputStream.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            codedOutputStream.writeEnumNoTag(list.get(i2).intValue());
            i2++;
        }
    }

    public static void r(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((e) writer).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeFixed32(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeFixed32SizeNoTag(list.get(i4).intValue());
        }
        codedOutputStream.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            codedOutputStream.writeFixed32NoTag(list.get(i2).intValue());
            i2++;
        }
    }

    public static void s(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((e) writer).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeFixed64(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeFixed64SizeNoTag(list.get(i4).longValue());
        }
        codedOutputStream.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            codedOutputStream.writeFixed64NoTag(list.get(i2).longValue());
            i2++;
        }
    }

    public static void t(int i, List<Float> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((e) writer).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeFloat(i, list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeFloatSizeNoTag(list.get(i4).floatValue());
        }
        codedOutputStream.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            codedOutputStream.writeFloatNoTag(list.get(i2).floatValue());
            i2++;
        }
    }

    public static void u(int i, List<?> list, Writer writer, v vVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) writer;
        eVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            eVar.d(i, list.get(i2), vVar);
        }
    }

    public static void v(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((e) writer).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeInt32(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeInt32SizeNoTag(list.get(i4).intValue());
        }
        codedOutputStream.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            codedOutputStream.writeInt32NoTag(list.get(i2).intValue());
            i2++;
        }
    }

    public static void w(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((e) writer).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeInt64(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeInt64SizeNoTag(list.get(i4).longValue());
        }
        codedOutputStream.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            codedOutputStream.writeInt64NoTag(list.get(i2).longValue());
            i2++;
        }
    }

    public static void x(int i, List<?> list, Writer writer, v vVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) writer;
        eVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            eVar.g(i, list.get(i2), vVar);
        }
    }

    public static void y(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((e) writer).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeSFixed32(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeSFixed32SizeNoTag(list.get(i4).intValue());
        }
        codedOutputStream.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            codedOutputStream.writeSFixed32NoTag(list.get(i2).intValue());
            i2++;
        }
    }

    public static void z(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((e) writer).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeSFixed64(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeSFixed64SizeNoTag(list.get(i4).longValue());
        }
        codedOutputStream.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            codedOutputStream.writeSFixed64NoTag(list.get(i2).longValue());
            i2++;
        }
    }
}
