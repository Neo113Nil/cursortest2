package androidx.media3.exoplayer;

import androidx.media3.exoplayer.o;
import androidx.media3.exoplayer.source.D;
import androidx.media3.exoplayer.source.c0;
import b1.AbstractC2346O;
import e1.InterfaceC4143j;
import m1.Q0;
import m1.k1;
import n1.G1;

/* loaded from: classes.dex */
public interface p extends o.b {

    public interface a {
        void a();

        void b();
    }

    default long B(long j10, long j11) {
        if (getState() == 1) {
            return (c() || b()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    void C(AbstractC2346O abstractC2346O);

    void D(int i10, G1 g12, InterfaceC4143j interfaceC4143j);

    q F();

    default void I(float f10, float f11) {
    }

    void L(k1 k1Var, androidx.media3.common.a[] aVarArr, c0 c0Var, long j10, boolean z10, boolean z11, long j11, long j12, D.b bVar);

    c0 M();

    long N();

    void O(long j10);

    Q0 P();

    boolean b();

    boolean c();

    void disable();

    int f();

    String getName();

    int getState();

    void h(long j10, long j11);

    boolean i();

    default void l() {
    }

    void m();

    void release();

    void reset();

    void start();

    void stop();

    void u(androidx.media3.common.a[] aVarArr, c0 c0Var, long j10, long j11, D.b bVar);

    void v();

    boolean y();
}
