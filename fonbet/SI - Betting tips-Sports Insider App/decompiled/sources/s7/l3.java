package s7;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class l3 extends k3 {

    /* renamed from: c, reason: collision with root package name */
    public boolean f22877c;

    public l3(r3 r3Var) {
        super(r3Var);
        this.f22859b.f23002r++;
    }

    public final void k() {
        if (!this.f22877c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void l() {
        if (this.f22877c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        m();
        this.f22859b.f23003s++;
        this.f22877c = true;
    }

    public abstract void m();
}
