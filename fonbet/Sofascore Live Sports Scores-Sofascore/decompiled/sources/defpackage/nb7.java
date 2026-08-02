package defpackage;

import com.sofascore.model.fantasy.FantasyCompetition;
import com.sofascore.model.fantasy.FantasyUpcomingCompetition;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nb7 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ ob7 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nb7(ob7 ob7Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = ob7Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        ob7 ob7Var = this.t;
        switch (i) {
            case 0:
                return new nb7(ob7Var, rq3Var, 0);
            default:
                return new nb7(ob7Var, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((nb7) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        ob7 ob7Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var = ob7Var.e;
                    this.s = 1;
                    obj = wi7Var.k(this);
                    if (obj == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    String str = ob7Var.h;
                    ia0 ia0Var = ia0.q;
                    if (f5p.L((FantasyCompetition) obj2, str, ok3.p().e().getDevMod())) {
                        arrayList.add(obj2);
                    }
                }
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var2 = ob7Var.e;
                    this.s = 1;
                    obj = wi7Var2.M(this);
                    if (obj == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                List list = (List) obj;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list) {
                        String str2 = ob7Var.h;
                        ia0 ia0Var2 = ia0.q;
                        if (f5p.M((FantasyUpcomingCompetition) obj3, str2, ok3.p().e().getDevMod())) {
                            arrayList2.add(obj3);
                        }
                    }
                    break;
                }
                break;
        }
        return null;
    }
}
