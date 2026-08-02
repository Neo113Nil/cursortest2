package eg;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class j0 extends jg.t {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9181e = AtomicIntegerFieldUpdater.newUpdater(j0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // jg.t, eg.m1
    public final void j(Object obj) {
        l(obj);
    }

    @Override // jg.t, eg.m1
    public final void l(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f9181e;
            int i5 = atomicIntegerFieldUpdater.get(this);
            if (i5 != 0) {
                if (i5 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                jg.h.f(c0.u(obj), lf.d.b(this.f18525d));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
