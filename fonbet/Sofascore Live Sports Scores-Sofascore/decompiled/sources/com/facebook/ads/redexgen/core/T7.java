package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.foundation.same.report.h;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class T7 {
    public static String[] A00 = {"WfUJfZecOVcHzzrBpx92ELEjWhu2m", "ABQQ5taiOepRv8Mi5iWio7B3aVpn", "lqinWbZDhv0Ny2jUIa5P6Phm3DGMmF2T", "dPu2X3zgdKacWkfyqxYrIyrhes", "b2oe8Nr0EFLLItrmCHMxvIgMHIYOeqfq", h.b, "yKBaB64vFuTn7zYoCnuYBPVEHVJ9GNEq", ""};
    public static final AtomicReference<C2648ge> A01 = new AtomicReference<>();

    public static C2648ge A00() {
        AtomicReference<C2648ge> atomicReference = A01;
        if (A00[2].charAt(13) != '2') {
            throw new RuntimeException();
        }
        A00[3] = "t";
        return atomicReference.get();
    }

    public static void A01(C2648ge c2648ge) {
        if (c2648ge == null) {
            return;
        }
        AbstractC1591An.A00(A01, null, c2648ge);
    }
}
