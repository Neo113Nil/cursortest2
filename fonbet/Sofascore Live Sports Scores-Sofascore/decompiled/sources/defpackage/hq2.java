package defpackage;

import android.view.View;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.view.header.volleyball.VolleyballEventResultView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hq2 implements iq2 {
    public final VolleyballEventResultView a;

    static {
        int i = a3.j;
    }

    public hq2(VolleyballEventResultView volleyballEventResultView) {
        this.a = volleyballEventResultView;
    }

    @Override // defpackage.iq2
    public final View k() {
        return this.a;
    }

    @Override // defpackage.iq2
    public final void p(Event event) {
        this.a.m(event, false);
    }
}
