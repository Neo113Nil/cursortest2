package defpackage;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class lij implements i72 {
    public static final fij a = new fij();

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

    public final int d(int i, hij hijVar, jij jijVar, int i2, boolean z) {
        int i3 = f(i, hijVar, false).c;
        if (m(i3, jijVar, 0L).n != i) {
            return i + 1;
        }
        int e = e(i3, i2, z);
        if (e == -1) {
            return -1;
        }
        return m(e, jijVar, 0L).m;
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

    public final boolean equals(Object obj) {
        int c;
        if (this != obj) {
            if (obj instanceof lij) {
                lij lijVar = (lij) obj;
                if (lijVar.o() == o() && lijVar.h() == h()) {
                    jij jijVar = new jij();
                    hij hijVar = new hij();
                    jij jijVar2 = new jij();
                    hij hijVar2 = new hij();
                    int i = 0;
                    while (true) {
                        if (i >= o()) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= h()) {
                                    int a2 = a(true);
                                    if (a2 == lijVar.a(true) && (c = c(true)) == lijVar.c(true)) {
                                        while (a2 != c) {
                                            int e = e(a2, 0, true);
                                            if (e == lijVar.e(a2, 0, true)) {
                                                a2 = e;
                                            }
                                        }
                                    }
                                } else {
                                    if (!f(i2, hijVar, true).equals(lijVar.f(i2, hijVar2, true))) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        } else {
                            if (!m(i, jijVar, 0L).equals(lijVar.m(i, jijVar2, 0L))) {
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

    public abstract hij f(int i, hij hijVar, boolean z);

    public hij g(Object obj, hij hijVar) {
        return f(b(obj), hijVar, true);
    }

    public abstract int h();

    public final int hashCode() {
        jij jijVar = new jij();
        hij hijVar = new hij();
        int o = o() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE;
        for (int i = 0; i < o(); i++) {
            o = (o * 31) + m(i, jijVar, 0L).hashCode();
        }
        int h = h() + (o * 31);
        for (int i2 = 0; i2 < h(); i2++) {
            h = (h * 31) + f(i2, hijVar, true).hashCode();
        }
        int a2 = a(true);
        while (a2 != -1) {
            h = (h * 31) + a2;
            a2 = e(a2, 0, true);
        }
        return h;
    }

    public final Pair i(jij jijVar, hij hijVar, int i, long j) {
        Pair j2 = j(jijVar, hijVar, i, j, 0L);
        j2.getClass();
        return j2;
    }

    public final Pair j(jij jijVar, hij hijVar, int i, long j, long j2) {
        qx9.s(i, o());
        m(i, jijVar, j2);
        if (j == C.TIME_UNSET) {
            j = jijVar.k;
            if (j == C.TIME_UNSET) {
                return null;
            }
        }
        int i2 = jijVar.m;
        f(i2, hijVar, false);
        while (i2 < jijVar.n && hijVar.e != j) {
            int i3 = i2 + 1;
            if (f(i3, hijVar, false).e > j) {
                break;
            }
            i2 = i3;
        }
        f(i2, hijVar, true);
        long j3 = j - hijVar.e;
        long j4 = hijVar.d;
        if (j4 != C.TIME_UNSET) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0L, j3);
        Object obj = hijVar.b;
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

    public abstract jij m(int i, jij jijVar, long j);

    public final void n(int i, jij jijVar) {
        m(i, jijVar, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
