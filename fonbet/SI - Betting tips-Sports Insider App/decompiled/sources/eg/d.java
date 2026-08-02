package eg;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public final c[] f9161a;

    public d(c[] cVarArr) {
        this.f9161a = cVarArr;
    }

    @Override // eg.i
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.f9161a) {
            o0 o0Var = cVar.f9148f;
            if (o0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("handle");
                o0Var = null;
            }
            o0Var.b();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f9161a + ']';
    }
}
