package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* loaded from: assets/audience_network/classes2.dex */
public final class LO {
    public final int A00;
    public final long A01;

    public LO(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public static LO A00(InterfaceC3003ms interfaceC3003ms, C14594v c14594v) throws IOException {
        interfaceC3003ms.AGt(c14594v.A0l(), 0, 8);
        c14594v.A0f(0);
        int A0C = c14594v.A0C();
        long size = c14594v.A0O();
        return new LO(A0C, size);
    }
}
