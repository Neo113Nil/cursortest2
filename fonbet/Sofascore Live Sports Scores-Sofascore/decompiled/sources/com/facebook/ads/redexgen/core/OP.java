package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class OP {

    @Nullable
    public static OO A00;
    public static final AtomicBoolean A01 = new AtomicBoolean();

    public static OO A00(C2648ge c2648ge) {
        if (A00 == null) {
            A00 = new OO(c2648ge);
        }
        return A00;
    }

    public static void A01(C2648ge c2648ge) {
        if (AbstractC2105Us.A0F(c2648ge)) {
            A03(c2648ge);
        }
    }

    public static void A02(C2648ge c2648ge) {
        if (AbstractC2105Us.A0E(c2648ge)) {
            A03(c2648ge);
        }
    }

    public static void A03(C2648ge c2648ge) {
        if (A01.compareAndSet(false, true)) {
            Y4.A01.execute(new C2751iN(c2648ge));
        }
    }
}
