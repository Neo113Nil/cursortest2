package androidx.lifecycle;

import android.app.Activity;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import xsna.f5z;
import xsna.n52;

/* compiled from: ProcessLifecycleOwner.kt */
/* loaded from: classes12.dex */
public final class q implements f5z {
    public static final q j = new q();
    public int b;
    public int c;
    public Handler f;
    public boolean d = true;
    public boolean e = true;
    public final m g = new m(this, true);
    public final n52 h = new n52(this, 14);
    public final b i = new b();

    /* compiled from: ProcessLifecycleOwner.kt */
    public static final class a {
        public static final void a(Activity activity, r.a aVar) {
            activity.registerActivityLifecycleCallbacks(aVar);
        }
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    public static final class b {
        public b() {
        }

        public final void a() {
            q.this.a();
        }

        public final void b() {
            q qVar = q.this;
            int i = qVar.b + 1;
            qVar.b = i;
            if (i == 1 && qVar.e) {
                qVar.g.c(Lifecycle.Event.ON_START);
                qVar.e = false;
            }
        }
    }

    public final void a() {
        int i = this.c + 1;
        this.c = i;
        if (i == 1) {
            if (!this.d) {
                this.f.removeCallbacks(this.h);
            } else {
                this.g.c(Lifecycle.Event.ON_RESUME);
                this.d = false;
            }
        }
    }

    @Override // xsna.f5z
    public final Lifecycle getLifecycle() {
        return this.g;
    }
}
