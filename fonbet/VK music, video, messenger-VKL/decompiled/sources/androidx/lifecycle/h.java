package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import xsna.eyx;
import xsna.h4z;
import xsna.kcn;

/* compiled from: LifecycleController.jvm.kt */
/* loaded from: classes12.dex */
public final class h {
    public final Lifecycle a;
    public final Lifecycle.State b;
    public final kcn c;
    public final h4z d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [xsna.e5z, xsna.h4z] */
    public h(Lifecycle lifecycle, Lifecycle.State state, kcn kcnVar, final eyx eyxVar) {
        this.a = lifecycle;
        this.b = state;
        this.c = kcnVar;
        ?? r3 = new l() { // from class: xsna.h4z
            @Override // androidx.lifecycle.l
            public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
                Lifecycle.State currentState = f5zVar.getLifecycle().getCurrentState();
                Lifecycle.State state2 = Lifecycle.State.DESTROYED;
                androidx.lifecycle.h hVar = androidx.lifecycle.h.this;
                if (currentState == state2) {
                    eyxVar.b(null);
                    hVar.a();
                    return;
                }
                Lifecycle.State currentState2 = f5zVar.getLifecycle().getCurrentState();
                Lifecycle.State state3 = hVar.b;
                kcn kcnVar2 = hVar.c;
                if (currentState2.compareTo(state3) < 0) {
                    kcnVar2.a = true;
                } else if (kcnVar2.a) {
                    if (kcnVar2.b) {
                        throw new IllegalStateException("Cannot resume a finished dispatcher");
                    }
                    kcnVar2.a = false;
                    kcnVar2.a();
                }
            }
        };
        this.d = r3;
        if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
            lifecycle.addObserver(r3);
        } else {
            eyxVar.b(null);
            a();
        }
    }

    public final void a() {
        this.a.removeObserver(this.d);
        kcn kcnVar = this.c;
        kcnVar.b = true;
        kcnVar.a();
    }
}
