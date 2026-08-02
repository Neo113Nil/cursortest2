package com.instagram.common.viewpoint.core;

import java.util.concurrent.Executor;

/* loaded from: assets/audience_network/classes2.dex */
public final class YS {
    public static YS A02;
    public final C1018Pp A00;
    public final YU A01;

    public YS(C1695gi c1695gi, Executor executor, C1126Tw c1126Tw) {
        this.A01 = new YU(c1695gi);
        this.A00 = new C1018Pp(executor, c1126Tw, c1695gi);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C1695gi c1695gi, Executor executor, C1126Tw c1126Tw) {
        if (!C1145Up.A1c(c1695gi)) {
            return;
        }
        if (A02 == null) {
            A02 = new YS(c1695gi, executor, c1126Tw);
            A02.A00();
        } else {
            A02.A02(c1126Tw);
        }
    }

    private void A02(C1126Tw c1126Tw) {
        this.A00.A07(c1126Tw);
    }
}
