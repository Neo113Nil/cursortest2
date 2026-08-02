package hg;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class v0 extends ig.d {

    /* renamed from: a, reason: collision with root package name */
    public long f10783a;

    /* renamed from: b, reason: collision with root package name */
    public eg.l f10784b;

    @Override // ig.d
    public final boolean a(ig.b bVar) {
        t0 t0Var = (t0) bVar;
        if (this.f10783a >= 0) {
            return false;
        }
        long j = t0Var.f10771i;
        if (j < t0Var.j) {
            t0Var.j = j;
        }
        this.f10783a = j;
        return true;
    }

    @Override // ig.d
    public final Continuation[] b(ig.b bVar) {
        long j = this.f10783a;
        this.f10783a = -1L;
        this.f10784b = null;
        return ((t0) bVar).v(j);
    }
}
