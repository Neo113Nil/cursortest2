package defpackage;

import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kr6 extends hoi implements Function2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ ho7 B;
    public final /* synthetic */ ho7 C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ do7 E;
    public final /* synthetic */ mj7 F;
    public final /* synthetic */ mj7 G;
    public final /* synthetic */ sd7 H;
    public final /* synthetic */ nr6 r;
    public final /* synthetic */ List s;
    public final /* synthetic */ List t;
    public final /* synthetic */ List u;
    public final /* synthetic */ List v;
    public final /* synthetic */ List w;
    public final /* synthetic */ List x;
    public final /* synthetic */ List y;
    public final /* synthetic */ nl7 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr6(nr6 nr6Var, List list, List list2, List list3, List list4, List list5, List list6, List list7, nl7 nl7Var, List list8, ho7 ho7Var, ho7 ho7Var2, boolean z, do7 do7Var, mj7 mj7Var, mj7 mj7Var2, sd7 sd7Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = nr6Var;
        this.s = list;
        this.t = list2;
        this.u = list3;
        this.v = list4;
        this.w = list5;
        this.x = list6;
        this.y = list7;
        this.z = nl7Var;
        this.A = list8;
        this.B = ho7Var;
        this.C = ho7Var2;
        this.D = z;
        this.E = do7Var;
        this.F = mj7Var;
        this.G = mj7Var2;
        this.H = sd7Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new kr6(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((kr6) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        nr6 nr6Var = this.r;
        hr6 k = nr6Var.k();
        Object obj2 = null;
        List list = this.s;
        gv9 W = list != null ? l6g.W(list) : null;
        List list2 = this.t;
        gv9 W2 = list2 != null ? l6g.W(list2) : null;
        List list3 = this.u;
        gv9 W3 = list3 != null ? l6g.W(list3) : null;
        List list4 = this.v;
        gv9 W4 = list4 != null ? l6g.W(list4) : null;
        List list5 = this.w;
        gv9 W5 = list5 != null ? l6g.W(list5) : null;
        List list6 = this.x;
        if (list6 == null || !list6.isEmpty()) {
            Iterator it = list6.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((FantasyRoundPlayerUiModel) it.next()).z && (i = i + 1) < 0) {
                    b.p();
                    throw null;
                }
            }
        } else {
            i = 0;
        }
        List list7 = this.y;
        gv9 W6 = list7 != null ? l6g.W(list7) : null;
        nl7 nl7Var = nr6Var.k().n;
        if (nl7Var == null) {
            nl7Var = this.z;
        }
        nl7 nl7Var2 = nl7Var;
        List list8 = this.A;
        Iterator it2 = list8.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((j67) next).d()) {
                obj2 = next;
                break;
            }
        }
        j67 j67Var = (j67) obj2;
        boolean z = list8.size() > 1;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list6) {
            if (!((FantasyRoundPlayerUiModel) obj3).k) {
                arrayList.add(obj3);
            }
        }
        Iterator it3 = arrayList.iterator();
        int i2 = 0;
        while (it3.hasNext()) {
            Integer num = ((FantasyRoundPlayerUiModel) it3.next()).n;
            i2 += num != null ? num.intValue() : 0;
        }
        nr6Var.n(hr6.a(k, this.E, ho7.a(this.C, new Integer(i2 - this.B.d), 0, false, false, false, this.D, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE), this.F, this.G, this.H, W, W2, W4, W5, W3, W6, new Integer(i), nl7Var2, false, false, j67Var, z, false, 638976));
        return Unit.a;
    }
}
