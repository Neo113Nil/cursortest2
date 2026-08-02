package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f2190a;

    /* renamed from: b, reason: collision with root package name */
    public final w f2191b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2192c;

    public i1(g0 registry, w event) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(event, "event");
        this.f2190a = registry;
        this.f2191b = event;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2192c) {
            return;
        }
        this.f2190a.e(this.f2191b);
        this.f2192c = true;
    }
}
