package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ar, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0638Ar implements InterfaceC2311rY {
    public final List<InterfaceC2312rZ> A00 = new ArrayList();

    @Override // com.instagram.common.viewpoint.core.InterfaceC2311rY
    public final InterfaceC2312rZ A6i(int i) {
        this.A00.get(i);
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC2312rZ> iterator() {
        return this.A00.iterator();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2311rY
    public final int size() {
        return this.A00.size();
    }
}
