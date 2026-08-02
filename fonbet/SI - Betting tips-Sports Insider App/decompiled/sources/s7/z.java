package s7;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class z extends v {

    /* renamed from: b, reason: collision with root package name */
    public boolean f23263b;

    public z(f1 f1Var) {
        super(f1Var);
        ((f1) this.f3328a).A++;
    }

    public final void k() {
        if (!this.f23263b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void l() {
        if (this.f23263b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (m()) {
            return;
        }
        ((f1) this.f3328a).C.incrementAndGet();
        this.f23263b = true;
    }

    public abstract boolean m();
}
