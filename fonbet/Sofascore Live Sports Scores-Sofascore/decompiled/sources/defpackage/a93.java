package defpackage;

import android.content.Context;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.sofascore.model.profile.InvitedUser;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.onboarding.OnboardingViewModel;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class a93 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a93(boolean z, uza uzaVar, ynj ynjVar, Function1 function1) {
        this.a = 11;
        this.c = z;
        this.d = uzaVar;
        this.e = ynjVar;
        this.b = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v89 */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean, int] */
    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ?? r6;
        boolean z;
        long j;
        ?? r4;
        long j2;
        boolean z2;
        long j3;
        long f;
        boolean z3;
        int i;
        int i2;
        xtc r;
        boolean z4;
        int i3;
        int i4;
        int i5 = this.a;
        Object obj4 = null;
        utc utcVar = utc.a;
        Object obj5 = nf3.a;
        boolean z5 = this.c;
        Object obj6 = this.b;
        Object obj7 = this.e;
        Object obj8 = this.d;
        switch (i5) {
            case 0:
                boolean z6 = false;
                m93 m93Var = (m93) obj8;
                Function1 function1 = (Function1) obj6;
                koh kohVar = (koh) obj7;
                xpa xpaVar = (xpa) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                xpaVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).g(xpaVar) ? 4 : 2;
                }
                if ((intValue & 19) != 18) {
                    z6 = true;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, z6)) {
                    String str = m93Var.b;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = str;
                    Integer num = m93Var.a;
                    boolean z7 = m93Var.d;
                    boolean z8 = this.c;
                    boolean z9 = !z8;
                    boolean i6 = av8Var.i(m93Var) | av8Var.g(function1) | av8Var.h(z8);
                    Object O = av8Var.O();
                    if (i6 || O == obj5) {
                        O = new b93(m93Var, kohVar, z8, function1);
                        av8Var.n0(O);
                    }
                    gz8.s(str2, num, z8, z7, z9, (Function0) O, xpa.a(xpaVar, utcVar, 7), av8Var, 0);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 1:
                gv9 gv9Var = (gv9) obj8;
                Function1 function12 = (Function1) obj6;
                r13 r13Var = (r13) obj7;
                xpa xpaVar2 = (xpa) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                xpaVar2.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).g(xpaVar2) ? 4 : 2;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                    boolean g = av8Var2.g(function12) | av8Var2.g(gv9Var);
                    Object O2 = av8Var2.O();
                    if (g || O2 == obj5) {
                        O2 = new w27(function12, gv9Var);
                        av8Var2.n0(O2);
                    }
                    Function0 function0 = (Function0) O2;
                    av8Var2.d0(-1148538566);
                    xtc q = n9e.q(u0a.F(xpa.a(xpaVar2, utcVar, 7), icb.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 62), lz.D(R.color.surface_1, av8Var2), oyn.e);
                    if (z5) {
                        if (r13Var == null) {
                            z = false;
                            j = ljg.f(av8Var2, 2131218552, R.color.primary_default, av8Var2, false);
                        } else {
                            z = false;
                            av8Var2.d0(2131218118);
                            av8Var2.s(false);
                            j = r13Var.a;
                        }
                        q = q.z(f5p.F(j));
                        r6 = z;
                    } else {
                        r6 = 0;
                    }
                    av8Var2.s(r6);
                    rfo.e(gv9Var, function0, q, av8Var2, r6);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 2:
                a37 a37Var = (a37) obj8;
                Function0 function02 = (Function0) obj6;
                r13 r13Var2 = (r13) obj7;
                xpa xpaVar3 = (xpa) obj;
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                xpaVar3.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((av8) of3Var3).g(xpaVar3) ? 4 : 2;
                }
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 19) != 18)) {
                    boolean z10 = a37Var.f;
                    av8Var3.d0(575903440);
                    av8Var3.d0(575898896);
                    xtc F = u0a.F(xpa.a(xpaVar3, utcVar, 7), icb.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var3, 30);
                    if (z5) {
                        if (r13Var2 == null) {
                            z2 = false;
                            j3 = ljg.f(av8Var3, -371047524, R.color.primary_default, av8Var3, false);
                        } else {
                            z2 = false;
                            av8Var3.d0(-371047958);
                            av8Var3.s(false);
                            j3 = r13Var2.a;
                        }
                        F = F.z(f5p.F(j3));
                        r4 = z2;
                    } else {
                        r4 = 0;
                    }
                    av8Var3.s(r4);
                    if (z5) {
                        if (r13Var2 == null) {
                            j2 = ljg.f(av8Var3, 1245941123, R.color.primary_default, av8Var3, r4);
                        } else {
                            av8Var3.d0(1245940689);
                            av8Var3.s(r4);
                            j2 = r13Var2.a;
                        }
                        F = F.z(td4.Y(utcVar, new yz(j2, 4)));
                    }
                    av8Var3.s(r4);
                    c6o.f(r4, av8Var3, F, function02, z10);
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 3:
                gv9 gv9Var2 = (gv9) obj8;
                Function1 function13 = (Function1) obj6;
                bza bzaVar = (bza) obj7;
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                    utc utcVar2 = utc.a;
                    xtc d = bkh.d(utcVar2, 1.0f);
                    if (z5) {
                        av8Var4.d0(257391008);
                        av8Var4.s(false);
                        f = r13.h;
                    } else {
                        f = ljg.f(av8Var4, 257391554, R.color.surface_1, av8Var4, false);
                    }
                    xtc d0 = l98.d0(n9e.q(d, f, oyn.e), 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    l8g a = k8g.a(ww9.b, uxf.m, av8Var4, 48);
                    int hashCode = Long.hashCode(av8Var4.T);
                    aee m = av8Var4.m();
                    xtc C = fqj.C(av8Var4, d0);
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
                    Iterator<E> it = gv9Var2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (Intrinsics.c(((oxh) next).a, bzaVar.g)) {
                                obj4 = next;
                            }
                        }
                    }
                    oxh oxhVar = (oxh) obj4;
                    boolean g2 = av8Var4.g(function13);
                    Object O3 = av8Var4.O();
                    if (g2 || O3 == obj5) {
                        O3 = new uj8(11, function13);
                        av8Var4.n0(O3);
                    }
                    r4a.j(gv9Var2, oxhVar, (Function1) O3, null, z5 ? rxh.i : sxh.i, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var4, 0, 1000);
                    if (!bzaVar.j || bzaVar.f.size() < 2) {
                        z3 = false;
                        av8Var4.d0(-1590102703);
                        av8Var4.s(false);
                    } else {
                        av8Var4.d0(-1590789818);
                        nq8.h(av8Var4, new goa(1.0f, true));
                        String v = oea.v(R.string.chart_button_title, av8Var4);
                        xtc f0 = l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
                        bqh bqhVar = new bqh(s6a.N(R.drawable.ic_show_chart, 6, av8Var4), uxf.o);
                        boolean g3 = av8Var4.g(function13);
                        Object O4 = av8Var4.O();
                        if (g3 || O4 == obj5) {
                            O4 = new l77(24, function13);
                            av8Var4.n0(O4);
                        }
                        mha.h(v, (Function0) O4, f0, tqh.a, bqhVar, false, false, false, 0L, 0, 0, av8Var4, 3456, 0, 2016);
                        z3 = false;
                        av8Var4.s(false);
                    }
                    av8Var4.s(true);
                    if (z5) {
                        i = 257440230;
                        i2 = R.color.on_color_highlight_2;
                    } else {
                        i = 257440958;
                        i2 = R.color.n_lv_4;
                    }
                    td4.w(null, 1.0f, ljg.f(av8Var4, i, i2, av8Var4, z3), av8Var4, 48, 1);
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            case 4:
                o4b o4bVar = (o4b) obj8;
                osa osaVar = (osa) obj6;
                e1d e1dVar = (e1d) obj7;
                of3 of3Var5 = (of3) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 17) != 16)) {
                    vnb vnbVar = (vnb) e1dVar.getValue();
                    boolean i7 = av8Var5.i(o4bVar);
                    Object O5 = av8Var5.O();
                    if (i7 || O5 == obj5) {
                        s26 s26Var = new s26(1, o4bVar, o4b.class, "onAction", "onAction(Lcom/sofascore/results/league/fragment/transactions/LeagueTransactionsAction;)V", 0, 28);
                        av8Var5.n0(s26Var);
                        O5 = s26Var;
                    }
                    l6g.q(osaVar, vnbVar, (Function1) ((KFunction) O5), this.c, lz.J(utcVar, jaa.L(av8Var5), null), av8Var5, 8);
                } else {
                    av8Var5.W();
                }
                return Unit.a;
            case 5:
                qnb qnbVar = (qnb) obj8;
                ct8 ct8Var = (ct8) obj6;
                tc3 tc3Var = (tc3) obj7;
                vnb vnbVar2 = (vnb) obj;
                of3 of3Var6 = (of3) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                vnbVar2.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((av8) of3Var6).g(vnbVar2) ? 4 : 2;
                }
                av8 av8Var6 = (av8) of3Var6;
                if (!av8Var6.T(intValue6 & 1, (intValue6 & 19) != 18)) {
                    av8Var6.W();
                } else if (vnbVar2.equals(tnb.a)) {
                    av8Var6.d0(2025536551);
                    ktm.r(qnbVar, z5, av8Var6, 0);
                    av8Var6.s(false);
                } else if (vnbVar2 instanceof snb) {
                    av8Var6.d0(2025539307);
                    ct8Var.invoke(((snb) vnbVar2).a, av8Var6, 0);
                    av8Var6.s(false);
                } else {
                    if (!(vnbVar2 instanceof unb)) {
                        throw dmi.h(av8Var6, 2025535221, false);
                    }
                    av8Var6.d0(2025541194);
                    tc3Var.invoke(((unb) vnbVar2).a, av8Var6, 0);
                    av8Var6.s(false);
                }
                return Unit.a;
            case 6:
                Function0 function03 = (Function0) obj8;
                Function0 function04 = (Function0) obj6;
                Function0 function05 = (Function0) obj7;
                of3 of3Var7 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                xtc f02 = l98.f0(gz8.x(utcVar, null, null, 3), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, hkg.u(16.0f, of3Var7, 0), 7);
                u23 a2 = t23.a(ww9.d, uxf.o, of3Var7, 0);
                av8 av8Var7 = (av8) of3Var7;
                int hashCode2 = Long.hashCode(av8Var7.T);
                aee m2 = av8Var7.m();
                xtc C2 = fqj.C(of3Var7, f02);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8 av8Var8 = (av8) of3Var7;
                av8Var8.h0();
                if (av8Var8.S) {
                    av8Var8.l(zg3Var2);
                } else {
                    av8Var8.q0();
                }
                waa.K(of3Var7, a2, hf3.g);
                waa.K(of3Var7, m2, hf3.f);
                waa.K(of3Var7, Integer.valueOf(hashCode2), hf3.j);
                waa.J(of3Var7, hf3.k);
                waa.K(of3Var7, C2, hf3.d);
                mha.h(oea.v(R.string.get_started, of3Var7), function03, bkh.d(utcVar, 1.0f), pqh.a, null, false, false, false, 0L, 0, 0, of3Var7, 3456, 0, 2032);
                if (z5) {
                    av8Var8.d0(-1969463330);
                    av8Var8.s(false);
                } else {
                    av8Var8.d0(-1969791992);
                    nq8.h(of3Var7, bkh.e(utcVar, 8.0f));
                    o6a.f(function04, bkh.d(utcVar, 1.0f), lz.D(R.color.on_color_primary, of3Var7), of3Var7, 48, 0);
                    av8Var8.s(false);
                }
                nq8.h(of3Var7, bkh.e(utcVar, 8.0f));
                String v2 = oea.v(R.string.what_is_fantasy, of3Var7);
                yf8 yf8Var = xth.a;
                ktm.c(v2, xth.g(), function05, l98.b0(new we9(uxf.p), 8.0f), v8j.c, lz.D(R.color.on_color_primary, of3Var7), r13.c(lz.D(R.color.on_color_primary, of3Var7), 0.8f), of3Var7, 24576, 0);
                nq8.h(of3Var7, bkh.e(utcVar, 16.0f));
                av8Var8.s(true);
                return Unit.a;
            case 7:
                OnboardingViewModel onboardingViewModel = (OnboardingViewModel) obj8;
                Context context = (Context) obj6;
                BaseActivity baseActivity = (BaseActivity) obj7;
                of3 of3Var8 = (of3) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((isd) obj).getClass();
                av8 av8Var9 = (av8) of3Var8;
                if (av8Var9.T(intValue7 & 1, (intValue7 & 17) != 16)) {
                    r = m6k.r(utc.a, "NotificationsTab", new su(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, null, null));
                    boolean i8 = av8Var9.i(onboardingViewModel);
                    boolean z11 = this.c;
                    boolean h = av8Var9.h(z11) | i8 | av8Var9.i(context) | av8Var9.i(baseActivity);
                    Object O6 = av8Var9.O();
                    if (h || O6 == obj5) {
                        O6 = new yrd(onboardingViewModel, z11, context, baseActivity, 1);
                        av8Var9.n0(O6);
                    }
                    v7a.c(0, av8Var9, r, (Function0) O6);
                } else {
                    av8Var9.W();
                }
                return Unit.a;
            case 8:
                g4f g4fVar = (g4f) obj8;
                w3f w3fVar = (w3f) obj6;
                Context context2 = (Context) obj7;
                of3 of3Var9 = (of3) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var10 = (av8) of3Var9;
                if (av8Var10.T(intValue8 & 1, (intValue8 & 17) != 16)) {
                    r4a.g(w3fVar, g4fVar.l, g4fVar.m, g4fVar.n, g4fVar.o, g4fVar.p, g4fVar.q, g4fVar.r, g4fVar.s, g4fVar.t, null, av8Var10, 0);
                    String str3 = w3fVar.g;
                    xtc c0 = l98.c0(n9e.q(wnn.A(l98.f0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 12.0f, 2), o7g.a(8.0f)), lz.D(R.color.surface_2, av8Var10), o7g.a(8.0f)), 16.0f, 8.0f);
                    l8g a3 = k8g.a(ww9.b, uxf.m, av8Var10, 48);
                    int hashCode3 = Long.hashCode(av8Var10.T);
                    aee m3 = av8Var10.m();
                    xtc C3 = fqj.C(av8Var10, c0);
                    if3.k7.getClass();
                    zg3 zg3Var3 = hf3.b;
                    av8Var10.h0();
                    if (av8Var10.S) {
                        av8Var10.l(zg3Var3);
                    } else {
                        av8Var10.q0();
                    }
                    waa.K(av8Var10, a3, hf3.g);
                    waa.K(av8Var10, m3, hf3.f);
                    waa.K(av8Var10, Integer.valueOf(hashCode3), hf3.j);
                    waa.J(av8Var10, hf3.k);
                    waa.K(av8Var10, C3, hf3.d);
                    String v3 = oea.v(z5 ? R.string.bet_boost_special_offer : R.string.super_odds, av8Var10);
                    goa goaVar = new goa(1.0f, true);
                    long D = lz.D(R.color.n_lv_2, av8Var10);
                    yf8 yf8Var2 = xth.a;
                    udj.c(v3, goaVar, D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var10, 0, 0, 131064);
                    if (z5) {
                        i3 = 933308347;
                        i4 = R.string.claim_reward_button;
                        z4 = false;
                    } else {
                        z4 = false;
                        if (str3 != null) {
                            i3 = 933312095;
                            i4 = R.string.claim_your_bonus_button;
                        } else {
                            i3 = 933315233;
                            i4 = R.string.super_odds_vote_to_unlock;
                        }
                    }
                    String k = ljg.k(av8Var10, i3, i4, av8Var10, z4);
                    boolean z12 = str3 != null;
                    boolean i9 = av8Var10.i(context2) | av8Var10.i(w3fVar);
                    Object O7 = av8Var10.O();
                    if (i9 || O7 == obj5) {
                        O7 = new zbe(9, context2, w3fVar);
                        av8Var10.n0(O7);
                    }
                    yfa.e(k, (Function0) O7, null, dph.a, bph.a, null, z12, false, 0L, av8Var10, 27648, 868);
                    av8Var10.s(true);
                } else {
                    av8Var10.W();
                }
                return Unit.a;
            case 9:
                Function0 function06 = (Function0) obj8;
                Function0 function07 = (Function0) obj6;
                InvitedUser invitedUser = (InvitedUser) obj7;
                of3 of3Var10 = (of3) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var11 = (av8) of3Var10;
                if (av8Var11.T(intValue9 & 1, (intValue9 & 17) != 16)) {
                    boolean z13 = this.c;
                    mha.i(0, 0, av8Var11, function06, function07, z13);
                    utc utcVar3 = utc.a;
                    if (z13) {
                        av8Var11.d0(-294792441);
                        xtc c02 = l98.c0(n9e.q(l98.f0(bkh.d(utcVar3, 1.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 8.0f, 2), lz.D(R.color.brand_tertiary_highlight, av8Var11), o7g.a(8.0f)), 16.0f, 12.0f);
                        l8g a4 = k8g.a(ww9.b, uxf.m, av8Var11, 48);
                        int hashCode4 = Long.hashCode(av8Var11.T);
                        aee m4 = av8Var11.m();
                        xtc C4 = fqj.C(av8Var11, c02);
                        if3.k7.getClass();
                        zg3 zg3Var4 = hf3.b;
                        av8Var11.h0();
                        if (av8Var11.S) {
                            av8Var11.l(zg3Var4);
                        } else {
                            av8Var11.q0();
                        }
                        waa.K(av8Var11, a4, hf3.g);
                        waa.K(av8Var11, m4, hf3.f);
                        waa.K(av8Var11, Integer.valueOf(hashCode4), hf3.j);
                        waa.J(av8Var11, hf3.k);
                        waa.K(av8Var11, C4, hf3.d);
                        kq9.b(s6a.N(R.drawable.sofascore_analyst_logo, 6, av8Var11), null, null, lz.D(R.color.brand_tertiary_variant, av8Var11), av8Var11, 48, 4);
                        nq8.h(av8Var11, new goa(1.0f, true));
                        String v4 = oea.v(R.string.free_offer, av8Var11);
                        yf8 yf8Var3 = xth.a;
                        udj.c(v4, null, lz.D(R.color.n_lv_3, av8Var11), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var11, 0, 0, 131066);
                        av8Var11.s(true);
                        av8Var11.s(false);
                    } else if (invitedUser != null) {
                        av8Var11.d0(-293737604);
                        gz8.m(Integer.valueOf(invitedUser.getProgressCount()), l98.f0(utcVar3, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 8.0f, 2), av8Var11, 0, 0);
                        av8Var11.s(false);
                    } else {
                        av8Var11.d0(-293519674);
                        av8Var11.s(false);
                    }
                } else {
                    av8Var11.W();
                }
                return Unit.a;
            case 10:
                p2h p2hVar = (p2h) obj8;
                Function1 function14 = (Function1) obj6;
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj7;
                of3 of3Var11 = (of3) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((n8g) obj).getClass();
                av8 av8Var12 = (av8) of3Var11;
                if (!av8Var12.T(intValue10 & 1, (intValue10 & 17) != 16)) {
                    av8Var12.W();
                } else if (p2hVar != null) {
                    av8Var12.d0(-1161941011);
                    String v5 = oea.v(z5 ? R.string.done : R.string.reorder, av8Var12);
                    long D2 = lz.D(R.color.primary_default, av8Var12);
                    yf8 yf8Var4 = xth.a;
                    dfj b = xth.b();
                    boolean h2 = av8Var12.h(z5) | av8Var12.g(function14) | av8Var12.g(snapshotStateList);
                    Object O8 = av8Var12.O();
                    if (h2 || O8 == obj5) {
                        O8 = new jx1(z5, function14, snapshotStateList, 5);
                        av8Var12.n0(O8);
                    }
                    q5a.w(v5, tol.y(utc.a, false, false, false, 0L, null, (Function0) O8, av8Var12, 29), D2, null, 0L, 0L, null, 0L, 0, false, 0, 0, b, av8Var12, 0, 0, 131064);
                    av8Var12.s(false);
                } else {
                    av8Var12.d0(-1161241682);
                    av8Var12.s(false);
                }
                return Unit.a;
            default:
                uza uzaVar = (uza) obj8;
                ynj ynjVar = (ynj) obj7;
                Function1 function15 = (Function1) obj6;
                of3 of3Var12 = (of3) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var13 = (av8) of3Var12;
                if (av8Var13.T(intValue11 & 1, (intValue11 & 17) != 16)) {
                    av8Var13.d0(-472582191);
                    xtc O9 = kda.O(utcVar, "player_teams_performances", av8Var13);
                    if (!z5) {
                        O9 = O9.z(n9e.q(utcVar, lz.D(R.color.surface_1, av8Var13), oyn.e));
                    }
                    av8Var13.s(false);
                    xtc d2 = bkh.d(gz8.x(O9, null, null, 3), 1.0f);
                    gv9 gv9Var3 = uzaVar.a;
                    boj bojVar = ynjVar.c;
                    y1h y1hVar = z5 ? u1h.f : v1h.f;
                    boolean g4 = av8Var13.g(function15);
                    Object O10 = av8Var13.O();
                    if (g4 || O10 == obj5) {
                        O10 = new k1e(27, function15);
                        av8Var13.n0(O10);
                    }
                    l4a.a(gv9Var3, bojVar, (Function1) O10, d2, y1hVar, false, av8Var13, 0, 32);
                } else {
                    av8Var13.W();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ a93(o4b o4bVar, osa osaVar, boolean z, e1d e1dVar) {
        this.a = 4;
        this.d = o4bVar;
        this.b = osaVar;
        this.c = z;
        this.e = e1dVar;
    }

    public /* synthetic */ a93(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.a = i;
        this.d = obj;
        this.b = obj2;
        this.c = z;
        this.e = obj3;
    }

    public /* synthetic */ a93(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.a = i;
        this.d = obj;
        this.c = z;
        this.b = obj2;
        this.e = obj3;
    }

    public /* synthetic */ a93(int i, dt8 dt8Var, Object obj, Object obj2, boolean z) {
        this.a = i;
        this.c = z;
        this.d = obj;
        this.b = dt8Var;
        this.e = obj2;
    }
}
