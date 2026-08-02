package defpackage;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r6b implements f6b, t6b {
    public final HashSet a = new HashSet();
    public final g6b b;

    public r6b(g6b g6bVar) {
        this.b = g6bVar;
        g6bVar.a(this);
    }

    @Override // defpackage.f6b
    public final void c(s6b s6bVar) {
        this.a.add(s6bVar);
        g6b g6bVar = this.b;
        if (g6bVar.b() == e6b.a) {
            s6bVar.onDestroy();
        } else if (g6bVar.b().compareTo(e6b.d) >= 0) {
            s6bVar.onStart();
        } else {
            s6bVar.onStop();
        }
    }

    @Override // defpackage.f6b
    public final void f(s6b s6bVar) {
        this.a.remove(s6bVar);
    }

    @eqd(d6b.ON_DESTROY)
    public void onDestroy(@NonNull u6b u6bVar) {
        Iterator it = kik.z(this.a).iterator();
        while (it.hasNext()) {
            ((s6b) it.next()).onDestroy();
        }
        u6bVar.getLifecycle().d(this);
    }

    @eqd(d6b.ON_START)
    public void onStart(@NonNull u6b u6bVar) {
        Iterator it = kik.z(this.a).iterator();
        while (it.hasNext()) {
            ((s6b) it.next()).onStart();
        }
    }

    @eqd(d6b.ON_STOP)
    public void onStop(@NonNull u6b u6bVar) {
        Iterator it = kik.z(this.a).iterator();
        while (it.hasNext()) {
            ((s6b) it.next()).onStop();
        }
    }
}
