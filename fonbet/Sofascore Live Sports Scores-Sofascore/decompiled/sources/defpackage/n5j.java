package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.ServableEvent;
import com.sofascore.model.mvvm.model.TennisEvent;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class n5j extends y21 {
    public final TennisEvent O;

    public n5j(TennisEvent tennisEvent) {
        this.O = tennisEvent;
    }

    @Override // defpackage.y21
    public final Event d() {
        return this.O;
    }

    @Override // defpackage.y21
    public final void h(Context context, Event event) {
        TennisEvent tennisEvent = (TennisEvent) event;
        Integer valueOf = Integer.valueOf(R.color.live);
        Integer valueOf2 = Integer.valueOf(R.color.secondary_default);
        Integer valueOf3 = Integer.valueOf(R.color.n_lv_1);
        context.getClass();
        tennisEvent.getClass();
        s9a.C(this, tennisEvent);
        boolean z = false;
        if (!ok3.D(tennisEvent)) {
            this.t = false;
            this.u = false;
            return;
        }
        Integer firstToServe$default = ServableEvent.getFirstToServe$default(tennisEvent, null, 1, null);
        this.t = firstToServe$default != null && firstToServe$default.intValue() == 1;
        Integer firstToServe$default2 = ServableEvent.getFirstToServe$default(tennisEvent, null, 1, null);
        if (firstToServe$default2 != null && firstToServe$default2.intValue() == 2) {
            z = true;
        }
        this.u = z;
        jfj jfjVar = this.e;
        this.e = jfjVar != null ? jfj.a(jfjVar, null, valueOf3, 5) : null;
        jfj jfjVar2 = this.f;
        this.f = jfjVar2 != null ? jfj.a(jfjVar2, null, valueOf3, 5) : null;
        String point = Event.getHomeScore$default(tennisEvent, null, 1, null).getPoint();
        String point2 = Event.getAwayScore$default(tennisEvent, null, 1, null).getPoint();
        if (n9e.F(point)) {
            this.w = new jfj(4, point, valueOf2);
        }
        if (n9e.F(point2)) {
            this.x = new jfj(4, point2, valueOf2);
        }
        Integer scoreByPeriodName = Event.getHomeScore$default(tennisEvent, null, 1, null).getScoreByPeriodName(tennisEvent.getLastPeriod());
        String valueOf4 = scoreByPeriodName != null ? String.valueOf(scoreByPeriodName.intValue()) : null;
        Integer scoreByPeriodName2 = Event.getAwayScore$default(tennisEvent, null, 1, null).getScoreByPeriodName(tennisEvent.getLastPeriod());
        String valueOf5 = scoreByPeriodName2 != null ? String.valueOf(scoreByPeriodName2.intValue()) : null;
        if (n9e.F(valueOf4)) {
            this.y = new jfj(4, valueOf4, valueOf);
        }
        if (n9e.F(valueOf5)) {
            this.z = new jfj(4, valueOf5, valueOf);
        }
    }
}
