package defpackage;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fr7 extends hoi implements et8 {
    public final /* synthetic */ int r = 1;
    public int s;
    public Object t;
    public /* synthetic */ Object u;
    public /* synthetic */ Object v;
    public /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr7(fcg fcgVar, hbg hbgVar, rq3 rq3Var) {
        super(4, rq3Var);
        this.w = fcgVar;
        this.x = hbgVar;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.r;
        Object obj5 = this.x;
        switch (i) {
            case 0:
                fr7 fr7Var = new fr7((rr7) obj5, (rq3) obj4);
                fr7Var.w = (String) obj;
                fr7Var.u = (List) obj2;
                fr7Var.v = (List) obj3;
                return fr7Var.invokeSuspend(Unit.a);
            default:
                fr7 fr7Var2 = new fr7((fcg) this.w, (hbg) obj5, (rq3) obj4);
                fr7Var2.t = (qcg) obj;
                fr7Var2.u = (xag) obj2;
                fr7Var2.v = (pgg) obj3;
                return fr7Var2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        List list;
        String slug;
        int i = this.r;
        Object obj2 = this.x;
        switch (i) {
            case 0:
                rr7 rr7Var = (rr7) obj2;
                String str = (String) this.w;
                List list2 = (List) this.u;
                List list3 = (List) this.v;
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    ArrayList u = fc6.u(obj);
                    for (Object obj3 : list2) {
                        Sport sport = ((Team) obj3).getSport();
                        if (sport != null && (slug = sport.getSlug()) != null && j31.k(slug, str)) {
                            u.add(obj3);
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : list3) {
                        String sportSlug = ((Player) obj4).getSportSlug();
                        if (sportSlug != null && j31.k(sportSlug, str)) {
                            arrayList.add(obj4);
                        }
                    }
                    List l = rr7Var.l(CollectionsKt.w0(arrayList, u));
                    this.w = null;
                    this.u = null;
                    this.v = null;
                    this.t = l;
                    this.s = 1;
                    obj = rr7Var.m(u, arrayList, str, this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                    list = l;
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) this.t;
                    y6a.M(obj);
                }
                return new ft7(list, (List) obj);
            default:
                hbg hbgVar = (hbg) obj2;
                fcg fcgVar = (fcg) this.w;
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    ebg ebgVar = (ebg) fcgVar.g.invoke((qcg) this.t, (xag) this.u, (pgg) this.v);
                    List j = b.j(rag.BANNER, rag.NATIVE_AD);
                    this.t = null;
                    this.u = null;
                    this.s = 1;
                    obj = ebgVar.d(hbgVar, xbg.class, j, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                xbg xbgVar = (xbg) obj;
                fcgVar.c = hbgVar;
                return xbgVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr7(rr7 rr7Var, rq3 rq3Var) {
        super(4, rq3Var);
        this.x = rr7Var;
    }
}
