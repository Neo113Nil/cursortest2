package defpackage;

import com.sofascore.model.mvvm.model.Event;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wq3 implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tr3 b;

    public /* synthetic */ wq3(tr3 tr3Var, int i) {
        this.a = i;
        this.b = tr3Var;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        int i = this.a;
        tr3 tr3Var = this.b;
        switch (i) {
            case 0:
                int ordinal = ((l64) obj).ordinal();
                if (ordinal == 0) {
                    Object u = tr3Var.u(rq3Var);
                    return u == lu3.a ? u : Unit.a;
                }
                if (ordinal == 1) {
                    Object t = tr3Var.t(rq3Var);
                    return t == lu3.a ? t : Unit.a;
                }
                if (ordinal == 2) {
                    return Unit.a;
                }
                zzl.b();
                return null;
            default:
                Event event = (Event) obj;
                fdi fdiVar = tr3Var.u;
                h34 h34Var = new h34(event.getId(), Event.getHomeTeam$default(event, null, 1, null), Event.getAwayTeam$default(event, null, 1, null), event.getStartTimestamp());
                fdiVar.getClass();
                fdiVar.m(null, h34Var);
                Unit unit = Unit.a;
                lu3 lu3Var = lu3.a;
                return unit;
        }
    }
}
