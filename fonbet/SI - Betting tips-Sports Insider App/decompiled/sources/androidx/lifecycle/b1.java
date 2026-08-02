package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b1 implements c0, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final String f2138a;

    /* renamed from: b, reason: collision with root package name */
    public final a1 f2139b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2140c;

    public b1(String key, a1 handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.f2138a = key;
        this.f2139b = handle;
    }

    @Override // androidx.lifecycle.c0
    public final void c(e0 source, w event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == w.ON_DESTROY) {
            this.f2140c = false;
            source.getLifecycle().b(this);
        }
    }

    public final void k(y lifecycle, q2.d registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.f2140c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f2140c = true;
        lifecycle.a(this);
        registry.c(this.f2138a, (a2.r) this.f2139b.f2133a.f3581f);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
