package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class euj {
    static {
        ypa.b(new eej(23));
    }

    public static final void a(wtj wtjVar, boolean z, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-541795585);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(wtjVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (!av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            av8Var.W();
        } else if (z) {
            av8Var.d0(-145035330);
            c(wtjVar, xtcVar, av8Var, ((i2 >> 3) & 112) | (i2 & 14));
            av8Var.s(false);
        } else {
            av8Var.d0(-144960961);
            b(wtjVar, xtcVar, av8Var, ((i2 >> 3) & 112) | (i2 & 14));
            av8Var.s(false);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new di(wtjVar, z, xtcVar, i, 17);
        }
    }

    public static final void b(wtj wtjVar, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-208778844);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(wtjVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        int i3 = i2;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            xtc c0 = l98.c0(xtcVar, 8.0f, 4.0f);
            u23 a = t23.a(new ng0(4.0f, true, new a70(6)), uxf.p, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            l8g a2 = k8g.a(new ng0(12.0f, true, new a70(6)), uxf.l, av8Var, 6);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            utc utcVar = utc.a;
            xtc C2 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            td4.G(wtjVar.b.a, bkh.l(utcVar, 20.0f), false, 0L, av8Var, 48, 12);
            td4.G(wtjVar.c.a, bkh.l(utcVar, 20.0f), false, 0L, av8Var, 48, 12);
            av8Var.s(true);
            d(wtjVar, av8Var, i3 & 14);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new duj(wtjVar, xtcVar, i, 0);
        }
    }

    public static final void c(wtj wtjVar, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1698025257);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(wtjVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            xtc b0 = l98.b0(xtcVar, 8.0f);
            l8g a = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, b0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            int i3 = wtjVar.b.a;
            utc utcVar = utc.a;
            td4.G(i3, bkh.l(utcVar, 20.0f), false, 0L, av8Var, 48, 12);
            d(wtjVar, av8Var, i2 & 14);
            td4.G(wtjVar.c.a, bkh.l(utcVar, 20.0f), false, 0L, av8Var, 48, 12);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new duj(wtjVar, xtcVar, i, 1);
        }
    }

    public static final void d(wtj wtjVar, of3 of3Var, int i) {
        int i2;
        wtj wtjVar2;
        boolean z;
        long f;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(864675180);
        if ((i & 6) == 0) {
            i2 = i | (av8Var.g(wtjVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            String str = wtjVar.d;
            Integer num = wtjVar.g;
            if (Intrinsics.c(str, StatusKt.STATUS_FINISHED)) {
                av8Var.d0(-1675430739);
                l8g a = k8g.a(ww9.b, uxf.m, av8Var, 48);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                utc utcVar = utc.a;
                xtc C = fqj.C(av8Var, utcVar);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a, hf3.g);
                waa.K(av8Var, m, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C, hf3.d);
                xtc q = bkh.q(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                String valueOf = String.valueOf(wtjVar.e);
                yf8 yf8Var = xth.a;
                udj.c(valueOf, q, (num != null && num.intValue() == 1) ? ljg.f(av8Var, -1310664266, R.color.n_lv_1, av8Var, false) : ljg.f(av8Var, -1310663786, R.color.n_lv_3, av8Var, false), null, 0L, null, 0L, null, new p7j(6), 0L, 0, false, 0, 0, null, xth.l(), av8Var, 48, 0, 130040);
                udj.c("-", bkh.q(utcVar, 10.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.l(), av8Var, 54, 0, 130040);
                xtc q2 = bkh.q(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                wtjVar2 = wtjVar;
                String valueOf2 = String.valueOf(wtjVar2.f);
                dfj l = xth.l();
                if (num != null && num.intValue() == 2) {
                    z = false;
                    f = ljg.f(av8Var, -1310646026, R.color.n_lv_1, av8Var, false);
                } else {
                    z = false;
                    f = ljg.f(av8Var, -1310645546, R.color.n_lv_3, av8Var, false);
                }
                udj.c(valueOf2, q2, f, null, 0L, null, 0L, null, new p7j(5), 0L, 0, false, 0, 0, null, l, av8Var, 48, 0, 130040);
                av8Var = av8Var;
                av8Var.s(true);
                av8Var.s(z);
            } else {
                wtjVar2 = wtjVar;
                av8Var.d0(-1674473304);
                String c = afi.c((Context) av8Var.k(nz.b), wtjVar2.d, wtjVar2.h, false);
                yf8 yf8Var2 = xth.a;
                udj.c(c, null, lz.D(R.color.error, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var, 0, 0, 131066);
                av8Var = av8Var;
                av8Var.s(false);
            }
        } else {
            wtjVar2 = wtjVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new n61(wtjVar2, i, 15);
        }
    }

    public static final void e(Integer num, gv9 gv9Var, long j, boolean z, xtc xtcVar, of3 of3Var, int i) {
        boolean z2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-457609659);
        int i2 = i | (av8Var.g(num) ? 4 : 2) | (av8Var.g(gv9Var) ? 32 : 16) | (av8Var.f(j) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.h(z) ? a.o : 1024) | (av8Var.g(xtcVar) ? 16384 : 8192);
        if (av8Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            Context context = (Context) av8Var.k(nz.b);
            xtc x = gz8.x(l98.f0(n9e.q(xtcVar, lz.D(R.color.surface_2, av8Var), o7g.a(4.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 7), null, null, 3);
            u23 a = t23.a(new ng0(4.0f, true, new a70(6)), uxf.p, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, x);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            utc utcVar = utc.a;
            nq8.h(av8Var, n9e.q(bkh.d(bkh.e(utcVar, 4.0f), 1.0f), j, o7g.c(4.0f, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12)));
            if (num != null) {
                av8Var.d0(-178950621);
                xtc e = bkh.e(utcVar, 24.0f);
                l8g a2 = k8g.a(new ng0(4.0f, true, new a70(6)), uxf.m, av8Var, 54);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, e);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a2, f50Var);
                waa.K(av8Var, m2, ff3Var);
                bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C2, f50Var3);
                String v = oea.v(R.string.position_short, av8Var);
                yf8 yf8Var = xth.a;
                z2 = true;
                udj.c(v, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
                udj.c(String.valueOf(num.intValue()), null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
                av8Var = av8Var;
                av8Var.s(true);
                if (gv9Var.isEmpty()) {
                    av8Var.d0(-177888499);
                    udj.c(oea.v(R.string.standings_tracker_no_games_played_short, av8Var), l98.c0(utcVar, 8.0f, 4.0f), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 3, 0, null, xth.c(), av8Var, 48, 24960, 109560);
                    av8Var = av8Var;
                    av8Var.s(false);
                } else {
                    av8Var.d0(-178324824);
                    Iterator<E> it = gv9Var.iterator();
                    while (it.hasNext()) {
                        wtj wtjVar = (wtj) it.next();
                        xtc A = wnn.A(utcVar, o7g.a(16.0f));
                        long D = lz.D(R.color.n_lv_4, av8Var);
                        Object O = av8Var.O();
                        a99 a99Var = nf3.a;
                        if (O == a99Var) {
                            O = mz1.e(av8Var);
                        }
                        wzc wzcVar = (wzc) O;
                        Object[] objArr = new Object[0];
                        Object O2 = av8Var.O();
                        if (O2 == a99Var) {
                            O2 = nuh.C;
                            av8Var.n0(O2);
                        }
                        a(wtjVar, z, tol.y(A, true, true, true, D, wzcVar, new eui((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), context, wtjVar, 10), av8Var, 0), av8Var, (i2 >> 6) & 112);
                    }
                    av8Var.s(false);
                }
                av8Var.s(false);
            } else {
                z2 = true;
                av8Var.d0(-177407379);
                xtc c0 = l98.c0(utcVar, 8.0f, 4.0f);
                String v2 = oea.v(R.string.standings_tracker_no_games_played_short, av8Var);
                yf8 yf8Var2 = xth.a;
                udj.c(v2, c0, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 3, 0, null, xth.c(), av8Var, 48, 24960, 109560);
                av8Var = av8Var;
                av8Var.s(false);
            }
            av8Var.s(z2);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new e30(num, gv9Var, j, z, xtcVar, i);
        }
    }

    public static final void f(gv9 gv9Var, xtc xtcVar, of3 of3Var, int i) {
        gv9Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-518757341);
        int i2 = (av8Var.g(gv9Var) ? 4 : 2) | i | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            r13[] r13VarArr = {new r13(lz.D(R.color.home_primary, av8Var)), new r13(lz.D(R.color.away_primary, av8Var)), new r13(lz.D(R.color.value, av8Var)), new r13(lz.D(R.color.brand_tertiary_default, av8Var))};
            l8g a = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.l, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            Iterator p = ljg.p(av8Var, C, hf3.d, 2006716686, gv9Var);
            int i3 = 0;
            while (p.hasNext()) {
                Object next = p.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    b.q();
                    throw null;
                }
                k0j k0jVar = (k0j) next;
                av8Var.a0(1265512379, Integer.valueOf(k0jVar.a.a));
                e(k0jVar.c, k0jVar.d, r13VarArr[i3].a, gv9Var.size() < 2, new goa(1.0f, true), av8Var, 0);
                av8Var.s(false);
                i3 = i4;
            }
            av8Var.s(false);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new y81(gv9Var, xtcVar, i, 20);
        }
    }
}
