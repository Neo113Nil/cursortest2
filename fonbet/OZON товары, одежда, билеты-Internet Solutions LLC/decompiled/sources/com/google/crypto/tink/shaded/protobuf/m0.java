package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
abstract class m0<T, B> {
    m0() {
    }

    abstract void a(B b11, int i11, int i12);

    abstract void b(B b11, int i11, long j11);

    abstract void c(B b11, int i11, T t2);

    abstract void d(B b11, int i11, AbstractC5903i abstractC5903i);

    abstract void e(B b11, int i11, long j11);

    abstract n0 f(Object obj);

    abstract n0 g(Object obj);

    abstract int h(T t2);

    abstract int i(T t2);

    abstract void j(Object obj);

    abstract n0 k(Object obj, Object obj2);

    final boolean l(int i11, C5905k c5905k, Object obj) throws IOException {
        int c11 = c5905k.c();
        int i12 = c11 >>> 3;
        int i13 = c11 & 7;
        if (i13 == 0) {
            e(obj, i12, c5905k.y());
            return true;
        }
        if (i13 == 1) {
            b(obj, i12, c5905k.r());
            return true;
        }
        if (i13 == 2) {
            d(obj, i12, c5905k.j());
            return true;
        }
        if (i13 != 3) {
            if (i13 == 4) {
                if (i11 != 0) {
                    return false;
                }
                throw new A("Protocol message end-group tag did not match expected tag.");
            }
            if (i13 != 5) {
                throw A.e();
            }
            a(obj, i12, c5905k.p());
            return true;
        }
        n0 m11 = m();
        int i14 = (i12 << 3) | 4;
        int i15 = i11 + 1;
        if (i15 >= 100) {
            throw new A("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c5905k.b() != Integer.MAX_VALUE && l(i15, c5905k, m11)) {
        }
        if (i14 != c5905k.c()) {
            throw new A("Protocol message end-group tag did not match expected tag.");
        }
        c(obj, i12, p(m11));
        return true;
    }

    abstract n0 m();

    abstract void n(Object obj, B b11);

    abstract void o(Object obj, T t2);

    abstract n0 p(Object obj);

    abstract void q(T t2, t0 t0Var) throws IOException;

    abstract void r(T t2, t0 t0Var) throws IOException;
}
