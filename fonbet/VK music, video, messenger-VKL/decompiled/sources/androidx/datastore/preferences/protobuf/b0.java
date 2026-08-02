package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.m;
import androidx.datastore.preferences.protobuf.p;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.logging.Logger;
import xsna.byy;
import xsna.la20;
import xsna.m8h0;
import xsna.v8e0;

/* compiled from: SchemaUtil.java */
/* loaded from: classes.dex */
public final class b0 {
    public static final Class<?> a;
    public static final e0<?, ?> b;
    public static final g0 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        v8e0 v8e0Var = v8e0.c;
        e0<?, ?> e0Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            v8e0 v8e0Var2 = v8e0.c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                e0Var = (e0) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = e0Var;
        c = new g0();
    }

    public static void A(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((h) writer).a;
        int i2 = 0;
        if (!(list instanceof s)) {
            if (!z) {
                while (i2 < list.size()) {
                    long longValue = list.get(i2).longValue();
                    codedOutputStream.L(i, (longValue >> 63) ^ (longValue << 1));
                    i2++;
                }
                return;
            }
            codedOutputStream.I(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.l(list.get(i4).longValue());
            }
            codedOutputStream.K(i3);
            while (i2 < list.size()) {
                long longValue2 = list.get(i2).longValue();
                codedOutputStream.M((longValue2 >> 63) ^ (longValue2 << 1));
                i2++;
            }
            return;
        }
        s sVar = (s) list;
        if (!z) {
            while (i2 < sVar.size()) {
                long j = sVar.getLong(i2);
                codedOutputStream.L(i, (j >> 63) ^ (j << 1));
                i2++;
            }
            return;
        }
        codedOutputStream.I(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < sVar.size(); i6++) {
            i5 += CodedOutputStream.l(sVar.getLong(i6));
        }
        codedOutputStream.K(i5);
        while (i2 < sVar.size()) {
            long j2 = sVar.getLong(i2);
            codedOutputStream.M((j2 >> 63) ^ (j2 << 1));
            i2++;
        }
    }

    public static void B(int i, List<String> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((h) writer).a;
        int i2 = 0;
        if (!(list instanceof byy)) {
            while (i2 < list.size()) {
                codedOutputStream.G(i, list.get(i2));
                i2++;
            }
            return;
        }
        byy byyVar = (byy) list;
        while (i2 < list.size()) {
            Object D0 = byyVar.D0();
            if (D0 instanceof String) {
                codedOutputStream.G(i, (String) D0);
            } else {
                codedOutputStream.u(i, (ByteString) D0);
            }
            i2++;
        }
    }

    public static void C(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((h) writer).a;
        int i2 = 0;
        if (!(list instanceof o)) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream.J(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            codedOutputStream.I(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.o(list.get(i4).intValue());
            }
            codedOutputStream.K(i3);
            while (i2 < list.size()) {
                codedOutputStream.K(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        o oVar = (o) list;
        if (!z) {
            while (i2 < oVar.size()) {
                codedOutputStream.J(i, oVar.getInt(i2));
                i2++;
            }
            return;
        }
        codedOutputStream.I(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < oVar.size(); i6++) {
            i5 += CodedOutputStream.o(oVar.getInt(i6));
        }
        codedOutputStream.K(i5);
        while (i2 < oVar.size()) {
            codedOutputStream.K(oVar.getInt(i2));
            i2++;
        }
    }

    public static void D(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((h) writer).a;
        int i2 = 0;
        if (!(list instanceof s)) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream.L(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            codedOutputStream.I(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.p(list.get(i4).longValue());
            }
            codedOutputStream.K(i3);
            while (i2 < list.size()) {
                codedOutputStream.M(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        s sVar = (s) list;
        if (!z) {
            while (i2 < sVar.size()) {
                codedOutputStream.L(i, sVar.getLong(i2));
                i2++;
            }
            return;
        }
        codedOutputStream.I(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < sVar.size(); i6++) {
            i5 += CodedOutputStream.p(sVar.getLong(i6));
        }
        codedOutputStream.K(i5);
        while (i2 < sVar.size()) {
            codedOutputStream.M(sVar.getLong(i2));
            i2++;
        }
    }

    public static int a(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof o)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.p(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        o oVar = (o) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.p(oVar.getInt(i));
            i++;
        }
        return i3;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.n(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.n(i) + 8) * size;
    }

    public static int d(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof o)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.p(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        o oVar = (o) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.p(oVar.getInt(i));
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
        if (!(list instanceof s)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.p(list.get(i).longValue());
                i++;
            }
            return i2;
        }
        s sVar = (s) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.p(sVar.getLong(i));
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
        if (!(list instanceof o)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.k(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        o oVar = (o) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.k(oVar.getInt(i));
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
        if (!(list instanceof s)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.l(list.get(i).longValue());
                i++;
            }
            return i2;
        }
        s sVar = (s) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.l(sVar.getLong(i));
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
        if (!(list instanceof o)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.o(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        o oVar = (o) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.o(oVar.getInt(i));
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
        if (!(list instanceof s)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream.p(list.get(i).longValue());
                i++;
            }
            return i2;
        }
        s sVar = (s) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream.p(sVar.getLong(i));
            i++;
        }
        return i3;
    }

    public static <UT, UB> UB j(Object obj, int i, List<Integer> list, p.b bVar, UB ub, e0<UT, UB> e0Var) {
        if (bVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (!bVar.a()) {
                    if (ub == null) {
                        ub = (UB) e0Var.f(obj);
                    }
                    e0Var.e(i, intValue, ub);
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
            if (bVar.a()) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                if (ub == null) {
                    ub = (UB) e0Var.f(obj);
                }
                e0Var.e(i, intValue2, ub);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }

    public static <T, FT extends m.b<FT>> void k(k<FT> kVar, T t, T t2) {
        m<FT> c2 = kVar.c(t2);
        if (c2.a.isEmpty()) {
            return;
        }
        m<FT> d = kVar.d(t);
        d.getClass();
        c0 c0Var = c2.a;
        if (c0Var.b.size() > 0) {
            d.i(c0Var.c(0));
            throw null;
        }
        Iterator<T> it = c0Var.d().iterator();
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

    public static void m(int i, List<Boolean> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((h) writer).a;
        int i2 = 0;
        if (!(list instanceof d)) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream.s(i, list.get(i2).booleanValue());
                    i2++;
                }
                return;
            }
            codedOutputStream.I(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                Logger logger = CodedOutputStream.d;
                i3++;
            }
            codedOutputStream.K(i3);
            while (i2 < list.size()) {
                codedOutputStream.r(list.get(i2).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        d dVar = (d) list;
        if (!z) {
            while (i2 < dVar.size()) {
                codedOutputStream.s(i, dVar.getBoolean(i2));
                i2++;
            }
            return;
        }
        codedOutputStream.I(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < dVar.size(); i6++) {
            dVar.getBoolean(i6);
            Logger logger2 = CodedOutputStream.d;
            i5++;
        }
        codedOutputStream.K(i5);
        while (i2 < dVar.size()) {
            codedOutputStream.r(dVar.getBoolean(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void n(int i, List<ByteString> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        h hVar = (h) writer;
        hVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            hVar.a.u(i, list.get(i2));
        }
    }

    public static void o(int i, List<Double> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((h) writer).a;
        int i2 = 0;
        if (!(list instanceof i)) {
            if (!z) {
                while (i2 < list.size()) {
                    double doubleValue = list.get(i2).doubleValue();
                    codedOutputStream.getClass();
                    codedOutputStream.y(i, Double.doubleToRawLongBits(doubleValue));
                    i2++;
                }
                return;
            }
            codedOutputStream.I(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                Logger logger = CodedOutputStream.d;
                i3 += 8;
            }
            codedOutputStream.K(i3);
            while (i2 < list.size()) {
                codedOutputStream.z(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                i2++;
            }
            return;
        }
        i iVar = (i) list;
        if (!z) {
            while (i2 < iVar.size()) {
                double d = iVar.getDouble(i2);
                codedOutputStream.getClass();
                codedOutputStream.y(i, Double.doubleToRawLongBits(d));
                i2++;
            }
            return;
        }
        codedOutputStream.I(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < iVar.size(); i6++) {
            iVar.getDouble(i6);
            Logger logger2 = CodedOutputStream.d;
            i5 += 8;
        }
        codedOutputStream.K(i5);
        while (i2 < iVar.size()) {
            codedOutputStream.z(Double.doubleToRawLongBits(iVar.getDouble(i2)));
            i2++;
        }
    }

    public static void p(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((h) writer).a;
        int i2 = 0;
        if (!(list instanceof o)) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream.A(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            codedOutputStream.I(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.p(list.get(i4).intValue());
            }
            codedOutputStream.K(i3);
            while (i2 < list.size()) {
                codedOutputStream.B(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        o oVar = (o) list;
        if (!z) {
            while (i2 < oVar.size()) {
                codedOutputStream.A(i, oVar.getInt(i2));
                i2++;
            }
            return;
        }
        codedOutputStream.I(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < oVar.size(); i6++) {
            i5 += CodedOutputStream.p(oVar.getInt(i6));
        }
        codedOutputStream.K(i5);
        while (i2 < oVar.size()) {
            codedOutputStream.B(oVar.getInt(i2));
            i2++;
        }
    }

    public static void q(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((h) writer).a;
        int i2 = 0;
        if (!(list instanceof o)) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream.w(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            codedOutputStream.I(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                Logger logger = CodedOutputStream.d;
                i3 += 4;
            }
            codedOutputStream.K(i3);
            while (i2 < list.size()) {
                codedOutputStream.x(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        o oVar = (o) list;
        if (!z) {
            while (i2 < oVar.size()) {
                codedOutputStream.w(i, oVar.getInt(i2));
                i2++;
            }
            return;
        }
        codedOutputStream.I(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < oVar.size(); i6++) {
            oVar.getInt(i6);
            Logger logger2 = CodedOutputStream.d;
            i5 += 4;
        }
        codedOutputStream.K(i5);
        while (i2 < oVar.size()) {
            codedOutputStream.x(oVar.getInt(i2));
            i2++;
        }
    }

    public static void r(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((h) writer).a;
        int i2 = 0;
        if (!(list instanceof s)) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream.y(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            codedOutputStream.I(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                Logger logger = CodedOutputStream.d;
                i3 += 8;
            }
            codedOutputStream.K(i3);
            while (i2 < list.size()) {
                codedOutputStream.z(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        s sVar = (s) list;
        if (!z) {
            while (i2 < sVar.size()) {
                codedOutputStream.y(i, sVar.getLong(i2));
                i2++;
            }
            return;
        }
        codedOutputStream.I(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < sVar.size(); i6++) {
            sVar.getLong(i6);
            Logger logger2 = CodedOutputStream.d;
            i5 += 8;
        }
        codedOutputStream.K(i5);
        while (i2 < sVar.size()) {
            codedOutputStream.z(sVar.getLong(i2));
            i2++;
        }
    }

    public static void s(int i, List<Float> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((h) writer).a;
        int i2 = 0;
        if (!(list instanceof n)) {
            if (!z) {
                while (i2 < list.size()) {
                    float floatValue = list.get(i2).floatValue();
                    codedOutputStream.getClass();
                    codedOutputStream.w(i, Float.floatToRawIntBits(floatValue));
                    i2++;
                }
                return;
            }
            codedOutputStream.I(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                Logger logger = CodedOutputStream.d;
                i3 += 4;
            }
            codedOutputStream.K(i3);
            while (i2 < list.size()) {
                codedOutputStream.x(Float.floatToRawIntBits(list.get(i2).floatValue()));
                i2++;
            }
            return;
        }
        n nVar = (n) list;
        if (!z) {
            while (i2 < nVar.size()) {
                float f = nVar.getFloat(i2);
                codedOutputStream.getClass();
                codedOutputStream.w(i, Float.floatToRawIntBits(f));
                i2++;
            }
            return;
        }
        codedOutputStream.I(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < nVar.size(); i6++) {
            nVar.getFloat(i6);
            Logger logger2 = CodedOutputStream.d;
            i5 += 4;
        }
        codedOutputStream.K(i5);
        while (i2 < nVar.size()) {
            codedOutputStream.x(Float.floatToRawIntBits(nVar.getFloat(i2)));
            i2++;
        }
    }

    public static void t(int i, List<?> list, Writer writer, m8h0 m8h0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        h hVar = (h) writer;
        hVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            hVar.b(i, list.get(i2), m8h0Var);
        }
    }

    public static void u(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((h) writer).a;
        int i2 = 0;
        if (!(list instanceof o)) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream.A(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            codedOutputStream.I(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.p(list.get(i4).intValue());
            }
            codedOutputStream.K(i3);
            while (i2 < list.size()) {
                codedOutputStream.B(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        o oVar = (o) list;
        if (!z) {
            while (i2 < oVar.size()) {
                codedOutputStream.A(i, oVar.getInt(i2));
                i2++;
            }
            return;
        }
        codedOutputStream.I(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < oVar.size(); i6++) {
            i5 += CodedOutputStream.p(oVar.getInt(i6));
        }
        codedOutputStream.K(i5);
        while (i2 < oVar.size()) {
            codedOutputStream.B(oVar.getInt(i2));
            i2++;
        }
    }

    public static void v(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((h) writer).a;
        int i2 = 0;
        if (!(list instanceof s)) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream.L(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            codedOutputStream.I(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.p(list.get(i4).longValue());
            }
            codedOutputStream.K(i3);
            while (i2 < list.size()) {
                codedOutputStream.M(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        s sVar = (s) list;
        if (!z) {
            while (i2 < sVar.size()) {
                codedOutputStream.L(i, sVar.getLong(i2));
                i2++;
            }
            return;
        }
        codedOutputStream.I(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < sVar.size(); i6++) {
            i5 += CodedOutputStream.p(sVar.getLong(i6));
        }
        codedOutputStream.K(i5);
        while (i2 < sVar.size()) {
            codedOutputStream.M(sVar.getLong(i2));
            i2++;
        }
    }

    public static void w(int i, List<?> list, Writer writer, m8h0 m8h0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        h hVar = (h) writer;
        hVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            hVar.a.C(i, (la20) list.get(i2), m8h0Var);
        }
    }

    public static void x(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((h) writer).a;
        int i2 = 0;
        if (!(list instanceof o)) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream.w(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            codedOutputStream.I(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                Logger logger = CodedOutputStream.d;
                i3 += 4;
            }
            codedOutputStream.K(i3);
            while (i2 < list.size()) {
                codedOutputStream.x(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        o oVar = (o) list;
        if (!z) {
            while (i2 < oVar.size()) {
                codedOutputStream.w(i, oVar.getInt(i2));
                i2++;
            }
            return;
        }
        codedOutputStream.I(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < oVar.size(); i6++) {
            oVar.getInt(i6);
            Logger logger2 = CodedOutputStream.d;
            i5 += 4;
        }
        codedOutputStream.K(i5);
        while (i2 < oVar.size()) {
            codedOutputStream.x(oVar.getInt(i2));
            i2++;
        }
    }

    public static void y(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((h) writer).a;
        int i2 = 0;
        if (!(list instanceof s)) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream.y(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            codedOutputStream.I(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                Logger logger = CodedOutputStream.d;
                i3 += 8;
            }
            codedOutputStream.K(i3);
            while (i2 < list.size()) {
                codedOutputStream.z(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        s sVar = (s) list;
        if (!z) {
            while (i2 < sVar.size()) {
                codedOutputStream.y(i, sVar.getLong(i2));
                i2++;
            }
            return;
        }
        codedOutputStream.I(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < sVar.size(); i6++) {
            sVar.getLong(i6);
            Logger logger2 = CodedOutputStream.d;
            i5 += 8;
        }
        codedOutputStream.K(i5);
        while (i2 < sVar.size()) {
            codedOutputStream.z(sVar.getLong(i2));
            i2++;
        }
    }

    public static void z(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((h) writer).a;
        int i2 = 0;
        if (!(list instanceof o)) {
            if (!z) {
                while (i2 < list.size()) {
                    int intValue = list.get(i2).intValue();
                    codedOutputStream.J(i, (intValue >> 31) ^ (intValue << 1));
                    i2++;
                }
                return;
            }
            codedOutputStream.I(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.k(list.get(i4).intValue());
            }
            codedOutputStream.K(i3);
            while (i2 < list.size()) {
                int intValue2 = list.get(i2).intValue();
                codedOutputStream.K((intValue2 >> 31) ^ (intValue2 << 1));
                i2++;
            }
            return;
        }
        o oVar = (o) list;
        if (!z) {
            while (i2 < oVar.size()) {
                int i5 = oVar.getInt(i2);
                codedOutputStream.J(i, (i5 >> 31) ^ (i5 << 1));
                i2++;
            }
            return;
        }
        codedOutputStream.I(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < oVar.size(); i7++) {
            i6 += CodedOutputStream.k(oVar.getInt(i7));
        }
        codedOutputStream.K(i6);
        while (i2 < oVar.size()) {
            int i8 = oVar.getInt(i2);
            codedOutputStream.K((i8 >> 31) ^ (i8 << 1));
            i2++;
        }
    }
}
