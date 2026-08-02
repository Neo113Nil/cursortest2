package defpackage;

import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class er7 extends hoi implements ct8 {
    public final /* synthetic */ int r;
    public ArrayList s;
    public int t;
    public /* synthetic */ String u;
    public /* synthetic */ List v;
    public final /* synthetic */ rr7 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ er7(int i, rq3 rq3Var, rr7 rr7Var) {
        super(3, rq3Var);
        this.r = i;
        this.w = rr7Var;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.r;
        rr7 rr7Var = this.w;
        String str = (String) obj;
        List list = (List) obj2;
        rq3 rq3Var = (rq3) obj3;
        switch (i) {
            case 0:
                er7 er7Var = new er7(0, rq3Var, rr7Var);
                er7Var.u = str;
                er7Var.v = list;
                return er7Var.invokeSuspend(Unit.a);
            default:
                er7 er7Var2 = new er7(1, rq3Var, rr7Var);
                er7Var2.u = str;
                er7Var2.v = list;
                return er7Var2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        String slug;
        ArrayList arrayList2;
        int i = this.r;
        rr7 rr7Var = this.w;
        switch (i) {
            case 0:
                String str = this.u;
                List list = this.v;
                lu3 lu3Var = lu3.a;
                int i2 = this.t;
                if (i2 == 0) {
                    ArrayList u = fc6.u(obj);
                    for (Object obj2 : list) {
                        Sport sport = ((Team) obj2).getSport();
                        if (sport != null && (slug = sport.getSlug()) != null && j31.k(slug, str)) {
                            u.add(obj2);
                        }
                    }
                    this.u = null;
                    this.v = null;
                    this.s = u;
                    this.t = 1;
                    Object n = rr7Var.n(u, str, this);
                    if (n == lu3Var) {
                        return lu3Var;
                    }
                    obj = n;
                    arrayList = u;
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = this.s;
                    y6a.M(obj);
                }
                return new ft7(rr7Var.l(arrayList), (List) obj);
            default:
                String str2 = this.u;
                List list2 = this.v;
                lu3 lu3Var2 = lu3.a;
                int i3 = this.t;
                if (i3 == 0) {
                    ArrayList u2 = fc6.u(obj);
                    for (Object obj3 : list2) {
                        if (j31.k(((UniqueTournament) obj3).getSportSlug(), str2)) {
                            u2.add(obj3);
                        }
                    }
                    this.u = null;
                    this.v = null;
                    this.s = u2;
                    this.t = 1;
                    Serializable o = rr7Var.o(u2, str2, this);
                    if (o == lu3Var2) {
                        return lu3Var2;
                    }
                    obj = o;
                    arrayList2 = u2;
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList2 = this.s;
                    y6a.M(obj);
                }
                return new ft7(arrayList2, (List) obj);
        }
    }
}
