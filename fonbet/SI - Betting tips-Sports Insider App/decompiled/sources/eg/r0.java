package eg;

import kotlin.Unit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class r0 extends t0 {

    /* renamed from: c, reason: collision with root package name */
    public final l f9214c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v0 f9215d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(v0 v0Var, long j, l lVar) {
        super(j);
        this.f9215d = v0Var;
        this.f9214c = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9214c.C(this.f9215d, Unit.f19194a);
    }

    @Override // eg.t0
    public final String toString() {
        return super.toString() + this.f9214c;
    }
}
