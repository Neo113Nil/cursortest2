package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* compiled from: UnknownFieldSchema.java */
/* loaded from: classes.dex */
public abstract class e0<T, B> {
    public abstract void a(int i, int i2, Object obj);

    public abstract void b(int i, long j, Object obj);

    public abstract void c(int i, Object obj, Object obj2);

    public abstract void d(B b, int i, ByteString byteString);

    public abstract void e(int i, long j, Object obj);

    public abstract f0 f(Object obj);

    public abstract f0 g(Object obj);

    public abstract int h(T t);

    public abstract int i(T t);

    public abstract void j(Object obj);

    public abstract f0 k(Object obj, Object obj2);

    public final boolean l(B b, a0 a0Var, int i) throws IOException {
        g gVar = (g) a0Var;
        int i2 = gVar.b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            gVar.w(0);
            e(i3, gVar.a.o(), b);
            return true;
        }
        if (i4 == 1) {
            gVar.w(1);
            b(i3, gVar.a.l(), b);
            return true;
        }
        if (i4 == 2) {
            d(b, i3, gVar.e());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw InvalidProtocolBufferException.h();
            }
            gVar.w(5);
            a(i3, gVar.a.k(), b);
            return true;
        }
        f0 m = m();
        int i5 = (i3 << 3) | 4;
        int i6 = i + 1;
        if (i6 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (gVar.a() != Integer.MAX_VALUE && l(m, gVar, i6)) {
        }
        if (i5 != gVar.b) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        c(i3, b, p(m));
        return true;
    }

    public abstract f0 m();

    public abstract void n(Object obj, B b);

    public abstract void o(Object obj, T t);

    public abstract f0 p(Object obj);

    public abstract void q(T t, Writer writer) throws IOException;

    public abstract void r(T t, Writer writer) throws IOException;
}
