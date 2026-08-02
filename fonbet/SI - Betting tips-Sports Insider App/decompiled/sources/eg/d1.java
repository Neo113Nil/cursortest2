package eg;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class d1 extends i1 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9163f = AtomicIntegerFieldUpdater.newUpdater(d1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final h1 f9164e;

    public d1(h1 h1Var) {
        this.f9164e = h1Var;
    }

    @Override // eg.i1
    public final boolean k() {
        return true;
    }

    @Override // eg.i1
    public final void l(Throwable th2) {
        if (f9163f.compareAndSet(this, 0, 1)) {
            this.f9164e.invoke(th2);
        }
    }
}
