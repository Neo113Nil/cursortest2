package defpackage;

import android.widget.LinearLayout;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.R;
import com.sofascore.results.dialog.TopStatsCategoryBottomSheet;
import com.sofascore.results.league.fragment.topStats.TopStatsCategory;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeUserDailyBonusModal;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class bmj implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bmj(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = 6;
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                n4o.r((ylj) this.b, (xtc) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 1:
                TopStatsCategoryBottomSheet topStatsCategoryBottomSheet = (TopStatsCategoryBottomSheet) this.b;
                TopStatsCategory topStatsCategory = (TopStatsCategory) this.c;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(1 & intValue, (intValue & 3) != 2)) {
                    xtc l = bkh.l(l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 16.0f);
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
                        O2 = nuh.w;
                        av8Var.n0(O2);
                    }
                    kq9.b(s6a.N(R.drawable.ic_close, 6, av8Var), null, tol.y(l, true, true, true, D, wzcVar, new eui((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), topStatsCategoryBottomSheet, topStatsCategory, 8), av8Var, 0), lz.D(R.color.n_lv_1, av8Var), av8Var, 48, 0);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 2:
                utc utcVar = utc.a;
                vmj vmjVar = (vmj) this.b;
                umj umjVar = ((unj) this.c).e;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(1 & intValue2, (intValue2 & 3) != 2)) {
                    if (vmjVar != null) {
                        av8Var2.d0(508534104);
                        z = Intrinsics.c(umjVar.a, oea.v(R.string.sofascore_rating, av8Var2));
                        av8Var2.s(false);
                    } else {
                        av8Var2.d0(-1415310723);
                        av8Var2.s(false);
                        z = false;
                    }
                    if (z) {
                        av8Var2.d0(-1415157609);
                        Double f = b.f(umjVar.b);
                        if (f == null) {
                            av8Var2.d0(-1415157610);
                            av8Var2.s(false);
                        } else {
                            av8Var2.d0(-1415157609);
                            i9a.j(Double.valueOf(f.doubleValue()), false, false, kda.O(utcVar, "rating_small", av8Var2), false, true, null, av8Var2, 197040, 80);
                            av8Var2.s(false);
                            Unit unit = Unit.a;
                        }
                        av8Var2.s(false);
                    } else {
                        if (vmjVar == null) {
                            av8Var2.d0(508552704);
                            z2 = Intrinsics.c(umjVar.a, oea.v(R.string.average_sofascore_rating, av8Var2));
                            av8Var2.s(false);
                        } else {
                            av8Var2.d0(-1414734123);
                            av8Var2.s(false);
                            z2 = false;
                        }
                        if (z2) {
                            av8Var2.d0(-1414575119);
                            Double f2 = b.f(umjVar.b);
                            if (f2 == null) {
                                av8Var2.d0(-1414575120);
                                av8Var2.s(false);
                            } else {
                                av8Var2.d0(-1414575119);
                                i9a.i(Double.valueOf(f2.doubleValue()), false, kda.O(utcVar, "rating_text", av8Var2), null, null, null, false, av8Var2, 432, 496);
                                av8Var2.s(false);
                                Unit unit2 = Unit.a;
                            }
                            av8Var2.s(false);
                        } else {
                            av8Var2.d0(-1414187371);
                            String str = umjVar.b;
                            yf8 yf8Var = xth.a;
                            udj.c(str, kda.O(utcVar, "stat_value", av8Var2), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, dfj.a(xth.e(), 0L, 0L, null, null, 0L, null, 0, 1, 0L, null, null, 0, 16711679), av8Var2, 0, 0, 131064);
                            av8Var2.s(false);
                        }
                    }
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 3:
                prj prjVar = (prj) this.b;
                qrj qrjVar = (qrj) this.c;
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    String str2 = qrjVar.l;
                    boolean z3 = qrjVar.m;
                    boolean i2 = av8Var3.i(qrjVar);
                    Object O3 = av8Var3.O();
                    if (i2 || O3 == nf3.a) {
                        O3 = new w1i(qrjVar, 26);
                        av8Var3.n0(O3);
                    }
                    rrj.c(prjVar, str2, z3, (Function0) O3, av8Var3, 0);
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 4:
                ((Integer) obj2).getClass();
                buj.b((muj) this.b, (qug) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 5:
                ((Integer) obj2).getClass();
                f5p.k((phh) this.b, (q9k) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 6:
                ((Integer) obj2).getClass();
                f5p.p((phh) this.b, (m9k) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 7:
                ((Integer) obj2).getClass();
                szj.h((v8g) this.b, (Function1) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 8:
                ((Integer) obj2).getClass();
                x2a.q((m4k) this.b, (xtc) this.c, (of3) obj, aba.K(49));
                return Unit.a;
            case 9:
                ((Integer) obj2).getClass();
                jaa.n((edk) this.b, (Function0) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 10:
                ((Integer) obj2).getClass();
                hxk.f((jxk) this.b, (xtc) this.c, (of3) obj, aba.K(49));
                return Unit.a;
            case 11:
                ((Integer) obj2).getClass();
                t2l.a((b3l) this.b, (xtc) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 12:
                ((Integer) obj2).getClass();
                h5a.B((q5l) this.b, (xtc) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 13:
                ((Integer) obj2).getClass();
                h5a.x((s2l) this.b, (xtc) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 14:
                WeeklyChallengeUserDailyBonusModal weeklyChallengeUserDailyBonusModal = (WeeklyChallengeUserDailyBonusModal) this.b;
                Event event = (Event) this.c;
                of3 of3Var4 = (of3) obj;
                int intValue4 = ((Integer) obj2).intValue();
                a99 a99Var2 = nf3.a;
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    e1d x = rfo.x(((p3l) weeklyChallengeUserDailyBonusModal.B.getValue()).n, av8Var4, 0);
                    zsk zskVar = (zsk) weeklyChallengeUserDailyBonusModal.F.getValue();
                    xz0 xz0Var = weeklyChallengeUserDailyBonusModal.C;
                    if (xz0Var == null) {
                        Intrinsics.i("dialogBinding");
                        throw null;
                    }
                    LinearLayout linearLayout = (LinearLayout) xz0Var.m;
                    boolean i3 = av8Var4.i(weeklyChallengeUserDailyBonusModal) | av8Var4.i(event);
                    Object O4 = av8Var4.O();
                    if (i3 || O4 == a99Var2) {
                        O4 = new fej(18, weeklyChallengeUserDailyBonusModal, event);
                        av8Var4.n0(O4);
                    }
                    Function0 function0 = (Function0) O4;
                    boolean g = av8Var4.g(x);
                    Object O5 = av8Var4.O();
                    if (g || O5 == a99Var2) {
                        O5 = new m56(x, i);
                        av8Var4.n0(O5);
                    }
                    zskVar.b(linearLayout, function0, (Function0) O5);
                    haa.f(yqo.H(-159940897, av8Var4, new mfh(19, x, event, weeklyChallengeUserDailyBonusModal)), av8Var4, 6);
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            case 15:
                ((Integer) obj2).getClass();
                nq8.p((String) this.b, (vy8) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 16:
                ((Integer) obj2).getClass();
                r4a.m((zil) this.b, (Function1) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 17:
                ((Integer) obj2).getClass();
                q5a.u((ifl) this.b, (Function1) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 18:
                ((Integer) obj2).getClass();
                q5a.h((gv9) this.b, (Function1) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 19:
                ((Integer) obj2).getClass();
                q5a.d((xel) this.b, (Function1) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 20:
                ((Integer) obj2).getClass();
                nil.b((qkl) this.b, (zqb) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 21:
                ((Integer) obj2).getClass();
                y6a.f((pil) this.b, (xtc) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 22:
                ((Integer) obj2).getClass();
                tba.f((oll) this.b, (xtc) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 23:
                ((Integer) obj2).getClass();
                kda.d((oll) this.b, (vy8) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            case 24:
                ((Integer) obj2).getClass();
                bea.h((skl) this.b, (vy8) this.c, (of3) obj, aba.K(1));
                return Unit.a;
            default:
                c1m c1mVar = (c1m) this.b;
                n4m n4mVar = (n4m) this.c;
                Long l2 = (Long) obj;
                l2.getClass();
                Long l3 = (Long) obj2;
                l3.getClass();
                c1mVar.q = n4mVar.a;
                fdm fdmVar = c1mVar.o;
                Pair pair = new Pair(l2, l3);
                if (fdmVar.a.b(pair)) {
                    fdmVar.b = pair;
                }
                return Unit.a;
        }
    }

    public /* synthetic */ bmj(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
