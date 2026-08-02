package defpackage;

import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class tyh extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ vyh t;
    public final /* synthetic */ String u;
    public final /* synthetic */ String v;
    public final /* synthetic */ String w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tyh(vyh vyhVar, String str, String str2, String str3, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.t = vyhVar;
        this.u = str;
        this.v = str2;
        this.w = str3;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new tyh(this.t, this.u, this.v, this.w, rq3Var, 0);
            default:
                return new tyh(this.t, this.u, this.v, this.w, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((tyh) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        String str = this.w;
        String str2 = this.v;
        String str3 = this.u;
        vyh vyhVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 != 0) {
                    if (i2 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI = vyhVar.a;
                this.s = 1;
                Object queryCategoriesForData = networkCoroutineAPI.queryCategoriesForData(str3, str2, str, this);
                return queryCategoriesForData == lu3Var ? lu3Var : queryCategoriesForData;
            default:
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
                NetworkCoroutineAPI networkCoroutineAPI2 = vyhVar.a;
                this.s = 1;
                Object popularEvents = networkCoroutineAPI2.getPopularEvents(str3, str2, str, this);
                return popularEvents == lu3Var2 ? lu3Var2 : popularEvents;
        }
    }
}
