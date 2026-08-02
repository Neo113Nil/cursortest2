package com.ironsource;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class Ee {
    private static Boolean b;
    public static final Ee a = new Ee();
    private static De c = De.NOT_INIT;

    private Ee() {
    }

    public final synchronized De a() {
        return c;
    }

    public final De b() {
        Boolean bool = b;
        if (bool == null ? true : Intrinsics.areEqual(bool, Boolean.FALSE)) {
            return De.NOT_INIT;
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            return c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final synchronized void a(De de2) {
        Intrinsics.checkNotNullParameter(de2, "<set-?>");
        c = de2;
    }

    public final void a(boolean z) {
        b = Boolean.valueOf(z);
    }
}
