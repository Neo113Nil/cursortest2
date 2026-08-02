package androidx.compose.runtime;

import xsna.c9e0;
import xsna.cvi;
import xsna.evi;
import xsna.fc30;
import xsna.fd3;
import xsna.gzs;
import xsna.lvi;
import xsna.s3q0;
import xsna.sy90;
import xsna.vef0;
import xsna.wzs;

/* compiled from: Composer.kt */
/* loaded from: classes.dex */
public interface a {

    /* compiled from: Composer.kt */
    /* renamed from: androidx.compose.runtime.a$a, reason: collision with other inner class name */
    public static final class C0011a {
        public static final C0012a a = new C0012a();

        /* compiled from: Composer.kt */
        /* renamed from: androidx.compose.runtime.a$a$a, reason: collision with other inner class name */
        public static final class C0012a {
            public final String toString() {
                return "Empty";
            }
        }
    }

    void A(boolean z);

    long B();

    void C(int i);

    sy90 D();

    void E(fc30 fc30Var);

    void F();

    void G();

    void H();

    <T> void I(gzs<? extends T> gzsVar);

    boolean J(Object obj);

    void K(int i);

    boolean L();

    a M(int i);

    fd3<?> N();

    Object O(Object obj, Object obj2);

    void P();

    kotlin.coroutines.d Q();

    void R(Object obj);

    void S();

    void T(int i);

    evi U();

    void V();

    void W(int i, Object obj);

    void X();

    void Y(vef0 vef0Var);

    default int Z() {
        return Long.hashCode(B());
    }

    void a0();

    <V, T> void b(V v, wzs<? super T, ? super V, s3q0> wzsVar);

    void b0();

    int c();

    void c0(gzs<s3q0> gzsVar);

    void d(c9e0<?>[] c9e0VarArr);

    boolean e();

    void f();

    void g(Object obj);

    void h();

    boolean i();

    void j();

    cvi k();

    default boolean l(boolean z) {
        return l(z);
    }

    default boolean m(short s) {
        return m(s);
    }

    default boolean n(float f) {
        return n(f);
    }

    default boolean o(int i) {
        return o(i);
    }

    default boolean p(long j) {
        return p(j);
    }

    default boolean q(double d) {
        return q(d);
    }

    <T> T r(lvi<T> lviVar);

    f s();

    boolean t(int i, boolean z);

    void u();

    f v();

    void w();

    Object x();

    default boolean y(Object obj) {
        return J(obj);
    }

    void z(c9e0<?> c9e0Var);
}
