package l0;

import androidx.transition.a0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f19300a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.transition.i f19301b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19302c;

    public final void a() {
        synchronized (this) {
            try {
                if (this.f19300a) {
                    return;
                }
                this.f19300a = true;
                this.f19302c = true;
                androidx.transition.i iVar = this.f19301b;
                if (iVar != null) {
                    try {
                        Runnable runnable = (Runnable) iVar.f2706b;
                        a0 a0Var = (a0) iVar.f2708d;
                        Runnable runnable2 = (Runnable) iVar.f2707c;
                        if (runnable == null) {
                            a0Var.cancel();
                            runnable2.run();
                        } else {
                            runnable.run();
                        }
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f19302c = false;
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                synchronized (this) {
                    this.f19302c = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }
}
