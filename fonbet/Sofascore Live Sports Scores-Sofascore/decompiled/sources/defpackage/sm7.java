package defpackage;

import com.sofascore.model.fantasy.FantasyUserCompetition;
import com.sofascore.model.fantasy.FantasyUserCompetitionResponse;
import com.sofascore.model.fantasy.FantasyUserRound;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sm7 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ tm7 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sm7(tm7 tm7Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = tm7Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        tm7 tm7Var = this.t;
        switch (i) {
            case 0:
                return new sm7(tm7Var, rq3Var, 0);
            case 1:
                return new sm7(tm7Var, rq3Var, 1);
            default:
                return new sm7(tm7Var, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((sm7) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        FantasyUserCompetition userCompetition;
        int i = this.r;
        tm7 tm7Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var = tm7Var.e;
                    String str = tm7Var.g;
                    int i3 = tm7Var.f;
                    this.s = 1;
                    obj = wi7Var.O(i3, str, this);
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
                if (list == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(k13.r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(pd0.K(((FantasyUserRound) it.next()).getFantasyRound()));
                }
                return arrayList;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var2 = tm7Var.e;
                    String str2 = tm7Var.g;
                    int i5 = tm7Var.f;
                    this.s = 1;
                    obj = wi7Var2.P(i5, str2, this);
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
                List list2 = (List) obj;
                if (list2 == null) {
                    lm5 lm5Var = lm5.a;
                    lm5Var.getClass();
                    return lm5Var;
                }
                ArrayList k0 = td4.k0(list2);
                int c = sub.c(k13.r(k0, 10));
                if (c < 16) {
                    c = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(c);
                Iterator it2 = k0.iterator();
                while (it2.hasNext()) {
                    lj7 lj7Var = (lj7) it2.next();
                    linkedHashMap.put(new Integer(lj7Var.a), lj7Var);
                }
                return linkedHashMap;
            default:
                lu3 lu3Var3 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var3 = tm7Var.e;
                    String str3 = tm7Var.g;
                    int i7 = tm7Var.f;
                    this.s = 1;
                    obj = wi7Var3.N(i7, str3, this);
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
                return fkf.O(userCompetition, tm7Var.i());
        }
    }
}
