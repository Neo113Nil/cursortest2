package defpackage;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.transfers.model.FantasyTransferPlayers;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ak implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ak(int i, Context context, boolean z, Function1 function1) {
        this.a = 0;
        vmd vmdVar = vmd.EVENT_DETAILS;
        this.d = i;
        this.b = context;
        this.c = z;
        this.e = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04f4  */
    @Override // defpackage.ct8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float f;
        gv9<FantasyTransferPlayers> gv9Var;
        int i;
        boolean z;
        boolean z2;
        String str;
        int i2;
        int i3;
        int i4;
        long f2;
        int i5;
        String str2;
        boolean z3;
        int i6;
        boolean z4;
        long f3;
        int i7;
        int i8;
        boolean z5;
        Integer num;
        String str3;
        kv1 kv1Var;
        kv1 kv1Var2;
        int i9 = this.a;
        a99 a99Var = nf3.a;
        boolean z6 = this.c;
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i10 = this.d;
        Object obj4 = this.e;
        Object obj5 = this.b;
        switch (i9) {
            case 0:
                vmd vmdVar = vmd.EVENT_DETAILS;
                Context context = (Context) obj5;
                Function1 function1 = (Function1) obj4;
                ek ekVar = (ek) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ekVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).g(ekVar) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    xtc J = lz.J(bkh.c, jaa.L(av8Var), null);
                    ng0 ng0Var = new ng0(8.0f, true, new a70(6));
                    t3e C = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ekVar.e != null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 5);
                    boolean z7 = (intValue & 14) == 4;
                    int i11 = this.d;
                    boolean e = av8Var.e(i11) | z7 | av8Var.e(6) | av8Var.i(context);
                    boolean z8 = this.c;
                    boolean h = e | av8Var.h(z8) | av8Var.g(function1);
                    Object O = av8Var.O();
                    if (h || O == a99Var) {
                        O = new ck(ekVar, i11, z8, context, function1);
                        av8Var.n0(O);
                    }
                    v8a.a(J, null, C, ng0Var, null, null, false, null, (Function1) O, av8Var, 24576, 490);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                lj7 lj7Var = (lj7) obj4;
                Context context2 = (Context) obj5;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                lv1 lv1Var = uxf.m;
                ((v23) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    utc utcVar = utc.a;
                    xtc f0 = l98.f0(l98.d0(bkh.d(utcVar, 1.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5);
                    u23 a = t23.a(ww9.d, uxf.o, av8Var2, 0);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    xtc C2 = fqj.C(av8Var2, f0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var2, a, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var2, m, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var2, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var2, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var2, C2, f50Var3);
                    boolean z9 = lj7Var.h;
                    float f5 = lj7Var.d;
                    gv9 gv9Var2 = lj7Var.f;
                    boolean z10 = lj7Var.g;
                    int i12 = lj7Var.e;
                    if (z9) {
                        gv9Var = gv9Var2;
                        i2 = -1529858624;
                        i = i10;
                        i3 = R.string.fantasy_quick_fix_played;
                        f = f5;
                        z = false;
                    } else {
                        f = f5;
                        gv9Var = gv9Var2;
                        i = i10;
                        z = false;
                        if (z10) {
                            i2 = -1529855484;
                            i3 = R.string.fantasy_rebuild_squad_played;
                        } else {
                            if (i12 > 0) {
                                av8Var2.d0(-1529852422);
                                String str4 = oea.v(R.string.fantasy_transfer_points_fee, av8Var2) + ": " + (-i12);
                                z2 = false;
                                av8Var2.s(false);
                                str = str4;
                            } else {
                                z2 = false;
                                av8Var2.d0(-180683021);
                                av8Var2.s(false);
                                str = null;
                            }
                            if (!z9 || z10) {
                                i4 = i12;
                                f2 = ljg.f(av8Var2, -1529845185, R.color.primary_highlight, av8Var2, z2);
                            } else if (i12 > 0) {
                                i4 = i12;
                                f2 = ljg.f(av8Var2, -1529843331, R.color.score_highlight, av8Var2, z2);
                            } else {
                                i4 = i12;
                                f2 = ljg.f(av8Var2, -1529841933, R.color.n_lv_1, av8Var2, z2);
                            }
                            i5 = R.color.error;
                            if (!z9 || z10) {
                                str2 = str;
                                z3 = false;
                                i6 = -1529837699;
                                i5 = R.color.primary_default;
                            } else if (i4 > 0) {
                                str2 = str;
                                i6 = -1529835916;
                                z3 = false;
                            } else {
                                str2 = str;
                                z3 = false;
                                i6 = -1529834797;
                                i5 = R.color.n_lv_1;
                            }
                            long f6 = ljg.f(av8Var2, i6, i5, av8Var2, z3);
                            xtc d = bkh.d(utcVar, 1.0f);
                            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var2, 48);
                            long j = f2;
                            int hashCode2 = Long.hashCode(av8Var2.T);
                            aee m2 = av8Var2.m();
                            xtc C3 = fqj.C(av8Var2, d);
                            av8Var2.h0();
                            if (av8Var2.S) {
                                av8Var2.q0();
                            } else {
                                av8Var2.l(zg3Var);
                            }
                            waa.K(av8Var2, a2, f50Var);
                            waa.K(av8Var2, m2, ff3Var);
                            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
                            waa.K(av8Var2, C3, f50Var3);
                            String B = f5p.B(context2, lj7Var.c, lj7Var.b);
                            yf8 yf8Var = xth.a;
                            udj.c(B, fn0.e(1.0f, l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), true), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var2, 0, 24960, 110584);
                            if (str2 != null) {
                                av8Var2.d0(-1668764209);
                                av8Var2.s(false);
                            } else {
                                av8Var2.d0(-1668764208);
                                nq8.h(av8Var2, bkh.e(utcVar, 16.0f));
                                udj.c(str2, l98.c0(n9e.q(utcVar, j, o7g.a(8.0f)), 4.0f, 2.0f), f6, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var2, 0, 24960, 110584);
                                Unit unit = Unit.a;
                                av8Var2.s(false);
                            }
                            bf3.t(av8Var2, true, utcVar, 8.0f, av8Var2);
                            if (gv9Var.isEmpty()) {
                                av8Var2.d0(-178608500);
                                m6k.i(0, av8Var2, null);
                                nq8.h(av8Var2, bkh.e(utcVar, 8.0f));
                                av8Var2.d0(-1529779679);
                                for (FantasyTransferPlayers fantasyTransferPlayers : gv9Var) {
                                    av8Var2.a0(-2115396639, fantasyTransferPlayers.b.b + "_" + fantasyTransferPlayers.a.b);
                                    o1j.g(fantasyTransferPlayers, this.c, null, null, Integer.valueOf(i), av8Var2, 0, 12);
                                    av8Var2.s(false);
                                }
                                bf3.t(av8Var2, false, utcVar, 8.0f, av8Var2);
                                xtc d2 = bkh.d(utcVar, 1.0f);
                                l8g a3 = k8g.a(ww9.c, lv1Var, av8Var2, 54);
                                int hashCode3 = Long.hashCode(av8Var2.T);
                                aee m3 = av8Var2.m();
                                xtc C4 = fqj.C(av8Var2, d2);
                                if3.k7.getClass();
                                zg3 zg3Var2 = hf3.b;
                                av8Var2.h0();
                                if (av8Var2.S) {
                                    av8Var2.l(zg3Var2);
                                } else {
                                    av8Var2.q0();
                                }
                                waa.K(av8Var2, a3, hf3.g);
                                waa.K(av8Var2, m3, hf3.f);
                                waa.K(av8Var2, Integer.valueOf(hashCode3), hf3.j);
                                waa.J(av8Var2, hf3.k);
                                waa.K(av8Var2, C4, hf3.d);
                                String y = dmi.y(oea.v(R.string.fantasy_bank_change, av8Var2), ":");
                                yf8 yf8Var2 = xth.a;
                                udj.c(y, null, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var2, 0, 24960, 110586);
                                nq8.h(av8Var2, bkh.p(utcVar, 4.0f));
                                float f7 = f;
                                String T = ml4.T(context2, f7);
                                dfj l = xth.l();
                                av8Var2.d0(1886154176);
                                int compare = Double.compare(yid.s(f7, 1), 0.0d);
                                if (compare < 0) {
                                    i7 = -700438368;
                                    i8 = R.color.error;
                                    z4 = false;
                                } else {
                                    z4 = false;
                                    if (compare > 0) {
                                        i7 = -700436670;
                                        i8 = R.color.success;
                                    } else {
                                        f3 = ljg.f(av8Var2, -700434977, R.color.n_lv_1, av8Var2, false);
                                        long j2 = f3;
                                        av8Var2.s(z4);
                                        udj.c(T, null, j2, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, l, av8Var2, 0, 0, 131066);
                                        z5 = true;
                                        av8Var2.s(true);
                                        av8Var2.s(false);
                                    }
                                }
                                f3 = ljg.f(av8Var2, i7, i8, av8Var2, z4);
                                long j22 = f3;
                                av8Var2.s(z4);
                                udj.c(T, null, j22, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, l, av8Var2, 0, 0, 131066);
                                z5 = true;
                                av8Var2.s(true);
                                av8Var2.s(false);
                            } else {
                                av8Var2.d0(-178884121);
                                udj.c(oea.v(R.string.fantasy_no_transfers_made, av8Var2), null, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var2, 0, 0, 131066);
                                av8Var2.s(false);
                                z5 = true;
                            }
                            av8Var2.s(z5);
                        }
                    }
                    str = ljg.k(av8Var2, i2, i3, av8Var2, z);
                    z2 = z;
                    if (z9) {
                    }
                    i4 = i12;
                    f2 = ljg.f(av8Var2, -1529845185, R.color.primary_highlight, av8Var2, z2);
                    i5 = R.color.error;
                    if (z9) {
                    }
                    str2 = str;
                    z3 = false;
                    i6 = -1529837699;
                    i5 = R.color.primary_default;
                    long f62 = ljg.f(av8Var2, i6, i5, av8Var2, z3);
                    xtc d3 = bkh.d(utcVar, 1.0f);
                    l8g a22 = k8g.a(ww9.b, lv1Var, av8Var2, 48);
                    long j3 = f2;
                    int hashCode22 = Long.hashCode(av8Var2.T);
                    aee m22 = av8Var2.m();
                    xtc C32 = fqj.C(av8Var2, d3);
                    av8Var2.h0();
                    if (av8Var2.S) {
                    }
                    waa.K(av8Var2, a22, f50Var);
                    waa.K(av8Var2, m22, ff3Var);
                    bf3.s(hashCode22, av8Var2, f50Var2, av8Var2, ryVar);
                    waa.K(av8Var2, C32, f50Var3);
                    String B2 = f5p.B(context2, lj7Var.c, lj7Var.b);
                    yf8 yf8Var3 = xth.a;
                    udj.c(B2, fn0.e(1.0f, l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), true), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var2, 0, 24960, 110584);
                    if (str2 != null) {
                    }
                    bf3.t(av8Var2, true, utcVar, 8.0f, av8Var2);
                    if (gv9Var.isEmpty()) {
                    }
                    av8Var2.s(z5);
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                r2f r2fVar = (r2f) obj5;
                Function0 function0 = (Function0) obj4;
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    u0a.g(this.d, r2fVar, this.c, function0, av8Var3, 0);
                } else {
                    av8Var3.W();
                }
                break;
            case 3:
                jfj jfjVar = (jfj) obj5;
                jfj jfjVar2 = (jfj) obj4;
                of3 of3Var4 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((o8g) obj).getClass();
                v20 v20Var = new v20(i10);
                vy8 K = nq8.K(10.0f);
                Integer num2 = jfjVar.b;
                c5n.n(v20Var, K, 0, new t13(new fjj(new h1g(num2 != null ? num2.intValue() : R.color.widget_icons))), of3Var4, 32816, 8);
                ty8 ty8Var = ty8.a;
                aba.i(nq8.N(ty8Var, 4.0f), of3Var4, 0);
                String str5 = jfjVar.a;
                String str6 = str5 == null ? "" : str5;
                yf8 yf8Var4 = xth.a;
                o3a.i(str6, null, l98.j0(xth.c(), Integer.valueOf(num2 != null ? num2.intValue() : R.color.widget_icons), of3Var4), 1, of3Var4, 3072, 2);
                aba.i(o8g.a(), of3Var4, 0);
                aba.i(nq8.N(ty8Var, 4.0f), of3Var4, 0);
                v20 v20Var2 = new v20(R.drawable.cup_logo_placeholder);
                if (z6) {
                    f4 = 10.0f;
                }
                c5n.n(v20Var2, nq8.K(f4), 0, new t13(new fjj(new h1g(R.color.widget_icons))), of3Var4, 32816, 8);
                aba.i(nq8.N(ty8Var, 4.0f), of3Var4, 0);
                o3a.i((jfjVar2 == null || (str3 = jfjVar2.a) == null) ? "" : str3, null, l98.j0(xth.c(), Integer.valueOf((jfjVar2 == null || (num = jfjVar2.b) == null) ? R.color.n_lv_3 : num.intValue()), of3Var4), 1, of3Var4, 3072, 2);
                break;
            default:
                rfl rflVar = (rfl) obj5;
                Function1 function12 = (Function1) obj4;
                of3 of3Var5 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                utc utcVar2 = utc.a;
                xtc f02 = l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                p4h p4hVar = ww9.d;
                kv1 kv1Var3 = uxf.o;
                u23 a4 = t23.a(p4hVar, kv1Var3, of3Var5, 0);
                av8 av8Var4 = (av8) of3Var5;
                int hashCode4 = Long.hashCode(av8Var4.T);
                aee m4 = av8Var4.m();
                xtc C5 = fqj.C(of3Var5, f02);
                if3.k7.getClass();
                zg3 zg3Var3 = hf3.b;
                av8 av8Var5 = (av8) of3Var5;
                av8Var5.h0();
                if (av8Var5.S) {
                    av8Var5.l(zg3Var3);
                } else {
                    av8Var5.q0();
                }
                f50 f50Var4 = hf3.g;
                waa.K(of3Var5, a4, f50Var4);
                ff3 ff3Var2 = hf3.f;
                waa.K(of3Var5, m4, ff3Var2);
                Integer valueOf2 = Integer.valueOf(hashCode4);
                f50 f50Var5 = hf3.j;
                waa.K(of3Var5, valueOf2, f50Var5);
                ry ryVar2 = hf3.k;
                waa.J(of3Var5, ryVar2);
                f50 f50Var6 = hf3.d;
                waa.K(of3Var5, C5, f50Var6);
                xtc f03 = l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7);
                gv9 gv9Var3 = rflVar.a;
                ifl iflVar = rflVar.i;
                sfl sflVar = rflVar.d;
                u1h u1hVar = u1h.f;
                boolean g = av8Var5.g(function12);
                Object O2 = av8Var5.O();
                if (g || O2 == a99Var) {
                    kv1Var = kv1Var3;
                    O2 = new fuj(7, function12);
                    av8Var5.n0(O2);
                } else {
                    kv1Var = kv1Var3;
                }
                l4a.a(gv9Var3, sflVar, (Function1) O2, f03, u1hVar, false, of3Var5, 27648, 32);
                l98.b(rflVar.d, null, null, null, null, null, yqo.H(-748876953, of3Var5, new vfl(rflVar, function12, i10, z6)), of3Var5, 1572864, 62);
                if ((iflVar != null ? iflVar.b : null) != null) {
                    av8Var5.d0(-922272097);
                    q5a.u(iflVar, function12, of3Var5, 0);
                    av8Var5.s(false);
                } else {
                    av8Var5.d0(-922177919);
                    av8Var5.s(false);
                }
                kg0 kg0Var = ww9.h;
                xtc f04 = l98.f0(bkh.d(utcVar2, 1.0f), 16.0f, 16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                l8g a5 = k8g.a(kg0Var, uxf.l, of3Var5, 6);
                int hashCode5 = Long.hashCode(av8Var5.T);
                aee m5 = av8Var5.m();
                xtc C6 = fqj.C(of3Var5, f04);
                av8Var5.h0();
                if (av8Var5.S) {
                    av8Var5.l(zg3Var3);
                } else {
                    av8Var5.q0();
                }
                waa.K(of3Var5, a5, f50Var4);
                waa.K(of3Var5, m5, ff3Var2);
                waa.K(of3Var5, Integer.valueOf(hashCode5), f50Var5);
                waa.J(of3Var5, ryVar2);
                waa.K(of3Var5, C6, f50Var6);
                if (rflVar.c) {
                    av8Var5.d0(1879549202);
                    String v = oea.v(R.string.add_widget, of3Var5);
                    boolean g2 = av8Var5.g(function12);
                    Object O3 = av8Var5.O();
                    if (g2 || O3 == a99Var) {
                        O3 = new b4j(11, function12);
                        av8Var5.n0(O3);
                    }
                    kv1Var2 = kv1Var;
                    mha.h(v, (Function0) O3, null, vqh.a, new bqh(s6a.N(R.drawable.ic_add_10, 6, of3Var5), kv1Var2), false, false, false, 0L, 0, 0, of3Var5, 3072, 0, IronSourceError.ERROR_NEW_INIT_API_ALREADY_CALLED);
                    av8Var5.s(false);
                } else {
                    kv1Var2 = kv1Var;
                    av8Var5.d0(1880121927);
                    nq8.h(of3Var5, new goa(1.0f, true));
                    av8Var5.s(false);
                }
                String v2 = oea.v(R.string.change_team, of3Var5);
                bqh bqhVar = new bqh(s6a.N(R.drawable.ic_swap_16, 6, of3Var5), kv1Var2);
                boolean g3 = av8Var5.g(function12);
                Object O4 = av8Var5.O();
                if (g3 || O4 == a99Var) {
                    O4 = new b4j(12, function12);
                    av8Var5.n0(O4);
                }
                mha.h(v2, (Function0) O4, null, sqh.a, bqhVar, false, false, false, 500L, 0, 0, of3Var5, 100666368, 0, 1764);
                av8Var5.s(true);
                av8Var5.s(true);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ak(lj7 lj7Var, Context context, boolean z, int i) {
        this.a = 1;
        this.e = lj7Var;
        this.b = context;
        this.c = z;
        this.d = i;
    }

    public /* synthetic */ ak(rfl rflVar, Function1 function1, int i, boolean z) {
        this.a = 4;
        this.b = rflVar;
        this.e = function1;
        this.d = i;
        this.c = z;
    }

    public /* synthetic */ ak(Object obj, int i, Object obj2, int i2, boolean z) {
        this.a = i2;
        this.d = i;
        this.b = obj;
        this.c = z;
        this.e = obj2;
    }
}
