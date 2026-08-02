package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.AmericanFootballDownDistance;
import com.sofascore.model.mvvm.model.AmericanFootballEvent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tt extends y21 {
    public final AmericanFootballEvent O;

    public tt(AmericanFootballEvent americanFootballEvent) {
        this.O = americanFootballEvent;
    }

    @Override // defpackage.y21
    public final Event d() {
        return this.O;
    }

    @Override // defpackage.y21
    public final void h(Context context, Event event) {
        AmericanFootballEvent americanFootballEvent = (AmericanFootballEvent) event;
        Integer valueOf = Integer.valueOf(R.drawable.ic_touchdown_16);
        context.getClass();
        americanFootballEvent.getClass();
        s9a.C(this, americanFootballEvent);
        String string = (ok3.D(americanFootballEvent) && americanFootballEvent.isInRedZone()) ? context.getString(R.string.am_football_red_zone_status) : null;
        if (string != null) {
            this.D = new jfj(6, string, (Integer) null);
        }
        AmericanFootballDownDistance yardDistance = americanFootballEvent.getYardDistance();
        boolean z = (yardDistance != null ? yardDistance.getCurrentDown() : null) != null;
        AmericanFootballDownDistance yardDistance2 = americanFootballEvent.getYardDistance();
        Integer currentPossession$default = yardDistance2 != null ? AmericanFootballDownDistance.getCurrentPossession$default(yardDistance2, americanFootballEvent.shouldReverseTeams(), null, 2, null) : null;
        this.q = (currentPossession$default != null && currentPossession$default.intValue() == 1 && z) ? valueOf : null;
        if (currentPossession$default == null || currentPossession$default.intValue() != 2 || !z) {
            valueOf = null;
        }
        this.r = valueOf;
    }
}
