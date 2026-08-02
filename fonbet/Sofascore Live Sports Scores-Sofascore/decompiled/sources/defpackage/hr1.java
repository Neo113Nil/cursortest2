package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.BasketballEvent;
import com.sofascore.model.mvvm.model.Event;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hr1 extends y21 {
    public final BasketballEvent O;
    public jfj P;

    public hr1(BasketballEvent basketballEvent) {
        this.O = basketballEvent;
    }

    @Override // defpackage.y21
    public final Event d() {
        return this.O;
    }

    @Override // defpackage.y21
    public final void h(Context context, Event event) {
        BasketballEvent basketballEvent = (BasketballEvent) event;
        context.getClass();
        basketballEvent.getClass();
        s9a.C(this, basketballEvent);
        int i = e21.E;
        this.P = oyn.C(context, basketballEvent);
    }
}
