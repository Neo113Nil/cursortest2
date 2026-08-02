package eg;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class s0 extends t0 {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f9221c;

    public s0(Runnable runnable, long j) {
        super(j);
        this.f9221c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9221c.run();
    }

    @Override // eg.t0
    public final String toString() {
        return super.toString() + this.f9221c;
    }
}
