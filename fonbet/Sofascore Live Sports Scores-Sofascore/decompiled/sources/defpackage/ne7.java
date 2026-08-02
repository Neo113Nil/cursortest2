package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.results.R;
import com.sofascore.results.league.fragment.topStats.TopStatsCategory;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ne7 implements ct8 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ ne7(qug qugVar, Function1 function1, mei meiVar, nei neiVar, ct8 ct8Var, boolean z, boolean z2, e1d e1dVar) {
        this.e = qugVar;
        this.c = function1;
        this.f = meiVar;
        this.g = neiVar;
        this.h = ct8Var;
        this.b = z;
        this.d = z2;
        this.i = e1dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0155, code lost:
    
        if (r5 == r4) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0342  */
    @Override // defpackage.ct8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        xtc xtcVar;
        Object obj5;
        Object obj6;
        Object obj7;
        boolean z;
        String str;
        Object obj8;
        oxh oxhVar;
        String r;
        int i = this.a;
        Object obj9 = nf3.a;
        Object obj10 = this.i;
        Object obj11 = this.h;
        Object obj12 = this.g;
        Object obj13 = this.f;
        Object obj14 = this.e;
        utc utcVar = utc.a;
        switch (i) {
            case 0:
                qug qugVar = (qug) obj14;
                mei meiVar = (mei) obj13;
                nei neiVar = (nei) obj12;
                ct8 ct8Var = (ct8) obj11;
                e1d e1dVar = (e1d) obj10;
                xpa xpaVar = (xpa) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                xpaVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).g(xpaVar) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    xtc a = xpa.a(xpaVar, utcVar, 7);
                    boolean booleanValue = ((Boolean) e1dVar.getValue()).booleanValue();
                    Object O = av8Var.O();
                    if (O == obj9) {
                        O = new fw6(7, e1dVar);
                        av8Var.n0(O);
                    }
                    zm2.d(qugVar, a, this.c, meiVar, neiVar, ct8Var, booleanValue, (Function1) O, true, this.b, this.d, av8Var, 113246208, 0);
                } else {
                    av8Var.W();
                }
                break;
            default:
                jf9 jf9Var = oyn.e;
                n52 n52Var = (n52) obj14;
                g3j g3jVar = (g3j) obj13;
                ynj ynjVar = (ynj) obj12;
                oxh oxhVar2 = (oxh) obj11;
                Context context = (Context) obj10;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    av8Var2.d0(1114033386);
                    boolean z2 = this.b;
                    if (z2) {
                        obj4 = obj9;
                        xtcVar = utcVar;
                    } else {
                        obj4 = obj9;
                        xtcVar = n9e.q(utcVar, lz.D(R.color.surface_1, av8Var2), jf9Var);
                    }
                    av8Var2.s(false);
                    if (n52Var != null) {
                        xtcVar = xtcVar.z(n9e.p(utcVar, n52Var, null, 6));
                    }
                    u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    xtc C = fqj.C(av8Var2, xtcVar);
                    if3.k7.getClass();
                    Function0 function0 = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(function0);
                    } else {
                        av8Var2.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var2, a2, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var2, m, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var2, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var2, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var2, C, f50Var3);
                    xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), 4.0f, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
                    l8g a3 = k8g.a(ww9.b, uxf.l, av8Var2, 0);
                    int hashCode2 = Long.hashCode(av8Var2.T);
                    aee m2 = av8Var2.m();
                    xtc C2 = fqj.C(av8Var2, f0);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(function0);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a3, f50Var);
                    waa.K(av8Var2, m2, ff3Var);
                    bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
                    waa.K(av8Var2, C2, f50Var3);
                    gv9 gv9Var = g3jVar.d;
                    gv9 gv9Var2 = g3jVar.j;
                    gv9 gv9Var3 = g3jVar.a;
                    uxh uxhVar = z2 ? rxh.i : sxh.i;
                    Iterator<E> it = gv9Var.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj5 = it.next();
                            if (Intrinsics.c(((oxh) obj5).a, g3jVar.f)) {
                            }
                        } else {
                            obj5 = null;
                        }
                    }
                    oxh oxhVar3 = (oxh) obj5;
                    xtc O2 = kda.O(new goa(1.0f, false), "spinner_first", av8Var2);
                    Function1 function1 = this.c;
                    boolean g = av8Var2.g(function1);
                    Object O3 = av8Var2.O();
                    if (!g) {
                        obj6 = obj4;
                        break;
                    } else {
                        obj6 = obj4;
                    }
                    O3 = new k1e(23, function1);
                    av8Var2.n0(O3);
                    r4a.j(gv9Var, oxhVar3, (Function1) O3, O2, uxhVar, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 0, 992);
                    gv9 gv9Var4 = g3jVar.c;
                    uxh uxhVar2 = z2 ? rxh.i : sxh.i;
                    Iterator<E> it2 = gv9Var4.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj7 = it2.next();
                            if (Intrinsics.c(((oxh) obj7).a, g3jVar.e)) {
                            }
                        } else {
                            obj7 = null;
                        }
                    }
                    oxh oxhVar4 = (oxh) obj7;
                    xtc O4 = kda.O(utcVar, "spinner_second", av8Var2);
                    boolean g2 = av8Var2.g(function1) | av8Var2.i(ynjVar);
                    Object O5 = av8Var2.O();
                    if (g2 || O5 == obj6) {
                        O5 = new dvi(9, function1, ynjVar);
                        av8Var2.n0(O5);
                    }
                    r4a.j(gv9Var4, oxhVar4, (Function1) O5, O4, uxhVar2, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 0, 992);
                    gv9 gv9Var5 = ynjVar.a;
                    if (!gv9Var5.isEmpty()) {
                        Iterator<E> it3 = gv9Var5.iterator();
                        while (it3.hasNext()) {
                            gv9 b = ((TopStatsCategory) it3.next()).getB();
                            if (b == null || !b.isEmpty()) {
                                Iterator<E> it4 = b.iterator();
                                while (it4.hasNext()) {
                                    if (!((c71) it4.next()).d()) {
                                        z = true;
                                        if (Boolean.valueOf(z).equals(Boolean.TRUE)) {
                                            str = null;
                                            av8Var2.d0(1880171660);
                                            av8Var2.s(false);
                                        } else {
                                            av8Var2.d0(1879458753);
                                            gv9 gv9Var6 = g3jVar.g;
                                            uxh uxhVar3 = z2 ? rxh.i : sxh.i;
                                            if (oxhVar2 != null) {
                                                c3j c3jVar = (c3j) oxhVar2.a;
                                                h3j h3jVar = c3jVar.a;
                                                boolean z3 = c3jVar.b;
                                                h3jVar.getClass();
                                                context.getClass();
                                                int ordinal = h3jVar.ordinal();
                                                if (ordinal == 0) {
                                                    r = yid.r(z3 ? 70 : 50);
                                                } else if (ordinal != 1) {
                                                    zzl.b();
                                                    break;
                                                } else {
                                                    r = context.getString(R.string.all);
                                                    r.getClass();
                                                }
                                                str = null;
                                                oxhVar = oxh.a(oxhVar2, r, null, null, 253);
                                            } else {
                                                str = null;
                                                oxhVar = null;
                                            }
                                            xtc O6 = kda.O(utcVar, "spinner_third", av8Var2);
                                            boolean g3 = av8Var2.g(function1);
                                            Object O7 = av8Var2.O();
                                            if (g3 || O7 == obj6) {
                                                O7 = new k1e(20, function1);
                                                av8Var2.n0(O7);
                                            }
                                            r4a.j(gv9Var6, oxhVar, (Function1) O7, O6, uxhVar3, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 0, 992);
                                            av8Var2.s(false);
                                        }
                                        if (gv9Var2.isEmpty()) {
                                            av8Var2.d0(1880294203);
                                            uxh uxhVar4 = z2 ? rxh.i : sxh.i;
                                            Iterator<E> it5 = gv9Var2.iterator();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    obj8 = it5.next();
                                                    if (Intrinsics.c(((oxh) obj8).a, g3jVar.k)) {
                                                    }
                                                } else {
                                                    obj8 = str;
                                                }
                                            }
                                            oxh oxhVar5 = (oxh) obj8;
                                            xtc O8 = kda.O(utcVar, "spinner_fourth", av8Var2);
                                            boolean g4 = av8Var2.g(function1);
                                            Object O9 = av8Var2.O();
                                            if (g4 || O9 == obj6) {
                                                O9 = new k1e(21, function1);
                                                av8Var2.n0(O9);
                                            }
                                            r4a.j(gv9Var2, oxhVar5, (Function1) O9, O8, uxhVar4, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 0, 992);
                                            av8Var2.s(false);
                                        } else {
                                            av8Var2.d0(1880920620);
                                            av8Var2.s(false);
                                        }
                                        av8Var2.s(true);
                                        if (gv9Var3.size() <= 1) {
                                            av8Var2.d0(368837290);
                                            y1h y1hVar = z2 ? u1h.f : v1h.f;
                                            gv9 gv9Var7 = g3jVar.a;
                                            String str2 = g3jVar.b;
                                            xtc O10 = kda.O(bkh.d(utcVar, 1.0f), "sub_season_type_header", av8Var2);
                                            boolean g5 = av8Var2.g(function1);
                                            Object O11 = av8Var2.O();
                                            if (g5 || O11 == obj6) {
                                                O11 = new k1e(22, function1);
                                                av8Var2.n0(O11);
                                            }
                                            l4a.a(gv9Var7, str2, (Function1) O11, O10, y1hVar, false, av8Var2, 0, 32);
                                            av8Var2.s(false);
                                        } else {
                                            if (!this.d) {
                                                t1h t1hVar = (t1h) CollectionsKt.firstOrNull(gv9Var3);
                                                if (!Intrinsics.c(t1hVar != null ? (String) t1hVar.getItem() : str, Season.SubSeasonType.OVERALL.getLabel())) {
                                                    av8Var2.d0(369604261);
                                                    Object firstOrNull = CollectionsKt.firstOrNull(gv9Var3);
                                                    s1h s1hVar = firstOrNull instanceof s1h ? (s1h) firstOrNull : str;
                                                    String str3 = s1hVar != 0 ? s1hVar.b : str;
                                                    if (str3 == null) {
                                                        str3 = "";
                                                    }
                                                    sha.a(0, 0, av8Var2, l98.d0(n9e.q(utcVar, lz.D(R.color.surface_1, av8Var2), jf9Var), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), str3);
                                                    av8Var2.s(false);
                                                }
                                            }
                                            av8Var2.d0(369976168);
                                            av8Var2.s(false);
                                        }
                                        av8Var2.s(true);
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                    if (Boolean.valueOf(z).equals(Boolean.TRUE)) {
                    }
                    if (gv9Var2.isEmpty()) {
                    }
                    av8Var2.s(true);
                    if (gv9Var3.size() <= 1) {
                    }
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ne7(boolean z, n52 n52Var, g3j g3jVar, Function1 function1, boolean z2, ynj ynjVar, oxh oxhVar, Context context) {
        this.b = z;
        this.e = n52Var;
        this.f = g3jVar;
        this.c = function1;
        this.d = z2;
        this.g = ynjVar;
        this.h = oxhVar;
        this.i = context;
    }
}
