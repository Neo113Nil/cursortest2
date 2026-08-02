package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.e;
import com.sofascore.model.Sports;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class km7 implements ct8 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ km7(gv9 gv9Var, gv9 gv9Var2, e1d e1dVar, boolean z, Function1 function1) {
        this.c = gv9Var;
        this.d = gv9Var2;
        this.e = e1dVar;
        this.b = z;
        this.f = function1;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                utc utcVar = utc.a;
                gv9<cm7> gv9Var = (gv9) this.c;
                gv9 gv9Var2 = (gv9) this.d;
                e1d e1dVar = (e1d) this.e;
                boolean z = this.b;
                Function1 function1 = (Function1) this.f;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                a99 a99Var = nf3.a;
                ((v23) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    xtc f0 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                    u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
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
                    String H = s02.H(R.string.top_players, null, null, av8Var, 4);
                    yf8 yf8Var = xth.a;
                    udj.c(H, bkh.d(utcVar, 1.0f), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.j(), av8Var, 48, 24960, 109560);
                    nq8.h(av8Var, bkh.e(utcVar, 8.0f));
                    av8Var.d0(894197642);
                    ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
                    for (cm7 cm7Var : gv9Var) {
                        arrayList.add(new vt2(cm7Var, oea.v(cm7Var.a, av8Var), false, null, null, null, null, 252));
                    }
                    av8Var.s(false);
                    gv9 W = l6g.W(arrayList);
                    cm7 cm7Var2 = (cm7) e1dVar.getValue();
                    Object O = av8Var.O();
                    if (O == a99Var) {
                        O = new fw6(11, e1dVar);
                        av8Var.n0(O);
                    }
                    trh.a(W, cm7Var2, (Function1) O, null, null, new t3e(16.0f, 8.0f, 16.0f, 8.0f), null, false, false, false, null, null, av8Var, 196992, 4056);
                    nq8.h(av8Var, bkh.e(utcVar, 8.0f));
                    av8Var.d0(894209475);
                    int i = 0;
                    for (Object obj4 : CollectionsKt.L0(gv9Var2, 5)) {
                        int i2 = i + 1;
                        if (i < 0) {
                            b.q();
                            throw null;
                        }
                        dm7 dm7Var = (dm7) obj4;
                        av8Var.a0(1759006103, Integer.valueOf(dm7Var.a));
                        boolean z2 = z;
                        gvd.i(dm7Var, i2, z2, null, 16.0f, av8Var, 24576, 8);
                        av8Var.s(false);
                        i = i2;
                        z = z2;
                    }
                    bf3.t(av8Var, false, utcVar, 12.0f, av8Var);
                    xtc d = bkh.d(utcVar, 1.0f);
                    k1c c = e12.c(uxf.c, false);
                    int hashCode2 = Long.hashCode(av8Var.T);
                    aee m2 = av8Var.m();
                    xtc C2 = fqj.C(av8Var, d);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var2);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, c, hf3.g);
                    waa.K(av8Var, m2, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C2, hf3.d);
                    n12 n12Var = n12.a;
                    String v = oea.v(R.string.fantasy_see_all_players, av8Var);
                    yf8 yf8Var2 = xth.a;
                    dfj l = xth.l();
                    xtc a2 = n12Var.a(utcVar, uxf.g);
                    boolean g = av8Var.g(function1);
                    Object O2 = av8Var.O();
                    if (g || O2 == a99Var) {
                        O2 = new s91(function1, e1dVar, 7);
                        av8Var.n0(O2);
                    }
                    bea.f(v, a2, l, false, (Function0) O2, null, av8Var, 0, 40);
                    bf3.t(av8Var, true, utcVar, 12.0f, av8Var);
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            default:
                prj prjVar = (prj) this.c;
                boolean z3 = this.b;
                Function0 function0 = (Function0) this.d;
                String str = (String) this.e;
                Context context = (Context) this.f;
                v23 v23Var = (v23) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                v23Var.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).g(v23Var) ? 4 : 2;
                }
                int i3 = intValue2;
                int i4 = 18;
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(i3 & 1, (i3 & 19) != 18)) {
                    rrj.b(oea.v(prjVar.c, av8Var2), z3, function0, av8Var2, 0);
                    av8Var2.d0(1950177772);
                    int i5 = 0;
                    for (Object obj5 : prjVar.a) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            b.q();
                            throw null;
                        }
                        xrj xrjVar = (xrj) obj5;
                        int i7 = i4;
                        av8 av8Var3 = av8Var2;
                        rrj.d(xrjVar, i5 == 0, xrjVar.d, str, av8Var3, 0);
                        i4 = i7;
                        av8Var2 = av8Var3;
                        i5 = i6;
                    }
                    av8 av8Var4 = av8Var2;
                    int i8 = i4;
                    av8Var4.s(false);
                    if (prjVar.b.size() > 1) {
                        av8Var4.d0(326257090);
                        String v2 = oea.v(prjVar.d, av8Var4);
                        Object O3 = av8Var4.O();
                        if (O3 == nf3.a) {
                            O3 = new eej(i8);
                            av8Var4.n0(O3);
                        }
                        rrj.b(v2, false, (Function0) O3, av8Var4, 432);
                        av8Var4.s(false);
                    } else if (prjVar.b.isEmpty()) {
                        av8Var4.d0(326602771);
                        av8Var4.s(false);
                    } else {
                        av8Var4.d0(326471114);
                        tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 14, 0L, 0L, av8Var4, l98.c0(utc.a, 16.0f, 8.0f));
                        av8Var4.s(false);
                    }
                    av8Var4.d0(1950199351);
                    for (xrj xrjVar2 : prjVar.b) {
                        av8Var4.d0(1950204899);
                        String v3 = Boolean.valueOf(prjVar.b.size() == 1).equals(Boolean.TRUE) ? oea.v(prjVar.d, av8Var4) : null;
                        av8Var4.s(false);
                        rrj.d(xrjVar2, true, v3, str, av8Var4, 48);
                    }
                    av8Var4.s(false);
                    String str2 = Intrinsics.c(str, Sports.BASKETBALL) ? "ShowBasketballPreviousWinnersDisclaimer" : "ShowTennisPreviousWinnersDisclaimer";
                    Object O4 = av8Var4.O();
                    if (O4 == nf3.a) {
                        context.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = context.getApplicationContext();
                            synchronized (uic.i) {
                                sharedPreferences = a5f.d(applicationContext);
                                uic.j = sharedPreferences;
                            }
                            sharedPreferences.getClass();
                        }
                        O4 = e.f(Boolean.valueOf(sharedPreferences.getBoolean(str2, true)));
                        av8Var4.n0(O4);
                    }
                    e1d e1dVar2 = (e1d) O4;
                    fz8.b(v23Var, ((Boolean) e1dVar2.getValue()).booleanValue(), null, null, null, null, yqo.H(2035741671, av8Var4, new zya(13, context, e1dVar2, str2)), av8Var4, (i3 & 14) | 1572864, 30);
                    nq8.h(av8Var4, bkh.e(utc.a, 8.0f));
                } else {
                    av8Var2.W();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ km7(prj prjVar, boolean z, Function0 function0, String str, Context context) {
        this.c = prjVar;
        this.b = z;
        this.d = function0;
        this.e = str;
        this.f = context;
    }
}
