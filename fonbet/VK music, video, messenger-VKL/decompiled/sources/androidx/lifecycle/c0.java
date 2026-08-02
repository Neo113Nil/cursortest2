package androidx.lifecycle;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;

/* compiled from: ServiceLifecycleDispatcher.kt */
/* loaded from: classes12.dex */
public final class c0 {
    public final m a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public a c;

    /* compiled from: ServiceLifecycleDispatcher.kt */
    public static final class a implements Runnable {
        public final m b;
        public final Lifecycle.Event c;
        public boolean d;

        public a(m mVar, Lifecycle.Event event) {
            this.b = mVar;
            this.c = event;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.d) {
                return;
            }
            this.b.c(this.c);
            this.d = true;
        }
    }

    public c0(LifecycleService lifecycleService) {
        this.a = new m(lifecycleService, true);
    }

    public final void a(Lifecycle.Event event) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.a, event);
        this.c = aVar2;
        this.b.postAtFrontOfQueue(aVar2);
    }
}
