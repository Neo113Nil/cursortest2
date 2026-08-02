package v1;

import androidx.lifecycle.p0;
import androidx.lifecycle.q0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends p0 {

    /* renamed from: l, reason: collision with root package name */
    public final x5.c f24380l;

    /* renamed from: m, reason: collision with root package name */
    public Object f24381m;

    /* renamed from: n, reason: collision with root package name */
    public c f24382n;

    public b(x5.c cVar) {
        this.f24380l = cVar;
        if (cVar.f25395a != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        cVar.f25395a = this;
    }

    @Override // androidx.lifecycle.n0
    public final void f() {
        x5.c cVar = this.f24380l;
        cVar.f25396b = true;
        cVar.f25398d = false;
        cVar.f25397c = false;
        cVar.f25403i.drainPermits();
        cVar.c();
    }

    @Override // androidx.lifecycle.n0
    public final void g() {
        this.f24380l.f25396b = false;
    }

    @Override // androidx.lifecycle.n0
    public final void i(q0 q0Var) {
        super.i(q0Var);
        this.f24381m = null;
        this.f24382n = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.e0, java.lang.Object] */
    public final void k() {
        ?? r02 = this.f24381m;
        c cVar = this.f24382n;
        if (r02 == 0 || cVar == null) {
            return;
        }
        super.i(cVar);
        e(r02, cVar);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("LoaderInfo{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" #0 : ");
        Class<?> cls = this.f24380l.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
