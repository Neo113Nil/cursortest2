package defpackage;

import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d3g {
    public final HashSet a = new HashSet();

    public final void a() {
        if (uaa.d == null) {
            uaa.d = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != uaa.d) {
            a70.r("Must be called on the Main thread.");
            return;
        }
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            throw lnb.i(it);
        }
    }
}
