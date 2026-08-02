package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ar, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1595Ar implements InterfaceC3268rY {
    public final List<InterfaceC3269rZ> A00 = new ArrayList();

    @Override // com.facebook.ads.redexgen.core.InterfaceC3268rY
    public final InterfaceC3269rZ A6i(int i) {
        this.A00.get(i);
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC3269rZ> iterator() {
        return this.A00.iterator();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3268rY
    public final int size() {
        return this.A00.size();
    }
}
