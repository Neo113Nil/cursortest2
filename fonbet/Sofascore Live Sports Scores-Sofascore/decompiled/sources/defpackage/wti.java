package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class wti implements s6b {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.s6b
    public final void onDestroy() {
        Iterator it = kik.z(this.a).iterator();
        while (it.hasNext()) {
            ((ka4) it.next()).getClass();
        }
    }

    @Override // defpackage.s6b
    public final void onStart() {
        Iterator it = kik.z(this.a).iterator();
        while (it.hasNext()) {
            ((ka4) it.next()).getClass();
        }
    }

    @Override // defpackage.s6b
    public final void onStop() {
        Iterator it = kik.z(this.a).iterator();
        while (it.hasNext()) {
            ((ka4) it.next()).getClass();
        }
    }
}
