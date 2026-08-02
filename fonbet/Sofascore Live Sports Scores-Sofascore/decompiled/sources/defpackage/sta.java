package defpackage;

import com.sofascore.model.mvvm.model.Season;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sta extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ yta s;
    public final /* synthetic */ Season t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sta(yta ytaVar, Season season, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = ytaVar;
        this.t = season;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new sta(this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((sta) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
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
        yta ytaVar = this.s;
        w3b w3bVar = ytaVar.e;
        int i2 = ytaVar.i;
        int id = this.t.getId();
        String label = Season.SubSeasonType.REGULAR_SEASON.getLabel();
        this.r = 1;
        Object C = w3bVar.C(i2, id, this, label);
        return C == lu3Var ? lu3Var : C;
    }
}
