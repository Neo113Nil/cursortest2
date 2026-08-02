package defpackage;

import com.sofascore.model.newNetwork.HighlightsResponse;
import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xr2 extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xr2(Object obj, int i, rq3 rq3Var, int i2) {
        super(1, rq3Var);
        this.r = i2;
        this.u = obj;
        this.t = i;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        int i2 = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                return new xr2((cs2) obj, i2, rq3Var, 0);
            case 1:
                return new xr2((v76) obj, i2, rq3Var, 1);
            case 2:
                return new xr2((aoe) obj, i2, rq3Var, 2);
            case 3:
                return new xr2((zte) obj, i2, rq3Var, 3);
            case 4:
                return new xr2((p5i) obj, i2, rq3Var, 4);
            case 5:
                return new xr2((yni) obj, i2, rq3Var, 5);
            case 6:
                return new xr2((fvi) obj, i2, rq3Var, 6);
            case 7:
                return new xr2((irj) obj, i2, rq3Var, 7);
            case 8:
                return new xr2((vrj) obj, i2, rq3Var, 8);
            default:
                return new xr2((z3k) obj, i2, rq3Var, 9);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((xr2) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI = ((cs2) obj2).b;
                this.s = 1;
                Object deleteMessage = networkCoroutineAPI.deleteMessage(i2, this);
                return deleteMessage == lu3Var ? lu3Var : deleteMessage;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                v76 v76Var = (v76) obj2;
                this.s = 1;
                v76Var.getClass();
                Object i5 = v76.i(v76Var, i2, this);
                return i5 == lu3Var2 ? lu3Var2 : i5;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object c = aoe.c((aoe) obj2, i2, this);
                    return c == lu3Var3 ? lu3Var3 : c;
                }
                if (i6 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i7 = this.s;
                if (i7 != 0) {
                    if (i7 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI2 = ((zte) obj2).c;
                this.s = 1;
                Object eventPlayerOfTheMatchOptions = networkCoroutineAPI2.getEventPlayerOfTheMatchOptions(i2, this);
                return eventPlayerOfTheMatchOptions == lu3Var4 ? lu3Var4 : eventPlayerOfTheMatchOptions;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    t9c t9cVar = ((p5i) obj2).e;
                    this.s = 1;
                    obj = t9cVar.a.getStageHighlights(i2, this);
                    if (obj == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return ((HighlightsResponse) obj).getHighlights();
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i9 = this.s;
                if (i9 != 0) {
                    if (i9 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI3 = ((yni) obj2).a;
                this.s = 1;
                Object survey = networkCoroutineAPI3.getSurvey(i2, this);
                return survey == lu3Var6 ? lu3Var6 : survey;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object c2 = fvi.c((fvi) obj2, i2, this);
                    return c2 == lu3Var7 ? lu3Var7 : c2;
                }
                if (i10 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object f = irj.f((irj) obj2, i2, this);
                    return f == lu3Var8 ? lu3Var8 : f;
                }
                if (i11 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                lu3 lu3Var9 = lu3.a;
                int i12 = this.s;
                if (i12 != 0) {
                    if (i12 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI4 = ((vrj) obj2).a;
                this.s = 1;
                Object categoryTournaments = networkCoroutineAPI4.categoryTournaments(i2, this);
                return categoryTournaments == lu3Var9 ? lu3Var9 : categoryTournaments;
            default:
                lu3 lu3Var10 = lu3.a;
                int i13 = this.s;
                if (i13 != 0) {
                    if (i13 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI5 = ((z3k) obj2).b;
                this.s = 1;
                Object tvChannelEvents = networkCoroutineAPI5.tvChannelEvents(i2, this);
                return tvChannelEvents == lu3Var10 ? lu3Var10 : tvChannelEvents;
        }
    }
}
