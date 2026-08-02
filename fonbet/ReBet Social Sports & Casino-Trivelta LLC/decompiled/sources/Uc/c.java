package Uc;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.N;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c {
    public static /* synthetic */ void d(c cVar, N n10, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        cVar.c(n10, z10, z11);
    }

    public final void a(N n10, boolean z10) {
        if (z10) {
            n10.i();
        } else {
            n10.h();
        }
    }

    public final void b(N n10, boolean z10) {
        if (z10) {
            n10.k();
        } else {
            n10.j();
        }
    }

    public final void c(N n10, boolean z10, boolean z11) {
        if (z11) {
            b(n10, z10);
        } else {
            a(n10, z10);
        }
    }

    public final void e(FragmentManager fragmentManager, a op) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(op, "op");
        N a10 = Qc.c.a(fragmentManager);
        if (op.b()) {
            a10.g(op.e().e0().getScreenKey());
        }
        a10.b(op.d(), op.e());
        a10.v(op.e());
        d(this, a10, op.c(), false, 4, null);
    }

    public final void f(FragmentManager fragmentManager, d op) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(op, "op");
        N q10 = Qc.c.a(fragmentManager).q(op.d());
        Intrinsics.checkNotNullExpressionValue(q10, "runOnCommit(...)");
        c(q10, op.b(), op.c());
    }

    public final void g(FragmentManager fragmentManager, List ops, boolean z10) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(ops, "ops");
        Iterator it = ops.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(fragmentManager, this);
        }
        if (z10) {
            fragmentManager.k0();
        }
    }

    public final void h(FragmentManager fragmentManager, e op) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(op, "op");
        fragmentManager.g1(op.b().e0().getScreenKey(), 1);
    }
}
