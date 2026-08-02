package defpackage;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class afc {
    public final Runnable a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final HashMap c = new HashMap();

    public afc(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(zfc zfcVar) {
        this.b.remove(zfcVar);
        zec zecVar = (zec) this.c.remove(zfcVar);
        if (zecVar != null) {
            zecVar.a.d(zecVar.b);
            zecVar.b = null;
        }
        this.a.run();
    }
}
