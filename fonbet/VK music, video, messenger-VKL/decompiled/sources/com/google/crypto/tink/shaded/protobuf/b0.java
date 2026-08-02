package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.q;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Logger;
import xsna.ayy;
import xsna.ka20;
import xsna.oqy;

/* compiled from: SchemaUtil.java */
/* loaded from: classes.dex */
public final class b0 {
    public static final Class<?> a;
    public static final e0<?, ?> b;
    public static final e0<?, ?> c;
    public static final g0 d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = x(false);
        c = x(true);
        d = new g0();
    }

    public static void A(int i, List<Boolean> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((i) writer).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.s(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        codedOutputStream.E(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = CodedOutputStream.b;
            i3++;
        }
        codedOutputStream.G(i3);
        while (i2 < list.size()) {
            codedOutputStream.r(list.get(i2).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void B(int i, List<ByteString> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) writer;
        iVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            iVar.a.t(i, list.get(i2));
        }
    }

    public static void C(int i, List<Double> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((i) writer).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double doubleValue = list.get(i2).doubleValue();
                codedOutputStream.getClass();
                codedOutputStream.w(i, Double.doubleToRawLongBits(doubleValue));
                i2++;
            }
            return;
        }
        codedOutputStream.E(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = CodedOutputStream.b;
            i3 += 8;
        }
        codedOutputStream.G(i3);
        while (i2 < list.size()) {
            codedOutputStream.x(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
            i2++;
        }
    }

    public static void D(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((i) writer).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.y(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.E(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.l(list.get(i4).intValue());
        }
        codedOutputStream.G(i3);
        while (i2 < list.size()) {
            codedOutputStream.z(list.get(i2).intValue());
            i2++;
        }
    }

    public static void E(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((i) writer).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.u(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.E(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = CodedOutputStream.b;
            i3 += 4;
        }
        codedOutputStream.G(i3);
        while (i2 < list.size()) {
            codedOutputStream.v(list.get(i2).intValue());
            i2++;
        }
    }

    public static void F(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((i) writer).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.w(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        codedOutputStream.E(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = CodedOutputStream.b;
            i3 += 8;
        }
        codedOutputStream.G(i3);
        while (i2 < list.size()) {
            codedOutputStream.x(list.get(i2).longValue());
            i2++;
        }
    }

    public static void G(int i, List<Float> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((i) writer).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float floatValue = list.get(i2).floatValue();
                codedOutputStream.getClass();
                codedOutputStream.u(i, Float.floatToRawIntBits(floatValue));
                i2++;
            }
            return;
        }
        codedOutputStream.E(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = CodedOutputStream.b;
            i3 += 4;
        }
        codedOutputStream.G(i3);
        while (i2 < list.size()) {
            codedOutputStream.v(Float.floatToRawIntBits(list.get(i2).floatValue()));
            i2++;
        }
    }

    public static void H(int i, List<?> list, Writer writer, a0 a0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) writer;
        iVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            iVar.h(i, list.get(i2), a0Var);
        }
    }

    public static void I(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((i) writer).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.y(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.E(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.l(list.get(i4).intValue());
        }
        codedOutputStream.G(i3);
        while (i2 < list.size()) {
            codedOutputStream.z(list.get(i2).intValue());
            i2++;
        }
    }

    public static void J(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((i) writer).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.H(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        codedOutputStream.E(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.q(list.get(i4).longValue());
        }
        codedOutputStream.G(i3);
        while (i2 < list.size()) {
            codedOutputStream.I(list.get(i2).longValue());
            i2++;
        }
    }

    public static void K(int i, List<?> list, Writer writer, a0 a0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) writer;
        iVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            iVar.k(i, list.get(i2), a0Var);
        }
    }

    public static void L(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((i) writer).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.u(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.E(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = CodedOutputStream.b;
            i3 += 4;
        }
        codedOutputStream.G(i3);
        while (i2 < list.size()) {
            codedOutputStream.v(list.get(i2).intValue());
            i2++;
        }
    }

    public static void M(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((i) writer).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.w(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        codedOutputStream.E(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = CodedOutputStream.b;
            i3 += 8;
        }
        codedOutputStream.G(i3);
        while (i2 < list.size()) {
            codedOutputStream.x(list.get(i2).longValue());
            i2++;
        }
    }

    public static void N(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((i) writer).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int intValue = list.get(i2).intValue();
                codedOutputStream.F(i, (intValue >> 31) ^ (intValue << 1));
                i2++;
            }
            return;
        }
        codedOutputStream.E(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = list.get(i4).intValue();
            i3 += CodedOutputStream.p((intValue2 >> 31) ^ (intValue2 << 1));
        }
        codedOutputStream.G(i3);
        while (i2 < list.size()) {
            int intValue3 = list.get(i2).intValue();
            codedOutputStream.G((intValue3 >> 31) ^ (intValue3 << 1));
            i2++;
        }
    }

    public static void O(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((i) writer).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = list.get(i2).longValue();
                codedOutputStream.H(i, (longValue >> 63) ^ (longValue << 1));
                i2++;
            }
            return;
        }
        codedOutputStream.E(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = list.get(i4).longValue();
            i3 += CodedOutputStream.q((longValue2 >> 63) ^ (longValue2 << 1));
        }
        codedOutputStream.G(i3);
        while (i2 < list.size()) {
            long longValue3 = list.get(i2).longValue();
            codedOutputStream.I((longValue3 >> 63) ^ (longValue3 << 1));
            i2++;
        }
    }

    public static void P(int i, List<String> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((i) writer).a;
        int i2 = 0;
        if (!(list instanceof ayy)) {
            while (i2 < list.size()) {
                codedOutputStream.D(i, list.get(i2));
                i2++;
            }
            return;
        }
        ayy ayyVar = (ayy) list;
        while (i2 < list.size()) {
            Object raw = ayyVar.getRaw(i2);
            if (raw instanceof String) {
                codedOutputStream.D(i, (String) raw);
            } else {
                codedOutputStream.t(i, (ByteString) raw);
            }
            i2++;
        }
    }

    public static void Q(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((i) writer).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.F(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.E(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.p(list.get(i4).intValue());
        }
        codedOutputStream.G(i3);
        while (i2 < list.size()) {
            codedOutputStream.G(list.get(i2).intValue());
            i2++;
        }
    }

    public static void R(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((i) writer).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.H(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        codedOutputStream.E(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += CodedOutputStream.q(list.get(i4).longValue());
        }
        codedOutputStream.G(i3);
        while (i2 < list.size()) {
            codedOutputStream.I(list.get(i2).longValue());
            i2++;
        }
    }

    public static int a(int i, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int n = CodedOutputStream.n(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            n += CodedOutputStream.h(list.get(i2));
        }
        return n;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.n(i) * size) + c(list);
    }

    public static int c(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof p)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.l(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        p pVar = (p) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.l(pVar.getInt(i));
            i++;
        }
        return i3;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.i(i) * size;
    }

    public static int e(List<?> list) {
        return list.size() * 4;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.j(i) * size;
    }

    public static int g(List<?> list) {
        return list.size() * 8;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.n(i) * size) + i(list);
    }

    public static int i(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof p)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.l(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        p pVar = (p) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.l(pVar.getInt(i));
            i++;
        }
        return i3;
    }

    public static int j(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (CodedOutputStream.n(i) * list.size()) + k(list);
    }

    public static int k(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.q(list.get(i).longValue());
                i++;
            }
            return i2;
        }
        u uVar = (u) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.q(uVar.getLong(i));
            i++;
        }
        return i3;
    }

    public static int l(int i, Object obj, a0 a0Var) {
        if (obj instanceof oqy) {
            int n = CodedOutputStream.n(i);
            int a2 = ((oqy) obj).a();
            return CodedOutputStream.p(a2) + a2 + n;
        }
        int n2 = CodedOutputStream.n(i);
        a aVar = (a) ((ka20) obj);
        int b2 = aVar.b();
        if (b2 == -1) {
            b2 = a0Var.i(aVar);
            aVar.d(b2);
        }
        return CodedOutputStream.p(b2) + b2 + n2;
    }

    public static int m(int i, List<?> list, a0 a0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int n = CodedOutputStream.n(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof oqy) {
                int a2 = ((oqy) obj).a();
                n = CodedOutputStream.p(a2) + a2 + n;
            } else {
                a aVar = (a) ((ka20) obj);
                int b2 = aVar.b();
                if (b2 == -1) {
                    b2 = a0Var.i(aVar);
                    aVar.d(b2);
                }
                n = CodedOutputStream.p(b2) + b2 + n;
            }
        }
        return n;
    }

    public static int n(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.n(i) * size) + o(list);
    }

    public static int o(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof p)) {
            int i2 = 0;
            while (i < size) {
                int intValue = list.get(i).intValue();
                i2 += CodedOutputStream.p((intValue >> 31) ^ (intValue << 1));
                i++;
            }
            return i2;
        }
        p pVar = (p) list;
        int i3 = 0;
        while (i < size) {
            int i4 = pVar.getInt(i);
            i3 += CodedOutputStream.p((i4 >> 31) ^ (i4 << 1));
            i++;
        }
        return i3;
    }

    public static int p(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.n(i) * size) + q(list);
    }

    public static int q(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u)) {
            int i2 = 0;
            while (i < size) {
                long longValue = list.get(i).longValue();
                i2 += CodedOutputStream.q((longValue >> 63) ^ (longValue << 1));
                i++;
            }
            return i2;
        }
        u uVar = (u) list;
        int i3 = 0;
        while (i < size) {
            long j = uVar.getLong(i);
            i3 += CodedOutputStream.q((j >> 63) ^ (j << 1));
            i++;
        }
        return i3;
    }

    public static int r(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int n = CodedOutputStream.n(i) * size;
        if (!(list instanceof ayy)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                n = (obj instanceof ByteString ? CodedOutputStream.h((ByteString) obj) : CodedOutputStream.m((String) obj)) + n;
                i2++;
            }
            return n;
        }
        ayy ayyVar = (ayy) list;
        while (i2 < size) {
            Object raw = ayyVar.getRaw(i2);
            n = (raw instanceof ByteString ? CodedOutputStream.h((ByteString) raw) : CodedOutputStream.m((String) raw)) + n;
            i2++;
        }
        return n;
    }

    public static int s(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.n(i) * size) + t(list);
    }

    public static int t(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof p)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.p(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        p pVar = (p) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.p(pVar.getInt(i));
            i++;
        }
        return i3;
    }

    public static int u(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.n(i) * size) + v(list);
    }

    public static int v(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.q(list.get(i).longValue());
                i++;
            }
            return i2;
        }
        u uVar = (u) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.q(uVar.getLong(i));
            i++;
        }
        return i3;
    }

    public static <UT, UB> UB w(int i, List<Integer> list, q.c cVar, UB ub, e0<UT, UB> e0Var) {
        if (cVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (!cVar.a()) {
                    ub = (UB) z(i, intValue, ub, e0Var);
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
            if (cVar.a()) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                ub = (UB) z(i, intValue2, ub, e0Var);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }

    public static e0<?, ?> x(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (e0) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static boolean y(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static <UT, UB> UB z(int i, int i2, UB ub, e0<UT, UB> e0Var) {
        if (ub == null) {
            ub = (UB) e0Var.m();
        }
        e0Var.e(i, i2, ub);
        return ub;
    }
}
