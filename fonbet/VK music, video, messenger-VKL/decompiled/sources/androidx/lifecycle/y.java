package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import xsna.f5z;
import xsna.v1h0;

/* compiled from: SavedStateHandleController.kt */
/* loaded from: classes12.dex */
public final class y implements l, AutoCloseable {
    public final String b;
    public final w c;
    public boolean d;

    public y(String str, w wVar) {
        this.b = str;
        this.c = wVar;
    }

    public final void b(Lifecycle lifecycle, v1h0 v1h0Var) {
        if (this.d) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.d = true;
        lifecycle.addObserver(this);
        v1h0Var.c(this.b, this.c.a.e);
    }

    @Override // androidx.lifecycle.l
    public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.d = false;
            f5zVar.getLifecycle().removeObserver(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
