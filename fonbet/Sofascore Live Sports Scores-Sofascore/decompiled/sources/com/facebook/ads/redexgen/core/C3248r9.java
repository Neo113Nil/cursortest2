package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.r9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3248r9 {
    public final InterfaceC3252rD A00;
    public final String A01;
    public final Collection<C3261rN> A02;
    public final Collection<C3261rN> A03;
    public final List<Rect> A04;

    public C3248r9(String str, InterfaceC3252rD interfaceC3252rD, List<Rect> rects, Collection<C3261rN> collection, Collection<C3261rN> collection2) {
        this.A01 = str;
        this.A00 = interfaceC3252rD;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
