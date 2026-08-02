package com.ironsource;

import kotlin.NoWhenBranchMatchedException;
import xsna.epx;

/* loaded from: classes13.dex */
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
        if (bool == null ? true : bool.equals(Boolean.FALSE)) {
            return De.NOT_INIT;
        }
        if (epx.f(bool, Boolean.TRUE)) {
            return c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final synchronized void a(De de) {
        c = de;
    }

    public final void a(boolean z) {
        b = Boolean.valueOf(z);
    }
}
