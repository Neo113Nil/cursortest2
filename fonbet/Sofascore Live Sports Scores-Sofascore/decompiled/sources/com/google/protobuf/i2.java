package com.google.protobuf;

import com.google.protobuf.Internal;
import defpackage.hml;
import defpackage.vsg;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class i2 {
    public static final Class a;
    public static final t2 b;
    public static final u2 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        t2 t2Var = null;
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
                t2Var = (t2) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        b = t2Var;
        c = new u2();
    }

    public static void A(int i, List list, hml hmlVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((z) hmlVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeSFixed64(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeSFixed64SizeNoTag(((Long) list.get(i4)).longValue());
        }
        codedOutputStream.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            codedOutputStream.writeSFixed64NoTag(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void B(int i, List list, hml hmlVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((z) hmlVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeSInt32(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeSInt32SizeNoTag(((Integer) list.get(i4)).intValue());
        }
        codedOutputStream.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            codedOutputStream.writeSInt32NoTag(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void C(int i, List list, hml hmlVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((z) hmlVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeSInt64(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeSInt64SizeNoTag(((Long) list.get(i4)).longValue());
        }
        codedOutputStream.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            codedOutputStream.writeSInt64NoTag(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void D(int i, List list, hml hmlVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((z) hmlVar).a;
        int i2 = 0;
        if (!(list instanceof LazyStringList)) {
            while (i2 < list.size()) {
                codedOutputStream.writeString(i, (String) list.get(i2));
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

    public static void E(int i, List list, hml hmlVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((z) hmlVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeUInt32(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeUInt32SizeNoTag(((Integer) list.get(i4)).intValue());
        }
        codedOutputStream.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            codedOutputStream.writeUInt32NoTag(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void F(int i, List list, hml hmlVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((z) hmlVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeUInt64(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeUInt64SizeNoTag(((Long) list.get(i4)).longValue());
        }
        codedOutputStream.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            codedOutputStream.writeUInt64NoTag(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int a(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof k1)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.computeEnumSizeNoTag(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        k1 k1Var = (k1) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.computeEnumSizeNoTag(k1Var.getInt(i));
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

    public static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof k1)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.computeInt32SizeNoTag(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        k1 k1Var = (k1) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.computeInt32SizeNoTag(k1Var.getInt(i));
            i++;
        }
        return i3;
    }

    public static int e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof t1)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.computeInt64SizeNoTag(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        t1 t1Var = (t1) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.computeInt64SizeNoTag(t1Var.getLong(i));
            i++;
        }
        return i3;
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof k1)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.computeSInt32SizeNoTag(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        k1 k1Var = (k1) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.computeSInt32SizeNoTag(k1Var.getInt(i));
            i++;
        }
        return i3;
    }

    public static int g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof t1)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.computeSInt64SizeNoTag(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        t1 t1Var = (t1) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.computeSInt64SizeNoTag(t1Var.getLong(i));
            i++;
        }
        return i3;
    }

    public static int h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof k1)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.computeUInt32SizeNoTag(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        k1 k1Var = (k1) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.computeUInt32SizeNoTag(k1Var.getInt(i));
            i++;
        }
        return i3;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof t1)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.computeUInt64SizeNoTag(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        t1 t1Var = (t1) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.computeUInt64SizeNoTag(t1Var.getLong(i));
            i++;
        }
        return i3;
    }

    public static Object j(Object obj, int i, AbstractList abstractList, Internal.EnumLiteMap enumLiteMap, Object obj2, t2 t2Var) {
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
                obj2 = n(obj, i, intValue, obj2, t2Var);
            }
        }
        if (i2 != size) {
            abstractList.subList(i2, size).clear();
        }
        return obj2;
    }

    public static Object k(Object obj, int i, List list, Internal.EnumVerifier enumVerifier, Object obj2, t2 t2Var) {
        if (enumVerifier == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!enumVerifier.isInRange(intValue)) {
                    obj2 = n(obj, i, intValue, obj2, t2Var);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) list.get(i3);
            int intValue2 = num.intValue();
            if (enumVerifier.isInRange(intValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = n(obj, i, intValue2, obj2, t2Var);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    public static void l(t2 t2Var, Object obj, Object obj2) {
        ((u2) t2Var).getClass();
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        UnknownFieldSetLite unknownFieldSetLite2 = ((GeneratedMessageLite) obj2).unknownFields;
        if (!UnknownFieldSetLite.getDefaultInstance().equals(unknownFieldSetLite2)) {
            unknownFieldSetLite = UnknownFieldSetLite.getDefaultInstance().equals(unknownFieldSetLite) ? UnknownFieldSetLite.mutableCopyOf(unknownFieldSetLite, unknownFieldSetLite2) : unknownFieldSetLite.mergeFrom(unknownFieldSetLite2);
        }
        generatedMessageLite.unknownFields = unknownFieldSetLite;
    }

    public static boolean m(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Object n(Object obj, int i, int i2, Object obj2, t2 t2Var) {
        if (obj2 == null) {
            obj2 = t2Var.a(obj);
        }
        ((u2) t2Var).getClass();
        ((UnknownFieldSetLite) obj2).storeField(WireFormat.makeTag(i, 0), Long.valueOf(i2));
        return obj2;
    }

    public static void o(int i, List list, hml hmlVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((z) hmlVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeBool(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeBoolSizeNoTag(((Boolean) list.get(i4)).booleanValue());
        }
        codedOutputStream.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            codedOutputStream.writeBoolNoTag(((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    public static void p(int i, List list, hml hmlVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z zVar = (z) hmlVar;
        zVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            zVar.a.writeBytes(i, (ByteString) list.get(i2));
        }
    }

    public static void q(int i, List list, hml hmlVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((z) hmlVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeDouble(i, ((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeDoubleSizeNoTag(((Double) list.get(i4)).doubleValue());
        }
        codedOutputStream.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            codedOutputStream.writeDoubleNoTag(((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    public static void r(int i, List list, hml hmlVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((z) hmlVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeEnum(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeEnumSizeNoTag(((Integer) list.get(i4)).intValue());
        }
        codedOutputStream.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            codedOutputStream.writeEnumNoTag(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void s(int i, List list, hml hmlVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((z) hmlVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeFixed32(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeFixed32SizeNoTag(((Integer) list.get(i4)).intValue());
        }
        codedOutputStream.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            codedOutputStream.writeFixed32NoTag(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void t(int i, List list, hml hmlVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((z) hmlVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeFixed64(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeFixed64SizeNoTag(((Long) list.get(i4)).longValue());
        }
        codedOutputStream.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            codedOutputStream.writeFixed64NoTag(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void u(int i, List list, hml hmlVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((z) hmlVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeFloat(i, ((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeFloatSizeNoTag(((Float) list.get(i4)).floatValue());
        }
        codedOutputStream.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            codedOutputStream.writeFloatNoTag(((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    public static void v(int i, List list, hml hmlVar, vsg vsgVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z zVar = (z) hmlVar;
        zVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            zVar.d(i, list.get(i2), vsgVar);
        }
    }

    public static void w(int i, List list, hml hmlVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((z) hmlVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeInt32(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeInt32SizeNoTag(((Integer) list.get(i4)).intValue());
        }
        codedOutputStream.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            codedOutputStream.writeInt32NoTag(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void x(int i, List list, hml hmlVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((z) hmlVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeInt64(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeInt64SizeNoTag(((Long) list.get(i4)).longValue());
        }
        codedOutputStream.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            codedOutputStream.writeInt64NoTag(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void y(int i, List list, hml hmlVar, vsg vsgVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z zVar = (z) hmlVar;
        zVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            zVar.g(i, list.get(i2), vsgVar);
        }
    }

    public static void z(int i, List list, hml hmlVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((z) hmlVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeSFixed32(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.computeSFixed32SizeNoTag(((Integer) list.get(i4)).intValue());
        }
        codedOutputStream.writeUInt32NoTag(i3);
        while (i2 < list.size()) {
            codedOutputStream.writeSFixed32NoTag(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }
}
