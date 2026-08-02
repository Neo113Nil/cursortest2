package defpackage;

import com.sofascore.model.crowdsourcing.EventSuggest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class vr5 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ vr5(String str, xtc xtcVar, dfj dfjVar, boolean z, Function0 function0, Integer num, int i, int i2) {
        this.a = 8;
        this.e = str;
        this.i = xtcVar;
        this.f = dfjVar;
        this.b = z;
        this.g = function0;
        this.h = num;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        Object obj3 = this.f;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.i;
        Object obj7 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(1);
                gvd.e((hm) obj7, (dm) obj3, (r9k) obj5, (Boolean) obj4, this.b, this.c, this.d, (xtc) obj6, (of3) obj, K);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int K2 = aba.K(i2 | 1);
                o1j.l((jz6) obj7, (rse) obj3, (Function0) obj5, (qug) obj4, (ksa) obj6, this.b, (of3) obj, K2, this.d);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int K3 = aba.K(i2 | 1);
                ao2.g((Function0) obj7, (xtc) obj6, this.b, (hq9) obj3, (uah) obj5, (Function2) obj4, (of3) obj, K3, this.d);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int K4 = aba.K(i2 | 1);
                a0a.c((EventSuggest.IncidentSuggest) obj7, (String) obj3, (Function1) obj5, (xtc) obj6, this.b, (uah) obj4, (of3) obj, K4, this.d);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int K5 = aba.K(i2 | 1);
                ktm.t((vnb) obj7, (xtc) obj6, this.b, (qnb) obj3, (ct8) obj5, (tc3) obj4, (of3) obj, K5, this.d);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int K6 = aba.K(i2 | 1);
                g7a.e(this.b, (String) obj7, (Function0) obj3, (Function0) obj5, (xtc) obj6, (String) obj4, (of3) obj, K6, this.d);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int K7 = aba.K(1 | i2);
                l4a.a((gv9) obj7, this.f, (Function1) obj5, (xtc) obj6, (y1h) obj4, this.b, (of3) obj, K7, this.d);
                break;
            case 7:
                ((Integer) obj2).getClass();
                int K8 = aba.K(1 | i2);
                r4a.k((oxh) obj7, (Function0) obj3, (xtc) obj6, (uxh) obj5, this.b, (p3e) obj4, (of3) obj, K8, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                int K9 = aba.K(i2 | 1);
                bea.f((String) obj7, (xtc) obj6, (dfj) obj3, this.b, (Function0) obj5, (Integer) obj4, (of3) obj, K9, this.d);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ vr5(jz6 jz6Var, rse rseVar, Function0 function0, qug qugVar, ksa ksaVar, boolean z, int i, int i2) {
        this.a = 1;
        this.e = jz6Var;
        this.f = rseVar;
        this.g = function0;
        this.h = qugVar;
        this.i = ksaVar;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ vr5(gv9 gv9Var, Object obj, Function1 function1, xtc xtcVar, y1h y1hVar, boolean z, int i, int i2) {
        this.a = 6;
        this.e = gv9Var;
        this.f = obj;
        this.g = function1;
        this.i = xtcVar;
        this.h = y1hVar;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ vr5(oxh oxhVar, Function0 function0, xtc xtcVar, uxh uxhVar, boolean z, p3e p3eVar, int i, int i2) {
        this.a = 7;
        this.e = oxhVar;
        this.f = function0;
        this.i = xtcVar;
        this.g = uxhVar;
        this.b = z;
        this.h = p3eVar;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ vr5(EventSuggest.IncidentSuggest incidentSuggest, String str, Function1 function1, xtc xtcVar, boolean z, uah uahVar, int i, int i2) {
        this.a = 3;
        this.e = incidentSuggest;
        this.f = str;
        this.g = function1;
        this.i = xtcVar;
        this.b = z;
        this.h = uahVar;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ vr5(Object obj, xtc xtcVar, boolean z, Object obj2, Object obj3, Function2 function2, int i, int i2, int i3) {
        this.a = i3;
        this.e = obj;
        this.i = xtcVar;
        this.b = z;
        this.f = obj2;
        this.g = obj3;
        this.h = function2;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ vr5(hm hmVar, dm dmVar, r9k r9kVar, Boolean bool, boolean z, int i, int i2, xtc xtcVar, int i3) {
        this.a = 0;
        this.e = hmVar;
        this.f = dmVar;
        this.g = r9kVar;
        this.h = bool;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.i = xtcVar;
    }

    public /* synthetic */ vr5(boolean z, String str, Function0 function0, Function0 function02, xtc xtcVar, String str2, int i, int i2) {
        this.a = 5;
        this.b = z;
        this.e = str;
        this.f = function0;
        this.g = function02;
        this.i = xtcVar;
        this.h = str2;
        this.c = i;
        this.d = i2;
    }
}
