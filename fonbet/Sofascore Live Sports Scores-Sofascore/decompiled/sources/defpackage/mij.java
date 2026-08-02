package defpackage;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class mij {
    public static final gij a = new gij();

    static {
        nik.N(0);
        nik.N(1);
        nik.N(2);
    }

    public int a(boolean z) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i, iij iijVar, kij kijVar, int i2, boolean z) {
        int i3 = f(i, iijVar, false).c;
        if (m(i3, kijVar, 0L).n != i) {
            return i + 1;
        }
        int e = e(i3, i2, z);
        if (e == -1) {
            return -1;
        }
        return m(e, kijVar, 0L).m;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == c(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == c(z) ? a(z) : i + 1;
        }
        zzl.s();
        return 0;
    }

    public boolean equals(Object obj) {
        int c;
        if (this != obj) {
            if (obj instanceof mij) {
                mij mijVar = (mij) obj;
                if (mijVar.o() == o() && mijVar.h() == h()) {
                    kij kijVar = new kij();
                    iij iijVar = new iij();
                    kij kijVar2 = new kij();
                    iij iijVar2 = new iij();
                    int i = 0;
                    while (true) {
                        if (i >= o()) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= h()) {
                                    int a2 = a(true);
                                    if (a2 == mijVar.a(true) && (c = c(true)) == mijVar.c(true)) {
                                        while (a2 != c) {
                                            int e = e(a2, 0, true);
                                            if (e == mijVar.e(a2, 0, true)) {
                                                a2 = e;
                                            }
                                        }
                                    }
                                } else {
                                    if (!f(i2, iijVar, true).equals(mijVar.f(i2, iijVar2, true))) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        } else {
                            if (!m(i, kijVar, 0L).equals(mijVar.m(i, kijVar2, 0L))) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract iij f(int i, iij iijVar, boolean z);

    public iij g(Object obj, iij iijVar) {
        return f(b(obj), iijVar, true);
    }

    public abstract int h();

    public int hashCode() {
        kij kijVar = new kij();
        iij iijVar = new iij();
        int o = o() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE;
        for (int i = 0; i < o(); i++) {
            o = (o * 31) + m(i, kijVar, 0L).hashCode();
        }
        int h = h() + (o * 31);
        for (int i2 = 0; i2 < h(); i2++) {
            h = (h * 31) + f(i2, iijVar, true).hashCode();
        }
        int a2 = a(true);
        while (a2 != -1) {
            h = (h * 31) + a2;
            a2 = e(a2, 0, true);
        }
        return h;
    }

    public final Pair i(kij kijVar, iij iijVar, int i, long j) {
        Pair j2 = j(kijVar, iijVar, i, j, 0L);
        j2.getClass();
        return j2;
    }

    public final Pair j(kij kijVar, iij iijVar, int i, long j, long j2) {
        z1a.v(i, o());
        m(i, kijVar, j2);
        if (j == C.TIME_UNSET) {
            j = kijVar.k;
            if (j == C.TIME_UNSET) {
                return null;
            }
        }
        int i2 = kijVar.m;
        f(i2, iijVar, false);
        while (i2 < kijVar.n && iijVar.e != j) {
            int i3 = i2 + 1;
            if (f(i3, iijVar, false).e > j) {
                break;
            }
            i2 = i3;
        }
        f(i2, iijVar, true);
        long j3 = j - iijVar.e;
        long j4 = iijVar.d;
        if (j4 != C.TIME_UNSET) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0L, j3);
        Object obj = iijVar.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int k(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == a(z) ? c(z) : i - 1;
        }
        zzl.s();
        return 0;
    }

    public abstract Object l(int i);

    public abstract kij m(int i, kij kijVar, long j);

    public final void n(int i, kij kijVar) {
        m(i, kijVar, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
