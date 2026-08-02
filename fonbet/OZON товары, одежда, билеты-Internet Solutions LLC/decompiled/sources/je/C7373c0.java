package je;

import java.util.ArrayList;
import java.util.Collection;
import je.C7401v;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: je.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7373c0 {
    @NotNull
    public static final K0 a(@NotNull K0 k02, boolean z11) {
        Intrinsics.checkNotNullParameter(k02, "<this>");
        C7401v a11 = C7401v.a.a(k02, z11);
        if (a11 != null) {
            return a11;
        }
        Y b11 = b(k02);
        return b11 != null ? b11 : k02.L0(false);
    }

    private static final Y b(K0 k02) {
        M g10;
        s0 H02 = k02.H0();
        M m11 = H02 instanceof M ? (M) H02 : null;
        if (m11 != null) {
            Collection<N> o11 = m11.o();
            ArrayList arrayList = new ArrayList(C7714v.z(o11, 10));
            boolean z11 = false;
            for (N n11 : o11) {
                if (H0.g(n11)) {
                    n11 = a(n11.K0(), false);
                    z11 = true;
                }
                arrayList.add(n11);
            }
            if (z11) {
                N d11 = m11.d();
                if (d11 == null) {
                    d11 = null;
                } else if (H0.g(d11)) {
                    d11 = a(d11.K0(), false);
                }
                g10 = new M(arrayList).g(d11);
            } else {
                g10 = null;
            }
            if (g10 != null) {
                return g10.c();
            }
        }
        return null;
    }

    @NotNull
    public static final Y c(@NotNull Y y11) {
        Intrinsics.checkNotNullParameter(y11, "<this>");
        C7401v a11 = C7401v.a.a(y11, false);
        if (a11 != null) {
            return a11;
        }
        Y b11 = b(y11);
        return b11 == null ? y11.L0(false) : b11;
    }

    @NotNull
    public static final Y d(@NotNull Y y11, @NotNull Y abbreviatedType) {
        Intrinsics.checkNotNullParameter(y11, "<this>");
        Intrinsics.checkNotNullParameter(abbreviatedType, "abbreviatedType");
        return S.a(y11) ? y11 : new C7368a(y11, abbreviatedType);
    }
}
