package defpackage;

import com.sofascore.network.api.FantasyAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vh7 extends hoi implements Function1 {
    public final /* synthetic */ String A;
    public int r;
    public final /* synthetic */ wi7 s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ String v;
    public final /* synthetic */ String w;
    public final /* synthetic */ Integer x;
    public final /* synthetic */ Float y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh7(wi7 wi7Var, int i, int i2, String str, String str2, Integer num, Float f, String str3, String str4, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = wi7Var;
        this.t = i;
        this.u = i2;
        this.v = str;
        this.w = str2;
        this.x = num;
        this.y = f;
        this.z = str3;
        this.A = str4;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new vh7(this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((vh7) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i != 0) {
            if (i == 1) {
                y6a.M(obj);
                return obj;
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        FantasyAPI fantasyAPI = this.s.a;
        this.r = 1;
        Object roundPlayers = fantasyAPI.getRoundPlayers(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this);
        return roundPlayers == lu3Var ? lu3Var : roundPlayers;
    }
}
