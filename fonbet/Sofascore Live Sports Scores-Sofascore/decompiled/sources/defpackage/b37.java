package defpackage;

import com.sofascore.model.fantasy.FantasyRound;
import com.sofascore.model.fantasy.FantasyUserLeague;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class b37 extends hoi implements Function2 {
    public final /* synthetic */ int r = 0;
    public int s;
    public final /* synthetic */ e37 t;
    public final /* synthetic */ j67 u;
    public final /* synthetic */ ev6 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b37(e37 e37Var, ev6 ev6Var, j67 j67Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = e37Var;
        this.v = ev6Var;
        this.u = j67Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        ev6 ev6Var = this.v;
        j67 j67Var = this.u;
        e37 e37Var = this.t;
        switch (i) {
            case 0:
                return new b37(e37Var, ev6Var, j67Var, rq3Var);
            default:
                return new b37(e37Var, j67Var, ev6Var, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((b37) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        ev6 ev6Var = this.v;
        j67 j67Var = this.u;
        e37 e37Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var = e37Var.e;
                    int i3 = ev6Var.c;
                    this.s = 1;
                    obj = wi7Var.i(i3, this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                List list = (List) obj;
                Iterator it = list.iterator();
                int i4 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i4 = -1;
                    } else if (((FantasyRound) it.next()).getId() != j67Var.e) {
                        i4++;
                    }
                }
                List subList = list.subList(i4 >= 0 ? i4 : 0, list.size());
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : subList) {
                    if (((FantasyRound) obj2).getDeadlineTimestamp() < yaa.w()) {
                        arrayList.add(obj2);
                    }
                }
                List<FantasyRound> H0 = CollectionsKt.H0(arrayList, new v66(15));
                ArrayList arrayList2 = new ArrayList(k13.r(H0, 10));
                for (FantasyRound fantasyRound : H0) {
                    arrayList2.add(new fo1(fantasyRound.getId(), fantasyRound.getSequence(), fantasyRound.getName(), fantasyRound.getDeadlineTimestamp()));
                }
                return arrayList2;
            default:
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var2 = e37Var.e;
                    int i6 = j67Var.a;
                    String str = e37Var.f;
                    this.s = 1;
                    obj = wi7Var2.S(i6, str, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                List list2 = (List) obj;
                if (list2 == null) {
                    return km5.a;
                }
                ArrayList arrayList3 = new ArrayList(k13.r(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(c6o.P((FantasyUserLeague) it2.next(), new Integer(ev6Var.n), ev6Var.m));
                }
                return arrayList3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b37(e37 e37Var, j67 j67Var, ev6 ev6Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = e37Var;
        this.u = j67Var;
        this.v = ev6Var;
    }
}
