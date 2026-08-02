package hd0;

import Kb0.K;
import Sc.r;
import Sc.s;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class n {
    public static final String a(@NotNull String str) {
        Object a11;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            r.Companion companion = r.INSTANCE;
            a11 = C7714v.V(C7714v.L0(2, kotlin.text.h.m(str, new String[]{"."}, 0, 6)), ".", null, null, null, 62);
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (a11 instanceof r.b) {
            a11 = null;
        }
        String str2 = (String) a11;
        if (str2 == null || kotlin.text.h.K(str2)) {
            return null;
        }
        return str2;
    }

    public static final boolean b(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        K k11 = Tb0.a.f26975d;
        if (k11 != null) {
            return kotlin.text.h.e0(str, k11.N().getPrimaryDomain().g(), false);
        }
        throw new Lb0.a();
    }
}
