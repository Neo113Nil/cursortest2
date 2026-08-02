package defpackage;

import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class d64 extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ e64 t;
    public final /* synthetic */ String u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d64(e64 e64Var, String str, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.t = e64Var;
        this.u = str;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        String str = this.u;
        e64 e64Var = this.t;
        switch (i) {
            case 0:
                return new d64(e64Var, str, rq3Var, 0);
            case 1:
                return new d64(e64Var, str, rq3Var, 1);
            default:
                return new d64(e64Var, str, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((d64) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        String str = this.u;
        e64 e64Var = this.t;
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
                NetworkCoroutineAPI networkCoroutineAPI = e64Var.b;
                this.s = 1;
                Object searchManagers = networkCoroutineAPI.searchManagers(str, this);
                return searchManagers == lu3Var ? lu3Var : searchManagers;
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
                NetworkCoroutineAPI networkCoroutineAPI2 = e64Var.b;
                this.s = 1;
                Object searchPlayers = networkCoroutineAPI2.searchPlayers(str, "", this);
                return searchPlayers == lu3Var2 ? lu3Var2 : searchPlayers;
            default:
                lu3 lu3Var3 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI3 = e64Var.b;
                this.s = 1;
                Object searchVenues = networkCoroutineAPI3.searchVenues(str, this);
                return searchVenues == lu3Var3 ? lu3Var3 : searchVenues;
        }
    }
}
