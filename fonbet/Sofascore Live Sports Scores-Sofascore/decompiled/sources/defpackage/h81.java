package defpackage;

import com.sofascore.model.mvvm.model.BaseballEvent;
import com.sofascore.model.mvvm.model.BaseballInningInfo;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class h81 extends e21 {
    @Override // defpackage.e21
    public final void o(Event event) {
        if (m(event)) {
            return;
        }
        BaseballEvent baseballEvent = event instanceof BaseballEvent ? (BaseballEvent) event : null;
        BaseballInningInfo currentInningInfo = baseballEvent != null ? baseballEvent.getCurrentInningInfo() : null;
        if (!ok3.D(event) || currentInningInfo == null) {
            l(event);
            return;
        }
        krk j = j(g81.b, R.layout.view_baseball_event_result, r21.d);
        j.getClass();
        ((jrk) j).b.setContent(new tc3(-234520323, new f81(event, currentInningInfo, this, 0), true));
    }
}
