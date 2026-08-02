package defpackage;

import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.fantasy.FantasyCompetition;
import com.sofascore.model.fantasy.FantasyUpcomingCompetition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xpb extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ ypb t;
    public final /* synthetic */ UserAccount u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xpb(ypb ypbVar, UserAccount userAccount, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = ypbVar;
        this.u = userAccount;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        UserAccount userAccount = this.u;
        ypb ypbVar = this.t;
        switch (i) {
            case 0:
                return new xpb(ypbVar, userAccount, rq3Var, 0);
            case 1:
                return new xpb(ypbVar, userAccount, rq3Var, 1);
            case 2:
                return new xpb(ypbVar, userAccount, rq3Var, 2);
            default:
                return new xpb(ypbVar, userAccount, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((xpb) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v8, types: [km5] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        UserAccount userAccount = this.u;
        ypb ypbVar = this.t;
        ?? r6 = 0;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var = ypbVar.h;
                    this.s = 1;
                    obj = wi7Var.k(this);
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
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    if (f5p.L((FantasyCompetition) obj2, ypbVar.q, jca.M(userAccount))) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(f5p.G((FantasyCompetition) it.next()));
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (!((mp6) next).l) {
                        arrayList3.add(next);
                    }
                }
                return l6g.W(CollectionsKt.H0(arrayList3, new wpb(0)));
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 != 0) {
                    if (i3 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wi7 wi7Var2 = ypbVar.h;
                String id = userAccount.getId();
                this.s = 1;
                Object q = wi7Var2.q(id, this);
                return q == lu3Var2 ? lu3Var2 : q;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var3 = ypbVar.h;
                    this.s = 1;
                    obj = wi7Var3.M(this);
                    if (obj == lu3Var3) {
                        return lu3Var3;
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
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : list) {
                        if (f5p.M((FantasyUpcomingCompetition) obj3, ypbVar.q, jca.M(userAccount))) {
                            arrayList4.add(obj3);
                        }
                    }
                    r6 = new ArrayList(k13.r(arrayList4, 10));
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        r6.add(f5p.H((FantasyUpcomingCompetition) it3.next()));
                    }
                }
                if (r6 == 0) {
                    r6 = km5.a;
                }
                return l6g.W(r6);
            default:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 != 0) {
                    if (i5 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wi7 wi7Var4 = ypbVar.h;
                String id2 = userAccount.getId();
                this.s = 1;
                wi7Var4.getClass();
                Object P = yaa.P(new ug7(wi7Var4, id2, null, 4), this);
                return P == lu3Var4 ? lu3Var4 : P;
        }
    }
}
