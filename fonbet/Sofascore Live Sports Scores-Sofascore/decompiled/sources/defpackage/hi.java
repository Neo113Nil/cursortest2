package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.Colors;
import com.sofascore.results.R;
import com.sofascore.results.event.odds.model.OddsEventUIModel;
import com.unity3d.services.UnityAdsConstants;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class hi {
    public static final mqi a = ypa.b(new c0(13));
    public static final mqi b;
    public static final old c;
    public static final mqi d;

    static {
        ypa.b(new c0(14));
        b = ypa.b(new c0(15));
        ypa.b(new c0(16));
        c = new old(new yld(1, new Colors("#017b5b", null, "#ffffff"), "bet365"), "https://www.sofascore.com", true, null, Boolean.FALSE, "international", null);
        d = ypa.b(new c0(17));
    }

    public static final void a(eld eldVar, OddsEventUIModel oddsEventUIModel, of3 of3Var, int i) {
        eldVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-130391384);
        int i2 = 2;
        int i3 = (av8Var.g(eldVar) ? 4 : 2) | i | (av8Var.g(oddsEventUIModel) ? 32 : 16);
        int i4 = 1;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = e.c(4);
                av8Var.n0(O);
            }
            f(eldVar.a, false, oddsEventUIModel.c, null, yqo.H(-545114723, av8Var, new d67(i2, eldVar, (znh) O, oddsEventUIModel)), av8Var, 24624, 8);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vn6(eldVar, oddsEventUIModel, i, i4);
        }
    }

    public static final void b(gv9 gv9Var, gv9 gv9Var2, old oldVar, OddsEventUIModel oddsEventUIModel, vmd vmdVar, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        gv9 gv9Var3;
        old oldVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1656288709);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(gv9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            gv9Var3 = gv9Var2;
            i2 |= av8Var.g(gv9Var3) ? 32 : 16;
        } else {
            gv9Var3 = gv9Var2;
        }
        if ((i & 384) == 0) {
            oldVar2 = oldVar;
            i2 |= av8Var.g(oldVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            oldVar2 = oldVar;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.g(oddsEventUIModel) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var.e(vmdVar.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= av8Var.g(xtcVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i3 = i2;
        if (av8Var.T(i3 & 1, (74899 & i3) != 74898)) {
            fgf fgfVar = (fgf) CollectionsKt.firstOrNull(gv9Var3);
            f(fgfVar != null ? fgfVar.b : null, fgfVar != null && fgfVar.d, oddsEventUIModel.c, xtcVar, yqo.H(1636271536, av8Var, new ff7(gv9Var3, gv9Var, oddsEventUIModel, oldVar2, vmdVar, 3)), av8Var, ((i3 >> 6) & 7168) | 24576, 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bi(gv9Var, gv9Var2, oldVar, oddsEventUIModel, vmdVar, xtcVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(qj qjVar, old oldVar, OddsEventUIModel oddsEventUIModel, vmd vmdVar, xtc xtcVar, of3 of3Var, int i, int i2) {
        xtc xtcVar2;
        xtc xtcVar3;
        eqf u;
        qjVar.getClass();
        oldVar.getClass();
        oddsEventUIModel.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1756972301);
        int i3 = (av8Var.g(qjVar) ? 4 : 2) | i | (av8Var.g(oldVar) ? 32 : 16) | (av8Var.g(oddsEventUIModel) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if ((i & 3072) == 0) {
            i3 |= av8Var.e(vmdVar.ordinal()) ? a.o : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var.g(xtcVar2) ? 16384 : 8192;
            if (av8Var.T(i3 & 1, (i3 & 9363) == 9362)) {
                av8Var.W();
                xtcVar3 = xtcVar2;
            } else {
                xtc xtcVar4 = i4 != 0 ? utc.a : xtcVar2;
                if (qjVar instanceof mj) {
                    av8Var.d0(-804322139);
                    mj mjVar = (mj) qjVar;
                    b(mjVar.a, mjVar.b, oldVar, oddsEventUIModel, vmdVar, xtcVar4, av8Var, (i3 << 3) & 524160);
                    av8Var.s(false);
                } else if (qjVar instanceof nj) {
                    av8Var.d0(-803952867);
                    nj njVar = (nj) qjVar;
                    r9k r9kVar = ((fgf) njVar.a.get(0)).b;
                    gv9 gv9Var = njVar.a;
                    int i5 = i3 & 112;
                    int i6 = i3 << 3;
                    d(r9kVar, oldVar, gv9Var, oddsEventUIModel, vmdVar, xtcVar4, av8Var, i5 | (i6 & 7168) | (57344 & i6) | (i6 & 458752));
                    av8Var.s(false);
                } else if (qjVar instanceof oj) {
                    av8Var.d0(-803575907);
                    oj ojVar = (oj) qjVar;
                    r9k r9kVar2 = ((fgf) ojVar.a.get(0)).b;
                    gv9 gv9Var2 = ojVar.a;
                    int i7 = i3 & 112;
                    int i8 = i3 << 3;
                    d(r9kVar2, oldVar, gv9Var2, oddsEventUIModel, vmdVar, xtcVar4, av8Var, i7 | (i8 & 7168) | (57344 & i8) | (i8 & 458752));
                    av8Var.s(false);
                } else {
                    if (!(qjVar instanceof pj)) {
                        throw dmi.h(av8Var, 528242410, false);
                    }
                    av8Var.d0(-803199846);
                    fgf fgfVar = ((pj) qjVar).a;
                    int i9 = i3 & 112;
                    int i10 = i3 << 3;
                    g(fgfVar.b, oldVar, fgfVar, oddsEventUIModel, vmdVar, xtcVar4, av8Var, i9 | (i10 & 7168) | (57344 & i10) | (i10 & 458752));
                    av8Var.s(false);
                }
                xtcVar3 = xtcVar4;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new ei(qjVar, oldVar, oddsEventUIModel, vmdVar, xtcVar3, i, i2, 0);
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        if (av8Var.T(i3 & 1, (i3 & 9363) == 9362)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void d(r9k r9kVar, old oldVar, gv9 gv9Var, OddsEventUIModel oddsEventUIModel, vmd vmdVar, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        gv9 gv9Var2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1692964458);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(r9kVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(oldVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            gv9Var2 = gv9Var;
            i2 |= av8Var.g(gv9Var2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            gv9Var2 = gv9Var;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.g(oddsEventUIModel) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var.e(vmdVar.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= av8Var.g(xtcVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i3 = i2;
        if (av8Var.T(i3 & 1, (74899 & i3) != 74898)) {
            String str = oddsEventUIModel.c;
            fgf fgfVar = (fgf) CollectionsKt.firstOrNull(gv9Var2);
            f(r9kVar, fgfVar != null ? fgfVar.d : false, str, xtcVar, yqo.H(1433880799, av8Var, new er6(gv9Var2, oddsEventUIModel, oldVar, vmdVar, 11)), av8Var, (i3 & 14) | 24576 | ((i3 >> 6) & 7168), 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bi(r9kVar, oldVar, gv9Var, oddsEventUIModel, vmdVar, xtcVar, i, 1);
        }
    }

    public static final void e(r9k r9kVar, boolean z, String str, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        String a2;
        boolean z2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1841390607);
        if ((i & 6) == 0) {
            i2 = (av8Var2.g(r9kVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            utc utcVar = utc.a;
            xtc f0 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7);
            l8g a3 = k8g.a(ww9.b, uxf.l, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, f0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            Context context = (Context) av8Var2.k(nz.b);
            if (r9kVar == null) {
                av8Var2.d0(-810244540);
                av8Var2.s(false);
                a2 = null;
            } else {
                av8Var2.d0(1774978397);
                a2 = r9kVar.a(av8Var2);
                av8Var2.s(false);
            }
            String n = rld.n(context, a2, str);
            if (n != null) {
                av8Var2.d0(-810181113);
                yf8 yf8Var = xth.a;
                dfj k = xth.k();
                long D = lz.D(R.color.n_lv_1, av8Var2);
                z2 = false;
                udj.c(n, null, D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, k, av8Var2, 0, 0, 131066);
                av8Var = av8Var2;
                av8Var.s(false);
            } else {
                av8Var = av8Var2;
                z2 = false;
                av8Var.d0(-810040497);
                av8Var.s(false);
            }
            if (z) {
                av8Var.d0(-809997500);
                xtc f02 = l98.f0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                String v = oea.v(R.string.standings_live, av8Var);
                yf8 yf8Var2 = xth.a;
                av8 av8Var3 = av8Var;
                udj.c(v, f02, lz.D(R.color.value, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var3, 48, 0, 131064);
                av8Var = av8Var3;
                av8Var.s(z2);
            } else {
                av8Var.d0(-809761745);
                av8Var.s(z2);
            }
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new di(r9kVar, z, str, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(r9k r9kVar, boolean z, String str, xtc xtcVar, tc3 tc3Var, of3 of3Var, int i, int i2) {
        int i3;
        xtc xtcVar2;
        xtc xtcVar3;
        eqf u;
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1250236101);
        if ((i & 6) == 0) {
            i3 = (av8Var.g(r9kVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= av8Var.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var.g(xtcVar2) ? a.o : 1024;
            if ((i & 24576) == 0) {
                i3 |= av8Var.i(tc3Var) ? 16384 : 8192;
            }
            if (av8Var.T(i3 & 1, (i3 & 9363) == 9362)) {
                av8Var.W();
                xtcVar3 = xtcVar2;
            } else {
                utc utcVar = utc.a;
                if (i5 != 0) {
                    xtcVar2 = utcVar;
                }
                xtc O = kda.O(l98.f0(l98.d0(n9e.q(wnn.A(bkh.d(xtcVar2, 1.0f), o7g.a(16.0f)), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f)), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 5), "base_odds_container", av8Var);
                p4h p4hVar = ww9.d;
                kv1 kv1Var = uxf.o;
                u23 a2 = t23.a(p4hVar, kv1Var, av8Var, 0);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, O);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                f50 f50Var = hf3.g;
                waa.K(av8Var, a2, f50Var);
                ff3 ff3Var = hf3.f;
                waa.K(av8Var, m, ff3Var);
                Integer valueOf = Integer.valueOf(hashCode);
                f50 f50Var2 = hf3.j;
                waa.K(av8Var, valueOf, f50Var2);
                ry ryVar = hf3.k;
                waa.J(av8Var, ryVar);
                xtc xtcVar4 = xtcVar2;
                f50 f50Var3 = hf3.d;
                waa.K(av8Var, C, f50Var3);
                if (r9kVar != null) {
                    av8Var.d0(1338545621);
                    e(r9kVar, z, str, av8Var, i3 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
                    i4 = 0;
                    av8Var.s(false);
                } else {
                    i4 = 0;
                    av8Var.d0(1338695537);
                    av8Var.s(false);
                }
                xtc O2 = kda.O(utcVar, "container", av8Var);
                u23 a3 = t23.a(p4hVar, kv1Var, av8Var, i4);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, O2);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a3, f50Var);
                waa.K(av8Var, m2, ff3Var);
                bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C2, f50Var3);
                tc3Var.invoke(x23.a, av8Var, Integer.valueOf(((i3 >> 9) & 112) | 6));
                av8Var.s(true);
                av8Var.s(true);
                xtcVar3 = xtcVar4;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new ci(r9kVar, z, str, xtcVar3, tc3Var, i, i2);
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        if ((i & 24576) == 0) {
        }
        if (av8Var.T(i3 & 1, (i3 & 9363) == 9362)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void g(r9k r9kVar, old oldVar, fgf fgfVar, OddsEventUIModel oddsEventUIModel, vmd vmdVar, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        old oldVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(563013924);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(r9kVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            oldVar2 = oldVar;
            i2 |= av8Var.g(oldVar2) ? 32 : 16;
        } else {
            oldVar2 = oldVar;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.g(fgfVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.g(oddsEventUIModel) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var.e(vmdVar.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= av8Var.g(xtcVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i3 = i2;
        if (av8Var.T(i3 & 1, (74899 & i3) != 74898)) {
            f(r9kVar, fgfVar.d, oddsEventUIModel.c, xtcVar, yqo.H(769334809, av8Var, new er6(oddsEventUIModel, fgfVar, oldVar2, vmdVar, 10)), av8Var, (i3 & 14) | 24576 | ((i3 >> 6) & 7168), 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bi(r9kVar, oldVar, fgfVar, oddsEventUIModel, vmdVar, xtcVar, i, 0);
        }
    }
}
