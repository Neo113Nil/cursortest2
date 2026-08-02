package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import xsna.f5z;
import xsna.r1h0;

/* compiled from: SavedStateHandleSupport.kt */
/* loaded from: classes.dex */
public final class x implements l {
    public final r1h0 b;

    public x(r1h0 r1h0Var) {
        this.b = r1h0Var;
    }

    @Override // androidx.lifecycle.l
    public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            f5zVar.getLifecycle().removeObserver(this);
            this.b.a();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
