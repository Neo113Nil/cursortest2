package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Season;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vta extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ String s;
    public final /* synthetic */ yta t;
    public final /* synthetic */ Season u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vta(rq3 rq3Var, yta ytaVar, Season season, String str) {
        super(2, rq3Var);
        this.s = str;
        this.t = ytaVar;
        this.u = season;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new vta(rq3Var, this.t, this.u, this.s);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vta) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
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
        Season.SubSeasonType subSeasonType = this.s.equals(Sports.TENNIS) ? Season.SubSeasonType.MAIN_DRAW : Season.SubSeasonType.OVERALL;
        yta ytaVar = this.t;
        w3b w3bVar = ytaVar.e;
        int i2 = ytaVar.i;
        int id = this.u.getId();
        String label = subSeasonType.getLabel();
        this.r = 1;
        Object E = w3bVar.E(i2, id, this, label);
        return E == lu3Var ? lu3Var : E;
    }
}
