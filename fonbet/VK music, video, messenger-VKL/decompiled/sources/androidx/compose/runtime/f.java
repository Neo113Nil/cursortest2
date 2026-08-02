package androidx.compose.runtime;

import androidx.compose.runtime.a;
import java.util.List;
import xsna.eh50;
import xsna.g1m;
import xsna.ph50;
import xsna.rgt;
import xsna.s3q0;
import xsna.v2k0;
import xsna.vef0;
import xsna.wef0;
import xsna.wzs;
import xsna.x2k0;
import xsna.y2k0;
import xsna.yy1;

/* compiled from: RecomposeScopeImpl.kt */
/* loaded from: classes11.dex */
public final class f implements vef0 {
    public wef0 a;
    public int b;
    public yy1 c;
    public wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> d;
    public int e;
    public eh50<Object> f;
    public ph50<g1m<?>, Object> g;

    /* compiled from: RecomposeScopeImpl.kt */
    public static final class a {
        public static void a(y2k0 y2k0Var, List list, wef0 wef0Var) {
            List list2 = list;
            if (list2.isEmpty()) {
                return;
            }
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                int c = y2k0Var.c((rgt) list.get(i));
                int V = y2k0Var.V(y2k0Var.v(c), y2k0Var.b);
                Object obj = V < y2k0Var.g(y2k0Var.v(c + 1), y2k0Var.b) ? y2k0Var.c[y2k0Var.h(V)] : a.C0011a.a;
                f fVar = obj instanceof f ? (f) obj : null;
                if (fVar != null) {
                    fVar.a = wef0Var;
                }
            }
        }

        public static boolean b(v2k0 v2k0Var, List list) {
            List list2 = list;
            if (!list2.isEmpty()) {
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    rgt rgtVar = (rgt) list.get(i);
                    if (v2k0Var.g0(rgtVar)) {
                        int a0 = v2k0Var.a0(rgtVar);
                        int c = x2k0.c(a0, v2k0Var.b);
                        int i2 = a0 + 1;
                        if (((i2 < v2k0Var.c ? v2k0Var.b[(i2 * 5) + 4] : v2k0Var.d.length) - c > 0 ? v2k0Var.d[c] : a.C0011a.a) instanceof f) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    public f(wef0 wef0Var) {
        this.a = wef0Var;
    }

    public final yy1 a() {
        return this.c;
    }

    public final boolean b() {
        if (this.a != null) {
            yy1 yy1Var = this.c;
            if (yy1Var != null ? yy1Var.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final InvalidationResult c(Object obj) {
        InvalidationResult m;
        wef0 wef0Var = this.a;
        return (wef0Var == null || (m = wef0Var.m(this, obj)) == null) ? InvalidationResult.IGNORED : m;
    }

    public final void d() {
        wef0 wef0Var = this.a;
        if (wef0Var != null) {
            wef0Var.i();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void e(boolean z) {
        int i = this.b;
        this.b = z ? i | 256 : i & (-257);
    }

    public final void f(boolean z) {
        int i = this.b;
        this.b = z ? i | 8 : i & (-9);
    }

    public final void g(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }

    public final void h(boolean z) {
        int i = this.b;
        this.b = z ? i | 1024 : i & (-1025);
    }

    public final void i(boolean z) {
        int i = this.b;
        this.b = z ? i | 512 : i & (-513);
    }

    @Override // xsna.vef0
    public final void invalidate() {
        wef0 wef0Var = this.a;
        if (wef0Var != null) {
            wef0Var.m(this, null);
        }
    }

    public final void j(boolean z) {
        int i = this.b;
        this.b = z ? i | 128 : i & (-129);
    }

    public final void k() {
        this.b |= 1;
    }

    public final void l(wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar) {
        this.d = wzsVar;
    }
}
