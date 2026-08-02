package W4;

import b5.d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f12984a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f12985b;

    public c(d monitorListener) {
        Intrinsics.checkNotNullParameter(monitorListener, "monitorListener");
        this.f12984a = monitorListener;
    }

    public d a() {
        return this.f12984a;
    }

    public synchronized void b() {
        E5.b.f3006a.a("navigation monitor started");
        if (!this.f12985b) {
            this.f12985b = true;
            c();
        }
    }

    public final void c() {
        D5.c.f2548a.b(a());
    }

    public synchronized void d() {
        E5.b.f3006a.a("navigation monitor stopped");
        this.f12985b = false;
        D5.c.f2548a.f(a());
    }
}
