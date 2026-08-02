package defpackage;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vk {
    public final Handler a;
    public volatile boolean b;
    public final /* synthetic */ wk c;

    public vk(wk wkVar, Handler handler) {
        this.c = wkVar;
        this.a = handler;
    }

    public final void a(jz2 jz2Var, xe4 xe4Var) {
        if (this.b) {
            return;
        }
        b10 g = this.c.g(null);
        lfb.g.getAndIncrement();
        g.x(new lfb(xe4Var, SystemClock.elapsedRealtime()), 6, jz2Var, true);
    }
}
