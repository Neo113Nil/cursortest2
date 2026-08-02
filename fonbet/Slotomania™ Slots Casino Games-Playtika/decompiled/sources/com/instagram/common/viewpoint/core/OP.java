package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class OP {

    @Nullable
    public static OO A00;
    public static final AtomicBoolean A01 = new AtomicBoolean();

    public static OO A00(C1691ge c1691ge) {
        if (A00 == null) {
            A00 = new OO(c1691ge);
        }
        return A00;
    }

    public static void A01(C1691ge c1691ge) {
        if (AbstractC1148Us.A0F(c1691ge)) {
            A03(c1691ge);
        }
    }

    public static void A02(C1691ge c1691ge) {
        if (AbstractC1148Us.A0E(c1691ge)) {
            A03(c1691ge);
        }
    }

    public static void A03(C1691ge c1691ge) {
        if (A01.compareAndSet(false, true)) {
            Y4.A01.execute(new C1794iN(c1691ge));
        }
    }
}
