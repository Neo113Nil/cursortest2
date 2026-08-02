package eg;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class w0 extends w {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f9231f = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f9232c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9233d;

    /* renamed from: e, reason: collision with root package name */
    public kotlin.collections.l f9234e;

    @Override // eg.w
    public final w h0(int i5) {
        jg.h.a(i5);
        return this;
    }

    public final void i0(boolean z5) {
        long j = this.f9232c - (z5 ? 4294967296L : 1L);
        this.f9232c = j;
        if (j <= 0 && this.f9233d) {
            shutdown();
        }
    }

    public final void j0(k0 k0Var) {
        kotlin.collections.l lVar = this.f9234e;
        if (lVar == null) {
            lVar = new kotlin.collections.l();
            this.f9234e = lVar;
        }
        lVar.addLast(k0Var);
    }

    public abstract Thread k0();

    public final void l0(boolean z5) {
        this.f9232c = (z5 ? 4294967296L : 1L) + this.f9232c;
        if (z5) {
            return;
        }
        this.f9233d = true;
    }

    public abstract long o0();

    public final boolean q0() {
        kotlin.collections.l lVar = this.f9234e;
        if (lVar == null) {
            return false;
        }
        k0 k0Var = (k0) (lVar.isEmpty() ? null : lVar.removeFirst());
        if (k0Var == null) {
            return false;
        }
        k0Var.run();
        return true;
    }

    public void s0(long j, t0 t0Var) {
        d0.j.x0(j, t0Var);
    }

    public abstract void shutdown();
}
