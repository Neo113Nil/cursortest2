package eg;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class z1 extends jg.t implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final long f9246e;

    public z1(long j, mf.c cVar) {
        super(cVar, cVar.getContext());
        this.f9246e = j;
    }

    @Override // eg.m1
    public final String T() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.T());
        sb2.append("(timeMillis=");
        return d9.e.j(sb2, this.f9246e, ')');
    }

    @Override // java.lang.Runnable
    public final void run() {
        c0.m(this.f9135c);
        o(new y1("Timed out waiting for " + this.f9246e + " ms", this));
    }
}
