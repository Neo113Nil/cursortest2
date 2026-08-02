package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.transfers.model.FantasyTransferPlayers;
import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class qn7 implements ct8 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ qn7(gv9 gv9Var, Context context, String str, int i, int i2, FantasyCompetitionType fantasyCompetitionType, boolean z) {
        this.f = gv9Var;
        this.g = context;
        this.c = str;
        this.d = i;
        this.e = i2;
        this.h = fantasyCompetitionType;
        this.b = z;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (i) {
            case 0:
                gv9 gv9Var = (gv9) obj6;
                Context context = (Context) obj5;
                FantasyCompetitionType fantasyCompetitionType = (FantasyCompetitionType) obj4;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    kv1 kv1Var = uxf.p;
                    utc utcVar = utc.a;
                    xtc f0 = l98.f0(l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7);
                    float f = 16.0f;
                    u23 a = t23.a(ww9.d, kv1Var, av8Var, 48);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, f0);
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
                    av8 av8Var2 = av8Var;
                    rha.b(oea.v(R.string.transfers, av8Var), null, 0L, av8Var2, 0, 6);
                    nq8.h(av8Var2, bkh.e(utcVar, 16.0f));
                    Throwable th = null;
                    m6k.i(0, av8Var2, null);
                    nq8.h(av8Var2, bkh.e(utcVar, 12.0f));
                    av8Var2.d0(108019190);
                    int i2 = 0;
                    for (Object obj7 : gv9Var) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            Throwable th2 = th;
                            b.q();
                            throw th2;
                        }
                        int i4 = i2;
                        float f2 = f;
                        av8 av8Var3 = av8Var2;
                        Throwable th3 = th;
                        v9g.k((FantasyTransferPlayers) obj7, this.e, fantasyCompetitionType, this.b, null, av8Var3, 0);
                        if (i4 != gv9Var.size() - 1) {
                            bf3.r(4.0f, -1230424765, av8Var3, av8Var3, utcVar);
                            av8Var3.s(false);
                        } else {
                            av8Var3.d0(-1230347885);
                            av8Var3.s(false);
                        }
                        f = f2;
                        av8Var2 = av8Var3;
                        i2 = i3;
                        th = th3;
                    }
                    av8 av8Var4 = av8Var2;
                    bf3.t(av8Var4, false, utcVar, f, av8Var4);
                    String w = oea.w(R.string.transfers_info_text, new Object[]{f5p.C(context, this.d, this.c)}, av8Var4);
                    yf8 yf8Var = xth.a;
                    udj.c(w, null, lz.D(R.color.n_lv_3, av8Var4), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var4, 0, 0, 131066);
                    av8Var4.s(true);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            default:
                final xqh xqhVar = (xqh) obj6;
                final bqh bqhVar = (bqh) obj5;
                final Function2 function2 = (Function2) obj4;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((n8g) obj).getClass();
                av8 av8Var5 = (av8) of3Var2;
                if (av8Var5.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Object O = av8Var5.O();
                    a99 a99Var = nf3.a;
                    if (O == a99Var) {
                        O = e.f(new c7a(0L));
                        av8Var5.n0(O);
                    }
                    final e1d e1dVar = (e1d) O;
                    long j = ((c7a) e1dVar.getValue()).a;
                    final boolean z = this.b;
                    boolean h = av8Var5.h(z) | av8Var5.f(j);
                    Object O2 = av8Var5.O();
                    if (h || O2 == a99Var) {
                        O2 = e.f(Boolean.valueOf(c7a.a(((c7a) e1dVar.getValue()).a, 0L) ? false : z));
                        av8Var5.n0(O2);
                    }
                    Boolean bool = (Boolean) ((e1d) O2).getValue();
                    bool.getClass();
                    Object O3 = av8Var5.O();
                    if (O3 == a99Var) {
                        O3 = new z1h(14);
                        av8Var5.n0(O3);
                    }
                    final String str = this.c;
                    final int i5 = this.d;
                    final int i6 = this.e;
                    l98.b(bool, null, (Function1) O3, null, null, null, yqo.H(-874981345, av8Var5, new et8() { // from class: dqh
                        @Override // defpackage.et8
                        public final Object invoke(Object obj8, Object obj9, Object obj10, Object obj11) {
                            boolean z2;
                            boolean z3;
                            boolean booleanValue = ((Boolean) obj9).booleanValue();
                            of3 of3Var3 = (of3) obj10;
                            ((Integer) obj11).getClass();
                            kv1 kv1Var2 = uxf.o;
                            kv1 kv1Var3 = uxf.q;
                            ((k60) obj8).getClass();
                            utc utcVar2 = utc.a;
                            e1d e1dVar2 = e1dVar;
                            xqh xqhVar2 = xqhVar;
                            bqh bqhVar2 = bqhVar;
                            if (booleanValue) {
                                av8 av8Var6 = (av8) of3Var3;
                                av8Var6.d0(-412627479);
                                mv1 mv1Var = uxf.g;
                                int i7 = (int) (((c7a) e1dVar2.getValue()).a >> 32);
                                ff5 ff5Var = dh3.h;
                                xtc e = bkh.e(bkh.p(utcVar2, ((kx4) av8Var6.k(ff5Var)).C0(i7)), ((kx4) av8Var6.k(ff5Var)).C0((int) (((c7a) e1dVar2.getValue()).a & 4294967295L)));
                                k1c c = e12.c(mv1Var, false);
                                int hashCode2 = Long.hashCode(av8Var6.T);
                                aee m2 = av8Var6.m();
                                xtc C2 = fqj.C(av8Var6, e);
                                if3.k7.getClass();
                                zg3 zg3Var2 = hf3.b;
                                av8Var6.h0();
                                if (av8Var6.S) {
                                    av8Var6.l(zg3Var2);
                                } else {
                                    av8Var6.q0();
                                }
                                waa.K(av8Var6, c, hf3.g);
                                waa.K(av8Var6, m2, hf3.f);
                                waa.K(av8Var6, Integer.valueOf(hashCode2), hf3.j);
                                waa.J(av8Var6, hf3.k);
                                waa.K(av8Var6, C2, hf3.d);
                                ncf.a(bkh.l(l98.f0(utcVar2, Intrinsics.c(bqhVar2 != null ? bqhVar2.b : null, kv1Var2) ? xqhVar2.b() - xqhVar2.e() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Intrinsics.c(bqhVar2 != null ? bqhVar2.b : null, kv1Var3) ? xqhVar2.b() - xqhVar2.e() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), xqhVar2.c()), ((r13) xqhVar2.m().invoke(av8Var6, 0)).a, xqhVar2.i(), r13.h, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var6, 3072, 32);
                                av8Var6.s(true);
                                av8Var6.s(false);
                            } else {
                                av8 av8Var7 = (av8) of3Var3;
                                av8Var7.d0(-411482215);
                                String str2 = str;
                                boolean z4 = str2.length() > 0;
                                lv1 lv1Var = uxf.m;
                                xtc C3 = u6h.C(utcVar2, z ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f);
                                Object O4 = av8Var7.O();
                                if (O4 == nf3.a) {
                                    O4 = new eqh(0, e1dVar2);
                                    av8Var7.n0(O4);
                                }
                                xtc h0 = o02.h0(C3, (Function1) O4);
                                l8g a2 = k8g.a(ww9.b, lv1Var, av8Var7, 48);
                                int hashCode3 = Long.hashCode(av8Var7.T);
                                aee m3 = av8Var7.m();
                                xtc C4 = fqj.C(av8Var7, h0);
                                if3.k7.getClass();
                                zg3 zg3Var3 = hf3.b;
                                av8Var7.h0();
                                if (av8Var7.S) {
                                    av8Var7.l(zg3Var3);
                                } else {
                                    av8Var7.q0();
                                }
                                waa.K(av8Var7, a2, hf3.g);
                                waa.K(av8Var7, m3, hf3.f);
                                waa.K(av8Var7, Integer.valueOf(hashCode3), hf3.j);
                                waa.J(av8Var7, hf3.k);
                                waa.K(av8Var7, C4, hf3.d);
                                boolean c2 = Intrinsics.c(bqhVar2 != null ? bqhVar2.b : null, kv1Var2);
                                Function2 function22 = function2;
                                if (c2) {
                                    av8Var7.d0(836176850);
                                    if (function22 == null) {
                                        av8Var7.d0(836206082);
                                        z3 = false;
                                        av8Var7.s(false);
                                    } else {
                                        z3 = false;
                                        av8Var7.d0(1412447711);
                                        function22.invoke(av8Var7, 0);
                                        av8Var7.s(false);
                                        Unit unit = Unit.a;
                                    }
                                    if (z4) {
                                        av8Var7.d0(836258690);
                                        nq8.h(av8Var7, bkh.p(utcVar2, xqhVar2.a()));
                                        av8Var7.s(z3);
                                    } else {
                                        av8Var7.d0(836359595);
                                        av8Var7.s(z3);
                                    }
                                    av8Var7.s(z3);
                                } else {
                                    av8Var7.d0(836385387);
                                    av8Var7.s(false);
                                }
                                if (z4) {
                                    av8Var7.d0(836471908);
                                    if (xqhVar2.g()) {
                                        Locale locale = Locale.getDefault();
                                        locale.getClass();
                                        str2 = str2.toUpperCase(locale);
                                        str2.getClass();
                                    }
                                    String str3 = str2;
                                    int i8 = i5;
                                    udj.c(str3, l98.d0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, xqhVar2.d() - xqhVar2.h(), 1), 0L, null, 0L, null, 0L, null, new p7j(3), 0L, i8, !(i8 == 1), i6, 0, null, xqhVar2.getTextStyle(), av8Var7, 0, 0, 101372);
                                    av8Var7.s(false);
                                } else {
                                    av8Var7.d0(837057963);
                                    av8Var7.s(false);
                                }
                                if (Intrinsics.c(bqhVar2 != null ? bqhVar2.b : null, kv1Var3)) {
                                    av8Var7.d0(837134130);
                                    if (z4) {
                                        av8Var7.d0(837173314);
                                        nq8.h(av8Var7, bkh.p(utcVar2, xqhVar2.a()));
                                        z2 = false;
                                        av8Var7.s(false);
                                    } else {
                                        z2 = false;
                                        av8Var7.d0(837274219);
                                        av8Var7.s(false);
                                    }
                                    if (function22 == null) {
                                        av8Var7.d0(837309186);
                                        av8Var7.s(z2);
                                    } else {
                                        av8Var7.d0(1412483295);
                                        function22.invoke(av8Var7, 0);
                                        av8Var7.s(z2);
                                        Unit unit2 = Unit.a;
                                    }
                                    av8Var7.s(z2);
                                } else {
                                    z2 = false;
                                    av8Var7.d0(837342667);
                                    av8Var7.s(false);
                                }
                                av8Var7.s(true);
                                av8Var7.s(z2);
                            }
                            return Unit.a;
                        }
                    }), av8Var5, 1573248, 58);
                } else {
                    av8Var5.W();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ qn7(boolean z, String str, xqh xqhVar, bqh bqhVar, tc3 tc3Var, int i, int i2) {
        this.b = z;
        this.c = str;
        this.f = xqhVar;
        this.g = bqhVar;
        this.h = tc3Var;
        this.d = i;
        this.e = i2;
    }
}
