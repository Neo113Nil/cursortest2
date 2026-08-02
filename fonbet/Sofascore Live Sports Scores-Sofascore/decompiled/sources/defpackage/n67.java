package defpackage;

import android.view.View;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerUiModel;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class n67 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ am3 b;
    public final /* synthetic */ qug c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ll3 e;
    public final /* synthetic */ xl3 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ View h;
    public final /* synthetic */ Function1 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public n67(am3 am3Var, qug qugVar, boolean z, ll3 ll3Var, xl3 xl3Var, boolean z2, View view, Function1 function1, FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel, boolean z3, boolean z4, q67 q67Var, Integer num) {
        this.b = am3Var;
        this.c = qugVar;
        this.d = z;
        this.e = ll3Var;
        this.f = xl3Var;
        this.g = z2;
        this.h = view;
        this.i = function1;
        this.l = fantasyRoundPlayerUiModel;
        this.j = z3;
        this.k = z4;
        this.m = q67Var;
        this.n = num;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        utc utcVar;
        boolean z;
        utc utcVar2;
        Function0 function0;
        int i = this.a;
        Object obj3 = this.n;
        Object obj4 = this.m;
        Object obj5 = this.l;
        boolean z2 = this.k;
        boolean z3 = this.j;
        boolean z4 = this.g;
        ll3 ll3Var = this.e;
        boolean z5 = this.d;
        am3 am3Var = this.b;
        xl3 xl3Var = this.f;
        a99 a99Var = nf3.a;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Number) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    ng0 ng0Var = new ng0(8.0f, true, new l1(uxf.q, 5));
                    lv1 lv1Var = uxf.m;
                    av8Var.d0(1798958381);
                    utc utcVar3 = utc.a;
                    qug qugVar = this.c;
                    xtc f0 = l98.f0(hkg.Z(utcVar3, qugVar, z5, 12), 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                    boolean g = av8Var.g(xl3Var);
                    Object O = av8Var.O();
                    if (g || O == a99Var) {
                        O = new qw6(xl3Var, 6);
                        av8Var.n0(O);
                    }
                    am3Var.getClass();
                    xtc b = am3.b(f0, ll3Var, (Function1) O);
                    if (z4) {
                        utcVar = utcVar3;
                        b = b.z(i9a.u(utcVar3, this.h, qugVar, this.i, av8Var, 0));
                    } else {
                        utcVar = utcVar3;
                    }
                    av8Var.s(false);
                    FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) obj5;
                    q67 q67Var = (q67) obj4;
                    Integer num = (Integer) obj3;
                    l8g a = k8g.a(ng0Var, lv1Var, av8Var, 54);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, b);
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
                    FantasyPlayerUiModel fantasyPlayerUiModel = fantasyRoundPlayerUiModel.g;
                    List j = b.j(fantasyPlayerUiModel.n, fantasyPlayerUiModel.o, fantasyRoundPlayerUiModel.o);
                    FantasyPlayerUiModel fantasyPlayerUiModel2 = fantasyRoundPlayerUiModel.g;
                    String str = fantasyPlayerUiModel2.j;
                    Float f = fantasyPlayerUiModel2.m;
                    List j2 = b.j(str, f != null ? yid.q(f.floatValue(), 1) : "-");
                    av8Var.d0(976457701);
                    int i2 = 0;
                    for (Object obj6 : j) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            b.q();
                            throw null;
                        }
                        ww9.p(0, (num != null && i2 == num.intValue()) ? ljg.f(av8Var, 1399240165, R.color.primary_default, av8Var, false) : ljg.f(av8Var, 1399240955, R.color.n_lv_3, av8Var, false), av8Var, null, (String) obj6);
                        i2 = i3;
                    }
                    av8Var.s(false);
                    if (z3) {
                        av8Var.d0(205722887);
                        List list = fantasyRoundPlayerUiModel.A;
                        if (list == null) {
                            list = km5.a;
                        }
                        wkn.i(list, bkh.e(bkh.p(utcVar, mei.j.e), 32.0f), av8Var, 48);
                        z = false;
                        av8Var.s(false);
                    } else {
                        z = false;
                        av8Var.d0(206033290);
                        av8Var.s(false);
                    }
                    if (z2) {
                        av8Var.d0(206091570);
                        ww9.i(q67Var.b, bkh.p(utcVar, mei.k.e), av8Var, 48);
                        av8Var.s(z);
                    } else {
                        av8Var.d0(206286250);
                        av8Var.s(z);
                    }
                    int size = j.size() + (z3 ? 1 : 0) + (z2 ? 1 : 0);
                    av8Var.d0(976492003);
                    int i4 = 0;
                    for (Object obj7 : j2) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            b.q();
                            throw null;
                        }
                        ww9.p(0, (num != null && i4 + size == num.intValue()) ? ljg.f(av8Var, 80151886, R.color.primary_default, av8Var, false) : ljg.f(av8Var, 80152676, R.color.n_lv_3, av8Var, false), av8Var, null, (String) obj7);
                        i4 = i5;
                    }
                    av8Var.s(false);
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Number) obj2).intValue();
                boolean z6 = true;
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    uxf uxfVar = ww9.c;
                    lv1 lv1Var2 = uxf.m;
                    av8Var2.d0(-1129979931);
                    n9a n9aVar = n9a.b;
                    utc utcVar4 = utc.a;
                    xtc e0 = l98.e0(hkg.Z(fz8.Y(utcVar4, n9aVar), this.c, z5, 12), 4.0f, 8.0f, 8.0f, 4.0f);
                    boolean g2 = av8Var2.g(xl3Var);
                    Object O2 = av8Var2.O();
                    Object obj8 = O2;
                    if (g2 || O2 == a99Var) {
                        qw6 qw6Var = new qw6(xl3Var, 9);
                        av8Var2.n0(qw6Var);
                        obj8 = qw6Var;
                    }
                    am3Var.getClass();
                    xtc b2 = am3.b(e0, ll3Var, (Function1) obj8);
                    if (z4) {
                        utcVar2 = utcVar4;
                        b2 = b2.z(i9a.u(utcVar4, this.h, this.c, this.i, av8Var2, 0));
                    } else {
                        utcVar2 = utcVar4;
                    }
                    av8Var2.s(false);
                    mei meiVar = (mei) obj5;
                    Function1 function1 = (Function1) obj4;
                    nei neiVar = (nei) obj3;
                    l8g a2 = k8g.a(uxfVar, lv1Var2, av8Var2, 54);
                    int hashCode2 = Long.hashCode(av8Var2.T);
                    aee m2 = av8Var2.m();
                    xtc C2 = fqj.C(av8Var2, b2);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var2);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a2, hf3.g);
                    waa.K(av8Var2, m2, hf3.f);
                    waa.K(av8Var2, Integer.valueOf(hashCode2), hf3.j);
                    waa.J(av8Var2, hf3.k);
                    waa.K(av8Var2, C2, hf3.d);
                    kp5 kp5Var = mei.r;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj9 : kp5Var) {
                        if (!((mei) obj9).g) {
                            arrayList.add(obj9);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        mei meiVar2 = (mei) next;
                        if (meiVar2 != mei.k || z3) {
                            if (meiVar2 != mei.j || z2) {
                                arrayList2.add(next);
                            }
                        }
                    }
                    av8Var2.d0(1669767322);
                    Iterator it2 = arrayList2.iterator();
                    int i6 = 0;
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            b.q();
                            throw null;
                        }
                        mei meiVar3 = (mei) next2;
                        boolean z7 = meiVar == meiVar3 ? z6 : false;
                        if (((function1 == null || !meiVar3.f) ? null : function1) == null) {
                            av8Var2.d0(-43434777);
                            av8Var2.s(false);
                            function0 = null;
                        } else {
                            av8Var2.d0(-43434776);
                            boolean g3 = av8Var2.g(function1) | av8Var2.e(meiVar3.ordinal());
                            Object O3 = av8Var2.O();
                            Object obj10 = O3;
                            if (g3 || O3 == a99Var) {
                                cx6 cx6Var = new cx6(function1, meiVar3, z6 ? 1 : 0);
                                av8Var2.n0(cx6Var);
                                obj10 = cx6Var;
                            }
                            av8Var2.s(false);
                            function0 = (Function0) obj10;
                        }
                        zm2.a(meiVar3, z7, null, function0, meiVar3.e, neiVar, av8Var2, 0);
                        nei neiVar2 = neiVar;
                        if (i6 != arrayList2.size() - 1) {
                            av8Var2.d0(-43256030);
                            td4.N(l98.e0(utcVar2, 3.5f, 2.0f, 3.5f, neiVar2 == null ? 2.0f : 14.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, av8Var2, 0, 6);
                            av8Var2.s(false);
                        } else {
                            av8Var2.d0(-42876435);
                            av8Var2.s(false);
                        }
                        neiVar = neiVar2;
                        i6 = i7;
                        z6 = true;
                    }
                    av8Var2.s(false);
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
        }
    }

    public n67(am3 am3Var, qug qugVar, boolean z, ll3 ll3Var, xl3 xl3Var, boolean z2, View view, Function1 function1, boolean z3, boolean z4, mei meiVar, Function1 function12, nei neiVar) {
        this.b = am3Var;
        this.c = qugVar;
        this.d = z;
        this.e = ll3Var;
        this.f = xl3Var;
        this.g = z2;
        this.h = view;
        this.i = function1;
        this.j = z3;
        this.k = z4;
        this.l = meiVar;
        this.m = function12;
        this.n = neiVar;
    }
}
