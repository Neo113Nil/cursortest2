package com.facebook.ads.redexgen.core;

import java.util.concurrent.Executor;

/* loaded from: assets/audience_network/classes2.dex */
public final class YS {
    public static YS A02;
    public final C1975Pp A00;
    public final YU A01;

    public YS(C2652gi c2652gi, Executor executor, C2083Tw c2083Tw) {
        this.A01 = new YU(c2652gi);
        this.A00 = new C1975Pp(executor, c2083Tw, c2652gi);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C2652gi c2652gi, Executor executor, C2083Tw c2083Tw) {
        if (!C2102Up.A1c(c2652gi)) {
            return;
        }
        if (A02 == null) {
            A02 = new YS(c2652gi, executor, c2083Tw);
            A02.A00();
        } else {
            A02.A02(c2083Tw);
        }
    }

    private void A02(C2083Tw c2083Tw) {
        this.A00.A07(c2083Tw);
    }
}
