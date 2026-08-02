package fd;

import eg.c0;
import eg.m0;
import eg.t1;
import id.w;
import lg.e;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f9575a;

    public static boolean a(t1 t1Var) {
        if (t1Var != null) {
            if (!t1Var.c() && !t1Var.N() && !t1Var.isCancelled()) {
                return true;
            }
            if (t1Var.c() && !t1Var.N() && !t1Var.isCancelled()) {
                return true;
            }
            if (t1Var.c() && !t1Var.N() && !t1Var.isCancelled()) {
                return true;
            }
            if ((t1Var.c() || t1Var.N() || !t1Var.isCancelled()) && ((t1Var.c() || !t1Var.N() || !t1Var.isCancelled()) && !t1Var.c() && t1Var.N())) {
                t1Var.isCancelled();
            }
        }
        return false;
    }

    public final Object b(boolean z5, je.a aVar) {
        e eVar = m0.f9201a;
        return c0.A(lg.d.f20063c, new a(this, z5, null, 1), aVar);
    }

    public final Object c(androidx.lifecycle.b bVar) {
        e eVar = m0.f9201a;
        return c0.A(lg.d.f20063c, new c(this, null, 1), bVar);
    }

    public final Object d(int i5, boolean z5, w wVar) {
        e eVar = m0.f9201a;
        return c0.A(lg.d.f20063c, new b(this, i5, z5, null, 1), wVar);
    }
}
