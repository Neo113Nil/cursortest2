package N7;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f7907a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final a f7908b = new C0160b();

    /* renamed from: c, reason: collision with root package name */
    public static c f7909c;

    public interface a {
    }

    /* renamed from: N7.b$b, reason: collision with other inner class name */
    public static final class C0160b implements a {
    }

    public interface c {
        void a(String str);

        void b();

        boolean isTracing();
    }

    public static final void a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        f7907a.c().a(name);
    }

    public static final void b() {
        f7907a.c().b();
    }

    public static final boolean d() {
        return f7907a.c().isTracing();
    }

    public final c c() {
        N7.a aVar;
        c cVar = f7909c;
        if (cVar != null) {
            return cVar;
        }
        synchronized (b.class) {
            aVar = new N7.a();
            f7909c = aVar;
        }
        return aVar;
    }
}
