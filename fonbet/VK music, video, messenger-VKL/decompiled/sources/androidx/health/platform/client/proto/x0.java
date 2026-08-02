package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.b0;
import androidx.health.platform.client.proto.y;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.logging.Logger;
import xsna.ja20;
import xsna.s8e0;
import xsna.zxy;

/* compiled from: SchemaUtil.java */
/* loaded from: classes12.dex */
public final class x0 {
    public static final Class<?> a;
    public static final c1<?, ?> b;
    public static final e1 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        s8e0 s8e0Var = s8e0.c;
        c1<?, ?> c1Var = null;
        try {
            cls = Class.forName("androidx.health.platform.client.proto.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            s8e0 s8e0Var2 = s8e0.c;
            try {
                cls2 = Class.forName("androidx.health.platform.client.proto.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                c1Var = (c1) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = c1Var;
        c = new e1();
    }

    public static void A(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((h) writer).a;
        int i2 = 0;
        if (!(list instanceof a0)) {
            if (!z) {
                while (i2 < list.size()) {
                    int intValue = list.get(i2).intValue();
                    codedOutputStream.T(i, (intValue >> 31) ^ (intValue << 1));
                    i2++;
                }
                return;
            }
            codedOutputStream.S(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.v(list.get(i4).intValue());
            }
            codedOutputStream.U(i3);
            while (i2 < list.size()) {
                int intValue2 = list.get(i2).intValue();
                codedOutputStream.U((intValue2 >> 31) ^ (intValue2 << 1));
                i2++;
            }
            return;
        }
        a0 a0Var = (a0) list;
        if (!z) {
            while (i2 < a0Var.d) {
                int i5 = a0Var.getInt(i2);
                codedOutputStream.T(i, (i5 >> 31) ^ (i5 << 1));
                i2++;
            }
            return;
        }
        codedOutputStream.S(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < a0Var.d; i7++) {
            i6 += CodedOutputStream.v(a0Var.getInt(i7));
        }
        codedOutputStream.U(i6);
        while (i2 < a0Var.d) {
            int i8 = a0Var.getInt(i2);
            codedOutputStream.U((i8 >> 31) ^ (i8 << 1));
            i2++;
        }
    }

    public static void B(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((h) writer).a;
        int i2 = 0;
        if (!(list instanceof e0)) {
            if (!z) {
                while (i2 < list.size()) {
                    long longValue = list.get(i2).longValue();
                    codedOutputStream.V(i, (longValue >> 63) ^ (longValue << 1));
                    i2++;
                }
                return;
            }
            codedOutputStream.S(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.w(list.get(i4).longValue());
            }
            codedOutputStream.U(i3);
            while (i2 < list.size()) {
                long longValue2 = list.get(i2).longValue();
                codedOutputStream.W((longValue2 >> 63) ^ (longValue2 << 1));
                i2++;
            }
            return;
        }
        e0 e0Var = (e0) list;
        if (!z) {
            while (i2 < e0Var.d) {
                long j = e0Var.getLong(i2);
                codedOutputStream.V(i, (j >> 63) ^ (j << 1));
                i2++;
            }
            return;
        }
        codedOutputStream.S(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < e0Var.d; i6++) {
            i5 += CodedOutputStream.w(e0Var.getLong(i6));
        }
        codedOutputStream.U(i5);
        while (i2 < e0Var.d) {
            long j2 = e0Var.getLong(i2);
            codedOutputStream.W((j2 >> 63) ^ (j2 << 1));
            i2++;
        }
    }

    public static void C(int i, List<String> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((h) writer).a;
        int i2 = 0;
        if (!(list instanceof zxy)) {
            while (i2 < list.size()) {
                codedOutputStream.Q(i, list.get(i2));
                i2++;
            }
            return;
        }
        zxy zxyVar = (zxy) list;
        while (i2 < list.size()) {
            Object D0 = zxyVar.D0();
            if (D0 instanceof String) {
                codedOutputStream.Q(i, (String) D0);
            } else {
                codedOutputStream.E(i, (ByteString) D0);
            }
            i2++;
        }
    }

    public static void D(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((h) writer).a;
        int i2 = 0;
        if (!(list instanceof a0)) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream.T(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            codedOutputStream.S(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.z(list.get(i4).intValue());
            }
            codedOutputStream.U(i3);
            while (i2 < list.size()) {
                codedOutputStream.U(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        a0 a0Var = (a0) list;
        if (!z) {
            while (i2 < a0Var.d) {
                codedOutputStream.T(i, a0Var.getInt(i2));
                i2++;
            }
            return;
        }
        codedOutputStream.S(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < a0Var.d; i6++) {
            i5 += CodedOutputStream.z(a0Var.getInt(i6));
        }
        codedOutputStream.U(i5);
        while (i2 < a0Var.d) {
            codedOutputStream.U(a0Var.getInt(i2));
            i2++;
        }
    }

    public static void E(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((h) writer).a;
        int i2 = 0;
        if (!(list instanceof e0)) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream.V(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            codedOutputStream.S(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.A(list.get(i4).longValue());
            }
            codedOutputStream.U(i3);
            while (i2 < list.size()) {
                codedOutputStream.W(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        e0 e0Var = (e0) list;
        if (!z) {
            while (i2 < e0Var.d) {
                codedOutputStream.V(i, e0Var.getLong(i2));
                i2++;
            }
            return;
        }
        codedOutputStream.S(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < e0Var.d; i6++) {
            i5 += CodedOutputStream.A(e0Var.getLong(i6));
        }
        codedOutputStream.U(i5);
        while (i2 < e0Var.d) {
            codedOutputStream.W(e0Var.getLong(i2));
            i2++;
        }
    }

    public static int a(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof a0)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.A(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        a0 a0Var = (a0) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.A(a0Var.getInt(i));
            i++;
        }
        return i3;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.y(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.y(i) + 8) * size;
    }

    public static int d(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof a0)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.A(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        a0 a0Var = (a0) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.A(a0Var.getInt(i));
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
        if (!(list instanceof e0)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.A(list.get(i).longValue());
                i++;
            }
            return i2;
        }
        e0 e0Var = (e0) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.A(e0Var.getLong(i));
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
        if (!(list instanceof a0)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.v(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        a0 a0Var = (a0) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.v(a0Var.getInt(i));
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
        if (!(list instanceof e0)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.w(list.get(i).longValue());
                i++;
            }
            return i2;
        }
        e0 e0Var = (e0) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.w(e0Var.getLong(i));
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
        if (!(list instanceof a0)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.z(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        a0 a0Var = (a0) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.z(a0Var.getInt(i));
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
        if (!(list instanceof e0)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.A(list.get(i).longValue());
                i++;
            }
            return i2;
        }
        e0 e0Var = (e0) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.A(e0Var.getLong(i));
            i++;
        }
        return i3;
    }

    public static <UT, UB> UB j(Object obj, int i, List<Integer> list, b0.c cVar, UB ub, c1<UT, UB> c1Var) {
        if (cVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (!cVar.isInRange(intValue)) {
                    ub = (UB) m(obj, i, intValue, ub, c1Var);
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
            if (cVar.isInRange(intValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                ub = (UB) m(obj, i, intValue2, ub, c1Var);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }

    public static <T, FT extends y.b<FT>> void k(w<FT> wVar, T t, T t2) {
        y<FT> c2 = wVar.c(t2);
        if (c2.a.isEmpty()) {
            return;
        }
        y<FT> d = wVar.d(t);
        d.getClass();
        y0 y0Var = c2.a;
        if (y0Var.b.size() > 0) {
            d.i(y0Var.c(0));
            throw null;
        }
        Iterator<T> it = y0Var.d().iterator();
        if (it.hasNext()) {
            d.i((Map.Entry) it.next());
            throw null;
        }
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static <UT, UB> UB m(Object obj, int i, int i2, UB ub, c1<UT, UB> c1Var) {
        if (ub == null) {
            ub = (UB) c1Var.c(obj);
        }
        c1Var.b(i, i2, ub);
        return ub;
    }

    public static void n(int i, List<Boolean> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((h) writer).a;
        int i2 = 0;
        if (!(list instanceof e)) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream.C(i, list.get(i2).booleanValue());
                    i2++;
                }
                return;
            }
            codedOutputStream.S(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                Logger logger = CodedOutputStream.b;
                i3++;
            }
            codedOutputStream.U(i3);
            while (i2 < list.size()) {
                codedOutputStream.B(list.get(i2).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        e eVar = (e) list;
        if (!z) {
            while (i2 < eVar.d) {
                eVar.d(i2);
                codedOutputStream.C(i, eVar.c[i2]);
                i2++;
            }
            return;
        }
        codedOutputStream.S(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < eVar.d; i6++) {
            eVar.d(i6);
            boolean z2 = eVar.c[i6];
            Logger logger2 = CodedOutputStream.b;
            i5++;
        }
        codedOutputStream.U(i5);
        while (i2 < eVar.d) {
            eVar.d(i2);
            codedOutputStream.B(eVar.c[i2] ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void o(int i, List<ByteString> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        h hVar = (h) writer;
        hVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            hVar.a.E(i, list.get(i2));
        }
    }

    public static void p(int i, List<Double> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((h) writer).a;
        int i2 = 0;
        if (!(list instanceof s)) {
            if (!z) {
                while (i2 < list.size()) {
                    double doubleValue = list.get(i2).doubleValue();
                    codedOutputStream.getClass();
                    codedOutputStream.I(i, Double.doubleToRawLongBits(doubleValue));
                    i2++;
                }
                return;
            }
            codedOutputStream.S(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                Logger logger = CodedOutputStream.b;
                i3 += 8;
            }
            codedOutputStream.U(i3);
            while (i2 < list.size()) {
                codedOutputStream.J(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                i2++;
            }
            return;
        }
        s sVar = (s) list;
        if (!z) {
            while (i2 < sVar.d) {
                sVar.d(i2);
                double d = sVar.c[i2];
                codedOutputStream.getClass();
                codedOutputStream.I(i, Double.doubleToRawLongBits(d));
                i2++;
            }
            return;
        }
        codedOutputStream.S(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < sVar.d; i6++) {
            sVar.d(i6);
            double d2 = sVar.c[i6];
            Logger logger2 = CodedOutputStream.b;
            i5 += 8;
        }
        codedOutputStream.U(i5);
        while (i2 < sVar.d) {
            sVar.d(i2);
            codedOutputStream.J(Double.doubleToRawLongBits(sVar.c[i2]));
            i2++;
        }
    }

    public static void q(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((h) writer).a;
        int i2 = 0;
        if (!(list instanceof a0)) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream.K(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            codedOutputStream.S(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.A(list.get(i4).intValue());
            }
            codedOutputStream.U(i3);
            while (i2 < list.size()) {
                codedOutputStream.L(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        a0 a0Var = (a0) list;
        if (!z) {
            while (i2 < a0Var.d) {
                codedOutputStream.K(i, a0Var.getInt(i2));
                i2++;
            }
            return;
        }
        codedOutputStream.S(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < a0Var.d; i6++) {
            i5 += CodedOutputStream.A(a0Var.getInt(i6));
        }
        codedOutputStream.U(i5);
        while (i2 < a0Var.d) {
            codedOutputStream.L(a0Var.getInt(i2));
            i2++;
        }
    }

    public static void r(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((h) writer).a;
        int i2 = 0;
        if (!(list instanceof a0)) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream.G(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            codedOutputStream.S(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                Logger logger = CodedOutputStream.b;
                i3 += 4;
            }
            codedOutputStream.U(i3);
            while (i2 < list.size()) {
                codedOutputStream.H(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        a0 a0Var = (a0) list;
        if (!z) {
            while (i2 < a0Var.d) {
                codedOutputStream.G(i, a0Var.getInt(i2));
                i2++;
            }
            return;
        }
        codedOutputStream.S(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < a0Var.d; i6++) {
            a0Var.getInt(i6);
            Logger logger2 = CodedOutputStream.b;
            i5 += 4;
        }
        codedOutputStream.U(i5);
        while (i2 < a0Var.d) {
            codedOutputStream.H(a0Var.getInt(i2));
            i2++;
        }
    }

    public static void s(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((h) writer).a;
        int i2 = 0;
        if (!(list instanceof e0)) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream.I(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            codedOutputStream.S(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                Logger logger = CodedOutputStream.b;
                i3 += 8;
            }
            codedOutputStream.U(i3);
            while (i2 < list.size()) {
                codedOutputStream.J(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        e0 e0Var = (e0) list;
        if (!z) {
            while (i2 < e0Var.d) {
                codedOutputStream.I(i, e0Var.getLong(i2));
                i2++;
            }
            return;
        }
        codedOutputStream.S(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < e0Var.d; i6++) {
            e0Var.getLong(i6);
            Logger logger2 = CodedOutputStream.b;
            i5 += 8;
        }
        codedOutputStream.U(i5);
        while (i2 < e0Var.d) {
            codedOutputStream.J(e0Var.getLong(i2));
            i2++;
        }
    }

    public static void t(int i, List<Float> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((h) writer).a;
        int i2 = 0;
        if (!(list instanceof z)) {
            if (!z) {
                while (i2 < list.size()) {
                    float floatValue = list.get(i2).floatValue();
                    codedOutputStream.getClass();
                    codedOutputStream.G(i, Float.floatToRawIntBits(floatValue));
                    i2++;
                }
                return;
            }
            codedOutputStream.S(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                Logger logger = CodedOutputStream.b;
                i3 += 4;
            }
            codedOutputStream.U(i3);
            while (i2 < list.size()) {
                codedOutputStream.H(Float.floatToRawIntBits(list.get(i2).floatValue()));
                i2++;
            }
            return;
        }
        z zVar = (z) list;
        if (!z) {
            while (i2 < zVar.d) {
                zVar.d(i2);
                float f = zVar.c[i2];
                codedOutputStream.getClass();
                codedOutputStream.G(i, Float.floatToRawIntBits(f));
                i2++;
            }
            return;
        }
        codedOutputStream.S(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zVar.d; i6++) {
            zVar.d(i6);
            float f2 = zVar.c[i6];
            Logger logger2 = CodedOutputStream.b;
            i5 += 4;
        }
        codedOutputStream.U(i5);
        while (i2 < zVar.d) {
            zVar.d(i2);
            codedOutputStream.H(Float.floatToRawIntBits(zVar.c[i2]));
            i2++;
        }
    }

    public static void u(int i, List<?> list, Writer writer, w0 w0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        h hVar = (h) writer;
        hVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            hVar.b(i, list.get(i2), w0Var);
        }
    }

    public static void v(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((h) writer).a;
        int i2 = 0;
        if (!(list instanceof a0)) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream.K(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            codedOutputStream.S(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.A(list.get(i4).intValue());
            }
            codedOutputStream.U(i3);
            while (i2 < list.size()) {
                codedOutputStream.L(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        a0 a0Var = (a0) list;
        if (!z) {
            while (i2 < a0Var.d) {
                codedOutputStream.K(i, a0Var.getInt(i2));
                i2++;
            }
            return;
        }
        codedOutputStream.S(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < a0Var.d; i6++) {
            i5 += CodedOutputStream.A(a0Var.getInt(i6));
        }
        codedOutputStream.U(i5);
        while (i2 < a0Var.d) {
            codedOutputStream.L(a0Var.getInt(i2));
            i2++;
        }
    }

    public static void w(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((h) writer).a;
        int i2 = 0;
        if (!(list instanceof e0)) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream.V(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            codedOutputStream.S(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.A(list.get(i4).longValue());
            }
            codedOutputStream.U(i3);
            while (i2 < list.size()) {
                codedOutputStream.W(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        e0 e0Var = (e0) list;
        if (!z) {
            while (i2 < e0Var.d) {
                codedOutputStream.V(i, e0Var.getLong(i2));
                i2++;
            }
            return;
        }
        codedOutputStream.S(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < e0Var.d; i6++) {
            i5 += CodedOutputStream.A(e0Var.getLong(i6));
        }
        codedOutputStream.U(i5);
        while (i2 < e0Var.d) {
            codedOutputStream.W(e0Var.getLong(i2));
            i2++;
        }
    }

    public static void x(int i, List<?> list, Writer writer, w0 w0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        h hVar = (h) writer;
        hVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            hVar.a.M(i, (ja20) list.get(i2), w0Var);
        }
    }

    public static void y(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((h) writer).a;
        int i2 = 0;
        if (!(list instanceof a0)) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream.G(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            codedOutputStream.S(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                Logger logger = CodedOutputStream.b;
                i3 += 4;
            }
            codedOutputStream.U(i3);
            while (i2 < list.size()) {
                codedOutputStream.H(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        a0 a0Var = (a0) list;
        if (!z) {
            while (i2 < a0Var.d) {
                codedOutputStream.G(i, a0Var.getInt(i2));
                i2++;
            }
            return;
        }
        codedOutputStream.S(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < a0Var.d; i6++) {
            a0Var.getInt(i6);
            Logger logger2 = CodedOutputStream.b;
            i5 += 4;
        }
        codedOutputStream.U(i5);
        while (i2 < a0Var.d) {
            codedOutputStream.H(a0Var.getInt(i2));
            i2++;
        }
    }

    public static void z(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((h) writer).a;
        int i2 = 0;
        if (!(list instanceof e0)) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream.I(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            codedOutputStream.S(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                Logger logger = CodedOutputStream.b;
                i3 += 8;
            }
            codedOutputStream.U(i3);
            while (i2 < list.size()) {
                codedOutputStream.J(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        e0 e0Var = (e0) list;
        if (!z) {
            while (i2 < e0Var.d) {
                codedOutputStream.I(i, e0Var.getLong(i2));
                i2++;
            }
            return;
        }
        codedOutputStream.S(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < e0Var.d; i6++) {
            e0Var.getLong(i6);
            Logger logger2 = CodedOutputStream.b;
            i5 += 8;
        }
        codedOutputStream.U(i5);
        while (i2 < e0Var.d) {
            codedOutputStream.J(e0Var.getLong(i2));
            i2++;
        }
    }
}
