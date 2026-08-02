package defpackage;

import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class i56 {
    static {
        Double valueOf = Double.valueOf(8.7d);
        mte mteVar = new mte(884189, "Lionel Messi", valueOf, null, null, 4792, "Inter Miami", null, null);
        Double valueOf2 = Double.valueOf(7.9d);
        mte mteVar2 = new mte(1012458, "Luis Suárez", valueOf2, null, null, 4792, "Inter Miami", null, null);
        Double valueOf3 = Double.valueOf(7.4d);
        l6g.K(mteVar, mteVar2, new mte(1396639, "Sergio Busquets", valueOf3, null, null, 4792, "Inter Miami", null, null));
        l6g.K(new mte(884189, "Lionel Messi", valueOf, Double.valueOf(100.0d), 1240, 4792, "Inter Miami", null, null), new mte(1012458, "Luis Suárez", valueOf2, Double.valueOf(24.0d), 480, 4792, "Inter Miami", null, null), new mte(1396639, "Sergio Busquets", valueOf3, Double.valueOf(14.0d), 280, 4792, "Inter Miami", null, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
    
        if (r15 == defpackage.nf3.a) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(int i, of3 of3Var, xtc xtcVar, boolean z, boolean z2) {
        av8 av8Var;
        Object obj;
        ?? r0;
        utc utcVar;
        long j;
        float f;
        Pair[] pairArr;
        float f2;
        av8 av8Var2;
        av8 av8Var3;
        jf9 jf9Var = oyn.e;
        av8 av8Var4 = (av8) of3Var;
        av8Var4.f0(-727351336);
        int i2 = i | (av8Var4.h(z) ? 4 : 2);
        if (av8Var4.T(i2 & 1, (i2 & 147) != 146)) {
            long f3 = z ? ljg.f(av8Var4, 1095041093, R.color.surface_2, av8Var4, false) : ljg.f(av8Var4, 1095041701, R.color.surface_1, av8Var4, false);
            long f4 = z ? ljg.f(av8Var4, 1095043813, R.color.surface_1, av8Var4, false) : ljg.f(av8Var4, 1095044421, R.color.surface_2, av8Var4, false);
            boolean f5 = av8Var4.f(f4) | av8Var4.f(f3);
            Object O = av8Var4.O();
            if (!f5) {
                obj = O;
            }
            Pair[] pairArr2 = {new Pair(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), new r13(f4)), new Pair(Float.valueOf(1.0f), new r13(f3))};
            av8Var4.n0(pairArr2);
            obj = pairArr2;
            Pair[] pairArr3 = (Pair[]) obj;
            lv1 lv1Var = uxf.m;
            ng0 ng0Var = new ng0(4.0f, true, new a70(6));
            xtc c0 = l98.c0(n9e.q(bkh.d(xtcVar, 1.0f), f3, o7g.a(8.0f)), 8.0f, 4.0f);
            l8g a = k8g.a(ng0Var, lv1Var, av8Var4, 54);
            int hashCode = Long.hashCode(av8Var4.T);
            aee m = av8Var4.m();
            xtc C = fqj.C(av8Var4, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var4.h0();
            if (av8Var4.S) {
                av8Var4.l(zg3Var);
            } else {
                av8Var4.q0();
            }
            waa.K(av8Var4, a, hf3.g);
            waa.K(av8Var4, m, hf3.f);
            waa.K(av8Var4, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var4, hf3.k);
            waa.K(av8Var4, C, hf3.d);
            utc utcVar2 = utc.a;
            if (z2) {
                av8Var4.d0(-1493049790);
                xtc d0 = l98.d0(n9e.q(bkh.p(utcVar2, 24.0f), f4, jf9Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6.0f, 1);
                long D = lz.D(R.color.n_lv_3, av8Var4);
                yf8 yf8Var = xth.a;
                j = f4;
                f = 4.0f;
                r0 = 0;
                utcVar = utcVar2;
                f2 = 1.0f;
                pairArr = pairArr3;
                q5a.w("?", d0, D, null, 0L, 0L, new p7j(3), 0L, 0, false, 0, 0, xth.n(), av8Var4, 6, 0, 130040);
                av8 av8Var5 = av8Var4;
                av8Var5.s(false);
                av8Var2 = av8Var5;
            } else {
                r0 = 0;
                utcVar = utcVar2;
                j = f4;
                f = 4.0f;
                pairArr = pairArr3;
                f2 = 1.0f;
                av8Var4.d0(-1492697754);
                av8Var4.s(false);
                av8Var2 = av8Var4;
            }
            wkn.k(haa.t(R.drawable.player_photo_placeholder, r0, av8Var2), null, bkh.l(utcVar, 32.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var2, 440, 120);
            e12.a(r0, av8Var2, n9e.p(fn0.e(f2, bkh.e(utcVar, 16.0f), true), wxf.t((Pair[]) Arrays.copyOf(pairArr, pairArr.length), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), o7g.a(f), 4));
            if (z2) {
                av8Var2.d0(-1491873402);
                av8Var2.s(r0);
                av8Var3 = av8Var2;
            } else {
                av8Var2.d0(-1492225438);
                xtc d02 = l98.d0(n9e.q(bkh.p(utcVar, 24.0f), j, jf9Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6.0f, 1);
                long D2 = lz.D(R.color.n_lv_3, av8Var2);
                yf8 yf8Var2 = xth.a;
                of3 of3Var2 = av8Var2;
                q5a.w("?", d02, D2, null, 0L, 0L, new p7j(3), 0L, 0, false, 0, 0, xth.n(), of3Var2, 6, 0, 130040);
                av8 av8Var6 = of3Var2;
                av8Var6.s(r0);
                av8Var3 = av8Var6;
            }
            av8Var3.s(true);
            av8Var = av8Var3;
        } else {
            av8Var4.W();
            av8Var = av8Var4;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ej5(z, z2, xtcVar, i);
        }
    }

    public static final void b(Function0 function0, Long l, xtc xtcVar, boolean z, of3 of3Var, int i) {
        int i2;
        Long l2;
        xtc xtcVar2;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1560491186);
        if ((i & 6) == 0) {
            i2 = (av8Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(l) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= av8Var.h(z) ? a.o : 1024;
        }
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            kv1 kv1Var = uxf.p;
            p4h p4hVar = ww9.d;
            u23 a = t23.a(p4hVar, kv1Var, av8Var, 48);
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
            String v = oea.v(R.string.fans_player_of_the_match_pick, av8Var);
            yf8 yf8Var = xth.a;
            int i4 = i3;
            q5a.w(v, l98.f0(bkh.e(utcVar, 32.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.n_lv_1, av8Var), null, 0L, 0L, null, 0L, 2, false, 1, 0, xth.b(), av8Var, 48, 24960, 110584);
            xtc h = ljg.h(8.0f, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), lz.D(R.color.surface_2, av8Var), 8.0f);
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, h);
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
            c5n.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 29, lz.D(R.color.n_lv_3, av8Var), 0L, av8Var, null);
            nq8.h(av8Var, bkh.e(utcVar, 8.0f));
            l2 = l;
            wnn.g(l2, null, z, av8Var, (i4 >> 3) & 910);
            String g = bf3.g(8.0f, R.string.vote_now_button, av8Var, av8Var, utcVar);
            dfj a3 = xth.a();
            long D = lz.D(R.color.on_color_primary, av8Var);
            xtc q = n9e.q(utcVar, lz.D(R.color.primary_default, av8Var), o7g.a(4.0f));
            long D2 = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = b74.s;
                av8Var.n0(O2);
            }
            xtcVar2 = utcVar;
            udj.c(g, bkh.d(l98.d0(tol.y(q, true, true, true, D2, wzcVar, new gm((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function0, 19), av8Var, 0), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), 1.0f), D, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, a3, av8Var, 0, 0, 130040);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            l2 = l;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s73(function0, l2, xtcVar2, z, i);
        }
    }

    public static final void c(vte vteVar, Function1 function1, Function0 function0, xtc xtcVar, Function0 function02, boolean z, boolean z2, of3 of3Var, int i) {
        xtc xtcVar2;
        utc utcVar;
        boolean z3;
        float f;
        boolean z4;
        boolean z5;
        function1.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1703010894);
        int i2 = 4;
        int i3 = i | (av8Var.g(vteVar) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 3072 | (av8Var.i(function02) ? 16384 : 8192) | (av8Var.h(z) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.h(z2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (av8Var.T(i3 & 1, (599187 & i3) != 599186)) {
            utc utcVar2 = utc.a;
            xtc d = bkh.d(utcVar2, 1.0f);
            u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d);
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
            boolean z6 = vteVar instanceof ste;
            boolean z7 = z6 && ((ste) vteVar).c;
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = e.f(Boolean.FALSE);
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) O;
            fz8.b(x23.a, z7 && z && !((Boolean) e1dVar.getValue()).booleanValue(), null, null, null, null, yqo.H(965449216, av8Var, new qm4(i2, function02, e1dVar)), av8Var, 1572870, 30);
            if (!z6 || ((ste) vteVar).a == null) {
                av8Var.d0(1398286622);
                mte a2 = vteVar.a();
                if (a2 == null) {
                    gv9 b = vteVar.b();
                    a2 = b != null ? (mte) CollectionsKt.firstOrNull(b) : null;
                }
                String H = s02.H((vteVar.a() != null || ((vteVar instanceof rte) && ((rte) vteVar).a != null)) ? R.string.player_of_the_match : R.string.player_of_the_match_race, a2 != null ? a2.h : null, null, av8Var, 4);
                utcVar = utcVar2;
                z3 = false;
                rha.b(H, null, 0L, av8Var, 0, 6);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                av8Var.d0(1398897818);
                av8Var.s(false);
                utcVar = utcVar2;
                z3 = false;
            }
            if (z6) {
                av8Var.d0(1399006721);
                ste steVar = (ste) vteVar;
                mte mteVar = steVar.a;
                if (mteVar == null) {
                    av8Var.d0(1399032264);
                    av8Var.s(z3);
                } else {
                    av8Var.d0(1399032265);
                    av8 av8Var2 = av8Var;
                    wkn.c(mteVar, function1, l98.b0(utcVar, 8.0f), !z2, false, av8Var2, (i3 & 112) | 384, 16);
                    av8Var = av8Var2;
                    Unit unit = Unit.a;
                    av8Var.s(z3);
                }
                for (mte mteVar2 : steVar.b) {
                    av8Var.a0(563740828, Integer.valueOf(mteVar2.a));
                    rd0.f(mteVar2, false, function1, null, null, !z2, av8Var, ((i3 << 3) & 896) | 3120);
                    av8Var.s(z3);
                    i3 = i3;
                }
                av8Var.s(z3);
            } else if (vteVar instanceof tte) {
                av8Var.d0(1399874473);
                tte tteVar = (tte) vteVar;
                av8 av8Var3 = av8Var;
                int i4 = i3 << 9;
                d(tteVar.a, null, tteVar.b, tteVar.e, function1, function0, tteVar.c, false, z2, tteVar.g, tteVar.f, av8Var3, (i4 & 57344) | 12582912 | (i4 & 458752) | (234881024 & (i3 << 6)), 0);
                av8Var = av8Var3;
                av8Var.s(z3);
            } else if (vteVar instanceof qte) {
                av8Var.d0(1400580188);
                qte qteVar = (qte) vteVar;
                mte mteVar3 = qteVar.a;
                mte mteVar4 = qteVar.c;
                gv9 gv9Var = qteVar.b;
                gv9 gv9Var2 = qteVar.f;
                av8 av8Var4 = av8Var;
                Integer num = qteVar.d;
                long j = qteVar.g;
                int i5 = i3 << 9;
                d(mteVar3, mteVar4, gv9Var, gv9Var2, function1, function0, num, true, z2, j, null, av8Var4, (i5 & 458752) | (i5 & 57344) | 12582912 | (234881024 & (i3 << 6)), 6);
                av8Var = av8Var4;
                av8Var.s(z3);
            } else {
                if (vteVar instanceof ute) {
                    av8Var.d0(1401303604);
                    ute uteVar = (ute) vteVar;
                    Integer num2 = uteVar.a;
                    f = 8.0f;
                    int i6 = i3 << 12;
                    int i7 = (i6 & 458752) | 12582960 | (i6 & 3670016) | ((i3 << 9) & 1879048192);
                    av8 av8Var5 = av8Var;
                    td4.m(null, false, uteVar.a, uteVar.e, uteVar.d, function1, function0, l98.b0(utcVar, 8.0f), z2, av8Var5, i7);
                    av8Var = av8Var5;
                    if (num2 == null) {
                        av8Var.d0(1401825458);
                        int i8 = 0;
                        while (i8 < 3) {
                            av8Var.a0(253166003, Integer.valueOf(i8));
                            a(432, av8Var, l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), i8 == 2, false);
                            av8Var.s(false);
                            i8++;
                        }
                        z5 = false;
                        av8Var.s(false);
                    } else {
                        av8Var.d0(1402255521);
                        for (mte mteVar5 : uteVar.c) {
                            av8Var.a0(-429252082, Integer.valueOf(mteVar5.a));
                            num2.getClass();
                            rd0.f(mteVar5, false, function1, num2, null, false, av8Var, ((i3 << 3) & 896) | 196656);
                            av8Var.s(false);
                        }
                        z5 = false;
                        av8Var.s(false);
                    }
                    av8Var.s(z5);
                } else {
                    f = 8.0f;
                    if (!(vteVar instanceof rte)) {
                        throw dmi.h(av8Var, 45131023, false);
                    }
                    av8Var.d0(1402878497);
                    rte rteVar = (rte) vteVar;
                    int i9 = i3 << 12;
                    av8 av8Var6 = av8Var;
                    td4.m(rteVar.a, true, rteVar.b, rteVar.e, null, function1, function0, l98.b0(utcVar, 8.0f), z2, av8Var6, (i9 & 458752) | 12607536 | (3670016 & i9) | (1879048192 & (i3 << 9)));
                    av8Var = av8Var6;
                    for (mte mteVar6 : rteVar.d) {
                        av8Var.a0(-1494294167, Integer.valueOf(mteVar6.a));
                        rd0.f(mteVar6, false, function1, rteVar.b, null, false, av8Var, ((i3 << 3) & 896) | 196656);
                        av8Var.s(false);
                    }
                    av8Var.s(false);
                }
                z4 = true;
                w1l.s(utcVar, f, av8Var, z4);
                xtcVar2 = utcVar;
            }
            z4 = true;
            f = 8.0f;
            w1l.s(utcVar, f, av8Var, z4);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ri4(vteVar, function1, function0, xtcVar2, function02, z, z2, i);
        }
    }

    public static final void d(final mte mteVar, final mte mteVar2, gv9 gv9Var, final gv9 gv9Var2, final Function1 function1, Function0 function0, final Integer num, final boolean z, final boolean z2, final long j, final Long l, of3 of3Var, final int i, final int i2) {
        Function1 function12;
        Long l2;
        int i3;
        Function0 function02;
        av8 av8Var;
        gv9 gv9Var3;
        utc utcVar;
        kv1 kv1Var;
        wxf wxfVar;
        p4h p4hVar;
        int i4;
        float f;
        float f2;
        boolean z3;
        p4h p4hVar2 = ww9.d;
        kv1 kv1Var2 = uxf.p;
        wxf wxfVar2 = ww9.b;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(624449479);
        int i5 = (i & 6) == 0 ? (av8Var2.g(mteVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= av8Var2.g(mteVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= av8Var2.g(gv9Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= av8Var2.g(gv9Var2) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            function12 = function1;
            i5 |= av8Var2.i(function12) ? 16384 : 8192;
        } else {
            function12 = function1;
        }
        if ((i & 196608) == 0) {
            i5 |= av8Var2.i(function0) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((i & 1572864) == 0) {
            i5 |= av8Var2.g(num) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i5 |= av8Var2.h(z) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i5 |= av8Var2.h(z2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i5 |= av8Var2.f(j) ? 536870912 : 268435456;
        }
        int i6 = i5;
        if ((i2 & 6) == 0) {
            l2 = l;
            i3 = i2 | (av8Var2.g(l2) ? 4 : 2);
        } else {
            l2 = l;
            i3 = i2;
        }
        if (av8Var2.T(i6 & 1, ((i6 & 306783379) == 306783378 && (i3 & 3) == 2) ? false : true)) {
            utc utcVar2 = utc.a;
            if (mteVar != null) {
                av8Var2.d0(1471534605);
                int i7 = i6 >> 6;
                kv1Var = kv1Var2;
                wxfVar = wxfVar2;
                p4hVar = p4hVar2;
                utcVar = utcVar2;
                ktm.e(mteVar, mteVar2, function12, function0, num, j, l2, z, l98.b0(utcVar2, 8.0f), z2, av8Var2, (i6 & 14) | 100663296 | (i6 & 112) | (i7 & 896) | (i7 & 7168) | (i7 & 57344) | ((i6 >> 12) & 458752) | ((i3 << 18) & 3670016) | (i6 & 29360128), (i6 >> 24) & 14);
                av8Var = av8Var2;
                i4 = 0;
                av8Var.s(false);
            } else {
                utcVar = utcVar2;
                kv1Var = kv1Var2;
                wxfVar = wxfVar2;
                av8Var = av8Var2;
                p4hVar = p4hVar2;
                i4 = 0;
                av8Var.d0(1471984539);
                av8Var.s(false);
            }
            l8g a = k8g.a(wxfVar, uxf.l, av8Var, i4);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, utcVar);
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
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
                f2 = Float.MAX_VALUE;
            } else {
                f = 1.0f;
                f2 = Float.MAX_VALUE;
            }
            goa goaVar = new goa(f, true);
            p4h p4hVar3 = p4hVar;
            kv1 kv1Var3 = kv1Var;
            u23 a2 = t23.a(p4hVar3, kv1Var3, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, goaVar);
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
            if (mteVar == null && mteVar2 == null) {
                av8Var.d0(602502272);
                String v = oea.v(R.string.sofascore_rating, av8Var);
                yf8 yf8Var = xth.a;
                q5a.w(v, l98.f0(bkh.e(utcVar, 32.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.n_lv_1, av8Var), null, 0L, 0L, null, 0L, 2, false, 1, 0, xth.b(), av8Var, 48, 24960, 110584);
                av8Var.s(false);
            } else {
                av8Var.d0(602916897);
                av8Var.s(false);
            }
            av8Var.d0(989281767);
            gv9Var3 = gv9Var;
            for (mte mteVar3 : CollectionsKt.L0(gv9Var3, 3)) {
                av8Var.a0(1276467840, Integer.valueOf(mteVar3.a));
                rd0.f(mteVar3, true, function1, num, null, !z2, av8Var, ((i6 >> 6) & 896) | 48 | ((i6 >> 9) & 7168));
                av8Var.s(false);
            }
            av8Var.s(false);
            av8Var.s(true);
            float f3 = 8.0f;
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar2 = new goa(1.0f > f2 ? f2 : 1.0f, true);
            u23 a3 = t23.a(p4hVar3, uxf.o, av8Var, 0);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, goaVar2);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            f50 f50Var4 = hf3.g;
            waa.K(av8Var, a3, f50Var4);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var, m3, ff3Var2);
            Integer valueOf2 = Integer.valueOf(hashCode3);
            f50 f50Var5 = hf3.j;
            waa.K(av8Var, valueOf2, f50Var5);
            ry ryVar2 = hf3.k;
            waa.J(av8Var, ryVar2);
            f50 f50Var6 = hf3.d;
            waa.K(av8Var, C3, f50Var6);
            if (mteVar == null && num == null && !z) {
                av8Var.d0(1074641448);
                int i8 = i6 >> 15;
                b(function0, l, null, z2, av8Var, (i8 & 14) | ((i3 << 3) & 112) | (i8 & 7168));
                function02 = function0;
                av8Var.s(false);
            } else {
                function02 = function0;
                if (num != null || z) {
                    av8Var.d0(1075035148);
                    if (mteVar2 == null && mteVar == null) {
                        av8Var.d0(1075098667);
                        we9 we9Var = new we9(kv1Var3);
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
                            O2 = b74.u;
                            av8Var.n0(O2);
                        }
                        xtc f0 = l98.f0(bkh.e(tol.y(we9Var, true, true, true, D, wzcVar, new gm((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function02, 20), av8Var, 0), 32.0f), 2.0f, 8.0f, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                        k1c c = e12.c(uxf.c, false);
                        int hashCode4 = Long.hashCode(av8Var.T);
                        aee m4 = av8Var.m();
                        xtc C4 = fqj.C(av8Var, f0);
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.l(zg3Var2);
                        } else {
                            av8Var.q0();
                        }
                        waa.K(av8Var, c, f50Var4);
                        waa.K(av8Var, m4, ff3Var2);
                        bf3.s(hashCode4, av8Var, f50Var5, av8Var, ryVar2);
                        waa.K(av8Var, C4, f50Var6);
                        l8g a4 = k8g.a(wxfVar, uxf.m, av8Var, 48);
                        int hashCode5 = Long.hashCode(av8Var.T);
                        aee m5 = av8Var.m();
                        xtc C5 = fqj.C(av8Var, utcVar);
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.l(zg3Var2);
                        } else {
                            av8Var.q0();
                        }
                        waa.K(av8Var, a4, f50Var4);
                        waa.K(av8Var, m5, ff3Var2);
                        bf3.s(hashCode5, av8Var, f50Var5, av8Var, ryVar2);
                        waa.K(av8Var, C5, f50Var6);
                        String v2 = oea.v(R.string.fans_player_of_the_match_pick, av8Var);
                        long D2 = lz.D(R.color.primary_default, av8Var);
                        yf8 yf8Var2 = xth.a;
                        udj.c(v2, null, D2, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
                        if (num != null) {
                            ljg.r(2.0f, -1999533917, av8Var, av8Var, utcVar);
                            kq9.b(s6a.N(R.drawable.ic_chevron_right_large_16, 6, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
                            z3 = false;
                            av8Var.s(false);
                        } else {
                            z3 = false;
                            av8Var.d0(-1999040924);
                            av8Var.s(false);
                        }
                        ljg.t(av8Var, true, true, z3);
                    } else {
                        av8Var.d0(1076696810);
                        av8Var.s(false);
                    }
                    Iterator<E> it = gv9Var2.iterator();
                    while (it.hasNext()) {
                        mte mteVar4 = (mte) it.next();
                        av8Var.a0(-660538344, Integer.valueOf(mteVar4.a));
                        rd0.f(mteVar4, true, function1, num, null, !z2, av8Var, ((i6 >> 6) & 896) | 48 | ((i6 >> 9) & 7168));
                        av8Var.s(false);
                    }
                    av8Var.s(false);
                } else {
                    av8Var.d0(1077255306);
                    int i9 = 0;
                    while (i9 < 3) {
                        av8Var.a0(-884497630, Integer.valueOf(i9));
                        float f4 = f3;
                        a(432, av8Var, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), i9 == 0, true);
                        av8Var.s(false);
                        i9++;
                        f3 = f4;
                    }
                    av8Var.s(false);
                }
            }
            av8Var.s(true);
            av8Var.s(true);
        } else {
            function02 = function0;
            av8Var = av8Var2;
            gv9Var3 = gv9Var;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            final gv9 gv9Var4 = gv9Var3;
            final Function0 function03 = function02;
            u.d = new Function2() { // from class: h56
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(i | 1);
                    int K2 = aba.K(i2);
                    i56.d(mte.this, mteVar2, gv9Var4, gv9Var2, function1, function03, num, z, z2, j, l, (of3) obj, K, K2);
                    return Unit.a;
                }
            };
        }
    }
}
