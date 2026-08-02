package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.DartsEvent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.ServableEvent;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xc4 extends y21 {
    public final DartsEvent O;

    public xc4(DartsEvent dartsEvent) {
        this.O = dartsEvent;
    }

    @Override // defpackage.y21
    public final Event d() {
        return this.O;
    }

    @Override // defpackage.y21
    public final void h(Context context, Event event) {
        DartsEvent dartsEvent = (DartsEvent) event;
        Integer valueOf = Integer.valueOf(R.drawable.ic_dart_16);
        context.getClass();
        dartsEvent.getClass();
        if (!ok3.D(dartsEvent)) {
            s9a.C(this, dartsEvent);
            this.q = null;
            this.r = null;
            return;
        }
        Integer firstToServe$default = ServableEvent.getFirstToServe$default(dartsEvent, null, 1, null);
        this.q = (firstToServe$default != null && firstToServe$default.intValue() == 1) ? valueOf : null;
        Integer firstToServe$default2 = ServableEvent.getFirstToServe$default(dartsEvent, null, 1, null);
        if (firstToServe$default2 == null || firstToServe$default2.intValue() != 2) {
            valueOf = null;
        }
        this.r = valueOf;
        this.s = Integer.valueOf(R.color.secondary_default);
        this.w = iz8.t(R.color.secondary_default, Event.getHomeScore$default(dartsEvent, null, 1, null).getPoint());
        this.x = iz8.t(R.color.secondary_default, Event.getAwayScore$default(dartsEvent, null, 1, null).getPoint());
        if (!ok3.B(dartsEvent)) {
            this.e = iz8.t(R.color.live, y6a.C(Event.getHomeScore$default(dartsEvent, null, 1, null), false));
            this.f = iz8.t(R.color.live, y6a.C(Event.getAwayScore$default(dartsEvent, null, 1, null), false));
            return;
        }
        Integer display = Event.getHomeScore$default(dartsEvent, null, 1, null).getDisplay();
        this.e = iz8.t(R.color.n_lv_1, display != null ? String.valueOf(display.intValue()) : null);
        Integer display2 = Event.getAwayScore$default(dartsEvent, null, 1, null).getDisplay();
        this.f = iz8.t(R.color.n_lv_1, display2 != null ? String.valueOf(display2.intValue()) : null);
        this.y = iz8.t(R.color.live, y6a.C(Event.getHomeScore$default(dartsEvent, null, 1, null), true));
        this.z = iz8.t(R.color.live, y6a.C(Event.getAwayScore$default(dartsEvent, null, 1, null), true));
    }
}
