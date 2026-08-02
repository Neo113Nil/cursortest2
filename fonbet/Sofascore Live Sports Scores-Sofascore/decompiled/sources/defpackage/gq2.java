package defpackage;

import android.view.View;
import com.sofascore.model.mvvm.model.Event;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gq2 implements iq2 {
    public final hs2 a;

    public gq2(hs2 hs2Var) {
        this.a = hs2Var;
    }

    @Override // defpackage.iq2
    public final View k() {
        return this.a;
    }

    @Override // defpackage.iq2
    public final void p(Event event) {
        this.a.setEvent(event);
    }
}
