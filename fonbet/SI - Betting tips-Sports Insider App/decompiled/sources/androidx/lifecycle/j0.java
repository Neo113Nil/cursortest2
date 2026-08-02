package androidx.lifecycle;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f2193a;

    public j0(n0 n0Var) {
        this.f2193a = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.f2193a.f2210a) {
            obj = this.f2193a.f2215f;
            this.f2193a.f2215f = n0.f2209k;
        }
        this.f2193a.j(obj);
    }
}
