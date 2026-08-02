package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Season;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class n06 extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ p06 s;
    public final /* synthetic */ Event t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n06(rq3 rq3Var, p06 p06Var, Event event) {
        super(2, rq3Var);
        this.s = p06Var;
        this.t = event;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new n06(rq3Var, this.s, this.t);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n06) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
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
        j0j j0jVar = this.s.r;
        Event event = this.t;
        int id = Event.getHomeTeam$default(event, null, 1, null).getId();
        Integer F = o3a.F(event.getTournament());
        int intValue = F != null ? F.intValue() : 0;
        Season season = event.getSeason();
        int id2 = season != null ? season.getId() : 0;
        String label = Season.SubSeasonType.OVERALL.getLabel();
        String sportSlug = event.getSportSlug();
        this.r = 1;
        Object q = j0jVar.q(id, intValue, id2, label, sportSlug, this);
        return q == lu3Var ? lu3Var : q;
    }
}
