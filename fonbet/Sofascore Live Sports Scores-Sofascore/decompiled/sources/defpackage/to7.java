package defpackage;

import com.sofascore.model.fantasy.FantasyRound;
import com.sofascore.model.fantasy.FantasyUserCompetition;
import com.sofascore.model.fantasy.FantasyUserCompetitionResponse;
import com.sofascore.model.fantasy.FantasyUserRound;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class to7 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ vo7 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ to7(vo7 vo7Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = vo7Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        vo7 vo7Var = this.t;
        switch (i) {
            case 0:
                return new to7(vo7Var, rq3Var, 0);
            case 1:
                return new to7(vo7Var, rq3Var, 1);
            case 2:
                return new to7(vo7Var, rq3Var, 2);
            default:
                return new to7(vo7Var, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((to7) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        gv9 gv9Var;
        FantasyUserCompetition userCompetition;
        int i = this.r;
        vo7 vo7Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var = vo7Var.e;
                    int i3 = vo7Var.i;
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
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(k13.r(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(pd0.K((FantasyRound) it.next()));
                }
                return arrayList;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    Object value = vo7Var.k.getValue();
                    po7 po7Var = value instanceof po7 ? (po7) value : null;
                    if (po7Var != null && (gv9Var = po7Var.f) != null) {
                        return gv9Var;
                    }
                    wi7 wi7Var2 = vo7Var.e;
                    String str = vo7Var.h;
                    int i5 = vo7Var.i;
                    this.s = 1;
                    obj = wi7Var2.P(i5, str, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                List list = (List) obj;
                if (list != null) {
                    return td4.k0(list);
                }
                return null;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var3 = vo7Var.e;
                    String str2 = vo7Var.h;
                    int i7 = vo7Var.i;
                    this.s = 1;
                    obj = wi7Var3.N(i7, str2, this);
                    if (obj == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i6 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                FantasyUserCompetitionResponse fantasyUserCompetitionResponse = (FantasyUserCompetitionResponse) obj;
                if (fantasyUserCompetitionResponse == null || (userCompetition = fantasyUserCompetitionResponse.getUserCompetition()) == null) {
                    return null;
                }
                return fkf.O(userCompetition, vo7Var.i());
            default:
                lu3 lu3Var4 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var4 = vo7Var.e;
                    String str3 = vo7Var.h;
                    int i9 = vo7Var.i;
                    this.s = 1;
                    obj = wi7Var4.O(i9, str3, this);
                    if (obj == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                List list2 = (List) obj;
                if (list2 == null) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(pco.T((FantasyUserRound) it2.next()));
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (((ho7) next).a.h()) {
                        arrayList3.add(next);
                    }
                }
                return CollectionsKt.H0(arrayList3, new se7(9));
        }
    }
}
