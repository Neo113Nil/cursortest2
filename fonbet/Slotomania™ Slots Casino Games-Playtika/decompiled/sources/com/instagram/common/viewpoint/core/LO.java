package com.instagram.common.viewpoint.core;

import java.io.IOException;

/* loaded from: assets/audience_network/classes2.dex */
public final class LO {
    public final int A00;
    public final long A01;

    public LO(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public static LO A00(InterfaceC2046ms interfaceC2046ms, C05024v c05024v) throws IOException {
        interfaceC2046ms.AGt(c05024v.A0l(), 0, 8);
        c05024v.A0f(0);
        int A0C = c05024v.A0C();
        long size = c05024v.A0O();
        return new LO(A0C, size);
    }
}
