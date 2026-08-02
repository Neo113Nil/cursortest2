package defpackage;

import com.sofascore.model.odds.OddsCountryProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gmd extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ umd s;
    public final /* synthetic */ OddsCountryProvider t;
    public final /* synthetic */ String u;
    public final /* synthetic */ int v;
    public final /* synthetic */ boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmd(umd umdVar, OddsCountryProvider oddsCountryProvider, String str, int i, boolean z, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = umdVar;
        this.t = oddsCountryProvider;
        this.u = str;
        this.v = i;
        this.w = z;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new gmd(this.s, this.t, this.u, this.v, this.w, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((gmd) create((rq3) obj)).invokeSuspend(Unit.a);
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
        int i2 = this.v;
        boolean z = this.w;
        umd umdVar = this.s;
        hz6 hz6Var = new hz6(umdVar, i2, z, null);
        this.r = 1;
        Object e = umd.e(umdVar, this.t, this.u, hz6Var, this, 4);
        return e == lu3Var ? lu3Var : e;
    }
}
