package je;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: je.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7374d {
    private static boolean a(ne.m mVar, ne.h hVar, ne.h hVar2) {
        int i11;
        if (mVar.h(hVar) == mVar.h(hVar2) && mVar.x(hVar) == mVar.x(hVar2)) {
            if ((mVar.g0(hVar) == null) == (mVar.g0(hVar2) == null) && mVar.L(mVar.c0(hVar), mVar.c0(hVar2))) {
                if (!mVar.m0(hVar, hVar2)) {
                    int h11 = mVar.h(hVar);
                    for (0; i11 < h11; i11 + 1) {
                        ne.j i02 = mVar.i0(hVar, i11);
                        ne.j i03 = mVar.i0(hVar2, i11);
                        i11 = (mVar.T(i02) == mVar.T(i03) && (mVar.T(i02) || (mVar.z(i02) == mVar.z(i03) && c(mVar, mVar.D(i02), mVar.D(i03))))) ? i11 + 1 : 0;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean b(@NotNull ne.m context, @NotNull ne.g a11, @NotNull ne.g b11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        return c(context, a11, b11);
    }

    private static boolean c(ne.m mVar, ne.g gVar, ne.g gVar2) {
        if (gVar == gVar2) {
            return true;
        }
        Y u11 = mVar.u(gVar);
        Y u12 = mVar.u(gVar2);
        if (u11 != null && u12 != null) {
            return a(mVar, u11, u12);
        }
        AbstractC7360E q11 = mVar.q(gVar);
        AbstractC7360E q12 = mVar.q(gVar2);
        return q11 != null && q12 != null && a(mVar, mVar.i(q11), mVar.i(q12)) && a(mVar, mVar.Q(q11), mVar.Q(q12));
    }
}
