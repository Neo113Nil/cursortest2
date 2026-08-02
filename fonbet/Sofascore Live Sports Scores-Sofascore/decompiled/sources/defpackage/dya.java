package defpackage;

import android.content.Context;
import com.sofascore.model.newNetwork.topperformance.TopPerformanceResponse;
import com.sofascore.model.newNetwork.topperformance.response.TopPerformanceStatistics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dya extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ gya t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public final /* synthetic */ Context w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dya(gya gyaVar, int i, int i2, Context context, rq3 rq3Var, int i3) {
        super(2, rq3Var);
        this.r = i3;
        this.t = gyaVar;
        this.u = i;
        this.v = i2;
        this.w = context;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new dya(this.t, this.u, this.v, this.w, rq3Var, 0);
            case 1:
                return new dya(this.t, this.u, this.v, this.w, rq3Var, 1);
            default:
                return new dya(this.t, this.u, this.v, this.w, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((dya) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        List s;
        List b;
        List a;
        int i = this.r;
        Context context = this.w;
        gya gyaVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    w3b w3bVar = gyaVar.e;
                    String str = gya.l;
                    this.s = 1;
                    obj = w3bVar.T(this.u, this.v, this, str, null);
                    if (obj == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                TopPerformanceResponse topPerformanceResponse = (TopPerformanceResponse) obj;
                if (topPerformanceResponse != null && (s = uic.s(context, (TopPerformanceStatistics) topPerformanceResponse.getTopPerformanceItems())) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : s) {
                        if (!((cmj) obj2).b.isEmpty()) {
                            arrayList.add(obj2);
                        }
                    }
                    break;
                }
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    w3b w3bVar2 = gyaVar.e;
                    String str2 = gya.l;
                    this.s = 1;
                    obj = w3bVar2.U(this.u, this.v, this, str2, null);
                    if (obj == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                TopPerformanceResponse topPerformanceResponse2 = (TopPerformanceResponse) obj;
                if (topPerformanceResponse2 != null && (b = snj.b(context, (TopPerformanceStatistics) topPerformanceResponse2.getTopPerformanceItems(), null)) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : b) {
                        if (!((qmj) obj3).b.isEmpty()) {
                            arrayList2.add(obj3);
                        }
                    }
                    break;
                }
                break;
            default:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    w3b w3bVar3 = gyaVar.e;
                    String str3 = gya.l;
                    this.s = 1;
                    obj = w3bVar3.V(this.u, this.v, this, str3);
                    if (obj == lu3Var3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                TopPerformanceResponse topPerformanceResponse3 = (TopPerformanceResponse) obj;
                if (topPerformanceResponse3 != null && (a = lpj.a(context, (TopPerformanceStatistics) topPerformanceResponse3.getTopPerformanceItems())) != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj4 : a) {
                        if (!((moj) obj4).b.isEmpty()) {
                            arrayList3.add(obj4);
                        }
                    }
                    break;
                }
                break;
        }
        return null;
    }
}
