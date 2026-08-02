package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class s64 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ s64(qpb qpbVar, kx4 kx4Var, Function1 function1, e1d e1dVar, ksa ksaVar, qpa qpaVar) {
        this.a = 2;
        this.b = qpbVar;
        this.d = kx4Var;
        this.c = function1;
        this.e = e1dVar;
        this.f = ksaVar;
        this.g = qpaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.ArrayList] */
    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ?? S0;
        int i;
        int i2 = this.a;
        a99 a99Var = nf3.a;
        utc utcVar = utc.a;
        Object obj4 = this.c;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.b;
        Object obj9 = this.g;
        switch (i2) {
            case 0:
                svb svbVar = (svb) obj8;
                Function1 function1 = (Function1) obj4;
                Function1 function12 = (Function1) obj7;
                Function1 function13 = (Function1) obj6;
                Function1 function14 = (Function1) obj5;
                Function0 function0 = (Function0) obj9;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    nq8.h(av8Var, bkh.e(utcVar, 8.0f));
                    k53.G(svbVar, function1, function12, function13, function14, function0, av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                Set set = (Set) obj8;
                Set set2 = (Set) obj7;
                e1d e1dVar = (e1d) obj6;
                List list = (List) obj5;
                e7d e7dVar = (e7d) obj9;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    boolean i3 = av8Var2.i(set);
                    Object obj10 = this.c;
                    boolean i4 = av8Var2.i(obj10) | i3 | av8Var2.i(set2) | av8Var2.g(e1dVar);
                    Object O = av8Var2.O();
                    if (i4 || O == a99Var) {
                        O = new l50(set, obj10, set2, e1dVar, 9);
                        av8Var2.n0(O);
                    }
                    hz8.d(obj10, (Function1) O, av8Var2);
                    av8Var2.d0(358947325);
                    if (list instanceof RandomAccess) {
                        y0d y0dVar = new y0d(list.size());
                        S0 = new ArrayList(list.size());
                        int size = list.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            Object obj11 = list.get(i5);
                            if (y0dVar.a(obj11)) {
                                S0.add(obj11);
                            }
                        }
                    } else {
                        list.getClass();
                        S0 = CollectionsKt.S0(CollectionsKt.V0(list));
                    }
                    if (!S0.isEmpty()) {
                        ListIterator listIterator = S0.listIterator(S0.size());
                        while (listIterator.hasPrevious()) {
                            e7dVar = new e7d(e7dVar, yqo.H(-330823412, av8Var2, new qm4(0, (f7d) listIterator.previous(), e7dVar)));
                        }
                    }
                    av8Var2.s(false);
                    e7dVar.a(0, av8Var2);
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                qpb qpbVar = (qpb) obj8;
                kx4 kx4Var = (kx4) obj7;
                Function1 function15 = (Function1) obj4;
                e1d e1dVar2 = (e1d) obj6;
                ksa ksaVar = (ksa) obj5;
                qpa qpaVar = (qpa) obj9;
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    ppb ppbVar = (ppb) qpbVar;
                    upb upbVar = ppbVar.d;
                    x1h x1hVar = x1h.f;
                    b7 K = l6g.K(new s1h(upb.MyCompetitions, oea.v(R.string.my_competitions, av8Var3), true), new s1h(upb.AllCompetitions, oea.v(R.string.all_competitions, av8Var3), true));
                    xtc p = n9e.p(mha.G(utcVar, 1.0f), wxf.D(new Pair[]{new Pair(Float.valueOf(0.5f), new r13(lz.D(R.color.surface_0, av8Var3))), new Pair(Float.valueOf(1.0f), new r13(r13.h))}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.POSITIVE_INFINITY), null, 6);
                    boolean g = av8Var3.g(kx4Var);
                    Object O2 = av8Var3.O();
                    if (g || O2 == a99Var) {
                        O2 = new fo6(kx4Var, e1dVar2, 0);
                        av8Var3.n0(O2);
                    }
                    xtc A = un0.A(p, (Function1) O2);
                    boolean g2 = av8Var3.g(function15);
                    Object O3 = av8Var3.O();
                    if (g2 || O3 == a99Var) {
                        O3 = new k46(2, function15);
                        av8Var3.n0(O3);
                    }
                    l4a.a(K, upbVar, (Function1) O3, A, x1hVar, false, av8Var3, 24576, 32);
                    wkn.a(ppbVar.d, null, null, null, yqo.H(-151056912, av8Var3, new ff7(qpbVar, function15, ksaVar, qpaVar, e1dVar2)), av8Var3, 24576, 14);
                } else {
                    av8Var3.W();
                }
                break;
            case 3:
                ysd ysdVar = (ysd) obj8;
                osa osaVar = (osa) obj7;
                qpa qpaVar2 = (qpa) obj6;
                Function1 function16 = (Function1) obj4;
                qpa qpaVar3 = (qpa) obj5;
                cdi cdiVar = (cdi) obj9;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((av8) of3Var4).h(booleanValue) ? 4 : 2;
                }
                av8 av8Var4 = (av8) of3Var4;
                if (!av8Var4.T(1 & intValue4, (intValue4 & 19) != 18)) {
                    av8Var4.W();
                } else if (booleanValue) {
                    av8Var4.d0(1817233553);
                    j72.q(ysdVar, osaVar, qpaVar2, ((p75) cdiVar.getValue()).a, function16, av8Var4, 64);
                    av8Var4.s(false);
                } else {
                    av8Var4.d0(1817588410);
                    j72.n(ysdVar, qpaVar3, ((p75) cdiVar.getValue()).a, function16, av8Var4, 0);
                    av8Var4.s(false);
                }
                break;
            default:
                Function0 function02 = (Function0) obj9;
                String str = (String) obj8;
                e1d e1dVar3 = (e1d) obj7;
                z69 z69Var = (z69) obj6;
                String str2 = (String) obj5;
                Function1 function17 = (Function1) obj4;
                Function2 function2 = (Function2) obj;
                of3 of3Var5 = (of3) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                function2.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((av8) of3Var5).i(function2) ? 4 : 2;
                }
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 19) != 18)) {
                    l8g a = k8g.a(new ng0(16.0f, true, new a70(6)), uxf.m, av8Var5, 54);
                    int hashCode = Long.hashCode(av8Var5.T);
                    aee m = av8Var5.m();
                    xtc C = fqj.C(av8Var5, utcVar);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var5.h0();
                    if (av8Var5.S) {
                        av8Var5.l(zg3Var);
                    } else {
                        av8Var5.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var5, a, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var5, m, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var5, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var5, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var5, C, f50Var3);
                    int i6 = intValue5;
                    wnn.d(Boolean.valueOf(function02 != null && ((Boolean) e1dVar3.getValue()).booleanValue()), null, s02.h0(150, 0, null, 6), null, yqo.H(-2043534155, av8Var5, new yya(23, z69Var, function02)), av8Var5, 24960, 10);
                    if (1.0f <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    xtc O4 = kda.O(new goa(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), "search_text_field", av8Var5);
                    k1c c = e12.c(uxf.c, false);
                    int hashCode2 = Long.hashCode(av8Var5.T);
                    aee m2 = av8Var5.m();
                    xtc C2 = fqj.C(av8Var5, O4);
                    av8Var5.h0();
                    if (av8Var5.S) {
                        av8Var5.l(zg3Var);
                    } else {
                        av8Var5.q0();
                    }
                    waa.K(av8Var5, c, f50Var);
                    waa.K(av8Var5, m2, ff3Var);
                    bf3.s(hashCode2, av8Var5, f50Var2, av8Var5, ryVar);
                    waa.K(av8Var5, C2, f50Var3);
                    if (str.length() == 0) {
                        av8Var5.d0(-1488896227);
                        yf8 yf8Var = xth.a;
                        udj.c(str2, null, lz.D(R.color.n_lv_3, av8Var5), null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, xth.d(), av8Var5, 0, 24576, 114682);
                        i = 0;
                        av8Var5.s(false);
                    } else {
                        i = 0;
                        av8Var5.d0(-1488650490);
                        av8Var5.s(false);
                    }
                    function2.invoke(av8Var5, Integer.valueOf(i6 & 14));
                    av8Var5.s(true);
                    fz8.d(str.length() > 0 ? 1 : i, null, uo5.e(s02.h0(150, i, null, 6), 2), uo5.f(s02.h0(150, i, null, 6), 2), null, yqo.H(1396314574, av8Var5, new yya(21, (Object) z69Var, function17)), av8Var5, 1600518, 18);
                    av8Var5.s(true);
                } else {
                    av8Var5.W();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ s64(ysd ysdVar, osa osaVar, qpa qpaVar, Function1 function1, qpa qpaVar2, cdi cdiVar) {
        this.a = 3;
        this.b = ysdVar;
        this.d = osaVar;
        this.e = qpaVar;
        this.c = function1;
        this.f = qpaVar2;
        this.g = cdiVar;
    }

    public /* synthetic */ s64(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    public /* synthetic */ s64(Function0 function0, String str, e1d e1dVar, z69 z69Var, String str2, Function1 function1) {
        this.a = 4;
        this.g = function0;
        this.b = str;
        this.d = e1dVar;
        this.e = z69Var;
        this.f = str2;
        this.c = function1;
    }
}
