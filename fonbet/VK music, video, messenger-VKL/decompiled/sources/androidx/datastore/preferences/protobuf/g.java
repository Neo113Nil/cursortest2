package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.List;
import xsna.byy;
import xsna.m8h0;
import xsna.v8e0;

/* compiled from: CodedInputStreamReader.java */
/* loaded from: classes.dex */
public final class g implements a0 {
    public final f a;
    public int b;
    public int c;
    public int d = 0;

    /* compiled from: CodedInputStreamReader.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WireFormat$FieldType.values().length];
            a = iArr;
            try {
                iArr[WireFormat$FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[WireFormat$FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[WireFormat$FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[WireFormat$FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[WireFormat$FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[WireFormat$FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[WireFormat$FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[WireFormat$FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[WireFormat$FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[WireFormat$FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[WireFormat$FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[WireFormat$FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[WireFormat$FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[WireFormat$FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[WireFormat$FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[WireFormat$FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[WireFormat$FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public g(f fVar) {
        p.a(fVar, "input");
        this.a = fVar;
        fVar.d = this;
    }

    public static void y(int i) throws IOException {
        if ((i & 3) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
    }

    public static void z(int i) throws IOException {
        if ((i & 7) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
    }

    public final int a() throws IOException {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.v();
        }
        int i2 = this.b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public final <T> void b(T t, m8h0<T> m8h0Var, j jVar) throws IOException {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            m8h0Var.f(t, this, jVar);
            if (this.b == this.c) {
            } else {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
        } finally {
            this.c = i;
        }
    }

    public final <T> void c(T t, m8h0<T> m8h0Var, j jVar) throws IOException {
        f fVar = this.a;
        int w = fVar.w();
        if (fVar.a >= fVar.b) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int f = fVar.f(w);
        fVar.a++;
        m8h0Var.f(t, this, jVar);
        fVar.a(0);
        fVar.a--;
        fVar.e(f);
    }

    public final void d(List<Boolean> list) throws IOException {
        int v;
        int v2;
        boolean z = list instanceof d;
        f fVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Boolean.valueOf(fVar.g()));
                    if (fVar.c()) {
                        return;
                    } else {
                        v = fVar.v();
                    }
                } while (v == this.b);
                this.d = v;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.h();
            }
            int b = fVar.b() + fVar.w();
            do {
                list.add(Boolean.valueOf(fVar.g()));
            } while (fVar.b() < b);
            v(b);
            return;
        }
        d dVar = (d) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                dVar.addBoolean(fVar.g());
                if (fVar.c()) {
                    return;
                } else {
                    v2 = fVar.v();
                }
            } while (v2 == this.b);
            this.d = v2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.h();
        }
        int b2 = fVar.b() + fVar.w();
        do {
            dVar.addBoolean(fVar.g());
        } while (fVar.b() < b2);
        v(b2);
    }

    public final ByteString e() throws IOException {
        w(2);
        return this.a.h();
    }

    public final void f(List<ByteString> list) throws IOException {
        int v;
        if ((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.h();
        }
        do {
            list.add(e());
            f fVar = this.a;
            if (fVar.c()) {
                return;
            } else {
                v = fVar.v();
            }
        } while (v == this.b);
        this.d = v;
    }

    public final void g(List<Double> list) throws IOException {
        int v;
        int v2;
        boolean z = list instanceof i;
        f fVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    list.add(Double.valueOf(fVar.i()));
                    if (fVar.c()) {
                        return;
                    } else {
                        v = fVar.v();
                    }
                } while (v == this.b);
                this.d = v;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.h();
            }
            int w = fVar.w();
            z(w);
            int b = fVar.b() + w;
            do {
                list.add(Double.valueOf(fVar.i()));
            } while (fVar.b() < b);
            return;
        }
        i iVar = (i) list;
        int i2 = this.b & 7;
        if (i2 == 1) {
            do {
                iVar.addDouble(fVar.i());
                if (fVar.c()) {
                    return;
                } else {
                    v2 = fVar.v();
                }
            } while (v2 == this.b);
            this.d = v2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.h();
        }
        int w2 = fVar.w();
        z(w2);
        int b2 = fVar.b() + w2;
        do {
            iVar.addDouble(fVar.i());
        } while (fVar.b() < b2);
    }

    public final void h(List<Integer> list) throws IOException {
        int v;
        int v2;
        boolean z = list instanceof o;
        f fVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(fVar.j()));
                    if (fVar.c()) {
                        return;
                    } else {
                        v = fVar.v();
                    }
                } while (v == this.b);
                this.d = v;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.h();
            }
            int b = fVar.b() + fVar.w();
            do {
                list.add(Integer.valueOf(fVar.j()));
            } while (fVar.b() < b);
            v(b);
            return;
        }
        o oVar = (o) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                oVar.addInt(fVar.j());
                if (fVar.c()) {
                    return;
                } else {
                    v2 = fVar.v();
                }
            } while (v2 == this.b);
            this.d = v2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.h();
        }
        int b2 = fVar.b() + fVar.w();
        do {
            oVar.addInt(fVar.j());
        } while (fVar.b() < b2);
        v(b2);
    }

    public final Object i(WireFormat$FieldType wireFormat$FieldType, Class<?> cls, j jVar) throws IOException {
        int i = a.a[wireFormat$FieldType.ordinal()];
        f fVar = this.a;
        switch (i) {
            case 1:
                w(0);
                return Boolean.valueOf(fVar.g());
            case 2:
                return e();
            case 3:
                w(1);
                return Double.valueOf(fVar.i());
            case 4:
                w(0);
                return Integer.valueOf(fVar.j());
            case 5:
                w(5);
                return Integer.valueOf(fVar.k());
            case 6:
                w(1);
                return Long.valueOf(fVar.l());
            case 7:
                w(5);
                return Float.valueOf(fVar.m());
            case 8:
                w(0);
                return Integer.valueOf(fVar.n());
            case 9:
                w(0);
                return Long.valueOf(fVar.o());
            case 10:
                w(2);
                m8h0 a2 = v8e0.c.a(cls);
                Object b = a2.b();
                c(b, a2, jVar);
                a2.d(b);
                return b;
            case 11:
                w(5);
                return Integer.valueOf(fVar.p());
            case 12:
                w(1);
                return Long.valueOf(fVar.q());
            case 13:
                w(0);
                return Integer.valueOf(fVar.r());
            case 14:
                w(0);
                return Long.valueOf(fVar.s());
            case 15:
                w(2);
                return fVar.u();
            case 16:
                w(0);
                return Integer.valueOf(fVar.w());
            case 17:
                w(0);
                return Long.valueOf(fVar.x());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public final void j(List<Integer> list) throws IOException {
        int v;
        int v2;
        boolean z = list instanceof o;
        f fVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 2) {
                int w = fVar.w();
                y(w);
                int b = fVar.b() + w;
                do {
                    list.add(Integer.valueOf(fVar.k()));
                } while (fVar.b() < b);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.h();
            }
            do {
                list.add(Integer.valueOf(fVar.k()));
                if (fVar.c()) {
                    return;
                } else {
                    v = fVar.v();
                }
            } while (v == this.b);
            this.d = v;
            return;
        }
        o oVar = (o) list;
        int i2 = this.b & 7;
        if (i2 == 2) {
            int w2 = fVar.w();
            y(w2);
            int b2 = fVar.b() + w2;
            do {
                oVar.addInt(fVar.k());
            } while (fVar.b() < b2);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.h();
        }
        do {
            oVar.addInt(fVar.k());
            if (fVar.c()) {
                return;
            } else {
                v2 = fVar.v();
            }
        } while (v2 == this.b);
        this.d = v2;
    }

    public final void k(List<Long> list) throws IOException {
        int v;
        int v2;
        boolean z = list instanceof s;
        f fVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(fVar.l()));
                    if (fVar.c()) {
                        return;
                    } else {
                        v = fVar.v();
                    }
                } while (v == this.b);
                this.d = v;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.h();
            }
            int w = fVar.w();
            z(w);
            int b = fVar.b() + w;
            do {
                list.add(Long.valueOf(fVar.l()));
            } while (fVar.b() < b);
            return;
        }
        s sVar = (s) list;
        int i2 = this.b & 7;
        if (i2 == 1) {
            do {
                sVar.addLong(fVar.l());
                if (fVar.c()) {
                    return;
                } else {
                    v2 = fVar.v();
                }
            } while (v2 == this.b);
            this.d = v2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.h();
        }
        int w2 = fVar.w();
        z(w2);
        int b2 = fVar.b() + w2;
        do {
            sVar.addLong(fVar.l());
        } while (fVar.b() < b2);
    }

    public final void l(List<Float> list) throws IOException {
        int v;
        int v2;
        boolean z = list instanceof n;
        f fVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 2) {
                int w = fVar.w();
                y(w);
                int b = fVar.b() + w;
                do {
                    list.add(Float.valueOf(fVar.m()));
                } while (fVar.b() < b);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.h();
            }
            do {
                list.add(Float.valueOf(fVar.m()));
                if (fVar.c()) {
                    return;
                } else {
                    v = fVar.v();
                }
            } while (v == this.b);
            this.d = v;
            return;
        }
        n nVar = (n) list;
        int i2 = this.b & 7;
        if (i2 == 2) {
            int w2 = fVar.w();
            y(w2);
            int b2 = fVar.b() + w2;
            do {
                nVar.addFloat(fVar.m());
            } while (fVar.b() < b2);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.h();
        }
        do {
            nVar.addFloat(fVar.m());
            if (fVar.c()) {
                return;
            } else {
                v2 = fVar.v();
            }
        } while (v2 == this.b);
        this.d = v2;
    }

    public final void m(List<Integer> list) throws IOException {
        int v;
        int v2;
        boolean z = list instanceof o;
        f fVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(fVar.n()));
                    if (fVar.c()) {
                        return;
                    } else {
                        v = fVar.v();
                    }
                } while (v == this.b);
                this.d = v;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.h();
            }
            int b = fVar.b() + fVar.w();
            do {
                list.add(Integer.valueOf(fVar.n()));
            } while (fVar.b() < b);
            v(b);
            return;
        }
        o oVar = (o) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                oVar.addInt(fVar.n());
                if (fVar.c()) {
                    return;
                } else {
                    v2 = fVar.v();
                }
            } while (v2 == this.b);
            this.d = v2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.h();
        }
        int b2 = fVar.b() + fVar.w();
        do {
            oVar.addInt(fVar.n());
        } while (fVar.b() < b2);
        v(b2);
    }

    public final void n(List<Long> list) throws IOException {
        int v;
        int v2;
        boolean z = list instanceof s;
        f fVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(fVar.o()));
                    if (fVar.c()) {
                        return;
                    } else {
                        v = fVar.v();
                    }
                } while (v == this.b);
                this.d = v;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.h();
            }
            int b = fVar.b() + fVar.w();
            do {
                list.add(Long.valueOf(fVar.o()));
            } while (fVar.b() < b);
            v(b);
            return;
        }
        s sVar = (s) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                sVar.addLong(fVar.o());
                if (fVar.c()) {
                    return;
                } else {
                    v2 = fVar.v();
                }
            } while (v2 == this.b);
            this.d = v2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.h();
        }
        int b2 = fVar.b() + fVar.w();
        do {
            sVar.addLong(fVar.o());
        } while (fVar.b() < b2);
        v(b2);
    }

    public final void o(List<Integer> list) throws IOException {
        int v;
        int v2;
        boolean z = list instanceof o;
        f fVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 2) {
                int w = fVar.w();
                y(w);
                int b = fVar.b() + w;
                do {
                    list.add(Integer.valueOf(fVar.p()));
                } while (fVar.b() < b);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.h();
            }
            do {
                list.add(Integer.valueOf(fVar.p()));
                if (fVar.c()) {
                    return;
                } else {
                    v = fVar.v();
                }
            } while (v == this.b);
            this.d = v;
            return;
        }
        o oVar = (o) list;
        int i2 = this.b & 7;
        if (i2 == 2) {
            int w2 = fVar.w();
            y(w2);
            int b2 = fVar.b() + w2;
            do {
                oVar.addInt(fVar.p());
            } while (fVar.b() < b2);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.h();
        }
        do {
            oVar.addInt(fVar.p());
            if (fVar.c()) {
                return;
            } else {
                v2 = fVar.v();
            }
        } while (v2 == this.b);
        this.d = v2;
    }

    public final void p(List<Long> list) throws IOException {
        int v;
        int v2;
        boolean z = list instanceof s;
        f fVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(fVar.q()));
                    if (fVar.c()) {
                        return;
                    } else {
                        v = fVar.v();
                    }
                } while (v == this.b);
                this.d = v;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.h();
            }
            int w = fVar.w();
            z(w);
            int b = fVar.b() + w;
            do {
                list.add(Long.valueOf(fVar.q()));
            } while (fVar.b() < b);
            return;
        }
        s sVar = (s) list;
        int i2 = this.b & 7;
        if (i2 == 1) {
            do {
                sVar.addLong(fVar.q());
                if (fVar.c()) {
                    return;
                } else {
                    v2 = fVar.v();
                }
            } while (v2 == this.b);
            this.d = v2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.h();
        }
        int w2 = fVar.w();
        z(w2);
        int b2 = fVar.b() + w2;
        do {
            sVar.addLong(fVar.q());
        } while (fVar.b() < b2);
    }

    public final void q(List<Integer> list) throws IOException {
        int v;
        int v2;
        boolean z = list instanceof o;
        f fVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(fVar.r()));
                    if (fVar.c()) {
                        return;
                    } else {
                        v = fVar.v();
                    }
                } while (v == this.b);
                this.d = v;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.h();
            }
            int b = fVar.b() + fVar.w();
            do {
                list.add(Integer.valueOf(fVar.r()));
            } while (fVar.b() < b);
            v(b);
            return;
        }
        o oVar = (o) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                oVar.addInt(fVar.r());
                if (fVar.c()) {
                    return;
                } else {
                    v2 = fVar.v();
                }
            } while (v2 == this.b);
            this.d = v2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.h();
        }
        int b2 = fVar.b() + fVar.w();
        do {
            oVar.addInt(fVar.r());
        } while (fVar.b() < b2);
        v(b2);
    }

    public final void r(List<Long> list) throws IOException {
        int v;
        int v2;
        boolean z = list instanceof s;
        f fVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(fVar.s()));
                    if (fVar.c()) {
                        return;
                    } else {
                        v = fVar.v();
                    }
                } while (v == this.b);
                this.d = v;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.h();
            }
            int b = fVar.b() + fVar.w();
            do {
                list.add(Long.valueOf(fVar.s()));
            } while (fVar.b() < b);
            v(b);
            return;
        }
        s sVar = (s) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                sVar.addLong(fVar.s());
                if (fVar.c()) {
                    return;
                } else {
                    v2 = fVar.v();
                }
            } while (v2 == this.b);
            this.d = v2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.h();
        }
        int b2 = fVar.b() + fVar.w();
        do {
            sVar.addLong(fVar.s());
        } while (fVar.b() < b2);
        v(b2);
    }

    public final void s(List<String> list, boolean z) throws IOException {
        String t;
        int v;
        int v2;
        if ((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.h();
        }
        boolean z2 = list instanceof byy;
        f fVar = this.a;
        if (z2 && !z) {
            byy byyVar = (byy) list;
            do {
                e();
                byyVar.T();
                if (fVar.c()) {
                    return;
                } else {
                    v2 = fVar.v();
                }
            } while (v2 == this.b);
            this.d = v2;
            return;
        }
        do {
            if (z) {
                w(2);
                t = fVar.u();
            } else {
                w(2);
                t = fVar.t();
            }
            list.add(t);
            if (fVar.c()) {
                return;
            } else {
                v = fVar.v();
            }
        } while (v == this.b);
        this.d = v;
    }

    public final void t(List<Integer> list) throws IOException {
        int v;
        int v2;
        boolean z = list instanceof o;
        f fVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(fVar.w()));
                    if (fVar.c()) {
                        return;
                    } else {
                        v = fVar.v();
                    }
                } while (v == this.b);
                this.d = v;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.h();
            }
            int b = fVar.b() + fVar.w();
            do {
                list.add(Integer.valueOf(fVar.w()));
            } while (fVar.b() < b);
            v(b);
            return;
        }
        o oVar = (o) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                oVar.addInt(fVar.w());
                if (fVar.c()) {
                    return;
                } else {
                    v2 = fVar.v();
                }
            } while (v2 == this.b);
            this.d = v2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.h();
        }
        int b2 = fVar.b() + fVar.w();
        do {
            oVar.addInt(fVar.w());
        } while (fVar.b() < b2);
        v(b2);
    }

    public final void u(List<Long> list) throws IOException {
        int v;
        int v2;
        boolean z = list instanceof s;
        f fVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(fVar.x()));
                    if (fVar.c()) {
                        return;
                    } else {
                        v = fVar.v();
                    }
                } while (v == this.b);
                this.d = v;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.h();
            }
            int b = fVar.b() + fVar.w();
            do {
                list.add(Long.valueOf(fVar.x()));
            } while (fVar.b() < b);
            v(b);
            return;
        }
        s sVar = (s) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                sVar.addLong(fVar.x());
                if (fVar.c()) {
                    return;
                } else {
                    v2 = fVar.v();
                }
            } while (v2 == this.b);
            this.d = v2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.h();
        }
        int b2 = fVar.b() + fVar.w();
        do {
            sVar.addLong(fVar.x());
        } while (fVar.b() < b2);
        v(b2);
    }

    public final void v(int i) throws IOException {
        if (this.a.b() != i) {
            throw InvalidProtocolBufferException.m();
        }
    }

    public final void w(int i) throws IOException {
        if ((this.b & 7) != i) {
            throw InvalidProtocolBufferException.h();
        }
    }

    public final boolean x() throws IOException {
        int i;
        f fVar = this.a;
        if (fVar.c() || (i = this.b) == this.c) {
            return false;
        }
        return fVar.y(i);
    }
}
