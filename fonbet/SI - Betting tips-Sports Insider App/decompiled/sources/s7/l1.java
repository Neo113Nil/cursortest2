package s7;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class l1 extends c0.x {

    /* renamed from: b, reason: collision with root package name */
    public boolean f22870b;

    public l1(f1 f1Var) {
        super(f1Var);
        ((f1) this.f3328a).A++;
    }

    public abstract boolean k();

    public final void l() {
        if (!this.f22870b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void m() {
        if (this.f22870b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (k()) {
            return;
        }
        ((f1) this.f3328a).C.incrementAndGet();
        this.f22870b = true;
    }
}
