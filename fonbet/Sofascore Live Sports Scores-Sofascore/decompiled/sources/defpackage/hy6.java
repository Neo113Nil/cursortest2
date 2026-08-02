package defpackage;

import com.sofascore.model.fantasy.FantasyRoundEvent;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.UniqueTournament;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hy6 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ ky6 t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hy6(ky6 ky6Var, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.t = ky6Var;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        int i2 = this.u;
        ky6 ky6Var = this.t;
        switch (i) {
            case 0:
                return new hy6(ky6Var, i2, rq3Var, 0);
            case 1:
                return new hy6(ky6Var, i2, rq3Var, 1);
            case 2:
                return new hy6(ky6Var, i2, rq3Var, 2);
            default:
                return new hy6(ky6Var, i2, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((hy6) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        String w;
        Category category;
        int i = this.r;
        int i2 = 0;
        int i3 = 10;
        int i4 = this.u;
        ky6 ky6Var = this.t;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var = ky6Var.b;
                    this.s = 1;
                    obj = wi7Var.p(i4, this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(k13.r(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((FantasyRoundEvent) it.next()).getEvent());
                }
                return CollectionsKt.H0(arrayList, new v66(i3));
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    obj = s9a.r(new hy6(ky6Var, i4, rq3Var, i2), this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i6 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Iterable iterable2 = (Iterable) obj;
                ArrayList arrayList2 = new ArrayList(k13.r(iterable2, 10));
                Iterator it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(gz8.R(ky6Var.a, (Event) it2.next(), false));
                }
                return arrayList2;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    obj = s9a.r(new hy6(ky6Var, i4, rq3Var, i2), this);
                    if (obj == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : (Iterable) obj) {
                    UniqueTournament uniqueTournament = ((Event) obj2).getTournament().getUniqueTournament();
                    Integer num = uniqueTournament != null ? new Integer(uniqueTournament.getId()) : null;
                    Object obj3 = linkedHashMap.get(num);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap.put(num, obj3);
                    }
                    ((List) obj3).add(obj2);
                }
                Collection values = linkedHashMap.values();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : values) {
                    if (!((List) obj4).isEmpty()) {
                        arrayList3.add(obj4);
                    }
                }
                ArrayList arrayList4 = new ArrayList(k13.r(arrayList3, 10));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    List list = (List) it3.next();
                    Event event = (Event) CollectionsKt.Y(list);
                    UniqueTournament uniqueTournament2 = event.getTournament().getUniqueTournament();
                    if (uniqueTournament2 == null || (w = tba.x(uniqueTournament2)) == null) {
                        w = tba.w(event.getTournament());
                    }
                    UniqueTournament uniqueTournament3 = event.getTournament().getUniqueTournament();
                    int id = (uniqueTournament3 == null || (category = uniqueTournament3.getCategory()) == null) ? event.getTournament().getCategory().getId() : category.getId();
                    ArrayList arrayList5 = new ArrayList(k13.r(list, 10));
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        arrayList5.add(gz8.R(ky6Var.a, (Event) it4.next(), false));
                    }
                    arrayList4.add(new e47(id, w, arrayList5));
                }
                return arrayList4;
            default:
                lu3 lu3Var4 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object b = ky6Var.b(i4, this);
                    return b == lu3Var4 ? lu3Var4 : b;
                }
                if (i8 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
