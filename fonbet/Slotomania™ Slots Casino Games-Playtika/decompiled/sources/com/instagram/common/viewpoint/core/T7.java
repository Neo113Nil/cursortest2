package com.instagram.common.viewpoint.core;

import com.braze.Constants;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class T7 {
    public static String[] A00 = {"WfUJfZecOVcHzzrBpx92ELEjWhu2m", "ABQQ5taiOepRv8Mi5iWio7B3aVpn", "lqinWbZDhv0Ny2jUIa5P6Phm3DGMmF2T", "dPu2X3zgdKacWkfyqxYrIyrhes", "b2oe8Nr0EFLLItrmCHMxvIgMHIYOeqfq", "h", "yKBaB64vFuTn7zYoCnuYBPVEHVJ9GNEq", ""};
    public static final AtomicReference<C1691ge> A01 = new AtomicReference<>();

    public static C1691ge A00() {
        AtomicReference<C1691ge> atomicReference = A01;
        if (A00[2].charAt(13) != '2') {
            throw new RuntimeException();
        }
        A00[3] = Constants.BRAZE_PUSH_TITLE_KEY;
        return atomicReference.get();
    }

    public static void A01(C1691ge c1691ge) {
        if (c1691ge == null) {
            return;
        }
        AbstractC0634An.A00(A01, null, c1691ge);
    }
}
