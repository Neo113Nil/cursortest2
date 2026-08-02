package androidx.camera.view;

import androidx.camera.view.PreviewView;
import java.util.Objects;
import xsna.p0t;
import xsna.ug50;
import xsna.ui9;
import xsna.z5d0;

/* compiled from: PreviewStreamStateObserver.java */
/* loaded from: classes11.dex */
public final class b {
    public final ui9 a;
    public final ug50<PreviewView.StreamState> b;
    public PreviewView.StreamState c;
    public final z5d0 d;
    public p0t e;
    public boolean f = false;

    public b(ui9 ui9Var, ug50<PreviewView.StreamState> ug50Var, z5d0 z5d0Var) {
        this.a = ui9Var;
        this.b = ug50Var;
        this.d = z5d0Var;
        synchronized (this) {
            this.c = ug50Var.d();
        }
    }

    public final void a(PreviewView.StreamState streamState) {
        synchronized (this) {
            try {
                if (this.c.equals(streamState)) {
                    return;
                }
                this.c = streamState;
                Objects.toString(streamState);
                this.b.i(streamState);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
