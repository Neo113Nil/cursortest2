package androidx.media3.exoplayer;

/* loaded from: classes.dex */
public interface q {

    public interface a {
        void a(p pVar);
    }

    static int A(int i10, int i11, int i12, int i13, int i14, int i15) {
        return i10 | i11 | i12 | i13 | i14 | i15;
    }

    static int E(int i10) {
        return i10 & 64;
    }

    static int Q(int i10) {
        return i10 & 7;
    }

    static int j(int i10) {
        return i10 & 384;
    }

    static boolean k(int i10, boolean z10) {
        int Q10 = Q(i10);
        if (Q10 != 4) {
            return z10 && Q10 == 3;
        }
        return true;
    }

    static int n(int i10, int i11, int i12, int i13, int i14) {
        return A(i10, i11, i12, i13, i14, 0);
    }

    static int o(int i10, int i11, int i12, int i13) {
        return A(i10, i11, i12, 0, 128, i13);
    }

    static int p(int i10) {
        return i10 & 32;
    }

    static int q(int i10) {
        return i10 & 24;
    }

    static int r(int i10) {
        return o(i10, 0, 0, 0);
    }

    static int w(int i10) {
        return i10 & 3584;
    }

    void G(a aVar);

    int K();

    int a(androidx.media3.common.a aVar);

    int f();

    void g();

    String getName();
}
