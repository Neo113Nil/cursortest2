package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import xsna.f5z;
import xsna.iyx;
import xsna.j4z;

/* compiled from: Lifecycle.kt */
/* loaded from: classes.dex */
public final class j extends j4z implements l {
    public final Lifecycle b;
    public final kotlin.coroutines.d c;

    public j(Lifecycle lifecycle, kotlin.coroutines.d dVar) {
        this.b = lifecycle;
        this.c = dVar;
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            iyx.b(dVar, null);
        }
    }

    @Override // xsna.j4z
    public final Lifecycle a() {
        return this.b;
    }

    @Override // xsna.yvj
    public final kotlin.coroutines.d getCoroutineContext() {
        return this.c;
    }

    @Override // androidx.lifecycle.l
    public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
        Lifecycle lifecycle = this.b;
        if (lifecycle.getCurrentState().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            lifecycle.removeObserver(this);
            iyx.b(this.c, null);
        }
    }
}
