package U4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final b5.d f12061a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f12062b;

    /* renamed from: c, reason: collision with root package name */
    public d f12063c;

    public e(b5.d monitorListener) {
        Intrinsics.checkNotNullParameter(monitorListener, "monitorListener");
        this.f12061a = monitorListener;
    }

    public b5.d a() {
        return this.f12061a;
    }

    public synchronized void b() {
        E5.b.f3006a.a("uncaught exception monitoring started");
        if (!this.f12062b) {
            this.f12062b = true;
            c();
        }
    }

    public final void c() {
        d dVar = new d(a());
        dVar.a();
        this.f12063c = dVar;
    }

    public synchronized void d() {
        try {
            E5.b.f3006a.a("uncaught exception monitoring stopped");
            this.f12062b = false;
            d dVar = this.f12063c;
            if (dVar != null) {
                dVar.b();
            }
            this.f12063c = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
