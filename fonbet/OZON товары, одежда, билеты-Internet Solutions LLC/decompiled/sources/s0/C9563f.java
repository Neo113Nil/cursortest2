package s0;

import Z1.s;
import fd.InterfaceC6511n;
import k1.C7459e;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;
import y0.S;
import y0.b0;

/* renamed from: s0.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9563f {
    @NotNull
    public static final C9562e a(@NotNull InterfaceC6511n interfaceC6511n, @NotNull S s11, @NotNull b0 b0Var) {
        return new C9562e(interfaceC6511n, s11, b0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final float d(@NotNull b0 b0Var, @NotNull s sVar, float f7, float f11, float f12) {
        boolean f13 = b0Var.z().getOrientation() == EnumC9142v.Vertical ? f(b0Var) : sVar == s.Ltr ? f(b0Var) : !f(b0Var);
        int pageSize = b0Var.z().getPageSize();
        float e11 = pageSize == 0 ? 0.0f : e(b0Var) / pageSize;
        float f14 = e11 - ((int) e11);
        char c11 = Math.abs(f7) >= b0Var.t().v1(C9573p.d()) ? f7 > 0.0f ? (char) 1 : (char) 2 : (char) 0;
        if (c11 == 0) {
            return (Math.abs(f14) <= 0.5f ? Math.abs(e11) < Math.abs(b0Var.I()) ? Math.abs(f11) >= Math.abs(f12) : !f13 : f13) ? f12 : f11;
        }
        if (c11 != 1) {
            if (c11 != 2) {
                return 0.0f;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(b0 b0Var) {
        return b0Var.z().getOrientation() == EnumC9142v.Horizontal ? C7459e.g(b0Var.N()) : C7459e.h(b0Var.N());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(b0 b0Var) {
        boolean e11 = b0Var.z().e();
        if (e(b0Var) <= 0.0f || !e11) {
            return e(b0Var) <= 0.0f && !e11;
        }
        return true;
    }
}
