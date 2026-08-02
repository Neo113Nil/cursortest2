package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.uln;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbf {
    public static final uln a = new uln();

    static {
        String str = zzfm.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public abstract int a();

    public abstract zzbe b(int i, zzbe zzbeVar, long j);

    public abstract int c();

    public abstract zzbd d(int i, zzbd zzbdVar, boolean z);

    public abstract int e(Object obj);

    public final boolean equals(Object obj) {
        int j;
        if (this != obj) {
            if (obj instanceof zzbf) {
                zzbf zzbfVar = (zzbf) obj;
                if (zzbfVar.a() == a() && zzbfVar.c() == c()) {
                    zzbe zzbeVar = new zzbe();
                    zzbd zzbdVar = new zzbd();
                    zzbe zzbeVar2 = new zzbe();
                    zzbd zzbdVar2 = new zzbd();
                    int i = 0;
                    while (true) {
                        if (i >= a()) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= c()) {
                                    int k = k(true);
                                    if (k == zzbfVar.k(true) && (j = j(true)) == zzbfVar.j(true)) {
                                        while (k != j) {
                                            int h = h(k, 0, true);
                                            if (h == zzbfVar.h(k, 0, true)) {
                                                k = h;
                                            }
                                        }
                                    }
                                } else {
                                    if (!d(i2, zzbdVar, true).equals(zzbfVar.d(i2, zzbdVar2, true))) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        } else {
                            if (!b(i, zzbeVar, 0L).equals(zzbfVar.b(i, zzbeVar2, 0L))) {
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

    public abstract Object f(int i);

    public final boolean g() {
        return a() == 0;
    }

    public int h(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == j(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == j(z) ? k(z) : i + 1;
        }
        defpackage.zzl.s();
        return 0;
    }

    public final int hashCode() {
        int i;
        zzbe zzbeVar = new zzbe();
        zzbd zzbdVar = new zzbd();
        int a2 = a() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE;
        int i2 = 0;
        while (true) {
            i = a2 * 31;
            if (i2 >= a()) {
                break;
            }
            a2 = i + b(i2, zzbeVar, 0L).hashCode();
            i2++;
        }
        int c = c() + i;
        for (int i3 = 0; i3 < c(); i3++) {
            c = (c * 31) + d(i3, zzbdVar, true).hashCode();
        }
        int k = k(true);
        while (k != -1) {
            c = (c * 31) + k;
            k = h(k, 0, true);
        }
        return c;
    }

    public int i(int i) {
        if (i == k(false)) {
            return -1;
        }
        return i - 1;
    }

    public int j(boolean z) {
        if (g()) {
            return -1;
        }
        return a() - 1;
    }

    public int k(boolean z) {
        return g() ? -1 : 0;
    }

    public final int l(int i, zzbd zzbdVar, zzbe zzbeVar, int i2, boolean z) {
        int i3 = d(i, zzbdVar, false).c;
        if (b(i3, zzbeVar, 0L).l != i) {
            return i + 1;
        }
        int h = h(i3, i2, z);
        if (h == -1) {
            return -1;
        }
        return b(h, zzbeVar, 0L).k;
    }

    public final Pair m(zzbe zzbeVar, zzbd zzbdVar, int i, long j) {
        Pair n = n(zzbeVar, zzbdVar, i, j, 0L);
        n.getClass();
        return n;
    }

    public final Pair n(zzbe zzbeVar, zzbd zzbdVar, int i, long j, long j2) {
        zzguk.i(i, a());
        b(i, zzbeVar, j2);
        if (j == C.TIME_UNSET) {
            zzbeVar.getClass();
            j = 0;
        }
        int i2 = zzbeVar.k;
        d(i2, zzbdVar, false);
        while (i2 < zzbeVar.l) {
            zzbdVar.getClass();
            if (j == 0) {
                break;
            }
            int i3 = i2 + 1;
            d(i3, zzbdVar, false).getClass();
            if (j < 0) {
                break;
            }
            i2 = i3;
        }
        d(i2, zzbdVar, true);
        zzbdVar.getClass();
        long j3 = zzbdVar.d;
        if (j3 != C.TIME_UNSET) {
            j = Math.min(j, j3 - 1);
        }
        long max = Math.max(0L, j);
        Object obj = zzbdVar.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public zzbd o(Object obj, zzbd zzbdVar) {
        return d(e(obj), zzbdVar, true);
    }
}
