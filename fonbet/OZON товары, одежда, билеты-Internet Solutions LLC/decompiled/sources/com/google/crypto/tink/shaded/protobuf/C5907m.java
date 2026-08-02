package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC5906l;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5907m implements t0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5906l f59434a;

    private C5907m(AbstractC5906l abstractC5906l) {
        C5919z.a(abstractC5906l, "output");
        this.f59434a = abstractC5906l;
        abstractC5906l.f59430a = this;
    }

    public static C5907m a(AbstractC5906l abstractC5906l) {
        C5907m c5907m = abstractC5906l.f59430a;
        return c5907m != null ? c5907m : new C5907m(abstractC5906l);
    }

    public final void A(int i11, long j11) throws IOException {
        this.f59434a.s(i11, j11);
    }

    public final void B(int i11, List<Long> list, boolean z11) throws IOException {
        boolean z12 = list instanceof I;
        AbstractC5906l abstractC5906l = this.f59434a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    abstractC5906l.s(i11, list.get(i12).longValue());
                    i12++;
                }
                return;
            }
            abstractC5906l.x(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                list.get(i14).getClass();
                int i15 = AbstractC5906l.f59429d;
                i13 += 8;
            }
            abstractC5906l.z(i13);
            while (i12 < list.size()) {
                abstractC5906l.t(list.get(i12).longValue());
                i12++;
            }
            return;
        }
        I i16 = (I) list;
        if (!z11) {
            while (i12 < i16.size()) {
                abstractC5906l.s(i11, i16.getLong(i12));
                i12++;
            }
            return;
        }
        abstractC5906l.x(i11, 2);
        int i17 = 0;
        for (int i18 = 0; i18 < i16.size(); i18++) {
            i16.getLong(i18);
            int i19 = AbstractC5906l.f59429d;
            i17 += 8;
        }
        abstractC5906l.z(i17);
        while (i12 < i16.size()) {
            abstractC5906l.t(i16.getLong(i12));
            i12++;
        }
    }

    public final void C(int i11, int i12) throws IOException {
        this.f59434a.y(i11, (i12 >> 31) ^ (i12 << 1));
    }

    public final void D(int i11, List<Integer> list, boolean z11) throws IOException {
        boolean z12 = list instanceof C5918y;
        AbstractC5906l abstractC5906l = this.f59434a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    int intValue = list.get(i12).intValue();
                    abstractC5906l.y(i11, (intValue >> 31) ^ (intValue << 1));
                    i12++;
                }
                return;
            }
            abstractC5906l.x(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += AbstractC5906l.f(list.get(i14).intValue());
            }
            abstractC5906l.z(i13);
            while (i12 < list.size()) {
                int intValue2 = list.get(i12).intValue();
                abstractC5906l.z((intValue2 >> 31) ^ (intValue2 << 1));
                i12++;
            }
            return;
        }
        C5918y c5918y = (C5918y) list;
        if (!z11) {
            while (i12 < c5918y.size()) {
                int i15 = c5918y.getInt(i12);
                abstractC5906l.y(i11, (i15 >> 31) ^ (i15 << 1));
                i12++;
            }
            return;
        }
        abstractC5906l.x(i11, 2);
        int i16 = 0;
        for (int i17 = 0; i17 < c5918y.size(); i17++) {
            i16 += AbstractC5906l.f(c5918y.getInt(i17));
        }
        abstractC5906l.z(i16);
        while (i12 < c5918y.size()) {
            int i18 = c5918y.getInt(i12);
            abstractC5906l.z((i18 >> 31) ^ (i18 << 1));
            i12++;
        }
    }

    public final void E(int i11, long j11) throws IOException {
        this.f59434a.A(i11, (j11 >> 63) ^ (j11 << 1));
    }

    public final void F(int i11, List<Long> list, boolean z11) throws IOException {
        boolean z12 = list instanceof I;
        AbstractC5906l abstractC5906l = this.f59434a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    long longValue = list.get(i12).longValue();
                    abstractC5906l.A(i11, (longValue >> 63) ^ (longValue << 1));
                    i12++;
                }
                return;
            }
            abstractC5906l.x(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += AbstractC5906l.g(list.get(i14).longValue());
            }
            abstractC5906l.z(i13);
            while (i12 < list.size()) {
                long longValue2 = list.get(i12).longValue();
                abstractC5906l.B((longValue2 >> 63) ^ (longValue2 << 1));
                i12++;
            }
            return;
        }
        I i15 = (I) list;
        if (!z11) {
            while (i12 < i15.size()) {
                long j11 = i15.getLong(i12);
                abstractC5906l.A(i11, (j11 >> 63) ^ (j11 << 1));
                i12++;
            }
            return;
        }
        abstractC5906l.x(i11, 2);
        int i16 = 0;
        for (int i17 = 0; i17 < i15.size(); i17++) {
            i16 += AbstractC5906l.g(i15.getLong(i17));
        }
        abstractC5906l.z(i16);
        while (i12 < i15.size()) {
            long j12 = i15.getLong(i12);
            abstractC5906l.B((j12 >> 63) ^ (j12 << 1));
            i12++;
        }
    }

    @Deprecated
    public final void G(int i11) throws IOException {
        this.f59434a.x(i11, 3);
    }

    public final void H(int i11, String str) throws IOException {
        this.f59434a.w(i11, str);
    }

    public final void I(int i11, List<String> list) throws IOException {
        boolean z11 = list instanceof E;
        AbstractC5906l abstractC5906l = this.f59434a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                abstractC5906l.w(i11, list.get(i12));
                i12++;
            }
            return;
        }
        E e11 = (E) list;
        while (i12 < list.size()) {
            Object y11 = e11.y();
            if (y11 instanceof String) {
                abstractC5906l.w(i11, (String) y11);
            } else {
                abstractC5906l.p(i11, (AbstractC5903i) y11);
            }
            i12++;
        }
    }

    public final void J(int i11, int i12) throws IOException {
        this.f59434a.y(i11, i12);
    }

    public final void K(int i11, List<Integer> list, boolean z11) throws IOException {
        boolean z12 = list instanceof C5918y;
        AbstractC5906l abstractC5906l = this.f59434a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    abstractC5906l.y(i11, list.get(i12).intValue());
                    i12++;
                }
                return;
            }
            abstractC5906l.x(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += AbstractC5906l.j(list.get(i14).intValue());
            }
            abstractC5906l.z(i13);
            while (i12 < list.size()) {
                abstractC5906l.z(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        C5918y c5918y = (C5918y) list;
        if (!z11) {
            while (i12 < c5918y.size()) {
                abstractC5906l.y(i11, c5918y.getInt(i12));
                i12++;
            }
            return;
        }
        abstractC5906l.x(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < c5918y.size(); i16++) {
            i15 += AbstractC5906l.j(c5918y.getInt(i16));
        }
        abstractC5906l.z(i15);
        while (i12 < c5918y.size()) {
            abstractC5906l.z(c5918y.getInt(i12));
            i12++;
        }
    }

    public final void L(int i11, long j11) throws IOException {
        this.f59434a.A(i11, j11);
    }

    public final void M(int i11, List<Long> list, boolean z11) throws IOException {
        boolean z12 = list instanceof I;
        AbstractC5906l abstractC5906l = this.f59434a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    abstractC5906l.A(i11, list.get(i12).longValue());
                    i12++;
                }
                return;
            }
            abstractC5906l.x(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += AbstractC5906l.k(list.get(i14).longValue());
            }
            abstractC5906l.z(i13);
            while (i12 < list.size()) {
                abstractC5906l.B(list.get(i12).longValue());
                i12++;
            }
            return;
        }
        I i15 = (I) list;
        if (!z11) {
            while (i12 < i15.size()) {
                abstractC5906l.A(i11, i15.getLong(i12));
                i12++;
            }
            return;
        }
        abstractC5906l.x(i11, 2);
        int i16 = 0;
        for (int i17 = 0; i17 < i15.size(); i17++) {
            i16 += AbstractC5906l.k(i15.getLong(i17));
        }
        abstractC5906l.z(i16);
        while (i12 < i15.size()) {
            abstractC5906l.B(i15.getLong(i12));
            i12++;
        }
    }

    public final void b(int i11, boolean z11) throws IOException {
        this.f59434a.o(i11, z11);
    }

    public final void c(int i11, List<Boolean> list, boolean z11) throws IOException {
        boolean z12 = list instanceof C5900f;
        AbstractC5906l abstractC5906l = this.f59434a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    abstractC5906l.o(i11, list.get(i12).booleanValue());
                    i12++;
                }
                return;
            }
            abstractC5906l.x(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                list.get(i14).getClass();
                int i15 = AbstractC5906l.f59429d;
                i13++;
            }
            abstractC5906l.z(i13);
            while (i12 < list.size()) {
                abstractC5906l.n(list.get(i12).booleanValue() ? (byte) 1 : (byte) 0);
                i12++;
            }
            return;
        }
        C5900f c5900f = (C5900f) list;
        if (!z11) {
            while (i12 < c5900f.size()) {
                abstractC5906l.o(i11, c5900f.getBoolean(i12));
                i12++;
            }
            return;
        }
        abstractC5906l.x(i11, 2);
        int i16 = 0;
        for (int i17 = 0; i17 < c5900f.size(); i17++) {
            c5900f.getBoolean(i17);
            int i18 = AbstractC5906l.f59429d;
            i16++;
        }
        abstractC5906l.z(i16);
        while (i12 < c5900f.size()) {
            abstractC5906l.n(c5900f.getBoolean(i12) ? (byte) 1 : (byte) 0);
            i12++;
        }
    }

    public final void d(int i11, AbstractC5903i abstractC5903i) throws IOException {
        this.f59434a.p(i11, abstractC5903i);
    }

    public final void e(int i11, List<AbstractC5903i> list) throws IOException {
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.f59434a.p(i11, list.get(i12));
        }
    }

    public final void f(int i11, double d11) throws IOException {
        AbstractC5906l abstractC5906l = this.f59434a;
        abstractC5906l.getClass();
        abstractC5906l.s(i11, Double.doubleToRawLongBits(d11));
    }

    public final void g(int i11, List<Double> list, boolean z11) throws IOException {
        boolean z12 = list instanceof C5908n;
        AbstractC5906l abstractC5906l = this.f59434a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    double doubleValue = list.get(i12).doubleValue();
                    abstractC5906l.getClass();
                    abstractC5906l.s(i11, Double.doubleToRawLongBits(doubleValue));
                    i12++;
                }
                return;
            }
            abstractC5906l.x(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                list.get(i14).getClass();
                int i15 = AbstractC5906l.f59429d;
                i13 += 8;
            }
            abstractC5906l.z(i13);
            while (i12 < list.size()) {
                abstractC5906l.t(Double.doubleToRawLongBits(list.get(i12).doubleValue()));
                i12++;
            }
            return;
        }
        C5908n c5908n = (C5908n) list;
        if (!z11) {
            while (i12 < c5908n.size()) {
                double d11 = c5908n.getDouble(i12);
                abstractC5906l.getClass();
                abstractC5906l.s(i11, Double.doubleToRawLongBits(d11));
                i12++;
            }
            return;
        }
        abstractC5906l.x(i11, 2);
        int i16 = 0;
        for (int i17 = 0; i17 < c5908n.size(); i17++) {
            c5908n.getDouble(i17);
            int i18 = AbstractC5906l.f59429d;
            i16 += 8;
        }
        abstractC5906l.z(i16);
        while (i12 < c5908n.size()) {
            abstractC5906l.t(Double.doubleToRawLongBits(c5908n.getDouble(i12)));
            i12++;
        }
    }

    @Deprecated
    public final void h(int i11) throws IOException {
        this.f59434a.x(i11, 4);
    }

    public final void i(int i11, int i12) throws IOException {
        this.f59434a.u(i11, i12);
    }

    public final void j(int i11, List<Integer> list, boolean z11) throws IOException {
        boolean z12 = list instanceof C5918y;
        AbstractC5906l abstractC5906l = this.f59434a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    abstractC5906l.u(i11, list.get(i12).intValue());
                    i12++;
                }
                return;
            }
            abstractC5906l.x(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += AbstractC5906l.k(list.get(i14).intValue());
            }
            abstractC5906l.z(i13);
            while (i12 < list.size()) {
                abstractC5906l.v(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        C5918y c5918y = (C5918y) list;
        if (!z11) {
            while (i12 < c5918y.size()) {
                abstractC5906l.u(i11, c5918y.getInt(i12));
                i12++;
            }
            return;
        }
        abstractC5906l.x(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < c5918y.size(); i16++) {
            i15 += AbstractC5906l.k(c5918y.getInt(i16));
        }
        abstractC5906l.z(i15);
        while (i12 < c5918y.size()) {
            abstractC5906l.v(c5918y.getInt(i12));
            i12++;
        }
    }

    public final void k(int i11, int i12) throws IOException {
        this.f59434a.q(i11, i12);
    }

    public final void l(int i11, List<Integer> list, boolean z11) throws IOException {
        boolean z12 = list instanceof C5918y;
        AbstractC5906l abstractC5906l = this.f59434a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    abstractC5906l.q(i11, list.get(i12).intValue());
                    i12++;
                }
                return;
            }
            abstractC5906l.x(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                list.get(i14).getClass();
                int i15 = AbstractC5906l.f59429d;
                i13 += 4;
            }
            abstractC5906l.z(i13);
            while (i12 < list.size()) {
                abstractC5906l.r(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        C5918y c5918y = (C5918y) list;
        if (!z11) {
            while (i12 < c5918y.size()) {
                abstractC5906l.q(i11, c5918y.getInt(i12));
                i12++;
            }
            return;
        }
        abstractC5906l.x(i11, 2);
        int i16 = 0;
        for (int i17 = 0; i17 < c5918y.size(); i17++) {
            c5918y.getInt(i17);
            int i18 = AbstractC5906l.f59429d;
            i16 += 4;
        }
        abstractC5906l.z(i16);
        while (i12 < c5918y.size()) {
            abstractC5906l.r(c5918y.getInt(i12));
            i12++;
        }
    }

    public final void m(int i11, long j11) throws IOException {
        this.f59434a.s(i11, j11);
    }

    public final void n(int i11, List<Long> list, boolean z11) throws IOException {
        boolean z12 = list instanceof I;
        AbstractC5906l abstractC5906l = this.f59434a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    abstractC5906l.s(i11, list.get(i12).longValue());
                    i12++;
                }
                return;
            }
            abstractC5906l.x(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                list.get(i14).getClass();
                int i15 = AbstractC5906l.f59429d;
                i13 += 8;
            }
            abstractC5906l.z(i13);
            while (i12 < list.size()) {
                abstractC5906l.t(list.get(i12).longValue());
                i12++;
            }
            return;
        }
        I i16 = (I) list;
        if (!z11) {
            while (i12 < i16.size()) {
                abstractC5906l.s(i11, i16.getLong(i12));
                i12++;
            }
            return;
        }
        abstractC5906l.x(i11, 2);
        int i17 = 0;
        for (int i18 = 0; i18 < i16.size(); i18++) {
            i16.getLong(i18);
            int i19 = AbstractC5906l.f59429d;
            i17 += 8;
        }
        abstractC5906l.z(i17);
        while (i12 < i16.size()) {
            abstractC5906l.t(i16.getLong(i12));
            i12++;
        }
    }

    public final void o(int i11, float f7) throws IOException {
        AbstractC5906l abstractC5906l = this.f59434a;
        abstractC5906l.getClass();
        abstractC5906l.q(i11, Float.floatToRawIntBits(f7));
    }

    public final void p(int i11, List<Float> list, boolean z11) throws IOException {
        boolean z12 = list instanceof C5915v;
        AbstractC5906l abstractC5906l = this.f59434a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    float floatValue = list.get(i12).floatValue();
                    abstractC5906l.getClass();
                    abstractC5906l.q(i11, Float.floatToRawIntBits(floatValue));
                    i12++;
                }
                return;
            }
            abstractC5906l.x(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                list.get(i14).getClass();
                int i15 = AbstractC5906l.f59429d;
                i13 += 4;
            }
            abstractC5906l.z(i13);
            while (i12 < list.size()) {
                abstractC5906l.r(Float.floatToRawIntBits(list.get(i12).floatValue()));
                i12++;
            }
            return;
        }
        C5915v c5915v = (C5915v) list;
        if (!z11) {
            while (i12 < c5915v.size()) {
                float f7 = c5915v.getFloat(i12);
                abstractC5906l.getClass();
                abstractC5906l.q(i11, Float.floatToRawIntBits(f7));
                i12++;
            }
            return;
        }
        abstractC5906l.x(i11, 2);
        int i16 = 0;
        for (int i17 = 0; i17 < c5915v.size(); i17++) {
            c5915v.getFloat(i17);
            int i18 = AbstractC5906l.f59429d;
            i16 += 4;
        }
        abstractC5906l.z(i16);
        while (i12 < c5915v.size()) {
            abstractC5906l.r(Float.floatToRawIntBits(c5915v.getFloat(i12)));
            i12++;
        }
    }

    public final void q(int i11, Object obj, f0 f0Var) throws IOException {
        AbstractC5906l abstractC5906l = this.f59434a;
        abstractC5906l.x(i11, 3);
        f0Var.f((S) obj, abstractC5906l.f59430a);
        abstractC5906l.x(i11, 4);
    }

    public final void r(int i11, int i12) throws IOException {
        this.f59434a.u(i11, i12);
    }

    public final void s(int i11, List<Integer> list, boolean z11) throws IOException {
        boolean z12 = list instanceof C5918y;
        AbstractC5906l abstractC5906l = this.f59434a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    abstractC5906l.u(i11, list.get(i12).intValue());
                    i12++;
                }
                return;
            }
            abstractC5906l.x(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += AbstractC5906l.k(list.get(i14).intValue());
            }
            abstractC5906l.z(i13);
            while (i12 < list.size()) {
                abstractC5906l.v(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        C5918y c5918y = (C5918y) list;
        if (!z11) {
            while (i12 < c5918y.size()) {
                abstractC5906l.u(i11, c5918y.getInt(i12));
                i12++;
            }
            return;
        }
        abstractC5906l.x(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < c5918y.size(); i16++) {
            i15 += AbstractC5906l.k(c5918y.getInt(i16));
        }
        abstractC5906l.z(i15);
        while (i12 < c5918y.size()) {
            abstractC5906l.v(c5918y.getInt(i12));
            i12++;
        }
    }

    public final void t(int i11, long j11) throws IOException {
        this.f59434a.A(i11, j11);
    }

    public final void u(int i11, List<Long> list, boolean z11) throws IOException {
        boolean z12 = list instanceof I;
        AbstractC5906l abstractC5906l = this.f59434a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    abstractC5906l.A(i11, list.get(i12).longValue());
                    i12++;
                }
                return;
            }
            abstractC5906l.x(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += AbstractC5906l.k(list.get(i14).longValue());
            }
            abstractC5906l.z(i13);
            while (i12 < list.size()) {
                abstractC5906l.B(list.get(i12).longValue());
                i12++;
            }
            return;
        }
        I i15 = (I) list;
        if (!z11) {
            while (i12 < i15.size()) {
                abstractC5906l.A(i11, i15.getLong(i12));
                i12++;
            }
            return;
        }
        abstractC5906l.x(i11, 2);
        int i16 = 0;
        for (int i17 = 0; i17 < i15.size(); i17++) {
            i16 += AbstractC5906l.k(i15.getLong(i17));
        }
        abstractC5906l.z(i16);
        while (i12 < i15.size()) {
            abstractC5906l.B(i15.getLong(i12));
            i12++;
        }
    }

    public final void v(int i11, Map map) throws IOException {
        AbstractC5906l abstractC5906l = this.f59434a;
        abstractC5906l.getClass();
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            abstractC5906l.x(i11, 2);
            entry.getKey();
            entry.getValue();
            K.b();
            throw null;
        }
    }

    public final void w(int i11, Object obj, f0 f0Var) throws IOException {
        AbstractC5895a abstractC5895a = (AbstractC5895a) obj;
        AbstractC5906l abstractC5906l = this.f59434a;
        abstractC5906l.x(i11, 2);
        abstractC5906l.z(abstractC5895a.c(f0Var));
        f0Var.f(abstractC5895a, this);
    }

    public final void x(int i11, Object obj) throws IOException {
        boolean z11 = obj instanceof AbstractC5903i;
        AbstractC5906l abstractC5906l = this.f59434a;
        if (z11) {
            AbstractC5906l.a aVar = (AbstractC5906l.a) abstractC5906l;
            aVar.x(1, 3);
            aVar.y(2, i11);
            aVar.p(3, (AbstractC5903i) obj);
            aVar.x(1, 4);
            return;
        }
        S s11 = (S) obj;
        AbstractC5906l.a aVar2 = (AbstractC5906l.a) abstractC5906l;
        aVar2.x(1, 3);
        aVar2.y(2, i11);
        aVar2.x(3, 2);
        aVar2.z(s11.getSerializedSize());
        s11.a(aVar2);
        aVar2.x(1, 4);
    }

    public final void y(int i11, int i12) throws IOException {
        this.f59434a.q(i11, i12);
    }

    public final void z(int i11, List<Integer> list, boolean z11) throws IOException {
        boolean z12 = list instanceof C5918y;
        AbstractC5906l abstractC5906l = this.f59434a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    abstractC5906l.q(i11, list.get(i12).intValue());
                    i12++;
                }
                return;
            }
            abstractC5906l.x(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                list.get(i14).getClass();
                int i15 = AbstractC5906l.f59429d;
                i13 += 4;
            }
            abstractC5906l.z(i13);
            while (i12 < list.size()) {
                abstractC5906l.r(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        C5918y c5918y = (C5918y) list;
        if (!z11) {
            while (i12 < c5918y.size()) {
                abstractC5906l.q(i11, c5918y.getInt(i12));
                i12++;
            }
            return;
        }
        abstractC5906l.x(i11, 2);
        int i16 = 0;
        for (int i17 = 0; i17 < c5918y.size(); i17++) {
            c5918y.getInt(i17);
            int i18 = AbstractC5906l.f59429d;
            i16 += 4;
        }
        abstractC5906l.z(i16);
        while (i12 < c5918y.size()) {
            abstractC5906l.r(c5918y.getInt(i12));
            i12++;
        }
    }
}
