package Y0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final e f13895a = new e();

    /* renamed from: b, reason: collision with root package name */
    public final Map f13896b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Set f13897c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f13898d;

    public final void d(AutoCloseable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        if (this.f13898d) {
            g(closeable);
            return;
        }
        synchronized (this.f13895a) {
            this.f13897c.add(closeable);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void e(String key, AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        if (this.f13898d) {
            g(closeable);
            return;
        }
        synchronized (this.f13895a) {
            autoCloseable = (AutoCloseable) this.f13896b.put(key, closeable);
        }
        g(autoCloseable);
    }

    public final void f() {
        if (this.f13898d) {
            return;
        }
        this.f13898d = true;
        synchronized (this.f13895a) {
            try {
                Iterator it = this.f13896b.values().iterator();
                while (it.hasNext()) {
                    g((AutoCloseable) it.next());
                }
                Iterator it2 = this.f13897c.iterator();
                while (it2.hasNext()) {
                    g((AutoCloseable) it2.next());
                }
                this.f13897c.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                androidx.core.content.res.e.a(autoCloseable);
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final AutoCloseable h(String key) {
        AutoCloseable autoCloseable;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.f13895a) {
            autoCloseable = (AutoCloseable) this.f13896b.get(key);
        }
        return autoCloseable;
    }
}
