package T4;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10919a;

    /* renamed from: b, reason: collision with root package name */
    public final b5.d f10920b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f10921c;

    /* renamed from: d, reason: collision with root package name */
    public c f10922d;

    public a(Context context, b5.d monitorListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(monitorListener, "monitorListener");
        this.f10919a = context;
        this.f10920b = monitorListener;
    }

    public b5.d a() {
        return this.f10920b;
    }

    public synchronized void b() {
        E5.b.f3006a.a("ANR monitor started");
        if (!this.f10921c) {
            this.f10921c = true;
            c();
        }
    }

    public final void c() {
        E5.b.f3006a.a("staring ANR watchdog");
        c cVar = new c(1000L, false, a(), this.f10919a);
        cVar.start();
        this.f10922d = cVar;
    }

    public synchronized void d() {
        try {
            E5.b.f3006a.a("ANR monitor stopped");
            this.f10921c = false;
            c cVar = this.f10922d;
            if (cVar != null) {
                cVar.interrupt();
            }
            this.f10922d = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
