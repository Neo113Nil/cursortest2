package androidx.lifecycle;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final u1.b f2194a = new u1.b();

    public final void a(String key, AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        u1.b bVar = this.f2194a;
        if (bVar != null) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(closeable, "closeable");
            if (bVar.f24014d) {
                u1.b.a(closeable);
                return;
            }
            synchronized (bVar.f24011a) {
                autoCloseable = (AutoCloseable) bVar.f24012b.put(key, closeable);
            }
            u1.b.a(autoCloseable);
        }
    }

    public final void b() {
        u1.b bVar = this.f2194a;
        if (bVar != null && !bVar.f24014d) {
            bVar.f24014d = true;
            synchronized (bVar.f24011a) {
                try {
                    Iterator it = bVar.f24012b.values().iterator();
                    while (it.hasNext()) {
                        u1.b.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = bVar.f24013c.iterator();
                    while (it2.hasNext()) {
                        u1.b.a((AutoCloseable) it2.next());
                    }
                    bVar.f24013c.clear();
                    Unit unit = Unit.f19194a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String key) {
        AutoCloseable autoCloseable;
        Intrinsics.checkNotNullParameter(key, "key");
        u1.b bVar = this.f2194a;
        if (bVar == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (bVar.f24011a) {
            autoCloseable = (AutoCloseable) bVar.f24012b.get(key);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
