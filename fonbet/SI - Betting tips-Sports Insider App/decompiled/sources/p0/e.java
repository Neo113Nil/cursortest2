package p0;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: c, reason: collision with root package name */
    public final Object f21402c;

    public e(int i5) {
        super(i5);
        this.f21402c = new Object();
    }

    @Override // p0.d, p0.c
    public final boolean a(Object instance) {
        boolean a7;
        Intrinsics.checkNotNullParameter(instance, "instance");
        synchronized (this.f21402c) {
            a7 = super.a(instance);
        }
        return a7;
    }

    @Override // p0.d, p0.c
    public final Object b() {
        Object b10;
        synchronized (this.f21402c) {
            b10 = super.b();
        }
        return b10;
    }
}
